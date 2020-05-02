package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import h.h.m.m;
import i.c.a.c.k;
import i.c.a.c.l.g;
import i.c.a.c.y.i;
import java.util.List;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.b {
    public final i v;
    public final i w;
    public final i x;
    public final i y;
    public boolean z;

    public static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.c<T> {
        public Rect a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f618b;
        public boolean c;

        public ExtendedFloatingActionButtonBehavior() {
            this.f618b = false;
            this.c = true;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            return false;
        }

        public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            if (view2 instanceof AppBarLayout) {
                a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton);
            } else {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) {
                    b(view2, extendedFloatingActionButton);
                }
            }
            return false;
        }

        public boolean a(CoordinatorLayout coordinatorLayout, View view, int i2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) view;
            List<View> a2 = coordinatorLayout.a((View) extendedFloatingActionButton);
            int size = a2.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view2 = a2.get(i3);
                if (!(view2 instanceof AppBarLayout)) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if ((layoutParams instanceof CoordinatorLayout.f ? ((CoordinatorLayout.f) layoutParams).a instanceof BottomSheetBehavior : false) && b(view2, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (a(coordinatorLayout, (AppBarLayout) view2, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.b(extendedFloatingActionButton, i2);
            return true;
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, k.ExtendedFloatingActionButton_Behavior_Layout);
            this.f618b = obtainStyledAttributes.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.c = obtainStyledAttributes.getBoolean(k.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }

        public final boolean b(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            i iVar;
            i iVar2;
            if (!a(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                if (this.c) {
                    iVar2 = extendedFloatingActionButton.v;
                } else {
                    iVar2 = extendedFloatingActionButton.y;
                }
                ExtendedFloatingActionButton.a(extendedFloatingActionButton, iVar2);
                return true;
            }
            if (this.c) {
                iVar = extendedFloatingActionButton.w;
            } else {
                iVar = extendedFloatingActionButton.x;
            }
            ExtendedFloatingActionButton.a(extendedFloatingActionButton, iVar);
            return true;
        }

        public void a(CoordinatorLayout.f fVar) {
            if (fVar.f197h == 0) {
                fVar.f197h = 80;
            }
        }

        public final boolean a(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) extendedFloatingActionButton.getLayoutParams();
            if ((this.f618b || this.c) && fVar.f195f == view.getId()) {
                return true;
            }
            return false;
        }

        public final boolean a(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            i iVar;
            i iVar2;
            if (!a(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.a == null) {
                this.a = new Rect();
            }
            Rect rect = this.a;
            i.c.a.c.z.c.a((ViewGroup) coordinatorLayout, (View) appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                if (this.c) {
                    iVar2 = extendedFloatingActionButton.v;
                } else {
                    iVar2 = extendedFloatingActionButton.y;
                }
                ExtendedFloatingActionButton.a(extendedFloatingActionButton, iVar2);
                return true;
            }
            if (this.c) {
                iVar = extendedFloatingActionButton.w;
            } else {
                iVar = extendedFloatingActionButton.x;
            }
            ExtendedFloatingActionButton.a(extendedFloatingActionButton, iVar);
            return true;
        }
    }

    public static class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().width);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().width = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public static class b extends Property<View, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf((float) ((View) obj).getLayoutParams().height);
        }

        public void set(Object obj, Object obj2) {
            View view = (View) obj;
            view.getLayoutParams().height = ((Float) obj2).intValue();
            view.requestLayout();
        }
    }

    public static abstract class c {
    }

    static {
        Class<Float> cls = Float.class;
        new a(cls, "width");
        new b(cls, "height");
    }

    public static /* synthetic */ void a(ExtendedFloatingActionButton extendedFloatingActionButton, i iVar) {
        if (extendedFloatingActionButton == null) {
            throw null;
        } else if (!iVar.e()) {
            if (!(m.x(extendedFloatingActionButton) && !extendedFloatingActionButton.isInEditMode())) {
                iVar.f();
                iVar.a((c) null);
                return;
            }
            extendedFloatingActionButton.measure(0, 0);
            AnimatorSet a2 = iVar.a();
            a2.addListener(new i.c.a.c.y.a(extendedFloatingActionButton, iVar));
            for (Animator.AnimatorListener addListener : iVar.d()) {
                a2.addListener(addListener);
            }
            a2.start();
        }
    }

    public CoordinatorLayout.c<ExtendedFloatingActionButton> getBehavior() {
        return null;
    }

    public int getCollapsedSize() {
        return getIconSize() + (Math.min(m.o(this), getPaddingEnd()) * 2);
    }

    public g getExtendMotionSpec() {
        throw null;
    }

    public g getHideMotionSpec() {
        throw null;
    }

    public g getShowMotionSpec() {
        throw null;
    }

    public g getShrinkMotionSpec() {
        throw null;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.z && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.z = false;
            throw null;
        }
    }

    public void setExtendMotionSpec(g gVar) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i2) {
        setExtendMotionSpec(g.a(getContext(), i2));
    }

    public void setExtended(boolean z2) {
        if (this.z != z2) {
            i iVar = null;
            if (!iVar.e()) {
                iVar.f();
            }
        }
    }

    public void setHideMotionSpec(g gVar) {
        throw null;
    }

    public void setHideMotionSpecResource(int i2) {
        setHideMotionSpec(g.a(getContext(), i2));
    }

    public void setShowMotionSpec(g gVar) {
        throw null;
    }

    public void setShowMotionSpecResource(int i2) {
        setShowMotionSpec(g.a(getContext(), i2));
    }

    public void setShrinkMotionSpec(g gVar) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i2) {
        setShrinkMotionSpec(g.a(getContext(), i2));
    }
}
