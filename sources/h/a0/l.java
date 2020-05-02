package h.a0;

import android.util.Log;

/* compiled from: Logger */
public abstract class l {
    public static l a;

    /* compiled from: Logger */
    public static class a extends l {

        /* renamed from: b  reason: collision with root package name */
        public int f918b;

        public a(int i2) {
            this.f918b = i2;
        }

        public void a(String str, String str2, Throwable... thArr) {
            if (this.f918b > 3) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.d(str, str2);
            } else {
                Log.d(str, str2, thArr[0]);
            }
        }

        public void b(String str, String str2, Throwable... thArr) {
            if (this.f918b > 6) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.e(str, str2);
            } else {
                Log.e(str, str2, thArr[0]);
            }
        }

        public void c(String str, String str2, Throwable... thArr) {
            if (this.f918b > 4) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.i(str, str2);
            } else {
                Log.i(str, str2, thArr[0]);
            }
        }

        public void d(String str, String str2, Throwable... thArr) {
            if (this.f918b > 5) {
                return;
            }
            if (thArr == null || thArr.length < 1) {
                Log.w(str, str2);
            } else {
                Log.w(str, str2, thArr[0]);
            }
        }
    }

    public static synchronized void a(l lVar) {
        synchronized (l.class) {
            a = lVar;
        }
    }

    public abstract void a(String str, String str2, Throwable... thArr);

    public abstract void b(String str, String str2, Throwable... thArr);

    public abstract void c(String str, String str2, Throwable... thArr);

    public abstract void d(String str, String str2, Throwable... thArr);

    public static String a(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public static synchronized l a() {
        l lVar;
        synchronized (l.class) {
            if (a == null) {
                a = new a(3);
            }
            lVar = a;
        }
        return lVar;
    }
}
