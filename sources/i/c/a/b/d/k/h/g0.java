package i.c.a.b.d.k.h;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.gms.common.api.Scope;
import i.c.a.b.d.b;
import i.c.a.b.d.k.a;
import i.c.a.b.d.k.c;
import i.c.a.b.d.k.h.g;
import i.c.a.b.d.l.q;
import i.c.a.b.j.b.e;
import i.c.a.b.j.b.l;
import i.c.a.b.j.d;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class g0 extends e implements c.a, c.b {

    /* renamed from: h  reason: collision with root package name */
    public static a.C0108a<? extends i.c.a.b.j.e, i.c.a.b.j.a> f3066h = d.c;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f3067b;
    public final a.C0108a<? extends i.c.a.b.j.e, i.c.a.b.j.a> c;
    public Set<Scope> d;
    public i.c.a.b.d.l.d e;

    /* renamed from: f  reason: collision with root package name */
    public i.c.a.b.j.e f3068f;

    /* renamed from: g  reason: collision with root package name */
    public h0 f3069g;

    public g0(Context context, Handler handler, i.c.a.b.d.l.d dVar) {
        a.C0108a<? extends i.c.a.b.j.e, i.c.a.b.j.a> aVar = f3066h;
        this.a = context;
        this.f3067b = handler;
        q.a(dVar, (Object) "ClientSettings must not be null");
        this.e = dVar;
        this.d = dVar.f3109b;
        this.c = aVar;
    }

    public final void a(int i2) {
        this.f3068f.f();
    }

    public final void b(Bundle bundle) {
        this.f3068f.a(this);
    }

    public final void a(b bVar) {
        ((g.b) this.f3069g).b(bVar);
    }

    public final void a(l lVar) {
        this.f3067b.post(new i0(this, lVar));
    }
}
