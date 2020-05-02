package i.c.a.c.f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public class a extends AnimatorListenerAdapter {
    public final /* synthetic */ BaseTransientBottomBar a;

    public a(BaseTransientBottomBar baseTransientBottomBar) {
        this.a = baseTransientBottomBar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.b();
    }
}
