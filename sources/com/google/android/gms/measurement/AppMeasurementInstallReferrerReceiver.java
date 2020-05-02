package com.google.android.gms.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import i.c.a.b.i.a.j5;
import i.c.a.b.i.a.k5;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class AppMeasurementInstallReferrerReceiver extends BroadcastReceiver implements k5 {
    public j5 a;

    public final BroadcastReceiver.PendingResult a() {
        return goAsync();
    }

    public final void a(Context context, Intent intent) {
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.a == null) {
            this.a = new j5(this);
        }
        this.a.a(context, intent);
    }
}
