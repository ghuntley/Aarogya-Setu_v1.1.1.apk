package i.c.a.a.i;

import i.c.a.a.b;
import i.c.a.a.j.d;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class a implements d {
    public static final String c = g.a.a.b.a.b("hts/frbslgiggolai.o/0clgbthfra=snpoo", "tp:/ieaeogn.ogepscmvc/o/ac?omtjo_rt3");
    public static final String d = g.a.a.b.a.b("hts/frbslgigp.ogepscmv/ieo/eaybtho", "tp:/ieaeogn-agolai.o/1frlglgc/aclg");
    public static final String e = g.a.a.b.a.b("AzSCki82AwsLzKd5O8zo", "IayckHiZRO1EFl1aGoK");

    /* renamed from: f  reason: collision with root package name */
    public static final Set<b> f2876f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new b[]{new b("proto"), new b("json")})));

    /* renamed from: g  reason: collision with root package name */
    public static final a f2877g = new a(d, e);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2878b;

    static {
        new a(c, (String) null);
    }

    public a(String str, String str2) {
        this.a = str;
        this.f2878b = str2;
    }

    public static a a(byte[] bArr) {
        String str = new String(bArr, Charset.forName("UTF-8"));
        if (str.startsWith("1$")) {
            String[] split = str.substring(2).split(Pattern.quote("\\"), 2);
            if (split.length == 2) {
                String str2 = split[0];
                if (!str2.isEmpty()) {
                    String str3 = split[1];
                    if (str3.isEmpty()) {
                        str3 = null;
                    }
                    return new a(str2, str3);
                }
                throw new IllegalArgumentException("Missing endpoint in CCTDestination extras");
            }
            throw new IllegalArgumentException("Extra is not a valid encoded LegacyFlgDestination");
        }
        throw new IllegalArgumentException("Version marker missing from extras");
    }

    public Set<b> b() {
        return f2876f;
    }

    public String c() {
        return "cct";
    }

    public byte[] a() {
        if (this.f2878b == null && this.a == null) {
            return null;
        }
        Object[] objArr = new Object[4];
        objArr[0] = "1$";
        objArr[1] = this.a;
        objArr[2] = "\\";
        String str = this.f2878b;
        if (str == null) {
            str = "";
        }
        objArr[3] = str;
        return String.format("%s%s%s%s", objArr).getBytes(Charset.forName("UTF-8"));
    }
}
