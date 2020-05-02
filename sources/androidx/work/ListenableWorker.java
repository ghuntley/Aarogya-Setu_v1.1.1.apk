package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import h.a0.e;

public abstract class ListenableWorker {
    public Context e;

    /* renamed from: f  reason: collision with root package name */
    public WorkerParameters f366f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f367g;

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.e = context;
            this.f366f = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public void a() {
    }

    public abstract i.c.b.a.a.a<a> b();

    public final void c() {
        a();
    }

    public static abstract class a {

        /* renamed from: androidx.work.ListenableWorker$a$a  reason: collision with other inner class name */
        public static final class C0002a extends a {
            public final e a = e.c;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C0002a.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((C0002a) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (C0002a.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder a2 = i.a.a.a.a.a("Failure {mOutputData=");
                a2.append(this.a);
                a2.append('}');
                return a2.toString();
            }
        }

        public static final class b extends a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && b.class == obj.getClass();
            }

            public int hashCode() {
                return b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        public static final class c extends a {
            public final e a;

            public c() {
                this.a = e.c;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || c.class != obj.getClass()) {
                    return false;
                }
                return this.a.equals(((c) obj).a);
            }

            public int hashCode() {
                return this.a.hashCode() + (c.class.getName().hashCode() * 31);
            }

            public String toString() {
                StringBuilder a2 = i.a.a.a.a.a("Success {mOutputData=");
                a2.append(this.a);
                a2.append('}');
                return a2.toString();
            }

            public c(e eVar) {
                this.a = eVar;
            }
        }
    }
}
