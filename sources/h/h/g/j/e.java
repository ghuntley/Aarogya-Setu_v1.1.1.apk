package h.h.g.j;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* compiled from: WrappedDrawableState */
public final class e extends Drawable.ConstantState {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public Drawable.ConstantState f1774b;
    public ColorStateList c = null;
    public PorterDuff.Mode d = c.f1767k;

    public e(e eVar) {
        if (eVar != null) {
            this.a = eVar.a;
            this.f1774b = eVar.f1774b;
            this.c = eVar.c;
            this.d = eVar.d;
        }
    }

    public int getChangingConfigurations() {
        int i2 = this.a;
        Drawable.ConstantState constantState = this.f1774b;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    public Drawable newDrawable() {
        return new d(this, (Resources) null);
    }

    public Drawable newDrawable(Resources resources) {
        return new d(this, resources);
    }
}
