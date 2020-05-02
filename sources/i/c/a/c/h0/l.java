package i.c.a.c.h0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: DropdownMenuEndIconDelegate */
public class l extends AnimatorListenerAdapter {
    public final /* synthetic */ h a;

    public l(h hVar) {
        this.a = hVar;
    }

    public void onAnimationEnd(Animator animator) {
        h hVar = this.a;
        hVar.c.setChecked(hVar.f4119h);
        this.a.f4125n.start();
    }
}
