package h.o;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ViewModel */
public abstract class a0 {
    public final Map<String, Object> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f2047b = false;

    public final void a() {
        this.f2047b = true;
        Map<String, Object> map = this.a;
        if (map != null) {
            synchronized (map) {
                for (Object next : this.a.values()) {
                    if (next instanceof Closeable) {
                        try {
                            ((Closeable) next).close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }
        b();
    }

    public void b() {
    }

    public <T> T a(String str, T t) {
        T t2;
        synchronized (this.a) {
            t2 = this.a.get(str);
            if (t2 == null) {
                this.a.put(str, t);
            }
        }
        if (t2 != null) {
            t = t2;
        }
        if (this.f2047b && (t instanceof Closeable)) {
            try {
                ((Closeable) t).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return t;
    }

    public <T> T a(String str) {
        T t;
        Map<String, Object> map = this.a;
        if (map == null) {
            return null;
        }
        synchronized (map) {
            t = this.a.get(str);
        }
        return t;
    }
}
