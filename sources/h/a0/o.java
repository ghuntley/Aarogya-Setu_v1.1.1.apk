package h.a0;

import android.annotation.SuppressLint;

/* compiled from: Operation */
public interface o {
    @SuppressLint({"SyntheticAccessor"})
    public static final b.c a = new b.c((a) null);
    @SuppressLint({"SyntheticAccessor"})

    /* renamed from: b  reason: collision with root package name */
    public static final b.C0026b f924b = new b.C0026b((a) null);

    /* compiled from: Operation */
    public static abstract class b {

        /* compiled from: Operation */
        public static final class a extends b {
            public final Throwable a;

            public a(Throwable th) {
                this.a = th;
            }

            public String toString() {
                return String.format("FAILURE (%s)", new Object[]{this.a.getMessage()});
            }
        }

        /* renamed from: h.a0.o$b$b  reason: collision with other inner class name */
        /* compiled from: Operation */
        public static final class C0026b extends b {
            public /* synthetic */ C0026b(a aVar) {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        /* compiled from: Operation */
        public static final class c extends b {
            public c() {
            }

            public String toString() {
                return "SUCCESS";
            }

            public /* synthetic */ c(a aVar) {
            }
        }
    }
}
