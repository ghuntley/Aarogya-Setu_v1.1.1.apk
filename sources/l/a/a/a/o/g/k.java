package l.a.a.a.o.g;

import android.util.Log;
import io.fabric.sdk.android.services.network.HttpRequest;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import l.a.a.a.f;
import l.a.a.a.o.b.a;
import l.a.a.a.o.b.i;
import l.a.a.a.o.e.b;
import l.a.a.a.o.e.c;
import org.json.JSONObject;

/* compiled from: DefaultSettingsSpiCall */
public class k extends a implements u {
    public k(l.a.a.a.k kVar, String str, String str2, c cVar) {
        super(kVar, str, str2, cVar, b.GET);
    }

    public JSONObject a(HttpRequest httpRequest) {
        ByteArrayOutputStream byteArrayOutputStream;
        int c = httpRequest.c();
        l.a.a.a.c a = f.a();
        String b2 = i.a.a.a.a.b("Settings result was: ", c);
        if (a.a("Fabric", 3)) {
            Log.d("Fabric", b2, (Throwable) null);
        }
        if (c == 200 || c == 201 || c == 202 || c == 203) {
            String a2 = httpRequest.a(httpRequest.a("Content-Type"), "charset");
            try {
                httpRequest.b();
                int headerFieldInt = httpRequest.d().getHeaderFieldInt("Content-Length", -1);
                if (headerFieldInt > 0) {
                    byteArrayOutputStream = new ByteArrayOutputStream(headerFieldInt);
                } else {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                }
                try {
                    httpRequest.a((InputStream) httpRequest.a(), (OutputStream) byteArrayOutputStream);
                    if (a2 == null || a2.length() <= 0) {
                        a2 = "UTF-8";
                    }
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString(a2);
                    try {
                        return new JSONObject(byteArrayOutputStream2);
                    } catch (Exception e) {
                        l.a.a.a.c a3 = f.a();
                        StringBuilder a4 = i.a.a.a.a.a("Failed to parse settings JSON from ");
                        a4.append(getUrl());
                        String sb = a4.toString();
                        if (a3.a("Fabric", 3)) {
                            Log.d("Fabric", sb, e);
                        }
                        l.a.a.a.c a5 = f.a();
                        String b3 = i.a.a.a.a.b("Settings response ", byteArrayOutputStream2);
                        if (!a5.a("Fabric", 3)) {
                            return null;
                        }
                        Log.d("Fabric", b3, (Throwable) null);
                        return null;
                    }
                } catch (IOException e2) {
                    throw new HttpRequest.HttpRequestException(e2);
                }
            } catch (IOException e3) {
                throw new HttpRequest.HttpRequestException(e3);
            }
        } else {
            l.a.a.a.c a6 = f.a();
            StringBuilder a7 = i.a.a.a.a.a("Failed to retrieve settings from ");
            a7.append(getUrl());
            String sb2 = a7.toString();
            if (!a6.a("Fabric", 6)) {
                return null;
            }
            Log.e("Fabric", sb2, (Throwable) null);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b A[Catch:{ all -> 0x0075 }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject b(l.a.a.a.o.g.t r10) {
        /*
            r9 = this;
            java.lang.String r0 = "X-REQUEST-ID"
            java.lang.String r1 = "Settings request ID: "
            java.lang.String r2 = "Fabric"
            r3 = 3
            r4 = 0
            java.util.Map r5 = r9.a((l.a.a.a.o.g.t) r10)     // Catch:{ HttpRequestException -> 0x007c, all -> 0x0079 }
            io.fabric.sdk.android.services.network.HttpRequest r6 = r9.getHttpRequest(r5)     // Catch:{ HttpRequestException -> 0x007c, all -> 0x0079 }
            r9.a(r6, r10)     // Catch:{ HttpRequestException -> 0x0077 }
            l.a.a.a.c r10 = l.a.a.a.f.a()     // Catch:{ HttpRequestException -> 0x0077 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ HttpRequestException -> 0x0077 }
            r7.<init>()     // Catch:{ HttpRequestException -> 0x0077 }
            java.lang.String r8 = "Requesting settings from "
            r7.append(r8)     // Catch:{ HttpRequestException -> 0x0077 }
            java.lang.String r8 = r9.getUrl()     // Catch:{ HttpRequestException -> 0x0077 }
            r7.append(r8)     // Catch:{ HttpRequestException -> 0x0077 }
            java.lang.String r7 = r7.toString()     // Catch:{ HttpRequestException -> 0x0077 }
            boolean r10 = r10.a(r2, r3)     // Catch:{ HttpRequestException -> 0x0077 }
            if (r10 == 0) goto L_0x0035
            android.util.Log.d(r2, r7, r4)     // Catch:{ HttpRequestException -> 0x0077 }
        L_0x0035:
            l.a.a.a.c r10 = l.a.a.a.f.a()     // Catch:{ HttpRequestException -> 0x0077 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ HttpRequestException -> 0x0077 }
            r7.<init>()     // Catch:{ HttpRequestException -> 0x0077 }
            java.lang.String r8 = "Settings query params were: "
            r7.append(r8)     // Catch:{ HttpRequestException -> 0x0077 }
            r7.append(r5)     // Catch:{ HttpRequestException -> 0x0077 }
            java.lang.String r5 = r7.toString()     // Catch:{ HttpRequestException -> 0x0077 }
            boolean r10 = r10.a(r2, r3)     // Catch:{ HttpRequestException -> 0x0077 }
            if (r10 == 0) goto L_0x0053
            android.util.Log.d(r2, r5, r4)     // Catch:{ HttpRequestException -> 0x0077 }
        L_0x0053:
            org.json.JSONObject r10 = r9.a((io.fabric.sdk.android.services.network.HttpRequest) r6)     // Catch:{ HttpRequestException -> 0x0077 }
            l.a.a.a.c r5 = l.a.a.a.f.a()
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            java.lang.String r0 = r6.a((java.lang.String) r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r1 = r5.a(r2, r3)
            if (r1 == 0) goto L_0x0073
            android.util.Log.d(r2, r0, r4)
        L_0x0073:
            r4 = r10
            goto L_0x00ac
        L_0x0075:
            r10 = move-exception
            goto L_0x00ad
        L_0x0077:
            r10 = move-exception
            goto L_0x007e
        L_0x0079:
            r10 = move-exception
            r6 = r4
            goto L_0x00ad
        L_0x007c:
            r10 = move-exception
            r6 = r4
        L_0x007e:
            l.a.a.a.c r5 = l.a.a.a.f.a()     // Catch:{ all -> 0x0075 }
            java.lang.String r7 = "Settings request failed."
            r8 = 6
            boolean r5 = r5.a(r2, r8)     // Catch:{ all -> 0x0075 }
            if (r5 == 0) goto L_0x008e
            android.util.Log.e(r2, r7, r10)     // Catch:{ all -> 0x0075 }
        L_0x008e:
            if (r6 == 0) goto L_0x00ac
            l.a.a.a.c r10 = l.a.a.a.f.a()
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            java.lang.String r0 = r6.a((java.lang.String) r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r10 = r10.a(r2, r3)
            if (r10 == 0) goto L_0x00ac
            android.util.Log.d(r2, r0, r4)
        L_0x00ac:
            return r4
        L_0x00ad:
            if (r6 == 0) goto L_0x00cb
            l.a.a.a.c r5 = l.a.a.a.f.a()
            java.lang.StringBuilder r1 = i.a.a.a.a.a(r1)
            java.lang.String r0 = r6.a((java.lang.String) r0)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            boolean r1 = r5.a(r2, r3)
            if (r1 == 0) goto L_0x00cb
            android.util.Log.d(r2, r0, r4)
        L_0x00cb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.g.k.b(l.a.a.a.o.g.t):org.json.JSONObject");
    }

    public final Map<String, String> a(t tVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("build_version", tVar.f5194h);
        hashMap.put("display_version", tVar.f5193g);
        hashMap.put("source", Integer.toString(tVar.f5195i));
        String str = tVar.f5196j;
        if (str != null) {
            hashMap.put("icon_hash", str);
        }
        String str2 = tVar.f5192f;
        if (!i.a(str2)) {
            hashMap.put("instance", str2);
        }
        return hashMap;
    }

    public final HttpRequest a(HttpRequest httpRequest, t tVar) {
        a(httpRequest, a.HEADER_API_KEY, tVar.a);
        a(httpRequest, a.HEADER_CLIENT_TYPE, a.ANDROID_CLIENT_TYPE);
        a(httpRequest, a.HEADER_CLIENT_VERSION, this.kit.getVersion());
        a(httpRequest, a.HEADER_ACCEPT, a.ACCEPT_JSON_VALUE);
        a(httpRequest, "X-CRASHLYTICS-DEVICE-MODEL", tVar.f5191b);
        a(httpRequest, "X-CRASHLYTICS-OS-BUILD-VERSION", tVar.c);
        a(httpRequest, "X-CRASHLYTICS-OS-DISPLAY-VERSION", tVar.d);
        a(httpRequest, "X-CRASHLYTICS-INSTALLATION-ID", tVar.e);
        return httpRequest;
    }

    public final void a(HttpRequest httpRequest, String str, String str2) {
        if (str2 != null) {
            httpRequest.d().setRequestProperty(str, str2);
        }
    }
}
