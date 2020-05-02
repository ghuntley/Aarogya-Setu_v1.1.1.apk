package h.a0;

import android.os.Build;

/* compiled from: Constraints */
public final class c {

    /* renamed from: i  reason: collision with root package name */
    public static final c f901i = new c(new a());
    public m a = m.NOT_REQUIRED;

    /* renamed from: b  reason: collision with root package name */
    public boolean f902b;
    public boolean c;
    public boolean d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public long f903f = -1;

    /* renamed from: g  reason: collision with root package name */
    public long f904g = -1;

    /* renamed from: h  reason: collision with root package name */
    public d f905h = new d();

    /* compiled from: Constraints */
    public static final class a {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public boolean f906b = false;
        public m c = m.NOT_REQUIRED;
        public boolean d = false;
        public boolean e = false;

        /* renamed from: f  reason: collision with root package name */
        public long f907f = -1;

        /* renamed from: g  reason: collision with root package name */
        public long f908g = -1;

        /* renamed from: h  reason: collision with root package name */
        public d f909h = new d();
    }

    public c() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f902b == cVar.f902b && this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f903f == cVar.f903f && this.f904g == cVar.f904g && this.a == cVar.a) {
            return this.f905h.equals(cVar.f905h);
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f903f;
        long j3 = this.f904g;
        return this.f905h.hashCode() + (((((((((((((this.a.hashCode() * 31) + (this.f902b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31);
    }

    public c(a aVar) {
        this.f902b = aVar.a;
        this.c = Build.VERSION.SDK_INT >= 23 && aVar.f906b;
        this.a = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f905h = aVar.f909h;
            this.f903f = aVar.f907f;
            this.f904g = aVar.f908g;
        }
    }

    public c(c cVar) {
        this.f902b = cVar.f902b;
        this.c = cVar.c;
        this.a = cVar.a;
        this.d = cVar.d;
        this.e = cVar.e;
        this.f905h = cVar.f905h;
    }
}
