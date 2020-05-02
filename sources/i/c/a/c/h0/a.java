package i.c.a.c.h0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import i.c.a.c.e;
import i.c.a.c.i;

/* compiled from: ClearTextEndIconDelegate */
public class a extends n {
    public final TextWatcher d = new C0118a();
    public final TextInputLayout.f e = new b();

    /* renamed from: f  reason: collision with root package name */
    public AnimatorSet f4115f;

    /* renamed from: g  reason: collision with root package name */
    public ValueAnimator f4116g;

    /* renamed from: i.c.a.c.h0.a$a  reason: collision with other inner class name */
    /* compiled from: ClearTextEndIconDelegate */
    public class C0118a implements TextWatcher {
        public C0118a() {
        }

        public void afterTextChanged(Editable editable) {
            if (a.this.a.getSuffixText() == null) {
                a.this.b(editable.length() > 0);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    public class b implements TextInputLayout.f {

        /* renamed from: i.c.a.c.h0.a$b$a  reason: collision with other inner class name */
        /* compiled from: ClearTextEndIconDelegate */
        public class C0119a implements View.OnFocusChangeListener {
            public C0119a() {
            }

            public void onFocusChange(View view, boolean z) {
                boolean z2 = true;
                boolean z3 = !TextUtils.isEmpty(((EditText) view).getText());
                a aVar = a.this;
                if (!z3 || !z) {
                    z2 = false;
                }
                aVar.b(z2);
            }
        }

        public b() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(editText.getText().length() > 0);
            textInputLayout.setEndIconCheckable(false);
            editText.setOnFocusChangeListener(new C0119a());
            editText.removeTextChangedListener(a.this.d);
            editText.addTextChangedListener(a.this.d);
        }
    }

    /* compiled from: ClearTextEndIconDelegate */
    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            a.this.a.getEditText().setText((CharSequence) null);
        }
    }

    public a(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public void a() {
        this.a.setEndIconDrawable(h.b.l.a.a.c(this.f4128b, e.mtrl_ic_cancel));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.clear_text_end_icon_content_description));
        this.a.setEndIconOnClickListener(new c());
        this.a.a(this.e);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(i.c.a.c.l.a.d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new e(this));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat2.setInterpolator(i.c.a.c.l.a.a);
        ofFloat2.setDuration(100);
        ofFloat2.addUpdateListener(new d(this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4115f = animatorSet;
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
        this.f4115f.addListener(new b(this));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat3.setInterpolator(i.c.a.c.l.a.a);
        ofFloat3.setDuration(100);
        ofFloat3.addUpdateListener(new d(this));
        this.f4116g = ofFloat3;
        ofFloat3.addListener(new c(this));
    }

    public final void b(boolean z) {
        boolean z2 = this.a.g() == z;
        if (z) {
            this.f4116g.cancel();
            this.f4115f.start();
            if (z2) {
                this.f4115f.end();
                return;
            }
            return;
        }
        this.f4115f.cancel();
        this.f4116g.start();
        if (z2) {
            this.f4116g.end();
        }
    }

    public void a(boolean z) {
        if (this.a.getSuffixText() != null) {
            b(z);
        }
    }
}
