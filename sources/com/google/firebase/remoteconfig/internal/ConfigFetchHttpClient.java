package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class ConfigFetchHttpClient {

    /* renamed from: h  reason: collision with root package name */
    public static final Pattern f710h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f711b;
    public final String c;
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final long f712f;

    /* renamed from: g  reason: collision with root package name */
    public final long f713g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j2, long j3) {
        this.a = context;
        this.f711b = str;
        this.c = str2;
        Matcher matcher = f710h.matcher(str);
        this.d = matcher.matches() ? matcher.group(1) : null;
        this.e = str3;
        this.f712f = j2;
        this.f713g = j3;
    }

    public HttpURLConnection a() {
        try {
            return (HttpURLConnection) new URL(String.format("https://firebaseremoteconfig.googleapis.com/v1/projects/%s/namespaces/%s:fetch", new Object[]{this.d, this.e})).openConnection();
        } catch (IOException e2) {
            throw new FirebaseRemoteConfigException(e2.getMessage());
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(14:30|31|32|33|34|(2:38|39)|40|42|43|(2:46|47)|48|49|50|51) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x0130 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a3 A[LOOP:0: B:10:0x009d->B:12:0x00a3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00d5 A[Catch:{ IOException | JSONException -> 0x0151, all -> 0x014f }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0145 A[SYNTHETIC, Splitter:B:55:0x0145] */
    @androidx.annotation.Keep
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i.c.d.q.m.k.a fetch(java.net.HttpURLConnection r7, java.lang.String r8, java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12, java.util.Date r13) {
        /*
            r6 = this;
            r0 = 1
            r7.setDoOutput(r0)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r6.f712f
            long r1 = r1.toMillis(r2)
            int r2 = (int) r1
            r7.setConnectTimeout(r2)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r6.f713g
            long r1 = r1.toMillis(r2)
            int r2 = (int) r1
            r7.setReadTimeout(r2)
            java.lang.String r1 = "If-None-Match"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = r6.c
            java.lang.String r1 = "X-Goog-Api-Key"
            r7.setRequestProperty(r1, r11)
            android.content.Context r11 = r6.a
            java.lang.String r11 = r11.getPackageName()
            java.lang.String r1 = "X-Android-Package"
            r7.setRequestProperty(r1, r11)
            java.lang.String r11 = "FirebaseRemoteConfig"
            r1 = 0
            r2 = 0
            android.content.Context r3 = r6.a     // Catch:{ NameNotFoundException -> 0x0065 }
            android.content.Context r4 = r6.a     // Catch:{ NameNotFoundException -> 0x0065 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0065 }
            byte[] r3 = i.c.a.b.d.o.a.a(r3, r4)     // Catch:{ NameNotFoundException -> 0x0065 }
            if (r3 != 0) goto L_0x0060
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x0065 }
            r3.<init>()     // Catch:{ NameNotFoundException -> 0x0065 }
            java.lang.String r4 = "Could not get fingerprint hash for package: "
            r3.append(r4)     // Catch:{ NameNotFoundException -> 0x0065 }
            android.content.Context r4 = r6.a     // Catch:{ NameNotFoundException -> 0x0065 }
            java.lang.String r4 = r4.getPackageName()     // Catch:{ NameNotFoundException -> 0x0065 }
            r3.append(r4)     // Catch:{ NameNotFoundException -> 0x0065 }
            java.lang.String r3 = r3.toString()     // Catch:{ NameNotFoundException -> 0x0065 }
            android.util.Log.e(r11, r3)     // Catch:{ NameNotFoundException -> 0x0065 }
            goto L_0x007c
        L_0x0060:
            java.lang.String r11 = i.c.a.b.d.o.d.a(r3, r1)     // Catch:{ NameNotFoundException -> 0x0065 }
            goto L_0x007d
        L_0x0065:
            r3 = move-exception
            java.lang.String r4 = "No such package: "
            java.lang.StringBuilder r4 = i.a.a.a.a.a(r4)
            android.content.Context r5 = r6.a
            java.lang.String r5 = r5.getPackageName()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.util.Log.e(r11, r4, r3)
        L_0x007c:
            r11 = r2
        L_0x007d:
            java.lang.String r3 = "X-Android-Cert"
            r7.setRequestProperty(r3, r11)
            java.lang.String r11 = "X-Google-GFE-Can-Retry"
            java.lang.String r3 = "yes"
            r7.setRequestProperty(r11, r3)
            java.lang.String r11 = "application/json"
            java.lang.String r3 = "Content-Type"
            r7.setRequestProperty(r3, r11)
            java.lang.String r3 = "Accept"
            r7.setRequestProperty(r3, r11)
            java.util.Set r11 = r12.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x009d:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00b9
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r3 = r12.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r7.setRequestProperty(r3, r12)
            goto L_0x009d
        L_0x00b9:
            org.json.JSONObject r8 = r6.a(r8, r9, r10)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            java.lang.String r9 = "utf-8"
            byte[] r8 = r8.getBytes(r9)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            r6.a(r7, r8)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            r7.connect()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            int r8 = r7.getResponseCode()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            r9 = 200(0xc8, float:2.8E-43)
            if (r8 != r9) goto L_0x0145
            java.lang.String r8 = "ETag"
            java.lang.String r8 = r7.getHeaderField(r8)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            org.json.JSONObject r9 = r6.a(r7)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x00e9 }
            r7.close()     // Catch:{ IOException -> 0x00e9 }
        L_0x00e9:
            java.lang.String r7 = "state"
            java.lang.Object r7 = r9.get(r7)     // Catch:{ JSONException -> 0x00f7 }
            java.lang.String r10 = "NO_CHANGE"
            boolean r7 = r7.equals(r10)     // Catch:{ JSONException -> 0x00f7 }
            r7 = r7 ^ r0
            goto L_0x00f8
        L_0x00f7:
            r7 = 1
        L_0x00f8:
            if (r7 != 0) goto L_0x0100
            i.c.d.q.m.k$a r7 = new i.c.d.q.m.k$a
            r7.<init>(r13, r0, r2, r2)
            return r7
        L_0x0100:
            i.c.d.q.m.f$b r7 = i.c.d.q.m.f.a()     // Catch:{ JSONException -> 0x013c }
            r7.f4792b = r13     // Catch:{ JSONException -> 0x013c }
            java.lang.String r10 = "entries"
            org.json.JSONObject r10 = r9.getJSONObject(r10)     // Catch:{ JSONException -> 0x010d }
            goto L_0x010e
        L_0x010d:
            r10 = r2
        L_0x010e:
            if (r10 == 0) goto L_0x011b
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011b }
            java.lang.String r10 = r10.toString()     // Catch:{ JSONException -> 0x011b }
            r11.<init>(r10)     // Catch:{ JSONException -> 0x011b }
            r7.a = r11     // Catch:{ JSONException -> 0x011b }
        L_0x011b:
            java.lang.String r10 = "experimentDescriptions"
            org.json.JSONArray r2 = r9.getJSONArray(r10)     // Catch:{ JSONException -> 0x0122 }
            goto L_0x0123
        L_0x0122:
        L_0x0123:
            if (r2 == 0) goto L_0x0130
            org.json.JSONArray r9 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0130 }
            java.lang.String r10 = r2.toString()     // Catch:{ JSONException -> 0x0130 }
            r9.<init>(r10)     // Catch:{ JSONException -> 0x0130 }
            r7.c = r9     // Catch:{ JSONException -> 0x0130 }
        L_0x0130:
            i.c.d.q.m.f r7 = r7.a()     // Catch:{ JSONException -> 0x013c }
            i.c.d.q.m.k$a r9 = new i.c.d.q.m.k$a
            java.util.Date r10 = r7.c
            r9.<init>(r10, r1, r7, r8)
            return r9
        L_0x013c:
            r7 = move-exception
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r8 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException
            java.lang.String r9 = "Fetch failed: fetch response could not be parsed."
            r8.<init>(r9, r7)
            throw r8
        L_0x0145:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException r9 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            java.lang.String r10 = r7.getResponseMessage()     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            r9.<init>(r8, r10)     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
            throw r9     // Catch:{ IOException -> 0x0153, JSONException -> 0x0151 }
        L_0x014f:
            r8 = move-exception
            goto L_0x015c
        L_0x0151:
            r8 = move-exception
            goto L_0x0154
        L_0x0153:
            r8 = move-exception
        L_0x0154:
            com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException r9 = new com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException     // Catch:{ all -> 0x014f }
            java.lang.String r10 = "The client had an error while calling the backend!"
            r9.<init>(r10, r8)     // Catch:{ all -> 0x014f }
            throw r9     // Catch:{ all -> 0x014f }
        L_0x015c:
            r7.disconnect()
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ IOException -> 0x0166 }
            r7.close()     // Catch:{ IOException -> 0x0166 }
        L_0x0166:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient.fetch(java.net.HttpURLConnection, java.lang.String, java.lang.String, java.util.Map, java.lang.String, java.util.Map, java.util.Date):i.c.d.q.m.k$a");
    }

    public final JSONObject a(String str, String str2, Map<String, String> map) {
        HashMap hashMap = new HashMap();
        if (str != null) {
            hashMap.put("appInstanceId", str);
            hashMap.put("appInstanceIdToken", str2);
            hashMap.put("appId", this.f711b);
            Locale locale = this.a.getResources().getConfiguration().locale;
            hashMap.put("countryCode", locale.getCountry());
            hashMap.put("languageCode", locale.toLanguageTag());
            hashMap.put("platformVersion", Integer.toString(Build.VERSION.SDK_INT));
            hashMap.put("timeZone", TimeZone.getDefault().getID());
            try {
                PackageInfo packageInfo = this.a.getPackageManager().getPackageInfo(this.a.getPackageName(), 0);
                if (packageInfo != null) {
                    hashMap.put("appVersion", packageInfo.versionName);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            hashMap.put("packageName", this.a.getPackageName());
            hashMap.put("sdkVersion", "19.1.3");
            hashMap.put("analyticsUserProperties", new JSONObject(map));
            return new JSONObject(hashMap);
        }
        throw new FirebaseRemoteConfigClientException("Fetch failed: Firebase instance id is null.");
    }

    public final void a(HttpURLConnection httpURLConnection, byte[] bArr) {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(URLConnection uRLConnection) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read();
            if (read == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) read);
        }
    }
}
