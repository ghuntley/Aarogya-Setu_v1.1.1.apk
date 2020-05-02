package h.o;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import h.o.h;

/* compiled from: LifecycleService */
public class o extends Service implements l {
    public final z e = new z(this);

    public h a() {
        return this.e.a;
    }

    public IBinder onBind(Intent intent) {
        z zVar = this.e;
        if (zVar != null) {
            zVar.a(h.a.ON_START);
            return null;
        }
        throw null;
    }

    public void onCreate() {
        z zVar = this.e;
        if (zVar != null) {
            zVar.a(h.a.ON_CREATE);
            super.onCreate();
            return;
        }
        throw null;
    }

    public void onDestroy() {
        z zVar = this.e;
        if (zVar != null) {
            zVar.a(h.a.ON_STOP);
            zVar.a(h.a.ON_DESTROY);
            super.onDestroy();
            return;
        }
        throw null;
    }

    public void onStart(Intent intent, int i2) {
        z zVar = this.e;
        if (zVar != null) {
            zVar.a(h.a.ON_START);
            super.onStart(intent, i2);
            return;
        }
        throw null;
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        return super.onStartCommand(intent, i2, i3);
    }
}
