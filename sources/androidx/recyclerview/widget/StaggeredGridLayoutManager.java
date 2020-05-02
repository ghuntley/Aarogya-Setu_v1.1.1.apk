package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import h.h.m.w.b;
import h.r.d.m;
import h.r.d.n;
import h.r.d.o;
import h.r.d.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    public boolean A;
    public BitSet B;
    public int C;
    public int D;
    public d E;
    public int F;
    public boolean G;
    public boolean H;
    public e I;
    public int J;
    public final Rect K;
    public final b L;
    public boolean M;
    public boolean N;
    public int[] O;
    public final Runnable P;
    public int s = -1;
    public f[] t;
    public t u;
    public t v;
    public int w;
    public int x;
    public final n y;
    public boolean z;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            StaggeredGridLayoutManager.this.r();
        }
    }

    public class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f343b;
        public boolean c;
        public boolean d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public int[] f344f;

        public b() {
            b();
        }

        public void a() {
            int i2;
            if (this.c) {
                i2 = StaggeredGridLayoutManager.this.u.b();
            } else {
                i2 = StaggeredGridLayoutManager.this.u.f();
            }
            this.f343b = i2;
        }

        public void b() {
            this.a = -1;
            this.f343b = RecyclerView.UNDEFINED_DURATION;
            this.c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f344f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    public static class c extends RecyclerView.p {
        public f e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f346f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(int i2, int i3) {
            super(i2, i3);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f351f;

        /* renamed from: g  reason: collision with root package name */
        public int f352g;

        /* renamed from: h  reason: collision with root package name */
        public int[] f353h;

        /* renamed from: i  reason: collision with root package name */
        public int f354i;

        /* renamed from: j  reason: collision with root package name */
        public int[] f355j;

        /* renamed from: k  reason: collision with root package name */
        public List<d.a> f356k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f357l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f358m;

        /* renamed from: n  reason: collision with root package name */
        public boolean f359n;

        public static class a implements Parcelable.Creator<e> {
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public Object[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e() {
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.e);
            parcel.writeInt(this.f351f);
            parcel.writeInt(this.f352g);
            if (this.f352g > 0) {
                parcel.writeIntArray(this.f353h);
            }
            parcel.writeInt(this.f354i);
            if (this.f354i > 0) {
                parcel.writeIntArray(this.f355j);
            }
            parcel.writeInt(this.f357l ? 1 : 0);
            parcel.writeInt(this.f358m ? 1 : 0);
            parcel.writeInt(this.f359n ? 1 : 0);
            parcel.writeList(this.f356k);
        }

        public e(Parcel parcel) {
            this.e = parcel.readInt();
            this.f351f = parcel.readInt();
            int readInt = parcel.readInt();
            this.f352g = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f353h = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f354i = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f355j = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f357l = parcel.readInt() == 1;
            this.f358m = parcel.readInt() == 1;
            this.f359n = parcel.readInt() == 1 ? true : z;
            this.f356k = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f352g = eVar.f352g;
            this.e = eVar.e;
            this.f351f = eVar.f351f;
            this.f353h = eVar.f353h;
            this.f354i = eVar.f354i;
            this.f355j = eVar.f355j;
            this.f357l = eVar.f357l;
            this.f358m = eVar.f358m;
            this.f359n = eVar.f359n;
            this.f356k = eVar.f356k;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.z = false;
        this.A = false;
        this.C = -1;
        this.D = RecyclerView.UNDEFINED_DURATION;
        this.E = new d();
        this.F = 2;
        this.K = new Rect();
        this.L = new b();
        this.M = false;
        this.N = true;
        this.P = new a();
        RecyclerView.o.d a2 = RecyclerView.o.a(context, attributeSet, i2, i3);
        int i4 = a2.a;
        if (i4 == 0 || i4 == 1) {
            a((String) null);
            if (i4 != this.w) {
                this.w = i4;
                t tVar = this.u;
                this.u = this.v;
                this.v = tVar;
                o();
            }
            int i5 = a2.f327b;
            a((String) null);
            if (i5 != this.s) {
                this.E.a();
                o();
                this.s = i5;
                this.B = new BitSet(this.s);
                this.t = new f[this.s];
                for (int i6 = 0; i6 < this.s; i6++) {
                    this.t[i6] = new f(i6);
                }
                o();
            }
            boolean z2 = a2.c;
            a((String) null);
            e eVar = this.I;
            if (!(eVar == null || eVar.f357l == z2)) {
                eVar.f357l = z2;
            }
            this.z = z2;
            o();
            this.y = new n();
            this.u = t.a(this, this.w);
            this.v = t.a(this, 1 - this.w);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void a(RecyclerView recyclerView, RecyclerView.v vVar) {
        Runnable runnable = this.P;
        RecyclerView recyclerView2 = this.f314b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(runnable);
        }
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c();
        }
        recyclerView.requestLayout();
    }

    public int b(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    public void c(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        c(vVar, a0Var, true);
    }

    public int d(RecyclerView.a0 a0Var) {
        return h(a0Var);
    }

    public int e(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    public void f(int i2) {
        if (i2 == 0) {
            r();
        }
    }

    public void g(RecyclerView.a0 a0Var) {
        this.C = -1;
        this.D = RecyclerView.UNDEFINED_DURATION;
        this.I = null;
        this.L.b();
    }

    public final int h(RecyclerView.a0 a0Var) {
        if (d() == 0) {
            return 0;
        }
        return g.a.a.b.a.a(a0Var, this.u, b(!this.N), a(!this.N), (RecyclerView.o) this, this.N);
    }

    public final int i(RecyclerView.a0 a0Var) {
        if (d() == 0) {
            return 0;
        }
        return g.a.a.b.a.a(a0Var, this.u, b(!this.N), a(!this.N), (RecyclerView.o) this, this.N, this.A);
    }

    public final int j(RecyclerView.a0 a0Var) {
        if (d() == 0) {
            return 0;
        }
        return g.a.a.b.a.b(a0Var, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    public final int k(int i2) {
        int b2 = this.t[0].b(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int b3 = this.t[i3].b(i2);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    public final boolean l(int i2) {
        if (this.w == 0) {
            if ((i2 == -1) != this.A) {
                return true;
            }
            return false;
        }
        if (((i2 == -1) == this.A) == v()) {
            return true;
        }
        return false;
    }

    public boolean m() {
        return this.F != 0;
    }

    public Parcelable n() {
        int i2;
        View view;
        int i3;
        int i4;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.f357l = this.z;
        eVar.f358m = this.G;
        eVar.f359n = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.a) == null) {
            eVar.f354i = 0;
        } else {
            eVar.f355j = iArr;
            eVar.f354i = iArr.length;
            eVar.f356k = dVar.f347b;
        }
        int i5 = -1;
        if (d() > 0) {
            if (this.G) {
                i2 = t();
            } else {
                i2 = s();
            }
            eVar.e = i2;
            if (this.A) {
                view = a(true);
            } else {
                view = b(true);
            }
            if (view != null) {
                i5 = i(view);
            }
            eVar.f351f = i5;
            int i6 = this.s;
            eVar.f352g = i6;
            eVar.f353h = new int[i6];
            for (int i7 = 0; i7 < this.s; i7++) {
                if (this.G) {
                    i3 = this.t[i7].a((int) RecyclerView.UNDEFINED_DURATION);
                    if (i3 != Integer.MIN_VALUE) {
                        i4 = this.u.b();
                    } else {
                        eVar.f353h[i7] = i3;
                    }
                } else {
                    i3 = this.t[i7].b((int) RecyclerView.UNDEFINED_DURATION);
                    if (i3 != Integer.MIN_VALUE) {
                        i4 = this.u.f();
                    } else {
                        eVar.f353h[i7] = i3;
                    }
                }
                i3 -= i4;
                eVar.f353h[i7] = i3;
            }
        } else {
            eVar.e = -1;
            eVar.f351f = -1;
            eVar.f352g = 0;
        }
        return eVar;
    }

    public boolean q() {
        return this.I == null;
    }

    public boolean r() {
        int i2;
        int i3;
        if (d() == 0 || this.F == 0 || !this.f318i) {
            return false;
        }
        if (this.A) {
            i3 = t();
            i2 = s();
        } else {
            i3 = s();
            i2 = t();
        }
        if (i3 == 0 && u() != null) {
            this.E.a();
            this.f317h = true;
            o();
            return true;
        } else if (!this.M) {
            return false;
        } else {
            int i4 = this.A ? -1 : 1;
            int i5 = i2 + 1;
            d.a a2 = this.E.a(i3, i5, i4, true);
            if (a2 == null) {
                this.M = false;
                this.E.b(i5);
                return false;
            }
            d.a a3 = this.E.a(i3, a2.e, i4 * -1, true);
            if (a3 == null) {
                this.E.b(a2.e);
            } else {
                this.E.b(a3.e + 1);
            }
            this.f317h = true;
            o();
            return true;
        }
    }

    public int s() {
        if (d() == 0) {
            return 0;
        }
        return i(c(0));
    }

    public int t() {
        int d2 = d();
        if (d2 == 0) {
            return 0;
        }
        return i(c(d2 - 1));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c1, code lost:
        if (r11 == r12) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00d3, code lost:
        if (r11 == r12) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d7, code lost:
        r11 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0099 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View u() {
        /*
            r13 = this;
            int r0 = r13.d()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.s
            r2.<init>(r3)
            int r3 = r13.s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.w
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.v()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r13.A
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002f
            r7 = 1
            goto L_0x0030
        L_0x002f:
            r7 = -1
        L_0x0030:
            if (r0 == r6) goto L_0x00f9
            android.view.View r8 = r13.c((int) r0)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r9.e
            int r10 = r10.e
            boolean r10 = r2.get(r10)
            if (r10 == 0) goto L_0x00a1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r9.e
            boolean r11 = r13.A
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L_0x0074
            int r11 = r10.c
            if (r11 == r12) goto L_0x0053
            goto L_0x0058
        L_0x0053:
            r10.a()
            int r11 = r10.c
        L_0x0058:
            h.r.d.t r12 = r13.u
            int r12 = r12.b()
            if (r11 >= r12) goto L_0x0096
            java.util.ArrayList<android.view.View> r11 = r10.a
            int r12 = r11.size()
            int r12 = r12 + r5
            java.lang.Object r11 = r11.get(r12)
            android.view.View r11 = (android.view.View) r11
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r10.b((android.view.View) r11)
            boolean r10 = r10.f346f
            goto L_0x0094
        L_0x0074:
            int r11 = r10.f360b
            if (r11 == r12) goto L_0x0079
            goto L_0x007e
        L_0x0079:
            r10.b()
            int r11 = r10.f360b
        L_0x007e:
            h.r.d.t r12 = r13.u
            int r12 = r12.f()
            if (r11 <= r12) goto L_0x0096
            java.util.ArrayList<android.view.View> r11 = r10.a
            java.lang.Object r11 = r11.get(r4)
            android.view.View r11 = (android.view.View) r11
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = r10.b((android.view.View) r11)
            boolean r10 = r10.f346f
        L_0x0094:
            r10 = r10 ^ r1
            goto L_0x0097
        L_0x0096:
            r10 = 0
        L_0x0097:
            if (r10 == 0) goto L_0x009a
            return r8
        L_0x009a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r9.e
            int r10 = r10.e
            r2.clear(r10)
        L_0x00a1:
            boolean r10 = r9.f346f
            if (r10 == 0) goto L_0x00a6
            goto L_0x00f6
        L_0x00a6:
            int r10 = r0 + r7
            if (r10 == r6) goto L_0x00f6
            android.view.View r10 = r13.c((int) r10)
            boolean r11 = r13.A
            if (r11 == 0) goto L_0x00c4
            h.r.d.t r11 = r13.u
            int r11 = r11.a((android.view.View) r8)
            h.r.d.t r12 = r13.u
            int r12 = r12.a((android.view.View) r10)
            if (r11 >= r12) goto L_0x00c1
            return r8
        L_0x00c1:
            if (r11 != r12) goto L_0x00d7
            goto L_0x00d5
        L_0x00c4:
            h.r.d.t r11 = r13.u
            int r11 = r11.d(r8)
            h.r.d.t r12 = r13.u
            int r12 = r12.d(r10)
            if (r11 <= r12) goto L_0x00d3
            return r8
        L_0x00d3:
            if (r11 != r12) goto L_0x00d7
        L_0x00d5:
            r11 = 1
            goto L_0x00d8
        L_0x00d7:
            r11 = 0
        L_0x00d8:
            if (r11 == 0) goto L_0x00f6
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r10 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.e
            int r9 = r9.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r10 = r10.e
            int r10 = r10.e
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x00ed
            r9 = 1
            goto L_0x00ee
        L_0x00ed:
            r9 = 0
        L_0x00ee:
            if (r3 >= 0) goto L_0x00f2
            r10 = 1
            goto L_0x00f3
        L_0x00f2:
            r10 = 0
        L_0x00f3:
            if (r9 == r10) goto L_0x00f6
            return r8
        L_0x00f6:
            int r0 = r0 + r7
            goto L_0x0030
        L_0x00f9:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.u():android.view.View");
    }

    public boolean v() {
        return f() == 1;
    }

    public final void w() {
        if (this.w == 1 || !v()) {
            this.A = this.z;
        } else {
            this.A = !this.z;
        }
    }

    public int b(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.w == 0) {
            return this.s;
        }
        return super.b(vVar, a0Var);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0421, code lost:
        if (r() != false) goto L_0x0425;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(androidx.recyclerview.widget.RecyclerView.v r13, androidx.recyclerview.widget.RecyclerView.a0 r14, boolean r15) {
        /*
            r12 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r12.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r12.I
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r12.C
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r14.a()
            if (r1 != 0) goto L_0x0018
            r12.b((androidx.recyclerview.widget.RecyclerView.v) r13)
            r0.b()
            return
        L_0x0018:
            boolean r1 = r0.e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r12.C
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r1 = r12.I
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x01fa
            r0.b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.I
            if (r7 == 0) goto L_0x00bc
            int r8 = r7.f352g
            if (r8 <= 0) goto L_0x007d
            int r9 = r12.s
            if (r8 != r9) goto L_0x006f
            r7 = 0
        L_0x003f:
            int r8 = r12.s
            if (r7 >= r8) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r12.t
            r8 = r8[r7]
            r8.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r8 = r12.I
            int[] r9 = r8.f353h
            r9 = r9[r7]
            if (r9 == r6) goto L_0x0064
            boolean r8 = r8.f358m
            if (r8 == 0) goto L_0x005d
            h.r.d.t r8 = r12.u
            int r8 = r8.b()
            goto L_0x0063
        L_0x005d:
            h.r.d.t r8 = r12.u
            int r8 = r8.f()
        L_0x0063:
            int r9 = r9 + r8
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r12.t
            r8 = r8[r7]
            r8.f360b = r9
            r8.c = r9
            int r7 = r7 + 1
            goto L_0x003f
        L_0x006f:
            r7.f353h = r5
            r7.f352g = r4
            r7.f354i = r4
            r7.f355j = r5
            r7.f356k = r5
            int r8 = r7.f351f
            r7.e = r8
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.I
            boolean r8 = r7.f359n
            r12.H = r8
            boolean r7 = r7.f357l
            r12.a((java.lang.String) r5)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r8 = r12.I
            if (r8 == 0) goto L_0x0092
            boolean r9 = r8.f357l
            if (r9 == r7) goto L_0x0092
            r8.f357l = r7
        L_0x0092:
            r12.z = r7
            r12.o()
            r12.w()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.I
            int r8 = r7.e
            if (r8 == r2) goto L_0x00a7
            r12.C = r8
            boolean r7 = r7.f358m
            r0.c = r7
            goto L_0x00ab
        L_0x00a7:
            boolean r7 = r12.A
            r0.c = r7
        L_0x00ab:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.I
            int r8 = r7.f354i
            if (r8 <= r3) goto L_0x00c3
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r8 = r12.E
            int[] r9 = r7.f355j
            r8.a = r9
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r7 = r7.f356k
            r8.f347b = r7
            goto L_0x00c3
        L_0x00bc:
            r12.w()
            boolean r7 = r12.A
            r0.c = r7
        L_0x00c3:
            boolean r7 = r14.f283g
            if (r7 != 0) goto L_0x01b7
            int r7 = r12.C
            if (r7 != r2) goto L_0x00cd
            goto L_0x01b7
        L_0x00cd:
            if (r7 < 0) goto L_0x01b3
            int r8 = r14.a()
            if (r7 < r8) goto L_0x00d7
            goto L_0x01b3
        L_0x00d7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.I
            if (r7 == 0) goto L_0x00ec
            int r8 = r7.e
            if (r8 == r2) goto L_0x00ec
            int r7 = r7.f352g
            if (r7 >= r3) goto L_0x00e4
            goto L_0x00ec
        L_0x00e4:
            r0.f343b = r6
            int r7 = r12.C
            r0.a = r7
            goto L_0x01b1
        L_0x00ec:
            int r7 = r12.C
            android.view.View r7 = r12.b((int) r7)
            if (r7 == 0) goto L_0x017d
            boolean r8 = r12.A
            if (r8 == 0) goto L_0x00fd
            int r8 = r12.t()
            goto L_0x0101
        L_0x00fd:
            int r8 = r12.s()
        L_0x0101:
            r0.a = r8
            int r8 = r12.D
            if (r8 == r6) goto L_0x0133
            boolean r8 = r0.c
            if (r8 == 0) goto L_0x011f
            h.r.d.t r8 = r12.u
            int r8 = r8.b()
            int r9 = r12.D
            int r8 = r8 - r9
            h.r.d.t r9 = r12.u
            int r7 = r9.a((android.view.View) r7)
            int r8 = r8 - r7
            r0.f343b = r8
            goto L_0x01b1
        L_0x011f:
            h.r.d.t r8 = r12.u
            int r8 = r8.f()
            int r9 = r12.D
            int r8 = r8 + r9
            h.r.d.t r9 = r12.u
            int r7 = r9.d(r7)
            int r8 = r8 - r7
            r0.f343b = r8
            goto L_0x01b1
        L_0x0133:
            h.r.d.t r8 = r12.u
            int r8 = r8.b(r7)
            h.r.d.t r9 = r12.u
            int r9 = r9.g()
            if (r8 <= r9) goto L_0x0155
            boolean r7 = r0.c
            if (r7 == 0) goto L_0x014c
            h.r.d.t r7 = r12.u
            int r7 = r7.b()
            goto L_0x0152
        L_0x014c:
            h.r.d.t r7 = r12.u
            int r7 = r7.f()
        L_0x0152:
            r0.f343b = r7
            goto L_0x01b1
        L_0x0155:
            h.r.d.t r8 = r12.u
            int r8 = r8.d(r7)
            h.r.d.t r9 = r12.u
            int r9 = r9.f()
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x0168
            int r7 = -r8
            r0.f343b = r7
            goto L_0x01b1
        L_0x0168:
            h.r.d.t r8 = r12.u
            int r8 = r8.b()
            h.r.d.t r9 = r12.u
            int r7 = r9.a((android.view.View) r7)
            int r8 = r8 - r7
            if (r8 >= 0) goto L_0x017a
            r0.f343b = r8
            goto L_0x01b1
        L_0x017a:
            r0.f343b = r6
            goto L_0x01b1
        L_0x017d:
            int r7 = r12.C
            r0.a = r7
            int r8 = r12.D
            if (r8 != r6) goto L_0x0194
            int r7 = r12.i((int) r7)
            if (r7 != r3) goto L_0x018d
            r7 = 1
            goto L_0x018e
        L_0x018d:
            r7 = 0
        L_0x018e:
            r0.c = r7
            r0.a()
            goto L_0x01af
        L_0x0194:
            boolean r7 = r0.c
            if (r7 == 0) goto L_0x01a4
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            h.r.d.t r7 = r7.u
            int r7 = r7.b()
            int r7 = r7 - r8
            r0.f343b = r7
            goto L_0x01af
        L_0x01a4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            h.r.d.t r7 = r7.u
            int r7 = r7.f()
            int r7 = r7 + r8
            r0.f343b = r7
        L_0x01af:
            r0.d = r3
        L_0x01b1:
            r7 = 1
            goto L_0x01b8
        L_0x01b3:
            r12.C = r2
            r12.D = r6
        L_0x01b7:
            r7 = 0
        L_0x01b8:
            if (r7 == 0) goto L_0x01bb
            goto L_0x01f8
        L_0x01bb:
            boolean r7 = r12.G
            if (r7 == 0) goto L_0x01d7
            int r7 = r14.a()
            int r8 = r12.d()
        L_0x01c7:
            int r8 = r8 + r2
            if (r8 < 0) goto L_0x01f3
            android.view.View r9 = r12.c((int) r8)
            int r9 = r12.i(r9)
            if (r9 < 0) goto L_0x01c7
            if (r9 >= r7) goto L_0x01c7
            goto L_0x01f4
        L_0x01d7:
            int r7 = r14.a()
            int r8 = r12.d()
            r9 = 0
        L_0x01e0:
            if (r9 >= r8) goto L_0x01f3
            android.view.View r10 = r12.c((int) r9)
            int r10 = r12.i(r10)
            if (r10 < 0) goto L_0x01f0
            if (r10 >= r7) goto L_0x01f0
            r9 = r10
            goto L_0x01f4
        L_0x01f0:
            int r9 = r9 + 1
            goto L_0x01e0
        L_0x01f3:
            r9 = 0
        L_0x01f4:
            r0.a = r9
            r0.f343b = r6
        L_0x01f8:
            r0.e = r3
        L_0x01fa:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.I
            if (r7 != 0) goto L_0x0217
            int r7 = r12.C
            if (r7 != r2) goto L_0x0217
            boolean r7 = r0.c
            boolean r8 = r12.G
            if (r7 != r8) goto L_0x0210
            boolean r7 = r12.v()
            boolean r8 = r12.H
            if (r7 == r8) goto L_0x0217
        L_0x0210:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r12.E
            r7.a()
            r0.d = r3
        L_0x0217:
            int r7 = r12.d()
            if (r7 <= 0) goto L_0x02cf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$e r7 = r12.I
            if (r7 == 0) goto L_0x0225
            int r7 = r7.f352g
            if (r7 >= r3) goto L_0x02cf
        L_0x0225:
            boolean r7 = r0.d
            if (r7 == 0) goto L_0x0244
            r1 = 0
        L_0x022a:
            int r7 = r12.s
            if (r1 >= r7) goto L_0x02cf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r12.t
            r7 = r7[r1]
            r7.c()
            int r7 = r0.f343b
            if (r7 == r6) goto L_0x0241
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r8 = r12.t
            r8 = r8[r1]
            r8.f360b = r7
            r8.c = r7
        L_0x0241:
            int r1 = r1 + 1
            goto L_0x022a
        L_0x0244:
            if (r1 != 0) goto L_0x0266
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r12.L
            int[] r1 = r1.f344f
            if (r1 != 0) goto L_0x024d
            goto L_0x0266
        L_0x024d:
            r1 = 0
        L_0x024e:
            int r7 = r12.s
            if (r1 >= r7) goto L_0x02cf
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r12.t
            r7 = r7[r1]
            r7.c()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r8 = r12.L
            int[] r8 = r8.f344f
            r8 = r8[r1]
            r7.f360b = r8
            r7.c = r8
            int r1 = r1 + 1
            goto L_0x024e
        L_0x0266:
            r1 = 0
        L_0x0267:
            int r7 = r12.s
            if (r1 >= r7) goto L_0x02a7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r12.t
            r7 = r7[r1]
            boolean r8 = r12.A
            int r9 = r0.f343b
            if (r8 == 0) goto L_0x027a
            int r10 = r7.a((int) r6)
            goto L_0x027e
        L_0x027a:
            int r10 = r7.b((int) r6)
        L_0x027e:
            r7.c()
            if (r10 != r6) goto L_0x0284
            goto L_0x02a4
        L_0x0284:
            if (r8 == 0) goto L_0x0290
            androidx.recyclerview.widget.StaggeredGridLayoutManager r11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            h.r.d.t r11 = r11.u
            int r11 = r11.b()
            if (r10 < r11) goto L_0x02a4
        L_0x0290:
            if (r8 != 0) goto L_0x029d
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            h.r.d.t r8 = r8.u
            int r8 = r8.f()
            if (r10 <= r8) goto L_0x029d
            goto L_0x02a4
        L_0x029d:
            if (r9 == r6) goto L_0x02a0
            int r10 = r10 + r9
        L_0x02a0:
            r7.c = r10
            r7.f360b = r10
        L_0x02a4:
            int r1 = r1 + 1
            goto L_0x0267
        L_0x02a7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r12.L
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r7 = r12.t
            if (r1 == 0) goto L_0x02ce
            int r8 = r7.length
            int[] r9 = r1.f344f
            if (r9 == 0) goto L_0x02b5
            int r9 = r9.length
            if (r9 >= r8) goto L_0x02be
        L_0x02b5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r9 = r9.t
            int r9 = r9.length
            int[] r9 = new int[r9]
            r1.f344f = r9
        L_0x02be:
            r9 = 0
        L_0x02bf:
            if (r9 >= r8) goto L_0x02cf
            int[] r10 = r1.f344f
            r11 = r7[r9]
            int r11 = r11.b((int) r6)
            r10[r9] = r11
            int r9 = r9 + 1
            goto L_0x02bf
        L_0x02ce:
            throw r5
        L_0x02cf:
            r12.a((androidx.recyclerview.widget.RecyclerView.v) r13)
            h.r.d.n r1 = r12.y
            r1.a = r4
            r12.M = r4
            h.r.d.t r1 = r12.v
            int r1 = r1.g()
            int r7 = r12.s
            int r7 = r1 / r7
            r12.x = r7
            h.r.d.t r7 = r12.v
            int r7 = r7.d()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r7)
            r12.J = r1
            int r1 = r0.a
            r12.b((int) r1, (androidx.recyclerview.widget.RecyclerView.a0) r14)
            boolean r1 = r0.c
            if (r1 == 0) goto L_0x0311
            r12.m(r2)
            h.r.d.n r1 = r12.y
            r12.a((androidx.recyclerview.widget.RecyclerView.v) r13, (h.r.d.n) r1, (androidx.recyclerview.widget.RecyclerView.a0) r14)
            r12.m(r3)
            h.r.d.n r1 = r12.y
            int r2 = r0.a
            int r7 = r1.d
            int r2 = r2 + r7
            r1.c = r2
            r12.a((androidx.recyclerview.widget.RecyclerView.v) r13, (h.r.d.n) r1, (androidx.recyclerview.widget.RecyclerView.a0) r14)
            goto L_0x0328
        L_0x0311:
            r12.m(r3)
            h.r.d.n r1 = r12.y
            r12.a((androidx.recyclerview.widget.RecyclerView.v) r13, (h.r.d.n) r1, (androidx.recyclerview.widget.RecyclerView.a0) r14)
            r12.m(r2)
            h.r.d.n r1 = r12.y
            int r2 = r0.a
            int r7 = r1.d
            int r2 = r2 + r7
            r1.c = r2
            r12.a((androidx.recyclerview.widget.RecyclerView.v) r13, (h.r.d.n) r1, (androidx.recyclerview.widget.RecyclerView.a0) r14)
        L_0x0328:
            h.r.d.t r1 = r12.v
            int r1 = r1.d()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0334
            goto L_0x03de
        L_0x0334:
            r1 = 0
            int r2 = r12.d()
            r7 = 0
        L_0x033a:
            if (r7 >= r2) goto L_0x035c
            android.view.View r8 = r12.c((int) r7)
            h.r.d.t r9 = r12.v
            int r9 = r9.b(r8)
            float r9 = (float) r9
            int r10 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r10 >= 0) goto L_0x034c
            goto L_0x0358
        L_0x034c:
            android.view.ViewGroup$LayoutParams r8 = r8.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            if (r8 == 0) goto L_0x035b
            float r1 = java.lang.Math.max(r1, r9)
        L_0x0358:
            int r7 = r7 + 1
            goto L_0x033a
        L_0x035b:
            throw r5
        L_0x035c:
            int r5 = r12.x
            int r7 = r12.s
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            h.r.d.t r7 = r12.v
            int r7 = r7.d()
            if (r7 != r6) goto L_0x0379
            h.r.d.t r6 = r12.v
            int r6 = r6.g()
            int r1 = java.lang.Math.min(r1, r6)
        L_0x0379:
            int r6 = r12.s
            int r6 = r1 / r6
            r12.x = r6
            h.r.d.t r6 = r12.v
            int r6 = r6.d()
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            r12.J = r1
            int r1 = r12.x
            if (r1 != r5) goto L_0x0390
            goto L_0x03de
        L_0x0390:
            r1 = 0
        L_0x0391:
            if (r1 >= r2) goto L_0x03de
            android.view.View r6 = r12.c((int) r1)
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r7
            boolean r8 = r7.f346f
            if (r8 == 0) goto L_0x03a2
            goto L_0x03db
        L_0x03a2:
            boolean r8 = r12.v()
            if (r8 == 0) goto L_0x03c4
            int r8 = r12.w
            if (r8 != r3) goto L_0x03c4
            int r8 = r12.s
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.e
            int r7 = r7.e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r12.x
            int r9 = r9 * r10
            int r8 = r8 - r3
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r5
            int r9 = r9 - r7
            r6.offsetLeftAndRight(r9)
            goto L_0x03db
        L_0x03c4:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r7 = r7.e
            int r7 = r7.e
            int r8 = r12.x
            int r8 = r8 * r7
            int r7 = r7 * r5
            int r9 = r12.w
            if (r9 != r3) goto L_0x03d7
            int r8 = r8 - r7
            r6.offsetLeftAndRight(r8)
            goto L_0x03db
        L_0x03d7:
            int r8 = r8 - r7
            r6.offsetTopAndBottom(r8)
        L_0x03db:
            int r1 = r1 + 1
            goto L_0x0391
        L_0x03de:
            int r1 = r12.d()
            if (r1 <= 0) goto L_0x03f5
            boolean r1 = r12.A
            if (r1 == 0) goto L_0x03ef
            r12.a((androidx.recyclerview.widget.RecyclerView.v) r13, (androidx.recyclerview.widget.RecyclerView.a0) r14, (boolean) r3)
            r12.b((androidx.recyclerview.widget.RecyclerView.v) r13, (androidx.recyclerview.widget.RecyclerView.a0) r14, (boolean) r4)
            goto L_0x03f5
        L_0x03ef:
            r12.b((androidx.recyclerview.widget.RecyclerView.v) r13, (androidx.recyclerview.widget.RecyclerView.a0) r14, (boolean) r3)
            r12.a((androidx.recyclerview.widget.RecyclerView.v) r13, (androidx.recyclerview.widget.RecyclerView.a0) r14, (boolean) r4)
        L_0x03f5:
            if (r15 == 0) goto L_0x0424
            boolean r15 = r14.f283g
            if (r15 != 0) goto L_0x0424
            int r15 = r12.F
            if (r15 == 0) goto L_0x0411
            int r15 = r12.d()
            if (r15 <= 0) goto L_0x0411
            boolean r15 = r12.M
            if (r15 != 0) goto L_0x040f
            android.view.View r15 = r12.u()
            if (r15 == 0) goto L_0x0411
        L_0x040f:
            r15 = 1
            goto L_0x0412
        L_0x0411:
            r15 = 0
        L_0x0412:
            if (r15 == 0) goto L_0x0424
            java.lang.Runnable r15 = r12.P
            androidx.recyclerview.widget.RecyclerView r1 = r12.f314b
            if (r1 == 0) goto L_0x041d
            r1.removeCallbacks(r15)
        L_0x041d:
            boolean r15 = r12.r()
            if (r15 == 0) goto L_0x0424
            goto L_0x0425
        L_0x0424:
            r3 = 0
        L_0x0425:
            boolean r15 = r14.f283g
            if (r15 == 0) goto L_0x042e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r15 = r12.L
            r15.b()
        L_0x042e:
            boolean r15 = r0.c
            r12.G = r15
            boolean r15 = r12.v()
            r12.H = r15
            if (r3 == 0) goto L_0x0442
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r15 = r12.L
            r15.b()
            r12.c((androidx.recyclerview.widget.RecyclerView.v) r13, (androidx.recyclerview.widget.RecyclerView.a0) r14, (boolean) r4)
        L_0x0442:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    public final int d(int i2, int i3, int i4) {
        if (i3 == 0 && i4 == 0) {
            return i2;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - i3) - i4), mode);
        }
        return i2;
    }

    public void e(int i2) {
        RecyclerView recyclerView = this.f314b;
        if (recyclerView != null) {
            recyclerView.offsetChildrenVertical(i2);
        }
        for (int i3 = 0; i3 < this.s; i3++) {
            f fVar = this.t[i3];
            int i4 = fVar.f360b;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f360b = i4 + i2;
            }
            int i5 = fVar.c;
            if (i5 != Integer.MIN_VALUE) {
                fVar.c = i5 + i2;
            }
        }
    }

    public int f(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    public final void m(int i2) {
        n nVar = this.y;
        nVar.e = i2;
        int i3 = 1;
        if (this.A != (i2 == -1)) {
            i3 = -1;
        }
        nVar.d = i3;
    }

    public class f {
        public ArrayList<View> a = new ArrayList<>();

        /* renamed from: b  reason: collision with root package name */
        public int f360b = RecyclerView.UNDEFINED_DURATION;
        public int c = RecyclerView.UNDEFINED_DURATION;
        public int d = 0;
        public final int e;

        public f(int i2) {
            this.e = i2;
        }

        public int a(int i2) {
            int i3 = this.c;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            a();
            return this.c;
        }

        public int b(int i2) {
            int i3 = this.f360b;
            if (i3 != Integer.MIN_VALUE) {
                return i3;
            }
            if (this.a.size() == 0) {
                return i2;
            }
            b();
            return this.f360b;
        }

        public void c(View view) {
            c b2 = b(view);
            b2.e = this;
            this.a.add(0, view);
            this.f360b = RecyclerView.UNDEFINED_DURATION;
            if (this.a.size() == 1) {
                this.c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b2.c() || b2.b()) {
                this.d = StaggeredGridLayoutManager.this.u.b(view) + this.d;
            }
        }

        public int d() {
            if (StaggeredGridLayoutManager.this.z) {
                return a(this.a.size() - 1, -1, true);
            }
            return a(0, this.a.size(), true);
        }

        public int e() {
            if (StaggeredGridLayoutManager.this.z) {
                return a(0, this.a.size(), true);
            }
            return a(this.a.size() - 1, -1, true);
        }

        public void f() {
            int size = this.a.size();
            View remove = this.a.remove(size - 1);
            c b2 = b(remove);
            b2.e = null;
            if (b2.c() || b2.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            if (size == 1) {
                this.f360b = RecyclerView.UNDEFINED_DURATION;
            }
            this.c = RecyclerView.UNDEFINED_DURATION;
        }

        public void g() {
            View remove = this.a.remove(0);
            c b2 = b(remove);
            b2.e = null;
            if (this.a.size() == 0) {
                this.c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b2.c() || b2.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            this.f360b = RecyclerView.UNDEFINED_DURATION;
        }

        public void a() {
            d.a c2;
            ArrayList<View> arrayList = this.a;
            View view = arrayList.get(arrayList.size() - 1);
            c b2 = b(view);
            this.c = StaggeredGridLayoutManager.this.u.a(view);
            if (b2.f346f && (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) != null && c2.f348f == 1) {
                int i2 = this.c;
                int i3 = this.e;
                int[] iArr = c2.f349g;
                this.c = i2 + (iArr == null ? 0 : iArr[i3]);
            }
        }

        public void b() {
            d.a c2;
            int i2 = 0;
            View view = this.a.get(0);
            c b2 = b(view);
            this.f360b = StaggeredGridLayoutManager.this.u.d(view);
            if (b2.f346f && (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) != null && c2.f348f == -1) {
                int i3 = this.f360b;
                int i4 = this.e;
                int[] iArr = c2.f349g;
                if (iArr != null) {
                    i2 = iArr[i4];
                }
                this.f360b = i3 - i2;
            }
        }

        public void c() {
            this.a.clear();
            this.f360b = RecyclerView.UNDEFINED_DURATION;
            this.c = RecyclerView.UNDEFINED_DURATION;
            this.d = 0;
        }

        public void a(View view) {
            c b2 = b(view);
            b2.e = this;
            this.a.add(view);
            this.c = RecyclerView.UNDEFINED_DURATION;
            if (this.a.size() == 1) {
                this.f360b = RecyclerView.UNDEFINED_DURATION;
            }
            if (b2.c() || b2.b()) {
                this.d = StaggeredGridLayoutManager.this.u.b(view) + this.d;
            }
        }

        public c b(View view) {
            return (c) view.getLayoutParams();
        }

        public int a(int i2, int i3, boolean z) {
            int f2 = StaggeredGridLayoutManager.this.u.f();
            int b2 = StaggeredGridLayoutManager.this.u.b();
            int i4 = i3 > i2 ? 1 : -1;
            while (i2 != i3) {
                View view = this.a.get(i2);
                int d2 = StaggeredGridLayoutManager.this.u.d(view);
                int a2 = StaggeredGridLayoutManager.this.u.a(view);
                boolean z2 = false;
                boolean z3 = !z ? d2 < b2 : d2 <= b2;
                if (!z ? a2 > f2 : a2 >= f2) {
                    z2 = true;
                }
                if (z3 && z2 && (d2 < f2 || a2 > b2)) {
                    return StaggeredGridLayoutManager.this.i(view);
                }
                i2 += i4;
            }
            return -1;
        }

        public View a(int i2, int i3) {
            View view = null;
            if (i3 != -1) {
                int size = this.a.size() - 1;
                while (size >= 0) {
                    View view2 = this.a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.i(view2) >= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.i(view2) <= i2) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.a.size();
                int i4 = 0;
                while (i4 < size2) {
                    View view3 = this.a.get(i4);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.i(view3) <= i2) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.i(view3) >= i2) || !view3.hasFocusable()) {
                        break;
                    }
                    i4++;
                    view = view3;
                }
            }
            return view;
        }
    }

    public View b(boolean z2) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        int d2 = d();
        View view = null;
        for (int i2 = 0; i2 < d2; i2++) {
            View c2 = c(i2);
            int d3 = this.u.d(c2);
            if (this.u.a(c2) > f2 && d3 < b2) {
                if (d3 >= f2 || !z2) {
                    return c2;
                }
                if (view == null) {
                    view = c2;
                }
            }
        }
        return view;
    }

    public void d(int i2) {
        RecyclerView recyclerView = this.f314b;
        if (recyclerView != null) {
            recyclerView.offsetChildrenHorizontal(i2);
        }
        for (int i3 = 0; i3 < this.s; i3++) {
            f fVar = this.t[i3];
            int i4 = fVar.f360b;
            if (i4 != Integer.MIN_VALUE) {
                fVar.f360b = i4 + i2;
            }
            int i5 = fVar.c;
            if (i5 != Integer.MIN_VALUE) {
                fVar.c = i5 + i2;
            }
        }
    }

    public static class d {
        public int[] a;

        /* renamed from: b  reason: collision with root package name */
        public List<a> f347b;

        public void a(int i2) {
            int[] iArr = this.a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i2, 10) + 1)];
                this.a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i2 >= iArr.length) {
                int length = iArr.length;
                while (length <= i2) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        public int b(int i2) {
            List<a> list = this.f347b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f347b.get(size).e >= i2) {
                        this.f347b.remove(size);
                    }
                }
            }
            return d(i2);
        }

        public a c(int i2) {
            List<a> list = this.f347b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f347b.get(size);
                if (aVar.e == i2) {
                    return aVar;
                }
            }
            return null;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0048  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0052  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int d(int r5) {
            /*
                r4 = this;
                int[] r0 = r4.a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r5 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f347b
                if (r0 != 0) goto L_0x0010
            L_0x000e:
                r0 = -1
                goto L_0x0046
            L_0x0010:
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r4.c(r5)
                if (r0 == 0) goto L_0x001b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r2 = r4.f347b
                r2.remove(r0)
            L_0x001b:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f347b
                int r0 = r0.size()
                r2 = 0
            L_0x0022:
                if (r2 >= r0) goto L_0x0034
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f347b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r3
                int r3 = r3.e
                if (r3 < r5) goto L_0x0031
                goto L_0x0035
            L_0x0031:
                int r2 = r2 + 1
                goto L_0x0022
            L_0x0034:
                r2 = -1
            L_0x0035:
                if (r2 == r1) goto L_0x000e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r0 = r4.f347b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a> r3 = r4.f347b
                r3.remove(r2)
                int r0 = r0.e
            L_0x0046:
                if (r0 != r1) goto L_0x0052
                int[] r0 = r4.a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r5, r2, r1)
                int[] r5 = r4.a
                int r5 = r5.length
                return r5
            L_0x0052:
                int[] r2 = r4.a
                int r0 = r0 + 1
                java.util.Arrays.fill(r2, r5, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.d.d(int):int");
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0001a();
            public int e;

            /* renamed from: f  reason: collision with root package name */
            public int f348f;

            /* renamed from: g  reason: collision with root package name */
            public int[] f349g;

            /* renamed from: h  reason: collision with root package name */
            public boolean f350h;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a  reason: collision with other inner class name */
            public static class C0001a implements Parcelable.Creator<a> {
                public Object createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                public Object[] newArray(int i2) {
                    return new a[i2];
                }
            }

            public a(Parcel parcel) {
                this.e = parcel.readInt();
                this.f348f = parcel.readInt();
                this.f350h = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f349g = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public int describeContents() {
                return 0;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("FullSpanItem{mPosition=");
                a.append(this.e);
                a.append(", mGapDir=");
                a.append(this.f348f);
                a.append(", mHasUnwantedGapAfter=");
                a.append(this.f350h);
                a.append(", mGapPerSpan=");
                a.append(Arrays.toString(this.f349g));
                a.append('}');
                return a.toString();
            }

            public void writeToParcel(Parcel parcel, int i2) {
                parcel.writeInt(this.e);
                parcel.writeInt(this.f348f);
                parcel.writeInt(this.f350h ? 1 : 0);
                int[] iArr = this.f349g;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f349g);
            }

            public a() {
            }
        }

        public void b(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                a(i4);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i4, iArr2, i2, (iArr2.length - i2) - i3);
                int[] iArr3 = this.a;
                Arrays.fill(iArr3, iArr3.length - i3, iArr3.length, -1);
                List<a> list = this.f347b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f347b.get(size);
                        int i5 = aVar.e;
                        if (i5 >= i2) {
                            if (i5 < i4) {
                                this.f347b.remove(size);
                            } else {
                                aVar.e = i5 - i3;
                            }
                        }
                    }
                }
            }
        }

        public void a() {
            int[] iArr = this.a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f347b = null;
        }

        public void a(int i2, int i3) {
            int[] iArr = this.a;
            if (iArr != null && i2 < iArr.length) {
                int i4 = i2 + i3;
                a(i4);
                int[] iArr2 = this.a;
                System.arraycopy(iArr2, i2, iArr2, i4, (iArr2.length - i2) - i3);
                Arrays.fill(this.a, i2, i4, -1);
                List<a> list = this.f347b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        a aVar = this.f347b.get(size);
                        int i5 = aVar.e;
                        if (i5 >= i2) {
                            aVar.e = i5 + i3;
                        }
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f347b == null) {
                this.f347b = new ArrayList();
            }
            int size = this.f347b.size();
            for (int i2 = 0; i2 < size; i2++) {
                a aVar2 = this.f347b.get(i2);
                if (aVar2.e == aVar.e) {
                    this.f347b.remove(i2);
                }
                if (aVar2.e >= aVar.e) {
                    this.f347b.add(i2, aVar);
                    return;
                }
            }
            this.f347b.add(aVar);
        }

        public a a(int i2, int i3, int i4, boolean z) {
            List<a> list = this.f347b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = this.f347b.get(i5);
                int i6 = aVar.e;
                if (i6 >= i3) {
                    return null;
                }
                if (i6 >= i2 && (i4 == 0 || aVar.f348f == i4 || (z && aVar.f350h))) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public void h(int i2) {
        e eVar = this.I;
        if (!(eVar == null || eVar.e == i2)) {
            eVar.f353h = null;
            eVar.f352g = 0;
            eVar.e = -1;
            eVar.f351f = -1;
        }
        this.C = i2;
        this.D = RecyclerView.UNDEFINED_DURATION;
        o();
    }

    public final int i(int i2) {
        if (d() != 0) {
            if ((i2 < s()) != this.A) {
                return -1;
            }
            return 1;
        } else if (this.A) {
            return 1;
        } else {
            return -1;
        }
    }

    public final int j(int i2) {
        int a2 = this.t[0].a(i2);
        for (int i3 = 1; i3 < this.s; i3++) {
            int a3 = this.t[i3].a(i2);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    public void a(String str) {
        RecyclerView recyclerView;
        if (this.I == null && (recyclerView = this.f314b) != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public void a(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        int k2 = k() + j();
        int i6 = i() + l();
        if (this.w == 1) {
            i5 = RecyclerView.o.a(i3, rect.height() + i6, g());
            i4 = RecyclerView.o.a(i2, (this.x * this.s) + k2, h());
        } else {
            i4 = RecyclerView.o.a(i2, rect.width() + k2, h());
            i5 = RecyclerView.o.a(i3, (this.x * this.s) + i6, g());
        }
        this.f314b.setMeasuredDimension(i4, i5);
    }

    public final void b(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int f2;
        int k2 = k(Integer.MAX_VALUE);
        if (k2 != Integer.MAX_VALUE && (f2 = k2 - this.u.f()) > 0) {
            int c2 = f2 - c(f2, vVar, a0Var);
            if (z2 && c2 > 0) {
                this.u.a(-c2);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            h.r.d.n r0 = r4.y
            r1 = 0
            r0.f2132b = r1
            r0.c = r5
            androidx.recyclerview.widget.RecyclerView$z r0 = r4.f316g
            r2 = 1
            if (r0 == 0) goto L_0x0012
            boolean r0 = r0.e
            if (r0 == 0) goto L_0x0012
            r0 = 1
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 == 0) goto L_0x0033
            int r6 = r6.a
            r0 = -1
            if (r6 == r0) goto L_0x0033
            boolean r0 = r4.A
            if (r6 >= r5) goto L_0x0020
            r5 = 1
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            if (r0 != r5) goto L_0x002a
            h.r.d.t r5 = r4.u
            int r5 = r5.g()
            goto L_0x0034
        L_0x002a:
            h.r.d.t r5 = r4.u
            int r5 = r5.g()
            r6 = r5
            r5 = 0
            goto L_0x0035
        L_0x0033:
            r5 = 0
        L_0x0034:
            r6 = 0
        L_0x0035:
            androidx.recyclerview.widget.RecyclerView r0 = r4.f314b
            if (r0 == 0) goto L_0x003f
            boolean r0 = r0.mClipToPadding
            if (r0 == 0) goto L_0x003f
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0059
            h.r.d.n r0 = r4.y
            h.r.d.t r3 = r4.u
            int r3 = r3.f()
            int r3 = r3 - r6
            r0.f2133f = r3
            h.r.d.n r6 = r4.y
            h.r.d.t r0 = r4.u
            int r0 = r0.b()
            int r0 = r0 + r5
            r6.f2134g = r0
            goto L_0x0069
        L_0x0059:
            h.r.d.n r0 = r4.y
            h.r.d.t r3 = r4.u
            int r3 = r3.a()
            int r3 = r3 + r5
            r0.f2134g = r3
            h.r.d.n r5 = r4.y
            int r6 = -r6
            r5.f2133f = r6
        L_0x0069:
            h.r.d.n r5 = r4.y
            r5.f2135h = r1
            r5.a = r2
            h.r.d.t r6 = r4.u
            int r6 = r6.d()
            if (r6 != 0) goto L_0x0080
            h.r.d.t r6 = r4.u
            int r6 = r6.a()
            if (r6 != 0) goto L_0x0080
            r1 = 1
        L_0x0080:
            r5.f2136i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    public int a(RecyclerView.a0 a0Var) {
        return h(a0Var);
    }

    public final void a(View view, int i2, int i3, boolean z2) {
        boolean z3;
        Rect rect = this.K;
        RecyclerView recyclerView = this.f314b;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
        c cVar = (c) view.getLayoutParams();
        int i4 = cVar.leftMargin;
        Rect rect2 = this.K;
        int d2 = d(i2, i4 + rect2.left, cVar.rightMargin + rect2.right);
        int i5 = cVar.topMargin;
        Rect rect3 = this.K;
        int d3 = d(i3, i5 + rect3.top, cVar.bottomMargin + rect3.bottom);
        if (z2) {
            z3 = b(view, d2, d3, cVar);
        } else {
            z3 = a(view, d2, d3, (RecyclerView.p) cVar);
        }
        if (z3) {
            view.measure(d2, d3);
        }
    }

    public void b(RecyclerView recyclerView, int i2, int i3) {
        c(i2, i3, 2);
    }

    public final void b(RecyclerView.v vVar, int i2) {
        while (d() > 0) {
            View c2 = c(0);
            if (this.u.a(c2) <= i2 && this.u.e(c2) <= i2) {
                c cVar = (c) c2.getLayoutParams();
                if (cVar.f346f) {
                    int i3 = 0;
                    while (i3 < this.s) {
                        if (this.t[i3].a.size() != 1) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.s; i4++) {
                        this.t[i4].g();
                    }
                } else if (cVar.e.a.size() != 1) {
                    cVar.e.g();
                } else {
                    return;
                }
                a(c2, vVar);
            } else {
                return;
            }
        }
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            o();
        }
    }

    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, h.h.m.w.b bVar) {
        int i2;
        int i3;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.a(view, bVar);
            return;
        }
        c cVar = (c) layoutParams;
        if (this.w == 0) {
            f fVar = cVar.e;
            if (fVar == null) {
                i3 = -1;
            } else {
                i3 = fVar.e;
            }
            bVar.b((Object) b.c.a(i3, cVar.f346f ? this.s : 1, -1, -1, false, false));
            return;
        }
        f fVar2 = cVar.e;
        if (fVar2 == null) {
            i2 = -1;
        } else {
            i2 = fVar2.e;
        }
        bVar.b((Object) b.c.a(-1, -1, i2, cVar.f346f ? this.s : 1, false, false));
    }

    public boolean b() {
        return this.w == 1;
    }

    public int b(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return c(i2, vVar, a0Var);
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (d() > 0) {
            View b2 = b(false);
            View a2 = a(false);
            if (b2 != null && a2 != null) {
                int i2 = i(b2);
                int i3 = i(a2);
                if (i2 < i3) {
                    accessibilityEvent.setFromIndex(i2);
                    accessibilityEvent.setToIndex(i3);
                    return;
                }
                accessibilityEvent.setFromIndex(i3);
                accessibilityEvent.setToIndex(i2);
            }
        }
    }

    public int a(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.w == 1) {
            return this.s;
        }
        return super.a(vVar, a0Var);
    }

    public View a(boolean z2) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        View view = null;
        for (int d2 = d() - 1; d2 >= 0; d2--) {
            View c2 = c(d2);
            int d3 = this.u.d(c2);
            int a2 = this.u.a(c2);
            if (a2 > f2 && d3 < b2) {
                if (a2 <= b2 || !z2) {
                    return c2;
                }
                if (view == null) {
                    view = c2;
                }
            }
        }
        return view;
    }

    public final void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int b2;
        int j2 = j((int) RecyclerView.UNDEFINED_DURATION);
        if (j2 != Integer.MIN_VALUE && (b2 = this.u.b() - j2) > 0) {
            int i2 = b2 - (-c(-b2, vVar, a0Var));
            if (z2 && i2 > 0) {
                this.u.a(i2);
            }
        }
    }

    public void a(RecyclerView recyclerView, int i2, int i3) {
        c(i2, i3, 1);
    }

    public void a(RecyclerView recyclerView) {
        this.E.a();
        o();
    }

    public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        c(i2, i3, 8);
    }

    public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
        c(i2, i3, 4);
    }

    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v1, types: [boolean] */
    /* JADX WARNING: type inference failed for: r10v5 */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x02d2  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x02f9  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x032b  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x0341  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x035f  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0365  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(androidx.recyclerview.widget.RecyclerView.v r19, h.r.d.n r20, androidx.recyclerview.widget.RecyclerView.a0 r21) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            r8 = r20
            java.util.BitSet r0 = r6.B
            int r1 = r6.s
            r9 = 1
            r10 = 0
            r0.set(r10, r1, r9)
            h.r.d.n r0 = r6.y
            boolean r0 = r0.f2136i
            if (r0 == 0) goto L_0x0020
            int r0 = r8.e
            if (r0 != r9) goto L_0x001d
            r13 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x0030
        L_0x001d:
            r13 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0030
        L_0x0020:
            int r0 = r8.e
            if (r0 != r9) goto L_0x002a
            int r0 = r8.f2134g
            int r1 = r8.f2132b
            int r0 = r0 + r1
            goto L_0x002f
        L_0x002a:
            int r0 = r8.f2133f
            int r1 = r8.f2132b
            int r0 = r0 - r1
        L_0x002f:
            r13 = r0
        L_0x0030:
            int r0 = r8.e
            r6.c((int) r0, (int) r13)
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0040
            h.r.d.t r0 = r6.u
            int r0 = r0.b()
            goto L_0x0046
        L_0x0040:
            h.r.d.t r0 = r6.u
            int r0 = r0.f()
        L_0x0046:
            r14 = r0
            r0 = 0
        L_0x0048:
            int r1 = r8.c
            if (r1 < 0) goto L_0x0054
            int r2 = r21.a()
            if (r1 >= r2) goto L_0x0054
            r1 = 1
            goto L_0x0055
        L_0x0054:
            r1 = 0
        L_0x0055:
            r2 = -1
            if (r1 == 0) goto L_0x0374
            h.r.d.n r1 = r6.y
            boolean r1 = r1.f2136i
            if (r1 != 0) goto L_0x0066
            java.util.BitSet r1 = r6.B
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0374
        L_0x0066:
            int r0 = r8.c
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            androidx.recyclerview.widget.RecyclerView$d0 r0 = r7.a(r0, r10, r3)
            android.view.View r15 = r0.e
            int r0 = r8.c
            int r1 = r8.d
            int r0 = r0 + r1
            r8.c = r0
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            r5 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r5 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r5
            int r0 = r5.a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.E
            int[] r1 = r1.a
            if (r1 == 0) goto L_0x0092
            int r3 = r1.length
            if (r0 < r3) goto L_0x008f
            goto L_0x0092
        L_0x008f:
            r1 = r1[r0]
            goto L_0x0093
        L_0x0092:
            r1 = -1
        L_0x0093:
            if (r1 != r2) goto L_0x0097
            r3 = 1
            goto L_0x0098
        L_0x0097:
            r3 = 0
        L_0x0098:
            if (r3 == 0) goto L_0x0103
            boolean r1 = r5.f346f
            if (r1 == 0) goto L_0x00a3
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.t
            r1 = r1[r10]
            goto L_0x00f7
        L_0x00a3:
            int r1 = r8.e
            boolean r1 = r6.l(r1)
            if (r1 == 0) goto L_0x00b2
            int r1 = r6.s
            int r1 = r1 - r9
            r4 = -1
            r16 = -1
            goto L_0x00b8
        L_0x00b2:
            int r1 = r6.s
            r4 = r1
            r1 = 0
            r16 = 1
        L_0x00b8:
            int r11 = r8.e
            r17 = 0
            if (r11 != r9) goto L_0x00db
            h.r.d.t r11 = r6.u
            int r11 = r11.f()
            r12 = 2147483647(0x7fffffff, float:NaN)
        L_0x00c7:
            if (r1 == r4) goto L_0x00f5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r6.t
            r2 = r2[r1]
            int r10 = r2.a((int) r11)
            if (r10 >= r12) goto L_0x00d6
            r17 = r2
            r12 = r10
        L_0x00d6:
            int r1 = r1 + r16
            r2 = -1
            r10 = 0
            goto L_0x00c7
        L_0x00db:
            h.r.d.t r2 = r6.u
            int r2 = r2.b()
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x00e3:
            if (r1 == r4) goto L_0x00f5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r11 = r6.t
            r11 = r11[r1]
            int r12 = r11.b((int) r2)
            if (r12 <= r10) goto L_0x00f2
            r17 = r11
            r10 = r12
        L_0x00f2:
            int r1 = r1 + r16
            goto L_0x00e3
        L_0x00f5:
            r1 = r17
        L_0x00f7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r2 = r6.E
            r2.a((int) r0)
            int[] r2 = r2.a
            int r4 = r1.e
            r2[r0] = r4
            goto L_0x0107
        L_0x0103:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r2 = r6.t
            r1 = r2[r1]
        L_0x0107:
            r10 = r1
            r5.e = r10
            int r1 = r8.e
            if (r1 != r9) goto L_0x0114
            r1 = -1
            r2 = 0
            r6.a((android.view.View) r15, (int) r1, (boolean) r2)
            goto L_0x0118
        L_0x0114:
            r2 = 0
            r6.a((android.view.View) r15, (int) r2, (boolean) r2)
        L_0x0118:
            boolean r1 = r5.f346f
            if (r1 == 0) goto L_0x0154
            int r1 = r6.w
            if (r1 != r9) goto L_0x013a
            int r1 = r6.J
            int r2 = r6.r
            int r4 = r6.f325p
            int r11 = r18.l()
            int r12 = r18.i()
            int r12 = r12 + r11
            int r11 = r5.height
            int r2 = androidx.recyclerview.widget.RecyclerView.o.a((int) r2, (int) r4, (int) r12, (int) r11, (boolean) r9)
            r4 = 0
            r6.a((android.view.View) r15, (int) r1, (int) r2, (boolean) r4)
            goto L_0x019c
        L_0x013a:
            r4 = 0
            int r1 = r6.f326q
            int r2 = r6.f324o
            int r11 = r18.j()
            int r12 = r18.k()
            int r12 = r12 + r11
            int r11 = r5.width
            int r1 = androidx.recyclerview.widget.RecyclerView.o.a((int) r1, (int) r2, (int) r12, (int) r11, (boolean) r9)
            int r2 = r6.J
            r6.a((android.view.View) r15, (int) r1, (int) r2, (boolean) r4)
            goto L_0x019c
        L_0x0154:
            r4 = 0
            int r1 = r6.w
            if (r1 != r9) goto L_0x017b
            int r1 = r6.x
            int r2 = r6.f324o
            int r11 = r5.width
            int r1 = androidx.recyclerview.widget.RecyclerView.o.a((int) r1, (int) r2, (int) r4, (int) r11, (boolean) r4)
            int r2 = r6.r
            int r11 = r6.f325p
            int r12 = r18.l()
            int r16 = r18.i()
            int r12 = r16 + r12
            int r7 = r5.height
            int r2 = androidx.recyclerview.widget.RecyclerView.o.a((int) r2, (int) r11, (int) r12, (int) r7, (boolean) r9)
            r6.a((android.view.View) r15, (int) r1, (int) r2, (boolean) r4)
            goto L_0x019c
        L_0x017b:
            int r1 = r6.f326q
            int r2 = r6.f324o
            int r4 = r18.j()
            int r7 = r18.k()
            int r7 = r7 + r4
            int r4 = r5.width
            int r1 = androidx.recyclerview.widget.RecyclerView.o.a((int) r1, (int) r2, (int) r7, (int) r4, (boolean) r9)
            int r2 = r6.x
            int r4 = r6.f325p
            int r7 = r5.height
            r11 = 0
            int r2 = androidx.recyclerview.widget.RecyclerView.o.a((int) r2, (int) r4, (int) r11, (int) r7, (boolean) r11)
            r6.a((android.view.View) r15, (int) r1, (int) r2, (boolean) r11)
        L_0x019c:
            int r1 = r8.e
            if (r1 != r9) goto L_0x01e8
            boolean r1 = r5.f346f
            if (r1 == 0) goto L_0x01a9
            int r1 = r6.j((int) r14)
            goto L_0x01ad
        L_0x01a9:
            int r1 = r10.a((int) r14)
        L_0x01ad:
            h.r.d.t r2 = r6.u
            int r2 = r2.b(r15)
            int r2 = r2 + r1
            if (r3 == 0) goto L_0x01e5
            boolean r4 = r5.f346f
            if (r4 == 0) goto L_0x01e5
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r4 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a
            r4.<init>()
            int r7 = r6.s
            int[] r7 = new int[r7]
            r4.f349g = r7
            r7 = 0
        L_0x01c6:
            int r11 = r6.s
            if (r7 >= r11) goto L_0x01db
            int[] r11 = r4.f349g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r6.t
            r12 = r12[r7]
            int r12 = r12.a((int) r1)
            int r12 = r1 - r12
            r11[r7] = r12
            int r7 = r7 + 1
            goto L_0x01c6
        L_0x01db:
            r7 = -1
            r4.f348f = r7
            r4.e = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.a((androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r4)
        L_0x01e5:
            r4 = r1
            r7 = r2
            goto L_0x022e
        L_0x01e8:
            boolean r1 = r5.f346f
            if (r1 == 0) goto L_0x01f1
            int r1 = r6.k(r14)
            goto L_0x01f5
        L_0x01f1:
            int r1 = r10.b((int) r14)
        L_0x01f5:
            h.r.d.t r2 = r6.u
            int r2 = r2.b(r15)
            int r2 = r1 - r2
            if (r3 == 0) goto L_0x022c
            boolean r4 = r5.f346f
            if (r4 == 0) goto L_0x022c
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r4 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a
            r4.<init>()
            int r7 = r6.s
            int[] r7 = new int[r7]
            r4.f349g = r7
            r7 = 0
        L_0x020f:
            int r11 = r6.s
            if (r7 >= r11) goto L_0x0223
            int[] r11 = r4.f349g
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r12 = r6.t
            r12 = r12[r7]
            int r12 = r12.b((int) r1)
            int r12 = r12 - r1
            r11[r7] = r12
            int r7 = r7 + 1
            goto L_0x020f
        L_0x0223:
            r4.f348f = r9
            r4.e = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.a((androidx.recyclerview.widget.StaggeredGridLayoutManager.d.a) r4)
        L_0x022c:
            r7 = r1
            r4 = r2
        L_0x022e:
            boolean r1 = r5.f346f
            if (r1 == 0) goto L_0x0293
            int r1 = r8.d
            r2 = -1
            if (r1 != r2) goto L_0x0293
            if (r3 == 0) goto L_0x023c
            r6.M = r9
            goto L_0x0293
        L_0x023c:
            int r1 = r8.e
            if (r1 != r9) goto L_0x0262
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.t
            r2 = 0
            r1 = r1[r2]
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            int r1 = r1.a((int) r11)
            r2 = 1
        L_0x024c:
            int r3 = r6.s
            if (r2 >= r3) goto L_0x025f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r6.t
            r3 = r3[r2]
            int r3 = r3.a((int) r11)
            if (r3 == r1) goto L_0x025c
            r1 = 0
            goto L_0x0260
        L_0x025c:
            int r2 = r2 + 1
            goto L_0x024c
        L_0x025f:
            r1 = 1
        L_0x0260:
            r1 = r1 ^ r9
            goto L_0x0284
        L_0x0262:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.t
            r2 = 0
            r1 = r1[r2]
            int r1 = r1.b((int) r11)
            r2 = 1
        L_0x026e:
            int r3 = r6.s
            if (r2 >= r3) goto L_0x0281
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r3 = r6.t
            r3 = r3[r2]
            int r3 = r3.b((int) r11)
            if (r3 == r1) goto L_0x027e
            r2 = 0
            goto L_0x0282
        L_0x027e:
            int r2 = r2 + 1
            goto L_0x026e
        L_0x0281:
            r2 = 1
        L_0x0282:
            r1 = r2 ^ 1
        L_0x0284:
            if (r1 == 0) goto L_0x0295
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r1 = r6.E
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a r0 = r1.c(r0)
            if (r0 == 0) goto L_0x0290
            r0.f350h = r9
        L_0x0290:
            r6.M = r9
            goto L_0x0295
        L_0x0293:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
        L_0x0295:
            int r0 = r8.e
            if (r0 != r9) goto L_0x02b1
            boolean r0 = r5.f346f
            if (r0 == 0) goto L_0x02ab
            int r0 = r6.s
        L_0x029f:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L_0x02c8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.t
            r1 = r1[r0]
            r1.a((android.view.View) r15)
            goto L_0x029f
        L_0x02ab:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r5.e
            r0.a((android.view.View) r15)
            goto L_0x02c8
        L_0x02b1:
            boolean r0 = r5.f346f
            if (r0 == 0) goto L_0x02c3
            int r0 = r6.s
        L_0x02b7:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L_0x02c8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r1 = r6.t
            r1 = r1[r0]
            r1.c(r15)
            goto L_0x02b7
        L_0x02c3:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r0 = r5.e
            r0.c(r15)
        L_0x02c8:
            boolean r0 = r18.v()
            if (r0 == 0) goto L_0x02f9
            int r0 = r6.w
            if (r0 != r9) goto L_0x02f9
            boolean r0 = r5.f346f
            if (r0 == 0) goto L_0x02dd
            h.r.d.t r0 = r6.v
            int r0 = r0.b()
            goto L_0x02ee
        L_0x02dd:
            h.r.d.t r0 = r6.v
            int r0 = r0.b()
            int r1 = r6.s
            int r1 = r1 - r9
            int r2 = r10.e
            int r1 = r1 - r2
            int r2 = r6.x
            int r1 = r1 * r2
            int r0 = r0 - r1
        L_0x02ee:
            h.r.d.t r1 = r6.v
            int r1 = r1.b(r15)
            int r1 = r0 - r1
            r12 = r0
            r3 = r1
            goto L_0x031a
        L_0x02f9:
            boolean r0 = r5.f346f
            if (r0 == 0) goto L_0x0304
            h.r.d.t r0 = r6.v
            int r0 = r0.f()
            goto L_0x0311
        L_0x0304:
            int r0 = r10.e
            int r1 = r6.x
            int r0 = r0 * r1
            h.r.d.t r1 = r6.v
            int r1 = r1.f()
            int r0 = r0 + r1
        L_0x0311:
            h.r.d.t r1 = r6.v
            int r1 = r1.b(r15)
            int r1 = r1 + r0
            r3 = r0
            r12 = r1
        L_0x031a:
            int r0 = r6.w
            if (r0 != r9) goto L_0x032b
            r0 = r18
            r1 = r15
            r2 = r3
            r3 = r4
            r4 = r12
            r12 = r5
            r5 = r7
            r0.a((android.view.View) r1, (int) r2, (int) r3, (int) r4, (int) r5)
            r7 = r12
            goto L_0x0335
        L_0x032b:
            r0 = r18
            r1 = r15
            r2 = r4
            r4 = r7
            r7 = r5
            r5 = r12
            r0.a((android.view.View) r1, (int) r2, (int) r3, (int) r4, (int) r5)
        L_0x0335:
            boolean r0 = r7.f346f
            if (r0 == 0) goto L_0x0341
            h.r.d.n r0 = r6.y
            int r0 = r0.e
            r6.c((int) r0, (int) r13)
            goto L_0x0348
        L_0x0341:
            h.r.d.n r0 = r6.y
            int r0 = r0.e
            r6.a((androidx.recyclerview.widget.StaggeredGridLayoutManager.f) r10, (int) r0, (int) r13)
        L_0x0348:
            h.r.d.n r0 = r6.y
            r1 = r19
            r6.a((androidx.recyclerview.widget.RecyclerView.v) r1, (h.r.d.n) r0)
            h.r.d.n r0 = r6.y
            boolean r0 = r0.f2135h
            if (r0 == 0) goto L_0x036e
            boolean r0 = r15.hasFocusable()
            if (r0 == 0) goto L_0x036e
            boolean r0 = r7.f346f
            if (r0 == 0) goto L_0x0365
            java.util.BitSet r0 = r6.B
            r0.clear()
            goto L_0x036e
        L_0x0365:
            java.util.BitSet r0 = r6.B
            int r2 = r10.e
            r3 = 0
            r0.set(r2, r3)
            goto L_0x036f
        L_0x036e:
            r3 = 0
        L_0x036f:
            r7 = r1
            r0 = 1
            r10 = 0
            goto L_0x0048
        L_0x0374:
            r1 = r7
            r3 = 0
            if (r0 != 0) goto L_0x037d
            h.r.d.n r0 = r6.y
            r6.a((androidx.recyclerview.widget.RecyclerView.v) r1, (h.r.d.n) r0)
        L_0x037d:
            h.r.d.n r0 = r6.y
            int r0 = r0.e
            r1 = -1
            if (r0 != r1) goto L_0x0396
            h.r.d.t r0 = r6.u
            int r0 = r0.f()
            int r0 = r6.k(r0)
            h.r.d.t r1 = r6.u
            int r1 = r1.f()
            int r1 = r1 - r0
            goto L_0x03a8
        L_0x0396:
            h.r.d.t r0 = r6.u
            int r0 = r0.b()
            int r0 = r6.j((int) r0)
            h.r.d.t r1 = r6.u
            int r1 = r1.b()
            int r1 = r0 - r1
        L_0x03a8:
            if (r1 <= 0) goto L_0x03b1
            int r0 = r8.f2132b
            int r10 = java.lang.Math.min(r0, r1)
            goto L_0x03b2
        L_0x03b1:
            r10 = 0
        L_0x03b2:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$v, h.r.d.n, androidx.recyclerview.widget.RecyclerView$a0):int");
    }

    public int c(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L_0x0009
            int r0 = r6.t()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.s()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.d(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.a(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.b(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.a(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.A
            if (r7 == 0) goto L_0x004d
            int r7 = r6.s()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.t()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.o()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(int, int, int):void");
    }

    public final void c(int i2, int i3) {
        for (int i4 = 0; i4 < this.s; i4++) {
            if (!this.t[i4].a.isEmpty()) {
                a(this.t[i4], i2, i3);
            }
        }
    }

    public int c(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (d() == 0 || i2 == 0) {
            return 0;
        }
        a(i2, a0Var);
        int a2 = a(vVar, this.y, a0Var);
        if (this.y.f2132b >= a2) {
            i2 = i2 < 0 ? -a2 : a2;
        }
        this.u.a(-i2);
        this.G = this.A;
        n nVar = this.y;
        nVar.f2132b = 0;
        a(vVar, nVar);
        return i2;
    }

    public RecyclerView.p c() {
        if (this.w == 0) {
            return new c(-2, -1);
        }
        return new c(-1, -2);
    }

    public final void a(RecyclerView.v vVar, n nVar) {
        int i2;
        int i3;
        if (nVar.a && !nVar.f2136i) {
            if (nVar.f2132b != 0) {
                int i4 = 1;
                if (nVar.e == -1) {
                    int i5 = nVar.f2133f;
                    int b2 = this.t[0].b(i5);
                    while (i4 < this.s) {
                        int b3 = this.t[i4].b(i5);
                        if (b3 > b2) {
                            b2 = b3;
                        }
                        i4++;
                    }
                    int i6 = i5 - b2;
                    if (i6 < 0) {
                        i3 = nVar.f2134g;
                    } else {
                        i3 = nVar.f2134g - Math.min(i6, nVar.f2132b);
                    }
                    a(vVar, i3);
                    return;
                }
                int i7 = nVar.f2134g;
                int a2 = this.t[0].a(i7);
                while (i4 < this.s) {
                    int a3 = this.t[i4].a(i7);
                    if (a3 < a2) {
                        a2 = a3;
                    }
                    i4++;
                }
                int i8 = a2 - nVar.f2134g;
                if (i8 < 0) {
                    i2 = nVar.f2133f;
                } else {
                    i2 = Math.min(i8, nVar.f2132b) + nVar.f2133f;
                }
                b(vVar, i2);
            } else if (nVar.e == -1) {
                a(vVar, nVar.f2134g);
            } else {
                b(vVar, nVar.f2133f);
            }
        }
    }

    public final void a(RecyclerView.v vVar, int i2) {
        int d2 = d() - 1;
        while (d2 >= 0) {
            View c2 = c(d2);
            if (this.u.d(c2) >= i2 && this.u.f(c2) >= i2) {
                c cVar = (c) c2.getLayoutParams();
                if (cVar.f346f) {
                    int i3 = 0;
                    while (i3 < this.s) {
                        if (this.t[i3].a.size() != 1) {
                            i3++;
                        } else {
                            return;
                        }
                    }
                    for (int i4 = 0; i4 < this.s; i4++) {
                        this.t[i4].f();
                    }
                } else if (cVar.e.a.size() != 1) {
                    cVar.e.f();
                } else {
                    return;
                }
                a(c2, vVar);
                d2--;
            } else {
                return;
            }
        }
    }

    public boolean a() {
        return this.w == 0;
    }

    public int a(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return c(i2, vVar, a0Var);
    }

    public PointF a(int i2) {
        int i3 = i(i2);
        PointF pointF = new PointF();
        if (i3 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = (float) i3;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = (float) i3;
        }
        return pointF;
    }

    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i2) {
        o oVar = new o(recyclerView.getContext());
        oVar.a = i2;
        a((RecyclerView.z) oVar);
    }

    public void a(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int i4;
        int i5;
        if (this.w != 0) {
            i2 = i3;
        }
        if (d() != 0 && i2 != 0) {
            a(i2, a0Var);
            int[] iArr = this.O;
            if (iArr == null || iArr.length < this.s) {
                this.O = new int[this.s];
            }
            int i6 = 0;
            for (int i7 = 0; i7 < this.s; i7++) {
                n nVar = this.y;
                if (nVar.d == -1) {
                    i5 = nVar.f2133f;
                    i4 = this.t[i7].b(i5);
                } else {
                    i5 = this.t[i7].a(nVar.f2134g);
                    i4 = this.y.f2134g;
                }
                int i8 = i5 - i4;
                if (i8 >= 0) {
                    this.O[i6] = i8;
                    i6++;
                }
            }
            Arrays.sort(this.O, 0, i6);
            int i9 = 0;
            while (i9 < i6) {
                int i10 = this.y.c;
                if (i10 >= 0 && i10 < a0Var.a()) {
                    ((m.b) cVar).a(this.y.c, this.O[i9]);
                    n nVar2 = this.y;
                    nVar2.c += nVar2.d;
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public void a(int i2, RecyclerView.a0 a0Var) {
        int i3;
        int i4;
        if (i2 > 0) {
            i4 = t();
            i3 = 1;
        } else {
            i4 = s();
            i3 = -1;
        }
        this.y.a = true;
        b(i4, a0Var);
        m(i3);
        n nVar = this.y;
        nVar.c = i4 + nVar.d;
        nVar.f2132b = Math.abs(i2);
    }

    public RecyclerView.p a(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    public RecyclerView.p a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new c((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new c(layoutParams);
    }

    public boolean a(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r9.w == 1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        if (r9.w == 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        if (v() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        if (v() == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a(android.view.View r10, int r11, androidx.recyclerview.widget.RecyclerView.v r12, androidx.recyclerview.widget.RecyclerView.a0 r13) {
        /*
            r9 = this;
            int r0 = r9.d()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r10 = r9.b((android.view.View) r10)
            if (r10 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r9.w()
            r0 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            if (r11 == r3) goto L_0x0051
            r4 = 2
            if (r11 == r4) goto L_0x0045
            r4 = 17
            if (r11 == r4) goto L_0x0040
            r4 = 33
            if (r11 == r4) goto L_0x003a
            r4 = 66
            if (r11 == r4) goto L_0x0035
            r4 = 130(0x82, float:1.82E-43)
            if (r11 == r4) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            int r11 = r9.w
            if (r11 != r3) goto L_0x0032
        L_0x0030:
            r11 = 1
            goto L_0x005d
        L_0x0032:
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005d
        L_0x0035:
            int r11 = r9.w
            if (r11 != 0) goto L_0x0032
            goto L_0x0030
        L_0x003a:
            int r11 = r9.w
            if (r11 != r3) goto L_0x0032
        L_0x003e:
            r11 = -1
            goto L_0x005d
        L_0x0040:
            int r11 = r9.w
            if (r11 != 0) goto L_0x0032
        L_0x0044:
            goto L_0x003e
        L_0x0045:
            int r11 = r9.w
            if (r11 != r3) goto L_0x004a
            goto L_0x0030
        L_0x004a:
            boolean r11 = r9.v()
            if (r11 == 0) goto L_0x0030
            goto L_0x0055
        L_0x0051:
            int r11 = r9.w
            if (r11 != r3) goto L_0x0056
        L_0x0055:
            goto L_0x0044
        L_0x0056:
            boolean r11 = r9.v()
            if (r11 == 0) goto L_0x003e
            goto L_0x0030
        L_0x005d:
            if (r11 != r2) goto L_0x0060
            return r1
        L_0x0060:
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r2
            boolean r4 = r2.f346f
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r2 = r2.e
            if (r11 != r3) goto L_0x0071
            int r5 = r9.t()
            goto L_0x0075
        L_0x0071:
            int r5 = r9.s()
        L_0x0075:
            r9.b((int) r5, (androidx.recyclerview.widget.RecyclerView.a0) r13)
            r9.m(r11)
            h.r.d.n r6 = r9.y
            int r7 = r6.d
            int r7 = r7 + r5
            r6.c = r7
            r7 = 1051372203(0x3eaaaaab, float:0.33333334)
            h.r.d.t r8 = r9.u
            int r8 = r8.g()
            float r8 = (float) r8
            float r8 = r8 * r7
            int r7 = (int) r8
            r6.f2132b = r7
            h.r.d.n r6 = r9.y
            r6.f2135h = r3
            r7 = 0
            r6.a = r7
            r9.a((androidx.recyclerview.widget.RecyclerView.v) r12, (h.r.d.n) r6, (androidx.recyclerview.widget.RecyclerView.a0) r13)
            boolean r12 = r9.A
            r9.G = r12
            if (r4 != 0) goto L_0x00aa
            android.view.View r12 = r2.a(r5, r11)
            if (r12 == 0) goto L_0x00aa
            if (r12 == r10) goto L_0x00aa
            return r12
        L_0x00aa:
            boolean r12 = r9.l(r11)
            if (r12 == 0) goto L_0x00c5
            int r12 = r9.s
            int r12 = r12 - r3
        L_0x00b3:
            if (r12 < 0) goto L_0x00da
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r13 = r9.t
            r13 = r13[r12]
            android.view.View r13 = r13.a(r5, r11)
            if (r13 == 0) goto L_0x00c2
            if (r13 == r10) goto L_0x00c2
            return r13
        L_0x00c2:
            int r12 = r12 + -1
            goto L_0x00b3
        L_0x00c5:
            r12 = 0
        L_0x00c6:
            int r13 = r9.s
            if (r12 >= r13) goto L_0x00da
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r13 = r9.t
            r13 = r13[r12]
            android.view.View r13 = r13.a(r5, r11)
            if (r13 == 0) goto L_0x00d7
            if (r13 == r10) goto L_0x00d7
            return r13
        L_0x00d7:
            int r12 = r12 + 1
            goto L_0x00c6
        L_0x00da:
            boolean r12 = r9.z
            r12 = r12 ^ r3
            if (r11 != r0) goto L_0x00e1
            r13 = 1
            goto L_0x00e2
        L_0x00e1:
            r13 = 0
        L_0x00e2:
            if (r12 != r13) goto L_0x00e6
            r12 = 1
            goto L_0x00e7
        L_0x00e6:
            r12 = 0
        L_0x00e7:
            if (r4 != 0) goto L_0x00fd
            if (r12 == 0) goto L_0x00f0
            int r13 = r2.d()
            goto L_0x00f4
        L_0x00f0:
            int r13 = r2.e()
        L_0x00f4:
            android.view.View r13 = r9.b((int) r13)
            if (r13 == 0) goto L_0x00fd
            if (r13 == r10) goto L_0x00fd
            return r13
        L_0x00fd:
            boolean r11 = r9.l(r11)
            if (r11 == 0) goto L_0x012c
            int r11 = r9.s
            int r11 = r11 - r3
        L_0x0106:
            if (r11 < 0) goto L_0x014f
            int r13 = r2.e
            if (r11 != r13) goto L_0x010d
            goto L_0x0129
        L_0x010d:
            if (r12 == 0) goto L_0x0118
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r13 = r9.t
            r13 = r13[r11]
            int r13 = r13.d()
            goto L_0x0120
        L_0x0118:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r13 = r9.t
            r13 = r13[r11]
            int r13 = r13.e()
        L_0x0120:
            android.view.View r13 = r9.b((int) r13)
            if (r13 == 0) goto L_0x0129
            if (r13 == r10) goto L_0x0129
            return r13
        L_0x0129:
            int r11 = r11 + -1
            goto L_0x0106
        L_0x012c:
            int r11 = r9.s
            if (r7 >= r11) goto L_0x014f
            if (r12 == 0) goto L_0x013b
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r11 = r9.t
            r11 = r11[r7]
            int r11 = r11.d()
            goto L_0x0143
        L_0x013b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f[] r11 = r9.t
            r11 = r11[r7]
            int r11 = r11.e()
        L_0x0143:
            android.view.View r11 = r9.b((int) r11)
            if (r11 == 0) goto L_0x014c
            if (r11 == r10) goto L_0x014c
            return r11
        L_0x014c:
            int r7 = r7 + 1
            goto L_0x012c
        L_0x014f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    public final void a(f fVar, int i2, int i3) {
        int i4 = fVar.d;
        if (i2 == -1) {
            int i5 = fVar.f360b;
            if (i5 == Integer.MIN_VALUE) {
                fVar.b();
                i5 = fVar.f360b;
            }
            if (i5 + i4 <= i3) {
                this.B.set(fVar.e, false);
                return;
            }
            return;
        }
        int i6 = fVar.c;
        if (i6 == Integer.MIN_VALUE) {
            fVar.a();
            i6 = fVar.c;
        }
        if (i6 - i4 >= i3) {
            this.B.set(fVar.e, false);
        }
    }
}
