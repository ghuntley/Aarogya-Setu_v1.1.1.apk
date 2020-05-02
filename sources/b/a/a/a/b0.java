package b.a.a.a;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import b.a.a.l.o;
import com.crashlytics.android.answers.ContentViewEvent;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import h.o.a0;
import i.c.a.b.d.d;
import i.c.a.b.d.k.h.j0;
import i.c.a.b.d.k.h.k0;
import i.c.a.b.d.k.h.n;
import i.c.a.b.d.l.q;
import i.c.a.b.g.b.j;
import i.c.a.b.l.d0;
import i.c.a.c.p.c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.TypeCastException;
import n.m.c.f;
import n.m.c.g;
import n.m.c.h;
import n.m.c.i;
import n.m.c.k;
import n.o.e;
import nic.goi.aarogyasetu.R;
import nic.goi.aarogyasetu.models.network.ValidateOTP;
import nic.goi.aarogyasetu.utility.SmsReceiver;
import q.e0;

/* compiled from: LoginBottomSheet.kt */
public final class b0 extends c implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final /* synthetic */ e[] u0;
    public View n0;
    public b.a.a.m.b o0;
    public b.a.a.m.a p0;
    public BottomSheetBehavior<View> q0;
    public SmsReceiver r0;
    public final n.b s0 = i.c.d.p.e.a(new b(this));
    public SmsReceiver.a t0 = new a(this);

    /* compiled from: LoginBottomSheet.kt */
    public static final class a implements SmsReceiver.a {
        public final /* synthetic */ b0 a;

        public a(b0 b0Var) {
            this.a = b0Var;
        }

        public void a() {
        }

        public void a(String str) {
            if (!(str == null || str.length() == 0)) {
                try {
                    View rootView = b0.a(this.a).getRootView();
                    f.a((Object) rootView, "contentView.rootView");
                    View findViewById = rootView.findViewById(b.a.a.e.otp_validation_layout);
                    f.a((Object) findViewById, "contentView.rootView.otp_validation_layout");
                    View rootView2 = findViewById.getRootView();
                    f.a((Object) rootView2, "contentView.rootView.otp…alidation_layout.rootView");
                    TextInputLayout textInputLayout = (TextInputLayout) rootView2.findViewById(b.a.a.e.otp_layout);
                    f.a((Object) textInputLayout, "contentView.rootView.otp…ayout.rootView.otp_layout");
                    EditText editText = textInputLayout.getEditText();
                    if (editText != null) {
                        editText.setText(str);
                    }
                    View rootView3 = b0.a(this.a).getRootView();
                    f.a((Object) rootView3, "contentView.rootView");
                    View findViewById2 = rootView3.findViewById(b.a.a.e.otp_validation_layout);
                    f.a((Object) findViewById2, "contentView.rootView.otp_validation_layout");
                    View rootView4 = findViewById2.getRootView();
                    f.a((Object) rootView4, "contentView.rootView.otp…alidation_layout.rootView");
                    TextInputLayout textInputLayout2 = (TextInputLayout) rootView4.findViewById(b.a.a.e.otp_layout);
                    f.a((Object) textInputLayout2, "contentView.rootView.otp…ayout.rootView.otp_layout");
                    EditText editText2 = textInputLayout2.getEditText();
                    if (editText2 != null) {
                        editText2.setSelection(str.length());
                    }
                } catch (Exception unused) {
                }
                b0.a(this.a, str);
            }
        }
    }

    /* compiled from: LoginBottomSheet.kt */
    public static final class b extends g implements n.m.b.a<g0> {
        public final /* synthetic */ b0 e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(b0 b0Var) {
            super(0);
            this.e = b0Var;
        }

        public Object invoke() {
            return new g0(this, TimeUnit.MINUTES.toMillis(2), 1000);
        }
    }

    static {
        i iVar = new i(k.a(b0.class), "timer", "getTimer()Landroid/os/CountDownTimer;");
        k.a((h) iVar);
        u0 = new e[]{iVar};
    }

    public static final /* synthetic */ View a(b0 b0Var) {
        View view = b0Var.n0;
        if (view != null) {
            return view;
        }
        f.b(ContentViewEvent.TYPE);
        throw null;
    }

    public static final /* synthetic */ b.a.a.m.a b(b0 b0Var) {
        b.a.a.m.a aVar = b0Var.p0;
        if (aVar != null) {
            return aVar;
        }
        f.b("phoneNumberValidationViewModel");
        throw null;
    }

    public final CountDownTimer J() {
        n.b bVar = this.s0;
        e eVar = u0[0];
        return (CountDownTimer) bVar.getValue();
    }

    public void onGlobalLayout() {
        Rect rect = new Rect();
        View view = this.n0;
        if (view != null) {
            view.getWindowVisibleDisplayFrame(rect);
            View view2 = this.n0;
            if (view2 != null) {
                View rootView = view2.getRootView();
                f.a((Object) rootView, "contentView.rootView");
                int height = rootView.getHeight();
                int i2 = height - (rect.bottom - rect.top);
                BottomSheetBehavior<View> bottomSheetBehavior = this.q0;
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.b(height + i2);
                    View view3 = this.n0;
                    if (view3 != null) {
                        view3.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    } else {
                        f.b(ContentViewEvent.TYPE);
                        throw null;
                    }
                } else {
                    f.b("bottomSheetBehavior");
                    throw null;
                }
            } else {
                f.b(ContentViewEvent.TYPE);
                throw null;
            }
        } else {
            f.b(ContentViewEvent.TYPE);
            throw null;
        }
    }

    public void y() {
        super.y();
        J().cancel();
        if (this.r0 != null) {
            Context k2 = k();
            if (k2 != null) {
                k2.unregisterReceiver(this.r0);
            }
            this.r0 = null;
        }
    }

    public View a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (layoutInflater != null) {
            h.l.d.e f2 = f();
            if (f2 != null) {
                a0 a2 = new h.o.b0(f2).a(b.a.a.m.b.class);
                f.a((Object) a2, "ViewModelProvider(activi…ingViewModel::class.java)");
                this.o0 = (b.a.a.m.b) a2;
                Context k2 = k();
                if (k2 != null) {
                    i.c.a.b.g.b.h hVar = new i.c.a.b.g.b.h(k2);
                    f.a((Object) hVar, "SmsRetriever.getClient(context!!)");
                    n.a aVar = new n.a((j0) null);
                    aVar.a = new j(hVar);
                    aVar.c = new d[]{i.c.a.b.g.b.b.f3176b};
                    q.a(true, (Object) "execute parameter required");
                    i.c.a.b.l.g a3 = hVar.a(1, new k0(aVar, aVar.c, aVar.f3076b));
                    f.a((Object) a3, "smsRetrieverClient.startSmsRetriever()");
                    d0 d0Var = (d0) a3;
                    d0Var.a(i.c.a.b.l.i.a, new z(this));
                    d0Var.a(i.c.a.b.l.i.a, (i.c.a.b.l.d) new a0(this));
                    return null;
                }
                f.a();
                throw null;
            }
            f.a();
            throw null;
        }
        f.a("inflater");
        throw null;
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        a(0, (int) R.style.MyDialogStyle);
    }

    @SuppressLint({"RestrictedApi"})
    public void a(Dialog dialog, int i2) {
        if (dialog != null) {
            super.a(dialog, i2);
            View inflate = View.inflate(k(), R.layout.fragment_login_bottom_sheet, (ViewGroup) null);
            f.a((Object) inflate, "View.inflate(context, R.…login_bottom_sheet, null)");
            this.n0 = inflate;
            a0 a2 = new h.o.b0(this).a(b.a.a.m.a.class);
            f.a((Object) a2, "ViewModelProvider(this).…eetViewModel::class.java)");
            this.p0 = (b.a.a.m.a) a2;
            View view = this.n0;
            if (view != null) {
                dialog.setContentView(view);
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setBackgroundDrawable(new ColorDrawable(0));
                }
                Window window2 = dialog.getWindow();
                if (window2 != null) {
                    window2.setSoftInputMode(16);
                }
                dialog.setCanceledOnTouchOutside(false);
                View view2 = this.n0;
                if (view2 != null) {
                    ViewParent parent = view2.getParent();
                    if (parent != null) {
                        BottomSheetBehavior<View> b2 = BottomSheetBehavior.b((View) parent);
                        f.a((Object) b2, "BottomSheetBehavior.from…ntentView.parent as View)");
                        this.q0 = b2;
                        View view3 = this.n0;
                        if (view3 != null) {
                            view3.getViewTreeObserver().addOnGlobalLayoutListener(this);
                            View view4 = this.n0;
                            if (view4 != null) {
                                View rootView = view4.getRootView();
                                f.a((Object) rootView, "rootView");
                                TextView textView = (TextView) i.a.a.a.a.a(rootView, b.a.a.e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(b.a.a.e.title);
                                f.a((Object) textView, "rootView.phone_number_va…ion_layout.rootView.title");
                                textView.setText(i.c.d.p.e.a(k(), (int) R.string.enter_mobile_number));
                                TextInputLayout textInputLayout = (TextInputLayout) i.a.a.a.a.a(rootView, b.a.a.e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(b.a.a.e.phone_number_layout);
                                f.a((Object) textInputLayout, "rootView.phone_number_va…tView.phone_number_layout");
                                textInputLayout.setHint(i.c.d.p.e.a(k(), (int) R.string.mobile_number));
                                TextInputLayout textInputLayout2 = (TextInputLayout) i.a.a.a.a.a(rootView, b.a.a.e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(b.a.a.e.phone_number_layout);
                                f.a((Object) textInputLayout2, "rootView.phone_number_va…tView.phone_number_layout");
                                textInputLayout2.setPrefixText(i.c.d.p.e.a(k(), (int) R.string.country_code));
                                TextView textView2 = (TextView) i.a.a.a.a.a(rootView, b.a.a.e.otp_validation_layout, "rootView.otp_validation_layout", "rootView.otp_validation_layout.rootView").findViewById(b.a.a.e.otptitleView);
                                f.a((Object) textView2, "rootView.otp_validation_…out.rootView.otptitleView");
                                textView2.setText(i.c.d.p.e.a(k(), (int) R.string.enter_otp));
                                TextInputLayout textInputLayout3 = (TextInputLayout) i.a.a.a.a.a(rootView, b.a.a.e.otp_validation_layout, "rootView.otp_validation_layout", "rootView.otp_validation_layout.rootView").findViewById(b.a.a.e.otp_layout);
                                f.a((Object) textInputLayout3, "rootView.otp_validation_layout.rootView.otp_layout");
                                textInputLayout3.setHelperText(i.c.d.p.e.a(k(), (int) R.string.we_have_sent_otp));
                                TextInputLayout textInputLayout4 = (TextInputLayout) i.a.a.a.a.a(rootView, b.a.a.e.otp_validation_layout, "rootView.otp_validation_layout", "rootView.otp_validation_layout.rootView").findViewById(b.a.a.e.otp_layout);
                                f.a((Object) textInputLayout4, "rootView.otp_validation_layout.rootView.otp_layout");
                                textInputLayout4.setHint(i.c.d.p.e.a(k(), (int) R.string.otp));
                                TextView textView3 = (TextView) i.a.a.a.a.a(rootView, b.a.a.e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(b.a.a.e.why_needed);
                                f.a((Object) textView3, "rootView.phone_number_va…ayout.rootView.why_needed");
                                textView3.setText(i.c.d.p.e.a(k(), (int) R.string.why_is_it_needed));
                                ((TextView) i.a.a.a.a.a(rootView, b.a.a.e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(b.a.a.e.why_needed)).setOnClickListener(new c(0, this));
                                ((TextInputEditText) i.a.a.a.a.a(rootView, b.a.a.e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(b.a.a.e.phone_num)).requestFocus();
                                ((Button) i.a.a.a.a.a(rootView, b.a.a.e.otp_validation_layout, "rootView.otp_validation_layout", "rootView.otp_validation_layout.rootView").findViewById(b.a.a.e.retry_otp)).setOnClickListener(new d(0, this, rootView));
                                Button button = (Button) i.a.a.a.a.a(rootView, b.a.a.e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(b.a.a.e.validate_phone);
                                f.a((Object) button, "rootView.phone_number_va…t.rootView.validate_phone");
                                button.setText(i.c.d.p.e.a(k(), (int) R.string.submit));
                                ((Button) i.a.a.a.a.a(rootView, b.a.a.e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(b.a.a.e.validate_phone)).setOnClickListener(new d(1, this, rootView));
                                ((ImageView) i.a.a.a.a.a(rootView, b.a.a.e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(b.a.a.e.back)).setOnClickListener(new d(2, this, rootView));
                                Button button2 = (Button) i.a.a.a.a.a(rootView, b.a.a.e.otp_validation_layout, "rootView.otp_validation_layout", "rootView.otp_validation_layout.rootView").findViewById(b.a.a.e.validate_otp);
                                f.a((Object) button2, "rootView.otp_validation_…out.rootView.validate_otp");
                                button2.setText(i.c.d.p.e.a(k(), (int) R.string.submit));
                                ((Button) i.a.a.a.a.a(rootView, b.a.a.e.otp_validation_layout, "rootView.otp_validation_layout", "rootView.otp_validation_layout.rootView").findViewById(b.a.a.e.validate_otp)).setOnClickListener(new d(3, this, rootView));
                                ((ImageView) i.a.a.a.a.a(rootView, b.a.a.e.phone_number_validation_layout, "rootView.phone_number_validation_layout", "rootView.phone_number_validation_layout.rootView").findViewById(b.a.a.e.close)).setOnClickListener(new c(1, this));
                                h.l.d.e f2 = f();
                                if (f2 != null) {
                                    b.a.a.m.a aVar = this.p0;
                                    if (aVar != null) {
                                        aVar.c.a(f2, new e0(this, rootView));
                                    } else {
                                        f.b("phoneNumberValidationViewModel");
                                        throw null;
                                    }
                                }
                            } else {
                                f.b(ContentViewEvent.TYPE);
                                throw null;
                            }
                        } else {
                            f.b(ContentViewEvent.TYPE);
                            throw null;
                        }
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type android.view.View");
                    }
                } else {
                    f.b(ContentViewEvent.TYPE);
                    throw null;
                }
            } else {
                f.b(ContentViewEvent.TYPE);
                throw null;
            }
        } else {
            f.a("dialog");
            throw null;
        }
    }

    public static final /* synthetic */ void a(b0 b0Var, String str) {
        if (b0Var == null) {
            throw null;
        } else if (o.f436b.g(b0Var.k())) {
            if (!(str == null || str.length() == 0)) {
                View view = b0Var.n0;
                if (view != null) {
                    View rootView = view.getRootView();
                    f.a((Object) rootView, "contentView.rootView");
                    TextInputLayout textInputLayout = (TextInputLayout) i.a.a.a.a.a(rootView, b.a.a.e.otp_validation_layout, "contentView.rootView.otp_validation_layout", "contentView.rootView.otp…alidation_layout.rootView").findViewById(b.a.a.e.otp_layout);
                    if (textInputLayout != null) {
                        textInputLayout.setErrorEnabled(true);
                    }
                    View view2 = b0Var.n0;
                    if (view2 != null) {
                        View rootView2 = view2.getRootView();
                        f.a((Object) rootView2, "contentView.rootView");
                        TextInputLayout textInputLayout2 = (TextInputLayout) i.a.a.a.a.a(rootView2, b.a.a.e.otp_validation_layout, "contentView.rootView.otp_validation_layout", "contentView.rootView.otp…alidation_layout.rootView").findViewById(b.a.a.e.otp_layout);
                        if (textInputLayout2 != null) {
                            textInputLayout2.setError("");
                        }
                        b.a.a.l.b.a("validateOtp", "loginScreen", (String) null, (Bundle) null, 12);
                        View view3 = b0Var.n0;
                        if (view3 != null) {
                            ProgressBar progressBar = (ProgressBar) i.a.a.a.a.a(view3, b.a.a.e.otp_validation_layout, "contentView.otp_validation_layout", "contentView.otp_validation_layout.rootView").findViewById(b.a.a.e.progress_bar_otp);
                            if (progressBar != null) {
                                progressBar.setVisibility(0);
                            }
                            b.a.a.l.h hVar = b.a.a.l.h.c;
                            b.a.a.m.a aVar = b0Var.p0;
                            if (aVar != null) {
                                String str2 = aVar.e;
                                f0 f0Var = new f0(b0Var);
                                if (str2 == null) {
                                    f.a("mobile");
                                    throw null;
                                } else if (str != null) {
                                    e0 a2 = i.c.d.p.e.a(false, true, true, "https://api.swaraksha.gov.in/", false);
                                    ValidateOTP validateOTP = new ValidateOTP(str2, str);
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    linkedHashMap.put("x-api-key", "ykixqE5H352HalBW4MNvI7HGJBXreLFx1APCkqEl");
                                    linkedHashMap.put("os", String.valueOf(Build.VERSION.SDK_INT));
                                    linkedHashMap.put("device-type", Build.MANUFACTURER + "-" + Build.MODEL);
                                    ((b.a.a.j.c) a2.a(b.a.a.j.c.class)).a((Map<String, String>) linkedHashMap, validateOTP).a(new b.a.a.l.j(f0Var, str2));
                                } else {
                                    f.a("otp");
                                    throw null;
                                }
                            } else {
                                f.b("phoneNumberValidationViewModel");
                                throw null;
                            }
                        } else {
                            f.b(ContentViewEvent.TYPE);
                            throw null;
                        }
                    } else {
                        f.b(ContentViewEvent.TYPE);
                        throw null;
                    }
                } else {
                    f.b(ContentViewEvent.TYPE);
                    throw null;
                }
            } else {
                Toast.makeText(b0Var.k(), b0Var.p().getString(R.string.please_enter_a_valid_otp), 0).show();
            }
        } else {
            Toast.makeText(b0Var.k(), i.c.d.p.e.a(b0Var.k(), (int) R.string.error_network_error), 0).show();
        }
    }
}
