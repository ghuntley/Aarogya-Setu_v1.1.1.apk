package i.c.d.k;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class a0 {
    public static a0 e;
    @GuardedBy("this")
    public String a = null;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f4680b = null;
    public Boolean c = null;
    public final Queue<Intent> d = new ArrayDeque();

    public static synchronized a0 a() {
        a0 a0Var;
        synchronized (a0.class) {
            if (e == null) {
                e = new a0();
            }
            a0Var = e;
        }
        return a0Var;
    }

    public final boolean b(Context context) {
        if (this.c == null) {
            this.c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f4680b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.c.booleanValue();
    }

    public final synchronized String a(Context context, Intent intent) {
        if (this.a != null) {
            return this.a;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService != null) {
            if (resolveService.serviceInfo != null) {
                ServiceInfo serviceInfo = resolveService.serviceInfo;
                if (context.getPackageName().equals(serviceInfo.packageName)) {
                    if (serviceInfo.name != null) {
                        if (serviceInfo.name.startsWith(".")) {
                            String valueOf = String.valueOf(context.getPackageName());
                            String valueOf2 = String.valueOf(serviceInfo.name);
                            this.a = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        } else {
                            this.a = serviceInfo.name;
                        }
                        return this.a;
                    }
                }
                String str = serviceInfo.packageName;
                String str2 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 94 + String.valueOf(str2).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str);
                sb.append("/");
                sb.append(str2);
                Log.e("FirebaseInstanceId", sb.toString());
                return null;
            }
        }
        Log.e("FirebaseInstanceId", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    public final boolean a(Context context) {
        if (this.f4680b == null) {
            this.f4680b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f4680b.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f4680b.booleanValue();
    }
}
