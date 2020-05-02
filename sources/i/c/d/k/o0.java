package i.c.d.k;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class o0 implements Callable {
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final Intent f4709f;

    public o0(Context context, Intent intent) {
        this.e = context;
        this.f4709f = intent;
    }

    public final Object call() {
        int i2;
        ComponentName componentName;
        Context context = this.e;
        Intent intent = this.f4709f;
        a0 a = a0.a();
        if (a != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Starting service");
            }
            a.d.offer(intent);
            Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
            intent2.setPackage(context.getPackageName());
            String a2 = a.a(context, intent2);
            if (a2 != null) {
                if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    Log.d("FirebaseInstanceId", a2.length() != 0 ? "Restricting intent to a specific service: ".concat(a2) : new String("Restricting intent to a specific service: "));
                }
                intent2.setClassName(context.getPackageName(), a2);
            }
            try {
                if (a.a(context)) {
                    componentName = h0.a(context, intent2);
                } else {
                    componentName = context.startService(intent2);
                    Log.d("FirebaseInstanceId", "Missing wake lock permission, service start may be delayed");
                }
                if (componentName == null) {
                    Log.e("FirebaseInstanceId", "Error while delivering the message: ServiceIntent not found.");
                    i2 = 404;
                } else {
                    i2 = -1;
                }
            } catch (SecurityException e2) {
                Log.e("FirebaseInstanceId", "Error while delivering the message to the serviceIntent", e2);
                i2 = 401;
            } catch (IllegalStateException e3) {
                String valueOf = String.valueOf(e3);
                StringBuilder sb = new StringBuilder(valueOf.length() + 45);
                sb.append("Failed to start service while in background: ");
                sb.append(valueOf);
                Log.e("FirebaseInstanceId", sb.toString());
                i2 = 402;
            }
            return Integer.valueOf(i2);
        }
        throw null;
    }
}
