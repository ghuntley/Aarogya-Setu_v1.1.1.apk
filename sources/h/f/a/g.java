package h.f.a;

import java.util.Arrays;

/* compiled from: SolverVariable */
public class g {

    /* renamed from: k  reason: collision with root package name */
    public static int f1597k = 1;
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public int f1598b = -1;
    public int c = -1;
    public int d = 0;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public float[] f1599f = new float[7];

    /* renamed from: g  reason: collision with root package name */
    public a f1600g;

    /* renamed from: h  reason: collision with root package name */
    public b[] f1601h = new b[8];

    /* renamed from: i  reason: collision with root package name */
    public int f1602i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f1603j = 0;

    /* compiled from: SolverVariable */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public g(a aVar) {
        this.f1600g = aVar;
    }

    public final void a(b bVar) {
        int i2 = 0;
        while (true) {
            int i3 = this.f1602i;
            if (i2 >= i3) {
                b[] bVarArr = this.f1601h;
                if (i3 >= bVarArr.length) {
                    this.f1601h = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f1601h;
                int i4 = this.f1602i;
                bVarArr2[i4] = bVar;
                this.f1602i = i4 + 1;
                return;
            } else if (this.f1601h[i2] != bVar) {
                i2++;
            } else {
                return;
            }
        }
    }

    public final void b(b bVar) {
        int i2 = this.f1602i;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f1601h[i3] == bVar) {
                for (int i4 = 0; i4 < (i2 - i3) - 1; i4++) {
                    b[] bVarArr = this.f1601h;
                    int i5 = i3 + i4;
                    bVarArr[i5] = bVarArr[i5 + 1];
                }
                this.f1602i--;
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i2 = this.f1602i;
        for (int i3 = 0; i3 < i2; i3++) {
            b[] bVarArr = this.f1601h;
            a aVar = bVarArr[i3].d;
            b bVar2 = bVarArr[i3];
            int i4 = aVar.f1579i;
            while (true) {
                int i5 = 0;
                while (i4 != -1 && i5 < aVar.a) {
                    int i6 = aVar.f1576f[i4];
                    g gVar = bVar.a;
                    if (i6 == gVar.f1598b) {
                        float f2 = aVar.f1578h[i4];
                        aVar.a(gVar, false);
                        a aVar2 = bVar.d;
                        int i7 = aVar2.f1579i;
                        int i8 = 0;
                        while (i7 != -1 && i8 < aVar2.a) {
                            aVar.a(aVar.c.c[aVar2.f1576f[i7]], aVar2.f1578h[i7] * f2, false);
                            i7 = aVar2.f1577g[i7];
                            i8++;
                        }
                        bVar2.f1582b = (bVar.f1582b * f2) + bVar2.f1582b;
                        i4 = aVar.f1579i;
                    } else {
                        i4 = aVar.f1577g[i4];
                        i5++;
                    }
                }
            }
        }
        this.f1602i = 0;
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("");
        a2.append(this.a);
        return a2.toString();
    }

    public void a() {
        this.a = null;
        this.f1600g = a.UNKNOWN;
        this.d = 0;
        this.f1598b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f1602i = 0;
        this.f1603j = 0;
    }
}
