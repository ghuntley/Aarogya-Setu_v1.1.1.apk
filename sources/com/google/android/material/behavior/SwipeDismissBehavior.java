package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import h.h.m.m;
import h.h.m.w.b;
import h.j.b.e;
import i.c.a.c.f0.l;
import i.c.a.c.f0.p;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public e a;

    /* renamed from: b  reason: collision with root package name */
    public b f549b;
    public boolean c;
    public float d = 0.0f;
    public int e = 2;

    /* renamed from: f  reason: collision with root package name */
    public float f550f = 0.5f;

    /* renamed from: g  reason: collision with root package name */
    public float f551g = 0.0f;

    /* renamed from: h  reason: collision with root package name */
    public float f552h = 0.5f;

    /* renamed from: i  reason: collision with root package name */
    public final e.c f553i = new a();

    public interface b {
    }

    public class c implements Runnable {
        public final View e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f555f;

        public c(View view, boolean z) {
            this.e = view;
            this.f555f = z;
        }

        public void run() {
            b bVar;
            e eVar = SwipeDismissBehavior.this.a;
            if (eVar != null && eVar.a(true)) {
                m.a(this.e, (Runnable) this);
            } else if (this.f555f && (bVar = SwipeDismissBehavior.this.f549b) != null) {
                ((l) bVar).a(this.e);
            }
        }
    }

    public boolean a(View view) {
        return true;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i2) {
        if (m.i(v) == 0) {
            v.setImportantForAccessibility(1);
            m.f(v, 1048576);
            if (a(v)) {
                m.a(v, b.a.f1829j, (CharSequence) null, new i.c.a.c.n.a(this));
            }
        }
        return false;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        e eVar = this.a;
        if (eVar == null) {
            return false;
        }
        eVar.a(motionEvent);
        return true;
    }

    public class a extends e.c {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f554b = -1;

        public a() {
        }

        public void a(View view, int i2) {
            this.f554b = i2;
            this.a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        public boolean b(View view, int i2) {
            int i3 = this.f554b;
            return (i3 == -1 || i3 == i2) && SwipeDismissBehavior.this.a(view);
        }

        public int b(View view, int i2, int i3) {
            return view.getTop();
        }

        public void a(int i2) {
            b bVar = SwipeDismissBehavior.this.f549b;
            if (bVar != null) {
                l lVar = (l) bVar;
                if (lVar == null) {
                    throw null;
                } else if (i2 == 0) {
                    p.b().g(lVar.a.f648n);
                } else if (i2 == 1 || i2 == 2) {
                    p.b().f(lVar.a.f648n);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0054, code lost:
            if (java.lang.Math.abs(r8.getLeft() - r7.a) >= java.lang.Math.round(((float) r8.getWidth()) * r7.c.f550f)) goto L_0x002a;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:28:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0076  */
        /* JADX WARNING: Removed duplicated region for block: B:32:0x0081  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f554b = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x003a
                int r4 = h.h.m.m.k(r8)
                if (r4 != r2) goto L_0x0016
                r4 = 1
                goto L_0x0017
            L_0x0016:
                r4 = 0
            L_0x0017:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.e
                r6 = 2
                if (r5 != r6) goto L_0x001f
                goto L_0x002a
            L_0x001f:
                if (r5 != 0) goto L_0x002e
                if (r4 == 0) goto L_0x0028
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002c
                goto L_0x002a
            L_0x0028:
                if (r3 <= 0) goto L_0x002c
            L_0x002a:
                r9 = 1
                goto L_0x0057
            L_0x002c:
                r9 = 0
                goto L_0x0057
            L_0x002e:
                if (r5 != r2) goto L_0x002c
                if (r4 == 0) goto L_0x0035
                if (r3 <= 0) goto L_0x002c
                goto L_0x0039
            L_0x0035:
                int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r9 >= 0) goto L_0x002c
            L_0x0039:
                goto L_0x002a
            L_0x003a:
                int r9 = r8.getLeft()
                int r0 = r7.a
                int r9 = r9 - r0
                int r0 = r8.getWidth()
                float r0 = (float) r0
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f550f
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r0) goto L_0x002c
                goto L_0x002a
            L_0x0057:
                if (r9 == 0) goto L_0x0066
                int r9 = r8.getLeft()
                int r0 = r7.a
                if (r9 >= r0) goto L_0x0063
                int r0 = r0 - r10
                goto L_0x0064
            L_0x0063:
                int r0 = r0 + r10
            L_0x0064:
                r1 = 1
                goto L_0x0068
            L_0x0066:
                int r0 = r7.a
            L_0x0068:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                h.j.b.e r9 = r9.a
                int r10 = r8.getTop()
                boolean r9 = r9.b((int) r0, (int) r10)
                if (r9 == 0) goto L_0x0081
                com.google.android.material.behavior.SwipeDismissBehavior$c r9 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                h.h.m.m.a((android.view.View) r8, (java.lang.Runnable) r9)
                goto L_0x008e
            L_0x0081:
                if (r1 == 0) goto L_0x008e
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = r9.f549b
                if (r9 == 0) goto L_0x008e
                i.c.a.c.f0.l r9 = (i.c.a.c.f0.l) r9
                r9.a(r8)
            L_0x008e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.a(android.view.View, float, float):void");
        }

        public int a(View view) {
            return view.getWidth();
        }

        public int a(View view, int i2, int i3) {
            int i4;
            int i5;
            int width;
            boolean z = m.k(view) == 1;
            int i6 = SwipeDismissBehavior.this.e;
            if (i6 != 0) {
                if (i6 != 1) {
                    i4 = this.a - view.getWidth();
                    i5 = view.getWidth() + this.a;
                } else if (z) {
                    i4 = this.a;
                    width = view.getWidth();
                } else {
                    i4 = this.a - view.getWidth();
                    i5 = this.a;
                }
                return Math.min(Math.max(i4, i2), i5);
            } else if (z) {
                i4 = this.a - view.getWidth();
                i5 = this.a;
                return Math.min(Math.max(i4, i2), i5);
            } else {
                i4 = this.a;
                width = view.getWidth();
            }
            i5 = width + i4;
            return Math.min(Math.max(i4, i2), i5);
        }

        public void a(View view, int i2, int i3, int i4, int i5) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f551g) + ((float) this.a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.f552h) + ((float) this.a);
            float f2 = (float) i2;
            if (f2 <= width) {
                view.setAlpha(1.0f);
            } else if (f2 >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - ((f2 - width) / (width2 - width)), 1.0f));
            }
        }
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        if (this.a == null) {
            this.a = new e(coordinatorLayout.getContext(), coordinatorLayout, this.f553i);
        }
        return this.a.c(motionEvent);
    }

    public static float a(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }
}
