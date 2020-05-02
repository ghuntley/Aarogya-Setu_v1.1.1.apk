package i.c.a.c.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar */
public class e extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomAppBar a;

    public e(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationStart(Animator animator) {
        this.a.c0.onAnimationStart(animator);
        FloatingActionButton h2 = this.a.h();
        if (h2 != null) {
            h2.setTranslationX(this.a.getFabTranslationX());
        }
    }
}
