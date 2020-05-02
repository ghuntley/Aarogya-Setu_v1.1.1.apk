package com.google.firebase.iid;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import h.n.a.a;
import i.c.a.b.l.g;
import i.c.d.k.b0;
import i.c.d.k.c;
import i.c.d.k.e1;
import i.c.d.k.i1;
import i.c.d.k.s0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class FirebaseInstanceIdReceiver extends a {
    public final ExecutorService c = s0.a();

    public static final /* synthetic */ void a(boolean z, BroadcastReceiver.PendingResult pendingResult, g gVar) {
        if (z) {
            pendingResult.setResultCode(gVar.d() ? ((Integer) gVar.b()).intValue() : 500);
        }
        pendingResult.finish();
    }

    public final void onReceive(Context context, Intent intent) {
        b0 b0Var;
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
            if (intent2 != null) {
                intent = intent2;
            }
            intent.setComponent((ComponentName) null);
            intent.setPackage(context.getPackageName());
            if ("google.com/iid".equals(intent.getStringExtra("from"))) {
                b0Var = new i1(this.c);
            } else {
                b0Var = new c(context, this.c);
            }
            b0Var.a(intent).a((Executor) this.c, new e1(isOrderedBroadcast(), goAsync()));
        }
    }
}
