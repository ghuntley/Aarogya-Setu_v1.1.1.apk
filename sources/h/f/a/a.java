package h.f.a;

import h.f.a.g;
import java.util.Arrays;

/* compiled from: ArrayLinkedVariables */
public class a {
    public int a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final b f1575b;
    public final c c;
    public int d = 8;
    public g e = null;

    /* renamed from: f  reason: collision with root package name */
    public int[] f1576f = new int[8];

    /* renamed from: g  reason: collision with root package name */
    public int[] f1577g = new int[8];

    /* renamed from: h  reason: collision with root package name */
    public float[] f1578h = new float[8];

    /* renamed from: i  reason: collision with root package name */
    public int f1579i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f1580j = -1;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1581k = false;

    public a(b bVar, c cVar) {
        this.f1575b = bVar;
        this.c = cVar;
    }

    public final void a(g gVar, float f2) {
        if (f2 == 0.0f) {
            a(gVar, true);
            return;
        }
        int i2 = this.f1579i;
        if (i2 == -1) {
            this.f1579i = 0;
            this.f1578h[0] = f2;
            this.f1576f[0] = gVar.f1598b;
            this.f1577g[0] = -1;
            gVar.f1603j++;
            gVar.a(this.f1575b);
            this.a++;
            if (!this.f1581k) {
                int i3 = this.f1580j + 1;
                this.f1580j = i3;
                int[] iArr = this.f1576f;
                if (i3 >= iArr.length) {
                    this.f1581k = true;
                    this.f1580j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i4 = 0;
        int i5 = -1;
        while (i2 != -1 && i4 < this.a) {
            int[] iArr2 = this.f1576f;
            int i6 = iArr2[i2];
            int i7 = gVar.f1598b;
            if (i6 == i7) {
                this.f1578h[i2] = f2;
                return;
            }
            if (iArr2[i2] < i7) {
                i5 = i2;
            }
            i2 = this.f1577g[i2];
            i4++;
        }
        int i8 = this.f1580j;
        int i9 = i8 + 1;
        if (this.f1581k) {
            int[] iArr3 = this.f1576f;
            if (iArr3[i8] != -1) {
                i8 = iArr3.length;
            }
        } else {
            i8 = i9;
        }
        int[] iArr4 = this.f1576f;
        if (i8 >= iArr4.length && this.a < iArr4.length) {
            int i10 = 0;
            while (true) {
                int[] iArr5 = this.f1576f;
                if (i10 >= iArr5.length) {
                    break;
                } else if (iArr5[i10] == -1) {
                    i8 = i10;
                    break;
                } else {
                    i10++;
                }
            }
        }
        int[] iArr6 = this.f1576f;
        if (i8 >= iArr6.length) {
            i8 = iArr6.length;
            int i11 = this.d * 2;
            this.d = i11;
            this.f1581k = false;
            this.f1580j = i8 - 1;
            this.f1578h = Arrays.copyOf(this.f1578h, i11);
            this.f1576f = Arrays.copyOf(this.f1576f, this.d);
            this.f1577g = Arrays.copyOf(this.f1577g, this.d);
        }
        this.f1576f[i8] = gVar.f1598b;
        this.f1578h[i8] = f2;
        if (i5 != -1) {
            int[] iArr7 = this.f1577g;
            iArr7[i8] = iArr7[i5];
            iArr7[i5] = i8;
        } else {
            this.f1577g[i8] = this.f1579i;
            this.f1579i = i8;
        }
        gVar.f1603j++;
        gVar.a(this.f1575b);
        this.a++;
        if (!this.f1581k) {
            this.f1580j++;
        }
        if (this.a >= this.f1576f.length) {
            this.f1581k = true;
        }
        int i12 = this.f1580j;
        int[] iArr8 = this.f1576f;
        if (i12 >= iArr8.length) {
            this.f1581k = true;
            this.f1580j = iArr8.length - 1;
        }
    }

    public final boolean b(g gVar) {
        return gVar.f1603j <= 1;
    }

    public String toString() {
        int i2 = this.f1579i;
        String str = "";
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            StringBuilder a2 = i.a.a.a.a.a(i.a.a.a.a.b(str, " -> "));
            a2.append(this.f1578h[i2]);
            a2.append(" : ");
            StringBuilder a3 = i.a.a.a.a.a(a2.toString());
            a3.append(this.c.c[this.f1576f[i2]]);
            str = a3.toString();
            i2 = this.f1577g[i2];
            i3++;
        }
        return str;
    }

    public final float b(int i2) {
        int i3 = this.f1579i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.f1578h[i3];
            }
            i3 = this.f1577g[i3];
            i4++;
        }
        return 0.0f;
    }

    public final void a(g gVar, float f2, boolean z) {
        if (f2 != 0.0f) {
            int i2 = this.f1579i;
            if (i2 == -1) {
                this.f1579i = 0;
                this.f1578h[0] = f2;
                this.f1576f[0] = gVar.f1598b;
                this.f1577g[0] = -1;
                gVar.f1603j++;
                gVar.a(this.f1575b);
                this.a++;
                if (!this.f1581k) {
                    int i3 = this.f1580j + 1;
                    this.f1580j = i3;
                    int[] iArr = this.f1576f;
                    if (i3 >= iArr.length) {
                        this.f1581k = true;
                        this.f1580j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i4 = 0;
            int i5 = -1;
            while (i2 != -1 && i4 < this.a) {
                int[] iArr2 = this.f1576f;
                int i6 = iArr2[i2];
                int i7 = gVar.f1598b;
                if (i6 == i7) {
                    float[] fArr = this.f1578h;
                    fArr[i2] = fArr[i2] + f2;
                    if (fArr[i2] == 0.0f) {
                        if (i2 == this.f1579i) {
                            this.f1579i = this.f1577g[i2];
                        } else {
                            int[] iArr3 = this.f1577g;
                            iArr3[i5] = iArr3[i2];
                        }
                        if (z) {
                            gVar.b(this.f1575b);
                        }
                        if (this.f1581k) {
                            this.f1580j = i2;
                        }
                        gVar.f1603j--;
                        this.a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i2] < i7) {
                    i5 = i2;
                }
                i2 = this.f1577g[i2];
                i4++;
            }
            int i8 = this.f1580j;
            int i9 = i8 + 1;
            if (this.f1581k) {
                int[] iArr4 = this.f1576f;
                if (iArr4[i8] != -1) {
                    i8 = iArr4.length;
                }
            } else {
                i8 = i9;
            }
            int[] iArr5 = this.f1576f;
            if (i8 >= iArr5.length && this.a < iArr5.length) {
                int i10 = 0;
                while (true) {
                    int[] iArr6 = this.f1576f;
                    if (i10 >= iArr6.length) {
                        break;
                    } else if (iArr6[i10] == -1) {
                        i8 = i10;
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            int[] iArr7 = this.f1576f;
            if (i8 >= iArr7.length) {
                i8 = iArr7.length;
                int i11 = this.d * 2;
                this.d = i11;
                this.f1581k = false;
                this.f1580j = i8 - 1;
                this.f1578h = Arrays.copyOf(this.f1578h, i11);
                this.f1576f = Arrays.copyOf(this.f1576f, this.d);
                this.f1577g = Arrays.copyOf(this.f1577g, this.d);
            }
            this.f1576f[i8] = gVar.f1598b;
            this.f1578h[i8] = f2;
            if (i5 != -1) {
                int[] iArr8 = this.f1577g;
                iArr8[i8] = iArr8[i5];
                iArr8[i5] = i8;
            } else {
                this.f1577g[i8] = this.f1579i;
                this.f1579i = i8;
            }
            gVar.f1603j++;
            gVar.a(this.f1575b);
            this.a++;
            if (!this.f1581k) {
                this.f1580j++;
            }
            int i12 = this.f1580j;
            int[] iArr9 = this.f1576f;
            if (i12 >= iArr9.length) {
                this.f1581k = true;
                this.f1580j = iArr9.length - 1;
            }
        }
    }

    public final float a(g gVar, boolean z) {
        if (this.e == gVar) {
            this.e = null;
        }
        int i2 = this.f1579i;
        if (i2 == -1) {
            return 0.0f;
        }
        int i3 = 0;
        int i4 = -1;
        while (i2 != -1 && i3 < this.a) {
            if (this.f1576f[i2] == gVar.f1598b) {
                if (i2 == this.f1579i) {
                    this.f1579i = this.f1577g[i2];
                } else {
                    int[] iArr = this.f1577g;
                    iArr[i4] = iArr[i2];
                }
                if (z) {
                    gVar.b(this.f1575b);
                }
                gVar.f1603j--;
                this.a--;
                this.f1576f[i2] = -1;
                if (this.f1581k) {
                    this.f1580j = i2;
                }
                return this.f1578h[i2];
            }
            i3++;
            i4 = i2;
            i2 = this.f1577g[i2];
        }
        return 0.0f;
    }

    public final void a() {
        int i2 = this.f1579i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            g gVar = this.c.c[this.f1576f[i2]];
            if (gVar != null) {
                gVar.b(this.f1575b);
            }
            i2 = this.f1577g[i2];
            i3++;
        }
        this.f1579i = -1;
        this.f1580j = -1;
        this.f1581k = false;
        this.a = 0;
    }

    public g a(boolean[] zArr, g gVar) {
        g.a aVar;
        int i2 = this.f1579i;
        int i3 = 0;
        g gVar2 = null;
        float f2 = 0.0f;
        while (i2 != -1 && i3 < this.a) {
            if (this.f1578h[i2] < 0.0f) {
                g gVar3 = this.c.c[this.f1576f[i2]];
                if ((zArr == null || !zArr[gVar3.f1598b]) && gVar3 != gVar && ((aVar = gVar3.f1600g) == g.a.SLACK || aVar == g.a.ERROR)) {
                    float f3 = this.f1578h[i2];
                    if (f3 < f2) {
                        gVar2 = gVar3;
                        f2 = f3;
                    }
                }
            }
            i2 = this.f1577g[i2];
            i3++;
        }
        return gVar2;
    }

    public final g a(int i2) {
        int i3 = this.f1579i;
        int i4 = 0;
        while (i3 != -1 && i4 < this.a) {
            if (i4 == i2) {
                return this.c.c[this.f1576f[i3]];
            }
            i3 = this.f1577g[i3];
            i4++;
        }
        return null;
    }

    public final float a(g gVar) {
        int i2 = this.f1579i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.a) {
            if (this.f1576f[i2] == gVar.f1598b) {
                return this.f1578h[i2];
            }
            i2 = this.f1577g[i2];
            i3++;
        }
        return 0.0f;
    }
}
