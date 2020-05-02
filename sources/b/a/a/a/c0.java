package b.a.a.a;

import android.os.Bundle;
import android.view.View;
import b.a.a.e;
import b.a.a.l.b;
import b.a.a.l.d;
import b.a.a.l.g0;
import com.google.android.material.textfield.TextInputLayout;
import i.a.a.a.a;
import n.m.c.f;

/* compiled from: LoginBottomSheet.kt */
public final class c0 implements g0 {
    public final /* synthetic */ b0 a;

    public c0(b0 b0Var) {
        this.a = b0Var;
    }

    public void a(Exception exc, d dVar) {
        String str;
        if (dVar == null) {
            f.a("authError");
            throw null;
        } else if (this.a.t()) {
            View rootView = b0.a(this.a).getRootView();
            f.a((Object) rootView, "contentView.rootView");
            TextInputLayout textInputLayout = (TextInputLayout) a.a(rootView, e.phone_number_validation_layout, "contentView.rootView.pho…_number_validation_layout", "contentView.rootView.pho…alidation_layout.rootView").findViewById(e.otp_layout);
            if (textInputLayout != null) {
                textInputLayout.setError(i.c.d.p.e.a(this.a.k(), dVar.a));
            }
            if (exc == null || (str = exc.getLocalizedMessage()) == null) {
                str = this.a.a(dVar.a);
            }
            b.a("getOtpFailed", "loginScreen", str, (Bundle) null, 8);
        }
    }

    public void a() {
        if (this.a.t()) {
            this.a.J().start();
        }
    }
}
