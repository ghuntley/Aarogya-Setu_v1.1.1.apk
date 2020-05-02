package i.c.a.c.h0;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: EndIconDelegate */
public abstract class n {
    public TextInputLayout a;

    /* renamed from: b  reason: collision with root package name */
    public Context f4128b;
    public CheckableImageButton c;

    public n(TextInputLayout textInputLayout) {
        this.a = textInputLayout;
        this.f4128b = textInputLayout.getContext();
        this.c = textInputLayout.getEndIconView();
    }

    public abstract void a();

    public void a(boolean z) {
    }

    public boolean a(int i2) {
        return true;
    }

    public boolean b() {
        return false;
    }
}
