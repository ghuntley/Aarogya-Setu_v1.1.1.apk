package h.h.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import h.b.k.v;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat */
public final class r {
    public WeakReference<View> a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f1819b = null;
    public Runnable c = null;
    public int d = -1;

    /* compiled from: ViewPropertyAnimatorCompat */
    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ s a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1820b;

        public a(r rVar, s sVar, View view) {
            this.a = sVar;
            this.f1820b = view;
        }

        public void onAnimationCancel(Animator animator) {
            this.a.c(this.f1820b);
        }

        public void onAnimationEnd(Animator animator) {
            this.a.a(this.f1820b);
        }

        public void onAnimationStart(Animator animator) {
            this.a.b(this.f1820b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat */
    public class b implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ u a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ View f1821b;

        public b(r rVar, u uVar, View view) {
            this.a = uVar;
            this.f1821b = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            ((View) v.this.d.getParent()).invalidate();
        }
    }

    public r(View view) {
        this.a = new WeakReference<>(view);
    }

    public r a(long j2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
        return this;
    }

    public r b(float f2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }

    public r a(float f2) {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public void a() {
        View view = (View) this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public r a(s sVar) {
        View view = (View) this.a.get();
        if (view != null) {
            a(view, sVar);
        }
        return this;
    }

    public final void a(View view, s sVar) {
        if (sVar != null) {
            view.animate().setListener(new a(this, sVar, view));
        } else {
            view.animate().setListener((Animator.AnimatorListener) null);
        }
    }

    public r a(u uVar) {
        View view = (View) this.a.get();
        if (view != null) {
            b bVar = null;
            if (uVar != null) {
                bVar = new b(this, uVar, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }
}
