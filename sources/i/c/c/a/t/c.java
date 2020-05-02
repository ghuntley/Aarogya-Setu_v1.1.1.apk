package i.c.c.a.t;

import i.c.a.b.d.l.q;
import i.c.c.a.a;
import i.c.c.a.n;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* compiled from: AeadFactory */
public class c implements a {
    public final /* synthetic */ n a;

    public c(n nVar) {
        this.a = nVar;
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        return q.a(this.a.f4367b.a(), ((a) this.a.f4367b.a).a(bArr, bArr2));
    }

    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
            for (n.a aVar : this.a.a(copyOfRange)) {
                try {
                    return ((a) aVar.a).b(copyOfRange2, bArr2);
                } catch (GeneralSecurityException e) {
                    Logger logger = d.a;
                    StringBuilder a2 = i.a.a.a.a.a("ciphertext prefix matches a key, but cannot decrypt: ");
                    a2.append(e.toString());
                    logger.info(a2.toString());
                }
            }
        }
        for (n.a aVar2 : this.a.a(i.c.c.a.c.a)) {
            try {
                return ((a) aVar2.a).b(bArr, bArr2);
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
