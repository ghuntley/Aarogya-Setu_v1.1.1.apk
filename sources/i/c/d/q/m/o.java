package i.c.d.q.m;

import android.content.Context;
import android.content.SharedPreferences;
import i.c.d.q.k;
import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import k.a.a.d;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class o {
    public static final Charset d = Charset.forName("UTF-8");
    public static final ThreadLocal<DateFormat> e = new a();
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4808b;
    public final SharedPreferences c;

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public class a extends ThreadLocal<DateFormat> {
        public Object initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
        }
    }

    /* compiled from: com.google.firebase:firebase-config@@19.1.3 */
    public static class b {
        public f a;

        /* renamed from: b  reason: collision with root package name */
        public f f4809b;
        public f c;

        public b() {
        }

        public /* synthetic */ b(a aVar) {
        }
    }

    public o(Context context, String str) {
        this.a = context;
        this.f4808b = str;
        this.c = context.getSharedPreferences("com.google.firebase.remoteconfig_legacy_settings", 0);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00f4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, i.c.d.q.m.f> a(i.c.d.q.n.b r15) {
        /*
            r14 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Date r1 = new java.util.Date
            long r2 = r15.f4814j
            r1.<init>(r2)
            i.c.f.l$b<i.c.f.f> r2 = r15.f4815k
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0017:
            boolean r4 = r2.hasNext()
            java.lang.String r5 = "FirebaseRemoteConfig"
            if (r4 == 0) goto L_0x0076
            java.lang.Object r4 = r2.next()
            i.c.f.f r4 = (i.c.f.f) r4
            r6 = 0
            if (r4 == 0) goto L_0x005e
            r4.size()     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            int r7 = r4.size()     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            byte[] r8 = new byte[r7]     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            r9 = 0
            r10 = 0
        L_0x0033:
            if (r9 >= r7) goto L_0x0054
            int r11 = r10 + 1
            byte r10 = r4.c(r10)     // Catch:{ IndexOutOfBoundsException -> 0x0049 }
            java.lang.Byte r10 = java.lang.Byte.valueOf(r10)     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            byte r10 = r10.byteValue()     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            r8[r9] = r10     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            int r9 = r9 + 1
            r10 = r11
            goto L_0x0033
        L_0x0049:
            r4 = move-exception
            java.util.NoSuchElementException r7 = new java.util.NoSuchElementException     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            java.lang.String r4 = r4.getMessage()     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            r7.<init>(r4)     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            throw r7     // Catch:{ InvalidProtocolBufferException -> 0x005f }
        L_0x0054:
            k.a.a.d r4 = k.a.a.d.v     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            i.c.f.k r4 = i.c.f.k.a(r4, (byte[]) r8)     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            k.a.a.d r4 = (k.a.a.d) r4     // Catch:{ InvalidProtocolBufferException -> 0x005f }
            r6 = r4
            goto L_0x0065
        L_0x005e:
            throw r6     // Catch:{ InvalidProtocolBufferException -> 0x005f }
        L_0x005f:
            r4 = move-exception
            java.lang.String r7 = "Payload was not defined or could not be deserialized."
            android.util.Log.d(r5, r7, r4)
        L_0x0065:
            if (r6 == 0) goto L_0x0017
            org.json.JSONObject r4 = r14.a((k.a.a.d) r6)     // Catch:{ JSONException -> 0x006f }
            r3.put(r4)     // Catch:{ JSONException -> 0x006f }
            goto L_0x0017
        L_0x006f:
            r4 = move-exception
            java.lang.String r6 = "A legacy ABT experiment could not be parsed."
            android.util.Log.d(r5, r6, r4)
            goto L_0x0017
        L_0x0076:
            i.c.f.l$b<i.c.d.q.n.h> r15 = r15.f4813i
            java.util.Iterator r15 = r15.iterator()
        L_0x007c:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L_0x0103
            java.lang.Object r2 = r15.next()
            i.c.d.q.n.h r2 = (i.c.d.q.n.h) r2
            java.lang.String r4 = r2.f4830i
            java.lang.String r6 = "configns:"
            boolean r6 = r4.startsWith(r6)
            if (r6 == 0) goto L_0x0098
            r6 = 9
            java.lang.String r4 = r4.substring(r6)
        L_0x0098:
            i.c.d.q.m.f$b r6 = i.c.d.q.m.f.a()
            i.c.f.l$b<i.c.d.q.n.d> r2 = r2.f4831j
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x00a7:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L_0x00d8
            java.lang.Object r8 = r2.next()
            i.c.d.q.n.d r8 = (i.c.d.q.n.d) r8
            java.lang.String r9 = r8.f4819i
            i.c.f.f r8 = r8.f4820j
            java.nio.charset.Charset r10 = d
            int r11 = r8.size()
            if (r11 != 0) goto L_0x00c2
            java.lang.String r8 = ""
            goto L_0x00d4
        L_0x00c2:
            i.c.f.f$g r8 = (i.c.f.f.g) r8
            java.lang.String r11 = new java.lang.String
            byte[] r12 = r8.f4937h
            int r13 = r8.e()
            int r8 = r8.size()
            r11.<init>(r12, r13, r8, r10)
            r8 = r11
        L_0x00d4:
            r7.put(r9, r8)
            goto L_0x00a7
        L_0x00d8:
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>(r7)
            r6.a = r2
            r6.f4792b = r1
            java.lang.String r2 = "firebase"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00f4
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00f4 }
            java.lang.String r7 = r3.toString()     // Catch:{ JSONException -> 0x00f4 }
            r2.<init>(r7)     // Catch:{ JSONException -> 0x00f4 }
            r6.c = r2     // Catch:{ JSONException -> 0x00f4 }
        L_0x00f4:
            i.c.d.q.m.f r2 = r6.a()     // Catch:{ JSONException -> 0x00fc }
            r0.put(r4, r2)     // Catch:{ JSONException -> 0x00fc }
            goto L_0x007c
        L_0x00fc:
            java.lang.String r2 = "A set of legacy configs could not be converted."
            android.util.Log.d(r5, r2)
            goto L_0x007c
        L_0x0103:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.q.m.o.a(i.c.d.q.n.b):java.util.Map");
    }

    public final JSONObject a(d dVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("experimentId", dVar.f5016i);
        jSONObject.put("variantId", dVar.f5017j);
        jSONObject.put("experimentStartTime", e.get().format(new Date(dVar.f5018k)));
        jSONObject.put("triggerEvent", dVar.f5019l);
        jSONObject.put("triggerTimeoutMillis", dVar.f5020m);
        jSONObject.put("timeToLiveMillis", dVar.f5021n);
        return jSONObject;
    }

    public e a(String str, String str2) {
        return k.a(this.a, this.f4808b, str, str2);
    }
}
