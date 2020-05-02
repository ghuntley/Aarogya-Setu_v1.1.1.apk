package i.c.a.c.y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

/* compiled from: ExtendedFloatingActionButton */
public class a extends AnimatorListenerAdapter {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f4240b;
    public final /* synthetic */ ExtendedFloatingActionButton.c c = null;

    public a(ExtendedFloatingActionButton extendedFloatingActionButton, i iVar) {
        this.f4240b = iVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
        this.f4240b.c();
    }

    public void onAnimationEnd(Animator animator) {
        this.f4240b.b();
        if (!this.a) {
            this.f4240b.a((ExtendedFloatingActionButton.c) null);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.f4240b.onAnimationStart(animator);
        this.a = false;
    }
}
