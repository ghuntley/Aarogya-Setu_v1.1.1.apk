package i.c.a.b.b.a.b.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import i.c.a.b.d.l.q;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class a {
    public static final Lock c = new ReentrantLock();
    @GuardedBy("sLk")
    public static a d;
    public final Lock a = new ReentrantLock();
    @GuardedBy("mLk")

    /* renamed from: b  reason: collision with root package name */
    public final SharedPreferences f3011b;

    public a(Context context) {
        this.f3011b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        q.a(context);
        c.lock();
        try {
            if (d == null) {
                d = new a(context.getApplicationContext());
            }
            return d;
        } finally {
            c.unlock();
        }
    }

    @Nullable
    public GoogleSignInAccount a() {
        String a2 = a("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        StringBuilder sb = new StringBuilder(i.a.a.a.a.a(a2, 20));
        sb.append("googleSignInAccount");
        sb.append(":");
        sb.append(a2);
        String a3 = a(sb.toString());
        if (a3 == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.a(a3);
        } catch (JSONException unused) {
            return null;
        }
    }

    @Nullable
    public final String a(String str) {
        this.a.lock();
        try {
            return this.f3011b.getString(str, (String) null);
        } finally {
            this.a.unlock();
        }
    }
}
