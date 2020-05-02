package i.c.a.c.f0;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import i.c.a.c.l.a;

/* compiled from: BaseTransientBottomBar */
public class m implements Runnable {
    public final /* synthetic */ BaseTransientBottomBar e;

    public m(BaseTransientBottomBar baseTransientBottomBar) {
        this.e = baseTransientBottomBar;
    }

    public void run() {
        BaseTransientBottomBar.i iVar = this.e.c;
        if (iVar != null) {
            iVar.setVisibility(0);
            if (this.e.c.getAnimationMode() == 1) {
                BaseTransientBottomBar baseTransientBottomBar = this.e;
                if (baseTransientBottomBar != null) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    ofFloat.setInterpolator(a.a);
                    ofFloat.addUpdateListener(new c(baseTransientBottomBar));
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
                    ofFloat2.setInterpolator(a.d);
                    ofFloat2.addUpdateListener(new d(baseTransientBottomBar));
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2});
                    animatorSet.setDuration(150);
                    animatorSet.addListener(new a(baseTransientBottomBar));
                    animatorSet.start();
                    return;
                }
                throw null;
            }
            BaseTransientBottomBar baseTransientBottomBar2 = this.e;
            int a = baseTransientBottomBar2.a();
            baseTransientBottomBar2.c.setTranslationY((float) a);
            ValueAnimator valueAnimator = new ValueAnimator();
            valueAnimator.setIntValues(new int[]{a, 0});
            valueAnimator.setInterpolator(a.f4148b);
            valueAnimator.setDuration(250);
            valueAnimator.addListener(new e(baseTransientBottomBar2));
            valueAnimator.addUpdateListener(new f(baseTransientBottomBar2, a));
            valueAnimator.start();
        }
    }
}
