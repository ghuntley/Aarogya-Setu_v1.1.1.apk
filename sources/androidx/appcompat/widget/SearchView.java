package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import com.crashlytics.android.answers.SearchEvent;
import h.b.p.d1;
import h.b.p.i0;
import h.b.p.r0;
import h.b.p.x0;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

public class SearchView extends i0 implements h.b.o.b {
    public static final n u0 = (Build.VERSION.SDK_INT < 29 ? new n() : null);
    public final ImageView A;
    public final View B;
    public p C;
    public Rect D;
    public Rect E;
    public int[] F;
    public int[] G;
    public final ImageView H;
    public final Drawable I;
    public final int J;
    public final int K;
    public final Intent L;
    public final Intent M;
    public final CharSequence N;
    public l O;
    public k P;
    public View.OnFocusChangeListener Q;
    public m R;
    public View.OnClickListener S;
    public boolean T;
    public boolean U;
    public h.i.a.a V;
    public boolean W;
    public CharSequence a0;
    public boolean b0;
    public boolean c0;
    public int d0;
    public boolean e0;
    public CharSequence f0;
    public CharSequence g0;
    public boolean h0;
    public int i0;
    public SearchableInfo j0;
    public Bundle k0;
    public final Runnable l0;
    public Runnable m0;
    public final WeakHashMap<String, Drawable.ConstantState> n0;
    public final View.OnClickListener o0;
    public View.OnKeyListener p0;
    public final TextView.OnEditorActionListener q0;
    public final AdapterView.OnItemClickListener r0;
    public final AdapterView.OnItemSelectedListener s0;
    public final SearchAutoComplete t;
    public TextWatcher t0;
    public final View u;
    public final View v;
    public final View w;
    public final ImageView x;
    public final ImageView y;
    public final ImageView z;

    public static class SearchAutoComplete extends h.b.p.d {

        /* renamed from: h  reason: collision with root package name */
        public int f128h;

        /* renamed from: i  reason: collision with root package name */
        public SearchView f129i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f130j;

        /* renamed from: k  reason: collision with root package name */
        public final Runnable f131k;

        public class a implements Runnable {
            public a() {
            }

            public void run() {
                SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                if (searchAutoComplete.f130j) {
                    ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                    searchAutoComplete.f130j = false;
                }
            }
        }

        public SearchAutoComplete(Context context) {
            this(context, (AttributeSet) null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i3 = configuration.screenHeightDp;
            if (i2 >= 960 && i3 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                return (i2 < 640 || i3 < 480) ? 160 : 192;
            }
            return 192;
        }

        public void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                setInputMethodMode(1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            n nVar = SearchView.u0;
            if (nVar != null) {
                n.a();
                Method method = nVar.c;
                if (method != null) {
                    try {
                        method.invoke(this, new Object[]{true});
                    } catch (Exception unused) {
                    }
                }
            } else {
                throw null;
            }
        }

        public boolean enoughToFilter() {
            return this.f128h <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f130j) {
                removeCallbacks(this.f131k);
                post(this.f131k);
            }
            return onCreateInputConnection;
        }

        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        public void onFocusChanged(boolean z, int i2, Rect rect) {
            super.onFocusChanged(z, i2, rect);
            SearchView searchView = this.f129i;
            searchView.b(searchView.U);
            searchView.post(searchView.l0);
            if (searchView.t.hasFocus()) {
                searchView.d();
            }
        }

        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f129i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f129i.hasFocus() && getVisibility() == 0) {
                this.f130j = true;
                if (SearchView.a(getContext())) {
                    a();
                }
            }
        }

        public void performCompletion() {
        }

        public void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f130j = false;
                removeCallbacks(this.f131k);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f130j = false;
                removeCallbacks(this.f131k);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f130j = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f129i = searchView;
        }

        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f128h = i2;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, h.b.a.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            this.f131k = new a();
            this.f128h = getThreshold();
        }
    }

    public class a implements TextWatcher {
        public a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        }

        public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            SearchView searchView = SearchView.this;
            Editable text = searchView.t.getText();
            searchView.g0 = text;
            boolean z = !TextUtils.isEmpty(text);
            searchView.a(z);
            searchView.c(!z);
            searchView.h();
            searchView.k();
            if (searchView.O != null && !TextUtils.equals(charSequence, searchView.f0)) {
                searchView.O.a(charSequence.toString());
            }
            searchView.f0 = charSequence.toString();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            SearchView.this.i();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        public void run() {
            h.i.a.a aVar = SearchView.this.V;
            if (aVar instanceof r0) {
                aVar.a((Cursor) null);
            }
        }
    }

    public class d implements View.OnFocusChangeListener {
        public d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.Q;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    public class e implements View.OnLayoutChangeListener {
        public e() {
        }

        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int i10;
            int i11;
            SearchView searchView = SearchView.this;
            if (searchView.B.getWidth() > 1) {
                Resources resources = searchView.getContext().getResources();
                int paddingLeft = searchView.v.getPaddingLeft();
                Rect rect = new Rect();
                boolean a2 = d1.a(searchView);
                if (searchView.T) {
                    i10 = resources.getDimensionPixelSize(h.b.d.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(h.b.d.abc_dropdownitem_icon_width);
                } else {
                    i10 = 0;
                }
                searchView.t.getDropDownBackground().getPadding(rect);
                if (a2) {
                    i11 = -rect.left;
                } else {
                    i11 = paddingLeft - (rect.left + i10);
                }
                searchView.t.setDropDownHorizontalOffset(i11);
                searchView.t.setDropDownWidth((((searchView.B.getWidth() + rect.left) + rect.right) + i10) - paddingLeft);
            }
        }
    }

    public class f implements View.OnClickListener {
        public f() {
        }

        public void onClick(View view) {
            String str;
            SearchView searchView = SearchView.this;
            if (view == searchView.x) {
                searchView.f();
            } else if (view == searchView.z) {
                searchView.e();
            } else if (view == searchView.y) {
                searchView.g();
            } else if (view == searchView.A) {
                SearchableInfo searchableInfo = searchView.j0;
                if (searchableInfo != null) {
                    try {
                        if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                            Intent intent = new Intent(searchView.L);
                            ComponentName searchActivity = searchableInfo.getSearchActivity();
                            if (searchActivity == null) {
                                str = null;
                            } else {
                                str = searchActivity.flattenToShortString();
                            }
                            intent.putExtra("calling_package", str);
                            searchView.getContext().startActivity(intent);
                        } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                            searchView.getContext().startActivity(searchView.a(searchView.M, searchableInfo));
                        }
                    } catch (ActivityNotFoundException unused) {
                        Log.w("SearchView", "Could not find voice search activity");
                    }
                }
            } else if (view == searchView.t) {
                searchView.d();
            }
        }
    }

    public class g implements View.OnKeyListener {
        public g() {
        }

        public boolean onKey(View view, int i2, KeyEvent keyEvent) {
            int i3;
            SearchView searchView = SearchView.this;
            if (searchView.j0 == null) {
                return false;
            }
            if (!searchView.t.isPopupShowing() || SearchView.this.t.getListSelection() == -1) {
                if ((TextUtils.getTrimmedLength(SearchView.this.t.getText()) == 0) || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i2 != 66) {
                    return false;
                }
                view.cancelLongPress();
                SearchView searchView2 = SearchView.this;
                searchView2.a(0, (String) null, searchView2.t.getText().toString());
                return true;
            }
            SearchView searchView3 = SearchView.this;
            if (searchView3.j0 == null || searchView3.V == null || keyEvent.getAction() != 0 || !keyEvent.hasNoModifiers()) {
                return false;
            }
            if (i2 == 66 || i2 == 84 || i2 == 61) {
                return searchView3.b(searchView3.t.getListSelection());
            }
            if (i2 == 21 || i2 == 22) {
                if (i2 == 21) {
                    i3 = 0;
                } else {
                    i3 = searchView3.t.length();
                }
                searchView3.t.setSelection(i3);
                searchView3.t.setListSelection(0);
                searchView3.t.clearListSelection();
                searchView3.t.a();
                return true;
            } else if (i2 != 19) {
                return false;
            } else {
                int listSelection = searchView3.t.getListSelection();
                return false;
            }
        }
    }

    public class h implements TextView.OnEditorActionListener {
        public h() {
        }

        public boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
            SearchView.this.g();
            return true;
        }
    }

    public class i implements AdapterView.OnItemClickListener {
        public i() {
        }

        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.b(i2);
        }
    }

    public class j implements AdapterView.OnItemSelectedListener {
        public j() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            SearchView.this.c(i2);
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    public interface k {
        boolean a();
    }

    public interface l {
        boolean a(String str);

        boolean b(String str);
    }

    public interface m {
        boolean a(int i2);

        boolean b(int i2);
    }

    public static class n {
        public Method a = null;

        /* renamed from: b  reason: collision with root package name */
        public Method f132b = null;
        public Method c = null;

        @SuppressLint({"DiscouragedPrivateApi"})
        public n() {
            a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f132b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class o extends h.j.a.a {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: g  reason: collision with root package name */
        public boolean f133g;

        public static class a implements Parcelable.ClassLoaderCreator<o> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new o(parcel, classLoader);
            }

            public Object[] newArray(int i2) {
                return new o[i2];
            }

            public Object createFromParcel(Parcel parcel) {
                return new o(parcel, (ClassLoader) null);
            }
        }

        public o(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("SearchView.SavedState{");
            a2.append(Integer.toHexString(System.identityHashCode(this)));
            a2.append(" isIconified=");
            a2.append(this.f133g);
            a2.append("}");
            return a2.toString();
        }

        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeParcelable(this.e, i2);
            parcel.writeValue(Boolean.valueOf(this.f133g));
        }

        public o(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f133g = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class p extends TouchDelegate {
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        public final Rect f134b = new Rect();
        public final Rect c = new Rect();
        public final Rect d = new Rect();
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f135f;

        public p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            a(rect, rect2);
            this.a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f134b.set(rect);
            this.d.set(rect);
            Rect rect3 = this.d;
            int i2 = this.e;
            rect3.inset(-i2, -i2);
            this.c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
        /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r8) {
            /*
                r7 = this;
                float r0 = r8.getX()
                int r0 = (int) r0
                float r1 = r8.getY()
                int r1 = (int) r1
                int r2 = r8.getAction()
                r3 = 2
                r4 = 1
                r5 = 0
                if (r2 == 0) goto L_0x0032
                if (r2 == r4) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003d
            L_0x001b:
                boolean r2 = r7.f135f
                r7.f135f = r5
                goto L_0x002f
            L_0x0020:
                boolean r2 = r7.f135f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r7.d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r4 = r2
                r2 = 0
                goto L_0x003f
            L_0x002f:
                r4 = r2
            L_0x0030:
                r2 = 1
                goto L_0x003f
            L_0x0032:
                android.graphics.Rect r2 = r7.f134b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003d
                r7.f135f = r4
                goto L_0x0030
            L_0x003d:
                r2 = 1
                r4 = 0
            L_0x003f:
                if (r4 == 0) goto L_0x0072
                if (r2 == 0) goto L_0x005f
                android.graphics.Rect r2 = r7.c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x005f
                android.view.View r0 = r7.a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r7.a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r8.setLocation(r0, r1)
                goto L_0x006c
            L_0x005f:
                android.graphics.Rect r2 = r7.c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r8.setLocation(r0, r1)
            L_0x006c:
                android.view.View r0 = r7.a
                boolean r5 = r0.dispatchTouchEvent(r8)
            L_0x0072:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(h.b.d.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(h.b.d.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        this.t.setText(charSequence);
        this.t.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        if (r2.e0 == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r3) {
        /*
            r2 = this;
            boolean r0 = r2.W
            r1 = 0
            if (r0 == 0) goto L_0x0021
            if (r0 != 0) goto L_0x000b
            boolean r0 = r2.e0
            if (r0 == 0) goto L_0x0011
        L_0x000b:
            boolean r0 = r2.U
            if (r0 != 0) goto L_0x0011
            r0 = 1
            goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            if (r0 == 0) goto L_0x0021
            boolean r0 = r2.hasFocus()
            if (r0 == 0) goto L_0x0021
            if (r3 != 0) goto L_0x0023
            boolean r3 = r2.e0
            if (r3 != 0) goto L_0x0021
            goto L_0x0023
        L_0x0021:
            r1 = 8
        L_0x0023:
            android.widget.ImageView r3 = r2.y
            r3.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.a(boolean):void");
    }

    public void b() {
        this.t.setText("");
        SearchAutoComplete searchAutoComplete = this.t;
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.g0 = "";
        clearFocus();
        b(true);
        this.t.setImeOptions(this.i0);
        this.h0 = false;
    }

    public final void c(boolean z2) {
        int i2 = 8;
        if (this.e0 && !this.U && z2) {
            this.y.setVisibility(8);
            i2 = 0;
        }
        this.A.setVisibility(i2);
    }

    public void clearFocus() {
        this.c0 = true;
        super.clearFocus();
        this.t.clearFocus();
        this.t.setImeVisibility(false);
        this.c0 = false;
    }

    public void d() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.t.refreshAutoCompleteResults();
            return;
        }
        n nVar = u0;
        SearchAutoComplete searchAutoComplete = this.t;
        if (nVar != null) {
            n.a();
            Method method = nVar.a;
            if (method != null) {
                try {
                    method.invoke(searchAutoComplete, new Object[0]);
                } catch (Exception unused) {
                }
            }
            n nVar2 = u0;
            SearchAutoComplete searchAutoComplete2 = this.t;
            if (nVar2 != null) {
                n.a();
                Method method2 = nVar2.f132b;
                if (method2 != null) {
                    try {
                        method2.invoke(searchAutoComplete2, new Object[0]);
                    } catch (Exception unused2) {
                    }
                }
            } else {
                throw null;
            }
        } else {
            throw null;
        }
    }

    public void e() {
        if (!TextUtils.isEmpty(this.t.getText())) {
            this.t.setText("");
            this.t.requestFocus();
            this.t.setImeVisibility(true);
        } else if (this.T) {
            k kVar = this.P;
            if (kVar == null || !kVar.a()) {
                clearFocus();
                b(true);
            }
        }
    }

    public void f() {
        b(false);
        this.t.requestFocus();
        this.t.setImeVisibility(true);
        View.OnClickListener onClickListener = this.S;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void g() {
        Editable text = this.t.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            l lVar = this.O;
            if (lVar == null || !lVar.b(text.toString())) {
                if (this.j0 != null) {
                    a(0, (String) null, text.toString());
                }
                this.t.setImeVisibility(false);
                this.t.dismissDropDown();
            }
        }
    }

    public int getImeOptions() {
        return this.t.getImeOptions();
    }

    public int getInputType() {
        return this.t.getInputType();
    }

    public int getMaxWidth() {
        return this.d0;
    }

    public CharSequence getQuery() {
        return this.t.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.a0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.j0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.N;
        }
        return getContext().getText(this.j0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.K;
    }

    public int getSuggestionRowLayout() {
        return this.J;
    }

    public h.i.a.a getSuggestionsAdapter() {
        return this.V;
    }

    public final void h() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.t.getText());
        int i2 = 0;
        if (!z3 && (!this.T || this.h0)) {
            z2 = false;
        }
        ImageView imageView = this.z;
        if (!z2) {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        Drawable drawable = this.z.getDrawable();
        if (drawable != null) {
            drawable.setState(z3 ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public void i() {
        int[] iArr = this.t.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.v.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.w.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void j() {
        SpannableStringBuilder queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.t;
        if (queryHint == null) {
            queryHint = "";
        }
        if (this.T && this.I != null) {
            int textSize = (int) (((double) this.t.getTextSize()) * 1.25d);
            this.I.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(this.I), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void k() {
        int i2 = 0;
        if (!((this.W || this.e0) && !this.U) || !(this.y.getVisibility() == 0 || this.A.getVisibility() == 0)) {
            i2 = 8;
        }
        this.w.setVisibility(i2);
    }

    public void onDetachedFromWindow() {
        removeCallbacks(this.l0);
        post(this.m0);
        super.onDetachedFromWindow();
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            SearchAutoComplete searchAutoComplete = this.t;
            Rect rect = this.D;
            searchAutoComplete.getLocationInWindow(this.F);
            getLocationInWindow(this.G);
            int[] iArr = this.F;
            int i6 = iArr[1];
            int[] iArr2 = this.G;
            int i7 = i6 - iArr2[1];
            int i8 = iArr[0] - iArr2[0];
            rect.set(i8, i7, searchAutoComplete.getWidth() + i8, searchAutoComplete.getHeight() + i7);
            Rect rect2 = this.E;
            Rect rect3 = this.D;
            rect2.set(rect3.left, 0, rect3.right, i5 - i3);
            p pVar = this.C;
            if (pVar == null) {
                p pVar2 = new p(this.E, this.D, this.t);
                this.C = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.a(this.E, this.D);
        }
    }

    public void onMeasure(int i2, int i3) {
        int i4;
        if (this.U) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            int i5 = this.d0;
            size = i5 > 0 ? Math.min(i5, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.d0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i4 = this.d0) > 0) {
            size = Math.min(i4, size);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o oVar = (o) parcelable;
        super.onRestoreInstanceState(oVar.e);
        b(oVar.f133g);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        o oVar = new o(super.onSaveInstanceState());
        oVar.f133g = this.U;
        return oVar;
    }

    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        post(this.l0);
    }

    public boolean requestFocus(int i2, Rect rect) {
        if (this.c0 || !isFocusable()) {
            return false;
        }
        if (this.U) {
            return super.requestFocus(i2, rect);
        }
        boolean requestFocus = this.t.requestFocus(i2, rect);
        if (requestFocus) {
            b(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.k0 = bundle;
    }

    public void setIconified(boolean z2) {
        if (z2) {
            e();
        } else {
            f();
        }
    }

    public void setIconifiedByDefault(boolean z2) {
        if (this.T != z2) {
            this.T = z2;
            b(z2);
            j();
        }
    }

    public void setImeOptions(int i2) {
        this.t.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.t.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.d0 = i2;
        requestLayout();
    }

    public void setOnCloseListener(k kVar) {
        this.P = kVar;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.Q = onFocusChangeListener;
    }

    public void setOnQueryTextListener(l lVar) {
        this.O = lVar;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.S = onClickListener;
    }

    public void setOnSuggestionListener(m mVar) {
        this.R = mVar;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.a0 = charSequence;
        j();
    }

    public void setQueryRefinementEnabled(boolean z2) {
        this.b0 = z2;
        h.i.a.a aVar = this.V;
        if (aVar instanceof r0) {
            ((r0) aVar).v = z2 ? 2 : 1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (getContext().getPackageManager().resolveActivity(r2, com.crashlytics.android.core.LogFileManager.MAX_LOG_SIZE) != null) goto L_0x00a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.j0 = r7
            r0 = 1
            r1 = 65536(0x10000, float:9.18355E-41)
            r2 = 0
            if (r7 == 0) goto L_0x006e
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.t
            int r7 = r7.getSuggestThreshold()
            r3.setThreshold(r7)
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.t
            android.app.SearchableInfo r3 = r6.j0
            int r3 = r3.getImeOptions()
            r7.setImeOptions(r3)
            android.app.SearchableInfo r7 = r6.j0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r0) goto L_0x0036
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.j0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L_0x0036
            r7 = r7 | r1
            r3 = 524288(0x80000, float:7.34684E-40)
            r7 = r7 | r3
        L_0x0036:
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.t
            r3.setInputType(r7)
            h.i.a.a r7 = r6.V
            if (r7 == 0) goto L_0x0042
            r7.a(r2)
        L_0x0042:
            android.app.SearchableInfo r7 = r6.j0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L_0x006b
            h.b.p.r0 r7 = new h.b.p.r0
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.j0
            java.util.WeakHashMap<java.lang.String, android.graphics.drawable.Drawable$ConstantState> r5 = r6.n0
            r7.<init>(r3, r6, r4, r5)
            r6.V = r7
            androidx.appcompat.widget.SearchView$SearchAutoComplete r3 = r6.t
            r3.setAdapter(r7)
            h.i.a.a r7 = r6.V
            h.b.p.r0 r7 = (h.b.p.r0) r7
            boolean r3 = r6.b0
            if (r3 == 0) goto L_0x0068
            r3 = 2
            goto L_0x0069
        L_0x0068:
            r3 = 1
        L_0x0069:
            r7.v = r3
        L_0x006b:
            r6.j()
        L_0x006e:
            android.app.SearchableInfo r7 = r6.j0
            r3 = 0
            if (r7 == 0) goto L_0x009f
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L_0x009f
            android.app.SearchableInfo r7 = r6.j0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L_0x0084
            android.content.Intent r2 = r6.L
            goto L_0x008e
        L_0x0084:
            android.app.SearchableInfo r7 = r6.j0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L_0x008e
            android.content.Intent r2 = r6.M
        L_0x008e:
            if (r2 == 0) goto L_0x009f
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r2, r1)
            if (r7 == 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r0 = 0
        L_0x00a0:
            r6.e0 = r0
            if (r0 == 0) goto L_0x00ab
            androidx.appcompat.widget.SearchView$SearchAutoComplete r7 = r6.t
            java.lang.String r0 = "nm"
            r7.setPrivateImeOptions(r0)
        L_0x00ab:
            boolean r7 = r6.U
            r6.b((boolean) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z2) {
        this.W = z2;
        b(this.U);
    }

    public void setSuggestionsAdapter(h.i.a.a aVar) {
        this.V = aVar;
        this.t.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.b.a.searchViewStyle);
    }

    public SearchView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.D = new Rect();
        this.E = new Rect();
        this.F = new int[2];
        this.G = new int[2];
        this.l0 = new b();
        this.m0 = new c();
        this.n0 = new WeakHashMap<>();
        this.o0 = new f();
        this.p0 = new g();
        this.q0 = new h();
        this.r0 = new i();
        this.s0 = new j();
        this.t0 = new a();
        x0 x0Var = new x0(context, context.obtainStyledAttributes(attributeSet, h.b.j.SearchView, i2, 0));
        LayoutInflater.from(context).inflate(x0Var.f(h.b.j.SearchView_layout, h.b.g.abc_search_view), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(h.b.f.search_src_text);
        this.t = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.u = findViewById(h.b.f.search_edit_frame);
        this.v = findViewById(h.b.f.search_plate);
        this.w = findViewById(h.b.f.submit_area);
        this.x = (ImageView) findViewById(h.b.f.search_button);
        this.y = (ImageView) findViewById(h.b.f.search_go_btn);
        this.z = (ImageView) findViewById(h.b.f.search_close_btn);
        this.A = (ImageView) findViewById(h.b.f.search_voice_btn);
        this.H = (ImageView) findViewById(h.b.f.search_mag_icon);
        h.h.m.m.a(this.v, x0Var.b(h.b.j.SearchView_queryBackground));
        this.w.setBackground(x0Var.b(h.b.j.SearchView_submitBackground));
        this.x.setImageDrawable(x0Var.b(h.b.j.SearchView_searchIcon));
        this.y.setImageDrawable(x0Var.b(h.b.j.SearchView_goIcon));
        this.z.setImageDrawable(x0Var.b(h.b.j.SearchView_closeIcon));
        this.A.setImageDrawable(x0Var.b(h.b.j.SearchView_voiceIcon));
        this.H.setImageDrawable(x0Var.b(h.b.j.SearchView_searchIcon));
        this.I = x0Var.b(h.b.j.SearchView_searchHintIcon);
        g.a.a.b.a.a((View) this.x, (CharSequence) getResources().getString(h.b.h.abc_searchview_description_search));
        this.J = x0Var.f(h.b.j.SearchView_suggestionRowLayout, h.b.g.abc_search_dropdown_item_icons_2line);
        this.K = x0Var.f(h.b.j.SearchView_commitIcon, 0);
        this.x.setOnClickListener(this.o0);
        this.z.setOnClickListener(this.o0);
        this.y.setOnClickListener(this.o0);
        this.A.setOnClickListener(this.o0);
        this.t.setOnClickListener(this.o0);
        this.t.addTextChangedListener(this.t0);
        this.t.setOnEditorActionListener(this.q0);
        this.t.setOnItemClickListener(this.r0);
        this.t.setOnItemSelectedListener(this.s0);
        this.t.setOnKeyListener(this.p0);
        this.t.setOnFocusChangeListener(new d());
        setIconifiedByDefault(x0Var.a(h.b.j.SearchView_iconifiedByDefault, true));
        int c2 = x0Var.c(h.b.j.SearchView_android_maxWidth, -1);
        if (c2 != -1) {
            setMaxWidth(c2);
        }
        this.N = x0Var.e(h.b.j.SearchView_defaultQueryHint);
        this.a0 = x0Var.e(h.b.j.SearchView_queryHint);
        int d2 = x0Var.d(h.b.j.SearchView_android_imeOptions, -1);
        if (d2 != -1) {
            setImeOptions(d2);
        }
        int d3 = x0Var.d(h.b.j.SearchView_android_inputType, -1);
        if (d3 != -1) {
            setInputType(d3);
        }
        setFocusable(x0Var.a(h.b.j.SearchView_android_focusable, true));
        x0Var.f1492b.recycle();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.L = intent;
        intent.addFlags(268435456);
        this.L.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.M = intent2;
        intent2.addFlags(268435456);
        View findViewById = findViewById(this.t.getDropDownAnchor());
        this.B = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(new e());
        }
        b(this.T);
        j();
    }

    public boolean c(int i2) {
        m mVar = this.R;
        if (mVar != null && mVar.a(i2)) {
            return false;
        }
        Editable text = this.t.getText();
        Cursor cursor = this.V.f1855g;
        if (cursor == null) {
            return true;
        }
        if (cursor.moveToPosition(i2)) {
            CharSequence b2 = this.V.b(cursor);
            if (b2 != null) {
                setQuery(b2);
                return true;
            }
            setQuery(text);
            return true;
        }
        setQuery(text);
        return true;
    }

    public void a(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public void a() {
        if (!this.h0) {
            this.h0 = true;
            int imeOptions = this.t.getImeOptions();
            this.i0 = imeOptions;
            this.t.setImeOptions(imeOptions | 33554432);
            this.t.setText("");
            setIconified(false);
        }
    }

    public final void b(boolean z2) {
        this.U = z2;
        int i2 = 0;
        int i3 = z2 ? 0 : 8;
        boolean z3 = !TextUtils.isEmpty(this.t.getText());
        this.x.setVisibility(i3);
        a(z3);
        this.u.setVisibility(z2 ? 8 : 0);
        if (this.H.getDrawable() == null || this.T) {
            i2 = 8;
        }
        this.H.setVisibility(i2);
        h();
        c(!z3);
        k();
    }

    public void a(int i2, String str, String str2) {
        getContext().startActivity(a("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i2, str));
    }

    public final Intent a(String str, Uri uri, String str2, String str3, int i2, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.g0);
        if (str3 != null) {
            intent.putExtra(SearchEvent.QUERY_ATTRIBUTE, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.k0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i2 != 0) {
            intent.putExtra("action_key", i2);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.j0.getSearchActivity());
        return intent;
    }

    public boolean b(int i2) {
        int i3;
        Uri uri;
        String a2;
        m mVar = this.R;
        if (mVar != null && mVar.b(i2)) {
            return false;
        }
        Cursor cursor = this.V.f1855g;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                String a3 = r0.a(cursor, "suggest_intent_action");
                if (a3 == null) {
                    a3 = this.j0.getSuggestIntentAction();
                }
                if (a3 == null) {
                    a3 = "android.intent.action.SEARCH";
                }
                String str = a3;
                String a4 = r0.a(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (a4 == null) {
                    a4 = this.j0.getSuggestIntentData();
                }
                if (!(a4 == null || (a2 = r0.a(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) == null)) {
                    a4 = a4 + "/" + Uri.encode(a2);
                }
                if (a4 == null) {
                    uri = null;
                } else {
                    uri = Uri.parse(a4);
                }
                intent = a(str, uri, r0.a(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), r0.a(cursor, cursor.getColumnIndex("suggest_intent_query")), 0, (String) null);
            } catch (RuntimeException e2) {
                try {
                    i3 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i3 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i3 + " returned exception.", e2);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e3) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e3);
                }
            }
        }
        this.t.setImeVisibility(false);
        this.t.dismissDropDown();
        return true;
    }

    public final Intent a(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1073741824);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.k0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        int i2 = 1;
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String str = null;
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i2 = searchableInfo.getVoiceMaxResults();
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public static boolean a(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }
}
