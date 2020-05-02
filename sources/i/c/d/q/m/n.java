package i.c.d.q.m;

import android.content.Context;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class n {
    public static final Map<String, n> c = new HashMap();
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4807b;

    public n(Context context, String str) {
        this.a = context;
        this.f4807b = str;
    }

    public synchronized Void a(f fVar) {
        FileOutputStream openFileOutput = this.a.openFileOutput(this.f4807b, 0);
        try {
            openFileOutput.write(fVar.toString().getBytes("UTF-8"));
        } finally {
            openFileOutput.close();
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[SYNTHETIC, Splitter:B:14:0x0031] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0038 A[Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }] */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized i.c.d.q.m.f b() {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            android.content.Context r1 = r6.a     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            java.lang.String r2 = r6.f4807b     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            java.io.FileInputStream r1 = r1.openFileInput(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0035, all -> 0x002b }
            int r2 = r1.available()     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r4 = 0
            r1.read(r3, r4, r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            java.lang.String r4 = "UTF-8"
            r2.<init>(r3, r4)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r3.<init>(r2)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            i.c.d.q.m.f r0 = i.c.d.q.m.f.a(r3)     // Catch:{ FileNotFoundException | JSONException -> 0x0036, all -> 0x0029 }
            r1.close()     // Catch:{ all -> 0x003c }
            monitor-exit(r6)
            return r0
        L_0x0029:
            r0 = move-exception
            goto L_0x002f
        L_0x002b:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x002f:
            if (r1 == 0) goto L_0x0034
            r1.close()     // Catch:{ all -> 0x003c }
        L_0x0034:
            throw r0     // Catch:{ all -> 0x003c }
        L_0x0035:
            r1 = r0
        L_0x0036:
            if (r1 == 0) goto L_0x003f
            r1.close()     // Catch:{ all -> 0x003c }
            goto L_0x003f
        L_0x003c:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x003f:
            monitor-exit(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.q.m.n.b():i.c.d.q.m.f");
    }

    public synchronized Void a() {
        this.a.deleteFile(this.f4807b);
        return null;
    }

    public static synchronized n a(Context context, String str) {
        n nVar;
        synchronized (n.class) {
            if (!c.containsKey(str)) {
                c.put(str, new n(context, str));
            }
            nVar = c.get(str);
        }
        return nVar;
    }
}
