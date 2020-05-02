package i.c.a.b.i.a;

import i.c.a.b.d.l.q;
import i.c.a.b.g.g.d0;
import i.c.a.b.g.g.f0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public abstract class ma {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public int f3781b;
    public Boolean c;
    public Boolean d;
    public Long e;

    /* renamed from: f  reason: collision with root package name */
    public Long f3782f;

    public ma(String str, int i2) {
        this.a = str;
        this.f3781b = i2;
    }

    public static Boolean a(Boolean bool, boolean z) {
        if (bool == null) {
            return null;
        }
        return Boolean.valueOf(bool.booleanValue() != z);
    }

    public abstract int a();

    public abstract boolean b();

    public abstract boolean c();

    public static Boolean a(String str, f0 f0Var, m4 m4Var) {
        String str2;
        List<String> list;
        q.a(f0Var);
        if (str == null) {
            return null;
        }
        boolean z = true;
        int i2 = 0;
        if (!((f0Var.zzc & 1) != 0) || f0Var.k() == f0.b.UNKNOWN_MATCH_TYPE) {
            return null;
        }
        if (f0Var.k() != f0.b.IN_LIST) {
            if ((f0Var.zzc & 2) == 0) {
                z = false;
            }
            if (!z) {
                return null;
            }
        } else if (f0Var.l() == 0) {
            return null;
        }
        f0.b k2 = f0Var.k();
        boolean z2 = f0Var.zzf;
        if (z2 || k2 == f0.b.REGEXP || k2 == f0.b.IN_LIST) {
            str2 = f0Var.zze;
        } else {
            str2 = f0Var.zze.toUpperCase(Locale.ENGLISH);
        }
        if (f0Var.l() == 0) {
            list = null;
        } else {
            list = f0Var.zzg;
            if (!z2) {
                ArrayList arrayList = new ArrayList(list.size());
                for (String upperCase : list) {
                    arrayList.add(upperCase.toUpperCase(Locale.ENGLISH));
                }
                list = Collections.unmodifiableList(arrayList);
            }
        }
        String str3 = k2 == f0.b.REGEXP ? str2 : null;
        if (k2 == f0.b.IN_LIST) {
            if (list == null || list.size() == 0) {
                return null;
            }
        } else if (str2 == null) {
            return null;
        }
        if (!z2 && k2 != f0.b.REGEXP) {
            str = str.toUpperCase(Locale.ENGLISH);
        }
        switch (ia.a[k2.ordinal()]) {
            case 1:
                if (!z2) {
                    i2 = 66;
                }
                try {
                    return Boolean.valueOf(Pattern.compile(str3, i2).matcher(str).matches());
                } catch (PatternSyntaxException unused) {
                    if (m4Var == null) {
                        return null;
                    }
                    m4Var.f3761i.a("Invalid regular expression in REGEXP audience filter. expression", str3);
                    return null;
                }
            case 2:
                return Boolean.valueOf(str.startsWith(str2));
            case 3:
                return Boolean.valueOf(str.endsWith(str2));
            case 4:
                return Boolean.valueOf(str.contains(str2));
            case 5:
                return Boolean.valueOf(str.equals(str2));
            case 6:
                return Boolean.valueOf(list.contains(str));
            default:
                return null;
        }
    }

    public static Boolean a(long j2, d0 d0Var) {
        try {
            return a(new BigDecimal(j2), d0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Boolean a(String str, d0 d0Var) {
        if (!x9.a(str)) {
            return null;
        }
        try {
            return a(new BigDecimal(str), d0Var, 0.0d);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        if (((r11.zzc & 16) != 0) == false) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x008e, code lost:
        if (r4 != null) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Boolean a(java.math.BigDecimal r10, i.c.a.b.g.g.d0 r11, double r12) {
        /*
            i.c.a.b.d.l.q.a(r11)
            int r0 = r11.zzc
            r1 = 1
            r0 = r0 & r1
            r2 = 0
            if (r0 == 0) goto L_0x000c
            r0 = 1
            goto L_0x000d
        L_0x000c:
            r0 = 0
        L_0x000d:
            r3 = 0
            if (r0 == 0) goto L_0x011c
            i.c.a.b.g.g.d0$a r0 = r11.k()
            i.c.a.b.g.g.d0$a r4 = i.c.a.b.g.g.d0.a.UNKNOWN_COMPARISON_TYPE
            if (r0 != r4) goto L_0x001a
            goto L_0x011c
        L_0x001a:
            i.c.a.b.g.g.d0$a r0 = r11.k()
            i.c.a.b.g.g.d0$a r4 = i.c.a.b.g.g.d0.a.BETWEEN
            r5 = 4
            if (r0 != r4) goto L_0x003a
            int r0 = r11.zzc
            r0 = r0 & 8
            if (r0 == 0) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r0 == 0) goto L_0x0039
            int r0 = r11.zzc
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r0 != 0) goto L_0x0045
        L_0x0039:
            return r3
        L_0x003a:
            int r0 = r11.zzc
            r0 = r0 & r5
            if (r0 == 0) goto L_0x0041
            r0 = 1
            goto L_0x0042
        L_0x0041:
            r0 = 0
        L_0x0042:
            if (r0 != 0) goto L_0x0045
            return r3
        L_0x0045:
            i.c.a.b.g.g.d0$a r0 = r11.k()
            i.c.a.b.g.g.d0$a r4 = r11.k()
            i.c.a.b.g.g.d0$a r6 = i.c.a.b.g.g.d0.a.BETWEEN
            if (r4 != r6) goto L_0x0074
            java.lang.String r4 = r11.zzg
            boolean r4 = i.c.a.b.i.a.x9.a((java.lang.String) r4)
            if (r4 == 0) goto L_0x0073
            java.lang.String r4 = r11.zzh
            boolean r4 = i.c.a.b.i.a.x9.a((java.lang.String) r4)
            if (r4 != 0) goto L_0x0062
            goto L_0x0073
        L_0x0062:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0073 }
            java.lang.String r6 = r11.zzg     // Catch:{ NumberFormatException -> 0x0073 }
            r4.<init>(r6)     // Catch:{ NumberFormatException -> 0x0073 }
            java.math.BigDecimal r6 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x0073 }
            java.lang.String r11 = r11.zzh     // Catch:{ NumberFormatException -> 0x0073 }
            r6.<init>(r11)     // Catch:{ NumberFormatException -> 0x0073 }
            r11 = r4
            r4 = r3
            goto L_0x0086
        L_0x0073:
            return r3
        L_0x0074:
            java.lang.String r4 = r11.zzf
            boolean r4 = i.c.a.b.i.a.x9.a((java.lang.String) r4)
            if (r4 != 0) goto L_0x007d
            return r3
        L_0x007d:
            java.math.BigDecimal r4 = new java.math.BigDecimal     // Catch:{ NumberFormatException -> 0x011c }
            java.lang.String r11 = r11.zzf     // Catch:{ NumberFormatException -> 0x011c }
            r4.<init>(r11)     // Catch:{ NumberFormatException -> 0x011c }
            r11 = r3
            r6 = r11
        L_0x0086:
            i.c.a.b.g.g.d0$a r7 = i.c.a.b.g.g.d0.a.BETWEEN
            if (r0 != r7) goto L_0x008e
            if (r11 == 0) goto L_0x008d
            goto L_0x0090
        L_0x008d:
            return r3
        L_0x008e:
            if (r4 == 0) goto L_0x011c
        L_0x0090:
            int[] r7 = i.c.a.b.i.a.ia.f3721b
            int r0 = r0.ordinal()
            r0 = r7[r0]
            r7 = -1
            if (r0 == r1) goto L_0x010f
            r8 = 2
            if (r0 == r8) goto L_0x0102
            r9 = 3
            if (r0 == r9) goto L_0x00b8
            if (r0 == r5) goto L_0x00a5
            goto L_0x011c
        L_0x00a5:
            int r11 = r10.compareTo(r11)
            if (r11 == r7) goto L_0x00b2
            int r10 = r10.compareTo(r6)
            if (r10 == r1) goto L_0x00b2
            goto L_0x00b3
        L_0x00b2:
            r1 = 0
        L_0x00b3:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
        L_0x00b8:
            r5 = 0
            int r11 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r11 == 0) goto L_0x00f5
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r12)
            java.math.BigDecimal r0 = new java.math.BigDecimal
            r0.<init>(r8)
            java.math.BigDecimal r11 = r11.multiply(r0)
            java.math.BigDecimal r11 = r4.subtract(r11)
            int r11 = r10.compareTo(r11)
            if (r11 != r1) goto L_0x00ef
            java.math.BigDecimal r11 = new java.math.BigDecimal
            r11.<init>(r12)
            java.math.BigDecimal r12 = new java.math.BigDecimal
            r12.<init>(r8)
            java.math.BigDecimal r11 = r11.multiply(r12)
            java.math.BigDecimal r11 = r4.add(r11)
            int r10 = r10.compareTo(r11)
            if (r10 != r7) goto L_0x00ef
            goto L_0x00f0
        L_0x00ef:
            r1 = 0
        L_0x00f0:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
        L_0x00f5:
            int r10 = r10.compareTo(r4)
            if (r10 != 0) goto L_0x00fc
            goto L_0x00fd
        L_0x00fc:
            r1 = 0
        L_0x00fd:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
        L_0x0102:
            int r10 = r10.compareTo(r4)
            if (r10 != r1) goto L_0x0109
            goto L_0x010a
        L_0x0109:
            r1 = 0
        L_0x010a:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
        L_0x010f:
            int r10 = r10.compareTo(r4)
            if (r10 != r7) goto L_0x0116
            goto L_0x0117
        L_0x0116:
            r1 = 0
        L_0x0117:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r1)
            return r10
        L_0x011c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.ma.a(java.math.BigDecimal, i.c.a.b.g.g.d0, double):java.lang.Boolean");
    }
}
