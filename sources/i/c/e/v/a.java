package i.c.e.v;

import com.google.gson.stream.MalformedJsonException;
import i.c.e.t.p;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

/* compiled from: JsonReader */
public class a implements Closeable {
    public static final char[] t = ")]}'\n".toCharArray();
    public final Reader e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f4898f = false;

    /* renamed from: g  reason: collision with root package name */
    public final char[] f4899g = new char[1024];

    /* renamed from: h  reason: collision with root package name */
    public int f4900h = 0;

    /* renamed from: i  reason: collision with root package name */
    public int f4901i = 0;

    /* renamed from: j  reason: collision with root package name */
    public int f4902j = 0;

    /* renamed from: k  reason: collision with root package name */
    public int f4903k = 0;

    /* renamed from: l  reason: collision with root package name */
    public int f4904l = 0;

    /* renamed from: m  reason: collision with root package name */
    public long f4905m;

    /* renamed from: n  reason: collision with root package name */
    public int f4906n;

    /* renamed from: o  reason: collision with root package name */
    public String f4907o;

    /* renamed from: p  reason: collision with root package name */
    public int[] f4908p;

    /* renamed from: q  reason: collision with root package name */
    public int f4909q;
    public String[] r;
    public int[] s;

    /* renamed from: i.c.e.v.a$a  reason: collision with other inner class name */
    /* compiled from: JsonReader */
    public class C0139a extends p {
    }

    static {
        p.a = new C0139a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f4908p = iArr;
        this.f4909q = 0;
        this.f4909q = 0 + 1;
        iArr[0] = 6;
        this.r = new String[32];
        this.s = new int[32];
        if (reader != null) {
            this.e = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    public String A() {
        String str;
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 10) {
            str = B();
        } else if (i2 == 8) {
            str = b('\'');
        } else if (i2 == 9) {
            str = b('\"');
        } else if (i2 == 11) {
            str = this.f4907o;
            this.f4907o = null;
        } else if (i2 == 15) {
            str = Long.toString(this.f4905m);
        } else if (i2 == 16) {
            str = new String(this.f4899g, this.f4900h, this.f4906n);
            this.f4900h += this.f4906n;
        } else {
            StringBuilder a = i.a.a.a.a.a("Expected a string but was ");
            a.append(C());
            a.append(t());
            throw new IllegalStateException(a.toString());
        }
        this.f4904l = 0;
        int[] iArr = this.s;
        int i3 = this.f4909q - 1;
        iArr[i3] = iArr[i3] + 1;
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004a, code lost:
        h();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String B() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            r2 = 0
        L_0x0003:
            int r3 = r6.f4900h
            int r4 = r3 + r2
            int r5 = r6.f4901i
            if (r4 >= r5) goto L_0x004e
            char[] r4 = r6.f4899g
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L_0x005c
            r4 = 10
            if (r3 == r4) goto L_0x005c
            r4 = 12
            if (r3 == r4) goto L_0x005c
            r4 = 13
            if (r3 == r4) goto L_0x005c
            r4 = 32
            if (r3 == r4) goto L_0x005c
            r4 = 35
            if (r3 == r4) goto L_0x004a
            r4 = 44
            if (r3 == r4) goto L_0x005c
            r4 = 47
            if (r3 == r4) goto L_0x004a
            r4 = 61
            if (r3 == r4) goto L_0x004a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L_0x005c
            r4 = 58
            if (r3 == r4) goto L_0x005c
            r4 = 59
            if (r3 == r4) goto L_0x004a
            switch(r3) {
                case 91: goto L_0x005c;
                case 92: goto L_0x004a;
                case 93: goto L_0x005c;
                default: goto L_0x0047;
            }
        L_0x0047:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x004a:
            r6.h()
            goto L_0x005c
        L_0x004e:
            char[] r3 = r6.f4899g
            int r3 = r3.length
            if (r2 >= r3) goto L_0x005e
            int r3 = r2 + 1
            boolean r3 = r6.b((int) r3)
            if (r3 == 0) goto L_0x005c
            goto L_0x0003
        L_0x005c:
            r0 = r2
            goto L_0x007e
        L_0x005e:
            if (r1 != 0) goto L_0x006b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L_0x006b:
            char[] r3 = r6.f4899g
            int r4 = r6.f4900h
            r1.append(r3, r4, r2)
            int r3 = r6.f4900h
            int r3 = r3 + r2
            r6.f4900h = r3
            r2 = 1
            boolean r2 = r6.b((int) r2)
            if (r2 != 0) goto L_0x0002
        L_0x007e:
            if (r1 != 0) goto L_0x008a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f4899g
            int r3 = r6.f4900h
            r1.<init>(r2, r3, r0)
            goto L_0x0095
        L_0x008a:
            char[] r2 = r6.f4899g
            int r3 = r6.f4900h
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L_0x0095:
            int r2 = r6.f4900h
            int r2 = r2 + r0
            r6.f4900h = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.e.v.a.B():java.lang.String");
    }

    public b C() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        switch (i2) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final char D() {
        int i2;
        int i3;
        if (this.f4900h != this.f4901i || b(1)) {
            char[] cArr = this.f4899g;
            int i4 = this.f4900h;
            int i5 = i4 + 1;
            this.f4900h = i5;
            char c = cArr[i4];
            if (c == 10) {
                this.f4902j++;
                this.f4903k = i5;
            } else if (!(c == '\"' || c == '\'' || c == '/' || c == '\\')) {
                if (c == 'b') {
                    return 8;
                }
                if (c == 'f') {
                    return 12;
                }
                if (c == 'n') {
                    return 10;
                }
                if (c == 'r') {
                    return 13;
                }
                if (c == 't') {
                    return 9;
                }
                if (c != 'u') {
                    b("Invalid escape sequence");
                    throw null;
                } else if (i5 + 4 <= this.f4901i || b(4)) {
                    char c2 = 0;
                    int i6 = this.f4900h;
                    int i7 = i6 + 4;
                    while (i6 < i7) {
                        char c3 = this.f4899g[i6];
                        char c4 = (char) (c2 << 4);
                        if (c3 < '0' || c3 > '9') {
                            if (c3 >= 'a' && c3 <= 'f') {
                                i3 = c3 - 'a';
                            } else if (c3 < 'A' || c3 > 'F') {
                                StringBuilder a = i.a.a.a.a.a("\\u");
                                a.append(new String(this.f4899g, this.f4900h, 4));
                                throw new NumberFormatException(a.toString());
                            } else {
                                i3 = c3 - 'A';
                            }
                            i2 = i3 + 10;
                        } else {
                            i2 = c3 - '0';
                        }
                        c2 = (char) (i2 + c4);
                        i6++;
                    }
                    this.f4900h += 4;
                    return c2;
                } else {
                    b("Unterminated escape sequence");
                    throw null;
                }
            }
            return c;
        }
        b("Unterminated escape sequence");
        throw null;
    }

    public final void E() {
        char c;
        do {
            if (this.f4900h < this.f4901i || b(1)) {
                char[] cArr = this.f4899g;
                int i2 = this.f4900h;
                int i3 = i2 + 1;
                this.f4900h = i3;
                c = cArr[i2];
                if (c == 10) {
                    this.f4902j++;
                    this.f4903k = i3;
                    return;
                }
            } else {
                return;
            }
        } while (c != 13);
    }

    public void F() {
        int i2;
        int i3 = 0;
        do {
            int i4 = this.f4904l;
            if (i4 == 0) {
                i4 = j();
            }
            if (i4 == 3) {
                c(1);
            } else if (i4 == 1) {
                c(3);
            } else {
                if (i4 == 4) {
                    this.f4909q--;
                } else if (i4 == 2) {
                    this.f4909q--;
                } else if (i4 == 14 || i4 == 10) {
                    while (true) {
                        i2 = 0;
                        while (true) {
                            int i5 = this.f4900h + i2;
                            if (i5 < this.f4901i) {
                                char c = this.f4899g[i5];
                                if (!(c == 9 || c == 10 || c == 12 || c == 13 || c == ' ')) {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (!(c == '/' || c == '=')) {
                                                if (!(c == '{' || c == '}' || c == ':')) {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                this.f4900h = i5;
                                if (!b(1)) {
                                }
                            }
                        }
                    }
                    h();
                    this.f4900h += i2;
                    this.f4904l = 0;
                } else if (i4 == 8 || i4 == 12) {
                    c('\'');
                    this.f4904l = 0;
                } else if (i4 == 9 || i4 == 13) {
                    c('\"');
                    this.f4904l = 0;
                } else {
                    if (i4 == 16) {
                        this.f4900h += this.f4906n;
                    }
                    this.f4904l = 0;
                }
                i3--;
                this.f4904l = 0;
            }
            i3++;
            this.f4904l = 0;
        } while (i3 != 0);
        int[] iArr = this.s;
        int i6 = this.f4909q;
        int i7 = i6 - 1;
        iArr[i7] = iArr[i7] + 1;
        this.r[i6 - 1] = "null";
    }

    public void a() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 3) {
            c(1);
            this.s[this.f4909q - 1] = 0;
            this.f4904l = 0;
            return;
        }
        StringBuilder a = i.a.a.a.a.a("Expected BEGIN_ARRAY but was ");
        a.append(C());
        a.append(t());
        throw new IllegalStateException(a.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005d, code lost:
        if (r2 != null) goto L_0x006d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        r2 = new java.lang.StringBuilder(java.lang.Math.max((r3 - r4) * 2, 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006d, code lost:
        r2.append(r0, r4, r3 - r4);
        r10.f4900h = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b(char r11) {
        /*
            r10 = this;
            char[] r0 = r10.f4899g
            r1 = 0
            r2 = r1
        L_0x0004:
            int r3 = r10.f4900h
            int r4 = r10.f4901i
        L_0x0008:
            r5 = r4
            r4 = r3
        L_0x000a:
            r6 = 16
            r7 = 1
            if (r3 >= r5) goto L_0x005d
            int r8 = r3 + 1
            char r3 = r0[r3]
            if (r3 != r11) goto L_0x0029
            r10.f4900h = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0021
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r4, r8)
            return r11
        L_0x0021:
            r2.append(r0, r4, r8)
            java.lang.String r11 = r2.toString()
            return r11
        L_0x0029:
            r9 = 92
            if (r3 != r9) goto L_0x0050
            r10.f4900h = r8
            int r8 = r8 - r4
            int r8 = r8 - r7
            if (r2 != 0) goto L_0x0041
            int r2 = r8 + 1
            int r2 = r2 * 2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r3.<init>(r2)
            r2 = r3
        L_0x0041:
            r2.append(r0, r4, r8)
            char r3 = r10.D()
            r2.append(r3)
            int r3 = r10.f4900h
            int r4 = r10.f4901i
            goto L_0x0008
        L_0x0050:
            r6 = 10
            if (r3 != r6) goto L_0x005b
            int r3 = r10.f4902j
            int r3 = r3 + r7
            r10.f4902j = r3
            r10.f4903k = r8
        L_0x005b:
            r3 = r8
            goto L_0x000a
        L_0x005d:
            if (r2 != 0) goto L_0x006d
            int r2 = r3 - r4
            int r2 = r2 * 2
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            int r2 = java.lang.Math.max(r2, r6)
            r5.<init>(r2)
            r2 = r5
        L_0x006d:
            int r5 = r3 - r4
            r2.append(r0, r4, r5)
            r10.f4900h = r3
            boolean r3 = r10.b((int) r7)
            if (r3 == 0) goto L_0x007b
            goto L_0x0004
        L_0x007b:
            java.lang.String r11 = "Unterminated string"
            r10.b((java.lang.String) r11)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.e.v.a.b(char):java.lang.String");
    }

    public final void c(char c) {
        char[] cArr = this.f4899g;
        do {
            int i2 = this.f4900h;
            int i3 = this.f4901i;
            while (i2 < i3) {
                int i4 = i2 + 1;
                char c2 = cArr[i2];
                if (c2 == c) {
                    this.f4900h = i4;
                    return;
                } else if (c2 == '\\') {
                    this.f4900h = i4;
                    D();
                    i2 = this.f4900h;
                    i3 = this.f4901i;
                } else {
                    if (c2 == 10) {
                        this.f4902j++;
                        this.f4903k = i4;
                    }
                    i2 = i4;
                }
            }
            this.f4900h = i2;
        } while (b(1));
        b("Unterminated string");
        throw null;
    }

    public void close() {
        this.f4904l = 0;
        this.f4908p[0] = 8;
        this.f4909q = 1;
        this.e.close();
    }

    public void f() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 1) {
            c(3);
            this.f4904l = 0;
            return;
        }
        StringBuilder a = i.a.a.a.a.a("Expected BEGIN_OBJECT but was ");
        a.append(C());
        a.append(t());
        throw new IllegalStateException(a.toString());
    }

    public final void h() {
        if (!this.f4898f) {
            b("Use JsonReader.setLenient(true) to accept malformed JSON");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0203, code lost:
        if (a(r6) != false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0205, code lost:
        if (r13 != 2) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0207, code lost:
        if (r15 == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x020d, code lost:
        if (r10 != Long.MIN_VALUE) goto L_0x0211;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x020f, code lost:
        if (r16 == false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0215, code lost:
        if (r10 != 0) goto L_0x0219;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0217, code lost:
        if (r16 != false) goto L_0x0229;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0219, code lost:
        if (r16 == false) goto L_0x021c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x021c, code lost:
        r10 = -r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x021d, code lost:
        r0.f4905m = r10;
        r0.f4900h += r9;
        r6 = 15;
        r0.f4904l = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0229, code lost:
        if (r13 == 2) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x022c, code lost:
        if (r13 == 4) goto L_0x0231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x022f, code lost:
        if (r13 != 7) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0231, code lost:
        r0.f4906n = r9;
        r6 = 16;
        r0.f4904l = 16;
     */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0174 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int j() {
        /*
            r19 = this;
            r0 = r19
            int[] r1 = r0.f4908p
            int r2 = r0.f4909q
            int r3 = r2 + -1
            r3 = r1[r3]
            r7 = 93
            r8 = 59
            r9 = 44
            r10 = 6
            r11 = 3
            r12 = 7
            r13 = 0
            r14 = 5
            r15 = 4
            r5 = 2
            r6 = 0
            r4 = 1
            if (r3 != r4) goto L_0x0020
            int r2 = r2 - r4
            r1[r2] = r5
            goto L_0x00d1
        L_0x0020:
            if (r3 != r5) goto L_0x003a
            int r1 = r0.a((boolean) r4)
            if (r1 == r9) goto L_0x00d1
            if (r1 == r8) goto L_0x0035
            if (r1 != r7) goto L_0x002f
            r0.f4904l = r15
            return r15
        L_0x002f:
            java.lang.String r1 = "Unterminated array"
            r0.b((java.lang.String) r1)
            throw r13
        L_0x0035:
            r19.h()
            goto L_0x00d1
        L_0x003a:
            if (r3 == r11) goto L_0x02ba
            if (r3 != r14) goto L_0x0040
            goto L_0x02ba
        L_0x0040:
            if (r3 != r15) goto L_0x0074
            int r2 = r2 - r4
            r1[r2] = r14
            int r1 = r0.a((boolean) r4)
            r2 = 58
            if (r1 == r2) goto L_0x00d1
            r2 = 61
            if (r1 != r2) goto L_0x006e
            r19.h()
            int r1 = r0.f4900h
            int r2 = r0.f4901i
            if (r1 < r2) goto L_0x0060
            boolean r1 = r0.b((int) r4)
            if (r1 == 0) goto L_0x00d1
        L_0x0060:
            char[] r1 = r0.f4899g
            int r2 = r0.f4900h
            char r1 = r1[r2]
            r15 = 62
            if (r1 != r15) goto L_0x00d1
            int r2 = r2 + r4
            r0.f4900h = r2
            goto L_0x00d1
        L_0x006e:
            java.lang.String r1 = "Expected ':'"
            r0.b((java.lang.String) r1)
            throw r13
        L_0x0074:
            if (r3 != r10) goto L_0x00b6
            boolean r1 = r0.f4898f
            if (r1 == 0) goto L_0x00ae
            r0.a((boolean) r4)
            int r1 = r0.f4900h
            int r1 = r1 - r4
            r0.f4900h = r1
            char[] r2 = t
            int r15 = r2.length
            int r1 = r1 + r15
            int r15 = r0.f4901i
            if (r1 <= r15) goto L_0x0092
            int r1 = r2.length
            boolean r1 = r0.b((int) r1)
            if (r1 != 0) goto L_0x0092
            goto L_0x00ae
        L_0x0092:
            r1 = 0
        L_0x0093:
            char[] r2 = t
            int r15 = r2.length
            if (r1 >= r15) goto L_0x00a8
            char[] r15 = r0.f4899g
            int r13 = r0.f4900h
            int r13 = r13 + r1
            char r13 = r15[r13]
            char r2 = r2[r1]
            if (r13 == r2) goto L_0x00a4
            goto L_0x00ae
        L_0x00a4:
            int r1 = r1 + 1
            r13 = 0
            goto L_0x0093
        L_0x00a8:
            int r1 = r0.f4900h
            int r2 = r2.length
            int r1 = r1 + r2
            r0.f4900h = r1
        L_0x00ae:
            int[] r1 = r0.f4908p
            int r2 = r0.f4909q
            int r2 = r2 - r4
            r1[r2] = r12
            goto L_0x00d1
        L_0x00b6:
            if (r3 != r12) goto L_0x00cd
            int r1 = r0.a((boolean) r6)
            r2 = -1
            if (r1 != r2) goto L_0x00c4
            r1 = 17
            r0.f4904l = r1
            return r1
        L_0x00c4:
            r19.h()
            int r1 = r0.f4900h
            int r1 = r1 - r4
            r0.f4900h = r1
            goto L_0x00d1
        L_0x00cd:
            r1 = 8
            if (r3 == r1) goto L_0x02b2
        L_0x00d1:
            int r1 = r0.a((boolean) r4)
            r2 = 34
            if (r1 == r2) goto L_0x02ad
            r2 = 39
            if (r1 == r2) goto L_0x02a5
            if (r1 == r9) goto L_0x028d
            if (r1 == r8) goto L_0x028d
            r2 = 91
            if (r1 == r2) goto L_0x0289
            if (r1 == r7) goto L_0x0283
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L_0x0280
            int r1 = r0.f4900h
            int r1 = r1 - r4
            r0.f4900h = r1
            char[] r2 = r0.f4899g
            char r1 = r2[r1]
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L_0x011a
            r2 = 84
            if (r1 != r2) goto L_0x00fd
            goto L_0x011a
        L_0x00fd:
            r2 = 102(0x66, float:1.43E-43)
            if (r1 == r2) goto L_0x0114
            r2 = 70
            if (r1 != r2) goto L_0x0106
            goto L_0x0114
        L_0x0106:
            r2 = 110(0x6e, float:1.54E-43)
            if (r1 == r2) goto L_0x010e
            r2 = 78
            if (r1 != r2) goto L_0x0169
        L_0x010e:
            java.lang.String r1 = "null"
            java.lang.String r2 = "NULL"
            r3 = 7
            goto L_0x011f
        L_0x0114:
            java.lang.String r1 = "false"
            java.lang.String r2 = "FALSE"
            r3 = 6
            goto L_0x011f
        L_0x011a:
            java.lang.String r1 = "true"
            java.lang.String r2 = "TRUE"
            r3 = 5
        L_0x011f:
            int r7 = r1.length()
            r8 = 1
        L_0x0124:
            if (r8 >= r7) goto L_0x014d
            int r9 = r0.f4900h
            int r9 = r9 + r8
            int r13 = r0.f4901i
            if (r9 < r13) goto L_0x0136
            int r9 = r8 + 1
            boolean r9 = r0.b((int) r9)
            if (r9 != 0) goto L_0x0136
            goto L_0x0169
        L_0x0136:
            char[] r9 = r0.f4899g
            int r13 = r0.f4900h
            int r13 = r13 + r8
            char r9 = r9[r13]
            char r13 = r1.charAt(r8)
            if (r9 == r13) goto L_0x014a
            char r13 = r2.charAt(r8)
            if (r9 == r13) goto L_0x014a
            goto L_0x0169
        L_0x014a:
            int r8 = r8 + 1
            goto L_0x0124
        L_0x014d:
            int r1 = r0.f4900h
            int r1 = r1 + r7
            int r2 = r0.f4901i
            if (r1 < r2) goto L_0x015c
            int r1 = r7 + 1
            boolean r1 = r0.b((int) r1)
            if (r1 == 0) goto L_0x016b
        L_0x015c:
            char[] r1 = r0.f4899g
            int r2 = r0.f4900h
            int r2 = r2 + r7
            char r1 = r1[r2]
            boolean r1 = r0.a((char) r1)
            if (r1 == 0) goto L_0x016b
        L_0x0169:
            r3 = 0
            goto L_0x0172
        L_0x016b:
            int r1 = r0.f4900h
            int r1 = r1 + r7
            r0.f4900h = r1
            r0.f4904l = r3
        L_0x0172:
            if (r3 == 0) goto L_0x0175
            return r3
        L_0x0175:
            char[] r1 = r0.f4899g
            int r2 = r0.f4900h
            int r3 = r0.f4901i
            r7 = 0
            r10 = r7
            r9 = 0
            r13 = 0
            r15 = 1
            r16 = 0
        L_0x0183:
            int r6 = r2 + r9
            if (r6 != r3) goto L_0x019b
            int r2 = r1.length
            if (r9 != r2) goto L_0x018d
        L_0x018a:
            r6 = 0
            goto L_0x0262
        L_0x018d:
            int r2 = r9 + 1
            boolean r2 = r0.b((int) r2)
            if (r2 != 0) goto L_0x0197
            goto L_0x0205
        L_0x0197:
            int r2 = r0.f4900h
            int r3 = r0.f4901i
        L_0x019b:
            int r6 = r2 + r9
            char r6 = r1[r6]
            r12 = 43
            if (r6 == r12) goto L_0x0255
            r12 = 69
            if (r6 == r12) goto L_0x024b
            r12 = 101(0x65, float:1.42E-43)
            if (r6 == r12) goto L_0x024b
            r12 = 45
            if (r6 == r12) goto L_0x023f
            r12 = 46
            if (r6 == r12) goto L_0x0238
            r12 = 48
            if (r6 < r12) goto L_0x01ff
            r12 = 57
            if (r6 <= r12) goto L_0x01bc
            goto L_0x01ff
        L_0x01bc:
            if (r13 == r4) goto L_0x01f5
            if (r13 != 0) goto L_0x01c1
            goto L_0x01f5
        L_0x01c1:
            if (r13 != r5) goto L_0x01e9
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r12 != 0) goto L_0x01c8
            goto L_0x018a
        L_0x01c8:
            r17 = 10
            long r17 = r17 * r10
            int r6 = r6 + -48
            long r7 = (long) r6
            long r17 = r17 - r7
            r6 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r8 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r8 > 0) goto L_0x01e3
            if (r8 != 0) goto L_0x01e1
            int r6 = (r17 > r10 ? 1 : (r17 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x01e1
            goto L_0x01e3
        L_0x01e1:
            r6 = 0
            goto L_0x01e4
        L_0x01e3:
            r6 = 1
        L_0x01e4:
            r15 = r15 & r6
            r10 = r17
            r7 = 6
            goto L_0x01fb
        L_0x01e9:
            r6 = 3
            r7 = 6
            if (r13 != r6) goto L_0x01ef
            r13 = 4
            goto L_0x01fb
        L_0x01ef:
            if (r13 == r14) goto L_0x01f3
            if (r13 != r7) goto L_0x01fb
        L_0x01f3:
            r13 = 7
            goto L_0x01fb
        L_0x01f5:
            r7 = 6
            int r6 = r6 + -48
            int r6 = -r6
            long r10 = (long) r6
            r13 = 2
        L_0x01fb:
            r17 = 0
            goto L_0x025b
        L_0x01ff:
            boolean r1 = r0.a((char) r6)
            if (r1 != 0) goto L_0x018a
        L_0x0205:
            if (r13 != r5) goto L_0x0229
            if (r15 == 0) goto L_0x0229
            r1 = -9223372036854775808
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x0211
            if (r16 == 0) goto L_0x0229
        L_0x0211:
            r17 = 0
            int r1 = (r10 > r17 ? 1 : (r10 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x0219
            if (r16 != 0) goto L_0x0229
        L_0x0219:
            if (r16 == 0) goto L_0x021c
            goto L_0x021d
        L_0x021c:
            long r10 = -r10
        L_0x021d:
            r0.f4905m = r10
            int r1 = r0.f4900h
            int r1 = r1 + r9
            r0.f4900h = r1
            r6 = 15
            r0.f4904l = r6
            goto L_0x0262
        L_0x0229:
            if (r13 == r5) goto L_0x0231
            r1 = 4
            if (r13 == r1) goto L_0x0231
            r1 = 7
            if (r13 != r1) goto L_0x018a
        L_0x0231:
            r0.f4906n = r9
            r6 = 16
            r0.f4904l = r6
            goto L_0x0262
        L_0x0238:
            r17 = r7
            r7 = 6
            if (r13 != r5) goto L_0x018a
            r13 = 3
            goto L_0x025b
        L_0x023f:
            r17 = r7
            r7 = 6
            if (r13 != 0) goto L_0x0248
            r13 = 1
            r16 = 1
            goto L_0x025b
        L_0x0248:
            if (r13 != r14) goto L_0x018a
            goto L_0x025a
        L_0x024b:
            r17 = r7
            r7 = 6
            if (r13 == r5) goto L_0x0253
            r6 = 4
            if (r13 != r6) goto L_0x018a
        L_0x0253:
            r13 = 5
            goto L_0x025b
        L_0x0255:
            r17 = r7
            r7 = 6
            if (r13 != r14) goto L_0x018a
        L_0x025a:
            r13 = 6
        L_0x025b:
            int r9 = r9 + 1
            r7 = r17
            r12 = 7
            goto L_0x0183
        L_0x0262:
            if (r6 == 0) goto L_0x0265
            return r6
        L_0x0265:
            char[] r1 = r0.f4899g
            int r2 = r0.f4900h
            char r1 = r1[r2]
            boolean r1 = r0.a((char) r1)
            if (r1 == 0) goto L_0x0279
            r19.h()
            r1 = 10
            r0.f4904l = r1
            return r1
        L_0x0279:
            java.lang.String r1 = "Expected value"
            r0.b((java.lang.String) r1)
            r1 = 0
            throw r1
        L_0x0280:
            r0.f4904l = r4
            return r4
        L_0x0283:
            if (r3 != r4) goto L_0x028d
            r1 = 4
            r0.f4904l = r1
            return r1
        L_0x0289:
            r1 = 3
            r0.f4904l = r1
            return r1
        L_0x028d:
            if (r3 == r4) goto L_0x0299
            if (r3 != r5) goto L_0x0292
            goto L_0x0299
        L_0x0292:
            java.lang.String r1 = "Unexpected value"
            r0.b((java.lang.String) r1)
            r1 = 0
            throw r1
        L_0x0299:
            r19.h()
            int r1 = r0.f4900h
            int r1 = r1 - r4
            r0.f4900h = r1
            r1 = 7
            r0.f4904l = r1
            return r1
        L_0x02a5:
            r19.h()
            r1 = 8
            r0.f4904l = r1
            return r1
        L_0x02ad:
            r1 = 9
            r0.f4904l = r1
            return r1
        L_0x02b2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "JsonReader is closed"
            r1.<init>(r2)
            throw r1
        L_0x02ba:
            int[] r1 = r0.f4908p
            int r2 = r0.f4909q
            int r2 = r2 - r4
            r6 = 4
            r1[r2] = r6
            r1 = 125(0x7d, float:1.75E-43)
            if (r3 != r14) goto L_0x02dd
            int r2 = r0.a((boolean) r4)
            if (r2 == r9) goto L_0x02dd
            if (r2 == r8) goto L_0x02da
            if (r2 != r1) goto L_0x02d3
            r0.f4904l = r5
            return r5
        L_0x02d3:
            java.lang.String r1 = "Unterminated object"
            r0.b((java.lang.String) r1)
            r1 = 0
            throw r1
        L_0x02da:
            r19.h()
        L_0x02dd:
            int r2 = r0.a((boolean) r4)
            r6 = 34
            if (r2 == r6) goto L_0x0318
            r6 = 39
            if (r2 == r6) goto L_0x0310
            java.lang.String r6 = "Expected name"
            if (r2 == r1) goto L_0x0306
            r19.h()
            int r1 = r0.f4900h
            int r1 = r1 - r4
            r0.f4900h = r1
            char r1 = (char) r2
            boolean r1 = r0.a((char) r1)
            if (r1 == 0) goto L_0x0301
            r1 = 14
            r0.f4904l = r1
            return r1
        L_0x0301:
            r0.b((java.lang.String) r6)
            r1 = 0
            throw r1
        L_0x0306:
            r1 = 0
            if (r3 == r14) goto L_0x030c
            r0.f4904l = r5
            return r5
        L_0x030c:
            r0.b((java.lang.String) r6)
            throw r1
        L_0x0310:
            r19.h()
            r1 = 12
            r0.f4904l = r1
            return r1
        L_0x0318:
            r1 = 13
            r0.f4904l = r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.e.v.a.j():int");
    }

    public void m() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 4) {
            int i3 = this.f4909q - 1;
            this.f4909q = i3;
            int[] iArr = this.s;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f4904l = 0;
            return;
        }
        StringBuilder a = i.a.a.a.a.a("Expected END_ARRAY but was ");
        a.append(C());
        a.append(t());
        throw new IllegalStateException(a.toString());
    }

    public void o() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 2) {
            int i3 = this.f4909q - 1;
            this.f4909q = i3;
            this.r[i3] = null;
            int[] iArr = this.s;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.f4904l = 0;
            return;
        }
        StringBuilder a = i.a.a.a.a.a("Expected END_OBJECT but was ");
        a.append(C());
        a.append(t());
        throw new IllegalStateException(a.toString());
    }

    public String q() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i2 = this.f4909q;
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = this.f4908p[i3];
            if (i4 == 1 || i4 == 2) {
                sb.append('[');
                sb.append(this.s[i3]);
                sb.append(']');
            } else if (i4 == 3 || i4 == 4 || i4 == 5) {
                sb.append('.');
                String[] strArr = this.r;
                if (strArr[i3] != null) {
                    sb.append(strArr[i3]);
                }
            }
        }
        return sb.toString();
    }

    public boolean s() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        return (i2 == 2 || i2 == 4) ? false : true;
    }

    public String t() {
        return " at line " + (this.f4902j + 1) + " column " + ((this.f4900h - this.f4903k) + 1) + " path " + q();
    }

    public String toString() {
        return getClass().getSimpleName() + t();
    }

    public boolean u() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 5) {
            this.f4904l = 0;
            int[] iArr = this.s;
            int i3 = this.f4909q - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.f4904l = 0;
            int[] iArr2 = this.s;
            int i4 = this.f4909q - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            StringBuilder a = i.a.a.a.a.a("Expected a boolean but was ");
            a.append(C());
            a.append(t());
            throw new IllegalStateException(a.toString());
        }
    }

    public double v() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 15) {
            this.f4904l = 0;
            int[] iArr = this.s;
            int i3 = this.f4909q - 1;
            iArr[i3] = iArr[i3] + 1;
            return (double) this.f4905m;
        }
        if (i2 == 16) {
            this.f4907o = new String(this.f4899g, this.f4900h, this.f4906n);
            this.f4900h += this.f4906n;
        } else if (i2 == 8 || i2 == 9) {
            this.f4907o = b(i2 == 8 ? '\'' : '\"');
        } else if (i2 == 10) {
            this.f4907o = B();
        } else if (i2 != 11) {
            StringBuilder a = i.a.a.a.a.a("Expected a double but was ");
            a.append(C());
            a.append(t());
            throw new IllegalStateException(a.toString());
        }
        this.f4904l = 11;
        double parseDouble = Double.parseDouble(this.f4907o);
        if (this.f4898f || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.f4907o = null;
            this.f4904l = 0;
            int[] iArr2 = this.s;
            int i4 = this.f4909q - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        }
        throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + t());
    }

    public int w() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 15) {
            long j2 = this.f4905m;
            int i3 = (int) j2;
            if (j2 == ((long) i3)) {
                this.f4904l = 0;
                int[] iArr = this.s;
                int i4 = this.f4909q - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            StringBuilder a = i.a.a.a.a.a("Expected an int but was ");
            a.append(this.f4905m);
            a.append(t());
            throw new NumberFormatException(a.toString());
        }
        if (i2 == 16) {
            this.f4907o = new String(this.f4899g, this.f4900h, this.f4906n);
            this.f4900h += this.f4906n;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                this.f4907o = B();
            } else {
                this.f4907o = b(i2 == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f4907o);
                this.f4904l = 0;
                int[] iArr2 = this.s;
                int i5 = this.f4909q - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder a2 = i.a.a.a.a.a("Expected an int but was ");
            a2.append(C());
            a2.append(t());
            throw new IllegalStateException(a2.toString());
        }
        this.f4904l = 11;
        double parseDouble = Double.parseDouble(this.f4907o);
        int i6 = (int) parseDouble;
        if (((double) i6) == parseDouble) {
            this.f4907o = null;
            this.f4904l = 0;
            int[] iArr3 = this.s;
            int i7 = this.f4909q - 1;
            iArr3[i7] = iArr3[i7] + 1;
            return i6;
        }
        StringBuilder a3 = i.a.a.a.a.a("Expected an int but was ");
        a3.append(this.f4907o);
        a3.append(t());
        throw new NumberFormatException(a3.toString());
    }

    public long x() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 15) {
            this.f4904l = 0;
            int[] iArr = this.s;
            int i3 = this.f4909q - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.f4905m;
        }
        if (i2 == 16) {
            this.f4907o = new String(this.f4899g, this.f4900h, this.f4906n);
            this.f4900h += this.f4906n;
        } else if (i2 == 8 || i2 == 9 || i2 == 10) {
            if (i2 == 10) {
                this.f4907o = B();
            } else {
                this.f4907o = b(i2 == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f4907o);
                this.f4904l = 0;
                int[] iArr2 = this.s;
                int i4 = this.f4909q - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            StringBuilder a = i.a.a.a.a.a("Expected a long but was ");
            a.append(C());
            a.append(t());
            throw new IllegalStateException(a.toString());
        }
        this.f4904l = 11;
        double parseDouble = Double.parseDouble(this.f4907o);
        long j2 = (long) parseDouble;
        if (((double) j2) == parseDouble) {
            this.f4907o = null;
            this.f4904l = 0;
            int[] iArr3 = this.s;
            int i5 = this.f4909q - 1;
            iArr3[i5] = iArr3[i5] + 1;
            return j2;
        }
        StringBuilder a2 = i.a.a.a.a.a("Expected a long but was ");
        a2.append(this.f4907o);
        a2.append(t());
        throw new NumberFormatException(a2.toString());
    }

    public String y() {
        String str;
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 14) {
            str = B();
        } else if (i2 == 12) {
            str = b('\'');
        } else if (i2 == 13) {
            str = b('\"');
        } else {
            StringBuilder a = i.a.a.a.a.a("Expected a name but was ");
            a.append(C());
            a.append(t());
            throw new IllegalStateException(a.toString());
        }
        this.f4904l = 0;
        this.r[this.f4909q - 1] = str;
        return str;
    }

    public void z() {
        int i2 = this.f4904l;
        if (i2 == 0) {
            i2 = j();
        }
        if (i2 == 7) {
            this.f4904l = 0;
            int[] iArr = this.s;
            int i3 = this.f4909q - 1;
            iArr[i3] = iArr[i3] + 1;
            return;
        }
        StringBuilder a = i.a.a.a.a.a("Expected null but was ");
        a.append(C());
        a.append(t());
        throw new IllegalStateException(a.toString());
    }

    public final boolean a(char c) {
        if (c == 9 || c == 10 || c == 12 || c == 13 || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (!(c == '/' || c == '=')) {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        h();
        return false;
    }

    public final int a(boolean z) {
        char[] cArr = this.f4899g;
        int i2 = this.f4900h;
        int i3 = this.f4901i;
        while (true) {
            boolean z2 = true;
            if (i2 == i3) {
                this.f4900h = i2;
                if (b(1)) {
                    i2 = this.f4900h;
                    i3 = this.f4901i;
                } else if (!z) {
                    return -1;
                } else {
                    StringBuilder a = i.a.a.a.a.a("End of input");
                    a.append(t());
                    throw new EOFException(a.toString());
                }
            }
            int i4 = i2 + 1;
            char c = cArr[i2];
            if (c == 10) {
                this.f4902j++;
                this.f4903k = i4;
            } else if (!(c == ' ' || c == 13 || c == 9)) {
                if (c == '/') {
                    this.f4900h = i4;
                    if (i4 == i3) {
                        this.f4900h = i4 - 1;
                        boolean b2 = b(2);
                        this.f4900h++;
                        if (!b2) {
                            return c;
                        }
                    }
                    h();
                    int i5 = this.f4900h;
                    char c2 = cArr[i5];
                    if (c2 == '*') {
                        this.f4900h = i5 + 1;
                        while (true) {
                            int i6 = 0;
                            if (this.f4900h + 2 > this.f4901i && !b(2)) {
                                z2 = false;
                                break;
                            }
                            char[] cArr2 = this.f4899g;
                            int i7 = this.f4900h;
                            if (cArr2[i7] != 10) {
                                while (i6 < 2) {
                                    if (this.f4899g[this.f4900h + i6] == "*/".charAt(i6)) {
                                        i6++;
                                    }
                                }
                                break;
                            }
                            this.f4902j++;
                            this.f4903k = i7 + 1;
                            this.f4900h++;
                        }
                        if (z2) {
                            i2 = this.f4900h + 2;
                            i3 = this.f4901i;
                        } else {
                            b("Unterminated comment");
                            throw null;
                        }
                    } else if (c2 != '/') {
                        return c;
                    } else {
                        this.f4900h = i5 + 1;
                        E();
                        i2 = this.f4900h;
                        i3 = this.f4901i;
                    }
                } else if (c == '#') {
                    this.f4900h = i4;
                    h();
                    E();
                    i2 = this.f4900h;
                    i3 = this.f4901i;
                } else {
                    this.f4900h = i4;
                    return c;
                }
            }
            i2 = i4;
        }
    }

    public final void c(int i2) {
        int i3 = this.f4909q;
        int[] iArr = this.f4908p;
        if (i3 == iArr.length) {
            int i4 = i3 * 2;
            this.f4908p = Arrays.copyOf(iArr, i4);
            this.s = Arrays.copyOf(this.s, i4);
            this.r = (String[]) Arrays.copyOf(this.r, i4);
        }
        int[] iArr2 = this.f4908p;
        int i5 = this.f4909q;
        this.f4909q = i5 + 1;
        iArr2[i5] = i2;
    }

    public final boolean b(int i2) {
        int i3;
        char[] cArr = this.f4899g;
        int i4 = this.f4903k;
        int i5 = this.f4900h;
        this.f4903k = i4 - i5;
        int i6 = this.f4901i;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f4901i = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f4901i = 0;
        }
        this.f4900h = 0;
        do {
            Reader reader = this.e;
            int i8 = this.f4901i;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            int i9 = this.f4901i + read;
            this.f4901i = i9;
            if (this.f4902j == 0 && (i3 = this.f4903k) == 0 && i9 > 0 && cArr[0] == 65279) {
                this.f4900h++;
                this.f4903k = i3 + 1;
                i2++;
            }
        } while (this.f4901i < i2);
        return true;
    }

    public final IOException b(String str) {
        StringBuilder a = i.a.a.a.a.a(str);
        a.append(t());
        throw new MalformedJsonException(a.toString());
    }
}
