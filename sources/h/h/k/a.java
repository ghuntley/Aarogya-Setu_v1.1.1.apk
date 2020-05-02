package h.h.k;

import java.util.Locale;

/* compiled from: BidiFormatter */
public final class a {
    public static final c d = d.c;
    public static final String e = Character.toString(8206);

    /* renamed from: f  reason: collision with root package name */
    public static final String f1797f = Character.toString(8207);

    /* renamed from: g  reason: collision with root package name */
    public static final a f1798g = new a(false, 2, d);

    /* renamed from: h  reason: collision with root package name */
    public static final a f1799h = new a(true, 2, d);
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final int f1800b;
    public final c c;

    /* renamed from: h.h.k.a$a  reason: collision with other inner class name */
    /* compiled from: BidiFormatter */
    public static class C0048a {

        /* renamed from: f  reason: collision with root package name */
        public static final byte[] f1801f = new byte[1792];
        public final CharSequence a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f1802b;
        public final int c;
        public int d;
        public char e;

        static {
            for (int i2 = 0; i2 < 1792; i2++) {
                f1801f[i2] = Character.getDirectionality(i2);
            }
        }

        public C0048a(CharSequence charSequence, boolean z) {
            this.a = charSequence;
            this.f1802b = z;
            this.c = charSequence.length();
        }

        public byte a() {
            char charAt;
            char charAt2;
            char charAt3 = this.a.charAt(this.d - 1);
            this.e = charAt3;
            if (Character.isLowSurrogate(charAt3)) {
                int codePointBefore = Character.codePointBefore(this.a, this.d);
                this.d -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.d--;
            char c2 = this.e;
            byte directionality = c2 < 1792 ? f1801f[c2] : Character.getDirectionality(c2);
            if (!this.f1802b) {
                return directionality;
            }
            char c3 = this.e;
            if (c3 == '>') {
                int i2 = this.d;
                while (true) {
                    int i3 = this.d;
                    if (i3 <= 0) {
                        break;
                    }
                    CharSequence charSequence = this.a;
                    int i4 = i3 - 1;
                    this.d = i4;
                    char charAt4 = charSequence.charAt(i4);
                    this.e = charAt4;
                    if (charAt4 == '<') {
                        break;
                    } else if (charAt4 == '>') {
                        break;
                    } else if (charAt4 == '\"' || charAt4 == '\'') {
                        char c4 = this.e;
                        do {
                            int i5 = this.d;
                            if (i5 <= 0) {
                                break;
                            }
                            CharSequence charSequence2 = this.a;
                            int i6 = i5 - 1;
                            this.d = i6;
                            charAt2 = charSequence2.charAt(i6);
                            this.e = charAt2;
                        } while (charAt2 != c4);
                    }
                }
                this.d = i2;
                this.e = '>';
                return 13;
            } else if (c3 != ';') {
                return directionality;
            } else {
                int i7 = this.d;
                do {
                    int i8 = this.d;
                    if (i8 <= 0) {
                        break;
                    }
                    CharSequence charSequence3 = this.a;
                    int i9 = i8 - 1;
                    this.d = i9;
                    charAt = charSequence3.charAt(i9);
                    this.e = charAt;
                    if (charAt == '&') {
                    }
                } while (charAt != ';');
                this.d = i7;
                this.e = ';';
                return 13;
            }
            return 12;
        }
    }

    public a(boolean z, int i2, c cVar) {
        this.a = z;
        this.f1800b = i2;
        this.c = cVar;
    }

    public static a a() {
        boolean z = true;
        if (e.a(Locale.getDefault()) != 1) {
            z = false;
        }
        c cVar = d;
        if (cVar == d) {
            return z ? f1799h : f1798g;
        }
        return new a(z, 2, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        r6 = r6 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(java.lang.CharSequence r6) {
        /*
            h.h.k.a$a r0 = new h.h.k.a$a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.c
            r0.d = r6
            r6 = 0
            r2 = 0
        L_0x000c:
            int r3 = r0.d
            r4 = 1
            if (r3 <= 0) goto L_0x0041
            byte r3 = r0.a()
            if (r3 == 0) goto L_0x0039
            if (r3 == r4) goto L_0x0032
            r5 = 2
            if (r3 == r5) goto L_0x0032
            r5 = 9
            if (r3 == r5) goto L_0x000c
            switch(r3) {
                case 14: goto L_0x002c;
                case 15: goto L_0x002c;
                case 16: goto L_0x0029;
                case 17: goto L_0x0029;
                case 18: goto L_0x0026;
                default: goto L_0x0023;
            }
        L_0x0023:
            if (r2 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0026:
            int r6 = r6 + 1
            goto L_0x000c
        L_0x0029:
            if (r2 != r6) goto L_0x002f
            goto L_0x0034
        L_0x002c:
            if (r2 != r6) goto L_0x002f
            goto L_0x003b
        L_0x002f:
            int r6 = r6 + -1
            goto L_0x000c
        L_0x0032:
            if (r6 != 0) goto L_0x0036
        L_0x0034:
            r1 = 1
            goto L_0x0041
        L_0x0036:
            if (r2 != 0) goto L_0x000c
            goto L_0x003f
        L_0x0039:
            if (r6 != 0) goto L_0x003d
        L_0x003b:
            r1 = -1
            goto L_0x0041
        L_0x003d:
            if (r2 != 0) goto L_0x000c
        L_0x003f:
            r2 = r6
            goto L_0x000c
        L_0x0041:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.k.a.b(java.lang.CharSequence):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f3, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r5 = r5 - 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(java.lang.CharSequence r12) {
        /*
            h.h.k.a$a r0 = new h.h.k.a$a
            r1 = 0
            r0.<init>(r12, r1)
            r0.d = r1
            r12 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x000d:
            int r6 = r0.d
            int r7 = r0.c
            if (r6 >= r7) goto L_0x00db
            if (r3 != 0) goto L_0x00db
            java.lang.CharSequence r7 = r0.a
            char r6 = r7.charAt(r6)
            r0.e = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L_0x003a
            java.lang.CharSequence r6 = r0.a
            int r7 = r0.d
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.d
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.d = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L_0x00b4
        L_0x003a:
            int r6 = r0.d
            int r6 = r6 + r2
            r0.d = r6
            char r6 = r0.e
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L_0x004a
            byte[] r7 = h.h.k.a.C0048a.f1801f
            byte r6 = r7[r6]
            goto L_0x004e
        L_0x004a:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L_0x004e:
            boolean r7 = r0.f1802b
            if (r7 == 0) goto L_0x00b4
            char r7 = r0.e
            r8 = 60
            if (r7 != r8) goto L_0x0097
            int r6 = r0.d
        L_0x005a:
            int r7 = r0.d
            int r9 = r0.c
            if (r7 >= r9) goto L_0x0090
            java.lang.CharSequence r9 = r0.a
            int r10 = r7 + 1
            r0.d = r10
            char r7 = r9.charAt(r7)
            r0.e = r7
            r9 = 62
            if (r7 != r9) goto L_0x0071
            goto L_0x00b2
        L_0x0071:
            r9 = 34
            if (r7 == r9) goto L_0x0079
            r9 = 39
            if (r7 != r9) goto L_0x005a
        L_0x0079:
            char r7 = r0.e
        L_0x007b:
            int r9 = r0.d
            int r10 = r0.c
            if (r9 >= r10) goto L_0x005a
            java.lang.CharSequence r10 = r0.a
            int r11 = r9 + 1
            r0.d = r11
            char r9 = r10.charAt(r9)
            r0.e = r9
            if (r9 == r7) goto L_0x005a
            goto L_0x007b
        L_0x0090:
            r0.d = r6
            r0.e = r8
            r6 = 13
            goto L_0x00b4
        L_0x0097:
            r8 = 38
            if (r7 != r8) goto L_0x00b4
        L_0x009b:
            int r6 = r0.d
            int r7 = r0.c
            if (r6 >= r7) goto L_0x00b2
            java.lang.CharSequence r7 = r0.a
            int r8 = r6 + 1
            r0.d = r8
            char r6 = r7.charAt(r6)
            r0.e = r6
            r7 = 59
            if (r6 == r7) goto L_0x00b2
            goto L_0x009b
        L_0x00b2:
            r6 = 12
        L_0x00b4:
            if (r6 == 0) goto L_0x00d5
            if (r6 == r2) goto L_0x00d2
            r7 = 2
            if (r6 == r7) goto L_0x00d2
            r7 = 9
            if (r6 == r7) goto L_0x000d
            switch(r6) {
                case 14: goto L_0x00cd;
                case 15: goto L_0x00cd;
                case 16: goto L_0x00c8;
                case 17: goto L_0x00c8;
                case 18: goto L_0x00c3;
                default: goto L_0x00c2;
            }
        L_0x00c2:
            goto L_0x00d8
        L_0x00c3:
            int r5 = r5 + -1
            r4 = 0
            goto L_0x000d
        L_0x00c8:
            int r5 = r5 + 1
            r4 = 1
            goto L_0x000d
        L_0x00cd:
            int r5 = r5 + 1
            r4 = -1
            goto L_0x000d
        L_0x00d2:
            if (r5 != 0) goto L_0x00d8
            goto L_0x00f3
        L_0x00d5:
            if (r5 != 0) goto L_0x00d8
            goto L_0x00f7
        L_0x00d8:
            r3 = r5
            goto L_0x000d
        L_0x00db:
            if (r3 != 0) goto L_0x00de
            goto L_0x00fc
        L_0x00de:
            if (r4 == 0) goto L_0x00e2
            r1 = r4
            goto L_0x00fc
        L_0x00e2:
            int r4 = r0.d
            if (r4 <= 0) goto L_0x00fc
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L_0x00f5;
                case 15: goto L_0x00f5;
                case 16: goto L_0x00f1;
                case 17: goto L_0x00f1;
                case 18: goto L_0x00ee;
                default: goto L_0x00ed;
            }
        L_0x00ed:
            goto L_0x00e2
        L_0x00ee:
            int r5 = r5 + 1
            goto L_0x00e2
        L_0x00f1:
            if (r3 != r5) goto L_0x00f9
        L_0x00f3:
            r1 = 1
            goto L_0x00fc
        L_0x00f5:
            if (r3 != r5) goto L_0x00f9
        L_0x00f7:
            r1 = -1
            goto L_0x00fc
        L_0x00f9:
            int r5 = r5 + -1
            goto L_0x00e2
        L_0x00fc:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.k.a.a(java.lang.CharSequence):int");
    }
}
