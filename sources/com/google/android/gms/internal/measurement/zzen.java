package com.google.android.gms.internal.measurement;

import i.c.a.b.g.g.c3;
import i.c.a.b.g.g.f3;
import i.c.a.b.g.g.f5;
import i.c.a.b.g.g.h3;
import i.c.a.b.g.g.j4;
import i.c.a.b.g.g.l6;
import i.c.a.b.g.g.m2;
import i.c.a.b.g.g.o6;
import i.c.a.b.g.g.q6;
import i.c.a.b.g.g.r2;
import i.c.a.b.g.g.t5;
import i.c.a.b.g.g.u2;
import i.c.a.b.g.g.v2;
import i.c.a.b.g.g.w3;
import i.c.a.b.g.g.y3;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public abstract class zzen extends v2 {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f507b = Logger.getLogger(zzen.class.getName());
    public static final boolean c = l6.f3349h;
    public h3 a;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static class zza extends IOException {
        public zza() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public zza(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public zza(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L_0x0011
                java.lang.String r3 = r1.concat(r3)
                goto L_0x0016
            L_0x0011:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L_0x0016:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzen.zza.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public zzen() {
    }

    public static zzen a(byte[] bArr) {
        return new a(bArr, bArr.length);
    }

    public static int b() {
        return 4;
    }

    public static int b(int i2, int i3) {
        return g(i3) + f(i2);
    }

    public static int c() {
        return 8;
    }

    public static int c(int i2, int i3) {
        return h(i3) + f(i2);
    }

    public static int c(long j2) {
        int i2;
        if ((-128 & j2) == 0) {
            return 1;
        }
        if (j2 < 0) {
            return 10;
        }
        if ((-34359738368L & j2) != 0) {
            i2 = 6;
            j2 >>>= 28;
        } else {
            i2 = 2;
        }
        if ((-2097152 & j2) != 0) {
            i2 += 2;
            j2 >>>= 14;
        }
        return (j2 & -16384) != 0 ? i2 + 1 : i2;
    }

    public static int d() {
        return 1;
    }

    public static int d(int i2, int i3) {
        return h(n(i3)) + f(i2);
    }

    public static int e() {
        return 8;
    }

    public static int e(int i2) {
        return f(i2) + 1;
    }

    public static long e(long j2) {
        return (j2 >> 63) ^ (j2 << 1);
    }

    public static int f() {
        return 8;
    }

    public static int f(int i2) {
        return h(i2 << 3);
    }

    public static int g() {
        return 4;
    }

    public static int g(int i2) {
        if (i2 >= 0) {
            return h(i2);
        }
        return 10;
    }

    public static int h() {
        return 4;
    }

    public static int h(int i2) {
        if ((i2 & -128) == 0) {
            return 1;
        }
        if ((i2 & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i2) == 0) {
            return 3;
        }
        return (i2 & -268435456) == 0 ? 4 : 5;
    }

    public static int i(int i2) {
        return f(i2) + 8;
    }

    public static int j(int i2) {
        return h(n(i2));
    }

    public static int k(int i2) {
        return f(i2) + 8;
    }

    public static int l(int i2) {
        return f(i2) + 4;
    }

    public static int m(int i2) {
        return f(i2) + 4;
    }

    public static int n(int i2) {
        return (i2 >> 31) ^ (i2 << 1);
    }

    public abstract int a();

    public abstract void a(byte b2);

    public abstract void a(int i2);

    public abstract void a(int i2, int i3);

    public abstract void a(long j2);

    /* renamed from: b  reason: collision with other method in class */
    public abstract void m3b(int i2);

    public abstract void b(long j2);

    public abstract void c(int i2);

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static class a extends zzen {
        public final byte[] d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public int f508f;

        public a(byte[] bArr, int i2) {
            super((f3) null);
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) >= 0) {
                    this.d = bArr;
                    this.f508f = 0;
                    this.e = i3;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void a(int i2, int i3) {
            b((i2 << 3) | 0);
            if (i3 >= 0) {
                b(i3);
            } else {
                a((long) i3);
            }
        }

        public final void b(int i2, u2 u2Var) {
            b((i2 << 3) | 2);
            b(u2Var);
        }

        public final void c(f5 f5Var) {
            b(f5Var.e());
            f5Var.a(this);
        }

        public final void f(int i2, int i3) {
            b((i2 << 3) | i3);
        }

        public final void g(int i2, int i3) {
            b((i2 << 3) | 0);
            b(i3);
        }

        public final void b(u2 u2Var) {
            b(u2Var.a());
            c3 c3Var = (c3) u2Var;
            a(c3Var.f3237h, c3Var.c(), c3Var.a());
        }

        public final void c(int i2) {
            try {
                byte[] bArr = this.d;
                int i3 = this.f508f;
                int i4 = i3 + 1;
                this.f508f = i4;
                bArr[i3] = (byte) i2;
                byte[] bArr2 = this.d;
                int i5 = i4 + 1;
                this.f508f = i5;
                bArr2[i4] = (byte) (i2 >> 8);
                byte[] bArr3 = this.d;
                int i6 = i5 + 1;
                this.f508f = i6;
                bArr3[i5] = (byte) (i2 >> 16);
                byte[] bArr4 = this.d;
                this.f508f = i6 + 1;
                bArr4[i6] = (byte) (i2 >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f508f), Integer.valueOf(this.e), 1}), e2);
            }
        }

        public final void a(byte b2) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f508f;
                this.f508f = i2 + 1;
                bArr[i2] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f508f), Integer.valueOf(this.e), 1}), e2);
            }
        }

        public final void a(int i2) {
            if (i2 >= 0) {
                b(i2);
            } else {
                a((long) i2);
            }
        }

        public final void b(long j2) {
            try {
                byte[] bArr = this.d;
                int i2 = this.f508f;
                int i3 = i2 + 1;
                this.f508f = i3;
                bArr[i2] = (byte) ((int) j2);
                byte[] bArr2 = this.d;
                int i4 = i3 + 1;
                this.f508f = i4;
                bArr2[i3] = (byte) ((int) (j2 >> 8));
                byte[] bArr3 = this.d;
                int i5 = i4 + 1;
                this.f508f = i5;
                bArr3[i4] = (byte) ((int) (j2 >> 16));
                byte[] bArr4 = this.d;
                int i6 = i5 + 1;
                this.f508f = i6;
                bArr4[i5] = (byte) ((int) (j2 >> 24));
                byte[] bArr5 = this.d;
                int i7 = i6 + 1;
                this.f508f = i7;
                bArr5[i6] = (byte) ((int) (j2 >> 32));
                byte[] bArr6 = this.d;
                int i8 = i7 + 1;
                this.f508f = i8;
                bArr6[i7] = (byte) ((int) (j2 >> 40));
                byte[] bArr7 = this.d;
                int i9 = i8 + 1;
                this.f508f = i9;
                bArr7[i8] = (byte) ((int) (j2 >> 48));
                byte[] bArr8 = this.d;
                this.f508f = i9 + 1;
                bArr8[i9] = (byte) ((int) (j2 >> 56));
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f508f), Integer.valueOf(this.e), 1}), e2);
            }
        }

        public final void a(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.d, this.f508f, i3);
                this.f508f += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f508f), Integer.valueOf(this.e), Integer.valueOf(i3)}), e2);
            }
        }

        public final void a(long j2) {
            if (!zzen.c || a() < 10) {
                while ((j2 & -128) != 0) {
                    byte[] bArr = this.d;
                    int i2 = this.f508f;
                    this.f508f = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i3 = this.f508f;
                    this.f508f = i3 + 1;
                    bArr2[i3] = (byte) ((int) j2);
                } catch (IndexOutOfBoundsException e2) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f508f), Integer.valueOf(this.e), 1}), e2);
                }
            } else {
                while ((j2 & -128) != 0) {
                    byte[] bArr3 = this.d;
                    int i4 = this.f508f;
                    this.f508f = i4 + 1;
                    l6.a(bArr3, (long) i4, (byte) ((((int) j2) & 127) | 128));
                    j2 >>>= 7;
                }
                byte[] bArr4 = this.d;
                int i5 = this.f508f;
                this.f508f = i5 + 1;
                l6.a(bArr4, (long) i5, (byte) ((int) j2));
            }
        }

        public final void b(String str) {
            int i2 = this.f508f;
            try {
                int h2 = zzen.h(str.length() * 3);
                int h3 = zzen.h(str.length());
                if (h3 == h2) {
                    int i3 = i2 + h3;
                    this.f508f = i3;
                    int a = o6.a.a((CharSequence) str, this.d, i3, a());
                    this.f508f = i2;
                    b((a - i2) - h3);
                    this.f508f = a;
                    return;
                }
                b(o6.a((CharSequence) str));
                this.f508f = o6.a.a((CharSequence) str, this.d, this.f508f, a());
            } catch (q6 e2) {
                this.f508f = i2;
                zzen.f507b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e2);
                byte[] bytes = str.getBytes(y3.a);
                try {
                    b(bytes.length);
                    a(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e3) {
                    throw new zza(e3);
                } catch (zza e4) {
                    throw e4;
                }
            } catch (IndexOutOfBoundsException e5) {
                throw new zza(e5);
            }
        }

        public final int a() {
            return this.e - this.f508f;
        }

        public final void b(int i2) {
            if (!zzen.c || r2.a() || a() < 5) {
                while ((i2 & -128) != 0) {
                    byte[] bArr = this.d;
                    int i3 = this.f508f;
                    this.f508f = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i4 = this.f508f;
                    this.f508f = i4 + 1;
                    bArr2[i4] = (byte) i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new zza(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f508f), Integer.valueOf(this.e), 1}), e2);
                }
            } else if ((i2 & -128) == 0) {
                byte[] bArr3 = this.d;
                int i5 = this.f508f;
                this.f508f = i5 + 1;
                l6.a(bArr3, (long) i5, (byte) i2);
            } else {
                byte[] bArr4 = this.d;
                int i6 = this.f508f;
                this.f508f = i6 + 1;
                l6.a(bArr4, (long) i6, (byte) (i2 | 128));
                int i7 = i2 >>> 7;
                if ((i7 & -128) == 0) {
                    byte[] bArr5 = this.d;
                    int i8 = this.f508f;
                    this.f508f = i8 + 1;
                    l6.a(bArr5, (long) i8, (byte) i7);
                    return;
                }
                byte[] bArr6 = this.d;
                int i9 = this.f508f;
                this.f508f = i9 + 1;
                l6.a(bArr6, (long) i9, (byte) (i7 | 128));
                int i10 = i7 >>> 7;
                if ((i10 & -128) == 0) {
                    byte[] bArr7 = this.d;
                    int i11 = this.f508f;
                    this.f508f = i11 + 1;
                    l6.a(bArr7, (long) i11, (byte) i10);
                    return;
                }
                byte[] bArr8 = this.d;
                int i12 = this.f508f;
                this.f508f = i12 + 1;
                l6.a(bArr8, (long) i12, (byte) (i10 | 128));
                int i13 = i10 >>> 7;
                if ((i13 & -128) == 0) {
                    byte[] bArr9 = this.d;
                    int i14 = this.f508f;
                    this.f508f = i14 + 1;
                    l6.a(bArr9, (long) i14, (byte) i13);
                    return;
                }
                byte[] bArr10 = this.d;
                int i15 = this.f508f;
                this.f508f = i15 + 1;
                l6.a(bArr10, (long) i15, (byte) (i13 | 128));
                byte[] bArr11 = this.d;
                int i16 = this.f508f;
                this.f508f = i16 + 1;
                l6.a(bArr11, (long) i16, (byte) (i13 >>> 7));
            }
        }
    }

    public /* synthetic */ zzen(f3 f3Var) {
    }

    public static int b(int i2, long j2) {
        return c(j2) + f(i2);
    }

    public static int c(int i2, long j2) {
        return c(e(j2)) + f(i2);
    }

    public static int e(int i2, int i3) {
        return g(i3) + f(i2);
    }

    public static int a(int i2, long j2) {
        return c(j2) + f(i2);
    }

    public static int b(int i2) {
        return f(i2) + 4;
    }

    public static int d(int i2) {
        return f(i2) + 8;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return h(length) + length;
    }

    public static int d(long j2) {
        return c(e(j2));
    }

    public static int a(int i2, String str) {
        return a(str) + f(i2);
    }

    public static int a(int i2, u2 u2Var) {
        int f2 = f(i2);
        int a2 = u2Var.a();
        return h(a2) + a2 + f2;
    }

    @Deprecated
    public static int b(f5 f5Var) {
        return f5Var.e();
    }

    public static int a(String str) {
        int i2;
        try {
            i2 = o6.a((CharSequence) str);
        } catch (q6 unused) {
            i2 = str.getBytes(y3.a).length;
        }
        return h(i2) + i2;
    }

    public static int a(j4 j4Var) {
        int a2 = j4Var.a();
        return h(a2) + a2;
    }

    public static int a(u2 u2Var) {
        int a2 = u2Var.a();
        return h(a2) + a2;
    }

    public static int a(f5 f5Var) {
        int e = f5Var.e();
        return h(e) + e;
    }

    public static int a(f5 f5Var, t5 t5Var) {
        m2 m2Var = (m2) f5Var;
        int i2 = ((w3) m2Var).zzc;
        if (i2 == -1) {
            i2 = t5Var.c(m2Var);
            ((w3) m2Var).zzc = i2;
        }
        return h(i2) + i2;
    }

    @Deprecated
    public static int a(int i2, f5 f5Var, t5 t5Var) {
        int f2 = f(i2) << 1;
        m2 m2Var = (m2) f5Var;
        int i3 = ((w3) m2Var).zzc;
        if (i3 == -1) {
            i3 = t5Var.c(m2Var);
            ((w3) m2Var).zzc = i3;
        }
        return f2 + i3;
    }
}
