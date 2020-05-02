package i.c.a.d.a.c;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

public final class p implements ServiceConnection {
    public final /* synthetic */ j a;

    public /* synthetic */ p(j jVar, byte b2) {
        this.a = jVar;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.a.f4304b.a(4, "ServiceConnectionImpl.onServiceConnected(%s)", new Object[]{componentName});
        j jVar = this.a;
        jVar.a().post(new s(this, iBinder));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.a.f4304b.a(4, "ServiceConnectionImpl.onServiceDisconnected(%s)", new Object[]{componentName});
        j jVar = this.a;
        jVar.a().post(new r(this));
    }
}
