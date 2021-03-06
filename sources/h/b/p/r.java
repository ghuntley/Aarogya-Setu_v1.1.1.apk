package h.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RadioButton;
import h.b.l.a.a;

/* compiled from: AppCompatRadioButton */
public class r extends RadioButton {
    public final i e;

    /* renamed from: f  reason: collision with root package name */
    public final e f1463f;

    /* renamed from: g  reason: collision with root package name */
    public final y f1464g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        u0.a(context);
        s0.a((View) this, getContext());
        i iVar = new i(this);
        this.e = iVar;
        iVar.a(attributeSet, i2);
        e eVar = new e(this);
        this.f1463f = eVar;
        eVar.a(attributeSet, i2);
        y yVar = new y(this);
        this.f1464g = yVar;
        yVar.a(attributeSet, i2);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1463f;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1464g;
        if (yVar != null) {
            yVar.a();
        }
    }

    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        i iVar = this.e;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1463f;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1463f;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        i iVar = this.e;
        if (iVar != null) {
            return iVar.f1409b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        i iVar = this.e;
        if (iVar != null) {
            return iVar.c;
        }
        return null;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1463f;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.f1463f;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        i iVar = this.e;
        if (iVar == null) {
            return;
        }
        if (iVar.f1410f) {
            iVar.f1410f = false;
            return;
        }
        iVar.f1410f = true;
        iVar.a();
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.f1463f;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.f1463f;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        i iVar = this.e;
        if (iVar != null) {
            iVar.f1409b = colorStateList;
            iVar.d = true;
            iVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        i iVar = this.e;
        if (iVar != null) {
            iVar.c = mode;
            iVar.e = true;
            iVar.a();
        }
    }

    public void setButtonDrawable(int i2) {
        setButtonDrawable(a.c(getContext(), i2));
    }
}
