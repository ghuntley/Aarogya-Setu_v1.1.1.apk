package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.recyclerview.widget.RecyclerView;
import h.b.j;
import h.b.k.a;
import h.b.o.i.i;
import h.b.o.i.m;
import h.b.o.i.r;
import h.b.p.d0;
import h.b.p.d1;
import h.b.p.l;
import h.b.p.n;
import h.b.p.p0;
import h.b.p.x0;
import h.b.p.z;
import h.b.p.z0;
import java.util.ArrayList;
import java.util.List;

public class Toolbar extends ViewGroup {
    public int A;
    public CharSequence B;
    public CharSequence C;
    public ColorStateList D;
    public ColorStateList E;
    public boolean F;
    public boolean G;
    public final ArrayList<View> H;
    public final ArrayList<View> I;
    public final int[] J;
    public f K;
    public final ActionMenuView.e L;
    public z0 M;
    public h.b.p.c N;
    public d O;
    public boolean P;
    public final Runnable Q;
    public ActionMenuView e;

    /* renamed from: f  reason: collision with root package name */
    public TextView f136f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f137g;

    /* renamed from: h  reason: collision with root package name */
    public ImageButton f138h;

    /* renamed from: i  reason: collision with root package name */
    public ImageView f139i;

    /* renamed from: j  reason: collision with root package name */
    public Drawable f140j;

    /* renamed from: k  reason: collision with root package name */
    public CharSequence f141k;

    /* renamed from: l  reason: collision with root package name */
    public ImageButton f142l;

    /* renamed from: m  reason: collision with root package name */
    public View f143m;

    /* renamed from: n  reason: collision with root package name */
    public Context f144n;

    /* renamed from: o  reason: collision with root package name */
    public int f145o;

    /* renamed from: p  reason: collision with root package name */
    public int f146p;

    /* renamed from: q  reason: collision with root package name */
    public int f147q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;
    public p0 x;
    public int y;
    public int z;

    public class a implements ActionMenuView.e {
        public a() {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            Toolbar.this.g();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        public void onClick(View view) {
            d dVar = Toolbar.this.O;
            i iVar = dVar == null ? null : dVar.f148f;
            if (iVar != null) {
                iVar.collapseActionView();
            }
        }
    }

    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }

    private MenuInflater getMenuInflater() {
        return new h.b.o.f(getContext());
    }

    public void a() {
        if (this.f142l == null) {
            l lVar = new l(getContext(), (AttributeSet) null, h.b.a.toolbarNavigationButtonStyle);
            this.f142l = lVar;
            lVar.setImageDrawable(this.f140j);
            this.f142l.setContentDescription(this.f141k);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.r & 112);
            generateDefaultLayoutParams.f150b = 2;
            this.f142l.setLayoutParams(generateDefaultLayoutParams);
            this.f142l.setOnClickListener(new c());
        }
    }

    public final int b(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.rightMargin - iArr[1];
        int max = i2 - Math.max(0, i4);
        iArr[1] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, a2, max, view.getMeasuredHeight() + a2);
        return max - (measuredWidth + eVar.leftMargin);
    }

    public final void c() {
        d();
        ActionMenuView actionMenuView = this.e;
        if (actionMenuView.t == null) {
            h.b.o.i.g gVar = (h.b.o.i.g) actionMenuView.getMenu();
            if (this.O == null) {
                this.O = new d();
            }
            this.e.setExpandedActionViewsExclusive(true);
            gVar.a((m) this.O, this.f144n);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public final void d() {
        if (this.e == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.e = actionMenuView;
            actionMenuView.setPopupTheme(this.f145o);
            this.e.setOnMenuItemClickListener(this.L);
            ActionMenuView actionMenuView2 = this.e;
            actionMenuView2.y = null;
            actionMenuView2.z = null;
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388613 | (this.r & 112);
            this.e.setLayoutParams(generateDefaultLayoutParams);
            a((View) this.e, false);
        }
    }

    public final void e() {
        if (this.f138h == null) {
            this.f138h = new l(getContext(), (AttributeSet) null, h.b.a.toolbarNavigationButtonStyle);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.a = 8388611 | (this.r & 112);
            this.f138h.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    public boolean f() {
        ActionMenuView actionMenuView = this.e;
        if (actionMenuView != null) {
            h.b.p.c cVar = actionMenuView.x;
            if (cVar != null && cVar.e()) {
                return true;
            }
        }
        return false;
    }

    public boolean g() {
        ActionMenuView actionMenuView = this.e;
        if (actionMenuView != null) {
            h.b.p.c cVar = actionMenuView.x;
            if (cVar != null && cVar.f()) {
                return true;
            }
        }
        return false;
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f142l;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f142l;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.f1454g ? p0Var.a : p0Var.f1452b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i2 = this.z;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.f1452b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        p0 p0Var = this.x;
        if (p0Var != null) {
            return p0Var.f1454g ? p0Var.f1452b : p0Var.a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i2 = this.y;
        return i2 != Integer.MIN_VALUE ? i2 : getContentInsetStart();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.t;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCurrentContentInsetEnd() {
        /*
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.e
            r1 = 0
            if (r0 == 0) goto L_0x0011
            h.b.o.i.g r0 = r0.t
            if (r0 == 0) goto L_0x0011
            boolean r0 = r0.hasVisibleItems()
            if (r0 == 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0023
            int r0 = r3.getContentInsetEnd()
            int r2 = r3.z
            int r1 = java.lang.Math.max(r2, r1)
            int r0 = java.lang.Math.max(r0, r1)
            goto L_0x0027
        L_0x0023:
            int r0 = r3.getContentInsetEnd()
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.getCurrentContentInsetEnd():int");
    }

    public int getCurrentContentInsetLeft() {
        if (h.h.m.m.k(this) == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (h.h.m.m.k(this) == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        if (getNavigationIcon() != null) {
            return Math.max(getContentInsetStart(), Math.max(this.y, 0));
        }
        return getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f139i;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f139i;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        c();
        return this.e.getMenu();
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f138h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f138h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public h.b.p.c getOuterActionMenuPresenter() {
        return this.N;
    }

    public Drawable getOverflowIcon() {
        c();
        return this.e.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f144n;
    }

    public int getPopupTheme() {
        return this.f145o;
    }

    public CharSequence getSubtitle() {
        return this.C;
    }

    public final TextView getSubtitleTextView() {
        return this.f137g;
    }

    public CharSequence getTitle() {
        return this.B;
    }

    public int getTitleMarginBottom() {
        return this.w;
    }

    public int getTitleMarginEnd() {
        return this.u;
    }

    public int getTitleMarginStart() {
        return this.t;
    }

    public int getTitleMarginTop() {
        return this.v;
    }

    public final TextView getTitleTextView() {
        return this.f136f;
    }

    public d0 getWrapper() {
        if (this.M == null) {
            this.M = new z0(this, true);
        }
        return this.M;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.Q);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.G = false;
        }
        if (!this.G) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.G = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.G = false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x029f A[LOOP:0: B:101:0x029d->B:102:0x029f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x02c1 A[LOOP:1: B:104:0x02bf->B:105:0x02c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x02e6 A[LOOP:2: B:107:0x02e4->B:108:0x02e6, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0327  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0338 A[LOOP:3: B:115:0x0336->B:116:0x0338, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0167  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0225  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            r19 = this;
            r0 = r19
            int r1 = h.h.m.m.k(r19)
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r4 = r19.getWidth()
            int r5 = r19.getHeight()
            int r6 = r19.getPaddingLeft()
            int r7 = r19.getPaddingRight()
            int r8 = r19.getPaddingTop()
            int r9 = r19.getPaddingBottom()
            int r10 = r4 - r7
            int[] r11 = r0.J
            r11[r2] = r3
            r11[r3] = r3
            int r12 = r19.getMinimumHeight()
            if (r12 < 0) goto L_0x003a
            int r13 = r24 - r22
            int r12 = java.lang.Math.min(r12, r13)
            goto L_0x003b
        L_0x003a:
            r12 = 0
        L_0x003b:
            android.widget.ImageButton r13 = r0.f138h
            boolean r13 = r0.d(r13)
            if (r13 == 0) goto L_0x0055
            if (r1 == 0) goto L_0x004e
            android.widget.ImageButton r13 = r0.f138h
            int r13 = r0.b(r13, r10, r11, r12)
            r14 = r13
            r13 = r6
            goto L_0x0057
        L_0x004e:
            android.widget.ImageButton r13 = r0.f138h
            int r13 = r0.a(r13, r6, r11, r12)
            goto L_0x0056
        L_0x0055:
            r13 = r6
        L_0x0056:
            r14 = r10
        L_0x0057:
            android.widget.ImageButton r15 = r0.f142l
            boolean r15 = r0.d(r15)
            if (r15 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x0068
            android.widget.ImageButton r15 = r0.f142l
            int r14 = r0.b(r15, r14, r11, r12)
            goto L_0x006e
        L_0x0068:
            android.widget.ImageButton r15 = r0.f142l
            int r13 = r0.a(r15, r13, r11, r12)
        L_0x006e:
            androidx.appcompat.widget.ActionMenuView r15 = r0.e
            boolean r15 = r0.d(r15)
            if (r15 == 0) goto L_0x0085
            if (r1 == 0) goto L_0x007f
            androidx.appcompat.widget.ActionMenuView r15 = r0.e
            int r13 = r0.a(r15, r13, r11, r12)
            goto L_0x0085
        L_0x007f:
            androidx.appcompat.widget.ActionMenuView r15 = r0.e
            int r14 = r0.b(r15, r14, r11, r12)
        L_0x0085:
            int r15 = r19.getCurrentContentInsetLeft()
            int r16 = r19.getCurrentContentInsetRight()
            int r2 = r15 - r13
            int r2 = java.lang.Math.max(r3, r2)
            r11[r3] = r2
            int r2 = r10 - r14
            int r2 = r16 - r2
            int r2 = java.lang.Math.max(r3, r2)
            r17 = 1
            r11[r17] = r2
            int r2 = java.lang.Math.max(r13, r15)
            int r10 = r10 - r16
            int r10 = java.lang.Math.min(r14, r10)
            android.view.View r13 = r0.f143m
            boolean r13 = r0.d(r13)
            if (r13 == 0) goto L_0x00c2
            if (r1 == 0) goto L_0x00bc
            android.view.View r13 = r0.f143m
            int r10 = r0.b(r13, r10, r11, r12)
            goto L_0x00c2
        L_0x00bc:
            android.view.View r13 = r0.f143m
            int r2 = r0.a(r13, r2, r11, r12)
        L_0x00c2:
            android.widget.ImageView r13 = r0.f139i
            boolean r13 = r0.d(r13)
            if (r13 == 0) goto L_0x00d9
            if (r1 == 0) goto L_0x00d3
            android.widget.ImageView r13 = r0.f139i
            int r10 = r0.b(r13, r10, r11, r12)
            goto L_0x00d9
        L_0x00d3:
            android.widget.ImageView r13 = r0.f139i
            int r2 = r0.a(r13, r2, r11, r12)
        L_0x00d9:
            android.widget.TextView r13 = r0.f136f
            boolean r13 = r0.d(r13)
            android.widget.TextView r14 = r0.f137g
            boolean r14 = r0.d(r14)
            if (r13 == 0) goto L_0x0100
            android.widget.TextView r15 = r0.f136f
            android.view.ViewGroup$LayoutParams r15 = r15.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r15 = (androidx.appcompat.widget.Toolbar.e) r15
            int r3 = r15.topMargin
            r23 = r7
            android.widget.TextView r7 = r0.f136f
            int r7 = r7.getMeasuredHeight()
            int r7 = r7 + r3
            int r3 = r15.bottomMargin
            int r7 = r7 + r3
            r3 = 0
            int r7 = r7 + r3
            goto L_0x0103
        L_0x0100:
            r23 = r7
            r7 = 0
        L_0x0103:
            if (r14 == 0) goto L_0x011d
            android.widget.TextView r3 = r0.f137g
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            int r15 = r3.topMargin
            r16 = r4
            android.widget.TextView r4 = r0.f137g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r15
            int r3 = r3.bottomMargin
            int r4 = r4 + r3
            int r7 = r7 + r4
            goto L_0x011f
        L_0x011d:
            r16 = r4
        L_0x011f:
            if (r13 != 0) goto L_0x012a
            if (r14 == 0) goto L_0x0124
            goto L_0x012a
        L_0x0124:
            r18 = r6
            r22 = r12
            goto L_0x028f
        L_0x012a:
            if (r13 == 0) goto L_0x012f
            android.widget.TextView r3 = r0.f136f
            goto L_0x0131
        L_0x012f:
            android.widget.TextView r3 = r0.f137g
        L_0x0131:
            if (r14 == 0) goto L_0x0136
            android.widget.TextView r4 = r0.f137g
            goto L_0x0138
        L_0x0136:
            android.widget.TextView r4 = r0.f136f
        L_0x0138:
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r3 = (androidx.appcompat.widget.Toolbar.e) r3
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r4 = (androidx.appcompat.widget.Toolbar.e) r4
            if (r13 == 0) goto L_0x014e
            android.widget.TextView r15 = r0.f136f
            int r15 = r15.getMeasuredWidth()
            if (r15 > 0) goto L_0x0158
        L_0x014e:
            if (r14 == 0) goto L_0x015b
            android.widget.TextView r15 = r0.f137g
            int r15 = r15.getMeasuredWidth()
            if (r15 <= 0) goto L_0x015b
        L_0x0158:
            r17 = 1
            goto L_0x015d
        L_0x015b:
            r17 = 0
        L_0x015d:
            int r15 = r0.A
            r15 = r15 & 112(0x70, float:1.57E-43)
            r18 = r6
            r6 = 48
            if (r15 == r6) goto L_0x01a5
            r6 = 80
            if (r15 == r6) goto L_0x0197
            int r6 = r5 - r8
            int r6 = r6 - r9
            int r6 = r6 - r7
            int r6 = r6 / 2
            int r15 = r3.topMargin
            r22 = r12
            int r12 = r0.v
            r24 = r2
            int r2 = r15 + r12
            if (r6 >= r2) goto L_0x0180
            int r6 = r15 + r12
            goto L_0x0195
        L_0x0180:
            int r5 = r5 - r9
            int r5 = r5 - r7
            int r5 = r5 - r6
            int r5 = r5 - r8
            int r2 = r3.bottomMargin
            int r3 = r0.w
            int r2 = r2 + r3
            if (r5 >= r2) goto L_0x0195
            int r2 = r4.bottomMargin
            int r2 = r2 + r3
            int r2 = r2 - r5
            int r6 = r6 - r2
            r2 = 0
            int r6 = java.lang.Math.max(r2, r6)
        L_0x0195:
            int r8 = r8 + r6
            goto L_0x01b4
        L_0x0197:
            r24 = r2
            r22 = r12
            int r5 = r5 - r9
            int r2 = r4.bottomMargin
            int r5 = r5 - r2
            int r2 = r0.w
            int r5 = r5 - r2
            int r8 = r5 - r7
            goto L_0x01b4
        L_0x01a5:
            r24 = r2
            r22 = r12
            int r2 = r19.getPaddingTop()
            int r3 = r3.topMargin
            int r2 = r2 + r3
            int r3 = r0.v
            int r8 = r2 + r3
        L_0x01b4:
            if (r1 == 0) goto L_0x0225
            if (r17 == 0) goto L_0x01bb
            int r1 = r0.t
            goto L_0x01bc
        L_0x01bb:
            r1 = 0
        L_0x01bc:
            r2 = 1
            r3 = r11[r2]
            int r1 = r1 - r3
            r3 = 0
            int r4 = java.lang.Math.max(r3, r1)
            int r10 = r10 - r4
            int r1 = -r1
            int r1 = java.lang.Math.max(r3, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x01f3
            android.widget.TextView r1 = r0.f136f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f136f
            int r2 = r2.getMeasuredWidth()
            int r2 = r10 - r2
            android.widget.TextView r3 = r0.f136f
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f136f
            r4.layout(r2, r8, r10, r3)
            int r4 = r0.u
            int r2 = r2 - r4
            int r1 = r1.bottomMargin
            int r8 = r3 + r1
            goto L_0x01f4
        L_0x01f3:
            r2 = r10
        L_0x01f4:
            if (r14 == 0) goto L_0x021a
            android.widget.TextView r1 = r0.f137g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f137g
            int r1 = r1.getMeasuredWidth()
            int r1 = r10 - r1
            android.widget.TextView r3 = r0.f137g
            int r3 = r3.getMeasuredHeight()
            int r3 = r3 + r8
            android.widget.TextView r4 = r0.f137g
            r4.layout(r1, r8, r10, r3)
            int r1 = r0.u
            int r1 = r10 - r1
            goto L_0x021b
        L_0x021a:
            r1 = r10
        L_0x021b:
            if (r17 == 0) goto L_0x0222
            int r1 = java.lang.Math.min(r2, r1)
            r10 = r1
        L_0x0222:
            r2 = r24
            goto L_0x028f
        L_0x0225:
            if (r17 == 0) goto L_0x022a
            int r1 = r0.t
            goto L_0x022b
        L_0x022a:
            r1 = 0
        L_0x022b:
            r2 = 0
            r3 = r11[r2]
            int r1 = r1 - r3
            int r3 = java.lang.Math.max(r2, r1)
            int r3 = r3 + r24
            int r1 = -r1
            int r1 = java.lang.Math.max(r2, r1)
            r11[r2] = r1
            if (r13 == 0) goto L_0x0261
            android.widget.TextView r1 = r0.f136f
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            android.widget.TextView r2 = r0.f136f
            int r2 = r2.getMeasuredWidth()
            int r2 = r2 + r3
            android.widget.TextView r4 = r0.f136f
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f136f
            r5.layout(r3, r8, r2, r4)
            int r5 = r0.u
            int r2 = r2 + r5
            int r1 = r1.bottomMargin
            int r8 = r4 + r1
            goto L_0x0262
        L_0x0261:
            r2 = r3
        L_0x0262:
            if (r14 == 0) goto L_0x0286
            android.widget.TextView r1 = r0.f137g
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r1 = (androidx.appcompat.widget.Toolbar.e) r1
            int r1 = r1.topMargin
            int r8 = r8 + r1
            android.widget.TextView r1 = r0.f137g
            int r1 = r1.getMeasuredWidth()
            int r1 = r1 + r3
            android.widget.TextView r4 = r0.f137g
            int r4 = r4.getMeasuredHeight()
            int r4 = r4 + r8
            android.widget.TextView r5 = r0.f137g
            r5.layout(r3, r8, r1, r4)
            int r4 = r0.u
            int r1 = r1 + r4
            goto L_0x0287
        L_0x0286:
            r1 = r3
        L_0x0287:
            if (r17 == 0) goto L_0x028e
            int r2 = java.lang.Math.max(r2, r1)
            goto L_0x028f
        L_0x028e:
            r2 = r3
        L_0x028f:
            java.util.ArrayList<android.view.View> r1 = r0.H
            r3 = 3
            r0.a((java.util.List<android.view.View>) r1, (int) r3)
            java.util.ArrayList<android.view.View> r1 = r0.H
            int r1 = r1.size()
            r3 = r2
            r2 = 0
        L_0x029d:
            if (r2 >= r1) goto L_0x02b0
            java.util.ArrayList<android.view.View> r4 = r0.H
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            r12 = r22
            int r3 = r0.a(r4, r3, r11, r12)
            int r2 = r2 + 1
            goto L_0x029d
        L_0x02b0:
            r12 = r22
            java.util.ArrayList<android.view.View> r1 = r0.H
            r2 = 5
            r0.a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.H
            int r1 = r1.size()
            r2 = 0
        L_0x02bf:
            if (r2 >= r1) goto L_0x02d0
            java.util.ArrayList<android.view.View> r4 = r0.H
            java.lang.Object r4 = r4.get(r2)
            android.view.View r4 = (android.view.View) r4
            int r10 = r0.b(r4, r10, r11, r12)
            int r2 = r2 + 1
            goto L_0x02bf
        L_0x02d0:
            java.util.ArrayList<android.view.View> r1 = r0.H
            r2 = 1
            r0.a((java.util.List<android.view.View>) r1, (int) r2)
            java.util.ArrayList<android.view.View> r1 = r0.H
            r4 = 0
            r5 = r11[r4]
            r2 = r11[r2]
            int r4 = r1.size()
            r7 = r5
            r5 = 0
            r6 = 0
        L_0x02e4:
            if (r5 >= r4) goto L_0x0317
            java.lang.Object r8 = r1.get(r5)
            android.view.View r8 = (android.view.View) r8
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.appcompat.widget.Toolbar$e r9 = (androidx.appcompat.widget.Toolbar.e) r9
            int r13 = r9.leftMargin
            int r13 = r13 - r7
            int r7 = r9.rightMargin
            int r7 = r7 - r2
            r2 = 0
            int r9 = java.lang.Math.max(r2, r13)
            int r14 = java.lang.Math.max(r2, r7)
            int r13 = -r13
            int r13 = java.lang.Math.max(r2, r13)
            int r7 = -r7
            int r7 = java.lang.Math.max(r2, r7)
            int r8 = r8.getMeasuredWidth()
            int r8 = r8 + r9
            int r8 = r8 + r14
            int r6 = r6 + r8
            int r5 = r5 + 1
            r2 = r7
            r7 = r13
            goto L_0x02e4
        L_0x0317:
            r2 = 0
            int r4 = r16 - r18
            int r4 = r4 - r23
            int r4 = r4 / 2
            int r4 = r4 + r18
            int r1 = r6 / 2
            int r4 = r4 - r1
            int r6 = r6 + r4
            if (r4 >= r3) goto L_0x0327
            goto L_0x032e
        L_0x0327:
            if (r6 <= r10) goto L_0x032d
            int r6 = r6 - r10
            int r3 = r4 - r6
            goto L_0x032e
        L_0x032d:
            r3 = r4
        L_0x032e:
            java.util.ArrayList<android.view.View> r1 = r0.H
            int r1 = r1.size()
            r2 = r3
            r3 = 0
        L_0x0336:
            if (r3 >= r1) goto L_0x0347
            java.util.ArrayList<android.view.View> r4 = r0.H
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            int r2 = r0.a(r4, r2, r11, r12)
            int r3 = r3 + 1
            goto L_0x0336
        L_0x0347:
            java.util.ArrayList<android.view.View> r1 = r0.H
            r1.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public void onMeasure(int i2, int i3) {
        char c2;
        char c3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr = this.J;
        boolean z2 = true;
        int i11 = 0;
        if (d1.a(this)) {
            c3 = 1;
            c2 = 0;
        } else {
            c3 = 0;
            c2 = 1;
        }
        if (d(this.f138h)) {
            a((View) this.f138h, i2, 0, i3, 0, this.s);
            i6 = a((View) this.f138h) + this.f138h.getMeasuredWidth();
            i5 = Math.max(0, b(this.f138h) + this.f138h.getMeasuredHeight());
            i4 = View.combineMeasuredStates(0, this.f138h.getMeasuredState());
        } else {
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (d(this.f142l)) {
            a((View) this.f142l, i2, 0, i3, 0, this.s);
            i6 = a((View) this.f142l) + this.f142l.getMeasuredWidth();
            i5 = Math.max(i5, b(this.f142l) + this.f142l.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f142l.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i6) + 0;
        iArr[c3] = Math.max(0, currentContentInsetStart - i6);
        if (d(this.e)) {
            a((View) this.e, i2, max, i3, 0, this.s);
            i7 = a((View) this.e) + this.e.getMeasuredWidth();
            i5 = Math.max(i5, b(this.e) + this.e.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.e.getMeasuredState());
        } else {
            i7 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = Math.max(currentContentInsetEnd, i7) + max;
        iArr[c2] = Math.max(0, currentContentInsetEnd - i7);
        if (d(this.f143m)) {
            max2 += a(this.f143m, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, b(this.f143m) + this.f143m.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f143m.getMeasuredState());
        }
        if (d(this.f139i)) {
            max2 += a((View) this.f139i, i2, max2, i3, 0, iArr);
            i5 = Math.max(i5, b(this.f139i) + this.f139i.getMeasuredHeight());
            i4 = View.combineMeasuredStates(i4, this.f139i.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((e) childAt.getLayoutParams()).f150b == 0 && d(childAt)) {
                View view = childAt;
                max2 += a(childAt, i2, max2, i3, 0, iArr);
                View view2 = view;
                i5 = Math.max(i5, b(view2) + view.getMeasuredHeight());
                i4 = View.combineMeasuredStates(i4, view2.getMeasuredState());
            }
        }
        int i13 = this.v + this.w;
        int i14 = this.t + this.u;
        if (d(this.f136f)) {
            a((View) this.f136f, i2, max2 + i14, i3, i13, iArr);
            int a2 = a((View) this.f136f) + this.f136f.getMeasuredWidth();
            i8 = b(this.f136f) + this.f136f.getMeasuredHeight();
            i10 = View.combineMeasuredStates(i4, this.f136f.getMeasuredState());
            i9 = a2;
        } else {
            i10 = i4;
            i9 = 0;
            i8 = 0;
        }
        if (d(this.f137g)) {
            int i15 = i8 + i13;
            i9 = Math.max(i9, a((View) this.f137g, i2, max2 + i14, i3, i15, iArr));
            i8 = b(this.f137g) + this.f137g.getMeasuredHeight() + i8;
            i10 = View.combineMeasuredStates(i10, this.f137g.getMeasuredState());
        } else {
            int i16 = i10;
        }
        int max3 = Math.max(i5, i8);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop() + max3;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight + max2 + i9, getSuggestedMinimumWidth()), i2, -16777216 & i10);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i3, i10 << 16);
        if (this.P) {
            int childCount2 = getChildCount();
            int i17 = 0;
            while (true) {
                if (i17 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i17);
                if (d(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i17++;
            }
        }
        z2 = false;
        if (!z2) {
            i11 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i11);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.e);
        ActionMenuView actionMenuView = this.e;
        h.b.o.i.g gVar2 = actionMenuView != null ? actionMenuView.t : null;
        int i2 = gVar.f151g;
        if (!(i2 == 0 || this.O == null || gVar2 == null || (findItem = gVar2.findItem(i2)) == null)) {
            findItem.expandActionView();
        }
        if (gVar.f152h) {
            removeCallbacks(this.Q);
            post(this.Q);
        }
    }

    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        b();
        p0 p0Var = this.x;
        boolean z2 = true;
        if (i2 != 1) {
            z2 = false;
        }
        if (z2 != p0Var.f1454g) {
            p0Var.f1454g = z2;
            if (!p0Var.f1455h) {
                p0Var.a = p0Var.e;
                p0Var.f1452b = p0Var.f1453f;
            } else if (z2) {
                int i3 = p0Var.d;
                if (i3 == Integer.MIN_VALUE) {
                    i3 = p0Var.e;
                }
                p0Var.a = i3;
                int i4 = p0Var.c;
                if (i4 == Integer.MIN_VALUE) {
                    i4 = p0Var.f1453f;
                }
                p0Var.f1452b = i4;
            } else {
                int i5 = p0Var.c;
                if (i5 == Integer.MIN_VALUE) {
                    i5 = p0Var.e;
                }
                p0Var.a = i5;
                int i6 = p0Var.d;
                if (i6 == Integer.MIN_VALUE) {
                    i6 = p0Var.f1453f;
                }
                p0Var.f1452b = i6;
            }
        }
    }

    public Parcelable onSaveInstanceState() {
        i iVar;
        g gVar = new g(super.onSaveInstanceState());
        d dVar = this.O;
        if (!(dVar == null || (iVar = dVar.f148f) == null)) {
            gVar.f151g = iVar.a;
        }
        gVar.f152h = f();
        return gVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = false;
        }
        if (!this.F) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.F = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.F = false;
        }
        return true;
    }

    public void setCollapseContentDescription(int i2) {
        setCollapseContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setCollapseIcon(int i2) {
        setCollapseIcon(h.b.l.a.a.c(getContext(), i2));
    }

    public void setCollapsible(boolean z2) {
        this.P = z2;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i2) {
        if (i2 < 0) {
            i2 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i2 != this.z) {
            this.z = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i2) {
        if (i2 < 0) {
            i2 = RecyclerView.UNDEFINED_DURATION;
        }
        if (i2 != this.y) {
            this.y = i2;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i2) {
        setLogo(h.b.l.a.a.c(getContext(), i2));
    }

    public void setLogoDescription(int i2) {
        setLogoDescription(getContext().getText(i2));
    }

    public void setNavigationContentDescription(int i2) {
        setNavigationContentDescription(i2 != 0 ? getContext().getText(i2) : null);
    }

    public void setNavigationIcon(int i2) {
        setNavigationIcon(h.b.l.a.a.c(getContext(), i2));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        e();
        this.f138h.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.K = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        c();
        this.e.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i2) {
        if (this.f145o != i2) {
            this.f145o = i2;
            if (i2 == 0) {
                this.f144n = getContext();
            } else {
                this.f144n = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    public void setSubtitle(int i2) {
        setSubtitle(getContext().getText(i2));
    }

    public void setSubtitleTextColor(int i2) {
        setSubtitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setTitle(int i2) {
        setTitle(getContext().getText(i2));
    }

    public void setTitleMarginBottom(int i2) {
        this.w = i2;
        requestLayout();
    }

    public void setTitleMarginEnd(int i2) {
        this.u = i2;
        requestLayout();
    }

    public void setTitleMarginStart(int i2) {
        this.t = i2;
        requestLayout();
    }

    public void setTitleMarginTop(int i2) {
        this.v = i2;
        requestLayout();
    }

    public void setTitleTextColor(int i2) {
        setTitleTextColor(ColorStateList.valueOf(i2));
    }

    public static class e extends a.C0030a {

        /* renamed from: b  reason: collision with root package name */
        public int f150b = 0;

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i2, int i3) {
            super(i2, i3);
            this.a = 8388627;
        }

        public e(e eVar) {
            super((a.C0030a) eVar);
            this.f150b = eVar.f150b;
        }

        public e(a.C0030a aVar) {
            super(aVar);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super((ViewGroup.LayoutParams) marginLayoutParams);
            this.leftMargin = marginLayoutParams.leftMargin;
            this.topMargin = marginLayoutParams.topMargin;
            this.rightMargin = marginLayoutParams.rightMargin;
            this.bottomMargin = marginLayoutParams.bottomMargin;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.toolbarStyle);
    }

    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            a();
        }
        ImageButton imageButton = this.f142l;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            a();
            this.f142l.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.f142l;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.f140j);
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.f139i == null) {
                this.f139i = new n(getContext(), (AttributeSet) null, 0);
            }
            if (!c(this.f139i)) {
                a((View) this.f139i, true);
            }
        } else {
            ImageView imageView = this.f139i;
            if (imageView != null && c(imageView)) {
                removeView(this.f139i);
                this.I.remove(this.f139i);
            }
        }
        ImageView imageView2 = this.f139i;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.f139i == null) {
            this.f139i = new n(getContext(), (AttributeSet) null, 0);
        }
        ImageView imageView = this.f139i;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            e();
        }
        ImageButton imageButton = this.f138h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            e();
            if (!c(this.f138h)) {
                a((View) this.f138h, true);
            }
        } else {
            ImageButton imageButton = this.f138h;
            if (imageButton != null && c(imageButton)) {
                removeView(this.f138h);
                this.I.remove(this.f138h);
            }
        }
        ImageButton imageButton2 = this.f138h;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f137g == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f137g = zVar;
                zVar.setSingleLine();
                this.f137g.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f147q;
                if (i2 != 0) {
                    this.f137g.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.E;
                if (colorStateList != null) {
                    this.f137g.setTextColor(colorStateList);
                }
            }
            if (!c(this.f137g)) {
                a((View) this.f137g, true);
            }
        } else {
            TextView textView = this.f137g;
            if (textView != null && c(textView)) {
                removeView(this.f137g);
                this.I.remove(this.f137g);
            }
        }
        TextView textView2 = this.f137g;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.C = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        TextView textView = this.f137g;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f136f == null) {
                Context context = getContext();
                z zVar = new z(context);
                this.f136f = zVar;
                zVar.setSingleLine();
                this.f136f.setEllipsize(TextUtils.TruncateAt.END);
                int i2 = this.f146p;
                if (i2 != 0) {
                    this.f136f.setTextAppearance(context, i2);
                }
                ColorStateList colorStateList = this.D;
                if (colorStateList != null) {
                    this.f136f.setTextColor(colorStateList);
                }
            }
            if (!c(this.f136f)) {
                a((View) this.f136f, true);
            }
        } else {
            TextView textView = this.f136f;
            if (textView != null && c(textView)) {
                removeView(this.f136f);
                this.I.remove(this.f136f);
            }
        }
        TextView textView2 = this.f136f;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.B = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.D = colorStateList;
        TextView textView = this.f136f;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public class d implements m {
        public h.b.o.i.g e;

        /* renamed from: f  reason: collision with root package name */
        public i f148f;

        public d() {
        }

        public void a(Context context, h.b.o.i.g gVar) {
            i iVar;
            h.b.o.i.g gVar2 = this.e;
            if (!(gVar2 == null || (iVar = this.f148f) == null)) {
                gVar2.a(iVar);
            }
            this.e = gVar;
        }

        public void a(h.b.o.i.g gVar, boolean z) {
        }

        public void a(m.a aVar) {
        }

        public boolean a(r rVar) {
            return false;
        }

        public boolean b(h.b.o.i.g gVar, i iVar) {
            Toolbar.this.a();
            ViewParent parent = Toolbar.this.f142l.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f142l);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f142l);
            }
            Toolbar.this.f143m = iVar.getActionView();
            this.f148f = iVar;
            ViewParent parent2 = Toolbar.this.f143m.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f143m);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.a = 8388611 | (toolbar4.r & 112);
                generateDefaultLayoutParams.f150b = 2;
                toolbar4.f143m.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f143m);
            }
            Toolbar toolbar6 = Toolbar.this;
            int childCount = toolbar6.getChildCount();
            while (true) {
                childCount--;
                if (childCount < 0) {
                    break;
                }
                View childAt = toolbar6.getChildAt(childCount);
                if (!(((e) childAt.getLayoutParams()).f150b == 2 || childAt == toolbar6.e)) {
                    toolbar6.removeViewAt(childCount);
                    toolbar6.I.add(childAt);
                }
            }
            Toolbar.this.requestLayout();
            iVar.C = true;
            iVar.f1312n.b(false);
            View view = Toolbar.this.f143m;
            if (view instanceof h.b.o.b) {
                ((h.b.o.b) view).a();
            }
            return true;
        }

        public boolean c() {
            return false;
        }

        public void a(boolean z) {
            if (this.f148f != null) {
                h.b.o.i.g gVar = this.e;
                boolean z2 = false;
                if (gVar != null) {
                    int size = gVar.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (this.e.getItem(i2) == this.f148f) {
                            z2 = true;
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
                if (!z2) {
                    a(this.e, this.f148f);
                }
            }
        }

        public boolean a(h.b.o.i.g gVar, i iVar) {
            View view = Toolbar.this.f143m;
            if (view instanceof h.b.o.b) {
                ((h.b.o.b) view).b();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f143m);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f142l);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f143m = null;
            int size = toolbar3.I.size();
            while (true) {
                size--;
                if (size >= 0) {
                    toolbar3.addView(toolbar3.I.get(size));
                } else {
                    toolbar3.I.clear();
                    this.f148f = null;
                    Toolbar.this.requestLayout();
                    iVar.C = false;
                    iVar.f1312n.b(false);
                    return true;
                }
            }
        }
    }

    public static class g extends h.j.a.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public int f151g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f152h;

        public static class a implements Parcelable.ClassLoaderCreator<g> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            public Object[] newArray(int i2) {
                return new g[i2];
            }

            public Object createFromParcel(Parcel parcel) {
                return new g(parcel, (ClassLoader) null);
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f151g = parcel.readInt();
            this.f152h = parcel.readInt() != 0;
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.e, i2);
            parcel.writeInt(this.f151g);
            parcel.writeInt(this.f152h ? 1 : 0);
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.A = 8388627;
        this.H = new ArrayList<>();
        this.I = new ArrayList<>();
        this.J = new int[2];
        this.L = new a();
        this.Q = new b();
        x0 a2 = x0.a(getContext(), attributeSet, j.Toolbar, i2, 0);
        h.h.m.m.a(this, context, j.Toolbar, attributeSet, a2.f1492b, i2, 0);
        this.f146p = a2.f(j.Toolbar_titleTextAppearance, 0);
        this.f147q = a2.f(j.Toolbar_subtitleTextAppearance, 0);
        this.A = a2.f1492b.getInteger(j.Toolbar_android_gravity, this.A);
        this.r = a2.f1492b.getInteger(j.Toolbar_buttonGravity, 48);
        int b2 = a2.b(j.Toolbar_titleMargin, 0);
        b2 = a2.f(j.Toolbar_titleMargins) ? a2.b(j.Toolbar_titleMargins, b2) : b2;
        this.w = b2;
        this.v = b2;
        this.u = b2;
        this.t = b2;
        int b3 = a2.b(j.Toolbar_titleMarginStart, -1);
        if (b3 >= 0) {
            this.t = b3;
        }
        int b4 = a2.b(j.Toolbar_titleMarginEnd, -1);
        if (b4 >= 0) {
            this.u = b4;
        }
        int b5 = a2.b(j.Toolbar_titleMarginTop, -1);
        if (b5 >= 0) {
            this.v = b5;
        }
        int b6 = a2.b(j.Toolbar_titleMarginBottom, -1);
        if (b6 >= 0) {
            this.w = b6;
        }
        this.s = a2.c(j.Toolbar_maxButtonHeight, -1);
        int b7 = a2.b(j.Toolbar_contentInsetStart, RecyclerView.UNDEFINED_DURATION);
        int b8 = a2.b(j.Toolbar_contentInsetEnd, RecyclerView.UNDEFINED_DURATION);
        int c2 = a2.c(j.Toolbar_contentInsetLeft, 0);
        int c3 = a2.c(j.Toolbar_contentInsetRight, 0);
        b();
        p0 p0Var = this.x;
        p0Var.f1455h = false;
        if (c2 != Integer.MIN_VALUE) {
            p0Var.e = c2;
            p0Var.a = c2;
        }
        if (c3 != Integer.MIN_VALUE) {
            p0Var.f1453f = c3;
            p0Var.f1452b = c3;
        }
        if (!(b7 == Integer.MIN_VALUE && b8 == Integer.MIN_VALUE)) {
            this.x.a(b7, b8);
        }
        this.y = a2.b(j.Toolbar_contentInsetStartWithNavigation, RecyclerView.UNDEFINED_DURATION);
        this.z = a2.b(j.Toolbar_contentInsetEndWithActions, RecyclerView.UNDEFINED_DURATION);
        this.f140j = a2.b(j.Toolbar_collapseIcon);
        this.f141k = a2.e(j.Toolbar_collapseContentDescription);
        CharSequence e2 = a2.e(j.Toolbar_title);
        if (!TextUtils.isEmpty(e2)) {
            setTitle(e2);
        }
        CharSequence e3 = a2.e(j.Toolbar_subtitle);
        if (!TextUtils.isEmpty(e3)) {
            setSubtitle(e3);
        }
        this.f144n = getContext();
        setPopupTheme(a2.f(j.Toolbar_popupTheme, 0));
        Drawable b9 = a2.b(j.Toolbar_navigationIcon);
        if (b9 != null) {
            setNavigationIcon(b9);
        }
        CharSequence e4 = a2.e(j.Toolbar_navigationContentDescription);
        if (!TextUtils.isEmpty(e4)) {
            setNavigationContentDescription(e4);
        }
        Drawable b10 = a2.b(j.Toolbar_logo);
        if (b10 != null) {
            setLogo(b10);
        }
        CharSequence e5 = a2.e(j.Toolbar_logoDescription);
        if (!TextUtils.isEmpty(e5)) {
            setLogoDescription(e5);
        }
        if (a2.f(j.Toolbar_titleTextColor)) {
            setTitleTextColor(a2.a(j.Toolbar_titleTextColor));
        }
        if (a2.f(j.Toolbar_subtitleTextColor)) {
            setSubtitleTextColor(a2.a(j.Toolbar_subtitleTextColor));
        }
        if (a2.f(j.Toolbar_menu)) {
            getMenuInflater().inflate(a2.f(j.Toolbar_menu, 0), getMenu());
        }
        a2.f1492b.recycle();
    }

    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof e) {
            return new e((e) layoutParams);
        }
        if (layoutParams instanceof a.C0030a) {
            return new e((a.C0030a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new e((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new e(layoutParams);
    }

    public final int b(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final boolean c(View view) {
        return view.getParent() == this || this.I.contains(view);
    }

    public final void a(View view, boolean z2) {
        e eVar;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            eVar = generateDefaultLayoutParams();
        } else if (!checkLayoutParams(layoutParams)) {
            eVar = generateLayoutParams(layoutParams);
        } else {
            eVar = (e) layoutParams;
        }
        eVar.f150b = 1;
        if (!z2 || this.f143m == null) {
            addView(view, eVar);
            return;
        }
        view.setLayoutParams(eVar);
        this.I.add(view);
    }

    public final void b() {
        if (this.x == null) {
            this.x = new p0();
        }
    }

    public final boolean d(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public final void a(View view, int i2, int i3, int i4, int i5, int i6) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i6 >= 0) {
            if (mode != 0) {
                i6 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i6);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final int a(View view, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i6 = marginLayoutParams.leftMargin - iArr[0];
        int i7 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i7) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i6);
        iArr[1] = Math.max(0, -i7);
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingRight() + getPaddingLeft() + max + i3, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i4, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i5, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    public final int a(View view, int i2, int[] iArr, int i3) {
        e eVar = (e) view.getLayoutParams();
        int i4 = eVar.leftMargin - iArr[0];
        int max = Math.max(0, i4) + i2;
        iArr[0] = Math.max(0, -i4);
        int a2 = a(view, i3);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, a2, max + measuredWidth, view.getMeasuredHeight() + a2);
        return measuredWidth + eVar.rightMargin + max;
    }

    public final int a(View view, int i2) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i3 = i2 > 0 ? (measuredHeight - i2) / 2 : 0;
        int i4 = eVar.a & 112;
        if (!(i4 == 16 || i4 == 48 || i4 == 80)) {
            i4 = this.A & 112;
        }
        if (i4 == 48) {
            return getPaddingTop() - i3;
        }
        if (i4 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - eVar.bottomMargin) - i3;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int i5 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i6 = eVar.topMargin;
        if (i5 < i6) {
            i5 = i6;
        } else {
            int i7 = (((height - paddingBottom) - measuredHeight) - i5) - paddingTop;
            int i8 = eVar.bottomMargin;
            if (i7 < i8) {
                i5 = Math.max(0, i5 - (i8 - i7));
            }
        }
        return paddingTop + i5;
    }

    public final void a(List<View> list, int i2) {
        boolean z2 = h.h.m.m.k(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, getLayoutDirection());
        list.clear();
        if (z2) {
            for (int i3 = childCount - 1; i3 >= 0; i3--) {
                View childAt = getChildAt(i3);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f150b == 0 && d(childAt) && a(eVar.a) == absoluteGravity) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt2 = getChildAt(i4);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f150b == 0 && d(childAt2) && a(eVar2.a) == absoluteGravity) {
                list.add(childAt2);
            }
        }
    }

    public final int a(int i2) {
        int k2 = h.h.m.m.k(this);
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, k2) & 7;
        if (absoluteGravity == 1 || absoluteGravity == 3 || absoluteGravity == 5) {
            return absoluteGravity;
        }
        return k2 == 1 ? 5 : 3;
    }

    public final int a(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }
}
