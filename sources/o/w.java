package o;

import i.a.a.a.a;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import o.o0.e;

/* compiled from: Handshake */
public final class w {
    public final n0 a;

    /* renamed from: b  reason: collision with root package name */
    public final m f5621b;
    public final List<Certificate> c;
    public final List<Certificate> d;

    public w(n0 n0Var, m mVar, List<Certificate> list, List<Certificate> list2) {
        this.a = n0Var;
        this.f5621b = mVar;
        this.c = list;
        this.d = list2;
    }

    public static w a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            m a2 = m.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                n0 a3 = n0.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = e.a((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = e.a((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new w(a3, a2, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (!this.a.equals(wVar.a) || !this.f5621b.equals(wVar.f5621b) || !this.c.equals(wVar.c) || !this.d.equals(wVar.d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.f5621b.hashCode();
        int hashCode2 = this.c.hashCode();
        return this.d.hashCode() + ((hashCode2 + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder a2 = a.a("Handshake{tlsVersion=");
        a2.append(this.a);
        a2.append(" cipherSuite=");
        a2.append(this.f5621b);
        a2.append(" peerCertificates=");
        a2.append(a(this.c));
        a2.append(" localCertificates=");
        a2.append(a(this.d));
        a2.append('}');
        return a2.toString();
    }

    public final List<String> a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate next : list) {
            if (next instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) next).getSubjectDN()));
            } else {
                arrayList.add(next.getType());
            }
        }
        return arrayList;
    }
}
