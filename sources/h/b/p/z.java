package h.b.p;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import g.a.a.b.a;
import h.h.g.c;
import h.h.k.b;
import h.h.n.b;
import h.h.n.e;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* compiled from: AppCompatTextView */
public class z extends TextView implements e, b {
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final y f1504f;

    /* renamed from: g  reason: collision with root package name */
    public final x f1505g;

    /* renamed from: h  reason: collision with root package name */
    public Future<h.h.k.b> f1506h;

    public z(Context context) {
        this(context, (AttributeSet) null);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.e;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1504f;
        if (yVar != null) {
            yVar.a();
        }
    }

    public int getAutoSizeMaxTextSize() {
        if (b.a) {
            return super.getAutoSizeMaxTextSize();
        }
        y yVar = this.f1504f;
        if (yVar != null) {
            return Math.round(yVar.f1497i.e);
        }
        return -1;
    }

    public int getAutoSizeMinTextSize() {
        if (b.a) {
            return super.getAutoSizeMinTextSize();
        }
        y yVar = this.f1504f;
        if (yVar != null) {
            return Math.round(yVar.f1497i.d);
        }
        return -1;
    }

    public int getAutoSizeStepGranularity() {
        if (b.a) {
            return super.getAutoSizeStepGranularity();
        }
        y yVar = this.f1504f;
        if (yVar != null) {
            return Math.round(yVar.f1497i.c);
        }
        return -1;
    }

    public int[] getAutoSizeTextAvailableSizes() {
        if (b.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        y yVar = this.f1504f;
        return yVar != null ? yVar.f1497i.f1351f : new int[0];
    }

    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (!b.a) {
            y yVar = this.f1504f;
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

    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
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
        v0 v0Var = this.f1504f.f1496h;
        if (v0Var != null) {
            return v0Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        v0 v0Var = this.f1504f.f1496h;
        if (v0Var != null) {
            return v0Var.f1477b;
        }
        return null;
    }

    public CharSequence getText() {
        Future<h.h.k.b> future = this.f1506h;
        if (future != null) {
            try {
                this.f1506h = null;
                a.a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    public TextClassifier getTextClassifier() {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1505g) == null) {
            return super.getTextClassifier();
        }
        return xVar.a();
    }

    public b.a getTextMetricsParamsCompat() {
        return a.a((TextView) this);
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        y yVar = this.f1504f;
        if (yVar != null && !h.h.n.b.a) {
            yVar.f1497i.a();
        }
    }

    public void onMeasure(int i2, int i3) {
        Future<h.h.k.b> future = this.f1506h;
        if (future != null) {
            try {
                this.f1506h = null;
                a.a((TextView) this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i2, i3);
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        y yVar = this.f1504f;
        if (yVar != null && !h.h.n.b.a && yVar.b()) {
            this.f1504f.f1497i.a();
        }
    }

    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (h.h.n.b.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        y yVar = this.f1504f;
        if (yVar != null) {
            yVar.a(i2, i3, i4, i5);
        }
    }

    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (h.h.n.b.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        y yVar = this.f1504f;
        if (yVar != null) {
            yVar.a(iArr, i2);
        }
    }

    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (h.h.n.b.a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        y yVar = this.f1504f;
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

    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1504f;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1504f;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1504f;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        y yVar = this.f1504f;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.a((TextView) this, callback));
    }

    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            a.a((TextView) this, i2);
        }
    }

    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            a.b((TextView) this, i2);
        }
    }

    public void setLineHeight(int i2) {
        a.c(this, i2);
    }

    public void setPrecomputedText(h.h.k.b bVar) {
        a.a((TextView) this, bVar);
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
        this.f1504f.a(colorStateList);
        this.f1504f.a();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f1504f.a(mode);
        this.f1504f.a();
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.f1504f;
        if (yVar != null) {
            yVar.a(context, i2);
        }
    }

    public void setTextClassifier(TextClassifier textClassifier) {
        x xVar;
        if (Build.VERSION.SDK_INT >= 28 || (xVar = this.f1505g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            xVar.f1491b = textClassifier;
        }
    }

    public void setTextFuture(Future<h.h.k.b> future) {
        this.f1506h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.a aVar) {
        TextDirectionHeuristic textDirectionHeuristic = aVar.f1803b;
        int i2 = 1;
        if (!(textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL || textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i2 = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        if (Build.VERSION.SDK_INT < 23) {
            float textScaleX = aVar.a.getTextScaleX();
            getPaint().set(aVar.a);
            if (textScaleX == getTextScaleX()) {
                setTextScaleX((textScaleX / 2.0f) + 1.0f);
            }
            setTextScaleX(textScaleX);
            return;
        }
        getPaint().set(aVar.a);
        setBreakStrategy(aVar.c);
        setHyphenationFrequency(aVar.d);
    }

    public void setTextSize(int i2, float f2) {
        boolean z = h.h.n.b.a;
        if (z) {
            super.setTextSize(i2, f2);
            return;
        }
        y yVar = this.f1504f;
        if (yVar != null && !z && !yVar.b()) {
            yVar.f1497i.a(i2, f2);
        }
    }

    public void setTypeface(Typeface typeface, int i2) {
        Typeface a = (typeface == null || i2 <= 0) ? null : c.a(getContext(), typeface, i2);
        if (a != null) {
            typeface = a;
        }
        super.setTypeface(typeface, i2);
    }

    public z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        u0.a(context);
        s0.a((View) this, getContext());
        e eVar = new e(this);
        this.e = eVar;
        eVar.a(attributeSet, i2);
        y yVar = new y(this);
        this.f1504f = yVar;
        yVar.a(attributeSet, i2);
        this.f1504f.a();
        this.f1505g = new x(this);
    }

    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i2 != 0 ? h.b.l.a.a.c(context, i2) : null;
        Drawable c2 = i3 != 0 ? h.b.l.a.a.c(context, i3) : null;
        Drawable c3 = i4 != 0 ? h.b.l.a.a.c(context, i4) : null;
        if (i5 != 0) {
            drawable = h.b.l.a.a.c(context, i5);
        }
        setCompoundDrawablesRelativeWithIntrinsicBounds(c, c2, c3, drawable);
        y yVar = this.f1504f;
        if (yVar != null) {
            yVar.a();
        }
    }

    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        Drawable drawable = null;
        Drawable c = i2 != 0 ? h.b.l.a.a.c(context, i2) : null;
        Drawable c2 = i3 != 0 ? h.b.l.a.a.c(context, i3) : null;
        Drawable c3 = i4 != 0 ? h.b.l.a.a.c(context, i4) : null;
        if (i5 != 0) {
            drawable = h.b.l.a.a.c(context, i5);
        }
        setCompoundDrawablesWithIntrinsicBounds(c, c2, c3, drawable);
        y yVar = this.f1504f;
        if (yVar != null) {
            yVar.a();
        }
    }
}
