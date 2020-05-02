package i.c.a.c.l;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* compiled from: DrawableAlphaProperty */
public class d extends Property<Drawable, Integer> {

    /* renamed from: b  reason: collision with root package name */
    public static final Property<Drawable, Integer> f4149b = new d();
    public final WeakHashMap<Drawable, Integer> a = new WeakHashMap<>();

    public d() {
        super(Integer.class, "drawableAlphaCompat");
    }

    public Object get(Object obj) {
        return Integer.valueOf(((Drawable) obj).getAlpha());
    }

    public void set(Object obj, Object obj2) {
        ((Drawable) obj).setAlpha(((Integer) obj2).intValue());
    }
}
