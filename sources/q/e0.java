package q;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o.i0;
import o.j;
import o.l0;
import o.y;
import q.c;
import q.e;
import q.j;

/* compiled from: Retrofit */
public final class e0 {
    public final Map<Method, f0<?>> a = new ConcurrentHashMap();

    /* renamed from: b  reason: collision with root package name */
    public final j.a f5714b;
    public final y c;
    public final List<j.a> d;
    public final List<e.a> e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f5715f;

    /* compiled from: Retrofit */
    public class a implements InvocationHandler {
        public final a0 a = a0.c;

        /* renamed from: b  reason: collision with root package name */
        public final Object[] f5716b = new Object[0];
        public final /* synthetic */ Class c;

        public a(Class cls) {
            this.c = cls;
        }

        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.a.a && method.isDefault()) {
                return this.a.a(method, this.c, obj, objArr);
            }
            f0<?> a2 = e0.this.a(method);
            if (objArr == null) {
                objArr = this.f5716b;
            }
            l lVar = (l) a2;
            return lVar.a(new v(lVar.a, objArr, lVar.f5725b, lVar.c), objArr);
        }
    }

    public e0(j.a aVar, y yVar, List<j.a> list, List<e.a> list2, @Nullable Executor executor, boolean z) {
        this.f5714b = aVar;
        this.c = yVar;
        this.d = list;
        this.e = list2;
        this.f5715f = z;
    }

    public <T> T a(Class<T> cls) {
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<T> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (this.f5715f) {
                a0 a0Var = a0.c;
                for (Method method : cls.getDeclaredMethods()) {
                    if (!(a0Var.a && method.isDefault()) && !Modifier.isStatic(method.getModifiers())) {
                        a(method);
                    }
                }
            }
            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public <T> j<l0, T> b(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.d.indexOf((Object) null) + 1;
        int size = this.d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            j<l0, ?> a2 = this.d.get(i2).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> j<T, String> c(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.d.size();
        int i2 = 0;
        while (i2 < size) {
            if (this.d.get(i2) != null) {
                i2++;
            } else {
                throw null;
            }
        }
        return c.d.a;
    }

    public f0<?> a(Method method) {
        f0<?> f0Var;
        f0<?> f0Var2 = this.a.get(method);
        if (f0Var2 != null) {
            return f0Var2;
        }
        synchronized (this.a) {
            f0Var = this.a.get(method);
            if (f0Var == null) {
                f0Var = f0.a(this, method);
                this.a.put(method, f0Var);
            }
        }
        return f0Var;
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.e.indexOf((Object) null) + 1;
        int size = this.e.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            e<?, ?> a2 = this.e.get(i2).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> j<T, i0> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.d.indexOf((Object) null) + 1;
        int size = this.d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            j<?, i0> a2 = this.d.get(i2).a(type, annotationArr, annotationArr2, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        sb.append("  Tried:");
        int size2 = this.d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }
}
