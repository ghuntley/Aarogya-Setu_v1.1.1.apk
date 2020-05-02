package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzen;
import com.google.android.gms.internal.measurement.zzfo;
import com.google.android.gms.internal.measurement.zzhw;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.w3;
import i.c.a.b.g.g.w3.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public abstract class w3<MessageType extends w3<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends m2<MessageType, BuilderType> {
    public static Map<Object, w3<?, ?>> zzd = new ConcurrentHashMap();
    public i6 zzb = i6.f3317f;
    public int zzc = -1;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static class a<T extends w3<T, ?>> extends q2<T> {
        public a(T t) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static final class c implements q3<c> {
        public final int a() {
            throw new NoSuchMethodError();
        }

        public final v6 b() {
            throw new NoSuchMethodError();
        }

        public final y6 c() {
            throw new NoSuchMethodError();
        }

        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        public final boolean d() {
            throw new NoSuchMethodError();
        }

        public final boolean e() {
            throw new NoSuchMethodError();
        }

        public final e5 a(e5 e5Var, f5 f5Var) {
            throw new NoSuchMethodError();
        }

        public final i5 a(i5 i5Var, i5 i5Var2) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends w3<MessageType, BuilderType> implements g5 {
        public o3<c> zzc = o3.d;

        public final o3<c> a() {
            o3<c> o3Var = this.zzc;
            if (o3Var.f3378b) {
                this.zzc = (o3) o3Var.clone();
            }
            return this.zzc;
        }
    }

    /* 'enum' modifier removed */
    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static final class e {
        public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7};

        public static int[] a() {
            return (int[]) a.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static class f<ContainingType extends f5, Type> extends j3<ContainingType, Type> {
    }

    public abstract Object a(int i2, Object obj, Object obj2);

    public final void a(zzen zzen) {
        t5 a2 = o5.c.a(this);
        h3 h3Var = zzen.a;
        if (h3Var == null) {
            h3Var = new h3(zzen);
        }
        a2.a(this, (b7) h3Var);
    }

    public final /* synthetic */ e5 b() {
        return (b) a(5, (Object) null, (Object) null);
    }

    public final boolean d() {
        return a(this, Boolean.TRUE.booleanValue());
    }

    public final int e() {
        if (this.zzc == -1) {
            this.zzc = o5.c.a(this).c(this);
        }
        return this.zzc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return o5.c.a(this).a(this, (w3) obj);
        }
        return false;
    }

    public final /* synthetic */ e5 g() {
        b bVar = (b) a(5, (Object) null, (Object) null);
        bVar.a(this);
        return bVar;
    }

    public final /* synthetic */ f5 h() {
        return (w3) a(6, (Object) null, (Object) null);
    }

    public int hashCode() {
        int i2 = this.zza;
        if (i2 != 0) {
            return i2;
        }
        int a2 = o5.c.a(this).a(this);
        this.zza = a2;
        return a2;
    }

    public final <MessageType extends w3<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType i() {
        return (b) a(5, (Object) null, (Object) null);
    }

    public final BuilderType j() {
        BuilderType buildertype = (b) a(5, (Object) null, (Object) null);
        buildertype.a(this);
        return buildertype;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        q.a((f5) this, sb, 0);
        return sb.toString();
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
    public static abstract class b<MessageType extends w3<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends o2<MessageType, BuilderType> {
        public final MessageType e;

        /* renamed from: f  reason: collision with root package name */
        public MessageType f3512f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f3513g = false;

        public b(MessageType messagetype) {
            this.e = messagetype;
            this.f3512f = (w3) messagetype.a(4, (Object) null, (Object) null);
        }

        public final BuilderType a(MessageType messagetype) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            MessageType messagetype2 = this.f3512f;
            o5.c.a(messagetype2).b(messagetype2, messagetype);
            return this;
        }

        public /* synthetic */ Object clone() {
            b bVar = (b) this.e.a(5, (Object) null, (Object) null);
            bVar.a((w3) j());
            return bVar;
        }

        public final boolean d() {
            return w3.a(this.f3512f, false);
        }

        public final /* synthetic */ f5 h() {
            return this.e;
        }

        public void i() {
            MessageType messagetype = (w3) this.f3512f.a(4, (Object) null, (Object) null);
            o5.c.a(messagetype).b(messagetype, this.f3512f);
            this.f3512f = messagetype;
        }

        public /* synthetic */ f5 j() {
            if (this.f3513g) {
                return this.f3512f;
            }
            MessageType messagetype = this.f3512f;
            o5.c.a(messagetype).b(messagetype);
            this.f3513g = true;
            return this.f3512f;
        }

        public /* synthetic */ f5 k() {
            w3 w3Var = (w3) j();
            if (w3Var.d()) {
                return w3Var;
            }
            throw new zzhw();
        }

        public final b a(byte[] bArr, int i2, i3 i3Var) {
            if (this.f3513g) {
                i();
                this.f3513g = false;
            }
            try {
                o5.c.a(this.f3512f).a(this.f3512f, bArr, 0, i2 + 0, new t2(i3Var));
                return this;
            } catch (zzfo e2) {
                throw e2;
            } catch (IndexOutOfBoundsException unused) {
                throw zzfo.a();
            } catch (IOException e3) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e3);
            }
        }
    }

    public static <T extends w3<?, ?>> T a(Class<T> cls) {
        T t = (w3) zzd.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (w3) zzd.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (t == null) {
            t = (w3) ((w3) l6.a(cls)).a(6, (Object) null, (Object) null);
            if (t != null) {
                zzd.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    public static Object a(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static final <T extends w3<T, ?>> boolean a(T t, boolean z) {
        byte byteValue = ((Byte) t.a(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean d2 = o5.c.a(t).d(t);
        if (z) {
            t.a(2, (Object) d2 ? t : null, (Object) null);
        }
        return d2;
    }

    public static e4 a(e4 e4Var) {
        int size = e4Var.size();
        return ((t4) e4Var).a(size == 0 ? 10 : size << 1);
    }

    public static <E> d4<E> a(d4<E> d4Var) {
        int size = d4Var.size();
        return d4Var.a(size == 0 ? 10 : size << 1);
    }
}
