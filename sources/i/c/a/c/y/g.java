package i.c.a.c.y;

import android.view.ViewTreeObserver;

/* compiled from: FloatingActionButtonImpl */
public class g implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ e e;

    public g(e eVar) {
        this.e = eVar;
    }

    public boolean onPreDraw() {
        e eVar = this.e;
        float rotation = eVar.t.getRotation();
        if (eVar.f4253n == rotation) {
            return true;
        }
        eVar.f4253n = rotation;
        eVar.l();
        return true;
    }
}
