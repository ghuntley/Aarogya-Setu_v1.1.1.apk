package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import h.a0.l;
import h.a0.x.j;
import h.a0.x.p.c;
import h.o.o;
import java.util.UUID;

public class SystemForegroundService extends o implements c.a {

    /* renamed from: j  reason: collision with root package name */
    public static final String f386j = l.a("SystemFgService");

    /* renamed from: k  reason: collision with root package name */
    public static SystemForegroundService f387k = null;

    /* renamed from: f  reason: collision with root package name */
    public Handler f388f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f389g;

    /* renamed from: h  reason: collision with root package name */
    public h.a0.x.p.c f390h;

    /* renamed from: i  reason: collision with root package name */
    public NotificationManager f391i;

    public class a implements Runnable {
        public final /* synthetic */ int e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Notification f392f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f393g;

        public a(int i2, Notification notification, int i3) {
            this.e = i2;
            this.f392f = notification;
            this.f393g = i3;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 29) {
                SystemForegroundService.this.startForeground(this.e, this.f392f, this.f393g);
            } else {
                SystemForegroundService.this.startForeground(this.e, this.f392f);
            }
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Notification f395f;

        public b(int i2, Notification notification) {
            this.e = i2;
            this.f395f = notification;
        }

        public void run() {
            SystemForegroundService.this.f391i.notify(this.e, this.f395f);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int e;

        public c(int i2) {
            this.e = i2;
        }

        public void run() {
            SystemForegroundService.this.f391i.cancel(this.e);
        }
    }

    public void a(int i2, int i3, Notification notification) {
        this.f388f.post(new a(i2, notification, i3));
    }

    public final void e() {
        this.f388f = new Handler(Looper.getMainLooper());
        this.f391i = (NotificationManager) getApplicationContext().getSystemService("notification");
        h.a0.x.p.c cVar = new h.a0.x.p.c(getApplicationContext());
        this.f390h = cVar;
        if (cVar.f1049o != null) {
            l.a().b(h.a0.x.p.c.f1039p, "A callback already exists.", new Throwable[0]);
        } else {
            cVar.f1049o = this;
        }
    }

    public void onCreate() {
        super.onCreate();
        f387k = this;
        e();
    }

    public void onDestroy() {
        super.onDestroy();
        h.a0.x.p.c cVar = this.f390h;
        cVar.f1049o = null;
        cVar.f1048n.a();
        cVar.f1040f.f959f.b((h.a0.x.a) cVar);
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        if (this.f389g) {
            l.a().c(f386j, "Re-initializing SystemForegroundService after a request to shut-down.", new Throwable[0]);
            h.a0.x.p.c cVar = this.f390h;
            cVar.f1049o = null;
            cVar.f1048n.a();
            cVar.f1040f.f959f.b((h.a0.x.a) cVar);
            e();
            this.f389g = false;
        }
        if (intent == null) {
            return 3;
        }
        h.a0.x.p.c cVar2 = this.f390h;
        if (cVar2 != null) {
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                l.a().c(h.a0.x.p.c.f1039p, String.format("Started foreground service %s", new Object[]{intent}), new Throwable[0]);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                WorkDatabase workDatabase = cVar2.f1040f.c;
                h.a0.x.r.p.a aVar = cVar2.f1041g;
                ((h.a0.x.r.p.b) aVar).a.execute(new h.a0.x.p.b(cVar2, workDatabase, stringExtra));
                cVar2.a(intent);
                return 3;
            } else if ("ACTION_NOTIFY".equals(action)) {
                cVar2.a(intent);
                return 3;
            } else if (!"ACTION_CANCEL_WORK".equals(action)) {
                return 3;
            } else {
                l.a().c(h.a0.x.p.c.f1039p, String.format("Stopping foreground work for %s", new Object[]{intent}), new Throwable[0]);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 == null || TextUtils.isEmpty(stringExtra2)) {
                    return 3;
                }
                j jVar = cVar2.f1040f;
                UUID fromString = UUID.fromString(stringExtra2);
                if (jVar != null) {
                    ((h.a0.x.r.p.b) jVar.d).a.execute(new h.a0.x.r.a(jVar, fromString));
                    return 3;
                }
                throw null;
            }
        } else {
            throw null;
        }
    }

    public void stop() {
        this.f389g = true;
        l.a().a(f386j, "All commands completed.", new Throwable[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f387k = null;
        stopSelf();
    }

    public void a(int i2, Notification notification) {
        this.f388f.post(new b(i2, notification));
    }

    public void a(int i2) {
        this.f388f.post(new c(i2));
    }
}
