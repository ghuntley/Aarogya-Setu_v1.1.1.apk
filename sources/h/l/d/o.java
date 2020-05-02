package h.l.d;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import g.a.a.b.a;

/* compiled from: FragmentHostCallback */
public abstract class o<E> extends k {
    public final Activity e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f2001f;

    /* renamed from: g  reason: collision with root package name */
    public final Handler f2002g;

    /* renamed from: h  reason: collision with root package name */
    public final r f2003h = new t();

    public o(e eVar) {
        Handler handler = new Handler();
        this.e = eVar;
        a.a(eVar, (Object) "context == null");
        this.f2001f = eVar;
        a.a(handler, (Object) "handler == null");
        this.f2002g = handler;
    }
}
