// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FleurFairMusicGameSettleRsp.proto

package emu.grasscutter.net.proto;

public final class FleurFairMusicGameSettleRspOuterClass {
  private FleurFairMusicGameSettleRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface FleurFairMusicGameSettleRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FleurFairMusicGameSettleRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_new_record = 15;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>bool is_unlock_next_level = 7;</code>
     * @return The isUnlockNextLevel.
     */
    boolean getIsUnlockNextLevel();

    /**
     * <code>uint32 music_basic_id = 4;</code>
     * @return The musicBasicId.
     */
    int getMusicBasicId();

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 2156;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code FleurFairMusicGameSettleRsp}
   */
  public static final class FleurFairMusicGameSettleRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FleurFairMusicGameSettleRsp)
      FleurFairMusicGameSettleRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FleurFairMusicGameSettleRsp.newBuilder() to construct.
    private FleurFairMusicGameSettleRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FleurFairMusicGameSettleRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new FleurFairMusicGameSettleRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FleurFairMusicGameSettleRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 32: {

              musicBasicId_ = input.readUInt32();
              break;
            }
            case 56: {

              isUnlockNextLevel_ = input.readBool();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 120: {

              isNewRecord_ = input.readBool();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.internal_static_FleurFairMusicGameSettleRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.internal_static_FleurFairMusicGameSettleRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp.class, emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp.Builder.class);
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 15;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 15;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int IS_UNLOCK_NEXT_LEVEL_FIELD_NUMBER = 7;
    private boolean isUnlockNextLevel_;
    /**
     * <code>bool is_unlock_next_level = 7;</code>
     * @return The isUnlockNextLevel.
     */
    @java.lang.Override
    public boolean getIsUnlockNextLevel() {
      return isUnlockNextLevel_;
    }

    public static final int MUSIC_BASIC_ID_FIELD_NUMBER = 4;
    private int musicBasicId_;
    /**
     * <code>uint32 music_basic_id = 4;</code>
     * @return The musicBasicId.
     */
    @java.lang.Override
    public int getMusicBasicId() {
      return musicBasicId_;
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (musicBasicId_ != 0) {
        output.writeUInt32(4, musicBasicId_);
      }
      if (isUnlockNextLevel_ != false) {
        output.writeBool(7, isUnlockNextLevel_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(15, isNewRecord_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (musicBasicId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, musicBasicId_);
      }
      if (isUnlockNextLevel_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(7, isUnlockNextLevel_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(15, isNewRecord_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp other = (emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp) obj;

      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getIsUnlockNextLevel()
          != other.getIsUnlockNextLevel()) return false;
      if (getMusicBasicId()
          != other.getMusicBasicId()) return false;
      if (getRetcode()
          != other.getRetcode()) return false;
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
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + IS_UNLOCK_NEXT_LEVEL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsUnlockNextLevel());
      hash = (37 * hash) + MUSIC_BASIC_ID_FIELD_NUMBER;
      hash = (53 * hash) + getMusicBasicId();
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 2156;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code FleurFairMusicGameSettleRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FleurFairMusicGameSettleRsp)
        emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.internal_static_FleurFairMusicGameSettleRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.internal_static_FleurFairMusicGameSettleRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp.class, emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        isNewRecord_ = false;

        isUnlockNextLevel_ = false;

        musicBasicId_ = 0;

        retcode_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.internal_static_FleurFairMusicGameSettleRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp build() {
        emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp buildPartial() {
        emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp result = new emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp(this);
        result.isNewRecord_ = isNewRecord_;
        result.isUnlockNextLevel_ = isUnlockNextLevel_;
        result.musicBasicId_ = musicBasicId_;
        result.retcode_ = retcode_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp) {
          return mergeFrom((emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp other) {
        if (other == emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp.getDefaultInstance()) return this;
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getIsUnlockNextLevel() != false) {
          setIsUnlockNextLevel(other.getIsUnlockNextLevel());
        }
        if (other.getMusicBasicId() != 0) {
          setMusicBasicId(other.getMusicBasicId());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
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
        emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 15;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 15;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private boolean isUnlockNextLevel_ ;
      /**
       * <code>bool is_unlock_next_level = 7;</code>
       * @return The isUnlockNextLevel.
       */
      @java.lang.Override
      public boolean getIsUnlockNextLevel() {
        return isUnlockNextLevel_;
      }
      /**
       * <code>bool is_unlock_next_level = 7;</code>
       * @param value The isUnlockNextLevel to set.
       * @return This builder for chaining.
       */
      public Builder setIsUnlockNextLevel(boolean value) {
        
        isUnlockNextLevel_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_unlock_next_level = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsUnlockNextLevel() {
        
        isUnlockNextLevel_ = false;
        onChanged();
        return this;
      }

      private int musicBasicId_ ;
      /**
       * <code>uint32 music_basic_id = 4;</code>
       * @return The musicBasicId.
       */
      @java.lang.Override
      public int getMusicBasicId() {
        return musicBasicId_;
      }
      /**
       * <code>uint32 music_basic_id = 4;</code>
       * @param value The musicBasicId to set.
       * @return This builder for chaining.
       */
      public Builder setMusicBasicId(int value) {
        
        musicBasicId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 music_basic_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMusicBasicId() {
        
        musicBasicId_ = 0;
        onChanged();
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FleurFairMusicGameSettleRsp)
    }

    // @@protoc_insertion_point(class_scope:FleurFairMusicGameSettleRsp)
    private static final emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp();
    }

    public static emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FleurFairMusicGameSettleRsp>
        PARSER = new com.google.protobuf.AbstractParser<FleurFairMusicGameSettleRsp>() {
      @java.lang.Override
      public FleurFairMusicGameSettleRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FleurFairMusicGameSettleRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FleurFairMusicGameSettleRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FleurFairMusicGameSettleRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.FleurFairMusicGameSettleRspOuterClass.FleurFairMusicGameSettleRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FleurFairMusicGameSettleRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FleurFairMusicGameSettleRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!FleurFairMusicGameSettleRsp.proto\"{\n\033F" +
      "leurFairMusicGameSettleRsp\022\025\n\ris_new_rec" +
      "ord\030\017 \001(\010\022\034\n\024is_unlock_next_level\030\007 \001(\010\022" +
      "\026\n\016music_basic_id\030\004 \001(\r\022\017\n\007retcode\030\t \001(\005" +
      "B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_FleurFairMusicGameSettleRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FleurFairMusicGameSettleRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FleurFairMusicGameSettleRsp_descriptor,
        new java.lang.String[] { "IsNewRecord", "IsUnlockNextLevel", "MusicBasicId", "Retcode", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}