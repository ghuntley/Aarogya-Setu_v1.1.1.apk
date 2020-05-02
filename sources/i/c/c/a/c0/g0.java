package i.c.c.a.c0;

import java.security.SecureRandom;

/* compiled from: Random */
public final class g0 {
    public static final ThreadLocal<SecureRandom> a = new a();

    /* compiled from: Random */
    public class a extends ThreadLocal<SecureRandom> {
        public Object initialValue() {
            SecureRandom secureRandom = new SecureRandom();
            secureRandom.nextLong();
            return secureRandom;
        }
    }

    public static byte[] a(int i2) {
        byte[] bArr = new byte[i2];
        a.get().nextBytes(bArr);
        return bArr;
    }
}
