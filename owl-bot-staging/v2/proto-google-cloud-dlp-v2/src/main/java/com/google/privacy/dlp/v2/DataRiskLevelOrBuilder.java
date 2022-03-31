// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

public interface DataRiskLevelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DataRiskLevel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The score applied to the resource.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataRiskLevel.DataRiskLevelScore score = 1;</code>
   * @return The enum numeric value on the wire for score.
   */
  int getScoreValue();
  /**
   * <pre>
   * The score applied to the resource.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataRiskLevel.DataRiskLevelScore score = 1;</code>
   * @return The score.
   */
  com.google.privacy.dlp.v2.DataRiskLevel.DataRiskLevelScore getScore();
}
