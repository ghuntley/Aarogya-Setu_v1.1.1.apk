package h.f.a.h;

/* compiled from: Optimizer */
public class i {
    public static boolean[] a = new boolean[3];

    /* JADX WARNING: Removed duplicated region for block: B:26:0x003b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(h.f.a.h.d r5, int r6) {
        /*
            h.f.a.h.d$a[] r0 = r5.C
            r1 = r0[r6]
            h.f.a.h.d$a r2 = h.f.a.h.d.a.MATCH_CONSTRAINT
            r3 = 0
            if (r1 == r2) goto L_0x000a
            return r3
        L_0x000a:
            float r1 = r5.G
            r2 = 0
            r4 = 1
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x001d
            if (r6 != 0) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            r5 = r0[r4]
            h.f.a.h.d$a r6 = h.f.a.h.d.a.MATCH_CONSTRAINT
            if (r5 != r6) goto L_0x001c
        L_0x001c:
            return r3
        L_0x001d:
            if (r6 != 0) goto L_0x002d
            int r6 = r5.e
            if (r6 == 0) goto L_0x0024
            return r3
        L_0x0024:
            int r6 = r5.f1644h
            if (r6 != 0) goto L_0x002c
            int r5 = r5.f1645i
            if (r5 == 0) goto L_0x003b
        L_0x002c:
            return r3
        L_0x002d:
            int r6 = r5.f1642f
            if (r6 == 0) goto L_0x0032
            return r3
        L_0x0032:
            int r6 = r5.f1647k
            if (r6 != 0) goto L_0x003c
            int r5 = r5.f1648l
            if (r5 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            return r4
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.a.h.i.a(h.f.a.h.d, int):boolean");
    }

    public static void a(d dVar, int i2, int i3) {
        int i4 = i2 * 2;
        int i5 = i4 + 1;
        c[] cVarArr = dVar.A;
        cVarArr[i4].a.f1665f = dVar.D.s.a;
        cVarArr[i4].a.f1666g = (float) i3;
        cVarArr[i4].a.f1673b = 1;
        cVarArr[i5].a.f1665f = cVarArr[i4].a;
        cVarArr[i5].a.f1666g = (float) dVar.c(i2);
        dVar.A[i5].a.f1673b = 1;
    }
}
