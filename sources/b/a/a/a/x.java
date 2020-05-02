package b.a.a.a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import b.a.a.l.h;
import b.a.a.l.o;
import i.c.d.p.e;
import n.m.c.f;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.background.BluetoothScanningService;
import nic.goi.aarogyasetu.views.MainActivity;

/* compiled from: ForthOnBoardIntroFragment.kt */
public final class x implements View.OnClickListener {
    public final /* synthetic */ y e;

    public x(y yVar) {
        this.e = yVar;
    }

    public final void onClick(View view) {
        if (!o.f436b.g(this.e.k())) {
            Toast.makeText(this.e.k(), e.a(this.e.k(), (int) R.string.error_network_error), 0).show();
        } else if (!h.c.a() || !BluetoothScanningService.f5231p) {
            h.l.d.e f2 = this.e.f();
            if (f2 != null) {
                f2.startActivity(new Intent(this.e.f(), MainActivity.class));
            }
            h.l.d.e f3 = this.e.f();
            if (f3 != null) {
                f3.finish();
            }
        } else {
            o.a aVar = o.f436b;
            h.l.d.e f4 = this.e.f();
            if (f4 != null) {
                f.a((Object) f4, "activity!!");
                o.a.a(aVar, "https://web.swaraksha.gov.in/ncv19/", "Home", f4, false, (Bundle) null, 24);
                return;
            }
            f.a();
            throw null;
        }
    }
}
