package com.google.protobuf;

import java.io.IOException;

public class InvalidProtocolBufferException extends IOException {
    public InvalidProtocolBufferException(String str) {
        super(str);
    }

    public static InvalidProtocolBufferException a() {
        return new InvalidProtocolBufferException("Protocol message tag had invalid wire type.");
    }

    public static InvalidProtocolBufferException b() {
        return new InvalidProtocolBufferException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static InvalidProtocolBufferException c() {
        return new InvalidProtocolBufferException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
