package i.c.a.c.m;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import g.a.a.b.a;
import h.h.m.m;
import h.h.m.v;

/* compiled from: HeaderScrollingViewBehavior */
public abstract class f extends g<View> {
    public final Rect d = new Rect();
    public final Rect e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public int f4164f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f4165g;

    public f() {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i4, int i5) {
        AppBarLayout a;
        v lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (a = ((AppBarLayout.ScrollingViewBehavior) this).a(coordinatorLayout.a(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i4);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (m.h(a) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.a() + lastWindowInsets.d();
        }
        coordinatorLayout.a(view, i2, i3, View.MeasureSpec.makeMeasureSpec((size + a.getTotalScrollRange()) - a.getMeasuredHeight(), i6 == -1 ? 1073741824 : RecyclerView.UNDEFINED_DURATION), i5);
        return true;
    }

    public void b(CoordinatorLayout coordinatorLayout, View view, int i2) {
        AppBarLayout a = ((AppBarLayout.ScrollingViewBehavior) this).a(coordinatorLayout.a(view));
        if (a != null) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
            Rect rect = this.d;
            rect.set(coordinatorLayout.getPaddingLeft() + fVar.leftMargin, a.getBottom() + fVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - fVar.rightMargin, ((a.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - fVar.bottomMargin);
            v lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && m.h(coordinatorLayout) && !view.getFitsSystemWindows()) {
                rect.left = lastWindowInsets.b() + rect.left;
                rect.right -= lastWindowInsets.c();
            }
            Rect rect2 = this.e;
            int i3 = fVar.c;
            Gravity.apply(i3 == 0 ? 8388659 : i3, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i2);
            int a2 = a(a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            this.f4164f = rect2.top - a.getBottom();
            return;
        }
        coordinatorLayout.b(view, i2);
        this.f4164f = 0;
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final int a(View view) {
        int i2;
        if (this.f4165g == 0) {
            return 0;
        }
        float f2 = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            CoordinatorLayout.c cVar = ((CoordinatorLayout.f) appBarLayout.getLayoutParams()).a;
            int c = cVar instanceof AppBarLayout.BaseBehavior ? ((AppBarLayout.BaseBehavior) cVar).c() : 0;
            if ((downNestedPreScrollRange == 0 || totalScrollRange + c > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f2 = 1.0f + (((float) c) / ((float) i2));
            }
        }
        int i3 = this.f4165g;
        return a.a((int) (f2 * ((float) i3)), 0, i3);
    }
}
