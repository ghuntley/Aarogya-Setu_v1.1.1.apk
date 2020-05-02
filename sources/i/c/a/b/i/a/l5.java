package i.c.a.b.i.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Bundle;
import i.c.a.b.g.g.pc;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class l5 implements Runnable {
    public final /* synthetic */ s5 e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f3742f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Bundle f3743g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ Context f3744h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ m4 f3745i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f3746j;

    public l5(s5 s5Var, long j2, Bundle bundle, Context context, m4 m4Var, BroadcastReceiver.PendingResult pendingResult) {
        this.e = s5Var;
        this.f3742f = j2;
        this.f3743g = bundle;
        this.f3744h = context;
        this.f3745i = m4Var;
        this.f3746j = pendingResult;
    }

    public final void run() {
        long a = this.e.i().f3933j.a();
        long j2 = this.f3742f;
        if (a > 0 && (j2 >= a || j2 <= 0)) {
            j2 = a - 1;
        }
        if (j2 > 0) {
            this.f3743g.putLong("click_timestamp", j2);
        }
        this.f3743g.putString("_cis", "referrer broadcast");
        s5.a(this.f3744h, (pc) null).o().a("auto", "_cmp", this.f3743g);
        this.f3745i.f3766n.a("Install campaign recorded");
        BroadcastReceiver.PendingResult pendingResult = this.f3746j;
        if (pendingResult != null) {
            pendingResult.finish();
        }
    }
}
