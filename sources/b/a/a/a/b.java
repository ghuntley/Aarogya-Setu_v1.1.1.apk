package b.a.a.a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import b.a.a.e;
import h.o.a0;
import h.o.b0;
import i.c.a.c.p.c;
import java.util.HashMap;
import n.m.c.f;
import nic.goi.aarogyasetu.R;

/* compiled from: WhyNeededFragment.kt */
public final class b extends c {
    public b.a.a.m.b n0;
    public HashMap o0;

    /* compiled from: java-style lambda group */
    public static final class a implements View.OnClickListener {
        public final /* synthetic */ int e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Object f414f;

        public a(int i2, Object obj) {
            this.e = i2;
            this.f414f = obj;
        }

        public final void onClick(View view) {
            int i2 = this.e;
            if (i2 == 0) {
                b.a.a.m.b bVar = ((b) this.f414f).n0;
                if (bVar != null) {
                    bVar.d.b(false);
                    ((b) this.f414f).I();
                    return;
                }
                f.b("onboardingViewModel");
                throw null;
            } else if (i2 == 1) {
                b.a.a.m.b bVar2 = ((b) this.f414f).n0;
                if (bVar2 != null) {
                    bVar2.d.b(false);
                    ((b) this.f414f).I();
                    return;
                }
                f.b("onboardingViewModel");
                throw null;
            } else {
                throw null;
            }
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            a0 a2 = new b0(this).a(b.a.a.m.b.class);
            f.a((Object) a2, "ViewModelProvider(this).…ingViewModel::class.java)");
            this.n0 = (b.a.a.m.b) a2;
            return layoutInflater.inflate(R.layout.fragment_why_needed, viewGroup, false);
        }
        f.a("inflater");
        throw null;
    }

    public View d(int i2) {
        if (this.o0 == null) {
            this.o0 = new HashMap();
        }
        View view = (View) this.o0.get(Integer.valueOf(i2));
        if (view != null) {
            return view;
        }
        View view2 = this.K;
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i2);
        this.o0.put(Integer.valueOf(i2), findViewById);
        return findViewById;
    }

    public /* synthetic */ void y() {
        super.y();
        HashMap hashMap = this.o0;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public void a(View view, Bundle bundle) {
        if (view != null) {
            TextView textView = (TextView) d(e.tv_mobile_no_required);
            f.a((Object) textView, "tv_mobile_no_required");
            textView.setText(i.c.d.p.e.a(view.getContext(), (int) R.string.your_mobile_number_is_required_to_know_your_identity));
            TextView textView2 = (TextView) d(e.tv_say_you_met_someone);
            f.a((Object) textView2, "tv_say_you_met_someone");
            textView2.setText(i.c.d.p.e.a(view.getContext(), (int) R.string.text_value));
            Button button = (Button) d(e.i_understand);
            f.a((Object) button, "i_understand");
            button.setText(i.c.d.p.e.a(view.getContext(), (int) R.string.i_understand));
            ((Button) d(e.i_understand)).setOnClickListener(new a(0, this));
            ((ImageView) d(e.close)).setOnClickListener(new a(1, this));
            return;
        }
        f.a("view");
        throw null;
    }
}
