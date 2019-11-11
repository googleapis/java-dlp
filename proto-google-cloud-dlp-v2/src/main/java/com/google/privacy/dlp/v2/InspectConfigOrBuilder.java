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

public interface InspectConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.InspectConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/dlp/docs/infotypes-reference.
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose what detectors to run. By default this may
   * be all types, but may change over time as detectors are updated.
   * If you need precise control and predictability as to what detectors are
   * run you should specify specific InfoTypes listed in the reference,
   * otherwise a default list will be used, which may change over time.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.InfoType> getInfoTypesList();
  /**
   *
   *
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/dlp/docs/infotypes-reference.
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose what detectors to run. By default this may
   * be all types, but may change over time as detectors are updated.
   * If you need precise control and predictability as to what detectors are
   * run you should specify specific InfoTypes listed in the reference,
   * otherwise a default list will be used, which may change over time.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoType getInfoTypes(int index);
  /**
   *
   *
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/dlp/docs/infotypes-reference.
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose what detectors to run. By default this may
   * be all types, but may change over time as detectors are updated.
   * If you need precise control and predictability as to what detectors are
   * run you should specify specific InfoTypes listed in the reference,
   * otherwise a default list will be used, which may change over time.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  int getInfoTypesCount();
  /**
   *
   *
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/dlp/docs/infotypes-reference.
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose what detectors to run. By default this may
   * be all types, but may change over time as detectors are updated.
   * If you need precise control and predictability as to what detectors are
   * run you should specify specific InfoTypes listed in the reference,
   * otherwise a default list will be used, which may change over time.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.InfoTypeOrBuilder> getInfoTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Restricts what info_types to look for. The values must correspond to
   * InfoType values returned by ListInfoTypes or listed at
   * https://cloud.google.com/dlp/docs/infotypes-reference.
   * When no InfoTypes or CustomInfoTypes are specified in a request, the
   * system may automatically choose what detectors to run. By default this may
   * be all types, but may change over time as detectors are updated.
   * If you need precise control and predictability as to what detectors are
   * run you should specify specific InfoTypes listed in the reference,
   * otherwise a default list will be used, which may change over time.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InfoType info_types = 1;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Only returns findings equal or above this threshold. The default is
   * POSSIBLE.
   * See https://cloud.google.com/dlp/docs/likelihood to learn more.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Likelihood min_likelihood = 2;</code>
   */
  int getMinLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Only returns findings equal or above this threshold. The default is
   * POSSIBLE.
   * See https://cloud.google.com/dlp/docs/likelihood to learn more.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Likelihood min_likelihood = 2;</code>
   */
  com.google.privacy.dlp.v2.Likelihood getMinLikelihood();

  /** <code>.google.privacy.dlp.v2.InspectConfig.FindingLimits limits = 3;</code> */
  boolean hasLimits();
  /** <code>.google.privacy.dlp.v2.InspectConfig.FindingLimits limits = 3;</code> */
  com.google.privacy.dlp.v2.InspectConfig.FindingLimits getLimits();
  /** <code>.google.privacy.dlp.v2.InspectConfig.FindingLimits limits = 3;</code> */
  com.google.privacy.dlp.v2.InspectConfig.FindingLimitsOrBuilder getLimitsOrBuilder();

  /**
   *
   *
   * <pre>
   * When true, a contextual quote from the data that triggered a finding is
   * included in the response; see Finding.quote.
   * </pre>
   *
   * <code>bool include_quote = 4;</code>
   */
  boolean getIncludeQuote();

  /**
   *
   *
   * <pre>
   * When true, excludes type information of the findings.
   * </pre>
   *
   * <code>bool exclude_info_types = 5;</code>
   */
  boolean getExcludeInfoTypes();

  /**
   *
   *
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.CustomInfoType> getCustomInfoTypesList();
  /**
   *
   *
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoType getCustomInfoTypes(int index);
  /**
   *
   *
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  int getCustomInfoTypesCount();
  /**
   *
   *
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.CustomInfoTypeOrBuilder>
      getCustomInfoTypesOrBuilderList();
  /**
   *
   *
   * <pre>
   * CustomInfoTypes provided by the user. See
   * https://cloud.google.com/dlp/docs/creating-custom-infotypes to learn more.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.CustomInfoType custom_info_types = 6;</code>
   */
  com.google.privacy.dlp.v2.CustomInfoTypeOrBuilder getCustomInfoTypesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of options defining data content to scan.
   * If empty, text, images, and other content will be included.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.ContentOption> getContentOptionsList();
  /**
   *
   *
   * <pre>
   * List of options defining data content to scan.
   * If empty, text, images, and other content will be included.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   */
  int getContentOptionsCount();
  /**
   *
   *
   * <pre>
   * List of options defining data content to scan.
   * If empty, text, images, and other content will be included.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   */
  com.google.privacy.dlp.v2.ContentOption getContentOptions(int index);
  /**
   *
   *
   * <pre>
   * List of options defining data content to scan.
   * If empty, text, images, and other content will be included.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   */
  java.util.List<java.lang.Integer> getContentOptionsValueList();
  /**
   *
   *
   * <pre>
   * List of options defining data content to scan.
   * If empty, text, images, and other content will be included.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.ContentOption content_options = 8;</code>
   */
  int getContentOptionsValue(int index);

  /**
   *
   *
   * <pre>
   * Set of rules to apply to the findings for this InspectConfig.
   * Exclusion rules, contained in the set are executed in the end, other
   * rules are executed in the order they are specified for each info type.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectionRuleSet rule_set = 10;</code>
   */
  java.util.List<com.google.privacy.dlp.v2.InspectionRuleSet> getRuleSetList();
  /**
   *
   *
   * <pre>
   * Set of rules to apply to the findings for this InspectConfig.
   * Exclusion rules, contained in the set are executed in the end, other
   * rules are executed in the order they are specified for each info type.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectionRuleSet rule_set = 10;</code>
   */
  com.google.privacy.dlp.v2.InspectionRuleSet getRuleSet(int index);
  /**
   *
   *
   * <pre>
   * Set of rules to apply to the findings for this InspectConfig.
   * Exclusion rules, contained in the set are executed in the end, other
   * rules are executed in the order they are specified for each info type.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectionRuleSet rule_set = 10;</code>
   */
  int getRuleSetCount();
  /**
   *
   *
   * <pre>
   * Set of rules to apply to the findings for this InspectConfig.
   * Exclusion rules, contained in the set are executed in the end, other
   * rules are executed in the order they are specified for each info type.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectionRuleSet rule_set = 10;</code>
   */
  java.util.List<? extends com.google.privacy.dlp.v2.InspectionRuleSetOrBuilder>
      getRuleSetOrBuilderList();
  /**
   *
   *
   * <pre>
   * Set of rules to apply to the findings for this InspectConfig.
   * Exclusion rules, contained in the set are executed in the end, other
   * rules are executed in the order they are specified for each info type.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.InspectionRuleSet rule_set = 10;</code>
   */
  com.google.privacy.dlp.v2.InspectionRuleSetOrBuilder getRuleSetOrBuilder(int index);
}
