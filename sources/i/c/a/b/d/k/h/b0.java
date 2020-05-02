package i.c.a.b.d.k.h;

import android.util.Log;
import i.c.a.b.d.b;
import i.c.a.b.d.k.h.g;
import i.c.a.b.d.l.l;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class b0 implements Runnable {
    public final /* synthetic */ b e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ g.b f3034f;

    public b0(g.b bVar, b bVar2) {
        this.f3034f = bVar;
        this.e = bVar2;
    }

    public final void run() {
        l lVar;
        g.b bVar = this.f3034f;
        g.a aVar = g.this.f3049i.get(bVar.f3063b);
        if (aVar != null) {
            if (this.e.d()) {
                g.b bVar2 = this.f3034f;
                bVar2.e = true;
                if (bVar2.a.h()) {
                    g.b bVar3 = this.f3034f;
                    if (bVar3.e && (lVar = bVar3.c) != null) {
                        bVar3.a.a(lVar, bVar3.d);
                        return;
                    }
                    return;
                }
                try {
                    this.f3034f.a.a((l) null, this.f3034f.a.e());
                } catch (SecurityException e2) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e2);
                    aVar.a(new b(10));
                }
            } else {
                aVar.a(this.e);
            }
        }
    }
}
