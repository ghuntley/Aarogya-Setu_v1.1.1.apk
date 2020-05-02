package p;

import i.a.a.a.a;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* compiled from: ByteString */
public class i implements Serializable, Comparable<i> {

    /* renamed from: h  reason: collision with root package name */
    public static final char[] f5647h = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: i  reason: collision with root package name */
    public static final i f5648i = a(new byte[0]);
    public final byte[] e;

    /* renamed from: f  reason: collision with root package name */
    public transient int f5649f;

    /* renamed from: g  reason: collision with root package name */
    public transient String f5650g;

    public i(byte[] bArr) {
        this.e = bArr;
    }

    public static i a(byte... bArr) {
        if (bArr != null) {
            return new i((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00a3, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        r5 = r0 - 1;
     */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p.i b(java.lang.String r15) {
        /*
            if (r15 == 0) goto L_0x00d7
            int r0 = r15.length()
        L_0x0006:
            r1 = 9
            r2 = 32
            r3 = 13
            r4 = 10
            if (r0 <= 0) goto L_0x0025
            int r5 = r0 + -1
            char r6 = r15.charAt(r5)
            r7 = 61
            if (r6 == r7) goto L_0x0023
            if (r6 == r4) goto L_0x0023
            if (r6 == r3) goto L_0x0023
            if (r6 == r2) goto L_0x0023
            if (r6 == r1) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r0 = r5
            goto L_0x0006
        L_0x0025:
            long r5 = (long) r0
            r7 = 6
            long r5 = r5 * r7
            r7 = 8
            long r5 = r5 / r7
            int r6 = (int) r5
            byte[] r5 = new byte[r6]
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
        L_0x0035:
            r12 = 0
            if (r8 >= r0) goto L_0x009e
            char r13 = r15.charAt(r8)
            r14 = 65
            if (r13 < r14) goto L_0x0047
            r14 = 90
            if (r13 > r14) goto L_0x0047
            int r13 = r13 + -65
            goto L_0x007d
        L_0x0047:
            r14 = 97
            if (r13 < r14) goto L_0x0052
            r14 = 122(0x7a, float:1.71E-43)
            if (r13 > r14) goto L_0x0052
            int r13 = r13 + -71
            goto L_0x007d
        L_0x0052:
            r14 = 48
            if (r13 < r14) goto L_0x005d
            r14 = 57
            if (r13 > r14) goto L_0x005d
            int r13 = r13 + 4
            goto L_0x007d
        L_0x005d:
            r14 = 43
            if (r13 == r14) goto L_0x007b
            r14 = 45
            if (r13 != r14) goto L_0x0066
            goto L_0x007b
        L_0x0066:
            r14 = 47
            if (r13 == r14) goto L_0x0078
            r14 = 95
            if (r13 != r14) goto L_0x006f
            goto L_0x0078
        L_0x006f:
            if (r13 == r4) goto L_0x009b
            if (r13 == r3) goto L_0x009b
            if (r13 == r2) goto L_0x009b
            if (r13 != r1) goto L_0x00a3
            goto L_0x009b
        L_0x0078:
            r13 = 63
            goto L_0x007d
        L_0x007b:
            r13 = 62
        L_0x007d:
            int r10 = r10 << 6
            byte r12 = (byte) r13
            r10 = r10 | r12
            int r9 = r9 + 1
            int r12 = r9 % 4
            if (r12 != 0) goto L_0x009b
            int r12 = r11 + 1
            int r13 = r10 >> 16
            byte r13 = (byte) r13
            r5[r11] = r13
            int r11 = r12 + 1
            int r13 = r10 >> 8
            byte r13 = (byte) r13
            r5[r12] = r13
            int r12 = r11 + 1
            byte r13 = (byte) r10
            r5[r11] = r13
            r11 = r12
        L_0x009b:
            int r8 = r8 + 1
            goto L_0x0035
        L_0x009e:
            int r9 = r9 % 4
            r15 = 1
            if (r9 != r15) goto L_0x00a5
        L_0x00a3:
            r5 = r12
            goto L_0x00cf
        L_0x00a5:
            r15 = 2
            if (r9 != r15) goto L_0x00b3
            int r15 = r10 << 12
            int r0 = r11 + 1
            int r15 = r15 >> 16
            byte r15 = (byte) r15
            r5[r11] = r15
            r11 = r0
            goto L_0x00c6
        L_0x00b3:
            r15 = 3
            if (r9 != r15) goto L_0x00c6
            int r15 = r10 << 6
            int r0 = r11 + 1
            int r1 = r15 >> 16
            byte r1 = (byte) r1
            r5[r11] = r1
            int r11 = r0 + 1
            int r15 = r15 >> 8
            byte r15 = (byte) r15
            r5[r0] = r15
        L_0x00c6:
            if (r11 != r6) goto L_0x00c9
            goto L_0x00cf
        L_0x00c9:
            byte[] r15 = new byte[r11]
            java.lang.System.arraycopy(r5, r7, r15, r7, r11)
            r5 = r15
        L_0x00cf:
            if (r5 == 0) goto L_0x00d6
            p.i r12 = new p.i
            r12.<init>(r5)
        L_0x00d6:
            return r12
        L_0x00d7:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "base64 == null"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i.b(java.lang.String):p.i");
    }

    public static i c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        } else if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = i2 * 2;
                bArr[i2] = (byte) (a(str.charAt(i3 + 1)) + (a(str.charAt(i3)) << 4));
            }
            return a(bArr);
        } else {
            throw new IllegalArgumentException(a.b("Unexpected hex string: ", str));
        }
    }

    public static i d(String str) {
        if (str != null) {
            i iVar = new i(str.getBytes(c0.a));
            iVar.f5650g = str;
            return iVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0027 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int compareTo(java.lang.Object r10) {
        /*
            r9 = this;
            p.i r10 = (p.i) r10
            int r0 = r9.h()
            int r1 = r10.h()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = 0
        L_0x0010:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L_0x002b
            byte r7 = r9.a((int) r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.a((int) r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L_0x0025
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0025:
            if (r7 >= r8) goto L_0x0029
        L_0x0027:
            r3 = -1
            goto L_0x0031
        L_0x0029:
            r3 = 1
            goto L_0x0031
        L_0x002b:
            if (r0 != r1) goto L_0x002e
            goto L_0x0031
        L_0x002e:
            if (r0 >= r1) goto L_0x0029
            goto L_0x0027
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.i.compareTo(java.lang.Object):int");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int h2 = iVar.h();
            byte[] bArr = this.e;
            if (h2 != bArr.length || !iVar.a(0, bArr, 0, bArr.length)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public String f() {
        byte[] bArr = this.e;
        byte[] bArr2 = d.a;
        byte[] bArr3 = new byte[(((bArr.length + 2) / 3) * 4)];
        int length = bArr.length - (bArr.length % 3);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int i4 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[i3] & 255) >> 2];
            int i5 = i4 + 1;
            int i6 = i3 + 1;
            bArr3[i4] = bArr2[((bArr[i3] & 3) << 4) | ((bArr[i6] & 255) >> 4)];
            int i7 = i5 + 1;
            int i8 = i3 + 2;
            bArr3[i5] = bArr2[((bArr[i6] & 15) << 2) | ((bArr[i8] & 255) >> 6)];
            i2 = i7 + 1;
            bArr3[i7] = bArr2[bArr[i8] & 63];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            int i9 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            int i10 = i9 + 1;
            bArr3[i9] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i10] = 61;
            bArr3[i10 + 1] = 61;
        } else if (length2 == 2) {
            int i11 = i2 + 1;
            bArr3[i2] = bArr2[(bArr[length] & 255) >> 2];
            int i12 = i11 + 1;
            int i13 = length + 1;
            bArr3[i11] = bArr2[((bArr[i13] & 255) >> 4) | ((bArr[length] & 3) << 4)];
            bArr3[i12] = bArr2[(bArr[i13] & 15) << 2];
            bArr3[i12 + 1] = 61;
        }
        try {
            return new String(bArr3, "US-ASCII");
        } catch (UnsupportedEncodingException e2) {
            throw new AssertionError(e2);
        }
    }

    public String g() {
        byte[] bArr = this.e;
        char[] cArr = new char[(bArr.length * 2)];
        int i2 = 0;
        for (byte b2 : bArr) {
            int i3 = i2 + 1;
            char[] cArr2 = f5647h;
            cArr[i2] = cArr2[(b2 >> 4) & 15];
            i2 = i3 + 1;
            cArr[i3] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public int h() {
        return this.e.length;
    }

    public int hashCode() {
        int i2 = this.f5649f;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = Arrays.hashCode(this.e);
        this.f5649f = hashCode;
        return hashCode;
    }

    public i j() {
        int i2 = 0;
        while (true) {
            byte[] bArr = this.e;
            if (i2 >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i2];
            if (b2 < 65 || b2 > 90) {
                i2++;
            } else {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i2] = (byte) (b2 + 32);
                for (int i3 = i2 + 1; i3 < bArr2.length; i3++) {
                    byte b3 = bArr2[i3];
                    if (b3 >= 65 && b3 <= 90) {
                        bArr2[i3] = (byte) (b3 + 32);
                    }
                }
                return new i(bArr2);
            }
        }
    }

    public byte[] l() {
        return (byte[]) this.e.clone();
    }

    public String m() {
        String str = this.f5650g;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.e, c0.a);
        this.f5650g = str2;
        return str2;
    }

    public String toString() {
        if (this.e.length == 0) {
            return "[size=0]";
        }
        String m2 = m();
        int length = m2.length();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = m2.length();
                break;
            } else if (i3 == 64) {
                break;
            } else {
                int codePointAt = m2.codePointAt(i2);
                if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                    i3++;
                    i2 += Character.charCount(codePointAt);
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            String replace = m2.substring(0, i2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i2 >= m2.length()) {
                return a.a("[text=", replace, "]");
            }
            StringBuilder a = a.a("[size=");
            a.append(this.e.length);
            a.append(" text=");
            a.append(replace);
            a.append("…]");
            return a.toString();
        } else if (this.e.length <= 64) {
            StringBuilder a2 = a.a("[hex=");
            a2.append(g());
            a2.append("]");
            return a2.toString();
        } else {
            StringBuilder a3 = a.a("[size=");
            a3.append(this.e.length);
            a3.append(" hex=");
            a3.append(a(0, 64).g());
            a3.append("…]");
            return a3.toString();
        }
    }

    public final i a(String str) {
        try {
            return a(MessageDigest.getInstance(str).digest(this.e));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                throw new IllegalArgumentException("Unexpected hex digit: " + c);
            }
        }
        return (c - c2) + 10;
    }

    public i a(int i2, int i3) {
        if (i2 >= 0) {
            byte[] bArr = this.e;
            if (i3 <= bArr.length) {
                int i4 = i3 - i2;
                if (i4 < 0) {
                    throw new IllegalArgumentException("endIndex < beginIndex");
                } else if (i2 == 0 && i3 == bArr.length) {
                    return this;
                } else {
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(this.e, i2, bArr2, 0, i4);
                    return new i(bArr2);
                }
            } else {
                StringBuilder a = a.a("endIndex > length(");
                a.append(this.e.length);
                a.append(")");
                throw new IllegalArgumentException(a.toString());
            }
        } else {
            throw new IllegalArgumentException("beginIndex < 0");
        }
    }

    public byte a(int i2) {
        return this.e[i2];
    }

    public void a(f fVar) {
        byte[] bArr = this.e;
        fVar.write(bArr, 0, bArr.length);
    }

    public boolean a(int i2, i iVar, int i3, int i4) {
        return iVar.a(i3, this.e, i2, i4);
    }

    public boolean a(int i2, byte[] bArr, int i3, int i4) {
        if (i2 >= 0) {
            byte[] bArr2 = this.e;
            return i2 <= bArr2.length - i4 && i3 >= 0 && i3 <= bArr.length - i4 && c0.a(bArr2, i2, bArr, i3, i4);
        }
    }
}
