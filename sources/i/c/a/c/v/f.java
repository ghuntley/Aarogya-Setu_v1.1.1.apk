package i.c.a.c.v;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: MaterialCalendar */
public final class f<S> extends s<S> {
    public static final Object l0 = "MONTHS_VIEW_GROUP_TAG";
    public static final Object m0 = "NAVIGATION_PREV_TAG";
    public static final Object n0 = "NAVIGATION_NEXT_TAG";
    public static final Object o0 = "SELECTOR_TOGGLE_TAG";
    public int b0;
    public d<S> c0;
    public a d0;
    public n e0;
    public e f0;
    public c g0;
    public RecyclerView h0;
    public RecyclerView i0;
    public View j0;
    public View k0;

    /* compiled from: MaterialCalendar */
    public class a implements Runnable {
        public final /* synthetic */ int e;

        public a(int i2) {
            this.e = i2;
        }

        public void run() {
            f.this.i0.smoothScrollToPosition(this.e);
        }
    }

    /* compiled from: MaterialCalendar */
    public class b extends h.h.m.a {
        public b(f fVar) {
        }

        public void a(View view, h.h.m.w.b bVar) {
            this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            bVar.a((Object) null);
        }
    }

    /* compiled from: MaterialCalendar */
    public class c extends t {
        public final /* synthetic */ int H;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, int i2, boolean z, int i3) {
            super(context, i2, z);
            this.H = i3;
        }

        public void a(RecyclerView.a0 a0Var, int[] iArr) {
            if (this.H == 0) {
                iArr[0] = f.this.i0.getWidth();
                iArr[1] = f.this.i0.getWidth();
                return;
            }
            iArr[0] = f.this.i0.getHeight();
            iArr[1] = f.this.i0.getHeight();
        }
    }

    /* compiled from: MaterialCalendar */
    public class d implements C0125f {
        public d() {
        }
    }

    /* compiled from: MaterialCalendar */
    public enum e {
        DAY,
        YEAR
    }

    /* renamed from: i.c.a.c.v.f$f  reason: collision with other inner class name */
    /* compiled from: MaterialCalendar */
    public interface C0125f {
    }

    public LinearLayoutManager H() {
        return (LinearLayoutManager) this.i0.getLayoutManager();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0135, code lost:
        r13 = new h.r.d.p();
        r0 = r10.i0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View a(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            android.view.ContextThemeWrapper r13 = new android.view.ContextThemeWrapper
            android.content.Context r0 = r10.k()
            int r1 = r10.b0
            r13.<init>(r0, r1)
            i.c.a.c.v.c r0 = new i.c.a.c.v.c
            r0.<init>(r13)
            r10.g0 = r0
            android.view.LayoutInflater r11 = r11.cloneInContext(r13)
            i.c.a.c.v.a r0 = r10.d0
            i.c.a.c.v.n r0 = r0.e
            boolean r1 = i.c.a.c.v.m.b(r13)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0026
            int r1 = i.c.a.c.h.mtrl_calendar_vertical
            r9 = 1
            goto L_0x0029
        L_0x0026:
            int r1 = i.c.a.c.h.mtrl_calendar_horizontal
            r9 = 0
        L_0x0029:
            android.view.View r11 = r11.inflate(r1, r12, r3)
            int r12 = i.c.a.c.f.mtrl_calendar_days_of_week
            android.view.View r12 = r11.findViewById(r12)
            android.widget.GridView r12 = (android.widget.GridView) r12
            i.c.a.c.v.f$b r1 = new i.c.a.c.v.f$b
            r1.<init>(r10)
            h.h.m.m.a((android.view.View) r12, (h.h.m.a) r1)
            i.c.a.c.v.e r1 = new i.c.a.c.v.e
            r1.<init>()
            r12.setAdapter(r1)
            int r0 = r0.f4230i
            r12.setNumColumns(r0)
            r12.setEnabled(r3)
            int r12 = i.c.a.c.f.mtrl_calendar_months
            android.view.View r12 = r11.findViewById(r12)
            androidx.recyclerview.widget.RecyclerView r12 = (androidx.recyclerview.widget.RecyclerView) r12
            r10.i0 = r12
            i.c.a.c.v.f$c r12 = new i.c.a.c.v.f$c
            android.content.Context r6 = r10.k()
            r8 = 0
            r4 = r12
            r5 = r10
            r7 = r9
            r4.<init>(r6, r7, r8, r9)
            androidx.recyclerview.widget.RecyclerView r0 = r10.i0
            r0.setLayoutManager(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.i0
            java.lang.Object r0 = l0
            r12.setTag(r0)
            i.c.a.c.v.q r12 = new i.c.a.c.v.q
            i.c.a.c.v.d<S> r0 = r10.c0
            i.c.a.c.v.a r1 = r10.d0
            i.c.a.c.v.f$d r4 = new i.c.a.c.v.f$d
            r4.<init>()
            r12.<init>(r13, r0, r1, r4)
            androidx.recyclerview.widget.RecyclerView r0 = r10.i0
            r0.setAdapter(r12)
            android.content.res.Resources r0 = r13.getResources()
            int r1 = i.c.a.c.g.mtrl_calendar_year_selector_span
            int r0 = r0.getInteger(r1)
            int r1 = i.c.a.c.f.mtrl_calendar_year_selector_frame
            android.view.View r1 = r11.findViewById(r1)
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            r10.h0 = r1
            if (r1 == 0) goto L_0x00ba
            r1.setHasFixedSize(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r10.h0
            androidx.recyclerview.widget.GridLayoutManager r4 = new androidx.recyclerview.widget.GridLayoutManager
            r4.<init>((android.content.Context) r13, (int) r0, (int) r2, (boolean) r3)
            r1.setLayoutManager(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r10.h0
            i.c.a.c.v.v r1 = new i.c.a.c.v.v
            r1.<init>(r10)
            r0.setAdapter(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r10.h0
            i.c.a.c.v.g r1 = new i.c.a.c.v.g
            r1.<init>(r10)
            r0.addItemDecoration(r1)
        L_0x00ba:
            int r0 = i.c.a.c.f.month_navigation_fragment_toggle
            android.view.View r0 = r11.findViewById(r0)
            if (r0 == 0) goto L_0x012f
            int r0 = i.c.a.c.f.month_navigation_fragment_toggle
            android.view.View r0 = r11.findViewById(r0)
            com.google.android.material.button.MaterialButton r0 = (com.google.android.material.button.MaterialButton) r0
            java.lang.Object r1 = o0
            r0.setTag(r1)
            i.c.a.c.v.h r1 = new i.c.a.c.v.h
            r1.<init>(r10)
            h.h.m.m.a((android.view.View) r0, (h.h.m.a) r1)
            int r1 = i.c.a.c.f.month_navigation_previous
            android.view.View r1 = r11.findViewById(r1)
            com.google.android.material.button.MaterialButton r1 = (com.google.android.material.button.MaterialButton) r1
            java.lang.Object r2 = m0
            r1.setTag(r2)
            int r2 = i.c.a.c.f.month_navigation_next
            android.view.View r2 = r11.findViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            java.lang.Object r3 = n0
            r2.setTag(r3)
            int r3 = i.c.a.c.f.mtrl_calendar_year_selector_frame
            android.view.View r3 = r11.findViewById(r3)
            r10.j0 = r3
            int r3 = i.c.a.c.f.mtrl_calendar_day_selector_frame
            android.view.View r3 = r11.findViewById(r3)
            r10.k0 = r3
            i.c.a.c.v.f$e r3 = i.c.a.c.v.f.e.DAY
            r10.a((i.c.a.c.v.f.e) r3)
            i.c.a.c.v.n r3 = r10.e0
            java.lang.String r3 = r3.f4227f
            r0.setText(r3)
            androidx.recyclerview.widget.RecyclerView r3 = r10.i0
            i.c.a.c.v.i r4 = new i.c.a.c.v.i
            r4.<init>(r10, r12, r0)
            r3.addOnScrollListener(r4)
            i.c.a.c.v.j r3 = new i.c.a.c.v.j
            r3.<init>(r10)
            r0.setOnClickListener(r3)
            i.c.a.c.v.k r0 = new i.c.a.c.v.k
            r0.<init>(r10, r12)
            r2.setOnClickListener(r0)
            i.c.a.c.v.l r0 = new i.c.a.c.v.l
            r0.<init>(r10, r12)
            r1.setOnClickListener(r0)
        L_0x012f:
            boolean r13 = i.c.a.c.v.m.b(r13)
            if (r13 != 0) goto L_0x0182
            h.r.d.p r13 = new h.r.d.p
            r13.<init>()
            androidx.recyclerview.widget.RecyclerView r0 = r10.i0
            androidx.recyclerview.widget.RecyclerView r1 = r13.a
            if (r1 != r0) goto L_0x0141
            goto L_0x0182
        L_0x0141:
            if (r1 == 0) goto L_0x014e
            androidx.recyclerview.widget.RecyclerView$t r2 = r13.c
            r1.removeOnScrollListener(r2)
            androidx.recyclerview.widget.RecyclerView r1 = r13.a
            r2 = 0
            r1.setOnFlingListener(r2)
        L_0x014e:
            r13.a = r0
            if (r0 == 0) goto L_0x0182
            androidx.recyclerview.widget.RecyclerView$r r0 = r0.getOnFlingListener()
            if (r0 != 0) goto L_0x017a
            androidx.recyclerview.widget.RecyclerView r0 = r13.a
            androidx.recyclerview.widget.RecyclerView$t r1 = r13.c
            r0.addOnScrollListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r13.a
            r0.setOnFlingListener(r13)
            android.widget.Scroller r0 = new android.widget.Scroller
            androidx.recyclerview.widget.RecyclerView r1 = r13.a
            android.content.Context r1 = r1.getContext()
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            r0.<init>(r1, r2)
            r13.f2147b = r0
            r13.a()
            goto L_0x0182
        L_0x017a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "An instance of OnFlingListener already set."
            r11.<init>(r12)
            throw r11
        L_0x0182:
            androidx.recyclerview.widget.RecyclerView r13 = r10.i0
            i.c.a.c.v.n r0 = r10.e0
            int r12 = r12.a((i.c.a.c.v.n) r0)
            r13.scrollToPosition(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.c.v.f.a(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public void b(Bundle bundle) {
        super.b(bundle);
        if (bundle == null) {
            bundle = this.f232j;
        }
        this.b0 = bundle.getInt("THEME_RES_ID_KEY");
        this.c0 = (d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.d0 = (a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.e0 = (n) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public void d(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.b0);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.c0);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.d0);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.e0);
    }

    public final void d(int i2) {
        this.i0.post(new a(i2));
    }

    public static int b(Context context) {
        return context.getResources().getDimensionPixelSize(i.c.a.c.d.mtrl_calendar_day_height);
    }

    public void a(n nVar) {
        q qVar = (q) this.i0.getAdapter();
        int b2 = qVar.c.e.b(nVar);
        int a2 = b2 - qVar.a(this.e0);
        boolean z = true;
        boolean z2 = Math.abs(a2) > 3;
        if (a2 <= 0) {
            z = false;
        }
        this.e0 = nVar;
        if (z2 && z) {
            this.i0.scrollToPosition(b2 - 3);
            d(b2);
        } else if (z2) {
            this.i0.scrollToPosition(b2 + 3);
            d(b2);
        } else {
            d(b2);
        }
    }

    public void a(e eVar) {
        this.f0 = eVar;
        if (eVar == e.YEAR) {
            this.h0.getLayoutManager().h(((v) this.h0.getAdapter()).b(this.e0.f4229h));
            this.j0.setVisibility(0);
            this.k0.setVisibility(8);
        } else if (eVar == e.DAY) {
            this.j0.setVisibility(8);
            this.k0.setVisibility(0);
            a(this.e0);
        }
    }
}
