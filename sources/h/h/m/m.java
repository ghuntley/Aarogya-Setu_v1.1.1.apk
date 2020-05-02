package h.h.m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import h.h.m.a;
import h.h.m.w.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ViewCompat */
public class m {
    public static WeakHashMap<View, r> a = null;

    /* renamed from: b  reason: collision with root package name */
    public static Field f1816b;
    public static boolean c = false;
    public static ThreadLocal<Rect> d;

    /* compiled from: ViewCompat */
    public static class a implements View.OnApplyWindowInsetsListener {
        public final /* synthetic */ k a;

        public a(k kVar) {
            this.a = kVar;
        }

        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
            return (WindowInsets) this.a.a(view, v.a(windowInsets)).a;
        }
    }

    /* compiled from: ViewCompat */
    public interface c {
        boolean a(View view, KeyEvent keyEvent);
    }

    static {
        new AtomicInteger(1);
        new WeakHashMap();
    }

    public static boolean A(View view) {
        Boolean bool = (Boolean) new n(h.h.c.tag_screen_reader_focusable, Boolean.class, 28).b(view);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static void B(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void C(View view) {
        view.requestApplyInsets();
    }

    public static void D(View view) {
        view.stopNestedScroll();
    }

    public static void E(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static Rect a() {
        if (d == null) {
            d = new ThreadLocal<>();
        }
        Rect rect = d.get();
        if (rect == null) {
            rect = new Rect();
            d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static a b(View view) {
        View.AccessibilityDelegate c2 = c(view);
        if (c2 == null) {
            return null;
        }
        if (c2 instanceof a.C0050a) {
            return ((a.C0050a) c2).a;
        }
        return new a(c2);
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (c) {
            return null;
        }
        if (f1816b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1816b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                c = true;
                return null;
            }
        }
        try {
            Object obj = f1816b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            c = true;
            return null;
        }
    }

    public static ColorStateList d(View view) {
        return view.getBackgroundTintList();
    }

    public static void e(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i2);
            return;
        }
        Rect a2 = a();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !a2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        b(view, i2);
        if (z && a2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a2);
        }
    }

    public static void f(View view, int i2) {
        a(i2, view);
        c(view, 0);
    }

    public static void g(View view, int i2) {
        view.setAccessibilityLiveRegion(i2);
    }

    public static void h(View view, int i2) {
        view.setImportantForAccessibility(i2);
    }

    public static int i(View view) {
        return view.getImportantForAccessibility();
    }

    @SuppressLint({"InlinedApi"})
    public static int j(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return view.getImportantForAutofill();
        }
        return 0;
    }

    public static int k(View view) {
        return view.getLayoutDirection();
    }

    public static int l(View view) {
        return view.getMinimumHeight();
    }

    public static int m(View view) {
        return view.getMinimumWidth();
    }

    public static int n(View view) {
        return view.getPaddingEnd();
    }

    public static int o(View view) {
        return view.getPaddingStart();
    }

    public static v p(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return v.a(view.getRootWindowInsets());
        }
        return null;
    }

    public static String q(View view) {
        return view.getTransitionName();
    }

    public static int r(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float s(View view) {
        return view.getZ();
    }

    public static boolean t(View view) {
        return view.hasOnClickListeners();
    }

    public static boolean u(View view) {
        return view.hasOverlappingRendering();
    }

    public static boolean v(View view) {
        return view.hasTransientState();
    }

    public static boolean w(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean x(View view) {
        return view.isLaidOut();
    }

    public static boolean y(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static boolean z(View view) {
        return view.isPaddingRelative();
    }

    public static void d(View view, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i2);
            return;
        }
        Rect a2 = a();
        boolean z = false;
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            a2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !a2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        a(view, i2);
        if (z && a2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(a2);
        }
    }

    public static float g(View view) {
        return view.getElevation();
    }

    public static boolean h(View view) {
        return view.getFitsSystemWindows();
    }

    public static Display f(View view) {
        return view.getDisplay();
    }

    /* compiled from: ViewCompat */
    public static abstract class b<T> {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<T> f1817b;
        public final int c;

        public b(int i2, Class<T> cls, int i3) {
            this.a = i2;
            this.f1817b = cls;
            this.c = i3;
        }

        public abstract T a(View view);

        public abstract void a(View view, T t);

        public boolean a(Boolean bool, Boolean bool2) {
            boolean z;
            boolean booleanValue = bool == null ? false : bool.booleanValue();
            if (bool2 == null) {
                z = false;
            } else {
                z = bool2.booleanValue();
            }
            if (booleanValue == z) {
                return true;
            }
            return false;
        }

        public abstract boolean a(T t, T t2);

        public T b(View view) {
            if (Build.VERSION.SDK_INT >= this.c) {
                return a(view);
            }
            T tag = view.getTag(this.a);
            if (this.f1817b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public b(int i2, Class<T> cls, int i3, int i4) {
            this.a = i2;
            this.f1817b = cls;
            this.c = i4;
        }
    }

    /* compiled from: ViewCompat */
    public static class d {
        public static final ArrayList<WeakReference<View>> d = new ArrayList<>();
        public WeakHashMap<View, Boolean> a = null;

        /* renamed from: b  reason: collision with root package name */
        public SparseArray<WeakReference<View>> f1818b = null;
        public WeakReference<KeyEvent> c = null;

        public static d a(View view) {
            d dVar = (d) view.getTag(h.h.c.tag_unhandled_key_event_manager);
            if (dVar != null) {
                return dVar;
            }
            d dVar2 = new d();
            view.setTag(h.h.c.tag_unhandled_key_event_manager, dVar2);
            return dVar2;
        }

        public final boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(h.h.c.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((c) arrayList.get(size)).a(view, keyEvent)) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        public final void a() {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (!d.isEmpty()) {
                synchronized (d) {
                    if (this.a == null) {
                        this.a = new WeakHashMap<>();
                    }
                    for (int size = d.size() - 1; size >= 0; size--) {
                        View view = (View) d.get(size).get();
                        if (view == null) {
                            d.remove(size);
                        } else {
                            this.a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void b(View view, boolean z) {
        view.setHasTransientState(z);
    }

    public static void b(View view, int i2) {
        view.offsetTopAndBottom(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                E((View) parent);
            }
        }
    }

    public static void a(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }
    }

    public static v a(View view, v vVar) {
        WindowInsets windowInsets = (WindowInsets) vVar.a;
        WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        if (!onApplyWindowInsets.equals(windowInsets)) {
            windowInsets = new WindowInsets(onApplyWindowInsets);
        }
        return v.a(windowInsets);
    }

    public static void c(View view, int i2) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = ((CharSequence) new o(h.h.c.tag_accessibility_pane_title, CharSequence.class, 8, 28).b(view)) != null;
            if (view.getAccessibilityLiveRegion() != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i2);
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    public static void a(View view, a aVar) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (aVar == null && (c(view) instanceof a.C0050a)) {
            aVar = new a();
        }
        if (aVar == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = aVar.f1810b;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        d a2 = d.a(view);
        WeakReference<KeyEvent> weakReference = a2.c;
        if (weakReference != null && weakReference.get() == keyEvent) {
            return false;
        }
        a2.c = new WeakReference<>(keyEvent);
        WeakReference weakReference2 = null;
        if (a2.f1818b == null) {
            a2.f1818b = new SparseArray<>();
        }
        SparseArray<WeakReference<View>> sparseArray = a2.f1818b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference2 = sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (weakReference2 == null) {
            weakReference2 = sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference2 == null) {
            return false;
        }
        View view2 = (View) weakReference2.get();
        if (view2 != null && w(view2)) {
            a2.b(view2, keyEvent);
        }
        return true;
    }

    public static Rect e(View view) {
        return view.getClipBounds();
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, Runnable runnable, long j2) {
        view.postOnAnimationDelayed(runnable, j2);
    }

    public static boolean a(View view, int i2, Bundle bundle) {
        return view.performAccessibilityAction(i2, bundle);
    }

    public static void a(View view, b.a aVar, CharSequence charSequence, h.h.m.w.d dVar) {
        if (dVar == null && charSequence == null) {
            f(view, aVar.a());
            return;
        }
        b.a aVar2 = new b.a((Object) null, aVar.f1832b, charSequence, dVar, aVar.c);
        a b2 = b(view);
        if (b2 == null) {
            b2 = new a();
        }
        a(view, b2);
        a(aVar2.a(), view);
        ArrayList arrayList = (ArrayList) view.getTag(h.h.c.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(h.h.c.tag_accessibility_actions, arrayList);
        }
        arrayList.add(aVar2);
        c(view, 0);
    }

    public static void a(int i2, View view) {
        ArrayList arrayList = (ArrayList) view.getTag(h.h.c.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(h.h.c.tag_accessibility_actions, arrayList);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (((b.a) arrayList.get(i3)).a() == i2) {
                arrayList.remove(i3);
                return;
            }
        }
    }

    public static void a(View view, h.h.m.w.b bVar) {
        view.onInitializeAccessibilityNodeInfo(bVar.a);
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        view.setPaddingRelative(i2, i3, i4, i5);
    }

    public static r a(View view) {
        if (a == null) {
            a = new WeakHashMap<>();
        }
        r rVar = a.get(view);
        if (rVar != null) {
            return rVar;
        }
        r rVar2 = new r(view);
        a.put(view, rVar2);
        return rVar2;
    }

    public static void a(View view, float f2) {
        view.setElevation(f2);
    }

    public static void a(View view, String str) {
        view.setTransitionName(str);
    }

    public static void a(View view, k kVar) {
        if (kVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) null);
        } else {
            view.setOnApplyWindowInsetsListener(new a(kVar));
        }
    }

    public static void a(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void a(View view, int i2) {
        view.offsetLeftAndRight(i2);
        if (view.getVisibility() == 0) {
            float translationY = view.getTranslationY();
            view.setTranslationY(1.0f + translationY);
            view.setTranslationY(translationY);
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                E((View) parent);
            }
        }
    }

    public static void a(View view, Rect rect) {
        view.setClipBounds(rect);
    }

    public static void a(View view, int i2, int i3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(i2, i3);
        }
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        d a2 = d.a(view);
        if (a2 != null) {
            if (keyEvent.getAction() == 0) {
                a2.a();
            }
            View a3 = a2.a(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (a3 != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (a2.f1818b == null) {
                        a2.f1818b = new SparseArray<>();
                    }
                    a2.f1818b.put(keyCode, new WeakReference(a3));
                }
            }
            if (a3 != null) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static void a(View view, boolean z) {
        p pVar = new p(h.h.c.tag_accessibility_heading, Boolean.class, 28);
        Boolean valueOf = Boolean.valueOf(z);
        if (Build.VERSION.SDK_INT >= pVar.c) {
            pVar.a(view, valueOf);
        } else if (pVar.a(pVar.b(view), valueOf)) {
            a b2 = b(view);
            if (b2 == null) {
                b2 = new a();
            }
            a(view, b2);
            view.setTag(pVar.a, valueOf);
            c(view, 0);
        }
    }
}
