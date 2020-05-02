package i.c.a.c.l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* compiled from: MotionTiming */
public class h {
    public long a = 0;

    /* renamed from: b  reason: collision with root package name */
    public long f4152b = 300;
    public TimeInterpolator c = null;
    public int d = 0;
    public int e = 1;

    public h(long j2, long j3) {
        this.a = j2;
        this.f4152b = j3;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.a);
        animator.setDuration(this.f4152b);
        animator.setInterpolator(a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && this.f4152b == hVar.f4152b && this.d == hVar.d && this.e == hVar.e) {
            return a().getClass().equals(hVar.a().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.a;
        long j3 = this.f4152b;
        return ((((a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        return 10 + h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.a + " duration: " + this.f4152b + " interpolator: " + a().getClass() + " repeatCount: " + this.d + " repeatMode: " + this.e + "}\n";
    }

    public h(long j2, long j3, TimeInterpolator timeInterpolator) {
        this.a = j2;
        this.f4152b = j3;
        this.c = timeInterpolator;
    }

    public TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : a.f4148b;
    }
}
