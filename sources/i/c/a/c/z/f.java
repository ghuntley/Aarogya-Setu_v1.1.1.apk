package i.c.a.c.z;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;

/* compiled from: StateListAnimator */
public final class f {
    public final ArrayList<b> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public b f4275b = null;
    public ValueAnimator c = null;
    public final Animator.AnimatorListener d = new a();

    /* compiled from: StateListAnimator */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        public void onAnimationEnd(Animator animator) {
            f fVar = f.this;
            if (fVar.c == animator) {
                fVar.c = null;
            }
        }
    }

    /* compiled from: StateListAnimator */
    public static class b {
        public final int[] a;

        /* renamed from: b  reason: collision with root package name */
        public final ValueAnimator f4276b;

        public b(int[] iArr, ValueAnimator valueAnimator) {
            this.a = iArr;
            this.f4276b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.a.add(bVar);
    }
}
