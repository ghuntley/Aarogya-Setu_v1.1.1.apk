package b.a.a.l;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.Toast;
import b.a.a.j.c;
import i.c.d.p.e;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import n.m.c.f;
import n.m.c.g;
import n.q.d;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.background.BluetoothScanningService;
import nic.goi.aarogyasetu.models.network.GenerateOTP;
import nic.goi.aarogyasetu.models.network.TokenValidationResponse;
import nic.goi.aarogyasetu.views.MainActivity;
import o.l0;
import org.json.JSONObject;
import q.d0;
import q.e0;

/* compiled from: AuthUtility.kt */
public final class h {
    public static final String a;

    /* renamed from: b  reason: collision with root package name */
    public static final b.a.a.l.i0.b f426b;
    public static final h c = new h();

    /* compiled from: AuthUtility.kt */
    public static final class a extends g implements n.m.b.a<n.h> {
        public final /* synthetic */ Context e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ boolean f427f;

        /* renamed from: b.a.a.l.h$a$a  reason: collision with other inner class name */
        /* compiled from: AuthUtility.kt */
        public static final class C0011a extends g implements n.m.b.a<n.h> {
            public static final C0011a e = new C0011a();

            public C0011a() {
                super(0);
            }

            public Object invoke() {
                if (h.c != null) {
                    CoronaApplication coronaApplication = CoronaApplication.f5224g;
                    Toast.makeText(coronaApplication, e.a((Context) coronaApplication, (int) R.string.login_failed), 0).show();
                    Intent intent = new Intent(CoronaApplication.f5224g, MainActivity.class);
                    intent.setFlags(335609856);
                    CoronaApplication.f5224g.startActivity(intent);
                    b.a("sessionExpired", (Bundle) null, 2);
                    return n.h.a;
                }
                throw null;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context, boolean z) {
            super(0);
            this.e = context;
            this.f427f = z;
        }

        public final void invoke() {
            synchronized (h.c) {
                if (h.c.a()) {
                    h.c((String) null);
                    h.b((String) null);
                    h.c.a((String) null);
                    b.a.a.k.a.b(CoronaApplication.f5224g, "unique_id", "");
                }
                if (BluetoothScanningService.f5231p) {
                    try {
                        this.e.stopService(new Intent(this.e, BluetoothScanningService.class));
                    } catch (Exception e2) {
                        e.a(e2);
                    }
                }
                b.a();
                if (this.f427f) {
                    c.c.a(C0011a.e);
                }
            }
        }
    }

    static {
        String simpleName = h.class.getSimpleName();
        f.a((Object) simpleName, "AuthUtility::class.java.simpleName");
        a = simpleName;
        n.b bVar = b.a.a.l.i0.a.f430b;
        n.o.e eVar = b.a.a.l.i0.a.a[0];
        f426b = (b.a.a.l.i0.b) bVar.getValue();
    }

    public static final String b() {
        try {
            return f426b.getString("uidtoken", "");
        } catch (Exception unused) {
            return "";
        }
    }

    public static final String c() {
        String str;
        String str2;
        String refreshToken;
        String str3 = "";
        try {
            str = f426b.getString("refreshtoken", str3);
        } catch (Exception unused) {
            str = str3;
        }
        try {
            d0<TokenValidationResponse> f2 = ((c) e.a(true, true, true, "https://api.swaraksha.gov.in/", false).a(c.class)).a(str).f();
            f.a((Object) f2, "execute");
            if (f2.a()) {
                TokenValidationResponse tokenValidationResponse = (TokenValidationResponse) f2.f5713b;
                if (tokenValidationResponse == null || (str2 = tokenValidationResponse.getAuthToken()) == null) {
                    str2 = str3;
                }
                if (!(tokenValidationResponse == null || (refreshToken = tokenValidationResponse.getRefreshToken()) == null)) {
                    str3 = refreshToken;
                }
                c(str2);
                b(str3);
                return str2;
            }
            throw new IOException();
        } catch (Exception unused2) {
            throw new IOException();
        }
    }

    public final boolean a() {
        String b2 = b();
        return !(b2 == null || d.b(b2));
    }

    public static final void b(String str) {
        if (str == null || d.b(str)) {
            f426b.a("refreshtoken");
        } else {
            f426b.putString("refreshtoken", str);
        }
    }

    public final void a(String str) {
        if (str == null || d.b(str)) {
            f426b.a("mobile");
        } else {
            f426b.putString("mobile", str);
        }
    }

    /* compiled from: AuthUtility.kt */
    public static final class b implements q.f<JSONObject> {
        public final /* synthetic */ g0 a;

        /* compiled from: AuthUtility.kt */
        public static final class a extends g implements n.m.b.a<n.h> {
            public final /* synthetic */ b e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(b bVar) {
                super(0);
                this.e = bVar;
            }

            public Object invoke() {
                g0 g0Var = this.e.a;
                if (g0Var != null) {
                    g0Var.a();
                }
                return n.h.a;
            }
        }

        public b(g0 g0Var) {
            this.a = g0Var;
        }

        public void a(q.d<JSONObject> dVar, Throwable th) {
            if (dVar == null) {
                f.a("call");
                throw null;
            } else if (th != null) {
                h.a(h.c, this.a, new Exception(th), new f());
            } else {
                f.a("t");
                throw null;
            }
        }

        public void a(q.d<JSONObject> dVar, d0<JSONObject> d0Var) {
            String str = null;
            if (dVar == null) {
                f.a("call");
                throw null;
            } else if (d0Var == null) {
                f.a("response");
                throw null;
            } else if (d0Var.a()) {
                c.c.a(new a(this));
            } else if (d0Var.a.f5326g == 401) {
                StringBuilder a2 = i.a.a.a.a.a("Api Response is not success. Response = ");
                l0 l0Var = d0Var.c;
                if (l0Var != null) {
                    str = l0Var.j();
                }
                a2.append(str);
                h.a(h.c, this.a, new Exception(a2.toString()), new g());
            } else {
                StringBuilder a3 = i.a.a.a.a.a("Api Response is not success. Response = ");
                l0 l0Var2 = d0Var.c;
                if (l0Var2 != null) {
                    str = l0Var2.j();
                }
                a3.append(str);
                h.a(h.c, this.a, new Exception(a3.toString()), new f());
            }
        }
    }

    public final void a(String str, g0 g0Var) {
        if (str == null) {
            f.a("mobile");
            throw null;
        } else if (!a()) {
            e0 a2 = e.a(false, true, true, "https://api.swaraksha.gov.in/", false);
            GenerateOTP generateOTP = new GenerateOTP(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("x-api-key", "ykixqE5H352HalBW4MNvI7HGJBXreLFx1APCkqEl");
            linkedHashMap.put("os", String.valueOf(Build.VERSION.SDK_INT));
            linkedHashMap.put("device-type", Build.MANUFACTURER + "-" + Build.MODEL);
            ((c) a2.a(c.class)).a((Map<String, String>) linkedHashMap, generateOTP).a(new b(g0Var));
        }
    }

    public static final void c(String str) {
        if (str == null || d.b(str)) {
            f426b.a("uidtoken");
        } else {
            f426b.putString("uidtoken", str);
        }
    }

    public static final void a(Context context, boolean z) {
        if (context != null) {
            e.a(false, false, (ClassLoader) null, (String) null, 0, new a(context, z), 31);
        } else {
            f.a("context");
            throw null;
        }
    }

    public static final /* synthetic */ void a(h hVar, k kVar, Exception exc, d dVar) {
        if (hVar != null) {
            if (exc != null) {
                exc.getMessage();
            }
            c.c.a(new i(kVar, exc, dVar));
            return;
        }
        throw null;
    }
}
