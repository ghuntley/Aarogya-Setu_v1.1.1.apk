package h.h.e;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import g.a.a.a.a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: NotificationManagerCompat */
public final class m {
    public static final Object c = new Object();
    public static String d;
    public static Set<String> e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f1740f = new Object();

    /* renamed from: g  reason: collision with root package name */
    public static c f1741g;
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final NotificationManager f1742b;

    /* compiled from: NotificationManagerCompat */
    public static class a implements d {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1743b;
        public final String c;
        public final Notification d;

        public a(String str, int i2, String str2, Notification notification) {
            this.a = str;
            this.f1743b = i2;
            this.c = str2;
            this.d = notification;
        }

        public void a(g.a.a.a.a aVar) {
            aVar.a(this.a, this.f1743b, this.c, this.d);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[");
            sb.append("packageName:");
            sb.append(this.a);
            sb.append(", id:");
            sb.append(this.f1743b);
            sb.append(", tag:");
            return i.a.a.a.a.a(sb, this.c, "]");
        }
    }

    /* compiled from: NotificationManagerCompat */
    public static class b {
        public final ComponentName a;

        /* renamed from: b  reason: collision with root package name */
        public final IBinder f1744b;

        public b(ComponentName componentName, IBinder iBinder) {
            this.a = componentName;
            this.f1744b = iBinder;
        }
    }

    /* compiled from: NotificationManagerCompat */
    public static class c implements Handler.Callback, ServiceConnection {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final HandlerThread f1745b;
        public final Handler c;
        public final Map<ComponentName, a> d = new HashMap();
        public Set<String> e = new HashSet();

        /* compiled from: NotificationManagerCompat */
        public static class a {
            public final ComponentName a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f1746b = false;
            public g.a.a.a.a c;
            public ArrayDeque<d> d = new ArrayDeque<>();
            public int e = 0;

            public a(ComponentName componentName) {
                this.a = componentName;
            }
        }

        public c(Context context) {
            this.a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f1745b = handlerThread;
            handlerThread.start();
            this.c = new Handler(this.f1745b.getLooper(), this);
        }

        public final void a(a aVar) {
            boolean z;
            if (Log.isLoggable("NotifManCompat", 3)) {
                StringBuilder a2 = i.a.a.a.a.a("Processing component ");
                a2.append(aVar.a);
                a2.append(", ");
                a2.append(aVar.d.size());
                a2.append(" queued tasks");
                Log.d("NotifManCompat", a2.toString());
            }
            if (!aVar.d.isEmpty()) {
                if (aVar.f1746b) {
                    z = true;
                } else {
                    boolean bindService = this.a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.a), this, 33);
                    aVar.f1746b = bindService;
                    if (bindService) {
                        aVar.e = 0;
                    } else {
                        StringBuilder a3 = i.a.a.a.a.a("Unable to bind to listener ");
                        a3.append(aVar.a);
                        Log.w("NotifManCompat", a3.toString());
                        this.a.unbindService(this);
                    }
                    z = aVar.f1746b;
                }
                if (!z || aVar.c == null) {
                    b(aVar);
                    return;
                }
                while (true) {
                    d peek = aVar.d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.c);
                        aVar.d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            StringBuilder a4 = i.a.a.a.a.a("Remote service has died: ");
                            a4.append(aVar.a);
                            Log.d("NotifManCompat", a4.toString());
                        }
                    } catch (RemoteException e2) {
                        StringBuilder a5 = i.a.a.a.a.a("RemoteException communicating with ");
                        a5.append(aVar.a);
                        Log.w("NotifManCompat", a5.toString(), e2);
                    }
                }
                if (!aVar.d.isEmpty()) {
                    b(aVar);
                }
            }
        }

        public final void b(a aVar) {
            if (!this.c.hasMessages(3, aVar.a)) {
                int i2 = aVar.e + 1;
                aVar.e = i2;
                if (i2 > 6) {
                    StringBuilder a2 = i.a.a.a.a.a("Giving up on delivering ");
                    a2.append(aVar.d.size());
                    a2.append(" tasks to ");
                    a2.append(aVar.a);
                    a2.append(" after ");
                    a2.append(aVar.e);
                    a2.append(" retries");
                    Log.w("NotifManCompat", a2.toString());
                    aVar.d.clear();
                    return;
                }
                int i3 = (1 << (i2 - 1)) * AnswersRetryFilesSender.BACKOFF_MS;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
                }
                this.c.sendMessageDelayed(this.c.obtainMessage(3, aVar.a), (long) i3);
            }
        }

        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                d dVar = (d) message.obj;
                Set<String> a2 = m.a(this.a);
                if (!a2.equals(this.e)) {
                    this.e = a2;
                    List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                    HashSet hashSet = new HashSet();
                    for (ResolveInfo next : queryIntentServices) {
                        if (a2.contains(next.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = next.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (next.serviceInfo.permission != null) {
                                Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!this.d.containsKey(componentName2)) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                            }
                            this.d.put(componentName2, new a(componentName2));
                        }
                    }
                    Iterator<Map.Entry<ComponentName, a>> it2 = this.d.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry next2 = it2.next();
                        if (!hashSet.contains(next2.getKey())) {
                            if (Log.isLoggable("NotifManCompat", 3)) {
                                StringBuilder a3 = i.a.a.a.a.a("Removing listener record for ");
                                a3.append(next2.getKey());
                                Log.d("NotifManCompat", a3.toString());
                            }
                            a aVar = (a) next2.getValue();
                            if (aVar.f1746b) {
                                this.a.unbindService(this);
                                aVar.f1746b = false;
                            }
                            aVar.c = null;
                            it2.remove();
                        }
                    }
                }
                for (a next3 : this.d.values()) {
                    next3.d.add(dVar);
                    a(next3);
                }
                return true;
            } else if (i2 == 1) {
                b bVar = (b) message.obj;
                ComponentName componentName3 = bVar.a;
                IBinder iBinder = bVar.f1744b;
                a aVar2 = this.d.get(componentName3);
                if (aVar2 != null) {
                    aVar2.c = a.C0020a.a(iBinder);
                    aVar2.e = 0;
                    a(aVar2);
                }
                return true;
            } else if (i2 == 2) {
                a aVar3 = this.d.get((ComponentName) message.obj);
                if (aVar3 != null) {
                    if (aVar3.f1746b) {
                        this.a.unbindService(this);
                        aVar3.f1746b = false;
                    }
                    aVar3.c = null;
                }
                return true;
            } else if (i2 != 3) {
                return false;
            } else {
                a aVar4 = this.d.get((ComponentName) message.obj);
                if (aVar4 != null) {
                    a(aVar4);
                }
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.c.obtainMessage(1, new b(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    /* compiled from: NotificationManagerCompat */
    public interface d {
        void a(g.a.a.a.a aVar);
    }

    public m(Context context) {
        this.a = context;
        this.f1742b = (NotificationManager) context.getSystemService("notification");
    }

    public static Set<String> a(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (c) {
            if (string != null) {
                if (!string.equals(d)) {
                    String[] split = string.split(":", -1);
                    HashSet hashSet = new HashSet(split.length);
                    for (String unflattenFromString : split) {
                        ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                        if (unflattenFromString2 != null) {
                            hashSet.add(unflattenFromString2.getPackageName());
                        }
                    }
                    e = hashSet;
                    d = string;
                }
            }
            set = e;
        }
        return set;
    }

    public final void a(d dVar) {
        synchronized (f1740f) {
            if (f1741g == null) {
                f1741g = new c(this.a.getApplicationContext());
            }
            f1741g.c.obtainMessage(0, dVar).sendToTarget();
        }
    }
}
