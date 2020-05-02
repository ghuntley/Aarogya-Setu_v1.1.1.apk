package i.c.a.b.g.b;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import i.c.a.b.d.g;
import i.c.a.b.d.k.h.f;
import i.c.a.b.d.k.h.l;
import i.c.a.b.d.l.d;
import i.c.a.b.d.l.h;

/* compiled from: com.google.android.gms:play-services-auth-api-phone@@17.4.0 */
public final class i extends h<e> {
    public i(Context context, Looper looper, d dVar, f fVar, l lVar) {
        super(context, looper, 126, dVar, fVar, lVar);
    }

    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        if (queryLocalInterface instanceof e) {
            return (e) queryLocalInterface;
        }
        return new d(iBinder);
    }

    public final int j() {
        return g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public final i.c.a.b.d.d[] n() {
        return b.d;
    }

    public final String r() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    public final String s() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }
}
