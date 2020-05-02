package b.a.a.l;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.widget.Toast;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationRequest;
import i.c.a.b.d.l.r;
import i.c.a.b.g.f.x;
import i.c.a.b.g.f.y;
import i.c.a.b.h.c;
import i.c.a.b.h.h;
import i.c.a.b.h.m;
import i.c.a.b.l.d;
import i.c.a.b.l.d0;
import i.c.a.b.l.g;
import i.c.a.b.l.i;
import i.c.a.b.l.u;
import i.c.a.b.l.w;
import i.c.d.p.e;
import java.util.ArrayList;
import nic.goi.aarogyasetu.R;

/* compiled from: LocationUtils */
public class c0 {
    public Context a;

    /* compiled from: LocationUtils */
    public class a implements d {
        public a() {
        }

        public void a(Exception exc) {
            if (exc instanceof ResolvableApiException) {
                try {
                    Activity activity = (Activity) c0.this.a;
                    Status status = ((ResolvableApiException) exc).e;
                    if (status.f478h != null) {
                        activity.startIntentSenderForResult(status.f478h.getIntentSender(), 1245, (Intent) null, 0, 0, 0);
                    }
                } catch (IntentSender.SendIntentException unused) {
                    Context context = c0.this.a;
                    Toast.makeText(context, e.a(context, (int) R.string.error_location), 1).show();
                }
            }
        }
    }

    /* compiled from: LocationUtils */
    public interface b {
        void a(boolean z);
    }

    public c0(Context context) {
        this.a = context;
    }

    public void a(b bVar) {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.c(102);
        ArrayList arrayList = new ArrayList();
        arrayList.add(locationRequest);
        i.c.a.b.h.d dVar = new i.c.a.b.h.d(arrayList, true, false, (m) null);
        h b2 = c.b(this.a);
        x xVar = c.d;
        i.c.a.b.d.k.c cVar = b2.f3027g;
        if (xVar != null) {
            g a2 = r.a(cVar.a(new y(cVar, dVar)), new i.c.a.b.h.e());
            Activity activity = (Activity) this.a;
            a aVar = new a(bVar);
            d0 d0Var = (d0) a2;
            if (d0Var != null) {
                w wVar = new w(i.a, aVar);
                d0Var.f4000b.a(wVar);
                d0.a.a(activity).a(wVar);
                d0Var.f();
                u uVar = new u(i.a, new a());
                d0Var.f4000b.a(uVar);
                d0.a.a((Activity) this.a).a(uVar);
                d0Var.f();
                return;
            }
            throw null;
        }
        throw null;
    }

    public static /* synthetic */ void a(b bVar, i.c.a.b.h.e eVar) {
        if (bVar != null) {
            bVar.a(true);
        }
    }
}
