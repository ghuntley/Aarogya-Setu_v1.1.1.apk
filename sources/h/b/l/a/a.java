package h.b.l.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import h.b.p.n0;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint({"RestrictedAPI"})
/* compiled from: AppCompatResources */
public final class a {
    public static final ThreadLocal<TypedValue> a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    public static final WeakHashMap<Context, SparseArray<C0032a>> f1179b = new WeakHashMap<>(0);
    public static final Object c = new Object();

    /* renamed from: h.b.l.a.a$a  reason: collision with other inner class name */
    /* compiled from: AppCompatResources */
    public static class C0032a {
        public final ColorStateList a;

        /* renamed from: b  reason: collision with root package name */
        public final Configuration f1180b;

        public C0032a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.f1180b = configuration;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList a(android.content.Context r4, int r5) {
        /*
            java.lang.Object r0 = c
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<h.b.l.a.a$a>> r1 = f1179b     // Catch:{ all -> 0x0035 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ all -> 0x0035 }
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch:{ all -> 0x0035 }
            if (r1 == 0) goto L_0x0032
            int r2 = r1.size()     // Catch:{ all -> 0x0035 }
            if (r2 <= 0) goto L_0x0032
            java.lang.Object r2 = r1.get(r5)     // Catch:{ all -> 0x0035 }
            h.b.l.a.a$a r2 = (h.b.l.a.a.C0032a) r2     // Catch:{ all -> 0x0035 }
            if (r2 == 0) goto L_0x0032
            android.content.res.Configuration r3 = r2.f1180b     // Catch:{ all -> 0x0035 }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x0035 }
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch:{ all -> 0x0035 }
            boolean r4 = r3.equals(r4)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002f
            android.content.res.ColorStateList r4 = r2.a     // Catch:{ all -> 0x0035 }
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            return r4
        L_0x002f:
            r1.remove(r5)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            r4 = 0
            return r4
        L_0x0035:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0035 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: h.b.l.a.a.a(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static ColorStateList b(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        ColorStateList a2 = a(context, i2);
        if (a2 != null) {
            return a2;
        }
        Resources resources = context.getResources();
        TypedValue typedValue = a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            a.set(typedValue);
        }
        boolean z = true;
        resources.getValue(i2, typedValue, true);
        int i3 = typedValue.type;
        if (i3 < 28 || i3 > 31) {
            z = false;
        }
        ColorStateList colorStateList = null;
        if (!z) {
            Resources resources2 = context.getResources();
            try {
                colorStateList = g.a.a.b.a.a(resources2, (XmlPullParser) resources2.getXml(i2), context.getTheme());
            } catch (Exception e) {
                Log.e("AppCompatResources", "Failed to inflate ColorStateList, leaving it to the framework", e);
            }
        }
        if (colorStateList == null) {
            return h.h.f.a.b(context, i2);
        }
        a(context, i2, colorStateList);
        return colorStateList;
    }

    public static Drawable c(Context context, int i2) {
        return n0.a().b(context, i2);
    }

    public static void a(Context context, int i2, ColorStateList colorStateList) {
        synchronized (c) {
            SparseArray sparseArray = f1179b.get(context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                f1179b.put(context, sparseArray);
            }
            sparseArray.append(i2, new C0032a(colorStateList, context.getResources().getConfiguration()));
        }
    }
}
