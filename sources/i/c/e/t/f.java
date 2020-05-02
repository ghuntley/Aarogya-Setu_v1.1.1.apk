package i.c.e.t;

import i.a.a.a.a;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: ConstructorConstructor */
public class f implements s<T> {
    public final x a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Class f4868b;
    public final /* synthetic */ Type c;

    public f(g gVar, Class cls, Type type) {
        x xVar;
        this.f4868b = cls;
        this.c = type;
        try {
            Class<?> cls2 = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls2.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            xVar = new t(cls2.getMethod("allocateInstance", new Class[]{Class.class}), declaredField.get((Object) null));
        } catch (Exception unused) {
            try {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", new Class[]{Class.class});
                declaredMethod.setAccessible(true);
                int intValue = ((Integer) declaredMethod.invoke((Object) null, new Object[]{Object.class})).intValue();
                Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Integer.TYPE});
                declaredMethod2.setAccessible(true);
                xVar = new u(declaredMethod2, intValue);
            } catch (Exception unused2) {
                try {
                    Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", new Class[]{Class.class, Class.class});
                    declaredMethod3.setAccessible(true);
                    xVar = new v(declaredMethod3);
                } catch (Exception unused3) {
                    xVar = new w();
                }
            }
        }
        this.a = xVar;
    }

    public T a() {
        try {
            return this.a.a(this.f4868b);
        } catch (Exception e) {
            StringBuilder a2 = a.a("Unable to invoke no-args constructor for ");
            a2.append(this.c);
            a2.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(a2.toString(), e);
        }
    }
}
