package b.a.a.h;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import i.c.a.b.d.l.q;
import i.c.a.b.l.d0;
import i.c.d.q.f;
import i.c.d.q.h;
import i.c.d.q.m.f;
import java.io.IOException;
import java.util.HashMap;
import n.m.c.g;
import n.m.c.h;
import n.m.c.i;
import n.m.c.k;
import n.o.e;
import nic.goi.aarogyasetu.R;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: FirebaseRemoteConfigUtil.kt */
public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ e[] f421b;
    public static final n.b c = i.c.d.p.e.a(C0008a.e);
    public static final b d = new b((n.m.c.e) null);
    public final n.b a = i.c.d.p.e.a(c.e);

    /* renamed from: b.a.a.h.a$a  reason: collision with other inner class name */
    /* compiled from: FirebaseRemoteConfigUtil.kt */
    public static final class C0008a extends g implements n.m.b.a<a> {
        public static final C0008a e = new C0008a();

        public C0008a() {
            super(0);
        }

        public Object invoke() {
            return new a();
        }
    }

    /* compiled from: FirebaseRemoteConfigUtil.kt */
    public static final class b {
        public static final /* synthetic */ e[] a;

        static {
            i iVar = new i(k.a(b.class), "INSTANCE", "getINSTANCE()Lnic/goi/aarogyasetu/firebase/FirebaseRemoteConfigUtil;");
            k.a((h) iVar);
            a = new e[]{iVar};
        }

        public b() {
        }

        public /* synthetic */ b(n.m.c.e eVar) {
        }
    }

    /* compiled from: FirebaseRemoteConfigUtil.kt */
    public static final class c extends g implements n.m.b.a<i.c.d.q.g> {
        public static final c e = new c();

        public c() {
            super(0);
        }

        public Object invoke() {
            h.b bVar = new h.b();
            bVar.c = 900;
            FirebaseApp instance = FirebaseApp.getInstance();
            instance.a();
            i.c.d.q.g a = ((i.c.d.q.k) instance.d.a(i.c.d.q.k.class)).a("firebase");
            q.a(a.c, new f(a, new i.c.d.q.h(bVar, (h.a) null)));
            Context context = a.a;
            HashMap hashMap = new HashMap();
            try {
                Resources resources = context.getResources();
                if (resources == null) {
                    Log.e("FirebaseRemoteConfig", "Could not find the resources of the current context while trying to set defaults from an XML.");
                } else {
                    XmlResourceParser xml = resources.getXml(R.xml.firebase_remoteconfig_defaults);
                    String str = null;
                    String str2 = null;
                    String str3 = null;
                    for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                        if (eventType == 2) {
                            str = xml.getName();
                        } else if (eventType == 3) {
                            if (xml.getName().equals("entry")) {
                                if (str2 == null || str3 == null) {
                                    Log.w("FirebaseRemoteConfig", "An entry in the defaults XML has an invalid key and/or value tag.");
                                } else {
                                    hashMap.put(str2, str3);
                                }
                                str2 = null;
                                str3 = null;
                            }
                            str = null;
                        } else if (eventType == 4 && str != null) {
                            char c = 65535;
                            int hashCode = str.hashCode();
                            if (hashCode != 106079) {
                                if (hashCode == 111972721) {
                                    if (str.equals("value")) {
                                        c = 1;
                                    }
                                }
                            } else if (str.equals("key")) {
                                c = 0;
                            }
                            if (c == 0) {
                                str2 = xml.getText();
                            } else if (c != 1) {
                                Log.w("FirebaseRemoteConfig", "Encountered an unexpected tag while parsing the defaults XML.");
                            } else {
                                str3 = xml.getText();
                            }
                        }
                    }
                }
            } catch (IOException | XmlPullParserException e2) {
                Log.e("FirebaseRemoteConfig", "Encountered an error while parsing the defaults XML file.", e2);
            }
            try {
                f.b a2 = i.c.d.q.m.f.a();
                a2.a = new JSONObject(hashMap);
                i.c.a.b.l.g<i.c.d.q.m.f> a3 = a.f4775f.a(a2.a());
                i.c.d.q.a aVar = i.c.d.q.a.a;
                d0 d0Var = (d0) a3;
                if (d0Var != null) {
                    d0Var.a(i.c.a.b.l.i.a, aVar);
                    return a;
                }
                throw null;
            } catch (JSONException e3) {
                Log.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e3);
                q.b(null);
            }
        }
    }

    static {
        i iVar = new i(k.a(a.class), "firebaseRemoteConfig", "getFirebaseRemoteConfig()Lcom/google/firebase/remoteconfig/FirebaseRemoteConfig;");
        k.a((n.m.c.h) iVar);
        f421b = new e[]{iVar};
    }

    public static final a b() {
        if (d != null) {
            n.b bVar = c;
            e eVar = b.a[0];
            return (a) bVar.getValue();
        }
        throw null;
    }

    public final i.c.d.q.g a() {
        n.b bVar = this.a;
        e eVar = f421b[0];
        return (i.c.d.q.g) bVar.getValue();
    }
}
