package b.a.a.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import i.c.d.p.e;
import kotlin.TypeCastException;
import n.m.c.f;
import nic.goi.aarogyasetu.R;

/* compiled from: ThirdOnBoardIntroFragment.kt */
public final class z0 extends Fragment {
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(R.layout.fragment_third_on_board_intro, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.tv_you_will_be_alerted_if);
            if (findViewById != null) {
                f.a((Object) inflate, "view");
                ((TextView) findViewById).setText(e.a(inflate.getContext(), (int) R.string.you_will_be_alerted_if));
                View findViewById2 = inflate.findViewById(R.id.tv_the_app_alerts_are_accompanied);
                if (findViewById2 != null) {
                    ((TextView) findViewById2).setText(e.a(inflate.getContext(), (int) R.string.the_app_alerts_are_accompanied));
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
