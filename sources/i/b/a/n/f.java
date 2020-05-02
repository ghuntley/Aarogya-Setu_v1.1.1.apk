package i.b.a.n;

import android.text.TextUtils;
import java.security.MessageDigest;

/* compiled from: Option */
public final class f<T> {
    public static final b<Object> e = new a();
    public final T a;

    /* renamed from: b  reason: collision with root package name */
    public final b<T> f2497b;
    public final String c;
    public volatile byte[] d;

    /* compiled from: Option */
    public class a implements b<Object> {
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    /* compiled from: Option */
    public interface b<T> {
        void a(byte[] bArr, T t, MessageDigest messageDigest);
    }

    public f(String str, T t, b<T> bVar) {
        if (!TextUtils.isEmpty(str)) {
            this.c = str;
            this.a = t;
            g.a.a.b.a.a(bVar, "Argument must not be null");
            this.f2497b = bVar;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }

    public static <T> f<T> a(String str, T t) {
        return new f<>(str, t, e);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.c.equals(((f) obj).c);
        }
        return false;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("Option{key='");
        a2.append(this.c);
        a2.append('\'');
        a2.append('}');
        return a2.toString();
    }
}
