package i.c.d.f;

import i.c.d.i.a;
import i.c.d.i.b;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-components@@16.0.0 */
public final /* synthetic */ class r implements Runnable {
    public final Map.Entry e;

    /* renamed from: f  reason: collision with root package name */
    public final a f4667f;

    public r(Map.Entry entry, a aVar) {
        this.e = entry;
        this.f4667f = aVar;
    }

    public void run() {
        Map.Entry entry = this.e;
        ((b) entry.getKey()).a(this.f4667f);
    }
}
