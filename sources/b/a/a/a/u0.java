package b.a.a.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import g.a.a.b.a;
import i.c.d.p.e;
import kotlin.TypeCastException;
import n.m.c.f;
import nic.goi.aarogyasetu.R;

/* compiled from: SecondOnBoardIntroFragment.kt */
public final class u0 extends Fragment {
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(R.layout.fragment_second_on_board_intro, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.tv_cowin_20_tracks_through);
            if (findViewById != null) {
                f.a((Object) inflate, "view");
                ((TextView) findViewById).setText(a.a(e.a(inflate.getContext(), (int) R.string.cowin_20_tracks_through), 63));
                View findViewById2 = inflate.findViewById(R.id.tv_simply_1_install_the_app);
                if (findViewById2 != null) {
                    ((TextView) findViewById2).setText(e.a(inflate.getContext(), (int) R.string.simply_1_install_the_app, new String[]{e.a(inflate.getContext(), (int) R.string.install), e.a(inflate.getContext(), (int) R.string.bluetooth_and_gps), e.a(inflate.getContext(), (int) R.string.location_sharing)}));
                    return inflate;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        f.a("inflater");
        throw null;
    }

    public /* synthetic */ void y() {
        this.I = true;
    }
}
