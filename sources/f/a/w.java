package f.a;

import n.m.c.f;

/* compiled from: Exceptions.common.kt */
public final class w extends Error {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(String str, Throwable th) {
        super(str, th);
        if (str == null) {
            f.a("message");
            throw null;
        } else if (th != null) {
        } else {
            f.a("cause");
            throw null;
        }
    }
}
