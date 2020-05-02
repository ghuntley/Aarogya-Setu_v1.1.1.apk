package i.c.a.c.h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import h.h.m.m;
import i.c.a.b.d.l.q;
import i.c.a.c.d;
import java.util.ArrayList;
import java.util.List;

/* compiled from: IndicatorViewController */
public final class o {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final TextInputLayout f4129b;
    public LinearLayout c;
    public int d;
    public FrameLayout e;

    /* renamed from: f  reason: collision with root package name */
    public int f4130f;

    /* renamed from: g  reason: collision with root package name */
    public Animator f4131g;

    /* renamed from: h  reason: collision with root package name */
    public final float f4132h;

    /* renamed from: i  reason: collision with root package name */
    public int f4133i;

    /* renamed from: j  reason: collision with root package name */
    public int f4134j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f4135k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f4136l;

    /* renamed from: m  reason: collision with root package name */
    public TextView f4137m;

    /* renamed from: n  reason: collision with root package name */
    public CharSequence f4138n;

    /* renamed from: o  reason: collision with root package name */
    public int f4139o;

    /* renamed from: p  reason: collision with root package name */
    public ColorStateList f4140p;

    /* renamed from: q  reason: collision with root package name */
    public CharSequence f4141q;
    public boolean r;
    public TextView s;
    public int t;
    public ColorStateList u;
    public Typeface v;

    /* compiled from: IndicatorViewController */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ int a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ TextView f4142b;
        public final /* synthetic */ int c;
        public final /* synthetic */ TextView d;

        public a(int i2, TextView textView, int i3, TextView textView2) {
            this.a = i2;
            this.f4142b = textView;
            this.c = i3;
            this.d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            TextView textView;
            o oVar = o.this;
            oVar.f4133i = this.a;
            oVar.f4131g = null;
            TextView textView2 = this.f4142b;
            if (textView2 != null) {
                textView2.setVisibility(4);
                if (this.c == 1 && (textView = o.this.f4137m) != null) {
                    textView.setText((CharSequence) null);
                }
            }
            TextView textView3 = this.d;
            if (textView3 != null) {
                textView3.setTranslationY(0.0f);
                this.d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public o(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.a = context;
        this.f4129b = textInputLayout;
        this.f4132h = (float) context.getResources().getDimensionPixelSize(d.design_textinput_caption_translate_y);
    }

    public final boolean a(TextView textView, CharSequence charSequence) {
        return m.x(this.f4129b) && this.f4129b.isEnabled() && (this.f4134j != this.f4133i || textView == null || !TextUtils.equals(textView.getText(), charSequence));
    }

    public void b() {
        Animator animator = this.f4131g;
        if (animator != null) {
            animator.cancel();
        }
    }

    public boolean c() {
        if (this.f4134j != 1 || this.f4137m == null || TextUtils.isEmpty(this.f4135k)) {
            return false;
        }
        return true;
    }

    public int d() {
        TextView textView = this.f4137m;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public void e() {
        this.f4135k = null;
        b();
        if (this.f4133i == 1) {
            if (!this.r || TextUtils.isEmpty(this.f4141q)) {
                this.f4134j = 0;
            } else {
                this.f4134j = 2;
            }
        }
        a(this.f4133i, this.f4134j, a(this.f4137m, (CharSequence) null));
    }

    public void b(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.c != null) {
            if (!(i2 == 0 || i2 == 1) || (frameLayout = this.e) == null) {
                this.c.removeView(textView);
            } else {
                int i3 = this.f4130f - 1;
                this.f4130f = i3;
                if (i3 == 0) {
                    frameLayout.setVisibility(8);
                }
                this.e.removeView(textView);
            }
            int i4 = this.d - 1;
            this.d = i4;
            LinearLayout linearLayout = this.c;
            if (i4 == 0) {
                linearLayout.setVisibility(8);
            }
        }
    }

    public final void a(int i2, int i3, boolean z) {
        TextView a2;
        TextView a3;
        int i4 = i2;
        int i5 = i3;
        boolean z2 = z;
        if (i4 != i5) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f4131g = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i6 = i2;
                int i7 = i3;
                a(arrayList2, this.r, this.s, 2, i6, i7);
                a(arrayList2, this.f4136l, this.f4137m, 1, i6, i7);
                q.a(animatorSet, (List<Animator>) arrayList);
                animatorSet.addListener(new a(i3, a(i2), i2, a(i5)));
                animatorSet.start();
            } else if (i4 != i5) {
                if (!(i5 == 0 || (a3 = a(i5)) == null)) {
                    a3.setVisibility(0);
                    a3.setAlpha(1.0f);
                }
                if (!(i4 == 0 || (a2 = a(i2)) == null)) {
                    a2.setVisibility(4);
                    if (i4 == 1) {
                        a2.setText((CharSequence) null);
                    }
                }
                this.f4133i = i5;
            }
            this.f4129b.n();
            this.f4129b.a(z2, false);
            this.f4129b.t();
        }
    }

    public final void a(List<Animator> list, boolean z, TextView textView, int i2, int i3, int i4) {
        if (textView != null && z) {
            if (i2 == i4 || i2 == i3) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{i4 == i2 ? 1.0f : 0.0f});
                ofFloat.setDuration(167);
                ofFloat.setInterpolator(i.c.a.c.l.a.a);
                list.add(ofFloat);
                if (i4 == i2) {
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f4132h, 0.0f});
                    ofFloat2.setDuration(217);
                    ofFloat2.setInterpolator(i.c.a.c.l.a.d);
                    list.add(ofFloat2);
                }
            }
        }
    }

    public final TextView a(int i2) {
        if (i2 == 1) {
            return this.f4137m;
        }
        if (i2 != 2) {
            return null;
        }
        return this.s;
    }

    public void a() {
        if ((this.c == null || this.f4129b.getEditText() == null) ? false : true) {
            this.c.setPaddingRelative(m.o(this.f4129b.getEditText()), 0, this.f4129b.getEditText().getPaddingEnd(), 0);
        }
    }

    public void a(TextView textView, int i2) {
        if (this.c == null && this.e == null) {
            LinearLayout linearLayout = new LinearLayout(this.a);
            this.c = linearLayout;
            linearLayout.setOrientation(0);
            this.f4129b.addView(this.c, -1, -2);
            this.e = new FrameLayout(this.a);
            this.c.addView(this.e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f4129b.getEditText() != null) {
                a();
            }
        }
        if (i2 == 0 || i2 == 1) {
            this.e.setVisibility(0);
            this.e.addView(textView);
            this.f4130f++;
        } else {
            this.c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.c.setVisibility(0);
        this.d++;
    }
}
