package i.c.a.c.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar */
public class a extends AnimatorListenerAdapter {
    public final /* synthetic */ BottomAppBar a;

    public a(BottomAppBar bottomAppBar) {
        this.a = bottomAppBar;
    }

    public void onAnimationEnd(Animator animator) {
        BottomAppBar.a(this.a);
    }

    public void onAnimationStart(Animator animator) {
        this.a.W++;
    }
}
