package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import h.b.j;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public int f153f;

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<View> f154g;

    /* renamed from: h  reason: collision with root package name */
    public LayoutInflater f155h;

    /* renamed from: i  reason: collision with root package name */
    public a f156i;

    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public View a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.e != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f155h;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.e, viewGroup, false);
            int i2 = this.f153f;
            if (i2 != -1) {
                inflate.setId(i2);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f154g = new WeakReference<>(inflate);
            a aVar = this.f156i;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f153f;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f155h;
    }

    public int getLayoutResource() {
        return this.e;
    }

    public void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i2) {
        this.f153f = i2;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f155h = layoutInflater;
    }

    public void setLayoutResource(int i2) {
        this.e = i2;
    }

    public void setOnInflateListener(a aVar) {
        this.f156i = aVar;
    }

    public void setVisibility(int i2) {
        WeakReference<View> weakReference = this.f154g;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i2);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i2);
        if (i2 == 0 || i2 == 4) {
            a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ViewStubCompat, i2, 0);
        this.f153f = obtainStyledAttributes.getResourceId(j.ViewStubCompat_android_inflatedId, -1);
        this.e = obtainStyledAttributes.getResourceId(j.ViewStubCompat_android_layout, 0);
        setId(obtainStyledAttributes.getResourceId(j.ViewStubCompat_android_id, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
