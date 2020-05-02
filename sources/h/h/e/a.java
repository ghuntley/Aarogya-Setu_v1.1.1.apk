package h.h.e;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* compiled from: ActivityCompat */
public class a extends h.h.f.a {

    /* renamed from: h.h.e.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityCompat */
    public static class C0043a implements Runnable {
        public final /* synthetic */ String[] e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Activity f1702f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f1703g;

        public C0043a(String[] strArr, Activity activity, int i2) {
            this.e = strArr;
            this.f1702f = activity;
            this.f1703g = i2;
        }

        public void run() {
            int[] iArr = new int[this.e.length];
            PackageManager packageManager = this.f1702f.getPackageManager();
            String packageName = this.f1702f.getPackageName();
            int length = this.e.length;
            for (int i2 = 0; i2 < length; i2++) {
                iArr[i2] = packageManager.checkPermission(this.e[i2], packageName);
            }
            ((b) this.f1702f).onRequestPermissionsResult(this.f1703g, this.e, iArr);
        }
    }

    /* compiled from: ActivityCompat */
    public interface b {
        void onRequestPermissionsResult(int i2, String[] strArr, int[] iArr);
    }

    /* compiled from: ActivityCompat */
    public interface c {
    }

    /* compiled from: ActivityCompat */
    public interface d {
        void a(int i2);
    }

    public static c a() {
        return null;
    }

    public static void a(Activity activity, Intent intent, int i2, Bundle bundle) {
        activity.startActivityForResult(intent, i2, bundle);
    }

    public static void b(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
        } else if (!b.a(activity)) {
            activity.recreate();
        }
    }

    public static void a(Activity activity) {
        activity.finishAffinity();
    }

    public static void a(Activity activity, String[] strArr, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            if (activity instanceof d) {
                ((d) activity).a(i2);
            }
            activity.requestPermissions(strArr, i2);
        } else if (activity instanceof b) {
            new Handler(Looper.getMainLooper()).post(new C0043a(strArr, activity, i2));
        }
    }
}
