package i.c.a.c.h0;

import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import h.h.m.m;
import i.c.a.b.d.l.q;
import i.c.a.c.e;
import i.c.a.c.e0.g;
import i.c.a.c.e0.j;
import i.c.a.c.i;

/* compiled from: DropdownMenuEndIconDelegate */
public class h extends n {
    public final TextWatcher d = new a();
    public final TextInputLayout.e e = new b(this.a);

    /* renamed from: f  reason: collision with root package name */
    public final TextInputLayout.f f4117f = new c();

    /* renamed from: g  reason: collision with root package name */
    public boolean f4118g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f4119h = false;

    /* renamed from: i  reason: collision with root package name */
    public long f4120i = RecyclerView.FOREVER_NS;

    /* renamed from: j  reason: collision with root package name */
    public StateListDrawable f4121j;

    /* renamed from: k  reason: collision with root package name */
    public g f4122k;

    /* renamed from: l  reason: collision with root package name */
    public AccessibilityManager f4123l;

    /* renamed from: m  reason: collision with root package name */
    public ValueAnimator f4124m;

    /* renamed from: n  reason: collision with root package name */
    public ValueAnimator f4125n;

    /* compiled from: DropdownMenuEndIconDelegate */
    public class a implements TextWatcher {

        /* renamed from: i.c.a.c.h0.h$a$a  reason: collision with other inner class name */
        /* compiled from: DropdownMenuEndIconDelegate */
        public class C0120a implements Runnable {
            public final /* synthetic */ AutoCompleteTextView e;

            public C0120a(AutoCompleteTextView autoCompleteTextView) {
                this.e = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.e.isPopupShowing();
                h.a(h.this, isPopupShowing);
                h.this.f4118g = isPopupShowing;
            }
        }

        public a() {
        }

        public void afterTextChanged(Editable editable) {
            h hVar = h.this;
            AutoCompleteTextView a = h.a(hVar, hVar.a.getEditText());
            a.post(new C0120a(a));
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    public class b extends TextInputLayout.e {
        public b(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        public void a(View view, h.h.m.w.b bVar) {
            boolean z;
            super.a(view, bVar);
            bVar.a.setClassName(Spinner.class.getName());
            if (Build.VERSION.SDK_INT >= 26) {
                z = bVar.a.isShowingHintText();
            } else {
                Bundle b2 = bVar.b();
                z = b2 != null && (b2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) == 4;
            }
            if (z) {
                bVar.a((CharSequence) null);
            }
        }

        public void c(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            h hVar = h.this;
            AutoCompleteTextView a = h.a(hVar, hVar.a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && h.this.f4123l.isTouchExplorationEnabled()) {
                h.a(h.this, a);
            }
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    public class c implements TextInputLayout.f {
        public c() {
        }

        public void a(TextInputLayout textInputLayout) {
            AutoCompleteTextView a2 = h.a(h.this, textInputLayout.getEditText());
            h hVar = h.this;
            int boxBackgroundMode = hVar.a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                a2.setDropDownBackgroundDrawable(hVar.f4122k);
            } else if (boxBackgroundMode == 1) {
                a2.setDropDownBackgroundDrawable(hVar.f4121j);
            }
            h hVar2 = h.this;
            if (hVar2 != null) {
                if (a2.getKeyListener() == null) {
                    int boxBackgroundMode2 = hVar2.a.getBoxBackgroundMode();
                    g boxBackground = hVar2.a.getBoxBackground();
                    int a3 = q.a((View) a2, i.c.a.c.b.colorControlHighlight);
                    int[][] iArr = {new int[]{16842919}, new int[0]};
                    if (boxBackgroundMode2 == 2) {
                        int a4 = q.a((View) a2, i.c.a.c.b.colorSurface);
                        g gVar = new g(boxBackground.e.a);
                        int a5 = q.a(a3, a4, 0.1f);
                        gVar.a(new ColorStateList(iArr, new int[]{a5, 0}));
                        gVar.setTint(a4);
                        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{a5, a4});
                        g gVar2 = new g(boxBackground.e.a);
                        gVar2.setTint(-1);
                        m.a((View) a2, (Drawable) new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar, gVar2), boxBackground}));
                    } else if (boxBackgroundMode2 == 1) {
                        int boxBackgroundColor = hVar2.a.getBoxBackgroundColor();
                        m.a((View) a2, (Drawable) new RippleDrawable(new ColorStateList(iArr, new int[]{q.a(a3, boxBackgroundColor, 0.1f), boxBackgroundColor}), boxBackground, boxBackground));
                    }
                }
                h hVar3 = h.this;
                if (hVar3 != null) {
                    a2.setOnTouchListener(new i(hVar3, a2));
                    a2.setOnFocusChangeListener(new j(hVar3));
                    a2.setOnDismissListener(new k(hVar3));
                    a2.setThreshold(0);
                    a2.removeTextChangedListener(h.this.d);
                    a2.addTextChangedListener(h.this.d);
                    textInputLayout.setErrorIconDrawable((Drawable) null);
                    textInputLayout.setTextInputAccessibilityDelegate(h.this.e);
                    textInputLayout.setEndIconVisible(true);
                    return;
                }
                throw null;
            }
            throw null;
        }
    }

    /* compiled from: DropdownMenuEndIconDelegate */
    public class d implements View.OnClickListener {
        public d() {
        }

        public void onClick(View view) {
            h.a(h.this, (AutoCompleteTextView) h.this.a.getEditText());
        }
    }

    public h(TextInputLayout textInputLayout) {
        super(textInputLayout);
    }

    public void a() {
        float dimensionPixelOffset = (float) this.f4128b.getResources().getDimensionPixelOffset(i.c.a.c.d.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f4128b.getResources().getDimensionPixelOffset(i.c.a.c.d.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f4128b.getResources().getDimensionPixelOffset(i.c.a.c.d.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        g a2 = a(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        g a3 = a(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f4122k = a2;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f4121j = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, a2);
        this.f4121j.addState(new int[0], a3);
        this.a.setEndIconDrawable(h.b.l.a.a.c(this.f4128b, e.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(i.exposed_dropdown_menu_content_description));
        this.a.setEndIconOnClickListener(new d());
        this.a.a(this.f4117f);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setInterpolator(i.c.a.c.l.a.a);
        ofFloat.setDuration((long) 67);
        ofFloat.addUpdateListener(new m(this));
        this.f4125n = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat2.setInterpolator(i.c.a.c.l.a.a);
        ofFloat2.setDuration((long) 50);
        ofFloat2.addUpdateListener(new m(this));
        this.f4124m = ofFloat2;
        ofFloat2.addListener(new l(this));
        m.h(this.c, 2);
        this.f4123l = (AccessibilityManager) this.f4128b.getSystemService("accessibility");
    }

    public boolean a(int i2) {
        return i2 != 0;
    }

    public boolean b() {
        return true;
    }

    public final boolean c() {
        long currentTimeMillis = System.currentTimeMillis() - this.f4120i;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    public static /* synthetic */ void a(h hVar, AutoCompleteTextView autoCompleteTextView) {
        if (hVar == null) {
            throw null;
        } else if (autoCompleteTextView != null) {
            if (hVar.c()) {
                hVar.f4118g = false;
            }
            if (!hVar.f4118g) {
                boolean z = hVar.f4119h;
                boolean z2 = !z;
                if (z != z2) {
                    hVar.f4119h = z2;
                    hVar.f4125n.cancel();
                    hVar.f4124m.start();
                }
                if (hVar.f4119h) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            hVar.f4118g = false;
        }
    }

    public static /* synthetic */ AutoCompleteTextView a(h hVar, EditText editText) {
        if (hVar == null) {
            throw null;
        } else if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        } else {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
    }

    public static /* synthetic */ void a(h hVar, boolean z) {
        if (hVar.f4119h != z) {
            hVar.f4119h = z;
            hVar.f4125n.cancel();
            hVar.f4124m.start();
        }
    }

    public final g a(float f2, float f3, float f4, int i2) {
        j.b bVar = new j.b();
        bVar.c(f2);
        bVar.d(f2);
        bVar.a(f3);
        bVar.b(f3);
        j a2 = bVar.a();
        g a3 = g.a(this.f4128b, f4);
        a3.e.a = a2;
        a3.invalidateSelf();
        g.b bVar2 = a3.e;
        if (bVar2.f4063i == null) {
            bVar2.f4063i = new Rect();
        }
        a3.e.f4063i.set(0, i2, 0, i2);
        a3.invalidateSelf();
        return a3;
    }
}
