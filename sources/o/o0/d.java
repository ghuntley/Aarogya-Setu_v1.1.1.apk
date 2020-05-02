package o.o0;

/* compiled from: NamedRunnable */
public abstract class d implements Runnable {
    public final String e;

    public d(String str, Object... objArr) {
        this.e = e.a(str, objArr);
    }

    public abstract void a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.e);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
