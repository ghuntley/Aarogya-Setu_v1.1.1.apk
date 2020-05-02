package l.a.a.a.o.e;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Principal;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;

/* compiled from: SystemKeyStore */
public class e {
    public final KeyStore a;

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<Principal, X509Certificate> f5159b;

    public e(InputStream inputStream, String str) {
        BufferedInputStream bufferedInputStream;
        try {
            KeyStore instance = KeyStore.getInstance("BKS");
            bufferedInputStream = new BufferedInputStream(inputStream);
            instance.load(bufferedInputStream, str.toCharArray());
            bufferedInputStream.close();
            try {
                HashMap<Principal, X509Certificate> hashMap = new HashMap<>();
                Enumeration<String> aliases = instance.aliases();
                while (aliases.hasMoreElements()) {
                    X509Certificate x509Certificate = (X509Certificate) instance.getCertificate(aliases.nextElement());
                    if (x509Certificate != null) {
                        hashMap.put(x509Certificate.getSubjectX500Principal(), x509Certificate);
                    }
                }
                this.f5159b = hashMap;
                this.a = instance;
            } catch (KeyStoreException e) {
                throw new AssertionError(e);
            }
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        } catch (NoSuchAlgorithmException e3) {
            throw new AssertionError(e3);
        } catch (CertificateException e4) {
            throw new AssertionError(e4);
        } catch (IOException e5) {
            throw new AssertionError(e5);
        } catch (Throwable th) {
            bufferedInputStream.close();
            throw th;
        }
    }

    public boolean a(X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = this.f5159b.get(x509Certificate.getSubjectX500Principal());
        return x509Certificate2 != null && x509Certificate2.getPublicKey().equals(x509Certificate.getPublicKey());
    }
}
