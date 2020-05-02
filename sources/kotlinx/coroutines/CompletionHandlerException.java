package kotlinx.coroutines;

import n.m.c.f;

/* compiled from: Exceptions.kt */
public final class CompletionHandlerException extends RuntimeException {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CompletionHandlerException(String str, Throwable th) {
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
