package i.b.a.r;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import i.b.a.e;
import i.b.a.n.m.l;
import i.b.a.n.m.v;
import i.b.a.r.h.h;
import i.b.a.r.i.c;
import i.b.a.t.f;
import i.b.a.t.j;
import i.b.a.t.k.d;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: SingleRequest */
public final class g<R> implements b, i.b.a.r.h.g, f {
    public static final boolean D = Log.isLoggable("Request", 2);
    public int A;
    public boolean B;
    public RuntimeException C;
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final d f2832b;
    public final Object c;
    public final d<R> d;
    public final c e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f2833f;

    /* renamed from: g  reason: collision with root package name */
    public final e f2834g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f2835h;

    /* renamed from: i  reason: collision with root package name */
    public final Class<R> f2836i;

    /* renamed from: j  reason: collision with root package name */
    public final a<?> f2837j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2838k;

    /* renamed from: l  reason: collision with root package name */
    public final int f2839l;

    /* renamed from: m  reason: collision with root package name */
    public final i.b.a.g f2840m;

    /* renamed from: n  reason: collision with root package name */
    public final h<R> f2841n;

    /* renamed from: o  reason: collision with root package name */
    public final List<d<R>> f2842o;

    /* renamed from: p  reason: collision with root package name */
    public final c<? super R> f2843p;

    /* renamed from: q  reason: collision with root package name */
    public final Executor f2844q;
    public v<R> r;
    public l.d s;
    public long t;
    public volatile l u;
    public a v;
    public Drawable w;
    public Drawable x;
    public Drawable y;
    public int z;

    /* compiled from: SingleRequest */
    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public g(Context context, e eVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i2, int i3, i.b.a.g gVar, h<R> hVar, d<R> dVar, List<d<R>> list, c cVar, l lVar, c<? super R> cVar2, Executor executor) {
        e eVar2 = eVar;
        this.a = D ? String.valueOf(super.hashCode()) : null;
        this.f2832b = new d.b();
        this.c = obj;
        this.f2833f = context;
        this.f2834g = eVar2;
        this.f2835h = obj2;
        this.f2836i = cls;
        this.f2837j = aVar;
        this.f2838k = i2;
        this.f2839l = i3;
        this.f2840m = gVar;
        this.f2841n = hVar;
        this.d = dVar;
        this.f2842o = list;
        this.e = cVar;
        this.u = lVar;
        this.f2843p = cVar2;
        this.f2844q = executor;
        this.v = a.PENDING;
        if (this.C == null && eVar2.f2412h) {
            this.C = new RuntimeException("Glide request origin trace");
        }
    }

    public void a() {
        synchronized (this.c) {
            if (isRunning()) {
                clear();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00b0, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            r4.e()     // Catch:{ all -> 0x00b9 }
            i.b.a.t.k.d r1 = r4.f2832b     // Catch:{ all -> 0x00b9 }
            r1.a()     // Catch:{ all -> 0x00b9 }
            long r1 = i.b.a.t.f.a()     // Catch:{ all -> 0x00b9 }
            r4.t = r1     // Catch:{ all -> 0x00b9 }
            java.lang.Object r1 = r4.f2835h     // Catch:{ all -> 0x00b9 }
            if (r1 != 0) goto L_0x003c
            int r1 = r4.f2838k     // Catch:{ all -> 0x00b9 }
            int r2 = r4.f2839l     // Catch:{ all -> 0x00b9 }
            boolean r1 = i.b.a.t.j.a((int) r1, (int) r2)     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x0027
            int r1 = r4.f2838k     // Catch:{ all -> 0x00b9 }
            r4.z = r1     // Catch:{ all -> 0x00b9 }
            int r1 = r4.f2839l     // Catch:{ all -> 0x00b9 }
            r4.A = r1     // Catch:{ all -> 0x00b9 }
        L_0x0027:
            android.graphics.drawable.Drawable r1 = r4.f()     // Catch:{ all -> 0x00b9 }
            if (r1 != 0) goto L_0x002f
            r1 = 5
            goto L_0x0030
        L_0x002f:
            r1 = 3
        L_0x0030:
            com.bumptech.glide.load.engine.GlideException r2 = new com.bumptech.glide.load.engine.GlideException     // Catch:{ all -> 0x00b9 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x00b9 }
            r4.a((com.bumptech.glide.load.engine.GlideException) r2, (int) r1)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            return
        L_0x003c:
            i.b.a.r.g$a r1 = r4.v     // Catch:{ all -> 0x00b9 }
            i.b.a.r.g$a r2 = i.b.a.r.g.a.RUNNING     // Catch:{ all -> 0x00b9 }
            if (r1 == r2) goto L_0x00b1
            i.b.a.r.g$a r1 = r4.v     // Catch:{ all -> 0x00b9 }
            i.b.a.r.g$a r2 = i.b.a.r.g.a.COMPLETE     // Catch:{ all -> 0x00b9 }
            if (r1 != r2) goto L_0x0051
            i.b.a.n.m.v<R> r1 = r4.r     // Catch:{ all -> 0x00b9 }
            i.b.a.n.a r2 = i.b.a.n.a.MEMORY_CACHE     // Catch:{ all -> 0x00b9 }
            r4.a((i.b.a.n.m.v<?>) r1, (i.b.a.n.a) r2)     // Catch:{ all -> 0x00b9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            return
        L_0x0051:
            i.b.a.r.g$a r1 = i.b.a.r.g.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00b9 }
            r4.v = r1     // Catch:{ all -> 0x00b9 }
            int r1 = r4.f2838k     // Catch:{ all -> 0x00b9 }
            int r2 = r4.f2839l     // Catch:{ all -> 0x00b9 }
            boolean r1 = i.b.a.t.j.a((int) r1, (int) r2)     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x0067
            int r1 = r4.f2838k     // Catch:{ all -> 0x00b9 }
            int r2 = r4.f2839l     // Catch:{ all -> 0x00b9 }
            r4.a((int) r1, (int) r2)     // Catch:{ all -> 0x00b9 }
            goto L_0x006c
        L_0x0067:
            i.b.a.r.h.h<R> r1 = r4.f2841n     // Catch:{ all -> 0x00b9 }
            r1.b((i.b.a.r.h.g) r4)     // Catch:{ all -> 0x00b9 }
        L_0x006c:
            i.b.a.r.g$a r1 = r4.v     // Catch:{ all -> 0x00b9 }
            i.b.a.r.g$a r2 = i.b.a.r.g.a.RUNNING     // Catch:{ all -> 0x00b9 }
            if (r1 == r2) goto L_0x0078
            i.b.a.r.g$a r1 = r4.v     // Catch:{ all -> 0x00b9 }
            i.b.a.r.g$a r2 = i.b.a.r.g.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x00b9 }
            if (r1 != r2) goto L_0x0091
        L_0x0078:
            i.b.a.r.c r1 = r4.e     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x0085
            boolean r1 = r1.d(r4)     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r1 = 0
            goto L_0x0086
        L_0x0085:
            r1 = 1
        L_0x0086:
            if (r1 == 0) goto L_0x0091
            i.b.a.r.h.h<R> r1 = r4.f2841n     // Catch:{ all -> 0x00b9 }
            android.graphics.drawable.Drawable r2 = r4.g()     // Catch:{ all -> 0x00b9 }
            r1.a((android.graphics.drawable.Drawable) r2)     // Catch:{ all -> 0x00b9 }
        L_0x0091:
            boolean r1 = D     // Catch:{ all -> 0x00b9 }
            if (r1 == 0) goto L_0x00af
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r1.<init>()     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x00b9 }
            long r2 = r4.t     // Catch:{ all -> 0x00b9 }
            double r2 = i.b.a.t.f.a(r2)     // Catch:{ all -> 0x00b9 }
            r1.append(r2)     // Catch:{ all -> 0x00b9 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00b9 }
            r4.a((java.lang.String) r1)     // Catch:{ all -> 0x00b9 }
        L_0x00af:
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            return
        L_0x00b1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00b9 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x00b9 }
            throw r1     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.r.g.b():void");
    }

    public boolean c() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.COMPLETE;
        }
        return z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0053, code lost:
        r4.u.a(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            monitor-enter(r0)
            r4.e()     // Catch:{ all -> 0x0059 }
            i.b.a.t.k.d r1 = r4.f2832b     // Catch:{ all -> 0x0059 }
            r1.a()     // Catch:{ all -> 0x0059 }
            i.b.a.r.g$a r1 = r4.v     // Catch:{ all -> 0x0059 }
            i.b.a.r.g$a r2 = i.b.a.r.g.a.CLEARED     // Catch:{ all -> 0x0059 }
            if (r1 != r2) goto L_0x0013
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            return
        L_0x0013:
            r4.e()     // Catch:{ all -> 0x0059 }
            i.b.a.t.k.d r1 = r4.f2832b     // Catch:{ all -> 0x0059 }
            r1.a()     // Catch:{ all -> 0x0059 }
            i.b.a.r.h.h<R> r1 = r4.f2841n     // Catch:{ all -> 0x0059 }
            r1.a((i.b.a.r.h.g) r4)     // Catch:{ all -> 0x0059 }
            i.b.a.n.m.l$d r1 = r4.s     // Catch:{ all -> 0x0059 }
            r2 = 0
            if (r1 == 0) goto L_0x002a
            r1.a()     // Catch:{ all -> 0x0059 }
            r4.s = r2     // Catch:{ all -> 0x0059 }
        L_0x002a:
            i.b.a.n.m.v<R> r1 = r4.r     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0033
            i.b.a.n.m.v<R> r1 = r4.r     // Catch:{ all -> 0x0059 }
            r4.r = r2     // Catch:{ all -> 0x0059 }
            r2 = r1
        L_0x0033:
            i.b.a.r.c r1 = r4.e     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x0040
            boolean r1 = r1.e(r4)     // Catch:{ all -> 0x0059 }
            if (r1 == 0) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r1 = 0
            goto L_0x0041
        L_0x0040:
            r1 = 1
        L_0x0041:
            if (r1 == 0) goto L_0x004c
            i.b.a.r.h.h<R> r1 = r4.f2841n     // Catch:{ all -> 0x0059 }
            android.graphics.drawable.Drawable r3 = r4.g()     // Catch:{ all -> 0x0059 }
            r1.c(r3)     // Catch:{ all -> 0x0059 }
        L_0x004c:
            i.b.a.r.g$a r1 = i.b.a.r.g.a.CLEARED     // Catch:{ all -> 0x0059 }
            r4.v = r1     // Catch:{ all -> 0x0059 }
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            if (r2 == 0) goto L_0x0058
            i.b.a.n.m.l r0 = r4.u
            r0.a(r2)
        L_0x0058:
            return
        L_0x0059:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0059 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.r.g.clear():void");
    }

    public boolean d() {
        boolean z2;
        synchronized (this.c) {
            z2 = this.v == a.CLEARED;
        }
        return z2;
    }

    public final void e() {
        if (this.B) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    public final Drawable f() {
        int i2;
        if (this.y == null) {
            a<?> aVar = this.f2837j;
            Drawable drawable = aVar.s;
            this.y = drawable;
            if (drawable == null && (i2 = aVar.t) > 0) {
                this.y = a(i2);
            }
        }
        return this.y;
    }

    public final Drawable g() {
        int i2;
        if (this.x == null) {
            a<?> aVar = this.f2837j;
            Drawable drawable = aVar.f2825k;
            this.x = drawable;
            if (drawable == null && (i2 = aVar.f2826l) > 0) {
                this.x = a(i2);
            }
        }
        return this.x;
    }

    public final boolean h() {
        c cVar = this.e;
        return cVar == null || !cVar.a().b();
    }

    public final void i() {
        int i2;
        c cVar = this.e;
        if (cVar == null || cVar.d(this)) {
            Drawable drawable = null;
            if (this.f2835h == null) {
                drawable = f();
            }
            if (drawable == null) {
                if (this.w == null) {
                    a<?> aVar = this.f2837j;
                    Drawable drawable2 = aVar.f2823i;
                    this.w = drawable2;
                    if (drawable2 == null && (i2 = aVar.f2824j) > 0) {
                        this.w = a(i2);
                    }
                }
                drawable = this.w;
            }
            if (drawable == null) {
                drawable = g();
            }
            this.f2841n.b(drawable);
        }
    }

    public boolean isRunning() {
        boolean z2;
        synchronized (this.c) {
            if (this.v != a.RUNNING) {
                if (this.v != a.WAITING_FOR_SIZE) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        return z2;
    }

    public final Drawable a(int i2) {
        Resources.Theme theme = this.f2837j.y;
        if (theme == null) {
            theme = this.f2833f.getTheme();
        }
        e eVar = this.f2834g;
        return i.b.a.n.o.e.a.a(eVar, eVar, i2, theme);
    }

    public void a(int i2, int i3) {
        Object obj;
        int i4;
        int i5 = i2;
        int i6 = i3;
        this.f2832b.a();
        Object obj2 = this.c;
        synchronized (obj2) {
            try {
                if (D) {
                    a("Got onSizeReady in " + f.a(this.t));
                }
                if (this.v == a.WAITING_FOR_SIZE) {
                    this.v = a.RUNNING;
                    float f2 = this.f2837j.f2820f;
                    if (i5 != Integer.MIN_VALUE) {
                        i5 = Math.round(((float) i5) * f2);
                    }
                    this.z = i5;
                    if (i6 == Integer.MIN_VALUE) {
                        i4 = i6;
                    } else {
                        i4 = Math.round(f2 * ((float) i6));
                    }
                    this.A = i4;
                    if (D) {
                        a("finished setup for calling load in " + f.a(this.t));
                    }
                    obj = obj2;
                    try {
                    } catch (Throwable th) {
                        th = th;
                        while (true) {
                            try {
                                break;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        throw th;
                    }
                    try {
                        this.s = this.u.a(this.f2834g, this.f2835h, this.f2837j.f2830p, this.z, this.A, this.f2837j.w, this.f2836i, this.f2840m, this.f2837j.f2821g, this.f2837j.v, this.f2837j.f2831q, this.f2837j.C, this.f2837j.u, this.f2837j.f2827m, this.f2837j.A, this.f2837j.D, this.f2837j.B, this, this.f2844q);
                        if (this.v != a.RUNNING) {
                            this.s = null;
                        }
                        if (D) {
                            a("finished onSizeReady in " + f.a(this.t));
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            break;
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                obj = obj2;
                while (true) {
                    break;
                }
                throw th;
            }
        }
    }

    public void a(v<?> vVar, i.b.a.n.a aVar) {
        this.f2832b.a();
        v<?> vVar2 = null;
        try {
            synchronized (this.c) {
                try {
                    this.s = null;
                    if (vVar == null) {
                        a(new GlideException("Expected to receive a Resource<R> with an object of " + this.f2836i + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = vVar.get();
                    if (obj != null) {
                        if (this.f2836i.isAssignableFrom(obj.getClass())) {
                            c cVar = this.e;
                            if (!(cVar == null || cVar.a(this))) {
                                try {
                                    this.r = null;
                                    this.v = a.COMPLETE;
                                    this.u.a(vVar);
                                    return;
                                } catch (Throwable th) {
                                    vVar2 = vVar;
                                    th = th;
                                    throw th;
                                }
                            } else {
                                a(vVar, obj, aVar);
                                return;
                            }
                        }
                    }
                    this.r = null;
                    StringBuilder sb = new StringBuilder();
                    sb.append("Expected to receive an object of ");
                    sb.append(this.f2836i);
                    sb.append(" but instead got ");
                    sb.append(obj != null ? obj.getClass() : "");
                    sb.append("{");
                    sb.append(obj);
                    sb.append("} inside Resource{");
                    sb.append(vVar);
                    sb.append("}.");
                    sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    a(new GlideException(sb.toString()), 5);
                    this.u.a(vVar);
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        } catch (Throwable th3) {
            if (vVar2 != null) {
                this.u.a(vVar2);
            }
            throw th3;
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a6 A[Catch:{ all -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(i.b.a.n.m.v<R> r11, R r12, i.b.a.n.a r13) {
        /*
            r10 = this;
            boolean r6 = r10.h()
            i.b.a.r.g$a r0 = i.b.a.r.g.a.COMPLETE
            r10.v = r0
            r10.r = r11
            i.b.a.e r11 = r10.f2834g
            int r11 = r11.f2413i
            r0 = 3
            if (r11 > r0) goto L_0x0064
            java.lang.String r11 = "Finished loading "
            java.lang.StringBuilder r11 = i.a.a.a.a.a(r11)
            java.lang.Class r0 = r12.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r11.append(r0)
            java.lang.String r0 = " from "
            r11.append(r0)
            r11.append(r13)
            java.lang.String r0 = " for "
            r11.append(r0)
            java.lang.Object r0 = r10.f2835h
            r11.append(r0)
            java.lang.String r0 = " with size ["
            r11.append(r0)
            int r0 = r10.z
            r11.append(r0)
            java.lang.String r0 = "x"
            r11.append(r0)
            int r0 = r10.A
            r11.append(r0)
            java.lang.String r0 = "] in "
            r11.append(r0)
            long r0 = r10.t
            double r0 = i.b.a.t.f.a(r0)
            r11.append(r0)
            java.lang.String r0 = " ms"
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "Glide"
            android.util.Log.d(r0, r11)
        L_0x0064:
            r11 = 1
            r10.B = r11
            r7 = 0
            java.util.List<i.b.a.r.d<R>> r0 = r10.f2842o     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x008d
            java.util.List<i.b.a.r.d<R>> r0 = r10.f2842o     // Catch:{ all -> 0x00c0 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x00c0 }
            r0 = 0
            r9 = 0
        L_0x0074:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x008e
            java.lang.Object r0 = r8.next()     // Catch:{ all -> 0x00c0 }
            i.b.a.r.d r0 = (i.b.a.r.d) r0     // Catch:{ all -> 0x00c0 }
            java.lang.Object r2 = r10.f2835h     // Catch:{ all -> 0x00c0 }
            i.b.a.r.h.h<R> r3 = r10.f2841n     // Catch:{ all -> 0x00c0 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r0 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00c0 }
            r9 = r9 | r0
            goto L_0x0074
        L_0x008d:
            r9 = 0
        L_0x008e:
            i.b.a.r.d<R> r0 = r10.d     // Catch:{ all -> 0x00c0 }
            if (r0 == 0) goto L_0x00a2
            i.b.a.r.d<R> r0 = r10.d     // Catch:{ all -> 0x00c0 }
            java.lang.Object r2 = r10.f2835h     // Catch:{ all -> 0x00c0 }
            i.b.a.r.h.h<R> r3 = r10.f2841n     // Catch:{ all -> 0x00c0 }
            r1 = r12
            r4 = r13
            r5 = r6
            boolean r13 = r0.a(r1, r2, r3, r4, r5)     // Catch:{ all -> 0x00c0 }
            if (r13 == 0) goto L_0x00a2
            goto L_0x00a3
        L_0x00a2:
            r11 = 0
        L_0x00a3:
            r11 = r11 | r9
            if (r11 != 0) goto L_0x00b6
            i.b.a.r.i.c<? super R> r11 = r10.f2843p     // Catch:{ all -> 0x00c0 }
            i.b.a.r.i.a$a r11 = (i.b.a.r.i.a.C0099a) r11     // Catch:{ all -> 0x00c0 }
            if (r11 == 0) goto L_0x00b4
            i.b.a.r.i.a<?> r11 = i.b.a.r.i.a.a     // Catch:{ all -> 0x00c0 }
            i.b.a.r.h.h<R> r13 = r10.f2841n     // Catch:{ all -> 0x00c0 }
            r13.a(r12, r11)     // Catch:{ all -> 0x00c0 }
            goto L_0x00b6
        L_0x00b4:
            r11 = 0
            throw r11     // Catch:{ all -> 0x00c0 }
        L_0x00b6:
            r10.B = r7
            i.b.a.r.c r11 = r10.e
            if (r11 == 0) goto L_0x00bf
            r11.c(r10)
        L_0x00bf:
            return
        L_0x00c0:
            r11 = move-exception
            r10.B = r7
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.r.g.a(i.b.a.n.m.v, java.lang.Object, i.b.a.n.a):void");
    }

    /* JADX INFO: finally extract failed */
    public final void a(GlideException glideException, int i2) {
        boolean z2;
        this.f2832b.a();
        synchronized (this.c) {
            if (glideException != null) {
                int i3 = this.f2834g.f2413i;
                if (i3 <= i2) {
                    Log.w("Glide", "Load failed for " + this.f2835h + " with size [" + this.z + "x" + this.A + "]", glideException);
                    if (i3 <= 4) {
                        glideException.a("Glide");
                    }
                }
                this.s = null;
                this.v = a.FAILED;
                boolean z3 = true;
                this.B = true;
                try {
                    if (this.f2842o != null) {
                        z2 = false;
                        for (d<R> a2 : this.f2842o) {
                            z2 |= a2.a(glideException, this.f2835h, this.f2841n, h());
                        }
                    } else {
                        z2 = false;
                    }
                    if (this.d == null || !this.d.a(glideException, this.f2835h, this.f2841n, h())) {
                        z3 = false;
                    }
                    if (!z2 && !z3) {
                        i();
                    }
                    this.B = false;
                    c cVar = this.e;
                    if (cVar != null) {
                        cVar.b(this);
                    }
                } catch (Throwable th) {
                    this.B = false;
                    throw th;
                }
            } else {
                throw null;
            }
        }
    }

    public boolean a(b bVar) {
        int i2;
        int i3;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        i.b.a.g gVar;
        int size;
        int i4;
        int i5;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        i.b.a.g gVar2;
        int size2;
        b bVar2 = bVar;
        if (!(bVar2 instanceof g)) {
            return false;
        }
        synchronized (this.c) {
            i2 = this.f2838k;
            i3 = this.f2839l;
            obj = this.f2835h;
            cls = this.f2836i;
            aVar = this.f2837j;
            gVar = this.f2840m;
            size = this.f2842o != null ? this.f2842o.size() : 0;
        }
        g gVar3 = (g) bVar2;
        synchronized (gVar3.c) {
            i4 = gVar3.f2838k;
            i5 = gVar3.f2839l;
            obj2 = gVar3.f2835h;
            cls2 = gVar3.f2836i;
            aVar2 = gVar3.f2837j;
            gVar2 = gVar3.f2840m;
            size2 = gVar3.f2842o != null ? gVar3.f2842o.size() : 0;
        }
        return i2 == i4 && i3 == i5 && j.a(obj, obj2) && cls.equals(cls2) && aVar.equals(aVar2) && gVar == gVar2 && size == size2;
    }

    public final void a(String str) {
        StringBuilder a2 = i.a.a.a.a.a(str, " this: ");
        a2.append(this.a);
        Log.v("Request", a2.toString());
    }
}
