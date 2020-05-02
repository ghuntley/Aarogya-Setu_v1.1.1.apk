package i.c.a.b.d;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class d0 extends b0 {
    public final Callable<String> e;

    public /* synthetic */ d0(Callable callable, e0 e0Var) {
        super(false, (String) null, (Throwable) null);
        this.e = callable;
    }

    public final String a() {
        try {
            return this.e.call();
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
