package nic.goi.aarogyasetu.background;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.AdvertiseCallback;
import android.bluetooth.le.AdvertiseData;
import android.bluetooth.le.AdvertiseSettings;
import android.bluetooth.le.BluetoothLeAdvertiser;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import b.a.a.l.o;
import com.google.android.gms.location.LocationRequest;
import h.h.e.i;
import h.h.e.j;
import i.c.a.b.d.k.h.c0;
import i.c.a.b.d.k.h.d0;
import i.c.a.b.d.k.h.g;
import i.c.a.b.d.k.h.k;
import i.c.a.b.d.k.h.r0;
import i.c.a.b.d.l.q;
import i.c.a.b.g.f.t;
import i.c.a.b.h.w;
import i.c.a.b.h.x;
import i.c.a.b.l.h;
import i.c.d.q.m.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import n.m.c.f;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.models.BluetoothData;
import nic.goi.aarogyasetu.views.SplashActivity;

public class BluetoothScanningService extends Service {

    /* renamed from: p  reason: collision with root package name */
    public static boolean f5231p;
    public b.a.a.i.a e;

    /* renamed from: f  reason: collision with root package name */
    public BluetoothLeScanner f5232f;

    /* renamed from: g  reason: collision with root package name */
    public BluetoothLeAdvertiser f5233g;

    /* renamed from: h  reason: collision with root package name */
    public List<String> f5234h = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public long f5235i;

    /* renamed from: j  reason: collision with root package name */
    public String f5236j = BluetoothScanningService.class.getName();

    /* renamed from: k  reason: collision with root package name */
    public ScanCallback f5237k = new a();

    /* renamed from: l  reason: collision with root package name */
    public AdvertiseCallback f5238l = new b();

    /* renamed from: m  reason: collision with root package name */
    public Timer f5239m;

    /* renamed from: n  reason: collision with root package name */
    public BroadcastReceiver f5240n = new d();

    /* renamed from: o  reason: collision with root package name */
    public BroadcastReceiver f5241o = new e();

    public class a extends ScanCallback {
        public a() {
        }

        public void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
            String str = BluetoothScanningService.this.f5236j;
            list.toString();
        }

        public void onScanFailed(int i2) {
            super.onScanFailed(i2);
            String str = BluetoothScanningService.this.f5236j;
        }

        public void onScanResult(int i2, ScanResult scanResult) {
            long j2;
            super.onScanResult(i2, scanResult);
            if (o.f436b.d(CoronaApplication.f5224g) && scanResult != null && scanResult.getDevice() != null) {
                String name = scanResult.getDevice().getName();
                BluetoothScanningService bluetoothScanningService = BluetoothScanningService.this;
                if (bluetoothScanningService != null) {
                    l lVar = b.a.a.h.a.b().a().f4777h;
                    Long a2 = l.a(lVar.a, "scan_poll_time_android");
                    if (a2 != null) {
                        j2 = a2.longValue();
                    } else {
                        Long a3 = l.a(lVar.f4804b, "scan_poll_time_android");
                        if (a3 != null) {
                            j2 = a3.longValue();
                        } else {
                            l.a("scan_poll_time_android", "Long");
                            j2 = 0;
                        }
                    }
                    if (System.currentTimeMillis() - bluetoothScanningService.f5235i >= j2 * 1000 && !bluetoothScanningService.f5234h.isEmpty()) {
                        bluetoothScanningService.f5235i = System.currentTimeMillis();
                        bluetoothScanningService.f5234h.clear();
                    }
                    if (!BluetoothScanningService.this.f5234h.contains(name)) {
                        String str = "";
                        String valueOf = Build.VERSION.SDK_INT >= 26 ? String.valueOf(scanResult.getTxPower()) : str;
                        if (scanResult.getScanRecord() != null) {
                            str = String.valueOf(scanResult.getScanRecord().getTxPowerLevel());
                        }
                        scanResult.getDevice().getName();
                        Integer valueOf2 = Integer.valueOf(scanResult.getRssi());
                        BluetoothScanningService.this.f5234h.add(name);
                        if (BluetoothScanningService.this != null) {
                            Location b2 = CoronaApplication.f5224g.b();
                            if (b2 != null) {
                                BluetoothData bluetoothData = new BluetoothData(name, valueOf2, valueOf, str);
                                bluetoothData.setLatitude(b2.getLatitude());
                                bluetoothData.setLongitude(b2.getLongitude());
                                q.a((Executor) b.a.a.g.c.f419b, new b.a.a.g.a(bluetoothData));
                            }
                            String str2 = BluetoothScanningService.this.f5236j;
                            return;
                        }
                        throw null;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    public class b extends AdvertiseCallback {
        public b() {
        }

        public void onStartFailure(int i2) {
            super.onStartFailure(i2);
        }

        public void onStartSuccess(AdvertiseSettings advertiseSettings) {
            super.onStartSuccess(advertiseSettings);
            String str = BluetoothScanningService.this.f5236j;
        }
    }

    public class c extends TimerTask {
        public c() {
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:14|15|16|17) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x006b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r8 = this;
                java.lang.String r0 = "45ED2B0C-50F9-4D2D-9DDC-C21BA2C0F825"
                nic.goi.aarogyasetu.background.BluetoothScanningService r1 = nic.goi.aarogyasetu.background.BluetoothScanningService.this
                java.lang.String r1 = r1.f5236j
                boolean r1 = b.a.a.l.o.b()
                if (r1 == 0) goto L_0x00dc
                nic.goi.aarogyasetu.background.BluetoothScanningService r1 = nic.goi.aarogyasetu.background.BluetoothScanningService.this
                if (r1 == 0) goto L_0x00da
                r2 = 1
                r3 = 0
                android.bluetooth.BluetoothAdapter r4 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()     // Catch:{ Exception -> 0x006f }
                if (r4 != 0) goto L_0x0019
                goto L_0x0073
            L_0x0019:
                nic.goi.aarogyasetu.CoronaApplication r5 = nic.goi.aarogyasetu.CoronaApplication.f5224g     // Catch:{ Exception -> 0x006f }
                java.lang.String r6 = "unique_id"
                java.lang.String r7 = ""
                java.lang.String r5 = b.a.a.k.a.a((android.content.Context) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x006f }
                boolean r6 = r5.isEmpty()     // Catch:{ Exception -> 0x006f }
                if (r6 == 0) goto L_0x002a
                goto L_0x0073
            L_0x002a:
                r4.setName(r5)     // Catch:{ Exception -> 0x006f }
                android.bluetooth.le.BluetoothLeAdvertiser r4 = r4.getBluetoothLeAdvertiser()     // Catch:{ Exception -> 0x006f }
                r1.f5233g = r4     // Catch:{ Exception -> 0x006f }
                android.bluetooth.le.AdvertiseSettings$Builder r4 = new android.bluetooth.le.AdvertiseSettings$Builder     // Catch:{ Exception -> 0x006f }
                r4.<init>()     // Catch:{ Exception -> 0x006f }
                android.bluetooth.le.AdvertiseSettings$Builder r4 = r4.setAdvertiseMode(r3)     // Catch:{ Exception -> 0x006f }
                r5 = 2
                android.bluetooth.le.AdvertiseSettings$Builder r4 = r4.setTxPowerLevel(r5)     // Catch:{ Exception -> 0x006f }
                android.bluetooth.le.AdvertiseSettings$Builder r4 = r4.setConnectable(r3)     // Catch:{ Exception -> 0x006f }
                android.bluetooth.le.AdvertiseSettings r4 = r4.build()     // Catch:{ Exception -> 0x006f }
                android.os.ParcelUuid r5 = new android.os.ParcelUuid     // Catch:{ Exception -> 0x006f }
                java.util.UUID r6 = java.util.UUID.fromString(r0)     // Catch:{ Exception -> 0x006f }
                r5.<init>(r6)     // Catch:{ Exception -> 0x006f }
                android.bluetooth.le.AdvertiseData$Builder r6 = new android.bluetooth.le.AdvertiseData$Builder     // Catch:{ Exception -> 0x006f }
                r6.<init>()     // Catch:{ Exception -> 0x006f }
                android.bluetooth.le.AdvertiseData$Builder r6 = r6.setIncludeDeviceName(r2)     // Catch:{ Exception -> 0x006f }
                android.bluetooth.le.AdvertiseData$Builder r5 = r6.addServiceUuid(r5)     // Catch:{ Exception -> 0x006f }
                android.bluetooth.le.AdvertiseData$Builder r5 = r5.setIncludeTxPowerLevel(r2)     // Catch:{ Exception -> 0x006f }
                android.bluetooth.le.BluetoothLeAdvertiser r6 = r1.f5233g     // Catch:{ Exception -> 0x006f }
                if (r6 == 0) goto L_0x0073
                r1.a(r4, r5, r2)     // Catch:{ Exception -> 0x006b }
                goto L_0x0073
            L_0x006b:
                r1.a(r4, r5, r3)     // Catch:{ Exception -> 0x006f }
                goto L_0x0073
            L_0x006f:
                r1 = move-exception
                i.c.d.p.e.a((java.lang.Exception) r1)
            L_0x0073:
                nic.goi.aarogyasetu.background.BluetoothScanningService r1 = nic.goi.aarogyasetu.background.BluetoothScanningService.this
                android.bluetooth.le.BluetoothLeScanner r4 = r1.f5232f
                if (r4 != 0) goto L_0x007a
                goto L_0x00cf
            L_0x007a:
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                android.bluetooth.le.ScanFilter$Builder r5 = new android.bluetooth.le.ScanFilter$Builder
                r5.<init>()
                android.os.ParcelUuid r6 = new android.os.ParcelUuid
                java.util.UUID r0 = java.util.UUID.fromString(r0)
                r6.<init>(r0)
                android.bluetooth.le.ScanFilter$Builder r0 = r5.setServiceUuid(r6)
                android.bluetooth.le.ScanFilter r0 = r0.build()
                r4.add(r0)
                int r0 = android.os.Build.VERSION.SDK_INT
                r5 = 23
                if (r0 < r5) goto L_0x00b0
                android.bluetooth.le.ScanSettings$Builder r0 = new android.bluetooth.le.ScanSettings$Builder
                r0.<init>()
                android.bluetooth.le.ScanSettings$Builder r0 = r0.setScanMode(r3)
                android.bluetooth.le.ScanSettings$Builder r0 = r0.setMatchMode(r2)
                android.bluetooth.le.ScanSettings r0 = r0.build()
                goto L_0x00bd
            L_0x00b0:
                android.bluetooth.le.ScanSettings$Builder r0 = new android.bluetooth.le.ScanSettings$Builder
                r0.<init>()
                android.bluetooth.le.ScanSettings$Builder r0 = r0.setScanMode(r3)
                android.bluetooth.le.ScanSettings r0 = r0.build()
            L_0x00bd:
                boolean r2 = b.a.a.l.o.b()     // Catch:{ Exception -> 0x00cb }
                if (r2 == 0) goto L_0x00cf
                android.bluetooth.le.BluetoothLeScanner r2 = r1.f5232f     // Catch:{ Exception -> 0x00cb }
                android.bluetooth.le.ScanCallback r1 = r1.f5237k     // Catch:{ Exception -> 0x00cb }
                r2.startScan(r4, r0, r1)     // Catch:{ Exception -> 0x00cb }
                goto L_0x00cf
            L_0x00cb:
                r0 = move-exception
                i.c.d.p.e.a((java.lang.Exception) r0)
            L_0x00cf:
                nic.goi.aarogyasetu.CoronaApplication r0 = nic.goi.aarogyasetu.CoronaApplication.f5224g
                r0.e()
                nic.goi.aarogyasetu.CoronaApplication r0 = nic.goi.aarogyasetu.CoronaApplication.f5224g
                r0.f()
                goto L_0x00e0
            L_0x00da:
                r0 = 0
                throw r0
            L_0x00dc:
                nic.goi.aarogyasetu.background.BluetoothScanningService r0 = nic.goi.aarogyasetu.background.BluetoothScanningService.this
                java.lang.String r0 = r0.f5236j
            L_0x00e0:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nic.goi.aarogyasetu.background.BluetoothScanningService.c.run():void");
        }
    }

    public class d extends BroadcastReceiver {
        public d() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!"android.location.PROVIDERS_CHANGED".equals(intent.getAction())) {
                return;
            }
            if (!o.a(CoronaApplication.f5224g.getApplicationContext())) {
                BluetoothScanningService.a(BluetoothScanningService.this, BluetoothScanningService.this.a("Location must be ON at all times to give you accurate safety updates."));
                CoronaApplication.f5224g.f();
                return;
            }
            if (BluetoothScanningService.b()) {
                BluetoothScanningService.a(BluetoothScanningService.this, BluetoothScanningService.this.a("Stay safe from COVID-19"));
            } else {
                BluetoothScanningService.a(BluetoothScanningService.this, BluetoothScanningService.this.a("Bluetooth must be ON at all times to give you accurate safety updates."));
            }
            CoronaApplication.f5224g.d();
        }
    }

    public class e extends BroadcastReceiver {
        public e() {
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", RecyclerView.UNDEFINED_DURATION);
                if (intExtra == 10) {
                    BluetoothScanningService.a(BluetoothScanningService.this, BluetoothScanningService.this.a("Bluetooth must be ON at all times to give you accurate safety updates."));
                    CoronaApplication.f5224g.e();
                } else if (intExtra == 12) {
                    if (!o.a(CoronaApplication.f5224g.getApplicationContext())) {
                        BluetoothScanningService.a(BluetoothScanningService.this, BluetoothScanningService.this.a("Location must be ON at all times to give you accurate safety updates."));
                    } else {
                        BluetoothScanningService.a(BluetoothScanningService.this, BluetoothScanningService.this.a("Stay safe from COVID-19"));
                    }
                    BluetoothScanningService.this.a();
                    CoronaApplication.f5224g.c();
                }
            }
        }
    }

    public static boolean b() {
        return o.b();
    }

    public IBinder onBind(Intent intent) {
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            String string = getString(R.string.app_name);
            o.a aVar = o.f436b;
            NotificationChannel notificationChannel = new NotificationChannel("cor_notification_channel", string, 3);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
            notificationChannel.setShowBadge(false);
            notificationChannel.setDescription("Stay safe from COVID-19");
            NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        this.f5235i = System.currentTimeMillis();
        CoronaApplication.f5224g.c();
        CoronaApplication.f5224g.e();
        CoronaApplication.f5224g.d();
        CoronaApplication.f5224g.f();
    }

    public void onDestroy() {
        super.onDestroy();
        f5231p = false;
        CoronaApplication.f5224g.e();
        CoronaApplication.f5224g.f();
        try {
            if (this.f5241o != null) {
                unregisterReceiver(this.f5241o);
            }
            if (this.f5240n != null) {
                unregisterReceiver(this.f5240n);
            }
            stopForeground(true);
            if (this.e != null) {
                this.e.a();
            }
            if (this.f5232f != null && o.b()) {
                this.f5232f.stopScan(this.f5237k);
            }
            if (this.f5239m != null) {
                this.f5239m.cancel();
            }
            if (this.f5233g != null && o.b()) {
                this.f5233g.stopAdvertising(this.f5238l);
            }
        } catch (Exception e2) {
            i.c.d.p.e.a(e2);
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        stopSelf();
        f5231p = false;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        super.onStartCommand(intent, i2, i3);
        f5231p = true;
        startForeground(1973, a("Stay safe from COVID-19"));
        this.f5232f = BluetoothAdapter.getDefaultAdapter().getBluetoothLeScanner();
        a();
        b.a.a.i.a aVar = new b.a.a.i.a();
        this.e = aVar;
        if (!aVar.c) {
            i.c.a.b.h.a a2 = i.c.a.b.h.c.a(aVar.f422b);
            f.a((Object) a2, "LocationServices.getFuse…onProviderClient(context)");
            aVar.a = a2;
            LocationRequest locationRequest = new LocationRequest();
            locationRequest.c(102);
            LocationRequest.a(1800000);
            locationRequest.f513f = 1800000;
            if (!locationRequest.f515h) {
                locationRequest.f514g = (long) (((double) 1800000) / 6.0d);
            }
            LocationRequest.a(300000);
            locationRequest.f515h = true;
            locationRequest.f514g = 300000;
            locationRequest.f518k = 100.0f;
            if (h.h.f.a.a((Context) aVar.f422b, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                i.c.a.b.h.a aVar2 = aVar.a;
                if (aVar2 != null) {
                    i.c.a.b.h.b bVar = aVar.d;
                    Looper myLooper = Looper.myLooper();
                    t tVar = new t(locationRequest, t.f3191l, (String) null, false, false, false, (String) null);
                    if (myLooper == null) {
                        q.b(Looper.myLooper() != null, (Object) "Can't create handler inside thread that has not called Looper.prepare()");
                        myLooper = Looper.myLooper();
                    }
                    String simpleName = i.c.a.b.h.b.class.getSimpleName();
                    q.a(bVar, (Object) "Listener must not be null");
                    q.a(myLooper, (Object) "Looper must not be null");
                    q.a(simpleName, (Object) "Listener type must not be null");
                    k kVar = new k(myLooper, bVar, simpleName);
                    w wVar = new w(kVar, tVar, kVar);
                    x xVar = new x(aVar2, kVar.c);
                    q.a(wVar);
                    q.a(xVar);
                    q.a(wVar.a.c, (Object) "Listener has already been released.");
                    q.a(xVar.a, (Object) "Listener has already been released.");
                    q.a(wVar.a.c.equals(xVar.a), (Object) "Listener registration and unregistration methods must be constructed with the same ListenerHolder.");
                    g gVar = aVar2.f3029i;
                    if (gVar != null) {
                        r0 r0Var = new r0(new d0(wVar, xVar), new h());
                        Handler handler = gVar.f3053m;
                        handler.sendMessage(handler.obtainMessage(8, new c0(r0Var, gVar.f3048h.get(), aVar2)));
                        aVar.c = true;
                    } else {
                        throw null;
                    }
                } else {
                    f.b("mFusedLocationClient");
                    throw null;
                }
            }
        }
        registerReceiver(this.f5241o, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        registerReceiver(this.f5240n, new IntentFilter("android.location.PROVIDERS_CHANGED"));
        return 1;
    }

    public void a() {
        Timer timer = this.f5239m;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = new Timer();
        this.f5239m = timer2;
        timer2.scheduleAtFixedRate(new c(), 0, 300000);
    }

    public final void a(AdvertiseSettings advertiseSettings, AdvertiseData.Builder builder, boolean z) {
        BluetoothLeAdvertiser bluetoothLeAdvertiser;
        builder.setIncludeTxPowerLevel(z);
        if (o.b() && (bluetoothLeAdvertiser = this.f5233g) != null && this.f5238l != null) {
            bluetoothLeAdvertiser.startAdvertising(advertiseSettings, builder.build(), this.f5238l);
        }
    }

    public final Notification a(String str) {
        String str2;
        PendingIntent activities = PendingIntent.getActivities(this, 0, new Intent[]{new Intent(this, SplashActivity.class)}, 134217728);
        if (Build.VERSION.SDK_INT >= 26) {
            o.a aVar = o.f436b;
            str2 = "cor_notification_channel";
        } else {
            str2 = "";
        }
        i iVar = new i(this, str2);
        h.h.e.h hVar = new h.h.e.h();
        hVar.f1735b = i.c(getResources().getString(R.string.app_name));
        hVar.a((CharSequence) str);
        iVar.a((j) hVar);
        iVar.b(getResources().getString(R.string.app_name));
        iVar.a((CharSequence) str);
        iVar.f1723f = activities;
        iVar.a(2, true);
        iVar.a((Uri) null);
        iVar.O.vibrate = null;
        iVar.A = "service";
        iVar.C = getResources().getColor(R.color.colorPrimary);
        iVar.O.icon = R.drawable.notification_icon;
        return iVar.a();
    }

    public static /* synthetic */ void a(BluetoothScanningService bluetoothScanningService, Notification notification) {
        NotificationManager notificationManager = (NotificationManager) bluetoothScanningService.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.notify(1973, notification);
        }
    }
}
