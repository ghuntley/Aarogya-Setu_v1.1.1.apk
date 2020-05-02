package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzen;
import com.google.android.gms.internal.measurement.zzfo;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class i6 {

    /* renamed from: f  reason: collision with root package name */
    public static final i6 f3317f = new i6(0, new int[0], new Object[0], false);
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f3318b;
    public Object[] c;
    public int d;
    public boolean e;

    public i6() {
        this(0, new int[8], new Object[8], true);
    }

    public static i6 b() {
        return new i6(0, new int[8], new Object[8], true);
    }

    public final void a(b7 b7Var) {
        if (this.a != 0) {
            if (((h3) b7Var) != null) {
                for (int i2 = 0; i2 < this.a; i2++) {
                    a(this.f3318b[i2], this.c[i2], b7Var);
                }
                return;
            }
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i6)) {
            return false;
        }
        i6 i6Var = (i6) obj;
        int i2 = this.a;
        if (i2 == i6Var.a) {
            int[] iArr = this.f3318b;
            int[] iArr2 = i6Var.f3318b;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    z = true;
                    break;
                } else if (iArr[i3] != iArr2[i3]) {
                    z = false;
                    break;
                } else {
                    i3++;
                }
            }
            if (z) {
                Object[] objArr = this.c;
                Object[] objArr2 = i6Var.c;
                int i4 = this.a;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        z2 = true;
                        break;
                    } else if (!objArr[i5].equals(objArr2[i5])) {
                        z2 = false;
                        break;
                    } else {
                        i5++;
                    }
                }
                return z2;
            }
        }
    }

    public final int hashCode() {
        int i2 = this.a;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f3318b;
        int i4 = 17;
        int i5 = 17;
        for (int i6 = 0; i6 < i2; i6++) {
            i5 = (i5 * 31) + iArr[i6];
        }
        int i7 = (i3 + i5) * 31;
        Object[] objArr = this.c;
        int i8 = this.a;
        for (int i9 = 0; i9 < i8; i9++) {
            i4 = (i4 * 31) + objArr[i9].hashCode();
        }
        return i7 + i4;
    }

    public i6(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i2;
        this.f3318b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static void a(int i2, Object obj, b7 b7Var) {
        int i3 = i2 >>> 3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            ((h3) b7Var).a(i3, ((Long) obj).longValue());
        } else if (i4 == 1) {
            ((h3) b7Var).d(i3, ((Long) obj).longValue());
        } else if (i4 == 2) {
            ((h3) b7Var).a(i3, (u2) obj);
        } else if (i4 == 3) {
            h3 h3Var = (h3) b7Var;
            if (h3Var != null) {
                int i5 = i3 << 3;
                ((zzen.a) h3Var.a).b(i5 | 3);
                ((i6) obj).a(b7Var);
                ((zzen.a) h3Var.a).b(i5 | 4);
                return;
            }
            throw null;
        } else if (i4 == 5) {
            ((h3) b7Var).b(i3, ((Integer) obj).intValue());
        } else {
            throw new RuntimeException(zzfo.d());
        }
    }

    public final int a() {
        int i2;
        int i3 = this.d;
        if (i3 != -1) {
            return i3;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            int i6 = this.f3318b[i5];
            int i7 = i6 >>> 3;
            int i8 = i6 & 7;
            if (i8 == 0) {
                i2 = zzen.b(i7, ((Long) this.c[i5]).longValue());
            } else if (i8 == 1) {
                ((Long) this.c[i5]).longValue();
                i2 = zzen.i(i7);
            } else if (i8 == 2) {
                i2 = zzen.a(i7, (u2) this.c[i5]);
            } else if (i8 == 3) {
                i4 = ((i6) this.c[i5]).a() + (zzen.f(i7) << 1) + i4;
            } else if (i8 == 5) {
                ((Integer) this.c[i5]).intValue();
                i2 = zzen.l(i7);
            } else {
                throw new IllegalStateException(zzfo.d());
            }
            i4 = i2 + i4;
        }
        this.d = i4;
        return i4;
    }

    public final void a(int i2, Object obj) {
        if (this.e) {
            int i3 = this.a;
            if (i3 == this.f3318b.length) {
                int i4 = this.a + (i3 < 4 ? 8 : i3 >> 1);
                this.f3318b = Arrays.copyOf(this.f3318b, i4);
                this.c = Arrays.copyOf(this.c, i4);
            }
            int[] iArr = this.f3318b;
            int i5 = this.a;
            iArr[i5] = i2;
            this.c[i5] = obj;
            this.a = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }
}
