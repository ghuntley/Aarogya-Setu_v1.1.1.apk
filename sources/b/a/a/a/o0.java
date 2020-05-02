package b.a.a.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import h.l.d.c;
import h.l.d.e;
import java.util.Objects;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.views.WebViewActivity;

/* compiled from: NoNetworkDialog */
public class o0 extends c {
    public a n0;
    public String o0;

    /* compiled from: NoNetworkDialog */
    public interface a {
        void a(String str);
    }

    public void a(Context context) {
        super.a(context);
        if (context instanceof a) {
            this.n0 = (a) context;
        }
    }

    public /* synthetic */ void b(View view) {
        a aVar = this.n0;
        if (aVar != null) {
            aVar.a(this.o0);
        }
        H();
    }

    public /* synthetic */ void c(View view) {
        ((e) Objects.requireNonNull(f())).startActivityForResult(new Intent("android.settings.SETTINGS"), WebViewActivity.G.intValue());
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.dialog_no_network, viewGroup, false);
    }

    public void a(View view, Bundle bundle) {
        ((TextView) view.findViewById(R.id.textView2)).setText(i.c.d.p.e.a(k(), (int) R.string.make_sure_your_phone_is_connected_to_the_wifi_or_switch_to_mobile_data));
        view.findViewById(R.id.try_again).setOnClickListener(new d(this));
        view.findViewById(R.id.settings).setOnClickListener(new e(this));
    }
}
