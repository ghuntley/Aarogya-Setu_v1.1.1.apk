package o;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.o0.e;
import o.o0.h.d;

/* compiled from: Cookie */
public final class p {

    /* renamed from: j  reason: collision with root package name */
    public static final Pattern f5603j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k  reason: collision with root package name */
    public static final Pattern f5604k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l  reason: collision with root package name */
    public static final Pattern f5605l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f5606m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5607b;
    public final long c;
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5608f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5609g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5610h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5611i;

    public p(String str, String str2, long j2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = str;
        this.f5607b = str2;
        this.c = j2;
        this.d = str3;
        this.e = str4;
        this.f5608f = z;
        this.f5609g = z2;
        this.f5611i = z3;
        this.f5610h = z4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01b5, code lost:
        if ((r0.equals(r9) || (r0.endsWith(r9) && r0.charAt((r0.length() - r9.length()) - 1) == '.' && !o.o0.e.f5386k.matcher(r0).matches())) == false) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0218, code lost:
        if (r0 == null) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        if (r19 <= 0) goto L_0x00ec;
     */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x025c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<o.p> a(o.y r33, o.x r34) {
        /*
            r0 = r34
            int r1 = r34.b()
            r2 = 0
            r4 = 0
            r5 = 0
        L_0x0009:
            if (r4 >= r1) goto L_0x0029
            java.lang.String r6 = r0.a((int) r4)
            java.lang.String r7 = "Set-Cookie"
            boolean r6 = r7.equalsIgnoreCase(r6)
            if (r6 == 0) goto L_0x0026
            if (r5 != 0) goto L_0x001f
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 2
            r5.<init>(r6)
        L_0x001f:
            java.lang.String r6 = r0.b((int) r4)
            r5.add(r6)
        L_0x0026:
            int r4 = r4 + 1
            goto L_0x0009
        L_0x0029:
            if (r5 == 0) goto L_0x0030
            java.util.List r0 = java.util.Collections.unmodifiableList(r5)
            goto L_0x0034
        L_0x0030:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0034:
            r1 = r0
            int r4 = r1.size()
            r5 = 0
            r6 = 0
        L_0x003b:
            if (r5 >= r4) goto L_0x0260
            java.lang.Object r0 = r1.get(r5)
            r7 = r0
            java.lang.String r7 = (java.lang.String) r7
            long r8 = java.lang.System.currentTimeMillis()
            int r10 = r7.length()
            r11 = 59
            int r0 = o.o0.e.a((java.lang.String) r7, (int) r2, (int) r10, (char) r11)
            r12 = 61
            int r13 = o.o0.e.a((java.lang.String) r7, (int) r2, (int) r0, (char) r12)
            if (r13 != r0) goto L_0x005e
        L_0x005a:
            r7 = r33
            goto L_0x021a
        L_0x005e:
            java.lang.String r15 = o.o0.e.d(r7, r2, r13)
            boolean r14 = r15.isEmpty()
            if (r14 != 0) goto L_0x024b
            int r14 = o.o0.e.b((java.lang.String) r15)
            r3 = -1
            if (r14 == r3) goto L_0x0071
            goto L_0x024b
        L_0x0071:
            int r13 = r13 + 1
            java.lang.String r16 = o.o0.e.d(r7, r13, r0)
            int r13 = o.o0.e.b((java.lang.String) r16)
            if (r13 == r3) goto L_0x007e
            goto L_0x005a
        L_0x007e:
            int r0 = r0 + 1
            r17 = 253402300799999(0xe677d21fdbff, double:1.251973714024093E-309)
            r3 = 1
            r25 = r17
            r19 = -1
            r21 = 0
            r22 = 0
            r23 = 1
            r24 = 0
            r27 = 0
            r28 = 0
        L_0x0096:
            r29 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r31 = -9223372036854775808
            if (r0 >= r10) goto L_0x014c
            int r13 = o.o0.e.a((java.lang.String) r7, (int) r0, (int) r10, (char) r11)
            int r14 = o.o0.e.a((java.lang.String) r7, (int) r0, (int) r13, (char) r12)
            java.lang.String r0 = o.o0.e.d(r7, r0, r14)
            if (r14 >= r13) goto L_0x00b4
            int r14 = r14 + 1
            java.lang.String r14 = o.o0.e.d(r7, r14, r13)
            goto L_0x00b6
        L_0x00b4:
            java.lang.String r14 = ""
        L_0x00b6:
            java.lang.String r11 = "expires"
            boolean r11 = r0.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x00c7
            int r0 = r14.length()     // Catch:{ IllegalArgumentException -> 0x0146 }
            long r25 = a(r14, r2, r0)     // Catch:{ IllegalArgumentException -> 0x0146 }
            goto L_0x00f1
        L_0x00c7:
            java.lang.String r11 = "max-age"
            boolean r11 = r0.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x00f5
            long r19 = java.lang.Long.parseLong(r14)     // Catch:{ NumberFormatException -> 0x00da }
            r29 = 0
            int r0 = (r19 > r29 ? 1 : (r19 == r29 ? 0 : -1))
            if (r0 > 0) goto L_0x00f1
            goto L_0x00ec
        L_0x00da:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = "-?\\d+"
            boolean r0 = r14.matches(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r0 = "-"
            boolean r0 = r14.startsWith(r0)     // Catch:{  }
            if (r0 == 0) goto L_0x00ef
        L_0x00ec:
            r19 = r31
            goto L_0x00f1
        L_0x00ef:
            r19 = r29
        L_0x00f1:
            r24 = 1
            goto L_0x0146
        L_0x00f4:
            throw r11     // Catch:{  }
        L_0x00f5:
            java.lang.String r11 = "domain"
            boolean r11 = r0.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x0126
            java.lang.String r0 = "."
            boolean r11 = r14.endsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0146 }
            if (r11 != 0) goto L_0x0120
            boolean r0 = r14.startsWith(r0)     // Catch:{ IllegalArgumentException -> 0x0146 }
            if (r0 == 0) goto L_0x010f
            java.lang.String r14 = r14.substring(r3)     // Catch:{ IllegalArgumentException -> 0x0146 }
        L_0x010f:
            java.lang.String r0 = o.o0.e.a((java.lang.String) r14)     // Catch:{ IllegalArgumentException -> 0x0146 }
            if (r0 == 0) goto L_0x011a
            r27 = r0
            r23 = 0
            goto L_0x0146
        L_0x011a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0146 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0146 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0146 }
        L_0x0120:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0146 }
            r0.<init>()     // Catch:{ IllegalArgumentException -> 0x0146 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0146 }
        L_0x0126:
            java.lang.String r11 = "path"
            boolean r11 = r0.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x0131
            r28 = r14
            goto L_0x0146
        L_0x0131:
            java.lang.String r11 = "secure"
            boolean r11 = r0.equalsIgnoreCase(r11)
            if (r11 == 0) goto L_0x013c
            r21 = 1
            goto L_0x0146
        L_0x013c:
            java.lang.String r11 = "httponly"
            boolean r0 = r0.equalsIgnoreCase(r11)
            if (r0 == 0) goto L_0x0146
            r22 = 1
        L_0x0146:
            int r0 = r13 + 1
            r11 = 59
            goto L_0x0096
        L_0x014c:
            int r0 = (r19 > r31 ? 1 : (r19 == r31 ? 0 : -1))
            if (r0 != 0) goto L_0x0155
            r7 = r33
            r17 = r31
            goto L_0x017f
        L_0x0155:
            r10 = -1
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 == 0) goto L_0x017b
            r10 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r0 = (r19 > r10 ? 1 : (r19 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0168
            r10 = 1000(0x3e8, double:4.94E-321)
            long r29 = r19 * r10
        L_0x0168:
            long r29 = r8 + r29
            int r0 = (r29 > r8 ? 1 : (r29 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0178
            int r0 = (r29 > r17 ? 1 : (r29 == r17 ? 0 : -1))
            if (r0 <= 0) goto L_0x0173
            goto L_0x0178
        L_0x0173:
            r7 = r33
            r17 = r29
            goto L_0x017f
        L_0x0178:
            r7 = r33
            goto L_0x017f
        L_0x017b:
            r7 = r33
            r17 = r25
        L_0x017f:
            java.lang.String r0 = r7.d
            r8 = 46
            r9 = r27
            if (r9 != 0) goto L_0x0189
            r9 = r0
            goto L_0x01b8
        L_0x0189:
            boolean r10 = r0.equals(r9)
            if (r10 == 0) goto L_0x0190
            goto L_0x01b2
        L_0x0190:
            boolean r10 = r0.endsWith(r9)
            if (r10 == 0) goto L_0x01b4
            int r10 = r0.length()
            int r11 = r9.length()
            int r10 = r10 - r11
            int r10 = r10 - r3
            char r10 = r0.charAt(r10)
            if (r10 != r8) goto L_0x01b4
            java.util.regex.Pattern r10 = o.o0.e.f5386k
            java.util.regex.Matcher r10 = r10.matcher(r0)
            boolean r10 = r10.matches()
            if (r10 != 0) goto L_0x01b4
        L_0x01b2:
            r10 = 1
            goto L_0x01b5
        L_0x01b4:
            r10 = 0
        L_0x01b5:
            if (r10 != 0) goto L_0x01b8
            goto L_0x021a
        L_0x01b8:
            int r0 = r0.length()
            int r10 = r9.length()
            if (r0 == r10) goto L_0x021f
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.f5635h
            if (r0 == 0) goto L_0x021d
            java.lang.String r10 = java.net.IDN.toUnicode(r9)
            java.lang.String r11 = "\\."
            java.lang.String[] r10 = r10.split(r11)
            java.lang.String[] r0 = r0.a(r10)
            int r12 = r10.length
            int r13 = r0.length
            r14 = 33
            if (r12 != r13) goto L_0x01e4
            r12 = r0[r2]
            char r12 = r12.charAt(r2)
            if (r12 == r14) goto L_0x01e4
            r0 = 0
            goto L_0x0218
        L_0x01e4:
            r12 = r0[r2]
            char r12 = r12.charAt(r2)
            if (r12 != r14) goto L_0x01ef
            int r3 = r10.length
            int r0 = r0.length
            goto L_0x01f3
        L_0x01ef:
            int r10 = r10.length
            int r0 = r0.length
            int r0 = r0 + r3
            r3 = r10
        L_0x01f3:
            int r3 = r3 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String[] r10 = r9.split(r11)
        L_0x01fd:
            int r11 = r10.length
            if (r3 >= r11) goto L_0x020b
            r11 = r10[r3]
            r0.append(r11)
            r0.append(r8)
            int r3 = r3 + 1
            goto L_0x01fd
        L_0x020b:
            int r3 = r0.length()
            r8 = -1
            int r3 = r3 + r8
            r0.deleteCharAt(r3)
            java.lang.String r0 = r0.toString()
        L_0x0218:
            if (r0 != 0) goto L_0x021f
        L_0x021a:
            r0 = 0
            r3 = 0
            goto L_0x024f
        L_0x021d:
            r3 = 0
            throw r3
        L_0x021f:
            r3 = 0
            java.lang.String r0 = "/"
            r8 = r28
            if (r8 == 0) goto L_0x0230
            boolean r10 = r8.startsWith(r0)
            if (r10 != 0) goto L_0x022d
            goto L_0x0230
        L_0x022d:
            r20 = r8
            goto L_0x0242
        L_0x0230:
            java.lang.String r8 = r33.b()
            r10 = 47
            int r10 = r8.lastIndexOf(r10)
            if (r10 == 0) goto L_0x0240
            java.lang.String r0 = r8.substring(r2, r10)
        L_0x0240:
            r20 = r0
        L_0x0242:
            o.p r0 = new o.p
            r14 = r0
            r19 = r9
            r14.<init>(r15, r16, r17, r19, r20, r21, r22, r23, r24)
            goto L_0x024f
        L_0x024b:
            r3 = 0
            r7 = r33
            r0 = r3
        L_0x024f:
            if (r0 != 0) goto L_0x0252
            goto L_0x025c
        L_0x0252:
            if (r6 != 0) goto L_0x0259
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
        L_0x0259:
            r6.add(r0)
        L_0x025c:
            int r5 = r5 + 1
            goto L_0x003b
        L_0x0260:
            if (r6 == 0) goto L_0x0267
            java.util.List r0 = java.util.Collections.unmodifiableList(r6)
            goto L_0x026b
        L_0x0267:
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x026b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o.p.a(o.y, o.x):java.util.List");
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (pVar.a.equals(this.a) && pVar.f5607b.equals(this.f5607b) && pVar.d.equals(this.d) && pVar.e.equals(this.e) && pVar.c == this.c && pVar.f5608f == this.f5608f && pVar.f5609g == this.f5609g && pVar.f5610h == this.f5610h && pVar.f5611i == this.f5611i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f5607b.hashCode();
        int hashCode2 = this.d.hashCode();
        int hashCode3 = this.e.hashCode();
        long j2 = this.c;
        return ((((((((((hashCode3 + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f5608f ^ true ? 1 : 0)) * 31) + (this.f5609g ^ true ? 1 : 0)) * 31) + (this.f5610h ^ true ? 1 : 0)) * 31) + (this.f5611i ^ true ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('=');
        sb.append(this.f5607b);
        if (this.f5610h) {
            if (this.c == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(d.a.get().format(new Date(this.c)));
            }
        }
        if (!this.f5611i) {
            sb.append("; domain=");
            sb.append(this.d);
        }
        sb.append("; path=");
        sb.append(this.e);
        if (this.f5608f) {
            sb.append("; secure");
        }
        if (this.f5609g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public static long a(String str, int i2, int i3) {
        int a2 = a(str, i2, i3, false);
        Matcher matcher = f5606m.matcher(str);
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        int i8 = -1;
        int i9 = -1;
        while (a2 < i3) {
            int a3 = a(str, a2 + 1, i3, true);
            matcher.region(a2, a3);
            if (i5 == -1 && matcher.usePattern(f5606m).matches()) {
                i5 = Integer.parseInt(matcher.group(1));
                i8 = Integer.parseInt(matcher.group(2));
                i9 = Integer.parseInt(matcher.group(3));
            } else if (i6 == -1 && matcher.usePattern(f5605l).matches()) {
                i6 = Integer.parseInt(matcher.group(1));
            } else if (i7 == -1 && matcher.usePattern(f5604k).matches()) {
                i7 = f5604k.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
            } else if (i4 == -1 && matcher.usePattern(f5603j).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            }
            a2 = a(str, a3 + 1, i3, false);
        }
        if (i4 >= 70 && i4 <= 99) {
            i4 += 1900;
        }
        if (i4 >= 0 && i4 <= 69) {
            i4 += RecyclerView.MAX_SCROLL_DURATION;
        }
        if (i4 < 1601) {
            throw new IllegalArgumentException();
        } else if (i7 == -1) {
            throw new IllegalArgumentException();
        } else if (i6 < 1 || i6 > 31) {
            throw new IllegalArgumentException();
        } else if (i5 < 0 || i5 > 23) {
            throw new IllegalArgumentException();
        } else if (i8 < 0 || i8 > 59) {
            throw new IllegalArgumentException();
        } else if (i9 < 0 || i9 > 59) {
            throw new IllegalArgumentException();
        } else {
            GregorianCalendar gregorianCalendar = new GregorianCalendar(e.f5383h);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i4);
            gregorianCalendar.set(2, i7 - 1);
            gregorianCalendar.set(5, i6);
            gregorianCalendar.set(11, i5);
            gregorianCalendar.set(12, i8);
            gregorianCalendar.set(13, i9);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }
    }

    public static int a(String str, int i2, int i3, boolean z) {
        while (i2 < i3) {
            char charAt = str.charAt(i2);
            if (((charAt < ' ' && charAt != 9) || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i2;
            }
            i2++;
        }
        return i3;
    }
}
