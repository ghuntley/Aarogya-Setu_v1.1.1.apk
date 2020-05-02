package i.c.d.k;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import i.c.a.b.d.f;
import i.c.a.b.d.l.j;
import i.c.a.b.d.l.p;
import i.c.a.b.d.l.q;
import i.c.a.b.l.h;
import i.c.d.j.c;
import i.c.d.m.a;
import i.c.d.m.k;
import i.c.d.p.g;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Properties;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class d1 {
    public final FirebaseApp a;

    /* renamed from: b  reason: collision with root package name */
    public final s f4687b;
    public final y c;
    public final Executor d;
    public final g e;

    /* renamed from: f  reason: collision with root package name */
    public final c f4688f;

    /* renamed from: g  reason: collision with root package name */
    public final i.c.d.m.g f4689g;

    public d1(FirebaseApp firebaseApp, s sVar, Executor executor, g gVar, c cVar, i.c.d.m.g gVar2) {
        firebaseApp.a();
        y yVar = new y(firebaseApp.a, sVar);
        this.a = firebaseApp;
        this.f4687b = sVar;
        this.c = yVar;
        this.d = executor;
        this.e = gVar;
        this.f4688f = cVar;
        this.f4689g = gVar2;
    }

    public final i.c.a.b.l.g<Bundle> a(String str, String str2, String str3, Bundle bundle) {
        h hVar = new h();
        this.d.execute(new g1(this, str, str2, str3, bundle, hVar));
        return hVar.a;
    }

    public final Bundle b(String str, String str2, String str3, Bundle bundle) {
        String str4;
        String str5;
        bundle.putString("scope", str3);
        bundle.putString("sender", str2);
        bundle.putString("subtype", str2);
        bundle.putString("appid", str);
        FirebaseApp firebaseApp = this.a;
        firebaseApp.a();
        bundle.putString("gmp_app_id", firebaseApp.c.f4636b);
        bundle.putString("gmsv", Integer.toString(this.f4687b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f4687b.b());
        bundle.putString("app_ver_name", this.f4687b.c());
        FirebaseApp firebaseApp2 = this.a;
        firebaseApp2.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(firebaseApp2.f692b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str6 = ((a) ((k) q.a(this.f4689g.a(false)))).a;
            if (!TextUtils.isEmpty(str6)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str6);
            } else {
                Log.w("FirebaseInstanceId", "FIS auth token is empty");
            }
        } catch (InterruptedException | ExecutionException e2) {
            Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e2);
        }
        p pVar = p.c;
        String str7 = null;
        if (pVar != null) {
            q.a("firebase-iid", (Object) "Please provide a valid libraryName");
            if (pVar.a.containsKey("firebase-iid")) {
                str5 = pVar.a.get("firebase-iid");
            } else {
                Properties properties = new Properties();
                try {
                    InputStream resourceAsStream = p.class.getResourceAsStream(String.format("/%s.properties", new Object[]{"firebase-iid"}));
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        str7 = properties.getProperty("version", (String) null);
                        j jVar = p.f3141b;
                        StringBuilder sb = new StringBuilder(24 + String.valueOf(str7).length());
                        sb.append("firebase-iid");
                        sb.append(" version is ");
                        sb.append(str7);
                        String sb2 = sb.toString();
                        if (jVar.a(2)) {
                            String str8 = jVar.f3132b;
                            if (str8 != null) {
                                sb2 = str8.concat(sb2);
                            }
                            Log.v("LibraryVersion", sb2);
                        }
                    } else {
                        j jVar2 = p.f3141b;
                        String concat = "Failed to get app version for libraryName: ".concat("firebase-iid");
                        if (jVar2.a(5)) {
                            String str9 = jVar2.f3132b;
                            if (str9 != null) {
                                concat = str9.concat(concat);
                            }
                            Log.w("LibraryVersion", concat);
                        }
                    }
                } catch (IOException e3) {
                    j jVar3 = p.f3141b;
                    String concat2 = "Failed to get app version for libraryName: ".concat("firebase-iid");
                    if (jVar3.a(6)) {
                        String str10 = jVar3.f3132b;
                        if (str10 != null) {
                            concat2 = str10.concat(concat2);
                        }
                        Log.e("LibraryVersion", concat2, e3);
                    }
                }
                if (str7 == null) {
                    j jVar4 = p.f3141b;
                    String str11 = ".properties file is dropped during release process. Failure to read app version isexpected druing Google internal testing where locally-built libraries are used";
                    if (jVar4.a(3)) {
                        String str12 = jVar4.f3132b;
                        if (str12 != null) {
                            str11 = str12.concat(str11);
                        }
                        Log.d("LibraryVersion", str11);
                    }
                    str5 = "UNKNOWN";
                } else {
                    str5 = str7;
                }
                pVar.a.put("firebase-iid", str5);
            }
            if ("UNKNOWN".equals(str5)) {
                int i2 = f.a;
                StringBuilder sb3 = new StringBuilder(19);
                sb3.append("unknown_");
                sb3.append(i2);
                str5 = sb3.toString();
            }
            String valueOf = String.valueOf(str5);
            bundle.putString("cliv", valueOf.length() != 0 ? "fiid-".concat(valueOf) : new String("fiid-"));
            c.a a2 = this.f4688f.a("fire-iid");
            if (a2 != c.a.NONE) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(a2.e));
                bundle.putString("Firebase-Client", this.e.a());
            }
            return bundle;
        }
        throw null;
    }

    public final i.c.a.b.l.g<String> a(i.c.a.b.l.g<Bundle> gVar) {
        return gVar.a(this.d, (i.c.a.b.l.a<Bundle, TContinuationResult>) new h1(this));
    }
}
