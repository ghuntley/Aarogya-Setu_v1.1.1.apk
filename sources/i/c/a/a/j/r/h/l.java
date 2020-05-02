package i.c.a.a.j.r.h;

import android.content.Context;
import i.c.a.a.j.b;
import i.c.a.a.j.h;
import i.c.a.a.j.p.a;
import i.c.a.a.j.p.e;
import i.c.a.a.j.p.f;
import i.c.a.a.j.p.g;
import i.c.a.a.j.p.m;
import i.c.a.a.j.r.i.c;
import i.c.a.a.j.s.a;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public class l {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final e f2984b;
    public final c c;
    public final r d;
    public final Executor e;

    /* renamed from: f  reason: collision with root package name */
    public final a f2985f;

    /* renamed from: g  reason: collision with root package name */
    public final i.c.a.a.j.t.a f2986g;

    public l(Context context, e eVar, c cVar, r rVar, Executor executor, a aVar, i.c.a.a.j.t.a aVar2) {
        this.a = context;
        this.f2984b = eVar;
        this.c = cVar;
        this.d = rVar;
        this.e = executor;
        this.f2985f = aVar;
        this.f2986g = aVar2;
    }

    public void a(h hVar, int i2) {
        g a2;
        m a3 = this.f2984b.a(((b) hVar).a);
        Iterable<i.c.a.a.j.r.i.g> iterable = (Iterable) this.f2985f.a(new h(this, hVar));
        if (iterable.iterator().hasNext()) {
            if (a3 == null) {
                g.a.a.b.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", (Object) hVar);
                a2 = g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                for (i.c.a.a.j.r.i.g gVar : iterable) {
                    arrayList.add(((i.c.a.a.j.r.i.b) gVar).c);
                }
                byte[] bArr = ((b) hVar).f2933b;
                if (1 != 0) {
                    a2 = a3.a((f) new i.c.a.a.j.p.a(arrayList, bArr, (a.C0104a) null));
                } else {
                    throw new IllegalStateException(i.a.a.a.a.b("Missing required properties:", ""));
                }
            }
            this.f2985f.a(new i(this, a2, iterable, hVar, i2));
        }
    }
}
