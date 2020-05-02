package l.a.a.a.o.b;

import android.util.Log;
import l.a.a.a.f;

/* compiled from: AdvertisingInfoProvider */
public class c extends h {
    public final /* synthetic */ b e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ d f5059f;

    public c(d dVar, b bVar) {
        this.f5059f = dVar;
        this.e = bVar;
    }

    public void onRun() {
        b b2 = this.f5059f.b();
        if (!this.e.equals(b2)) {
            if (f.a().a("Fabric", 3)) {
                Log.d("Fabric", "Asychronously getting Advertising Info and storing it to preferences", (Throwable) null);
            }
            this.f5059f.b(b2);
        }
    }
}
