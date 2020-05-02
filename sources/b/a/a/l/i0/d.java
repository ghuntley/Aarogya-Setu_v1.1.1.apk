package b.a.a.l.i0;

import android.content.SharedPreferences;
import android.util.Base64;
import b.a.a.l.v;
import b.a.a.l.w;
import java.nio.charset.StandardCharsets;
import javax.crypto.Cipher;
import n.m.c.f;
import n.m.c.g;
import n.m.c.h;
import n.m.c.i;
import n.m.c.k;
import n.o.e;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.models.Converters;
import nic.goi.aarogyasetu.models.EncryptedInfo;

/* compiled from: AuthSpHelperPreM.kt */
public final class d implements b {
    public static final /* synthetic */ e[] d;
    public final n.b a = i.c.d.p.e.a(b.e);

    /* renamed from: b  reason: collision with root package name */
    public final n.b f432b = i.c.d.p.e.a(a.e);
    public final n.b c = i.c.d.p.e.a(c.e);

    /* compiled from: AuthSpHelperPreM.kt */
    public static final class a extends g implements n.m.b.a<v> {
        public static final a e = new a();

        public a() {
            super(0);
        }

        public Object invoke() {
            return new v();
        }
    }

    /* compiled from: AuthSpHelperPreM.kt */
    public static final class b extends g implements n.m.b.a<w> {
        public static final b e = new b();

        public b() {
            super(0);
        }

        public Object invoke() {
            return w.c;
        }
    }

    /* compiled from: AuthSpHelperPreM.kt */
    public static final class c extends g implements n.m.b.a<SharedPreferences> {
        public static final c e = new c();

        public c() {
            super(0);
        }

        public Object invoke() {
            CoronaApplication coronaApplication = CoronaApplication.f5224g;
            f.a((Object) coronaApplication, "CoronaApplication.getInstance()");
            return coronaApplication.getApplicationContext().getSharedPreferences("auth_pref_lollipop", 0);
        }
    }

    static {
        Class<d> cls = d.class;
        i iVar = new i(k.a((Class) cls), "encryptionUtil", "getEncryptionUtil()Lnic/goi/aarogyasetu/utility/EncryptionUtil;");
        k.a((h) iVar);
        i iVar2 = new i(k.a((Class) cls), "decryptionUtil", "getDecryptionUtil()Lnic/goi/aarogyasetu/utility/DecryptionUtil;");
        k.a((h) iVar2);
        i iVar3 = new i(k.a((Class) cls), "sharedPreferences", "getSharedPreferences()Landroid/content/SharedPreferences;");
        k.a((h) iVar3);
        d = new e[]{iVar, iVar2, iVar3};
    }

    public final SharedPreferences a() {
        n.b bVar = this.c;
        e eVar = d[2];
        return (SharedPreferences) bVar.getValue();
    }

    public void a(String str) {
        if (str != null) {
            a().edit().remove(str).apply();
        } else {
            f.a("key");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0019 A[Catch:{ Exception -> 0x002f }] */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a A[Catch:{ Exception -> 0x002f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String getString(java.lang.String r4, java.lang.String r5) {
        /*
            r3 = this;
            if (r4 == 0) goto L_0x0030
            android.content.SharedPreferences r0 = r3.a()     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = r0.getString(r4, r5)     // Catch:{ Exception -> 0x002f }
            r0 = 1
            if (r4 == 0) goto L_0x0016
            boolean r1 = n.q.d.b(r4)     // Catch:{ Exception -> 0x002f }
            if (r1 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r1 = 0
            goto L_0x0017
        L_0x0016:
            r1 = 1
        L_0x0017:
            if (r1 == 0) goto L_0x001a
            goto L_0x002f
        L_0x001a:
            nic.goi.aarogyasetu.models.EncryptedInfo r4 = nic.goi.aarogyasetu.models.Converters.fromString(r4)     // Catch:{ Exception -> 0x002f }
            n.b r1 = r3.f432b     // Catch:{ Exception -> 0x002f }
            n.o.e[] r2 = d     // Catch:{ Exception -> 0x002f }
            r0 = r2[r0]     // Catch:{ Exception -> 0x002f }
            java.lang.Object r0 = r1.getValue()     // Catch:{ Exception -> 0x002f }
            b.a.a.l.v r0 = (b.a.a.l.v) r0     // Catch:{ Exception -> 0x002f }
            java.lang.String r4 = r0.a(r4)     // Catch:{ Exception -> 0x002f }
            r5 = r4
        L_0x002f:
            return r5
        L_0x0030:
            java.lang.String r4 = "key"
            n.m.c.f.a((java.lang.String) r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.l.i0.d.getString(java.lang.String, java.lang.String):java.lang.String");
    }

    public void putString(String str, String str2) {
        if (str != null) {
            try {
                n.b bVar = this.a;
                e eVar = d[0];
                w wVar = (w) bVar.getValue();
                Cipher d2 = wVar.d();
                wVar.f441b = d2.getIV();
                String encodeToString = Base64.encodeToString(d2.doFinal(str2.getBytes(StandardCharsets.UTF_8)), 0);
                EncryptedInfo encryptedInfo = new EncryptedInfo();
                encryptedInfo.setData(encodeToString);
                encryptedInfo.setIv(wVar.f441b);
                a().edit().putString(str, Converters.fromArrayList(encryptedInfo)).apply();
            } catch (Exception unused) {
            }
        } else {
            f.a("key");
            throw null;
        }
    }
}
