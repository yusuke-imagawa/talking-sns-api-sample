// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: account.proto

package com.talking.grpc.user;

public final class Account {
  private Account() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_account_RegisterUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_account_RegisterUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_account_RegisterUserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_account_RegisterUserResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_account_UpdateProfileRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_account_UpdateProfileRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\raccount.proto\022\007account\032\033google/protobu" +
      "f/empty.proto\032\036google/protobuf/wrappers." +
      "proto\032\rcommons.proto\"d\n\023RegisterUserRequ" +
      "est\022\014\n\004name\030\001 \001(\t\022&\n\ngenderType\030\002 \001(\0162\022." +
      "common.GenderType\022\013\n\003age\030\003 \001(\005\022\n\n\002pr\030\004 \001" +
      "(\t\"D\n\024RegisterUserResponse\022\020\n\010apiToken\030\001" +
      " \001(\t\022\032\n\004user\030\002 \001(\0132\014.common.User\"\226\001\n\024Upd" +
      "ateProfileRequest\022*\n\004name\030\001 \001(\0132\034.google" +
      ".protobuf.StringValue\022(\n\003age\030\002 \001(\0132\033.goo" +
      "gle.protobuf.Int32Value\022(\n\002pr\030\003 \001(\0132\034.go" +
      "ogle.protobuf.StringValue2a\n\026AccountRegi" +
      "sterService\022G\n\010Register\022\034.account.Regist" +
      "erUserRequest\032\035.account.RegisterUserResp" +
      "onse2\221\001\n\016AccountService\022F\n\rUpdateProfile" +
      "\022\035.account.UpdateProfileRequest\032\026.google" +
      ".protobuf.Empty\0227\n\005Leave\022\026.google.protob" +
      "uf.Empty\032\026.google.protobuf.EmptyB\031\n\025com." +
      "talking.grpc.userP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.talking.grpc.common.Commons.getDescriptor(),
        }, assigner);
    internal_static_account_RegisterUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_account_RegisterUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_account_RegisterUserRequest_descriptor,
        new java.lang.String[] { "Name", "GenderType", "Age", "Pr", });
    internal_static_account_RegisterUserResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_account_RegisterUserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_account_RegisterUserResponse_descriptor,
        new java.lang.String[] { "ApiToken", "User", });
    internal_static_account_UpdateProfileRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_account_UpdateProfileRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_account_UpdateProfileRequest_descriptor,
        new java.lang.String[] { "Name", "Age", "Pr", });
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.talking.grpc.common.Commons.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
