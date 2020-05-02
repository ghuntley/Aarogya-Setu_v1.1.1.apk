package i.c.f;

import com.crashlytics.android.core.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.f.f;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CodedInputStream */
public final class g {
    public final byte[] a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f4938b;
    public int c;
    public int d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public final InputStream f4939f;

    /* renamed from: g  reason: collision with root package name */
    public int f4940g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4941h = false;

    /* renamed from: i  reason: collision with root package name */
    public int f4942i;

    /* renamed from: j  reason: collision with root package name */
    public int f4943j = Integer.MAX_VALUE;

    /* renamed from: k  reason: collision with root package name */
    public int f4944k;

    /* renamed from: l  reason: collision with root package name */
    public int f4945l = 100;

    /* renamed from: m  reason: collision with root package name */
    public int f4946m = 67108864;

    /* renamed from: n  reason: collision with root package name */
    public a f4947n = null;

    /* compiled from: CodedInputStream */
    public interface a {
        void a();
    }

    public g(byte[] bArr, int i2, int i3, boolean z) {
        this.a = bArr;
        this.c = i3 + i2;
        this.e = i2;
        this.f4942i = -i2;
        this.f4939f = null;
        this.f4938b = z;
    }

    public void a(int i2) {
        if (this.f4940g != i2) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public long b() {
        int i2 = this.e;
        if (this.c - i2 < 8) {
            d(8);
            i2 = this.e;
        }
        byte[] bArr = this.a;
        this.e = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public byte c() {
        if (this.e == this.c) {
            d(1);
        }
        byte[] bArr = this.a;
        int i2 = this.e;
        this.e = i2 + 1;
        return bArr[i2];
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0068, code lost:
        if (r2[r3] < 0) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d() {
        /*
            r5 = this;
            int r0 = r5.e
            int r1 = r5.c
            if (r1 != r0) goto L_0x0007
            goto L_0x006a
        L_0x0007:
            byte[] r2 = r5.a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r5.e = r3
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x0018
            goto L_0x006a
        L_0x0018:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0024
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0070
        L_0x0024:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0031
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002f:
            r1 = r3
            goto L_0x0070
        L_0x0031:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003f
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0070
        L_0x003f:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0070
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0070
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002f
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 >= 0) goto L_0x0070
        L_0x006a:
            long r0 = r5.f()
            int r1 = (int) r0
            return r1
        L_0x0070:
            r5.e = r1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.f.g.d():int");
    }

    public boolean e(int i2) {
        int i3;
        int i4 = i2 & 7;
        if (i4 == 0) {
            int i5 = this.c;
            int i6 = this.e;
            if (i5 - i6 >= 10) {
                byte[] bArr = this.a;
                int i7 = 0;
                while (true) {
                    if (i7 >= 10) {
                        break;
                    }
                    int i8 = i6 + 1;
                    if (bArr[i6] >= 0) {
                        this.e = i8;
                        break;
                    }
                    i7++;
                    i6 = i8;
                }
            }
            for (int i9 = 0; i9 < 10; i9++) {
                if (c() >= 0) {
                    return true;
                }
            }
            throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
        } else if (i4 == 1) {
            f(8);
            return true;
        } else if (i4 == 2) {
            f(d());
            return true;
        } else if (i4 == 3) {
            do {
                i3 = i();
                if (i3 == 0 || !e(i3)) {
                    a(((i2 >>> 3) << 3) | 4);
                }
                i3 = i();
                break;
            } while (!e(i3));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i4 == 4) {
            return false;
        } else {
            if (i4 == 5) {
                f(4);
                return true;
            }
            throw InvalidProtocolBufferException.a();
        }
    }

    public long f() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte c2 = c();
            j2 |= ((long) (c2 & Byte.MAX_VALUE)) << i2;
            if ((c2 & 128) == 0) {
                return j2;
            }
        }
        throw new InvalidProtocolBufferException("CodedInputStream encountered a malformed varint.");
    }

    public String g() {
        int d2 = d();
        if (d2 <= this.c - this.e && d2 > 0) {
            String str = new String(this.a, this.e, d2, l.a);
            this.e += d2;
            return str;
        } else if (d2 == 0) {
            return "";
        } else {
            if (d2 > this.c) {
                return new String(c(d2), l.a);
            }
            d(d2);
            String str2 = new String(this.a, this.e, d2, l.a);
            this.e += d2;
            return str2;
        }
    }

    public String h() {
        byte[] bArr;
        int d2 = d();
        int i2 = this.e;
        boolean z = false;
        if (d2 <= this.c - i2 && d2 > 0) {
            bArr = this.a;
            this.e = i2 + d2;
        } else if (d2 == 0) {
            return "";
        } else {
            if (d2 <= this.c) {
                d(d2);
                bArr = this.a;
                this.e = d2 + 0;
            } else {
                bArr = c(d2);
            }
            i2 = 0;
        }
        if (v.a.a(0, bArr, i2, i2 + d2) == 0) {
            z = true;
        }
        if (z) {
            return new String(bArr, i2, d2, l.a);
        }
        throw new InvalidProtocolBufferException("Protocol message had invalid UTF-8.");
    }

    public int i() {
        boolean z = true;
        if (this.e != this.c || g(1)) {
            z = false;
        }
        if (z) {
            this.f4940g = 0;
            return 0;
        }
        int d2 = d();
        this.f4940g = d2;
        if ((d2 >>> 3) != 0) {
            return d2;
        }
        throw new InvalidProtocolBufferException("Protocol message contained an invalid tag (zero).");
    }

    public final void j() {
        int i2 = this.c + this.d;
        this.c = i2;
        int i3 = this.f4942i + i2;
        int i4 = this.f4943j;
        if (i3 > i4) {
            int i5 = i3 - i4;
            this.d = i5;
            this.c = i2 - i5;
            return;
        }
        this.d = 0;
    }

    public <T extends o> T a(q<T> qVar, i iVar) {
        int d2 = d();
        if (this.f4944k < this.f4945l) {
            int b2 = b(d2);
            this.f4944k++;
            T t = (o) qVar.a(this, iVar);
            a(0);
            this.f4944k--;
            this.f4943j = b2;
            j();
            return t;
        }
        throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    public final byte[] c(int i2) {
        if (i2 > 0) {
            int i3 = this.f4942i;
            int i4 = this.e;
            int i5 = i3 + i4 + i2;
            if (i5 <= this.f4946m) {
                int i6 = this.f4943j;
                if (i5 <= i6) {
                    InputStream inputStream = this.f4939f;
                    if (inputStream != null) {
                        int i7 = this.c;
                        int i8 = i7 - i4;
                        this.f4942i = i3 + i7;
                        this.e = 0;
                        this.c = 0;
                        int i9 = i2 - i8;
                        if (i9 < 4096 || i9 <= inputStream.available()) {
                            byte[] bArr = new byte[i2];
                            System.arraycopy(this.a, i4, bArr, 0, i8);
                            while (i8 < i2) {
                                int read = this.f4939f.read(bArr, i8, i2 - i8);
                                if (read != -1) {
                                    this.f4942i += read;
                                    i8 += read;
                                } else {
                                    throw InvalidProtocolBufferException.c();
                                }
                            }
                            return bArr;
                        }
                        ArrayList arrayList = new ArrayList();
                        while (i9 > 0) {
                            int min = Math.min(i9, CodedOutputStream.DEFAULT_BUFFER_SIZE);
                            byte[] bArr2 = new byte[min];
                            int i10 = 0;
                            while (i10 < min) {
                                int read2 = this.f4939f.read(bArr2, i10, min - i10);
                                if (read2 != -1) {
                                    this.f4942i += read2;
                                    i10 += read2;
                                } else {
                                    throw InvalidProtocolBufferException.c();
                                }
                            }
                            i9 -= min;
                            arrayList.add(bArr2);
                        }
                        byte[] bArr3 = new byte[i2];
                        System.arraycopy(this.a, i4, bArr3, 0, i8);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            byte[] bArr4 = (byte[]) it.next();
                            System.arraycopy(bArr4, 0, bArr3, i8, bArr4.length);
                            i8 += bArr4.length;
                        }
                        return bArr3;
                    }
                    throw InvalidProtocolBufferException.c();
                }
                f((i6 - i3) - i4);
                throw InvalidProtocolBufferException.c();
            }
            throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        } else if (i2 == 0) {
            return l.f4963b;
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public void f(int i2) {
        int i3 = this.c;
        int i4 = this.e;
        if (i2 <= i3 - i4 && i2 >= 0) {
            this.e = i4 + i2;
        } else if (i2 >= 0) {
            int i5 = this.f4942i;
            int i6 = this.e;
            int i7 = i5 + i6 + i2;
            int i8 = this.f4943j;
            if (i7 <= i8) {
                int i9 = this.c;
                int i10 = i9 - i6;
                this.e = i9;
                d(1);
                while (true) {
                    int i11 = i2 - i10;
                    int i12 = this.c;
                    if (i11 > i12) {
                        i10 += i12;
                        this.e = i12;
                        d(1);
                    } else {
                        this.e = i11;
                        return;
                    }
                }
            } else {
                f((i8 - i5) - i6);
                throw InvalidProtocolBufferException.c();
            }
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    public int b(int i2) {
        if (i2 >= 0) {
            int i3 = this.f4942i + this.e + i2;
            int i4 = this.f4943j;
            if (i3 <= i4) {
                this.f4943j = i3;
                j();
                return i4;
            }
            throw InvalidProtocolBufferException.c();
        }
        throw InvalidProtocolBufferException.b();
    }

    public final boolean g(int i2) {
        int i3 = this.e;
        if (i3 + i2 <= this.c) {
            throw new IllegalStateException("refillBuffer() called when " + i2 + " bytes were already available in buffer");
        } else if (this.f4942i + i3 + i2 > this.f4943j) {
            return false;
        } else {
            a aVar = this.f4947n;
            if (aVar != null) {
                aVar.a();
            }
            if (this.f4939f != null) {
                int i4 = this.e;
                if (i4 > 0) {
                    int i5 = this.c;
                    if (i5 > i4) {
                        byte[] bArr = this.a;
                        System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                    }
                    this.f4942i += i4;
                    this.c -= i4;
                    this.e = 0;
                }
                InputStream inputStream = this.f4939f;
                byte[] bArr2 = this.a;
                int i6 = this.c;
                int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                if (read == 0 || read < -1 || read > this.a.length) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read > 0) {
                    this.c += read;
                    if ((this.f4942i + i2) - this.f4946m <= 0) {
                        j();
                        if (this.c >= i2) {
                            return true;
                        }
                        return g(i2);
                    }
                    throw new InvalidProtocolBufferException("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
                }
            }
            return false;
        }
    }

    public g(InputStream inputStream, int i2) {
        this.a = new byte[i2];
        this.e = 0;
        this.f4942i = 0;
        this.f4939f = inputStream;
        this.f4938b = false;
    }

    public final void d(int i2) {
        if (!g(i2)) {
            throw InvalidProtocolBufferException.c();
        }
    }

    public f a() {
        f fVar;
        int d2 = d();
        int i2 = this.c;
        int i3 = this.e;
        if (d2 <= i2 - i3 && d2 > 0) {
            if (!this.f4938b || !this.f4941h) {
                fVar = new f.g(f.f4933g.a(this.a, this.e, d2));
            } else {
                fVar = f.a(this.a, i3, d2);
            }
            this.e += d2;
            return fVar;
        } else if (d2 == 0) {
            return f.f4932f;
        } else {
            return f.b(c(d2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b4, code lost:
        if (((long) r2[r0]) < 0) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long e() {
        /*
            r11 = this;
            int r0 = r11.e
            int r1 = r11.c
            if (r1 != r0) goto L_0x0008
            goto L_0x00b6
        L_0x0008:
            byte[] r2 = r11.a
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0014
            r11.e = r3
            long r0 = (long) r0
            return r0
        L_0x0014:
            int r1 = r1 - r3
            r4 = 9
            if (r1 >= r4) goto L_0x001b
            goto L_0x00b6
        L_0x001b:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0029
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0026:
            long r2 = (long) r0
            goto L_0x00bd
        L_0x0029:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x003a
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r2 = r9
            goto L_0x00bd
        L_0x003a:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0048
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0026
        L_0x0048:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005f
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x005b:
            long r2 = r3 ^ r1
            r1 = r0
            goto L_0x00bd
        L_0x005f:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x0071:
            long r2 = r3 ^ r5
            goto L_0x00bd
        L_0x0074:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0087
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x005b
        L_0x0087:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x009a
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x0071
        L_0x009a:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x00bb
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bc
        L_0x00b6:
            long r0 = r11.f()
            return r0
        L_0x00bb:
            r1 = r0
        L_0x00bc:
            r2 = r3
        L_0x00bd:
            r11.e = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.f.g.e():long");
    }
}
