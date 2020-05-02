package i.c.d.q;

import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final /* synthetic */ class i implements Callable {
    public final k e;

    public i(k kVar) {
        this.e = kVar;
    }

    public Object call() {
        return this.e.a("firebase");
    }
}
