package i.b.a.n.m;

import android.util.Log;
import com.bumptech.glide.Registry;
import i.b.a.n.a;
import i.b.a.n.d;
import i.b.a.n.e;
import i.b.a.n.m.g;
import i.b.a.n.n.n;
import i.b.a.t.f;
import java.util.Collections;
import java.util.List;

/* compiled from: SourceGenerator */
public class a0 implements g, g.a {
    public final h<?> e;

    /* renamed from: f  reason: collision with root package name */
    public final g.a f2528f;

    /* renamed from: g  reason: collision with root package name */
    public int f2529g;

    /* renamed from: h  reason: collision with root package name */
    public d f2530h;

    /* renamed from: i  reason: collision with root package name */
    public Object f2531i;

    /* renamed from: j  reason: collision with root package name */
    public volatile n.a<?> f2532j;

    /* renamed from: k  reason: collision with root package name */
    public e f2533k;

    public a0(h<?> hVar, g.a aVar) {
        this.e = hVar;
        this.f2528f = aVar;
    }

    /* JADX INFO: finally extract failed */
    public boolean a() {
        Object obj = this.f2531i;
        if (obj != null) {
            this.f2531i = null;
            long a = f.a();
            try {
                d<?> a2 = this.e.c.f2409b.f443b.a(obj.getClass());
                if (a2 != null) {
                    f fVar = new f(a2, obj, this.e.f2581i);
                    this.f2533k = new e(this.f2532j.a, this.e.f2586n);
                    this.e.b().a(this.f2533k, fVar);
                    if (Log.isLoggable("SourceGenerator", 2)) {
                        Log.v("SourceGenerator", "Finished encoding source to cache, key: " + this.f2533k + ", data: " + obj + ", encoder: " + a2 + ", duration: " + f.a(a));
                    }
                    this.f2532j.c.b();
                    this.f2530h = new d(Collections.singletonList(this.f2532j.a), this.e, this);
                } else {
                    throw new Registry.NoSourceEncoderAvailableException(obj.getClass());
                }
            } catch (Throwable th) {
                this.f2532j.c.b();
                throw th;
            }
        }
        d dVar = this.f2530h;
        if (dVar != null && dVar.a()) {
            return true;
        }
        this.f2530h = null;
        this.f2532j = null;
        boolean z = false;
        while (!z) {
            if (!(this.f2529g < this.e.c().size())) {
                break;
            }
            List<n.a<?>> c = this.e.c();
            int i2 = this.f2529g;
            this.f2529g = i2 + 1;
            this.f2532j = c.get(i2);
            if (this.f2532j != null && (this.e.f2588p.a(this.f2532j.c.c()) || this.e.c(this.f2532j.c.a()))) {
                this.f2532j.c.a(this.e.f2587o, new z(this, this.f2532j));
                z = true;
            }
        }
        return z;
    }

    public void cancel() {
        n.a<?> aVar = this.f2532j;
        if (aVar != null) {
            aVar.c.cancel();
        }
    }

    public void f() {
        throw new UnsupportedOperationException();
    }

    public void a(e eVar, Object obj, i.b.a.n.l.d<?> dVar, a aVar, e eVar2) {
        this.f2528f.a(eVar, obj, dVar, this.f2532j.c.c(), eVar);
    }

    public void a(e eVar, Exception exc, i.b.a.n.l.d<?> dVar, a aVar) {
        this.f2528f.a(eVar, exc, dVar, this.f2532j.c.c());
    }
}
