package b.a.a.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import b.a.a.l.h;
import g.a.a.b.a;
import i.b.a.c;
import i.c.d.p.e;
import java.util.HashMap;
import kotlin.TypeCastException;
import n.m.c.f;
import nic.goi.aarogyasetu.R;

/* compiled from: ForthOnBoardIntroFragment.kt */
public final class y extends Fragment {
    public boolean a0;
    public HashMap b0;

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            View inflate = layoutInflater.inflate(R.layout.fragment_forth_on_board_intro, viewGroup, false);
            View findViewById = inflate.findViewById(R.id.tv_with_cowin_20_you_can);
            if (findViewById != null) {
                f.a((Object) inflate, "view");
                ((TextView) findViewById).setText(a.a(e.a(inflate.getContext(), (int) R.string.with_cowin_20_you_can), 63));
                View findViewById2 = inflate.findViewById(R.id.btn_register);
                if (findViewById2 != null) {
                    Button button = (Button) findViewById2;
                    button.setText(e.a(inflate.getContext(), (int) R.string.register_now));
                    if (!this.a0) {
                        button.setVisibility(4);
                    }
                    if (h.c.a()) {
                        button.setText(a((int) R.string.next));
                    }
                    button.setOnClickListener(new x(this));
                    return inflate;
                }
                throw new TypeCastException("null cannot be cast to non-null type android.widget.Button");
            }
            throw new TypeCastException("null cannot be cast to non-null type android.widget.TextView");
        }
        f.a("inflater");
        throw null;
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        Bundle bundle2 = this.f232j;
        this.a0 = bundle2 != null ? bundle2.getBoolean("param1") : this.a0;
    }

    public View d(int i2) {
        if (this.b0 == null) {
            this.b0 = new HashMap();
        }
        View view = (View) this.b0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = this.K;
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.b0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public /* synthetic */ void y() {
        this.I = true;
        HashMap hashMap = this.b0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void a(View view, Bundle bundle) {
        if (view != null) {
            c.a((Fragment) this).a(Integer.valueOf(R.drawable.onboarding_4_2)).a((ImageView) d(b.a.a.e.imageView20));
            c.a((Fragment) this).a(Integer.valueOf(R.drawable.map_pins)).a((ImageView) d(b.a.a.e.imageView2));
            return;
        }
        f.a("view");
        throw null;
    }
}
