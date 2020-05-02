package i.c.a.c.l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import h.m.a.a.b;
import h.m.a.a.c;

/* compiled from: AnimationUtils */
public class a {
    public static final TimeInterpolator a = new LinearInterpolator();

    /* renamed from: b  reason: collision with root package name */
    public static final TimeInterpolator f4148b = new b();
    public static final TimeInterpolator c = new h.m.a.a.a();
    public static final TimeInterpolator d = new c();
    public static final TimeInterpolator e = new DecelerateInterpolator();

    public static float a(float f2, float f3, float f4) {
        return ((f3 - f2) * f4) + f2;
    }
}
