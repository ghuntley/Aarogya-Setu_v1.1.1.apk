package i.c.a.a.i.b;

import i.c.d.h.d;

/* compiled from: com.google.android.datatransport:transport-backend-cct@@2.2.0 */
public final class c implements i.c.d.h.c<d> {
    public void a(Object obj, Object obj2) {
        d dVar = (d) obj;
        d dVar2 = (d) obj2;
        int i2 = dVar.a;
        if (i2 != Integer.MIN_VALUE) {
            dVar2.a("sdkVersion", i2);
        }
        String str = dVar.f2885b;
        if (str != null) {
            dVar2.a("model", (Object) str);
        }
        String str2 = dVar.c;
        if (str2 != null) {
            dVar2.a("hardware", (Object) str2);
        }
        String str3 = dVar.d;
        if (str3 != null) {
            dVar2.a("device", (Object) str3);
        }
        String str4 = dVar.e;
        if (str4 != null) {
            dVar2.a("product", (Object) str4);
        }
        String str5 = dVar.f2886f;
        if (str5 != null) {
            dVar2.a("osBuild", (Object) str5);
        }
        String str6 = dVar.f2887g;
        if (str6 != null) {
            dVar2.a("manufacturer", (Object) str6);
        }
        String str7 = dVar.f2888h;
        if (str7 != null) {
            dVar2.a("fingerprint", (Object) str7);
        }
    }
}
