
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     mojo/public/mojom/base/values.mojom
//

package org.chromium.mojo_base.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class Value extends org.chromium.mojo.bindings.Union {

    public static final class Tag {
        public static final int NullValue = 0;
        public static final int BoolValue = 1;
        public static final int IntValue = 2;
        public static final int DoubleValue = 3;
        public static final int StringValue = 4;
        public static final int BinaryValue = 5;
        public static final int DictionaryValue = 6;
        public static final int ListValue = 7;
    };
    private byte mNullValue;
    private boolean mBoolValue;
    private int mIntValue;
    private double mDoubleValue;
    private String mStringValue;
    private byte[] mBinaryValue;
    private DictionaryValue mDictionaryValue;
    private ListValue mListValue;

    public void setNullValue(byte nullValue) {
        this.mTag = Tag.NullValue;
        this.mNullValue = nullValue;
    }

    public byte getNullValue() {
        assert this.mTag == Tag.NullValue;
        return this.mNullValue;
    }

    public void setBoolValue(boolean boolValue) {
        this.mTag = Tag.BoolValue;
        this.mBoolValue = boolValue;
    }

    public boolean getBoolValue() {
        assert this.mTag == Tag.BoolValue;
        return this.mBoolValue;
    }

    public void setIntValue(int intValue) {
        this.mTag = Tag.IntValue;
        this.mIntValue = intValue;
    }

    public int getIntValue() {
        assert this.mTag == Tag.IntValue;
        return this.mIntValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.mTag = Tag.DoubleValue;
        this.mDoubleValue = doubleValue;
    }

    public double getDoubleValue() {
        assert this.mTag == Tag.DoubleValue;
        return this.mDoubleValue;
    }

    public void setStringValue(String stringValue) {
        this.mTag = Tag.StringValue;
        this.mStringValue = stringValue;
    }

    public String getStringValue() {
        assert this.mTag == Tag.StringValue;
        return this.mStringValue;
    }

    public void setBinaryValue(byte[] binaryValue) {
        this.mTag = Tag.BinaryValue;
        this.mBinaryValue = binaryValue;
    }

    public byte[] getBinaryValue() {
        assert this.mTag == Tag.BinaryValue;
        return this.mBinaryValue;
    }

    public void setDictionaryValue(DictionaryValue dictionaryValue) {
        this.mTag = Tag.DictionaryValue;
        this.mDictionaryValue = dictionaryValue;
    }

    public DictionaryValue getDictionaryValue() {
        assert this.mTag == Tag.DictionaryValue;
        return this.mDictionaryValue;
    }

    public void setListValue(ListValue listValue) {
        this.mTag = Tag.ListValue;
        this.mListValue = listValue;
    }

    public ListValue getListValue() {
        assert this.mTag == Tag.ListValue;
        return this.mListValue;
    }


    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder0, int offset) {
        encoder0.encode(org.chromium.mojo.bindings.BindingsHelper.UNION_SIZE, offset);
        encoder0.encode(this.mTag, offset + 4);
        switch (mTag) {
            case Tag.NullValue: {
                
                encoder0.encode(this.mNullValue, offset + 8);
                break;
            }
            case Tag.BoolValue: {
                
                encoder0.encode(this.mBoolValue, offset + 8, 0);
                break;
            }
            case Tag.IntValue: {
                
                encoder0.encode(this.mIntValue, offset + 8);
                break;
            }
            case Tag.DoubleValue: {
                
                encoder0.encode(this.mDoubleValue, offset + 8);
                break;
            }
            case Tag.StringValue: {
                
                encoder0.encode(this.mStringValue, offset + 8, false);
                break;
            }
            case Tag.BinaryValue: {
                
                encoder0.encode(this.mBinaryValue, offset + 8, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                break;
            }
            case Tag.DictionaryValue: {
                
                encoder0.encode(this.mDictionaryValue, offset + 8, false);
                break;
            }
            case Tag.ListValue: {
                
                encoder0.encode(this.mListValue, offset + 8, false);
                break;
            }
            default: {
                break;
            }
        }
    }

    public static Value deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message).decoderForSerializedUnion(), 0);
    }

    public static final Value decode(org.chromium.mojo.bindings.Decoder decoder0, int offset) {
        org.chromium.mojo.bindings.DataHeader dataHeader = decoder0.readDataHeaderForUnion(offset);
        if (dataHeader.size == 0) {
            return null;
        }
        Value result = new Value();
        switch (dataHeader.elementsOrVersion) {
            case Tag.NullValue: {
                
                result.mNullValue = decoder0.readByte(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                result.mTag = Tag.NullValue;
                break;
            }
            case Tag.BoolValue: {
                
                result.mBoolValue = decoder0.readBoolean(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, 0);
                result.mTag = Tag.BoolValue;
                break;
            }
            case Tag.IntValue: {
                
                result.mIntValue = decoder0.readInt(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                result.mTag = Tag.IntValue;
                break;
            }
            case Tag.DoubleValue: {
                
                result.mDoubleValue = decoder0.readDouble(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE);
                result.mTag = Tag.DoubleValue;
                break;
            }
            case Tag.StringValue: {
                
                result.mStringValue = decoder0.readString(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mTag = Tag.StringValue;
                break;
            }
            case Tag.BinaryValue: {
                
                result.mBinaryValue = decoder0.readBytes(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, org.chromium.mojo.bindings.BindingsHelper.UNSPECIFIED_ARRAY_LENGTH);
                result.mTag = Tag.BinaryValue;
                break;
            }
            case Tag.DictionaryValue: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mDictionaryValue = DictionaryValue.decode(decoder1);
                result.mTag = Tag.DictionaryValue;
                break;
            }
            case Tag.ListValue: {
                
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(offset + org.chromium.mojo.bindings.DataHeader.HEADER_SIZE, false);
                result.mListValue = ListValue.decode(decoder1);
                result.mTag = Tag.ListValue;
                break;
            }
            default: {
                break;
            }
        }
        return result;
    }
}