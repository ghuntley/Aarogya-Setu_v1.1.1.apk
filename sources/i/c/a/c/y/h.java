package i.c.a.c.y;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import i.c.a.c.d0.b;
import java.util.ArrayList;

/* compiled from: FloatingActionButtonImplLollipop */
public class h extends e {
    public h(FloatingActionButton floatingActionButton, b bVar) {
        super(floatingActionButton, bVar);
    }

    public void a(float f2, float f3, float f4) {
        if (Build.VERSION.SDK_INT == 21) {
            this.t.refreshDrawableState();
        } else {
            StateListAnimator stateListAnimator = new StateListAnimator();
            stateListAnimator.addState(e.B, a(f2, f4));
            stateListAnimator.addState(e.C, a(f2, f3));
            stateListAnimator.addState(e.D, a(f2, f3));
            stateListAnimator.addState(e.E, a(f2, f3));
            AnimatorSet animatorSet = new AnimatorSet();
            ArrayList arrayList = new ArrayList();
            arrayList.add(ObjectAnimator.ofFloat(this.t, "elevation", new float[]{f2}).setDuration(0));
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 22 && i2 <= 24) {
                FloatingActionButton floatingActionButton = this.t;
                arrayList.add(ObjectAnimator.ofFloat(floatingActionButton, View.TRANSLATION_Z, new float[]{floatingActionButton.getTranslationZ()}).setDuration(100));
            }
            arrayList.add(ObjectAnimator.ofFloat(this.t, View.TRANSLATION_Z, new float[]{0.0f}).setDuration(100));
            animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
            animatorSet.setInterpolator(e.A);
            stateListAnimator.addState(e.F, animatorSet);
            stateListAnimator.addState(e.G, a(0.0f, 0.0f));
            this.t.setStateListAnimator(stateListAnimator);
        }
        if (i()) {
            m();
        }
    }

    public void a(ColorStateList colorStateList) {
    }

    public void d() {
    }

    public void e() {
        m();
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return FloatingActionButton.this.f627n || !k();
    }

    public void l() {
    }

    public final Animator a(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.t, "elevation", new float[]{f2}).setDuration(0)).with(ObjectAnimator.ofFloat(this.t, View.TRANSLATION_Z, new float[]{f3}).setDuration(100));
        animatorSet.setInterpolator(e.A);
        return animatorSet;
    }

    public float a() {
        return this.t.getElevation();
    }

    public void a(int[] iArr) {
        if (Build.VERSION.SDK_INT != 21) {
            return;
        }
        if (this.t.isEnabled()) {
            this.t.setElevation(this.e);
            if (this.t.isPressed()) {
                this.t.setTranslationZ(this.f4246g);
            } else if (this.t.isFocused() || this.t.isHovered()) {
                this.t.setTranslationZ(this.f4245f);
            } else {
                this.t.setTranslationZ(0.0f);
            }
        } else {
            this.t.setElevation(0.0f);
            this.t.setTranslationZ(0.0f);
        }
    }

    public void a(Rect rect) {
        if (FloatingActionButton.this.f627n) {
            super.a(rect);
        } else if (!k()) {
            int sizeDimension = (0 - this.t.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        } else {
            rect.set(0, 0, 0, 0);
        }
    }
}
