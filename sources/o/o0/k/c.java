package o.o0.k;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import o.d0;
import org.conscrypt.Conscrypt;

/* compiled from: ConscryptPlatform */
public class c extends f {
    public static c c() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new c();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void a(SSLSocket sSLSocket, String str, List<d0> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) ((ArrayList) f.a(list)).toArray(new String[0]));
        }
    }

    public final Provider b() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    @Nullable
    public String b(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    public SSLContext a() {
        try {
            return SSLContext.getInstance("TLSv1.3", b());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", b());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
