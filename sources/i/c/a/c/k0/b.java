package i.c.a.c.k0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.material.transformation.FabTransformationBehavior;
import i.c.a.c.u.c;

/* compiled from: FabTransformationBehavior */
public class b extends AnimatorListenerAdapter {
    public final /* synthetic */ c a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Drawable f4147b;

    public b(FabTransformationBehavior fabTransformationBehavior, c cVar, Drawable drawable) {
        this.a = cVar;
        this.f4147b = drawable;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.setCircularRevealOverlayDrawable((Drawable) null);
    }

    public void onAnimationStart(Animator animator) {
        this.a.setCircularRevealOverlayDrawable(this.f4147b);
    }
}
