package i.c.d.k;

import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class r0 implements ThreadFactory {
    public static final ThreadFactory a = new r0();

    public final Thread newThread(Runnable runnable) {
        return s0.a(runnable);
    }
}
