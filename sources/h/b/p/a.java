package h.b.p;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import h.b.j;
import h.b.o.i.g;
import h.h.m.m;
import h.h.m.r;
import h.h.m.s;

/* compiled from: AbsActionBarView */
public abstract class a extends ViewGroup {
    public final C0037a e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f1339f;

    /* renamed from: g  reason: collision with root package name */
    public ActionMenuView f1340g;

    /* renamed from: h  reason: collision with root package name */
    public c f1341h;

    /* renamed from: i  reason: collision with root package name */
    public int f1342i;

    /* renamed from: j  reason: collision with root package name */
    public r f1343j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f1344k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f1345l;

    /* renamed from: h.b.p.a$a  reason: collision with other inner class name */
    /* compiled from: AbsActionBarView */
    public class C0037a implements s {
        public boolean a = false;

        /* renamed from: b  reason: collision with root package name */
        public int f1346b;

        public C0037a() {
        }

        public void a(View view) {
            if (!this.a) {
                a aVar = a.this;
                aVar.f1343j = null;
                a.super.setVisibility(this.f1346b);
            }
        }

        public void b(View view) {
            a.super.setVisibility(0);
            this.a = false;
        }

        public void c(View view) {
            this.a = true;
        }
    }

    public a(Context context) {
        this(context, (AttributeSet) null);
    }

    public int getAnimatedVisibility() {
        if (this.f1343j != null) {
            return this.e.f1346b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f1342i;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, j.ActionBar, h.b.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1341h;
        if (cVar != null) {
            Configuration configuration2 = cVar.f1250f.getResources().getConfiguration();
            int i2 = configuration2.screenWidthDp;
            int i3 = configuration2.screenHeightDp;
            cVar.t = (configuration2.smallestScreenWidthDp > 600 || i2 > 600 || (i2 > 960 && i3 > 720) || (i2 > 720 && i3 > 960)) ? 5 : (i2 >= 500 || (i2 > 640 && i3 > 480) || (i2 > 480 && i3 > 640)) ? 4 : i2 >= 360 ? 3 : 2;
            g gVar = cVar.f1251g;
            if (gVar != null) {
                gVar.b(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1345l = false;
        }
        if (!this.f1345l) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1345l = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1345l = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1344k = false;
        }
        if (!this.f1344k) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1344k = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1344k = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i2);

    public void setVisibility(int i2) {
        if (i2 != getVisibility()) {
            r rVar = this.f1343j;
            if (rVar != null) {
                rVar.a();
            }
            super.setVisibility(i2);
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public r a(int i2, long j2) {
        r rVar = this.f1343j;
        if (rVar != null) {
            rVar.a();
        }
        if (i2 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            r a = m.a(this);
            a.a(1.0f);
            a.a(j2);
            C0037a aVar = this.e;
            a.this.f1343j = a;
            aVar.f1346b = i2;
            View view = (View) a.a.get();
            if (view != null) {
                a.a(view, aVar);
            }
            return a;
        }
        r a2 = m.a(this);
        a2.a(0.0f);
        a2.a(j2);
        C0037a aVar2 = this.e;
        a.this.f1343j = a2;
        aVar2.f1346b = i2;
        View view2 = (View) a2.a.get();
        if (view2 != null) {
            a2.a(view2, aVar2);
        }
        return a2;
    }

    public a(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.e = new C0037a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(h.b.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1339f = context;
        } else {
            this.f1339f = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int a(View view, int i2, int i3, int i4) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i2, RecyclerView.UNDEFINED_DURATION), i3);
        return Math.max(0, (i2 - view.getMeasuredWidth()) - i4);
    }

    public int a(View view, int i2, int i3, int i4, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i5 = ((i4 - measuredHeight) / 2) + i3;
        if (z) {
            view.layout(i2 - measuredWidth, i5, i2, measuredHeight + i5);
        } else {
            view.layout(i2, i5, i2 + measuredWidth, measuredHeight + i5);
        }
        return z ? -measuredWidth : measuredWidth;
    }
}
