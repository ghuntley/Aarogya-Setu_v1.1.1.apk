package kotlinx.coroutines.flow.internal;

import f.a.x;
import java.util.concurrent.CancellationException;

/* compiled from: FlowExceptions.kt */
public final class AbortFlowException extends CancellationException {
    public AbortFlowException() {
        super("Flow was aborted, no more elements needed");
    }

    public Throwable fillInStackTrace() {
        if (x.f865b) {
            super.fillInStackTrace();
        }
        return this;
    }
}
