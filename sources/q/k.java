package q;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import o.f0;
import q.e;

/* compiled from: DefaultCallAdapterFactory */
public final class k extends e.a {
    @Nullable
    public final Executor a;

    /* compiled from: DefaultCallAdapterFactory */
    public class a implements e<Object, d<?>> {
        public final /* synthetic */ Type a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Executor f5722b;

        public a(k kVar, Type type, Executor executor) {
            this.a = type;
            this.f5722b = executor;
        }

        public Type a() {
            return this.a;
        }

        public Object a(d dVar) {
            Executor executor = this.f5722b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    /* compiled from: DefaultCallAdapterFactory */
    public static final class b<T> implements d<T> {
        public final Executor e;

        /* renamed from: f  reason: collision with root package name */
        public final d<T> f5723f;

        /* compiled from: DefaultCallAdapterFactory */
        public class a implements f<T> {
            public final /* synthetic */ f a;

            public a(f fVar) {
                this.a = fVar;
            }

            public void a(d<T> dVar, d0<T> d0Var) {
                b.this.e.execute(new a(this, this.a, d0Var));
            }

            public /* synthetic */ void a(f fVar, d0 d0Var) {
                if (b.this.f5723f.o()) {
                    fVar.a(b.this, (Throwable) new IOException("Canceled"));
                } else {
                    fVar.a(b.this, d0Var);
                }
            }

            public /* synthetic */ void a(f fVar, Throwable th) {
                fVar.a(b.this, th);
            }

            public void a(d<T> dVar, Throwable th) {
                b.this.e.execute(new b(this, this.a, th));
            }
        }

        public b(Executor executor, d<T> dVar) {
            this.e = executor;
            this.f5723f = dVar;
        }

        public void a(f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f5723f.a(new a(fVar));
        }

        public void cancel() {
            this.f5723f.cancel();
        }

        public Object clone() {
            return new b(this.e, this.f5723f.clone());
        }

        public d0<T> f() {
            return this.f5723f.f();
        }

        public f0 m() {
            return this.f5723f.m();
        }

        public boolean o() {
            return this.f5723f.o();
        }

        /* renamed from: clone  reason: collision with other method in class */
        public d<T> m14clone() {
            return new b(this.e, this.f5723f.clone());
        }
    }

    public k(@Nullable Executor executor) {
        this.a = executor;
    }

    @Nullable
    public e<?, ?> a(Type type, Annotation[] annotationArr, e0 e0Var) {
        Executor executor = null;
        if (i0.b(type) != d.class) {
            return null;
        }
        if (type instanceof ParameterizedType) {
            Type a2 = i0.a(0, (ParameterizedType) type);
            if (!i0.a(annotationArr, (Class<? extends Annotation>) g0.class)) {
                executor = this.a;
            }
            return new a(this, a2, executor);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }
}
