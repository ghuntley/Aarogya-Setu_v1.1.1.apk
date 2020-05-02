package b.a.a.i;

import android.location.Location;
import android.os.Handler;
import b.a.a.g.c;
import com.google.android.gms.location.LocationResult;
import i.c.a.b.d.k.h.c0;
import i.c.a.b.d.k.h.g;
import i.c.a.b.d.k.h.k;
import i.c.a.b.d.k.h.l0;
import i.c.a.b.d.k.h.s0;
import i.c.a.b.d.l.q;
import i.c.a.b.l.d0;
import i.c.a.b.l.h;
import i.c.a.b.l.i;
import i.c.d.p.e;
import java.util.concurrent.Executor;
import n.m.c.f;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.models.BluetoothData;

/* compiled from: RetrieveLocationService.kt */
public final class a {
    public i.c.a.b.h.a a;

    /* renamed from: b  reason: collision with root package name */
    public final CoronaApplication f422b = CoronaApplication.f5224g;
    public boolean c;
    public i.c.a.b.h.b d = new C0009a();

    /* renamed from: b.a.a.i.a$a  reason: collision with other inner class name */
    /* compiled from: RetrieveLocationService.kt */
    public static final class C0009a extends i.c.a.b.h.b {
        public void a(LocationResult locationResult) {
            if (locationResult != null && locationResult.d() != null) {
                BluetoothData bluetoothData = new BluetoothData("", 0, "", "");
                Location d = locationResult.d();
                f.a((Object) d, "it.lastLocation");
                bluetoothData.setLatitude(d.getLatitude());
                Location d2 = locationResult.d();
                f.a((Object) d2, "it.lastLocation");
                bluetoothData.setLongitude(d2.getLongitude());
                String.valueOf(bluetoothData.getLatitude());
                String.valueOf(bluetoothData.getLongitude());
                q.a((Executor) c.f419b, new b.a.a.g.b(e.d(bluetoothData)));
            }
        }
    }

    /* compiled from: RetrieveLocationService.kt */
    public static final class b<TResult> implements i.c.a.b.l.e<Void> {
        public final /* synthetic */ a a;

        public b(a aVar) {
            this.a = aVar;
        }

        public void a(Object obj) {
            Void voidR = (Void) obj;
            this.a.c = false;
        }
    }

    static {
        f.a((Object) a.class.getSimpleName(), "RetrieveLocationService::class.java.simpleName");
    }

    public final void a() {
        if (this.c) {
            i.c.a.b.h.a aVar = this.a;
            if (aVar != null) {
                i.c.a.b.h.b bVar = this.d;
                String simpleName = i.c.a.b.h.b.class.getSimpleName();
                q.a(bVar, (Object) "Listener must not be null");
                q.a(simpleName, (Object) "Listener type must not be null");
                q.a(simpleName, (Object) "Listener type must not be empty");
                k.a aVar2 = new k.a(bVar, simpleName);
                q.a(aVar2, (Object) "Listener key cannot be null.");
                g gVar = aVar.f3029i;
                if (gVar != null) {
                    h hVar = new h();
                    s0 s0Var = new s0(aVar2, hVar);
                    Handler handler = gVar.f3053m;
                    handler.sendMessage(handler.obtainMessage(13, new c0(s0Var, gVar.f3048h.get(), aVar)));
                    d0<TResult> d0Var = hVar.a;
                    l0 l0Var = new l0();
                    if (d0Var != null) {
                        i.c.a.b.l.g<TContinuationResult> a2 = d0Var.a(i.a, (i.c.a.b.l.a<TResult, TContinuationResult>) l0Var);
                        ((d0) a2).a(i.a, new b(this));
                        return;
                    }
                    throw null;
                }
                throw null;
            }
            f.b("mFusedLocationClient");
            throw null;
        }
    }
}
