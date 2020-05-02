package kotlinx.coroutines.flow.internal;

import f.a.x;
import java.util.concurrent.CancellationException;

/* compiled from: FlowExceptions.kt */
public final class ChildCancelledException extends CancellationException {
    public ChildCancelledException() {
        super("Child of the scoped flow was cancelled");
    }

    public Throwable fillInStackTrace() {
        if (x.f865b) {
            super.fillInStackTrace();
        }
        return this;
    }
}
