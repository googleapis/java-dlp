/*
 * Copyright 2020 Google LLC
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

public interface ListDlpJobsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ListDlpJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>
   * string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, for example projects/my-project-id.
   * </pre>
   *
   * <code>
   * string parent = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Allows filtering.
   * Supported syntax:
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `{field} {operator} {value}`.
   * * Supported fields/values for inspect jobs:
   *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
   *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
   *     - `trigger_name` - The resource name of the trigger that created job.
   *     - 'end_time` - Corresponds to time the job finished.
   *     - 'start_time` - Corresponds to time the job finished.
   * * Supported fields for risk analysis jobs:
   *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
   *     - 'end_time` - Corresponds to time the job finished.
   *     - 'start_time` - Corresponds to time the job finished.
   * * The operator must be `=` or `!=`.
   * Examples:
   * * inspected_storage = cloud_storage AND state = done
   * * inspected_storage = cloud_storage OR inspected_storage = bigquery
   * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
   * * end_time &gt; &#92;"2017-12-12T00:00:00+00:00&#92;"
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 1;</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Allows filtering.
   * Supported syntax:
   * * Filter expressions are made up of one or more restrictions.
   * * Restrictions can be combined by `AND` or `OR` logical operators. A
   * sequence of restrictions implicitly uses `AND`.
   * * A restriction has the form of `{field} {operator} {value}`.
   * * Supported fields/values for inspect jobs:
   *     - `state` - PENDING|RUNNING|CANCELED|FINISHED|FAILED
   *     - `inspected_storage` - DATASTORE|CLOUD_STORAGE|BIGQUERY
   *     - `trigger_name` - The resource name of the trigger that created job.
   *     - 'end_time` - Corresponds to time the job finished.
   *     - 'start_time` - Corresponds to time the job finished.
   * * Supported fields for risk analysis jobs:
   *     - `state` - RUNNING|CANCELED|FINISHED|FAILED
   *     - 'end_time` - Corresponds to time the job finished.
   *     - 'start_time` - Corresponds to time the job finished.
   * * The operator must be `=` or `!=`.
   * Examples:
   * * inspected_storage = cloud_storage AND state = done
   * * inspected_storage = cloud_storage OR inspected_storage = bigquery
   * * inspected_storage = cloud_storage AND (state = done OR state = canceled)
   * * end_time &gt; &#92;"2017-12-12T00:00:00+00:00&#92;"
   * The length of this field should be no more than 500 characters.
   * </pre>
   *
   * <code>string filter = 1;</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * The standard list page token.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The type of job. Defaults to `DlpJobType.INSPECT`
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DlpJobType type = 5;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of job. Defaults to `DlpJobType.INSPECT`
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DlpJobType type = 5;</code>
   *
   * @return The type.
   */
  com.google.privacy.dlp.v2.DlpJobType getType();

  /**
   *
   *
   * <pre>
   * Comma separated list of fields to order by,
   * followed by `asc` or `desc` postfix. This list is case-insensitive,
   * default sorting order is ascending, redundant space characters are
   * insignificant.
   * Example: `name asc, end_time asc, create_time desc`
   * Supported fields are:
   * - `create_time`: corresponds to time the job was created.
   * - `end_time`: corresponds to time the job ended.
   * - `name`: corresponds to job's name.
   * - `state`: corresponds to `state`
   * </pre>
   *
   * <code>string order_by = 6;</code>
   *
   * @return The orderBy.
   */
  java.lang.String getOrderBy();
  /**
   *
   *
   * <pre>
   * Comma separated list of fields to order by,
   * followed by `asc` or `desc` postfix. This list is case-insensitive,
   * default sorting order is ascending, redundant space characters are
   * insignificant.
   * Example: `name asc, end_time asc, create_time desc`
   * Supported fields are:
   * - `create_time`: corresponds to time the job was created.
   * - `end_time`: corresponds to time the job ended.
   * - `name`: corresponds to job's name.
   * - `state`: corresponds to `state`
   * </pre>
   *
   * <code>string order_by = 6;</code>
   *
   * @return The bytes for orderBy.
   */
  com.google.protobuf.ByteString getOrderByBytes();

  /**
   *
   *
   * <pre>
   * The geographic location where jobs will be retrieved from.
   * Use `-` for all locations. Reserved for future extensions.
   * </pre>
   *
   * <code>string location_id = 7;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();
  /**
   *
   *
   * <pre>
   * The geographic location where jobs will be retrieved from.
   * Use `-` for all locations. Reserved for future extensions.
   * </pre>
   *
   * <code>string location_id = 7;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();
}
