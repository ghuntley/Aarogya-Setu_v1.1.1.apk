package h.w;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import h.e.a;

/* compiled from: Transition */
public class j extends AnimatorListenerAdapter {
    public final /* synthetic */ a a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f2287b;

    public j(i iVar, a aVar) {
        this.f2287b = iVar;
        this.a = aVar;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.remove(animator);
        this.f2287b.A.remove(animator);
    }

    public void onAnimationStart(Animator animator) {
        this.f2287b.A.add(animator);
    }
}
