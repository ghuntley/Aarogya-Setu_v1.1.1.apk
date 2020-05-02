package i.c.d.k;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class f0 extends BroadcastReceiver {
    @Nullable
    public c0 a;

    public f0(c0 c0Var) {
        this.a = c0Var;
    }

    public final void a() {
        if (FirebaseInstanceId.h()) {
            Log.d("FirebaseInstanceId", "Connectivity change received registered");
        }
        this.a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    public final void onReceive(Context context, Intent intent) {
        c0 c0Var = this.a;
        if (c0Var != null && c0Var.b()) {
            if (FirebaseInstanceId.h()) {
                Log.d("FirebaseInstanceId", "Connectivity changed. Starting background sync.");
            }
            FirebaseInstanceId.a((Runnable) this.a, 0);
            this.a.a().unregisterReceiver(this);
            this.a = null;
        }
    }
}
