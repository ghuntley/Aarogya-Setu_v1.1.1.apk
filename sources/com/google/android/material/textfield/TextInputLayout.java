package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.internal.CheckableImageButton;
import h.b.p.e0;
import h.b.p.z;
import h.h.m.m;
import i.c.a.c.h0.n;
import i.c.a.c.h0.o;
import i.c.a.c.i;
import i.c.a.c.j;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class TextInputLayout extends LinearLayout {
    public static final int L0 = j.Widget_Design_TextInputLayout;
    public CharSequence A;
    public int A0;
    public final TextView B;
    public final int B0;
    public boolean C;
    public final int C0;
    public CharSequence D;
    public final int D0;
    public boolean E;
    public int E0;
    public i.c.a.c.e0.g F;
    public boolean F0;
    public i.c.a.c.e0.g G;
    public final i.c.a.c.z.b G0;
    public i.c.a.c.e0.j H;
    public boolean H0;
    public final int I;
    public ValueAnimator I0;
    public int J;
    public boolean J0;
    public final int K;
    public boolean K0;
    public int L;
    public final int M;
    public final int N;
    public int O;
    public int P;
    public final Rect Q;
    public final Rect R;
    public final RectF S;
    public Typeface T;
    public final CheckableImageButton U;
    public ColorStateList V;
    public boolean W;
    public PorterDuff.Mode a0;
    public boolean b0;
    public Drawable c0;
    public int d0;
    public final FrameLayout e;
    public View.OnLongClickListener e0;

    /* renamed from: f  reason: collision with root package name */
    public final LinearLayout f663f;
    public final LinkedHashSet<f> f0;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f664g;
    public int g0;

    /* renamed from: h  reason: collision with root package name */
    public final FrameLayout f665h;
    public final SparseArray<n> h0;

    /* renamed from: i  reason: collision with root package name */
    public EditText f666i;
    public final CheckableImageButton i0;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f667j;
    public final LinkedHashSet<g> j0;

    /* renamed from: k  reason: collision with root package name */
    public final o f668k;
    public ColorStateList k0;

    /* renamed from: l  reason: collision with root package name */
    public boolean f669l;
    public boolean l0;

    /* renamed from: m  reason: collision with root package name */
    public int f670m;
    public PorterDuff.Mode m0;

    /* renamed from: n  reason: collision with root package name */
    public boolean f671n;
    public boolean n0;

    /* renamed from: o  reason: collision with root package name */
    public TextView f672o;
    public Drawable o0;

    /* renamed from: p  reason: collision with root package name */
    public int f673p;
    public int p0;

    /* renamed from: q  reason: collision with root package name */
    public int f674q;
    public Drawable q0;
    public CharSequence r;
    public View.OnLongClickListener r0;
    public boolean s;
    public final CheckableImageButton s0;
    public TextView t;
    public ColorStateList t0;
    public ColorStateList u;
    public ColorStateList u0;
    public int v;
    public ColorStateList v0;
    public ColorStateList w;
    public int w0;
    public ColorStateList x;
    public int x0;
    public CharSequence y;
    public int y0;
    public final TextView z;
    public ColorStateList z0;

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.a(!textInputLayout.K0, false);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f669l) {
                textInputLayout2.a(editable.length());
            }
            TextInputLayout textInputLayout3 = TextInputLayout.this;
            if (textInputLayout3.s) {
                textInputLayout3.b(editable.length());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            TextInputLayout.this.i0.performClick();
            TextInputLayout.this.i0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            TextInputLayout.this.f666i.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.G0.c(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends h.h.m.a {
        public final TextInputLayout d;

        public e(TextInputLayout textInputLayout) {
            this.d = textInputLayout;
        }

        public void a(View view, h.h.m.w.b bVar) {
            String str;
            String str2;
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            EditText editText = this.d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.d.getHint();
            CharSequence helperText = this.d.getHelperText();
            CharSequence error = this.d.getError();
            int counterMaxLength = this.d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.d.getCounterOverflowDescription();
            boolean z = !TextUtils.isEmpty(text);
            boolean z2 = !TextUtils.isEmpty(hint);
            boolean z3 = !TextUtils.isEmpty(helperText);
            boolean z4 = !TextUtils.isEmpty(error);
            boolean z5 = z4 || !TextUtils.isEmpty(counterOverflowDescription);
            if (z2) {
                str = hint.toString();
            } else {
                str = "";
            }
            StringBuilder a = i.a.a.a.a.a(str);
            if ((z4 || z3) && !TextUtils.isEmpty(str)) {
                str2 = ", ";
            } else {
                str2 = "";
            }
            a.append(str2);
            StringBuilder a2 = i.a.a.a.a.a(a.toString());
            if (z4) {
                helperText = error;
            } else if (!z3) {
                helperText = "";
            }
            a2.append(helperText);
            String sb = a2.toString();
            if (z) {
                bVar.a.setText(text);
            } else if (!TextUtils.isEmpty(sb)) {
                bVar.a.setText(sb);
            }
            if (!TextUtils.isEmpty(sb)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    bVar.a((CharSequence) sb);
                } else {
                    if (z) {
                        sb = text + ", " + sb;
                    }
                    bVar.a.setText(sb);
                }
                boolean z6 = !z;
                if (Build.VERSION.SDK_INT >= 26) {
                    bVar.a.setShowingHintText(z6);
                } else {
                    bVar.a(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            bVar.a.setMaxTextLength(counterMaxLength);
            if (z5) {
                if (!z4) {
                    error = counterOverflowDescription;
                }
                bVar.a.setError(error);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i2);
    }

    public static class h extends h.j.a.a {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f675g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f676h;

        public static class a implements Parcelable.ClassLoaderCreator<h> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new h(parcel, classLoader);
            }

            public Object[] newArray(int i2) {
                return new h[i2];
            }

            public Object createFromParcel(Parcel parcel) {
                return new h(parcel, (ClassLoader) null);
            }
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("TextInputLayout.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" error=");
            a2.append(this.f675g);
            a2.append("}");
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.e, i2);
            TextUtils.writeToParcel(this.f675g, parcel, i2);
            parcel.writeInt(this.f676h ? 1 : 0);
        }

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f675g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f676h = parcel.readInt() != 1 ? false : true;
        }
    }

    public TextInputLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    private n getEndIconDelegate() {
        n nVar = this.h0.get(this.g0);
        return nVar != null ? nVar : this.h0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.s0.getVisibility() == 0) {
            return this.s0;
        }
        if (!f() || !g()) {
            return null;
        }
        return this.i0;
    }

    private void setEditText(EditText editText) {
        if (this.f666i == null) {
            if (this.g0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f666i = editText;
            h();
            setTextInputAccessibilityDelegate(new e(this));
            this.G0.a(this.f666i.getTypeface());
            i.c.a.c.z.b bVar = this.G0;
            float textSize = this.f666i.getTextSize();
            if (bVar.f4262i != textSize) {
                bVar.f4262i = textSize;
                bVar.e();
            }
            int gravity = this.f666i.getGravity();
            this.G0.a((gravity & -113) | 48);
            i.c.a.c.z.b bVar2 = this.G0;
            if (bVar2.f4260g != gravity) {
                bVar2.f4260g = gravity;
                bVar2.e();
            }
            this.f666i.addTextChangedListener(new a());
            if (this.u0 == null) {
                this.u0 = this.f666i.getHintTextColors();
            }
            if (this.C) {
                if (TextUtils.isEmpty(this.D)) {
                    CharSequence hint = this.f666i.getHint();
                    this.f667j = hint;
                    setHint(hint);
                    this.f666i.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.f672o != null) {
                a(this.f666i.getText().length());
            }
            n();
            this.f668k.a();
            this.f663f.bringToFront();
            this.f664g.bringToFront();
            this.f665h.bringToFront();
            this.s0.bringToFront();
            Iterator it = this.f0.iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(this);
            }
            p();
            r();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            a(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setErrorIconVisible(boolean z2) {
        int i2 = 0;
        this.s0.setVisibility(z2 ? 0 : 8);
        FrameLayout frameLayout = this.f665h;
        if (z2) {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        r();
        if (!f()) {
            m();
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.D)) {
            this.D = charSequence;
            i.c.a.c.z.b bVar = this.G0;
            if (charSequence == null || !TextUtils.equals(bVar.w, charSequence)) {
                bVar.w = charSequence;
                bVar.x = null;
                Bitmap bitmap = bVar.A;
                if (bitmap != null) {
                    bitmap.recycle();
                    bVar.A = null;
                }
                bVar.e();
            }
            if (!this.F0) {
                i();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.s != z2) {
            if (z2) {
                z zVar = new z(getContext());
                this.t = zVar;
                zVar.setId(i.c.a.c.f.textinput_placeholder);
                m.g(this.t, 1);
                setPlaceholderTextAppearance(this.v);
                setPlaceholderTextColor(this.u);
                TextView textView = this.t;
                if (textView != null) {
                    this.e.addView(textView);
                    this.t.setVisibility(0);
                }
            } else {
                TextView textView2 = this.t;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                this.t = null;
            }
            this.s = z2;
        }
    }

    public final void a(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f666i;
        boolean z4 = editText != null && !TextUtils.isEmpty(editText.getText());
        EditText editText2 = this.f666i;
        boolean z5 = editText2 != null && editText2.hasFocus();
        boolean c2 = this.f668k.c();
        ColorStateList colorStateList2 = this.u0;
        if (colorStateList2 != null) {
            i.c.a.c.z.b bVar = this.G0;
            if (bVar.f4265l != colorStateList2) {
                bVar.f4265l = colorStateList2;
                bVar.e();
            }
            i.c.a.c.z.b bVar2 = this.G0;
            ColorStateList colorStateList3 = this.u0;
            if (bVar2.f4264k != colorStateList3) {
                bVar2.f4264k = colorStateList3;
                bVar2.e();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.u0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.E0) : this.E0;
            this.G0.b(ColorStateList.valueOf(colorForState));
            i.c.a.c.z.b bVar3 = this.G0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (bVar3.f4264k != valueOf) {
                bVar3.f4264k = valueOf;
                bVar3.e();
            }
        } else if (c2) {
            i.c.a.c.z.b bVar4 = this.G0;
            TextView textView2 = this.f668k.f4137m;
            bVar4.b(textView2 != null ? textView2.getTextColors() : null);
        } else if (this.f671n && (textView = this.f672o) != null) {
            this.G0.b(textView.getTextColors());
        } else if (z5 && (colorStateList = this.v0) != null) {
            i.c.a.c.z.b bVar5 = this.G0;
            if (bVar5.f4265l != colorStateList) {
                bVar5.f4265l = colorStateList;
                bVar5.e();
            }
        }
        if (z4 || (isEnabled() && (z5 || c2))) {
            if (z3 || this.F0) {
                ValueAnimator valueAnimator = this.I0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.I0.cancel();
                }
                if (!z2 || !this.H0) {
                    this.G0.c(1.0f);
                } else {
                    a(1.0f);
                }
                this.F0 = false;
                if (e()) {
                    i();
                }
                j();
                q();
                s();
            }
        } else if (z3 || !this.F0) {
            ValueAnimator valueAnimator2 = this.I0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.I0.cancel();
            }
            if (!z2 || !this.H0) {
                this.G0.c(0.0f);
            } else {
                a(0.0f);
            }
            if (e() && (!((i.c.a.c.h0.g) this.F).D.isEmpty()) && e()) {
                ((i.c.a.c.h0.g) this.F).a(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.F0 = true;
            TextView textView3 = this.t;
            if (textView3 != null && this.s) {
                textView3.setText((CharSequence) null);
                this.t.setVisibility(4);
            }
            q();
            s();
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & -113) | 16;
            this.e.addView(view, layoutParams2);
            this.e.setLayoutParams(layoutParams);
            o();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i2, layoutParams);
    }

    public final void b(int i2) {
        if (i2 != 0 || this.F0) {
            TextView textView = this.t;
            if (textView != null && this.s) {
                textView.setText((CharSequence) null);
                this.t.setVisibility(4);
                return;
            }
            return;
        }
        j();
    }

    public final void c() {
        a(this.U, this.W, this.V, this.b0, this.a0);
    }

    public final int d() {
        float b2;
        if (!this.C) {
            return 0;
        }
        int i2 = this.J;
        if (i2 == 0 || i2 == 1) {
            b2 = this.G0.b();
        } else if (i2 != 2) {
            return 0;
        } else {
            b2 = this.G0.b() / 2.0f;
        }
        return (int) b2;
    }

    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i2) {
        EditText editText;
        if (this.f667j == null || (editText = this.f666i) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
            return;
        }
        boolean z2 = this.E;
        this.E = false;
        CharSequence hint = editText.getHint();
        this.f666i.setHint(this.f667j);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i2);
        } finally {
            this.f666i.setHint(hint);
            this.E = z2;
        }
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.K0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.K0 = false;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.C) {
            i.c.a.c.z.b bVar = this.G0;
            if (bVar != null) {
                int save = canvas.save();
                if (bVar.x != null && bVar.f4258b) {
                    float lineLeft = (bVar.R.getLineLeft(0) + bVar.f4270q) - (bVar.U * 2.0f);
                    bVar.G.setTextSize(bVar.D);
                    float f2 = bVar.f4270q;
                    float f3 = bVar.r;
                    boolean z2 = bVar.z && bVar.A != null;
                    float lineAscent = (float) bVar.R.getLineAscent(0);
                    float f4 = bVar.C;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (z2) {
                        canvas.drawBitmap(bVar.A, f2, f3 + lineAscent, bVar.B);
                        canvas.restoreToCount(save);
                    } else {
                        if (bVar.f()) {
                            int alpha = bVar.G.getAlpha();
                            canvas.translate(lineLeft, f3);
                            float f5 = (float) alpha;
                            bVar.G.setAlpha((int) (bVar.T * f5));
                            bVar.R.draw(canvas);
                            canvas.translate(f2 - lineLeft, 0.0f);
                            bVar.G.setAlpha((int) (bVar.S * f5));
                            CharSequence charSequence = bVar.V;
                            float f6 = -lineAscent;
                            canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f6 / bVar.C, bVar.G);
                            String trim = bVar.V.toString().trim();
                            if (trim.endsWith("…")) {
                                trim = trim.substring(0, trim.length() - 1);
                            }
                            String str = trim;
                            bVar.G.setAlpha(alpha);
                            canvas.drawText(str, 0, Math.min(bVar.R.getLineEnd(0), str.length()), 0.0f, f6 / bVar.C, bVar.G);
                        } else {
                            canvas.translate(f2, f3 + lineAscent);
                            bVar.R.draw(canvas);
                        }
                        canvas.restoreToCount(save);
                    }
                }
            } else {
                throw null;
            }
        }
        i.c.a.c.e0.g gVar = this.G;
        if (gVar != null) {
            Rect bounds = gVar.getBounds();
            bounds.top = bounds.bottom - this.L;
            this.G.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        r1 = r2.f4264k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void drawableStateChanged() {
        /*
            r4 = this;
            boolean r0 = r4.J0
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            r0 = 1
            r4.J0 = r0
            super.drawableStateChanged()
            int[] r1 = r4.getDrawableState()
            i.c.a.c.z.b r2 = r4.G0
            r3 = 0
            if (r2 == 0) goto L_0x0037
            r2.E = r1
            android.content.res.ColorStateList r1 = r2.f4265l
            if (r1 == 0) goto L_0x0020
            boolean r1 = r1.isStateful()
            if (r1 != 0) goto L_0x002a
        L_0x0020:
            android.content.res.ColorStateList r1 = r2.f4264k
            if (r1 == 0) goto L_0x002c
            boolean r1 = r1.isStateful()
            if (r1 == 0) goto L_0x002c
        L_0x002a:
            r1 = 1
            goto L_0x002d
        L_0x002c:
            r1 = 0
        L_0x002d:
            if (r1 == 0) goto L_0x0034
            r2.e()
            r1 = 1
            goto L_0x0035
        L_0x0034:
            r1 = 0
        L_0x0035:
            r1 = r1 | r3
            goto L_0x0038
        L_0x0037:
            r1 = 0
        L_0x0038:
            android.widget.EditText r2 = r4.f666i
            if (r2 == 0) goto L_0x004d
            boolean r2 = h.h.m.m.x(r4)
            if (r2 == 0) goto L_0x0049
            boolean r2 = r4.isEnabled()
            if (r2 == 0) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            r4.a((boolean) r0, (boolean) r3)
        L_0x004d:
            r4.n()
            r4.t()
            if (r1 == 0) goto L_0x0058
            r4.invalidate()
        L_0x0058:
            r4.J0 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.drawableStateChanged():void");
    }

    public final boolean e() {
        return this.C && !TextUtils.isEmpty(this.D) && (this.F instanceof i.c.a.c.h0.g);
    }

    public final boolean f() {
        return this.g0 != 0;
    }

    public boolean g() {
        return this.f665h.getVisibility() == 0 && this.i0.getVisibility() == 0;
    }

    public int getBaseline() {
        EditText editText = this.f666i;
        if (editText == null) {
            return super.getBaseline();
        }
        return d() + getPaddingTop() + editText.getBaseline();
    }

    public i.c.a.c.e0.g getBoxBackground() {
        int i2 = this.J;
        if (i2 == 1 || i2 == 2) {
            return this.F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.P;
    }

    public int getBoxBackgroundMode() {
        return this.J;
    }

    public float getBoxCornerRadiusBottomEnd() {
        i.c.a.c.e0.g gVar = this.F;
        return gVar.e.a.f4075h.a(gVar.b());
    }

    public float getBoxCornerRadiusBottomStart() {
        i.c.a.c.e0.g gVar = this.F;
        return gVar.e.a.f4074g.a(gVar.b());
    }

    public float getBoxCornerRadiusTopEnd() {
        i.c.a.c.e0.g gVar = this.F;
        return gVar.e.a.f4073f.a(gVar.b());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.F.f();
    }

    public int getBoxStrokeColor() {
        return this.y0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.z0;
    }

    public int getCounterMaxLength() {
        return this.f670m;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (!this.f669l || !this.f671n || (textView = this.f672o) == null) {
            return null;
        }
        return textView.getContentDescription();
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.w;
    }

    public ColorStateList getCounterTextColor() {
        return this.w;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.u0;
    }

    public EditText getEditText() {
        return this.f666i;
    }

    public CharSequence getEndIconContentDescription() {
        return this.i0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.i0.getDrawable();
    }

    public int getEndIconMode() {
        return this.g0;
    }

    public CheckableImageButton getEndIconView() {
        return this.i0;
    }

    public CharSequence getError() {
        o oVar = this.f668k;
        if (oVar.f4136l) {
            return oVar.f4135k;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f668k.f4138n;
    }

    public int getErrorCurrentTextColors() {
        return this.f668k.d();
    }

    public Drawable getErrorIconDrawable() {
        return this.s0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.f668k.d();
    }

    public CharSequence getHelperText() {
        o oVar = this.f668k;
        if (oVar.r) {
            return oVar.f4141q;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.f668k.s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.C) {
            return this.D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.G0.b();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.G0.c();
    }

    public ColorStateList getHintTextColor() {
        return this.v0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.i0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.i0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.s) {
            return this.r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.u;
    }

    public CharSequence getPrefixText() {
        return this.y;
    }

    public ColorStateList getPrefixTextColor() {
        return this.z.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.z;
    }

    public CharSequence getStartIconContentDescription() {
        return this.U.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.U.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.B;
    }

    public Typeface getTypeface() {
        return this.T;
    }

    public final void h() {
        int i2 = this.J;
        boolean z2 = true;
        if (i2 == 0) {
            this.F = null;
            this.G = null;
        } else if (i2 == 1) {
            this.F = new i.c.a.c.e0.g(this.H);
            this.G = new i.c.a.c.e0.g();
        } else if (i2 == 2) {
            if (!this.C || (this.F instanceof i.c.a.c.h0.g)) {
                this.F = new i.c.a.c.e0.g(this.H);
            } else {
                this.F = new i.c.a.c.h0.g(this.H);
            }
            this.G = null;
        } else {
            throw new IllegalArgumentException(this.J + " is illegal; only @BoxBackgroundMode constants are supported.");
        }
        EditText editText = this.f666i;
        if (editText == null || this.F == null || editText.getBackground() != null || this.J == 0) {
            z2 = false;
        }
        if (z2) {
            m.a((View) this.f666i, (Drawable) this.F);
        }
        t();
        if (this.J != 0) {
            o();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void i() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            android.graphics.RectF r0 = r12.S
            i.c.a.c.z.b r1 = r12.G0
            android.widget.EditText r2 = r12.f666i
            int r2 = r2.getWidth()
            android.widget.EditText r3 = r12.f666i
            int r3 = r3.getGravity()
            java.lang.CharSequence r4 = r1.w
            boolean r4 = r1.a((java.lang.CharSequence) r4)
            r1.y = r4
            r5 = 8388613(0x800005, float:1.175495E-38)
            r6 = 1
            r7 = 1073741824(0x40000000, float:2.0)
            r8 = 17
            r9 = 5
            if (r3 == r8) goto L_0x005d
            r10 = r3 & 7
            if (r10 != r6) goto L_0x002f
            goto L_0x005d
        L_0x002f:
            r10 = r3 & r5
            if (r10 == r5) goto L_0x0049
            r10 = r3 & 5
            if (r10 != r9) goto L_0x0038
            goto L_0x0049
        L_0x0038:
            if (r4 == 0) goto L_0x0044
            android.graphics.Rect r4 = r1.e
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.a()
            goto L_0x0064
        L_0x0044:
            android.graphics.Rect r4 = r1.e
            int r4 = r4.left
            goto L_0x0051
        L_0x0049:
            boolean r4 = r1.y
            if (r4 == 0) goto L_0x0053
            android.graphics.Rect r4 = r1.e
            int r4 = r4.left
        L_0x0051:
            float r4 = (float) r4
            goto L_0x0065
        L_0x0053:
            android.graphics.Rect r4 = r1.e
            int r4 = r4.right
            float r4 = (float) r4
            float r10 = r1.a()
            goto L_0x0064
        L_0x005d:
            float r4 = (float) r2
            float r4 = r4 / r7
            float r10 = r1.a()
            float r10 = r10 / r7
        L_0x0064:
            float r4 = r4 - r10
        L_0x0065:
            r0.left = r4
            android.graphics.Rect r10 = r1.e
            int r11 = r10.top
            float r11 = (float) r11
            r0.top = r11
            if (r3 == r8) goto L_0x009c
            r8 = r3 & 7
            if (r8 != r6) goto L_0x0075
            goto L_0x009c
        L_0x0075:
            r2 = r3 & r5
            if (r2 == r5) goto L_0x008b
            r2 = r3 & 5
            if (r2 != r9) goto L_0x007e
            goto L_0x008b
        L_0x007e:
            boolean r2 = r1.y
            if (r2 == 0) goto L_0x0085
            int r2 = r10.right
            goto L_0x009a
        L_0x0085:
            float r2 = r1.a()
            float r2 = r2 + r4
            goto L_0x00a4
        L_0x008b:
            boolean r2 = r1.y
            if (r2 == 0) goto L_0x0096
            float r2 = r0.left
            float r3 = r1.a()
            goto L_0x00a3
        L_0x0096:
            android.graphics.Rect r2 = r1.e
            int r2 = r2.right
        L_0x009a:
            float r2 = (float) r2
            goto L_0x00a4
        L_0x009c:
            float r2 = (float) r2
            float r2 = r2 / r7
            float r3 = r1.a()
            float r3 = r3 / r7
        L_0x00a3:
            float r2 = r2 + r3
        L_0x00a4:
            r0.right = r2
            android.graphics.Rect r2 = r1.e
            int r2 = r2.top
            float r2 = (float) r2
            float r1 = r1.b()
            float r1 = r1 + r2
            r0.bottom = r1
            float r2 = r0.left
            int r3 = r12.I
            float r3 = (float) r3
            float r2 = r2 - r3
            r0.left = r2
            float r2 = r0.top
            float r2 = r2 - r3
            r0.top = r2
            float r2 = r0.right
            float r2 = r2 + r3
            r0.right = r2
            float r1 = r1 + r3
            r0.bottom = r1
            int r1 = r12.getPaddingLeft()
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r12.getPaddingTop()
            int r2 = -r2
            float r2 = (float) r2
            r0.offset(r1, r2)
            i.c.a.c.e0.g r1 = r12.F
            i.c.a.c.h0.g r1 = (i.c.a.c.h0.g) r1
            if (r1 == 0) goto L_0x00e8
            float r2 = r0.left
            float r3 = r0.top
            float r4 = r0.right
            float r0 = r0.bottom
            r1.a(r2, r3, r4, r0)
            return
        L_0x00e8:
            r0 = 0
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.i():void");
    }

    public final void j() {
        TextView textView = this.t;
        if (textView != null && this.s) {
            textView.setText(this.r);
            this.t.setVisibility(0);
            this.t.bringToFront();
        }
    }

    public final void k() {
        if (this.f672o != null) {
            EditText editText = this.f666i;
            a(editText == null ? 0 : editText.getText().length());
        }
    }

    public final void l() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f672o;
        if (textView != null) {
            a(textView, this.f671n ? this.f673p : this.f674q);
            if (!this.f671n && (colorStateList2 = this.w) != null) {
                this.f672o.setTextColor(colorStateList2);
            }
            if (this.f671n && (colorStateList = this.x) != null) {
                this.f672o.setTextColor(colorStateList);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0106  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean m() {
        /*
            r10 = this;
            android.widget.EditText r0 = r10.f666i
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            android.graphics.drawable.Drawable r0 = r10.getStartIconDrawable()
            r2 = 1
            if (r0 != 0) goto L_0x0011
            java.lang.CharSequence r0 = r10.y
            if (r0 == 0) goto L_0x001b
        L_0x0011:
            android.widget.LinearLayout r0 = r10.f663f
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x001b
            r0 = 1
            goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            r3 = 0
            r4 = 3
            r5 = 2
            if (r0 == 0) goto L_0x005d
            android.widget.LinearLayout r0 = r10.f663f
            int r0 = r0.getMeasuredWidth()
            android.widget.EditText r6 = r10.f666i
            int r6 = r6.getPaddingLeft()
            int r0 = r0 - r6
            android.graphics.drawable.Drawable r6 = r10.c0
            if (r6 == 0) goto L_0x0036
            int r6 = r10.d0
            if (r6 == r0) goto L_0x0042
        L_0x0036:
            android.graphics.drawable.ColorDrawable r6 = new android.graphics.drawable.ColorDrawable
            r6.<init>()
            r10.c0 = r6
            r10.d0 = r0
            r6.setBounds(r1, r1, r0, r2)
        L_0x0042:
            android.widget.EditText r0 = r10.f666i
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            r6 = r0[r1]
            android.graphics.drawable.Drawable r7 = r10.c0
            if (r6 == r7) goto L_0x005b
            android.widget.EditText r6 = r10.f666i
            r8 = r0[r2]
            r9 = r0[r5]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r7, r8, r9, r0)
        L_0x0059:
            r0 = 1
            goto L_0x0075
        L_0x005b:
            r0 = 0
            goto L_0x0075
        L_0x005d:
            android.graphics.drawable.Drawable r0 = r10.c0
            if (r0 == 0) goto L_0x005b
            android.widget.EditText r0 = r10.f666i
            android.graphics.drawable.Drawable[] r0 = r0.getCompoundDrawablesRelative()
            android.widget.EditText r6 = r10.f666i
            r7 = r0[r2]
            r8 = r0[r5]
            r0 = r0[r4]
            r6.setCompoundDrawablesRelative(r3, r7, r8, r0)
            r10.c0 = r3
            goto L_0x0059
        L_0x0075:
            com.google.android.material.internal.CheckableImageButton r6 = r10.s0
            int r6 = r6.getVisibility()
            if (r6 == 0) goto L_0x008d
            boolean r6 = r10.f()
            if (r6 == 0) goto L_0x0089
            boolean r6 = r10.g()
            if (r6 != 0) goto L_0x008d
        L_0x0089:
            java.lang.CharSequence r6 = r10.A
            if (r6 == 0) goto L_0x0097
        L_0x008d:
            android.widget.LinearLayout r6 = r10.f664g
            int r6 = r6.getMeasuredWidth()
            if (r6 <= 0) goto L_0x0097
            r6 = 1
            goto L_0x0098
        L_0x0097:
            r6 = 0
        L_0x0098:
            if (r6 == 0) goto L_0x0106
            android.widget.TextView r3 = r10.B
            int r3 = r3.getMeasuredWidth()
            android.widget.EditText r6 = r10.f666i
            int r6 = r6.getPaddingRight()
            int r3 = r3 - r6
            com.google.android.material.internal.CheckableImageButton r6 = r10.getEndIconToUpdateDummyDrawable()
            if (r6 == 0) goto L_0x00bd
            int r7 = r6.getMeasuredWidth()
            int r7 = r7 + r3
            android.view.ViewGroup$LayoutParams r3 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            int r3 = r3.getMarginStart()
            int r3 = r3 + r7
        L_0x00bd:
            android.widget.EditText r6 = r10.f666i
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            android.graphics.drawable.Drawable r7 = r10.o0
            if (r7 == 0) goto L_0x00de
            int r8 = r10.p0
            if (r8 == r3) goto L_0x00de
            r10.p0 = r3
            r7.setBounds(r1, r1, r3, r2)
            android.widget.EditText r0 = r10.f666i
            r1 = r6[r1]
            r3 = r6[r2]
            android.graphics.drawable.Drawable r5 = r10.o0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r5, r4)
            goto L_0x0127
        L_0x00de:
            android.graphics.drawable.Drawable r7 = r10.o0
            if (r7 != 0) goto L_0x00ee
            android.graphics.drawable.ColorDrawable r7 = new android.graphics.drawable.ColorDrawable
            r7.<init>()
            r10.o0 = r7
            r10.p0 = r3
            r7.setBounds(r1, r1, r3, r2)
        L_0x00ee:
            r3 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.o0
            if (r3 == r7) goto L_0x0104
            r0 = r6[r5]
            r10.q0 = r0
            android.widget.EditText r0 = r10.f666i
            r1 = r6[r1]
            r3 = r6[r2]
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r3, r7, r4)
            goto L_0x0127
        L_0x0104:
            r2 = r0
            goto L_0x0127
        L_0x0106:
            android.graphics.drawable.Drawable r6 = r10.o0
            if (r6 == 0) goto L_0x0128
            android.widget.EditText r6 = r10.f666i
            android.graphics.drawable.Drawable[] r6 = r6.getCompoundDrawablesRelative()
            r5 = r6[r5]
            android.graphics.drawable.Drawable r7 = r10.o0
            if (r5 != r7) goto L_0x0124
            android.widget.EditText r0 = r10.f666i
            r1 = r6[r1]
            r5 = r6[r2]
            android.graphics.drawable.Drawable r7 = r10.q0
            r4 = r6[r4]
            r0.setCompoundDrawablesRelative(r1, r5, r7, r4)
            goto L_0x0125
        L_0x0124:
            r2 = r0
        L_0x0125:
            r10.o0 = r3
        L_0x0127:
            r0 = r2
        L_0x0128:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m():boolean");
    }

    public void n() {
        Drawable background;
        TextView textView;
        EditText editText = this.f666i;
        if (editText != null && this.J == 0 && (background = editText.getBackground()) != null) {
            if (e0.a(background)) {
                background = background.mutate();
            }
            if (this.f668k.c()) {
                background.setColorFilter(h.b.p.j.a(this.f668k.d(), PorterDuff.Mode.SRC_IN));
            } else if (!this.f671n || (textView = this.f672o) == null) {
                g.a.a.b.a.a(background);
                this.f666i.refreshDrawableState();
            } else {
                background.setColorFilter(h.b.p.j.a(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
            }
        }
    }

    public final void o() {
        if (this.J != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.e.getLayoutParams();
            int d2 = d();
            if (d2 != layoutParams.topMargin) {
                layoutParams.topMargin = d2;
                this.e.requestLayout();
            }
        }
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        super.onLayout(z2, i2, i3, i4, i5);
        EditText editText = this.f666i;
        if (editText != null) {
            Rect rect = this.Q;
            i.c.a.c.z.c.a((ViewGroup) this, (View) editText, rect);
            i.c.a.c.e0.g gVar = this.G;
            if (gVar != null) {
                int i8 = rect.bottom;
                gVar.setBounds(rect.left, i8 - this.N, rect.right, i8);
            }
            if (this.C) {
                i.c.a.c.z.b bVar = this.G0;
                float textSize = this.f666i.getTextSize();
                if (bVar.f4262i != textSize) {
                    bVar.f4262i = textSize;
                    bVar.e();
                }
                int gravity = this.f666i.getGravity();
                this.G0.a((gravity & -113) | 48);
                i.c.a.c.z.b bVar2 = this.G0;
                if (bVar2.f4260g != gravity) {
                    bVar2.f4260g = gravity;
                    bVar2.e();
                }
                i.c.a.c.z.b bVar3 = this.G0;
                if (this.f666i != null) {
                    Rect rect2 = this.R;
                    boolean z3 = false;
                    boolean z4 = m.k(this) == 1;
                    rect2.bottom = rect.bottom;
                    int i9 = this.J;
                    if (i9 == 1) {
                        rect2.left = a(rect.left, z4);
                        rect2.top = rect.top + this.K;
                        rect2.right = b(rect.right, z4);
                    } else if (i9 != 2) {
                        rect2.left = a(rect.left, z4);
                        rect2.top = getPaddingTop();
                        rect2.right = b(rect.right, z4);
                    } else {
                        rect2.left = this.f666i.getPaddingLeft() + rect.left;
                        rect2.top = rect.top - d();
                        rect2.right = rect.right - this.f666i.getPaddingRight();
                    }
                    if (bVar3 != null) {
                        int i10 = rect2.left;
                        int i11 = rect2.top;
                        int i12 = rect2.right;
                        int i13 = rect2.bottom;
                        if (!i.c.a.c.z.b.a(bVar3.e, i10, i11, i12, i13)) {
                            bVar3.e.set(i10, i11, i12, i13);
                            bVar3.F = true;
                            bVar3.d();
                        }
                        i.c.a.c.z.b bVar4 = this.G0;
                        if (this.f666i != null) {
                            Rect rect3 = this.R;
                            TextPaint textPaint = bVar4.H;
                            textPaint.setTextSize(bVar4.f4262i);
                            textPaint.setTypeface(bVar4.t);
                            float f2 = -bVar4.H.ascent();
                            rect3.left = this.f666i.getCompoundPaddingLeft() + rect.left;
                            if (this.J == 1 && this.f666i.getMinLines() <= 1) {
                                i6 = (int) (((float) rect.centerY()) - (f2 / 2.0f));
                            } else {
                                i6 = rect.top + this.f666i.getCompoundPaddingTop();
                            }
                            rect3.top = i6;
                            rect3.right = rect.right - this.f666i.getCompoundPaddingRight();
                            if (this.J == 1 && this.f666i.getMinLines() <= 1) {
                                z3 = true;
                            }
                            if (z3) {
                                i7 = (int) (((float) rect3.top) + f2);
                            } else {
                                i7 = rect.bottom - this.f666i.getCompoundPaddingBottom();
                            }
                            rect3.bottom = i7;
                            int i14 = rect3.left;
                            int i15 = rect3.top;
                            int i16 = rect3.right;
                            if (!i.c.a.c.z.b.a(bVar4.d, i14, i15, i16, i7)) {
                                bVar4.d.set(i14, i15, i16, i7);
                                bVar4.F = true;
                                bVar4.d();
                            }
                            this.G0.e();
                            if (e() && !this.F0) {
                                i();
                                return;
                            }
                            return;
                        }
                        throw new IllegalStateException();
                    }
                    throw null;
                }
                throw new IllegalStateException();
            }
        }
    }

    public void onMeasure(int i2, int i3) {
        EditText editText;
        int max;
        super.onMeasure(i2, i3);
        boolean z2 = false;
        if (this.f666i != null && this.f666i.getMeasuredHeight() < (max = Math.max(this.f664g.getMeasuredHeight(), this.f663f.getMeasuredHeight()))) {
            this.f666i.setMinimumHeight(max);
            z2 = true;
        }
        boolean m2 = m();
        if (z2 || m2) {
            this.f666i.post(new c());
        }
        if (this.t != null && (editText = this.f666i) != null) {
            this.t.setGravity((editText.getGravity() & -113) | 48);
            this.t.setPadding(this.f666i.getCompoundPaddingLeft(), this.f666i.getCompoundPaddingTop(), this.f666i.getCompoundPaddingRight(), this.f666i.getCompoundPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.e);
        setError(hVar.f675g);
        if (hVar.f676h) {
            this.i0.post(new b());
        }
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.f668k.c()) {
            hVar.f675g = getError();
        }
        hVar.f676h = f() && this.i0.f633g;
        return hVar;
    }

    public final void p() {
        if (this.f666i != null) {
            TextView textView = this.z;
            int i2 = 0;
            if (!(this.U.getVisibility() == 0)) {
                i2 = this.f666i.getPaddingLeft();
            }
            textView.setPadding(i2, this.f666i.getCompoundPaddingTop(), this.z.getCompoundPaddingRight(), this.f666i.getCompoundPaddingBottom());
        }
    }

    public final void q() {
        this.z.setVisibility((this.y == null || this.F0) ? 8 : 0);
        m();
    }

    public final void r() {
        if (this.f666i != null) {
            TextView textView = this.B;
            int paddingLeft = textView.getPaddingLeft();
            int paddingTop = this.f666i.getPaddingTop();
            int i2 = 0;
            if (!g()) {
                if (!(this.s0.getVisibility() == 0)) {
                    i2 = this.f666i.getPaddingRight();
                }
            }
            textView.setPadding(paddingLeft, paddingTop, i2, this.f666i.getPaddingBottom());
        }
    }

    public final void s() {
        int visibility = this.B.getVisibility();
        int i2 = 0;
        boolean z2 = this.A != null && !this.F0;
        TextView textView = this.B;
        if (!z2) {
            i2 = 8;
        }
        textView.setVisibility(i2);
        if (visibility != this.B.getVisibility()) {
            getEndIconDelegate().a(z2);
        }
        m();
    }

    public void setBoxBackgroundColor(int i2) {
        if (this.P != i2) {
            this.P = i2;
            this.A0 = i2;
            a();
        }
    }

    public void setBoxBackgroundColorResource(int i2) {
        setBoxBackgroundColor(h.h.f.a.a(getContext(), i2));
    }

    public void setBoxBackgroundMode(int i2) {
        if (i2 != this.J) {
            this.J = i2;
            if (this.f666i != null) {
                h();
            }
        }
    }

    public void setBoxStrokeColor(int i2) {
        if (this.y0 != i2) {
            this.y0 = i2;
            t();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.w0 = colorStateList.getDefaultColor();
            this.E0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.x0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.y0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.y0 != colorStateList.getDefaultColor()) {
            this.y0 = colorStateList.getDefaultColor();
        }
        t();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.z0 != colorStateList) {
            this.z0 = colorStateList;
            t();
        }
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f669l != z2) {
            if (z2) {
                z zVar = new z(getContext());
                this.f672o = zVar;
                zVar.setId(i.c.a.c.f.textinput_counter);
                Typeface typeface = this.T;
                if (typeface != null) {
                    this.f672o.setTypeface(typeface);
                }
                this.f672o.setMaxLines(1);
                this.f668k.a(this.f672o, 2);
                ((ViewGroup.MarginLayoutParams) this.f672o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(i.c.a.c.d.mtrl_textinput_counter_margin_start));
                l();
                k();
            } else {
                this.f668k.b(this.f672o, 2);
                this.f672o = null;
            }
            this.f669l = z2;
        }
    }

    public void setCounterMaxLength(int i2) {
        if (this.f670m != i2) {
            if (i2 > 0) {
                this.f670m = i2;
            } else {
                this.f670m = -1;
            }
            if (this.f669l) {
                k();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i2) {
        if (this.f673p != i2) {
            this.f673p = i2;
            l();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.x != colorStateList) {
            this.x = colorStateList;
            l();
        }
    }

    public void setCounterTextAppearance(int i2) {
        if (this.f674q != i2) {
            this.f674q = i2;
            l();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.w != colorStateList) {
            this.w = colorStateList;
            l();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.u0 = colorStateList;
        this.v0 = colorStateList;
        if (this.f666i != null) {
            a(false, false);
        }
    }

    public void setEnabled(boolean z2) {
        a((ViewGroup) this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.i0.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.i0.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i2) {
        setEndIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setEndIconDrawable(int i2) {
        setEndIconDrawable(i2 != 0 ? h.b.l.a.a.c(getContext(), i2) : null);
    }

    public void setEndIconMode(int i2) {
        int i3 = this.g0;
        this.g0 = i2;
        setEndIconVisible(i2 != 0);
        if (getEndIconDelegate().a(this.J)) {
            getEndIconDelegate().a();
            b();
            Iterator it = this.j0.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this, i3);
            }
            return;
        }
        StringBuilder a2 = i.a.a.a.a.a("The current box background mode ");
        a2.append(this.J);
        a2.append(" is not supported by the end icon mode ");
        a2.append(i2);
        throw new IllegalStateException(a2.toString());
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.i0;
        View.OnLongClickListener onLongClickListener = this.r0;
        checkableImageButton.setOnClickListener(onClickListener);
        a(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.r0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.i0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.k0 != colorStateList) {
            this.k0 = colorStateList;
            this.l0 = true;
            b();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.m0 != mode) {
            this.m0 = mode;
            this.n0 = true;
            b();
        }
    }

    public void setEndIconVisible(boolean z2) {
        if (g() != z2) {
            this.i0.setVisibility(z2 ? 0 : 8);
            r();
            m();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f668k.f4136l) {
            if (!TextUtils.isEmpty(charSequence)) {
                setErrorEnabled(true);
            } else {
                return;
            }
        }
        if (!TextUtils.isEmpty(charSequence)) {
            o oVar = this.f668k;
            oVar.b();
            oVar.f4135k = charSequence;
            oVar.f4137m.setText(charSequence);
            if (oVar.f4133i != 1) {
                oVar.f4134j = 1;
            }
            oVar.a(oVar.f4133i, oVar.f4134j, oVar.a(oVar.f4137m, charSequence));
            return;
        }
        this.f668k.e();
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        o oVar = this.f668k;
        oVar.f4138n = charSequence;
        TextView textView = oVar.f4137m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        o oVar = this.f668k;
        if (oVar.f4136l != z2) {
            oVar.b();
            if (z2) {
                z zVar = new z(oVar.a);
                oVar.f4137m = zVar;
                zVar.setId(i.c.a.c.f.textinput_error);
                oVar.f4137m.setTextAlignment(5);
                Typeface typeface = oVar.v;
                if (typeface != null) {
                    oVar.f4137m.setTypeface(typeface);
                }
                int i2 = oVar.f4139o;
                oVar.f4139o = i2;
                TextView textView = oVar.f4137m;
                if (textView != null) {
                    oVar.f4129b.a(textView, i2);
                }
                ColorStateList colorStateList = oVar.f4140p;
                oVar.f4140p = colorStateList;
                TextView textView2 = oVar.f4137m;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                CharSequence charSequence = oVar.f4138n;
                oVar.f4138n = charSequence;
                TextView textView3 = oVar.f4137m;
                if (textView3 != null) {
                    textView3.setContentDescription(charSequence);
                }
                oVar.f4137m.setVisibility(4);
                m.g(oVar.f4137m, 1);
                oVar.a(oVar.f4137m, 0);
            } else {
                oVar.e();
                oVar.b(oVar.f4137m, 0);
                oVar.f4137m = null;
                oVar.f4129b.n();
                oVar.f4129b.t();
            }
            oVar.f4136l = z2;
        }
    }

    public void setErrorIconDrawable(int i2) {
        setErrorIconDrawable(i2 != 0 ? h.b.l.a.a.c(getContext(), i2) : null);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.t0 = colorStateList;
        Drawable drawable = this.s0.getDrawable();
        if (drawable != null) {
            drawable = g.a.a.b.a.c(drawable).mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.s0.getDrawable() != drawable) {
            this.s0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.s0.getDrawable();
        if (drawable != null) {
            drawable = g.a.a.b.a.c(drawable).mutate();
            drawable.setTintMode(mode);
        }
        if (this.s0.getDrawable() != drawable) {
            this.s0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i2) {
        o oVar = this.f668k;
        oVar.f4139o = i2;
        TextView textView = oVar.f4137m;
        if (textView != null) {
            oVar.f4129b.a(textView, i2);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        o oVar = this.f668k;
        oVar.f4140p = colorStateList;
        TextView textView = oVar.f4137m;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (!this.f668k.r) {
                setHelperTextEnabled(true);
            }
            o oVar = this.f668k;
            oVar.b();
            oVar.f4141q = charSequence;
            oVar.s.setText(charSequence);
            if (oVar.f4133i != 2) {
                oVar.f4134j = 2;
            }
            oVar.a(oVar.f4133i, oVar.f4134j, oVar.a(oVar.s, charSequence));
        } else if (this.f668k.r) {
            setHelperTextEnabled(false);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        o oVar = this.f668k;
        oVar.u = colorStateList;
        TextView textView = oVar.s;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setHelperTextEnabled(boolean z2) {
        o oVar = this.f668k;
        if (oVar.r != z2) {
            oVar.b();
            if (z2) {
                z zVar = new z(oVar.a);
                oVar.s = zVar;
                zVar.setId(i.c.a.c.f.textinput_helper_text);
                oVar.s.setTextAlignment(5);
                Typeface typeface = oVar.v;
                if (typeface != null) {
                    oVar.s.setTypeface(typeface);
                }
                oVar.s.setVisibility(4);
                m.g(oVar.s, 1);
                int i2 = oVar.t;
                oVar.t = i2;
                TextView textView = oVar.s;
                if (textView != null) {
                    g.a.a.b.a.d(textView, i2);
                }
                ColorStateList colorStateList = oVar.u;
                oVar.u = colorStateList;
                TextView textView2 = oVar.s;
                if (!(textView2 == null || colorStateList == null)) {
                    textView2.setTextColor(colorStateList);
                }
                oVar.a(oVar.s, 1);
            } else {
                oVar.b();
                if (oVar.f4133i == 2) {
                    oVar.f4134j = 0;
                }
                oVar.a(oVar.f4133i, oVar.f4134j, oVar.a(oVar.s, (CharSequence) null));
                oVar.b(oVar.s, 1);
                oVar.s = null;
                oVar.f4129b.n();
                oVar.f4129b.t();
            }
            oVar.r = z2;
        }
    }

    public void setHelperTextTextAppearance(int i2) {
        o oVar = this.f668k;
        oVar.t = i2;
        TextView textView = oVar.s;
        if (textView != null) {
            g.a.a.b.a.d(textView, i2);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.H0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.C) {
            this.C = z2;
            if (!z2) {
                this.E = false;
                if (!TextUtils.isEmpty(this.D) && TextUtils.isEmpty(this.f666i.getHint())) {
                    this.f666i.setHint(this.D);
                }
                setHintInternal((CharSequence) null);
            } else {
                CharSequence hint = this.f666i.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.D)) {
                        setHint(hint);
                    }
                    this.f666i.setHint((CharSequence) null);
                }
                this.E = true;
            }
            if (this.f666i != null) {
                o();
            }
        }
    }

    public void setHintTextAppearance(int i2) {
        i.c.a.c.z.b bVar = this.G0;
        i.c.a.c.b0.b bVar2 = new i.c.a.c.b0.b(bVar.a.getContext(), i2);
        ColorStateList colorStateList = bVar2.f4027b;
        if (colorStateList != null) {
            bVar.f4265l = colorStateList;
        }
        float f2 = bVar2.a;
        if (f2 != 0.0f) {
            bVar.f4263j = f2;
        }
        ColorStateList colorStateList2 = bVar2.f4028f;
        if (colorStateList2 != null) {
            bVar.N = colorStateList2;
        }
        bVar.L = bVar2.f4029g;
        bVar.M = bVar2.f4030h;
        bVar.K = bVar2.f4031i;
        i.c.a.c.b0.a aVar = bVar.v;
        if (aVar != null) {
            aVar.c = true;
        }
        i.c.a.c.z.a aVar2 = new i.c.a.c.z.a(bVar);
        bVar2.a();
        bVar.v = new i.c.a.c.b0.a(aVar2, bVar2.f4034l);
        bVar2.a(bVar.a.getContext(), (i.c.a.c.b0.d) bVar.v);
        bVar.e();
        this.v0 = this.G0.f4265l;
        if (this.f666i != null) {
            a(false, false);
            o();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.v0 != colorStateList) {
            if (this.u0 == null) {
                i.c.a.c.z.b bVar = this.G0;
                if (bVar.f4265l != colorStateList) {
                    bVar.f4265l = colorStateList;
                    bVar.e();
                }
            }
            this.v0 = colorStateList;
            if (this.f666i != null) {
                a(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i2) {
        setPasswordVisibilityToggleContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i2) {
        setPasswordVisibilityToggleDrawable(i2 != 0 ? h.b.l.a.a.c(getContext(), i2) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        if (z2 && this.g0 != 1) {
            setEndIconMode(1);
        } else if (!z2) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.k0 = colorStateList;
        this.l0 = true;
        b();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.m0 = mode;
        this.n0 = true;
        b();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        int i2 = 0;
        if (!this.s || !TextUtils.isEmpty(charSequence)) {
            if (!this.s) {
                setPlaceholderTextEnabled(true);
            }
            this.r = charSequence;
        } else {
            setPlaceholderTextEnabled(false);
        }
        EditText editText = this.f666i;
        if (editText != null) {
            i2 = editText.getText().length();
        }
        b(i2);
    }

    public void setPlaceholderTextAppearance(int i2) {
        this.v = i2;
        TextView textView = this.t;
        if (textView != null) {
            g.a.a.b.a.d(textView, i2);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            TextView textView = this.t;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.y = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.z.setText(charSequence);
        q();
    }

    public void setPrefixTextAppearance(int i2) {
        g.a.a.b.a.d(this.z, i2);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.z.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z2) {
        this.U.setCheckable(z2);
    }

    public void setStartIconContentDescription(int i2) {
        setStartIconContentDescription(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setStartIconDrawable(int i2) {
        setStartIconDrawable(i2 != 0 ? h.b.l.a.a.c(getContext(), i2) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.U;
        View.OnLongClickListener onLongClickListener = this.e0;
        checkableImageButton.setOnClickListener(onClickListener);
        a(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.e0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.U;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        a(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            this.W = true;
            c();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.a0 != mode) {
            this.a0 = mode;
            this.b0 = true;
            c();
        }
    }

    public void setStartIconVisible(boolean z2) {
        int i2 = 0;
        if ((this.U.getVisibility() == 0) != z2) {
            CheckableImageButton checkableImageButton = this.U;
            if (!z2) {
                i2 = 8;
            }
            checkableImageButton.setVisibility(i2);
            p();
            m();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.B.setText(charSequence);
        s();
    }

    public void setSuffixTextAppearance(int i2) {
        g.a.a.b.a.d(this.B, i2);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f666i;
        if (editText != null) {
            m.a((View) editText, (h.h.m.a) eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.T) {
            this.T = typeface;
            this.G0.a(typeface);
            o oVar = this.f668k;
            if (typeface != oVar.v) {
                oVar.v = typeface;
                TextView textView = oVar.f4137m;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = oVar.s;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.f672o;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0012, code lost:
        r0 = r6.f666i;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void t() {
        /*
            r6 = this;
            i.c.a.c.e0.g r0 = r6.F
            if (r0 == 0) goto L_0x0119
            int r0 = r6.J
            if (r0 != 0) goto L_0x000a
            goto L_0x0119
        L_0x000a:
            boolean r0 = r6.isFocused()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x001f
            android.widget.EditText r0 = r6.f666i
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            boolean r3 = r6.isHovered()
            if (r3 != 0) goto L_0x0033
            android.widget.EditText r3 = r6.f666i
            if (r3 == 0) goto L_0x0031
            boolean r3 = r3.isHovered()
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            goto L_0x0034
        L_0x0033:
            r3 = 1
        L_0x0034:
            boolean r4 = r6.isEnabled()
            if (r4 != 0) goto L_0x003f
            int r4 = r6.E0
            r6.O = r4
            goto L_0x0081
        L_0x003f:
            i.c.a.c.h0.o r4 = r6.f668k
            boolean r4 = r4.c()
            if (r4 == 0) goto L_0x0058
            android.content.res.ColorStateList r4 = r6.z0
            if (r4 == 0) goto L_0x004f
            r6.b((boolean) r0, (boolean) r3)
            goto L_0x0081
        L_0x004f:
            i.c.a.c.h0.o r4 = r6.f668k
            int r4 = r4.d()
            r6.O = r4
            goto L_0x0081
        L_0x0058:
            boolean r4 = r6.f671n
            if (r4 == 0) goto L_0x006f
            android.widget.TextView r4 = r6.f672o
            if (r4 == 0) goto L_0x006f
            android.content.res.ColorStateList r5 = r6.z0
            if (r5 == 0) goto L_0x0068
            r6.b((boolean) r0, (boolean) r3)
            goto L_0x0081
        L_0x0068:
            int r4 = r4.getCurrentTextColor()
            r6.O = r4
            goto L_0x0081
        L_0x006f:
            if (r0 == 0) goto L_0x0076
            int r4 = r6.y0
            r6.O = r4
            goto L_0x0081
        L_0x0076:
            if (r3 == 0) goto L_0x007d
            int r4 = r6.x0
            r6.O = r4
            goto L_0x0081
        L_0x007d:
            int r4 = r6.w0
            r6.O = r4
        L_0x0081:
            android.graphics.drawable.Drawable r4 = r6.getErrorIconDrawable()
            if (r4 == 0) goto L_0x0094
            i.c.a.c.h0.o r4 = r6.f668k
            boolean r5 = r4.f4136l
            if (r5 == 0) goto L_0x0094
            boolean r4 = r4.c()
            if (r4 == 0) goto L_0x0094
            r1 = 1
        L_0x0094:
            r6.setErrorIconVisible(r1)
            com.google.android.material.internal.CheckableImageButton r1 = r6.s0
            android.content.res.ColorStateList r4 = r6.t0
            r6.a((com.google.android.material.internal.CheckableImageButton) r1, (android.content.res.ColorStateList) r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.U
            android.content.res.ColorStateList r4 = r6.V
            r6.a((com.google.android.material.internal.CheckableImageButton) r1, (android.content.res.ColorStateList) r4)
            com.google.android.material.internal.CheckableImageButton r1 = r6.i0
            android.content.res.ColorStateList r4 = r6.k0
            r6.a((com.google.android.material.internal.CheckableImageButton) r1, (android.content.res.ColorStateList) r4)
            i.c.a.c.h0.n r1 = r6.getEndIconDelegate()
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00e2
            i.c.a.c.h0.o r1 = r6.f668k
            boolean r1 = r1.c()
            if (r1 == 0) goto L_0x00df
            android.graphics.drawable.Drawable r1 = r6.getEndIconDrawable()
            if (r1 == 0) goto L_0x00df
            android.graphics.drawable.Drawable r1 = r6.getEndIconDrawable()
            android.graphics.drawable.Drawable r1 = g.a.a.b.a.c((android.graphics.drawable.Drawable) r1)
            android.graphics.drawable.Drawable r1 = r1.mutate()
            i.c.a.c.h0.o r4 = r6.f668k
            int r4 = r4.d()
            r1.setTint(r4)
            com.google.android.material.internal.CheckableImageButton r4 = r6.i0
            r4.setImageDrawable(r1)
            goto L_0x00e2
        L_0x00df:
            r6.b()
        L_0x00e2:
            if (r0 == 0) goto L_0x00ef
            boolean r1 = r6.isEnabled()
            if (r1 == 0) goto L_0x00ef
            int r1 = r6.N
            r6.L = r1
            goto L_0x00f3
        L_0x00ef:
            int r1 = r6.M
            r6.L = r1
        L_0x00f3:
            int r1 = r6.J
            if (r1 != r2) goto L_0x0116
            boolean r1 = r6.isEnabled()
            if (r1 != 0) goto L_0x0102
            int r0 = r6.B0
            r6.P = r0
            goto L_0x0116
        L_0x0102:
            if (r3 == 0) goto L_0x010b
            if (r0 != 0) goto L_0x010b
            int r0 = r6.D0
            r6.P = r0
            goto L_0x0116
        L_0x010b:
            if (r0 == 0) goto L_0x0112
            int r0 = r6.C0
            r6.P = r0
            goto L_0x0116
        L_0x0112:
            int r0 = r6.A0
            r6.P = r0
        L_0x0116:
            r6.a()
        L_0x0119:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.t():void");
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, i.c.a.c.b.textInputStyle);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.i0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.i0.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.s0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.f668k.f4136l);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.U.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.U.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            c();
            return;
        }
        setStartIconVisible(false);
        setStartIconOnClickListener((View.OnClickListener) null);
        setStartIconOnLongClickListener((View.OnLongClickListener) null);
        setStartIconContentDescription((CharSequence) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public TextInputLayout(android.content.Context r21, android.util.AttributeSet r22, int r23) {
        /*
            r20 = this;
            r0 = r20
            r7 = r22
            r8 = r23
            int r1 = L0
            r2 = r21
            android.content.Context r1 = i.c.a.c.j0.a.a.a(r2, r7, r8, r1)
            r0.<init>(r1, r7, r8)
            i.c.a.c.h0.o r1 = new i.c.a.c.h0.o
            r1.<init>(r0)
            r0.f668k = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.Q = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.R = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.S = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.f0 = r1
            r9 = 0
            r0.g0 = r9
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            r0.h0 = r1
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            r0.j0 = r1
            i.c.a.c.z.b r1 = new i.c.a.c.z.b
            r1.<init>(r0)
            r0.G0 = r1
            android.content.Context r10 = r20.getContext()
            r11 = 1
            r0.setOrientation(r11)
            r0.setWillNotDraw(r9)
            r0.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.e = r1
            r1.setAddStatesFromChildren(r11)
            android.widget.FrameLayout r1 = r0.e
            r0.addView(r1)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            r0.f663f = r1
            r1.setOrientation(r9)
            android.widget.LinearLayout r1 = r0.f663f
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r12 = -2
            r13 = -1
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r2.<init>(r12, r13, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.e
            android.widget.LinearLayout r2 = r0.f663f
            r1.addView(r2)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r10)
            r0.f664g = r1
            r1.setOrientation(r9)
            android.widget.LinearLayout r1 = r0.f664g
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388613(0x800005, float:1.175495E-38)
            r2.<init>(r12, r13, r3)
            r1.setLayoutParams(r2)
            android.widget.FrameLayout r1 = r0.e
            android.widget.LinearLayout r2 = r0.f664g
            r1.addView(r2)
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            r1.<init>(r10)
            r0.f665h = r1
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r2.<init>(r12, r13)
            r1.setLayoutParams(r2)
            i.c.a.c.z.b r1 = r0.G0
            android.animation.TimeInterpolator r2 = i.c.a.c.l.a.a
            r1.J = r2
            r1.e()
            i.c.a.c.z.b r1 = r0.G0
            android.animation.TimeInterpolator r2 = i.c.a.c.l.a.a
            r1.I = r2
            r1.e()
            i.c.a.c.z.b r1 = r0.G0
            r2 = 8388659(0x800033, float:1.1755015E-38)
            r1.a((int) r2)
            int[] r14 = i.c.a.c.k.TextInputLayout
            int r15 = L0
            r1 = 5
            int[] r6 = new int[r1]
            int r1 = i.c.a.c.k.TextInputLayout_counterTextAppearance
            r6[r9] = r1
            int r1 = i.c.a.c.k.TextInputLayout_counterOverflowTextAppearance
            r6[r11] = r1
            int r1 = i.c.a.c.k.TextInputLayout_errorTextAppearance
            r5 = 2
            r6[r5] = r1
            int r1 = i.c.a.c.k.TextInputLayout_helperTextTextAppearance
            r4 = 3
            r6[r4] = r1
            r1 = 4
            int r2 = i.c.a.c.k.TextInputLayout_hintTextAppearance
            r6[r1] = r2
            i.c.a.c.z.i.a(r10, r7, r8, r15)
            r1 = r10
            r2 = r22
            r3 = r14
            r12 = 3
            r4 = r23
            r12 = 2
            r5 = r15
            i.c.a.c.z.i.a(r1, r2, r3, r4, r5, r6)
            h.b.p.x0 r1 = new h.b.p.x0
            android.content.res.TypedArray r2 = r10.obtainStyledAttributes(r7, r14, r8, r15)
            r1.<init>(r10, r2)
            int r2 = i.c.a.c.k.TextInputLayout_hintEnabled
            boolean r2 = r1.a((int) r2, (boolean) r11)
            r0.C = r2
            int r2 = i.c.a.c.k.TextInputLayout_android_hint
            java.lang.CharSequence r2 = r1.e(r2)
            r0.setHint(r2)
            int r2 = i.c.a.c.k.TextInputLayout_hintAnimationEnabled
            boolean r2 = r1.a((int) r2, (boolean) r11)
            r0.H0 = r2
            int r2 = L0
            i.c.a.c.e0.j$b r2 = i.c.a.c.e0.j.a((android.content.Context) r10, (android.util.AttributeSet) r7, (int) r8, (int) r2)
            i.c.a.c.e0.j r2 = r2.a()
            r0.H = r2
            android.content.res.Resources r2 = r10.getResources()
            int r3 = i.c.a.c.d.mtrl_textinput_box_label_cutout_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            r0.I = r2
            int r2 = i.c.a.c.k.TextInputLayout_boxCollapsedPaddingTop
            int r2 = r1.b(r2, r9)
            r0.K = r2
            int r2 = i.c.a.c.k.TextInputLayout_boxStrokeWidth
            android.content.res.Resources r3 = r10.getResources()
            int r4 = i.c.a.c.d.mtrl_textinput_box_stroke_width_default
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.c(r2, r3)
            r0.M = r2
            int r2 = i.c.a.c.k.TextInputLayout_boxStrokeWidthFocused
            android.content.res.Resources r3 = r10.getResources()
            int r4 = i.c.a.c.d.mtrl_textinput_box_stroke_width_focused
            int r3 = r3.getDimensionPixelSize(r4)
            int r2 = r1.c(r2, r3)
            r0.N = r2
            int r2 = r0.M
            r0.L = r2
            int r2 = i.c.a.c.k.TextInputLayout_boxCornerRadiusTopStart
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r1.a((int) r2, (float) r3)
            int r4 = i.c.a.c.k.TextInputLayout_boxCornerRadiusTopEnd
            float r4 = r1.a((int) r4, (float) r3)
            int r5 = i.c.a.c.k.TextInputLayout_boxCornerRadiusBottomEnd
            float r5 = r1.a((int) r5, (float) r3)
            int r6 = i.c.a.c.k.TextInputLayout_boxCornerRadiusBottomStart
            float r3 = r1.a((int) r6, (float) r3)
            i.c.a.c.e0.j r6 = r0.H
            r7 = 0
            if (r6 == 0) goto L_0x061b
            i.c.a.c.e0.j$b r8 = new i.c.a.c.e0.j$b
            r8.<init>(r6)
            r6 = 0
            int r14 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r14 < 0) goto L_0x0193
            r8.c(r2)
        L_0x0193:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x019a
            r8.d(r4)
        L_0x019a:
            int r2 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01a1
            r8.b(r5)
        L_0x01a1:
            int r2 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r2 < 0) goto L_0x01a8
            r8.a((float) r3)
        L_0x01a8:
            i.c.a.c.e0.j r2 = r8.a()
            r0.H = r2
            int r2 = i.c.a.c.k.TextInputLayout_boxBackgroundColor
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r10, (h.b.p.x0) r1, (int) r2)
            if (r2 == 0) goto L_0x020a
            int r3 = r2.getDefaultColor()
            r0.A0 = r3
            r0.P = r3
            boolean r3 = r2.isStateful()
            r4 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            if (r3 == 0) goto L_0x01e8
            int[] r3 = new int[r11]
            r3[r9] = r4
            int r3 = r2.getColorForState(r3, r13)
            r0.B0 = r3
            int[] r3 = new int[r12]
            r3 = {16842908, 16842910} // fill-array
            int r3 = r2.getColorForState(r3, r13)
            r0.C0 = r3
            int[] r3 = new int[r12]
            r3 = {16843623, 16842910} // fill-array
            int r2 = r2.getColorForState(r3, r13)
            r0.D0 = r2
            goto L_0x0214
        L_0x01e8:
            int r2 = r0.A0
            r0.C0 = r2
            int r2 = i.c.a.c.c.mtrl_filled_background_color
            android.content.res.ColorStateList r2 = h.b.l.a.a.b(r10, r2)
            int[] r3 = new int[r11]
            r3[r9] = r4
            int r3 = r2.getColorForState(r3, r13)
            r0.B0 = r3
            int[] r3 = new int[r11]
            r4 = 16843623(0x1010367, float:2.3696E-38)
            r3[r9] = r4
            int r2 = r2.getColorForState(r3, r13)
            r0.D0 = r2
            goto L_0x0214
        L_0x020a:
            r0.P = r9
            r0.A0 = r9
            r0.B0 = r9
            r0.C0 = r9
            r0.D0 = r9
        L_0x0214:
            int r2 = i.c.a.c.k.TextInputLayout_android_textColorHint
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x0226
            int r2 = i.c.a.c.k.TextInputLayout_android_textColorHint
            android.content.res.ColorStateList r2 = r1.a(r2)
            r0.v0 = r2
            r0.u0 = r2
        L_0x0226:
            int r2 = i.c.a.c.k.TextInputLayout_boxStrokeColor
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r10, (h.b.p.x0) r1, (int) r2)
            int r3 = i.c.a.c.k.TextInputLayout_boxStrokeColor
            int r3 = r1.a((int) r3, (int) r9)
            r0.y0 = r3
            int r3 = i.c.a.c.c.mtrl_textinput_default_box_stroke_color
            int r3 = h.h.f.a.a((android.content.Context) r10, (int) r3)
            r0.w0 = r3
            int r3 = i.c.a.c.c.mtrl_textinput_disabled_color
            int r3 = h.h.f.a.a((android.content.Context) r10, (int) r3)
            r0.E0 = r3
            int r3 = i.c.a.c.c.mtrl_textinput_hovered_box_stroke_color
            int r3 = h.h.f.a.a((android.content.Context) r10, (int) r3)
            r0.x0 = r3
            if (r2 == 0) goto L_0x0251
            r0.setBoxStrokeColorStateList(r2)
        L_0x0251:
            int r2 = i.c.a.c.k.TextInputLayout_boxStrokeErrorColor
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x0262
            int r2 = i.c.a.c.k.TextInputLayout_boxStrokeErrorColor
            android.content.res.ColorStateList r2 = i.c.a.b.d.l.q.a((android.content.Context) r10, (h.b.p.x0) r1, (int) r2)
            r0.setBoxStrokeErrorColor(r2)
        L_0x0262:
            int r2 = i.c.a.c.k.TextInputLayout_hintTextAppearance
            int r2 = r1.f(r2, r13)
            if (r2 == r13) goto L_0x0273
            int r2 = i.c.a.c.k.TextInputLayout_hintTextAppearance
            int r2 = r1.f(r2, r9)
            r0.setHintTextAppearance(r2)
        L_0x0273:
            int r2 = i.c.a.c.k.TextInputLayout_errorTextAppearance
            int r2 = r1.f(r2, r9)
            int r3 = i.c.a.c.k.TextInputLayout_errorContentDescription
            java.lang.CharSequence r3 = r1.e(r3)
            int r4 = i.c.a.c.k.TextInputLayout_errorEnabled
            boolean r4 = r1.a((int) r4, (boolean) r9)
            android.content.Context r5 = r20.getContext()
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r5)
            int r6 = i.c.a.c.h.design_text_input_end_icon
            android.widget.LinearLayout r8 = r0.f664g
            android.view.View r5 = r5.inflate(r6, r8, r9)
            com.google.android.material.internal.CheckableImageButton r5 = (com.google.android.material.internal.CheckableImageButton) r5
            r0.s0 = r5
            r6 = 8
            r5.setVisibility(r6)
            int r5 = i.c.a.c.k.TextInputLayout_errorIconDrawable
            boolean r5 = r1.f(r5)
            if (r5 == 0) goto L_0x02af
            int r5 = i.c.a.c.k.TextInputLayout_errorIconDrawable
            android.graphics.drawable.Drawable r5 = r1.b(r5)
            r0.setErrorIconDrawable((android.graphics.drawable.Drawable) r5)
        L_0x02af:
            int r5 = i.c.a.c.k.TextInputLayout_errorIconTint
            boolean r5 = r1.f(r5)
            if (r5 == 0) goto L_0x02c0
            int r5 = i.c.a.c.k.TextInputLayout_errorIconTint
            android.content.res.ColorStateList r5 = i.c.a.b.d.l.q.a((android.content.Context) r10, (h.b.p.x0) r1, (int) r5)
            r0.setErrorIconTintList(r5)
        L_0x02c0:
            int r5 = i.c.a.c.k.TextInputLayout_errorIconTintMode
            boolean r5 = r1.f(r5)
            if (r5 == 0) goto L_0x02d5
            int r5 = i.c.a.c.k.TextInputLayout_errorIconTintMode
            int r5 = r1.d(r5, r13)
            android.graphics.PorterDuff$Mode r5 = i.c.a.b.d.l.q.a((int) r5, (android.graphics.PorterDuff.Mode) r7)
            r0.setErrorIconTintMode(r5)
        L_0x02d5:
            com.google.android.material.internal.CheckableImageButton r5 = r0.s0
            android.content.res.Resources r8 = r20.getResources()
            int r14 = i.c.a.c.i.error_icon_content_description
            java.lang.CharSequence r8 = r8.getText(r14)
            r5.setContentDescription(r8)
            com.google.android.material.internal.CheckableImageButton r5 = r0.s0
            h.h.m.m.h(r5, r12)
            com.google.android.material.internal.CheckableImageButton r5 = r0.s0
            r5.setClickable(r9)
            com.google.android.material.internal.CheckableImageButton r5 = r0.s0
            r5.setPressable(r9)
            com.google.android.material.internal.CheckableImageButton r5 = r0.s0
            r5.setFocusable(r9)
            int r5 = i.c.a.c.k.TextInputLayout_helperTextTextAppearance
            int r5 = r1.f(r5, r9)
            int r8 = i.c.a.c.k.TextInputLayout_helperTextEnabled
            boolean r8 = r1.a((int) r8, (boolean) r9)
            int r14 = i.c.a.c.k.TextInputLayout_helperText
            java.lang.CharSequence r14 = r1.e(r14)
            int r15 = i.c.a.c.k.TextInputLayout_placeholderTextAppearance
            int r15 = r1.f(r15, r9)
            int r12 = i.c.a.c.k.TextInputLayout_placeholderText
            java.lang.CharSequence r12 = r1.e(r12)
            int r11 = i.c.a.c.k.TextInputLayout_prefixTextAppearance
            int r11 = r1.f(r11, r9)
            int r7 = i.c.a.c.k.TextInputLayout_prefixText
            java.lang.CharSequence r7 = r1.e(r7)
            int r6 = i.c.a.c.k.TextInputLayout_suffixTextAppearance
            int r6 = r1.f(r6, r9)
            int r13 = i.c.a.c.k.TextInputLayout_suffixText
            java.lang.CharSequence r13 = r1.e(r13)
            r16 = r6
            int r6 = i.c.a.c.k.TextInputLayout_counterEnabled
            boolean r6 = r1.a((int) r6, (boolean) r9)
            int r9 = i.c.a.c.k.TextInputLayout_counterMaxLength
            r17 = r6
            r6 = -1
            int r9 = r1.d(r9, r6)
            r0.setCounterMaxLength(r9)
            int r6 = i.c.a.c.k.TextInputLayout_counterTextAppearance
            r9 = 0
            int r6 = r1.f(r6, r9)
            r0.f674q = r6
            int r6 = i.c.a.c.k.TextInputLayout_counterOverflowTextAppearance
            int r6 = r1.f(r6, r9)
            r0.f673p = r6
            android.content.Context r6 = r20.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r18 = r13
            int r13 = i.c.a.c.h.design_text_input_start_icon
            r19 = r11
            android.widget.LinearLayout r11 = r0.f663f
            android.view.View r6 = r6.inflate(r13, r11, r9)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.U = r6
            r9 = 8
            r6.setVisibility(r9)
            r6 = 0
            r0.setStartIconOnClickListener(r6)
            r0.setStartIconOnLongClickListener(r6)
            int r6 = i.c.a.c.k.TextInputLayout_startIconDrawable
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x03a3
            int r6 = i.c.a.c.k.TextInputLayout_startIconDrawable
            android.graphics.drawable.Drawable r6 = r1.b(r6)
            r0.setStartIconDrawable((android.graphics.drawable.Drawable) r6)
            int r6 = i.c.a.c.k.TextInputLayout_startIconContentDescription
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x0399
            int r6 = i.c.a.c.k.TextInputLayout_startIconContentDescription
            java.lang.CharSequence r6 = r1.e(r6)
            r0.setStartIconContentDescription((java.lang.CharSequence) r6)
        L_0x0399:
            int r6 = i.c.a.c.k.TextInputLayout_startIconCheckable
            r9 = 1
            boolean r6 = r1.a((int) r6, (boolean) r9)
            r0.setStartIconCheckable(r6)
        L_0x03a3:
            int r6 = i.c.a.c.k.TextInputLayout_startIconTint
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x03b4
            int r6 = i.c.a.c.k.TextInputLayout_startIconTint
            android.content.res.ColorStateList r6 = i.c.a.b.d.l.q.a((android.content.Context) r10, (h.b.p.x0) r1, (int) r6)
            r0.setStartIconTintList(r6)
        L_0x03b4:
            int r6 = i.c.a.c.k.TextInputLayout_startIconTintMode
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x03cb
            int r6 = i.c.a.c.k.TextInputLayout_startIconTintMode
            r9 = -1
            int r6 = r1.d(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = i.c.a.b.d.l.q.a((int) r6, (android.graphics.PorterDuff.Mode) r9)
            r0.setStartIconTintMode(r6)
        L_0x03cb:
            int r6 = i.c.a.c.k.TextInputLayout_boxBackgroundMode
            r9 = 0
            int r6 = r1.d(r6, r9)
            r0.setBoxBackgroundMode(r6)
            android.content.Context r6 = r20.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            int r11 = i.c.a.c.h.design_text_input_end_icon
            android.widget.FrameLayout r13 = r0.f665h
            android.view.View r6 = r6.inflate(r11, r13, r9)
            com.google.android.material.internal.CheckableImageButton r6 = (com.google.android.material.internal.CheckableImageButton) r6
            r0.i0 = r6
            android.widget.FrameLayout r9 = r0.f665h
            r9.addView(r6)
            com.google.android.material.internal.CheckableImageButton r6 = r0.i0
            r9 = 8
            r6.setVisibility(r9)
            android.util.SparseArray<i.c.a.c.h0.n> r6 = r0.h0
            i.c.a.c.h0.f r9 = new i.c.a.c.h0.f
            r9.<init>(r0)
            r11 = -1
            r6.append(r11, r9)
            android.util.SparseArray<i.c.a.c.h0.n> r6 = r0.h0
            i.c.a.c.h0.p r9 = new i.c.a.c.h0.p
            r9.<init>(r0)
            r11 = 0
            r6.append(r11, r9)
            android.util.SparseArray<i.c.a.c.h0.n> r6 = r0.h0
            i.c.a.c.h0.q r9 = new i.c.a.c.h0.q
            r9.<init>(r0)
            r11 = 1
            r6.append(r11, r9)
            android.util.SparseArray<i.c.a.c.h0.n> r6 = r0.h0
            i.c.a.c.h0.a r9 = new i.c.a.c.h0.a
            r9.<init>(r0)
            r11 = 2
            r6.append(r11, r9)
            android.util.SparseArray<i.c.a.c.h0.n> r6 = r0.h0
            i.c.a.c.h0.h r9 = new i.c.a.c.h0.h
            r9.<init>(r0)
            r11 = 3
            r6.append(r11, r9)
            int r6 = i.c.a.c.k.TextInputLayout_endIconMode
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x046b
            int r6 = i.c.a.c.k.TextInputLayout_endIconMode
            r9 = 0
            int r6 = r1.d(r6, r9)
            r0.setEndIconMode(r6)
            int r6 = i.c.a.c.k.TextInputLayout_endIconDrawable
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x044f
            int r6 = i.c.a.c.k.TextInputLayout_endIconDrawable
            android.graphics.drawable.Drawable r6 = r1.b(r6)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r6)
        L_0x044f:
            int r6 = i.c.a.c.k.TextInputLayout_endIconContentDescription
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x0460
            int r6 = i.c.a.c.k.TextInputLayout_endIconContentDescription
            java.lang.CharSequence r6 = r1.e(r6)
            r0.setEndIconContentDescription((java.lang.CharSequence) r6)
        L_0x0460:
            int r6 = i.c.a.c.k.TextInputLayout_endIconCheckable
            r9 = 1
            boolean r6 = r1.a((int) r6, (boolean) r9)
            r0.setEndIconCheckable(r6)
            goto L_0x04b7
        L_0x046b:
            int r6 = i.c.a.c.k.TextInputLayout_passwordToggleEnabled
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x04b7
            int r6 = i.c.a.c.k.TextInputLayout_passwordToggleEnabled
            r9 = 0
            boolean r6 = r1.a((int) r6, (boolean) r9)
            r0.setEndIconMode(r6)
            int r6 = i.c.a.c.k.TextInputLayout_passwordToggleDrawable
            android.graphics.drawable.Drawable r6 = r1.b(r6)
            r0.setEndIconDrawable((android.graphics.drawable.Drawable) r6)
            int r6 = i.c.a.c.k.TextInputLayout_passwordToggleContentDescription
            java.lang.CharSequence r6 = r1.e(r6)
            r0.setEndIconContentDescription((java.lang.CharSequence) r6)
            int r6 = i.c.a.c.k.TextInputLayout_passwordToggleTint
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x04a0
            int r6 = i.c.a.c.k.TextInputLayout_passwordToggleTint
            android.content.res.ColorStateList r6 = i.c.a.b.d.l.q.a((android.content.Context) r10, (h.b.p.x0) r1, (int) r6)
            r0.setEndIconTintList(r6)
        L_0x04a0:
            int r6 = i.c.a.c.k.TextInputLayout_passwordToggleTintMode
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x04b7
            int r6 = i.c.a.c.k.TextInputLayout_passwordToggleTintMode
            r9 = -1
            int r6 = r1.d(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = i.c.a.b.d.l.q.a((int) r6, (android.graphics.PorterDuff.Mode) r9)
            r0.setEndIconTintMode(r6)
        L_0x04b7:
            int r6 = i.c.a.c.k.TextInputLayout_passwordToggleEnabled
            boolean r6 = r1.f(r6)
            if (r6 != 0) goto L_0x04e7
            int r6 = i.c.a.c.k.TextInputLayout_endIconTint
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x04d0
            int r6 = i.c.a.c.k.TextInputLayout_endIconTint
            android.content.res.ColorStateList r6 = i.c.a.b.d.l.q.a((android.content.Context) r10, (h.b.p.x0) r1, (int) r6)
            r0.setEndIconTintList(r6)
        L_0x04d0:
            int r6 = i.c.a.c.k.TextInputLayout_endIconTintMode
            boolean r6 = r1.f(r6)
            if (r6 == 0) goto L_0x04e7
            int r6 = i.c.a.c.k.TextInputLayout_endIconTintMode
            r9 = -1
            int r6 = r1.d(r6, r9)
            r9 = 0
            android.graphics.PorterDuff$Mode r6 = i.c.a.b.d.l.q.a((int) r6, (android.graphics.PorterDuff.Mode) r9)
            r0.setEndIconTintMode(r6)
        L_0x04e7:
            h.b.p.z r6 = new h.b.p.z
            r6.<init>(r10)
            r0.z = r6
            int r9 = i.c.a.c.f.textinput_prefix_text
            r6.setId(r9)
            android.widget.TextView r6 = r0.z
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r11 = -2
            r9.<init>(r11, r11)
            r6.setLayoutParams(r9)
            android.widget.TextView r6 = r0.z
            r9 = 1
            r6.setAccessibilityLiveRegion(r9)
            android.widget.LinearLayout r6 = r0.f663f
            com.google.android.material.internal.CheckableImageButton r9 = r0.U
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.f663f
            android.widget.TextView r9 = r0.z
            r6.addView(r9)
            h.b.p.z r6 = new h.b.p.z
            r6.<init>(r10)
            r0.B = r6
            int r9 = i.c.a.c.f.textinput_suffix_text
            r6.setId(r9)
            android.widget.TextView r6 = r0.B
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r10 = 80
            r11 = -2
            r9.<init>(r11, r11, r10)
            r6.setLayoutParams(r9)
            android.widget.TextView r6 = r0.B
            r9 = 1
            r6.setAccessibilityLiveRegion(r9)
            android.widget.LinearLayout r6 = r0.f664g
            android.widget.TextView r9 = r0.B
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.f664g
            com.google.android.material.internal.CheckableImageButton r9 = r0.s0
            r6.addView(r9)
            android.widget.LinearLayout r6 = r0.f664g
            android.widget.FrameLayout r9 = r0.f665h
            r6.addView(r9)
            r0.setHelperTextEnabled(r8)
            r0.setHelperText(r14)
            r0.setHelperTextTextAppearance(r5)
            r0.setErrorEnabled(r4)
            r0.setErrorTextAppearance(r2)
            r0.setErrorContentDescription(r3)
            int r2 = r0.f674q
            r0.setCounterTextAppearance(r2)
            int r2 = r0.f673p
            r0.setCounterOverflowTextAppearance(r2)
            r0.setPlaceholderText(r12)
            r0.setPlaceholderTextAppearance(r15)
            r0.setPrefixText(r7)
            r2 = r19
            r0.setPrefixTextAppearance(r2)
            r2 = r18
            r0.setSuffixText(r2)
            r2 = r16
            r0.setSuffixTextAppearance(r2)
            int r2 = i.c.a.c.k.TextInputLayout_errorTextColor
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x058b
            int r2 = i.c.a.c.k.TextInputLayout_errorTextColor
            android.content.res.ColorStateList r2 = r1.a(r2)
            r0.setErrorTextColor(r2)
        L_0x058b:
            int r2 = i.c.a.c.k.TextInputLayout_helperTextTextColor
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x059c
            int r2 = i.c.a.c.k.TextInputLayout_helperTextTextColor
            android.content.res.ColorStateList r2 = r1.a(r2)
            r0.setHelperTextColor(r2)
        L_0x059c:
            int r2 = i.c.a.c.k.TextInputLayout_hintTextColor
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x05ad
            int r2 = i.c.a.c.k.TextInputLayout_hintTextColor
            android.content.res.ColorStateList r2 = r1.a(r2)
            r0.setHintTextColor(r2)
        L_0x05ad:
            int r2 = i.c.a.c.k.TextInputLayout_counterTextColor
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x05be
            int r2 = i.c.a.c.k.TextInputLayout_counterTextColor
            android.content.res.ColorStateList r2 = r1.a(r2)
            r0.setCounterTextColor(r2)
        L_0x05be:
            int r2 = i.c.a.c.k.TextInputLayout_counterOverflowTextColor
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x05cf
            int r2 = i.c.a.c.k.TextInputLayout_counterOverflowTextColor
            android.content.res.ColorStateList r2 = r1.a(r2)
            r0.setCounterOverflowTextColor(r2)
        L_0x05cf:
            int r2 = i.c.a.c.k.TextInputLayout_placeholderTextColor
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x05e0
            int r2 = i.c.a.c.k.TextInputLayout_placeholderTextColor
            android.content.res.ColorStateList r2 = r1.a(r2)
            r0.setPlaceholderTextColor(r2)
        L_0x05e0:
            int r2 = i.c.a.c.k.TextInputLayout_prefixTextColor
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x05f1
            int r2 = i.c.a.c.k.TextInputLayout_prefixTextColor
            android.content.res.ColorStateList r2 = r1.a(r2)
            r0.setPrefixTextColor(r2)
        L_0x05f1:
            int r2 = i.c.a.c.k.TextInputLayout_suffixTextColor
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L_0x0602
            int r2 = i.c.a.c.k.TextInputLayout_suffixTextColor
            android.content.res.ColorStateList r2 = r1.a(r2)
            r0.setSuffixTextColor(r2)
        L_0x0602:
            r2 = r17
            r0.setCounterEnabled(r2)
            int r2 = i.c.a.c.k.TextInputLayout_android_enabled
            r3 = 1
            boolean r2 = r1.a((int) r2, (boolean) r3)
            r0.setEnabled(r2)
            android.content.res.TypedArray r1 = r1.f1492b
            r1.recycle()
            r1 = 2
            r0.setImportantForAccessibility(r1)
            return
        L_0x061b:
            r1 = r7
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.i0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.i0.setImageDrawable(drawable);
    }

    public final int b(int i2, boolean z2) {
        int compoundPaddingRight = i2 - this.f666i.getCompoundPaddingRight();
        if (this.y == null || !z2) {
            return compoundPaddingRight;
        }
        return this.z.getPaddingRight() + this.z.getMeasuredWidth() + compoundPaddingRight;
    }

    public final void b() {
        a(this.i0, this.l0, this.k0, this.n0, this.m0);
    }

    public final void b(boolean z2, boolean z3) {
        int defaultColor = this.z0.getDefaultColor();
        int colorForState = this.z0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.z0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z2) {
            this.O = colorForState2;
        } else if (z3) {
            this.O = colorForState;
        } else {
            this.O = defaultColor;
        }
    }

    public void a(int i2) {
        boolean z2 = this.f671n;
        int i3 = this.f670m;
        if (i3 == -1) {
            this.f672o.setText(String.valueOf(i2));
            this.f672o.setContentDescription((CharSequence) null);
            this.f671n = false;
        } else {
            this.f671n = i2 > i3;
            Context context = getContext();
            this.f672o.setContentDescription(context.getString(this.f671n ? i.character_counter_overflowed_content_description : i.character_counter_content_description, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f670m)}));
            if (z2 != this.f671n) {
                l();
            }
            this.f672o.setText(getContext().getString(i.character_counter_pattern, new Object[]{Integer.valueOf(i2), Integer.valueOf(this.f670m)}));
        }
        if (this.f666i != null && z2 != this.f671n) {
            a(false, false);
            t();
            n();
        }
    }

    public static void a(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, z2);
            }
        }
    }

    public void a(TextView textView, int i2) {
        boolean z2 = true;
        try {
            g.a.a.b.a.d(textView, i2);
            if (Build.VERSION.SDK_INT < 23 || textView.getTextColors().getDefaultColor() != -65281) {
                z2 = false;
            }
        } catch (Exception unused) {
        }
        if (z2) {
            g.a.a.b.a.d(textView, j.TextAppearance_AppCompat_Caption);
            textView.setTextColor(h.h.f.a.a(getContext(), i.c.a.c.c.design_error));
        }
    }

    public final int a(int i2, boolean z2) {
        int compoundPaddingLeft = this.f666i.getCompoundPaddingLeft() + i2;
        return (this.y == null || z2) ? compoundPaddingLeft : (compoundPaddingLeft - this.z.getMeasuredWidth()) + this.z.getPaddingLeft();
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r6 = this;
            i.c.a.c.e0.g r0 = r6.F
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            i.c.a.c.e0.j r1 = r6.H
            r0.setShapeAppearanceModel(r1)
            int r0 = r6.J
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L_0x0021
            int r0 = r6.L
            if (r0 <= r2) goto L_0x001c
            int r0 = r6.O
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            if (r0 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x002e
            i.c.a.c.e0.g r0 = r6.F
            int r1 = r6.L
            float r1 = (float) r1
            int r5 = r6.O
            r0.a((float) r1, (int) r5)
        L_0x002e:
            int r0 = r6.P
            int r1 = r6.J
            if (r1 != r4) goto L_0x0044
            int r0 = i.c.a.c.b.colorSurface
            android.content.Context r1 = r6.getContext()
            int r0 = i.c.a.b.d.l.q.a((android.content.Context) r1, (int) r0, (int) r3)
            int r1 = r6.P
            int r0 = h.h.g.a.a(r1, r0)
        L_0x0044:
            r6.P = r0
            i.c.a.c.e0.g r1 = r6.F
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.a((android.content.res.ColorStateList) r0)
            int r0 = r6.g0
            r1 = 3
            if (r0 != r1) goto L_0x005d
            android.widget.EditText r0 = r6.f666i
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L_0x005d:
            i.c.a.c.e0.g r0 = r6.G
            if (r0 != 0) goto L_0x0062
            goto L_0x007b
        L_0x0062:
            int r0 = r6.L
            if (r0 <= r2) goto L_0x006b
            int r0 = r6.O
            if (r0 == 0) goto L_0x006b
            r3 = 1
        L_0x006b:
            if (r3 == 0) goto L_0x0078
            i.c.a.c.e0.g r0 = r6.G
            int r1 = r6.O
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.a((android.content.res.ColorStateList) r1)
        L_0x0078:
            r6.invalidate()
        L_0x007b:
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.a():void");
    }

    public void a(f fVar) {
        this.f0.add(fVar);
        if (this.f666i != null) {
            fVar.a(this);
        }
    }

    public final void a(CheckableImageButton checkableImageButton, boolean z2, ColorStateList colorStateList, boolean z3, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z2 || z3)) {
            drawable = g.a.a.b.a.c(drawable).mutate();
            if (z2) {
                drawable.setTintList(colorStateList);
            }
            if (z3) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static void a(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean t2 = m.t(checkableImageButton);
        boolean z2 = false;
        int i2 = 1;
        boolean z3 = onLongClickListener != null;
        if (t2 || z3) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(t2);
        checkableImageButton.setPressable(t2);
        checkableImageButton.setLongClickable(z3);
        if (!z2) {
            i2 = 2;
        }
        checkableImageButton.setImportantForAccessibility(i2);
    }

    public final void a(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
            Drawable mutate = g.a.a.b.a.c(drawable).mutate();
            mutate.setTintList(ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public void a(float f2) {
        if (this.G0.c != f2) {
            if (this.I0 == null) {
                ValueAnimator valueAnimator = new ValueAnimator();
                this.I0 = valueAnimator;
                valueAnimator.setInterpolator(i.c.a.c.l.a.f4148b);
                this.I0.setDuration(167);
                this.I0.addUpdateListener(new d());
            }
            this.I0.setFloatValues(new float[]{this.G0.c, f2});
            this.I0.start();
        }
    }
}
