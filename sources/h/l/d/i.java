package h.l.d;

import android.animation.Animator;
import android.view.animation.Animation;

/* compiled from: FragmentAnim */
public class i {
    public final Animation a;

    /* renamed from: b  reason: collision with root package name */
    public final Animator f1984b;

    public i(Animation animation) {
        this.a = animation;
        this.f1984b = null;
        if (animation == null) {
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    public i(Animator animator) {
        this.a = null;
        this.f1984b = animator;
        if (animator == null) {
            throw new IllegalStateException("Animator cannot be null");
        }
    }
}
