package h.b.p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.TextView;
import g.a.a.b.a;
import h.h.n.b;
import h.h.n.e;

/* compiled from: AppCompatButton */
public class f extends Button implements b, e {
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final y f1384f;

    public f(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.e;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1384f;
        if (yVar != null) {
            yVar.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f1384f;
        if (yVar != null) {
            return Math.round(yVar.f1497i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f1384f;
        if (yVar != null) {
            return Math.round(yVar.f1497i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f1384f;
        if (yVar != null) {
            return Math.round(yVar.f1497i.c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f1384f;
        return yVar != null ? yVar.f1497i.f1351f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.a) {
            y yVar = this.f1384f;
            if (yVar != null) {
                return yVar.f1497i.a;
            }
            return 0;
        } else if (super.getAutoSizeTextType() == 1) {
            return 1;
        } else {
            return 0;
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

    public ColorStateList getSupportCompoundDrawablesTintList() {
        v0 v0Var = this.f1384f.f1496h;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        v0 v0Var = this.f1384f.f1496h;
        if (v0Var != null) {
            return v0Var.f1477b;
        }
        return null;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        y yVar = this.f1384f;
        if (yVar != null && !b.a) {
            yVar.f1497i.a();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        y yVar = this.f1384f;
        if (yVar != null && !b.a && yVar.b()) {
            this.f1384f.f1497i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        y yVar = this.f1384f;
        if (yVar != null) {
            yVar.a(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        y yVar = this.f1384f;
        if (yVar != null) {
            yVar.a(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        y yVar = this.f1384f;
        if (yVar != null) {
            yVar.a(i2);
        }
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

    public void setSupportAllCaps(boolean z) {
        y yVar = this.f1384f;
        if (yVar != null) {
            yVar.a.setAllCaps(z);
        }
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

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f1384f.a(colorStateList);
        this.f1384f.a();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1384f.a(mode);
        this.f1384f.a();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1384f;
        if (yVar != null) {
            yVar.a(context, i2);
        }
    }

    public void setTextSize(int i2, float f2) {
        boolean z = b.a;
        if (z) {
            super.setTextSize(i2, f2);
            return;
        }
        y yVar = this.f1384f;
        if (yVar != null && !z && !yVar.b()) {
            yVar.f1497i.a(i2, f2);
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.buttonStyle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        u0.a(context);
        s0.a((View) this, getContext());
        e eVar = new e(this);
        this.e = eVar;
        eVar.a(attributeSet, i2);
        y yVar = new y(this);
        this.f1384f = yVar;
        yVar.a(attributeSet, i2);
        this.f1384f.a();
    }
}
