package i.c.a.b.i.a;

import android.os.IBinder;
import android.os.IInterface;
import i.c.a.b.d.g;
import i.c.a.b.d.l.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class n4 extends b<e4> {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public n4(android.content.Context r10, android.os.Looper r11, i.c.a.b.d.l.b.a r12, i.c.a.b.d.l.b.C0111b r13) {
        /*
            r9 = this;
            i.c.a.b.d.l.i r3 = i.c.a.b.d.l.i.a(r10)
            i.c.a.b.d.f r4 = i.c.a.b.d.f.f3022b
            i.c.a.b.d.l.q.a(r12)
            i.c.a.b.d.l.q.a(r13)
            r5 = 93
            r8 = 0
            r0 = r9
            r1 = r10
            r2 = r11
            r6 = r12
            r7 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.n4.<init>(android.content.Context, android.os.Looper, i.c.a.b.d.l.b$a, i.c.a.b.d.l.b$b):void");
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        if (queryLocalInterface instanceof e4) {
            return (e4) queryLocalInterface;
        }
        return new g4(iBinder);
    }

    public final int j() {
        return g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final String r() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    public final String s() {
        return "com.google.android.gms.measurement.START";
    }
}
