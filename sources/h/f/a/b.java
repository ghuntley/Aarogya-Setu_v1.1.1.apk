package h.f.a;

import h.f.a.e;

/* compiled from: ArrayRow */
public class b implements e.a {
    public g a = null;

    /* renamed from: b  reason: collision with root package name */
    public float f1582b = 0.0f;
    public boolean c;
    public final a d;
    public boolean e = false;

    public b(c cVar) {
        this.d = new a(this, cVar);
    }

    public b a(g gVar, g gVar2, g gVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1582b = (float) i2;
        }
        if (!z) {
            this.d.a(gVar, -1.0f);
            this.d.a(gVar2, 1.0f);
            this.d.a(gVar3, 1.0f);
        } else {
            this.d.a(gVar, 1.0f);
            this.d.a(gVar2, -1.0f);
            this.d.a(gVar3, -1.0f);
        }
        return this;
    }

    public b b(g gVar, g gVar2, g gVar3, int i2) {
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            this.f1582b = (float) i2;
        }
        if (!z) {
            this.d.a(gVar, -1.0f);
            this.d.a(gVar2, 1.0f);
            this.d.a(gVar3, -1.0f);
        } else {
            this.d.a(gVar, 1.0f);
            this.d.a(gVar2, -1.0f);
            this.d.a(gVar3, 1.0f);
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r9 = this;
            h.f.a.g r0 = r9.a
            if (r0 != 0) goto L_0x0007
            java.lang.String r0 = "0"
            goto L_0x0016
        L_0x0007:
            java.lang.String r0 = ""
            java.lang.StringBuilder r0 = i.a.a.a.a.a(r0)
            h.f.a.g r1 = r9.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
        L_0x0016:
            java.lang.String r1 = " = "
            java.lang.String r0 = i.a.a.a.a.b((java.lang.String) r0, (java.lang.String) r1)
            float r1 = r9.f1582b
            r2 = 0
            r3 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0033
            java.lang.StringBuilder r0 = i.a.a.a.a.a(r0)
            float r1 = r9.f1582b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 1
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            h.f.a.a r4 = r9.d
            int r4 = r4.a
        L_0x0038:
            if (r3 >= r4) goto L_0x0098
            h.f.a.a r5 = r9.d
            h.f.a.g r5 = r5.a((int) r3)
            if (r5 != 0) goto L_0x0043
            goto L_0x0095
        L_0x0043:
            h.f.a.a r6 = r9.d
            float r6 = r6.b((int) r3)
            int r7 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x004e
            goto L_0x0095
        L_0x004e:
            java.lang.String r5 = r5.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L_0x0061
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 >= 0) goto L_0x0072
            java.lang.String r1 = "- "
            java.lang.String r0 = i.a.a.a.a.b((java.lang.String) r0, (java.lang.String) r1)
            goto L_0x0070
        L_0x0061:
            if (r7 <= 0) goto L_0x006a
            java.lang.String r1 = " + "
            java.lang.String r0 = i.a.a.a.a.b((java.lang.String) r0, (java.lang.String) r1)
            goto L_0x0072
        L_0x006a:
            java.lang.String r1 = " - "
            java.lang.String r0 = i.a.a.a.a.b((java.lang.String) r0, (java.lang.String) r1)
        L_0x0070:
            float r6 = r6 * r8
        L_0x0072:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r1 != 0) goto L_0x007d
            java.lang.String r0 = i.a.a.a.a.b((java.lang.String) r0, (java.lang.String) r5)
            goto L_0x0094
        L_0x007d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
        L_0x0094:
            r1 = 1
        L_0x0095:
            int r3 = r3 + 1
            goto L_0x0038
        L_0x0098:
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = "0.0"
            java.lang.String r0 = i.a.a.a.a.b((java.lang.String) r0, (java.lang.String) r1)
        L_0x00a0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.a.b.toString():java.lang.String");
    }

    public b a(e eVar, int i2) {
        this.d.a(eVar.a(i2, "ep"), 1.0f);
        this.d.a(eVar.a(i2, "em"), -1.0f);
        return this;
    }

    public b b(g gVar, g gVar2, g gVar3, g gVar4, float f2) {
        this.d.a(gVar3, 0.5f);
        this.d.a(gVar4, 0.5f);
        this.d.a(gVar, -0.5f);
        this.d.a(gVar2, -0.5f);
        this.f1582b = -f2;
        return this;
    }

    public b a(g gVar, g gVar2, g gVar3, g gVar4, float f2) {
        this.d.a(gVar, -1.0f);
        this.d.a(gVar2, 1.0f);
        this.d.a(gVar3, f2);
        this.d.a(gVar4, -f2);
        return this;
    }

    public void b(g gVar) {
        g gVar2 = this.a;
        if (gVar2 != null) {
            this.d.a(gVar2, -1.0f);
            this.a = null;
        }
        float a2 = this.d.a(gVar, true) * -1.0f;
        this.a = gVar;
        if (a2 != 1.0f) {
            this.f1582b /= a2;
            a aVar = this.d;
            int i2 = aVar.f1579i;
            int i3 = 0;
            while (i2 != -1 && i3 < aVar.a) {
                float[] fArr = aVar.f1578h;
                fArr[i2] = fArr[i2] / a2;
                i2 = aVar.f1577g[i2];
                i3++;
            }
        }
    }

    public void a(g gVar) {
        int i2 = gVar.d;
        float f2 = 1.0f;
        if (i2 != 1) {
            if (i2 == 2) {
                f2 = 1000.0f;
            } else if (i2 == 3) {
                f2 = 1000000.0f;
            } else if (i2 == 4) {
                f2 = 1.0E9f;
            } else if (i2 == 5) {
                f2 = 1.0E12f;
            }
        }
        this.d.a(gVar, f2);
    }
}
