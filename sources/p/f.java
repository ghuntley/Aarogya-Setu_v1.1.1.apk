package p;

import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.answers.RetryManager;
import com.crashlytics.android.core.LogFileManager;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* compiled from: Buffer */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f5645g = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    @Nullable
    public w e;

    /* renamed from: f  reason: collision with root package name */
    public long f5646f;

    /* compiled from: Buffer */
    public class a extends InputStream {
        public a() {
        }

        public int available() {
            return (int) Math.min(f.this.f5646f, 2147483647L);
        }

        public void close() {
        }

        public int read() {
            f fVar = f.this;
            if (fVar.f5646f > 0) {
                return fVar.readByte() & 255;
            }
            return -1;
        }

        public String toString() {
            return f.this + ".inputStream()";
        }

        public int read(byte[] bArr, int i2, int i3) {
            return f.this.a(bArr, i2, i3);
        }
    }

    public f b() {
        return this;
    }

    public i b(long j2) {
        return new i(i(j2));
    }

    public String c(long j2) {
        if (j2 >= 0) {
            long j3 = RecyclerView.FOREVER_NS;
            if (j2 != RecyclerView.FOREVER_NS) {
                j3 = j2 + 1;
            }
            long a2 = a((byte) 10, 0, j3);
            if (a2 != -1) {
                return f(a2);
            }
            if (j3 < this.f5646f && e(j3 - 1) == 13 && e(j3) == 10) {
                return f(j3);
            }
            f fVar = new f();
            a(fVar, 0, Math.min(32, this.f5646f));
            StringBuilder a3 = i.a.a.a.a.a("\\n not found: limit=");
            a3.append(Math.min(this.f5646f, j2));
            a3.append(" content=");
            a3.append(fVar.q().g());
            a3.append(8230);
            throw new EOFException(a3.toString());
        }
        throw new IllegalArgumentException("limit < 0: " + j2);
    }

    public void close() {
    }

    public boolean d(long j2) {
        return this.f5646f >= j2;
    }

    public final byte e(long j2) {
        int i2;
        c0.a(this.f5646f, j2, 1);
        long j3 = this.f5646f;
        if (j3 - j2 > j2) {
            w wVar = this.e;
            while (true) {
                int i3 = wVar.c;
                int i4 = wVar.f5672b;
                long j4 = (long) (i3 - i4);
                if (j2 < j4) {
                    return wVar.a[i4 + ((int) j2)];
                }
                j2 -= j4;
                wVar = wVar.f5673f;
            }
        } else {
            long j5 = j2 - j3;
            w wVar2 = this.e;
            do {
                wVar2 = wVar2.f5674g;
                int i5 = wVar2.c;
                i2 = wVar2.f5672b;
                j5 += (long) (i5 - i2);
            } while (j5 < 0);
            return wVar2.a[i2 + ((int) j5)];
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        long j2 = this.f5646f;
        if (j2 != fVar.f5646f) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        w wVar = this.e;
        w wVar2 = fVar.e;
        int i2 = wVar.f5672b;
        int i3 = wVar2.f5672b;
        while (j3 < this.f5646f) {
            long min = (long) Math.min(wVar.c - i2, wVar2.c - i3);
            int i4 = 0;
            while (((long) i4) < min) {
                int i5 = i2 + 1;
                int i6 = i3 + 1;
                if (wVar.a[i2] != wVar2.a[i3]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i3 = i6;
            }
            if (i2 == wVar.c) {
                wVar = wVar.f5673f;
                i2 = wVar.f5672b;
            }
            if (i3 == wVar2.c) {
                wVar2 = wVar2.f5673f;
                i3 = wVar2.f5672b;
            }
            j3 += min;
        }
        return true;
    }

    public String f(long j2) {
        if (j2 > 0) {
            long j3 = j2 - 1;
            if (e(j3) == 13) {
                String a2 = a(j3, c0.a);
                skip(2);
                return a2;
            }
        }
        String a3 = a(j2, c0.a);
        skip(1);
        return a3;
    }

    public void flush() {
    }

    public g g() {
        return this;
    }

    public void g(long j2) {
        if (this.f5646f < j2) {
            throw new EOFException();
        }
    }

    public f getBuffer() {
        return this;
    }

    public int hashCode() {
        w wVar = this.e;
        if (wVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = wVar.c;
            for (int i4 = wVar.f5672b; i4 < i3; i4++) {
                i2 = (i2 * 31) + wVar.a[i4];
            }
            wVar = wVar.f5673f;
        } while (wVar != this.e);
        return i2;
    }

    public String i() {
        return c((long) RecyclerView.FOREVER_NS);
    }

    public boolean isOpen() {
        return true;
    }

    public final long j() {
        long j2 = this.f5646f;
        if (j2 == 0) {
            return 0;
        }
        w wVar = this.e.f5674g;
        int i2 = wVar.c;
        return (i2 >= 8192 || !wVar.e) ? j2 : j2 - ((long) (i2 - wVar.f5672b));
    }

    public int k() {
        return c0.a(readInt());
    }

    public boolean l() {
        return this.f5646f == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0086, code lost:
        if (r8 != r9) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        r15.e = r6.a();
        p.x.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0092, code lost:
        r6.f5672b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0094, code lost:
        if (r1 != false) goto L_0x009a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long n() {
        /*
            r15 = this;
            long r0 = r15.f5646f
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00a1
            r0 = 0
            r1 = 0
            r4 = r2
        L_0x000b:
            p.w r6 = r15.e
            byte[] r7 = r6.a
            int r8 = r6.f5672b
            int r9 = r6.c
        L_0x0013:
            if (r8 >= r9) goto L_0x0086
            byte r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L_0x0022
            r11 = 57
            if (r10 > r11) goto L_0x0022
            int r11 = r10 + -48
            goto L_0x0039
        L_0x0022:
            r11 = 97
            if (r10 < r11) goto L_0x002d
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L_0x002d
            int r11 = r10 + -97
            goto L_0x0037
        L_0x002d:
            r11 = 65
            if (r10 < r11) goto L_0x006b
            r11 = 70
            if (r10 > r11) goto L_0x006b
            int r11 = r10 + -65
        L_0x0037:
            int r11 = r11 + 10
        L_0x0039:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x0049
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L_0x0013
        L_0x0049:
            p.f r0 = new p.f
            r0.<init>()
            r0.a((long) r4)
            r0.writeByte((int) r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.String r2 = "Number too large: "
            java.lang.StringBuilder r2 = i.a.a.a.a.a(r2)
            java.lang.String r0 = r0.s()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x006b:
            if (r0 == 0) goto L_0x006f
            r1 = 1
            goto L_0x0086
        L_0x006f:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0086:
            if (r8 != r9) goto L_0x0092
            p.w r7 = r6.a()
            r15.e = r7
            p.x.a(r6)
            goto L_0x0094
        L_0x0092:
            r6.f5672b = r8
        L_0x0094:
            if (r1 != 0) goto L_0x009a
            p.w r6 = r15.e
            if (r6 != 0) goto L_0x000b
        L_0x009a:
            long r1 = r15.f5646f
            long r6 = (long) r0
            long r1 = r1 - r6
            r15.f5646f = r1
            return r4
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p.f.n():long");
    }

    public InputStream p() {
        return new a();
    }

    public i q() {
        try {
            return new i(i(this.f5646f));
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public int read(ByteBuffer byteBuffer) {
        w wVar = this.e;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), wVar.c - wVar.f5672b);
        byteBuffer.put(wVar.a, wVar.f5672b, min);
        int i2 = wVar.f5672b + min;
        wVar.f5672b = i2;
        this.f5646f -= (long) min;
        if (i2 == wVar.c) {
            this.e = wVar.a();
            x.a(wVar);
        }
        return min;
    }

    public byte readByte() {
        long j2 = this.f5646f;
        if (j2 != 0) {
            w wVar = this.e;
            int i2 = wVar.f5672b;
            int i3 = wVar.c;
            int i4 = i2 + 1;
            byte b2 = wVar.a[i2];
            this.f5646f = j2 - 1;
            if (i4 == i3) {
                this.e = wVar.a();
                x.a(wVar);
            } else {
                wVar.f5672b = i4;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public int readInt() {
        long j2 = this.f5646f;
        if (j2 >= 4) {
            w wVar = this.e;
            int i2 = wVar.f5672b;
            int i3 = wVar.c;
            if (i3 - i2 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = wVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b2 = ((bArr[i2] & 255) << 24) | ((bArr[i4] & 255) << 16);
            int i6 = i5 + 1;
            byte b3 = b2 | ((bArr[i5] & 255) << 8);
            int i7 = i6 + 1;
            byte b4 = b3 | (bArr[i6] & 255);
            this.f5646f = j2 - 4;
            if (i7 == i3) {
                this.e = wVar.a();
                x.a(wVar);
            } else {
                wVar.f5672b = i7;
            }
            return b4;
        }
        StringBuilder a2 = i.a.a.a.a.a("size < 4: ");
        a2.append(this.f5646f);
        throw new IllegalStateException(a2.toString());
    }

    public short readShort() {
        long j2 = this.f5646f;
        if (j2 >= 2) {
            w wVar = this.e;
            int i2 = wVar.f5672b;
            int i3 = wVar.c;
            if (i3 - i2 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = wVar.a;
            int i4 = i2 + 1;
            int i5 = i4 + 1;
            byte b2 = ((bArr[i2] & 255) << 8) | (bArr[i4] & 255);
            this.f5646f = j2 - 2;
            if (i5 == i3) {
                this.e = wVar.a();
                x.a(wVar);
            } else {
                wVar.f5672b = i5;
            }
            return (short) b2;
        }
        StringBuilder a2 = i.a.a.a.a.a("size < 2: ");
        a2.append(this.f5646f);
        throw new IllegalStateException(a2.toString());
    }

    public String s() {
        try {
            return a(this.f5646f, c0.a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public void skip(long j2) {
        while (j2 > 0) {
            w wVar = this.e;
            if (wVar != null) {
                int min = (int) Math.min(j2, (long) (wVar.c - wVar.f5672b));
                long j3 = (long) min;
                this.f5646f -= j3;
                j2 -= j3;
                w wVar2 = this.e;
                int i2 = wVar2.f5672b + min;
                wVar2.f5672b = i2;
                if (i2 == wVar2.c) {
                    this.e = wVar2.a();
                    x.a(wVar2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public int t() {
        byte b2;
        int i2;
        byte b3;
        if (this.f5646f != 0) {
            byte e2 = e(0);
            int i3 = 1;
            if ((e2 & 128) == 0) {
                b3 = e2 & Byte.MAX_VALUE;
                i2 = 1;
                b2 = 0;
            } else if ((e2 & 224) == 192) {
                b3 = e2 & 31;
                i2 = 2;
                b2 = 128;
            } else if ((e2 & 240) == 224) {
                b3 = e2 & 15;
                i2 = 3;
                b2 = 2048;
            } else if ((e2 & 248) == 240) {
                b3 = e2 & 7;
                i2 = 4;
                b2 = 65536;
            } else {
                skip(1);
                return 65533;
            }
            long j2 = (long) i2;
            if (this.f5646f >= j2) {
                while (i3 < i2) {
                    long j3 = (long) i3;
                    byte e3 = e(j3);
                    if ((e3 & 192) == 128) {
                        b3 = (b3 << 6) | (e3 & 63);
                        i3++;
                    } else {
                        skip(j3);
                        return 65533;
                    }
                }
                skip(j2);
                if (b3 > 1114111) {
                    return 65533;
                }
                if ((b3 < 55296 || b3 > 57343) && b3 >= b2) {
                    return b3;
                }
                return 65533;
            }
            throw new EOFException("size < " + i2 + ": " + this.f5646f + " (to read code point prefixed 0x" + Integer.toHexString(e2) + ")");
        }
        throw new EOFException();
    }

    public String toString() {
        i iVar;
        long j2 = this.f5646f;
        if (j2 <= 2147483647L) {
            int i2 = (int) j2;
            if (i2 == 0) {
                iVar = i.f5648i;
            } else {
                iVar = new y(this, i2);
            }
            return iVar.toString();
        }
        StringBuilder a2 = i.a.a.a.a.a("size > Integer.MAX_VALUE: ");
        a2.append(this.f5646f);
        throw new IllegalArgumentException(a2.toString());
    }

    public w b(int i2) {
        if (i2 < 1 || i2 > 8192) {
            throw new IllegalArgumentException();
        }
        w wVar = this.e;
        if (wVar == null) {
            w a2 = x.a();
            this.e = a2;
            a2.f5674g = a2;
            a2.f5673f = a2;
            return a2;
        }
        w wVar2 = wVar.f5674g;
        if (wVar2.c + i2 <= 8192 && wVar2.e) {
            return wVar2;
        }
        w a3 = x.a();
        wVar2.a(a3);
        return a3;
    }

    public f clone() {
        f fVar = new f();
        if (this.f5646f == 0) {
            return fVar;
        }
        w b2 = this.e.b();
        fVar.e = b2;
        b2.f5674g = b2;
        b2.f5673f = b2;
        w wVar = this.e;
        while (true) {
            wVar = wVar.f5673f;
            if (wVar != this.e) {
                fVar.e.f5674g.a(wVar.b());
            } else {
                fVar.f5646f = this.f5646f;
                return fVar;
            }
        }
    }

    public final void h() {
        try {
            skip(this.f5646f);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public byte[] i(long j2) {
        c0.a(this.f5646f, 0, j2);
        if (j2 <= 2147483647L) {
            byte[] bArr = new byte[((int) j2)];
            a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
    }

    public f writeByte(int i2) {
        w b2 = b(1);
        byte[] bArr = b2.a;
        int i3 = b2.c;
        b2.c = i3 + 1;
        bArr[i3] = (byte) i2;
        this.f5646f++;
        return this;
    }

    public f writeInt(int i2) {
        w b2 = b(4);
        byte[] bArr = b2.a;
        int i3 = b2.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 24) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i2 >>> 16) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((i2 >>> 8) & 255);
        bArr[i6] = (byte) (i2 & 255);
        b2.c = i6 + 1;
        this.f5646f += 4;
        return this;
    }

    public f writeShort(int i2) {
        w b2 = b(2);
        byte[] bArr = b2.a;
        int i3 = b2.c;
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i2 >>> 8) & 255);
        bArr[i4] = (byte) (i2 & 255);
        b2.c = i4 + 1;
        this.f5646f += 2;
        return this;
    }

    public f write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final f a(f fVar, long j2, long j3) {
        if (fVar != null) {
            c0.a(this.f5646f, j2, j3);
            if (j3 == 0) {
                return this;
            }
            fVar.f5646f += j3;
            w wVar = this.e;
            while (true) {
                int i2 = wVar.c;
                int i3 = wVar.f5672b;
                if (j2 < ((long) (i2 - i3))) {
                    break;
                }
                j2 -= (long) (i2 - i3);
                wVar = wVar.f5673f;
            }
            while (j3 > 0) {
                w b2 = wVar.b();
                int i4 = (int) (((long) b2.f5672b) + j2);
                b2.f5672b = i4;
                b2.c = Math.min(i4 + ((int) j3), b2.c);
                w wVar2 = fVar.e;
                if (wVar2 == null) {
                    b2.f5674g = b2;
                    b2.f5673f = b2;
                    fVar.e = b2;
                } else {
                    wVar2.f5674g.a(b2);
                }
                j3 -= (long) (b2.c - b2.f5672b);
                wVar = wVar.f5673f;
                j2 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public f h(long j2) {
        int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
        if (i2 == 0) {
            writeByte(48);
            return this;
        }
        boolean z = false;
        int i3 = 1;
        if (i2 < 0) {
            j2 = -j2;
            if (j2 < 0) {
                a("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j2 >= 100000000) {
            i3 = j2 < 1000000000000L ? j2 < 10000000000L ? j2 < 1000000000 ? 9 : 10 : j2 < 100000000000L ? 11 : 12 : j2 < 1000000000000000L ? j2 < 10000000000000L ? 13 : j2 < 100000000000000L ? 14 : 15 : j2 < 100000000000000000L ? j2 < 10000000000000000L ? 16 : 17 : j2 < 1000000000000000000L ? 18 : 19;
        } else if (j2 >= 10000) {
            i3 = j2 < RetryManager.NANOSECONDS_IN_MS ? j2 < 100000 ? 5 : 6 : j2 < 10000000 ? 7 : 8;
        } else if (j2 >= 100) {
            i3 = j2 < 1000 ? 3 : 4;
        } else if (j2 >= 10) {
            i3 = 2;
        }
        if (z) {
            i3++;
        }
        w b2 = b(i3);
        byte[] bArr = b2.a;
        int i4 = b2.c + i3;
        while (j2 != 0) {
            i4--;
            bArr[i4] = f5645g[(int) (j2 % 10)];
            j2 /= 10;
        }
        if (z) {
            bArr[i4 - 1] = 45;
        }
        b2.c += i3;
        this.f5646f += (long) i3;
        return this;
    }

    public f write(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            long j2 = (long) i3;
            c0.a((long) bArr.length, (long) i2, j2);
            int i4 = i3 + i2;
            while (i2 < i4) {
                w b2 = b(1);
                int min = Math.min(i4 - i2, 8192 - b2.c);
                System.arraycopy(bArr, i2, b2.a, b2.c, min);
                i2 += min;
                b2.c += min;
            }
            this.f5646f += j2;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long b(f fVar, long j2) {
        if (fVar == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j2 >= 0) {
            long j3 = this.f5646f;
            if (j3 == 0) {
                return -1;
            }
            if (j2 > j3) {
                j2 = j3;
            }
            fVar.a(this, j2);
            return j2;
        } else {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
    }

    public short e() {
        return c0.a(readShort());
    }

    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i2 = remaining;
            while (i2 > 0) {
                w b2 = b(1);
                int min = Math.min(i2, 8192 - b2.c);
                byteBuffer.get(b2.a, b2.c, min);
                i2 -= min;
                b2.c += min;
            }
            this.f5646f += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public f c(int i2) {
        if (i2 < 128) {
            writeByte(i2);
        } else if (i2 < 2048) {
            writeByte((i2 >> 6) | 192);
            writeByte((i2 & 63) | 128);
        } else if (i2 < 65536) {
            if (i2 < 55296 || i2 > 57343) {
                writeByte((i2 >> 12) | 224);
                writeByte(((i2 >> 6) & 63) | 128);
                writeByte((i2 & 63) | 128);
            } else {
                writeByte(63);
            }
        } else if (i2 <= 1114111) {
            writeByte((i2 >> 18) | 240);
            writeByte(((i2 >> 12) & 63) | 128);
            writeByte(((i2 >> 6) & 63) | 128);
            writeByte((i2 & 63) | 128);
        } else {
            StringBuilder a2 = i.a.a.a.a.a("Unexpected code point: ");
            a2.append(Integer.toHexString(i2));
            throw new IllegalArgumentException(a2.toString());
        }
        return this;
    }

    public int a(t tVar) {
        int a2 = a(tVar, false);
        if (a2 == -1) {
            return -1;
        }
        try {
            skip((long) tVar.e[a2].h());
            return a2;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public int a(t tVar, boolean z) {
        int i2;
        int i3;
        int i4;
        w wVar;
        int i5;
        t tVar2 = tVar;
        w wVar2 = this.e;
        int i6 = -2;
        if (wVar2 != null) {
            byte[] bArr = wVar2.a;
            int i7 = wVar2.f5672b;
            int i8 = wVar2.c;
            int[] iArr = tVar2.f5667f;
            w wVar3 = wVar2;
            int i9 = 0;
            int i10 = -1;
            loop0:
            while (true) {
                int i11 = i9 + 1;
                int i12 = iArr[i9];
                int i13 = i11 + 1;
                int i14 = iArr[i11];
                if (i14 != -1) {
                    i10 = i14;
                }
                if (wVar3 == null) {
                    break;
                }
                if (i12 < 0) {
                    int i15 = (i12 * -1) + i13;
                    while (true) {
                        int i16 = i7 + 1;
                        int i17 = i13 + 1;
                        if ((bArr[i7] & 255) != iArr[i13]) {
                            return i10;
                        }
                        boolean z2 = i17 == i15;
                        if (i16 == i8) {
                            w wVar4 = wVar3.f5673f;
                            i5 = wVar4.f5672b;
                            byte[] bArr2 = wVar4.a;
                            i4 = wVar4.c;
                            if (wVar4 != wVar2) {
                                byte[] bArr3 = bArr2;
                                wVar = wVar4;
                                bArr = bArr3;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                bArr = bArr2;
                                wVar = null;
                            }
                        } else {
                            w wVar5 = wVar3;
                            i4 = i8;
                            i5 = i16;
                            wVar = wVar5;
                        }
                        if (z2) {
                            i2 = iArr[i17];
                            i3 = i5;
                            i8 = i4;
                            wVar3 = wVar;
                            break;
                        }
                        i7 = i5;
                        i8 = i4;
                        i13 = i17;
                        wVar3 = wVar;
                    }
                } else {
                    int i18 = i7 + 1;
                    byte b2 = bArr[i7] & 255;
                    int i19 = i13 + i12;
                    while (i13 != i19) {
                        if (b2 == iArr[i13]) {
                            i2 = iArr[i13 + i12];
                            if (i18 == i8) {
                                wVar3 = wVar3.f5673f;
                                i3 = wVar3.f5672b;
                                bArr = wVar3.a;
                                i8 = wVar3.c;
                                if (wVar3 == wVar2) {
                                    wVar3 = null;
                                }
                            } else {
                                i3 = i18;
                            }
                        } else {
                            i13++;
                        }
                    }
                    return i10;
                }
                if (i2 >= 0) {
                    return i2;
                }
                i9 = -i2;
                i7 = i3;
                i6 = -2;
            }
            return z ? i6 : i10;
        } else if (z) {
            return -2;
        } else {
            return tVar2.indexOf(i.f5648i);
        }
    }

    public b0 c() {
        return b0.d;
    }

    public long a(z zVar) {
        long j2 = this.f5646f;
        if (j2 > 0) {
            zVar.a(this, j2);
        }
        return j2;
    }

    public String a(Charset charset) {
        try {
            return a(this.f5646f, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public String a(long j2, Charset charset) {
        c0.a(this.f5646f, 0, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        } else if (j2 == 0) {
            return "";
        } else {
            w wVar = this.e;
            if (((long) wVar.f5672b) + j2 > ((long) wVar.c)) {
                return new String(i(j2), charset);
            }
            String str = new String(wVar.a, wVar.f5672b, (int) j2, charset);
            int i2 = (int) (((long) wVar.f5672b) + j2);
            wVar.f5672b = i2;
            this.f5646f -= j2;
            if (i2 == wVar.c) {
                this.e = wVar.a();
                x.a(wVar);
            }
            return str;
        }
    }

    public void a(byte[] bArr) {
        int i2 = 0;
        while (i2 < bArr.length) {
            int a2 = a(bArr, i2, bArr.length - i2);
            if (a2 != -1) {
                i2 += a2;
            } else {
                throw new EOFException();
            }
        }
    }

    public int a(byte[] bArr, int i2, int i3) {
        c0.a((long) bArr.length, (long) i2, (long) i3);
        w wVar = this.e;
        if (wVar == null) {
            return -1;
        }
        int min = Math.min(i3, wVar.c - wVar.f5672b);
        System.arraycopy(wVar.a, wVar.f5672b, bArr, i2, min);
        int i4 = wVar.f5672b + min;
        wVar.f5672b = i4;
        this.f5646f -= (long) min;
        if (i4 == wVar.c) {
            this.e = wVar.a();
            x.a(wVar);
        }
        return min;
    }

    public f a(i iVar) {
        if (iVar != null) {
            iVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public f a(String str) {
        a(str, 0, str.length());
        return this;
    }

    public f a(String str, int i2, int i3) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i2 < 0) {
            throw new IllegalArgumentException(i.a.a.a.a.b("beginIndex < 0: ", i2));
        } else if (i3 < i2) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i3 + " < " + i2);
        } else if (i3 <= str.length()) {
            while (i2 < i3) {
                char charAt2 = str.charAt(i2);
                if (charAt2 < 128) {
                    w b2 = b(1);
                    byte[] bArr = b2.a;
                    int i4 = b2.c - i2;
                    int min = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) charAt2;
                    while (true) {
                        i2 = i5;
                        if (i2 >= min || (charAt = str.charAt(i2)) >= 128) {
                            int i6 = b2.c;
                            int i7 = (i4 + i2) - i6;
                            b2.c = i6 + i7;
                            this.f5646f += (long) i7;
                        } else {
                            i5 = i2 + 1;
                            bArr[i2 + i4] = (byte) charAt;
                        }
                    }
                    int i62 = b2.c;
                    int i72 = (i4 + i2) - i62;
                    b2.c = i62 + i72;
                    this.f5646f += (long) i72;
                } else {
                    if (charAt2 < 2048) {
                        writeByte((charAt2 >> 6) | 192);
                        writeByte((int) (charAt2 & '?') | 128);
                    } else if (charAt2 < 55296 || charAt2 > 57343) {
                        writeByte((charAt2 >> 12) | 224);
                        writeByte(((charAt2 >> 6) & 63) | 128);
                        writeByte((int) (charAt2 & '?') | 128);
                    } else {
                        int i8 = i2 + 1;
                        char charAt3 = i8 < i3 ? str.charAt(i8) : 0;
                        if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            writeByte(63);
                            i2 = i8;
                        } else {
                            int i9 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + LogFileManager.MAX_LOG_SIZE;
                            writeByte((i9 >> 18) | 240);
                            writeByte(((i9 >> 12) & 63) | 128);
                            writeByte(((i9 >> 6) & 63) | 128);
                            writeByte((i9 & 63) | 128);
                            i2 += 2;
                        }
                    }
                    i2++;
                }
            }
            return this;
        } else {
            throw new IllegalArgumentException("endIndex > string.length: " + i3 + " > " + str.length());
        }
    }

    public long a(a0 a0Var) {
        if (a0Var != null) {
            long j2 = 0;
            while (true) {
                long b2 = a0Var.b(this, 8192);
                if (b2 == -1) {
                    return j2;
                }
                j2 += b2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public g a(int i2) {
        writeInt(c0.a(i2));
        return this;
    }

    public f a(long j2) {
        if (j2 == 0) {
            writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j2)) / 4) + 1;
        w b2 = b(numberOfTrailingZeros);
        byte[] bArr = b2.a;
        int i2 = b2.c;
        for (int i3 = (i2 + numberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr[i3] = f5645g[(int) (15 & j2)];
            j2 >>>= 4;
        }
        b2.c += numberOfTrailingZeros;
        this.f5646f += (long) numberOfTrailingZeros;
        return this;
    }

    public void a(f fVar, long j2) {
        w wVar;
        int i2;
        if (fVar == null) {
            throw new IllegalArgumentException("source == null");
        } else if (fVar != this) {
            c0.a(fVar.f5646f, 0, j2);
            while (j2 > 0) {
                w wVar2 = fVar.e;
                int i3 = 0;
                if (j2 < ((long) (wVar2.c - wVar2.f5672b))) {
                    w wVar3 = this.e;
                    w wVar4 = wVar3 != null ? wVar3.f5674g : null;
                    if (wVar4 != null && wVar4.e) {
                        long j3 = ((long) wVar4.c) + j2;
                        if (wVar4.d) {
                            i2 = 0;
                        } else {
                            i2 = wVar4.f5672b;
                        }
                        if (j3 - ((long) i2) <= 8192) {
                            fVar.e.a(wVar4, (int) j2);
                            fVar.f5646f -= j2;
                            this.f5646f += j2;
                            return;
                        }
                    }
                    w wVar5 = fVar.e;
                    int i4 = (int) j2;
                    if (wVar5 == null) {
                        throw null;
                    } else if (i4 <= 0 || i4 > wVar5.c - wVar5.f5672b) {
                        throw new IllegalArgumentException();
                    } else {
                        if (i4 >= 1024) {
                            wVar = wVar5.b();
                        } else {
                            wVar = x.a();
                            System.arraycopy(wVar5.a, wVar5.f5672b, wVar.a, 0, i4);
                        }
                        wVar.c = wVar.f5672b + i4;
                        wVar5.f5672b += i4;
                        wVar5.f5674g.a(wVar);
                        fVar.e = wVar;
                    }
                }
                w wVar6 = fVar.e;
                long j4 = (long) (wVar6.c - wVar6.f5672b);
                fVar.e = wVar6.a();
                w wVar7 = this.e;
                if (wVar7 == null) {
                    this.e = wVar6;
                    wVar6.f5674g = wVar6;
                    wVar6.f5673f = wVar6;
                } else {
                    wVar7.f5674g.a(wVar6);
                    w wVar8 = wVar6.f5674g;
                    if (wVar8 == wVar6) {
                        throw new IllegalStateException();
                    } else if (wVar8.e) {
                        int i5 = wVar6.c - wVar6.f5672b;
                        int i6 = 8192 - wVar8.c;
                        if (!wVar8.d) {
                            i3 = wVar8.f5672b;
                        }
                        if (i5 <= i6 + i3) {
                            wVar6.a(wVar6.f5674g, i5);
                            wVar6.a();
                            x.a(wVar6);
                        }
                    }
                }
                fVar.f5646f -= j4;
                this.f5646f += j4;
                j2 -= j4;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public long a(byte b2) {
        return a(b2, 0, (long) RecyclerView.FOREVER_NS);
    }

    public long a(byte b2, long j2, long j3) {
        w wVar;
        long j4 = 0;
        if (j2 < 0 || j3 < j2) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.f5646f), Long.valueOf(j2), Long.valueOf(j3)}));
        }
        long j5 = this.f5646f;
        if (j3 <= j5) {
            j5 = j3;
        }
        if (j2 == j5 || (wVar = this.e) == null) {
            return -1;
        }
        long j6 = this.f5646f;
        if (j6 - j2 < j2) {
            while (j6 > j2) {
                wVar = wVar.f5674g;
                j6 -= (long) (wVar.c - wVar.f5672b);
            }
        } else {
            while (true) {
                long j7 = ((long) (wVar.c - wVar.f5672b)) + j4;
                if (j7 >= j2) {
                    break;
                }
                wVar = wVar.f5673f;
                j4 = j7;
            }
            j6 = j4;
        }
        long j8 = j2;
        while (j6 < j5) {
            byte[] bArr = wVar.a;
            int min = (int) Math.min((long) wVar.c, (((long) wVar.f5672b) + j5) - j6);
            for (int i2 = (int) ((((long) wVar.f5672b) + j8) - j6); i2 < min; i2++) {
                if (bArr[i2] == b2) {
                    return ((long) (i2 - wVar.f5672b)) + j6;
                }
            }
            byte b3 = b2;
            j6 += (long) (wVar.c - wVar.f5672b);
            wVar = wVar.f5673f;
            j8 = j6;
        }
        return -1;
    }
}
