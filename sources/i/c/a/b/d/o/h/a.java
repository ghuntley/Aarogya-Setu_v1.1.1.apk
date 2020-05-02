package i.c.a.b.d.o.h;

import i.c.a.b.d.l.q;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class a implements ThreadFactory {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final ThreadFactory f3162b = Executors.defaultThreadFactory();

    public a(String str) {
        q.a(str, (Object) "Name must not be null");
        this.a = str;
    }

    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f3162b.newThread(new b(runnable, 0));
        newThread.setName(this.a);
        return newThread;
    }
}
