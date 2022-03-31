// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * Snapshot of the configurations used to generate the profile.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DataProfileConfigSnapshot}
 */
public final class DataProfileConfigSnapshot extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DataProfileConfigSnapshot)
    DataProfileConfigSnapshotOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataProfileConfigSnapshot.newBuilder() to construct.
  private DataProfileConfigSnapshot(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataProfileConfigSnapshot() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DataProfileConfigSnapshot();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DataProfileConfigSnapshot(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 18: {
            com.google.privacy.dlp.v2.InspectConfig.Builder subBuilder = null;
            if (inspectConfig_ != null) {
              subBuilder = inspectConfig_.toBuilder();
            }
            inspectConfig_ = input.readMessage(com.google.privacy.dlp.v2.InspectConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(inspectConfig_);
              inspectConfig_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.google.privacy.dlp.v2.DataProfileJobConfig.Builder subBuilder = null;
            if (dataProfileJob_ != null) {
              subBuilder = dataProfileJob_.toBuilder();
            }
            dataProfileJob_ = input.readMessage(com.google.privacy.dlp.v2.DataProfileJobConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(dataProfileJob_);
              dataProfileJob_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_DataProfileConfigSnapshot_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_DataProfileConfigSnapshot_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DataProfileConfigSnapshot.class, com.google.privacy.dlp.v2.DataProfileConfigSnapshot.Builder.class);
  }

  public static final int INSPECT_CONFIG_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.InspectConfig inspectConfig_;
  /**
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   * @return Whether the inspectConfig field is set.
   */
  @java.lang.Override
  public boolean hasInspectConfig() {
    return inspectConfig_ != null;
  }
  /**
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   * @return The inspectConfig.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InspectConfig getInspectConfig() {
    return inspectConfig_ == null ? com.google.privacy.dlp.v2.InspectConfig.getDefaultInstance() : inspectConfig_;
  }
  /**
   * <pre>
   * A copy of the inspection config used to generate this profile. This
   * is a copy of the inspect_template specified in `DataProfileJobConfig`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder() {
    return getInspectConfig();
  }

  public static final int DATA_PROFILE_JOB_FIELD_NUMBER = 3;
  private com.google.privacy.dlp.v2.DataProfileJobConfig dataProfileJob_;
  /**
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
   * @return Whether the dataProfileJob field is set.
   */
  @java.lang.Override
  public boolean hasDataProfileJob() {
    return dataProfileJob_ != null;
  }
  /**
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
   * @return The dataProfileJob.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DataProfileJobConfig getDataProfileJob() {
    return dataProfileJob_ == null ? com.google.privacy.dlp.v2.DataProfileJobConfig.getDefaultInstance() : dataProfileJob_;
  }
  /**
   * <pre>
   * A copy of the configuration used to generate this profile.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder getDataProfileJobOrBuilder() {
    return getDataProfileJob();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (inspectConfig_ != null) {
      output.writeMessage(2, getInspectConfig());
    }
    if (dataProfileJob_ != null) {
      output.writeMessage(3, getDataProfileJob());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (inspectConfig_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getInspectConfig());
    }
    if (dataProfileJob_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getDataProfileJob());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.privacy.dlp.v2.DataProfileConfigSnapshot)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DataProfileConfigSnapshot other = (com.google.privacy.dlp.v2.DataProfileConfigSnapshot) obj;

    if (hasInspectConfig() != other.hasInspectConfig()) return false;
    if (hasInspectConfig()) {
      if (!getInspectConfig()
          .equals(other.getInspectConfig())) return false;
    }
    if (hasDataProfileJob() != other.hasDataProfileJob()) return false;
    if (hasDataProfileJob()) {
      if (!getDataProfileJob()
          .equals(other.getDataProfileJob())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasInspectConfig()) {
      hash = (37 * hash) + INSPECT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInspectConfig().hashCode();
    }
    if (hasDataProfileJob()) {
      hash = (37 * hash) + DATA_PROFILE_JOB_FIELD_NUMBER;
      hash = (53 * hash) + getDataProfileJob().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.privacy.dlp.v2.DataProfileConfigSnapshot prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Snapshot of the configurations used to generate the profile.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DataProfileConfigSnapshot}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DataProfileConfigSnapshot)
      com.google.privacy.dlp.v2.DataProfileConfigSnapshotOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_DataProfileConfigSnapshot_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_DataProfileConfigSnapshot_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DataProfileConfigSnapshot.class, com.google.privacy.dlp.v2.DataProfileConfigSnapshot.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DataProfileConfigSnapshot.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (inspectConfigBuilder_ == null) {
        inspectConfig_ = null;
      } else {
        inspectConfig_ = null;
        inspectConfigBuilder_ = null;
      }
      if (dataProfileJobBuilder_ == null) {
        dataProfileJob_ = null;
      } else {
        dataProfileJob_ = null;
        dataProfileJobBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_DataProfileConfigSnapshot_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileConfigSnapshot getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DataProfileConfigSnapshot.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileConfigSnapshot build() {
      com.google.privacy.dlp.v2.DataProfileConfigSnapshot result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileConfigSnapshot buildPartial() {
      com.google.privacy.dlp.v2.DataProfileConfigSnapshot result = new com.google.privacy.dlp.v2.DataProfileConfigSnapshot(this);
      if (inspectConfigBuilder_ == null) {
        result.inspectConfig_ = inspectConfig_;
      } else {
        result.inspectConfig_ = inspectConfigBuilder_.build();
      }
      if (dataProfileJobBuilder_ == null) {
        result.dataProfileJob_ = dataProfileJob_;
      } else {
        result.dataProfileJob_ = dataProfileJobBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2.DataProfileConfigSnapshot) {
        return mergeFrom((com.google.privacy.dlp.v2.DataProfileConfigSnapshot)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DataProfileConfigSnapshot other) {
      if (other == com.google.privacy.dlp.v2.DataProfileConfigSnapshot.getDefaultInstance()) return this;
      if (other.hasInspectConfig()) {
        mergeInspectConfig(other.getInspectConfig());
      }
      if (other.hasDataProfileJob()) {
        mergeDataProfileJob(other.getDataProfileJob());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.privacy.dlp.v2.DataProfileConfigSnapshot parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.DataProfileConfigSnapshot) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2.InspectConfig inspectConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.InspectConfig, com.google.privacy.dlp.v2.InspectConfig.Builder, com.google.privacy.dlp.v2.InspectConfigOrBuilder> inspectConfigBuilder_;
    /**
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     * @return Whether the inspectConfig field is set.
     */
    public boolean hasInspectConfig() {
      return inspectConfigBuilder_ != null || inspectConfig_ != null;
    }
    /**
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     * @return The inspectConfig.
     */
    public com.google.privacy.dlp.v2.InspectConfig getInspectConfig() {
      if (inspectConfigBuilder_ == null) {
        return inspectConfig_ == null ? com.google.privacy.dlp.v2.InspectConfig.getDefaultInstance() : inspectConfig_;
      } else {
        return inspectConfigBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public Builder setInspectConfig(com.google.privacy.dlp.v2.InspectConfig value) {
      if (inspectConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inspectConfig_ = value;
        onChanged();
      } else {
        inspectConfigBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public Builder setInspectConfig(
        com.google.privacy.dlp.v2.InspectConfig.Builder builderForValue) {
      if (inspectConfigBuilder_ == null) {
        inspectConfig_ = builderForValue.build();
        onChanged();
      } else {
        inspectConfigBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public Builder mergeInspectConfig(com.google.privacy.dlp.v2.InspectConfig value) {
      if (inspectConfigBuilder_ == null) {
        if (inspectConfig_ != null) {
          inspectConfig_ =
            com.google.privacy.dlp.v2.InspectConfig.newBuilder(inspectConfig_).mergeFrom(value).buildPartial();
        } else {
          inspectConfig_ = value;
        }
        onChanged();
      } else {
        inspectConfigBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public Builder clearInspectConfig() {
      if (inspectConfigBuilder_ == null) {
        inspectConfig_ = null;
        onChanged();
      } else {
        inspectConfig_ = null;
        inspectConfigBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public com.google.privacy.dlp.v2.InspectConfig.Builder getInspectConfigBuilder() {
      
      onChanged();
      return getInspectConfigFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    public com.google.privacy.dlp.v2.InspectConfigOrBuilder getInspectConfigOrBuilder() {
      if (inspectConfigBuilder_ != null) {
        return inspectConfigBuilder_.getMessageOrBuilder();
      } else {
        return inspectConfig_ == null ?
            com.google.privacy.dlp.v2.InspectConfig.getDefaultInstance() : inspectConfig_;
      }
    }
    /**
     * <pre>
     * A copy of the inspection config used to generate this profile. This
     * is a copy of the inspect_template specified in `DataProfileJobConfig`.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.InspectConfig inspect_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.InspectConfig, com.google.privacy.dlp.v2.InspectConfig.Builder, com.google.privacy.dlp.v2.InspectConfigOrBuilder> 
        getInspectConfigFieldBuilder() {
      if (inspectConfigBuilder_ == null) {
        inspectConfigBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.InspectConfig, com.google.privacy.dlp.v2.InspectConfig.Builder, com.google.privacy.dlp.v2.InspectConfigOrBuilder>(
                getInspectConfig(),
                getParentForChildren(),
                isClean());
        inspectConfig_ = null;
      }
      return inspectConfigBuilder_;
    }

    private com.google.privacy.dlp.v2.DataProfileJobConfig dataProfileJob_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.DataProfileJobConfig, com.google.privacy.dlp.v2.DataProfileJobConfig.Builder, com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder> dataProfileJobBuilder_;
    /**
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     * @return Whether the dataProfileJob field is set.
     */
    public boolean hasDataProfileJob() {
      return dataProfileJobBuilder_ != null || dataProfileJob_ != null;
    }
    /**
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     * @return The dataProfileJob.
     */
    public com.google.privacy.dlp.v2.DataProfileJobConfig getDataProfileJob() {
      if (dataProfileJobBuilder_ == null) {
        return dataProfileJob_ == null ? com.google.privacy.dlp.v2.DataProfileJobConfig.getDefaultInstance() : dataProfileJob_;
      } else {
        return dataProfileJobBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public Builder setDataProfileJob(com.google.privacy.dlp.v2.DataProfileJobConfig value) {
      if (dataProfileJobBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataProfileJob_ = value;
        onChanged();
      } else {
        dataProfileJobBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public Builder setDataProfileJob(
        com.google.privacy.dlp.v2.DataProfileJobConfig.Builder builderForValue) {
      if (dataProfileJobBuilder_ == null) {
        dataProfileJob_ = builderForValue.build();
        onChanged();
      } else {
        dataProfileJobBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public Builder mergeDataProfileJob(com.google.privacy.dlp.v2.DataProfileJobConfig value) {
      if (dataProfileJobBuilder_ == null) {
        if (dataProfileJob_ != null) {
          dataProfileJob_ =
            com.google.privacy.dlp.v2.DataProfileJobConfig.newBuilder(dataProfileJob_).mergeFrom(value).buildPartial();
        } else {
          dataProfileJob_ = value;
        }
        onChanged();
      } else {
        dataProfileJobBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public Builder clearDataProfileJob() {
      if (dataProfileJobBuilder_ == null) {
        dataProfileJob_ = null;
        onChanged();
      } else {
        dataProfileJob_ = null;
        dataProfileJobBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public com.google.privacy.dlp.v2.DataProfileJobConfig.Builder getDataProfileJobBuilder() {
      
      onChanged();
      return getDataProfileJobFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    public com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder getDataProfileJobOrBuilder() {
      if (dataProfileJobBuilder_ != null) {
        return dataProfileJobBuilder_.getMessageOrBuilder();
      } else {
        return dataProfileJob_ == null ?
            com.google.privacy.dlp.v2.DataProfileJobConfig.getDefaultInstance() : dataProfileJob_;
      }
    }
    /**
     * <pre>
     * A copy of the configuration used to generate this profile.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileJobConfig data_profile_job = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.privacy.dlp.v2.DataProfileJobConfig, com.google.privacy.dlp.v2.DataProfileJobConfig.Builder, com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder> 
        getDataProfileJobFieldBuilder() {
      if (dataProfileJobBuilder_ == null) {
        dataProfileJobBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.DataProfileJobConfig, com.google.privacy.dlp.v2.DataProfileJobConfig.Builder, com.google.privacy.dlp.v2.DataProfileJobConfigOrBuilder>(
                getDataProfileJob(),
                getParentForChildren(),
                isClean());
        dataProfileJob_ = null;
      }
      return dataProfileJobBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DataProfileConfigSnapshot)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DataProfileConfigSnapshot)
  private static final com.google.privacy.dlp.v2.DataProfileConfigSnapshot DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DataProfileConfigSnapshot();
  }

  public static com.google.privacy.dlp.v2.DataProfileConfigSnapshot getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataProfileConfigSnapshot>
      PARSER = new com.google.protobuf.AbstractParser<DataProfileConfigSnapshot>() {
    @java.lang.Override
    public DataProfileConfigSnapshot parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DataProfileConfigSnapshot(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DataProfileConfigSnapshot> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataProfileConfigSnapshot> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DataProfileConfigSnapshot getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

