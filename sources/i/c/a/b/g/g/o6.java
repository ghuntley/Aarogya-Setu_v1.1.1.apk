package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class o6 {
    public static final p6 a;

    static {
        p6 p6Var;
        if (!(l6.f3349h && l6.f3348g) || r2.a()) {
            p6Var = new r6();
        } else {
            p6Var = new t6();
        }
        a = p6Var;
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

    public static boolean a(byte[] bArr, int i2, int i3) {
        if (a.a(0, bArr, i2, i3) == 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ int b(byte[] bArr, int i2, int i3) {
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
                                throw new q6(i3, length2);
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
        StringBuilder sb = new StringBuilder(54);
        sb.append("UTF-8 length does not fit in int: ");
        sb.append(((long) i4) + 4294967296L);
        throw new IllegalArgumentException(sb.toString());
    }
}
