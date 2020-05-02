package i.b.a.n.m.c0;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;
import com.crashlytics.android.answers.SessionEvent;

/* compiled from: MemorySizeCalculator */
public final class j {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2555b;
    public final Context c;
    public final int d;

    /* compiled from: MemorySizeCalculator */
    public static final class a {

        /* renamed from: i  reason: collision with root package name */
        public static final int f2556i = (Build.VERSION.SDK_INT < 26 ? 4 : 1);
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public ActivityManager f2557b;
        public c c;
        public float d = 2.0f;
        public float e = ((float) f2556i);

        /* renamed from: f  reason: collision with root package name */
        public float f2558f = 0.4f;

        /* renamed from: g  reason: collision with root package name */
        public float f2559g = 0.33f;

        /* renamed from: h  reason: collision with root package name */
        public int f2560h = 4194304;

        public a(Context context) {
            this.a = context;
            this.f2557b = (ActivityManager) context.getSystemService(SessionEvent.ACTIVITY_KEY);
            this.c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT >= 26 && this.f2557b.isLowRamDevice()) {
                this.e = 0.0f;
            }
        }
    }

    /* compiled from: MemorySizeCalculator */
    public static final class b implements c {
        public final DisplayMetrics a;

        public b(DisplayMetrics displayMetrics) {
            this.a = displayMetrics;
        }
    }

    /* compiled from: MemorySizeCalculator */
    public interface c {
    }

    public j(a aVar) {
        int i2;
        this.c = aVar.a;
        if (aVar.f2557b.isLowRamDevice()) {
            i2 = aVar.f2560h / 2;
        } else {
            i2 = aVar.f2560h;
        }
        this.d = i2;
        ActivityManager activityManager = aVar.f2557b;
        float f2 = aVar.f2558f;
        int round = Math.round(((float) (activityManager.getMemoryClass() * 1024 * 1024)) * (activityManager.isLowRamDevice() ? aVar.f2559g : f2));
        c cVar = aVar.c;
        float f3 = (float) (((b) cVar).a.widthPixels * ((b) cVar).a.heightPixels * 4);
        int round2 = Math.round(aVar.e * f3);
        int round3 = Math.round(f3 * aVar.d);
        int i3 = round - this.d;
        int i4 = round3 + round2;
        if (i4 <= i3) {
            this.f2555b = round3;
            this.a = round2;
        } else {
            float f4 = (float) i3;
            float f5 = aVar.e;
            float f6 = aVar.d;
            float f7 = f4 / (f5 + f6);
            this.f2555b = Math.round(f6 * f7);
            this.a = Math.round(f7 * aVar.e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder a2 = i.a.a.a.a.a("Calculation complete, Calculated memory cache size: ");
            a2.append(a(this.f2555b));
            a2.append(", pool size: ");
            a2.append(a(this.a));
            a2.append(", byte array size: ");
            a2.append(a(this.d));
            a2.append(", memory class limited? ");
            a2.append(i4 > round);
            a2.append(", max size: ");
            a2.append(a(round));
            a2.append(", memoryClass: ");
            a2.append(aVar.f2557b.getMemoryClass());
            a2.append(", isLowMemoryDevice: ");
            a2.append(aVar.f2557b.isLowRamDevice());
            Log.d("MemorySizeCalculator", a2.toString());
        }
    }

    public final String a(int i2) {
        return Formatter.formatFileSize(this.c, (long) i2);
    }
}
