package com.google.android.gms.common.api;

import i.c.a.b.d.d;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class UnsupportedApiCallException extends UnsupportedOperationException {
    public final d e;

    public UnsupportedApiCallException(d dVar) {
        this.e = dVar;
    }

    public final String getMessage() {
        String valueOf = String.valueOf(this.e);
        StringBuilder sb = new StringBuilder(valueOf.length() + 8);
        sb.append("Missing ");
        sb.append(valueOf);
        return sb.toString();
    }
}
