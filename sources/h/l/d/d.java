package h.l.d;

import android.view.View;
import androidx.fragment.app.Fragment;

/* compiled from: Fragment */
public class d extends k {
    public final /* synthetic */ Fragment a;

    public d(Fragment fragment) {
        this.a = fragment;
    }

    public View a(int i2) {
        View view = this.a.K;
        if (view != null) {
            return view.findViewById(i2);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    public boolean d() {
        return this.a.K != null;
    }
}
