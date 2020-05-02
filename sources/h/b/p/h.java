package h.b.p;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import android.widget.TextView;
import g.a.a.b.a;

/* compiled from: AppCompatCheckedTextView */
public class h extends CheckedTextView {

    /* renamed from: f  reason: collision with root package name */
    public static final int[] f1400f = {16843016};
    public final y e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 16843720);
        u0.a(context);
        s0.a((View) this, getContext());
        y yVar = new y(this);
        this.e = yVar;
        yVar.a(attributeSet, 16843720);
        this.e.a();
        x0 a = x0.a(getContext(), attributeSet, f1400f, 16843720, 0);
        setCheckMarkDrawable(a.b(0));
        a.f1492b.recycle();
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        y yVar = this.e;
        if (yVar != null) {
            yVar.a();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        a.a(onCreateInputConnection, editorInfo, (View) this);
        return onCreateInputConnection;
    }

    public void setCheckMarkDrawable(int i2) {
        setCheckMarkDrawable(h.b.l.a.a.c(getContext(), i2));
    }

    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(a.a((TextView) this, callback));
    }

    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        y yVar = this.e;
        if (yVar != null) {
            yVar.a(context, i2);
        }
    }
}
