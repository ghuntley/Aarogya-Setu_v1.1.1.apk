package h.f.a.h;

import h.f.a.g;

/* compiled from: ConstraintAnchor */
public class c {
    public j a = new j(this);

    /* renamed from: b  reason: collision with root package name */
    public final d f1622b;
    public final C0042c c;
    public c d;
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f1623f = -1;

    /* renamed from: g  reason: collision with root package name */
    public b f1624g = b.NONE;

    /* renamed from: h  reason: collision with root package name */
    public int f1625h;

    /* renamed from: i  reason: collision with root package name */
    public g f1626i;

    /* compiled from: ConstraintAnchor */
    public enum a {
        RELAXED,
        STRICT
    }

    /* compiled from: ConstraintAnchor */
    public enum b {
        NONE,
        STRONG,
        WEAK
    }

    /* renamed from: h.f.a.h.c$c  reason: collision with other inner class name */
    /* compiled from: ConstraintAnchor */
    public enum C0042c {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public c(d dVar, C0042c cVar) {
        a aVar = a.RELAXED;
        this.f1625h = 0;
        this.f1622b = dVar;
        this.c = cVar;
    }

    public int a() {
        c cVar;
        if (this.f1622b.Y == 8) {
            return 0;
        }
        int i2 = this.f1623f;
        if (i2 <= -1 || (cVar = this.d) == null || cVar.f1622b.Y != 8) {
            return this.e;
        }
        return i2;
    }

    public boolean b() {
        return this.d != null;
    }

    public void c() {
        this.d = null;
        this.e = 0;
        this.f1623f = -1;
        this.f1624g = b.STRONG;
        this.f1625h = 0;
        a aVar = a.RELAXED;
        this.a.e();
    }

    public void d() {
        g gVar = this.f1626i;
        if (gVar == null) {
            this.f1626i = new g(g.a.UNRESTRICTED);
        } else {
            gVar.a();
        }
    }

    public String toString() {
        return this.f1622b.Z + ":" + this.c.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if ((r4.f1622b.Q > 0) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        if (r10 != h.f.a.h.c.C0042c.f1639m) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0070, code lost:
        if (r10 != h.f.a.h.c.C0042c.f1639m) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        r10 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x008b, code lost:
        if (r10 != h.f.a.h.c.C0042c.f1638l) goto L_0x0058;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0090 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(h.f.a.h.c r5, int r6, int r7, h.f.a.h.c.b r8, int r9, boolean r10) {
        /*
            r4 = this;
            r0 = 0
            r1 = 1
            if (r5 != 0) goto L_0x0014
            r5 = 0
            r4.d = r5
            r4.e = r0
            r5 = -1
            r4.f1623f = r5
            h.f.a.h.c$b r5 = h.f.a.h.c.b.NONE
            r4.f1624g = r5
            r5 = 2
            r4.f1625h = r5
            return r1
        L_0x0014:
            if (r10 != 0) goto L_0x0091
            h.f.a.h.c$c r10 = r5.c
            h.f.a.h.c$c r2 = r4.c
            if (r10 != r2) goto L_0x0037
            h.f.a.h.c$c r10 = h.f.a.h.c.C0042c.BASELINE
            if (r2 != r10) goto L_0x0056
            h.f.a.h.d r10 = r5.f1622b
            int r10 = r10.Q
            if (r10 <= 0) goto L_0x0028
            r10 = 1
            goto L_0x0029
        L_0x0028:
            r10 = 0
        L_0x0029:
            if (r10 == 0) goto L_0x0058
            h.f.a.h.d r10 = r4.f1622b
            int r10 = r10.Q
            if (r10 <= 0) goto L_0x0033
            r10 = 1
            goto L_0x0034
        L_0x0033:
            r10 = 0
        L_0x0034:
            if (r10 != 0) goto L_0x0056
            goto L_0x0058
        L_0x0037:
            int r2 = r2.ordinal()
            switch(r2) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0075;
                case 2: goto L_0x005a;
                case 3: goto L_0x0075;
                case 4: goto L_0x005a;
                case 5: goto L_0x0058;
                case 6: goto L_0x004a;
                case 7: goto L_0x0058;
                case 8: goto L_0x0058;
                default: goto L_0x003e;
            }
        L_0x003e:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            h.f.a.h.c$c r6 = r4.c
            java.lang.String r6 = r6.name()
            r5.<init>(r6)
            throw r5
        L_0x004a:
            h.f.a.h.c$c r2 = h.f.a.h.c.C0042c.BASELINE
            if (r10 == r2) goto L_0x0058
            h.f.a.h.c$c r2 = h.f.a.h.c.C0042c.CENTER_X
            if (r10 == r2) goto L_0x0058
            h.f.a.h.c$c r2 = h.f.a.h.c.C0042c.CENTER_Y
            if (r10 == r2) goto L_0x0058
        L_0x0056:
            r10 = 1
            goto L_0x008e
        L_0x0058:
            r10 = 0
            goto L_0x008e
        L_0x005a:
            h.f.a.h.c$c r2 = h.f.a.h.c.C0042c.TOP
            if (r10 == r2) goto L_0x0065
            h.f.a.h.c$c r2 = h.f.a.h.c.C0042c.BOTTOM
            if (r10 != r2) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r2 = 0
            goto L_0x0066
        L_0x0065:
            r2 = 1
        L_0x0066:
            h.f.a.h.d r3 = r5.f1622b
            boolean r3 = r3 instanceof h.f.a.h.g
            if (r3 == 0) goto L_0x0073
            if (r2 != 0) goto L_0x0056
            h.f.a.h.c$c r2 = h.f.a.h.c.C0042c.CENTER_Y
            if (r10 != r2) goto L_0x0058
            goto L_0x0056
        L_0x0073:
            r10 = r2
            goto L_0x008e
        L_0x0075:
            h.f.a.h.c$c r2 = h.f.a.h.c.C0042c.LEFT
            if (r10 == r2) goto L_0x0080
            h.f.a.h.c$c r2 = h.f.a.h.c.C0042c.RIGHT
            if (r10 != r2) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r2 = 0
            goto L_0x0081
        L_0x0080:
            r2 = 1
        L_0x0081:
            h.f.a.h.d r3 = r5.f1622b
            boolean r3 = r3 instanceof h.f.a.h.g
            if (r3 == 0) goto L_0x0073
            if (r2 != 0) goto L_0x0056
            h.f.a.h.c$c r2 = h.f.a.h.c.C0042c.CENTER_X
            if (r10 != r2) goto L_0x0058
            goto L_0x0056
        L_0x008e:
            if (r10 != 0) goto L_0x0091
            return r0
        L_0x0091:
            r4.d = r5
            if (r6 <= 0) goto L_0x0098
            r4.e = r6
            goto L_0x009a
        L_0x0098:
            r4.e = r0
        L_0x009a:
            r4.f1623f = r7
            r4.f1624g = r8
            r4.f1625h = r9
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.a.h.c.a(h.f.a.h.c, int, int, h.f.a.h.c$b, int, boolean):boolean");
    }
}
