package i.c.c.a.c0;

import i.a.a.a.a;
import i.c.a.b.d.l.q;
import i.c.c.a.m;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;

/* compiled from: MacJce */
public final class e0 implements m {
    public Mac a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4330b;
    public final String c;
    public final Key d;

    public e0(String str, Key key, int i2) {
        if (i2 >= 10) {
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1823053428) {
                if (hashCode != 392315118) {
                    if (hashCode == 392317873 && str.equals("HMACSHA512")) {
                        c2 = 2;
                    }
                } else if (str.equals("HMACSHA256")) {
                    c2 = 1;
                }
            } else if (str.equals("HMACSHA1")) {
                c2 = 0;
            }
            if (c2 != 0) {
                if (c2 != 1) {
                    if (c2 != 2) {
                        throw new NoSuchAlgorithmException(a.b("unknown Hmac algorithm: ", str));
                    } else if (i2 > 64) {
                        throw new InvalidAlgorithmParameterException("tag size too big");
                    }
                } else if (i2 > 32) {
                    throw new InvalidAlgorithmParameterException("tag size too big");
                }
            } else if (i2 > 20) {
                throw new InvalidAlgorithmParameterException("tag size too big");
            }
            this.c = str;
            this.f4330b = i2;
            this.d = key;
            Mac a2 = y.f4362g.a(str);
            this.a = a2;
            a2.init(key);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public byte[] a(byte[] bArr) {
        Mac mac;
        try {
            mac = (Mac) this.a.clone();
        } catch (CloneNotSupportedException unused) {
            mac = y.f4362g.a(this.c);
            mac.init(this.d);
        }
        mac.update(bArr);
        byte[] bArr2 = new byte[this.f4330b];
        System.arraycopy(mac.doFinal(), 0, bArr2, 0, this.f4330b);
        return bArr2;
    }

    public void a(byte[] bArr, byte[] bArr2) {
        if (!q.b(a(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }
}
