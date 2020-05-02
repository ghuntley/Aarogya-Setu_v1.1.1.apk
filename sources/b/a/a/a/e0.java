package b.a.a.a;

import android.view.View;
import android.widget.ProgressBar;
import b.a.a.e;
import com.google.android.material.textfield.TextInputLayout;
import h.o.s;
import i.a.a.a.a;
import n.m.c.f;

/* compiled from: LoginBottomSheet.kt */
public final class e0<T> implements s<Boolean> {
    public final /* synthetic */ View a;

    public e0(b0 b0Var, View view) {
        this.a = view;
    }

    public void a(Object obj) {
        Boolean bool = (Boolean) obj;
        View view = this.a;
        f.a((Object) view, "rootView");
        ProgressBar progressBar = (ProgressBar) a.a(view, e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(e.progress_bar);
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        f.a((Object) bool, "it");
        if (bool.booleanValue()) {
            View view2 = this.a;
            f.a((Object) view2, "rootView");
            ((TextInputLayout) a.a(view2, e.otp_validation_layout, "rootView.otp_validation_layout", "rootView.otp_validation_layout.rootView").findViewById(e.otp_layout)).requestFocus();
            View view3 = this.a;
            f.a((Object) view3, "rootView");
            View findViewById = a.a(view3, e.otp_validation_layout, "rootView.otp_validation_layout", "rootView.otp_validation_layout.rootView").findViewById(e.otp_validation_layout);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            View view4 = this.a;
            f.a((Object) view4, "rootView");
            View findViewById2 = view4.findViewById(e.phone_number_validation_layout);
            if (findViewById2 != null) {
                findViewById2.setVisibility(8);
                return;
            }
            return;
        }
        View view5 = this.a;
        f.a((Object) view5, "rootView");
        View findViewById3 = a.a(view5, e.otp_validation_layout, "rootView.otp_validation_layout", "rootView.otp_validation_layout.rootView").findViewById(e.otp_validation_layout);
        if (findViewById3 != null) {
            findViewById3.setVisibility(8);
        }
        View view6 = this.a;
        f.a((Object) view6, "rootView");
        View findViewById4 = a.a(view6, e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(e.phone_number_validation_layout);
        if (findViewById4 != null) {
            findViewById4.setVisibility(0);
        }
    }
}
