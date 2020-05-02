package o;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import o.o0.e;
import p.c0;
import p.f;

/* compiled from: HttpUrl */
public final class y {

    /* renamed from: j  reason: collision with root package name */
    public static final char[] f5622j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5623b;
    public final String c;
    public final String d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final List<String> f5624f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public final List<String> f5625g;
    @Nullable

    /* renamed from: h  reason: collision with root package name */
    public final String f5626h;

    /* renamed from: i  reason: collision with root package name */
    public final String f5627i;

    public y(a aVar) {
        this.a = aVar.a;
        this.f5623b = a(aVar.f5628b, false);
        this.c = a(aVar.c, false);
        this.d = aVar.d;
        int i2 = aVar.e;
        this.e = i2 == -1 ? b(aVar.a) : i2;
        this.f5624f = a(aVar.f5629f, false);
        List<String> list = aVar.f5630g;
        String str = null;
        this.f5625g = list != null ? a(list, true) : null;
        String str2 = aVar.f5631h;
        this.f5626h = str2 != null ? a(str2, 0, str2.length(), false) : str;
        this.f5627i = aVar.toString();
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    public String a() {
        if (this.c.isEmpty()) {
            return "";
        }
        int indexOf = this.f5627i.indexOf(64);
        return this.f5627i.substring(this.f5627i.indexOf(58, this.a.length() + 3) + 1, indexOf);
    }

    public List<String> c() {
        int indexOf = this.f5627i.indexOf(47, this.a.length() + 3);
        String str = this.f5627i;
        int a2 = e.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            int a3 = e.a(this.f5627i, i2, a2, '/');
            arrayList.add(this.f5627i.substring(i2, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    @Nullable
    public String d() {
        if (this.f5625g == null) {
            return null;
        }
        int indexOf = this.f5627i.indexOf(63) + 1;
        String str = this.f5627i;
        return this.f5627i.substring(indexOf, e.a(str, indexOf, str.length(), '#'));
    }

    public String e() {
        if (this.f5623b.isEmpty()) {
            return "";
        }
        int length = this.a.length() + 3;
        String str = this.f5627i;
        return this.f5627i.substring(length, e.a(str, length, str.length(), ":@"));
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof y) && ((y) obj).f5627i.equals(this.f5627i);
    }

    public String f() {
        a a2 = a("/...");
        if (a2 != null) {
            a2.f5628b = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            a2.c = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return a2.a().f5627i;
        }
        throw null;
    }

    public URI g() {
        String str;
        a aVar = new a();
        aVar.a = this.a;
        aVar.f5628b = e();
        aVar.c = a();
        aVar.d = this.d;
        aVar.e = this.e != b(this.a) ? this.e : -1;
        aVar.f5629f.clear();
        aVar.f5629f.addAll(c());
        aVar.a(d());
        if (this.f5626h == null) {
            str = null;
        } else {
            str = this.f5627i.substring(this.f5627i.indexOf(35) + 1);
        }
        aVar.f5631h = str;
        int size = aVar.f5629f.size();
        for (int i2 = 0; i2 < size; i2++) {
            aVar.f5629f.set(i2, a(aVar.f5629f.get(i2), "[]", true, true, false, true));
        }
        List<String> list = aVar.f5630g;
        if (list != null) {
            int size2 = list.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str2 = aVar.f5630g.get(i3);
                if (str2 != null) {
                    aVar.f5630g.set(i3, a(str2, "\\^`{|}", true, true, true, true));
                }
            }
        }
        String str3 = aVar.f5631h;
        if (str3 != null) {
            aVar.f5631h = a(str3, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }

    public int hashCode() {
        return this.f5627i.hashCode();
    }

    public String toString() {
        return this.f5627i;
    }

    /* compiled from: HttpUrl */
    public static final class a {
        @Nullable
        public String a;

        /* renamed from: b  reason: collision with root package name */
        public String f5628b = "";
        public String c = "";
        @Nullable
        public String d;
        public int e = -1;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f5629f;
        @Nullable

        /* renamed from: g  reason: collision with root package name */
        public List<String> f5630g;
        @Nullable

        /* renamed from: h  reason: collision with root package name */
        public String f5631h;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f5629f = arrayList;
            arrayList.add("");
        }

        public a a(@Nullable String str) {
            this.f5630g = str != null ? y.d(y.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.f5628b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.f5628b);
                if (!this.c.isEmpty()) {
                    sb.append(':');
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append('[');
                    sb.append(this.d);
                    sb.append(']');
                } else {
                    sb.append(this.d);
                }
            }
            if (!(this.e == -1 && this.a == null)) {
                int i2 = this.e;
                if (i2 == -1) {
                    i2 = y.b(this.a);
                }
                String str3 = this.a;
                if (str3 == null || i2 != y.b(str3)) {
                    sb.append(':');
                    sb.append(i2);
                }
            }
            List<String> list = this.f5629f;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append('/');
                sb.append(list.get(i3));
            }
            if (this.f5630g != null) {
                sb.append('?');
                y.a(sb, this.f5630g);
            }
            if (this.f5631h != null) {
                sb.append('#');
                sb.append(this.f5631h);
            }
            return sb.toString();
        }

        public y a() {
            if (this.a == null) {
                throw new IllegalStateException("scheme == null");
            } else if (this.d != null) {
                return new y(this);
            } else {
                throw new IllegalStateException("host == null");
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:105:0x0216, code lost:
            if (r1 <= 65535) goto L_0x021e;
         */
        /* JADX WARNING: Removed duplicated region for block: B:100:0x01f1  */
        /* JADX WARNING: Removed duplicated region for block: B:112:0x023e  */
        /* JADX WARNING: Removed duplicated region for block: B:115:0x0254  */
        /* JADX WARNING: Removed duplicated region for block: B:128:0x02a2  */
        /* JADX WARNING: Removed duplicated region for block: B:164:0x035c  */
        /* JADX WARNING: Removed duplicated region for block: B:175:0x03a2  */
        /* JADX WARNING: Removed duplicated region for block: B:199:0x01ea A[SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00ac  */
        /* JADX WARNING: Removed duplicated region for block: B:61:0x011e  */
        /* JADX WARNING: Removed duplicated region for block: B:62:0x0123  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01cc  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public o.y.a a(@javax.annotation.Nullable o.y r22, java.lang.String r23) {
            /*
                r21 = this;
                r0 = r21
                r1 = r22
                r10 = r23
                int r2 = r23.length()
                r8 = 0
                int r9 = o.o0.e.b((java.lang.String) r10, (int) r8, (int) r2)
                int r2 = r23.length()
                int r11 = o.o0.e.c(r10, r9, r2)
                int r2 = r11 - r9
                r12 = 2
                r13 = 58
                r14 = -1
                if (r2 >= r12) goto L_0x0020
                goto L_0x0062
            L_0x0020:
                char r2 = r10.charAt(r9)
                r3 = 90
                r4 = 122(0x7a, float:1.71E-43)
                r5 = 65
                r6 = 97
                if (r2 < r6) goto L_0x0030
                if (r2 <= r4) goto L_0x0035
            L_0x0030:
                if (r2 < r5) goto L_0x0062
                if (r2 <= r3) goto L_0x0035
                goto L_0x0062
            L_0x0035:
                r2 = r9
            L_0x0036:
                int r2 = r2 + 1
                if (r2 >= r11) goto L_0x0062
                char r7 = r10.charAt(r2)
                if (r7 < r6) goto L_0x0042
                if (r7 <= r4) goto L_0x005f
            L_0x0042:
                if (r7 < r5) goto L_0x0046
                if (r7 <= r3) goto L_0x005f
            L_0x0046:
                r3 = 48
                if (r7 < r3) goto L_0x004e
                r3 = 57
                if (r7 <= r3) goto L_0x005f
            L_0x004e:
                r3 = 43
                if (r7 == r3) goto L_0x005f
                r3 = 45
                if (r7 == r3) goto L_0x005f
                r3 = 46
                if (r7 != r3) goto L_0x005b
                goto L_0x005f
            L_0x005b:
                if (r7 != r13) goto L_0x0062
                r15 = r2
                goto L_0x0064
            L_0x005f:
                r3 = 90
                goto L_0x0036
            L_0x0062:
                r2 = -1
                r15 = -1
            L_0x0064:
                if (r15 == r14) goto L_0x00ac
                r3 = 1
                r6 = 0
                r7 = 6
                java.lang.String r5 = "https:"
                r2 = r23
                r4 = r9
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x007b
                java.lang.String r2 = "https"
                r0.a = r2
                int r9 = r9 + 6
                goto L_0x00b2
            L_0x007b:
                r3 = 1
                r6 = 0
                r7 = 5
                java.lang.String r5 = "http:"
                r2 = r23
                r4 = r9
                boolean r2 = r2.regionMatches(r3, r4, r5, r6, r7)
                if (r2 == 0) goto L_0x0090
                java.lang.String r2 = "http"
                r0.a = r2
                int r9 = r9 + 5
                goto L_0x00b2
            L_0x0090:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but was '"
                java.lang.StringBuilder r2 = i.a.a.a.a.a(r2)
                java.lang.String r3 = r10.substring(r8, r15)
                r2.append(r3)
                java.lang.String r3 = "'"
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x00ac:
                if (r1 == 0) goto L_0x03bc
                java.lang.String r2 = r1.a
                r0.a = r2
            L_0x00b2:
                r2 = 0
                r3 = r9
            L_0x00b4:
                r4 = 47
                r5 = 92
                if (r3 >= r11) goto L_0x00c7
                char r6 = r10.charAt(r3)
                if (r6 == r5) goto L_0x00c2
                if (r6 != r4) goto L_0x00c7
            L_0x00c2:
                int r2 = r2 + 1
                int r3 = r3 + 1
                goto L_0x00b4
            L_0x00c7:
                r3 = 63
                r6 = 35
                if (r2 >= r12) goto L_0x010f
                if (r1 == 0) goto L_0x010f
                java.lang.String r7 = r1.a
                java.lang.String r8 = r0.a
                boolean r7 = r7.equals(r8)
                if (r7 != 0) goto L_0x00da
                goto L_0x010f
            L_0x00da:
                java.lang.String r2 = r22.e()
                r0.f5628b = r2
                java.lang.String r2 = r22.a()
                r0.c = r2
                java.lang.String r2 = r1.d
                r0.d = r2
                int r2 = r1.e
                r0.e = r2
                java.util.List<java.lang.String> r2 = r0.f5629f
                r2.clear()
                java.util.List<java.lang.String> r2 = r0.f5629f
                java.util.List r3 = r22.c()
                r2.addAll(r3)
                if (r9 == r11) goto L_0x0104
                char r2 = r10.charAt(r9)
                if (r2 != r6) goto L_0x010b
            L_0x0104:
                java.lang.String r1 = r22.d()
                r0.a(r1)
            L_0x010b:
                r17 = r11
                goto L_0x0255
            L_0x010f:
                int r9 = r9 + r2
                r1 = 0
                r2 = 0
                r14 = r9
                r1 = -1
                r12 = 0
                r15 = 0
            L_0x0116:
                java.lang.String r2 = "@/\\?#"
                int r9 = o.o0.e.a((java.lang.String) r10, (int) r14, (int) r11, (java.lang.String) r2)
                if (r9 == r11) goto L_0x0123
                char r2 = r10.charAt(r9)
                goto L_0x0124
            L_0x0123:
                r2 = -1
            L_0x0124:
                if (r2 == r1) goto L_0x01c8
                if (r2 == r6) goto L_0x01c8
                if (r2 == r4) goto L_0x01c8
                if (r2 == r5) goto L_0x01c8
                if (r2 == r3) goto L_0x01c8
                r1 = 64
                if (r2 == r1) goto L_0x0134
                goto L_0x01bb
            L_0x0134:
                java.lang.String r8 = "%40"
                if (r12 != 0) goto L_0x018b
                int r7 = o.o0.e.a((java.lang.String) r10, (int) r14, (int) r9, (char) r13)
                r5 = 1
                r6 = 0
                r16 = 0
                r17 = 1
                r18 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r23
                r2 = r14
                r3 = r7
                r14 = r7
                r7 = r16
                r13 = r8
                r8 = r17
                r22 = r12
                r12 = r9
                r9 = r18
                java.lang.String r1 = o.y.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                if (r15 == 0) goto L_0x016f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r0.f5628b
                r2.append(r3)
                r2.append(r13)
                r2.append(r1)
                java.lang.String r1 = r2.toString()
            L_0x016f:
                r0.f5628b = r1
                if (r14 == r12) goto L_0x0187
                int r2 = r14 + 1
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r9 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r23
                r3 = r12
                java.lang.String r1 = o.y.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r0.c = r1
                r1 = 1
                goto L_0x0189
            L_0x0187:
                r1 = r22
            L_0x0189:
                r15 = 1
                goto L_0x01b8
            L_0x018b:
                r13 = r8
                r22 = r12
                r12 = r9
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                java.lang.String r1 = r0.c
                r9.append(r1)
                r9.append(r13)
                r5 = 1
                r6 = 0
                r7 = 0
                r8 = 1
                r13 = 0
                java.lang.String r4 = " \"':;<=>@[]^`{}|/\\?#"
                r1 = r23
                r2 = r14
                r3 = r12
                r14 = r9
                r9 = r13
                java.lang.String r1 = o.y.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                r14.append(r1)
                java.lang.String r1 = r14.toString()
                r0.c = r1
                r1 = r22
            L_0x01b8:
                int r14 = r12 + 1
                r12 = r1
            L_0x01bb:
                r6 = 35
                r3 = 63
                r5 = 92
                r1 = -1
                r4 = 47
                r13 = 58
                goto L_0x0116
            L_0x01c8:
                r12 = r9
                r9 = r14
            L_0x01ca:
                if (r9 >= r12) goto L_0x01ea
                char r1 = r10.charAt(r9)
                r2 = 58
                if (r1 == r2) goto L_0x01e8
                r3 = 91
                if (r1 == r3) goto L_0x01da
                r1 = 1
                goto L_0x01e6
            L_0x01da:
                r1 = 1
            L_0x01db:
                int r9 = r9 + r1
                if (r9 >= r12) goto L_0x01e6
                char r3 = r10.charAt(r9)
                r4 = 93
                if (r3 != r4) goto L_0x01db
            L_0x01e6:
                int r9 = r9 + r1
                goto L_0x01ca
            L_0x01e8:
                r13 = r9
                goto L_0x01eb
            L_0x01ea:
                r13 = r12
            L_0x01eb:
                int r15 = r13 + 1
                r9 = 34
                if (r15 >= r12) goto L_0x023e
                java.lang.String r1 = a(r10, r14, r13)
                r0.d = r1
                java.lang.String r4 = ""
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 1
                r16 = 0
                r1 = r23
                r2 = r15
                r3 = r12
                r17 = r11
                r11 = 34
                r9 = r16
                java.lang.String r1 = o.y.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ NumberFormatException -> 0x021d }
                int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x021d }
                if (r1 <= 0) goto L_0x021d
                r2 = 65535(0xffff, float:9.1834E-41)
                if (r1 > r2) goto L_0x021d
                goto L_0x021e
            L_0x0219:
                r17 = r11
                r11 = 34
            L_0x021d:
                r1 = -1
            L_0x021e:
                r0.e = r1
                r2 = -1
                if (r1 == r2) goto L_0x0224
                goto L_0x0250
            L_0x0224:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid URL port: \""
                java.lang.StringBuilder r2 = i.a.a.a.a.a(r2)
                java.lang.String r3 = r10.substring(r15, r12)
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x023e:
                r17 = r11
                r11 = 34
                java.lang.String r1 = a(r10, r14, r13)
                r0.d = r1
                java.lang.String r1 = r0.a
                int r1 = o.y.b(r1)
                r0.e = r1
            L_0x0250:
                java.lang.String r1 = r0.d
                if (r1 == 0) goto L_0x03a2
                r9 = r12
            L_0x0255:
                java.lang.String r1 = "?#"
                r2 = r17
                int r1 = o.o0.e.a((java.lang.String) r10, (int) r9, (int) r2, (java.lang.String) r1)
                if (r9 != r1) goto L_0x0266
                r13 = r0
                r3 = r1
                r12 = r2
                r1 = r10
                r2 = r1
                goto L_0x035f
            L_0x0266:
                char r3 = r10.charAt(r9)
                java.lang.String r4 = ""
                r5 = 47
                if (r3 == r5) goto L_0x028a
                r5 = 92
                if (r3 != r5) goto L_0x0275
                goto L_0x028a
            L_0x0275:
                java.util.List<java.lang.String> r3 = r0.f5629f
                int r5 = r3.size()
                int r5 = r5 + -1
                r3.set(r5, r4)
                r7 = r0
                r8 = r7
                r3 = r1
                r11 = r2
                r6 = r4
                r13 = r9
                r2 = r10
                r4 = r3
                r1 = r2
                goto L_0x02a0
            L_0x028a:
                r3 = 1
                java.util.List<java.lang.String> r5 = r0.f5629f
                r5.clear()
                java.util.List<java.lang.String> r5 = r0.f5629f
                r5.add(r4)
                r7 = r0
                r8 = r7
                r3 = r1
                r11 = r2
                r6 = r4
                r2 = r10
                r5 = 1
                r4 = r3
                r1 = r2
            L_0x029e:
                int r9 = r9 + r5
            L_0x029f:
                r13 = r9
            L_0x02a0:
                if (r13 >= r4) goto L_0x035c
                java.lang.String r5 = "/\\"
                int r9 = o.o0.e.a((java.lang.String) r1, (int) r13, (int) r4, (java.lang.String) r5)
                if (r9 >= r4) goto L_0x02ac
                r5 = 1
                goto L_0x02ad
            L_0x02ac:
                r5 = 0
            L_0x02ad:
                r16 = 1
                r17 = 0
                r18 = 0
                r19 = 1
                r20 = 0
                java.lang.String r15 = " \"<>^`{}|/\\?#"
                r12 = r1
                r14 = r9
                java.lang.String r12 = o.y.a(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                java.lang.String r13 = "."
                boolean r13 = r12.equals(r13)
                if (r13 != 0) goto L_0x02d2
                java.lang.String r13 = "%2e"
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 == 0) goto L_0x02d0
                goto L_0x02d2
            L_0x02d0:
                r13 = 0
                goto L_0x02d3
            L_0x02d2:
                r13 = 1
            L_0x02d3:
                if (r13 == 0) goto L_0x02d7
                goto L_0x0357
            L_0x02d7:
                java.lang.String r13 = ".."
                boolean r13 = r12.equals(r13)
                if (r13 != 0) goto L_0x02fa
                java.lang.String r13 = "%2e."
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 != 0) goto L_0x02fa
                java.lang.String r13 = ".%2e"
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 != 0) goto L_0x02fa
                java.lang.String r13 = "%2e%2e"
                boolean r13 = r12.equalsIgnoreCase(r13)
                if (r13 == 0) goto L_0x02f8
                goto L_0x02fa
            L_0x02f8:
                r13 = 0
                goto L_0x02fb
            L_0x02fa:
                r13 = 1
            L_0x02fb:
                if (r13 == 0) goto L_0x032b
                java.util.List<java.lang.String> r12 = r8.f5629f
                int r13 = r12.size()
                int r13 = r13 + -1
                java.lang.Object r12 = r12.remove(r13)
                java.lang.String r12 = (java.lang.String) r12
                boolean r12 = r12.isEmpty()
                if (r12 == 0) goto L_0x0325
                java.util.List<java.lang.String> r12 = r8.f5629f
                boolean r12 = r12.isEmpty()
                if (r12 != 0) goto L_0x0325
                java.util.List<java.lang.String> r12 = r8.f5629f
                int r13 = r12.size()
                int r13 = r13 + -1
                r12.set(r13, r6)
                goto L_0x0357
            L_0x0325:
                java.util.List<java.lang.String> r12 = r8.f5629f
                r12.add(r6)
                goto L_0x0357
            L_0x032b:
                java.util.List<java.lang.String> r13 = r8.f5629f
                int r14 = r13.size()
                int r14 = r14 + -1
                java.lang.Object r13 = r13.get(r14)
                java.lang.String r13 = (java.lang.String) r13
                boolean r13 = r13.isEmpty()
                if (r13 == 0) goto L_0x034b
                java.util.List<java.lang.String> r13 = r8.f5629f
                int r14 = r13.size()
                int r14 = r14 + -1
                r13.set(r14, r12)
                goto L_0x0350
            L_0x034b:
                java.util.List<java.lang.String> r13 = r8.f5629f
                r13.add(r12)
            L_0x0350:
                if (r5 == 0) goto L_0x0357
                java.util.List<java.lang.String> r12 = r8.f5629f
                r12.add(r6)
            L_0x0357:
                if (r5 == 0) goto L_0x029f
                r5 = 1
                goto L_0x029e
            L_0x035c:
                r13 = r7
                r1 = r10
                r12 = r11
            L_0x035f:
                if (r3 >= r12) goto L_0x0386
                char r4 = r2.charAt(r3)
                r5 = 63
                if (r4 != r5) goto L_0x0386
                r14 = 35
                int r15 = o.o0.e.a((java.lang.String) r2, (int) r3, (int) r12, (char) r14)
                int r4 = r3 + 1
                r7 = 1
                r8 = 0
                r9 = 1
                r10 = 1
                r11 = 0
                java.lang.String r6 = " \"'<>#"
                r3 = r1
                r5 = r15
                java.lang.String r3 = o.y.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                java.util.List r3 = o.y.d(r3)
                r13.f5630g = r3
                r3 = r15
                goto L_0x0388
            L_0x0386:
                r14 = 35
            L_0x0388:
                if (r3 >= r12) goto L_0x03a1
                char r2 = r2.charAt(r3)
                if (r2 != r14) goto L_0x03a1
                int r4 = r3 + 1
                r7 = 1
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                java.lang.String r6 = ""
                r3 = r1
                r5 = r12
                java.lang.String r1 = o.y.a(r3, r4, r5, r6, r7, r8, r9, r10, r11)
                r13.f5631h = r1
            L_0x03a1:
                return r13
            L_0x03a2:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Invalid URL host: \""
                java.lang.StringBuilder r2 = i.a.a.a.a.a(r2)
                java.lang.String r3 = r10.substring(r14, r13)
                r2.append(r3)
                r2.append(r11)
                java.lang.String r2 = r2.toString()
                r1.<init>(r2)
                throw r1
            L_0x03bc:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Expected URL scheme 'http' or 'https' but no colon was found"
                r1.<init>(r2)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: o.y.a.a(o.y, java.lang.String):o.y$a");
        }

        @Nullable
        public static String a(String str, int i2, int i3) {
            return e.a(y.a(str, i2, i3, false));
        }
    }

    public String b() {
        int indexOf = this.f5627i.indexOf(47, this.a.length() + 3);
        String str = this.f5627i;
        return this.f5627i.substring(indexOf, e.a(str, indexOf, str.length(), "?#"));
    }

    public static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
        }
    }

    public static List<String> d(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add((Object) null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public static y c(String str) {
        a aVar = new a();
        aVar.a((y) null, str);
        return aVar.a();
    }

    @Nullable
    public a a(String str) {
        try {
            a aVar = new a();
            aVar.a(this, str);
            return aVar;
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    public final List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? a(str, 0, str.length(), z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static String a(String str, int i2, int i3, boolean z) {
        int i4;
        int i5 = i2;
        while (i5 < i3) {
            char charAt = str.charAt(i5);
            if (charAt == '%' || (charAt == '+' && z)) {
                f fVar = new f();
                fVar.a(str, i2, i5);
                while (i5 < i3) {
                    int codePointAt = str.codePointAt(i5);
                    if (codePointAt == 37 && (i4 = i5 + 2) < i3) {
                        int a2 = e.a(str.charAt(i5 + 1));
                        int a3 = e.a(str.charAt(i4));
                        if (!(a2 == -1 || a3 == -1)) {
                            fVar.writeByte((a2 << 4) + a3);
                            i5 = i4;
                            i5 += Character.charCount(codePointAt);
                        }
                    } else if (codePointAt == 43 && z) {
                        fVar.writeByte(32);
                        i5 += Character.charCount(codePointAt);
                    }
                    fVar.c(codePointAt);
                    i5 += Character.charCount(codePointAt);
                }
                return fVar.s();
            }
            i5++;
        }
        return str.substring(i2, i3);
    }

    public static boolean a(String str, int i2, int i3) {
        int i4 = i2 + 2;
        if (i4 >= i3 || str.charAt(i2) != '%' || e.a(str.charAt(i2 + 1)) == -1 || e.a(str.charAt(i4)) == -1) {
            return false;
        }
        return true;
    }

    public static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        String str3 = str;
        int i4 = i3;
        String str4 = str2;
        Charset charset2 = charset;
        int i5 = i2;
        while (i5 < i4) {
            int codePointAt = str3.codePointAt(i5);
            int i6 = -1;
            if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str4.indexOf(codePointAt) != -1 || ((codePointAt == 37 && (!z || (z2 && !a(str3, i5, i4)))) || (codePointAt == 43 && z3)))) {
                f fVar = new f();
                fVar.a(str3, i2, i5);
                f fVar2 = null;
                while (i5 < i4) {
                    int codePointAt2 = str3.codePointAt(i5);
                    if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                        if (codePointAt2 == 43 && z3) {
                            fVar.a(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str4.indexOf(codePointAt2) != i6 || (codePointAt2 == 37 && (!z || (z2 && !a(str3, i5, i4)))))) {
                            if (fVar2 == null) {
                                fVar2 = new f();
                            }
                            if (charset2 == null || charset2.equals(StandardCharsets.UTF_8)) {
                                fVar2.c(codePointAt2);
                            } else {
                                int charCount = Character.charCount(codePointAt2) + i5;
                                if (i5 < 0) {
                                    throw new IllegalAccessError(i.a.a.a.a.b("beginIndex < 0: ", i5));
                                } else if (charCount < i5) {
                                    throw new IllegalArgumentException("endIndex < beginIndex: " + charCount + " < " + i5);
                                } else if (charCount > str.length()) {
                                    throw new IllegalArgumentException("endIndex > string.length: " + charCount + " > " + str.length());
                                } else if (charset2.equals(c0.a)) {
                                    fVar2.a(str3, i5, charCount);
                                } else {
                                    byte[] bytes = str3.substring(i5, charCount).getBytes(charset2);
                                    fVar2.write(bytes, 0, bytes.length);
                                }
                            }
                            while (!fVar2.l()) {
                                byte readByte = fVar2.readByte() & 255;
                                fVar.writeByte(37);
                                fVar.writeByte((int) f5622j[(readByte >> 4) & 15]);
                                fVar.writeByte((int) f5622j[readByte & 15]);
                            }
                        } else {
                            fVar.c(codePointAt2);
                        }
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = -1;
                }
                return fVar.s();
            }
            i5 += Character.charCount(codePointAt);
        }
        int i7 = i2;
        return str.substring(i2, i3);
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, @Nullable Charset charset) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, charset);
    }

    public static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, (Charset) null);
    }
}
