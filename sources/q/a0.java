package q;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

/* compiled from: Platform */
public class a0 {
    public static final a0 c;
    public final boolean a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final Constructor<MethodHandles.Lookup> f5680b;

    /* compiled from: Platform */
    public static final class a extends a0 {

        /* renamed from: q.a0$a$a  reason: collision with other inner class name */
        /* compiled from: Platform */
        public static final class C0157a implements Executor {
            public final Handler e = new Handler(Looper.getMainLooper());

            public void execute(Runnable runnable) {
                this.e.post(runnable);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        public Executor a() {
            return new C0157a();
        }

        @Nullable
        public Object a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return a0.super.a(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        a0 a0Var;
        try {
            Class.forName("android.os.Build");
            a0Var = new a();
        } catch (ClassNotFoundException unused) {
            a0Var = new a0(true);
        }
        c = a0Var;
    }

    public a0(boolean z) {
        this.a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            Class<MethodHandles.Lookup> cls = MethodHandles.Lookup.class;
            try {
                constructor = cls.getDeclaredConstructor(new Class[]{Class.class, Integer.TYPE});
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f5680b = constructor;
    }

    @Nullable
    public Object a(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        MethodHandles.Lookup lookup;
        Constructor<MethodHandles.Lookup> constructor = this.f5680b;
        if (constructor != null) {
            lookup = constructor.newInstance(new Object[]{cls, -1});
        } else {
            lookup = MethodHandles.lookup();
        }
        return lookup.unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    @Nullable
    public Executor a() {
        return null;
    }
}
