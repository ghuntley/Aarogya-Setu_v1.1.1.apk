package i.c.d.k;

import android.content.BroadcastReceiver;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import i.c.a.b.l.c;
import i.c.a.b.l.g;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class e1 implements c {
    public final boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final BroadcastReceiver.PendingResult f4692b;

    public e1(boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.a = z;
        this.f4692b = pendingResult;
    }

    public final void a(g gVar) {
        FirebaseInstanceIdReceiver.a(this.a, this.f4692b, gVar);
    }
}
