// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: krotoplus/compiler/config.proto

package com.github.marcoferrer.krotoplus.config;

/**
 * <pre>
 * Configuration used by the 'Generator Scripts' code generator.
 * </pre>
 *
 * Protobuf type {@code krotoplus.compiler.GeneratorScriptsGenOptions}
 */
public  final class GeneratorScriptsGenOptions extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:krotoplus.compiler.GeneratorScriptsGenOptions)
    GeneratorScriptsGenOptionsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GeneratorScriptsGenOptions.newBuilder() to construct.
  private GeneratorScriptsGenOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GeneratorScriptsGenOptions() {
    scriptPath_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    scriptBundle_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GeneratorScriptsGenOptions(
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
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              scriptPath_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000002;
            }
            scriptPath_.add(s);
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            scriptBundle_ = s;
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        scriptPath_ = scriptPath_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_GeneratorScriptsGenOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_GeneratorScriptsGenOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions.class, com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions.Builder.class);
  }

  private int bitField0_;
  public static final int FILTER_FIELD_NUMBER = 1;
  private com.github.marcoferrer.krotoplus.config.FileFilter filter_;
  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  public boolean hasFilter() {
    return filter_ != null;
  }
  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  public com.github.marcoferrer.krotoplus.config.FileFilter getFilter() {
    return filter_ == null ? com.github.marcoferrer.krotoplus.config.FileFilter.getDefaultInstance() : filter_;
  }
  /**
   * <pre>
   * Filter used for limiting the input files that are processed by the code generator
   * The default filter will match true against all input files.
   * </pre>
   *
   * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
   */
  public com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder getFilterOrBuilder() {
    return getFilter();
  }

  public static final int SCRIPT_PATH_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList scriptPath_;
  /**
   * <code>repeated string script_path = 2;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getScriptPathList() {
    return scriptPath_;
  }
  /**
   * <code>repeated string script_path = 2;</code>
   */
  public int getScriptPathCount() {
    return scriptPath_.size();
  }
  /**
   * <code>repeated string script_path = 2;</code>
   */
  public java.lang.String getScriptPath(int index) {
    return scriptPath_.get(index);
  }
  /**
   * <code>repeated string script_path = 2;</code>
   */
  public com.google.protobuf.ByteString
      getScriptPathBytes(int index) {
    return scriptPath_.getByteString(index);
  }

  public static final int SCRIPT_BUNDLE_FIELD_NUMBER = 3;
  private volatile java.lang.Object scriptBundle_;
  /**
   * <code>string script_bundle = 3;</code>
   */
  public java.lang.String getScriptBundle() {
    java.lang.Object ref = scriptBundle_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      scriptBundle_ = s;
      return s;
    }
  }
  /**
   * <code>string script_bundle = 3;</code>
   */
  public com.google.protobuf.ByteString
      getScriptBundleBytes() {
    java.lang.Object ref = scriptBundle_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      scriptBundle_ = b;
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
    for (int i = 0; i < scriptPath_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, scriptPath_.getRaw(i));
    }
    if (!getScriptBundleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, scriptBundle_);
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
    {
      int dataSize = 0;
      for (int i = 0; i < scriptPath_.size(); i++) {
        dataSize += computeStringSizeNoTag(scriptPath_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getScriptPathList().size();
    }
    if (!getScriptBundleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, scriptBundle_);
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
    if (!(obj instanceof com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions)) {
      return super.equals(obj);
    }
    com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions other = (com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions) obj;

    boolean result = true;
    result = result && (hasFilter() == other.hasFilter());
    if (hasFilter()) {
      result = result && getFilter()
          .equals(other.getFilter());
    }
    result = result && getScriptPathList()
        .equals(other.getScriptPathList());
    result = result && getScriptBundle()
        .equals(other.getScriptBundle());
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
    if (getScriptPathCount() > 0) {
      hash = (37 * hash) + SCRIPT_PATH_FIELD_NUMBER;
      hash = (53 * hash) + getScriptPathList().hashCode();
    }
    hash = (37 * hash) + SCRIPT_BUNDLE_FIELD_NUMBER;
    hash = (53 * hash) + getScriptBundle().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parseFrom(
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
  public static Builder newBuilder(com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions prototype) {
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
   * Configuration used by the 'Generator Scripts' code generator.
   * </pre>
   *
   * Protobuf type {@code krotoplus.compiler.GeneratorScriptsGenOptions}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:krotoplus.compiler.GeneratorScriptsGenOptions)
      com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_GeneratorScriptsGenOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_GeneratorScriptsGenOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions.class, com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions.Builder.class);
    }

    // Construct using com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions.newBuilder()
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
      scriptPath_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      scriptBundle_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.marcoferrer.krotoplus.config.Config.internal_static_krotoplus_compiler_GeneratorScriptsGenOptions_descriptor;
    }

    @java.lang.Override
    public com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions getDefaultInstanceForType() {
      return com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions build() {
      com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions buildPartial() {
      com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions result = new com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (filterBuilder_ == null) {
        result.filter_ = filter_;
      } else {
        result.filter_ = filterBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        scriptPath_ = scriptPath_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.scriptPath_ = scriptPath_;
      result.scriptBundle_ = scriptBundle_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions) {
        return mergeFrom((com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions other) {
      if (other == com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions.getDefaultInstance()) return this;
      if (other.hasFilter()) {
        mergeFilter(other.getFilter());
      }
      if (!other.scriptPath_.isEmpty()) {
        if (scriptPath_.isEmpty()) {
          scriptPath_ = other.scriptPath_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureScriptPathIsMutable();
          scriptPath_.addAll(other.scriptPath_);
        }
        onChanged();
      }
      if (!other.getScriptBundle().isEmpty()) {
        scriptBundle_ = other.scriptBundle_;
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
      com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.github.marcoferrer.krotoplus.config.FileFilter filter_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.marcoferrer.krotoplus.config.FileFilter, com.github.marcoferrer.krotoplus.config.FileFilter.Builder, com.github.marcoferrer.krotoplus.config.FileFilterOrBuilder> filterBuilder_;
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public boolean hasFilter() {
      return filterBuilder_ != null || filter_ != null;
    }
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
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
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
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
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
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
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
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
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
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
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
     * <code>.krotoplus.compiler.FileFilter filter = 1;</code>
     */
    public com.github.marcoferrer.krotoplus.config.FileFilter.Builder getFilterBuilder() {
      
      onChanged();
      return getFilterFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
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
     * <pre>
     * Filter used for limiting the input files that are processed by the code generator
     * The default filter will match true against all input files.
     * </pre>
     *
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

    private com.google.protobuf.LazyStringList scriptPath_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureScriptPathIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        scriptPath_ = new com.google.protobuf.LazyStringArrayList(scriptPath_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated string script_path = 2;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getScriptPathList() {
      return scriptPath_.getUnmodifiableView();
    }
    /**
     * <code>repeated string script_path = 2;</code>
     */
    public int getScriptPathCount() {
      return scriptPath_.size();
    }
    /**
     * <code>repeated string script_path = 2;</code>
     */
    public java.lang.String getScriptPath(int index) {
      return scriptPath_.get(index);
    }
    /**
     * <code>repeated string script_path = 2;</code>
     */
    public com.google.protobuf.ByteString
        getScriptPathBytes(int index) {
      return scriptPath_.getByteString(index);
    }
    /**
     * <code>repeated string script_path = 2;</code>
     */
    public Builder setScriptPath(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureScriptPathIsMutable();
      scriptPath_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string script_path = 2;</code>
     */
    public Builder addScriptPath(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureScriptPathIsMutable();
      scriptPath_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string script_path = 2;</code>
     */
    public Builder addAllScriptPath(
        java.lang.Iterable<java.lang.String> values) {
      ensureScriptPathIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, scriptPath_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string script_path = 2;</code>
     */
    public Builder clearScriptPath() {
      scriptPath_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string script_path = 2;</code>
     */
    public Builder addScriptPathBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureScriptPathIsMutable();
      scriptPath_.add(value);
      onChanged();
      return this;
    }

    private java.lang.Object scriptBundle_ = "";
    /**
     * <code>string script_bundle = 3;</code>
     */
    public java.lang.String getScriptBundle() {
      java.lang.Object ref = scriptBundle_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        scriptBundle_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string script_bundle = 3;</code>
     */
    public com.google.protobuf.ByteString
        getScriptBundleBytes() {
      java.lang.Object ref = scriptBundle_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        scriptBundle_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string script_bundle = 3;</code>
     */
    public Builder setScriptBundle(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      scriptBundle_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string script_bundle = 3;</code>
     */
    public Builder clearScriptBundle() {
      
      scriptBundle_ = getDefaultInstance().getScriptBundle();
      onChanged();
      return this;
    }
    /**
     * <code>string script_bundle = 3;</code>
     */
    public Builder setScriptBundleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      scriptBundle_ = value;
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


    // @@protoc_insertion_point(builder_scope:krotoplus.compiler.GeneratorScriptsGenOptions)
  }

  // @@protoc_insertion_point(class_scope:krotoplus.compiler.GeneratorScriptsGenOptions)
  private static final com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions();
  }

  public static com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GeneratorScriptsGenOptions>
      PARSER = new com.google.protobuf.AbstractParser<GeneratorScriptsGenOptions>() {
    @java.lang.Override
    public GeneratorScriptsGenOptions parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GeneratorScriptsGenOptions(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GeneratorScriptsGenOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GeneratorScriptsGenOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.marcoferrer.krotoplus.config.GeneratorScriptsGenOptions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

