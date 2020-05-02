package i.b.a.n.o.c;

import android.os.Build;
import android.util.Log;
import java.io.File;

/* compiled from: HardwareConfigState */
public final class q {

    /* renamed from: f  reason: collision with root package name */
    public static final File f2750f = new File("/proc/self/fd");

    /* renamed from: g  reason: collision with root package name */
    public static volatile q f2751g;
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2752b;
    public final int c;
    public int d;
    public boolean e = true;

    public q() {
        boolean z = true;
        String str = Build.MODEL;
        if (str != null && str.length() >= 7) {
            String substring = Build.MODEL.substring(0, 7);
            char c2 = 65535;
            switch (substring.hashCode()) {
                case -1398613787:
                    if (substring.equals("SM-A520")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case -1398431166:
                    if (substring.equals("SM-G930")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case -1398431161:
                    if (substring.equals("SM-G935")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case -1398431073:
                    if (substring.equals("SM-G960")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1398431068:
                    if (substring.equals("SM-G965")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -1398343746:
                    if (substring.equals("SM-J720")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1398222624:
                    if (substring.equals("SM-N935")) {
                        c2 = 0;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    if (Build.VERSION.SDK_INT == 26) {
                        z = false;
                        break;
                    }
                    break;
            }
        }
        this.a = z;
        if (Build.VERSION.SDK_INT >= 28) {
            this.f2752b = 20000;
            this.c = 0;
            return;
        }
        this.f2752b = 700;
        this.c = 128;
    }

    public static q b() {
        if (f2751g == null) {
            synchronized (q.class) {
                if (f2751g == null) {
                    f2751g = new q();
                }
            }
        }
        return f2751g;
    }

    public boolean a(int i2, int i3, boolean z, boolean z2) {
        int i4;
        if (!z || !this.a || Build.VERSION.SDK_INT < 26 || z2 || i2 < (i4 = this.c) || i3 < i4 || !a()) {
            return false;
        }
        return true;
    }

    public final synchronized boolean a() {
        boolean z = true;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 >= 50) {
            this.d = 0;
            int length = f2750f.list().length;
            if (length >= this.f2752b) {
                z = false;
            }
            this.e = z;
            if (!z && Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + this.f2752b);
            }
        }
        return this.e;
    }
}
