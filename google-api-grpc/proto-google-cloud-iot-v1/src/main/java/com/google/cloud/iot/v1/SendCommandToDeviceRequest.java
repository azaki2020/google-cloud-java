// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/device_manager.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * Request for `SendCommandToDevice`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.SendCommandToDeviceRequest}
 */
public final class SendCommandToDeviceRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.SendCommandToDeviceRequest)
    SendCommandToDeviceRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SendCommandToDeviceRequest.newBuilder() to construct.
  private SendCommandToDeviceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SendCommandToDeviceRequest() {
    name_ = "";
    binaryData_ = com.google.protobuf.ByteString.EMPTY;
    subfolder_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SendCommandToDeviceRequest(
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
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              name_ = s;
              break;
            }
          case 18:
            {
              binaryData_ = input.readBytes();
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              subfolder_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_SendCommandToDeviceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.DeviceManagerProto
        .internal_static_google_cloud_iot_v1_SendCommandToDeviceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.SendCommandToDeviceRequest.class,
            com.google.cloud.iot.v1.SendCommandToDeviceRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The name of the device. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the device. For example,
   * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
   * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   */
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BINARY_DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString binaryData_;
  /**
   *
   *
   * <pre>
   * Required. The command data to send to the device.
   * </pre>
   *
   * <code>bytes binary_data = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  public com.google.protobuf.ByteString getBinaryData() {
    return binaryData_;
  }

  public static final int SUBFOLDER_FIELD_NUMBER = 3;
  private volatile java.lang.Object subfolder_;
  /**
   *
   *
   * <pre>
   * Optional subfolder for the command. If empty, the command will be delivered
   * to the /devices/{device-id}/commands topic, otherwise it will be delivered
   * to the /devices/{device-id}/commands/{subfolder} topic. Multi-level
   * subfolders are allowed. This field must not have more than 256 characters,
   * and must not contain any MQTT wildcards ("+" or "#") or null characters.
   * </pre>
   *
   * <code>string subfolder = 3;</code>
   */
  public java.lang.String getSubfolder() {
    java.lang.Object ref = subfolder_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subfolder_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional subfolder for the command. If empty, the command will be delivered
   * to the /devices/{device-id}/commands topic, otherwise it will be delivered
   * to the /devices/{device-id}/commands/{subfolder} topic. Multi-level
   * subfolders are allowed. This field must not have more than 256 characters,
   * and must not contain any MQTT wildcards ("+" or "#") or null characters.
   * </pre>
   *
   * <code>string subfolder = 3;</code>
   */
  public com.google.protobuf.ByteString getSubfolderBytes() {
    java.lang.Object ref = subfolder_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subfolder_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!binaryData_.isEmpty()) {
      output.writeBytes(2, binaryData_);
    }
    if (!getSubfolderBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subfolder_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!binaryData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, binaryData_);
    }
    if (!getSubfolderBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subfolder_);
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
    if (!(obj instanceof com.google.cloud.iot.v1.SendCommandToDeviceRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.SendCommandToDeviceRequest other =
        (com.google.cloud.iot.v1.SendCommandToDeviceRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getBinaryData().equals(other.getBinaryData())) return false;
    if (!getSubfolder().equals(other.getSubfolder())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + BINARY_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getBinaryData().hashCode();
    hash = (37 * hash) + SUBFOLDER_FIELD_NUMBER;
    hash = (53 * hash) + getSubfolder().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.iot.v1.SendCommandToDeviceRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Request for `SendCommandToDevice`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.SendCommandToDeviceRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.SendCommandToDeviceRequest)
      com.google.cloud.iot.v1.SendCommandToDeviceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_SendCommandToDeviceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_SendCommandToDeviceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.SendCommandToDeviceRequest.class,
              com.google.cloud.iot.v1.SendCommandToDeviceRequest.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.SendCommandToDeviceRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      binaryData_ = com.google.protobuf.ByteString.EMPTY;

      subfolder_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.DeviceManagerProto
          .internal_static_google_cloud_iot_v1_SendCommandToDeviceRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.SendCommandToDeviceRequest getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.SendCommandToDeviceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.SendCommandToDeviceRequest build() {
      com.google.cloud.iot.v1.SendCommandToDeviceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.SendCommandToDeviceRequest buildPartial() {
      com.google.cloud.iot.v1.SendCommandToDeviceRequest result =
          new com.google.cloud.iot.v1.SendCommandToDeviceRequest(this);
      result.name_ = name_;
      result.binaryData_ = binaryData_;
      result.subfolder_ = subfolder_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.iot.v1.SendCommandToDeviceRequest) {
        return mergeFrom((com.google.cloud.iot.v1.SendCommandToDeviceRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.SendCommandToDeviceRequest other) {
      if (other == com.google.cloud.iot.v1.SendCommandToDeviceRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.getBinaryData() != com.google.protobuf.ByteString.EMPTY) {
        setBinaryData(other.getBinaryData());
      }
      if (!other.getSubfolder().isEmpty()) {
        subfolder_ = other.subfolder_;
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
      com.google.cloud.iot.v1.SendCommandToDeviceRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.iot.v1.SendCommandToDeviceRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the device. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the device. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the device. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the device. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the device. For example,
     * `projects/p0/locations/us-central1/registries/registry0/devices/device0` or
     * `projects/p0/locations/us-central1/registries/registry0/devices/{num_id}`.
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString binaryData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Required. The command data to send to the device.
     * </pre>
     *
     * <code>bytes binary_data = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.protobuf.ByteString getBinaryData() {
      return binaryData_;
    }
    /**
     *
     *
     * <pre>
     * Required. The command data to send to the device.
     * </pre>
     *
     * <code>bytes binary_data = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setBinaryData(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      binaryData_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The command data to send to the device.
     * </pre>
     *
     * <code>bytes binary_data = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearBinaryData() {

      binaryData_ = getDefaultInstance().getBinaryData();
      onChanged();
      return this;
    }

    private java.lang.Object subfolder_ = "";
    /**
     *
     *
     * <pre>
     * Optional subfolder for the command. If empty, the command will be delivered
     * to the /devices/{device-id}/commands topic, otherwise it will be delivered
     * to the /devices/{device-id}/commands/{subfolder} topic. Multi-level
     * subfolders are allowed. This field must not have more than 256 characters,
     * and must not contain any MQTT wildcards ("+" or "#") or null characters.
     * </pre>
     *
     * <code>string subfolder = 3;</code>
     */
    public java.lang.String getSubfolder() {
      java.lang.Object ref = subfolder_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subfolder_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional subfolder for the command. If empty, the command will be delivered
     * to the /devices/{device-id}/commands topic, otherwise it will be delivered
     * to the /devices/{device-id}/commands/{subfolder} topic. Multi-level
     * subfolders are allowed. This field must not have more than 256 characters,
     * and must not contain any MQTT wildcards ("+" or "#") or null characters.
     * </pre>
     *
     * <code>string subfolder = 3;</code>
     */
    public com.google.protobuf.ByteString getSubfolderBytes() {
      java.lang.Object ref = subfolder_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subfolder_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional subfolder for the command. If empty, the command will be delivered
     * to the /devices/{device-id}/commands topic, otherwise it will be delivered
     * to the /devices/{device-id}/commands/{subfolder} topic. Multi-level
     * subfolders are allowed. This field must not have more than 256 characters,
     * and must not contain any MQTT wildcards ("+" or "#") or null characters.
     * </pre>
     *
     * <code>string subfolder = 3;</code>
     */
    public Builder setSubfolder(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      subfolder_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional subfolder for the command. If empty, the command will be delivered
     * to the /devices/{device-id}/commands topic, otherwise it will be delivered
     * to the /devices/{device-id}/commands/{subfolder} topic. Multi-level
     * subfolders are allowed. This field must not have more than 256 characters,
     * and must not contain any MQTT wildcards ("+" or "#") or null characters.
     * </pre>
     *
     * <code>string subfolder = 3;</code>
     */
    public Builder clearSubfolder() {

      subfolder_ = getDefaultInstance().getSubfolder();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional subfolder for the command. If empty, the command will be delivered
     * to the /devices/{device-id}/commands topic, otherwise it will be delivered
     * to the /devices/{device-id}/commands/{subfolder} topic. Multi-level
     * subfolders are allowed. This field must not have more than 256 characters,
     * and must not contain any MQTT wildcards ("+" or "#") or null characters.
     * </pre>
     *
     * <code>string subfolder = 3;</code>
     */
    public Builder setSubfolderBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      subfolder_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.SendCommandToDeviceRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.SendCommandToDeviceRequest)
  private static final com.google.cloud.iot.v1.SendCommandToDeviceRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.SendCommandToDeviceRequest();
  }

  public static com.google.cloud.iot.v1.SendCommandToDeviceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SendCommandToDeviceRequest> PARSER =
      new com.google.protobuf.AbstractParser<SendCommandToDeviceRequest>() {
        @java.lang.Override
        public SendCommandToDeviceRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SendCommandToDeviceRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SendCommandToDeviceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SendCommandToDeviceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.SendCommandToDeviceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
