package h.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import g.a.a.b.a;

/* compiled from: AppCompatEditText */
public class k extends EditText {
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final y f1427f;

    /* renamed from: g  reason: collision with root package name */
    public final x f1428g;

    public k(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.e;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1427f;
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

    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1428g) == null) {
            return super.getTextClassifier();
        }
        return xVar.a();
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
        y yVar = this.f1427f;
        if (yVar != null) {
            yVar.a(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1428g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.f1491b = textClassifier;
        }
    }

    public k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.editTextStyle);
    }

    public Editable getText() {
        if (Build.VERSION.SDK_INT >= 28) {
            return super.getText();
        }
        return super.getEditableText();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        u0.a(context);
        s0.a((View) this, getContext());
        e eVar = new e(this);
        this.e = eVar;
        eVar.a(attributeSet, i2);
        y yVar = new y(this);
        this.f1427f = yVar;
        yVar.a(attributeSet, i2);
        this.f1427f.a();
        this.f1428g = new x(this);
    }
}
