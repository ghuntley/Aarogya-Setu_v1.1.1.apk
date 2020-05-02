package h.f.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import h.f.a.h.d;
import h.f.a.h.h;
import java.util.Arrays;

/* compiled from: ConstraintHelper */
public abstract class b extends View {
    public int[] e = new int[32];

    /* renamed from: f  reason: collision with root package name */
    public int f1679f;

    /* renamed from: g  reason: collision with root package name */
    public Context f1680g;

    /* renamed from: h  reason: collision with root package name */
    public h f1681h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1682i = false;

    /* renamed from: j  reason: collision with root package name */
    public String f1683j;

    public b(Context context) {
        super(context);
        this.f1680g = context;
        a((AttributeSet) null);
    }

    private void setIds(String str) {
        if (str != null) {
            int i2 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i2);
                if (indexOf == -1) {
                    a(str.substring(i2));
                    return;
                } else {
                    a(str.substring(i2, indexOf));
                    i2 = indexOf + 1;
                }
            }
        }
    }

    public void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == g.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1683j = string;
                    setIds(string);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.e, this.f1679f);
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i2, int i3) {
        if (this.f1682i) {
            super.onMeasure(i2, i3);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1679f = 0;
        for (int tag : iArr) {
            setTag(tag, (Object) null);
        }
    }

    public void setTag(int i2, Object obj) {
        int i3 = this.f1679f + 1;
        int[] iArr = this.e;
        if (i3 > iArr.length) {
            this.e = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.e;
        int i4 = this.f1679f;
        iArr2[i4] = i2;
        this.f1679f = i4 + 1;
    }

    public void a() {
        if (this.f1681h != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.a) {
                ((ConstraintLayout.a) layoutParams).k0 = this.f1681h;
            }
        }
    }

    public final void a(String str) {
        int i2;
        Object a;
        if (str != null && this.f1680g != null) {
            String trim = str.trim();
            try {
                i2 = f.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = this.f1680g.getResources().getIdentifier(trim, "id", this.f1680g.getPackageName());
            }
            if (i2 == 0 && isInEditMode() && (getParent() instanceof ConstraintLayout) && (a = ((ConstraintLayout) getParent()).a(0, (Object) trim)) != null && (a instanceof Integer)) {
                i2 = ((Integer) a).intValue();
            }
            if (i2 != 0) {
                setTag(i2, (Object) null);
                return;
            }
            Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public void a(ConstraintLayout constraintLayout) {
        if (isInEditMode()) {
            setIds(this.f1683j);
        }
        h hVar = this.f1681h;
        if (hVar != null) {
            hVar.l0 = 0;
            for (int i2 = 0; i2 < this.f1679f; i2++) {
                View view = constraintLayout.e.get(this.e[i2]);
                if (view != null) {
                    h hVar2 = this.f1681h;
                    d a = constraintLayout.a(view);
                    int i3 = hVar2.l0 + 1;
                    d[] dVarArr = hVar2.k0;
                    if (i3 > dVarArr.length) {
                        hVar2.k0 = (d[]) Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    }
                    d[] dVarArr2 = hVar2.k0;
                    int i4 = hVar2.l0;
                    dVarArr2[i4] = a;
                    hVar2.l0 = i4 + 1;
                }
            }
        }
    }
}
