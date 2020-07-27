// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package com.talking.grpc.chat;

/**
 * Protobuf type {@code chat.AllChatMessageResponse}
 */
public  final class AllChatMessageResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chat.AllChatMessageResponse)
    AllChatMessageResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AllChatMessageResponse.newBuilder() to construct.
  private AllChatMessageResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AllChatMessageResponse() {
    users_ = java.util.Collections.emptyList();
    messages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AllChatMessageResponse(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              users_ = new java.util.ArrayList<com.talking.grpc.common.User>();
              mutable_bitField0_ |= 0x00000001;
            }
            users_.add(
                input.readMessage(com.talking.grpc.common.User.parser(), extensionRegistry));
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              messages_ = new java.util.ArrayList<com.talking.grpc.chat.ChatMessage>();
              mutable_bitField0_ |= 0x00000002;
            }
            messages_.add(
                input.readMessage(com.talking.grpc.chat.ChatMessage.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        users_ = java.util.Collections.unmodifiableList(users_);
      }
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        messages_ = java.util.Collections.unmodifiableList(messages_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.talking.grpc.chat.Chat.internal_static_chat_AllChatMessageResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.talking.grpc.chat.Chat.internal_static_chat_AllChatMessageResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.talking.grpc.chat.AllChatMessageResponse.class, com.talking.grpc.chat.AllChatMessageResponse.Builder.class);
  }

  public static final int USERS_FIELD_NUMBER = 1;
  private java.util.List<com.talking.grpc.common.User> users_;
  /**
   * <code>repeated .common.User users = 1;</code>
   */
  public java.util.List<com.talking.grpc.common.User> getUsersList() {
    return users_;
  }
  /**
   * <code>repeated .common.User users = 1;</code>
   */
  public java.util.List<? extends com.talking.grpc.common.UserOrBuilder> 
      getUsersOrBuilderList() {
    return users_;
  }
  /**
   * <code>repeated .common.User users = 1;</code>
   */
  public int getUsersCount() {
    return users_.size();
  }
  /**
   * <code>repeated .common.User users = 1;</code>
   */
  public com.talking.grpc.common.User getUsers(int index) {
    return users_.get(index);
  }
  /**
   * <code>repeated .common.User users = 1;</code>
   */
  public com.talking.grpc.common.UserOrBuilder getUsersOrBuilder(
      int index) {
    return users_.get(index);
  }

  public static final int MESSAGES_FIELD_NUMBER = 2;
  private java.util.List<com.talking.grpc.chat.ChatMessage> messages_;
  /**
   * <code>repeated .chat.ChatMessage messages = 2;</code>
   */
  public java.util.List<com.talking.grpc.chat.ChatMessage> getMessagesList() {
    return messages_;
  }
  /**
   * <code>repeated .chat.ChatMessage messages = 2;</code>
   */
  public java.util.List<? extends com.talking.grpc.chat.ChatMessageOrBuilder> 
      getMessagesOrBuilderList() {
    return messages_;
  }
  /**
   * <code>repeated .chat.ChatMessage messages = 2;</code>
   */
  public int getMessagesCount() {
    return messages_.size();
  }
  /**
   * <code>repeated .chat.ChatMessage messages = 2;</code>
   */
  public com.talking.grpc.chat.ChatMessage getMessages(int index) {
    return messages_.get(index);
  }
  /**
   * <code>repeated .chat.ChatMessage messages = 2;</code>
   */
  public com.talking.grpc.chat.ChatMessageOrBuilder getMessagesOrBuilder(
      int index) {
    return messages_.get(index);
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
    for (int i = 0; i < users_.size(); i++) {
      output.writeMessage(1, users_.get(i));
    }
    for (int i = 0; i < messages_.size(); i++) {
      output.writeMessage(2, messages_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < users_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, users_.get(i));
    }
    for (int i = 0; i < messages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, messages_.get(i));
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
    if (!(obj instanceof com.talking.grpc.chat.AllChatMessageResponse)) {
      return super.equals(obj);
    }
    com.talking.grpc.chat.AllChatMessageResponse other = (com.talking.grpc.chat.AllChatMessageResponse) obj;

    boolean result = true;
    result = result && getUsersList()
        .equals(other.getUsersList());
    result = result && getMessagesList()
        .equals(other.getMessagesList());
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
    if (getUsersCount() > 0) {
      hash = (37 * hash) + USERS_FIELD_NUMBER;
      hash = (53 * hash) + getUsersList().hashCode();
    }
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.talking.grpc.chat.AllChatMessageResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.talking.grpc.chat.AllChatMessageResponse parseFrom(
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
  public static Builder newBuilder(com.talking.grpc.chat.AllChatMessageResponse prototype) {
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
   * Protobuf type {@code chat.AllChatMessageResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chat.AllChatMessageResponse)
      com.talking.grpc.chat.AllChatMessageResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.talking.grpc.chat.Chat.internal_static_chat_AllChatMessageResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.talking.grpc.chat.Chat.internal_static_chat_AllChatMessageResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.talking.grpc.chat.AllChatMessageResponse.class, com.talking.grpc.chat.AllChatMessageResponse.Builder.class);
    }

    // Construct using com.talking.grpc.chat.AllChatMessageResponse.newBuilder()
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
        getUsersFieldBuilder();
        getMessagesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        usersBuilder_.clear();
      }
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.talking.grpc.chat.Chat.internal_static_chat_AllChatMessageResponse_descriptor;
    }

    public com.talking.grpc.chat.AllChatMessageResponse getDefaultInstanceForType() {
      return com.talking.grpc.chat.AllChatMessageResponse.getDefaultInstance();
    }

    public com.talking.grpc.chat.AllChatMessageResponse build() {
      com.talking.grpc.chat.AllChatMessageResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.talking.grpc.chat.AllChatMessageResponse buildPartial() {
      com.talking.grpc.chat.AllChatMessageResponse result = new com.talking.grpc.chat.AllChatMessageResponse(this);
      int from_bitField0_ = bitField0_;
      if (usersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          users_ = java.util.Collections.unmodifiableList(users_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.users_ = users_;
      } else {
        result.users_ = usersBuilder_.build();
      }
      if (messagesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          messages_ = java.util.Collections.unmodifiableList(messages_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.messages_ = messages_;
      } else {
        result.messages_ = messagesBuilder_.build();
      }
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
      if (other instanceof com.talking.grpc.chat.AllChatMessageResponse) {
        return mergeFrom((com.talking.grpc.chat.AllChatMessageResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.talking.grpc.chat.AllChatMessageResponse other) {
      if (other == com.talking.grpc.chat.AllChatMessageResponse.getDefaultInstance()) return this;
      if (usersBuilder_ == null) {
        if (!other.users_.isEmpty()) {
          if (users_.isEmpty()) {
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUsersIsMutable();
            users_.addAll(other.users_);
          }
          onChanged();
        }
      } else {
        if (!other.users_.isEmpty()) {
          if (usersBuilder_.isEmpty()) {
            usersBuilder_.dispose();
            usersBuilder_ = null;
            users_ = other.users_;
            bitField0_ = (bitField0_ & ~0x00000001);
            usersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUsersFieldBuilder() : null;
          } else {
            usersBuilder_.addAllMessages(other.users_);
          }
        }
      }
      if (messagesBuilder_ == null) {
        if (!other.messages_.isEmpty()) {
          if (messages_.isEmpty()) {
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureMessagesIsMutable();
            messages_.addAll(other.messages_);
          }
          onChanged();
        }
      } else {
        if (!other.messages_.isEmpty()) {
          if (messagesBuilder_.isEmpty()) {
            messagesBuilder_.dispose();
            messagesBuilder_ = null;
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000002);
            messagesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMessagesFieldBuilder() : null;
          } else {
            messagesBuilder_.addAllMessages(other.messages_);
          }
        }
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
      com.talking.grpc.chat.AllChatMessageResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.talking.grpc.chat.AllChatMessageResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.talking.grpc.common.User> users_ =
      java.util.Collections.emptyList();
    private void ensureUsersIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        users_ = new java.util.ArrayList<com.talking.grpc.common.User>(users_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.talking.grpc.common.User, com.talking.grpc.common.User.Builder, com.talking.grpc.common.UserOrBuilder> usersBuilder_;

    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public java.util.List<com.talking.grpc.common.User> getUsersList() {
      if (usersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(users_);
      } else {
        return usersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public int getUsersCount() {
      if (usersBuilder_ == null) {
        return users_.size();
      } else {
        return usersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public com.talking.grpc.common.User getUsers(int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);
      } else {
        return usersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public Builder setUsers(
        int index, com.talking.grpc.common.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.set(index, value);
        onChanged();
      } else {
        usersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public Builder setUsers(
        int index, com.talking.grpc.common.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.set(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public Builder addUsers(com.talking.grpc.common.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(value);
        onChanged();
      } else {
        usersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public Builder addUsers(
        int index, com.talking.grpc.common.User value) {
      if (usersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUsersIsMutable();
        users_.add(index, value);
        onChanged();
      } else {
        usersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public Builder addUsers(
        com.talking.grpc.common.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public Builder addUsers(
        int index, com.talking.grpc.common.User.Builder builderForValue) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.add(index, builderForValue.build());
        onChanged();
      } else {
        usersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public Builder addAllUsers(
        java.lang.Iterable<? extends com.talking.grpc.common.User> values) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, users_);
        onChanged();
      } else {
        usersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public Builder clearUsers() {
      if (usersBuilder_ == null) {
        users_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        usersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public Builder removeUsers(int index) {
      if (usersBuilder_ == null) {
        ensureUsersIsMutable();
        users_.remove(index);
        onChanged();
      } else {
        usersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public com.talking.grpc.common.User.Builder getUsersBuilder(
        int index) {
      return getUsersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public com.talking.grpc.common.UserOrBuilder getUsersOrBuilder(
        int index) {
      if (usersBuilder_ == null) {
        return users_.get(index);  } else {
        return usersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public java.util.List<? extends com.talking.grpc.common.UserOrBuilder> 
         getUsersOrBuilderList() {
      if (usersBuilder_ != null) {
        return usersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(users_);
      }
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public com.talking.grpc.common.User.Builder addUsersBuilder() {
      return getUsersFieldBuilder().addBuilder(
          com.talking.grpc.common.User.getDefaultInstance());
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public com.talking.grpc.common.User.Builder addUsersBuilder(
        int index) {
      return getUsersFieldBuilder().addBuilder(
          index, com.talking.grpc.common.User.getDefaultInstance());
    }
    /**
     * <code>repeated .common.User users = 1;</code>
     */
    public java.util.List<com.talking.grpc.common.User.Builder> 
         getUsersBuilderList() {
      return getUsersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.talking.grpc.common.User, com.talking.grpc.common.User.Builder, com.talking.grpc.common.UserOrBuilder> 
        getUsersFieldBuilder() {
      if (usersBuilder_ == null) {
        usersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.talking.grpc.common.User, com.talking.grpc.common.User.Builder, com.talking.grpc.common.UserOrBuilder>(
                users_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        users_ = null;
      }
      return usersBuilder_;
    }

    private java.util.List<com.talking.grpc.chat.ChatMessage> messages_ =
      java.util.Collections.emptyList();
    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        messages_ = new java.util.ArrayList<com.talking.grpc.chat.ChatMessage>(messages_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.talking.grpc.chat.ChatMessage, com.talking.grpc.chat.ChatMessage.Builder, com.talking.grpc.chat.ChatMessageOrBuilder> messagesBuilder_;

    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public java.util.List<com.talking.grpc.chat.ChatMessage> getMessagesList() {
      if (messagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(messages_);
      } else {
        return messagesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public int getMessagesCount() {
      if (messagesBuilder_ == null) {
        return messages_.size();
      } else {
        return messagesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public com.talking.grpc.chat.ChatMessage getMessages(int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public Builder setMessages(
        int index, com.talking.grpc.chat.ChatMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.set(index, value);
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public Builder setMessages(
        int index, com.talking.grpc.chat.ChatMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.set(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public Builder addMessages(com.talking.grpc.chat.ChatMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public Builder addMessages(
        int index, com.talking.grpc.chat.ChatMessage value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(index, value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public Builder addMessages(
        com.talking.grpc.chat.ChatMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public Builder addMessages(
        int index, com.talking.grpc.chat.ChatMessage.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<? extends com.talking.grpc.chat.ChatMessage> values) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, messages_);
        onChanged();
      } else {
        messagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public Builder clearMessages() {
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public Builder removeMessages(int index) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.remove(index);
        onChanged();
      } else {
        messagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public com.talking.grpc.chat.ChatMessage.Builder getMessagesBuilder(
        int index) {
      return getMessagesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public com.talking.grpc.chat.ChatMessageOrBuilder getMessagesOrBuilder(
        int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);  } else {
        return messagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public java.util.List<? extends com.talking.grpc.chat.ChatMessageOrBuilder> 
         getMessagesOrBuilderList() {
      if (messagesBuilder_ != null) {
        return messagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(messages_);
      }
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public com.talking.grpc.chat.ChatMessage.Builder addMessagesBuilder() {
      return getMessagesFieldBuilder().addBuilder(
          com.talking.grpc.chat.ChatMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public com.talking.grpc.chat.ChatMessage.Builder addMessagesBuilder(
        int index) {
      return getMessagesFieldBuilder().addBuilder(
          index, com.talking.grpc.chat.ChatMessage.getDefaultInstance());
    }
    /**
     * <code>repeated .chat.ChatMessage messages = 2;</code>
     */
    public java.util.List<com.talking.grpc.chat.ChatMessage.Builder> 
         getMessagesBuilderList() {
      return getMessagesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.talking.grpc.chat.ChatMessage, com.talking.grpc.chat.ChatMessage.Builder, com.talking.grpc.chat.ChatMessageOrBuilder> 
        getMessagesFieldBuilder() {
      if (messagesBuilder_ == null) {
        messagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.talking.grpc.chat.ChatMessage, com.talking.grpc.chat.ChatMessage.Builder, com.talking.grpc.chat.ChatMessageOrBuilder>(
                messages_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        messages_ = null;
      }
      return messagesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:chat.AllChatMessageResponse)
  }

  // @@protoc_insertion_point(class_scope:chat.AllChatMessageResponse)
  private static final com.talking.grpc.chat.AllChatMessageResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.talking.grpc.chat.AllChatMessageResponse();
  }

  public static com.talking.grpc.chat.AllChatMessageResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AllChatMessageResponse>
      PARSER = new com.google.protobuf.AbstractParser<AllChatMessageResponse>() {
    public AllChatMessageResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AllChatMessageResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AllChatMessageResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AllChatMessageResponse> getParserForType() {
    return PARSER;
  }

  public com.talking.grpc.chat.AllChatMessageResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

