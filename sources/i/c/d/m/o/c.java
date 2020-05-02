package i.c.d.m.o;

import com.crashlytics.android.core.CrashlyticsController;
import com.google.firebase.FirebaseApp;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
public class c {
    public final File a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseApp f4740b;

    /* compiled from: com.google.firebase:firebase-installations@@16.1.0 */
    public enum a {
        ATTEMPT_MIGRATION,
        NOT_GENERATED,
        UNREGISTERED,
        REGISTERED,
        REGISTER_ERROR
    }

    public c(FirebaseApp firebaseApp) {
        firebaseApp.a();
        File filesDir = firebaseApp.a.getFilesDir();
        StringBuilder a2 = i.a.a.a.a.a("PersistedInstallation.");
        a2.append(firebaseApp.b());
        a2.append(CrashlyticsController.SESSION_JSON_SUFFIX);
        this.a = new File(filesDir, a2.toString());
        this.f4740b = firebaseApp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r1 = new org.json.JSONObject(r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i.c.d.m.o.d a() {
        /*
            r11 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r1]
            r3 = 0
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException | JSONException -> 0x002f }
            java.io.File r5 = r11.a     // Catch:{ IOException | JSONException -> 0x002f }
            r4.<init>(r5)     // Catch:{ IOException | JSONException -> 0x002f }
        L_0x0011:
            int r5 = r4.read(r2, r3, r1)     // Catch:{ all -> 0x0028 }
            if (r5 >= 0) goto L_0x0024
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ all -> 0x0028 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0028 }
            r1.<init>(r0)     // Catch:{ all -> 0x0028 }
            r4.close()     // Catch:{ IOException | JSONException -> 0x002f }
            goto L_0x0034
        L_0x0024:
            r0.write(r2, r3, r5)     // Catch:{ all -> 0x0028 }
            goto L_0x0011
        L_0x0028:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            throw r0     // Catch:{ IOException | JSONException -> 0x002f }
        L_0x002f:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
        L_0x0034:
            r0 = 0
            java.lang.String r2 = "Fid"
            java.lang.String r2 = r1.optString(r2, r0)
            i.c.d.m.o.c$a r4 = i.c.d.m.o.c.a.ATTEMPT_MIGRATION
            java.lang.String r4 = "Status"
            int r3 = r1.optInt(r4, r3)
            java.lang.String r4 = "AuthToken"
            java.lang.String r4 = r1.optString(r4, r0)
            java.lang.String r5 = "RefreshToken"
            java.lang.String r5 = r1.optString(r5, r0)
            r6 = 0
            java.lang.String r8 = "TokenCreationEpochInSecs"
            long r8 = r1.optLong(r8, r6)
            java.lang.String r10 = "ExpiresInSecs"
            long r6 = r1.optLong(r10, r6)
            java.lang.String r10 = "FisError"
            java.lang.String r0 = r1.optString(r10, r0)
            i.c.d.m.o.d$a r1 = i.c.d.m.o.d.e()
            i.c.d.m.o.a$b r1 = (i.c.d.m.o.a.b) r1
            r1.a = r2
            i.c.d.m.o.c$a[] r2 = i.c.d.m.o.c.a.values()
            r2 = r2[r3]
            r1.a((i.c.d.m.o.c.a) r2)
            r1.c = r4
            r1.d = r5
            r1.b(r8)
            r1.a((long) r6)
            r1.f4738g = r0
            i.c.d.m.o.d r0 = r1.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.m.o.c.a():i.c.d.m.o.d");
    }

    public d a(d dVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ((a) dVar).a);
            jSONObject.put("Status", ((a) dVar).f4733b.ordinal());
            jSONObject.put("AuthToken", ((a) dVar).c);
            jSONObject.put("RefreshToken", ((a) dVar).d);
            jSONObject.put("TokenCreationEpochInSecs", ((a) dVar).f4734f);
            jSONObject.put("ExpiresInSecs", ((a) dVar).e);
            jSONObject.put("FisError", ((a) dVar).f4735g);
            FirebaseApp firebaseApp = this.f4740b;
            firebaseApp.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", firebaseApp.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (createTempFile.renameTo(this.a)) {
                return dVar;
            }
            throw new IOException("unable to rename the tmpfile to PersistedInstallation");
        } catch (IOException | JSONException unused) {
        }
    }
}
