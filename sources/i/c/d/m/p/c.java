package i.c.d.m.p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.JsonReader;
import android.util.Log;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.d;
import i.c.d.j.c;
import i.c.d.m.p.a;
import i.c.d.m.p.b;
import i.c.d.m.p.d;
import i.c.d.m.p.e;
import i.c.d.p.g;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import l.a.a.a.o.b.a;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public class c {
    public static final Pattern d = Pattern.compile("[0-9]+s");
    public static final Charset e = Charset.forName("UTF-8");
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final g f4749b;
    public final i.c.d.j.c c;

    public c(Context context, g gVar, i.c.d.j.c cVar) {
        this.a = context;
        this.f4749b = gVar;
        this.c = cVar;
    }

    public final void a(HttpURLConnection httpURLConnection, String str, String str2) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(a(str, str2).toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
            } catch (JSONException e2) {
                throw new IllegalStateException(e2);
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else {
            throw new IOException("Cannot send CreateInstallation request to FIS. No OutputStream available.");
        }
    }

    public final e b(HttpURLConnection httpURLConnection) {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(httpURLConnection.getInputStream(), e));
        e.a a2 = e.a();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals("token")) {
                ((b.C0134b) a2).a = jsonReader.nextString();
            } else if (nextName.equals("expiresIn")) {
                a2.a(a(jsonReader.nextString()));
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        b.C0134b bVar = (b.C0134b) a2;
        bVar.c = e.b.OK;
        return bVar.a();
    }

    public final void c(HttpURLConnection httpURLConnection) {
        OutputStream outputStream = httpURLConnection.getOutputStream();
        if (outputStream != null) {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
            try {
                gZIPOutputStream.write(a().toString().getBytes("UTF-8"));
                gZIPOutputStream.close();
            } catch (JSONException e2) {
                throw new IllegalStateException(e2);
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        } else {
            throw new IOException("Cannot send GenerateAuthToken request to FIS. No OutputStream available.");
        }
    }

    public static JSONObject a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("fid", str);
        jSONObject.put("appId", str2);
        jSONObject.put("authVersion", "FIS_v2");
        jSONObject.put("sdkVersion", "a:16.1.0");
        return jSONObject;
    }

    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sdkVersion", "a:16.1.0");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("installation", jSONObject);
        return jSONObject2;
    }

    public final HttpURLConnection a(URL url) {
        c.a a2;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(a.DEFAULT_TIMEOUT);
        httpURLConnection.setReadTimeout(a.DEFAULT_TIMEOUT);
        httpURLConnection.addRequestProperty("Content-Type", a.ACCEPT_JSON_VALUE);
        httpURLConnection.addRequestProperty(a.HEADER_ACCEPT, a.ACCEPT_JSON_VALUE);
        httpURLConnection.addRequestProperty("Content-Encoding", "gzip");
        httpURLConnection.addRequestProperty("X-Android-Package", this.a.getPackageName());
        i.c.d.j.c cVar = this.c;
        if (!(cVar == null || this.f4749b == null || (a2 = cVar.a("fire-installations-id")) == c.a.NONE)) {
            httpURLConnection.addRequestProperty("x-firebase-client", this.f4749b.a());
            httpURLConnection.addRequestProperty("x-firebase-client-log-type", Integer.toString(a2.e));
        }
        String str = null;
        try {
            byte[] a3 = i.c.a.b.d.o.a.a(this.a, this.a.getPackageName());
            if (a3 == null) {
                Log.e("ContentValues", "Could not get fingerprint hash for package: " + this.a.getPackageName());
            } else {
                str = d.a(a3, false);
            }
        } catch (PackageManager.NameNotFoundException e2) {
            StringBuilder a4 = i.a.a.a.a.a("No such package: ");
            a4.append(this.a.getPackageName());
            Log.e("ContentValues", a4.toString(), e2);
        }
        httpURLConnection.addRequestProperty("X-Android-Cert", str);
        return httpURLConnection;
    }

    public final d a(HttpURLConnection httpURLConnection) {
        JsonReader jsonReader = new JsonReader(new InputStreamReader(httpURLConnection.getInputStream(), e));
        e.a a2 = e.a();
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        String str3 = null;
        e eVar = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (nextName.equals(DefaultAppMeasurementEventListenerRegistrar.NAME)) {
                str = jsonReader.nextString();
            } else if (nextName.equals("fid")) {
                str2 = jsonReader.nextString();
            } else if (nextName.equals("refreshToken")) {
                str3 = jsonReader.nextString();
            } else if (nextName.equals("authToken")) {
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if (nextName2.equals("token")) {
                        ((b.C0134b) a2).a = jsonReader.nextString();
                    } else if (nextName2.equals("expiresIn")) {
                        a2.a(a(jsonReader.nextString()));
                    } else {
                        jsonReader.skipValue();
                    }
                }
                eVar = a2.a();
                jsonReader.endObject();
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        jsonReader.close();
        return new a(str, str2, str3, eVar, d.a.OK, (a.C0133a) null);
    }

    public static long a(String str) {
        q.a(d.matcher(str).matches(), (Object) "Invalid Expiration Timestamp.");
        if (str == null || str.length() == 0) {
            return 0;
        }
        return Long.parseLong(str.substring(0, str.length() - 1));
    }
}
