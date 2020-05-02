package b.a.a.a;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.widget.ProgressBar;
import b.a.a.e;
import b.a.a.l.d;
import b.a.a.l.h0;
import b.a.a.l.o;
import b.a.a.m.b;
import com.google.android.material.textfield.TextInputLayout;
import i.a.a.a.a;
import n.m.c.f;

/* compiled from: LoginBottomSheet.kt */
public final class f0 implements h0 {
    public final /* synthetic */ b0 a;

    public f0(b0 b0Var) {
        this.a = b0Var;
    }

    public void a(String str) {
        if (this.a.t()) {
            ProgressBar progressBar = (ProgressBar) a.a(b0.a(this.a), e.otp_validation_layout, "contentView.otp_validation_layout", "contentView.otp_validation_layout.rootView").findViewById(e.progress_bar_otp);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            if (o.f436b.b()) {
                BluetoothAdapter.getDefaultAdapter().startDiscovery();
            }
            this.a.H();
            b bVar = this.a.o0;
            if (bVar != null) {
                bVar.c.b(true);
            } else {
                f.b("onBoardingViewModel");
                throw null;
            }
        }
    }

    public void a(Exception exc, d dVar) {
        String str;
        if (dVar == null) {
            f.a("authError");
            throw null;
        } else if (this.a.t()) {
            ProgressBar progressBar = (ProgressBar) a.a(b0.a(this.a), e.otp_validation_layout, "contentView.otp_validation_layout", "contentView.otp_validation_layout.rootView").findViewById(e.progress_bar_otp);
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
            TextInputLayout textInputLayout = (TextInputLayout) a.a(b0.a(this.a), e.otp_validation_layout, "contentView.otp_validation_layout", "contentView.otp_validation_layout.rootView").findViewById(e.otp_layout);
            if (textInputLayout != null) {
                textInputLayout.setErrorEnabled(true);
            }
            TextInputLayout textInputLayout2 = (TextInputLayout) a.a(b0.a(this.a), e.otp_validation_layout, "contentView.otp_validation_layout", "contentView.otp_validation_layout.rootView").findViewById(e.otp_layout);
            if (textInputLayout2 != null) {
                textInputLayout2.setError(i.c.d.p.e.a(this.a.k(), dVar.a));
            }
            if (exc == null || (str = exc.getLocalizedMessage()) == null) {
                str = this.a.a(dVar.a);
            }
            b.a.a.l.b.a("validateOtpFailed", "loginScreen", str, (Bundle) null, 8);
        }
    }
}
