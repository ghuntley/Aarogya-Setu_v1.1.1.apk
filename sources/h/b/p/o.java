package h.b.p;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import g.a.a.b.a;

/* compiled from: AppCompatMultiAutoCompleteTextView */
public class o extends MultiAutoCompleteTextView {

    /* renamed from: g  reason: collision with root package name */
    public static final int[] f1450g = {16843126};
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final y f1451f;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public o(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = h.b.a.autoCompleteTextViewStyle
            h.b.p.u0.a(r4)
            r3.<init>(r4, r5, r0)
            android.content.Context r4 = r3.getContext()
            h.b.p.s0.a((android.view.View) r3, (android.content.Context) r4)
            android.content.Context r4 = r3.getContext()
            int[] r1 = f1450g
            r2 = 0
            h.b.p.x0 r4 = h.b.p.x0.a(r4, r5, r1, r0, r2)
            boolean r1 = r4.f(r2)
            if (r1 == 0) goto L_0x0027
            android.graphics.drawable.Drawable r1 = r4.b(r2)
            r3.setDropDownBackgroundDrawable(r1)
        L_0x0027:
            android.content.res.TypedArray r4 = r4.f1492b
            r4.recycle()
            h.b.p.e r4 = new h.b.p.e
            r4.<init>(r3)
            r3.e = r4
            r4.a(r5, r0)
            h.b.p.y r4 = new h.b.p.y
            r4.<init>(r3)
            r3.f1451f = r4
            r4.a((android.util.AttributeSet) r5, (int) r0)
            h.b.p.y r4 = r3.f1451f
            r4.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.o.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.e;
        if (eVar != null) {
            eVar.a();
        }
        y yVar = this.f1451f;
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
        y yVar = this.f1451f;
        if (yVar != null) {
            yVar.a(context, i2);
        }
    }
}
