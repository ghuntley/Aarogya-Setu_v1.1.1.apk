package kotlinx.coroutines;

import f.a.p0;
import f.a.q;
import f.a.x;
import java.util.concurrent.CancellationException;
import n.m.c.f;

/* compiled from: Exceptions.kt */
public final class JobCancellationException extends CancellationException implements q<JobCancellationException> {
    public final p0 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JobCancellationException(String str, Throwable th, p0 p0Var) {
        super(str);
        if (str == null) {
            f.a("message");
            throw null;
        } else if (p0Var != null) {
            this.e = p0Var;
            if (th != null) {
                initCause(th);
            }
        } else {
            f.a("job");
            throw null;
        }
    }

    public Throwable a() {
        if (!x.f865b) {
            return null;
        }
        String message = getMessage();
        if (message != null) {
            return new JobCancellationException(message, this, this.e);
        }
        f.a();
        throw null;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof JobCancellationException) {
                JobCancellationException jobCancellationException = (JobCancellationException) obj;
                if (!f.a((Object) jobCancellationException.getMessage(), (Object) getMessage()) || !f.a((Object) jobCancellationException.e, (Object) this.e) || !f.a((Object) jobCancellationException.getCause(), (Object) getCause())) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public Throwable fillInStackTrace() {
        if (!x.f865b) {
            return this;
        }
        Throwable fillInStackTrace = super.fillInStackTrace();
        f.a((Object) fillInStackTrace, "super.fillInStackTrace()");
        return fillInStackTrace;
    }

    public int hashCode() {
        String message = getMessage();
        if (message != null) {
            int hashCode = (this.e.hashCode() + (message.hashCode() * 31)) * 31;
            Throwable cause = getCause();
            return hashCode + (cause != null ? cause.hashCode() : 0);
        }
        f.a();
        throw null;
    }

    public String toString() {
        return super.toString() + "; job=" + this.e;
    }
}
