package i.c.a.c.m;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior */
public class g<V extends View> extends CoordinatorLayout.c<V> {
    public h a;

    /* renamed from: b  reason: collision with root package name */
    public int f4166b = 0;
    public int c = 0;

    public g() {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i2) {
        b(coordinatorLayout, v, i2);
        if (this.a == null) {
            this.a = new h(v);
        }
        h hVar = this.a;
        hVar.f4167b = hVar.a.getTop();
        hVar.c = hVar.a.getLeft();
        this.a.a();
        int i3 = this.f4166b;
        if (i3 != 0) {
            h hVar2 = this.a;
            if (hVar2.f4168f && hVar2.d != i3) {
                hVar2.d = i3;
                hVar2.a();
            }
            this.f4166b = 0;
        }
        int i4 = this.c;
        if (i4 == 0) {
            return true;
        }
        h hVar3 = this.a;
        if (hVar3.f4169g && hVar3.e != i4) {
            hVar3.e = i4;
            hVar3.a();
        }
        this.c = 0;
        return true;
    }

    public void b(CoordinatorLayout coordinatorLayout, V v, int i2) {
        coordinatorLayout.b(v, i2);
    }

    public int b() {
        h hVar = this.a;
        if (hVar != null) {
            return hVar.d;
        }
        return 0;
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(int i2) {
        h hVar = this.a;
        if (hVar == null) {
            this.f4166b = i2;
            return false;
        } else if (!hVar.f4168f || hVar.d == i2) {
            return false;
        } else {
            hVar.d = i2;
            hVar.a();
            return true;
        }
    }
}
