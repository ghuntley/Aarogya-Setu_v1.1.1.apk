package h.b.p;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.AlertController;
import h.b.k.g;
import h.h.m.m;

/* compiled from: AppCompatSpinner */
public class w extends Spinner {

    /* renamed from: m  reason: collision with root package name */
    public static final int[] f1478m = {16843505};
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final Context f1479f;

    /* renamed from: g  reason: collision with root package name */
    public h0 f1480g;

    /* renamed from: h  reason: collision with root package name */
    public SpinnerAdapter f1481h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f1482i;

    /* renamed from: j  reason: collision with root package name */
    public f f1483j;

    /* renamed from: k  reason: collision with root package name */
    public int f1484k;

    /* renamed from: l  reason: collision with root package name */
    public final Rect f1485l = new Rect();

    /* compiled from: AppCompatSpinner */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        public void onGlobalLayout() {
            if (!w.this.getInternalPopup().b()) {
                w.this.a();
            }
            ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    public class b implements f, DialogInterface.OnClickListener {
        public g e;

        /* renamed from: f  reason: collision with root package name */
        public ListAdapter f1486f;

        /* renamed from: g  reason: collision with root package name */
        public CharSequence f1487g;

        public b() {
        }

        public void a(ListAdapter listAdapter) {
            this.f1486f = listAdapter;
        }

        public boolean b() {
            g gVar = this.e;
            if (gVar != null) {
                return gVar.isShowing();
            }
            return false;
        }

        public int c() {
            return 0;
        }

        public void c(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        public int d() {
            return 0;
        }

        public void dismiss() {
            g gVar = this.e;
            if (gVar != null) {
                gVar.dismiss();
                this.e = null;
            }
        }

        public Drawable e() {
            return null;
        }

        public CharSequence f() {
            return this.f1487g;
        }

        public void onClick(DialogInterface dialogInterface, int i2) {
            w.this.setSelection(i2);
            if (w.this.getOnItemClickListener() != null) {
                w.this.performItemClick((View) null, i2, this.f1486f.getItemId(i2));
            }
            g gVar = this.e;
            if (gVar != null) {
                gVar.dismiss();
                this.e = null;
            }
        }

        public void a(CharSequence charSequence) {
            this.f1487g = charSequence;
        }

        public void b(int i2) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        public void a(int i2, int i3) {
            if (this.f1486f != null) {
                g.a aVar = new g.a(w.this.getPopupContext());
                CharSequence charSequence = this.f1487g;
                if (charSequence != null) {
                    aVar.a.f55f = charSequence;
                }
                ListAdapter listAdapter = this.f1486f;
                int selectedItemPosition = w.this.getSelectedItemPosition();
                AlertController.b bVar = aVar.a;
                bVar.f66q = listAdapter;
                bVar.r = this;
                bVar.u = selectedItemPosition;
                bVar.t = true;
                g a = aVar.a();
                this.e = a;
                ListView listView = a.f1122g.f42g;
                listView.setTextDirection(i2);
                listView.setTextAlignment(i3);
                this.e.show();
            }
        }

        public void a(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        public void a(int i2) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }
    }

    /* compiled from: AppCompatSpinner */
    public static class c implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter e;

        /* renamed from: f  reason: collision with root package name */
        public ListAdapter f1489f;

        public c(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.e = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1489f = (ListAdapter) spinnerAdapter;
            }
            if (theme == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            } else if (spinnerAdapter instanceof t0) {
                t0 t0Var = (t0) spinnerAdapter;
                if (t0Var.getDropDownViewTheme() == null) {
                    t0Var.setDropDownViewTheme(theme);
                }
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1489f;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        public Object getItem(int i2) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i2);
        }

        public long getItemId(int i2) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i2);
        }

        public int getItemViewType(int i2) {
            return 0;
        }

        public View getView(int i2, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i2, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.e;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i2) {
            ListAdapter listAdapter = this.f1489f;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i2);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.e;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    public class d extends k0 implements f {
        public CharSequence J;
        public ListAdapter K;
        public final Rect L = new Rect();
        public int M;

        /* compiled from: AppCompatSpinner */
        public class a implements AdapterView.OnItemClickListener {
            public a(w wVar) {
            }

            public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
                w.this.setSelection(i2);
                if (w.this.getOnItemClickListener() != null) {
                    d dVar = d.this;
                    w.this.performItemClick(view, i2, dVar.K.getItemId(i2));
                }
                d.this.dismiss();
            }
        }

        /* compiled from: AppCompatSpinner */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            public void onGlobalLayout() {
                d dVar = d.this;
                w wVar = w.this;
                if (dVar != null) {
                    if (!(m.w(wVar) && wVar.getGlobalVisibleRect(dVar.L))) {
                        d.this.dismiss();
                        return;
                    }
                    d.this.h();
                    d.super.a();
                    return;
                }
                throw null;
            }
        }

        /* compiled from: AppCompatSpinner */
        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener e;

            public c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.e = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = w.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.e);
                }
            }
        }

        public d(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2, 0);
            this.v = w.this;
            a(true);
            this.t = 0;
            this.w = new a(w.this);
        }

        public void c(int i2) {
            this.M = i2;
        }

        public CharSequence f() {
            return this.J;
        }

        public void h() {
            int i2;
            Drawable e = e();
            int i3 = 0;
            if (e != null) {
                e.getPadding(w.this.f1485l);
                i3 = d1.a(w.this) ? w.this.f1485l.right : -w.this.f1485l.left;
            } else {
                Rect rect = w.this.f1485l;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = w.this.getPaddingLeft();
            int paddingRight = w.this.getPaddingRight();
            int width = w.this.getWidth();
            w wVar = w.this;
            int i4 = wVar.f1484k;
            if (i4 == -2) {
                int a2 = wVar.a((SpinnerAdapter) this.K, e());
                int i5 = w.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = w.this.f1485l;
                int i6 = (i5 - rect2.left) - rect2.right;
                if (a2 > i6) {
                    a2 = i6;
                }
                d(Math.max(a2, (width - paddingLeft) - paddingRight));
            } else if (i4 == -1) {
                d((width - paddingLeft) - paddingRight);
            } else {
                d(i4);
            }
            if (d1.a(w.this)) {
                i2 = (((width - paddingRight) - this.f1432i) - this.M) + i3;
            } else {
                i2 = paddingLeft + this.M + i3;
            }
            this.f1433j = i2;
        }

        public void a(ListAdapter listAdapter) {
            super.a(listAdapter);
            this.K = listAdapter;
        }

        public void a(CharSequence charSequence) {
            this.J = charSequence;
        }

        public void a(int i2, int i3) {
            ViewTreeObserver viewTreeObserver;
            boolean b2 = b();
            h();
            this.F.setInputMethodMode(2);
            super.a();
            f0 f0Var = this.f1430g;
            f0Var.setChoiceMode(1);
            f0Var.setTextDirection(i2);
            f0Var.setTextAlignment(i3);
            int selectedItemPosition = w.this.getSelectedItemPosition();
            f0 f0Var2 = this.f1430g;
            if (b() && f0Var2 != null) {
                f0Var2.setListSelectionHidden(false);
                f0Var2.setSelection(selectedItemPosition);
                if (f0Var2.getChoiceMode() != 0) {
                    f0Var2.setItemChecked(selectedItemPosition, true);
                }
            }
            if (!b2 && (viewTreeObserver = w.this.getViewTreeObserver()) != null) {
                b bVar = new b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                this.F.setOnDismissListener(new c(bVar));
            }
        }
    }

    /* compiled from: AppCompatSpinner */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();
        public boolean e;

        /* compiled from: AppCompatSpinner */
        public static class a implements Parcelable.Creator<e> {
            public Object createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            public Object[] newArray(int i2) {
                return new e[i2];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeByte(this.e ? (byte) 1 : 0);
        }

        public e(Parcel parcel) {
            super(parcel);
            this.e = parcel.readByte() != 0;
        }
    }

    /* compiled from: AppCompatSpinner */
    public interface f {
        void a(int i2);

        void a(int i2, int i3);

        void a(Drawable drawable);

        void a(ListAdapter listAdapter);

        void a(CharSequence charSequence);

        void b(int i2);

        boolean b();

        int c();

        void c(int i2);

        int d();

        void dismiss();

        Drawable e();

        CharSequence f();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r4 != null) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public w(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.f1485l = r0
            android.content.Context r0 = r8.getContext()
            h.b.p.s0.a((android.view.View) r8, (android.content.Context) r0)
            int[] r0 = h.b.j.Spinner
            r1 = 0
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r11, r1)
            h.b.p.e r2 = new h.b.p.e
            r2.<init>(r8)
            r8.e = r2
            int r2 = h.b.j.Spinner_popupTheme
            int r2 = r0.getResourceId(r2, r1)
            if (r2 == 0) goto L_0x002f
            h.b.o.c r3 = new h.b.o.c
            r3.<init>((android.content.Context) r9, (int) r2)
            r8.f1479f = r3
            goto L_0x0031
        L_0x002f:
            r8.f1479f = r9
        L_0x0031:
            r2 = 0
            r3 = -1
            int[] r4 = f1478m     // Catch:{ Exception -> 0x004d, all -> 0x004a }
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r10, r4, r11, r1)     // Catch:{ Exception -> 0x004d, all -> 0x004a }
            boolean r5 = r4.hasValue(r1)     // Catch:{ Exception -> 0x0048 }
            if (r5 == 0) goto L_0x0059
            int r3 = r4.getInt(r1, r1)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0059
        L_0x0044:
            r9 = move-exception
            r2 = r4
            goto L_0x00d8
        L_0x0048:
            r5 = move-exception
            goto L_0x0050
        L_0x004a:
            r9 = move-exception
            goto L_0x00d8
        L_0x004d:
            r4 = move-exception
            r5 = r4
            r4 = r2
        L_0x0050:
            java.lang.String r6 = "AppCompatSpinner"
            java.lang.String r7 = "Could not read android:spinnerMode"
            android.util.Log.i(r6, r7, r5)     // Catch:{ all -> 0x0044 }
            if (r4 == 0) goto L_0x005c
        L_0x0059:
            r4.recycle()
        L_0x005c:
            r4 = 1
            if (r3 == 0) goto L_0x009c
            if (r3 == r4) goto L_0x0062
            goto L_0x00ac
        L_0x0062:
            h.b.p.w$d r3 = new h.b.p.w$d
            android.content.Context r5 = r8.f1479f
            r3.<init>(r5, r10, r11)
            android.content.Context r5 = r8.f1479f
            int[] r6 = h.b.j.Spinner
            h.b.p.x0 r1 = h.b.p.x0.a(r5, r10, r6, r11, r1)
            int r5 = h.b.j.Spinner_android_dropDownWidth
            r6 = -2
            int r5 = r1.e(r5, r6)
            r8.f1484k = r5
            int r5 = h.b.j.Spinner_android_popupBackground
            android.graphics.drawable.Drawable r5 = r1.b(r5)
            android.widget.PopupWindow r6 = r3.F
            r6.setBackgroundDrawable(r5)
            int r5 = h.b.j.Spinner_android_prompt
            java.lang.String r5 = r0.getString(r5)
            r3.J = r5
            android.content.res.TypedArray r1 = r1.f1492b
            r1.recycle()
            r8.f1483j = r3
            h.b.p.v r1 = new h.b.p.v
            r1.<init>(r8, r8, r3)
            r8.f1480g = r1
            goto L_0x00ac
        L_0x009c:
            h.b.p.w$b r1 = new h.b.p.w$b
            r1.<init>()
            r8.f1483j = r1
            int r3 = h.b.j.Spinner_android_prompt
            java.lang.String r3 = r0.getString(r3)
            r1.a((java.lang.CharSequence) r3)
        L_0x00ac:
            int r1 = h.b.j.Spinner_android_entries
            java.lang.CharSequence[] r1 = r0.getTextArray(r1)
            if (r1 == 0) goto L_0x00c4
            android.widget.ArrayAdapter r3 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r3.<init>(r9, r5, r1)
            int r9 = h.b.g.support_simple_spinner_dropdown_item
            r3.setDropDownViewResource(r9)
            r8.setAdapter((android.widget.SpinnerAdapter) r3)
        L_0x00c4:
            r0.recycle()
            r8.f1482i = r4
            android.widget.SpinnerAdapter r9 = r8.f1481h
            if (r9 == 0) goto L_0x00d2
            r8.setAdapter((android.widget.SpinnerAdapter) r9)
            r8.f1481h = r2
        L_0x00d2:
            h.b.p.e r9 = r8.e
            r9.a(r10, r11)
            return
        L_0x00d8:
            if (r2 == 0) goto L_0x00dd
            r2.recycle()
        L_0x00dd:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.p.w.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i3 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i3 = Math.max(i3, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i3;
        }
        drawable.getPadding(this.f1485l);
        Rect rect = this.f1485l;
        return i3 + rect.left + rect.right;
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.e;
        if (eVar != null) {
            eVar.a();
        }
    }

    public int getDropDownHorizontalOffset() {
        f fVar = this.f1483j;
        if (fVar != null) {
            return fVar.c();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        f fVar = this.f1483j;
        if (fVar != null) {
            return fVar.d();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f1483j != null) {
            return this.f1484k;
        }
        return super.getDropDownWidth();
    }

    public final f getInternalPopup() {
        return this.f1483j;
    }

    public Drawable getPopupBackground() {
        f fVar = this.f1483j;
        if (fVar != null) {
            return fVar.e();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1479f;
    }

    public CharSequence getPrompt() {
        f fVar = this.f1483j;
        return fVar != null ? fVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.e;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.f1483j;
        if (fVar != null && fVar.b()) {
            this.f1483j.dismiss();
        }
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f1483j != null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        if (eVar.e && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new a());
        }
    }

    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        f fVar = this.f1483j;
        eVar.e = fVar != null && fVar.b();
        return eVar;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        h0 h0Var = this.f1480g;
        if (h0Var == null || !h0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        f fVar = this.f1483j;
        if (fVar == null) {
            return super.performClick();
        }
        if (fVar.b()) {
            return true;
        }
        a();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.e;
        if (eVar != null) {
            eVar.d();
        }
    }

    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        e eVar = this.e;
        if (eVar != null) {
            eVar.a(i2);
        }
    }

    public void setDropDownHorizontalOffset(int i2) {
        f fVar = this.f1483j;
        if (fVar != null) {
            fVar.c(i2);
            this.f1483j.a(i2);
            return;
        }
        super.setDropDownHorizontalOffset(i2);
    }

    public void setDropDownVerticalOffset(int i2) {
        f fVar = this.f1483j;
        if (fVar != null) {
            fVar.b(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    public void setDropDownWidth(int i2) {
        if (this.f1483j != null) {
            this.f1484k = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        f fVar = this.f1483j;
        if (fVar != null) {
            fVar.a(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(h.b.l.a.a.c(getPopupContext(), i2));
    }

    public void setPrompt(CharSequence charSequence) {
        f fVar = this.f1483j;
        if (fVar != null) {
            fVar.a(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.b(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        e eVar = this.e;
        if (eVar != null) {
            eVar.a(mode);
        }
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1482i) {
            this.f1481h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1483j != null) {
            Context context = this.f1479f;
            if (context == null) {
                context = getContext();
            }
            this.f1483j.a((ListAdapter) new c(spinnerAdapter, context.getTheme()));
        }
    }

    public void a() {
        this.f1483j.a(getTextDirection(), getTextAlignment());
    }
}
