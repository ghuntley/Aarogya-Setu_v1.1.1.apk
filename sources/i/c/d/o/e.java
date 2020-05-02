package i.c.d.o;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import i.c.a.b.d.l.q;
import i.c.a.b.g.e.a;
import i.c.a.b.g.e.b;
import i.c.a.b.l.d0;
import i.c.a.b.l.g;
import i.c.a.b.l.h;
import i.c.a.b.l.s;
import i.c.d.k.a0;
import i.c.d.k.g0;
import i.c.d.k.h0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@SuppressLint({"UnwrappedWakefulBroadcastReceiver"})
/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public abstract class e extends Service {
    public final ExecutorService e;

    /* renamed from: f  reason: collision with root package name */
    public Binder f4759f;

    /* renamed from: g  reason: collision with root package name */
    public final Object f4760g;

    /* renamed from: h  reason: collision with root package name */
    public int f4761h;

    /* renamed from: i  reason: collision with root package name */
    public int f4762i;

    public e() {
        b bVar = a.a;
        String simpleName = getClass().getSimpleName();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new i.c.a.b.d.o.h.a(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new String("Firebase-")));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.e = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.f4760g = new Object();
        this.f4762i = 0;
    }

    public abstract void a(Intent intent);

    public final g<Void> b(Intent intent) {
        boolean z;
        if ("com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra("pending_intent");
            if (pendingIntent != null) {
                try {
                    pendingIntent.send();
                } catch (PendingIntent.CanceledException unused) {
                    Log.e("FirebaseMessaging", "Notification pending intent canceled");
                }
            }
            if (q.a(intent)) {
                if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
                    FirebaseApp instance = FirebaseApp.getInstance();
                    instance.a();
                    i.c.d.e.a.a aVar = (i.c.d.e.a.a) instance.d.a(i.c.d.e.a.a.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (aVar != null) {
                        String stringExtra = intent.getStringExtra("google.c.a.c_id");
                        aVar.a("fcm", "_ln", stringExtra);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "Firebase");
                        bundle.putString("medium", "notification");
                        bundle.putString("campaign", stringExtra);
                        aVar.logEvent("fcm", "_cmp", bundle);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
                q.a("_no", intent);
            }
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return q.b(null);
        }
        h hVar = new h();
        this.e.execute(new g(this, intent, hVar));
        return hVar.a;
    }

    public final void c(Intent intent) {
        if (intent != null) {
            h0.a(intent);
        }
        synchronized (this.f4760g) {
            int i2 = this.f4762i - 1;
            this.f4762i = i2;
            if (i2 == 0) {
                stopSelfResult(this.f4761h);
            }
        }
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            Log.d("EnhancedIntentService", "Service received bind request");
        }
        if (this.f4759f == null) {
            this.f4759f = new g0(new h(this));
        }
        return this.f4759f;
    }

    public void onDestroy() {
        this.e.shutdown();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i2, int i3) {
        synchronized (this.f4760g) {
            this.f4761h = i3;
            this.f4762i++;
        }
        Intent poll = a0.a().d.poll();
        if (poll == null) {
            c(intent);
            return 2;
        }
        g<Void> b2 = b(poll);
        if (b2.c()) {
            c(intent);
            return 2;
        }
        d0 d0Var = (d0) b2;
        d0Var.f4000b.a(new s(j.e, new i(this, intent)));
        d0Var.f();
        return 3;
    }
}
