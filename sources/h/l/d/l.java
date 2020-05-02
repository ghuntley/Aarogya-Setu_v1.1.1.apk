package h.l.d;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import h.l.b;
import h.l.c;
import i.a.a.a.a;
import java.util.ArrayList;

/* compiled from: FragmentContainerView */
public final class l extends FrameLayout {
    public ArrayList<View> e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList<View> f1998f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1999g = true;

    public l(Context context, AttributeSet attributeSet, r rVar) {
        super(context, attributeSet);
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.FragmentContainerView);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(c.FragmentContainerView_android_name) : classAttribute;
        String string = obtainStyledAttributes.getString(c.FragmentContainerView_android_tag);
        obtainStyledAttributes.recycle();
        int id = getId();
        Fragment b2 = rVar.b(id);
        if (classAttribute != null && b2 == null) {
            if (id <= 0) {
                throw new IllegalStateException(a.a("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? a.b(" with tag ", string) : ""));
            }
            Fragment a = rVar.g().a(context.getClassLoader(), classAttribute);
            a.a(attributeSet, (Bundle) null);
            a aVar = new a(rVar);
            aVar.f1925o = true;
            a.J = this;
            aVar.a(getId(), a, string, 1);
            aVar.b();
        }
    }

    public final void a(View view) {
        ArrayList<View> arrayList;
        if (view.getAnimation() != null || ((arrayList = this.f1998f) != null && arrayList.contains(view))) {
            if (this.e == null) {
                this.e = new ArrayList<>();
            }
            this.e.add(view);
        }
    }

    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        Object tag = view.getTag(b.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public boolean addViewInLayout(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        Object tag = view.getTag(b.fragment_container_view_tag);
        if ((tag instanceof Fragment ? (Fragment) tag : null) != null) {
            return super.addViewInLayout(view, i2, layoutParams, z);
        }
        throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
    }

    public void dispatchDraw(Canvas canvas) {
        if (this.f1999g && this.e != null) {
            for (int i2 = 0; i2 < this.e.size(); i2++) {
                super.drawChild(canvas, this.e.get(i2), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        ArrayList<View> arrayList;
        if (!this.f1999g || (arrayList = this.e) == null || arrayList.size() <= 0 || !this.e.contains(view)) {
            return super.drawChild(canvas, view, j2);
        }
        return false;
    }

    public void endViewTransition(View view) {
        ArrayList<View> arrayList = this.f1998f;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList<View> arrayList2 = this.e;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.f1999g = true;
            }
        }
        super.endViewTransition(view);
    }

    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).dispatchApplyWindowInsets(new WindowInsets(windowInsets));
        }
        return windowInsets;
    }

    public void removeAllViewsInLayout() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            a(getChildAt(childCount));
        }
        super.removeAllViewsInLayout();
    }

    public void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    public void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    public void removeViewAt(int i2) {
        a(getChildAt(i2));
        super.removeViewAt(i2);
    }

    public void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    public void removeViews(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViews(i2, i3);
    }

    public void removeViewsInLayout(int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            a(getChildAt(i4));
        }
        super.removeViewsInLayout(i2, i3);
    }

    public void setDrawDisappearingViewsLast(boolean z) {
        this.f1999g = z;
    }

    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    public void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.f1998f == null) {
                this.f1998f = new ArrayList<>();
            }
            this.f1998f.add(view);
        }
        super.startViewTransition(view);
    }
}
