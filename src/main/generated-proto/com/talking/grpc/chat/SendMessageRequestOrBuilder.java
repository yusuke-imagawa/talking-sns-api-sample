// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package com.talking.grpc.chat;

public interface SendMessageRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chat.SendMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 toUserId = 1;</code>
   */
  long getToUserId();

  /**
   * <code>string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();
}