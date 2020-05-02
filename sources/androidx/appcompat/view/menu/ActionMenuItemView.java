package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import h.b.j;
import h.b.o.i.g;
import h.b.o.i.i;
import h.b.o.i.n;
import h.b.o.i.p;
import h.b.p.c;
import h.b.p.h0;
import h.b.p.z;

public class ActionMenuItemView extends z implements n.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: i  reason: collision with root package name */
    public i f67i;

    /* renamed from: j  reason: collision with root package name */
    public CharSequence f68j;

    /* renamed from: k  reason: collision with root package name */
    public Drawable f69k;

    /* renamed from: l  reason: collision with root package name */
    public g.b f70l;

    /* renamed from: m  reason: collision with root package name */
    public h0 f71m;

    /* renamed from: n  reason: collision with root package name */
    public b f72n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f73o;

    /* renamed from: p  reason: collision with root package name */
    public boolean f74p;

    /* renamed from: q  reason: collision with root package name */
    public int f75q;
    public int r;
    public int s;

    public class a extends h0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        public p b() {
            c.a aVar;
            b bVar = ActionMenuItemView.this.f72n;
            if (bVar == null || (aVar = c.this.y) == null) {
                return null;
            }
            return aVar.a();
        }

        public boolean c() {
            p b2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            g.b bVar = actionMenuItemView.f70l;
            if (bVar == null || !bVar.a(actionMenuItemView.f67i) || (b2 = b()) == null || !b2.b()) {
                return false;
            }
            return true;
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context) {
        this(context, (AttributeSet) null);
    }

    public void a(i iVar, int i2) {
        CharSequence charSequence;
        this.f67i = iVar;
        setIcon(iVar.getIcon());
        if (c()) {
            charSequence = iVar.getTitleCondensed();
        } else {
            charSequence = iVar.e;
        }
        setTitle(charSequence);
        setId(iVar.a);
        setVisibility(iVar.isVisible() ? 0 : 8);
        setEnabled(iVar.isEnabled());
        if (iVar.hasSubMenu() && this.f71m == null) {
            this.f71m = new a();
        }
    }

    public boolean b() {
        return d() && this.f67i.getIcon() == null;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean e() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i2 = configuration.screenWidthDp;
        return i2 >= 480 || (i2 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void f() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f68j);
        if (this.f69k != null) {
            if (!((this.f67i.y & 4) == 4) || (!this.f73o && !this.f74p)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        setText(z3 ? this.f68j : null);
        CharSequence charSequence3 = this.f67i.f1315q;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z3) {
                charSequence = null;
            } else {
                charSequence = this.f67i.e;
            }
            setContentDescription(charSequence);
        } else {
            setContentDescription(charSequence3);
        }
        CharSequence charSequence4 = this.f67i.r;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z3) {
                charSequence2 = this.f67i.e;
            }
            g.a.a.b.a.a((View) this, charSequence2);
            return;
        }
        g.a.a.b.a.a((View) this, charSequence4);
    }

    public i getItemData() {
        return this.f67i;
    }

    public void onClick(View view) {
        g.b bVar = this.f70l;
        if (bVar != null) {
            bVar.a(this.f67i);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f73o = e();
        f();
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        boolean d = d();
        if (d && (i4 = this.r) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f75q) : this.f75q;
        if (mode != 1073741824 && this.f75q > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i3);
        }
        if (!d && this.f69k != null) {
            super.setPadding((getMeasuredWidth() - this.f69k.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState((Parcelable) null);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var;
        if (!this.f67i.hasSubMenu() || (h0Var = this.f71m) == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.f74p != z) {
            this.f74p = z;
            i iVar = this.f67i;
            if (iVar != null) {
                iVar.f1312n.h();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f69k = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i2 = this.s;
            if (intrinsicWidth > i2) {
                intrinsicHeight = (int) (((float) intrinsicHeight) * (((float) i2) / ((float) intrinsicWidth)));
                intrinsicWidth = i2;
            }
            int i3 = this.s;
            if (intrinsicHeight > i3) {
                intrinsicWidth = (int) (((float) intrinsicWidth) * (((float) i3) / ((float) intrinsicHeight)));
                intrinsicHeight = i3;
            }
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }
        setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        f();
    }

    public void setItemInvoker(g.b bVar) {
        this.f70l = bVar;
    }

    public void setPadding(int i2, int i3, int i4, int i5) {
        this.r = i2;
        super.setPadding(i2, i3, i4, i5);
    }

    public void setPopupCallback(b bVar) {
        this.f72n = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f68j = charSequence;
        f();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Resources resources = context.getResources();
        this.f73o = e();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.ActionMenuItemView, i2, 0);
        this.f75q = obtainStyledAttributes.getDimensionPixelSize(j.ActionMenuItemView_android_minWidth, 0);
        obtainStyledAttributes.recycle();
        this.s = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.r = -1;
        setSaveEnabled(false);
    }

    public boolean a() {
        return d();
    }
}
