package i.c.a.b.i.a;

import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class b2 implements Runnable {
    public final /* synthetic */ String e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ long f3592f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ z f3593g;

    public b2(z zVar, String str, long j2) {
        this.f3593g = zVar;
        this.e = str;
        this.f3592f = j2;
    }

    public final void run() {
        z zVar = this.f3593g;
        String str = this.e;
        long j2 = this.f3592f;
        zVar.a();
        zVar.c();
        q.b(str);
        Integer num = zVar.c.get(str);
        if (num != null) {
            w7 z = zVar.s().z();
            int intValue = num.intValue() - 1;
            if (intValue == 0) {
                zVar.c.remove(str);
                Long l2 = zVar.f3967b.get(str);
                if (l2 == null) {
                    zVar.n().f3758f.a("First ad unit exposure time was never set");
                } else {
                    zVar.f3967b.remove(str);
                    zVar.a(str, j2 - l2.longValue(), z);
                }
                if (zVar.c.isEmpty()) {
                    long j3 = zVar.d;
                    if (j3 == 0) {
                        zVar.n().f3758f.a("First ad exposure time was never set");
                        return;
                    }
                    zVar.a(j2 - j3, z);
                    zVar.d = 0;
                    return;
                }
                return;
            }
            zVar.c.put(str, Integer.valueOf(intValue));
            return;
        }
        zVar.n().f3758f.a("Call to endAdUnitExposure for unknown ad unit id", str);
    }
}
