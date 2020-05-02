package l.a.a.a.o.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: AdvertisingInfoServiceStrategy */
public class f {
    public final Context a;

    /* compiled from: AdvertisingInfoServiceStrategy */
    public static final class b implements ServiceConnection {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public final LinkedBlockingQueue<IBinder> f5061b = new LinkedBlockingQueue<>(1);

        public /* synthetic */ b(a aVar) {
        }

        public IBinder a() {
            if (this.a && l.a.a.a.f.a().a("Fabric", 6)) {
                Log.e("Fabric", "getBinder already called", (Throwable) null);
            }
            this.a = true;
            try {
                return this.f5061b.poll(200, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                return null;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            try {
                this.f5061b.put(iBinder);
            } catch (InterruptedException unused) {
            }
        }

        public void onServiceDisconnected(ComponentName componentName) {
            this.f5061b.clear();
        }
    }

    /* compiled from: AdvertisingInfoServiceStrategy */
    public static final class c implements IInterface {
        public final IBinder a;

        public c(IBinder iBinder) {
            this.a = iBinder;
        }

        public IBinder asBinder() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
            if (l.a.a.a.f.a().a("Fabric", 3) != false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x002e, code lost:
            android.util.Log.d("Fabric", "Could not get parcel from Google Play Service to capture AdvertisingId", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x001f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String d() {
            /*
                r7 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                r2 = 0
                java.lang.String r3 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r3)     // Catch:{ Exception -> 0x001f }
                android.os.IBinder r3 = r7.a     // Catch:{ Exception -> 0x001f }
                r4 = 1
                r5 = 0
                r3.transact(r4, r0, r1, r5)     // Catch:{ Exception -> 0x001f }
                r1.readException()     // Catch:{ Exception -> 0x001f }
                java.lang.String r2 = r1.readString()     // Catch:{ Exception -> 0x001f }
                goto L_0x0031
            L_0x001d:
                r2 = move-exception
                goto L_0x0038
            L_0x001f:
                l.a.a.a.c r3 = l.a.a.a.f.a()     // Catch:{ all -> 0x001d }
                java.lang.String r4 = "Fabric"
                java.lang.String r5 = "Could not get parcel from Google Play Service to capture AdvertisingId"
                r6 = 3
                boolean r3 = r3.a(r4, r6)     // Catch:{ all -> 0x001d }
                if (r3 == 0) goto L_0x0031
                android.util.Log.d(r4, r5, r2)     // Catch:{ all -> 0x001d }
            L_0x0031:
                r1.recycle()
                r0.recycle()
                return r2
            L_0x0038:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.b.f.c.d():java.lang.String");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(3:6|7|(1:9)) */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
            r1.recycle();
            r0.recycle();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0032, code lost:
            if (l.a.a.a.f.a().a("Fabric", 3) != false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
            android.util.Log.d("Fabric", "Could not get parcel from Google Play Service to capture Advertising limitAdTracking", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0025 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean g() {
            /*
                r7 = this;
                android.os.Parcel r0 = android.os.Parcel.obtain()
                android.os.Parcel r1 = android.os.Parcel.obtain()
                r2 = 0
                java.lang.String r3 = "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService"
                r0.writeInterfaceToken(r3)     // Catch:{ Exception -> 0x0025 }
                r3 = 1
                r0.writeInt(r3)     // Catch:{ Exception -> 0x0025 }
                android.os.IBinder r4 = r7.a     // Catch:{ Exception -> 0x0025 }
                r5 = 2
                r4.transact(r5, r0, r1, r2)     // Catch:{ Exception -> 0x0025 }
                r1.readException()     // Catch:{ Exception -> 0x0025 }
                int r4 = r1.readInt()     // Catch:{ Exception -> 0x0025 }
                if (r4 == 0) goto L_0x0038
                r2 = 1
                goto L_0x0038
            L_0x0023:
                r2 = move-exception
                goto L_0x003f
            L_0x0025:
                l.a.a.a.c r3 = l.a.a.a.f.a()     // Catch:{ all -> 0x0023 }
                java.lang.String r4 = "Fabric"
                java.lang.String r5 = "Could not get parcel from Google Play Service to capture Advertising limitAdTracking"
                r6 = 3
                boolean r3 = r3.a(r4, r6)     // Catch:{ all -> 0x0023 }
                if (r3 == 0) goto L_0x0038
                r3 = 0
                android.util.Log.d(r4, r5, r3)     // Catch:{ all -> 0x0023 }
            L_0x0038:
                r1.recycle()
                r0.recycle()
                return r2
            L_0x003f:
                r1.recycle()
                r0.recycle()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.b.f.c.g():boolean");
        }
    }

    public f(Context context) {
        this.a = context.getApplicationContext();
    }

    public b a() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (l.a.a.a.f.a().a("Fabric", 3)) {
                Log.d("Fabric", "AdvertisingInfoServiceStrategy cannot be called on the main thread", (Throwable) null);
            }
            return null;
        }
        try {
            this.a.getPackageManager().getPackageInfo("com.android.vending", 0);
            b bVar = new b((a) null);
            Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
            intent.setPackage("com.google.android.gms");
            try {
                if (this.a.bindService(intent, bVar, 1)) {
                    c cVar = new c(bVar.a());
                    b bVar2 = new b(cVar.d(), cVar.g());
                    this.a.unbindService(bVar);
                    return bVar2;
                }
                if (l.a.a.a.f.a().a("Fabric", 3)) {
                    Log.d("Fabric", "Could not bind to Google Play Service to capture AdvertisingId", (Throwable) null);
                }
                return null;
            } catch (Exception e) {
                if (l.a.a.a.f.a().a("Fabric", 5)) {
                    Log.w("Fabric", "Exception in binding to Google Play Service to capture AdvertisingId", e);
                }
                this.a.unbindService(bVar);
            } catch (Throwable th) {
                if (l.a.a.a.f.a().a("Fabric", 3)) {
                    Log.d("Fabric", "Could not bind to Google Play Service to capture AdvertisingId", th);
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            if (l.a.a.a.f.a().a("Fabric", 3)) {
                Log.d("Fabric", "Unable to find Google Play Services package name", (Throwable) null);
            }
            return null;
        } catch (Exception e2) {
            if (l.a.a.a.f.a().a("Fabric", 3)) {
                Log.d("Fabric", "Unable to determine if Google Play Services is available", e2);
            }
            return null;
        }
    }
}
