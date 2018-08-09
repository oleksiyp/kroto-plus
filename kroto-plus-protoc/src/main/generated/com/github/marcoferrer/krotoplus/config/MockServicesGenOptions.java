// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krotoplus/compiler/config.proto

package com.github.marcoferrer.krotoplus.config;

/**
 * Protobuf type {@code krotoplus.compiler.MockServicesGenOptions}
 */
public  final class MockServicesGenOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:krotoplus.compiler.MockServicesGenOptions)
    MockServicesGenOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MockServicesGenOptions.newBuilder() to construct.
  private MockServicesGenOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MockServicesGenOptions() {
    implementAsObject_ = false;
    generateServiceList_ = false;
    serviceListPackage_ = "";
    serviceListName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MockServicesGenOptions(
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
          case 10: {
            com.github.marcoferrer.krotoplus.config.FileFilter.Builder subBuilder = null;
            if (filter_ != null) {
              subBuilder = filter_.toBuilder();
            }
            filter_ = input.readMessage(com.github.marcoferrer.krotoplus.config.FileFilter.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(filter_);
              filter_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            implementAsObject_ = input.readBool();
            break;
          }
          case 24: {

            generateServiceList_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceListPackage_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            serviceListName_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_MockServicesGenOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_MockServicesGenOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.marcoferrer.krotoplus.config.MockServicesGenOptions.class, com.github.marcoferrer.krotoplus.config.MockServicesGenOptions.Builder.class);
  }

  public static final int FILTER_FIELD_NUMBER = 1;
  private com.github.marcoferrer.krotoplus.config.FileFilter filter_;
  /**
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  public boolean hasFilter() {
    return filter_ != null;
  }
  /**
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  public com.github.marcoferrer.krotoplus.config.FileFilter getFilter() {
    return filter_ == null ? com.github.marcoferrer.krotoplus.config.FileFilter.getDefaultInstance() : filter_;
  }
  /**
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  public com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder getFilterOrBuilder() {
    return getFilter();
  }

  public static final int IMPLEMENT_AS_OBJECT_FIELD_NUMBER = 2;
  private boolean implementAsObject_;
  /**
   * <code>bool implement_as_object = 2;</code>
   */
  public boolean getImplementAsObject() {
    return implementAsObject_;
  }

  public static final int GENERATE_SERVICE_LIST_FIELD_NUMBER = 3;
  private boolean generateServiceList_;
  /**
   * <code>bool generate_service_list = 3;</code>
   */
  public boolean getGenerateServiceList() {
    return generateServiceList_;
  }

  public static final int SERVICE_LIST_PACKAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object serviceListPackage_;
  /**
   * <code>string service_list_package = 4;</code>
   */
  public java.lang.String getServiceListPackage() {
    java.lang.Object ref = serviceListPackage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceListPackage_ = s;
      return s;
    }
  }
  /**
   * <code>string service_list_package = 4;</code>
   */
  public com.google.protobuf.ByteString
      getServiceListPackageBytes() {
    java.lang.Object ref = serviceListPackage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceListPackage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_LIST_NAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object serviceListName_;
  /**
   * <code>string service_list_name = 5;</code>
   */
  public java.lang.String getServiceListName() {
    java.lang.Object ref = serviceListName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceListName_ = s;
      return s;
    }
  }
  /**
   * <code>string service_list_name = 5;</code>
   */
  public com.google.protobuf.ByteString
      getServiceListNameBytes() {
    java.lang.Object ref = serviceListName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      serviceListName_ = b;
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
    if (filter_ != null) {
      output.writeMessage(1, getFilter());
    }
    if (implementAsObject_ != false) {
      output.writeBool(2, implementAsObject_);
    }
    if (generateServiceList_ != false) {
      output.writeBool(3, generateServiceList_);
    }
    if (!getServiceListPackageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, serviceListPackage_);
    }
    if (!getServiceListNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, serviceListName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (filter_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getFilter());
    }
    if (implementAsObject_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, implementAsObject_);
    }
    if (generateServiceList_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, generateServiceList_);
    }
    if (!getServiceListPackageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, serviceListPackage_);
    }
    if (!getServiceListNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, serviceListName_);
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
    if (!(obj instanceof com.github.marcoferrer.krotoplus.config.MockServicesGenOptions)) {
      return super.equals(obj);
    }
    com.github.marcoferrer.krotoplus.config.MockServicesGenOptions other = (com.github.marcoferrer.krotoplus.config.MockServicesGenOptions) obj;

    boolean result = true;
    result = result && (hasFilter() == other.hasFilter());
    if (hasFilter()) {
      result = result && getFilter()
          .equals(other.getFilter());
    }
    result = result && (getImplementAsObject()
        == other.getImplementAsObject());
    result = result && (getGenerateServiceList()
        == other.getGenerateServiceList());
    result = result && getServiceListPackage()
        .equals(other.getServiceListPackage());
    result = result && getServiceListName()
        .equals(other.getServiceListName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasFilter()) {
      hash = (37 * hash) + FILTER_FIELD_NUMBER;
      hash = (53 * hash) + getFilter().hashCode();
    }
    hash = (37 * hash) + IMPLEMENT_AS_OBJECT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getImplementAsObject());
    hash = (37 * hash) + GENERATE_SERVICE_LIST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGenerateServiceList());
    hash = (37 * hash) + SERVICE_LIST_PACKAGE_FIELD_NUMBER;
    hash = (53 * hash) + getServiceListPackage().hashCode();
    hash = (37 * hash) + SERVICE_LIST_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceListName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parseFrom(
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
  public static Builder newBuilder(com.github.marcoferrer.krotoplus.config.MockServicesGenOptions prototype) {
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
   * Protobuf type {@code krotoplus.compiler.MockServicesGenOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:krotoplus.compiler.MockServicesGenOptions)
      com.github.marcoferrer.krotoplus.config.MockServicesGenOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_MockServicesGenOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_MockServicesGenOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.marcoferrer.krotoplus.config.MockServicesGenOptions.class, com.github.marcoferrer.krotoplus.config.MockServicesGenOptions.Builder.class);
    }

    // Construct using com.github.marcoferrer.krotoplus.config.MockServicesGenOptions.newBuilder()
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
      if (filterBuilder_ == null) {
        filter_ = null;
      } else {
        filter_ = null;
        filterBuilder_ = null;
      }
      implementAsObject_ = false;

      generateServiceList_ = false;

      serviceListPackage_ = "";

      serviceListName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_MockServicesGenOptions_descriptor;
    }

    @java.lang.Override
    public com.github.marcoferrer.krotoplus.config.MockServicesGenOptions getDefaultInstanceForType() {
      return com.github.marcoferrer.krotoplus.config.MockServicesGenOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.marcoferrer.krotoplus.config.MockServicesGenOptions build() {
      com.github.marcoferrer.krotoplus.config.MockServicesGenOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.marcoferrer.krotoplus.config.MockServicesGenOptions buildPartial() {
      com.github.marcoferrer.krotoplus.config.MockServicesGenOptions result = new com.github.marcoferrer.krotoplus.config.MockServicesGenOptions(this);
      if (filterBuilder_ == null) {
        result.filter_ = filter_;
      } else {
        result.filter_ = filterBuilder_.build();
      }
      result.implementAsObject_ = implementAsObject_;
      result.generateServiceList_ = generateServiceList_;
      result.serviceListPackage_ = serviceListPackage_;
      result.serviceListName_ = serviceListName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.marcoferrer.krotoplus.config.MockServicesGenOptions) {
        return mergeFrom((com.github.marcoferrer.krotoplus.config.MockServicesGenOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.marcoferrer.krotoplus.config.MockServicesGenOptions other) {
      if (other == com.github.marcoferrer.krotoplus.config.MockServicesGenOptions.getDefaultInstance()) return this;
      if (other.hasFilter()) {
        mergeFilter(other.getFilter());
      }
      if (other.getImplementAsObject() != false) {
        setImplementAsObject(other.getImplementAsObject());
      }
      if (other.getGenerateServiceList() != false) {
        setGenerateServiceList(other.getGenerateServiceList());
      }
      if (!other.getServiceListPackage().isEmpty()) {
        serviceListPackage_ = other.serviceListPackage_;
        onChanged();
      }
      if (!other.getServiceListName().isEmpty()) {
        serviceListName_ = other.serviceListName_;
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
      com.github.marcoferrer.krotoplus.config.MockServicesGenOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.marcoferrer.krotoplus.config.MockServicesGenOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.github.marcoferrer.krotoplus.config.FileFilter filter_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.marcoferrer.krotoplus.config.FileFilter, com.github.marcoferrer.krotoplus.config.FileFilter.Builder, com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder> filterBuilder_;
    /**
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public boolean hasFilter() {
      return filterBuilder_ != null || filter_ != null;
    }
    /**
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public com.github.marcoferrer.krotoplus.config.FileFilter getFilter() {
      if (filterBuilder_ == null) {
        return filter_ == null ? com.github.marcoferrer.krotoplus.config.FileFilter.getDefaultInstance() : filter_;
      } else {
        return filterBuilder_.getMessage();
      }
    }
    /**
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public Builder setFilter(com.github.marcoferrer.krotoplus.config.FileFilter value) {
      if (filterBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        filter_ = value;
        onChanged();
      } else {
        filterBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public Builder setFilter(
        com.github.marcoferrer.krotoplus.config.FileFilter.Builder builderForValue) {
      if (filterBuilder_ == null) {
        filter_ = builderForValue.build();
        onChanged();
      } else {
        filterBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public Builder mergeFilter(com.github.marcoferrer.krotoplus.config.FileFilter value) {
      if (filterBuilder_ == null) {
        if (filter_ != null) {
          filter_ =
            com.github.marcoferrer.krotoplus.config.FileFilter.newBuilder(filter_).mergeFrom(value).buildPartial();
        } else {
          filter_ = value;
        }
        onChanged();
      } else {
        filterBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public Builder clearFilter() {
      if (filterBuilder_ == null) {
        filter_ = null;
        onChanged();
      } else {
        filter_ = null;
        filterBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public com.github.marcoferrer.krotoplus.config.FileFilter.Builder getFilterBuilder() {
      
      onChanged();
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder getFilterOrBuilder() {
      if (filterBuilder_ != null) {
        return filterBuilder_.getMessageOrBuilder();
      } else {
        return filter_ == null ?
            com.github.marcoferrer.krotoplus.config.FileFilter.getDefaultInstance() : filter_;
      }
    }
    /**
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.marcoferrer.krotoplus.config.FileFilter, com.github.marcoferrer.krotoplus.config.FileFilter.Builder, com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder> 
        getFilterFieldBuilder() {
      if (filterBuilder_ == null) {
        filterBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.marcoferrer.krotoplus.config.FileFilter, com.github.marcoferrer.krotoplus.config.FileFilter.Builder, com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder>(
                getFilter(),
                getParentForChildren(),
                isClean());
        filter_ = null;
      }
      return filterBuilder_;
    }

    private boolean implementAsObject_ ;
    /**
     * <code>bool implement_as_object = 2;</code>
     */
    public boolean getImplementAsObject() {
      return implementAsObject_;
    }
    /**
     * <code>bool implement_as_object = 2;</code>
     */
    public Builder setImplementAsObject(boolean value) {
      
      implementAsObject_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool implement_as_object = 2;</code>
     */
    public Builder clearImplementAsObject() {
      
      implementAsObject_ = false;
      onChanged();
      return this;
    }

    private boolean generateServiceList_ ;
    /**
     * <code>bool generate_service_list = 3;</code>
     */
    public boolean getGenerateServiceList() {
      return generateServiceList_;
    }
    /**
     * <code>bool generate_service_list = 3;</code>
     */
    public Builder setGenerateServiceList(boolean value) {
      
      generateServiceList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool generate_service_list = 3;</code>
     */
    public Builder clearGenerateServiceList() {
      
      generateServiceList_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object serviceListPackage_ = "";
    /**
     * <code>string service_list_package = 4;</code>
     */
    public java.lang.String getServiceListPackage() {
      java.lang.Object ref = serviceListPackage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceListPackage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string service_list_package = 4;</code>
     */
    public com.google.protobuf.ByteString
        getServiceListPackageBytes() {
      java.lang.Object ref = serviceListPackage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceListPackage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string service_list_package = 4;</code>
     */
    public Builder setServiceListPackage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceListPackage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string service_list_package = 4;</code>
     */
    public Builder clearServiceListPackage() {
      
      serviceListPackage_ = getDefaultInstance().getServiceListPackage();
      onChanged();
      return this;
    }
    /**
     * <code>string service_list_package = 4;</code>
     */
    public Builder setServiceListPackageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceListPackage_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object serviceListName_ = "";
    /**
     * <code>string service_list_name = 5;</code>
     */
    public java.lang.String getServiceListName() {
      java.lang.Object ref = serviceListName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceListName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string service_list_name = 5;</code>
     */
    public com.google.protobuf.ByteString
        getServiceListNameBytes() {
      java.lang.Object ref = serviceListName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        serviceListName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string service_list_name = 5;</code>
     */
    public Builder setServiceListName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      serviceListName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string service_list_name = 5;</code>
     */
    public Builder clearServiceListName() {
      
      serviceListName_ = getDefaultInstance().getServiceListName();
      onChanged();
      return this;
    }
    /**
     * <code>string service_list_name = 5;</code>
     */
    public Builder setServiceListNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      serviceListName_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:krotoplus.compiler.MockServicesGenOptions)
  }

  // @@protoc_insertion_point(class_scope:krotoplus.compiler.MockServicesGenOptions)
  private static final com.github.marcoferrer.krotoplus.config.MockServicesGenOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.marcoferrer.krotoplus.config.MockServicesGenOptions();
  }

  public static com.github.marcoferrer.krotoplus.config.MockServicesGenOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MockServicesGenOptions>
      PARSER = new com.google.protobuf.AbstractParser<MockServicesGenOptions>() {
    @java.lang.Override
    public MockServicesGenOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MockServicesGenOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MockServicesGenOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MockServicesGenOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.marcoferrer.krotoplus.config.MockServicesGenOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

