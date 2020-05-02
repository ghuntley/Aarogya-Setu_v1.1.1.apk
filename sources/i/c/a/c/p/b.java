package i.c.a.c.p;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import h.b.k.q;
import h.h.m.m;
import i.c.a.c.f;
import i.c.a.c.h;

/* compiled from: BottomSheetDialog */
public class b extends q {

    /* renamed from: g  reason: collision with root package name */
    public BottomSheetBehavior<FrameLayout> f4175g;

    /* renamed from: h  reason: collision with root package name */
    public FrameLayout f4176h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f4177i;

    /* renamed from: j  reason: collision with root package name */
    public boolean f4178j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f4179k;

    /* renamed from: l  reason: collision with root package name */
    public BottomSheetBehavior.d f4180l;

    /* compiled from: BottomSheetDialog */
    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            b bVar = b.this;
            if (bVar.f4177i && bVar.isShowing()) {
                b bVar2 = b.this;
                if (!bVar2.f4179k) {
                    TypedArray obtainStyledAttributes = bVar2.getContext().obtainStyledAttributes(new int[]{16843611});
                    bVar2.f4178j = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                    bVar2.f4179k = true;
                }
                if (bVar2.f4178j) {
                    b.this.cancel();
                }
            }
        }
    }

    /* compiled from: BottomSheetDialog */
    public class c implements View.OnTouchListener {
        public c(b bVar) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* compiled from: BottomSheetDialog */
    public class d extends BottomSheetBehavior.d {
        public d() {
        }

        public void a(View view, float f2) {
        }

        public void a(View view, int i2) {
            if (i2 == 5) {
                b.this.cancel();
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public b(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L_0x0019
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = i.c.a.c.b.bottomSheetDialogTheme
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L_0x0017
            int r5 = r5.resourceId
            goto L_0x0019
        L_0x0017:
            int r5 = i.c.a.c.j.Theme_Design_Light_BottomSheetDialog
        L_0x0019:
            r3.<init>(r4, r5)
            r3.f4177i = r0
            r3.f4178j = r0
            i.c.a.c.p.b$d r4 = new i.c.a.c.p.b$d
            r4.<init>()
            r3.f4180l = r4
            r3.a((int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.p.b.<init>(android.content.Context, int):void");
    }

    public final View a(int i2, View view, ViewGroup.LayoutParams layoutParams) {
        b();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f4176h.findViewById(f.coordinator);
        if (i2 != 0 && view == null) {
            view = getLayoutInflater().inflate(i2, coordinatorLayout, false);
        }
        FrameLayout frameLayout = (FrameLayout) this.f4176h.findViewById(f.design_bottom_sheet);
        frameLayout.removeAllViews();
        if (layoutParams == null) {
            frameLayout.addView(view);
        } else {
            frameLayout.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(f.touch_outside).setOnClickListener(new a());
        m.a((View) frameLayout, (h.h.m.a) new C0121b());
        frameLayout.setOnTouchListener(new c(this));
        return this.f4176h;
    }

    public final FrameLayout b() {
        if (this.f4176h == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), h.design_bottom_sheet_dialog, (ViewGroup) null);
            this.f4176h = frameLayout;
            BottomSheetBehavior<FrameLayout> b2 = BottomSheetBehavior.b((FrameLayout) frameLayout.findViewById(f.design_bottom_sheet));
            this.f4175g = b2;
            BottomSheetBehavior.d dVar = this.f4180l;
            if (!b2.F.contains(dVar)) {
                b2.F.add(dVar);
            }
            this.f4175g.a(this.f4177i);
        }
        return this.f4176h;
    }

    public void cancel() {
        if (this.f4175g == null) {
            b();
        }
        super.cancel();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(RecyclerView.UNDEFINED_DURATION);
            window.setLayout(-1, -1);
        }
    }

    public void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f4175g;
        if (bottomSheetBehavior != null && bottomSheetBehavior.w == 5) {
            bottomSheetBehavior.c(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        if (this.f4177i != z) {
            this.f4177i = z;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f4175g;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.a(z);
            }
        }
    }

    public void setCanceledOnTouchOutside(boolean z) {
        super.setCanceledOnTouchOutside(z);
        if (z && !this.f4177i) {
            this.f4177i = true;
        }
        this.f4178j = z;
        this.f4179k = true;
    }

    public void setContentView(int i2) {
        super.setContentView(a(i2, (View) null, (ViewGroup.LayoutParams) null));
    }

    public void setContentView(View view) {
        super.setContentView(a(0, view, (ViewGroup.LayoutParams) null));
    }

    /* renamed from: i.c.a.c.p.b$b  reason: collision with other inner class name */
    /* compiled from: BottomSheetDialog */
    public class C0121b extends h.h.m.a {
        public C0121b() {
        }

        public boolean a(View view, int i2, Bundle bundle) {
            if (i2 == 1048576) {
                b bVar = b.this;
                if (bVar.f4177i) {
                    bVar.cancel();
                    return true;
                }
            }
            return super.a(view, i2, bundle);
        }

        public void a(View view, h.h.m.w.b bVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            if (b.this.f4177i) {
                bVar.a.addAction(1048576);
                bVar.a.setDismissable(true);
                return;
            }
            bVar.a.setDismissable(false);
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(a(0, view, layoutParams));
    }
}
