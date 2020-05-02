package h.l.d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* compiled from: FragmentManager */
public class s extends AnimatorListenerAdapter {
    public final /* synthetic */ ViewGroup a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ View f2021b;
    public final /* synthetic */ Fragment c;

    public s(r rVar, ViewGroup viewGroup, View view, Fragment fragment) {
        this.a = viewGroup;
        this.f2021b = view;
        this.c = fragment;
    }

    public void onAnimationEnd(Animator animator) {
        this.a.endViewTransition(this.f2021b);
        animator.removeListener(this);
        Fragment fragment = this.c;
        View view = fragment.K;
        if (view != null && fragment.C) {
            view.setVisibility(8);
        }
    }
}
