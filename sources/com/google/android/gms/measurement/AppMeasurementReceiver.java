package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import h.n.a.a;
import i.c.a.b.i.a.j5;
import i.c.a.b.i.a.k5;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class AppMeasurementReceiver extends a implements k5 {
    public j5 c;

    public final void a(Context context, Intent intent) {
        a.b(context, intent);
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new j5(this);
        }
        this.c.a(context, intent);
    }

    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }
}
