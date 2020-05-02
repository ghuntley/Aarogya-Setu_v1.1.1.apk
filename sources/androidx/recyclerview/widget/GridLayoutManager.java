package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import h.h.m.w.b;
import h.r.d.m;

public class GridLayoutManager extends LinearLayoutManager {
    public boolean H = false;
    public int I = -1;
    public int[] J;
    public View[] K;
    public final SparseIntArray L = new SparseIntArray();
    public final SparseIntArray M = new SparseIntArray();
    public c N = new a();
    public final Rect O = new Rect();

    public static final class a extends c {
    }

    public static abstract class c {
        public final SparseIntArray a = new SparseIntArray();

        /* renamed from: b  reason: collision with root package name */
        public final SparseIntArray f267b = new SparseIntArray();
        public boolean c = false;
        public boolean d = false;

        public int a(int i2, int i3) {
            if (!this.d) {
                return c(i2, i3);
            }
            int i4 = this.f267b.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int c2 = c(i2, i3);
            this.f267b.put(i2, c2);
            return c2;
        }

        public int b(int i2, int i3) {
            if (!this.c) {
                return i2 % i3;
            }
            int i4 = this.a.get(i2, -1);
            if (i4 != -1) {
                return i4;
            }
            int i5 = i2 % i3;
            this.a.put(i2, i5);
            return i5;
        }

        /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int c(int r9, int r10) {
            /*
                r8 = this;
                boolean r0 = r8.d
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x0044
                android.util.SparseIntArray r0 = r8.f267b
                int r3 = r0.size()
                r4 = -1
                int r3 = r3 + r4
                r5 = 0
            L_0x000f:
                if (r5 > r3) goto L_0x0020
                int r6 = r5 + r3
                int r6 = r6 >>> r2
                int r7 = r0.keyAt(r6)
                if (r7 >= r9) goto L_0x001d
                int r5 = r6 + 1
                goto L_0x000f
            L_0x001d:
                int r3 = r6 + -1
                goto L_0x000f
            L_0x0020:
                int r5 = r5 + r4
                if (r5 < 0) goto L_0x002e
                int r3 = r0.size()
                if (r5 >= r3) goto L_0x002e
                int r0 = r0.keyAt(r5)
                goto L_0x002f
            L_0x002e:
                r0 = -1
            L_0x002f:
                if (r0 == r4) goto L_0x0044
                android.util.SparseIntArray r3 = r8.f267b
                int r3 = r3.get(r0)
                int r4 = r0 + 1
                int r0 = r8.b(r0, r10)
                int r0 = r0 + r2
                if (r0 != r10) goto L_0x0047
                int r3 = r3 + 1
                r0 = 0
                goto L_0x0047
            L_0x0044:
                r0 = 0
                r3 = 0
                r4 = 0
            L_0x0047:
                if (r4 >= r9) goto L_0x0059
                int r0 = r0 + 1
                if (r0 != r10) goto L_0x0051
                int r3 = r3 + 1
                r0 = 0
                goto L_0x0056
            L_0x0051:
                if (r0 <= r10) goto L_0x0056
                int r3 = r3 + 1
                r0 = 1
            L_0x0056:
                int r4 = r4 + 1
                goto L_0x0047
            L_0x0059:
                int r0 = r0 + r2
                if (r0 <= r10) goto L_0x005e
                int r3 = r3 + 1
            L_0x005e:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.c(int, int):int");
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        l(RecyclerView.o.a(context, attributeSet, i2, i3).f327b);
    }

    public final void A() {
        int i2;
        int i3;
        if (this.s == 1) {
            i3 = this.f326q - k();
            i2 = j();
        } else {
            i3 = this.r - i();
            i2 = l();
        }
        k(i3 - i2);
    }

    public int a(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return this.I;
        }
        if (a0Var.a() < 1) {
            return 0;
        }
        return a(vVar, a0Var, a0Var.a() - 1) + 1;
    }

    public int b(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return this.I;
        }
        if (a0Var.a() < 1) {
            return 0;
        }
        return a(vVar, a0Var, a0Var.a() - 1) + 1;
    }

    public RecyclerView.p c() {
        if (this.s == 0) {
            return new b(-2, -1);
        }
        return new b(-1, -2);
    }

    public int e(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    public int f(int i2, int i3) {
        if (this.s != 1 || !w()) {
            int[] iArr = this.J;
            return iArr[i3 + i2] - iArr[i2];
        }
        int[] iArr2 = this.J;
        int i4 = this.I;
        return iArr2[i4 - i2] - iArr2[(i4 - i2) - i3];
    }

    public void g(RecyclerView.a0 a0Var) {
        this.C = null;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D.b();
        this.H = false;
    }

    public final void k(int i2) {
        int i3;
        int[] iArr = this.J;
        int i4 = this.I;
        if (!(iArr != null && iArr.length == i4 + 1 && iArr[iArr.length - 1] == i2)) {
            iArr = new int[(i4 + 1)];
        }
        int i5 = 0;
        iArr[0] = 0;
        int i6 = i2 / i4;
        int i7 = i2 % i4;
        int i8 = 0;
        for (int i9 = 1; i9 <= i4; i9++) {
            i5 += i7;
            if (i5 <= 0 || i4 - i5 >= i7) {
                i3 = i6;
            } else {
                i3 = i6 + 1;
                i5 -= i4;
            }
            i8 += i3;
            iArr[i9] = i8;
        }
        this.J = iArr;
    }

    public void l(int i2) {
        if (i2 != this.I) {
            this.H = true;
            if (i2 >= 1) {
                this.I = i2;
                this.N.a.clear();
                o();
                return;
            }
            throw new IllegalArgumentException(i.a.a.a.a.b("Span count should be at least 1. Provided ", i2));
        }
    }

    public boolean q() {
        return this.C == null && !this.H;
    }

    public final void z() {
        View[] viewArr = this.K;
        if (viewArr == null || viewArr.length != this.I) {
            this.K = new View[this.I];
        }
    }

    public static class b extends RecyclerView.p {
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public int f266f = 0;

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i2, int i3) {
            super(i2, i3);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public int c(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    public int f(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, h.h.m.w.b bVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.a(view, bVar);
            return;
        }
        b bVar2 = (b) layoutParams;
        int a2 = a(vVar, a0Var, bVar2.a());
        if (this.s == 0) {
            bVar.b((Object) b.c.a(bVar2.e, bVar2.f266f, a2, 1, false, false));
            return;
        }
        bVar.b((Object) b.c.a(a2, 1, bVar2.e, bVar2.f266f, false, false));
    }

    public void b(RecyclerView recyclerView, int i2, int i3) {
        this.N.a.clear();
        this.N.f267b.clear();
    }

    public final int c(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (a0Var.f283g) {
            int i3 = this.L.get(i2, -1);
            if (i3 != -1) {
                return i3;
            }
            if (vVar.a(i2) == -1) {
                Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
                return 1;
            } else if (((a) this.N) != null) {
                return 1;
            } else {
                throw null;
            }
        } else if (((a) this.N) != null) {
            return 1;
        } else {
            throw null;
        }
    }

    public int b(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        A();
        z();
        if (this.s == 0) {
            return 0;
        }
        return c(i2, vVar, a0Var);
    }

    public GridLayoutManager(Context context, int i2, int i3, boolean z) {
        super(i3, z);
        l(i2);
    }

    public final void b(View view, int i2, boolean z) {
        int i3;
        int i4;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f328b;
        int i5 = rect.top + rect.bottom + bVar.topMargin + bVar.bottomMargin;
        int i6 = rect.left + rect.right + bVar.leftMargin + bVar.rightMargin;
        int f2 = f(bVar.e, bVar.f266f);
        if (this.s == 1) {
            i3 = RecyclerView.o.a(f2, i2, i6, bVar.width, false);
            i4 = RecyclerView.o.a(this.u.g(), this.f325p, i5, bVar.height, true);
        } else {
            int a2 = RecyclerView.o.a(f2, i2, i5, bVar.height, false);
            int a3 = RecyclerView.o.a(this.u.g(), this.f324o, i6, bVar.width, true);
            i4 = a2;
            i3 = a3;
        }
        a(view, i3, i4, z);
    }

    public void c(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.f283g) {
            int d = d();
            for (int i2 = 0; i2 < d; i2++) {
                b bVar = (b) c(i2).getLayoutParams();
                int a2 = bVar.a();
                this.L.put(a2, bVar.f266f);
                this.M.put(a2, bVar.e);
            }
        }
        super.c(vVar, a0Var);
        this.L.clear();
        this.M.clear();
    }

    public void a(RecyclerView recyclerView, int i2, int i3) {
        this.N.a.clear();
        this.N.f267b.clear();
    }

    public void a(RecyclerView recyclerView) {
        this.N.a.clear();
        this.N.f267b.clear();
    }

    public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
        this.N.a.clear();
        this.N.f267b.clear();
    }

    public int b(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        this.N.a.clear();
        this.N.f267b.clear();
    }

    public final int b(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.f283g) {
            return this.N.b(i2, this.I);
        }
        int i3 = this.M.get(i2, -1);
        if (i3 != -1) {
            return i3;
        }
        int a2 = vVar.a(i2);
        if (a2 != -1) {
            return this.N.b(a2, this.I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i2);
        return 0;
    }

    public RecyclerView.p a(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    public RecyclerView.p a(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new b(layoutParams);
    }

    public boolean a(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    public void a(Rect rect, int i2, int i3) {
        int i4;
        int i5;
        if (this.J == null) {
            super.a(rect, i2, i3);
        }
        int k2 = k() + j();
        int i6 = i() + l();
        if (this.s == 1) {
            i5 = RecyclerView.o.a(i3, rect.height() + i6, g());
            int[] iArr = this.J;
            i4 = RecyclerView.o.a(i2, iArr[iArr.length - 1] + k2, h());
        } else {
            i4 = RecyclerView.o.a(i2, rect.width() + k2, h());
            int[] iArr2 = this.J;
            i5 = RecyclerView.o.a(i3, iArr2[iArr2.length - 1] + i6, g());
        }
        this.f314b.setMeasuredDimension(i4, i5);
    }

    public void a(boolean z) {
        if (!z) {
            a((String) null);
            if (this.y) {
                this.y = false;
                o();
                return;
            }
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i2) {
        A();
        if (a0Var.a() > 0 && !a0Var.f283g) {
            boolean z = i2 == 1;
            int b2 = b(vVar, a0Var, aVar.f268b);
            if (z) {
                while (b2 > 0) {
                    int i3 = aVar.f268b;
                    if (i3 <= 0) {
                        break;
                    }
                    int i4 = i3 - 1;
                    aVar.f268b = i4;
                    b2 = b(vVar, a0Var, i4);
                }
            } else {
                int a2 = a0Var.a() - 1;
                int i5 = aVar.f268b;
                while (i5 < a2) {
                    int i6 = i5 + 1;
                    int b3 = b(vVar, a0Var, i6);
                    if (b3 <= b2) {
                        break;
                    }
                    i5 = i6;
                    b2 = b3;
                }
                aVar.f268b = i5;
            }
        }
        z();
    }

    public int a(int i2, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        A();
        z();
        if (this.s == 1) {
            return 0;
        }
        return c(i2, vVar, a0Var);
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
            if (i6 >= 0 && i6 < i4 && b(vVar, a0Var, i6) == 0) {
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

    public void a(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i2 = this.I;
        int i3 = 0;
        while (i3 < this.I && cVar.a(a0Var) && i2 > 0) {
            ((m.b) cVar2).a(cVar.d, Math.max(0, cVar.f272g));
            if (((a) this.N) != null) {
                i2--;
                cVar.d += cVar.e;
                i3++;
            } else {
                throw null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x025b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(androidx.recyclerview.widget.RecyclerView.v r19, androidx.recyclerview.widget.RecyclerView.a0 r20, androidx.recyclerview.widget.LinearLayoutManager.c r21, androidx.recyclerview.widget.LinearLayoutManager.b r22) {
        /*
            r18 = this;
            r6 = r18
            r0 = r19
            r1 = r20
            r2 = r21
            r7 = r22
            h.r.d.t r3 = r6.u
            int r3 = r3.e()
            r4 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r9 = 1
            goto L_0x0019
        L_0x0018:
            r9 = 0
        L_0x0019:
            int r10 = r18.d()
            if (r10 <= 0) goto L_0x0026
            int[] r10 = r6.J
            int r11 = r6.I
            r10 = r10[r11]
            goto L_0x0027
        L_0x0026:
            r10 = 0
        L_0x0027:
            if (r9 == 0) goto L_0x002c
            r18.A()
        L_0x002c:
            int r11 = r2.e
            if (r11 != r8) goto L_0x0032
            r11 = 1
            goto L_0x0033
        L_0x0032:
            r11 = 0
        L_0x0033:
            int r12 = r6.I
            if (r11 != 0) goto L_0x0044
            int r12 = r2.d
            int r12 = r6.b((androidx.recyclerview.widget.RecyclerView.v) r0, (androidx.recyclerview.widget.RecyclerView.a0) r1, (int) r12)
            int r13 = r2.d
            int r13 = r6.c(r0, r1, r13)
            int r12 = r12 + r13
        L_0x0044:
            r13 = 0
        L_0x0045:
            int r14 = r6.I
            if (r13 >= r14) goto L_0x009d
            boolean r14 = r2.a((androidx.recyclerview.widget.RecyclerView.a0) r1)
            if (r14 == 0) goto L_0x009d
            if (r12 <= 0) goto L_0x009d
            int r14 = r2.d
            int r15 = r6.c(r0, r1, r14)
            int r4 = r6.I
            if (r15 > r4) goto L_0x006f
            int r12 = r12 - r15
            if (r12 >= 0) goto L_0x005f
            goto L_0x009d
        L_0x005f:
            android.view.View r4 = r2.a((androidx.recyclerview.widget.RecyclerView.v) r0)
            if (r4 != 0) goto L_0x0066
            goto L_0x009d
        L_0x0066:
            android.view.View[] r14 = r6.K
            r14[r13] = r4
            int r13 = r13 + 1
            r4 = 1073741824(0x40000000, float:2.0)
            goto L_0x0045
        L_0x006f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Item at position "
            r1.append(r2)
            r1.append(r14)
            java.lang.String r2 = " requires "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r2 = " spans but GridLayoutManager has only "
            r1.append(r2)
            int r2 = r6.I
            r1.append(r2)
            java.lang.String r2 = " spans."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x009d:
            if (r13 != 0) goto L_0x00a2
            r7.f269b = r8
            return
        L_0x00a2:
            if (r11 == 0) goto L_0x00aa
            r14 = r13
            r12 = 0
            r15 = 0
            r16 = 1
            goto L_0x00b0
        L_0x00aa:
            int r12 = r13 + -1
            r14 = -1
            r15 = 0
            r16 = -1
        L_0x00b0:
            if (r12 == r14) goto L_0x00cf
            android.view.View[] r4 = r6.K
            r4 = r4[r12]
            android.view.ViewGroup$LayoutParams r17 = r4.getLayoutParams()
            r8 = r17
            androidx.recyclerview.widget.GridLayoutManager$b r8 = (androidx.recyclerview.widget.GridLayoutManager.b) r8
            int r4 = r6.i(r4)
            int r4 = r6.c(r0, r1, r4)
            r8.f266f = r4
            r8.e = r15
            int r15 = r15 + r4
            int r12 = r12 + r16
            r8 = 1
            goto L_0x00b0
        L_0x00cf:
            r0 = 0
            r1 = 0
            r4 = 0
        L_0x00d2:
            if (r1 >= r13) goto L_0x012c
            android.view.View[] r8 = r6.K
            r8 = r8[r1]
            java.util.List<androidx.recyclerview.widget.RecyclerView$d0> r12 = r2.f277l
            if (r12 != 0) goto L_0x00e6
            if (r11 == 0) goto L_0x00e2
            r6.a((android.view.View) r8)
            goto L_0x00f2
        L_0x00e2:
            r6.a((android.view.View) r8, (int) r5, (boolean) r5)
            goto L_0x00f2
        L_0x00e6:
            if (r11 == 0) goto L_0x00ee
            r12 = -1
            r14 = 1
            r6.a((android.view.View) r8, (int) r12, (boolean) r14)
            goto L_0x00f2
        L_0x00ee:
            r14 = 1
            r6.a((android.view.View) r8, (int) r5, (boolean) r14)
        L_0x00f2:
            android.graphics.Rect r12 = r6.O
            androidx.recyclerview.widget.RecyclerView r14 = r6.f314b
            if (r14 != 0) goto L_0x00fc
            r12.set(r5, r5, r5, r5)
            goto L_0x0103
        L_0x00fc:
            android.graphics.Rect r14 = r14.getItemDecorInsetsForChild(r8)
            r12.set(r14)
        L_0x0103:
            r6.b((android.view.View) r8, (int) r3, (boolean) r5)
            h.r.d.t r12 = r6.u
            int r12 = r12.b(r8)
            if (r12 <= r4) goto L_0x010f
            r4 = r12
        L_0x010f:
            android.view.ViewGroup$LayoutParams r12 = r8.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r12 = (androidx.recyclerview.widget.GridLayoutManager.b) r12
            r14 = 1065353216(0x3f800000, float:1.0)
            h.r.d.t r15 = r6.u
            int r8 = r15.c(r8)
            float r8 = (float) r8
            float r8 = r8 * r14
            int r12 = r12.f266f
            float r12 = (float) r12
            float r8 = r8 / r12
            int r12 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0129
            r0 = r8
        L_0x0129:
            int r1 = r1 + 1
            goto L_0x00d2
        L_0x012c:
            if (r9 == 0) goto L_0x0158
            int r1 = r6.I
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = java.lang.Math.round(r0)
            int r0 = java.lang.Math.max(r0, r10)
            r6.k(r0)
            r0 = 0
            r4 = 0
        L_0x0140:
            if (r0 >= r13) goto L_0x0158
            android.view.View[] r1 = r6.K
            r1 = r1[r0]
            r3 = 1073741824(0x40000000, float:2.0)
            r8 = 1
            r6.b((android.view.View) r1, (int) r3, (boolean) r8)
            h.r.d.t r3 = r6.u
            int r1 = r3.b(r1)
            if (r1 <= r4) goto L_0x0155
            r4 = r1
        L_0x0155:
            int r0 = r0 + 1
            goto L_0x0140
        L_0x0158:
            r0 = 0
        L_0x0159:
            if (r0 >= r13) goto L_0x01ba
            android.view.View[] r1 = r6.K
            r1 = r1[r0]
            h.r.d.t r3 = r6.u
            int r3 = r3.b(r1)
            if (r3 == r4) goto L_0x01b4
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r3 = (androidx.recyclerview.widget.GridLayoutManager.b) r3
            android.graphics.Rect r8 = r3.f328b
            int r9 = r8.top
            int r10 = r8.bottom
            int r9 = r9 + r10
            int r10 = r3.topMargin
            int r9 = r9 + r10
            int r10 = r3.bottomMargin
            int r9 = r9 + r10
            int r10 = r8.left
            int r8 = r8.right
            int r10 = r10 + r8
            int r8 = r3.leftMargin
            int r10 = r10 + r8
            int r8 = r3.rightMargin
            int r10 = r10 + r8
            int r8 = r3.e
            int r11 = r3.f266f
            int r8 = r6.f(r8, r11)
            int r11 = r6.s
            r12 = 1
            if (r11 != r12) goto L_0x01a1
            int r3 = r3.width
            r11 = 1073741824(0x40000000, float:2.0)
            int r3 = androidx.recyclerview.widget.RecyclerView.o.a((int) r8, (int) r11, (int) r10, (int) r3, (boolean) r5)
            int r8 = r4 - r9
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r11)
            goto L_0x01b0
        L_0x01a1:
            r11 = 1073741824(0x40000000, float:2.0)
            int r10 = r4 - r10
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r11)
            int r3 = r3.height
            int r8 = androidx.recyclerview.widget.RecyclerView.o.a((int) r8, (int) r11, (int) r9, (int) r3, (boolean) r5)
            r3 = r10
        L_0x01b0:
            r6.a((android.view.View) r1, (int) r3, (int) r8, (boolean) r12)
            goto L_0x01b7
        L_0x01b4:
            r11 = 1073741824(0x40000000, float:2.0)
            r12 = 1
        L_0x01b7:
            int r0 = r0 + 1
            goto L_0x0159
        L_0x01ba:
            r12 = 1
            r7.a = r4
            int r0 = r6.s
            if (r0 != r12) goto L_0x01d3
            int r0 = r2.f271f
            r1 = -1
            if (r0 != r1) goto L_0x01cb
            int r0 = r2.f270b
            int r1 = r0 - r4
            goto L_0x01cf
        L_0x01cb:
            int r1 = r2.f270b
            int r0 = r4 + r1
        L_0x01cf:
            r2 = r1
            r1 = 0
            r3 = 0
            goto L_0x01e5
        L_0x01d3:
            r1 = -1
            int r0 = r2.f271f
            if (r0 != r1) goto L_0x01dd
            int r0 = r2.f270b
            int r1 = r0 - r4
            goto L_0x01e1
        L_0x01dd:
            int r1 = r2.f270b
            int r0 = r4 + r1
        L_0x01e1:
            r3 = r1
            r2 = 0
            r1 = r0
            r0 = 0
        L_0x01e5:
            r8 = 0
        L_0x01e6:
            if (r8 >= r13) goto L_0x026f
            android.view.View[] r4 = r6.K
            r9 = r4[r8]
            android.view.ViewGroup$LayoutParams r4 = r9.getLayoutParams()
            r10 = r4
            androidx.recyclerview.widget.GridLayoutManager$b r10 = (androidx.recyclerview.widget.GridLayoutManager.b) r10
            int r4 = r6.s
            r5 = 1
            if (r4 != r5) goto L_0x022c
            boolean r1 = r18.w()
            if (r1 == 0) goto L_0x0215
            int r1 = r18.j()
            int[] r3 = r6.J
            int r4 = r6.I
            int r5 = r10.e
            int r4 = r4 - r5
            r3 = r3[r4]
            int r1 = r1 + r3
            h.r.d.t r3 = r6.u
            int r3 = r3.c(r9)
            int r3 = r1 - r3
            goto L_0x023e
        L_0x0215:
            int r1 = r18.j()
            int[] r3 = r6.J
            int r4 = r10.e
            r3 = r3[r4]
            int r1 = r1 + r3
            h.r.d.t r3 = r6.u
            int r3 = r3.c(r9)
            int r3 = r3 + r1
            r11 = r0
            r15 = r1
            r14 = r2
            r12 = r3
            goto L_0x0242
        L_0x022c:
            int r0 = r18.l()
            int[] r2 = r6.J
            int r4 = r10.e
            r2 = r2[r4]
            int r2 = r2 + r0
            h.r.d.t r0 = r6.u
            int r0 = r0.c(r9)
            int r0 = r0 + r2
        L_0x023e:
            r11 = r0
            r12 = r1
            r14 = r2
            r15 = r3
        L_0x0242:
            r0 = r18
            r1 = r9
            r2 = r15
            r3 = r14
            r4 = r12
            r5 = r11
            r0.a((android.view.View) r1, (int) r2, (int) r3, (int) r4, (int) r5)
            boolean r0 = r10.c()
            if (r0 != 0) goto L_0x025b
            boolean r0 = r10.b()
            if (r0 == 0) goto L_0x0259
            goto L_0x025b
        L_0x0259:
            r0 = 1
            goto L_0x025e
        L_0x025b:
            r0 = 1
            r7.c = r0
        L_0x025e:
            boolean r1 = r7.d
            boolean r2 = r9.hasFocusable()
            r1 = r1 | r2
            r7.d = r1
            int r8 = r8 + 1
            r0 = r11
            r1 = r12
            r2 = r14
            r3 = r15
            goto L_0x01e6
        L_0x026f:
            android.view.View[] r0 = r6.K
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    public final void a(View view, int i2, int i3, boolean z) {
        boolean z2;
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z) {
            z2 = b(view, i2, i3, pVar);
        } else {
            z2 = a(view, i2, i3, pVar);
        }
        if (z2) {
            view.measure(i2, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d2, code lost:
        if (r13 == (r2 > r15)) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ff, code lost:
        if (r13 == (r2 > r8)) goto L_0x00f6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x010a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a(android.view.View r23, int r24, androidx.recyclerview.widget.RecyclerView.v r25, androidx.recyclerview.widget.RecyclerView.a0 r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r25
            r2 = r26
            android.view.View r3 = r22.b((android.view.View) r23)
            r4 = 0
            if (r3 != 0) goto L_0x000e
            return r4
        L_0x000e:
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r5 = (androidx.recyclerview.widget.GridLayoutManager.b) r5
            int r6 = r5.e
            int r5 = r5.f266f
            int r5 = r5 + r6
            android.view.View r7 = super.a((android.view.View) r23, (int) r24, (androidx.recyclerview.widget.RecyclerView.v) r25, (androidx.recyclerview.widget.RecyclerView.a0) r26)
            if (r7 != 0) goto L_0x0020
            return r4
        L_0x0020:
            r7 = r24
            int r7 = r0.i((int) r7)
            r9 = 1
            if (r7 != r9) goto L_0x002b
            r7 = 1
            goto L_0x002c
        L_0x002b:
            r7 = 0
        L_0x002c:
            boolean r10 = r0.x
            if (r7 == r10) goto L_0x0032
            r7 = 1
            goto L_0x0033
        L_0x0032:
            r7 = 0
        L_0x0033:
            r10 = -1
            if (r7 == 0) goto L_0x003e
            int r7 = r22.d()
            int r7 = r7 - r9
            r11 = -1
            r12 = -1
            goto L_0x0045
        L_0x003e:
            int r7 = r22.d()
            r11 = r7
            r7 = 0
            r12 = 1
        L_0x0045:
            int r13 = r0.s
            if (r13 != r9) goto L_0x0051
            boolean r13 = r22.w()
            if (r13 == 0) goto L_0x0051
            r13 = 1
            goto L_0x0052
        L_0x0051:
            r13 = 0
        L_0x0052:
            int r14 = r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.RecyclerView.a0) r2, (int) r7)
            r10 = r7
            r16 = r12
            r8 = -1
            r9 = 0
            r12 = 0
            r15 = -1
            r7 = r4
        L_0x005e:
            if (r10 == r11) goto L_0x0144
            r17 = r11
            int r11 = r0.a((androidx.recyclerview.widget.RecyclerView.v) r1, (androidx.recyclerview.widget.RecyclerView.a0) r2, (int) r10)
            android.view.View r1 = r0.c((int) r10)
            if (r1 != r3) goto L_0x006e
            goto L_0x0144
        L_0x006e:
            boolean r18 = r1.hasFocusable()
            if (r18 == 0) goto L_0x0085
            if (r11 == r14) goto L_0x0085
            if (r4 == 0) goto L_0x007a
            goto L_0x0144
        L_0x007a:
            r18 = r3
            r21 = r7
            r19 = r9
            r20 = r14
            r14 = 1
            goto L_0x0132
        L_0x0085:
            android.view.ViewGroup$LayoutParams r11 = r1.getLayoutParams()
            androidx.recyclerview.widget.GridLayoutManager$b r11 = (androidx.recyclerview.widget.GridLayoutManager.b) r11
            int r2 = r11.e
            r18 = r3
            int r3 = r11.f266f
            int r3 = r3 + r2
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x009d
            if (r2 != r6) goto L_0x009d
            if (r3 != r5) goto L_0x009d
            return r1
        L_0x009d:
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00a5
            if (r4 == 0) goto L_0x00ad
        L_0x00a5:
            boolean r19 = r1.hasFocusable()
            if (r19 != 0) goto L_0x00b6
            if (r7 != 0) goto L_0x00b6
        L_0x00ad:
            r21 = r7
        L_0x00af:
            r19 = r9
            r20 = r14
            r7 = 1
            r14 = 1
            goto L_0x0108
        L_0x00b6:
            int r19 = java.lang.Math.max(r2, r6)
            int r20 = java.lang.Math.min(r3, r5)
            r21 = r7
            int r7 = r20 - r19
            boolean r19 = r1.hasFocusable()
            if (r19 == 0) goto L_0x00d5
            if (r7 <= r9) goto L_0x00cb
        L_0x00ca:
            goto L_0x00af
        L_0x00cb:
            if (r7 != r9) goto L_0x0102
            if (r2 <= r15) goto L_0x00d1
            r7 = 1
            goto L_0x00d2
        L_0x00d1:
            r7 = 0
        L_0x00d2:
            if (r13 != r7) goto L_0x0102
            goto L_0x00ca
        L_0x00d5:
            if (r4 != 0) goto L_0x0102
            r19 = r9
            h.r.d.y r9 = r0.e
            r20 = r14
            r14 = 24579(0x6003, float:3.4443E-41)
            boolean r9 = r9.a(r1, r14)
            if (r9 == 0) goto L_0x00ef
            h.r.d.y r9 = r0.f315f
            boolean r9 = r9.a(r1, r14)
            if (r9 == 0) goto L_0x00ef
            r9 = 1
            goto L_0x00f0
        L_0x00ef:
            r9 = 0
        L_0x00f0:
            r14 = 1
            r9 = r9 ^ r14
            if (r9 == 0) goto L_0x0107
            if (r7 <= r12) goto L_0x00f8
        L_0x00f6:
            r7 = 1
            goto L_0x0108
        L_0x00f8:
            if (r7 != r12) goto L_0x0107
            if (r2 <= r8) goto L_0x00fe
            r7 = 1
            goto L_0x00ff
        L_0x00fe:
            r7 = 0
        L_0x00ff:
            if (r13 != r7) goto L_0x0107
            goto L_0x00f6
        L_0x0102:
            r19 = r9
            r20 = r14
            r14 = 1
        L_0x0107:
            r7 = 0
        L_0x0108:
            if (r7 == 0) goto L_0x0132
            boolean r7 = r1.hasFocusable()
            if (r7 == 0) goto L_0x0121
            int r4 = r11.e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r9 = r3 - r2
            r15 = r4
            r7 = r21
            r4 = r1
            goto L_0x0136
        L_0x0121:
            int r7 = r11.e
            int r3 = java.lang.Math.min(r3, r5)
            int r2 = java.lang.Math.max(r2, r6)
            int r12 = r3 - r2
            r8 = r7
            r9 = r19
            r7 = r1
            goto L_0x0136
        L_0x0132:
            r9 = r19
            r7 = r21
        L_0x0136:
            int r10 = r10 + r16
            r1 = r25
            r2 = r26
            r11 = r17
            r3 = r18
            r14 = r20
            goto L_0x005e
        L_0x0144:
            r21 = r7
            if (r4 == 0) goto L_0x0149
            goto L_0x014b
        L_0x0149:
            r4 = r21
        L_0x014b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.a(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    public final int a(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i2) {
        if (!a0Var.f283g) {
            return this.N.a(i2, this.I);
        }
        int a2 = vVar.a(i2);
        if (a2 != -1) {
            return this.N.a(a2, this.I);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i2);
        return 0;
    }
}
