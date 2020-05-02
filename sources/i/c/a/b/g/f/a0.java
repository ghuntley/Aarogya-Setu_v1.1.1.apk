package i.c.a.b.g.f;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import i.c.a.b.d.k.c;
import i.c.a.b.d.l.d;
import i.c.a.b.d.l.h;

public class a0 extends h<g> {
    public final String y;
    public final b0<g> z = new b0(this);

    public a0(Context context, Looper looper, c.a aVar, c.b bVar, String str, d dVar) {
        super(context, looper, 23, dVar, aVar, bVar);
        this.y = str;
    }

    public /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof g ? (g) queryLocalInterface : new h(iBinder);
    }

    public int j() {
        return 11925000;
    }

    public Bundle o() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.y);
        return bundle;
    }

    public String r() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public String s() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }
}
