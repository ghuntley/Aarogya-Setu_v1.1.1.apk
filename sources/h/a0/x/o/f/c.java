package h.a0.x.o.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import h.a0.l;

/* compiled from: BroadcastReceiverConstraintTracker */
public abstract class c<T> extends d<T> {

    /* renamed from: h  reason: collision with root package name */
    public static final String f1026h = l.a("BrdcstRcvrCnstrntTrckr");

    /* renamed from: g  reason: collision with root package name */
    public final BroadcastReceiver f1027g = new a();

    /* compiled from: BroadcastReceiverConstraintTracker */
    public class a extends BroadcastReceiver {
        public a() {
        }

        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.a(context, intent);
            }
        }
    }

    public c(Context context, h.a0.x.r.p.a aVar) {
        super(context, aVar);
    }

    public abstract void a(Context context, Intent intent);

    public void b() {
        l.a().a(f1026h, String.format("%s: registering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f1029b.registerReceiver(this.f1027g, d());
    }

    public void c() {
        l.a().a(f1026h, String.format("%s: unregistering receiver", new Object[]{getClass().getSimpleName()}), new Throwable[0]);
        this.f1029b.unregisterReceiver(this.f1027g);
    }

    public abstract IntentFilter d();
}
