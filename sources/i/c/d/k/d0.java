package i.c.d.k;

import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class d0 {
    public static final long d = TimeUnit.DAYS.toMillis(7);
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4686b;
    public final long c;

    public d0(String str, String str2, long j2) {
        this.a = str;
        this.f4686b = str2;
        this.c = j2;
    }

    public static d0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.startsWith("{")) {
            return new d0(str, (String) null, 0);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new d0(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to parse token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String a(String str, String str2, long j2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j2);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String a(d0 d0Var) {
        if (d0Var == null) {
            return null;
        }
        return d0Var.a;
    }
}
