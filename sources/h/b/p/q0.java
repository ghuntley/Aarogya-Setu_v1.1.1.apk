package h.b.p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import h.b.b;
import h.b.d;
import h.b.j;
import h.b.k.a;

/* compiled from: ScrollingTabContainerView */
public class q0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    public Runnable e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f1457f;

    /* renamed from: g  reason: collision with root package name */
    public int f1458g;

    /* renamed from: h  reason: collision with root package name */
    public int f1459h;

    /* renamed from: i  reason: collision with root package name */
    public int f1460i;

    /* renamed from: j  reason: collision with root package name */
    public int f1461j;

    /* compiled from: ScrollingTabContainerView */
    public class a extends LinearLayout {
        public a.c e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q0 f1462f;

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        public void onMeasure(int i2, int i3) {
            int i4;
            super.onMeasure(i2, i3);
            if (this.f1462f.f1458g > 0 && getMeasuredWidth() > (i4 = this.f1462f.f1458g)) {
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i4, 1073741824), i3);
            }
        }

        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (z2 && z) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.e;
        if (runnable != null) {
            post(runnable);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, j.ActionBar, h.b.a.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0);
        Resources resources = context.getResources();
        if (!context.getResources().getBoolean(b.abc_action_bar_embed_tabs)) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(d.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        setContentHeight(layoutDimension);
        this.f1459h = context.getResources().getDimensionPixelSize(d.abc_action_bar_stacked_tab_max_width);
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.e;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
        ((a) view).e.a();
    }

    public void onMeasure(int i2, int i3) {
        setFillViewport(View.MeasureSpec.getMode(i2) == 1073741824);
        throw null;
    }

    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f1457f = z;
    }

    public void setContentHeight(int i2) {
        this.f1460i = i2;
        requestLayout();
    }

    public void setTabSelected(int i2) {
        this.f1461j = i2;
        throw null;
    }
}
