package h.a0.x.r.o;

import java.util.concurrent.Executor;

/* compiled from: DirectExecutor */
public enum b implements Executor {
    INSTANCE;

    public void execute(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        return "DirectExecutor";
    }
}
