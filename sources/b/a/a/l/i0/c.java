package b.a.a.l.i0;

import android.content.SharedPreferences;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import h.u.a.a;
import i.c.c.a.h;
import i.c.c.a.t.d;
import i.c.c.a.x.a.a;
import n.m.c.f;
import n.m.c.g;
import n.m.c.i;
import n.m.c.k;
import n.o.e;
import nic.goi.aarogyasetu.CoronaApplication;

/* compiled from: AuthSpHelperPostM.kt */
public final class c implements b {
    public static final /* synthetic */ e[] c;
    public final n.b a = i.c.d.p.e.a(a.e);

    /* renamed from: b  reason: collision with root package name */
    public final n.b f431b = i.c.d.p.e.a(new b(this));

    /* compiled from: AuthSpHelperPostM.kt */
    public static final class a extends g implements n.m.b.a<String> {
        public static final a e = new a();

        public a() {
            super(0);
        }

        public Object invoke() {
            KeyGenParameterSpec.Builder builder = new KeyGenParameterSpec.Builder("master_key", 3);
            builder.setBlockModes(new String[]{"GCM"});
            builder.setEncryptionPaddings(new String[]{"NoPadding"});
            builder.setKeySize(256);
            if (Build.VERSION.SDK_INT >= 28) {
                CoronaApplication coronaApplication = CoronaApplication.f5224g;
                f.a((Object) coronaApplication, "nic.goi.aarogyasetu.CoronaApplication.instance");
                if (coronaApplication.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                    builder.setIsStrongBoxBacked(true);
                }
            }
            KeyGenParameterSpec build = builder.build();
            f.a((Object) build, "KeyGenParameterSpec.Buil…      }\n        }.build()");
            return h.u.a.b.a(build);
        }
    }

    /* compiled from: AuthSpHelperPostM.kt */
    public static final class b extends g implements n.m.b.a<SharedPreferences> {
        public final /* synthetic */ c e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(c cVar) {
            super(0);
            this.e = cVar;
        }

        public Object invoke() {
            n.b bVar = this.e.a;
            e eVar = c.c[0];
            String str = (String) bVar.getValue();
            CoronaApplication coronaApplication = CoronaApplication.f5224g;
            a.c cVar = a.c.AES256_SIV;
            a.d dVar = a.d.AES256_GCM;
            i.c.c.a.u.a.a();
            a.b bVar2 = new a.b();
            bVar2.e = cVar.e;
            bVar2.a(coronaApplication, "__androidx_security_crypto_encrypted_prefs_key_keyset__", "auth_pref");
            String str2 = "android-keystore://" + str;
            if (str2.startsWith("android-keystore://")) {
                bVar2.c = str2;
                h a = new i.c.c.a.x.a.a(bVar2, (a.C0127a) null).a();
                a.b bVar3 = new a.b();
                bVar3.e = dVar.e;
                bVar3.a(coronaApplication, "__androidx_security_crypto_encrypted_prefs_value_keyset__", "auth_pref");
                String str3 = "android-keystore://" + str;
                if (str3.startsWith("android-keystore://")) {
                    bVar3.c = str3;
                    h a2 = new i.c.c.a.x.a.a(bVar3, (a.C0127a) null).a();
                    return new h.u.a.a("auth_pref", str, coronaApplication.getSharedPreferences("auth_pref", 0), d.a(a2), i.c.c.a.v.e.a(a));
                }
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            }
            throw new IllegalArgumentException("key URI must start with android-keystore://");
        }
    }

    static {
        Class<c> cls = c.class;
        i iVar = new i(k.a((Class) cls), "advancedKeyAlias", "getAdvancedKeyAlias()Ljava/lang/String;");
        k.a((n.m.c.h) iVar);
        i iVar2 = new i(k.a((Class) cls), "authSp", "getAuthSp()Landroid/content/SharedPreferences;");
        k.a((n.m.c.h) iVar2);
        c = new e[]{iVar, iVar2};
    }

    public final SharedPreferences a() {
        n.b bVar = this.f431b;
        e eVar = c[1];
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

    public String getString(String str, String str2) {
        if (str != null) {
            return a().getString(str, str2);
        }
        f.a("key");
        throw null;
    }

    public void putString(String str, String str2) {
        if (str != null) {
            a().edit().putString(str, str2).apply();
        } else {
            f.a("key");
            throw null;
        }
    }
}
