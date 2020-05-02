package i.c.f;

import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.UninitializedMessageException;
import i.c.f.a;
import i.c.f.j;
import i.c.f.k;
import i.c.f.k.b;
import i.c.f.l;
import i.c.f.o;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;

/* compiled from: GeneratedMessageLite */
public abstract class k<MessageType extends k<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends a<MessageType, BuilderType> {

    /* renamed from: f  reason: collision with root package name */
    public t f4949f = t.f4977f;

    /* renamed from: g  reason: collision with root package name */
    public int f4950g = -1;

    /* compiled from: GeneratedMessageLite */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                i.c.f.y[] r0 = i.c.f.y.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                i.c.f.y r1 = i.c.f.y.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0010 }
                r1 = 8
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0018 }
                i.c.f.y r1 = i.c.f.y.ENUM     // Catch:{ NoSuchFieldError -> 0x0018 }
                r1 = 7
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0018 }
            L_0x0018:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.c.f.k.a.<clinit>():void");
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static abstract class b<MessageType extends k<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends a.C0140a<MessageType, BuilderType> {
        public final MessageType e;

        /* renamed from: f  reason: collision with root package name */
        public MessageType f4951f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f4952g = false;

        public b(MessageType messagetype) {
            this.e = messagetype;
            this.f4951f = (k) messagetype.a(j.NEW_MUTABLE_INSTANCE);
        }

        public BuilderType a(MessageType messagetype) {
            k();
            this.f4951f.a((C0142k) i.a, messagetype);
            return this;
        }

        public Object clone() {
            MessageType messagetype = this.e;
            if (messagetype != null) {
                b bVar = (b) messagetype.a(j.NEW_BUILDER);
                bVar.a(j());
                return bVar;
            }
            throw null;
        }

        public o d() {
            return this.e;
        }

        public final boolean h() {
            if (this.f4951f.a(j.IS_INITIALIZED, (Object) false, (Object) null) != null) {
                return true;
            }
            return false;
        }

        public final MessageType i() {
            MessageType j2 = j();
            if (j2.h()) {
                return j2;
            }
            throw new UninitializedMessageException();
        }

        public MessageType j() {
            if (this.f4952g) {
                return this.f4951f;
            }
            this.f4951f.f();
            this.f4952g = true;
            return this.f4951f;
        }

        public void k() {
            if (this.f4952g) {
                MessageType messagetype = (k) this.f4951f.a(j.NEW_MUTABLE_INSTANCE);
                messagetype.a((C0142k) i.a, this.f4951f);
                this.f4951f = messagetype;
                this.f4952g = false;
            }
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class c<T extends k<T, ?>> extends b<T> {
        public T a;

        public c(T t) {
            this.a = t;
        }

        public Object a(g gVar, i iVar) {
            return k.a(this.a, gVar, iVar);
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class d implements C0142k {
        public static final d a = new d();

        /* renamed from: b  reason: collision with root package name */
        public static final a f4953b = new a();

        /* compiled from: GeneratedMessageLite */
        public static final class a extends RuntimeException {
        }

        public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            if (z == z3 && z2 == z4) {
                return z2;
            }
            throw f4953b;
        }

        public int a(boolean z, int i2, boolean z2, int i3) {
            if (z == z2 && i2 == i3) {
                return i2;
            }
            throw f4953b;
        }

        public long a(boolean z, long j2, boolean z2, long j3) {
            if (z == z2 && j2 == j3) {
                return j2;
            }
            throw f4953b;
        }

        public String a(boolean z, String str, boolean z2, String str2) {
            if (z == z2 && str.equals(str2)) {
                return str;
            }
            throw f4953b;
        }

        public f a(boolean z, f fVar, boolean z2, f fVar2) {
            if (z == z2 && fVar.equals(fVar2)) {
                return fVar;
            }
            throw f4953b;
        }

        public <T extends o> T a(T t, T t2) {
            if (t == null && t2 == null) {
                return null;
            }
            if (t == null || t2 == null) {
                throw f4953b;
            }
            T t3 = (k) t;
            if (t3 != t2 && t3.d().getClass().isInstance(t2)) {
                t3.a((C0142k) this, (k) t2);
            }
            return t;
        }

        public <T> l.b<T> a(l.b<T> bVar, l.b<T> bVar2) {
            if (bVar.equals(bVar2)) {
                return bVar;
            }
            throw f4953b;
        }

        public j<g> a(j<g> jVar, j<g> jVar2) {
            if (jVar.equals(jVar2)) {
                return jVar;
            }
            throw f4953b;
        }

        public t a(t tVar, t tVar2) {
            if (tVar.equals(tVar2)) {
                return tVar;
            }
            throw f4953b;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static abstract class e<MessageType extends e<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends k<MessageType, BuilderType> implements f<MessageType, BuilderType> {

        /* renamed from: h  reason: collision with root package name */
        public j<g> f4954h = new j<>();

        public /* bridge */ /* synthetic */ o d() {
            return k.super.d();
        }

        public /* bridge */ /* synthetic */ o.a e() {
            return k.super.e();
        }

        public final void f() {
            k.super.f();
            j<g> jVar = this.f4954h;
            if (!jVar.f4948b) {
                jVar.a.e();
                jVar.f4948b = true;
            }
        }

        public final void a(C0142k kVar, MessageType messagetype) {
            k.super.a(kVar, messagetype);
            this.f4954h = kVar.a(this.f4954h, messagetype.f4954h);
        }
    }

    /* compiled from: GeneratedMessageLite */
    public interface f<MessageType extends e<MessageType, BuilderType>, BuilderType extends Object<MessageType, BuilderType>> extends p {
    }

    /* compiled from: GeneratedMessageLite */
    public static final class g implements j.a<g> {
        public final int e;

        public o.a a(o.a aVar, o oVar) {
            b bVar = (b) aVar;
            bVar.a((k) oVar);
            return bVar;
        }

        public int compareTo(Object obj) {
            return 0 - ((g) obj).e;
        }

        public boolean i() {
            return false;
        }

        public x k() {
            return null;
        }

        public y n() {
            throw null;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public static class h implements C0142k {
        public int a = 0;

        public /* synthetic */ h(a aVar) {
        }

        public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = l.a(z2) + (this.a * 53);
            return z2;
        }

        public int a(boolean z, int i2, boolean z2, int i3) {
            this.a = (this.a * 53) + i2;
            return i2;
        }

        public long a(boolean z, long j2, boolean z2, long j3) {
            this.a = l.a(j2) + (this.a * 53);
            return j2;
        }

        public String a(boolean z, String str, boolean z2, String str2) {
            this.a = str.hashCode() + (this.a * 53);
            return str;
        }

        public f a(boolean z, f fVar, boolean z2, f fVar2) {
            this.a = fVar.hashCode() + (this.a * 53);
            return fVar;
        }

        public <T extends o> T a(T t, T t2) {
            int i2;
            if (t == null) {
                i2 = 37;
            } else if (t instanceof k) {
                k kVar = (k) t;
                if (kVar.e == 0) {
                    int i3 = this.a;
                    this.a = 0;
                    kVar.a((C0142k) this, kVar);
                    kVar.e = this.a;
                    this.a = i3;
                }
                i2 = kVar.e;
            } else {
                i2 = t.hashCode();
            }
            this.a = (this.a * 53) + i2;
            return t;
        }

        public <T> l.b<T> a(l.b<T> bVar, l.b<T> bVar2) {
            this.a = bVar.hashCode() + (this.a * 53);
            return bVar;
        }

        public j<g> a(j<g> jVar, j<g> jVar2) {
            this.a = jVar.hashCode() + (this.a * 53);
            return jVar;
        }

        public t a(t tVar, t tVar2) {
            this.a = tVar.hashCode() + (this.a * 53);
            return tVar;
        }
    }

    /* compiled from: GeneratedMessageLite */
    public enum j {
        IS_INITIALIZED,
        VISIT,
        MERGE_FROM_STREAM,
        MAKE_IMMUTABLE,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: i.c.f.k$k  reason: collision with other inner class name */
    /* compiled from: GeneratedMessageLite */
    public interface C0142k {
        int a(boolean z, int i2, boolean z2, int i3);

        long a(boolean z, long j2, boolean z2, long j3);

        f a(boolean z, f fVar, boolean z2, f fVar2);

        j<g> a(j<g> jVar, j<g> jVar2);

        <T> l.b<T> a(l.b<T> bVar, l.b<T> bVar2);

        <T extends o> T a(T t, T t2);

        t a(t tVar, t tVar2);

        String a(boolean z, String str, boolean z2, String str2);

        boolean a(boolean z, boolean z2, boolean z3, boolean z4);
    }

    public abstract Object a(j jVar, Object obj, Object obj2);

    public boolean a(int i2, g gVar) {
        if ((i2 & 7) == 4) {
            return false;
        }
        if (this.f4949f == t.f4977f) {
            this.f4949f = new t(0, new int[8], new Object[8], true);
        }
        return this.f4949f.a(i2, gVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d().getClass().isInstance(obj)) {
            return false;
        }
        try {
            a((C0142k) d.a, (k) obj);
            return true;
        } catch (d.a unused) {
            return false;
        }
    }

    public void f() {
        a(j.MAKE_IMMUTABLE);
        this.f4949f.e = false;
    }

    public final q<MessageType> g() {
        return (q) a(j.GET_PARSER);
    }

    public final boolean h() {
        return a(j.IS_INITIALIZED, (Object) Boolean.TRUE, (Object) null) != null;
    }

    public int hashCode() {
        if (this.e == 0) {
            h hVar = new h((a) null);
            a((C0142k) hVar, this);
            this.e = hVar.a;
        }
        return this.e;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        i.c.d.p.e.a((o) this, sb, 0);
        return sb.toString();
    }

    public final MessageType d() {
        return (k) a(j.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType e() {
        BuilderType buildertype = (b) a(j.NEW_BUILDER);
        buildertype.k();
        buildertype.f4951f.a((C0142k) i.a, this);
        return buildertype;
    }

    /* compiled from: GeneratedMessageLite */
    public static class i implements C0142k {
        public static final i a = new i();

        public int a(boolean z, int i2, boolean z2, int i3) {
            return z2 ? i3 : i2;
        }

        public long a(boolean z, long j2, boolean z2, long j3) {
            return z2 ? j3 : j2;
        }

        public f a(boolean z, f fVar, boolean z2, f fVar2) {
            return z2 ? fVar2 : fVar;
        }

        public t a(t tVar, t tVar2) {
            if (tVar2 == t.f4977f) {
                return tVar;
            }
            int i2 = tVar.a + tVar2.a;
            int[] copyOf = Arrays.copyOf(tVar.f4978b, i2);
            System.arraycopy(tVar2.f4978b, 0, copyOf, tVar.a, tVar2.a);
            Object[] copyOf2 = Arrays.copyOf(tVar.c, i2);
            System.arraycopy(tVar2.c, 0, copyOf2, tVar.a, tVar2.a);
            return new t(i2, copyOf, copyOf2, true);
        }

        public String a(boolean z, String str, boolean z2, String str2) {
            return z2 ? str2 : str;
        }

        public boolean a(boolean z, boolean z2, boolean z3, boolean z4) {
            return z3 ? z4 : z2;
        }

        public j<g> a(j<g> jVar, j<g> jVar2) {
            if (jVar.f4948b) {
                jVar = jVar.clone();
            }
            for (int i2 = 0; i2 < jVar2.a.b(); i2++) {
                jVar.a((Map.Entry<g, Object>) jVar2.a.a(i2));
            }
            for (Map.Entry<FieldDescriptorType, Object> a2 : jVar2.a.c()) {
                jVar.a((Map.Entry<g, Object>) a2);
            }
            return jVar;
        }

        public <T extends o> T a(T t, T t2) {
            if (t == null || t2 == null) {
                return t != null ? t : t2;
            }
            a.C0140a aVar = (a.C0140a) t.e();
            if (aVar != null) {
                b bVar = (b) aVar;
                if (bVar.e.getClass().isInstance(t2)) {
                    bVar.k();
                    bVar.f4951f.a((C0142k) a, (k) ((a) t2));
                    return bVar.i();
                }
                throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
            }
            throw null;
        }

        public <T> l.b<T> a(l.b<T> bVar, l.b<T> bVar2) {
            int size = bVar.size();
            int size2 = bVar2.size();
            if (size > 0 && size2 > 0) {
                if (!((c) bVar).e) {
                    bVar = ((r) bVar).c(size2 + size);
                }
                bVar.addAll(bVar2);
            }
            return size > 0 ? bVar : bVar2;
        }
    }

    public Object a(j jVar) {
        return a(jVar, (Object) null, (Object) null);
    }

    public void a(C0142k kVar, MessageType messagetype) {
        a(j.VISIT, (Object) kVar, (Object) messagetype);
        this.f4949f = kVar.a(this.f4949f, messagetype.f4949f);
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

    public static <E> l.b<E> a(l.b<E> bVar) {
        int size = bVar.size();
        return ((r) bVar).c(size == 0 ? 10 : size * 2);
    }

    public static <T extends k<T, ?>> T a(T t, g gVar, i iVar) {
        T t2 = (k) t.a(j.NEW_MUTABLE_INSTANCE);
        try {
            t2.a(j.MERGE_FROM_STREAM, (Object) gVar, (Object) iVar);
            t2.f();
            return t2;
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends k<T, ?>> T a(T t) {
        if (t == null || t.h()) {
            return t;
        }
        throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
    }

    public static <T extends k<T, ?>> T a(T t, f fVar) {
        i a2 = i.a();
        try {
            g c2 = fVar.c();
            T a3 = a(t, c2, a2);
            c2.a(0);
            a(a3);
            a(a3);
            return a3;
        } catch (InvalidProtocolBufferException e2) {
            throw e2;
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        }
    }

    public static <T extends k<T, ?>> T a(T t, byte[] bArr) {
        i a2 = i.a();
        try {
            int length = bArr.length;
            g gVar = new g(bArr, 0, length, false);
            gVar.b(length);
            T a3 = a(t, gVar, a2);
            gVar.a(0);
            a(a3);
            return a3;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        } catch (InvalidProtocolBufferException e3) {
            throw e3;
        } catch (InvalidProtocolBufferException e4) {
            throw e4;
        }
    }
}
