package i.c.d.o;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import i.c.d.h.a;
import i.c.d.h.g.c;
import i.c.d.h.g.d;
import i.c.d.o.a;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final class q {
    public static final a a;

    static {
        d dVar = new d();
        dVar.a(a.c.class, new a.b());
        dVar.a(a.class, new a.C0135a());
        a = new c(dVar);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Intent r5, i.c.a.a.f<java.lang.String> r6) {
        /*
            java.lang.String r0 = "_nr"
            a((java.lang.String) r0, (android.content.Intent) r5)
            if (r6 == 0) goto L_0x004c
            i.c.d.o.a r0 = new i.c.d.o.a
            java.lang.String r1 = "MESSAGE_DELIVERED"
            r0.<init>(r1, r5)
            i.c.d.o.a$c r5 = new i.c.d.o.a$c
            r5.<init>(r0)
            i.c.d.h.a r0 = a     // Catch:{ EncodingException -> 0x0045 }
            i.c.d.h.g.c r0 = (i.c.d.h.g.c) r0     // Catch:{ EncodingException -> 0x0045 }
            r1 = 0
            if (r0 == 0) goto L_0x0044
            java.io.StringWriter r2 = new java.io.StringWriter     // Catch:{ EncodingException -> 0x0045 }
            r2.<init>()     // Catch:{ EncodingException -> 0x0045 }
            i.c.d.h.g.e r3 = new i.c.d.h.g.e     // Catch:{ IOException -> 0x0035 }
            i.c.d.h.g.d r0 = r0.a     // Catch:{ IOException -> 0x0035 }
            java.util.Map<java.lang.Class<?>, i.c.d.h.c<?>> r4 = r0.a     // Catch:{ IOException -> 0x0035 }
            java.util.Map<java.lang.Class<?>, i.c.d.h.e<?>> r0 = r0.f4672b     // Catch:{ IOException -> 0x0035 }
            r3.<init>(r2, r4, r0)     // Catch:{ IOException -> 0x0035 }
            r3.a((java.lang.Object) r5)     // Catch:{ IOException -> 0x0035 }
            r3.a()     // Catch:{ IOException -> 0x0035 }
            android.util.JsonWriter r5 = r3.c     // Catch:{ IOException -> 0x0035 }
            r5.flush()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            java.lang.String r5 = r2.toString()     // Catch:{ EncodingException -> 0x0045 }
            i.c.a.a.a r0 = new i.c.a.a.a     // Catch:{ EncodingException -> 0x0045 }
            i.c.a.a.d r2 = i.c.a.a.d.VERY_LOW     // Catch:{ EncodingException -> 0x0045 }
            r0.<init>(r1, r5, r2)     // Catch:{ EncodingException -> 0x0045 }
            r6.a(r0)     // Catch:{ EncodingException -> 0x0045 }
            return
        L_0x0044:
            throw r1     // Catch:{ EncodingException -> 0x0045 }
        L_0x0045:
            java.lang.String r5 = "FirebaseMessaging"
            java.lang.String r6 = "Failed to encode big query analytics payload. Skip sending"
            android.util.Log.d(r5, r6)
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.o.q.a(android.content.Intent, i.c.a.a.f):void");
    }

    public static String b(Intent intent) {
        String stringExtra = intent.getStringExtra("from");
        if (stringExtra == null || !stringExtra.startsWith("/topics/")) {
            return null;
        }
        return stringExtra;
    }

    public static boolean a(Intent intent) {
        if (intent == null || "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction())) {
            return false;
        }
        return "1".equals(intent.getStringExtra("google.c.a.e"));
    }

    public static void a(String str, Intent intent) {
        Bundle bundle = new Bundle();
        String stringExtra = intent.getStringExtra("google.c.a.c_id");
        if (stringExtra != null) {
            bundle.putString("_nmid", stringExtra);
        }
        String stringExtra2 = intent.getStringExtra("google.c.a.c_l");
        if (stringExtra2 != null) {
            bundle.putString("_nmn", stringExtra2);
        }
        String stringExtra3 = intent.getStringExtra("google.c.a.m_l");
        if (!TextUtils.isEmpty(stringExtra3)) {
            bundle.putString("label", stringExtra3);
        }
        String stringExtra4 = intent.getStringExtra("google.c.a.m_c");
        if (!TextUtils.isEmpty(stringExtra4)) {
            bundle.putString("message_channel", stringExtra4);
        }
        String b2 = b(intent);
        if (b2 != null) {
            bundle.putString("_nt", b2);
        }
        String stringExtra5 = intent.getStringExtra("google.c.a.ts");
        if (stringExtra5 != null) {
            try {
                bundle.putInt("_nmt", Integer.parseInt(stringExtra5));
            } catch (NumberFormatException e) {
                Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e);
            }
        }
        String stringExtra6 = intent.hasExtra("google.c.a.udt") ? intent.getStringExtra("google.c.a.udt") : null;
        if (stringExtra6 != null) {
            try {
                bundle.putInt("_ndt", Integer.parseInt(stringExtra6));
            } catch (NumberFormatException e2) {
                Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e2);
            }
        }
        String str2 = (intent.getExtras() == null || !p.a(intent.getExtras())) ? "data" : "display";
        if ("_nr".equals(str) || "_nf".equals(str)) {
            bundle.putString("_nmc", str2);
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            String valueOf = String.valueOf(bundle);
            StringBuilder sb = new StringBuilder(valueOf.length() + i.a.a.a.a.a(str, 37));
            sb.append("Logging to scion event=");
            sb.append(str);
            sb.append(" scionPayload=");
            sb.append(valueOf);
            Log.d("FirebaseMessaging", sb.toString());
        }
        FirebaseApp instance = FirebaseApp.getInstance();
        instance.a();
        i.c.d.e.a.a aVar = (i.c.d.e.a.a) instance.d.a(i.c.d.e.a.a.class);
        if (aVar != null) {
            aVar.logEvent("fcm", str, bundle);
        } else {
            Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
        }
    }
}
