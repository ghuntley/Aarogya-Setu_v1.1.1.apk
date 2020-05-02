package h.a0.x.r;

import android.content.Context;
import android.os.PowerManager;
import h.a0.l;
import i.a.a.a.a;
import java.util.HashMap;
import java.util.WeakHashMap;

/* compiled from: WakeLocks */
public class k {
    public static final String a = l.a("WakeLocks");

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<PowerManager.WakeLock, String> f1097b = new WeakHashMap<>();

    public static PowerManager.WakeLock a(Context context, String str) {
        String b2 = a.b("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, b2);
        synchronized (f1097b) {
            f1097b.put(newWakeLock, b2);
        }
        return newWakeLock;
    }

    public static void a() {
        HashMap hashMap = new HashMap();
        synchronized (f1097b) {
            hashMap.putAll(f1097b);
        }
        for (PowerManager.WakeLock wakeLock : hashMap.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                l.a().d(a, String.format("WakeLock held for %s", new Object[]{hashMap.get(wakeLock)}), new Throwable[0]);
            }
        }
    }
}
