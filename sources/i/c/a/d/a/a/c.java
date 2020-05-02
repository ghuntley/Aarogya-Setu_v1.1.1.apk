package i.c.a.d.a.a;

import android.content.Context;
import android.content.IntentFilter;
import i.c.a.d.a.b.a;
import i.c.a.d.a.d.b;
import java.util.HashSet;
import java.util.Set;

public final class c extends c<a> {
    public final i.c.a.d.a.c.a a;

    /* renamed from: b  reason: collision with root package name */
    public final IntentFilter f4290b;
    public final Context c;
    public final Set<i.c.a.d.a.d.a<StateT>> d = new HashSet();
    public b e = null;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f4291f = false;

    public c(Context context) {
        i.c.a.d.a.c.a aVar = new i.c.a.d.a.c.a("AppUpdateListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS");
        this.a = aVar;
        this.f4290b = intentFilter;
        this.c = context;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final synchronized void a(StateT statet) {
        for (i.c.a.d.a.d.a<StateT> a2 : this.d) {
            a2.a(statet);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final synchronized void a(i.c.a.d.a.d.a<StateT> aVar) {
        this.a.a(4, "registerListener", new Object[0]);
        this.d.add(aVar);
        a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public final synchronized void b(i.c.a.d.a.d.a<StateT> aVar) {
        this.a.a(4, "unregisterListener", new Object[0]);
        this.d.remove(aVar);
        a();
    }

    public final void a() {
        b bVar;
        if ((this.f4291f || !this.d.isEmpty()) && this.e == null) {
            b bVar2 = new b(this, (byte) 0);
            this.e = bVar2;
            this.c.registerReceiver(bVar2, this.f4290b);
        }
        if (!this.f4291f && this.d.isEmpty() && (bVar = this.e) != null) {
            this.c.unregisterReceiver(bVar);
            this.e = null;
        }
    }
}
