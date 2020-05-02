package b.a.a.a;

import android.app.Activity;
import b.a.a.l.h;
import b.a.a.l.o;
import nic.goi.aarogyasetu.background.BluetoothScanningService;
import nic.goi.aarogyasetu.views.SplashActivity;

/* compiled from: SplashActivity.kt */
public final class x0 implements Runnable {
    public final /* synthetic */ SplashActivity e;

    public x0(SplashActivity splashActivity) {
        this.e = splashActivity;
    }

    public final void run() {
        if (h.c.a()) {
            if (!BluetoothScanningService.f5231p) {
                o.f436b.a((Activity) this.e);
            }
            o.f436b.c();
            SplashActivity.a(this.e);
            return;
        }
        SplashActivity.b(this.e);
    }
}
