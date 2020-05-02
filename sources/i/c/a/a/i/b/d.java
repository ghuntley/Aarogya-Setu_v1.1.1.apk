package i.c.a.a.i.b;

import i.a.a.a.a;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class d extends a {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2885b;
    public final String c;
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2886f;

    /* renamed from: g  reason: collision with root package name */
    public final String f2887g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2888h;

    public /* synthetic */ d(int i2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = i2;
        this.f2885b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f2886f = str5;
        this.f2887g = str6;
        this.f2888h = str7;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        d dVar = (d) ((a) obj);
        if (this.a == dVar.a && ((str = this.f2885b) != null ? str.equals(dVar.f2885b) : dVar.f2885b == null) && ((str2 = this.c) != null ? str2.equals(dVar.c) : dVar.c == null) && ((str3 = this.d) != null ? str3.equals(dVar.d) : dVar.d == null) && ((str4 = this.e) != null ? str4.equals(dVar.e) : dVar.e == null) && ((str5 = this.f2886f) != null ? str5.equals(dVar.f2886f) : dVar.f2886f == null) && ((str6 = this.f2887g) != null ? str6.equals(dVar.f2887g) : dVar.f2887g == null)) {
            String str7 = this.f2888h;
            if (str7 == null) {
                if (dVar.f2888h == null) {
                    return true;
                }
            } else if (str7.equals(dVar.f2888h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i2 = (this.a ^ 1000003) * 1000003;
        String str = this.f2885b;
        int i3 = 0;
        int hashCode = (i2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.c;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.d;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.e;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f2886f;
        int hashCode5 = (hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f2887g;
        int hashCode6 = (hashCode5 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f2888h;
        if (str7 != null) {
            i3 = str7.hashCode();
        }
        return hashCode6 ^ i3;
    }

    public String toString() {
        StringBuilder a2 = a.a("AndroidClientInfo{sdkVersion=");
        a2.append(this.a);
        a2.append(", model=");
        a2.append(this.f2885b);
        a2.append(", hardware=");
        a2.append(this.c);
        a2.append(", device=");
        a2.append(this.d);
        a2.append(", product=");
        a2.append(this.e);
        a2.append(", osBuild=");
        a2.append(this.f2886f);
        a2.append(", manufacturer=");
        a2.append(this.f2887g);
        a2.append(", fingerprint=");
        return a.a(a2, this.f2888h, "}");
    }
}
