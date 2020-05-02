package b.a.a.a;

import android.os.Bundle;
import b.a.a.l.o;
import n.h;
import n.m.b.b;
import n.m.c.f;
import n.m.c.g;
import nic.goi.aarogyasetu.views.MainActivity;

/* compiled from: MainActivity.kt */
public final class h0 extends g implements b<String, h> {
    public final /* synthetic */ MainActivity e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h0(MainActivity mainActivity) {
        super(1);
        this.e = mainActivity;
    }

    public Object a(Object obj) {
        String str = (String) obj;
        if (str != null) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("need_permissions", false);
            bundle.putBoolean("do_not_show_back", false);
            o.a.a(o.f436b, str, "", this.e, false, bundle, 8);
            return h.a;
        }
        f.a("it");
        throw null;
    }
}
