package i.c.f;

/* compiled from: Utf8 */
public final class v {
    public static final a a = (u.c && u.f4979b ? new d() : new b());

    /* compiled from: Utf8 */
    public static abstract class a {
        public abstract int a(int i2, byte[] bArr, int i3, int i4);

        public abstract int a(CharSequence charSequence, byte[] bArr, int i2, int i3);
    }

    /* compiled from: Utf8 */
    public static class c extends IllegalArgumentException {
        public c(int i2, int i3) {
            super("Unpaired surrogate at index " + i2 + " of " + i3);
        }
    }

    public static /* synthetic */ int a(int i2) {
        if (i2 > -12) {
            return -1;
        }
        return i2;
    }

    public static /* synthetic */ int a(int i2, int i3) {
        if (i2 > -12 || i3 > -65) {
            return -1;
        }
        return i2 ^ (i3 << 8);
    }

    public static int a(int i2, int i3, int i4) {
        if (i2 > -12 || i3 > -65 || i4 > -65) {
            return -1;
        }
        return (i2 ^ (i3 << 8)) ^ (i4 << 16);
    }

    public static /* synthetic */ int a(byte[] bArr, int i2, int i3) {
        byte b2 = bArr[i2 - 1];
        int i4 = i3 - i2;
        byte b3 = -1;
        if (i4 == 0) {
            if (b2 > -12) {
                b2 = -1;
            }
            return b2;
        } else if (i4 == 1) {
            byte b4 = bArr[i2];
            if (b2 <= -12 && b4 <= -65) {
                b3 = b2 ^ (b4 << 8);
            }
            return b3;
        } else if (i4 == 2) {
            return a((int) b2, (int) bArr[i2], (int) bArr[i2 + 1]);
        } else {
            throw new AssertionError();
        }
    }

    public static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 < length && charSequence.charAt(i3) < 128) {
            i3++;
        }
        int i4 = length;
        while (true) {
            if (i3 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            if (charAt < 2048) {
                i4 += (127 - charAt) >>> 31;
                i3++;
            } else {
                int length2 = charSequence.length();
                while (i3 < length2) {
                    char charAt2 = charSequence.charAt(i3);
                    if (charAt2 < 2048) {
                        i2 += (127 - charAt2) >>> 31;
                    } else {
                        i2 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i3) >= 65536) {
                                i3++;
                            } else {
                                throw new c(i3, length2);
                            }
                        }
                    }
                    i3++;
                }
                i4 += i2;
            }
        }
        if (i4 >= length) {
            return i4;
        }
        StringBuilder a2 = i.a.a.a.a.a("UTF-8 length does not fit in int: ");
        a2.append(((long) i4) + 4294967296L);
        throw new IllegalArgumentException(a2.toString());
    }

    /* compiled from: Utf8 */
    public static final class b extends a {
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0047, code lost:
            if (r13[r14] > -65) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0082, code lost:
            if (r13[r14] > -65) goto L_0x0084;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
            if (r13[r14] > -65) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = -19
                r1 = -62
                r2 = -16
                r3 = 0
                r4 = -96
                r5 = -32
                r6 = -1
                r7 = -65
                if (r12 == 0) goto L_0x0085
                if (r14 < r15) goto L_0x0013
                return r12
            L_0x0013:
                byte r8 = (byte) r12
                if (r8 >= r5) goto L_0x0023
                if (r8 < r1) goto L_0x0022
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
                goto L_0x0022
            L_0x001f:
                r14 = r12
                goto L_0x0085
            L_0x0022:
                return r6
            L_0x0023:
                if (r8 >= r2) goto L_0x004a
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0039
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r12 < r15) goto L_0x0036
                int r12 = i.c.f.v.a(r8, r14)
                return r12
            L_0x0036:
                r10 = r14
                r14 = r12
                r12 = r10
            L_0x0039:
                if (r12 > r7) goto L_0x0049
                if (r8 != r5) goto L_0x003f
                if (r12 < r4) goto L_0x0049
            L_0x003f:
                if (r8 != r0) goto L_0x0043
                if (r12 >= r4) goto L_0x0049
            L_0x0043:
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
            L_0x0049:
                return r6
            L_0x004a:
                int r9 = r12 >> 8
                int r9 = ~r9
                byte r9 = (byte) r9
                if (r9 != 0) goto L_0x005e
                int r12 = r14 + 1
                byte r9 = r13[r14]
                if (r12 < r15) goto L_0x005b
                int r12 = i.c.f.v.a(r8, r9)
                return r12
            L_0x005b:
                r14 = r12
                r12 = 0
                goto L_0x0061
            L_0x005e:
                int r12 = r12 >> 16
                byte r12 = (byte) r12
            L_0x0061:
                if (r12 != 0) goto L_0x0071
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r12 < r15) goto L_0x006e
                int r12 = i.c.f.v.a((int) r8, (int) r9, (int) r14)
                return r12
            L_0x006e:
                r10 = r14
                r14 = r12
                r12 = r10
            L_0x0071:
                if (r9 > r7) goto L_0x0084
                int r8 = r8 << 28
                int r9 = r9 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L_0x0084
                if (r12 > r7) goto L_0x0084
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 <= r7) goto L_0x001f
            L_0x0084:
                return r6
            L_0x0085:
                if (r14 >= r15) goto L_0x008e
                byte r12 = r13[r14]
                if (r12 < 0) goto L_0x008e
                int r14 = r14 + 1
                goto L_0x0085
            L_0x008e:
                if (r14 < r15) goto L_0x0092
                goto L_0x00ef
            L_0x0092:
                if (r14 < r15) goto L_0x0095
                goto L_0x00ef
            L_0x0095:
                int r12 = r14 + 1
                byte r14 = r13[r14]
                if (r14 >= 0) goto L_0x00f0
                if (r14 >= r5) goto L_0x00aa
                if (r12 < r15) goto L_0x00a1
                r3 = r14
                goto L_0x00ef
            L_0x00a1:
                if (r14 < r1) goto L_0x00ee
                int r14 = r12 + 1
                byte r12 = r13[r12]
                if (r12 <= r7) goto L_0x0092
                goto L_0x00ee
            L_0x00aa:
                if (r14 >= r2) goto L_0x00ca
                int r8 = r15 + -1
                if (r12 < r8) goto L_0x00b5
                int r3 = i.c.f.v.a((byte[]) r13, (int) r12, (int) r15)
                goto L_0x00ef
            L_0x00b5:
                int r8 = r12 + 1
                byte r12 = r13[r12]
                if (r12 > r7) goto L_0x00ee
                if (r14 != r5) goto L_0x00bf
                if (r12 < r4) goto L_0x00ee
            L_0x00bf:
                if (r14 != r0) goto L_0x00c3
                if (r12 >= r4) goto L_0x00ee
            L_0x00c3:
                int r14 = r8 + 1
                byte r12 = r13[r8]
                if (r12 <= r7) goto L_0x0092
                goto L_0x00ee
            L_0x00ca:
                int r8 = r15 + -2
                if (r12 < r8) goto L_0x00d3
                int r3 = i.c.f.v.a((byte[]) r13, (int) r12, (int) r15)
                goto L_0x00ef
            L_0x00d3:
                int r8 = r12 + 1
                byte r12 = r13[r12]
                if (r12 > r7) goto L_0x00ee
                int r14 = r14 << 28
                int r12 = r12 + 112
                int r12 = r12 + r14
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00ee
                int r12 = r8 + 1
                byte r14 = r13[r8]
                if (r14 > r7) goto L_0x00ee
                int r14 = r12 + 1
                byte r12 = r13[r12]
                if (r12 <= r7) goto L_0x0092
            L_0x00ee:
                r3 = -1
            L_0x00ef:
                return r3
            L_0x00f0:
                r14 = r12
                goto L_0x0092
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.f.v.b.a(int, byte[], int, int):int");
        }

        public int a(CharSequence charSequence, byte[] bArr, int i2, int i3) {
            int i4;
            int i5;
            int i6;
            char charAt;
            int length = charSequence.length();
            int i7 = i3 + i2;
            int i8 = 0;
            while (i8 < length && (i6 = i8 + i2) < i7 && (charAt = charSequence.charAt(i8)) < 128) {
                bArr[i6] = (byte) charAt;
                i8++;
            }
            if (i8 == length) {
                return i2 + length;
            }
            int i9 = i2 + i8;
            while (i8 < length) {
                char charAt2 = charSequence.charAt(i8);
                if (charAt2 < 128 && i9 < i7) {
                    i5 = i9 + 1;
                    bArr[i9] = (byte) charAt2;
                } else if (charAt2 < 2048 && i9 <= i7 - 2) {
                    int i10 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 >>> 6) | 960);
                    i9 = i10 + 1;
                    bArr[i10] = (byte) ((charAt2 & '?') | 128);
                    i8++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i9 <= i7 - 3) {
                    int i11 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 >>> 12) | 480);
                    int i12 = i11 + 1;
                    bArr[i11] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i5 = i12 + 1;
                    bArr[i12] = (byte) ((charAt2 & '?') | 128);
                } else if (i9 <= i7 - 4) {
                    int i13 = i8 + 1;
                    if (i13 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i13);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i14 = i9 + 1;
                            bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i16 = i15 + 1;
                            bArr[i15] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i9 = i16 + 1;
                            bArr[i16] = (byte) ((codePoint & 63) | 128);
                            i8 = i13;
                            i8++;
                        } else {
                            i8 = i13;
                        }
                    }
                    throw new c(i8 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i4 = i8 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i4)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i9);
                } else {
                    throw new c(i8, length);
                }
                i9 = i5;
                i8++;
            }
            return i9;
        }
    }

    /* compiled from: Utf8 */
    public static final class d extends a {
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0034  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0038 A[LOOP:1: B:12:0x0038->B:37:0x00f1, LOOP_START, PHI: r2 r3 r4 r11 
  PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x0032, B:37:0x00f1] A[DONT_GENERATE, DONT_INLINE]
  PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x0032, B:37:0x00f1] A[DONT_GENERATE, DONT_INLINE]
  PHI: (r4v6 long) = (r4v3 long), (r4v7 long) binds: [B:10:0x0032, B:37:0x00f1] A[DONT_GENERATE, DONT_INLINE]
  PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x0032, B:37:0x00f1] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(java.lang.CharSequence r19, byte[] r20, int r21, int r22) {
            /*
                r18 = this;
                r0 = r19
                r1 = r20
                r2 = r21
                r3 = r22
                long r4 = i.c.f.u.d
                long r6 = (long) r2
                long r4 = r4 + r6
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r19.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0138
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0138
                r2 = 0
            L_0x001d:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x0032
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x0032
                long r11 = r11 + r4
                byte r3 = (byte) r13
                i.c.f.u.a(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001d
            L_0x0032:
                if (r2 != r8) goto L_0x0038
                long r0 = i.c.f.u.d
                goto L_0x0135
            L_0x0038:
                if (r2 >= r8) goto L_0x0133
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004b
                int r3 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r3 >= 0) goto L_0x004b
                long r14 = r4 + r11
                byte r3 = (byte) r13
                i.c.f.u.a(r1, r4, r3)
                goto L_0x00a3
            L_0x004b:
                r3 = 2048(0x800, float:2.87E-42)
                if (r13 >= r3) goto L_0x006e
                r14 = 2
                long r14 = r6 - r14
                int r3 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r3 > 0) goto L_0x006e
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                i.c.f.u.a(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r5 = r5 | 128(0x80, float:1.794E-43)
                byte r5 = (byte) r5
                i.c.f.u.a(r1, r14, r5)
                r4 = r3
                goto L_0x00f1
            L_0x006e:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x0078
                if (r3 >= r13) goto L_0x00a5
            L_0x0078:
                r15 = 3
                long r15 = r6 - r15
                int r17 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r17 > 0) goto L_0x00a5
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                i.c.f.u.a(r1, r4, r3)
                long r11 = r11 + r14
                int r3 = r13 >>> 6
                r3 = r3 & 63
                r3 = r3 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                i.c.f.u.a(r1, r14, r3)
                r3 = 1
                long r14 = r11 + r3
                r3 = r13 & 63
                r3 = r3 | 128(0x80, float:1.794E-43)
                byte r3 = (byte) r3
                i.c.f.u.a(r1, r11, r3)
                r11 = 1
            L_0x00a3:
                r4 = r14
                goto L_0x00f1
            L_0x00a5:
                r11 = 4
                long r11 = r6 - r11
                int r15 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r15 > 0) goto L_0x0100
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x00f8
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x00f7
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                i.c.f.u.a(r1, r4, r15)
                long r11 = r11 + r13
                int r4 = r2 >>> 12
                r4 = r4 & 63
                r4 = r4 | 128(0x80, float:1.794E-43)
                byte r4 = (byte) r4
                i.c.f.u.a(r1, r13, r4)
                r4 = 1
                long r4 = r4 + r11
                int r13 = r2 >>> 6
                r13 = r13 & 63
                r13 = r13 | 128(0x80, float:1.794E-43)
                byte r13 = (byte) r13
                i.c.f.u.a(r1, r11, r13)
                r11 = 1
                long r13 = r4 + r11
                r2 = r2 & 63
                r2 = r2 | 128(0x80, float:1.794E-43)
                byte r2 = (byte) r2
                i.c.f.u.a(r1, r4, r2)
                r2 = r3
                r4 = r13
            L_0x00f1:
                int r2 = r2 + 1
                r3 = 128(0x80, float:1.794E-43)
                goto L_0x0038
            L_0x00f7:
                r2 = r3
            L_0x00f8:
                i.c.f.v$c r0 = new i.c.f.v$c
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x0100:
                if (r14 > r13) goto L_0x0118
                if (r13 > r3) goto L_0x0118
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0112
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0118
            L_0x0112:
                i.c.f.v$c r0 = new i.c.f.v$c
                r0.<init>(r2, r8)
                throw r0
            L_0x0118:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0133:
                long r0 = i.c.f.u.d
            L_0x0135:
                long r4 = r4 - r0
                int r0 = (int) r4
                return r0
            L_0x0138:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = i.a.a.a.a.a(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.f.v.d.a(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
            if (i.c.f.u.a(r1, r10) > -65) goto L_0x0043;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
            if (i.c.f.u.a(r1, r10) > -65) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b0, code lost:
            if (i.c.f.u.a(r1, r10) > -65) goto L_0x00b2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int a(int r25, byte[] r26, int r27, int r28) {
            /*
                r24 = this;
                r0 = r25
                r1 = r26
                r2 = r27
                r3 = r28
                r4 = r2 | r3
                int r5 = r1.length
                int r5 = r5 - r3
                r4 = r4 | r5
                r5 = 2
                if (r4 < 0) goto L_0x0179
                long r8 = i.c.f.u.d
                long r10 = (long) r2
                long r10 = r10 + r8
                long r2 = (long) r3
                long r8 = r8 + r2
                r2 = -19
                r3 = -62
                r4 = -16
                r12 = 16
                r13 = -96
                r14 = -32
                r15 = 8
                r7 = -65
                r16 = 1
                r18 = -1
                if (r0 == 0) goto L_0x00b3
                int r19 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r19 < 0) goto L_0x0031
                return r0
            L_0x0031:
                byte r6 = (byte) r0
                if (r6 >= r14) goto L_0x0044
                if (r6 < r3) goto L_0x0043
                long r20 = r10 + r16
                byte r0 = i.c.f.u.a(r1, r10)
                if (r0 <= r7) goto L_0x003f
                goto L_0x0043
            L_0x003f:
                r10 = r20
                goto L_0x00b3
            L_0x0043:
                return r18
            L_0x0044:
                if (r6 >= r4) goto L_0x006f
                int r0 = r0 >> r15
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x005c
                long r20 = r10 + r16
                byte r0 = i.c.f.u.a(r1, r10)
                int r10 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
                if (r10 < 0) goto L_0x005a
                int r0 = i.c.f.v.a(r6, r0)
                return r0
            L_0x005a:
                r10 = r20
            L_0x005c:
                if (r0 > r7) goto L_0x006e
                if (r6 != r14) goto L_0x0062
                if (r0 < r13) goto L_0x006e
            L_0x0062:
                if (r6 != r2) goto L_0x0066
                if (r0 >= r13) goto L_0x006e
            L_0x0066:
                long r20 = r10 + r16
                byte r0 = i.c.f.u.a(r1, r10)
                if (r0 <= r7) goto L_0x003f
            L_0x006e:
                return r18
            L_0x006f:
                int r2 = r0 >> 8
                int r2 = ~r2
                byte r2 = (byte) r2
                if (r2 != 0) goto L_0x0088
                long r20 = r10 + r16
                byte r2 = i.c.f.u.a(r1, r10)
                int r0 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
                if (r0 < 0) goto L_0x0084
                int r0 = i.c.f.v.a(r6, r2)
                return r0
            L_0x0084:
                r10 = r20
                r0 = 0
                goto L_0x008a
            L_0x0088:
                int r0 = r0 >> r12
                byte r0 = (byte) r0
            L_0x008a:
                if (r0 != 0) goto L_0x009d
                long r20 = r10 + r16
                byte r0 = i.c.f.u.a(r1, r10)
                int r10 = (r20 > r8 ? 1 : (r20 == r8 ? 0 : -1))
                if (r10 < 0) goto L_0x009b
                int r0 = i.c.f.v.a((int) r6, (int) r2, (int) r0)
                return r0
            L_0x009b:
                r10 = r20
            L_0x009d:
                if (r2 > r7) goto L_0x00b2
                int r6 = r6 << 28
                int r2 = r2 + 112
                int r2 = r2 + r6
                int r2 = r2 >> 30
                if (r2 != 0) goto L_0x00b2
                if (r0 > r7) goto L_0x00b2
                long r20 = r10 + r16
                byte r0 = i.c.f.u.a(r1, r10)
                if (r0 <= r7) goto L_0x003f
            L_0x00b2:
                return r18
            L_0x00b3:
                long r8 = r8 - r10
                int r0 = (int) r8
                if (r0 >= r12) goto L_0x00b9
                r2 = 0
                goto L_0x00ed
            L_0x00b9:
                int r2 = (int) r10
                r2 = r2 & 7
                r6 = r2
                r8 = r10
            L_0x00be:
                if (r6 <= 0) goto L_0x00cf
                long r20 = r8 + r16
                byte r8 = i.c.f.u.a(r1, r8)
                if (r8 >= 0) goto L_0x00ca
                int r2 = r2 - r6
                goto L_0x00ed
            L_0x00ca:
                int r6 = r6 + -1
                r8 = r20
                goto L_0x00be
            L_0x00cf:
                int r2 = r0 - r2
            L_0x00d1:
                if (r2 < r15) goto L_0x00eb
                long r20 = i.c.f.u.b(r1, r8)
                r22 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
                long r20 = r20 & r22
                r22 = 0
                int r6 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
                if (r6 != 0) goto L_0x00eb
                r20 = 8
                long r8 = r8 + r20
                int r2 = r2 + -8
                goto L_0x00d1
            L_0x00eb:
                int r2 = r0 - r2
            L_0x00ed:
                int r0 = r0 - r2
                long r8 = (long) r2
                long r10 = r10 + r8
            L_0x00f0:
                r2 = 0
            L_0x00f1:
                if (r0 <= 0) goto L_0x0100
                long r8 = r10 + r16
                byte r2 = i.c.f.u.a(r1, r10)
                if (r2 < 0) goto L_0x00ff
                int r0 = r0 + -1
                r10 = r8
                goto L_0x00f1
            L_0x00ff:
                r10 = r8
            L_0x0100:
                if (r0 != 0) goto L_0x0105
                r7 = 0
                goto L_0x0178
            L_0x0105:
                int r0 = r0 + -1
                if (r2 >= r14) goto L_0x0121
                if (r0 != 0) goto L_0x010e
                r7 = r2
                goto L_0x0178
            L_0x010e:
                int r0 = r0 + -1
                if (r2 < r3) goto L_0x011f
                long r8 = r10 + r16
                byte r2 = i.c.f.u.a(r1, r10)
                if (r2 <= r7) goto L_0x011b
                goto L_0x011f
            L_0x011b:
                r10 = r8
                r12 = -19
                goto L_0x00f0
            L_0x011f:
                r7 = -1
                goto L_0x0178
            L_0x0121:
                if (r2 >= r4) goto L_0x0147
                if (r0 >= r5) goto L_0x012a
                int r7 = a((byte[]) r1, (int) r2, (long) r10, (int) r0)
                goto L_0x0178
            L_0x012a:
                int r0 = r0 + -2
                long r8 = r10 + r16
                byte r6 = i.c.f.u.a(r1, r10)
                if (r6 > r7) goto L_0x011f
                if (r2 != r14) goto L_0x0138
                if (r6 < r13) goto L_0x011f
            L_0x0138:
                r12 = -19
                if (r2 != r12) goto L_0x013e
                if (r6 >= r13) goto L_0x011f
            L_0x013e:
                long r10 = r8 + r16
                byte r2 = i.c.f.u.a(r1, r8)
                if (r2 <= r7) goto L_0x00f0
                goto L_0x011f
            L_0x0147:
                r6 = 3
                r12 = -19
                if (r0 >= r6) goto L_0x0151
                int r7 = a((byte[]) r1, (int) r2, (long) r10, (int) r0)
                goto L_0x0178
            L_0x0151:
                int r0 = r0 + -3
                long r8 = r10 + r16
                byte r6 = i.c.f.u.a(r1, r10)
                if (r6 > r7) goto L_0x011f
                int r2 = r2 << 28
                int r6 = r6 + 112
                int r6 = r6 + r2
                int r2 = r6 >> 30
                if (r2 != 0) goto L_0x011f
                long r10 = r8 + r16
                byte r2 = i.c.f.u.a(r1, r8)
                if (r2 > r7) goto L_0x011f
                long r8 = r10 + r16
                byte r2 = i.c.f.u.a(r1, r10)
                if (r2 <= r7) goto L_0x0175
                goto L_0x011f
            L_0x0175:
                r10 = r8
                goto L_0x00f0
            L_0x0178:
                return r7
            L_0x0179:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                r4 = 3
                java.lang.Object[] r4 = new java.lang.Object[r4]
                int r1 = r1.length
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r6 = 0
                r4[r6] = r1
                r1 = 1
                java.lang.Integer r2 = java.lang.Integer.valueOf(r27)
                r4[r1] = r2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
                r4[r5] = r1
                java.lang.String r1 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.f.v.d.a(int, byte[], int, int):int");
        }

        public static int a(byte[] bArr, int i2, long j2, int i3) {
            if (i3 == 0) {
                return v.a(i2);
            }
            if (i3 == 1) {
                return v.a(i2, u.a(bArr, j2));
            }
            if (i3 == 2) {
                return v.a(i2, (int) u.a(bArr, j2), (int) u.a(bArr, j2 + 1));
            }
            throw new AssertionError();
        }
    }
}
