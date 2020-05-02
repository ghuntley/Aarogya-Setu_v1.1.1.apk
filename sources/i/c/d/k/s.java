package i.c.d.k;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import i.c.a.b.d.l.q;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class s {
    public final Context a;
    @GuardedBy("this")

    /* renamed from: b  reason: collision with root package name */
    public String f4711b;
    @GuardedBy("this")
    public String c;
    @GuardedBy("this")
    public int d;
    @GuardedBy("this")
    public int e = 0;

    public s(Context context) {
        this.a = context;
    }

    public final synchronized int a() {
        if (this.e != 0) {
            return this.e;
        }
        PackageManager packageManager = this.a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseInstanceId", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!q.f()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseInstanceId", "Failed to resolve IID implementation package, falling back");
            if (q.f()) {
                this.e = 2;
            } else {
                this.e = 1;
            }
            return this.e;
        }
        this.e = 2;
        return 2;
    }

    public final synchronized String b() {
        if (this.f4711b == null) {
            e();
        }
        return this.f4711b;
    }

    public final synchronized String c() {
        if (this.c == null) {
            e();
        }
        return this.c;
    }

    public final synchronized int d() {
        PackageInfo a2;
        if (this.d == 0 && (a2 = a("com.google.android.gms")) != null) {
            this.d = a2.versionCode;
        }
        return this.d;
    }

    public final synchronized void e() {
        PackageInfo a2 = a(this.a.getPackageName());
        if (a2 != null) {
            this.f4711b = Integer.toString(a2.versionCode);
            this.c = a2.versionName;
        }
    }

    public final PackageInfo a(String str) {
        try {
            return this.a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            String valueOf = String.valueOf(e2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 23);
            sb.append("Failed to find package ");
            sb.append(valueOf);
            Log.w("FirebaseInstanceId", sb.toString());
            return null;
        }
    }

    public static String a(FirebaseApp firebaseApp) {
        firebaseApp.a();
        String str = firebaseApp.c.e;
        if (str != null) {
            return str;
        }
        firebaseApp.a();
        String str2 = firebaseApp.c.f4636b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }
}
