package o;

import java.io.Closeable;
import javax.annotation.Nullable;
import o.o0.g.d;
import o.x;

/* compiled from: Response */
public final class j0 implements Closeable {
    public final f0 e;

    /* renamed from: f  reason: collision with root package name */
    public final d0 f5325f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5326g;

    /* renamed from: h  reason: collision with root package name */
    public final String f5327h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public final w f5328i;

    /* renamed from: j  reason: collision with root package name */
    public final x f5329j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public final l0 f5330k;
    @Nullable

    /* renamed from: l  reason: collision with root package name */
    public final j0 f5331l;
    @Nullable

    /* renamed from: m  reason: collision with root package name */
    public final j0 f5332m;
    @Nullable

    /* renamed from: n  reason: collision with root package name */
    public final j0 f5333n;

    /* renamed from: o  reason: collision with root package name */
    public final long f5334o;

    /* renamed from: p  reason: collision with root package name */
    public final long f5335p;
    @Nullable

    /* renamed from: q  reason: collision with root package name */
    public final d f5336q;
    @Nullable
    public volatile i r;

    /* compiled from: Response */
    public static class a {
        @Nullable
        public f0 a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public d0 f5337b;
        public int c;
        public String d;
        @Nullable
        public w e;

        /* renamed from: f  reason: collision with root package name */
        public x.a f5338f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public l0 f5339g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public j0 f5340h;
        @Nullable

        /* renamed from: i  reason: collision with root package name */
        public j0 f5341i;
        @Nullable

        /* renamed from: j  reason: collision with root package name */
        public j0 f5342j;

        /* renamed from: k  reason: collision with root package name */
        public long f5343k;

        /* renamed from: l  reason: collision with root package name */
        public long f5344l;
        @Nullable

        /* renamed from: m  reason: collision with root package name */
        public d f5345m;

        public a() {
            this.c = -1;
            this.f5338f = new x.a();
        }

        public a a(x xVar) {
            this.f5338f = xVar.a();
            return this;
        }

        public a a(@Nullable j0 j0Var) {
            if (j0Var != null) {
                a("cacheResponse", j0Var);
            }
            this.f5341i = j0Var;
            return this;
        }

        public a(j0 j0Var) {
            this.c = -1;
            this.a = j0Var.e;
            this.f5337b = j0Var.f5325f;
            this.c = j0Var.f5326g;
            this.d = j0Var.f5327h;
            this.e = j0Var.f5328i;
            this.f5338f = j0Var.f5329j.a();
            this.f5339g = j0Var.f5330k;
            this.f5340h = j0Var.f5331l;
            this.f5341i = j0Var.f5332m;
            this.f5342j = j0Var.f5333n;
            this.f5343k = j0Var.f5334o;
            this.f5344l = j0Var.f5335p;
            this.f5345m = j0Var.f5336q;
        }

        public final void a(String str, j0 j0Var) {
            if (j0Var.f5330k != null) {
                throw new IllegalArgumentException(i.a.a.a.a.b(str, ".body != null"));
            } else if (j0Var.f5331l != null) {
                throw new IllegalArgumentException(i.a.a.a.a.b(str, ".networkResponse != null"));
            } else if (j0Var.f5332m != null) {
                throw new IllegalArgumentException(i.a.a.a.a.b(str, ".cacheResponse != null"));
            } else if (j0Var.f5333n != null) {
                throw new IllegalArgumentException(i.a.a.a.a.b(str, ".priorResponse != null"));
            }
        }

        public j0 a() {
            if (this.a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f5337b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.c < 0) {
                StringBuilder a2 = i.a.a.a.a.a("code < 0: ");
                a2.append(this.c);
                throw new IllegalStateException(a2.toString());
            } else if (this.d != null) {
                return new j0(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }
    }

    public j0(a aVar) {
        this.e = aVar.a;
        this.f5325f = aVar.f5337b;
        this.f5326g = aVar.c;
        this.f5327h = aVar.d;
        this.f5328i = aVar.e;
        x.a aVar2 = aVar.f5338f;
        if (aVar2 != null) {
            this.f5329j = new x(aVar2);
            this.f5330k = aVar.f5339g;
            this.f5331l = aVar.f5340h;
            this.f5332m = aVar.f5341i;
            this.f5333n = aVar.f5342j;
            this.f5334o = aVar.f5343k;
            this.f5335p = aVar.f5344l;
            this.f5336q = aVar.f5345m;
            return;
        }
        throw null;
    }

    public i a() {
        i iVar = this.r;
        if (iVar != null) {
            return iVar;
        }
        i a2 = i.a(this.f5329j);
        this.r = a2;
        return a2;
    }

    public void close() {
        l0 l0Var = this.f5330k;
        if (l0Var != null) {
            l0Var.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public boolean f() {
        int i2 = this.f5326g;
        return i2 >= 200 && i2 < 300;
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("Response{protocol=");
        a2.append(this.f5325f);
        a2.append(", code=");
        a2.append(this.f5326g);
        a2.append(", message=");
        a2.append(this.f5327h);
        a2.append(", url=");
        a2.append(this.e.a);
        a2.append('}');
        return a2.toString();
    }
}
