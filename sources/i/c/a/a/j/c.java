package i.c.a.a.j;

import android.content.Context;
import i.c.a.a.j.r.d;
import i.c.a.a.j.r.g;
import i.c.a.a.j.r.h.f;
import i.c.a.a.j.r.h.l;
import i.c.a.a.j.r.h.m;
import i.c.a.a.j.r.h.p;
import i.c.a.a.j.r.h.q;
import i.c.a.a.j.r.h.r;
import i.c.a.a.j.r.i.j;
import i.c.a.a.j.r.i.k;
import i.c.a.a.j.t.b;
import i.c.d.p.e;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class c extends n {
    public m.a.a<Executor> e = j.a.a.a(g.a);

    /* renamed from: f  reason: collision with root package name */
    public m.a.a<Context> f2935f;

    /* renamed from: g  reason: collision with root package name */
    public m.a.a f2936g;

    /* renamed from: h  reason: collision with root package name */
    public m.a.a f2937h;

    /* renamed from: i  reason: collision with root package name */
    public m.a.a f2938i;

    /* renamed from: j  reason: collision with root package name */
    public m.a.a<j> f2939j;

    /* renamed from: k  reason: collision with root package name */
    public m.a.a<f> f2940k;

    /* renamed from: l  reason: collision with root package name */
    public m.a.a<r> f2941l;

    /* renamed from: m  reason: collision with root package name */
    public m.a.a<i.c.a.a.j.r.c> f2942m;

    /* renamed from: n  reason: collision with root package name */
    public m.a.a<l> f2943n;

    /* renamed from: o  reason: collision with root package name */
    public m.a.a<p> f2944o;

    /* renamed from: p  reason: collision with root package name */
    public m.a.a<m> f2945p;

    public /* synthetic */ c(Context context, a aVar) {
        Context context2 = context;
        e.a(context2, "instance cannot be null");
        j.a.c cVar = new j.a.c(context2);
        this.f2935f = cVar;
        i.c.a.a.j.p.j jVar = new i.c.a.a.j.p.j(cVar, b.a, i.c.a.a.j.t.c.a);
        this.f2936g = jVar;
        this.f2937h = j.a.a.a(new i.c.a.a.j.p.l(this.f2935f, jVar));
        i.c.a.a.j.r.i.p pVar = new i.c.a.a.j.r.i.p(this.f2935f, i.c.a.a.j.r.i.e.a);
        this.f2938i = pVar;
        this.f2939j = j.a.a.a(new k(b.a, i.c.a.a.j.t.c.a, i.c.a.a.j.r.i.f.a, pVar));
        i.c.a.a.j.r.f fVar = new i.c.a.a.j.r.f(b.a);
        this.f2940k = fVar;
        g gVar = new g(this.f2935f, this.f2939j, fVar, i.c.a.a.j.t.c.a);
        this.f2941l = gVar;
        m.a.a<Executor> aVar2 = this.e;
        m.a.a aVar3 = this.f2937h;
        m.a.a<j> aVar4 = this.f2939j;
        this.f2942m = new d(aVar2, aVar3, gVar, aVar4, aVar4);
        m.a.a<Context> aVar5 = this.f2935f;
        m.a.a aVar6 = this.f2937h;
        m.a.a<j> aVar7 = this.f2939j;
        m.a.a<j> aVar8 = aVar7;
        this.f2943n = new m(aVar5, aVar6, aVar8, this.f2941l, this.e, aVar7, b.a);
        m.a.a<Executor> aVar9 = this.e;
        m.a.a<j> aVar10 = this.f2939j;
        q qVar = new q(aVar9, aVar10, this.f2941l, aVar10);
        this.f2944o = qVar;
        this.f2945p = j.a.a.a(new o(b.a, i.c.a.a.j.t.c.a, this.f2942m, this.f2943n, qVar));
    }
}
