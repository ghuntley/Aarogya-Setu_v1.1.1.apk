package h.l.d;

import android.view.View;
import androidx.fragment.app.Fragment;
import h.e.g;
import h.h.m.m;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: FragmentTransition */
public class h0 {
    public static final int[] a = {0, 3, 0, 1, 5, 4, 7, 6, 9, 8, 10};

    /* renamed from: b  reason: collision with root package name */
    public static final m0 f1981b = new i0();
    public static final m0 c;

    /* compiled from: FragmentTransition */
    public interface a {
    }

    /* compiled from: FragmentTransition */
    public static class b {
        public Fragment a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f1982b;
        public a c;
        public Fragment d;
        public boolean e;

        /* renamed from: f  reason: collision with root package name */
        public a f1983f;
    }

    static {
        m0 m0Var;
        try {
            m0Var = (m0) Class.forName("h.w.d").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            m0Var = null;
        }
        c = m0Var;
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0457  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0495 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0246 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(h.l.d.r r39, java.util.ArrayList<h.l.d.a> r40, java.util.ArrayList<java.lang.Boolean> r41, int r42, int r43, boolean r44, h.l.d.h0.a r45) {
        /*
            r0 = r39
            r1 = r40
            r2 = r41
            r3 = r43
            r4 = r44
            int r5 = r0.f2013m
            r6 = 1
            if (r5 >= r6) goto L_0x0010
            return
        L_0x0010:
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            r7 = r42
        L_0x0017:
            r8 = 0
            if (r7 >= r3) goto L_0x0068
            java.lang.Object r9 = r1.get(r7)
            h.l.d.a r9 = (h.l.d.a) r9
            java.lang.Object r10 = r2.get(r7)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x004e
            h.l.d.r r8 = r9.f1914q
            h.l.d.k r8 = r8.f2015o
            boolean r8 = r8.d()
            if (r8 != 0) goto L_0x0037
            goto L_0x0065
        L_0x0037:
            java.util.ArrayList<h.l.d.a0$a> r8 = r9.a
            int r8 = r8.size()
            int r8 = r8 - r6
        L_0x003e:
            if (r8 < 0) goto L_0x0065
            java.util.ArrayList<h.l.d.a0$a> r10 = r9.a
            java.lang.Object r10 = r10.get(r8)
            h.l.d.a0$a r10 = (h.l.d.a0.a) r10
            a((h.l.d.a) r9, (h.l.d.a0.a) r10, (android.util.SparseArray<h.l.d.h0.b>) r5, (boolean) r6, (boolean) r4)
            int r8 = r8 + -1
            goto L_0x003e
        L_0x004e:
            java.util.ArrayList<h.l.d.a0$a> r10 = r9.a
            int r10 = r10.size()
            r11 = 0
        L_0x0055:
            if (r11 >= r10) goto L_0x0065
            java.util.ArrayList<h.l.d.a0$a> r12 = r9.a
            java.lang.Object r12 = r12.get(r11)
            h.l.d.a0$a r12 = (h.l.d.a0.a) r12
            a((h.l.d.a) r9, (h.l.d.a0.a) r12, (android.util.SparseArray<h.l.d.h0.b>) r5, (boolean) r8, (boolean) r4)
            int r11 = r11 + 1
            goto L_0x0055
        L_0x0065:
            int r7 = r7 + 1
            goto L_0x0017
        L_0x0068:
            int r7 = r5.size()
            if (r7 == 0) goto L_0x04a9
            android.view.View r7 = new android.view.View
            h.l.d.o<?> r9 = r0.f2014n
            android.content.Context r9 = r9.f2001f
            r7.<init>(r9)
            int r15 = r5.size()
            r14 = 0
        L_0x007c:
            if (r14 >= r15) goto L_0x04a9
            int r9 = r5.keyAt(r14)
            h.e.a r13 = new h.e.a
            r13.<init>()
            int r10 = r3 + -1
            r12 = r42
        L_0x008b:
            if (r10 < r12) goto L_0x00f6
            java.lang.Object r11 = r1.get(r10)
            h.l.d.a r11 = (h.l.d.a) r11
            boolean r16 = r11.b((int) r9)
            if (r16 != 0) goto L_0x009a
            goto L_0x00eb
        L_0x009a:
            java.lang.Object r16 = r2.get(r10)
            java.lang.Boolean r16 = (java.lang.Boolean) r16
            boolean r16 = r16.booleanValue()
            java.util.ArrayList<java.lang.String> r6 = r11.f1923m
            if (r6 == 0) goto L_0x00eb
            int r6 = r6.size()
            if (r16 == 0) goto L_0x00b3
            java.util.ArrayList<java.lang.String> r8 = r11.f1923m
            java.util.ArrayList<java.lang.String> r11 = r11.f1924n
            goto L_0x00bc
        L_0x00b3:
            java.util.ArrayList<java.lang.String> r8 = r11.f1923m
            java.util.ArrayList<java.lang.String> r11 = r11.f1924n
            r38 = r11
            r11 = r8
            r8 = r38
        L_0x00bc:
            r1 = 0
        L_0x00bd:
            if (r1 >= r6) goto L_0x00eb
            java.lang.Object r16 = r11.get(r1)
            r2 = r16
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r16 = r8.get(r1)
            r3 = r16
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r16 = r13.remove(r3)
            r17 = r6
            r6 = r16
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x00df
            r13.put(r2, r6)
            goto L_0x00e2
        L_0x00df:
            r13.put(r2, r3)
        L_0x00e2:
            int r1 = r1 + 1
            r2 = r41
            r3 = r43
            r6 = r17
            goto L_0x00bd
        L_0x00eb:
            int r10 = r10 + -1
            r1 = r40
            r2 = r41
            r3 = r43
            r6 = 1
            r8 = 0
            goto L_0x008b
        L_0x00f6:
            java.lang.Object r1 = r5.valueAt(r14)
            h.l.d.h0$b r1 = (h.l.d.h0.b) r1
            if (r4 == 0) goto L_0x030e
            h.l.d.k r3 = r0.f2015o
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x010f
            h.l.d.k r3 = r0.f2015o
            android.view.View r3 = r3.a(r9)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            goto L_0x0110
        L_0x010f:
            r3 = 0
        L_0x0110:
            if (r3 != 0) goto L_0x011a
        L_0x0112:
            r31 = r5
            r32 = r14
            r33 = r15
            goto L_0x0307
        L_0x011a:
            androidx.fragment.app.Fragment r6 = r1.a
            androidx.fragment.app.Fragment r8 = r1.d
            h.l.d.m0 r9 = a((androidx.fragment.app.Fragment) r8, (androidx.fragment.app.Fragment) r6)
            if (r9 != 0) goto L_0x0125
            goto L_0x0112
        L_0x0125:
            boolean r10 = r1.f1982b
            boolean r11 = r1.e
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r31 = r5
            java.lang.Object r5 = a((h.l.d.m0) r9, (androidx.fragment.app.Fragment) r6, (boolean) r10)
            java.lang.Object r11 = b(r9, r8, r11)
            androidx.fragment.app.Fragment r12 = r1.a
            r32 = r14
            androidx.fragment.app.Fragment r14 = r1.d
            r33 = r15
            if (r12 == 0) goto L_0x014f
            android.view.View r15 = r12.F()
            r0 = 0
            r15.setVisibility(r0)
        L_0x014f:
            if (r12 == 0) goto L_0x01ef
            if (r14 != 0) goto L_0x0155
            goto L_0x01ef
        L_0x0155:
            boolean r0 = r1.f1982b
            boolean r15 = r13.isEmpty()
            if (r15 == 0) goto L_0x0161
            r34 = r10
            r15 = 0
            goto L_0x0167
        L_0x0161:
            java.lang.Object r15 = a((h.l.d.m0) r9, (androidx.fragment.app.Fragment) r12, (androidx.fragment.app.Fragment) r14, (boolean) r0)
            r34 = r10
        L_0x0167:
            h.e.a r10 = b(r9, r13, r15, r1)
            r35 = r6
            h.e.a r6 = a((h.l.d.m0) r9, (h.e.a<java.lang.String, java.lang.String>) r13, (java.lang.Object) r15, (h.l.d.h0.b) r1)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x0183
            if (r10 == 0) goto L_0x017c
            r10.clear()
        L_0x017c:
            if (r6 == 0) goto L_0x0181
            r6.clear()
        L_0x0181:
            r15 = 0
            goto L_0x0195
        L_0x0183:
            r16 = r15
            java.util.Set r15 = r13.keySet()
            a((java.util.ArrayList<android.view.View>) r4, (h.e.a<java.lang.String, android.view.View>) r10, (java.util.Collection<java.lang.String>) r15)
            java.util.Collection r15 = r13.values()
            a((java.util.ArrayList<android.view.View>) r2, (h.e.a<java.lang.String, android.view.View>) r6, (java.util.Collection<java.lang.String>) r15)
            r15 = r16
        L_0x0195:
            if (r5 != 0) goto L_0x019e
            if (r11 != 0) goto L_0x019e
            if (r15 != 0) goto L_0x019e
            r37 = r2
            goto L_0x01f5
        L_0x019e:
            r36 = r13
            r13 = 1
            a((androidx.fragment.app.Fragment) r12, (androidx.fragment.app.Fragment) r14, (boolean) r0, (h.e.a<java.lang.String, android.view.View>) r10, (boolean) r13)
            if (r15 == 0) goto L_0x01d4
            r2.add(r7)
            r9.b((java.lang.Object) r15, (android.view.View) r7, (java.util.ArrayList<android.view.View>) r4)
            boolean r13 = r1.e
            r37 = r2
            h.l.d.a r2 = r1.f1983f
            r16 = r9
            r17 = r15
            r18 = r11
            r19 = r10
            r20 = r13
            r21 = r2
            a((h.l.d.m0) r16, (java.lang.Object) r17, (java.lang.Object) r18, (h.e.a<java.lang.String, android.view.View>) r19, (boolean) r20, (h.l.d.a) r21)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.view.View r1 = a((h.e.a<java.lang.String, android.view.View>) r6, (h.l.d.h0.b) r1, (java.lang.Object) r5, (boolean) r0)
            if (r1 == 0) goto L_0x01cf
            r9.a((java.lang.Object) r5, (android.graphics.Rect) r2)
        L_0x01cf:
            r27 = r1
            r29 = r2
            goto L_0x01da
        L_0x01d4:
            r37 = r2
            r27 = 0
            r29 = 0
        L_0x01da:
            h.l.d.f0 r1 = new h.l.d.f0
            r22 = r1
            r23 = r12
            r24 = r14
            r25 = r0
            r26 = r6
            r28 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            h.h.m.l.a(r3, r1)
            goto L_0x01f8
        L_0x01ef:
            r37 = r2
            r35 = r6
            r34 = r10
        L_0x01f5:
            r36 = r13
            r15 = 0
        L_0x01f8:
            if (r5 != 0) goto L_0x0200
            if (r15 != 0) goto L_0x0200
            if (r11 != 0) goto L_0x0200
            goto L_0x0307
        L_0x0200:
            java.util.ArrayList r0 = a((h.l.d.m0) r9, (java.lang.Object) r11, (androidx.fragment.app.Fragment) r8, (java.util.ArrayList<android.view.View>) r4, (android.view.View) r7)
            r1 = r35
            r2 = r37
            java.util.ArrayList r6 = a((h.l.d.m0) r9, (java.lang.Object) r5, (androidx.fragment.app.Fragment) r1, (java.util.ArrayList<android.view.View>) r2, (android.view.View) r7)
            r10 = 4
            a((java.util.ArrayList<android.view.View>) r6, (int) r10)
            r16 = r9
            r17 = r5
            r18 = r11
            r19 = r15
            r20 = r1
            r21 = r34
            java.lang.Object r1 = a((h.l.d.m0) r16, (java.lang.Object) r17, (java.lang.Object) r18, (java.lang.Object) r19, (androidx.fragment.app.Fragment) r20, (boolean) r21)
            if (r8 == 0) goto L_0x0244
            if (r0 == 0) goto L_0x0244
            int r10 = r0.size()
            if (r10 > 0) goto L_0x0230
            int r10 = r4.size()
            if (r10 <= 0) goto L_0x0244
        L_0x0230:
            h.h.i.a r10 = new h.h.i.a
            r10.<init>()
            r12 = r45
            h.l.d.r$b r12 = (h.l.d.r.b) r12
            r12.b(r8, r10)
            h.l.d.b0 r13 = new h.l.d.b0
            r13.<init>(r12, r8, r10)
            r9.a(r8, r1, r10, r13)
        L_0x0244:
            if (r1 == 0) goto L_0x0307
            if (r8 == 0) goto L_0x0269
            if (r11 == 0) goto L_0x0269
            boolean r10 = r8.f237o
            if (r10 == 0) goto L_0x0269
            boolean r10 = r8.C
            if (r10 == 0) goto L_0x0269
            boolean r10 = r8.P
            if (r10 == 0) goto L_0x0269
            r10 = 1
            r8.a((boolean) r10)
            android.view.View r10 = r8.K
            r9.a((java.lang.Object) r11, (android.view.View) r10, (java.util.ArrayList<android.view.View>) r0)
            android.view.ViewGroup r8 = r8.J
            h.l.d.c0 r10 = new h.l.d.c0
            r10.<init>(r0)
            h.h.m.l.a(r8, r10)
        L_0x0269:
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r10 = r2.size()
            r12 = 0
        L_0x0273:
            if (r12 >= r10) goto L_0x0289
            java.lang.Object r13 = r2.get(r12)
            android.view.View r13 = (android.view.View) r13
            java.lang.String r14 = h.h.m.m.q(r13)
            r8.add(r14)
            r14 = 0
            r13.setTransitionName(r14)
            int r12 = r12 + 1
            goto L_0x0273
        L_0x0289:
            r22 = r9
            r23 = r1
            r24 = r5
            r25 = r6
            r26 = r11
            r27 = r0
            r28 = r15
            r29 = r2
            r22.a(r23, r24, r25, r26, r27, r28, r29)
            r9.a((android.view.ViewGroup) r3, (java.lang.Object) r1)
            int r0 = r2.size()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5 = 0
        L_0x02a9:
            if (r5 >= r0) goto L_0x02e9
            java.lang.Object r10 = r4.get(r5)
            android.view.View r10 = (android.view.View) r10
            java.lang.String r11 = h.h.m.m.q(r10)
            r1.add(r11)
            if (r11 != 0) goto L_0x02bd
            r13 = r36
            goto L_0x02e4
        L_0x02bd:
            r14 = 0
            r10.setTransitionName(r14)
            r13 = r36
            java.lang.Object r10 = r13.get(r11)
            java.lang.String r10 = (java.lang.String) r10
            r12 = 0
        L_0x02ca:
            if (r12 >= r0) goto L_0x02e4
            java.lang.Object r14 = r8.get(r12)
            boolean r14 = r10.equals(r14)
            if (r14 == 0) goto L_0x02e0
            java.lang.Object r10 = r2.get(r12)
            android.view.View r10 = (android.view.View) r10
            r10.setTransitionName(r11)
            goto L_0x02e4
        L_0x02e0:
            int r12 = r12 + 1
            r14 = 0
            goto L_0x02ca
        L_0x02e4:
            int r5 = r5 + 1
            r36 = r13
            goto L_0x02a9
        L_0x02e9:
            h.l.d.j0 r5 = new h.l.d.j0
            r22 = r5
            r23 = r9
            r24 = r0
            r25 = r2
            r26 = r8
            r27 = r4
            r28 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28)
            h.h.m.l.a(r3, r5)
            r0 = 0
            a((java.util.ArrayList<android.view.View>) r6, (int) r0)
            r9.b((java.lang.Object) r15, (java.util.ArrayList<android.view.View>) r4, (java.util.ArrayList<android.view.View>) r2)
            goto L_0x0308
        L_0x0307:
            r0 = 0
        L_0x0308:
            r27 = r32
            r30 = r33
            goto L_0x0495
        L_0x030e:
            r31 = r5
            r32 = r14
            r33 = r15
            r0 = 0
            r2 = r39
            h.l.d.k r3 = r2.f2015o
            boolean r3 = r3.d()
            if (r3 == 0) goto L_0x032a
            h.l.d.k r3 = r2.f2015o
            android.view.View r3 = r3.a(r9)
            r14 = r3
            android.view.ViewGroup r14 = (android.view.ViewGroup) r14
            r3 = r14
            goto L_0x032b
        L_0x032a:
            r3 = 0
        L_0x032b:
            if (r3 != 0) goto L_0x032e
            goto L_0x0308
        L_0x032e:
            androidx.fragment.app.Fragment r4 = r1.a
            androidx.fragment.app.Fragment r5 = r1.d
            h.l.d.m0 r6 = a((androidx.fragment.app.Fragment) r5, (androidx.fragment.app.Fragment) r4)
            if (r6 != 0) goto L_0x0339
            goto L_0x0308
        L_0x0339:
            boolean r8 = r1.f1982b
            boolean r9 = r1.e
            java.lang.Object r8 = a((h.l.d.m0) r6, (androidx.fragment.app.Fragment) r4, (boolean) r8)
            java.lang.Object r12 = b(r6, r5, r9)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            androidx.fragment.app.Fragment r9 = r1.a
            androidx.fragment.app.Fragment r15 = r1.d
            if (r9 == 0) goto L_0x03f1
            if (r15 != 0) goto L_0x0359
            goto L_0x03f1
        L_0x0359:
            boolean r14 = r1.f1982b
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x0363
            r0 = 0
            goto L_0x0369
        L_0x0363:
            java.lang.Object r16 = a((h.l.d.m0) r6, (androidx.fragment.app.Fragment) r9, (androidx.fragment.app.Fragment) r15, (boolean) r14)
            r0 = r16
        L_0x0369:
            h.e.a r2 = b(r6, r13, r0, r1)
            boolean r16 = r13.isEmpty()
            if (r16 == 0) goto L_0x0375
            r0 = 0
            goto L_0x0380
        L_0x0375:
            r16 = r0
            java.util.Collection r0 = r2.values()
            r11.addAll(r0)
            r0 = r16
        L_0x0380:
            if (r8 != 0) goto L_0x0388
            if (r12 != 0) goto L_0x0388
            if (r0 != 0) goto L_0x0388
            goto L_0x03f1
        L_0x0388:
            r22 = r4
            r4 = 1
            a((androidx.fragment.app.Fragment) r9, (androidx.fragment.app.Fragment) r15, (boolean) r14, (h.e.a<java.lang.String, android.view.View>) r2, (boolean) r4)
            if (r0 == 0) goto L_0x03b7
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r6.b((java.lang.Object) r0, (android.view.View) r7, (java.util.ArrayList<android.view.View>) r11)
            r20 = r9
            boolean r9 = r1.e
            r21 = r10
            h.l.d.a r10 = r1.f1983f
            r23 = r14
            r14 = r6
            r24 = r15
            r15 = r0
            r16 = r12
            r17 = r2
            r18 = r9
            r19 = r10
            a((h.l.d.m0) r14, (java.lang.Object) r15, (java.lang.Object) r16, (h.e.a<java.lang.String, android.view.View>) r17, (boolean) r18, (h.l.d.a) r19)
            if (r8 == 0) goto L_0x03c0
            r6.a((java.lang.Object) r8, (android.graphics.Rect) r4)
            goto L_0x03c0
        L_0x03b7:
            r20 = r9
            r21 = r10
            r23 = r14
            r24 = r15
            r4 = 0
        L_0x03c0:
            h.l.d.g0 r2 = new h.l.d.g0
            r16 = r20
            r9 = r2
            r15 = r21
            r10 = r6
            r14 = r11
            r11 = r13
            r25 = r5
            r5 = r12
            r12 = r0
            r26 = r0
            r0 = r13
            r13 = r1
            r28 = r14
            r27 = r32
            r29 = 0
            r14 = r15
            r32 = r15
            r30 = r33
            r15 = r7
            r17 = r24
            r18 = r23
            r19 = r28
            r20 = r8
            r21 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            h.h.m.l.a(r3, r2)
            r20 = r26
            goto L_0x0403
        L_0x03f1:
            r22 = r4
            r25 = r5
            r28 = r11
            r5 = r12
            r0 = r13
            r27 = r32
            r30 = r33
            r29 = 0
            r32 = r10
            r20 = r29
        L_0x0403:
            if (r8 != 0) goto L_0x040b
            if (r20 != 0) goto L_0x040b
            if (r5 != 0) goto L_0x040b
            goto L_0x0495
        L_0x040b:
            r2 = r25
            r4 = r28
            java.util.ArrayList r23 = a((h.l.d.m0) r6, (java.lang.Object) r5, (androidx.fragment.app.Fragment) r2, (java.util.ArrayList<android.view.View>) r4, (android.view.View) r7)
            if (r23 == 0) goto L_0x041e
            boolean r9 = r23.isEmpty()
            if (r9 == 0) goto L_0x041c
            goto L_0x041e
        L_0x041c:
            r29 = r5
        L_0x041e:
            r6.a((java.lang.Object) r8, (android.view.View) r7)
            boolean r1 = r1.f1982b
            r14 = r6
            r15 = r8
            r16 = r29
            r17 = r20
            r18 = r22
            r19 = r1
            java.lang.Object r1 = a((h.l.d.m0) r14, (java.lang.Object) r15, (java.lang.Object) r16, (java.lang.Object) r17, (androidx.fragment.app.Fragment) r18, (boolean) r19)
            if (r2 == 0) goto L_0x0455
            if (r23 == 0) goto L_0x0455
            int r5 = r23.size()
            if (r5 > 0) goto L_0x0441
            int r4 = r4.size()
            if (r4 <= 0) goto L_0x0455
        L_0x0441:
            h.h.i.a r4 = new h.h.i.a
            r4.<init>()
            r5 = r45
            h.l.d.r$b r5 = (h.l.d.r.b) r5
            r5.b(r2, r4)
            h.l.d.d0 r9 = new h.l.d.d0
            r9.<init>(r5, r2, r4)
            r6.a(r2, r1, r4, r9)
        L_0x0455:
            if (r1 == 0) goto L_0x0495
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r14 = r6
            r15 = r1
            r16 = r8
            r17 = r2
            r18 = r29
            r19 = r23
            r21 = r32
            r14.a(r15, r16, r17, r18, r19, r20, r21)
            h.l.d.e0 r4 = new h.l.d.e0
            r9 = r4
            r10 = r8
            r11 = r6
            r12 = r7
            r13 = r22
            r14 = r32
            r15 = r2
            r16 = r23
            r17 = r29
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            h.h.m.l.a(r3, r4)
            h.l.d.k0 r2 = new h.l.d.k0
            r4 = r32
            r2.<init>(r6, r4, r0)
            h.h.m.l.a(r3, r2)
            r6.a((android.view.ViewGroup) r3, (java.lang.Object) r1)
            h.l.d.l0 r1 = new h.l.d.l0
            r1.<init>(r6, r4, r0)
            h.h.m.l.a(r3, r1)
        L_0x0495:
            int r14 = r27 + 1
            r0 = r39
            r1 = r40
            r2 = r41
            r3 = r43
            r4 = r44
            r15 = r30
            r5 = r31
            r6 = 1
            r8 = 0
            goto L_0x007c
        L_0x04a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.l.d.h0.a(h.l.d.r, java.util.ArrayList, java.util.ArrayList, int, int, boolean, h.l.d.h0$a):void");
    }

    public static h.e.a<String, View> b(m0 m0Var, h.e.a<String, String> aVar, Object obj, b bVar) {
        ArrayList<String> arrayList;
        if (aVar.isEmpty() || obj == null) {
            aVar.clear();
            return null;
        }
        Fragment fragment = bVar.d;
        h.e.a<String, View> aVar2 = new h.e.a<>();
        m0Var.a((Map<String, View>) aVar2, fragment.F());
        a aVar3 = bVar.f1983f;
        if (bVar.e) {
            arrayList = aVar3.f1924n;
        } else {
            arrayList = aVar3.f1923m;
        }
        if (arrayList != null) {
            g.a(aVar2, (Collection<?>) arrayList);
        }
        g.a(aVar, (Collection<?>) aVar2.keySet());
        return aVar2;
    }

    public static Object b(m0 m0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment.N;
            if (bVar != null && (obj = bVar.f242g) == Fragment.Z) {
                obj = fragment.l();
            }
        } else {
            obj = fragment.m();
        }
        return m0Var.b(obj);
    }

    public static m0 a(Fragment fragment, Fragment fragment2) {
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayList = new ArrayList();
        if (fragment != null) {
            Object m2 = fragment.m();
            if (m2 != null) {
                arrayList.add(m2);
            }
            Fragment.b bVar = fragment.N;
            if (bVar == null) {
                obj2 = null;
            } else {
                obj2 = bVar.f242g;
                if (obj2 == Fragment.Z) {
                    obj2 = fragment.l();
                }
            }
            if (obj2 != null) {
                arrayList.add(obj2);
            }
            Fragment.b bVar2 = fragment.N;
            if (bVar2 == null) {
                obj3 = null;
            } else {
                obj3 = bVar2.f246k;
                if (obj3 == Fragment.Z) {
                    obj3 = fragment.q();
                }
            }
            if (obj3 != null) {
                arrayList.add(obj3);
            }
        }
        if (fragment2 != null) {
            Object l2 = fragment2.l();
            if (l2 != null) {
                arrayList.add(l2);
            }
            Fragment.b bVar3 = fragment2.N;
            if (bVar3 == null) {
                obj = null;
            } else {
                obj = bVar3.f244i;
                if (obj == Fragment.Z) {
                    obj = fragment2.m();
                }
            }
            if (obj != null) {
                arrayList.add(obj);
            }
            Object q2 = fragment2.q();
            if (q2 != null) {
                arrayList.add(q2);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        m0 m0Var = f1981b;
        if (m0Var != null && a(m0Var, (List<Object>) arrayList)) {
            return f1981b;
        }
        m0 m0Var2 = c;
        if (m0Var2 != null && a(m0Var2, (List<Object>) arrayList)) {
            return c;
        }
        if (f1981b == null && c == null) {
            return null;
        }
        throw new IllegalArgumentException("Invalid Transition types");
    }

    public static boolean a(m0 m0Var, List<Object> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!m0Var.a(list.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static void a(ArrayList<View> arrayList, h.e.a<String, View> aVar, Collection<String> collection) {
        for (int i2 = aVar.f1570g - 1; i2 >= 0; i2--) {
            View e = aVar.e(i2);
            if (collection.contains(m.q(e))) {
                arrayList.add(e);
            }
        }
    }

    public static h.e.a<String, View> a(m0 m0Var, h.e.a<String, String> aVar, Object obj, b bVar) {
        ArrayList<String> arrayList;
        View view = bVar.a.K;
        if (aVar.isEmpty() || obj == null || view == null) {
            aVar.clear();
            return null;
        }
        h.e.a<String, View> aVar2 = new h.e.a<>();
        m0Var.a((Map<String, View>) aVar2, view);
        a aVar3 = bVar.c;
        if (bVar.f1982b) {
            arrayList = aVar3.f1923m;
        } else {
            arrayList = aVar3.f1924n;
        }
        if (arrayList != null) {
            g.a(aVar2, (Collection<?>) arrayList);
            g.a(aVar2, (Collection<?>) aVar.values());
        }
        int i2 = aVar.f1570g;
        while (true) {
            i2--;
            if (i2 < 0) {
                return aVar2;
            }
            if (!aVar2.containsKey(aVar.e(i2))) {
                aVar.d(i2);
            }
        }
    }

    public static View a(h.e.a<String, View> aVar, b bVar, Object obj, boolean z) {
        ArrayList<String> arrayList;
        String str;
        a aVar2 = bVar.c;
        if (obj == null || aVar == null || (arrayList = aVar2.f1923m) == null || arrayList.isEmpty()) {
            return null;
        }
        if (z) {
            str = aVar2.f1923m.get(0);
        } else {
            str = aVar2.f1924n.get(0);
        }
        return aVar.get(str);
    }

    public static void a(m0 m0Var, Object obj, Object obj2, h.e.a<String, View> aVar, boolean z, a aVar2) {
        String str;
        ArrayList<String> arrayList = aVar2.f1923m;
        if (arrayList != null && !arrayList.isEmpty()) {
            if (z) {
                str = aVar2.f1924n.get(0);
            } else {
                str = aVar2.f1923m.get(0);
            }
            View view = aVar.get(str);
            m0Var.c(obj, view);
            if (obj2 != null) {
                m0Var.c(obj2, view);
            }
        }
    }

    public static ArrayList<View> a(m0 m0Var, Object obj, Fragment fragment, ArrayList<View> arrayList, View view) {
        if (obj == null) {
            return null;
        }
        ArrayList<View> arrayList2 = new ArrayList<>();
        View view2 = fragment.K;
        if (view2 != null) {
            m0Var.a(arrayList2, view2);
        }
        if (arrayList != null) {
            arrayList2.removeAll(arrayList);
        }
        if (arrayList2.isEmpty()) {
            return arrayList2;
        }
        arrayList2.add(view);
        m0Var.a(obj, arrayList2);
        return arrayList2;
    }

    public static void a(ArrayList<View> arrayList, int i2) {
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).setVisibility(i2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0038, code lost:
        if (r0.f237o != false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0076, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0088, code lost:
        if (r0.C == false) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x008a, code lost:
        r9 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:100:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x00e6 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(h.l.d.a r8, h.l.d.a0.a r9, android.util.SparseArray<h.l.d.h0.b> r10, boolean r11, boolean r12) {
        /*
            androidx.fragment.app.Fragment r0 = r9.f1927b
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            int r1 = r0.A
            if (r1 != 0) goto L_0x000a
            return
        L_0x000a:
            if (r11 == 0) goto L_0x0013
            int[] r2 = a
            int r9 = r9.a
            r9 = r2[r9]
            goto L_0x0015
        L_0x0013:
            int r9 = r9.a
        L_0x0015:
            r2 = 1
            r3 = 0
            if (r9 == r2) goto L_0x007d
            r4 = 3
            if (r9 == r4) goto L_0x0056
            r4 = 4
            if (r9 == r4) goto L_0x003e
            r4 = 5
            if (r9 == r4) goto L_0x002c
            r4 = 6
            if (r9 == r4) goto L_0x0056
            r4 = 7
            if (r9 == r4) goto L_0x007d
            r9 = 0
            r4 = 0
            goto L_0x008e
        L_0x002c:
            if (r12 == 0) goto L_0x003b
            boolean r9 = r0.P
            if (r9 == 0) goto L_0x008c
            boolean r9 = r0.C
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.f237o
            if (r9 == 0) goto L_0x008c
            goto L_0x008a
        L_0x003b:
            boolean r9 = r0.C
            goto L_0x008d
        L_0x003e:
            if (r12 == 0) goto L_0x004d
            boolean r9 = r0.P
            if (r9 == 0) goto L_0x0078
            boolean r9 = r0.f237o
            if (r9 == 0) goto L_0x0078
            boolean r9 = r0.C
            if (r9 == 0) goto L_0x0078
            goto L_0x0076
        L_0x004d:
            boolean r9 = r0.f237o
            if (r9 == 0) goto L_0x0078
            boolean r9 = r0.C
            if (r9 != 0) goto L_0x0078
            goto L_0x0076
        L_0x0056:
            if (r12 == 0) goto L_0x006e
            boolean r9 = r0.f237o
            if (r9 != 0) goto L_0x0078
            android.view.View r9 = r0.K
            if (r9 == 0) goto L_0x0078
            int r9 = r9.getVisibility()
            if (r9 != 0) goto L_0x0078
            float r9 = r0.Q
            r4 = 0
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0078
            goto L_0x0076
        L_0x006e:
            boolean r9 = r0.f237o
            if (r9 == 0) goto L_0x0078
            boolean r9 = r0.C
            if (r9 != 0) goto L_0x0078
        L_0x0076:
            r9 = 1
            goto L_0x0079
        L_0x0078:
            r9 = 0
        L_0x0079:
            r5 = r9
            r9 = 1
            r4 = 0
            goto L_0x0091
        L_0x007d:
            if (r12 == 0) goto L_0x0082
            boolean r9 = r0.O
            goto L_0x008d
        L_0x0082:
            boolean r9 = r0.f237o
            if (r9 != 0) goto L_0x008c
            boolean r9 = r0.C
            if (r9 != 0) goto L_0x008c
        L_0x008a:
            r9 = 1
            goto L_0x008d
        L_0x008c:
            r9 = 0
        L_0x008d:
            r4 = 1
        L_0x008e:
            r3 = r9
            r9 = 0
            r5 = 0
        L_0x0091:
            java.lang.Object r6 = r10.get(r1)
            h.l.d.h0$b r6 = (h.l.d.h0.b) r6
            if (r3 == 0) goto L_0x00aa
            if (r6 != 0) goto L_0x00a4
            h.l.d.h0$b r3 = new h.l.d.h0$b
            r3.<init>()
            r10.put(r1, r3)
            r6 = r3
        L_0x00a4:
            r6.a = r0
            r6.f1982b = r11
            r6.c = r8
        L_0x00aa:
            r3 = 0
            if (r12 != 0) goto L_0x00cb
            if (r4 == 0) goto L_0x00cb
            if (r6 == 0) goto L_0x00b7
            androidx.fragment.app.Fragment r4 = r6.d
            if (r4 != r0) goto L_0x00b7
            r6.d = r3
        L_0x00b7:
            h.l.d.r r4 = r8.f1914q
            int r7 = r0.e
            if (r7 >= r2) goto L_0x00cb
            int r7 = r4.f2013m
            if (r7 < r2) goto L_0x00cb
            boolean r7 = r8.f1925o
            if (r7 != 0) goto L_0x00cb
            r4.k(r0)
            r4.a((androidx.fragment.app.Fragment) r0, (int) r2)
        L_0x00cb:
            if (r5 == 0) goto L_0x00e4
            if (r6 == 0) goto L_0x00d3
            androidx.fragment.app.Fragment r2 = r6.d
            if (r2 != 0) goto L_0x00e4
        L_0x00d3:
            if (r6 != 0) goto L_0x00de
            h.l.d.h0$b r2 = new h.l.d.h0$b
            r2.<init>()
            r10.put(r1, r2)
            r6 = r2
        L_0x00de:
            r6.d = r0
            r6.e = r11
            r6.f1983f = r8
        L_0x00e4:
            if (r12 != 0) goto L_0x00f0
            if (r9 == 0) goto L_0x00f0
            if (r6 == 0) goto L_0x00f0
            androidx.fragment.app.Fragment r8 = r6.a
            if (r8 != r0) goto L_0x00f0
            r6.a = r3
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.l.d.h0.a(h.l.d.a, h.l.d.a0$a, android.util.SparseArray, boolean, boolean):void");
    }

    public static Object a(m0 m0Var, Fragment fragment, boolean z) {
        Object obj = null;
        if (fragment == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment.N;
            if (bVar != null && (obj = bVar.f244i) == Fragment.Z) {
                obj = fragment.m();
            }
        } else {
            obj = fragment.l();
        }
        return m0Var.b(obj);
    }

    public static Object a(m0 m0Var, Fragment fragment, Fragment fragment2, boolean z) {
        Object obj = null;
        if (fragment == null || fragment2 == null) {
            return null;
        }
        if (z) {
            Fragment.b bVar = fragment2.N;
            if (bVar != null) {
                Object obj2 = bVar.f246k;
                if (obj2 == Fragment.Z) {
                    obj2 = fragment2.q();
                }
                obj = obj2;
            }
        } else {
            obj = fragment.q();
        }
        return m0Var.c(m0Var.b(obj));
    }

    public static Object a(m0 m0Var, Object obj, Object obj2, Object obj3, Fragment fragment, boolean z) {
        Boolean bool;
        Boolean bool2;
        boolean z2 = true;
        if (!(obj == null || obj2 == null || fragment == null)) {
            if (z) {
                Fragment.b bVar = fragment.N;
                if (!(bVar == null || (bool2 = bVar.f247l) == null)) {
                    z2 = bool2.booleanValue();
                }
            } else {
                Fragment.b bVar2 = fragment.N;
                if (!(bVar2 == null || (bool = bVar2.f248m) == null)) {
                    z2 = bool.booleanValue();
                }
            }
        }
        if (z2) {
            return m0Var.b(obj2, obj, obj3);
        }
        return m0Var.a(obj2, obj, obj3);
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z, h.e.a<String, View> aVar, boolean z2) {
        if (z) {
            Fragment.b bVar = fragment2.N;
        } else {
            Fragment.b bVar2 = fragment.N;
        }
    }
}
