package h.b.k;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import h.e.c;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* compiled from: AppCompatDelegate */
public abstract class j {
    public static final c<WeakReference<j>> e = new c<>();

    /* renamed from: f  reason: collision with root package name */
    public static final Object f1124f = new Object();

    public static j a(Activity activity, i iVar) {
        return new k(activity, (Window) null, iVar, activity);
    }

    public static void b(j jVar) {
        synchronized (f1124f) {
            c(jVar);
        }
    }

    public static void c(j jVar) {
        synchronized (f1124f) {
            Iterator<WeakReference<j>> it = e.iterator();
            while (it.hasNext()) {
                j jVar2 = (j) it.next().get();
                if (jVar2 == jVar || jVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void a();

    public abstract void a(Bundle bundle);

    public abstract void a(View view);

    public abstract void a(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void a(CharSequence charSequence);

    public abstract boolean a(int i2);

    public abstract void b();

    public abstract void b(int i2);

    public abstract void b(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void c();

    public static j a(Dialog dialog, i iVar) {
        return new k(dialog.getContext(), dialog.getWindow(), iVar, dialog);
    }

    public static void a(j jVar) {
        synchronized (f1124f) {
            c(jVar);
            e.add(new WeakReference(jVar));
        }
    }
}
