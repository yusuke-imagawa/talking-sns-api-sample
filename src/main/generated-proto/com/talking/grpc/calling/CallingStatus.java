// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: calling.proto

package com.talking.grpc.calling;

/**
 * Protobuf enum {@code calling.CallingStatus}
 */
public enum CallingStatus
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>STARTING = 0;</code>
   */
  STARTING(0),
  /**
   * <code>TALKING = 1;</code>
   */
  TALKING(1),
  /**
   * <code>END = 2;</code>
   */
  END(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>STARTING = 0;</code>
   */
  public static final int STARTING_VALUE = 0;
  /**
   * <code>TALKING = 1;</code>
   */
  public static final int TALKING_VALUE = 1;
  /**
   * <code>END = 2;</code>
   */
  public static final int END_VALUE = 2;


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
  public static CallingStatus valueOf(int value) {
    return forNumber(value);
  }

  public static CallingStatus forNumber(int value) {
    switch (value) {
      case 0: return STARTING;
      case 1: return TALKING;
      case 2: return END;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CallingStatus>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      CallingStatus> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CallingStatus>() {
          public CallingStatus findValueByNumber(int number) {
            return CallingStatus.forNumber(number);
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
    return com.talking.grpc.calling.Calling.getDescriptor().getEnumTypes().get(1);
  }

  private static final CallingStatus[] VALUES = values();

  public static CallingStatus valueOf(
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

  private CallingStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:calling.CallingStatus)
}
