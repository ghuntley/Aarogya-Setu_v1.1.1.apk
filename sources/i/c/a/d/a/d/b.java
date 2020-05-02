package i.c.a.d.a.d;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import i.c.a.d.a.a.c;
import i.c.a.d.a.b.a;

public final class b extends BroadcastReceiver {
    public final /* synthetic */ c a;

    public /* synthetic */ b(c cVar, byte b2) {
        this.a = cVar;
    }

    public final void onReceive(Context context, Intent intent) {
        c cVar = this.a;
        if (cVar == null) {
            throw null;
        } else if (!context.getPackageName().equals(intent.getStringExtra("package.name"))) {
            cVar.a.a(3, "ListenerRegistryBroadcastReceiver received broadcast for third party app: %s", new Object[]{intent.getStringExtra("package.name")});
        } else {
            a aVar = new a(intent.getIntExtra("install.status", 0), intent.getIntExtra("error.code", 0), intent.getStringExtra("package.name"));
            cVar.a.a(3, "ListenerRegistryBroadcastReceiver.onReceive: %s", new Object[]{aVar});
            cVar.a((Object) aVar);
        }
    }
}
