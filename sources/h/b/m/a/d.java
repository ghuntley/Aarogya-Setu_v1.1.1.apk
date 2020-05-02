package h.b.m.a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;
import h.b.m.a.b;

@SuppressLint({"RestrictedAPI"})
/* compiled from: StateListDrawable */
public class d extends b {

    /* renamed from: q  reason: collision with root package name */
    public a f1207q;
    public boolean r;

    /* compiled from: StateListDrawable */
    public static class a extends b.c {
        public int[][] J;

        public a(a aVar, d dVar, Resources resources) {
            super(aVar, dVar, resources);
            if (aVar != null) {
                this.J = aVar.J;
            } else {
                this.J = new int[this.f1196g.length][];
            }
        }

        public int a(int[] iArr) {
            int[][] iArr2 = this.J;
            int i2 = this.f1197h;
            for (int i3 = 0; i3 < i2; i3++) {
                if (StateSet.stateSetMatches(iArr2[i3], iArr)) {
                    return i3;
                }
            }
            return -1;
        }

        public void d() {
            int[][] iArr = this.J;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[][] iArr3 = this.J;
                iArr2[length] = iArr3[length] != null ? (int[]) iArr3[length].clone() : null;
            }
            this.J = iArr2;
        }

        public Drawable newDrawable() {
            return new d(this, (Resources) null);
        }

        public Drawable newDrawable(Resources resources) {
            return new d(this, resources);
        }
    }

    public d(a aVar, Resources resources) {
        a(new a(aVar, this, resources));
        onStateChange(getState());
    }

    public void applyTheme(Resources.Theme theme) {
        b.c cVar = this.e;
        if (cVar != null) {
            if (theme != null) {
                cVar.c();
                int i2 = cVar.f1197h;
                Drawable[] drawableArr = cVar.f1196g;
                for (int i3 = 0; i3 < i2; i3++) {
                    if (drawableArr[i3] != null && drawableArr[i3].canApplyTheme()) {
                        drawableArr[i3].applyTheme(theme);
                        cVar.e |= drawableArr[i3].getChangingConfigurations();
                    }
                }
                cVar.a(theme.getResources());
            }
            onStateChange(getState());
            return;
        }
        throw null;
    }

    public boolean isStateful() {
        return true;
    }

    public Drawable mutate() {
        if (!this.r) {
            super.mutate();
            if (this == this) {
                this.f1207q.d();
                this.r = true;
            }
        }
        return this;
    }

    public boolean onStateChange(int[] iArr) {
        boolean z;
        Drawable drawable = this.f1185h;
        if (drawable != null) {
            z = drawable.setState(iArr);
        } else {
            Drawable drawable2 = this.f1184g;
            z = drawable2 != null ? drawable2.setState(iArr) : false;
        }
        int a2 = this.f1207q.a(iArr);
        if (a2 < 0) {
            a2 = this.f1207q.a(StateSet.WILD_CARD);
        }
        if (a(a2) || z) {
            return true;
        }
        return false;
    }

    public a a() {
        return new a(this.f1207q, this, (Resources) null);
    }

    public void a(b.c cVar) {
        super.a(cVar);
        if (cVar instanceof a) {
            this.f1207q = (a) cVar;
        }
    }

    public d(a aVar) {
        if (aVar != null) {
            a(aVar);
        }
    }
}
