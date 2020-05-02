package q;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import o.b0;
import o.e0;
import o.f0;
import o.h0;
import o.j;
import o.j0;
import o.k;
import o.l0;
import o.o0.e;
import o.v;
import o.x;
import o.y;
import p.a0;
import p.f;
import p.h;
import p.l;
import p.r;
import q.b0;

/* compiled from: OkHttpCall */
public final class v<T> implements d<T> {
    public final c0 e;

    /* renamed from: f  reason: collision with root package name */
    public final Object[] f5731f;

    /* renamed from: g  reason: collision with root package name */
    public final j.a f5732g;

    /* renamed from: h  reason: collision with root package name */
    public final j<l0, T> f5733h;

    /* renamed from: i  reason: collision with root package name */
    public volatile boolean f5734i;
    @GuardedBy("this")
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public j f5735j;
    @GuardedBy("this")
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public Throwable f5736k;
    @GuardedBy("this")

    /* renamed from: l  reason: collision with root package name */
    public boolean f5737l;

    /* compiled from: OkHttpCall */
    public static final class b extends l0 {

        /* renamed from: f  reason: collision with root package name */
        public final l0 f5739f;

        /* renamed from: g  reason: collision with root package name */
        public final h f5740g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public IOException f5741h;

        /* compiled from: OkHttpCall */
        public class a extends l {
            public a(a0 a0Var) {
                super(a0Var);
            }

            public long b(f fVar, long j2) {
                try {
                    return super.b(fVar, j2);
                } catch (IOException e) {
                    b.this.f5741h = e;
                    throw e;
                }
            }
        }

        public b(l0 l0Var) {
            this.f5739f = l0Var;
            this.f5740g = r.a((a0) new a(l0Var.h()));
        }

        public long a() {
            return this.f5739f.a();
        }

        public void close() {
            this.f5739f.close();
        }

        public o.a0 f() {
            return this.f5739f.f();
        }

        public h h() {
            return this.f5740g;
        }
    }

    /* compiled from: OkHttpCall */
    public static final class c extends l0 {
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        public final o.a0 f5743f;

        /* renamed from: g  reason: collision with root package name */
        public final long f5744g;

        public c(@Nullable o.a0 a0Var, long j2) {
            this.f5743f = a0Var;
            this.f5744g = j2;
        }

        public long a() {
            return this.f5744g;
        }

        public o.a0 f() {
            return this.f5743f;
        }

        public h h() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    public v(c0 c0Var, Object[] objArr, j.a aVar, j<l0, T> jVar) {
        this.e = c0Var;
        this.f5731f = objArr;
        this.f5732g = aVar;
        this.f5733h = jVar;
    }

    public void a(f<T> fVar) {
        j jVar;
        Throwable th;
        Objects.requireNonNull(fVar, "callback == null");
        synchronized (this) {
            if (!this.f5737l) {
                this.f5737l = true;
                jVar = this.f5735j;
                th = this.f5736k;
                if (jVar == null && th == null) {
                    try {
                        j b2 = b();
                        this.f5735j = b2;
                        jVar = b2;
                    } catch (Throwable th2) {
                        th = th2;
                        i0.a(th);
                        this.f5736k = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            fVar.a((d<T>) this, th);
            return;
        }
        if (this.f5734i) {
            ((e0) jVar).f5300f.a();
        }
        ((e0) jVar).a(new a(fVar));
    }

    public final j b() {
        y yVar;
        j.a aVar = this.f5732g;
        c0 c0Var = this.e;
        Object[] objArr = this.f5731f;
        z<?>[] zVarArr = c0Var.f5698j;
        int length = objArr.length;
        if (length == zVarArr.length) {
            b0 b0Var = new b0(c0Var.c, c0Var.f5693b, c0Var.d, c0Var.e, c0Var.f5694f, c0Var.f5695g, c0Var.f5696h, c0Var.f5697i);
            if (c0Var.f5699k) {
                length--;
            }
            ArrayList arrayList = new ArrayList(length);
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(objArr[i2]);
                zVarArr[i2].a(b0Var, objArr[i2]);
            }
            y.a aVar2 = b0Var.d;
            if (aVar2 != null) {
                yVar = aVar2.a();
            } else {
                y.a a2 = b0Var.f5685b.a(b0Var.c);
                yVar = a2 != null ? a2.a() : null;
                if (yVar == null) {
                    StringBuilder a3 = i.a.a.a.a.a("Malformed URL. Base: ");
                    a3.append(b0Var.f5685b);
                    a3.append(", Relative: ");
                    a3.append(b0Var.c);
                    throw new IllegalArgumentException(a3.toString());
                }
            }
            b0.a aVar3 = b0Var.f5691k;
            if (aVar3 == null) {
                v.a aVar4 = b0Var.f5690j;
                if (aVar4 != null) {
                    aVar3 = new o.v(aVar4.a, aVar4.f5620b);
                } else {
                    b0.a aVar5 = b0Var.f5689i;
                    if (aVar5 != null) {
                        if (!aVar5.c.isEmpty()) {
                            aVar3 = new o.b0(aVar5.a, aVar5.f5258b, aVar5.c);
                        } else {
                            throw new IllegalStateException("Multipart body must have at least one part.");
                        }
                    } else if (b0Var.f5688h) {
                        long j2 = (long) 0;
                        e.a(j2, j2, j2);
                        aVar3 = new h0((o.a0) null, 0, new byte[0], 0);
                    }
                }
            }
            o.a0 a0Var = b0Var.f5687g;
            if (a0Var != null) {
                if (aVar3 != null) {
                    aVar3 = new b0.a(aVar3, a0Var);
                } else {
                    b0Var.f5686f.a("Content-Type", a0Var.a);
                }
            }
            f0.a aVar6 = b0Var.e;
            aVar6.a(yVar);
            x.a aVar7 = b0Var.f5686f;
            if (aVar7 != null) {
                List<String> list = aVar7.a;
                x.a aVar8 = new x.a();
                Collections.addAll(aVar8.a, (String[]) list.toArray(new String[list.size()]));
                aVar6.c = aVar8;
                aVar6.a(b0Var.a, aVar3);
                aVar6.a(m.class, new m(c0Var.a, arrayList));
                j a4 = aVar.a(aVar6.a());
                if (a4 != null) {
                    return a4;
                }
                throw new NullPointerException("Call.Factory returned null.");
            }
            throw null;
        }
        throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + zVarArr.length + ")");
    }

    @GuardedBy("this")
    public final j c() {
        j jVar = this.f5735j;
        if (jVar != null) {
            return jVar;
        }
        Throwable th = this.f5736k;
        if (th == null) {
            try {
                j b2 = b();
                this.f5735j = b2;
                return b2;
            } catch (IOException | Error | RuntimeException e2) {
                i0.a(e2);
                this.f5736k = e2;
                throw e2;
            }
        } else if (th instanceof IOException) {
            throw ((IOException) th);
        } else if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else {
            throw ((Error) th);
        }
    }

    public void cancel() {
        j jVar;
        this.f5734i = true;
        synchronized (this) {
            jVar = this.f5735j;
        }
        if (jVar != null) {
            ((e0) jVar).f5300f.a();
        }
    }

    public Object clone() {
        return new v(this.e, this.f5731f, this.f5732g, this.f5733h);
    }

    public d0<T> f() {
        j c2;
        synchronized (this) {
            if (!this.f5737l) {
                this.f5737l = true;
                c2 = c();
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f5734i) {
            ((e0) c2).f5300f.a();
        }
        return a(((e0) c2).f());
    }

    public synchronized f0 m() {
        try {
        } catch (IOException e2) {
            throw new RuntimeException("Unable to create request.", e2);
        }
        return ((e0) c()).f5301g;
    }

    public boolean o() {
        boolean z = true;
        if (this.f5734i) {
            return true;
        }
        synchronized (this) {
            if (this.f5735j == null || !((e0) this.f5735j).f5300f.d()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: clone  reason: collision with other method in class */
    public d m15clone() {
        return new v(this.e, this.f5731f, this.f5732g, this.f5733h);
    }

    /* compiled from: OkHttpCall */
    public class a implements k {
        public final /* synthetic */ f a;

        public a(f fVar) {
            this.a = fVar;
        }

        public void a(j jVar, j0 j0Var) {
            try {
                try {
                    this.a.a(v.this, v.this.a(j0Var));
                } catch (Throwable th) {
                    i0.a(th);
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                i0.a(th2);
                th2.printStackTrace();
            }
        }

        public void a(j jVar, IOException iOException) {
            try {
                this.a.a(v.this, (Throwable) iOException);
            } catch (Throwable th) {
                i0.a(th);
                th.printStackTrace();
            }
        }
    }

    public d0<T> a(j0 j0Var) {
        l0 l0Var = j0Var.f5330k;
        j0.a aVar = new j0.a(j0Var);
        aVar.f5339g = new c(l0Var.f(), l0Var.a());
        j0 a2 = aVar.a();
        int i2 = a2.f5326g;
        if (i2 < 200 || i2 >= 300) {
            try {
                l0 a3 = i0.a(l0Var);
                Objects.requireNonNull(a3, "body == null");
                Objects.requireNonNull(a2, "rawResponse == null");
                if (!a2.f()) {
                    return new d0<>(a2, null, a3);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                l0Var.close();
            }
        } else if (i2 == 204 || i2 == 205) {
            l0Var.close();
            return d0.a(null, a2);
        } else {
            b bVar = new b(l0Var);
            try {
                return d0.a(this.f5733h.a(bVar), a2);
            } catch (RuntimeException e2) {
                IOException iOException = bVar.f5741h;
                if (iOException == null) {
                    throw e2;
                }
                throw iOException;
            }
        }
    }
}
