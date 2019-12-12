/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface LargeCustomDictionaryConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.LargeCustomDictionaryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Location to store dictionary artifacts in Google Cloud Storage. These files
   * will only be accessible by project owners and the DLP API. If any of these
   * artifacts are modified, the dictionary is considered invalid and can no
   * longer be used.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudStoragePath output_path = 1;</code>
   *
   * @return Whether the outputPath field is set.
   */
  boolean hasOutputPath();
  /**
   *
   *
   * <pre>
   * Location to store dictionary artifacts in Google Cloud Storage. These files
   * will only be accessible by project owners and the DLP API. If any of these
   * artifacts are modified, the dictionary is considered invalid and can no
   * longer be used.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudStoragePath output_path = 1;</code>
   *
   * @return The outputPath.
   */
  com.google.privacy.dlp.v2.CloudStoragePath getOutputPath();
  /**
   *
   *
   * <pre>
   * Location to store dictionary artifacts in Google Cloud Storage. These files
   * will only be accessible by project owners and the DLP API. If any of these
   * artifacts are modified, the dictionary is considered invalid and can no
   * longer be used.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudStoragePath output_path = 1;</code>
   */
  com.google.privacy.dlp.v2.CloudStoragePathOrBuilder getOutputPathOrBuilder();

  /**
   *
   *
   * <pre>
   * Set of files containing newline-delimited lists of dictionary phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudStorageFileSet cloud_storage_file_set = 2;</code>
   *
   * @return Whether the cloudStorageFileSet field is set.
   */
  boolean hasCloudStorageFileSet();
  /**
   *
   *
   * <pre>
   * Set of files containing newline-delimited lists of dictionary phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudStorageFileSet cloud_storage_file_set = 2;</code>
   *
   * @return The cloudStorageFileSet.
   */
  com.google.privacy.dlp.v2.CloudStorageFileSet getCloudStorageFileSet();
  /**
   *
   *
   * <pre>
   * Set of files containing newline-delimited lists of dictionary phrases.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.CloudStorageFileSet cloud_storage_file_set = 2;</code>
   */
  com.google.privacy.dlp.v2.CloudStorageFileSetOrBuilder getCloudStorageFileSetOrBuilder();

  /**
   *
   *
   * <pre>
   * Field in a BigQuery table where each cell represents a dictionary phrase.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryField big_query_field = 3;</code>
   *
   * @return Whether the bigQueryField field is set.
   */
  boolean hasBigQueryField();
  /**
   *
   *
   * <pre>
   * Field in a BigQuery table where each cell represents a dictionary phrase.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryField big_query_field = 3;</code>
   *
   * @return The bigQueryField.
   */
  com.google.privacy.dlp.v2.BigQueryField getBigQueryField();
  /**
   *
   *
   * <pre>
   * Field in a BigQuery table where each cell represents a dictionary phrase.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.BigQueryField big_query_field = 3;</code>
   */
  com.google.privacy.dlp.v2.BigQueryFieldOrBuilder getBigQueryFieldOrBuilder();

  public com.google.privacy.dlp.v2.LargeCustomDictionaryConfig.SourceCase getSourceCase();
}
