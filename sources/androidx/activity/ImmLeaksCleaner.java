package androidx.activity;

import android.app.Activity;
import h.o.j;
import java.lang.reflect.Field;

public final class ImmLeaksCleaner implements j {

    /* renamed from: b  reason: collision with root package name */
    public static int f36b;
    public static Field c;
    public static Field d;
    public static Field e;
    public Activity a;

    public ImmLeaksCleaner(Activity activity) {
        this.a = activity;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:32|33|34) */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0070, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x006f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(h.o.l r3, h.o.h.a r4) {
        /*
            r2 = this;
            h.o.h$a r3 = h.o.h.a.ON_DESTROY
            if (r4 == r3) goto L_0x0005
            return
        L_0x0005:
            int r3 = f36b
            r4 = 1
            if (r3 != 0) goto L_0x0038
            r3 = 2
            f36b = r3     // Catch:{ NoSuchFieldException -> 0x0037 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mServedView"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0037 }
            d = r3     // Catch:{ NoSuchFieldException -> 0x0037 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0037 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mNextServedView"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0037 }
            e = r3     // Catch:{ NoSuchFieldException -> 0x0037 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0037 }
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.String r0 = "mH"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch:{ NoSuchFieldException -> 0x0037 }
            c = r3     // Catch:{ NoSuchFieldException -> 0x0037 }
            r3.setAccessible(r4)     // Catch:{ NoSuchFieldException -> 0x0037 }
            f36b = r4     // Catch:{ NoSuchFieldException -> 0x0037 }
            goto L_0x0038
        L_0x0037:
        L_0x0038:
            int r3 = f36b
            if (r3 != r4) goto L_0x0079
            android.app.Activity r3 = r2.a
            java.lang.String r4 = "input_method"
            java.lang.Object r3 = r3.getSystemService(r4)
            android.view.inputmethod.InputMethodManager r3 = (android.view.inputmethod.InputMethodManager) r3
            java.lang.reflect.Field r4 = c     // Catch:{ IllegalAccessException -> 0x0079 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ IllegalAccessException -> 0x0079 }
            if (r4 != 0) goto L_0x004f
            return
        L_0x004f:
            monitor-enter(r4)
            java.lang.reflect.Field r0 = d     // Catch:{ IllegalAccessException -> 0x0075, ClassCastException -> 0x0073 }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ IllegalAccessException -> 0x0075, ClassCastException -> 0x0073 }
            android.view.View r0 = (android.view.View) r0     // Catch:{ IllegalAccessException -> 0x0075, ClassCastException -> 0x0073 }
            if (r0 != 0) goto L_0x005c
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x005c:
            boolean r0 = r0.isAttachedToWindow()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0064
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0064:
            java.lang.reflect.Field r0 = e     // Catch:{ IllegalAccessException -> 0x006f }
            r1 = 0
            r0.set(r3, r1)     // Catch:{ IllegalAccessException -> 0x006f }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r3.isActive()
            goto L_0x0079
        L_0x006f:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0071:
            r3 = move-exception
            goto L_0x0077
        L_0x0073:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0075:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0077:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r3
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.ImmLeaksCleaner.a(h.o.l, h.o.h$a):void");
    }
}
