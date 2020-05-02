package i.c.a.c.y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import i.c.a.c.y.e;

/* compiled from: FloatingActionButtonImpl */
public class c extends AnimatorListenerAdapter {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f4242b;
    public final /* synthetic */ e.f c;
    public final /* synthetic */ e d;

    public c(e eVar, boolean z, e.f fVar) {
        this.d = eVar;
        this.f4242b = z;
        this.c = fVar;
    }

    public void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    public void onAnimationEnd(Animator animator) {
        e eVar = this.d;
        eVar.f4255p = 0;
        eVar.f4250k = null;
        if (!this.a) {
            eVar.t.a(this.f4242b ? 8 : 4, this.f4242b);
            e.f fVar = this.c;
            if (fVar != null) {
                b bVar = (b) fVar;
                bVar.a.a(bVar.f4241b);
            }
        }
    }

    public void onAnimationStart(Animator animator) {
        this.d.t.a(0, this.f4242b);
        e eVar = this.d;
        eVar.f4255p = 1;
        eVar.f4250k = animator;
        this.a = false;
    }
}
