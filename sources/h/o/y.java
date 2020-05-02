package h.o;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import h.o.b0;
import h.t.a;
import h.t.c;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* compiled from: SavedStateViewModelFactory */
public final class y extends b0.c {

    /* renamed from: f  reason: collision with root package name */
    public static final Class<?>[] f2072f;

    /* renamed from: g  reason: collision with root package name */
    public static final Class<?>[] f2073g;
    public final Application a;

    /* renamed from: b  reason: collision with root package name */
    public final b0.a f2074b;
    public final Bundle c;
    public final h d;
    public final a e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<h.o.x> r0 = h.o.x.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            f2072f = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r0
            f2073g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.o.y.<clinit>():void");
    }

    @SuppressLint({"LambdaLast"})
    public y(Application application, c cVar, Bundle bundle) {
        this.e = cVar.c();
        this.d = cVar.a();
        this.c = bundle;
        this.a = application;
        if (b0.a.c == null) {
            b0.a.c = new b0.a(application);
        }
        this.f2074b = b0.a.c;
    }

    public <T extends a0> T a(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t;
        boolean isAssignableFrom = a.class.isAssignableFrom(cls);
        if (isAssignableFrom) {
            constructor = a(cls, f2072f);
        } else {
            constructor = a(cls, f2073g);
        }
        if (constructor == null) {
            return this.f2074b.a(cls);
        }
        a aVar = this.e;
        h hVar = this.d;
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, x.a(aVar.a(str), this.c));
        savedStateHandleController.a(aVar, hVar);
        SavedStateHandleController.b(aVar, hVar);
        if (isAssignableFrom) {
            try {
                t = (a0) constructor.newInstance(new Object[]{this.a, savedStateHandleController.c});
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to access " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e3);
            } catch (InvocationTargetException e4) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e4.getCause());
            }
        } else {
            t = (a0) constructor.newInstance(new Object[]{savedStateHandleController.c});
        }
        t.a("androidx.lifecycle.savedstate.vm.tag", savedStateHandleController);
        return t;
    }

    public <T extends a0> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return a(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public static <T> Constructor<T> a(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    public void a(a0 a0Var) {
        a aVar = this.e;
        h hVar = this.d;
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) a0Var.a("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController != null && !savedStateHandleController.f263b) {
            savedStateHandleController.a(aVar, hVar);
            SavedStateHandleController.b(aVar, hVar);
        }
    }
}
