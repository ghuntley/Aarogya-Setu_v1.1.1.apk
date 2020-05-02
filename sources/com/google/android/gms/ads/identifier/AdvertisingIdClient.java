package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.util.Log;
import com.crashlytics.android.core.CrashlyticsController;
import com.crashlytics.android.core.SessionProtobufHelper;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import i.c.a.b.d.f;
import i.c.a.b.d.g;
import i.c.a.b.d.l.q;
import i.c.a.b.g.a.b;
import i.c.a.b.g.a.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;

@ParametersAreNonnullByDefault
public class AdvertisingIdClient {
    @GuardedBy("this")
    public final Context mContext;
    @GuardedBy("this")
    public i.c.a.b.d.a zze;
    @GuardedBy("this")
    public b zzf;
    @GuardedBy("this")
    public boolean zzg;
    public final Object zzh;
    @GuardedBy("mAutoDisconnectTaskLock")
    public a zzi;
    public final boolean zzj;
    public final long zzk;

    public static final class Info {
        public final String zzq;
        public final boolean zzr;

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            boolean z = this.zzr;
            StringBuilder sb = new StringBuilder(i.a.a.a.a.a(str, 7));
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    public static class a extends Thread {
        public WeakReference<AdvertisingIdClient> e;

        /* renamed from: f  reason: collision with root package name */
        public long f456f;

        /* renamed from: g  reason: collision with root package name */
        public CountDownLatch f457g = new CountDownLatch(1);

        /* renamed from: h  reason: collision with root package name */
        public boolean f458h = false;

        public a(AdvertisingIdClient advertisingIdClient, long j2) {
            this.e = new WeakReference<>(advertisingIdClient);
            this.f456f = j2;
            start();
        }

        public final void run() {
            AdvertisingIdClient advertisingIdClient;
            try {
                if (!this.f457g.await(this.f456f, TimeUnit.MILLISECONDS) && (advertisingIdClient = (AdvertisingIdClient) this.e.get()) != null) {
                    advertisingIdClient.finish();
                    this.f458h = true;
                }
            } catch (InterruptedException unused) {
                AdvertisingIdClient advertisingIdClient2 = (AdvertisingIdClient) this.e.get();
                if (advertisingIdClient2 != null) {
                    advertisingIdClient2.finish();
                    this.f458h = true;
                }
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false, false);
    }

    public AdvertisingIdClient(Context context, long j2, boolean z, boolean z2) {
        Context applicationContext;
        this.zzh = new Object();
        q.a(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j2;
        this.zzj = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x002f A[SYNTHETIC, Splitter:B:17:0x002f] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0041 A[SYNTHETIC, Splitter:B:25:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0051 A[SYNTHETIC, Splitter:B:33:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdvertisingIdInfo(android.content.Context r15) {
        /*
            java.lang.String r0 = "Error while reading from SharedPreferences "
            java.lang.String r1 = "GmscoreFlag"
            r2 = 0
            r3 = 0
            android.content.Context r4 = i.c.a.b.d.g.getRemoteContext(r15)     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            java.lang.String r5 = "google_ads_flags"
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r5, r3)     // Catch:{ all -> 0x0014 }
            goto L_0x001a
        L_0x0014:
            r4 = move-exception
            java.lang.String r5 = "Error while getting SharedPreferences "
            android.util.Log.w(r1, r5, r4)
        L_0x001a:
            java.lang.String r4 = "gads:ad_id_app_context:enabled"
            if (r2 != 0) goto L_0x001f
            goto L_0x0028
        L_0x001f:
            boolean r4 = r2.getBoolean(r4, r3)     // Catch:{ all -> 0x0024 }
            goto L_0x0029
        L_0x0024:
            r4 = move-exception
            android.util.Log.w(r1, r0, r4)
        L_0x0028:
            r4 = 0
        L_0x0029:
            java.lang.String r5 = "gads:ad_id_app_context:ping_ratio"
            r6 = 0
            if (r2 != 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            float r5 = r2.getFloat(r5, r6)     // Catch:{ all -> 0x0035 }
            r13 = r5
            goto L_0x003a
        L_0x0035:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x0039:
            r13 = 0
        L_0x003a:
            java.lang.String r5 = "gads:ad_id_use_shared_preference:experiment_id"
            java.lang.String r6 = ""
            if (r2 != 0) goto L_0x0041
            goto L_0x004b
        L_0x0041:
            java.lang.String r5 = r2.getString(r5, r6)     // Catch:{ all -> 0x0047 }
            r14 = r5
            goto L_0x004c
        L_0x0047:
            r5 = move-exception
            android.util.Log.w(r1, r0, r5)
        L_0x004b:
            r14 = r6
        L_0x004c:
            java.lang.String r5 = "gads:ad_id_use_persistent_service:enabled"
            if (r2 != 0) goto L_0x0051
            goto L_0x005b
        L_0x0051:
            boolean r0 = r2.getBoolean(r5, r3)     // Catch:{ all -> 0x0057 }
            r10 = r0
            goto L_0x005c
        L_0x0057:
            r2 = move-exception
            android.util.Log.w(r1, r0, r2)
        L_0x005b:
            r10 = 0
        L_0x005c:
            com.google.android.gms.ads.identifier.AdvertisingIdClient r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient
            r7 = -1
            r5 = r0
            r6 = r15
            r9 = r4
            r5.<init>(r6, r7, r9, r10)
            long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0084 }
            r0.zza(r3)     // Catch:{ all -> 0x0084 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r15 = r0.getInfo()     // Catch:{ all -> 0x0084 }
            long r5 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0084 }
            long r9 = r5 - r1
            r12 = 0
            r5 = r0
            r6 = r15
            r7 = r4
            r8 = r13
            r11 = r14
            r5.zza(r6, r7, r8, r9, r11, r12)     // Catch:{ all -> 0x0084 }
            r0.finish()
            return r15
        L_0x0084:
            r15 = move-exception
            r6 = 0
            r9 = -1
            r5 = r0
            r7 = r4
            r8 = r13
            r11 = r14
            r12 = r15
            r5.zza(r6, r7, r8, r9, r11, r12)     // Catch:{ all -> 0x0091 }
            throw r15     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r15 = move-exception
            r0.finish()
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.getAdvertisingIdInfo(android.content.Context):com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002f A[SYNTHETIC, Splitter:B:18:0x002f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean getIsAdIdFakeForDebugLogging(android.content.Context r11) {
        /*
            java.lang.String r0 = "Error while reading from SharedPreferences "
            java.lang.String r1 = "GmscoreFlag"
            r2 = 0
            r3 = 0
            android.content.Context r4 = i.c.a.b.d.g.getRemoteContext(r11)     // Catch:{ all -> 0x0014 }
            if (r4 != 0) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            java.lang.String r5 = "google_ads_flags"
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r5, r3)     // Catch:{ all -> 0x0014 }
            goto L_0x001a
        L_0x0014:
            r4 = move-exception
            java.lang.String r5 = "Error while getting SharedPreferences "
            android.util.Log.w(r1, r5, r4)
        L_0x001a:
            java.lang.String r4 = "gads:ad_id_app_context:enabled"
            if (r2 != 0) goto L_0x001f
            goto L_0x0029
        L_0x001f:
            boolean r4 = r2.getBoolean(r4, r3)     // Catch:{ all -> 0x0025 }
            r9 = r4
            goto L_0x002a
        L_0x0025:
            r4 = move-exception
            android.util.Log.w(r1, r0, r4)
        L_0x0029:
            r9 = 0
        L_0x002a:
            java.lang.String r4 = "com.google.android.gms.ads.identifier.service.PERSISTENT_START"
            if (r2 != 0) goto L_0x002f
            goto L_0x0039
        L_0x002f:
            boolean r0 = r2.getBoolean(r4, r3)     // Catch:{ all -> 0x0035 }
            r10 = r0
            goto L_0x003a
        L_0x0035:
            r2 = move-exception
            android.util.Log.w(r1, r0, r2)
        L_0x0039:
            r10 = 0
        L_0x003a:
            com.google.android.gms.ads.identifier.AdvertisingIdClient r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient
            r7 = -1
            r5 = r0
            r6 = r11
            r5.<init>(r6, r7, r9, r10)
            r0.zza(r3)     // Catch:{ all -> 0x004e }
            boolean r11 = r0.zzb()     // Catch:{ all -> 0x004e }
            r0.finish()
            return r11
        L_0x004e:
            r11 = move-exception
            r0.finish()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.getIsAdIdFakeForDebugLogging(android.content.Context):boolean");
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    public static i.c.a.b.d.a zza(Context context, boolean z) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int a2 = f.f3022b.a(context, g.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a2 == 0 || a2 == 2) {
                String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
                i.c.a.b.d.a aVar = new i.c.a.b.d.a();
                Intent intent = new Intent(str);
                intent.setPackage("com.google.android.gms");
                try {
                    i.c.a.b.d.n.a a3 = i.c.a.b.d.n.a.a();
                    if (a3 != null) {
                        context.getClass().getName();
                        if (a3.b(context, intent, aVar, 1)) {
                            return aVar;
                        }
                        throw new IOException("Connection failure");
                    }
                    throw null;
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    public static b zza(Context context, i.c.a.b.d.a aVar) {
        try {
            return c.a(aVar.a(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zza() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzh
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r6.zzi     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r6.zzi     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.f457g     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = r6.zzi     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.zzk     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            com.google.android.gms.ads.identifier.AdvertisingIdClient$a r1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$a     // Catch:{ all -> 0x0026 }
            long r2 = r6.zzk     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.zzi = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zza():void");
    }

    private final void zza(boolean z) {
        q.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                finish();
            }
            i.c.a.b.d.a zza = zza(this.mContext, this.zzj);
            this.zze = zza;
            this.zzf = zza(this.mContext, zza);
            this.zzg = true;
            if (z) {
                zza();
            }
        }
    }

    private final boolean zza(Info info, boolean z, float f2, long j2, String str, Throwable th) {
        if (Math.random() > ((double) f2)) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : SessionProtobufHelper.SIGNAL_DEFAULT);
        if (info != null) {
            if (!info.isLimitAdTrackingEnabled()) {
                str2 = SessionProtobufHelper.SIGNAL_DEFAULT;
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (!(info == null || info.getId() == null)) {
            hashMap.put("ad_id_size", Integer.toString(info.getId().length()));
        }
        if (th != null) {
            hashMap.put(CrashlyticsController.EVENT_TYPE_LOGGED, th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j2));
        new i.c.a.b.a.a.a(hashMap).start();
        return true;
    }

    private final boolean zzb() {
        boolean c;
        q.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    if (this.zzi == null || !this.zzi.f458h) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            q.a(this.zze);
            q.a(this.zzf);
            c = this.zzf.c();
        }
        zza();
        return c;
    }

    public void finalize() {
        finish();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void finish() {
        /*
            r4 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            i.c.a.b.d.l.q.c((java.lang.String) r0)
            monitor-enter(r4)
            android.content.Context r0 = r4.mContext     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0034
            i.c.a.b.d.a r0 = r4.zze     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0034
        L_0x000f:
            r0 = 0
            boolean r1 = r4.zzg     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x002b
            i.c.a.b.d.n.a r1 = i.c.a.b.d.n.a.a()     // Catch:{ all -> 0x0023 }
            android.content.Context r2 = r4.mContext     // Catch:{ all -> 0x0023 }
            i.c.a.b.d.a r3 = r4.zze     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0022
            r2.unbindService(r3)     // Catch:{ all -> 0x0023 }
            goto L_0x002b
        L_0x0022:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r1 = move-exception
            java.lang.String r2 = "AdvertisingIdClient"
            java.lang.String r3 = "AdvertisingIdClient unbindService failed."
            android.util.Log.i(r2, r3, r1)     // Catch:{ all -> 0x0036 }
        L_0x002b:
            r1 = 0
            r4.zzg = r1     // Catch:{ all -> 0x0036 }
            r4.zzf = r0     // Catch:{ all -> 0x0036 }
            r4.zze = r0     // Catch:{ all -> 0x0036 }
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x0034:
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            return
        L_0x0036:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0036 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    public Info getInfo() {
        Info info;
        q.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    if (this.zzi == null || !this.zzi.f458h) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (RemoteException e) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e);
                    throw new IOException("Remote exception");
                } catch (Exception e2) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e2);
                }
            }
            q.a(this.zze);
            q.a(this.zzf);
            info = new Info(this.zzf.d(), this.zzf.a(true));
        }
        zza();
        return info;
    }

    public void start() {
        zza(true);
    }
}
