package h.b.p;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import h.b.d;
import h.h.m.m;
import h.h.m.q;

/* compiled from: TooltipCompatHandler */
public class a1 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* renamed from: n  reason: collision with root package name */
    public static a1 f1356n;

    /* renamed from: o  reason: collision with root package name */
    public static a1 f1357o;
    public final View e;

    /* renamed from: f  reason: collision with root package name */
    public final CharSequence f1358f;

    /* renamed from: g  reason: collision with root package name */
    public final int f1359g;

    /* renamed from: h  reason: collision with root package name */
    public final Runnable f1360h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final Runnable f1361i = new b();

    /* renamed from: j  reason: collision with root package name */
    public int f1362j;

    /* renamed from: k  reason: collision with root package name */
    public int f1363k;

    /* renamed from: l  reason: collision with root package name */
    public b1 f1364l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f1365m;

    /* compiled from: TooltipCompatHandler */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            a1.this.a(false);
        }
    }

    /* compiled from: TooltipCompatHandler */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            a1.this.b();
        }
    }

    public a1(View view, CharSequence charSequence) {
        this.e = view;
        this.f1358f = charSequence;
        this.f1359g = q.a(ViewConfiguration.get(view.getContext()));
        a();
        this.e.setOnLongClickListener(this);
        this.e.setOnHoverListener(this);
    }

    public void a(boolean z) {
        int i2;
        int i3;
        long j2;
        int i4;
        long j3;
        if (m.w(this.e)) {
            a((a1) null);
            a1 a1Var = f1357o;
            if (a1Var != null) {
                a1Var.b();
            }
            f1357o = this;
            this.f1365m = z;
            b1 b1Var = new b1(this.e.getContext());
            this.f1364l = b1Var;
            View view = this.e;
            int i5 = this.f1362j;
            int i6 = this.f1363k;
            boolean z2 = this.f1365m;
            CharSequence charSequence = this.f1358f;
            if (b1Var.f1366b.getParent() != null) {
                b1Var.a();
            }
            b1Var.c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = b1Var.d;
            layoutParams.token = view.getApplicationWindowToken();
            int dimensionPixelOffset = b1Var.a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_threshold);
            if (view.getWidth() < dimensionPixelOffset) {
                i5 = view.getWidth() / 2;
            }
            if (view.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = b1Var.a.getResources().getDimensionPixelOffset(d.tooltip_precise_anchor_extra_offset);
                i2 = i6 + dimensionPixelOffset2;
                i3 = i6 - dimensionPixelOffset2;
            } else {
                i2 = view.getHeight();
                i3 = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = b1Var.a.getResources().getDimensionPixelOffset(z2 ? d.tooltip_y_offset_touch : d.tooltip_y_offset_non_touch);
            View rootView = view.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(b1Var.e);
                Rect rect = b1Var.e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = b1Var.a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", l.a.a.a.o.b.a.ANDROID_CLIENT_TYPE);
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    b1Var.e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(b1Var.f1368g);
                view.getLocationOnScreen(b1Var.f1367f);
                int[] iArr = b1Var.f1367f;
                int i7 = iArr[0];
                int[] iArr2 = b1Var.f1368g;
                iArr[0] = i7 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i5) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                b1Var.f1366b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = b1Var.f1366b.getMeasuredHeight();
                int[] iArr3 = b1Var.f1367f;
                int i8 = ((iArr3[1] + i3) - dimensionPixelOffset3) - measuredHeight;
                int i9 = iArr3[1] + i2 + dimensionPixelOffset3;
                if (z2) {
                    if (i8 >= 0) {
                        layoutParams.y = i8;
                    } else {
                        layoutParams.y = i9;
                    }
                } else if (measuredHeight + i9 <= b1Var.e.height()) {
                    layoutParams.y = i9;
                } else {
                    layoutParams.y = i8;
                }
            }
            ((WindowManager) b1Var.a.getSystemService("window")).addView(b1Var.f1366b, b1Var.d);
            this.e.addOnAttachStateChangeListener(this);
            if (this.f1365m) {
                j2 = 2500;
            } else {
                if ((this.e.getWindowSystemUiVisibility() & 1) == 1) {
                    j3 = 3000;
                    i4 = ViewConfiguration.getLongPressTimeout();
                } else {
                    j3 = 15000;
                    i4 = ViewConfiguration.getLongPressTimeout();
                }
                j2 = j3 - ((long) i4);
            }
            this.e.removeCallbacks(this.f1361i);
            this.e.postDelayed(this.f1361i, j2);
        }
    }

    public void b() {
        if (f1357o == this) {
            f1357o = null;
            b1 b1Var = this.f1364l;
            if (b1Var != null) {
                b1Var.a();
                this.f1364l = null;
                a();
                this.e.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (f1356n == this) {
            a((a1) null);
        }
        this.e.removeCallbacks(this.f1361i);
    }

    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.f1364l != null && this.f1365m) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.e.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.e.isEnabled() && this.f1364l == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.f1362j) > this.f1359g || Math.abs(y - this.f1363k) > this.f1359g) {
                this.f1362j = x;
                this.f1363k = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                a(this);
            }
        }
        return false;
    }

    public boolean onLongClick(View view) {
        this.f1362j = view.getWidth() / 2;
        this.f1363k = view.getHeight() / 2;
        a(true);
        return true;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        b();
    }

    public static void a(a1 a1Var) {
        a1 a1Var2 = f1356n;
        if (a1Var2 != null) {
            a1Var2.e.removeCallbacks(a1Var2.f1360h);
        }
        f1356n = a1Var;
        if (a1Var != null) {
            a1Var.e.postDelayed(a1Var.f1360h, (long) ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.f1362j = Integer.MAX_VALUE;
        this.f1363k = Integer.MAX_VALUE;
    }
}
