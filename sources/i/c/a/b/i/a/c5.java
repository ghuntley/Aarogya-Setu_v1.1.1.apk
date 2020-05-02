package i.c.a.b.i.a;

import android.text.TextUtils;
import i.c.a.b.d.l.q;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class c5 {
    public long A;
    public long B;
    public long C;
    public String D;
    public boolean E;
    public long F;
    public long G;
    public final s5 a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3607b;
    public String c;
    public String d;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public String f3608f;

    /* renamed from: g  reason: collision with root package name */
    public long f3609g;

    /* renamed from: h  reason: collision with root package name */
    public long f3610h;

    /* renamed from: i  reason: collision with root package name */
    public long f3611i;

    /* renamed from: j  reason: collision with root package name */
    public String f3612j;

    /* renamed from: k  reason: collision with root package name */
    public long f3613k;

    /* renamed from: l  reason: collision with root package name */
    public String f3614l;

    /* renamed from: m  reason: collision with root package name */
    public long f3615m;

    /* renamed from: n  reason: collision with root package name */
    public long f3616n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3617o;

    /* renamed from: p  reason: collision with root package name */
    public long f3618p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f3619q;
    public boolean r;
    public String s;
    public Boolean t;
    public long u;
    public List<String> v;
    public String w;
    public long x;
    public long y;
    public long z;

    public c5(s5 s5Var, String str) {
        q.a(s5Var);
        q.b(str);
        this.a = s5Var;
        this.f3607b = str;
        s5Var.k().c();
    }

    public final void a(String str) {
        this.a.k().c();
        this.E |= !ca.c(this.c, str);
        this.c = str;
    }

    public final void b(String str) {
        this.a.k().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !ca.c(this.d, str);
        this.d = str;
    }

    public final void c(String str) {
        this.a.k().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !ca.c(this.s, str);
        this.s = str;
    }

    public final void d(String str) {
        this.a.k().c();
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        this.E |= !ca.c(this.w, str);
        this.w = str;
    }

    public final void e(String str) {
        this.a.k().c();
        this.E |= !ca.c(this.e, str);
        this.e = str;
    }

    public final void f(String str) {
        this.a.k().c();
        this.E |= !ca.c(this.f3608f, str);
        this.f3608f = str;
    }

    public final String g() {
        this.a.k().c();
        return this.f3607b;
    }

    public final String h() {
        this.a.k().c();
        return this.c;
    }

    public final String i() {
        this.a.k().c();
        return this.d;
    }

    public final String j() {
        this.a.k().c();
        return this.s;
    }

    public final String k() {
        this.a.k().c();
        return this.w;
    }

    public final String l() {
        this.a.k().c();
        return this.e;
    }

    public final String m() {
        this.a.k().c();
        return this.f3608f;
    }

    public final long n() {
        this.a.k().c();
        return this.f3610h;
    }

    public final long o() {
        this.a.k().c();
        return this.f3611i;
    }

    public final String p() {
        this.a.k().c();
        return this.f3612j;
    }

    public final long q() {
        this.a.k().c();
        return this.f3613k;
    }

    public final String r() {
        this.a.k().c();
        return this.f3614l;
    }

    public final long s() {
        this.a.k().c();
        return this.f3615m;
    }

    public final long t() {
        this.a.k().c();
        return this.f3616n;
    }

    public final long u() {
        this.a.k().c();
        return this.u;
    }

    public final boolean v() {
        this.a.k().c();
        return this.f3617o;
    }

    public final long w() {
        this.a.k().c();
        return this.f3609g;
    }

    public final long x() {
        this.a.k().c();
        return this.F;
    }

    public final long y() {
        this.a.k().c();
        return this.G;
    }

    public final void z() {
        this.a.k().c();
        long j2 = this.f3609g + 1;
        if (j2 > 2147483647L) {
            this.a.n().f3761i.a("Bundle index overflow. appId", m4.a(this.f3607b));
            j2 = 0;
        }
        this.E = true;
        this.f3609g = j2;
    }

    public final void g(String str) {
        this.a.k().c();
        this.E |= !ca.c(this.f3612j, str);
        this.f3612j = str;
    }

    public final void h(String str) {
        this.a.k().c();
        this.E |= !ca.c(this.f3614l, str);
        this.f3614l = str;
    }

    public final void i(long j2) {
        this.a.k().c();
        this.E |= this.G != j2;
        this.G = j2;
    }

    public final void j(long j2) {
        this.a.k().c();
        this.E |= this.f3618p != j2;
        this.f3618p = j2;
    }

    public final void a(long j2) {
        this.a.k().c();
        this.E |= this.f3610h != j2;
        this.f3610h = j2;
    }

    public final void e(long j2) {
        this.a.k().c();
        this.E |= this.f3616n != j2;
        this.f3616n = j2;
    }

    public final void f(long j2) {
        this.a.k().c();
        this.E |= this.u != j2;
        this.u = j2;
    }

    public final void b(long j2) {
        this.a.k().c();
        this.E |= this.f3611i != j2;
        this.f3611i = j2;
    }

    public final void c(long j2) {
        this.a.k().c();
        this.E |= this.f3613k != j2;
        this.f3613k = j2;
    }

    public final void d(long j2) {
        this.a.k().c();
        this.E |= this.f3615m != j2;
        this.f3615m = j2;
    }

    public final void g(long j2) {
        boolean z2 = true;
        q.a(j2 >= 0);
        this.a.k().c();
        boolean z3 = this.E;
        if (this.f3609g == j2) {
            z2 = false;
        }
        this.E = z2 | z3;
        this.f3609g = j2;
    }

    public final void h(long j2) {
        this.a.k().c();
        this.E |= this.F != j2;
        this.F = j2;
    }

    public final void i(String str) {
        this.a.k().c();
        this.E |= !ca.c(this.D, str);
        this.D = str;
    }

    public final void a(boolean z2) {
        this.a.k().c();
        this.E |= this.f3617o != z2;
        this.f3617o = z2;
    }

    public final Boolean e() {
        this.a.k().c();
        return this.t;
    }

    public final List<String> f() {
        this.a.k().c();
        return this.v;
    }

    public final long b() {
        this.a.k().c();
        return this.f3618p;
    }

    public final boolean c() {
        this.a.k().c();
        return this.f3619q;
    }

    public final boolean d() {
        this.a.k().c();
        return this.r;
    }

    public final String a() {
        this.a.k().c();
        String str = this.D;
        i((String) null);
        return str;
    }

    public final void b(boolean z2) {
        this.a.k().c();
        this.E |= this.f3619q != z2;
        this.f3619q = z2;
    }

    public final void c(boolean z2) {
        this.a.k().c();
        this.E |= this.r != z2;
        this.r = z2;
    }

    public final void a(Boolean bool) {
        this.a.k().c();
        boolean z2 = this.E;
        Boolean bool2 = this.t;
        this.E = z2 | (!((bool2 == null && bool == null) ? true : bool2 == null ? false : bool2.equals(bool)));
        this.t = bool;
    }

    public final void a(List<String> list) {
        this.a.k().c();
        List<String> list2 = this.v;
        if (!((list2 == null && list == null) ? true : list2 == null ? false : list2.equals(list))) {
            this.E = true;
            this.v = list != null ? new ArrayList(list) : null;
        }
    }
}
