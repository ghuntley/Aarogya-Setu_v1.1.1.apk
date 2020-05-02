package b.a.a.a;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import b.a.a.e;
import b.a.a.l.b;
import b.a.a.l.d;
import b.a.a.l.g0;
import com.google.android.material.textfield.TextInputLayout;
import i.a.a.a.a;
import n.m.c.f;

/* compiled from: LoginBottomSheet.kt */
public final class d0 implements g0 {
    public final /* synthetic */ b0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f416b;

    public d0(b0 b0Var, String str) {
        this.a = b0Var;
        this.f416b = str;
    }

    public void a(Exception exc, d dVar) {
        String str;
        if (dVar == null) {
            f.a("authError");
            throw null;
        } else if (this.a.t()) {
            View rootView = b0.a(this.a).getRootView();
            f.a((Object) rootView, "contentView.rootView");
            ProgressBar progressBar = (ProgressBar) a.a(rootView, e.phone_number_validation_layout, "contentView.rootView.pho…_number_validation_layout", "contentView.rootView.pho…alidation_layout.rootView").findViewById(e.progress_bar);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            View rootView2 = b0.a(this.a).getRootView();
            f.a((Object) rootView2, "contentView.rootView");
            TextInputLayout textInputLayout = (TextInputLayout) a.a(rootView2, e.phone_number_validation_layout, "contentView.rootView.pho…_number_validation_layout", "contentView.rootView.pho…alidation_layout.rootView").findViewById(e.phone_number_layout);
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
            b.a.a.m.a b2 = b0.b(this.a);
            String str = this.f416b;
            if (str != null) {
                b2.e = str;
                b0.b(this.a).c.b(true);
                b0.b(this.a).d.b(false);
                this.a.J().start();
                return;
            }
            f.a("<set-?>");
            throw null;
        }
    }
}
