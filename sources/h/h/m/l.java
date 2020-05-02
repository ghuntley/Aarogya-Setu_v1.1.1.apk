package h.h.m;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: OneShotPreDrawListener */
public final class l implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View e;

    /* renamed from: f  reason: collision with root package name */
    public ViewTreeObserver f1814f;

    /* renamed from: g  reason: collision with root package name */
    public final Runnable f1815g;

    public l(View view, Runnable runnable) {
        this.e = view;
        this.f1814f = view.getViewTreeObserver();
        this.f1815g = runnable;
    }

    public static l a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            l lVar = new l(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(lVar);
            view.addOnAttachStateChangeListener(lVar);
            return lVar;
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    public boolean onPreDraw() {
        a();
        this.f1815g.run();
        return true;
    }

    public void onViewAttachedToWindow(View view) {
        this.f1814f = view.getViewTreeObserver();
    }

    public void onViewDetachedFromWindow(View view) {
        a();
    }

    public void a() {
        if (this.f1814f.isAlive()) {
            this.f1814f.removeOnPreDrawListener(this);
        } else {
            this.e.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.e.removeOnAttachStateChangeListener(this);
    }
}
