package h.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import g.a.a.b.a;

/* compiled from: AppCompatAutoCompleteTextView */
public class d extends AutoCompleteTextView {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1379g = {16843126};
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final y f1380f;

    public d(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.e;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1380f;
        if (yVar != null) {
            yVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.e;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.e;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.a((TextView) this, callback));
    }

    public void setDropDownBackgroundResource(int i2) {
        setDropDownBackgroundDrawable(h.b.l.a.a.c(getContext(), i2));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1380f;
        if (yVar != null) {
            yVar.a(context, i2);
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.autoCompleteTextViewStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        u0.a(context);
        s0.a((View) this, getContext());
        x0 a = x0.a(getContext(), attributeSet, f1379g, i2, 0);
        if (a.f(0)) {
            setDropDownBackgroundDrawable(a.b(0));
        }
        a.f1492b.recycle();
        e eVar = new e(this);
        this.e = eVar;
        eVar.a(attributeSet, i2);
        y yVar = new y(this);
        this.f1380f = yVar;
        yVar.a(attributeSet, i2);
        this.f1380f.a();
    }
}
