// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 * <pre>
 * User specified templates and configs for how to deidentify structured,
 * unstructures, and image files. User must provide either a unstructured
 * deidentify template or at least one redact image config.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.TransformationConfig}
 */
public final class TransformationConfig extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.TransformationConfig)
    TransformationConfigOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransformationConfig.newBuilder() to construct.
  private TransformationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransformationConfig() {
    deidentifyTemplate_ = "";
    structuredDeidentifyTemplate_ = "";
    imageRedactTemplate_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransformationConfig();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransformationConfig(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            deidentifyTemplate_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            structuredDeidentifyTemplate_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            imageRedactTemplate_ = s;
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
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
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
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_TransformationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_TransformationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.TransformationConfig.class, com.google.privacy.dlp.v2.TransformationConfig.Builder.class);
  }

  public static final int DEIDENTIFY_TEMPLATE_FIELD_NUMBER = 1;
  private volatile java.lang.Object deidentifyTemplate_;
  /**
   * <pre>
   * De-identify template.
   * If this template is specified, it will serve as the default de-identify
   * template. This template cannot contain `record_transformations` since it
   * can be used for unstructured content such as free-form text files. If this
   * template is not set, a default `ReplaceWithInfoTypeConfig` will be used to
   * de-identify unstructured content.
   * </pre>
   *
   * <code>string deidentify_template = 1;</code>
   * @return The deidentifyTemplate.
   */
  @java.lang.Override
  public java.lang.String getDeidentifyTemplate() {
    java.lang.Object ref = deidentifyTemplate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deidentifyTemplate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * De-identify template.
   * If this template is specified, it will serve as the default de-identify
   * template. This template cannot contain `record_transformations` since it
   * can be used for unstructured content such as free-form text files. If this
   * template is not set, a default `ReplaceWithInfoTypeConfig` will be used to
   * de-identify unstructured content.
   * </pre>
   *
   * <code>string deidentify_template = 1;</code>
   * @return The bytes for deidentifyTemplate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeidentifyTemplateBytes() {
    java.lang.Object ref = deidentifyTemplate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deidentifyTemplate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STRUCTURED_DEIDENTIFY_TEMPLATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object structuredDeidentifyTemplate_;
  /**
   * <pre>
   * Structured de-identify template.
   * If this template is specified, it will serve as the de-identify template
   * for structured content such as delimited files and tables. If this template
   * is not set but the `deidentify_template` is set, then `deidentify_template`
   * will also apply to the structured content. If neither template is set, a
   * default `ReplaceWithInfoTypeConfig` will be used to de-identify structured
   * content.
   * </pre>
   *
   * <code>string structured_deidentify_template = 2;</code>
   * @return The structuredDeidentifyTemplate.
   */
  @java.lang.Override
  public java.lang.String getStructuredDeidentifyTemplate() {
    java.lang.Object ref = structuredDeidentifyTemplate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      structuredDeidentifyTemplate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Structured de-identify template.
   * If this template is specified, it will serve as the de-identify template
   * for structured content such as delimited files and tables. If this template
   * is not set but the `deidentify_template` is set, then `deidentify_template`
   * will also apply to the structured content. If neither template is set, a
   * default `ReplaceWithInfoTypeConfig` will be used to de-identify structured
   * content.
   * </pre>
   *
   * <code>string structured_deidentify_template = 2;</code>
   * @return The bytes for structuredDeidentifyTemplate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStructuredDeidentifyTemplateBytes() {
    java.lang.Object ref = structuredDeidentifyTemplate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      structuredDeidentifyTemplate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IMAGE_REDACT_TEMPLATE_FIELD_NUMBER = 4;
  private volatile java.lang.Object imageRedactTemplate_;
  /**
   * <pre>
   * Image redact template.
   * If this template is specified, it will serve as the de-identify template
   * for images. If this template is not set, all findings in the image will be
   * redacted with a black box.
   * </pre>
   *
   * <code>string image_redact_template = 4;</code>
   * @return The imageRedactTemplate.
   */
  @java.lang.Override
  public java.lang.String getImageRedactTemplate() {
    java.lang.Object ref = imageRedactTemplate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      imageRedactTemplate_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Image redact template.
   * If this template is specified, it will serve as the de-identify template
   * for images. If this template is not set, all findings in the image will be
   * redacted with a black box.
   * </pre>
   *
   * <code>string image_redact_template = 4;</code>
   * @return The bytes for imageRedactTemplate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getImageRedactTemplateBytes() {
    java.lang.Object ref = imageRedactTemplate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      imageRedactTemplate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deidentifyTemplate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deidentifyTemplate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(structuredDeidentifyTemplate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, structuredDeidentifyTemplate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(imageRedactTemplate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, imageRedactTemplate_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deidentifyTemplate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deidentifyTemplate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(structuredDeidentifyTemplate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, structuredDeidentifyTemplate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(imageRedactTemplate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, imageRedactTemplate_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.TransformationConfig)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.TransformationConfig other = (com.google.privacy.dlp.v2.TransformationConfig) obj;

    if (!getDeidentifyTemplate()
        .equals(other.getDeidentifyTemplate())) return false;
    if (!getStructuredDeidentifyTemplate()
        .equals(other.getStructuredDeidentifyTemplate())) return false;
    if (!getImageRedactTemplate()
        .equals(other.getImageRedactTemplate())) return false;
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
    hash = (37 * hash) + DEIDENTIFY_TEMPLATE_FIELD_NUMBER;
    hash = (53 * hash) + getDeidentifyTemplate().hashCode();
    hash = (37 * hash) + STRUCTURED_DEIDENTIFY_TEMPLATE_FIELD_NUMBER;
    hash = (53 * hash) + getStructuredDeidentifyTemplate().hashCode();
    hash = (37 * hash) + IMAGE_REDACT_TEMPLATE_FIELD_NUMBER;
    hash = (53 * hash) + getImageRedactTemplate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.TransformationConfig parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.privacy.dlp.v2.TransformationConfig parseFrom(
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
  public static Builder newBuilder(com.google.privacy.dlp.v2.TransformationConfig prototype) {
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
   * User specified templates and configs for how to deidentify structured,
   * unstructures, and image files. User must provide either a unstructured
   * deidentify template or at least one redact image config.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.TransformationConfig}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.TransformationConfig)
      com.google.privacy.dlp.v2.TransformationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_TransformationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_TransformationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.TransformationConfig.class, com.google.privacy.dlp.v2.TransformationConfig.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.TransformationConfig.newBuilder()
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
      deidentifyTemplate_ = "";

      structuredDeidentifyTemplate_ = "";

      imageRedactTemplate_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto.internal_static_google_privacy_dlp_v2_TransformationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TransformationConfig getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.TransformationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TransformationConfig build() {
      com.google.privacy.dlp.v2.TransformationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.TransformationConfig buildPartial() {
      com.google.privacy.dlp.v2.TransformationConfig result = new com.google.privacy.dlp.v2.TransformationConfig(this);
      result.deidentifyTemplate_ = deidentifyTemplate_;
      result.structuredDeidentifyTemplate_ = structuredDeidentifyTemplate_;
      result.imageRedactTemplate_ = imageRedactTemplate_;
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
      if (other instanceof com.google.privacy.dlp.v2.TransformationConfig) {
        return mergeFrom((com.google.privacy.dlp.v2.TransformationConfig)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.TransformationConfig other) {
      if (other == com.google.privacy.dlp.v2.TransformationConfig.getDefaultInstance()) return this;
      if (!other.getDeidentifyTemplate().isEmpty()) {
        deidentifyTemplate_ = other.deidentifyTemplate_;
        onChanged();
      }
      if (!other.getStructuredDeidentifyTemplate().isEmpty()) {
        structuredDeidentifyTemplate_ = other.structuredDeidentifyTemplate_;
        onChanged();
      }
      if (!other.getImageRedactTemplate().isEmpty()) {
        imageRedactTemplate_ = other.imageRedactTemplate_;
        onChanged();
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
      com.google.privacy.dlp.v2.TransformationConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.TransformationConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object deidentifyTemplate_ = "";
    /**
     * <pre>
     * De-identify template.
     * If this template is specified, it will serve as the default de-identify
     * template. This template cannot contain `record_transformations` since it
     * can be used for unstructured content such as free-form text files. If this
     * template is not set, a default `ReplaceWithInfoTypeConfig` will be used to
     * de-identify unstructured content.
     * </pre>
     *
     * <code>string deidentify_template = 1;</code>
     * @return The deidentifyTemplate.
     */
    public java.lang.String getDeidentifyTemplate() {
      java.lang.Object ref = deidentifyTemplate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deidentifyTemplate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * De-identify template.
     * If this template is specified, it will serve as the default de-identify
     * template. This template cannot contain `record_transformations` since it
     * can be used for unstructured content such as free-form text files. If this
     * template is not set, a default `ReplaceWithInfoTypeConfig` will be used to
     * de-identify unstructured content.
     * </pre>
     *
     * <code>string deidentify_template = 1;</code>
     * @return The bytes for deidentifyTemplate.
     */
    public com.google.protobuf.ByteString
        getDeidentifyTemplateBytes() {
      java.lang.Object ref = deidentifyTemplate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deidentifyTemplate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * De-identify template.
     * If this template is specified, it will serve as the default de-identify
     * template. This template cannot contain `record_transformations` since it
     * can be used for unstructured content such as free-form text files. If this
     * template is not set, a default `ReplaceWithInfoTypeConfig` will be used to
     * de-identify unstructured content.
     * </pre>
     *
     * <code>string deidentify_template = 1;</code>
     * @param value The deidentifyTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setDeidentifyTemplate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      deidentifyTemplate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * De-identify template.
     * If this template is specified, it will serve as the default de-identify
     * template. This template cannot contain `record_transformations` since it
     * can be used for unstructured content such as free-form text files. If this
     * template is not set, a default `ReplaceWithInfoTypeConfig` will be used to
     * de-identify unstructured content.
     * </pre>
     *
     * <code>string deidentify_template = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeidentifyTemplate() {
      
      deidentifyTemplate_ = getDefaultInstance().getDeidentifyTemplate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * De-identify template.
     * If this template is specified, it will serve as the default de-identify
     * template. This template cannot contain `record_transformations` since it
     * can be used for unstructured content such as free-form text files. If this
     * template is not set, a default `ReplaceWithInfoTypeConfig` will be used to
     * de-identify unstructured content.
     * </pre>
     *
     * <code>string deidentify_template = 1;</code>
     * @param value The bytes for deidentifyTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setDeidentifyTemplateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      deidentifyTemplate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object structuredDeidentifyTemplate_ = "";
    /**
     * <pre>
     * Structured de-identify template.
     * If this template is specified, it will serve as the de-identify template
     * for structured content such as delimited files and tables. If this template
     * is not set but the `deidentify_template` is set, then `deidentify_template`
     * will also apply to the structured content. If neither template is set, a
     * default `ReplaceWithInfoTypeConfig` will be used to de-identify structured
     * content.
     * </pre>
     *
     * <code>string structured_deidentify_template = 2;</code>
     * @return The structuredDeidentifyTemplate.
     */
    public java.lang.String getStructuredDeidentifyTemplate() {
      java.lang.Object ref = structuredDeidentifyTemplate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        structuredDeidentifyTemplate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Structured de-identify template.
     * If this template is specified, it will serve as the de-identify template
     * for structured content such as delimited files and tables. If this template
     * is not set but the `deidentify_template` is set, then `deidentify_template`
     * will also apply to the structured content. If neither template is set, a
     * default `ReplaceWithInfoTypeConfig` will be used to de-identify structured
     * content.
     * </pre>
     *
     * <code>string structured_deidentify_template = 2;</code>
     * @return The bytes for structuredDeidentifyTemplate.
     */
    public com.google.protobuf.ByteString
        getStructuredDeidentifyTemplateBytes() {
      java.lang.Object ref = structuredDeidentifyTemplate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        structuredDeidentifyTemplate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Structured de-identify template.
     * If this template is specified, it will serve as the de-identify template
     * for structured content such as delimited files and tables. If this template
     * is not set but the `deidentify_template` is set, then `deidentify_template`
     * will also apply to the structured content. If neither template is set, a
     * default `ReplaceWithInfoTypeConfig` will be used to de-identify structured
     * content.
     * </pre>
     *
     * <code>string structured_deidentify_template = 2;</code>
     * @param value The structuredDeidentifyTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setStructuredDeidentifyTemplate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      structuredDeidentifyTemplate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Structured de-identify template.
     * If this template is specified, it will serve as the de-identify template
     * for structured content such as delimited files and tables. If this template
     * is not set but the `deidentify_template` is set, then `deidentify_template`
     * will also apply to the structured content. If neither template is set, a
     * default `ReplaceWithInfoTypeConfig` will be used to de-identify structured
     * content.
     * </pre>
     *
     * <code>string structured_deidentify_template = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStructuredDeidentifyTemplate() {
      
      structuredDeidentifyTemplate_ = getDefaultInstance().getStructuredDeidentifyTemplate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Structured de-identify template.
     * If this template is specified, it will serve as the de-identify template
     * for structured content such as delimited files and tables. If this template
     * is not set but the `deidentify_template` is set, then `deidentify_template`
     * will also apply to the structured content. If neither template is set, a
     * default `ReplaceWithInfoTypeConfig` will be used to de-identify structured
     * content.
     * </pre>
     *
     * <code>string structured_deidentify_template = 2;</code>
     * @param value The bytes for structuredDeidentifyTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setStructuredDeidentifyTemplateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      structuredDeidentifyTemplate_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object imageRedactTemplate_ = "";
    /**
     * <pre>
     * Image redact template.
     * If this template is specified, it will serve as the de-identify template
     * for images. If this template is not set, all findings in the image will be
     * redacted with a black box.
     * </pre>
     *
     * <code>string image_redact_template = 4;</code>
     * @return The imageRedactTemplate.
     */
    public java.lang.String getImageRedactTemplate() {
      java.lang.Object ref = imageRedactTemplate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageRedactTemplate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Image redact template.
     * If this template is specified, it will serve as the de-identify template
     * for images. If this template is not set, all findings in the image will be
     * redacted with a black box.
     * </pre>
     *
     * <code>string image_redact_template = 4;</code>
     * @return The bytes for imageRedactTemplate.
     */
    public com.google.protobuf.ByteString
        getImageRedactTemplateBytes() {
      java.lang.Object ref = imageRedactTemplate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageRedactTemplate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Image redact template.
     * If this template is specified, it will serve as the de-identify template
     * for images. If this template is not set, all findings in the image will be
     * redacted with a black box.
     * </pre>
     *
     * <code>string image_redact_template = 4;</code>
     * @param value The imageRedactTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setImageRedactTemplate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      imageRedactTemplate_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Image redact template.
     * If this template is specified, it will serve as the de-identify template
     * for images. If this template is not set, all findings in the image will be
     * redacted with a black box.
     * </pre>
     *
     * <code>string image_redact_template = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearImageRedactTemplate() {
      
      imageRedactTemplate_ = getDefaultInstance().getImageRedactTemplate();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Image redact template.
     * If this template is specified, it will serve as the de-identify template
     * for images. If this template is not set, all findings in the image will be
     * redacted with a black box.
     * </pre>
     *
     * <code>string image_redact_template = 4;</code>
     * @param value The bytes for imageRedactTemplate to set.
     * @return This builder for chaining.
     */
    public Builder setImageRedactTemplateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      imageRedactTemplate_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.TransformationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.TransformationConfig)
  private static final com.google.privacy.dlp.v2.TransformationConfig DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.TransformationConfig();
  }

  public static com.google.privacy.dlp.v2.TransformationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransformationConfig>
      PARSER = new com.google.protobuf.AbstractParser<TransformationConfig>() {
    @java.lang.Override
    public TransformationConfig parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransformationConfig(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransformationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransformationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.TransformationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

