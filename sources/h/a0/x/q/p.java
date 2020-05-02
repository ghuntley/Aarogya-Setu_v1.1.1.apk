package h.a0.x.q;

import h.a0.c;
import h.a0.e;
import h.a0.l;
import h.a0.t;

/* compiled from: WorkSpec */
public final class p {
    public static final String r = l.a("WorkSpec");
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public t f1060b = t.ENQUEUED;
    public String c;
    public String d;
    public e e;

    /* renamed from: f  reason: collision with root package name */
    public e f1061f;

    /* renamed from: g  reason: collision with root package name */
    public long f1062g;

    /* renamed from: h  reason: collision with root package name */
    public long f1063h;

    /* renamed from: i  reason: collision with root package name */
    public long f1064i;

    /* renamed from: j  reason: collision with root package name */
    public c f1065j;

    /* renamed from: k  reason: collision with root package name */
    public int f1066k;

    /* renamed from: l  reason: collision with root package name */
    public h.a0.a f1067l;

    /* renamed from: m  reason: collision with root package name */
    public long f1068m;

    /* renamed from: n  reason: collision with root package name */
    public long f1069n;

    /* renamed from: o  reason: collision with root package name */
    public long f1070o;

    /* renamed from: p  reason: collision with root package name */
    public long f1071p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1072q;

    /* compiled from: WorkSpec */
    public static class a {
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public t f1073b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f1073b != aVar.f1073b) {
                return false;
            }
            return this.a.equals(aVar.a);
        }

        public int hashCode() {
            return this.f1073b.hashCode() + (this.a.hashCode() * 31);
        }
    }

    public p(String str, String str2) {
        e eVar = e.c;
        this.e = eVar;
        this.f1061f = eVar;
        this.f1065j = c.f901i;
        this.f1067l = h.a0.a.EXPONENTIAL;
        this.f1068m = 30000;
        this.f1071p = -1;
        this.a = str;
        this.c = str2;
    }

    public long a() {
        long j2;
        long j3;
        long j4;
        boolean z = false;
        if (c()) {
            if (this.f1067l == h.a0.a.LINEAR) {
                z = true;
            }
            if (z) {
                j4 = this.f1068m * ((long) this.f1066k);
            } else {
                j4 = (long) Math.scalb((float) this.f1068m, this.f1066k - 1);
            }
            j3 = this.f1069n;
            j2 = Math.min(18000000, j4);
        } else {
            long j5 = 0;
            if (d()) {
                long currentTimeMillis = System.currentTimeMillis();
                long j6 = this.f1069n;
                if (j6 == 0) {
                    j6 = this.f1062g + currentTimeMillis;
                }
                if (this.f1064i != this.f1063h) {
                    z = true;
                }
                if (z) {
                    if (this.f1069n == 0) {
                        j5 = this.f1064i * -1;
                    }
                    return j6 + this.f1063h + j5;
                }
                if (this.f1069n != 0) {
                    j5 = this.f1063h;
                }
                return j6 + j5;
            }
            j2 = this.f1069n;
            if (j2 == 0) {
                j2 = System.currentTimeMillis();
            }
            j3 = this.f1062g;
        }
        return j2 + j3;
    }

    public boolean b() {
        return !c.f901i.equals(this.f1065j);
    }

    public boolean c() {
        return this.f1060b == t.ENQUEUED && this.f1066k > 0;
    }

    public boolean d() {
        return this.f1063h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (this.f1062g != pVar.f1062g || this.f1063h != pVar.f1063h || this.f1064i != pVar.f1064i || this.f1066k != pVar.f1066k || this.f1068m != pVar.f1068m || this.f1069n != pVar.f1069n || this.f1070o != pVar.f1070o || this.f1071p != pVar.f1071p || this.f1072q != pVar.f1072q || !this.a.equals(pVar.a) || this.f1060b != pVar.f1060b || !this.c.equals(pVar.c)) {
            return false;
        }
        String str = this.d;
        if (str == null ? pVar.d != null : !str.equals(pVar.d)) {
            return false;
        }
        if (this.e.equals(pVar.e) && this.f1061f.equals(pVar.f1061f) && this.f1065j.equals(pVar.f1065j) && this.f1067l == pVar.f1067l) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.f1060b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        String str = this.d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.f1061f.hashCode();
        long j2 = this.f1062g;
        long j3 = this.f1063h;
        long j4 = this.f1064i;
        int hashCode5 = this.f1065j.hashCode();
        int hashCode6 = this.f1067l.hashCode();
        long j5 = this.f1068m;
        long j6 = this.f1069n;
        long j7 = this.f1070o;
        long j8 = this.f1071p;
        return ((((((((((hashCode6 + ((((hashCode5 + ((((((((hashCode4 + ((hashCode3 + ((hashCode + hashCode2) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31)) * 31) + this.f1066k) * 31)) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + ((int) (j8 ^ (j8 >>> 32)))) * 31) + (this.f1072q ? 1 : 0);
    }

    public String toString() {
        return i.a.a.a.a.a(i.a.a.a.a.a("{WorkSpec: "), this.a, "}");
    }

    public p(p pVar) {
        e eVar = e.c;
        this.e = eVar;
        this.f1061f = eVar;
        this.f1065j = c.f901i;
        this.f1067l = h.a0.a.EXPONENTIAL;
        this.f1068m = 30000;
        this.f1071p = -1;
        this.a = pVar.a;
        this.c = pVar.c;
        this.f1060b = pVar.f1060b;
        this.d = pVar.d;
        this.e = new e(pVar.e);
        this.f1061f = new e(pVar.f1061f);
        this.f1062g = pVar.f1062g;
        this.f1063h = pVar.f1063h;
        this.f1064i = pVar.f1064i;
        this.f1065j = new c(pVar.f1065j);
        this.f1066k = pVar.f1066k;
        this.f1067l = pVar.f1067l;
        this.f1068m = pVar.f1068m;
        this.f1069n = pVar.f1069n;
        this.f1070o = pVar.f1070o;
        this.f1071p = pVar.f1071p;
        this.f1072q = pVar.f1072q;
    }
}
