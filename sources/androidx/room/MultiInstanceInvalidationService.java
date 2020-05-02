package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import h.s.d;
import h.s.e;
import java.util.HashMap;

public class MultiInstanceInvalidationService extends Service {
    public int e = 0;

    /* renamed from: f  reason: collision with root package name */
    public final HashMap<Integer, String> f362f = new HashMap<>();

    /* renamed from: g  reason: collision with root package name */
    public final RemoteCallbackList<d> f363g = new a();

    /* renamed from: h  reason: collision with root package name */
    public final e.a f364h = new b();

    public class a extends RemoteCallbackList<d> {
        public a() {
        }

        public void onCallbackDied(IInterface iInterface, Object obj) {
            d dVar = (d) iInterface;
            MultiInstanceInvalidationService.this.f362f.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    public IBinder onBind(Intent intent) {
        return this.f364h;
    }

    public class b extends e.a {
        public b() {
        }

        public int a(d dVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f363g) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i2 = multiInstanceInvalidationService.e + 1;
                multiInstanceInvalidationService.e = i2;
                if (MultiInstanceInvalidationService.this.f363g.register(dVar, Integer.valueOf(i2))) {
                    MultiInstanceInvalidationService.this.f362f.put(Integer.valueOf(i2), str);
                    return i2;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.e--;
                return 0;
            }
        }

        public void a(d dVar, int i2) {
            synchronized (MultiInstanceInvalidationService.this.f363g) {
                MultiInstanceInvalidationService.this.f363g.unregister(dVar);
                MultiInstanceInvalidationService.this.f362f.remove(Integer.valueOf(i2));
            }
        }

        public void a(int i2, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f363g) {
                String str = MultiInstanceInvalidationService.this.f362f.get(Integer.valueOf(i2));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f363g.beginBroadcast();
                for (int i3 = 0; i3 < beginBroadcast; i3++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f363g.getBroadcastCookie(i3)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f362f.get(Integer.valueOf(intValue));
                        if (i2 != intValue && str.equals(str2)) {
                            MultiInstanceInvalidationService.this.f363g.getBroadcastItem(i3).a(strArr);
                        }
                    } catch (RemoteException e) {
                        Log.w("ROOM", "Error invoking a remote callback", e);
                    } catch (Throwable th) {
                        MultiInstanceInvalidationService.this.f363g.finishBroadcast();
                        throw th;
                    }
                }
                MultiInstanceInvalidationService.this.f363g.finishBroadcast();
            }
        }
    }
}
