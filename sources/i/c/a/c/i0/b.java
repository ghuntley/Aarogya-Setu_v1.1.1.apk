package i.c.a.c.i0;

import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import h.b.p.d;
import h.b.p.k0;

/* compiled from: MaterialAutoCompleteTextView */
public class b extends d {

    /* renamed from: h  reason: collision with root package name */
    public final k0 f4144h;

    /* renamed from: i  reason: collision with root package name */
    public final AccessibilityManager f4145i;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            int r0 = i.c.a.c.b.autoCompleteTextViewStyle
            r1 = 0
            android.content.Context r4 = i.c.a.c.j0.a.a.a(r4, r5, r0, r1)
            r3.<init>(r4, r5, r0)
            android.content.Context r4 = r3.getContext()
            java.lang.String r5 = "accessibility"
            java.lang.Object r5 = r4.getSystemService(r5)
            android.view.accessibility.AccessibilityManager r5 = (android.view.accessibility.AccessibilityManager) r5
            r3.f4145i = r5
            h.b.p.k0 r5 = new h.b.p.k0
            int r0 = h.b.a.listPopupWindowStyle
            r2 = 0
            r5.<init>(r4, r2, r0, r1)
            r3.f4144h = r5
            r4 = 1
            r5.a((boolean) r4)
            h.b.p.k0 r4 = r3.f4144h
            r4.v = r3
            r5 = 2
            android.widget.PopupWindow r4 = r4.F
            r4.setInputMethodMode(r5)
            h.b.p.k0 r4 = r3.f4144h
            android.widget.ListAdapter r5 = r3.getAdapter()
            r4.a((android.widget.ListAdapter) r5)
            h.b.p.k0 r4 = r3.f4144h
            i.c.a.c.i0.a r5 = new i.c.a.c.i0.a
            r5.<init>(r3)
            r4.w = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.i0.b.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public CharSequence getHint() {
        TextInputLayout textInputLayout;
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                textInputLayout = null;
                break;
            } else if (parent instanceof TextInputLayout) {
                textInputLayout = (TextInputLayout) parent;
                break;
            } else {
                parent = parent.getParent();
            }
        }
        if (textInputLayout == null || !textInputLayout.E) {
            return super.getHint();
        }
        return textInputLayout.getHint();
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f4144h.a(getAdapter());
    }

    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() != 0 || (accessibilityManager = this.f4145i) == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f4144h.a();
        }
    }
}
