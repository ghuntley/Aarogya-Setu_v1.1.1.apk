package i.c.d.k;

import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import i.c.a.b.d.l.q;
import i.c.a.b.l.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class c implements b0 {
    public static final Object c = new Object();
    @GuardedBy("lock")
    public static k0 d;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final ExecutorService f4682b;

    public c(Context context, ExecutorService executorService) {
        this.a = context;
        this.f4682b = executorService;
    }

    public static final /* synthetic */ Integer b() {
        return 403;
    }

    public final g<Integer> a(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        boolean z = false;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        Context context = this.a;
        boolean z2 = q.f() && context.getApplicationInfo().targetSdkVersion >= 26;
        if ((intent.getFlags() & 268435456) != 0) {
            z = true;
        }
        if (!z2 || z) {
            return q.a((Executor) this.f4682b, new o0(context, intent)).b(this.f4682b, new n0(context, intent));
        }
        return a(context, intent);
    }

    public static g<Integer> a(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Binding to service");
        }
        return a(context, "com.google.firebase.MESSAGING_EVENT").a(intent).a(s0.a, q0.a);
    }

    public static k0 a(Context context, String str) {
        k0 k0Var;
        synchronized (c) {
            if (d == null) {
                d = new k0(context, str);
            }
            k0Var = d;
        }
        return k0Var;
    }

    public static final /* synthetic */ Integer a() {
        return -1;
    }
}
