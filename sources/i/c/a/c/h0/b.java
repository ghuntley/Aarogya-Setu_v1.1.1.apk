package i.c.a.c.h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: ClearTextEndIconDelegate */
public class b extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;

    public b(a aVar) {
        this.a = aVar;
    }

    public void onAnimationStart(Animator animator) {
        this.a.a.setEndIconVisible(true);
    }
}
