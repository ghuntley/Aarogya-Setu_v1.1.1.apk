package q;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;
import javax.annotation.Nullable;
import o.k0;
import o.l0;
import p.f;
import p.z;

/* compiled from: Utils */
public final class i0 {
    public static final Type[] a = new Type[0];

    /* compiled from: Utils */
    public static final class a implements GenericArrayType {
        public final Type e;

        public a(Type type) {
            this.e = type;
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && i0.a((Type) this, (Type) (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.e;
        }

        public int hashCode() {
            return this.e.hashCode();
        }

        public String toString() {
            return i0.d(this.e) + "[]";
        }
    }

    /* compiled from: Utils */
    public static final class b implements ParameterizedType {
        @Nullable
        public final Type e;

        /* renamed from: f  reason: collision with root package name */
        public final Type f5717f;

        /* renamed from: g  reason: collision with root package name */
        public final Type[] f5718g;

        public b(@Nullable Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                if ((type == null) != (((Class) type2).getEnclosingClass() != null ? false : true)) {
                    throw new IllegalArgumentException();
                }
            }
            for (Type type3 : typeArr) {
                Objects.requireNonNull(type3, "typeArgument == null");
                i0.a(type3);
            }
            this.e = type;
            this.f5717f = type2;
            this.f5718g = (Type[]) typeArr.clone();
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && i0.a((Type) this, (Type) (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.f5718g.clone();
        }

        @Nullable
        public Type getOwnerType() {
            return this.e;
        }

        public Type getRawType() {
            return this.f5717f;
        }

        public int hashCode() {
            int hashCode = Arrays.hashCode(this.f5718g) ^ this.f5717f.hashCode();
            Type type = this.e;
            return hashCode ^ (type != null ? type.hashCode() : 0);
        }

        public String toString() {
            Type[] typeArr = this.f5718g;
            if (typeArr.length == 0) {
                return i0.d(this.f5717f);
            }
            StringBuilder sb = new StringBuilder((typeArr.length + 1) * 30);
            sb.append(i0.d(this.f5717f));
            sb.append("<");
            sb.append(i0.d(this.f5718g[0]));
            for (int i2 = 1; i2 < this.f5718g.length; i2++) {
                sb.append(", ");
                sb.append(i0.d(this.f5718g[i2]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* compiled from: Utils */
    public static final class c implements WildcardType {
        public final Type e;
        @Nullable

        /* renamed from: f  reason: collision with root package name */
        public final Type f5719f;

        public c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr.length != 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    i0.a(typeArr2[0]);
                    if (typeArr[0] == cls) {
                        this.f5719f = typeArr2[0];
                        this.e = cls;
                        return;
                    }
                    throw new IllegalArgumentException();
                }
                throw null;
            } else if (typeArr[0] != null) {
                i0.a(typeArr[0]);
                this.f5719f = null;
                this.e = typeArr[0];
            } else {
                throw null;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && i0.a((Type) this, (Type) (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.f5719f;
            if (type == null) {
                return i0.a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.e};
        }

        public int hashCode() {
            Type type = this.f5719f;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.e.hashCode() + 31);
        }

        public String toString() {
            if (this.f5719f != null) {
                StringBuilder a = i.a.a.a.a.a("? super ");
                a.append(i0.d(this.f5719f));
                return a.toString();
            } else if (this.e == Object.class) {
                return "?";
            } else {
                StringBuilder a2 = i.a.a.a.a.a("? extends ");
                a2.append(i0.d(this.e));
                return a2.toString();
            }
        }
    }

    public static RuntimeException a(Method method, String str, Object... objArr) {
        return a(method, (Throwable) null, str, objArr);
    }

    public static Class<?> b(Type type) {
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType instanceof Class) {
                return (Class) rawType;
            }
            throw new IllegalArgumentException();
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(b(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return b(((WildcardType) type).getUpperBounds()[0]);
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
        }
    }

    public static boolean c(@Nullable Type type) {
        String str;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            for (Type c2 : ((ParameterizedType) type).getActualTypeArguments()) {
                if (c(c2)) {
                    return true;
                }
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            return c(((GenericArrayType) type).getGenericComponentType());
        } else {
            if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    public static String d(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static RuntimeException a(Method method, @Nullable Throwable th, String str, Object... objArr) {
        StringBuilder a2 = i.a.a.a.a.a(String.format(str, objArr), "\n    for method ");
        a2.append(method.getDeclaringClass().getSimpleName());
        a2.append(".");
        a2.append(method.getName());
        return new IllegalArgumentException(a2.toString(), th);
    }

    public static RuntimeException a(Method method, Throwable th, int i2, String str, Object... objArr) {
        StringBuilder a2 = i.a.a.a.a.a(str, " (parameter #");
        a2.append(i2 + 1);
        a2.append(")");
        return a(method, th, a2.toString(), objArr);
    }

    public static RuntimeException a(Method method, int i2, String str, Object... objArr) {
        StringBuilder a2 = i.a.a.a.a.a(str, " (parameter #");
        a2.append(i2 + 1);
        a2.append(")");
        return a(method, a2.toString(), objArr);
    }

    public static boolean a(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            Type ownerType = parameterizedType.getOwnerType();
            Type ownerType2 = parameterizedType2.getOwnerType();
            if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return true;
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return a(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    public static Type b(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return a(type, cls, a(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    public static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i2 = 0; i2 < length; i2++) {
                if (interfaces[i2] == cls2) {
                    return cls.getGenericInterfaces()[i2];
                }
                if (cls2.isAssignableFrom(interfaces[i2])) {
                    return a(cls.getGenericInterfaces()[i2], interfaces[i2], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return a(cls.getGenericSuperclass(), (Class<?>) superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v11, resolved type: java.lang.reflect.TypeVariable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v25, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v12, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v26, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v29, resolved type: java.lang.reflect.Type} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v14, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v15, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043 A[LOOP:0: B:0:0x0000->B:21:0x0043, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0042 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type a(java.lang.reflect.Type r8, java.lang.Class<?> r9, java.lang.reflect.Type r10) {
        /*
        L_0x0000:
            boolean r0 = r10 instanceof java.lang.reflect.TypeVariable
            r1 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.TypeVariable r10 = (java.lang.reflect.TypeVariable) r10
            java.lang.reflect.GenericDeclaration r0 = r10.getGenericDeclaration()
            boolean r2 = r0 instanceof java.lang.Class
            if (r2 == 0) goto L_0x0012
            java.lang.Class r0 = (java.lang.Class) r0
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            if (r0 != 0) goto L_0x0016
            goto L_0x003f
        L_0x0016:
            java.lang.reflect.Type r2 = a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.Class<?>) r0)
            boolean r3 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x003f
            java.lang.reflect.TypeVariable[] r0 = r0.getTypeParameters()
        L_0x0022:
            int r3 = r0.length
            if (r1 >= r3) goto L_0x0039
            r3 = r0[r1]
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0036
            java.lang.reflect.ParameterizedType r2 = (java.lang.reflect.ParameterizedType) r2
            java.lang.reflect.Type[] r0 = r2.getActualTypeArguments()
            r0 = r0[r1]
            goto L_0x0040
        L_0x0036:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x0039:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            r8.<init>()
            throw r8
        L_0x003f:
            r0 = r10
        L_0x0040:
            if (r0 != r10) goto L_0x0043
            return r0
        L_0x0043:
            r10 = r0
            goto L_0x0000
        L_0x0045:
            boolean r0 = r10 instanceof java.lang.Class
            if (r0 == 0) goto L_0x0063
            r0 = r10
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r2 = r0.isArray()
            if (r2 == 0) goto L_0x0063
            java.lang.Class r10 = r0.getComponentType()
            java.lang.reflect.Type r8 = a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r10)
            if (r10 != r8) goto L_0x005d
            goto L_0x0062
        L_0x005d:
            q.i0$a r0 = new q.i0$a
            r0.<init>(r8)
        L_0x0062:
            return r0
        L_0x0063:
            boolean r0 = r10 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x007a
            java.lang.reflect.GenericArrayType r10 = (java.lang.reflect.GenericArrayType) r10
            java.lang.reflect.Type r0 = r10.getGenericComponentType()
            java.lang.reflect.Type r8 = a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r0)
            if (r0 != r8) goto L_0x0074
            goto L_0x0079
        L_0x0074:
            q.i0$a r10 = new q.i0$a
            r10.<init>(r8)
        L_0x0079:
            return r10
        L_0x007a:
            boolean r0 = r10 instanceof java.lang.reflect.ParameterizedType
            r2 = 1
            if (r0 == 0) goto L_0x00bb
            java.lang.reflect.ParameterizedType r10 = (java.lang.reflect.ParameterizedType) r10
            java.lang.reflect.Type r0 = r10.getOwnerType()
            java.lang.reflect.Type r3 = a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r0)
            if (r3 == r0) goto L_0x008d
            r0 = 1
            goto L_0x008e
        L_0x008d:
            r0 = 0
        L_0x008e:
            java.lang.reflect.Type[] r4 = r10.getActualTypeArguments()
            int r5 = r4.length
        L_0x0093:
            if (r1 >= r5) goto L_0x00ae
            r6 = r4[r1]
            java.lang.reflect.Type r6 = a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r6)
            r7 = r4[r1]
            if (r6 == r7) goto L_0x00ab
            if (r0 != 0) goto L_0x00a9
            java.lang.Object r0 = r4.clone()
            r4 = r0
            java.lang.reflect.Type[] r4 = (java.lang.reflect.Type[]) r4
            r0 = 1
        L_0x00a9:
            r4[r1] = r6
        L_0x00ab:
            int r1 = r1 + 1
            goto L_0x0093
        L_0x00ae:
            if (r0 == 0) goto L_0x00ba
            q.i0$b r8 = new q.i0$b
            java.lang.reflect.Type r9 = r10.getRawType()
            r8.<init>(r3, r9, r4)
            r10 = r8
        L_0x00ba:
            return r10
        L_0x00bb:
            boolean r0 = r10 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0101
            java.lang.reflect.WildcardType r10 = (java.lang.reflect.WildcardType) r10
            java.lang.reflect.Type[] r0 = r10.getLowerBounds()
            java.lang.reflect.Type[] r3 = r10.getUpperBounds()
            int r4 = r0.length
            if (r4 != r2) goto L_0x00e6
            r3 = r0[r1]
            java.lang.reflect.Type r8 = a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r3)
            r9 = r0[r1]
            if (r8 == r9) goto L_0x0101
            q.i0$c r9 = new q.i0$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            r10[r1] = r0
            java.lang.reflect.Type[] r0 = new java.lang.reflect.Type[r2]
            r0[r1] = r8
            r9.<init>(r10, r0)
            return r9
        L_0x00e6:
            int r0 = r3.length
            if (r0 != r2) goto L_0x0101
            r0 = r3[r1]
            java.lang.reflect.Type r8 = a((java.lang.reflect.Type) r8, (java.lang.Class<?>) r9, (java.lang.reflect.Type) r0)     // Catch:{ all -> 0x00ff }
            r9 = r3[r1]
            if (r8 == r9) goto L_0x0101
            q.i0$c r9 = new q.i0$c
            java.lang.reflect.Type[] r10 = new java.lang.reflect.Type[r2]
            r10[r1] = r8
            java.lang.reflect.Type[] r8 = a
            r9.<init>(r10, r8)
            return r9
        L_0x00ff:
            r8 = move-exception
            throw r8
        L_0x0101:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q.i0.a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static void a(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean a(Annotation[] annotationArr, Class<? extends Annotation> cls) {
        for (Annotation isInstance : annotationArr) {
            if (cls.isInstance(isInstance)) {
                return true;
            }
        }
        return false;
    }

    public static l0 a(l0 l0Var) {
        f fVar = new f();
        l0Var.h().a((z) fVar);
        return new k0(l0Var.f(), l0Var.a(), fVar);
    }

    public static Type a(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 < 0 || i2 >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i2 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i2];
        return type instanceof WildcardType ? ((WildcardType) type).getUpperBounds()[0] : type;
    }

    public static void a(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
