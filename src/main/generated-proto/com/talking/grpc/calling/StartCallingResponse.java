// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calling.proto

package com.talking.grpc.calling;

/**
 * Protobuf type {@code calling.StartCallingResponse}
 */
public  final class StartCallingResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calling.StartCallingResponse)
    StartCallingResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartCallingResponse.newBuilder() to construct.
  private StartCallingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartCallingResponse() {
    resultType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StartCallingResponse(
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {
            int rawValue = input.readEnum();

            resultType_ = rawValue;
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
    return com.talking.grpc.calling.Calling.internal_static_calling_StartCallingResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.talking.grpc.calling.Calling.internal_static_calling_StartCallingResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.talking.grpc.calling.StartCallingResponse.class, com.talking.grpc.calling.StartCallingResponse.Builder.class);
  }

  public static final int RESULTTYPE_FIELD_NUMBER = 1;
  private int resultType_;
  /**
   * <code>.calling.StartCallingResultType resultType = 1;</code>
   */
  public int getResultTypeValue() {
    return resultType_;
  }
  /**
   * <code>.calling.StartCallingResultType resultType = 1;</code>
   */
  public com.talking.grpc.calling.StartCallingResultType getResultType() {
    com.talking.grpc.calling.StartCallingResultType result = com.talking.grpc.calling.StartCallingResultType.valueOf(resultType_);
    return result == null ? com.talking.grpc.calling.StartCallingResultType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (resultType_ != com.talking.grpc.calling.StartCallingResultType.SUCCESS.getNumber()) {
      output.writeEnum(1, resultType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resultType_ != com.talking.grpc.calling.StartCallingResultType.SUCCESS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, resultType_);
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
    if (!(obj instanceof com.talking.grpc.calling.StartCallingResponse)) {
      return super.equals(obj);
    }
    com.talking.grpc.calling.StartCallingResponse other = (com.talking.grpc.calling.StartCallingResponse) obj;

    boolean result = true;
    result = result && resultType_ == other.resultType_;
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
    hash = (37 * hash) + RESULTTYPE_FIELD_NUMBER;
    hash = (53 * hash) + resultType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.talking.grpc.calling.StartCallingResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.talking.grpc.calling.StartCallingResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.talking.grpc.calling.StartCallingResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code calling.StartCallingResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calling.StartCallingResponse)
      com.talking.grpc.calling.StartCallingResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.talking.grpc.calling.Calling.internal_static_calling_StartCallingResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.talking.grpc.calling.Calling.internal_static_calling_StartCallingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.talking.grpc.calling.StartCallingResponse.class, com.talking.grpc.calling.StartCallingResponse.Builder.class);
    }

    // Construct using com.talking.grpc.calling.StartCallingResponse.newBuilder()
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
    public Builder clear() {
      super.clear();
      resultType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.talking.grpc.calling.Calling.internal_static_calling_StartCallingResponse_descriptor;
    }

    public com.talking.grpc.calling.StartCallingResponse getDefaultInstanceForType() {
      return com.talking.grpc.calling.StartCallingResponse.getDefaultInstance();
    }

    public com.talking.grpc.calling.StartCallingResponse build() {
      com.talking.grpc.calling.StartCallingResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.talking.grpc.calling.StartCallingResponse buildPartial() {
      com.talking.grpc.calling.StartCallingResponse result = new com.talking.grpc.calling.StartCallingResponse(this);
      result.resultType_ = resultType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.talking.grpc.calling.StartCallingResponse) {
        return mergeFrom((com.talking.grpc.calling.StartCallingResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.talking.grpc.calling.StartCallingResponse other) {
      if (other == com.talking.grpc.calling.StartCallingResponse.getDefaultInstance()) return this;
      if (other.resultType_ != 0) {
        setResultTypeValue(other.getResultTypeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.talking.grpc.calling.StartCallingResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.talking.grpc.calling.StartCallingResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int resultType_ = 0;
    /**
     * <code>.calling.StartCallingResultType resultType = 1;</code>
     */
    public int getResultTypeValue() {
      return resultType_;
    }
    /**
     * <code>.calling.StartCallingResultType resultType = 1;</code>
     */
    public Builder setResultTypeValue(int value) {
      resultType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.calling.StartCallingResultType resultType = 1;</code>
     */
    public com.talking.grpc.calling.StartCallingResultType getResultType() {
      com.talking.grpc.calling.StartCallingResultType result = com.talking.grpc.calling.StartCallingResultType.valueOf(resultType_);
      return result == null ? com.talking.grpc.calling.StartCallingResultType.UNRECOGNIZED : result;
    }
    /**
     * <code>.calling.StartCallingResultType resultType = 1;</code>
     */
    public Builder setResultType(com.talking.grpc.calling.StartCallingResultType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      resultType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.calling.StartCallingResultType resultType = 1;</code>
     */
    public Builder clearResultType() {
      
      resultType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:calling.StartCallingResponse)
  }

  // @@protoc_insertion_point(class_scope:calling.StartCallingResponse)
  private static final com.talking.grpc.calling.StartCallingResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.talking.grpc.calling.StartCallingResponse();
  }

  public static com.talking.grpc.calling.StartCallingResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartCallingResponse>
      PARSER = new com.google.protobuf.AbstractParser<StartCallingResponse>() {
    public StartCallingResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StartCallingResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StartCallingResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartCallingResponse> getParserForType() {
    return PARSER;
  }

  public com.talking.grpc.calling.StartCallingResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

