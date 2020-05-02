package q;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import q.e;

@IgnoreJRERequirement
/* compiled from: CompletableFutureCallAdapterFactory */
public final class h extends e.a {
    public static final e.a a = new h();

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class a<R> implements e<R, CompletableFuture<R>> {
        public final Type a;

        public a(Type type) {
            this.a = type;
        }

        public Type a() {
            return this.a;
        }

        public Object a(d dVar) {
            b bVar = new b(dVar);
            dVar.a(new g(this, bVar));
            return bVar;
        }
    }

    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class b<T> extends CompletableFuture<T> {
        public final d<?> e;

        public b(d<?> dVar) {
            this.e = dVar;
        }

        public boolean cancel(boolean z) {
            if (z) {
                this.e.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* compiled from: CompletableFutureCallAdapterFactory */
    public static final class c<R> implements e<R, CompletableFuture<d0<R>>> {
        public final Type a;

        public c(Type type) {
            this.a = type;
        }

        public Type a() {
            return this.a;
        }

        public Object a(d dVar) {
            b bVar = new b(dVar);
            dVar.a(new i(this, bVar));
            return bVar;
        }
    }

    @Nullable
    public e<?, ?> a(Type type, Annotation[] annotationArr, e0 e0Var) {
        if (i0.b(type) != CompletableFuture.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a2 = i0.a(0, (ParameterizedType) type);
            if (i0.b(a2) != d0.class) {
                return new a(a2);
            }
            if (a2 instanceof ParameterizedType) {
                return new c(i0.a(0, (ParameterizedType) a2));
            }
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
    }
}
