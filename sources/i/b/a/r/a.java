package i.b.a.r;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.crashlytics.android.core.CodedOutputStream;
import com.crashlytics.android.core.LogFileManager;
import i.b.a.g;
import i.b.a.n.e;
import i.b.a.n.f;
import i.b.a.n.m.k;
import i.b.a.n.o.c.i;
import i.b.a.n.o.c.j;
import i.b.a.n.o.c.p;
import i.b.a.r.a;
import i.b.a.s.c;
import i.b.a.t.b;
import java.util.Map;

/* compiled from: BaseRequestOptions */
public abstract class a<T extends a<T>> implements Cloneable {
    public boolean A;
    public boolean B;
    public boolean C = true;
    public boolean D;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public float f2820f = 1.0f;

    /* renamed from: g  reason: collision with root package name */
    public k f2821g = k.c;

    /* renamed from: h  reason: collision with root package name */
    public g f2822h = g.NORMAL;

    /* renamed from: i  reason: collision with root package name */
    public Drawable f2823i;

    /* renamed from: j  reason: collision with root package name */
    public int f2824j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f2825k;

    /* renamed from: l  reason: collision with root package name */
    public int f2826l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f2827m = true;

    /* renamed from: n  reason: collision with root package name */
    public int f2828n = -1;

    /* renamed from: o  reason: collision with root package name */
    public int f2829o = -1;

    /* renamed from: p  reason: collision with root package name */
    public e f2830p = c.f2859b;

    /* renamed from: q  reason: collision with root package name */
    public boolean f2831q;
    public boolean r = true;
    public Drawable s;
    public int t;
    public i.b.a.n.g u = new i.b.a.n.g();
    public Map<Class<?>, i.b.a.n.k<?>> v = new b();
    public Class<?> w = Object.class;
    public boolean x;
    public Resources.Theme y;
    public boolean z;

    public static boolean b(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    public T a(k kVar) {
        if (this.z) {
            return clone().a(kVar);
        }
        g.a.a.b.a.a(kVar, "Argument must not be null");
        this.f2821g = kVar;
        this.e |= 4;
        h();
        return this;
    }

    public T b(boolean z2) {
        if (this.z) {
            return clone().b(z2);
        }
        this.D = z2;
        this.e |= 1048576;
        h();
        return this;
    }

    public T c() {
        this.x = true;
        return this;
    }

    public T d() {
        return a(i.b.a.n.o.c.k.c, (i.b.a.n.k<Bitmap>) new i());
    }

    public T e() {
        T a = a(i.b.a.n.o.c.k.f2734b, (i.b.a.n.k<Bitmap>) new j());
        a.C = true;
        return a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Float.compare(aVar.f2820f, this.f2820f) == 0 && this.f2824j == aVar.f2824j && i.b.a.t.j.b(this.f2823i, aVar.f2823i) && this.f2826l == aVar.f2826l && i.b.a.t.j.b(this.f2825k, aVar.f2825k) && this.t == aVar.t && i.b.a.t.j.b(this.s, aVar.s) && this.f2827m == aVar.f2827m && this.f2828n == aVar.f2828n && this.f2829o == aVar.f2829o && this.f2831q == aVar.f2831q && this.r == aVar.r && this.A == aVar.A && this.B == aVar.B && this.f2821g.equals(aVar.f2821g) && this.f2822h == aVar.f2822h && this.u.equals(aVar.u) && this.v.equals(aVar.v) && this.w.equals(aVar.w) && i.b.a.t.j.b(this.f2830p, aVar.f2830p) && i.b.a.t.j.b(this.y, aVar.y)) {
            return true;
        }
        return false;
    }

    public T g() {
        T a = a(i.b.a.n.o.c.k.a, (i.b.a.n.k<Bitmap>) new p());
        a.C = true;
        return a;
    }

    public final T h() {
        if (!this.x) {
            return this;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public int hashCode() {
        return i.b.a.t.j.a((Object) this.y, i.b.a.t.j.a((Object) this.f2830p, i.b.a.t.j.a((Object) this.w, i.b.a.t.j.a((Object) this.v, i.b.a.t.j.a((Object) this.u, i.b.a.t.j.a((Object) this.f2822h, i.b.a.t.j.a((Object) this.f2821g, (((((((((((((i.b.a.t.j.a((Object) this.s, (i.b.a.t.j.a((Object) this.f2825k, (i.b.a.t.j.a((Object) this.f2823i, (i.b.a.t.j.a(this.f2820f) * 31) + this.f2824j) * 31) + this.f2826l) * 31) + this.t) * 31) + (this.f2827m ? 1 : 0)) * 31) + this.f2828n) * 31) + this.f2829o) * 31) + (this.f2831q ? 1 : 0)) * 31) + (this.r ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0))))))));
    }

    public T clone() {
        try {
            T t2 = (a) super.clone();
            i.b.a.n.g gVar = new i.b.a.n.g();
            t2.u = gVar;
            gVar.a(this.u);
            b bVar = new b();
            t2.v = bVar;
            bVar.putAll(this.v);
            t2.x = false;
            t2.z = false;
            return t2;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    public T b() {
        if (!this.x || this.z) {
            this.z = true;
            return c();
        }
        throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
    }

    public T a(g gVar) {
        if (this.z) {
            return clone().a(gVar);
        }
        g.a.a.b.a.a(gVar, "Argument must not be null");
        this.f2822h = gVar;
        this.e |= 8;
        h();
        return this;
    }

    public T a(boolean z2) {
        if (this.z) {
            return clone().a(true);
        }
        this.f2827m = !z2;
        this.e |= 256;
        h();
        return this;
    }

    public T a(int i2, int i3) {
        if (this.z) {
            return clone().a(i2, i3);
        }
        this.f2829o = i2;
        this.f2828n = i3;
        this.e |= 512;
        h();
        return this;
    }

    public T a(e eVar) {
        if (this.z) {
            return clone().a(eVar);
        }
        g.a.a.b.a.a(eVar, "Argument must not be null");
        this.f2830p = eVar;
        this.e |= 1024;
        h();
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [i.b.a.n.f<Y>, java.lang.Object, i.b.a.n.f] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T a(i.b.a.n.f<Y> r2, Y r3) {
        /*
            r1 = this;
            boolean r0 = r1.z
            if (r0 == 0) goto L_0x000d
            i.b.a.r.a r0 = r1.clone()
            i.b.a.r.a r2 = r0.a(r2, r3)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            g.a.a.b.a.a(r2, (java.lang.String) r0)
            g.a.a.b.a.a(r3, (java.lang.String) r0)
            i.b.a.n.g r0 = r1.u
            h.e.a<i.b.a.n.f<?>, java.lang.Object> r0 = r0.f2498b
            r0.put(r2, r3)
            r1.h()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.r.a.a(i.b.a.n.f, java.lang.Object):i.b.a.r.a");
    }

    public T a(Class<?> cls) {
        if (this.z) {
            return clone().a(cls);
        }
        g.a.a.b.a.a(cls, "Argument must not be null");
        this.w = cls;
        this.e |= CodedOutputStream.DEFAULT_BUFFER_SIZE;
        h();
        return this;
    }

    public T a(i.b.a.n.o.c.k kVar) {
        f fVar = i.b.a.n.o.c.k.f2735f;
        g.a.a.b.a.a(kVar, "Argument must not be null");
        return a(fVar, kVar);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [i.b.a.n.k<android.graphics.Bitmap>, i.b.a.n.k] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T a(i.b.a.n.o.c.k r2, i.b.a.n.k<android.graphics.Bitmap> r3) {
        /*
            r1 = this;
            boolean r0 = r1.z
            if (r0 == 0) goto L_0x000d
            i.b.a.r.a r0 = r1.clone()
            i.b.a.r.a r2 = r0.a((i.b.a.n.o.c.k) r2, (i.b.a.n.k<android.graphics.Bitmap>) r3)
            return r2
        L_0x000d:
            r1.a((i.b.a.n.o.c.k) r2)
            r2 = 0
            i.b.a.r.a r2 = r1.a((i.b.a.n.k<android.graphics.Bitmap>) r3, (boolean) r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.r.a.a(i.b.a.n.o.c.k, i.b.a.n.k):i.b.a.r.a");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [i.b.a.n.k<android.graphics.Bitmap>, i.b.a.n.k] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T a(i.b.a.n.k<android.graphics.Bitmap> r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = r2.z
            if (r0 == 0) goto L_0x000d
            i.b.a.r.a r0 = r2.clone()
            i.b.a.r.a r3 = r0.a((i.b.a.n.k<android.graphics.Bitmap>) r3, (boolean) r4)
            return r3
        L_0x000d:
            i.b.a.n.o.c.n r0 = new i.b.a.n.o.c.n
            r0.<init>(r3, r4)
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            r2.a(r1, r3, r4)
            java.lang.Class<android.graphics.drawable.Drawable> r1 = android.graphics.drawable.Drawable.class
            r2.a(r1, r0, r4)
            java.lang.Class<android.graphics.drawable.BitmapDrawable> r1 = android.graphics.drawable.BitmapDrawable.class
            r2.a(r1, r0, r4)
            java.lang.Class<i.b.a.n.o.g.c> r0 = i.b.a.n.o.g.c.class
            i.b.a.n.o.g.f r1 = new i.b.a.n.o.g.f
            r1.<init>(r3)
            r2.a(r0, r1, r4)
            r2.h()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.r.a.a(i.b.a.n.k, boolean):i.b.a.r.a");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Class<Y>, java.lang.Object, java.lang.Class] */
    /* JADX WARNING: type inference failed for: r3v0, types: [i.b.a.n.k<Y>, java.lang.Object, i.b.a.n.k] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Y> T a(java.lang.Class<Y> r2, i.b.a.n.k<Y> r3, boolean r4) {
        /*
            r1 = this;
            boolean r0 = r1.z
            if (r0 == 0) goto L_0x000d
            i.b.a.r.a r0 = r1.clone()
            i.b.a.r.a r2 = r0.a(r2, r3, r4)
            return r2
        L_0x000d:
            java.lang.String r0 = "Argument must not be null"
            g.a.a.b.a.a(r2, (java.lang.String) r0)
            g.a.a.b.a.a(r3, (java.lang.String) r0)
            java.util.Map<java.lang.Class<?>, i.b.a.n.k<?>> r0 = r1.v
            r0.put(r2, r3)
            int r2 = r1.e
            r2 = r2 | 2048(0x800, float:2.87E-42)
            r1.e = r2
            r3 = 1
            r1.r = r3
            r0 = 65536(0x10000, float:9.18355E-41)
            r2 = r2 | r0
            r1.e = r2
            r0 = 0
            r1.C = r0
            if (r4 == 0) goto L_0x0034
            r4 = 131072(0x20000, float:1.83671E-40)
            r2 = r2 | r4
            r1.e = r2
            r1.f2831q = r3
        L_0x0034:
            r1.h()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.r.a.a(java.lang.Class, i.b.a.n.k, boolean):i.b.a.r.a");
    }

    public T a(a<?> aVar) {
        if (this.z) {
            return clone().a(aVar);
        }
        if (b(aVar.e, 2)) {
            this.f2820f = aVar.f2820f;
        }
        if (b(aVar.e, 262144)) {
            this.A = aVar.A;
        }
        if (b(aVar.e, 1048576)) {
            this.D = aVar.D;
        }
        if (b(aVar.e, 4)) {
            this.f2821g = aVar.f2821g;
        }
        if (b(aVar.e, 8)) {
            this.f2822h = aVar.f2822h;
        }
        if (b(aVar.e, 16)) {
            this.f2823i = aVar.f2823i;
            this.f2824j = 0;
            this.e &= -33;
        }
        if (b(aVar.e, 32)) {
            this.f2824j = aVar.f2824j;
            this.f2823i = null;
            this.e &= -17;
        }
        if (b(aVar.e, 64)) {
            this.f2825k = aVar.f2825k;
            this.f2826l = 0;
            this.e &= -129;
        }
        if (b(aVar.e, 128)) {
            this.f2826l = aVar.f2826l;
            this.f2825k = null;
            this.e &= -65;
        }
        if (b(aVar.e, 256)) {
            this.f2827m = aVar.f2827m;
        }
        if (b(aVar.e, 512)) {
            this.f2829o = aVar.f2829o;
            this.f2828n = aVar.f2828n;
        }
        if (b(aVar.e, 1024)) {
            this.f2830p = aVar.f2830p;
        }
        if (b(aVar.e, CodedOutputStream.DEFAULT_BUFFER_SIZE)) {
            this.w = aVar.w;
        }
        if (b(aVar.e, 8192)) {
            this.s = aVar.s;
            this.t = 0;
            this.e &= -16385;
        }
        if (b(aVar.e, 16384)) {
            this.t = aVar.t;
            this.s = null;
            this.e &= -8193;
        }
        if (b(aVar.e, 32768)) {
            this.y = aVar.y;
        }
        if (b(aVar.e, LogFileManager.MAX_LOG_SIZE)) {
            this.r = aVar.r;
        }
        if (b(aVar.e, 131072)) {
            this.f2831q = aVar.f2831q;
        }
        if (b(aVar.e, 2048)) {
            this.v.putAll(aVar.v);
            this.C = aVar.C;
        }
        if (b(aVar.e, 524288)) {
            this.B = aVar.B;
        }
        if (!this.r) {
            this.v.clear();
            int i2 = this.e & -2049;
            this.e = i2;
            this.f2831q = false;
            this.e = i2 & -131073;
            this.C = true;
        }
        this.e |= aVar.e;
        this.u.a(aVar.u);
        h();
        return this;
    }
}
