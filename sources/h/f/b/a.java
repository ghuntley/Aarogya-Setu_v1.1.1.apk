package h.f.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* compiled from: Barrier */
public class a extends b {

    /* renamed from: k  reason: collision with root package name */
    public int f1676k;

    /* renamed from: l  reason: collision with root package name */
    public int f1677l;

    /* renamed from: m  reason: collision with root package name */
    public h.f.a.h.a f1678m;

    public a(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public void a(AttributeSet attributeSet) {
        super.a(attributeSet);
        this.f1678m = new h.f.a.h.a();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == g.ConstraintLayout_Layout_barrierDirection) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == g.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.f1678m.o0 = obtainStyledAttributes.getBoolean(index, true);
                }
            }
        }
        this.f1681h = this.f1678m;
        a();
    }

    public int getType() {
        return this.f1676k;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f1678m.o0 = z;
    }

    public void setType(int i2) {
        this.f1676k = i2;
        this.f1677l = i2;
        if (1 == getResources().getConfiguration().getLayoutDirection()) {
            int i3 = this.f1676k;
            if (i3 == 5) {
                this.f1677l = 1;
            } else if (i3 == 6) {
                this.f1677l = 0;
            }
        } else {
            int i4 = this.f1676k;
            if (i4 == 5) {
                this.f1677l = 0;
            } else if (i4 == 6) {
                this.f1677l = 1;
            }
        }
        this.f1678m.m0 = this.f1677l;
    }
}
