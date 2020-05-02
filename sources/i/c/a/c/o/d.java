package i.c.a.c.o;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: BottomAppBar */
public class d extends AnimatorListenerAdapter {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f4171b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ BottomAppBar e;

    public d(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i2, boolean z) {
        this.e = bottomAppBar;
        this.f4171b = actionMenuView;
        this.c = i2;
        this.d = z;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.a) {
            this.f4171b.setTranslationX((float) this.e.a(this.f4171b, this.c, this.d));
        }
    }
}
