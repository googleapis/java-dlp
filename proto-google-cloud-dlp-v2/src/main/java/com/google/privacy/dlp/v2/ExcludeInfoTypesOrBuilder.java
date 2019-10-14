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

public interface ExcludeInfoTypesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ExcludeInfoTypes)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * InfoType list in ExclusionRule rule drops a finding when it overlaps or
   * contained within with a finding of an infoType from this list. For
   * example, for `InspectionRuleSet.info_types` containing "PHONE_NUMBER"` and
   * `exclusion_rule` containing `exclude_info_types.info_types` with
   * "EMAIL_ADDRESS" the phone number findings are dropped if they overlap
   * with EMAIL_ADDRESS finding.
   * That leads to "555-222-2222&#64;example.org" to generate only a single
   * finding, namely email address.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.InfoType> getInfoTypesList();
  /**
   *
   *
   * <pre>
   * InfoType list in ExclusionRule rule drops a finding when it overlaps or
   * contained within with a finding of an infoType from this list. For
   * example, for `InspectionRuleSet.info_types` containing "PHONE_NUMBER"` and
   * `exclusion_rule` containing `exclude_info_types.info_types` with
   * "EMAIL_ADDRESS" the phone number findings are dropped if they overlap
   * with EMAIL_ADDRESS finding.
   * That leads to "555-222-2222&#64;example.org" to generate only a single
   * finding, namely email address.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoType getInfoTypes(int index);
  /**
   *
   *
   * <pre>
   * InfoType list in ExclusionRule rule drops a finding when it overlaps or
   * contained within with a finding of an infoType from this list. For
   * example, for `InspectionRuleSet.info_types` containing "PHONE_NUMBER"` and
   * `exclusion_rule` containing `exclude_info_types.info_types` with
   * "EMAIL_ADDRESS" the phone number findings are dropped if they overlap
   * with EMAIL_ADDRESS finding.
   * That leads to "555-222-2222&#64;example.org" to generate only a single
   * finding, namely email address.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  int getInfoTypesCount();
  /**
   *
   *
   * <pre>
   * InfoType list in ExclusionRule rule drops a finding when it overlaps or
   * contained within with a finding of an infoType from this list. For
   * example, for `InspectionRuleSet.info_types` containing "PHONE_NUMBER"` and
   * `exclusion_rule` containing `exclude_info_types.info_types` with
   * "EMAIL_ADDRESS" the phone number findings are dropped if they overlap
   * with EMAIL_ADDRESS finding.
   * That leads to "555-222-2222&#64;example.org" to generate only a single
   * finding, namely email address.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.InfoTypeOrBuilder> getInfoTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * InfoType list in ExclusionRule rule drops a finding when it overlaps or
   * contained within with a finding of an infoType from this list. For
   * example, for `InspectionRuleSet.info_types` containing "PHONE_NUMBER"` and
   * `exclusion_rule` containing `exclude_info_types.info_types` with
   * "EMAIL_ADDRESS" the phone number findings are dropped if they overlap
   * with EMAIL_ADDRESS finding.
   * That leads to "555-222-2222&#64;example.org" to generate only a single
   * finding, namely email address.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypesOrBuilder(int index);
}
