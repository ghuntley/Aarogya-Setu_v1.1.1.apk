package h.j.b;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.core.LogFileManager;
import com.google.android.material.chip.Chip;
import h.e.i;
import h.h.m.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ExploreByTouchHelper */
public abstract class a extends h.h.m.a {

    /* renamed from: n  reason: collision with root package name */
    public static final Rect f1865n = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, RecyclerView.UNDEFINED_DURATION, RecyclerView.UNDEFINED_DURATION);

    /* renamed from: o  reason: collision with root package name */
    public static final b<h.h.m.w.b> f1866o = new C0056a();

    /* renamed from: p  reason: collision with root package name */
    public static final c<i<h.h.m.w.b>, h.h.m.w.b> f1867p = new b();
    public final Rect d = new Rect();
    public final Rect e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f1868f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final int[] f1869g = new int[2];

    /* renamed from: h  reason: collision with root package name */
    public final AccessibilityManager f1870h;

    /* renamed from: i  reason: collision with root package name */
    public final View f1871i;

    /* renamed from: j  reason: collision with root package name */
    public c f1872j;

    /* renamed from: k  reason: collision with root package name */
    public int f1873k = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: l  reason: collision with root package name */
    public int f1874l = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: m  reason: collision with root package name */
    public int f1875m = RecyclerView.UNDEFINED_DURATION;

    /* renamed from: h.j.b.a$a  reason: collision with other inner class name */
    /* compiled from: ExploreByTouchHelper */
    public static class C0056a implements b<h.h.m.w.b> {
        public void a(Object obj, Rect rect) {
            ((h.h.m.w.b) obj).a.getBoundsInParent(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper */
    public static class b implements c<i<h.h.m.w.b>, h.h.m.w.b> {
    }

    public a(View view) {
        if (view != null) {
            this.f1871i = view;
            this.f1870h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (m.i(view) == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public h.h.m.w.c a(View view) {
        if (this.f1872j == null) {
            this.f1872j = new c();
        }
        return this.f1872j;
    }

    public abstract void a(int i2, h.h.m.w.b bVar);

    public abstract void a(List<Integer> list);

    public abstract boolean a(int i2, int i3, Bundle bundle);

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public final h.h.m.w.b c(int i2) {
        h.h.m.w.b bVar = new h.h.m.w.b(AccessibilityNodeInfo.obtain());
        bVar.a.setEnabled(true);
        bVar.a.setFocusable(true);
        bVar.a.setClassName("android.view.View");
        bVar.a.setBoundsInParent(f1865n);
        bVar.a.setBoundsInScreen(f1865n);
        View view = this.f1871i;
        bVar.f1824b = -1;
        bVar.a.setParent(view);
        a(i2, bVar);
        if (bVar.c() == null && bVar.a() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        bVar.a.getBoundsInParent(this.e);
        if (!this.e.equals(f1865n)) {
            int actions = bVar.a.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                bVar.a.setPackageName(this.f1871i.getContext().getPackageName());
                View view2 = this.f1871i;
                bVar.c = i2;
                bVar.a.setSource(view2, i2);
                boolean z = false;
                if (this.f1873k == i2) {
                    bVar.a.setAccessibilityFocused(true);
                    bVar.a.addAction(128);
                } else {
                    bVar.a.setAccessibilityFocused(false);
                    bVar.a.addAction(64);
                }
                boolean z2 = this.f1874l == i2;
                if (z2) {
                    bVar.a.addAction(2);
                } else if (bVar.a.isFocusable()) {
                    bVar.a.addAction(1);
                }
                bVar.a.setFocused(z2);
                this.f1871i.getLocationOnScreen(this.f1869g);
                bVar.a.getBoundsInScreen(this.d);
                if (this.d.equals(f1865n)) {
                    bVar.a.getBoundsInParent(this.d);
                    if (bVar.f1824b != -1) {
                        h.h.m.w.b bVar2 = new h.h.m.w.b(AccessibilityNodeInfo.obtain());
                        for (int i3 = bVar.f1824b; i3 != -1; i3 = bVar2.f1824b) {
                            View view3 = this.f1871i;
                            bVar2.f1824b = -1;
                            bVar2.a.setParent(view3, -1);
                            bVar2.a.setBoundsInParent(f1865n);
                            a(i3, bVar2);
                            bVar2.a.getBoundsInParent(this.e);
                            Rect rect = this.d;
                            Rect rect2 = this.e;
                            rect.offset(rect2.left, rect2.top);
                        }
                        bVar2.a.recycle();
                    }
                    this.d.offset(this.f1869g[0] - this.f1871i.getScrollX(), this.f1869g[1] - this.f1871i.getScrollY());
                }
                if (this.f1871i.getLocalVisibleRect(this.f1868f)) {
                    this.f1868f.offset(this.f1869g[0] - this.f1871i.getScrollX(), this.f1869g[1] - this.f1871i.getScrollY());
                    if (this.d.intersect(this.f1868f)) {
                        bVar.a.setBoundsInScreen(this.d);
                        Rect rect3 = this.d;
                        if (rect3 != null && !rect3.isEmpty() && this.f1871i.getWindowVisibility() == 0) {
                            ViewParent parent = this.f1871i.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view4 = (View) parent;
                                    if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view4.getParent();
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            bVar.a.setVisibleToUser(true);
                        }
                    }
                }
                return bVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public h.h.m.w.b d(int i2) {
        if (i2 != -1) {
            return c(i2);
        }
        h.h.m.w.b bVar = new h.h.m.w.b(AccessibilityNodeInfo.obtain(this.f1871i));
        m.a(this.f1871i, bVar);
        ArrayList arrayList = new ArrayList();
        a((List<Integer>) arrayList);
        if (bVar.a.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                bVar.a.addChild(this.f1871i, ((Integer) arrayList.get(i3)).intValue());
            }
            return bVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public final boolean e(int i2) {
        int i3;
        if ((!this.f1871i.isFocused() && !this.f1871i.requestFocus()) || (i3 = this.f1874l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            b(i3);
        }
        this.f1874l = i2;
        Chip.b bVar = (Chip.b) this;
        if (i2 == 1) {
            Chip chip = Chip.this;
            chip.f605p = true;
            chip.refreshDrawableState();
        }
        a(i2, 8);
        return true;
    }

    public final void f(int i2) {
        int i3 = this.f1875m;
        if (i3 != i2) {
            this.f1875m = i2;
            a(i2, 128);
            a(i3, 256);
        }
    }

    public final boolean b(int i2) {
        if (this.f1874l != i2) {
            return false;
        }
        this.f1874l = RecyclerView.UNDEFINED_DURATION;
        Chip.b bVar = (Chip.b) this;
        if (i2 == 1) {
            Chip chip = Chip.this;
            chip.f605p = false;
            chip.refreshDrawableState();
        }
        a(i2, 8);
        return true;
    }

    /* compiled from: ExploreByTouchHelper */
    public class c extends h.h.m.w.c {
        public c() {
        }

        public h.h.m.w.b a(int i2) {
            return new h.h.m.w.b(AccessibilityNodeInfo.obtain(a.this.d(i2).a));
        }

        public h.h.m.w.b b(int i2) {
            int i3 = i2 == 2 ? a.this.f1873k : a.this.f1874l;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return new h.h.m.w.b(AccessibilityNodeInfo.obtain(a.this.d(i3).a));
        }

        public boolean a(int i2, int i3, Bundle bundle) {
            int i4;
            a aVar = a.this;
            if (i2 == -1) {
                return m.a(aVar.f1871i, i3, bundle);
            }
            boolean z = true;
            if (i3 == 1) {
                return aVar.e(i2);
            }
            if (i3 == 2) {
                return aVar.b(i2);
            }
            if (i3 == 64) {
                if (!aVar.f1870h.isEnabled() || !aVar.f1870h.isTouchExplorationEnabled() || (i4 = aVar.f1873k) == i2) {
                    z = false;
                } else {
                    if (i4 != Integer.MIN_VALUE) {
                        aVar.a(i4);
                    }
                    aVar.f1873k = i2;
                    aVar.f1871i.invalidate();
                    aVar.a(i2, 32768);
                }
                return z;
            } else if (i3 != 128) {
                return aVar.a(i2, i3, bundle);
            } else {
                return aVar.a(i2);
            }
        }
    }

    public void a(View view, h.h.m.w.b bVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
        Chip.b bVar2 = (Chip.b) this;
        bVar.a.setCheckable(Chip.this.c());
        bVar.a.setClickable(Chip.this.isClickable());
        if (Chip.this.c() || Chip.this.isClickable()) {
            bVar.a.setClassName(Chip.this.c() ? "android.widget.CompoundButton" : "android.widget.Button");
        } else {
            bVar.a.setClassName("android.view.View");
        }
        CharSequence text = Chip.this.getText();
        if (Build.VERSION.SDK_INT >= 23) {
            bVar.a.setText(text);
        } else {
            bVar.a.setContentDescription(text);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0137, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x0139;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0143 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.a((java.util.List<java.lang.Integer>) r3)
            h.e.i r4 = new h.e.i
            r5 = 10
            r4.<init>(r5)
            r5 = 0
            r6 = 0
        L_0x0017:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0027
            h.h.m.w.b r7 = r0.c(r6)
            r4.c(r6, r7)
            int r6 = r6 + 1
            goto L_0x0017
        L_0x0027:
            int r3 = r0.f1874l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x002f
            r3 = 0
            goto L_0x0035
        L_0x002f:
            java.lang.Object r3 = r4.a(r3)
            h.h.m.w.b r3 = (h.h.m.w.b) r3
        L_0x0035:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x0148
            if (r1 == r8) goto L_0x0148
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0055
            if (r1 == r12) goto L_0x0055
            if (r1 == r11) goto L_0x0055
            if (r1 != r8) goto L_0x004d
            goto L_0x0055
        L_0x004d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0055:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f1874l
            java.lang.String r6 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r7) goto L_0x006a
            h.h.m.w.b r2 = r0.d(r15)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.a
            r2.getBoundsInParent(r14)
            goto L_0x0097
        L_0x006a:
            if (r2 == 0) goto L_0x0070
            r14.set(r2)
            goto L_0x0097
        L_0x0070:
            android.view.View r2 = r0.f1871i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x0094
            if (r1 == r12) goto L_0x0090
            if (r1 == r11) goto L_0x008c
            if (r1 != r8) goto L_0x0086
            r14.set(r5, r9, r15, r9)
            goto L_0x0097
        L_0x0086:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x008c:
            r14.set(r9, r5, r9, r2)
            goto L_0x0097
        L_0x0090:
            r14.set(r5, r2, r15, r2)
            goto L_0x0097
        L_0x0094:
            r14.set(r15, r5, r15, r2)
        L_0x0097:
            h.j.b.c<h.e.i<h.h.m.w.b>, h.h.m.w.b> r2 = f1867p
            h.j.b.b<h.h.m.w.b> r15 = f1866o
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r14)
            if (r1 == r13) goto L_0x00cb
            if (r1 == r12) goto L_0x00c2
            if (r1 == r11) goto L_0x00b8
            if (r1 != r8) goto L_0x00b2
            int r6 = r14.height()
            int r6 = r6 + r10
            int r6 = -r6
            r7.offset(r5, r6)
            goto L_0x00d3
        L_0x00b2:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x00b8:
            int r6 = r14.width()
            int r6 = r6 + r10
            int r6 = -r6
            r7.offset(r6, r5)
            goto L_0x00d3
        L_0x00c2:
            int r6 = r14.height()
            int r6 = r6 + r10
            r7.offset(r5, r6)
            goto L_0x00d3
        L_0x00cb:
            int r6 = r14.width()
            int r6 = r6 + r10
            r7.offset(r6, r5)
        L_0x00d3:
            h.j.b.a$b r2 = (h.j.b.a.b) r2
            if (r2 == 0) goto L_0x0146
            int r2 = r4.c()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r8 = 0
            r16 = 0
        L_0x00e3:
            if (r8 >= r2) goto L_0x01ba
            boolean r11 = r4.e
            if (r11 == 0) goto L_0x00ec
            r4.b()
        L_0x00ec:
            java.lang.Object[] r11 = r4.f1573g
            r11 = r11[r8]
            h.h.m.w.b r11 = (h.h.m.w.b) r11
            if (r11 != r3) goto L_0x00f5
            goto L_0x0143
        L_0x00f5:
            r12 = r15
            h.j.b.a$a r12 = (h.j.b.a.C0056a) r12
            r12.a(r11, r6)
            boolean r12 = g.a.a.b.a.a((android.graphics.Rect) r14, (android.graphics.Rect) r6, (int) r1)
            if (r12 != 0) goto L_0x0102
            goto L_0x013b
        L_0x0102:
            boolean r12 = g.a.a.b.a.a((android.graphics.Rect) r14, (android.graphics.Rect) r7, (int) r1)
            if (r12 != 0) goto L_0x0109
            goto L_0x0139
        L_0x0109:
            boolean r12 = g.a.a.b.a.a((int) r1, (android.graphics.Rect) r14, (android.graphics.Rect) r6, (android.graphics.Rect) r7)
            if (r12 == 0) goto L_0x0110
            goto L_0x0139
        L_0x0110:
            boolean r12 = g.a.a.b.a.a((int) r1, (android.graphics.Rect) r14, (android.graphics.Rect) r7, (android.graphics.Rect) r6)
            if (r12 == 0) goto L_0x0117
            goto L_0x013b
        L_0x0117:
            int r12 = g.a.a.b.a.b((int) r1, (android.graphics.Rect) r14, (android.graphics.Rect) r6)
            int r13 = g.a.a.b.a.c(r1, r14, r6)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = g.a.a.b.a.b((int) r1, (android.graphics.Rect) r14, (android.graphics.Rect) r7)
            int r17 = g.a.a.b.a.c(r1, r14, r7)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x013b
        L_0x0139:
            r12 = 1
            goto L_0x013c
        L_0x013b:
            r12 = 0
        L_0x013c:
            if (r12 == 0) goto L_0x0143
            r7.set(r6)
            r16 = r11
        L_0x0143:
            int r8 = r8 + 1
            goto L_0x00e3
        L_0x0146:
            r1 = 0
            throw r1
        L_0x0148:
            android.view.View r2 = r0.f1871i
            int r2 = h.h.m.m.k(r2)
            if (r2 != r10) goto L_0x0152
            r2 = 1
            goto L_0x0153
        L_0x0152:
            r2 = 0
        L_0x0153:
            h.j.b.c<h.e.i<h.h.m.w.b>, h.h.m.w.b> r6 = f1867p
            h.j.b.b<h.h.m.w.b> r7 = f1866o
            h.j.b.a$b r6 = (h.j.b.a.b) r6
            if (r6 == 0) goto L_0x01e0
            int r6 = r4.c()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = 0
        L_0x0165:
            if (r12 >= r6) goto L_0x017a
            boolean r13 = r4.e
            if (r13 == 0) goto L_0x016e
            r4.b()
        L_0x016e:
            java.lang.Object[] r13 = r4.f1573g
            r13 = r13[r12]
            h.h.m.w.b r13 = (h.h.m.w.b) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x0165
        L_0x017a:
            h.j.b.d r6 = new h.j.b.d
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x01a4
            if (r1 != r8) goto L_0x019c
            int r1 = r11.size()
            if (r3 != 0) goto L_0x018e
            r2 = -1
            goto L_0x0192
        L_0x018e:
            int r2 = r11.lastIndexOf(r3)
        L_0x0192:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x019a
            java.lang.Object r6 = r11.get(r2)
            goto L_0x01b6
        L_0x019a:
            r6 = 0
            goto L_0x01b6
        L_0x019c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01a4:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01ab
            goto L_0x01af
        L_0x01ab:
            int r1 = r11.indexOf(r3)
        L_0x01af:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x019a
            java.lang.Object r6 = r11.get(r1)
        L_0x01b6:
            r16 = r6
            h.h.m.w.b r16 = (h.h.m.w.b) r16
        L_0x01ba:
            r1 = r16
            if (r1 != 0) goto L_0x01c1
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01db
        L_0x01c1:
            boolean r2 = r4.e
            if (r2 == 0) goto L_0x01c8
            r4.b()
        L_0x01c8:
            int r2 = r4.f1574h
            if (r5 >= r2) goto L_0x01d7
            java.lang.Object[] r2 = r4.f1573g
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01d4
            r9 = r5
            goto L_0x01d7
        L_0x01d4:
            int r5 = r5 + 1
            goto L_0x01c8
        L_0x01d7:
            int r7 = r4.b(r9)
        L_0x01db:
            boolean r1 = r0.e(r7)
            return r1
        L_0x01e0:
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.j.b.a.a(int, android.graphics.Rect):boolean");
    }

    public final boolean a(int i2, int i3) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i2 == Integer.MIN_VALUE || !this.f1870h.isEnabled() || (parent = this.f1871i.getParent()) == null) {
            return false;
        }
        if (i2 != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i3);
            h.h.m.w.b d2 = d(i2);
            accessibilityEvent.getText().add(d2.c());
            accessibilityEvent.setContentDescription(d2.a());
            accessibilityEvent.setScrollable(d2.a.isScrollable());
            accessibilityEvent.setPassword(d2.a.isPassword());
            accessibilityEvent.setEnabled(d2.a.isEnabled());
            accessibilityEvent.setChecked(d2.a.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(d2.a.getClassName());
                accessibilityEvent.setSource(this.f1871i, i2);
                accessibilityEvent.setPackageName(this.f1871i.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i3);
            this.f1871i.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.f1871i, accessibilityEvent);
    }

    public final boolean a(int i2) {
        if (this.f1873k != i2) {
            return false;
        }
        this.f1873k = RecyclerView.UNDEFINED_DURATION;
        this.f1871i.invalidate();
        a(i2, (int) LogFileManager.MAX_LOG_SIZE);
        return true;
    }
}
