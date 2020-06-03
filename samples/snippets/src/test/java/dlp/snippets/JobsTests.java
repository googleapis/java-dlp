/*
 * Copyright 2020 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dlp.snippets;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

import com.google.cloud.dlp.v2.DlpServiceClient;
import com.google.privacy.dlp.v2.CloudStorageOptions;
import com.google.privacy.dlp.v2.CloudStorageOptions.FileSet;
import com.google.privacy.dlp.v2.CreateDlpJobRequest;
import com.google.privacy.dlp.v2.DeleteDlpJobRequest;
import com.google.privacy.dlp.v2.DlpJob;
import com.google.privacy.dlp.v2.InspectConfig;
import com.google.privacy.dlp.v2.InspectJobConfig;
import com.google.privacy.dlp.v2.LocationName;
import com.google.privacy.dlp.v2.StorageConfig;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.UUID;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class JobsTests {

  private static final String PROJECT_ID = System.getenv("GOOGLE_CLOUD_PROJECT");
  private static final String GCS_PATH = System.getenv("GCS_PATH");

  private ByteArrayOutputStream bout;

  private static void requireEnvVar(String varName) {
    assertNotNull(
        String.format("Environment variable '%s' must be set to perform these tests.", varName),
        System.getenv(varName));
  }

  private static DlpJob createJob(String jobId) throws IOException {
    try (DlpServiceClient dlp = DlpServiceClient.create()) {
      FileSet fileSet = FileSet.newBuilder().setUrl(GCS_PATH).build();
      CloudStorageOptions cloudStorageOptions =
          CloudStorageOptions.newBuilder().setFileSet(fileSet).build();
      StorageConfig storageConfig =
          StorageConfig.newBuilder().setCloudStorageOptions(cloudStorageOptions).build();

      InspectJobConfig inspectJobConfig =
          InspectJobConfig.newBuilder()
              .setStorageConfig(storageConfig)
              .setInspectConfig(InspectConfig.newBuilder().build())
              .build();

      CreateDlpJobRequest createDlpJobRequest =
          CreateDlpJobRequest.newBuilder()
              .setParent(LocationName.of(PROJECT_ID, "global").toString())
              .setInspectJob(inspectJobConfig)
              .setJobId(jobId)
              .build();

      return dlp.createDlpJob(createDlpJobRequest);
    }
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("GOOGLE_CLOUD_PROJECT");
    requireEnvVar("GCS_PATH");
  }

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    System.setOut(new PrintStream(bout));
  }

  @After
  public void tearDown() {
    System.setOut(null);
    bout.reset();
  }

  @Test
  public void testCreateJobs() throws Exception {
    // Call createJobs to create a Dlp job from project id and gcs path.
    JobsCreate.createJobs(PROJECT_ID, GCS_PATH);
    String output = bout.toString();
    assertThat(output, CoreMatchers.containsString("Job created successfully:"));

    // Delete the created Dlp Job
    String dlpJobName = output.split("Job created successfully: ")[1].split("\n")[0];
    DeleteDlpJobRequest deleteDlpJobRequest =
        DeleteDlpJobRequest.newBuilder().setName(dlpJobName).build();
    try (DlpServiceClient client = DlpServiceClient.create()) {
      client.deleteDlpJob(deleteDlpJobRequest);
    }
  }

  @Test
  public void testGetJobs() throws Exception {
    // Create a job with a unique UUID to be gotten
    String jobId = UUID.randomUUID().toString();
    DlpJob createdDlpJob = createJob(jobId);

    // Get the job with the specified ID
    JobsGet.getJobs(PROJECT_ID, "i-" + jobId);
    String output = bout.toString();
    assertThat(output, CoreMatchers.containsString("Job got successfully."));

    // Delete the created Dlp Job
    String dlpJobName = createdDlpJob.getName();
    DeleteDlpJobRequest deleteDlpJobRequest =
        DeleteDlpJobRequest.newBuilder().setName(dlpJobName).build();
    try (DlpServiceClient client = DlpServiceClient.create()) {
      client.deleteDlpJob(deleteDlpJobRequest);
    }
  }

  @Test
  public void testListJobs() throws Exception {
    // Call listJobs to print out a list of jobIds
    JobsList.listJobs(PROJECT_ID);
    String output = bout.toString();

    // Check that the output contains a list of jobs, or is empty
    assertThat(output, CoreMatchers.containsString("DLP jobs found:"));
  }

  @Test
  public void testDeleteJobs() throws Exception {
    // Create a job with a unique UUID to be deleted
    String jobId = UUID.randomUUID().toString();
    createJob(jobId);

    // Delete the job with the specified ID
    JobsDelete.deleteJobs(PROJECT_ID, "i-" + jobId);
    String output = bout.toString();
    assertThat(output, CoreMatchers.containsString("Job deleted successfully."));
  }
}
