package h.a0;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* compiled from: Configuration */
public final class b {
    public final Executor a;

    /* renamed from: b  reason: collision with root package name */
    public final Executor f893b;
    public final w c;
    public final k d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f894f;

    /* renamed from: g  reason: collision with root package name */
    public final int f895g;

    /* renamed from: h  reason: collision with root package name */
    public final int f896h;

    /* compiled from: Configuration */
    public static final class a {
        public Executor a;

        /* renamed from: b  reason: collision with root package name */
        public w f897b;
        public k c;
        public Executor d;
        public int e = 4;

        /* renamed from: f  reason: collision with root package name */
        public int f898f = 0;

        /* renamed from: g  reason: collision with root package name */
        public int f899g = Integer.MAX_VALUE;

        /* renamed from: h  reason: collision with root package name */
        public int f900h = 20;
    }

    /* renamed from: h.a0.b$b  reason: collision with other inner class name */
    /* compiled from: Configuration */
    public interface C0025b {
        b a();
    }

    public b(a aVar) {
        Executor executor = aVar.a;
        if (executor == null) {
            this.a = a();
        } else {
            this.a = executor;
        }
        Executor executor2 = aVar.d;
        if (executor2 == null) {
            this.f893b = a();
        } else {
            this.f893b = executor2;
        }
        w wVar = aVar.f897b;
        if (wVar == null) {
            this.c = w.a();
        } else {
            this.c = wVar;
        }
        k kVar = aVar.c;
        if (kVar == null) {
            this.d = new j();
        } else {
            this.d = kVar;
        }
        this.e = aVar.e;
        this.f894f = aVar.f898f;
        this.f895g = aVar.f899g;
        this.f896h = aVar.f900h;
    }

    public final Executor a() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }
}
