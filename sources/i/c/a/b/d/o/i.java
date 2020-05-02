package i.c.a.b.d.o;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class i {
    public static final IntentFilter a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: b  reason: collision with root package name */
    public static long f3164b;
    public static float c = Float.NaN;

    @TargetApi(20)
    public static int a(Context context) {
        int i2;
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, a);
        int i3 = 0;
        if (registerReceiver == null) {
            i2 = 0;
        } else {
            i2 = registerReceiver.getIntExtra("plugged", 0);
        }
        int i4 = (i2 & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (powerManager.isInteractive()) {
            i3 = 2;
        }
        return i3 | i4;
    }

    public static synchronized float b(Context context) {
        synchronized (i.class) {
            if (SystemClock.elapsedRealtime() - f3164b >= 60000 || Float.isNaN(c)) {
                Intent registerReceiver = context.getApplicationContext().registerReceiver((BroadcastReceiver) null, a);
                if (registerReceiver != null) {
                    c = ((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1));
                }
                f3164b = SystemClock.elapsedRealtime();
                float f2 = c;
                return f2;
            }
            float f3 = c;
            return f3;
        }
    }
}
