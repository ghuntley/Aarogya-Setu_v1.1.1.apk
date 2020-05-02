package i.c.a.b.d.n;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.stats.WakeLockEvent;
import i.c.a.b.d.o.i;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class c {
    public static c a = new c();

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f3158b;

    public void a(Context context, String str, int i2, String str2, String str3, String str4, int i3, List<String> list, long j2) {
        int i4 = i2;
        List<String> list2 = list;
        if (f3158b == null) {
            f3158b = false;
        }
        if (f3158b.booleanValue()) {
            if (TextUtils.isEmpty(str)) {
                String valueOf = String.valueOf(str);
                Log.e("WakeLockTracker", valueOf.length() != 0 ? "missing wakeLock key. ".concat(valueOf) : new String("missing wakeLock key. "));
            } else if (7 == i4 || 8 == i4 || 10 == i4 || 11 == i4) {
                long currentTimeMillis = System.currentTimeMillis();
                List<String> list3 = (list2 == null || list.size() != 1 || !"com.google.android.gms".equals(list2.get(0))) ? list2 : null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                int a2 = i.a(context);
                String packageName = context.getPackageName();
                WakeLockEvent wakeLockEvent = r1;
                String str5 = "WakeLockTracker";
                WakeLockEvent wakeLockEvent2 = new WakeLockEvent(2, currentTimeMillis, i2, str2, i3, list3, str, elapsedRealtime, a2, str3, "com.google.android.gms".equals(packageName) ? null : packageName, i.b(context), j2, str4, false);
                try {
                    context.startService(new Intent().setComponent(b.a).putExtra("com.google.android.gms.common.stats.EXTRA_LOG_EVENT", wakeLockEvent));
                } catch (Exception e) {
                    Log.wtf(str5, e);
                }
            }
        }
    }
}
