// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package com.talking.grpc.chat;

public interface ReceiveMessageResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chat.ReceiveMessageResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.chat.ChatMessage chatMessage = 1;</code>
   */
  boolean hasChatMessage();
  /**
   * <code>.chat.ChatMessage chatMessage = 1;</code>
   */
  com.talking.grpc.chat.ChatMessage getChatMessage();
  /**
   * <code>.chat.ChatMessage chatMessage = 1;</code>
   */
  com.talking.grpc.chat.ChatMessageOrBuilder getChatMessageOrBuilder();

  /**
   * <code>.common.User fromUser = 2;</code>
   */
  boolean hasFromUser();
  /**
   * <code>.common.User fromUser = 2;</code>
   */
  com.talking.grpc.common.User getFromUser();
  /**
   * <code>.common.User fromUser = 2;</code>
   */
  com.talking.grpc.common.UserOrBuilder getFromUserOrBuilder();

  /**
   * <code>.common.User toUser = 3;</code>
   */
  boolean hasToUser();
  /**
   * <code>.common.User toUser = 3;</code>
   */
  com.talking.grpc.common.User getToUser();
  /**
   * <code>.common.User toUser = 3;</code>
   */
  com.talking.grpc.common.UserOrBuilder getToUserOrBuilder();
}
