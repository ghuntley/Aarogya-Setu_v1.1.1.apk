package i.c.a.c.h0;

import android.text.Editable;
import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import i.c.a.c.e;
import i.c.a.c.i;

/* compiled from: PasswordToggleEndIconDelegate */
public class q extends n {
    public final TextWatcher d = new a();
    public final TextInputLayout.f e = new b();

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.g f4143f = new c(this);

    /* compiled from: PasswordToggleEndIconDelegate */
    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            q qVar = q.this;
            qVar.c.setChecked(!q.a(qVar));
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    public class b implements TextInputLayout.f {
        public b() {
        }

        public void a(TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(true);
            q qVar = q.this;
            qVar.c.setChecked(!q.a(qVar));
            editText.removeTextChangedListener(q.this.d);
            editText.addTextChangedListener(q.this.d);
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    public class c implements TextInputLayout.g {
        public c(q qVar) {
        }

        public void a(TextInputLayout textInputLayout, int i2) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i2 == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    /* compiled from: PasswordToggleEndIconDelegate */
    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            EditText editText = q.this.a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (q.a(q.this)) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
            }
        }
    }

    public q(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public void a() {
        this.a.setEndIconDrawable(h.b.l.a.a.c(this.f4128b, e.design_password_eye));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.password_toggle_content_description));
        this.a.setEndIconOnClickListener(new d());
        this.a.a(this.e);
        this.a.j0.add(this.f4143f);
        EditText editText = this.a.getEditText();
        if (editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    public static /* synthetic */ boolean a(q qVar) {
        EditText editText = qVar.a.getEditText();
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }
}
