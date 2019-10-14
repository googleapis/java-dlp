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
// source: google/privacy/dlp/v2/storage.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Options defining a data set within Google Cloud Datastore.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DatastoreOptions}
 */
public final class DatastoreOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DatastoreOptions)
    DatastoreOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DatastoreOptions.newBuilder() to construct.
  private DatastoreOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DatastoreOptions() {}

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private DatastoreOptions(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              com.google.privacy.dlp.v2.PartitionId.Builder subBuilder = null;
              if (partitionId_ != null) {
                subBuilder = partitionId_.toBuilder();
              }
              partitionId_ =
                  input.readMessage(
                      com.google.privacy.dlp.v2.PartitionId.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(partitionId_);
                partitionId_ = subBuilder.buildPartial();
              }

              break;
            }
          case 18:
            {
              com.google.privacy.dlp.v2.KindExpression.Builder subBuilder = null;
              if (kind_ != null) {
                subBuilder = kind_.toBuilder();
              }
              kind_ =
                  input.readMessage(
                      com.google.privacy.dlp.v2.KindExpression.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(kind_);
                kind_ = subBuilder.buildPartial();
              }

              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_DatastoreOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpStorage
        .internal_static_google_privacy_dlp_v2_DatastoreOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DatastoreOptions.class,
            com.google.privacy.dlp.v2.DatastoreOptions.Builder.class);
  }

  public static final int PARTITION_ID_FIELD_NUMBER = 1;
  private com.google.privacy.dlp.v2.PartitionId partitionId_;
  /**
   *
   *
   * <pre>
   * A partition ID identifies a grouping of entities. The grouping is always
   * by project and namespace, however the namespace ID may be empty.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
   */
  public boolean hasPartitionId() {
    return partitionId_ != null;
  }
  /**
   *
   *
   * <pre>
   * A partition ID identifies a grouping of entities. The grouping is always
   * by project and namespace, however the namespace ID may be empty.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
   */
  public com.google.privacy.dlp.v2.PartitionId getPartitionId() {
    return partitionId_ == null
        ? com.google.privacy.dlp.v2.PartitionId.getDefaultInstance()
        : partitionId_;
  }
  /**
   *
   *
   * <pre>
   * A partition ID identifies a grouping of entities. The grouping is always
   * by project and namespace, however the namespace ID may be empty.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
   */
  public com.google.privacy.dlp.v2.PartitionIdOrBuilder getPartitionIdOrBuilder() {
    return getPartitionId();
  }

  public static final int KIND_FIELD_NUMBER = 2;
  private com.google.privacy.dlp.v2.KindExpression kind_;
  /**
   *
   *
   * <pre>
   * The kind to process.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
   */
  public boolean hasKind() {
    return kind_ != null;
  }
  /**
   *
   *
   * <pre>
   * The kind to process.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
   */
  public com.google.privacy.dlp.v2.KindExpression getKind() {
    return kind_ == null ? com.google.privacy.dlp.v2.KindExpression.getDefaultInstance() : kind_;
  }
  /**
   *
   *
   * <pre>
   * The kind to process.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
   */
  public com.google.privacy.dlp.v2.KindExpressionOrBuilder getKindOrBuilder() {
    return getKind();
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (partitionId_ != null) {
      output.writeMessage(1, getPartitionId());
    }
    if (kind_ != null) {
      output.writeMessage(2, getKind());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (partitionId_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getPartitionId());
    }
    if (kind_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getKind());
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
    if (!(obj instanceof com.google.privacy.dlp.v2.DatastoreOptions)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DatastoreOptions other =
        (com.google.privacy.dlp.v2.DatastoreOptions) obj;

    if (hasPartitionId() != other.hasPartitionId()) return false;
    if (hasPartitionId()) {
      if (!getPartitionId().equals(other.getPartitionId())) return false;
    }
    if (hasKind() != other.hasKind()) return false;
    if (hasKind()) {
      if (!getKind().equals(other.getKind())) return false;
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
    if (hasPartitionId()) {
      hash = (37 * hash) + PARTITION_ID_FIELD_NUMBER;
      hash = (53 * hash) + getPartitionId().hashCode();
    }
    if (hasKind()) {
      hash = (37 * hash) + KIND_FIELD_NUMBER;
      hash = (53 * hash) + getKind().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.privacy.dlp.v2.DatastoreOptions prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Options defining a data set within Google Cloud Datastore.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DatastoreOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DatastoreOptions)
      com.google.privacy.dlp.v2.DatastoreOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_DatastoreOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_DatastoreOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DatastoreOptions.class,
              com.google.privacy.dlp.v2.DatastoreOptions.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DatastoreOptions.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (partitionIdBuilder_ == null) {
        partitionId_ = null;
      } else {
        partitionId_ = null;
        partitionIdBuilder_ = null;
      }
      if (kindBuilder_ == null) {
        kind_ = null;
      } else {
        kind_ = null;
        kindBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpStorage
          .internal_static_google_privacy_dlp_v2_DatastoreOptions_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DatastoreOptions getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DatastoreOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DatastoreOptions build() {
      com.google.privacy.dlp.v2.DatastoreOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DatastoreOptions buildPartial() {
      com.google.privacy.dlp.v2.DatastoreOptions result =
          new com.google.privacy.dlp.v2.DatastoreOptions(this);
      if (partitionIdBuilder_ == null) {
        result.partitionId_ = partitionId_;
      } else {
        result.partitionId_ = partitionIdBuilder_.build();
      }
      if (kindBuilder_ == null) {
        result.kind_ = kind_;
      } else {
        result.kind_ = kindBuilder_.build();
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
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.privacy.dlp.v2.DatastoreOptions) {
        return mergeFrom((com.google.privacy.dlp.v2.DatastoreOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DatastoreOptions other) {
      if (other == com.google.privacy.dlp.v2.DatastoreOptions.getDefaultInstance()) return this;
      if (other.hasPartitionId()) {
        mergePartitionId(other.getPartitionId());
      }
      if (other.hasKind()) {
        mergeKind(other.getKind());
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
      com.google.privacy.dlp.v2.DatastoreOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.DatastoreOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.privacy.dlp.v2.PartitionId partitionId_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.PartitionId,
            com.google.privacy.dlp.v2.PartitionId.Builder,
            com.google.privacy.dlp.v2.PartitionIdOrBuilder>
        partitionIdBuilder_;
    /**
     *
     *
     * <pre>
     * A partition ID identifies a grouping of entities. The grouping is always
     * by project and namespace, however the namespace ID may be empty.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
     */
    public boolean hasPartitionId() {
      return partitionIdBuilder_ != null || partitionId_ != null;
    }
    /**
     *
     *
     * <pre>
     * A partition ID identifies a grouping of entities. The grouping is always
     * by project and namespace, however the namespace ID may be empty.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
     */
    public com.google.privacy.dlp.v2.PartitionId getPartitionId() {
      if (partitionIdBuilder_ == null) {
        return partitionId_ == null
            ? com.google.privacy.dlp.v2.PartitionId.getDefaultInstance()
            : partitionId_;
      } else {
        return partitionIdBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * A partition ID identifies a grouping of entities. The grouping is always
     * by project and namespace, however the namespace ID may be empty.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
     */
    public Builder setPartitionId(com.google.privacy.dlp.v2.PartitionId value) {
      if (partitionIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        partitionId_ = value;
        onChanged();
      } else {
        partitionIdBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A partition ID identifies a grouping of entities. The grouping is always
     * by project and namespace, however the namespace ID may be empty.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
     */
    public Builder setPartitionId(com.google.privacy.dlp.v2.PartitionId.Builder builderForValue) {
      if (partitionIdBuilder_ == null) {
        partitionId_ = builderForValue.build();
        onChanged();
      } else {
        partitionIdBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A partition ID identifies a grouping of entities. The grouping is always
     * by project and namespace, however the namespace ID may be empty.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
     */
    public Builder mergePartitionId(com.google.privacy.dlp.v2.PartitionId value) {
      if (partitionIdBuilder_ == null) {
        if (partitionId_ != null) {
          partitionId_ =
              com.google.privacy.dlp.v2.PartitionId.newBuilder(partitionId_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          partitionId_ = value;
        }
        onChanged();
      } else {
        partitionIdBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A partition ID identifies a grouping of entities. The grouping is always
     * by project and namespace, however the namespace ID may be empty.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
     */
    public Builder clearPartitionId() {
      if (partitionIdBuilder_ == null) {
        partitionId_ = null;
        onChanged();
      } else {
        partitionId_ = null;
        partitionIdBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * A partition ID identifies a grouping of entities. The grouping is always
     * by project and namespace, however the namespace ID may be empty.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
     */
    public com.google.privacy.dlp.v2.PartitionId.Builder getPartitionIdBuilder() {

      onChanged();
      return getPartitionIdFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * A partition ID identifies a grouping of entities. The grouping is always
     * by project and namespace, however the namespace ID may be empty.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
     */
    public com.google.privacy.dlp.v2.PartitionIdOrBuilder getPartitionIdOrBuilder() {
      if (partitionIdBuilder_ != null) {
        return partitionIdBuilder_.getMessageOrBuilder();
      } else {
        return partitionId_ == null
            ? com.google.privacy.dlp.v2.PartitionId.getDefaultInstance()
            : partitionId_;
      }
    }
    /**
     *
     *
     * <pre>
     * A partition ID identifies a grouping of entities. The grouping is always
     * by project and namespace, however the namespace ID may be empty.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.PartitionId partition_id = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.PartitionId,
            com.google.privacy.dlp.v2.PartitionId.Builder,
            com.google.privacy.dlp.v2.PartitionIdOrBuilder>
        getPartitionIdFieldBuilder() {
      if (partitionIdBuilder_ == null) {
        partitionIdBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.PartitionId,
                com.google.privacy.dlp.v2.PartitionId.Builder,
                com.google.privacy.dlp.v2.PartitionIdOrBuilder>(
                getPartitionId(), getParentForChildren(), isClean());
        partitionId_ = null;
      }
      return partitionIdBuilder_;
    }

    private com.google.privacy.dlp.v2.KindExpression kind_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.KindExpression,
            com.google.privacy.dlp.v2.KindExpression.Builder,
            com.google.privacy.dlp.v2.KindExpressionOrBuilder>
        kindBuilder_;
    /**
     *
     *
     * <pre>
     * The kind to process.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
     */
    public boolean hasKind() {
      return kindBuilder_ != null || kind_ != null;
    }
    /**
     *
     *
     * <pre>
     * The kind to process.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
     */
    public com.google.privacy.dlp.v2.KindExpression getKind() {
      if (kindBuilder_ == null) {
        return kind_ == null
            ? com.google.privacy.dlp.v2.KindExpression.getDefaultInstance()
            : kind_;
      } else {
        return kindBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The kind to process.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
     */
    public Builder setKind(com.google.privacy.dlp.v2.KindExpression value) {
      if (kindBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        kind_ = value;
        onChanged();
      } else {
        kindBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The kind to process.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
     */
    public Builder setKind(com.google.privacy.dlp.v2.KindExpression.Builder builderForValue) {
      if (kindBuilder_ == null) {
        kind_ = builderForValue.build();
        onChanged();
      } else {
        kindBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The kind to process.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
     */
    public Builder mergeKind(com.google.privacy.dlp.v2.KindExpression value) {
      if (kindBuilder_ == null) {
        if (kind_ != null) {
          kind_ =
              com.google.privacy.dlp.v2.KindExpression.newBuilder(kind_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          kind_ = value;
        }
        onChanged();
      } else {
        kindBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The kind to process.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
     */
    public Builder clearKind() {
      if (kindBuilder_ == null) {
        kind_ = null;
        onChanged();
      } else {
        kind_ = null;
        kindBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The kind to process.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
     */
    public com.google.privacy.dlp.v2.KindExpression.Builder getKindBuilder() {

      onChanged();
      return getKindFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The kind to process.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
     */
    public com.google.privacy.dlp.v2.KindExpressionOrBuilder getKindOrBuilder() {
      if (kindBuilder_ != null) {
        return kindBuilder_.getMessageOrBuilder();
      } else {
        return kind_ == null
            ? com.google.privacy.dlp.v2.KindExpression.getDefaultInstance()
            : kind_;
      }
    }
    /**
     *
     *
     * <pre>
     * The kind to process.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.KindExpression kind = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.privacy.dlp.v2.KindExpression,
            com.google.privacy.dlp.v2.KindExpression.Builder,
            com.google.privacy.dlp.v2.KindExpressionOrBuilder>
        getKindFieldBuilder() {
      if (kindBuilder_ == null) {
        kindBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.privacy.dlp.v2.KindExpression,
                com.google.privacy.dlp.v2.KindExpression.Builder,
                com.google.privacy.dlp.v2.KindExpressionOrBuilder>(
                getKind(), getParentForChildren(), isClean());
        kind_ = null;
      }
      return kindBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DatastoreOptions)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DatastoreOptions)
  private static final com.google.privacy.dlp.v2.DatastoreOptions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DatastoreOptions();
  }

  public static com.google.privacy.dlp.v2.DatastoreOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatastoreOptions> PARSER =
      new com.google.protobuf.AbstractParser<DatastoreOptions>() {
        @java.lang.Override
        public DatastoreOptions parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new DatastoreOptions(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<DatastoreOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatastoreOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DatastoreOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
