/*
 * Copyright 2020 Google LLC
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

// [START dlp_deidentify_table_row_suppress]

import com.google.cloud.dlp.v2.DlpServiceClient;
import com.google.privacy.dlp.v2.ContentItem;
import com.google.privacy.dlp.v2.DeidentifyConfig;
import com.google.privacy.dlp.v2.DeidentifyContentRequest;
import com.google.privacy.dlp.v2.DeidentifyContentResponse;
import com.google.privacy.dlp.v2.FieldId;
import com.google.privacy.dlp.v2.LocationName;
import com.google.privacy.dlp.v2.RecordCondition;
import com.google.privacy.dlp.v2.RecordCondition.Condition;
import com.google.privacy.dlp.v2.RecordCondition.Conditions;
import com.google.privacy.dlp.v2.RecordCondition.Expressions;
import com.google.privacy.dlp.v2.RecordSuppression;
import com.google.privacy.dlp.v2.RecordTransformations;
import com.google.privacy.dlp.v2.RelationalOperator;
import com.google.privacy.dlp.v2.Table;
import com.google.privacy.dlp.v2.Table.Row;
import com.google.privacy.dlp.v2.Value;
import java.io.IOException;

public class DeIdentifyTableRowSuppress {

  public static void deIdentifyTableRowSuppress() throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "your-project-id";
    Table tableToDeIdentify = Table.newBuilder()
        .addHeaders(FieldId.newBuilder().setName("AGE").build())
        .addHeaders(FieldId.newBuilder().setName("PATIENT").build())
        .addHeaders(FieldId.newBuilder().setName("HAPPINESS SCORE").build())
        .addRows(Row.newBuilder()
            .addValues(Value.newBuilder().setStringValue("101").build())
            .addValues(Value.newBuilder().setStringValue("Charles Dickens").build())
            .addValues(Value.newBuilder().setStringValue("95").build())
            .build())
        .addRows(Row.newBuilder()
            .addValues(Value.newBuilder().setStringValue("22").build())
            .addValues(Value.newBuilder().setStringValue("Jane Austen").build())
            .addValues(Value.newBuilder().setStringValue("21").build())
            .build())
        .addRows(Row.newBuilder()
            .addValues(Value.newBuilder().setStringValue("55").build())
            .addValues(Value.newBuilder().setStringValue("Mark Twain").build())
            .addValues(Value.newBuilder().setStringValue("75").build())
            .build())
        .build();

    deIdentifyTableRowSuppress(projectId, tableToDeIdentify);
  }

  public static Table deIdentifyTableRowSuppress(String projectId, Table tableToDeIdentify)
      throws IOException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests. After completing all of your requests, call
    // the "close" method on the client to safely clean up any remaining background resources.
    try (DlpServiceClient dlp = DlpServiceClient.create()) {
      // Specify what content you want the service to de-identify.
      ContentItem contentItem = ContentItem.newBuilder().setTable(tableToDeIdentify).build();

      // Specify when the content should be de-identified.
      Condition condition = Condition.newBuilder()
          .setField(FieldId.newBuilder().setName("AGE").build())
          .setOperator(RelationalOperator.GREATER_THAN)
          .setValue(Value.newBuilder().setIntegerValue(89).build()).build();
      // Apply the condition to record suppression.
      RecordSuppression recordSuppressions =
          RecordSuppression.newBuilder()
              .setCondition(RecordCondition.newBuilder()
                  .setExpressions(Expressions.newBuilder()
                      .setConditions(Conditions.newBuilder().addConditions(condition).build())
                      .build())
                  .build())
              .build();
      // Use record suppression as the only transformation
      RecordTransformations transformations =
          RecordTransformations.newBuilder()
              .addRecordSuppressions(recordSuppressions)
              .build();

      DeidentifyConfig deidentifyConfig =
          DeidentifyConfig.newBuilder().setRecordTransformations(transformations).build();

      // Combine configurations into a request for the service.
      DeidentifyContentRequest request =
          DeidentifyContentRequest.newBuilder()
              .setParent(LocationName.of(projectId, "global").toString())
              .setItem(contentItem)
              .setDeidentifyConfig(deidentifyConfig)
              .build();

      // Send the request and receive response from the service.
      DeidentifyContentResponse response = dlp.deidentifyContent(request);

      // Print the results.
      System.out.println(
          "Table after de-identification: " + response.getItem().getTable());

      return response.getItem().getTable();
    }
  }
}
// [END dlp_deidentify_table_row_suppress]
