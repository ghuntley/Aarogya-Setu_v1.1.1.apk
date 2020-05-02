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

/* compiled from: FirstOnBoardIntroFragment.kt */
public final class w extends Fragment {
    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(R.layout.fragment_first_introduction, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.tv_each_one_of_us);
            if (findViewById != null) {
                f.a((Object) inflate, "view");
                ((TextView) findViewById).setText(e.a(inflate.getContext(), (int) R.string.each_one_of_us));
                View findViewById2 = inflate.findViewById(R.id.tv_would_you_like_to);
                if (findViewById2 != null) {
                    ((TextView) findViewById2).setText(e.a(inflate.getContext(), (int) R.string.would_you_like_to));
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
