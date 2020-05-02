package i.c.a.c.f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public class g extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f4109b;

    public g(BaseTransientBottomBar baseTransientBottomBar, int i2) {
        this.f4109b = baseTransientBottomBar;
        this.a = i2;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4109b.b(this.a);
    }

    public void onAnimationStart(Animator animator) {
        this.f4109b.d.a(0, 180);
    }
}
