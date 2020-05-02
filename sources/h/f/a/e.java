package h.f.a;

import h.f.a.g;
import h.f.a.h.c;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: LinearSystem */
public class e {

    /* renamed from: p  reason: collision with root package name */
    public static int f1584p = 1000;
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, g> f1585b;
    public a c;
    public int d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public b[] f1586f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1587g;

    /* renamed from: h  reason: collision with root package name */
    public boolean[] f1588h;

    /* renamed from: i  reason: collision with root package name */
    public int f1589i;

    /* renamed from: j  reason: collision with root package name */
    public int f1590j;

    /* renamed from: k  reason: collision with root package name */
    public int f1591k;

    /* renamed from: l  reason: collision with root package name */
    public final c f1592l;

    /* renamed from: m  reason: collision with root package name */
    public g[] f1593m;

    /* renamed from: n  reason: collision with root package name */
    public int f1594n;

    /* renamed from: o  reason: collision with root package name */
    public final a f1595o;

    /* compiled from: LinearSystem */
    public interface a {
        void a(g gVar);
    }

    public e() {
        this.a = 0;
        this.f1585b = null;
        this.d = 32;
        this.e = 32;
        this.f1586f = null;
        this.f1587g = false;
        this.f1588h = new boolean[32];
        this.f1589i = 1;
        this.f1590j = 0;
        this.f1591k = 32;
        this.f1593m = new g[f1584p];
        this.f1594n = 0;
        this.f1586f = new b[32];
        e();
        c cVar = new c();
        this.f1592l = cVar;
        this.c = new d(cVar);
        this.f1595o = new b(this.f1592l);
    }

    public g a(Object obj) {
        g gVar = null;
        if (obj == null) {
            return null;
        }
        if (this.f1589i + 1 >= this.e) {
            d();
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            gVar = cVar.f1626i;
            if (gVar == null) {
                cVar.d();
                gVar = cVar.f1626i;
            }
            int i2 = gVar.f1598b;
            if (i2 == -1 || i2 > this.a || this.f1592l.c[i2] == null) {
                if (gVar.f1598b != -1) {
                    gVar.a();
                }
                int i3 = this.a + 1;
                this.a = i3;
                this.f1589i++;
                gVar.f1598b = i3;
                gVar.f1600g = g.a.UNRESTRICTED;
                this.f1592l.c[i3] = gVar;
            }
        }
        return gVar;
    }

    public b b() {
        b a2 = this.f1592l.a.a();
        if (a2 == null) {
            a2 = new b(this.f1592l);
        } else {
            a2.a = null;
            a2.d.a();
            a2.f1582b = 0.0f;
            a2.e = false;
        }
        g.f1597k++;
        return a2;
    }

    public g c() {
        if (this.f1589i + 1 >= this.e) {
            d();
        }
        g a2 = a(g.a.SLACK, (String) null);
        int i2 = this.a + 1;
        this.a = i2;
        this.f1589i++;
        a2.f1598b = i2;
        this.f1592l.c[i2] = a2;
        return a2;
    }

    public final void d() {
        int i2 = this.d * 2;
        this.d = i2;
        this.f1586f = (b[]) Arrays.copyOf(this.f1586f, i2);
        c cVar = this.f1592l;
        cVar.c = (g[]) Arrays.copyOf(cVar.c, this.d);
        int i3 = this.d;
        this.f1588h = new boolean[i3];
        this.e = i3;
        this.f1591k = i3;
    }

    public final void e() {
        int i2 = 0;
        while (true) {
            b[] bVarArr = this.f1586f;
            if (i2 < bVarArr.length) {
                b bVar = bVarArr[i2];
                if (bVar != null) {
                    this.f1592l.a.a(bVar);
                }
                this.f1586f[i2] = null;
                i2++;
            } else {
                return;
            }
        }
    }

    public void f() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.f1592l;
            g[] gVarArr = cVar.c;
            if (i2 >= gVarArr.length) {
                break;
            }
            g gVar = gVarArr[i2];
            if (gVar != null) {
                gVar.a();
            }
            i2++;
        }
        f<g> fVar = cVar.f1583b;
        g[] gVarArr2 = this.f1593m;
        int i3 = this.f1594n;
        if (fVar != null) {
            if (i3 > gVarArr2.length) {
                i3 = gVarArr2.length;
            }
            for (int i4 = 0; i4 < i3; i4++) {
                g gVar2 = gVarArr2[i4];
                int i5 = fVar.f1596b;
                Object[] objArr = fVar.a;
                if (i5 < objArr.length) {
                    objArr[i5] = gVar2;
                    fVar.f1596b = i5 + 1;
                }
            }
            this.f1594n = 0;
            Arrays.fill(this.f1592l.c, (Object) null);
            HashMap<String, g> hashMap = this.f1585b;
            if (hashMap != null) {
                hashMap.clear();
            }
            this.a = 0;
            b bVar = (b) this.c;
            bVar.d.a();
            bVar.a = null;
            bVar.f1582b = 0.0f;
            this.f1589i = 1;
            for (int i6 = 0; i6 < this.f1590j; i6++) {
                this.f1586f[i6].c = false;
            }
            e();
            this.f1590j = 0;
            return;
        }
        throw null;
    }

    public int b(Object obj) {
        g gVar = ((c) obj).f1626i;
        if (gVar != null) {
            return (int) (gVar.e + 0.5f);
        }
        return 0;
    }

    public final void c(b bVar) {
        if (this.f1590j > 0) {
            a aVar = bVar.d;
            b[] bVarArr = this.f1586f;
            int i2 = aVar.f1579i;
            loop0:
            while (true) {
                int i3 = 0;
                int i4 = 0;
                while (i2 != -1 && i4 < aVar.a) {
                    g gVar = aVar.c.c[aVar.f1576f[i2]];
                    if (gVar.c != -1) {
                        float f2 = aVar.f1578h[i2];
                        aVar.a(gVar, true);
                        b bVar2 = bVarArr[gVar.c];
                        if (!bVar2.e) {
                            a aVar2 = bVar2.d;
                            int i5 = aVar2.f1579i;
                            while (i5 != -1 && i3 < aVar2.a) {
                                aVar.a(aVar.c.c[aVar2.f1576f[i5]], aVar2.f1578h[i5] * f2, true);
                                i5 = aVar2.f1577g[i5];
                                i3++;
                            }
                        }
                        bVar.f1582b = (bVar2.f1582b * f2) + bVar.f1582b;
                        bVar2.a.b(bVar);
                        i2 = aVar.f1579i;
                    } else {
                        i2 = aVar.f1577g[i2];
                        i4++;
                    }
                }
            }
            if (bVar.d.a == 0) {
                bVar.e = true;
            }
        }
    }

    public final void b(b bVar) {
        b[] bVarArr = this.f1586f;
        int i2 = this.f1590j;
        if (bVarArr[i2] != null) {
            this.f1592l.a.a(bVarArr[i2]);
        }
        b[] bVarArr2 = this.f1586f;
        int i3 = this.f1590j;
        bVarArr2[i3] = bVar;
        g gVar = bVar.a;
        gVar.c = i3;
        this.f1590j = i3 + 1;
        gVar.c(bVar);
    }

    public g a(int i2, String str) {
        if (this.f1589i + 1 >= this.e) {
            d();
        }
        g a2 = a(g.a.ERROR, str);
        int i3 = this.a + 1;
        this.a = i3;
        this.f1589i++;
        a2.f1598b = i3;
        a2.d = i2;
        this.f1592l.c[i3] = a2;
        this.c.a(a2);
        return a2;
    }

    public final int b(a aVar) {
        boolean z;
        for (int i2 = 0; i2 < this.f1589i; i2++) {
            this.f1588h[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            i3++;
            if (i3 >= this.f1589i * 2) {
                return i3;
            }
            b bVar = (b) aVar;
            g gVar = bVar.a;
            if (gVar != null) {
                this.f1588h[gVar.f1598b] = true;
            }
            g a2 = bVar.d.a(this.f1588h, (g) null);
            if (a2 != null) {
                boolean[] zArr = this.f1588h;
                int i4 = a2.f1598b;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (a2 != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.f1590j; i6++) {
                    b bVar2 = this.f1586f[i6];
                    if (bVar2.a.f1600g != g.a.UNRESTRICTED && !bVar2.e) {
                        a aVar2 = bVar2.d;
                        int i7 = aVar2.f1579i;
                        if (i7 != -1) {
                            int i8 = 0;
                            while (true) {
                                if (i7 == -1 || i8 >= aVar2.a) {
                                    break;
                                } else if (aVar2.f1576f[i7] == a2.f1598b) {
                                    z = true;
                                    break;
                                } else {
                                    i7 = aVar2.f1577g[i7];
                                    i8++;
                                }
                            }
                        }
                        z = false;
                        if (z) {
                            float a3 = bVar2.d.a(a2);
                            if (a3 < 0.0f) {
                                float f3 = (-bVar2.f1582b) / a3;
                                if (f3 < f2) {
                                    i5 = i6;
                                    f2 = f3;
                                }
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    b bVar3 = this.f1586f[i5];
                    bVar3.a.c = -1;
                    bVar3.b(a2);
                    g gVar2 = bVar3.a;
                    gVar2.c = i5;
                    gVar2.c(bVar3);
                }
            }
            z2 = true;
        }
        return i3;
    }

    public final g a(g.a aVar, String str) {
        g a2 = this.f1592l.f1583b.a();
        if (a2 == null) {
            a2 = new g(aVar);
            a2.f1600g = aVar;
        } else {
            a2.a();
            a2.f1600g = aVar;
        }
        int i2 = this.f1594n;
        int i3 = f1584p;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f1584p = i4;
            this.f1593m = (g[]) Arrays.copyOf(this.f1593m, i4);
        }
        g[] gVarArr = this.f1593m;
        int i5 = this.f1594n;
        this.f1594n = i5 + 1;
        gVarArr[i5] = a2;
        return a2;
    }

    public void c(g gVar, g gVar2, int i2, int i3) {
        b b2 = b();
        g c2 = c();
        c2.d = 0;
        b2.b(gVar, gVar2, c2, i2);
        if (i3 != 6) {
            b2.d.a(a(i3, (String) null), (float) ((int) (b2.d.a(c2) * -1.0f)));
        }
        a(b2);
    }

    public void a(a aVar) {
        float f2;
        boolean z;
        c((b) aVar);
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.f1590j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f1586f;
            if (bVarArr[i2].a.f1600g != g.a.UNRESTRICTED && bVarArr[i2].f1582b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            boolean z2 = false;
            int i3 = 0;
            while (!z2) {
                i3++;
                float f3 = Float.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                while (i4 < this.f1590j) {
                    b bVar = this.f1586f[i4];
                    if (bVar.a.f1600g != g.a.UNRESTRICTED && !bVar.e && bVar.f1582b < f2) {
                        int i8 = 1;
                        while (i8 < this.f1589i) {
                            g gVar = this.f1592l.c[i8];
                            float a2 = bVar.d.a(gVar);
                            if (a2 > f2) {
                                for (int i9 = 0; i9 < 7; i9++) {
                                    float f4 = gVar.f1599f[i9] / a2;
                                    if ((f4 < f3 && i9 == i7) || i9 > i7) {
                                        i7 = i9;
                                        f3 = f4;
                                        i5 = i4;
                                        i6 = i8;
                                    }
                                }
                            }
                            i8++;
                            f2 = 0.0f;
                        }
                    }
                    i4++;
                    f2 = 0.0f;
                }
                if (i5 != -1) {
                    b bVar2 = this.f1586f[i5];
                    bVar2.a.c = -1;
                    bVar2.b(this.f1592l.c[i6]);
                    g gVar2 = bVar2.a;
                    gVar2.c = i5;
                    gVar2.c(bVar2);
                } else {
                    z2 = true;
                }
                if (i3 > this.f1589i / 2) {
                    z2 = true;
                }
                f2 = 0.0f;
            }
        }
        b(aVar);
        a();
    }

    public void b(g gVar, g gVar2, int i2, int i3) {
        b b2 = b();
        g c2 = c();
        c2.d = 0;
        b2.a(gVar, gVar2, c2, i2);
        if (i3 != 6) {
            b2.d.a(a(i3, (String) null), (float) ((int) (b2.d.a(c2) * -1.0f)));
        }
        a(b2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x00f3 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(h.f.a.b r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            if (r1 != 0) goto L_0x0007
            return
        L_0x0007:
            int r2 = r0.f1590j
            r3 = 1
            int r2 = r2 + r3
            int r4 = r0.f1591k
            if (r2 >= r4) goto L_0x0016
            int r2 = r0.f1589i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x0019
        L_0x0016:
            r18.d()
        L_0x0019:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x01a4
            r18.c(r19)
            h.f.a.g r2 = r1.a
            r5 = 0
            if (r2 != 0) goto L_0x0033
            float r2 = r1.f1582b
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L_0x0033
            h.f.a.a r2 = r1.d
            int r2 = r2.a
            if (r2 != 0) goto L_0x0033
            r2 = 1
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            if (r2 == 0) goto L_0x0037
            return
        L_0x0037:
            float r2 = r1.f1582b
            r6 = -1
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x005e
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r7
            r1.f1582b = r2
            h.f.a.a r2 = r1.d
            int r8 = r2.f1579i
            r9 = 0
        L_0x0049:
            if (r8 == r6) goto L_0x005e
            int r10 = r2.a
            if (r9 >= r10) goto L_0x005e
            float[] r10 = r2.f1578h
            r11 = r10[r8]
            float r11 = r11 * r7
            r10[r8] = r11
            int[] r10 = r2.f1577g
            r8 = r10[r8]
            int r9 = r9 + 1
            goto L_0x0049
        L_0x005e:
            h.f.a.a r2 = r1.d
            int r7 = r2.f1579i
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0069:
            if (r7 == r6) goto L_0x00fc
            int r4 = r2.a
            if (r9 >= r4) goto L_0x00fc
            float[] r4 = r2.f1578h
            r16 = r4[r7]
            r17 = 981668463(0x3a83126f, float:0.001)
            h.f.a.c r6 = r2.c
            h.f.a.g[] r6 = r6.c
            int[] r8 = r2.f1576f
            r8 = r8[r7]
            r6 = r6[r8]
            int r8 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x0093
            r8 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r8 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x00a0
            r4[r7] = r5
            h.f.a.b r4 = r2.f1575b
            r6.b(r4)
            goto L_0x009e
        L_0x0093:
            int r8 = (r16 > r17 ? 1 : (r16 == r17 ? 0 : -1))
            if (r8 >= 0) goto L_0x00a0
            r4[r7] = r5
            h.f.a.b r4 = r2.f1575b
            r6.b(r4)
        L_0x009e:
            r16 = 0
        L_0x00a0:
            int r4 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00f3
            h.f.a.g$a r4 = r6.f1600g
            h.f.a.g$a r8 = h.f.a.g.a.UNRESTRICTED
            if (r4 != r8) goto L_0x00cc
            if (r11 != 0) goto L_0x00b2
            boolean r4 = r2.b((h.f.a.g) r6)
        L_0x00b0:
            r13 = r4
            goto L_0x00bb
        L_0x00b2:
            int r4 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00bf
            boolean r4 = r2.b((h.f.a.g) r6)
            goto L_0x00b0
        L_0x00bb:
            r11 = r6
            r12 = r16
            goto L_0x00f3
        L_0x00bf:
            if (r13 != 0) goto L_0x00f3
            boolean r4 = r2.b((h.f.a.g) r6)
            if (r4 == 0) goto L_0x00f3
            r11 = r6
            r12 = r16
            r13 = 1
            goto L_0x00f3
        L_0x00cc:
            if (r11 != 0) goto L_0x00f3
            int r4 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x00f3
            if (r10 != 0) goto L_0x00da
            boolean r4 = r2.b((h.f.a.g) r6)
        L_0x00d8:
            r15 = r4
            goto L_0x00e3
        L_0x00da:
            int r4 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r4 <= 0) goto L_0x00e7
            boolean r4 = r2.b((h.f.a.g) r6)
            goto L_0x00d8
        L_0x00e3:
            r10 = r6
            r14 = r16
            goto L_0x00f3
        L_0x00e7:
            if (r15 != 0) goto L_0x00f3
            boolean r4 = r2.b((h.f.a.g) r6)
            if (r4 == 0) goto L_0x00f3
            r10 = r6
            r14 = r16
            r15 = 1
        L_0x00f3:
            int[] r4 = r2.f1577g
            r7 = r4[r7]
            int r9 = r9 + 1
            r6 = -1
            goto L_0x0069
        L_0x00fc:
            if (r11 == 0) goto L_0x00ff
            r10 = r11
        L_0x00ff:
            if (r10 != 0) goto L_0x0103
            r2 = 1
            goto L_0x0107
        L_0x0103:
            r1.b(r10)
            r2 = 0
        L_0x0107:
            h.f.a.a r4 = r1.d
            int r4 = r4.a
            if (r4 != 0) goto L_0x010f
            r1.e = r3
        L_0x010f:
            if (r2 == 0) goto L_0x018c
            int r2 = r0.f1589i
            int r2 = r2 + r3
            int r4 = r0.e
            if (r2 < r4) goto L_0x011b
            r18.d()
        L_0x011b:
            h.f.a.g$a r2 = h.f.a.g.a.SLACK
            r4 = 0
            h.f.a.g r2 = r0.a((h.f.a.g.a) r2, (java.lang.String) r4)
            int r4 = r0.a
            int r4 = r4 + r3
            r0.a = r4
            int r6 = r0.f1589i
            int r6 = r6 + r3
            r0.f1589i = r6
            r2.f1598b = r4
            h.f.a.c r6 = r0.f1592l
            h.f.a.g[] r6 = r6.c
            r6[r4] = r2
            r1.a = r2
            r18.b((h.f.a.b) r19)
            h.f.a.e$a r4 = r0.f1595o
            h.f.a.b r4 = (h.f.a.b) r4
            if (r4 == 0) goto L_0x018a
            r6 = 0
            r4.a = r6
            h.f.a.a r6 = r4.d
            r6.a()
            r6 = 0
        L_0x0148:
            h.f.a.a r7 = r1.d
            int r8 = r7.a
            if (r6 >= r8) goto L_0x0160
            h.f.a.g r7 = r7.a((int) r6)
            h.f.a.a r8 = r1.d
            float r8 = r8.b((int) r6)
            h.f.a.a r9 = r4.d
            r9.a(r7, r8, r3)
            int r6 = r6 + 1
            goto L_0x0148
        L_0x0160:
            h.f.a.e$a r4 = r0.f1595o
            r0.b((h.f.a.e.a) r4)
            int r4 = r2.c
            r6 = -1
            if (r4 != r6) goto L_0x0188
            h.f.a.g r4 = r1.a
            if (r4 != r2) goto L_0x017a
            h.f.a.a r4 = r1.d
            r6 = 0
            h.f.a.g r2 = r4.a((boolean[]) r6, (h.f.a.g) r2)
            if (r2 == 0) goto L_0x017a
            r1.b(r2)
        L_0x017a:
            boolean r2 = r1.e
            if (r2 != 0) goto L_0x0183
            h.f.a.g r2 = r1.a
            r2.c(r1)
        L_0x0183:
            int r2 = r0.f1590j
            int r2 = r2 - r3
            r0.f1590j = r2
        L_0x0188:
            r2 = 1
            goto L_0x018d
        L_0x018a:
            r2 = 0
            throw r2
        L_0x018c:
            r2 = 0
        L_0x018d:
            h.f.a.g r4 = r1.a
            if (r4 == 0) goto L_0x019e
            h.f.a.g$a r4 = r4.f1600g
            h.f.a.g$a r6 = h.f.a.g.a.UNRESTRICTED
            if (r4 == r6) goto L_0x019f
            float r4 = r1.f1582b
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x019e
            goto L_0x019f
        L_0x019e:
            r3 = 0
        L_0x019f:
            if (r3 != 0) goto L_0x01a2
            return
        L_0x01a2:
            r4 = r2
            goto L_0x01a5
        L_0x01a4:
            r4 = 0
        L_0x01a5:
            if (r4 != 0) goto L_0x01aa
            r18.b((h.f.a.b) r19)
        L_0x01aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.a.e.a(h.f.a.b):void");
    }

    public final void a() {
        for (int i2 = 0; i2 < this.f1590j; i2++) {
            b bVar = this.f1586f[i2];
            bVar.a.e = bVar.f1582b;
        }
    }

    public void a(g gVar, g gVar2, int i2, float f2, g gVar3, g gVar4, int i3, int i4) {
        b b2 = b();
        if (gVar2 == gVar3) {
            b2.d.a(gVar, 1.0f);
            b2.d.a(gVar4, 1.0f);
            b2.d.a(gVar2, -2.0f);
        } else if (f2 == 0.5f) {
            b2.d.a(gVar, 1.0f);
            b2.d.a(gVar2, -1.0f);
            b2.d.a(gVar3, -1.0f);
            b2.d.a(gVar4, 1.0f);
            if (i2 > 0 || i3 > 0) {
                b2.f1582b = (float) ((-i2) + i3);
            }
        } else if (f2 <= 0.0f) {
            b2.d.a(gVar, -1.0f);
            b2.d.a(gVar2, 1.0f);
            b2.f1582b = (float) i2;
        } else if (f2 >= 1.0f) {
            b2.d.a(gVar3, -1.0f);
            b2.d.a(gVar4, 1.0f);
            b2.f1582b = (float) i3;
        } else {
            float f3 = 1.0f - f2;
            b2.d.a(gVar, f3 * 1.0f);
            b2.d.a(gVar2, f3 * -1.0f);
            b2.d.a(gVar3, -1.0f * f2);
            b2.d.a(gVar4, 1.0f * f2);
            if (i2 > 0 || i3 > 0) {
                b2.f1582b = (((float) i3) * f2) + (((float) (-i2)) * f3);
            }
        }
        if (i4 != 6) {
            b2.a(this, i4);
        }
        a(b2);
    }

    public void a(g gVar, g gVar2, g gVar3, g gVar4, float f2, int i2) {
        b b2 = b();
        b2.a(gVar, gVar2, gVar3, gVar4, f2);
        if (i2 != 6) {
            b2.a(this, i2);
        }
        a(b2);
    }

    public b a(g gVar, g gVar2, int i2, int i3) {
        b b2 = b();
        boolean z = false;
        if (i2 != 0) {
            if (i2 < 0) {
                i2 *= -1;
                z = true;
            }
            b2.f1582b = (float) i2;
        }
        if (!z) {
            b2.d.a(gVar, -1.0f);
            b2.d.a(gVar2, 1.0f);
        } else {
            b2.d.a(gVar, 1.0f);
            b2.d.a(gVar2, -1.0f);
        }
        if (i3 != 6) {
            b2.a(this, i3);
        }
        a(b2);
        return b2;
    }

    public void a(g gVar, int i2) {
        int i3 = gVar.c;
        if (i3 != -1) {
            b bVar = this.f1586f[i3];
            if (bVar.e) {
                bVar.f1582b = (float) i2;
            } else if (bVar.d.a == 0) {
                bVar.e = true;
                bVar.f1582b = (float) i2;
            } else {
                b b2 = b();
                if (i2 < 0) {
                    b2.f1582b = (float) (i2 * -1);
                    b2.d.a(gVar, 1.0f);
                } else {
                    b2.f1582b = (float) i2;
                    b2.d.a(gVar, -1.0f);
                }
                a(b2);
            }
        } else {
            b b3 = b();
            b3.a = gVar;
            float f2 = (float) i2;
            gVar.e = f2;
            b3.f1582b = f2;
            b3.e = true;
            a(b3);
        }
    }
}
