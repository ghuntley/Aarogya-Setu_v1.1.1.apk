package i.c.d.q.m;

import android.util.Log;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public class l {
    public static final Pattern c = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
    public static final Pattern d = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    public final e a;

    /* renamed from: b  reason: collision with root package name */
    public final e f4804b;

    static {
        Charset.forName("UTF-8");
    }

    public l(e eVar, e eVar2) {
        this.a = eVar;
        this.f4804b = eVar2;
    }

    public static Long a(e eVar, String str) {
        f a2 = eVar.a(5);
        if (a2 == null) {
            return null;
        }
        try {
            return Long.valueOf(a2.f4791b.getLong(str));
        } catch (JSONException unused) {
            return null;
        }
    }

    public static String b(e eVar, String str) {
        f a2 = eVar.a(5);
        if (a2 == null) {
            return null;
        }
        try {
            return a2.f4791b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void a(String str, String str2) {
        Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str}));
    }
}
