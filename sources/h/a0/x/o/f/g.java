package h.a0.x.o.f;

import android.content.Context;
import h.a0.x.r.p.a;

/* compiled from: Trackers */
public class g {
    public static g e;
    public a a;

    /* renamed from: b  reason: collision with root package name */
    public b f1036b;
    public e c;
    public f d;

    public g(Context context, a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.a = new a(applicationContext, aVar);
        this.f1036b = new b(applicationContext, aVar);
        this.c = new e(applicationContext, aVar);
        this.d = new f(applicationContext, aVar);
    }

    public static synchronized g a(Context context, a aVar) {
        g gVar;
        synchronized (g.class) {
            if (e == null) {
                e = new g(context, aVar);
            }
            gVar = e;
        }
        return gVar;
    }
}
