package i.c.a.c.y;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import i.c.a.c.y.e;

/* compiled from: FloatingActionButtonImpl */
public class d extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e.f f4243b;
    public final /* synthetic */ e c;

    public d(e eVar, boolean z, e.f fVar) {
        this.c = eVar;
        this.a = z;
        this.f4243b = fVar;
    }

    public void onAnimationEnd(Animator animator) {
        e eVar = this.c;
        eVar.f4255p = 0;
        eVar.f4250k = null;
        e.f fVar = this.f4243b;
        if (fVar != null) {
            b bVar = (b) fVar;
            bVar.a.b(bVar.f4241b);
        }
    }

    public void onAnimationStart(Animator animator) {
        this.c.t.a(0, this.a);
        e eVar = this.c;
        eVar.f4255p = 2;
        eVar.f4250k = animator;
    }
}
