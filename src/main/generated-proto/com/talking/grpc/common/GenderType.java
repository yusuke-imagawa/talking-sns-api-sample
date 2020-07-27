// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: commons.proto

package com.talking.grpc.common;

/**
 * Protobuf enum {@code common.GenderType}
 */
public enum GenderType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MALE = 0;</code>
   */
  MALE(0),
  /**
   * <code>FEMALE = 1;</code>
   */
  FEMALE(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MALE = 0;</code>
   */
  public static final int MALE_VALUE = 0;
  /**
   * <code>FEMALE = 1;</code>
   */
  public static final int FEMALE_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GenderType valueOf(int value) {
    return forNumber(value);
  }

  public static GenderType forNumber(int value) {
    switch (value) {
      case 0: return MALE;
      case 1: return FEMALE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GenderType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GenderType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GenderType>() {
          public GenderType findValueByNumber(int number) {
            return GenderType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.talking.grpc.common.Commons.getDescriptor().getEnumTypes().get(0);
  }

  private static final GenderType[] VALUES = values();

  public static GenderType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private GenderType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:common.GenderType)
}
