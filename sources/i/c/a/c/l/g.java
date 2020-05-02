package i.c.a.c.l;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import h.e.h;
import i.a.a.a.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MotionSpec */
public class g {
    public final h<String, h> a = new h<>();

    /* renamed from: b  reason: collision with root package name */
    public final h<String, PropertyValuesHolder[]> f4151b = new h<>();

    public h a(String str) {
        if (this.a.getOrDefault(str, null) != null) {
            return this.a.getOrDefault(str, null);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        return this.a.equals(((g) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return 10 + g.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.a + "}\n";
    }

    public static g a(Context context, TypedArray typedArray, int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return a(context, resourceId);
    }

    public static g a(Context context, int i2) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i2);
            if (loadAnimator instanceof AnimatorSet) {
                return a((List<Animator>) ((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return a((List<Animator>) arrayList);
        } catch (Exception e) {
            StringBuilder a2 = a.a("Can't load animation resource ID #0x");
            a2.append(Integer.toHexString(i2));
            Log.w("MotionSpec", a2.toString(), e);
            return null;
        }
    }

    public static g a(List<Animator> list) {
        g gVar = new g();
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            Animator animator = list.get(i2);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                gVar.f4151b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
                    interpolator = a.f4148b;
                } else if (interpolator instanceof AccelerateInterpolator) {
                    interpolator = a.c;
                } else if (interpolator instanceof DecelerateInterpolator) {
                    interpolator = a.d;
                }
                h hVar = new h(startDelay, duration, interpolator);
                hVar.d = objectAnimator.getRepeatCount();
                hVar.e = objectAnimator.getRepeatMode();
                gVar.a.put(propertyName, hVar);
                i2++;
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return gVar;
    }
}
