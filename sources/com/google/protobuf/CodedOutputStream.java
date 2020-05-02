package com.google.protobuf;

import i.c.f.d;
import i.c.f.f;
import i.c.f.l;
import i.c.f.o;
import i.c.f.u;
import i.c.f.v;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class CodedOutputStream extends d {
    public static final Logger a = Logger.getLogger(CodedOutputStream.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f768b = u.c;
    public static final long c = u.d;

    public static class OutOfSpaceException extends IOException {
        public OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        public OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        public OutOfSpaceException(String str, Throwable th) {
            super(i.a.a.a.a.b("CodedOutputStream was writing to a flat byte array and ran out of space.: ", str), th);
        }
    }

    public CodedOutputStream() {
    }

    public static int a(long j2) {
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

    public static CodedOutputStream a(byte[] bArr) {
        return new b(bArr, 0, bArr.length);
    }

    public static int c(int i2, long j2) {
        return c(i2) + 8;
    }

    public static int d(int i2) {
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

    public static int d(int i2, long j2) {
        return c(i2) + a(j2);
    }

    public static int e(int i2, int i3) {
        return d(i3) + c(i2);
    }

    public abstract int a();

    public abstract void a(int i2);

    public abstract void a(int i2, int i3);

    public abstract void a(int i2, long j2);

    public abstract void a(int i2, f fVar);

    public abstract void a(int i2, o oVar);

    public abstract void a(int i2, String str);

    public abstract void a(int i2, boolean z);

    public abstract void b(int i2, int i3);

    public final void b(int i2, long j2) {
        b bVar = (b) this;
        bVar.a((i2 << 3) | 0);
        bVar.b(j2);
    }

    public abstract void c(int i2, int i3);

    public /* synthetic */ CodedOutputStream(a aVar) {
    }

    public static int c(int i2) {
        return d((i2 << 3) | 0);
    }

    public static int a(f fVar) {
        return b(fVar.size());
    }

    public static int d(int i2, int i3) {
        return c(i2) + (i3 >= 0 ? d(i3) : 10);
    }

    public static int b(int i2, String str) {
        int i3;
        int c2 = c(i2);
        try {
            i3 = v.a((CharSequence) str);
        } catch (v.c unused) {
            i3 = str.getBytes(l.a).length;
        }
        return c2 + b(i3);
    }

    public static int b(int i2, f fVar) {
        return c(i2) + b(fVar.size());
    }

    public static int b(int i2, o oVar) {
        return c(i2) + b(oVar.c());
    }

    public static class b extends CodedOutputStream {
        public final byte[] d;
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public int f769f;

        public b(byte[] bArr, int i2, int i3) {
            super((a) null);
            if (bArr != null) {
                int i4 = i2 + i3;
                if ((i2 | i3 | (bArr.length - i4)) >= 0) {
                    this.d = bArr;
                    this.f769f = i2;
                    this.e = i4;
                    return;
                }
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i2), Integer.valueOf(i3)}));
            }
            throw new NullPointerException("buffer");
        }

        public final void a(int i2) {
            if (!CodedOutputStream.f768b || a() < 10) {
                while ((i2 & -128) != 0) {
                    byte[] bArr = this.d;
                    int i3 = this.f769f;
                    this.f769f = i3 + 1;
                    bArr[i3] = (byte) ((i2 & 127) | 128);
                    i2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i4 = this.f769f;
                    this.f769f = i4 + 1;
                    bArr2[i4] = (byte) i2;
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f769f), Integer.valueOf(this.e), 1}), e2);
                }
            } else {
                long j2 = CodedOutputStream.c + ((long) this.f769f);
                while ((i2 & -128) != 0) {
                    u.a(this.d, j2, (byte) ((i2 & 127) | 128));
                    this.f769f++;
                    i2 >>>= 7;
                    j2 = 1 + j2;
                }
                u.a(this.d, j2, (byte) i2);
                this.f769f++;
            }
        }

        public final void b(long j2) {
            if (!CodedOutputStream.f768b || a() < 10) {
                while ((j2 & -128) != 0) {
                    byte[] bArr = this.d;
                    int i2 = this.f769f;
                    this.f769f = i2 + 1;
                    bArr[i2] = (byte) ((((int) j2) & 127) | 128);
                    j2 >>>= 7;
                }
                try {
                    byte[] bArr2 = this.d;
                    int i3 = this.f769f;
                    this.f769f = i3 + 1;
                    bArr2[i3] = (byte) ((int) j2);
                } catch (IndexOutOfBoundsException e2) {
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f769f), Integer.valueOf(this.e), 1}), e2);
                }
            } else {
                long j3 = CodedOutputStream.c + ((long) this.f769f);
                while ((j2 & -128) != 0) {
                    u.a(this.d, j3, (byte) ((((int) j2) & 127) | 128));
                    this.f769f++;
                    j2 >>>= 7;
                    j3 = 1 + j3;
                }
                u.a(this.d, j3, (byte) ((int) j2));
                this.f769f++;
            }
        }

        public final void c(int i2, int i3) {
            a((i2 << 3) | 0);
            a(i3);
        }

        public final void a(int i2, boolean z) {
            a((i2 << 3) | 0);
            byte b2 = z ? (byte) 1 : 0;
            try {
                byte[] bArr = this.d;
                int i3 = this.f769f;
                this.f769f = i3 + 1;
                bArr[i3] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f769f), Integer.valueOf(this.e), 1}), e2);
            }
        }

        public final void b(int i2, int i3) {
            a((i2 << 3) | i3);
        }

        public final void a(int i2, f fVar) {
            a((i2 << 3) | 2);
            a(fVar.size());
            f.g gVar = (f.g) fVar;
            a(gVar.f4937h, gVar.e(), gVar.size());
        }

        public final void a(int i2, long j2) {
            a((i2 << 3) | 1);
            try {
                byte[] bArr = this.d;
                int i3 = this.f769f;
                int i4 = i3 + 1;
                this.f769f = i4;
                bArr[i3] = (byte) (((int) j2) & 255);
                byte[] bArr2 = this.d;
                int i5 = i4 + 1;
                this.f769f = i5;
                bArr2[i4] = (byte) (((int) (j2 >> 8)) & 255);
                byte[] bArr3 = this.d;
                int i6 = i5 + 1;
                this.f769f = i6;
                bArr3[i5] = (byte) (((int) (j2 >> 16)) & 255);
                byte[] bArr4 = this.d;
                int i7 = i6 + 1;
                this.f769f = i7;
                bArr4[i6] = (byte) (((int) (j2 >> 24)) & 255);
                byte[] bArr5 = this.d;
                int i8 = i7 + 1;
                this.f769f = i8;
                bArr5[i7] = (byte) (((int) (j2 >> 32)) & 255);
                byte[] bArr6 = this.d;
                int i9 = i8 + 1;
                this.f769f = i9;
                bArr6[i8] = (byte) (((int) (j2 >> 40)) & 255);
                byte[] bArr7 = this.d;
                int i10 = i9 + 1;
                this.f769f = i10;
                bArr7[i9] = (byte) (((int) (j2 >> 48)) & 255);
                byte[] bArr8 = this.d;
                this.f769f = i10 + 1;
                bArr8[i10] = (byte) (((int) (j2 >> 56)) & 255);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f769f), Integer.valueOf(this.e), 1}), e2);
            }
        }

        public final void a(int i2, int i3) {
            a((i2 << 3) | 0);
            if (i3 >= 0) {
                a(i3);
            } else {
                b((long) i3);
            }
        }

        public final void a(int i2, o oVar) {
            a((i2 << 3) | 2);
            a(oVar.c());
            oVar.a(this);
        }

        public final void a(int i2, String str) {
            a((i2 << 3) | 2);
            int i3 = this.f769f;
            try {
                int d2 = CodedOutputStream.d(str.length() * 3);
                int d3 = CodedOutputStream.d(str.length());
                if (d3 == d2) {
                    int i4 = i3 + d3;
                    this.f769f = i4;
                    int a = v.a.a((CharSequence) str, this.d, i4, a());
                    this.f769f = i3;
                    a((a - i3) - d3);
                    this.f769f = a;
                    return;
                }
                a(v.a((CharSequence) str));
                this.f769f = v.a.a((CharSequence) str, this.d, this.f769f, a());
            } catch (v.c e2) {
                this.f769f = i3;
                CodedOutputStream.a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", e2);
                byte[] bytes = str.getBytes(l.a);
                try {
                    a(bytes.length);
                    a(bytes, 0, bytes.length);
                } catch (IndexOutOfBoundsException e3) {
                    throw new OutOfSpaceException(e3);
                } catch (OutOfSpaceException e4) {
                    throw e4;
                }
            } catch (IndexOutOfBoundsException e5) {
                throw new OutOfSpaceException(e5);
            }
        }

        public final void a(byte[] bArr, int i2, int i3) {
            try {
                System.arraycopy(bArr, i2, this.d, this.f769f, i3);
                this.f769f += i3;
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.f769f), Integer.valueOf(this.e), Integer.valueOf(i3)}), e2);
            }
        }

        public final int a() {
            return this.e - this.f769f;
        }
    }

    public static int b(int i2) {
        return d(i2) + i2;
    }
}
