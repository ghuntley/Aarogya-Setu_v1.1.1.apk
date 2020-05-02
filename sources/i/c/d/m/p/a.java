package i.c.d.m.p;

import i.c.d.m.p.d;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public final class a extends d {
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4746b;
    public final String c;
    public final e d;
    public final d.a e;

    public /* synthetic */ a(String str, String str2, String str3, e eVar, d.a aVar, C0133a aVar2) {
        this.a = str;
        this.f4746b = str2;
        this.c = str3;
        this.d = eVar;
        this.e = aVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str = this.a;
        if (str != null ? str.equals(((a) dVar).a) : ((a) dVar).a == null) {
            String str2 = this.f4746b;
            if (str2 != null ? str2.equals(((a) dVar).f4746b) : ((a) dVar).f4746b == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(((a) dVar).c) : ((a) dVar).c == null) {
                    e eVar = this.d;
                    if (eVar != null ? eVar.equals(((a) dVar).d) : ((a) dVar).d == null) {
                        d.a aVar = this.e;
                        if (aVar == null) {
                            if (((a) dVar).e == null) {
                                return true;
                            }
                        } else if (aVar.equals(((a) dVar).e)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.a;
        int i2 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f4746b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        e eVar = this.d;
        int hashCode4 = (hashCode3 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        d.a aVar = this.e;
        if (aVar != null) {
            i2 = aVar.hashCode();
        }
        return hashCode4 ^ i2;
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("InstallationResponse{uri=");
        a2.append(this.a);
        a2.append(", fid=");
        a2.append(this.f4746b);
        a2.append(", refreshToken=");
        a2.append(this.c);
        a2.append(", authToken=");
        a2.append(this.d);
        a2.append(", responseCode=");
        a2.append(this.e);
        a2.append("}");
        return a2.toString();
    }
}
