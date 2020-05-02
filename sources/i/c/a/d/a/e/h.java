package i.c.a.d.a.e;

import com.google.android.play.core.tasks.RuntimeExecutionException;

public final class h<TResult> extends h<TResult> {
    public final Object a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public final e<TResult> f4320b = new e<>();
    public boolean c;
    public TResult d;
    public Exception e;

    public final void a() {
        synchronized (this.a) {
            if (this.c) {
                this.f4320b.a(this);
            }
        }
    }

    public final boolean a(Exception exc) {
        if (exc != null) {
            synchronized (this.a) {
                if (this.c) {
                    return false;
                }
                this.c = true;
                this.e = exc;
                this.f4320b.a(this);
                return true;
            }
        }
        throw new NullPointerException("Exception must not be null");
    }

    public final boolean a(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = tresult;
            this.f4320b.a(this);
            return true;
        }
    }

    public final TResult b() {
        TResult tresult;
        synchronized (this.a) {
            try {
                if (!this.c) {
                    throw new IllegalStateException("Task is not yet complete");
                } else if (this.e == null) {
                    tresult = this.d;
                } else {
                    throw new RuntimeExecutionException(this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tresult;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.c && this.e == null;
        }
        return z;
    }
}
