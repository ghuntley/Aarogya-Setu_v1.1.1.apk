package i.c.d.m.o;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public class b {
    public static final String[] c = {"*", "FCM", "GCM", ""};
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4739b;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0047, code lost:
        if (r0.isEmpty() != false) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(com.google.firebase.FirebaseApp r4) {
        /*
            r3 = this;
            r3.<init>()
            r4.a()
            android.content.Context r0 = r4.a
            r1 = 0
            java.lang.String r2 = "com.google.android.gms.appid"
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r2, r1)
            r3.a = r0
            r4.a()
            i.c.d.c r0 = r4.c
            java.lang.String r0 = r0.e
            if (r0 == 0) goto L_0x001b
            goto L_0x004a
        L_0x001b:
            r4.a()
            i.c.d.c r4 = r4.c
            java.lang.String r0 = r4.f4636b
            java.lang.String r4 = "1:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            java.lang.String r4 = "2:"
            boolean r4 = r0.startsWith(r4)
            if (r4 != 0) goto L_0x0033
            goto L_0x004a
        L_0x0033:
            java.lang.String r4 = ":"
            java.lang.String[] r4 = r0.split(r4)
            int r0 = r4.length
            r1 = 4
            r2 = 0
            if (r0 == r1) goto L_0x0040
        L_0x003e:
            r0 = r2
            goto L_0x004a
        L_0x0040:
            r0 = 1
            r0 = r4[r0]
            boolean r4 = r0.isEmpty()
            if (r4 == 0) goto L_0x004a
            goto L_0x003e
        L_0x004a:
            r3.f4739b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.m.o.b.<init>(com.google.firebase.FirebaseApp):void");
    }

    public String a() {
        synchronized (this.a) {
            String b2 = b();
            if (b2 != null) {
                return b2;
            }
            String c2 = c();
            return c2;
        }
    }

    public final String b() {
        String string;
        synchronized (this.a) {
            string = this.a.getString("|S|id", (String) null);
        }
        return string;
    }

    public final String c() {
        String str;
        PublicKey publicKey;
        synchronized (this.a) {
            str = null;
            String string = this.a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            try {
                publicKey = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(string, 8)));
            } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
                Log.w("ContentValues", "Invalid key stored " + e);
                publicKey = null;
            }
            if (publicKey == null) {
                return null;
            }
            try {
                byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
                digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
                str = Base64.encodeToString(digest, 0, 8, 11);
            } catch (NoSuchAlgorithmException unused) {
                Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            }
        }
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003b, code lost:
        if (r5.startsWith("{") == false) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4 = new org.json.JSONObject(r5).getString("token");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String d() {
        /*
            r9 = this;
            android.content.SharedPreferences r0 = r9.a
            monitor-enter(r0)
            java.lang.String[] r1 = c     // Catch:{ all -> 0x0050 }
            int r2 = r1.length     // Catch:{ all -> 0x0050 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x004e
            r5 = r1[r3]     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = r9.f4739b     // Catch:{ all -> 0x0050 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r7.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r8 = "|T|"
            r7.append(r8)     // Catch:{ all -> 0x0050 }
            r7.append(r6)     // Catch:{ all -> 0x0050 }
            java.lang.String r6 = "|"
            r7.append(r6)     // Catch:{ all -> 0x0050 }
            r7.append(r5)     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = r7.toString()     // Catch:{ all -> 0x0050 }
            android.content.SharedPreferences r6 = r9.a     // Catch:{ all -> 0x0050 }
            java.lang.String r5 = r6.getString(r5, r4)     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x004b
            boolean r6 = r5.isEmpty()     // Catch:{ all -> 0x0050 }
            if (r6 != 0) goto L_0x004b
            java.lang.String r1 = "{"
            boolean r1 = r5.startsWith(r1)     // Catch:{ all -> 0x0050 }
            if (r1 == 0) goto L_0x0049
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0048 }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x0048 }
            java.lang.String r2 = "token"
            java.lang.String r4 = r1.getString(r2)     // Catch:{ JSONException -> 0x0048 }
        L_0x0048:
            r5 = r4
        L_0x0049:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r5
        L_0x004b:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x004e:
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            return r4
        L_0x0050:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0050 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.m.o.b.d():java.lang.String");
    }
}
