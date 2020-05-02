package i.c.a.c.f0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.snackbar.BaseTransientBottomBar;

/* compiled from: BaseTransientBottomBar */
public class b extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BaseTransientBottomBar f4107b;

    public b(BaseTransientBottomBar baseTransientBottomBar, int i2) {
        this.f4107b = baseTransientBottomBar;
        this.a = i2;
    }

    public void onAnimationEnd(Animator animator) {
        this.f4107b.b(this.a);
    }
}
