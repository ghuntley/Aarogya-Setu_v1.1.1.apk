package o;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import o.o0.m.c;
import p.i;

/* compiled from: CertificatePinner */
public final class l {
    public static final l c = new a().a();
    public final Set<b> a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final c f5349b;

    /* compiled from: CertificatePinner */
    public static final class a {
        public final List<b> a = new ArrayList();

        public l a() {
            return new l(new LinkedHashSet(this.a), (c) null);
        }
    }

    /* compiled from: CertificatePinner */
    public static final class b {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final String f5350b;
        public final String c;
        public final i d;

        public b(String str, String str2) {
            String str3;
            this.a = str;
            if (str.startsWith("*.")) {
                StringBuilder a2 = i.a.a.a.a.a("http://");
                a2.append(str.substring(2));
                str3 = y.c(a2.toString()).d;
            } else {
                str3 = y.c("http://" + str).d;
            }
            this.f5350b = str3;
            if (str2.startsWith("sha1/")) {
                this.c = "sha1/";
                this.d = i.b(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.c = "sha256/";
                this.d = i.b(str2.substring(7));
            } else {
                throw new IllegalArgumentException(i.a.a.a.a.b("pins must start with 'sha256/' or 'sha1/': ", str2));
            }
            if (this.d == null) {
                throw new IllegalArgumentException(i.a.a.a.a.b("pins must be base64: ", str2));
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.a.equals(bVar.a) && this.c.equals(bVar.c) && this.d.equals(bVar.d);
            }
        }

        public int hashCode() {
            int hashCode = this.c.hashCode();
            return this.d.hashCode() + ((hashCode + ((this.a.hashCode() + 527) * 31)) * 31);
        }

        public String toString() {
            return this.c + this.d.f();
        }
    }

    public l(Set<b> set, @Nullable c cVar) {
        this.a = set;
        this.f5349b = cVar;
    }

    public void a(String str, List<Certificate> list) {
        int i2;
        List emptyList = Collections.emptyList();
        Iterator<b> it = this.a.iterator();
        while (true) {
            i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            b next = it.next();
            if (next.a.startsWith("*.")) {
                int indexOf = str.indexOf(46);
                if ((str.length() - indexOf) - 1 == next.f5350b.length()) {
                    String str2 = next.f5350b;
                    if (str.regionMatches(false, indexOf + 1, str2, 0, str2.length())) {
                        i2 = 1;
                    }
                }
            } else {
                i2 = str.equals(next.f5350b);
            }
            if (i2 != 0) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList();
                }
                emptyList.add(next);
            }
        }
        if (!emptyList.isEmpty()) {
            c cVar = this.f5349b;
            if (cVar != null) {
                list = cVar.a(list, str);
            }
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i3);
                int size2 = emptyList.size();
                i iVar = null;
                i iVar2 = null;
                for (int i4 = 0; i4 < size2; i4++) {
                    b bVar = (b) emptyList.get(i4);
                    if (bVar.c.equals("sha256/")) {
                        if (iVar == null) {
                            iVar = i.a(x509Certificate.getPublicKey().getEncoded()).a("SHA-256");
                        }
                        if (bVar.d.equals(iVar)) {
                            return;
                        }
                    } else if (bVar.c.equals("sha1/")) {
                        if (iVar2 == null) {
                            iVar2 = i.a(x509Certificate.getPublicKey().getEncoded()).a("SHA-1");
                        }
                        if (bVar.d.equals(iVar2)) {
                            return;
                        }
                    } else {
                        StringBuilder a2 = i.a.a.a.a.a("unsupported hashAlgorithm: ");
                        a2.append(bVar.c);
                        throw new AssertionError(a2.toString());
                    }
                }
            }
            StringBuilder a3 = i.a.a.a.a.a("Certificate pinning failure!", "\n  Peer certificate chain:");
            int size3 = list.size();
            for (int i5 = 0; i5 < size3; i5++) {
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i5);
                a3.append("\n    ");
                a3.append(a(x509Certificate2));
                a3.append(": ");
                a3.append(x509Certificate2.getSubjectDN().getName());
            }
            a3.append("\n  Pinned certificates for ");
            a3.append(str);
            a3.append(":");
            int size4 = emptyList.size();
            while (i2 < size4) {
                a3.append("\n    ");
                a3.append((b) emptyList.get(i2));
                i2++;
            }
            throw new SSLPeerUnverifiedException(a3.toString());
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (!Objects.equals(this.f5349b, lVar.f5349b) || !this.a.equals(lVar.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() + (Objects.hashCode(this.f5349b) * 31);
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder a2 = i.a.a.a.a.a("sha256/");
            a2.append(i.a(((X509Certificate) certificate).getPublicKey().getEncoded()).a("SHA-256").f());
            return a2.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }
}
