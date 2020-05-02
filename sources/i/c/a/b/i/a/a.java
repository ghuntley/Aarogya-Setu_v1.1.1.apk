package i.c.a.b.i.a;

import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class a implements Runnable {
    public final /* synthetic */ String e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f3574f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ z f3575g;

    public a(z zVar, String str, long j2) {
        this.f3575g = zVar;
        this.e = str;
        this.f3574f = j2;
    }

    public final void run() {
        z zVar = this.f3575g;
        String str = this.e;
        long j2 = this.f3574f;
        zVar.a();
        zVar.c();
        q.b(str);
        if (zVar.c.isEmpty()) {
            zVar.d = j2;
        }
        Integer num = zVar.c.get(str);
        if (num != null) {
            zVar.c.put(str, Integer.valueOf(num.intValue() + 1));
        } else if (zVar.c.size() >= 100) {
            zVar.n().f3761i.a("Too many ads visible");
        } else {
            zVar.c.put(str, 1);
            zVar.f3967b.put(str, Long.valueOf(j2));
        }
    }
}
