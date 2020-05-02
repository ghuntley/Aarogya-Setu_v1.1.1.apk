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
import h.r.d.m;
import h.r.d.o;
import h.r.d.t;
import java.util.List;

public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    public int A = -1;
    public int B = RecyclerView.UNDEFINED_DURATION;
    public d C = null;
    public final a D = new a();
    public final b E = new b();
    public int F = 2;
    public int[] G = new int[2];
    public int s = 1;
    public c t;
    public t u;
    public boolean v;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = true;

    public static class b {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f269b;
        public boolean c;
        public boolean d;
    }

    public static class c {
        public boolean a = true;

        /* renamed from: b  reason: collision with root package name */
        public int f270b;
        public int c;
        public int d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f271f;

        /* renamed from: g  reason: collision with root package name */
        public int f272g;

        /* renamed from: h  reason: collision with root package name */
        public int f273h = 0;

        /* renamed from: i  reason: collision with root package name */
        public int f274i = 0;

        /* renamed from: j  reason: collision with root package name */
        public boolean f275j;

        /* renamed from: k  reason: collision with root package name */
        public int f276k;

        /* renamed from: l  reason: collision with root package name */
        public List<RecyclerView.d0> f277l = null;

        /* renamed from: m  reason: collision with root package name */
        public boolean f278m;

        public boolean a(RecyclerView.a0 a0Var) {
            int i2 = this.d;
            return i2 >= 0 && i2 < a0Var.a();
        }

        public View a(RecyclerView.v vVar) {
            List<RecyclerView.d0> list = this.f277l;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    View view = this.f277l.get(i2).e;
                    RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                    if (!pVar.c() && this.d == pVar.a()) {
                        a(view);
                        return view;
                    }
                }
                return null;
            }
            View view2 = vVar.a(this.d, false, RecyclerView.FOREVER_NS).e;
            this.d += this.e;
            return view2;
        }

        public void a(View view) {
            int a2;
            int size = this.f277l.size();
            View view2 = null;
            int i2 = Integer.MAX_VALUE;
            for (int i3 = 0; i3 < size; i3++) {
                View view3 = this.f277l.get(i3).e;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a2 = (pVar.a() - this.d) * this.e) >= 0 && a2 < i2) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i2 = a2;
                }
            }
            if (view2 == null) {
                this.d = -1;
            } else {
                this.d = ((RecyclerView.p) view2.getLayoutParams()).a();
            }
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public int f279f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f280g;

        public static class a implements Parcelable.Creator<d> {
            public Object createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            public Object[] newArray(int i2) {
                return new d[i2];
            }
        }

        public d() {
        }

        public boolean a() {
            return this.e >= 0;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.e);
            parcel.writeInt(this.f279f);
            parcel.writeInt(this.f280g ? 1 : 0);
        }

        public d(Parcel parcel) {
            this.e = parcel.readInt();
            this.f279f = parcel.readInt();
            this.f280g = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.e = dVar.e;
            this.f279f = dVar.f279f;
            this.f280g = dVar.f280g;
        }
    }

    public LinearLayoutManager(int i2, boolean z2) {
        j(i2);
        a((String) null);
        if (z2 != this.w) {
            this.w = z2;
            o();
        }
    }

    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (d() > 0) {
            accessibilityEvent.setFromIndex(s());
            accessibilityEvent.setToIndex(t());
        }
    }

    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i2) {
    }

    public void a(RecyclerView recyclerView, RecyclerView.v vVar) {
    }

    public boolean b() {
        return this.s == 1;
    }

    public RecyclerView.p c() {
        return new RecyclerView.p(-2, -2);
    }

    public final void d(int i2, int i3) {
        this.t.c = this.u.b() - i3;
        this.t.e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.d = i2;
        cVar.f271f = 1;
        cVar.f270b = i3;
        cVar.f272g = RecyclerView.UNDEFINED_DURATION;
    }

    public final void e(int i2, int i3) {
        this.t.c = i3 - this.u.f();
        c cVar = this.t;
        cVar.d = i2;
        cVar.e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f271f = -1;
        cVar2.f270b = i3;
        cVar2.f272g = RecyclerView.UNDEFINED_DURATION;
    }

    public int f(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    public void g(RecyclerView.a0 a0Var) {
        this.C = null;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D.b();
    }

    public void h(int i2) {
        this.A = i2;
        this.B = RecyclerView.UNDEFINED_DURATION;
        d dVar = this.C;
        if (dVar != null) {
            dVar.e = -1;
        }
        o();
    }

    public final int i(RecyclerView.a0 a0Var) {
        if (d() == 0) {
            return 0;
        }
        r();
        t tVar = this.u;
        View b2 = b(!this.z, true);
        return g.a.a.b.a.a(a0Var, tVar, b2, a(!this.z, true), (RecyclerView.o) this, this.z, this.x);
    }

    public void j(int i2) {
        if (i2 == 0 || i2 == 1) {
            a((String) null);
            if (i2 != this.s || this.u == null) {
                t a2 = t.a(this, i2);
                this.u = a2;
                this.D.a = a2;
                this.s = i2;
                o();
                return;
            }
            return;
        }
        throw new IllegalArgumentException(i.a.a.a.a.b("invalid orientation:", i2));
    }

    public boolean m() {
        return true;
    }

    public Parcelable n() {
        if (this.C != null) {
            return new d(this.C);
        }
        d dVar = new d();
        if (d() > 0) {
            r();
            boolean z2 = this.v ^ this.x;
            dVar.f280g = z2;
            if (z2) {
                View u2 = u();
                dVar.f279f = this.u.b() - this.u.a(u2);
                dVar.e = i(u2);
            } else {
                View v2 = v();
                dVar.e = i(v2);
                dVar.f279f = this.u.d(v2) - this.u.f();
            }
        } else {
            dVar.e = -1;
        }
        return dVar;
    }

    public boolean p() {
        boolean z2;
        if (!(this.f325p == 1073741824 || this.f324o == 1073741824)) {
            int d2 = d();
            int i2 = 0;
            while (true) {
                if (i2 >= d2) {
                    z2 = false;
                    break;
                }
                ViewGroup.LayoutParams layoutParams = c(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    z2 = true;
                    break;
                }
                i2++;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    public boolean q() {
        return this.C == null && this.v == this.y;
    }

    public void r() {
        if (this.t == null) {
            this.t = new c();
        }
    }

    public int s() {
        View a2 = a(0, d(), false, true);
        if (a2 == null) {
            return -1;
        }
        return i(a2);
    }

    public int t() {
        View a2 = a(d() - 1, -1, false, true);
        if (a2 == null) {
            return -1;
        }
        return i(a2);
    }

    public final View u() {
        return c(this.x ? 0 : d() - 1);
    }

    public final View v() {
        return c(this.x ? d() - 1 : 0);
    }

    public boolean w() {
        return f() == 1;
    }

    public boolean x() {
        return this.u.d() == 0 && this.u.a() == 0;
    }

    public final void y() {
        if (this.s == 1 || !w()) {
            this.x = this.w;
        } else {
            this.x = !this.w;
        }
    }

    public View b(int i2) {
        int d2 = d();
        if (d2 == 0) {
            return null;
        }
        int i3 = i2 - i(c(0));
        if (i3 >= 0 && i3 < d2) {
            View c2 = c(i3);
            if (i(c2) == i2) {
                return c2;
            }
        }
        return super.b(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0182  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void c(androidx.recyclerview.widget.RecyclerView.v r17, androidx.recyclerview.widget.RecyclerView.a0 r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.C
            r4 = -1
            if (r3 != 0) goto L_0x000f
            int r3 = r0.A
            if (r3 == r4) goto L_0x0019
        L_0x000f:
            int r3 = r18.a()
            if (r3 != 0) goto L_0x0019
            r16.b((androidx.recyclerview.widget.RecyclerView.v) r17)
            return
        L_0x0019:
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.C
            if (r3 == 0) goto L_0x0029
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0029
            androidx.recyclerview.widget.LinearLayoutManager$d r3 = r0.C
            int r3 = r3.e
            r0.A = r3
        L_0x0029:
            r16.r()
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            r5 = 0
            r3.a = r5
            r16.y()
            android.view.View r3 = r16.e()
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.D
            boolean r6 = r6.e
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = 1
            if (r6 == 0) goto L_0x0073
            int r6 = r0.A
            if (r6 != r4) goto L_0x0073
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.C
            if (r6 == 0) goto L_0x004a
            goto L_0x0073
        L_0x004a:
            if (r3 == 0) goto L_0x0243
            h.r.d.t r6 = r0.u
            int r6 = r6.d(r3)
            h.r.d.t r9 = r0.u
            int r9 = r9.b()
            if (r6 >= r9) goto L_0x0068
            h.r.d.t r6 = r0.u
            int r6 = r6.a((android.view.View) r3)
            h.r.d.t r9 = r0.u
            int r9 = r9.f()
            if (r6 > r9) goto L_0x0243
        L_0x0068:
            androidx.recyclerview.widget.LinearLayoutManager$a r6 = r0.D
            int r9 = r0.i(r3)
            r6.b(r3, r9)
            goto L_0x0243
        L_0x0073:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.D
            r3.b()
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.D
            boolean r6 = r0.x
            boolean r9 = r0.y
            r6 = r6 ^ r9
            r3.d = r6
            boolean r6 = r2.f283g
            if (r6 != 0) goto L_0x017d
            int r6 = r0.A
            if (r6 != r4) goto L_0x008b
            goto L_0x017d
        L_0x008b:
            if (r6 < 0) goto L_0x0179
            int r9 = r18.a()
            if (r6 < r9) goto L_0x0095
            goto L_0x0179
        L_0x0095:
            int r6 = r0.A
            r3.f268b = r6
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.C
            if (r6 == 0) goto L_0x00c9
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x00c9
            androidx.recyclerview.widget.LinearLayoutManager$d r6 = r0.C
            boolean r6 = r6.f280g
            r3.d = r6
            if (r6 == 0) goto L_0x00ba
            h.r.d.t r6 = r0.u
            int r6 = r6.b()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.C
            int r9 = r9.f279f
            int r6 = r6 - r9
            r3.c = r6
            goto L_0x0177
        L_0x00ba:
            h.r.d.t r6 = r0.u
            int r6 = r6.f()
            androidx.recyclerview.widget.LinearLayoutManager$d r9 = r0.C
            int r9 = r9.f279f
            int r6 = r6 + r9
            r3.c = r6
            goto L_0x0177
        L_0x00c9:
            int r6 = r0.B
            if (r6 != r7) goto L_0x015a
            int r6 = r0.A
            android.view.View r6 = r0.b((int) r6)
            if (r6 == 0) goto L_0x0138
            h.r.d.t r9 = r0.u
            int r9 = r9.b(r6)
            h.r.d.t r10 = r0.u
            int r10 = r10.g()
            if (r9 <= r10) goto L_0x00e8
            r3.a()
            goto L_0x0177
        L_0x00e8:
            h.r.d.t r9 = r0.u
            int r9 = r9.d(r6)
            h.r.d.t r10 = r0.u
            int r10 = r10.f()
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x0103
            h.r.d.t r6 = r0.u
            int r6 = r6.f()
            r3.c = r6
            r3.d = r5
            goto L_0x0177
        L_0x0103:
            h.r.d.t r9 = r0.u
            int r9 = r9.b()
            h.r.d.t r10 = r0.u
            int r10 = r10.a((android.view.View) r6)
            int r9 = r9 - r10
            if (r9 >= 0) goto L_0x011d
            h.r.d.t r6 = r0.u
            int r6 = r6.b()
            r3.c = r6
            r3.d = r8
            goto L_0x0177
        L_0x011d:
            boolean r9 = r3.d
            if (r9 == 0) goto L_0x012f
            h.r.d.t r9 = r0.u
            int r6 = r9.a((android.view.View) r6)
            h.r.d.t r9 = r0.u
            int r9 = r9.h()
            int r9 = r9 + r6
            goto L_0x0135
        L_0x012f:
            h.r.d.t r9 = r0.u
            int r9 = r9.d(r6)
        L_0x0135:
            r3.c = r9
            goto L_0x0177
        L_0x0138:
            int r6 = r16.d()
            if (r6 <= 0) goto L_0x0156
            android.view.View r6 = r0.c((int) r5)
            int r6 = r0.i(r6)
            int r9 = r0.A
            if (r9 >= r6) goto L_0x014c
            r6 = 1
            goto L_0x014d
        L_0x014c:
            r6 = 0
        L_0x014d:
            boolean r9 = r0.x
            if (r6 != r9) goto L_0x0153
            r6 = 1
            goto L_0x0154
        L_0x0153:
            r6 = 0
        L_0x0154:
            r3.d = r6
        L_0x0156:
            r3.a()
            goto L_0x0177
        L_0x015a:
            boolean r6 = r0.x
            r3.d = r6
            if (r6 == 0) goto L_0x016c
            h.r.d.t r6 = r0.u
            int r6 = r6.b()
            int r9 = r0.B
            int r6 = r6 - r9
            r3.c = r6
            goto L_0x0177
        L_0x016c:
            h.r.d.t r6 = r0.u
            int r6 = r6.f()
            int r9 = r0.B
            int r6 = r6 + r9
            r3.c = r6
        L_0x0177:
            r6 = 1
            goto L_0x017e
        L_0x0179:
            r0.A = r4
            r0.B = r7
        L_0x017d:
            r6 = 0
        L_0x017e:
            if (r6 == 0) goto L_0x0182
            goto L_0x023f
        L_0x0182:
            int r6 = r16.d()
            if (r6 != 0) goto L_0x018a
            goto L_0x022b
        L_0x018a:
            android.view.View r6 = r16.e()
            if (r6 == 0) goto L_0x01ba
            android.view.ViewGroup$LayoutParams r9 = r6.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$p r9 = (androidx.recyclerview.widget.RecyclerView.p) r9
            boolean r10 = r9.c()
            if (r10 != 0) goto L_0x01ae
            int r10 = r9.a()
            if (r10 < 0) goto L_0x01ae
            int r9 = r9.a()
            int r10 = r18.a()
            if (r9 >= r10) goto L_0x01ae
            r9 = 1
            goto L_0x01af
        L_0x01ae:
            r9 = 0
        L_0x01af:
            if (r9 == 0) goto L_0x01ba
            int r9 = r0.i(r6)
            r3.b(r6, r9)
            goto L_0x0229
        L_0x01ba:
            boolean r6 = r0.v
            boolean r9 = r0.y
            if (r6 == r9) goto L_0x01c2
            goto L_0x022b
        L_0x01c2:
            boolean r6 = r3.d
            if (r6 == 0) goto L_0x01d4
            boolean r6 = r0.x
            if (r6 == 0) goto L_0x01cf
            android.view.View r6 = r16.d((androidx.recyclerview.widget.RecyclerView.v) r17, (androidx.recyclerview.widget.RecyclerView.a0) r18)
            goto L_0x01e1
        L_0x01cf:
            android.view.View r6 = r16.e((androidx.recyclerview.widget.RecyclerView.v) r17, (androidx.recyclerview.widget.RecyclerView.a0) r18)
            goto L_0x01e1
        L_0x01d4:
            boolean r6 = r0.x
            if (r6 == 0) goto L_0x01dd
            android.view.View r6 = r16.e((androidx.recyclerview.widget.RecyclerView.v) r17, (androidx.recyclerview.widget.RecyclerView.a0) r18)
            goto L_0x01e1
        L_0x01dd:
            android.view.View r6 = r16.d((androidx.recyclerview.widget.RecyclerView.v) r17, (androidx.recyclerview.widget.RecyclerView.a0) r18)
        L_0x01e1:
            if (r6 == 0) goto L_0x022b
            int r9 = r0.i(r6)
            r3.a(r6, r9)
            boolean r9 = r2.f283g
            if (r9 != 0) goto L_0x0229
            boolean r9 = r16.q()
            if (r9 == 0) goto L_0x0229
            h.r.d.t r9 = r0.u
            int r9 = r9.d(r6)
            h.r.d.t r10 = r0.u
            int r10 = r10.b()
            if (r9 >= r10) goto L_0x0213
            h.r.d.t r9 = r0.u
            int r6 = r9.a((android.view.View) r6)
            h.r.d.t r9 = r0.u
            int r9 = r9.f()
            if (r6 >= r9) goto L_0x0211
            goto L_0x0213
        L_0x0211:
            r6 = 0
            goto L_0x0214
        L_0x0213:
            r6 = 1
        L_0x0214:
            if (r6 == 0) goto L_0x0229
            boolean r6 = r3.d
            if (r6 == 0) goto L_0x0221
            h.r.d.t r6 = r0.u
            int r6 = r6.b()
            goto L_0x0227
        L_0x0221:
            h.r.d.t r6 = r0.u
            int r6 = r6.f()
        L_0x0227:
            r3.c = r6
        L_0x0229:
            r6 = 1
            goto L_0x022c
        L_0x022b:
            r6 = 0
        L_0x022c:
            if (r6 == 0) goto L_0x022f
            goto L_0x023f
        L_0x022f:
            r3.a()
            boolean r6 = r0.y
            if (r6 == 0) goto L_0x023c
            int r6 = r18.a()
            int r6 = r6 + r4
            goto L_0x023d
        L_0x023c:
            r6 = 0
        L_0x023d:
            r3.f268b = r6
        L_0x023f:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.D
            r3.e = r8
        L_0x0243:
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            int r6 = r3.f276k
            if (r6 < 0) goto L_0x024b
            r6 = 1
            goto L_0x024c
        L_0x024b:
            r6 = -1
        L_0x024c:
            r3.f271f = r6
            int[] r3 = r0.G
            r3[r5] = r5
            r3[r8] = r5
            r0.a((androidx.recyclerview.widget.RecyclerView.a0) r2, (int[]) r3)
            int[] r3 = r0.G
            r3 = r3[r5]
            int r3 = java.lang.Math.max(r5, r3)
            h.r.d.t r6 = r0.u
            int r6 = r6.f()
            int r6 = r6 + r3
            int[] r3 = r0.G
            r3 = r3[r8]
            int r3 = java.lang.Math.max(r5, r3)
            h.r.d.t r9 = r0.u
            int r9 = r9.c()
            int r9 = r9 + r3
            boolean r3 = r2.f283g
            if (r3 == 0) goto L_0x02b0
            int r3 = r0.A
            if (r3 == r4) goto L_0x02b0
            int r10 = r0.B
            if (r10 == r7) goto L_0x02b0
            android.view.View r3 = r0.b((int) r3)
            if (r3 == 0) goto L_0x02b0
            boolean r7 = r0.x
            if (r7 == 0) goto L_0x029b
            h.r.d.t r7 = r0.u
            int r7 = r7.b()
            h.r.d.t r10 = r0.u
            int r3 = r10.a((android.view.View) r3)
            int r7 = r7 - r3
            int r3 = r0.B
            goto L_0x02aa
        L_0x029b:
            h.r.d.t r7 = r0.u
            int r3 = r7.d(r3)
            h.r.d.t r7 = r0.u
            int r7 = r7.f()
            int r3 = r3 - r7
            int r7 = r0.B
        L_0x02aa:
            int r7 = r7 - r3
            if (r7 <= 0) goto L_0x02af
            int r6 = r6 + r7
            goto L_0x02b0
        L_0x02af:
            int r9 = r9 - r7
        L_0x02b0:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.D
            boolean r3 = r3.d
            if (r3 == 0) goto L_0x02bb
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x02bf
            goto L_0x02c1
        L_0x02bb:
            boolean r3 = r0.x
            if (r3 == 0) goto L_0x02c1
        L_0x02bf:
            r3 = -1
            goto L_0x02c2
        L_0x02c1:
            r3 = 1
        L_0x02c2:
            androidx.recyclerview.widget.LinearLayoutManager$a r7 = r0.D
            r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.RecyclerView.a0) r2, (androidx.recyclerview.widget.LinearLayoutManager.a) r7, (int) r3)
            r16.a((androidx.recyclerview.widget.RecyclerView.v) r17)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            boolean r7 = r16.x()
            r3.f278m = r7
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            boolean r7 = r2.f283g
            r3.f275j = r7
            r3.f274i = r5
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.D
            boolean r7 = r3.d
            if (r7 == 0) goto L_0x0327
            int r7 = r3.f268b
            int r3 = r3.c
            r0.e((int) r7, (int) r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            r3.f273h = r6
            r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.LinearLayoutManager.c) r3, (androidx.recyclerview.widget.RecyclerView.a0) r2, (boolean) r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            int r6 = r3.f270b
            int r7 = r3.d
            int r3 = r3.c
            if (r3 <= 0) goto L_0x02f9
            int r9 = r9 + r3
        L_0x02f9:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.D
            int r10 = r3.f268b
            int r3 = r3.c
            r0.d((int) r10, (int) r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            r3.f273h = r9
            int r9 = r3.d
            int r10 = r3.e
            int r9 = r9 + r10
            r3.d = r9
            r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.LinearLayoutManager.c) r3, (androidx.recyclerview.widget.RecyclerView.a0) r2, (boolean) r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            int r9 = r3.f270b
            int r3 = r3.c
            if (r3 <= 0) goto L_0x036d
            r0.e((int) r7, (int) r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r6 = r0.t
            r6.f273h = r3
            r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.LinearLayoutManager.c) r6, (androidx.recyclerview.widget.RecyclerView.a0) r2, (boolean) r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            int r6 = r3.f270b
            goto L_0x036d
        L_0x0327:
            int r7 = r3.f268b
            int r3 = r3.c
            r0.d((int) r7, (int) r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            r3.f273h = r9
            r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.LinearLayoutManager.c) r3, (androidx.recyclerview.widget.RecyclerView.a0) r2, (boolean) r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            int r9 = r3.f270b
            int r7 = r3.d
            int r3 = r3.c
            if (r3 <= 0) goto L_0x0340
            int r6 = r6 + r3
        L_0x0340:
            androidx.recyclerview.widget.LinearLayoutManager$a r3 = r0.D
            int r10 = r3.f268b
            int r3 = r3.c
            r0.e((int) r10, (int) r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            r3.f273h = r6
            int r6 = r3.d
            int r10 = r3.e
            int r6 = r6 + r10
            r3.d = r6
            r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.LinearLayoutManager.c) r3, (androidx.recyclerview.widget.RecyclerView.a0) r2, (boolean) r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            int r6 = r3.f270b
            int r3 = r3.c
            if (r3 <= 0) goto L_0x036d
            r0.d((int) r7, (int) r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r7 = r0.t
            r7.f273h = r3
            r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.LinearLayoutManager.c) r7, (androidx.recyclerview.widget.RecyclerView.a0) r2, (boolean) r5)
            androidx.recyclerview.widget.LinearLayoutManager$c r3 = r0.t
            int r9 = r3.f270b
        L_0x036d:
            int r3 = r16.d()
            if (r3 <= 0) goto L_0x0391
            boolean r3 = r0.x
            boolean r7 = r0.y
            r3 = r3 ^ r7
            if (r3 == 0) goto L_0x0385
            int r3 = r0.a((int) r9, (androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.RecyclerView.a0) r2, (boolean) r8)
            int r6 = r6 + r3
            int r9 = r9 + r3
            int r3 = r0.b(r6, r1, r2, r5)
            goto L_0x038f
        L_0x0385:
            int r3 = r0.b(r6, r1, r2, r8)
            int r6 = r6 + r3
            int r9 = r9 + r3
            int r3 = r0.a((int) r9, (androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.RecyclerView.a0) r2, (boolean) r5)
        L_0x038f:
            int r6 = r6 + r3
            int r9 = r9 + r3
        L_0x0391:
            boolean r3 = r2.f287k
            if (r3 == 0) goto L_0x042f
            int r3 = r16.d()
            if (r3 == 0) goto L_0x042f
            boolean r3 = r2.f283g
            if (r3 != 0) goto L_0x042f
            boolean r3 = r16.q()
            if (r3 != 0) goto L_0x03a7
            goto L_0x042f
        L_0x03a7:
            java.util.List<androidx.recyclerview.widget.RecyclerView$d0> r3 = r1.d
            int r7 = r3.size()
            android.view.View r10 = r0.c((int) r5)
            int r10 = r0.i(r10)
            r11 = 0
            r12 = 0
            r13 = 0
        L_0x03b8:
            if (r11 >= r7) goto L_0x03f0
            java.lang.Object r14 = r3.get(r11)
            androidx.recyclerview.widget.RecyclerView$d0 r14 = (androidx.recyclerview.widget.RecyclerView.d0) r14
            boolean r15 = r14.j()
            if (r15 == 0) goto L_0x03c7
            goto L_0x03ec
        L_0x03c7:
            int r15 = r14.d()
            if (r15 >= r10) goto L_0x03cf
            r15 = 1
            goto L_0x03d0
        L_0x03cf:
            r15 = 0
        L_0x03d0:
            boolean r8 = r0.x
            if (r15 == r8) goto L_0x03d6
            r8 = -1
            goto L_0x03d7
        L_0x03d6:
            r8 = 1
        L_0x03d7:
            if (r8 != r4) goto L_0x03e3
            h.r.d.t r8 = r0.u
            android.view.View r14 = r14.e
            int r8 = r8.b(r14)
            int r12 = r12 + r8
            goto L_0x03ec
        L_0x03e3:
            h.r.d.t r8 = r0.u
            android.view.View r14 = r14.e
            int r8 = r8.b(r14)
            int r13 = r13 + r8
        L_0x03ec:
            int r11 = r11 + 1
            r8 = 1
            goto L_0x03b8
        L_0x03f0:
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.t
            r4.f277l = r3
            r3 = 0
            if (r12 <= 0) goto L_0x0410
            android.view.View r4 = r16.v()
            int r4 = r0.i(r4)
            r0.e((int) r4, (int) r6)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.t
            r4.f273h = r12
            r4.c = r5
            r4.a((android.view.View) r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.t
            r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.LinearLayoutManager.c) r4, (androidx.recyclerview.widget.RecyclerView.a0) r2, (boolean) r5)
        L_0x0410:
            if (r13 <= 0) goto L_0x042b
            android.view.View r4 = r16.u()
            int r4 = r0.i(r4)
            r0.d((int) r4, (int) r9)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.t
            r4.f273h = r13
            r4.c = r5
            r4.a((android.view.View) r3)
            androidx.recyclerview.widget.LinearLayoutManager$c r4 = r0.t
            r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.LinearLayoutManager.c) r4, (androidx.recyclerview.widget.RecyclerView.a0) r2, (boolean) r5)
        L_0x042b:
            androidx.recyclerview.widget.LinearLayoutManager$c r1 = r0.t
            r1.f277l = r3
        L_0x042f:
            boolean r1 = r2.f283g
            if (r1 != 0) goto L_0x043c
            h.r.d.t r1 = r0.u
            int r2 = r1.g()
            r1.f2145b = r2
            goto L_0x0441
        L_0x043c:
            androidx.recyclerview.widget.LinearLayoutManager$a r1 = r0.D
            r1.b()
        L_0x0441:
            boolean r1 = r0.y
            r0.v = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.LinearLayoutManager.c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    public static class a {
        public t a;

        /* renamed from: b  reason: collision with root package name */
        public int f268b;
        public int c;
        public boolean d;
        public boolean e;

        public a() {
            b();
        }

        public void a() {
            int i2;
            if (this.d) {
                i2 = this.a.b();
            } else {
                i2 = this.a.f();
            }
            this.c = i2;
        }

        public void b() {
            this.f268b = -1;
            this.c = RecyclerView.UNDEFINED_DURATION;
            this.d = false;
            this.e = false;
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("AnchorInfo{mPosition=");
            a2.append(this.f268b);
            a2.append(", mCoordinate=");
            a2.append(this.c);
            a2.append(", mLayoutFromEnd=");
            a2.append(this.d);
            a2.append(", mValid=");
            a2.append(this.e);
            a2.append('}');
            return a2.toString();
        }

        public void a(View view, int i2) {
            if (this.d) {
                this.c = this.a.h() + this.a.a(view);
            } else {
                this.c = this.a.d(view);
            }
            this.f268b = i2;
        }

        public void b(View view, int i2) {
            int h2 = this.a.h();
            if (h2 >= 0) {
                a(view, i2);
                return;
            }
            this.f268b = i2;
            if (this.d) {
                int b2 = (this.a.b() - h2) - this.a.a(view);
                this.c = this.a.b() - b2;
                if (b2 > 0) {
                    int b3 = this.c - this.a.b(view);
                    int f2 = this.a.f();
                    int min = b3 - (Math.min(this.a.d(view) - f2, 0) + f2);
                    if (min < 0) {
                        this.c = Math.min(b2, -min) + this.c;
                        return;
                    }
                    return;
                }
                return;
            }
            int d2 = this.a.d(view);
            int f3 = d2 - this.a.f();
            this.c = d2;
            if (f3 > 0) {
                int b4 = (this.a.b() - Math.min(0, (this.a.b() - h2) - this.a.a(view))) - (this.a.b(view) + d2);
                if (b4 < 0) {
                    this.c -= Math.min(f3, -b4);
                }
            }
        }
    }

    public void a(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.C = (d) parcelable;
            o();
        }
    }

    public final int h(RecyclerView.a0 a0Var) {
        if (d() == 0) {
            return 0;
        }
        r();
        t tVar = this.u;
        View b2 = b(!this.z, true);
        return g.a.a.b.a.a(a0Var, tVar, b2, a(!this.z, true), (RecyclerView.o) this, this.z);
    }

    public final int b(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int f2;
        int f3 = i2 - this.u.f();
        if (f3 <= 0) {
            return 0;
        }
        int i3 = -c(f3, vVar, a0Var);
        int i4 = i2 + i3;
        if (!z2 || (f2 = i4 - this.u.f()) <= 0) {
            return i3;
        }
        this.u.a(-f2);
        return i3 - f2;
    }

    public int d(RecyclerView.a0 a0Var) {
        return h(a0Var);
    }

    public int e(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    public int i(int i2) {
        if (i2 == 1) {
            return (this.s != 1 && w()) ? 1 : -1;
        }
        if (i2 == 2) {
            return (this.s != 1 && w()) ? -1 : 1;
        }
        if (i2 != 17) {
            if (i2 != 33) {
                if (i2 != 66) {
                    if (i2 == 130 && this.s == 1) {
                        return 1;
                    }
                    return RecyclerView.UNDEFINED_DURATION;
                } else if (this.s == 0) {
                    return 1;
                } else {
                    return RecyclerView.UNDEFINED_DURATION;
                }
            } else if (this.s == 1) {
                return -1;
            } else {
                return RecyclerView.UNDEFINED_DURATION;
            }
        } else if (this.s == 0) {
            return -1;
        } else {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    public boolean a() {
        return this.s == 0;
    }

    public final View d(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return a(vVar, a0Var, 0, d(), a0Var.a());
    }

    public final View e(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return a(vVar, a0Var, d() - 1, -1, a0Var.a());
    }

    public final int j(RecyclerView.a0 a0Var) {
        if (d() == 0) {
            return 0;
        }
        r();
        t tVar = this.u;
        View b2 = b(!this.z, true);
        return g.a.a.b.a.b(a0Var, tVar, b2, a(!this.z, true), this, this.z);
    }

    public void a(boolean z2) {
        a((String) null);
        if (this.y != z2) {
            this.y = z2;
            o();
        }
    }

    public int b(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return 0;
        }
        return c(i2, vVar, a0Var);
    }

    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i2) {
        o oVar = new o(recyclerView.getContext());
        oVar.a = i2;
        a((RecyclerView.z) oVar);
    }

    public int b(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    public View b(boolean z2, boolean z3) {
        if (this.x) {
            return a(d() - 1, -1, z2, z3);
        }
        return a(0, d(), z2, z3);
    }

    public PointF a(int i2) {
        if (d() == 0) {
            return null;
        }
        boolean z2 = false;
        int i3 = 1;
        if (i2 < i(c(0))) {
            z2 = true;
        }
        if (z2 != this.x) {
            i3 = -1;
        }
        if (this.s == 0) {
            return new PointF((float) i3, 0.0f);
        }
        return new PointF(0.0f, (float) i3);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        RecyclerView.o.d a2 = RecyclerView.o.a(context, attributeSet, i2, i3);
        j(a2.a);
        boolean z2 = a2.c;
        a((String) null);
        if (z2 != this.w) {
            this.w = z2;
            o();
        }
        a(a2.d);
    }

    public final int a(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z2) {
        int b2;
        int b3 = this.u.b() - i2;
        if (b3 <= 0) {
            return 0;
        }
        int i3 = -c(-b3, vVar, a0Var);
        int i4 = i2 + i3;
        if (!z2 || (b2 = this.u.b() - i4) <= 0) {
            return i3;
        }
        this.u.a(b2);
        return b2 + i3;
    }

    public int a(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return 0;
        }
        return c(i2, vVar, a0Var);
    }

    public int a(RecyclerView.a0 a0Var) {
        return h(a0Var);
    }

    public final void a(int i2, int i3, boolean z2, RecyclerView.a0 a0Var) {
        int i4;
        this.t.f278m = x();
        this.t.f271f = i2;
        int[] iArr = this.G;
        boolean z3 = false;
        iArr[0] = 0;
        int i5 = 1;
        iArr[1] = 0;
        a(a0Var, iArr);
        int max = Math.max(0, this.G[0]);
        int max2 = Math.max(0, this.G[1]);
        if (i2 == 1) {
            z3 = true;
        }
        this.t.f273h = z3 ? max2 : max;
        c cVar = this.t;
        if (!z3) {
            max = max2;
        }
        cVar.f274i = max;
        if (z3) {
            c cVar2 = this.t;
            cVar2.f273h = this.u.c() + cVar2.f273h;
            View u2 = u();
            c cVar3 = this.t;
            if (this.x) {
                i5 = -1;
            }
            cVar3.e = i5;
            c cVar4 = this.t;
            int i6 = i(u2);
            c cVar5 = this.t;
            cVar4.d = i6 + cVar5.e;
            cVar5.f270b = this.u.a(u2);
            i4 = this.u.a(u2) - this.u.b();
        } else {
            View v2 = v();
            c cVar6 = this.t;
            cVar6.f273h = this.u.f() + cVar6.f273h;
            c cVar7 = this.t;
            if (!this.x) {
                i5 = -1;
            }
            cVar7.e = i5;
            c cVar8 = this.t;
            int i7 = i(v2);
            c cVar9 = this.t;
            cVar8.d = i7 + cVar9.e;
            cVar9.f270b = this.u.d(v2);
            i4 = (-this.u.d(v2)) + this.u.f();
        }
        c cVar10 = this.t;
        cVar10.c = i3;
        if (z2) {
            cVar10.c = i3 - i4;
        }
        this.t.f272g = i4;
    }

    public void a(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i2 = cVar.d;
        if (i2 >= 0 && i2 < a0Var.a()) {
            ((m.b) cVar2).a(i2, Math.max(0, cVar.f272g));
        }
    }

    public void a(int i2, RecyclerView.o.c cVar) {
        boolean z2;
        int i3;
        d dVar = this.C;
        int i4 = -1;
        if (dVar == null || !dVar.a()) {
            y();
            z2 = this.x;
            i3 = this.A;
            if (i3 == -1) {
                i3 = z2 ? i2 - 1 : 0;
            }
        } else {
            d dVar2 = this.C;
            z2 = dVar2.f280g;
            i3 = dVar2.e;
        }
        if (!z2) {
            i4 = 1;
        }
        for (int i5 = 0; i5 < this.F && i3 >= 0 && i3 < i2; i5++) {
            ((m.b) cVar).a(i3, 0);
            i3 += i4;
        }
    }

    public void a(int i2, int i3, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.s != 0) {
            i2 = i3;
        }
        if (d() != 0 && i2 != 0) {
            r();
            a(i2 > 0 ? 1 : -1, Math.abs(i2), true, a0Var);
            a(a0Var, this.t, cVar);
        }
    }

    public void a(String str) {
        RecyclerView recyclerView;
        if (this.C == null && (recyclerView = this.f314b) != null) {
            recyclerView.assertNotInLayoutOrScroll(str);
        }
    }

    public final void a(RecyclerView.v vVar, int i2, int i3) {
        if (i2 != i3) {
            if (i3 > i2) {
                for (int i4 = i3 - 1; i4 >= i2; i4--) {
                    a(i4, vVar);
                }
                return;
            }
            while (i2 > i3) {
                a(i2, vVar);
                i2--;
            }
        }
    }

    public final void a(RecyclerView.v vVar, c cVar) {
        if (cVar.a && !cVar.f278m) {
            int i2 = cVar.f272g;
            int i3 = cVar.f274i;
            if (cVar.f271f == -1) {
                int d2 = d();
                if (i2 >= 0) {
                    int a2 = (this.u.a() - i2) + i3;
                    if (this.x) {
                        for (int i4 = 0; i4 < d2; i4++) {
                            View c2 = c(i4);
                            if (this.u.d(c2) < a2 || this.u.f(c2) < a2) {
                                a(vVar, 0, i4);
                                return;
                            }
                        }
                        return;
                    }
                    int i5 = d2 - 1;
                    for (int i6 = i5; i6 >= 0; i6--) {
                        View c3 = c(i6);
                        if (this.u.d(c3) < a2 || this.u.f(c3) < a2) {
                            a(vVar, i5, i6);
                            return;
                        }
                    }
                }
            } else if (i2 >= 0) {
                int i7 = i2 - i3;
                int d3 = d();
                if (this.x) {
                    int i8 = d3 - 1;
                    for (int i9 = i8; i9 >= 0; i9--) {
                        View c4 = c(i9);
                        if (this.u.a(c4) > i7 || this.u.e(c4) > i7) {
                            a(vVar, i8, i9);
                            return;
                        }
                    }
                    return;
                }
                for (int i10 = 0; i10 < d3; i10++) {
                    View c5 = c(i10);
                    if (this.u.a(c5) > i7 || this.u.e(c5) > i7) {
                        a(vVar, 0, i10);
                        return;
                    }
                }
            }
        }
    }

    public int a(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z2) {
        int i2 = cVar.c;
        int i3 = cVar.f272g;
        if (i3 != Integer.MIN_VALUE) {
            if (i2 < 0) {
                cVar.f272g = i3 + i2;
            }
            a(vVar, cVar);
        }
        int i4 = cVar.c + cVar.f273h;
        b bVar = this.E;
        while (true) {
            if ((!cVar.f278m && i4 <= 0) || !cVar.a(a0Var)) {
                break;
            }
            bVar.a = 0;
            bVar.f269b = false;
            bVar.c = false;
            bVar.d = false;
            a(vVar, a0Var, cVar, bVar);
            if (!bVar.f269b) {
                cVar.f270b = (bVar.a * cVar.f271f) + cVar.f270b;
                if (!bVar.c || cVar.f277l != null || !a0Var.f283g) {
                    int i5 = cVar.c;
                    int i6 = bVar.a;
                    cVar.c = i5 - i6;
                    i4 -= i6;
                }
                int i7 = cVar.f272g;
                if (i7 != Integer.MIN_VALUE) {
                    int i8 = i7 + bVar.a;
                    cVar.f272g = i8;
                    int i9 = cVar.c;
                    if (i9 < 0) {
                        cVar.f272g = i8 + i9;
                    }
                    a(vVar, cVar);
                }
                if (z2 && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i2 - cVar.c;
    }

    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View a2 = cVar.a(vVar);
        if (a2 == null) {
            bVar.f269b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) a2.getLayoutParams();
        if (cVar.f277l == null) {
            if (this.x == (cVar.f271f == -1)) {
                a(a2, -1, false);
            } else {
                a(a2, 0, false);
            }
        } else {
            if (this.x == (cVar.f271f == -1)) {
                a(a2, -1, true);
            } else {
                a(a2, 0, true);
            }
        }
        RecyclerView.p pVar2 = (RecyclerView.p) a2.getLayoutParams();
        Rect itemDecorInsetsForChild = this.f314b.getItemDecorInsetsForChild(a2);
        int a3 = RecyclerView.o.a(this.f326q, this.f324o, k() + j() + pVar2.leftMargin + pVar2.rightMargin + itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + 0, pVar2.width, a());
        int a4 = RecyclerView.o.a(this.r, this.f325p, i() + l() + pVar2.topMargin + pVar2.bottomMargin + itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + 0, pVar2.height, b());
        if (a(a2, a3, a4, pVar2)) {
            a2.measure(a3, a4);
        }
        bVar.a = this.u.b(a2);
        if (this.s == 1) {
            if (w()) {
                i6 = this.f326q - k();
                i5 = i6 - this.u.c(a2);
            } else {
                i5 = j();
                i6 = this.u.c(a2) + i5;
            }
            if (cVar.f271f == -1) {
                int i7 = cVar.f270b;
                i2 = i7;
                i3 = i6;
                i4 = i7 - bVar.a;
            } else {
                int i8 = cVar.f270b;
                i4 = i8;
                i3 = i6;
                i2 = bVar.a + i8;
            }
        } else {
            int l2 = l();
            int c2 = this.u.c(a2) + l2;
            if (cVar.f271f == -1) {
                int i9 = cVar.f270b;
                i3 = i9;
                i4 = l2;
                i2 = c2;
                i5 = i9 - bVar.a;
            } else {
                int i10 = cVar.f270b;
                i4 = l2;
                i3 = bVar.a + i10;
                i2 = c2;
                i5 = i10;
            }
        }
        a(a2, i5, i4, i3, i2);
        if (pVar.c() || pVar.b()) {
            bVar.c = true;
        }
        bVar.d = a2.hasFocusable();
    }

    public View a(boolean z2, boolean z3) {
        if (this.x) {
            return a(0, d(), z2, z3);
        }
        return a(d() - 1, -1, z2, z3);
    }

    public View a(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2, int i3, int i4) {
        r();
        int f2 = this.u.f();
        int b2 = this.u.b();
        int i5 = i3 > i2 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i2 != i3) {
            View c2 = c(i2);
            int i6 = i(c2);
            if (i6 >= 0 && i6 < i4) {
                if (((RecyclerView.p) c2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = c2;
                    }
                } else if (this.u.d(c2) < b2 && this.u.a(c2) >= f2) {
                    return c2;
                } else {
                    if (view == null) {
                        view = c2;
                    }
                }
            }
            i2 += i5;
        }
        return view != null ? view : view2;
    }

    public int c(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    public int c(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (d() == 0 || i2 == 0) {
            return 0;
        }
        r();
        this.t.a = true;
        int i3 = i2 > 0 ? 1 : -1;
        int abs = Math.abs(i2);
        a(i3, abs, true, a0Var);
        c cVar = this.t;
        int a2 = a(vVar, cVar, a0Var, false) + cVar.f272g;
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i2 = i3 * a2;
        }
        this.u.a(-i2);
        this.t.f276k = i2;
        return i2;
    }

    public View a(int i2, int i3, boolean z2, boolean z3) {
        r();
        int i4 = 320;
        int i5 = z2 ? 24579 : 320;
        if (!z3) {
            i4 = 0;
        }
        if (this.s == 0) {
            return this.e.a(i2, i3, i5, i4);
        }
        return this.f315f.a(i2, i3, i5, i4);
    }

    public View c(int i2, int i3) {
        int i4;
        int i5;
        r();
        if ((i3 > i2 ? 1 : i3 < i2 ? (char) 65535 : 0) == 0) {
            return c(i2);
        }
        if (this.u.d(c(i2)) < this.u.f()) {
            i5 = 16644;
            i4 = 16388;
        } else {
            i5 = 4161;
            i4 = 4097;
        }
        if (this.s == 0) {
            return this.e.a(i2, i3, i5, i4);
        }
        return this.f315f.a(i2, i3, i5, i4);
    }

    public View a(View view, int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i3;
        View view2;
        View view3;
        y();
        if (d() == 0 || (i3 = i(i2)) == Integer.MIN_VALUE) {
            return null;
        }
        r();
        a(i3, (int) (((float) this.u.g()) * 0.33333334f), false, a0Var);
        c cVar = this.t;
        cVar.f272g = RecyclerView.UNDEFINED_DURATION;
        cVar.a = false;
        a(vVar, cVar, a0Var, true);
        if (i3 == -1) {
            if (this.x) {
                view2 = c(d() - 1, -1);
            } else {
                view2 = c(0, d());
            }
        } else if (this.x) {
            view2 = c(0, d());
        } else {
            view2 = c(d() - 1, -1);
        }
        if (i3 == -1) {
            view3 = v();
        } else {
            view3 = u();
        }
        if (!view3.hasFocusable()) {
            return view2;
        }
        if (view2 == null) {
            return null;
        }
        return view3;
    }

    public void a(RecyclerView.a0 a0Var, int[] iArr) {
        int i2;
        int g2 = a0Var.a != -1 ? this.u.g() : 0;
        if (this.t.f271f == -1) {
            i2 = 0;
        } else {
            i2 = g2;
            g2 = 0;
        }
        iArr[0] = g2;
        iArr[1] = i2;
    }
}
