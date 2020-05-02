package i.b.a.n;

import java.nio.charset.Charset;
import java.security.MessageDigest;

/* compiled from: Key */
public interface e {
    public static final Charset a = Charset.forName("UTF-8");

    void a(MessageDigest messageDigest);

    boolean equals(Object obj);

    int hashCode();
}
