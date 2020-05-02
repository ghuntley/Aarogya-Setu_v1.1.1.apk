package h.l.d;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;
import h.h.m.l;

/* compiled from: FragmentAnim */
public class j extends AnimationSet implements Runnable {
    public final ViewGroup e;

    /* renamed from: f  reason: collision with root package name */
    public final View f1989f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f1990g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f1991h;

    /* renamed from: i  reason: collision with root package name */
    public boolean f1992i = true;

    public j(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.e = viewGroup;
        this.f1989f = view;
        addAnimation(animation);
        this.e.post(this);
    }

    public boolean getTransformation(long j2, Transformation transformation) {
        this.f1992i = true;
        if (this.f1990g) {
            return !this.f1991h;
        }
        if (!super.getTransformation(j2, transformation)) {
            this.f1990g = true;
            l.a(this.e, this);
        }
        return true;
    }

    public void run() {
        if (this.f1990g || !this.f1992i) {
            this.e.endViewTransition(this.f1989f);
            this.f1991h = true;
            return;
        }
        this.f1992i = false;
        this.e.post(this);
    }

    public boolean getTransformation(long j2, Transformation transformation, float f2) {
        this.f1992i = true;
        if (this.f1990g) {
            return !this.f1991h;
        }
        if (!super.getTransformation(j2, transformation, f2)) {
            this.f1990g = true;
            l.a(this.e, this);
        }
        return true;
    }
}
