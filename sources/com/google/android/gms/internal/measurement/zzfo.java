package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public class zzfo extends IOException {
    public zzfo(String str) {
        super(str);
    }

    public static zzfo a() {
        return new zzfo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static zzfo b() {
        return new zzfo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static zzfo c() {
        return new zzfo("Protocol message contained an invalid tag (zero).");
    }

    public static zzfn d() {
        return new zzfn("Protocol message tag had invalid wire type.");
    }

    public static zzfo e() {
        return new zzfo("Failed to parse the message.");
    }

    public static zzfo f() {
        return new zzfo("Protocol message had invalid UTF-8.");
    }
}
