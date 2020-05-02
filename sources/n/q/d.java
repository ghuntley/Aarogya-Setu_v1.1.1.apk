package n.q;

import i.c.d.p.e;
import n.m.c.f;

/* compiled from: StringsJVM.kt */
public class d extends c {
    public static /* synthetic */ boolean a(String str, String str2, boolean z, int i2) {
        boolean z2;
        if ((i2 & 2) != 0) {
            z = false;
        }
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            z2 = str.equals(str2);
        } else {
            z2 = str.equalsIgnoreCase(str2);
        }
        return z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean b(java.lang.CharSequence r4) {
        /*
            if (r4 == 0) goto L_0x0044
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0042
            n.n.c r0 = new n.n.c
            int r3 = r4.length()
            int r3 = r3 + -1
            r0.<init>(r1, r3)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0024
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0024
        L_0x0022:
            r4 = 1
            goto L_0x0040
        L_0x0024:
            java.util.Iterator r0 = r0.iterator()
        L_0x0028:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0022
            r3 = r0
            n.i.c r3 = (n.i.c) r3
            int r3 = r3.b()
            char r3 = r4.charAt(r3)
            boolean r3 = i.c.d.p.e.a((char) r3)
            if (r3 != 0) goto L_0x0028
            r4 = 0
        L_0x0040:
            if (r4 == 0) goto L_0x0043
        L_0x0042:
            r1 = 1
        L_0x0043:
            return r1
        L_0x0044:
            java.lang.String r4 = "$this$isBlank"
            n.m.c.f.a((java.lang.String) r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: n.q.d.b(java.lang.CharSequence):boolean");
    }

    public static final CharSequence c(CharSequence charSequence) {
        if (charSequence != null) {
            int length = charSequence.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean a = e.a(charSequence.charAt(!z ? i2 : length));
                if (!z) {
                    if (!a) {
                        z = true;
                    } else {
                        i2++;
                    }
                } else if (!a) {
                    break;
                } else {
                    length--;
                }
            }
            return charSequence.subSequence(i2, length + 1);
        }
        f.a("$this$trim");
        throw null;
    }

    public static final int a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.length() - 1;
        }
        f.a("$this$lastIndex");
        throw null;
    }

    public static /* synthetic */ int a(CharSequence charSequence, char c, int i2, boolean z, int i3) {
        boolean z2;
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if (charSequence == null) {
            f.a("$this$indexOf");
            throw null;
        } else if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(c, i2);
        } else {
            char[] cArr = {c};
            if (z || !(charSequence instanceof String)) {
                if (i2 < 0) {
                    i2 = 0;
                }
                int a = a(charSequence);
                if (i2 <= a) {
                    while (true) {
                        char charAt = charSequence.charAt(i2);
                        int i4 = 0;
                        while (true) {
                            if (i4 >= 1) {
                                z2 = false;
                                break;
                            } else if (e.a(cArr[i4], charAt, z)) {
                                z2 = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        if (!z2) {
                            if (i2 == a) {
                                break;
                            }
                            i2++;
                        } else {
                            return i2;
                        }
                    }
                }
                return -1;
            }
            return ((String) charSequence).indexOf(cArr[0], i2);
        }
    }
}
