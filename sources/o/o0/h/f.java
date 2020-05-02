package o.o0.h;

import i.a.a.a.a;
import java.util.List;
import javax.annotation.Nullable;
import o.f0;
import o.j0;
import o.o0.g.d;
import o.o0.g.j;
import o.z;

/* compiled from: RealInterceptorChain */
public final class f implements z.a {
    public final List<z> a;

    /* renamed from: b  reason: collision with root package name */
    public final j f5447b;
    @Nullable
    public final d c;
    public final int d;
    public final f0 e;

    /* renamed from: f  reason: collision with root package name */
    public final o.j f5448f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5449g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5450h;

    /* renamed from: i  reason: collision with root package name */
    public final int f5451i;

    /* renamed from: j  reason: collision with root package name */
    public int f5452j;

    public f(List<z> list, j jVar, @Nullable d dVar, int i2, f0 f0Var, o.j jVar2, int i3, int i4, int i5) {
        this.a = list;
        this.f5447b = jVar;
        this.c = dVar;
        this.d = i2;
        this.e = f0Var;
        this.f5448f = jVar2;
        this.f5449g = i3;
        this.f5450h = i4;
        this.f5451i = i5;
    }

    public j0 a(f0 f0Var) {
        return a(f0Var, this.f5447b, this.c);
    }

    public j0 a(f0 f0Var, j jVar, @Nullable d dVar) {
        if (this.d < this.a.size()) {
            this.f5452j++;
            d dVar2 = this.c;
            if (dVar2 == null) {
                f0 f0Var2 = f0Var;
            } else if (!dVar2.a().a(f0Var.a)) {
                StringBuilder a2 = a.a("network interceptor ");
                a2.append(this.a.get(this.d - 1));
                a2.append(" must retain the same host and port");
                throw new IllegalStateException(a2.toString());
            }
            if (this.c == null || this.f5452j <= 1) {
                f fVar = new f(this.a, jVar, dVar, this.d + 1, f0Var, this.f5448f, this.f5449g, this.f5450h, this.f5451i);
                z zVar = this.a.get(this.d);
                j0 a3 = zVar.a(fVar);
                if (dVar != null && this.d + 1 < this.a.size() && fVar.f5452j != 1) {
                    throw new IllegalStateException("network interceptor " + zVar + " must call proceed() exactly once");
                } else if (a3 == null) {
                    throw new NullPointerException("interceptor " + zVar + " returned null");
                } else if (a3.f5330k != null) {
                    return a3;
                } else {
                    throw new IllegalStateException("interceptor " + zVar + " returned a response with no body");
                }
            } else {
                StringBuilder a4 = a.a("network interceptor ");
                a4.append(this.a.get(this.d - 1));
                a4.append(" must call proceed() exactly once");
                throw new IllegalStateException(a4.toString());
            }
        } else {
            throw new AssertionError();
        }
    }
}
