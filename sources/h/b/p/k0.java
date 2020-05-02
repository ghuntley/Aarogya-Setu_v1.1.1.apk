package h.b.p;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import h.b.j;
import h.b.o.i.p;
import h.h.m.m;
import java.lang.reflect.Method;

/* compiled from: ListPopupWindow */
public class k0 implements p {
    public static Method G;
    public static Method H;
    public static Method I;
    public final a A = new a();
    public final Handler B;
    public final Rect C = new Rect();
    public Rect D;
    public boolean E;
    public PopupWindow F;
    public Context e;

    /* renamed from: f  reason: collision with root package name */
    public ListAdapter f1429f;

    /* renamed from: g  reason: collision with root package name */
    public f0 f1430g;

    /* renamed from: h  reason: collision with root package name */
    public int f1431h = -2;

    /* renamed from: i  reason: collision with root package name */
    public int f1432i = -2;

    /* renamed from: j  reason: collision with root package name */
    public int f1433j;

    /* renamed from: k  reason: collision with root package name */
    public int f1434k;

    /* renamed from: l  reason: collision with root package name */
    public int f1435l = 1002;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1436m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f1437n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f1438o;

    /* renamed from: p  reason: collision with root package name */
    public int f1439p = 0;

    /* renamed from: q  reason: collision with root package name */
    public boolean f1440q = false;
    public boolean r = false;
    public int s = Integer.MAX_VALUE;
    public int t = 0;
    public DataSetObserver u;
    public View v;
    public AdapterView.OnItemClickListener w;
    public final e x = new e();
    public final d y = new d();
    public final c z = new c();

    /* compiled from: ListPopupWindow */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            f0 f0Var = k0.this.f1430g;
            if (f0Var != null) {
                f0Var.setListSelectionHidden(true);
                f0Var.requestLayout();
            }
        }
    }

    /* compiled from: ListPopupWindow */
    public class b extends DataSetObserver {
        public b() {
        }

        public void onChanged() {
            if (k0.this.b()) {
                k0.this.a();
            }
        }

        public void onInvalidated() {
            k0.this.dismiss();
        }
    }

    /* compiled from: ListPopupWindow */
    public class c implements AbsListView.OnScrollListener {
        public c() {
        }

        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        public void onScrollStateChanged(AbsListView absListView, int i2) {
            boolean z = true;
            if (i2 == 1) {
                if (k0.this.F.getInputMethodMode() != 2) {
                    z = false;
                }
                if (!z && k0.this.F.getContentView() != null) {
                    k0 k0Var = k0.this;
                    k0Var.B.removeCallbacks(k0Var.x);
                    k0.this.x.run();
                }
            }
        }
    }

    /* compiled from: ListPopupWindow */
    public class d implements View.OnTouchListener {
        public d() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = k0.this.F) != null && popupWindow.isShowing() && x >= 0 && x < k0.this.F.getWidth() && y >= 0 && y < k0.this.F.getHeight()) {
                k0 k0Var = k0.this;
                k0Var.B.postDelayed(k0Var.x, 250);
                return false;
            } else if (action != 1) {
                return false;
            } else {
                k0 k0Var2 = k0.this;
                k0Var2.B.removeCallbacks(k0Var2.x);
                return false;
            }
        }
    }

    /* compiled from: ListPopupWindow */
    public class e implements Runnable {
        public e() {
        }

        public void run() {
            f0 f0Var = k0.this.f1430g;
            if (f0Var != null && m.w(f0Var) && k0.this.f1430g.getCount() > k0.this.f1430g.getChildCount()) {
                int childCount = k0.this.f1430g.getChildCount();
                k0 k0Var = k0.this;
                if (childCount <= k0Var.s) {
                    k0Var.F.setInputMethodMode(2);
                    k0.this.a();
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                G = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                I = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                H = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public k0(Context context, AttributeSet attributeSet, int i2, int i3) {
        this.e = context;
        this.B = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ListPopupWindow, i2, i3);
        this.f1433j = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(j.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.f1434k = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1436m = true;
        }
        obtainStyledAttributes.recycle();
        p pVar = new p(context, attributeSet, i2, i3);
        this.F = pVar;
        pVar.setInputMethodMode(1);
    }

    public void a(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.u;
        if (dataSetObserver == null) {
            this.u = new b();
        } else {
            ListAdapter listAdapter2 = this.f1429f;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1429f = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.u);
        }
        f0 f0Var = this.f1430g;
        if (f0Var != null) {
            f0Var.setAdapter(this.f1429f);
        }
    }

    public void b(int i2) {
        this.f1434k = i2;
        this.f1436m = true;
    }

    public int c() {
        return this.f1433j;
    }

    public int d() {
        if (!this.f1436m) {
            return 0;
        }
        return this.f1434k;
    }

    public void dismiss() {
        this.F.dismiss();
        this.F.setContentView((View) null);
        this.f1430g = null;
        this.B.removeCallbacks(this.x);
    }

    public Drawable e() {
        return this.F.getBackground();
    }

    public ListView g() {
        return this.f1430g;
    }

    public boolean b() {
        return this.F.isShowing();
    }

    public void d(int i2) {
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            this.f1432i = rect.left + rect.right + i2;
            return;
        }
        this.f1432i = i2;
    }

    public void a(boolean z2) {
        this.E = z2;
        this.F.setFocusable(z2);
    }

    public void a(Drawable drawable) {
        this.F.setBackgroundDrawable(drawable);
    }

    public void a(int i2) {
        this.f1433j = i2;
    }

    public f0 a(Context context, boolean z2) {
        return new f0(context, z2);
    }

    public void a() {
        int i2;
        int i3;
        int i4;
        f0 f0Var;
        int i5;
        boolean z2 = true;
        if (this.f1430g == null) {
            f0 a2 = a(this.e, !this.E);
            this.f1430g = a2;
            a2.setAdapter(this.f1429f);
            this.f1430g.setOnItemClickListener(this.w);
            this.f1430g.setFocusable(true);
            this.f1430g.setFocusableInTouchMode(true);
            this.f1430g.setOnItemSelectedListener(new j0(this));
            this.f1430g.setOnScrollListener(this.z);
            this.F.setContentView(this.f1430g);
        } else {
            ViewGroup viewGroup = (ViewGroup) this.F.getContentView();
        }
        Drawable background = this.F.getBackground();
        if (background != null) {
            background.getPadding(this.C);
            Rect rect = this.C;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f1436m) {
                this.f1434k = -i6;
            }
        } else {
            this.C.setEmpty();
            i2 = 0;
        }
        boolean z3 = this.F.getInputMethodMode() == 2;
        View view = this.v;
        int i7 = this.f1434k;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = H;
            if (method != null) {
                try {
                    i3 = ((Integer) method.invoke(this.F, new Object[]{view, Integer.valueOf(i7), Boolean.valueOf(z3)})).intValue();
                } catch (Exception unused) {
                    Log.i("ListPopupWindow", "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version.");
                }
            }
            i3 = this.F.getMaxAvailableHeight(view, i7);
        } else {
            i3 = this.F.getMaxAvailableHeight(view, i7, z3);
        }
        if (this.f1440q || this.f1431h == -1) {
            i4 = i3 + i2;
        } else {
            int i8 = this.f1432i;
            if (i8 == -2) {
                int i9 = this.e.getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = this.C;
                i5 = View.MeasureSpec.makeMeasureSpec(i9 - (rect2.left + rect2.right), RecyclerView.UNDEFINED_DURATION);
            } else if (i8 != -1) {
                i5 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
            } else {
                int i10 = this.e.getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = this.C;
                i5 = View.MeasureSpec.makeMeasureSpec(i10 - (rect3.left + rect3.right), 1073741824);
            }
            int a3 = this.f1430g.a(i5, i3 - 0, -1);
            i4 = a3 + (a3 > 0 ? this.f1430g.getPaddingBottom() + this.f1430g.getPaddingTop() + i2 + 0 : 0);
        }
        boolean z4 = this.F.getInputMethodMode() == 2;
        g.a.a.b.a.a(this.F, this.f1435l);
        if (!this.F.isShowing()) {
            int i11 = this.f1432i;
            if (i11 == -1) {
                i11 = -1;
            } else if (i11 == -2) {
                i11 = this.v.getWidth();
            }
            int i12 = this.f1431h;
            if (i12 == -1) {
                i4 = -1;
            } else if (i12 != -2) {
                i4 = i12;
            }
            this.F.setWidth(i11);
            this.F.setHeight(i4);
            if (Build.VERSION.SDK_INT <= 28) {
                Method method2 = G;
                if (method2 != null) {
                    try {
                        method2.invoke(this.F, new Object[]{true});
                    } catch (Exception unused2) {
                        Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
                    }
                }
            } else {
                this.F.setIsClippedToScreen(true);
            }
            this.F.setOutsideTouchable(!this.r && !this.f1440q);
            this.F.setTouchInterceptor(this.y);
            if (this.f1438o) {
                g.a.a.b.a.a(this.F, this.f1437n);
            }
            if (Build.VERSION.SDK_INT <= 28) {
                Method method3 = I;
                if (method3 != null) {
                    try {
                        method3.invoke(this.F, new Object[]{this.D});
                    } catch (Exception e2) {
                        Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e2);
                    }
                }
            } else {
                this.F.setEpicenterBounds(this.D);
            }
            this.F.showAsDropDown(this.v, this.f1433j, this.f1434k, this.f1439p);
            this.f1430g.setSelection(-1);
            if ((!this.E || this.f1430g.isInTouchMode()) && (f0Var = this.f1430g) != null) {
                f0Var.setListSelectionHidden(true);
                f0Var.requestLayout();
            }
            if (!this.E) {
                this.B.post(this.A);
            }
        } else if (m.w(this.v)) {
            int i13 = this.f1432i;
            if (i13 == -1) {
                i13 = -1;
            } else if (i13 == -2) {
                i13 = this.v.getWidth();
            }
            int i14 = this.f1431h;
            if (i14 == -1) {
                if (!z4) {
                    i4 = -1;
                }
                if (z4) {
                    this.F.setWidth(this.f1432i == -1 ? -1 : 0);
                    this.F.setHeight(0);
                } else {
                    this.F.setWidth(this.f1432i == -1 ? -1 : 0);
                    this.F.setHeight(-1);
                }
            } else if (i14 != -2) {
                i4 = i14;
            }
            PopupWindow popupWindow = this.F;
            if (this.r || this.f1440q) {
                z2 = false;
            }
            popupWindow.setOutsideTouchable(z2);
            this.F.update(this.v, this.f1433j, this.f1434k, i13 < 0 ? -1 : i13, i4 < 0 ? -1 : i4);
        }
    }
}
