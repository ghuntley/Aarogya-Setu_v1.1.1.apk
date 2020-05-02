package i.b.a.r.h;

import android.content.Context;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import i.b.a.h;
import i.b.a.r.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* compiled from: ViewTarget */
public abstract class i<T extends View, Z> extends a<Z> {

    /* renamed from: g  reason: collision with root package name */
    public static int f2854g = h.glide_custom_view_target_tag;
    public final T e;

    /* renamed from: f  reason: collision with root package name */
    public final a f2855f;

    public i(T t) {
        g.a.a.b.a.a(t, "Argument must not be null");
        this.e = t;
        this.f2855f = new a(t);
    }

    public void a(g gVar) {
        this.f2855f.f2856b.remove(gVar);
    }

    public void b(g gVar) {
        a aVar = this.f2855f;
        int c = aVar.c();
        int b2 = aVar.b();
        if (aVar.a(c, b2)) {
            gVar.a(c, b2);
            return;
        }
        if (!aVar.f2856b.contains(gVar)) {
            aVar.f2856b.add(gVar);
        }
        if (aVar.c == null) {
            ViewTreeObserver viewTreeObserver = aVar.a.getViewTreeObserver();
            a.C0098a aVar2 = new a.C0098a(aVar);
            aVar.c = aVar2;
            viewTreeObserver.addOnPreDrawListener(aVar2);
        }
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("Target for: ");
        a2.append(this.e);
        return a2.toString();
    }

    public void a(b bVar) {
        this.e.setTag(f2854g, bVar);
    }

    /* compiled from: ViewTarget */
    public static final class a {
        public static Integer d;
        public final View a;

        /* renamed from: b  reason: collision with root package name */
        public final List<g> f2856b = new ArrayList();
        public C0098a c;

        /* renamed from: i.b.a.r.h.i$a$a  reason: collision with other inner class name */
        /* compiled from: ViewTarget */
        public static final class C0098a implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference<a> e;

            public C0098a(a aVar) {
                this.e = new WeakReference<>(aVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = (a) this.e.get();
                if (aVar == null || aVar.f2856b.isEmpty()) {
                    return true;
                }
                int c = aVar.c();
                int b2 = aVar.b();
                if (!aVar.a(c, b2)) {
                    return true;
                }
                Iterator it = new ArrayList(aVar.f2856b).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).a(c, b2);
                }
                aVar.a();
                return true;
            }
        }

        public a(View view) {
            this.a = view;
        }

        public void a() {
            ViewTreeObserver viewTreeObserver = this.a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.c);
            }
            this.c = null;
            this.f2856b.clear();
        }

        public final boolean a(int i2, int i3) {
            if (i2 > 0 || i2 == Integer.MIN_VALUE) {
                if (i3 > 0 || i3 == Integer.MIN_VALUE) {
                    return true;
                }
            }
            return false;
        }

        public final int b() {
            int paddingBottom = this.a.getPaddingBottom() + this.a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return a(this.a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingBottom);
        }

        public final int c() {
            int paddingRight = this.a.getPaddingRight() + this.a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
            return a(this.a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        }

        public final int a(int i2, int i3, int i4) {
            int i5 = i3 - i4;
            if (i5 > 0) {
                return i5;
            }
            int i6 = i2 - i4;
            if (i6 > 0) {
                return i6;
            }
            if (this.a.isLayoutRequested() || i3 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = this.a.getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                g.a.a.b.a.a(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }
    }

    public b b() {
        Object tag = this.e.getTag(f2854g);
        if (tag == null) {
            return null;
        }
        if (tag instanceof b) {
            return (b) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }
}
