package i.c.d.k;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.crashlytics.android.core.CrashlyticsController;
import com.google.firebase.iid.zzap;
import h.e.h;
import i.c.a.b.d.l.q;
import i.c.d.k.t0;
import java.util.concurrent.ExecutionException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class y {

    /* renamed from: g  reason: collision with root package name */
    public static int f4715g;

    /* renamed from: h  reason: collision with root package name */
    public static PendingIntent f4716h;
    @GuardedBy("responseCallbacks")
    public final h<String, i.c.a.b.l.h<Bundle>> a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final Context f4717b;
    public final s c;
    public Messenger d;
    public Messenger e;

    /* renamed from: f  reason: collision with root package name */
    public t0 f4718f;

    public y(Context context, s sVar) {
        this.f4717b = context;
        this.c = sVar;
        this.d = new Messenger(new x(this, Looper.getMainLooper()));
    }

    public final void a(Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new t0.a());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof t0) {
                        this.f4718f = (t0) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        this.e = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra(CrashlyticsController.EVENT_TYPE_LOGGED);
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("FirebaseInstanceId", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("FirebaseInstanceId", 3)) {
                            Log.d("FirebaseInstanceId", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("FirebaseInstanceId", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            a(str, intent2.putExtra(CrashlyticsController.EVENT_TYPE_LOGGED, str2).getExtras());
                            return;
                        }
                        synchronized (this.a) {
                            for (int i2 = 0; i2 < this.a.f1570g; i2++) {
                                a(this.a.c(i2), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)").matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        a(group, extras);
                        return;
                    } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                        Log.d("FirebaseInstanceId", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("FirebaseInstanceId", 3)) {
                    String valueOf2 = String.valueOf(action);
                    Log.d("FirebaseInstanceId", valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("FirebaseInstanceId", "Dropping invalid message");
    }

    public final Bundle b(Bundle bundle) {
        Bundle c2 = c(bundle);
        if (c2 == null || !c2.containsKey("google.messenger")) {
            return c2;
        }
        Bundle c3 = c(bundle);
        if (c3 == null || !c3.containsKey("google.messenger")) {
            return c3;
        }
        return null;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final android.os.Bundle c(android.os.Bundle r8) {
        /*
            r7 = this;
            java.lang.String r0 = a()
            i.c.a.b.l.h r1 = new i.c.a.b.l.h
            r1.<init>()
            h.e.h<java.lang.String, i.c.a.b.l.h<android.os.Bundle>> r2 = r7.a
            monitor-enter(r2)
            h.e.h<java.lang.String, i.c.a.b.l.h<android.os.Bundle>> r3 = r7.a     // Catch:{ all -> 0x0112 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0112 }
            monitor-exit(r2)     // Catch:{ all -> 0x0112 }
            i.c.d.k.s r2 = r7.c
            int r2 = r2.a()
            if (r2 == 0) goto L_0x010a
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r3 = "com.google.android.gms"
            r2.setPackage(r3)
            i.c.d.k.s r3 = r7.c
            int r3 = r3.a()
            r4 = 2
            if (r3 != r4) goto L_0x0033
            java.lang.String r3 = "com.google.iid.TOKEN_REQUEST"
            r2.setAction(r3)
            goto L_0x0038
        L_0x0033:
            java.lang.String r3 = "com.google.android.c2dm.intent.REGISTER"
            r2.setAction(r3)
        L_0x0038:
            r2.putExtras(r8)
            android.content.Context r8 = r7.f4717b
            a((android.content.Context) r8, (android.content.Intent) r2)
            java.lang.String r8 = java.lang.String.valueOf(r0)
            int r8 = r8.length()
            int r8 = r8 + 5
            java.lang.String r3 = "|ID|"
            java.lang.String r5 = "|"
            java.lang.String r8 = i.a.a.a.a.a((int) r8, (java.lang.String) r3, (java.lang.String) r0, (java.lang.String) r5)
            java.lang.String r3 = "kid"
            r2.putExtra(r3, r8)
            r8 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r3 = android.util.Log.isLoggable(r3, r8)
            if (r3 == 0) goto L_0x0084
            android.os.Bundle r3 = r2.getExtras()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r5 = r3.length()
            int r5 = r5 + 8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            java.lang.String r5 = "Sending "
            r6.append(r5)
            r6.append(r3)
            java.lang.String r3 = r6.toString()
            java.lang.String r5 = "FirebaseInstanceId"
            android.util.Log.d(r5, r3)
        L_0x0084:
            android.os.Messenger r3 = r7.d
            java.lang.String r5 = "google.messenger"
            r2.putExtra(r5, r3)
            android.os.Messenger r3 = r7.e
            if (r3 != 0) goto L_0x0093
            i.c.d.k.t0 r3 = r7.f4718f
            if (r3 == 0) goto L_0x00b9
        L_0x0093:
            android.os.Message r3 = android.os.Message.obtain()
            r3.obj = r2
            android.os.Messenger r5 = r7.e     // Catch:{ RemoteException -> 0x00a9 }
            if (r5 == 0) goto L_0x00a3
            android.os.Messenger r5 = r7.e     // Catch:{ RemoteException -> 0x00a9 }
            r5.send(r3)     // Catch:{ RemoteException -> 0x00a9 }
            goto L_0x00cc
        L_0x00a3:
            i.c.d.k.t0 r5 = r7.f4718f     // Catch:{ RemoteException -> 0x00a9 }
            r5.a(r3)     // Catch:{ RemoteException -> 0x00a9 }
            goto L_0x00cc
        L_0x00a9:
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r8 = android.util.Log.isLoggable(r3, r8)
            if (r8 == 0) goto L_0x00b9
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r3 = "Messenger failed, fallback to startService"
            android.util.Log.d(r8, r3)
        L_0x00b9:
            i.c.d.k.s r8 = r7.c
            int r8 = r8.a()
            if (r8 != r4) goto L_0x00c7
            android.content.Context r8 = r7.f4717b
            r8.sendBroadcast(r2)
            goto L_0x00cc
        L_0x00c7:
            android.content.Context r8 = r7.f4717b
            r8.startService(r2)
        L_0x00cc:
            i.c.a.b.l.d0<TResult> r8 = r1.a     // Catch:{ InterruptedException | TimeoutException -> 0x00ee, ExecutionException -> 0x00e7 }
            r1 = 30000(0x7530, double:1.4822E-319)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException | TimeoutException -> 0x00ee, ExecutionException -> 0x00e7 }
            java.lang.Object r8 = i.c.a.b.d.l.q.a(r8, (long) r1, (java.util.concurrent.TimeUnit) r3)     // Catch:{ InterruptedException | TimeoutException -> 0x00ee, ExecutionException -> 0x00e7 }
            android.os.Bundle r8 = (android.os.Bundle) r8     // Catch:{ InterruptedException | TimeoutException -> 0x00ee, ExecutionException -> 0x00e7 }
            h.e.h<java.lang.String, i.c.a.b.l.h<android.os.Bundle>> r1 = r7.a
            monitor-enter(r1)
            h.e.h<java.lang.String, i.c.a.b.l.h<android.os.Bundle>> r2 = r7.a     // Catch:{ all -> 0x00e2 }
            r2.remove(r0)     // Catch:{ all -> 0x00e2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00e2 }
            return r8
        L_0x00e2:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00e2 }
            throw r8
        L_0x00e5:
            r8 = move-exception
            goto L_0x00fd
        L_0x00e7:
            r8 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00e5 }
            r1.<init>(r8)     // Catch:{ all -> 0x00e5 }
            throw r1     // Catch:{ all -> 0x00e5 }
        L_0x00ee:
            java.lang.String r8 = "FirebaseInstanceId"
            java.lang.String r1 = "No response"
            android.util.Log.w(r8, r1)     // Catch:{ all -> 0x00e5 }
            java.io.IOException r8 = new java.io.IOException     // Catch:{ all -> 0x00e5 }
            java.lang.String r1 = "TIMEOUT"
            r8.<init>(r1)     // Catch:{ all -> 0x00e5 }
            throw r8     // Catch:{ all -> 0x00e5 }
        L_0x00fd:
            h.e.h<java.lang.String, i.c.a.b.l.h<android.os.Bundle>> r1 = r7.a
            monitor-enter(r1)
            h.e.h<java.lang.String, i.c.a.b.l.h<android.os.Bundle>> r2 = r7.a     // Catch:{ all -> 0x0107 }
            r2.remove(r0)     // Catch:{ all -> 0x0107 }
            monitor-exit(r1)     // Catch:{ all -> 0x0107 }
            throw r8
        L_0x0107:
            r8 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0107 }
            throw r8
        L_0x010a:
            java.io.IOException r8 = new java.io.IOException
            java.lang.String r0 = "MISSING_INSTANCEID_SERVICE"
            r8.<init>(r0)
            throw r8
        L_0x0112:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0112 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.k.y.c(android.os.Bundle):android.os.Bundle");
    }

    public static synchronized void a(Context context, Intent intent) {
        synchronized (y.class) {
            if (f4716h == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f4716h = PendingIntent.getBroadcast(context, 0, intent2, 0);
            }
            intent.putExtra("app", f4716h);
        }
    }

    public final void a(String str, Bundle bundle) {
        synchronized (this.a) {
            i.c.a.b.l.h remove = this.a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("FirebaseInstanceId", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.a.a(bundle);
        }
    }

    public final Bundle a(Bundle bundle) {
        if (this.c.d() < 12000000) {
            return b(bundle);
        }
        g a2 = g.a(this.f4717b);
        try {
            return (Bundle) q.a(a2.a(new r(a2.a(), bundle)));
        } catch (InterruptedException | ExecutionException e2) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 22);
                sb.append("Error making request: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            if (!(e2.getCause() instanceof zzap) || ((zzap) e2.getCause()).e != 4) {
                return null;
            }
            return b(bundle);
        }
    }

    public static synchronized String a() {
        String num;
        synchronized (y.class) {
            int i2 = f4715g;
            f4715g = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }
}
