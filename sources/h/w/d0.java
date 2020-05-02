package h.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import h.w.i;

/* compiled from: Visibility */
public abstract class d0 extends i {
    public static final String[] N = {"android:visibility:visibility", "android:visibility:parent"};
    public int M = 3;

    /* compiled from: Visibility */
    public static class a extends AnimatorListenerAdapter implements i.d {
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        public final int f2270b;
        public final ViewGroup c;
        public final boolean d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f2271f = false;

        public a(View view, int i2, boolean z) {
            this.a = view;
            this.f2270b = i2;
            this.c = (ViewGroup) view.getParent();
            this.d = z;
            a(true);
        }

        public void a(i iVar) {
            a(false);
        }

        public void b(i iVar) {
            a(true);
        }

        public void c(i iVar) {
        }

        public void d(i iVar) {
        }

        public void e(i iVar) {
            a();
            iVar.b((i.d) this);
        }

        public void onAnimationCancel(Animator animator) {
            this.f2271f = true;
        }

        public void onAnimationEnd(Animator animator) {
            a();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f2271f) {
                v.a.a(this.a, this.f2270b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f2271f) {
                v.a.a(this.a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }

        public final void a() {
            if (!this.f2271f) {
                v.a.a(this.a, this.f2270b);
                ViewGroup viewGroup = this.c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            a(false);
        }

        public final void a(boolean z) {
            ViewGroup viewGroup;
            if (this.d && this.e != z && (viewGroup = this.c) != null) {
                this.e = z;
                s.a(viewGroup, z);
            }
        }
    }

    /* compiled from: Visibility */
    public static class b {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f2272b;
        public int c;
        public int d;
        public ViewGroup e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f2273f;
    }

    public abstract Animator a(ViewGroup viewGroup, View view, q qVar, q qVar2);

    public void a(q qVar) {
        d(qVar);
    }

    public final b b(q qVar, q qVar2) {
        b bVar = new b();
        bVar.a = false;
        bVar.f2272b = false;
        if (qVar == null || !qVar.a.containsKey("android:visibility:visibility")) {
            bVar.c = -1;
            bVar.e = null;
        } else {
            bVar.c = ((Integer) qVar.a.get("android:visibility:visibility")).intValue();
            bVar.e = (ViewGroup) qVar.a.get("android:visibility:parent");
        }
        if (qVar2 == null || !qVar2.a.containsKey("android:visibility:visibility")) {
            bVar.d = -1;
            bVar.f2273f = null;
        } else {
            bVar.d = ((Integer) qVar2.a.get("android:visibility:visibility")).intValue();
            bVar.f2273f = (ViewGroup) qVar2.a.get("android:visibility:parent");
        }
        if (qVar == null || qVar2 == null) {
            if (qVar == null && bVar.d == 0) {
                bVar.f2272b = true;
                bVar.a = true;
            } else if (qVar2 == null && bVar.c == 0) {
                bVar.f2272b = false;
                bVar.a = true;
            }
        } else if (bVar.c == bVar.d && bVar.e == bVar.f2273f) {
            return bVar;
        } else {
            int i2 = bVar.c;
            int i3 = bVar.d;
            if (i2 != i3) {
                if (i2 == 0) {
                    bVar.f2272b = false;
                    bVar.a = true;
                } else if (i3 == 0) {
                    bVar.f2272b = true;
                    bVar.a = true;
                }
            } else if (bVar.f2273f == null) {
                bVar.f2272b = false;
                bVar.a = true;
            } else if (bVar.e == null) {
                bVar.f2272b = true;
                bVar.a = true;
            }
        }
        return bVar;
    }

    public String[] c() {
        return N;
    }

    public final void d(q qVar) {
        qVar.a.put("android:visibility:visibility", Integer.valueOf(qVar.f2291b.getVisibility()));
        qVar.a.put("android:visibility:parent", qVar.f2291b.getParent());
        int[] iArr = new int[2];
        qVar.f2291b.getLocationOnScreen(iArr);
        qVar.a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r14 = (java.lang.Float) r14.a.get("android:fade:transitionAlpha");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00e1, code lost:
        if (r12.z != false) goto L_0x00e3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator a(android.view.ViewGroup r13, h.w.q r14, h.w.q r15) {
        /*
            r12 = this;
            h.w.d0$b r0 = r12.b(r14, r15)
            boolean r1 = r0.a
            r2 = 0
            if (r1 == 0) goto L_0x0162
            android.view.ViewGroup r1 = r0.e
            if (r1 != 0) goto L_0x0011
            android.view.ViewGroup r1 = r0.f2273f
            if (r1 == 0) goto L_0x0162
        L_0x0011:
            boolean r1 = r0.f2272b
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0061
            int r13 = r12.M
            r13 = r13 & r3
            if (r13 != r3) goto L_0x0060
            if (r15 != 0) goto L_0x001f
            goto L_0x0060
        L_0x001f:
            if (r14 != 0) goto L_0x003a
            android.view.View r13 = r15.f2291b
            android.view.ViewParent r13 = r13.getParent()
            android.view.View r13 = (android.view.View) r13
            h.w.q r0 = r12.b(r13, r4)
            h.w.q r13 = r12.c(r13, r4)
            h.w.d0$b r13 = r12.b(r0, r13)
            boolean r13 = r13.a
            if (r13 == 0) goto L_0x003a
            goto L_0x0060
        L_0x003a:
            android.view.View r13 = r15.f2291b
            r15 = r12
            h.w.c r15 = (h.w.c) r15
            r0 = 0
            if (r14 == 0) goto L_0x0053
            java.util.Map<java.lang.String, java.lang.Object> r14 = r14.a
            java.lang.String r1 = "android:fade:transitionAlpha"
            java.lang.Object r14 = r14.get(r1)
            java.lang.Float r14 = (java.lang.Float) r14
            if (r14 == 0) goto L_0x0053
            float r14 = r14.floatValue()
            goto L_0x0054
        L_0x0053:
            r14 = 0
        L_0x0054:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r2 != 0) goto L_0x005b
            goto L_0x005c
        L_0x005b:
            r0 = r14
        L_0x005c:
            android.animation.Animator r2 = r15.a(r13, r0, r1)
        L_0x0060:
            return r2
        L_0x0061:
            int r0 = r0.d
            int r1 = r12.M
            r5 = 2
            r1 = r1 & r5
            if (r1 == r5) goto L_0x006b
            goto L_0x0162
        L_0x006b:
            if (r14 != 0) goto L_0x006f
            goto L_0x0162
        L_0x006f:
            android.view.View r1 = r14.f2291b
            if (r15 == 0) goto L_0x0076
            android.view.View r6 = r15.f2291b
            goto L_0x0077
        L_0x0076:
            r6 = r2
        L_0x0077:
            int r7 = h.w.f.save_overlay_view
            java.lang.Object r7 = r1.getTag(r7)
            android.view.View r7 = (android.view.View) r7
            if (r7 == 0) goto L_0x0085
            r6 = r2
            r8 = 1
            goto L_0x00eb
        L_0x0085:
            if (r6 == 0) goto L_0x0098
            android.view.ViewParent r7 = r6.getParent()
            if (r7 != 0) goto L_0x008e
            goto L_0x0098
        L_0x008e:
            r7 = 4
            if (r0 != r7) goto L_0x0092
            goto L_0x0094
        L_0x0092:
            if (r1 != r6) goto L_0x009d
        L_0x0094:
            r7 = r6
            r8 = 0
            r6 = r2
            goto L_0x00a0
        L_0x0098:
            if (r6 == 0) goto L_0x009d
            r7 = r2
            r8 = 0
            goto L_0x00a0
        L_0x009d:
            r6 = r2
            r7 = r6
            r8 = 1
        L_0x00a0:
            if (r8 == 0) goto L_0x00e7
            android.view.ViewParent r8 = r1.getParent()
            if (r8 != 0) goto L_0x00a9
            goto L_0x00e3
        L_0x00a9:
            android.view.ViewParent r8 = r1.getParent()
            boolean r8 = r8 instanceof android.view.View
            if (r8 == 0) goto L_0x00e7
            android.view.ViewParent r8 = r1.getParent()
            android.view.View r8 = (android.view.View) r8
            h.w.q r9 = r12.c(r8, r3)
            h.w.q r10 = r12.b(r8, r3)
            h.w.d0$b r9 = r12.b(r9, r10)
            boolean r9 = r9.a
            if (r9 != 0) goto L_0x00cc
            android.view.View r6 = h.w.p.a(r13, r1, r8)
            goto L_0x00e7
        L_0x00cc:
            int r9 = r8.getId()
            android.view.ViewParent r8 = r8.getParent()
            if (r8 != 0) goto L_0x00e7
            r8 = -1
            if (r9 == r8) goto L_0x00e7
            android.view.View r8 = r13.findViewById(r9)
            if (r8 == 0) goto L_0x00e7
            boolean r8 = r12.z
            if (r8 == 0) goto L_0x00e7
        L_0x00e3:
            r6 = r7
            r8 = 0
            r7 = r1
            goto L_0x00eb
        L_0x00e7:
            r8 = 0
            r11 = r7
            r7 = r6
            r6 = r11
        L_0x00eb:
            if (r7 == 0) goto L_0x013d
            if (r8 != 0) goto L_0x011f
            java.util.Map<java.lang.String, java.lang.Object> r0 = r14.a
            java.lang.String r2 = "android:visibility:screenLocation"
            java.lang.Object r0 = r0.get(r2)
            int[] r0 = (int[]) r0
            r2 = r0[r4]
            r0 = r0[r3]
            int[] r5 = new int[r5]
            r13.getLocationOnScreen(r5)
            r4 = r5[r4]
            int r2 = r2 - r4
            int r4 = r7.getLeft()
            int r2 = r2 - r4
            r7.offsetLeftAndRight(r2)
            r2 = r5[r3]
            int r0 = r0 - r2
            int r2 = r7.getTop()
            int r0 = r0 - r2
            r7.offsetTopAndBottom(r0)
            android.view.ViewGroupOverlay r0 = r13.getOverlay()
            r0.add(r7)
        L_0x011f:
            android.animation.Animator r2 = r12.a(r13, r7, r14, r15)
            if (r8 != 0) goto L_0x0162
            if (r2 != 0) goto L_0x012f
            android.view.ViewGroupOverlay r13 = r13.getOverlay()
            r13.remove(r7)
            goto L_0x0162
        L_0x012f:
            int r14 = h.w.f.save_overlay_view
            r1.setTag(r14, r7)
            h.w.c0 r14 = new h.w.c0
            r14.<init>(r12, r13, r7, r1)
            r12.a((h.w.i.d) r14)
            goto L_0x0162
        L_0x013d:
            if (r6 == 0) goto L_0x0162
            int r1 = r6.getVisibility()
            h.w.b0 r2 = h.w.v.a
            r2.a((android.view.View) r6, (int) r4)
            android.animation.Animator r2 = r12.a(r13, r6, r14, r15)
            if (r2 == 0) goto L_0x015d
            h.w.d0$a r13 = new h.w.d0$a
            r13.<init>(r6, r0, r3)
            r2.addListener(r13)
            r2.addPauseListener(r13)
            r12.a((h.w.i.d) r13)
            goto L_0x0162
        L_0x015d:
            h.w.b0 r13 = h.w.v.a
            r13.a((android.view.View) r6, (int) r1)
        L_0x0162:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.w.d0.a(android.view.ViewGroup, h.w.q, h.w.q):android.animation.Animator");
    }

    public boolean a(q qVar, q qVar2) {
        if (qVar == null && qVar2 == null) {
            return false;
        }
        if (qVar != null && qVar2 != null && qVar2.a.containsKey("android:visibility:visibility") != qVar.a.containsKey("android:visibility:visibility")) {
            return false;
        }
        b b2 = b(qVar, qVar2);
        if (!b2.a) {
            return false;
        }
        if (b2.c == 0 || b2.d == 0) {
            return true;
        }
        return false;
    }
}
