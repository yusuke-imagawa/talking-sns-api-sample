// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account.proto

package com.talking.grpc.user;

public interface RegisterUserRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:account.RegisterUserRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.common.GenderType genderType = 2;</code>
   */
  int getGenderTypeValue();
  /**
   * <code>.common.GenderType genderType = 2;</code>
   */
  com.talking.grpc.common.GenderType getGenderType();

  /**
   * <code>int32 age = 3;</code>
   */
  int getAge();

  /**
   * <code>string pr = 4;</code>
   */
  java.lang.String getPr();
  /**
   * <code>string pr = 4;</code>
   */
  com.google.protobuf.ByteString
      getPrBytes();
}
