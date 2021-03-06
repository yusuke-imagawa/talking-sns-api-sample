// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commons.proto

package com.talking.grpc.common;

public interface UserOrBuilder extends
    // @@protoc_insertion_point(interface_extends:common.User)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.common.GenderType genderType = 3;</code>
   */
  int getGenderTypeValue();
  /**
   * <code>.common.GenderType genderType = 3;</code>
   */
  com.talking.grpc.common.GenderType getGenderType();

  /**
   * <code>int32 age = 4;</code>
   */
  int getAge();

  /**
   * <code>string pr = 5;</code>
   */
  java.lang.String getPr();
  /**
   * <code>string pr = 5;</code>
   */
  com.google.protobuf.ByteString
      getPrBytes();

  /**
   * <code>.common.ProfileImage profileImage = 6;</code>
   */
  boolean hasProfileImage();
  /**
   * <code>.common.ProfileImage profileImage = 6;</code>
   */
  com.talking.grpc.common.ProfileImage getProfileImage();
  /**
   * <code>.common.ProfileImage profileImage = 6;</code>
   */
  com.talking.grpc.common.ProfileImageOrBuilder getProfileImageOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp lastOnlineDatetime = 7;</code>
   */
  boolean hasLastOnlineDatetime();
  /**
   * <code>.google.protobuf.Timestamp lastOnlineDatetime = 7;</code>
   */
  com.google.protobuf.Timestamp getLastOnlineDatetime();
  /**
   * <code>.google.protobuf.Timestamp lastOnlineDatetime = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getLastOnlineDatetimeOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp created = 8;</code>
   */
  boolean hasCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 8;</code>
   */
  com.google.protobuf.Timestamp getCreated();
  /**
   * <code>.google.protobuf.Timestamp created = 8;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreatedOrBuilder();

  /**
   * <code>.google.protobuf.Timestamp modified = 9;</code>
   */
  boolean hasModified();
  /**
   * <code>.google.protobuf.Timestamp modified = 9;</code>
   */
  com.google.protobuf.Timestamp getModified();
  /**
   * <code>.google.protobuf.Timestamp modified = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getModifiedOrBuilder();
}
