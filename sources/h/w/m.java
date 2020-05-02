package h.w;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import h.w.i;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionManager */
public class m {
    public static i a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadLocal<WeakReference<h.e.a<ViewGroup, ArrayList<i>>>> f2288b = new ThreadLocal<>();
    public static ArrayList<ViewGroup> c = new ArrayList<>();

    /* compiled from: TransitionManager */
    public static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
        public i e;

        /* renamed from: f  reason: collision with root package name */
        public ViewGroup f2289f;

        /* renamed from: h.w.m$a$a  reason: collision with other inner class name */
        /* compiled from: TransitionManager */
        public class C0074a extends l {
            public final /* synthetic */ h.e.a a;

            public C0074a(h.e.a aVar) {
                this.a = aVar;
            }

            public void e(i iVar) {
                ((ArrayList) this.a.get(a.this.f2289f)).remove(iVar);
                iVar.b((i.d) this);
            }
        }

        public a(i iVar, ViewGroup viewGroup) {
            this.e = iVar;
            this.f2289f = viewGroup;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:137:0x02b5  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0078  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onPreDraw() {
            /*
                r18 = this;
                r0 = r18
                android.view.ViewGroup r1 = r0.f2289f
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f2289f
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = h.w.m.c
                android.view.ViewGroup r2 = r0.f2289f
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                h.e.a r1 = h.w.m.a()
                android.view.ViewGroup r3 = r0.f2289f
                java.lang.Object r3 = r1.get(r3)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                r4 = 0
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f2289f
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                h.w.i r6 = r0.e
                r3.add(r6)
                h.w.i r3 = r0.e
                h.w.m$a$a r6 = new h.w.m$a$a
                r6.<init>(r1)
                r3.a((h.w.i.d) r6)
                h.w.i r1 = r0.e
                android.view.ViewGroup r3 = r0.f2289f
                r6 = 0
                r1.a((android.view.ViewGroup) r3, (boolean) r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                h.w.i r3 = (h.w.i) r3
                android.view.ViewGroup r5 = r0.f2289f
                r3.e(r5)
                goto L_0x0060
            L_0x0072:
                h.w.i r1 = r0.e
                android.view.ViewGroup r8 = r0.f2289f
                if (r1 == 0) goto L_0x02b5
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.x = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.y = r3
                h.w.r r3 = r1.t
                h.w.r r5 = r1.u
                h.e.a r7 = new h.e.a
                h.e.a<android.view.View, h.w.q> r9 = r3.a
                r7.<init>((h.e.h) r9)
                h.e.a r9 = new h.e.a
                h.e.a<android.view.View, h.w.q> r10 = r5.a
                r9.<init>((h.e.h) r10)
                r10 = 0
            L_0x0099:
                int[] r11 = r1.w
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01f3
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01b3
                r12 = 2
                if (r11 == r12) goto L_0x0165
                r12 = 3
                if (r11 == r12) goto L_0x0111
                r12 = 4
                if (r11 == r12) goto L_0x00ae
            L_0x00ab:
                r17 = r3
                goto L_0x010d
            L_0x00ae:
                h.e.e<android.view.View> r11 = r3.c
                h.e.e<android.view.View> r12 = r5.c
                int r13 = r11.d()
                r14 = 0
            L_0x00b7:
                if (r14 >= r13) goto L_0x00ab
                java.lang.Object r15 = r11.a((int) r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x0103
                boolean r16 = r1.b((android.view.View) r15)
                if (r16 == 0) goto L_0x0103
                boolean r6 = r11.e
                if (r6 == 0) goto L_0x00ce
                r11.c()
            L_0x00ce:
                long[] r6 = r11.f1551f
                r17 = r3
                r2 = r6[r14]
                java.lang.Object r2 = r12.a((long) r2)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x0105
                boolean r3 = r1.b((android.view.View) r2)
                if (r3 == 0) goto L_0x0105
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                h.w.q r3 = (h.w.q) r3
                java.lang.Object r6 = r9.getOrDefault(r2, r4)
                h.w.q r6 = (h.w.q) r6
                if (r3 == 0) goto L_0x0105
                if (r6 == 0) goto L_0x0105
                java.util.ArrayList<h.w.q> r4 = r1.x
                r4.add(r3)
                java.util.ArrayList<h.w.q> r3 = r1.y
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x0105
            L_0x0103:
                r17 = r3
            L_0x0105:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00b7
            L_0x010d:
                r2 = r17
                goto L_0x01e9
            L_0x0111:
                r2 = r3
                android.util.SparseArray<android.view.View> r3 = r2.f2292b
                android.util.SparseArray<android.view.View> r4 = r5.f2292b
                int r6 = r3.size()
                r11 = 0
            L_0x011b:
                if (r11 >= r6) goto L_0x01e9
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x0160
                boolean r13 = r1.b((android.view.View) r12)
                if (r13 == 0) goto L_0x0160
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x0160
                boolean r14 = r1.b((android.view.View) r13)
                if (r14 == 0) goto L_0x0160
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                h.w.q r15 = (h.w.q) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                h.w.q r14 = (h.w.q) r14
                if (r15 == 0) goto L_0x0160
                if (r14 == 0) goto L_0x0160
                java.util.ArrayList<h.w.q> r0 = r1.x
                r0.add(r15)
                java.util.ArrayList<h.w.q> r0 = r1.y
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x0160:
                int r11 = r11 + 1
                r0 = r18
                goto L_0x011b
            L_0x0165:
                r2 = r3
                h.e.a<java.lang.String, android.view.View> r0 = r2.d
                h.e.a<java.lang.String, android.view.View> r3 = r5.d
                int r4 = r0.f1570g
                r6 = 0
            L_0x016d:
                if (r6 >= r4) goto L_0x01e9
                java.lang.Object r11 = r0.e(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01b0
                boolean r12 = r1.b((android.view.View) r11)
                if (r12 == 0) goto L_0x01b0
                java.lang.Object r12 = r0.c(r6)
                java.lang.Object r12 = r3.get(r12)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01b0
                boolean r13 = r1.b((android.view.View) r12)
                if (r13 == 0) goto L_0x01b0
                r13 = 0
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                h.w.q r14 = (h.w.q) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                h.w.q r15 = (h.w.q) r15
                if (r14 == 0) goto L_0x01b0
                if (r15 == 0) goto L_0x01b0
                java.util.ArrayList<h.w.q> r13 = r1.x
                r13.add(r14)
                java.util.ArrayList<h.w.q> r13 = r1.y
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01b0:
                int r6 = r6 + 1
                goto L_0x016d
            L_0x01b3:
                r2 = r3
                int r0 = r7.f1570g
            L_0x01b6:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01e9
                java.lang.Object r3 = r7.c(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01b6
                boolean r4 = r1.b((android.view.View) r3)
                if (r4 == 0) goto L_0x01b6
                java.lang.Object r3 = r9.remove(r3)
                h.w.q r3 = (h.w.q) r3
                if (r3 == 0) goto L_0x01b6
                android.view.View r4 = r3.f2291b
                boolean r4 = r1.b((android.view.View) r4)
                if (r4 == 0) goto L_0x01b6
                java.lang.Object r4 = r7.d(r0)
                h.w.q r4 = (h.w.q) r4
                java.util.ArrayList<h.w.q> r6 = r1.x
                r6.add(r4)
                java.util.ArrayList<h.w.q> r4 = r1.y
                r4.add(r3)
                goto L_0x01b6
            L_0x01e9:
                int r10 = r10 + 1
                r0 = r18
                r3 = r2
                r4 = 0
                r6 = 0
                r2 = 1
                goto L_0x0099
            L_0x01f3:
                r0 = 0
            L_0x01f4:
                int r2 = r7.f1570g
                if (r0 >= r2) goto L_0x0214
                java.lang.Object r2 = r7.e(r0)
                h.w.q r2 = (h.w.q) r2
                android.view.View r3 = r2.f2291b
                boolean r3 = r1.b((android.view.View) r3)
                if (r3 == 0) goto L_0x0211
                java.util.ArrayList<h.w.q> r3 = r1.x
                r3.add(r2)
                java.util.ArrayList<h.w.q> r2 = r1.y
                r3 = 0
                r2.add(r3)
            L_0x0211:
                int r0 = r0 + 1
                goto L_0x01f4
            L_0x0214:
                r0 = 0
            L_0x0215:
                int r2 = r9.f1570g
                if (r0 >= r2) goto L_0x0235
                java.lang.Object r2 = r9.e(r0)
                h.w.q r2 = (h.w.q) r2
                android.view.View r3 = r2.f2291b
                boolean r3 = r1.b((android.view.View) r3)
                if (r3 == 0) goto L_0x0232
                java.util.ArrayList<h.w.q> r3 = r1.y
                r3.add(r2)
                java.util.ArrayList<h.w.q> r2 = r1.x
                r3 = 0
                r2.add(r3)
            L_0x0232:
                int r0 = r0 + 1
                goto L_0x0215
            L_0x0235:
                h.e.a r0 = h.w.i.g()
                int r2 = r0.f1570g
                h.w.f0 r3 = h.w.v.c(r8)
                r4 = 1
                int r2 = r2 - r4
            L_0x0241:
                if (r2 < 0) goto L_0x02a4
                java.lang.Object r4 = r0.c(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                if (r4 == 0) goto L_0x02a1
                r5 = 0
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                h.w.i$b r6 = (h.w.i.b) r6
                if (r6 == 0) goto L_0x02a1
                android.view.View r5 = r6.a
                if (r5 == 0) goto L_0x02a1
                h.w.f0 r5 = r6.d
                boolean r5 = r3.equals(r5)
                if (r5 == 0) goto L_0x02a1
                h.w.q r5 = r6.c
                android.view.View r7 = r6.a
                r9 = 1
                h.w.q r10 = r1.c(r7, r9)
                h.w.q r11 = r1.b(r7, r9)
                if (r10 != 0) goto L_0x027c
                if (r11 != 0) goto L_0x027c
                h.w.r r9 = r1.u
                h.e.a<android.view.View, h.w.q> r9 = r9.a
                java.lang.Object r7 = r9.get(r7)
                r11 = r7
                h.w.q r11 = (h.w.q) r11
            L_0x027c:
                if (r10 != 0) goto L_0x0280
                if (r11 == 0) goto L_0x028a
            L_0x0280:
                h.w.i r6 = r6.e
                boolean r5 = r6.a((h.w.q) r5, (h.w.q) r11)
                if (r5 == 0) goto L_0x028a
                r5 = 1
                goto L_0x028b
            L_0x028a:
                r5 = 0
            L_0x028b:
                if (r5 == 0) goto L_0x02a1
                boolean r5 = r4.isRunning()
                if (r5 != 0) goto L_0x029e
                boolean r5 = r4.isStarted()
                if (r5 == 0) goto L_0x029a
                goto L_0x029e
            L_0x029a:
                r0.remove(r4)
                goto L_0x02a1
            L_0x029e:
                r4.cancel()
            L_0x02a1:
                int r2 = r2 + -1
                goto L_0x0241
            L_0x02a4:
                h.w.r r9 = r1.t
                h.w.r r10 = r1.u
                java.util.ArrayList<h.w.q> r11 = r1.x
                java.util.ArrayList<h.w.q> r12 = r1.y
                r7 = r1
                r7.a(r8, r9, r10, r11, r12)
                r1.d()
                r0 = 1
                return r0
            L_0x02b5:
                r0 = r4
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h.w.m.a.onPreDraw():boolean");
        }

        public void onViewAttachedToWindow(View view) {
        }

        public void onViewDetachedFromWindow(View view) {
            this.f2289f.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f2289f.removeOnAttachStateChangeListener(this);
            m.c.remove(this.f2289f);
            ArrayList arrayList = m.a().get(this.f2289f);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((i) it.next()).e(this.f2289f);
                }
            }
            this.e.a(true);
        }
    }

    public static h.e.a<ViewGroup, ArrayList<i>> a() {
        h.e.a<ViewGroup, ArrayList<i>> aVar;
        WeakReference weakReference = f2288b.get();
        if (weakReference != null && (aVar = (h.e.a) weakReference.get()) != null) {
            return aVar;
        }
        h.e.a<ViewGroup, ArrayList<i>> aVar2 = new h.e.a<>();
        f2288b.set(new WeakReference(aVar2));
        return aVar2;
    }
}
