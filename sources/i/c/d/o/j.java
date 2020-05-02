package i.c.d.o;

import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final /* synthetic */ class j implements Executor {
    public static final Executor e = new j();

    public final void execute(Runnable runnable) {
        runnable.run();
    }
}
