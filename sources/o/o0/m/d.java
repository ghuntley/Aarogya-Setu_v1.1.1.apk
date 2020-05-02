package o.o0.m;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* compiled from: OkHostnameVerifier */
public final class d implements HostnameVerifier {
    public static final d a = new d();

    public static List<String> a(X509Certificate x509Certificate) {
        List<String> a2 = a(x509Certificate, 7);
        List<String> a3 = a(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(a3.size() + a2.size());
        arrayList.addAll(a2);
        arrayList.addAll(a3);
        return arrayList;
    }

    public boolean verify(String str, SSLSession sSLSession) {
        try {
            return a(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public static List<String> a(X509Certificate x509Certificate, int i2) {
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List next : subjectAlternativeNames) {
                if (next != null) {
                    if (next.size() >= 2) {
                        Integer num = (Integer) next.get(0);
                        if (num != null) {
                            if (num.intValue() == i2 && (str = (String) next.get(1)) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.emptyList();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:55:0x00ff A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(java.lang.String r10, java.security.cert.X509Certificate r11) {
        /*
            r9 = this;
            java.util.regex.Pattern r0 = o.o0.e.f5386k
            java.util.regex.Matcher r0 = r0.matcher(r10)
            boolean r0 = r0.matches()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x002b
            r0 = 7
            java.util.List r11 = a((java.security.cert.X509Certificate) r11, (int) r0)
            int r0 = r11.size()
            r3 = 0
        L_0x0018:
            if (r3 >= r0) goto L_0x0100
            java.lang.Object r4 = r11.get(r3)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = r10.equalsIgnoreCase(r4)
            if (r4 == 0) goto L_0x0028
            goto L_0x00ff
        L_0x0028:
            int r3 = r3 + 1
            goto L_0x0018
        L_0x002b:
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r10 = r10.toLowerCase(r0)
            r0 = 2
            java.util.List r11 = a((java.security.cert.X509Certificate) r11, (int) r0)
            java.util.Iterator r11 = r11.iterator()
        L_0x003a:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0100
            java.lang.Object r0 = r11.next()
            java.lang.String r0 = (java.lang.String) r0
            if (r10 == 0) goto L_0x00fc
            int r3 = r10.length()
            if (r3 == 0) goto L_0x00fc
            java.lang.String r3 = "."
            boolean r4 = r10.startsWith(r3)
            if (r4 != 0) goto L_0x00fc
            java.lang.String r4 = ".."
            boolean r5 = r10.endsWith(r4)
            if (r5 == 0) goto L_0x0060
            goto L_0x00fc
        L_0x0060:
            if (r0 == 0) goto L_0x00fc
            int r5 = r0.length()
            if (r5 == 0) goto L_0x00fc
            boolean r5 = r0.startsWith(r3)
            if (r5 != 0) goto L_0x00fc
            boolean r4 = r0.endsWith(r4)
            if (r4 == 0) goto L_0x0076
            goto L_0x00fc
        L_0x0076:
            boolean r4 = r10.endsWith(r3)
            r5 = 46
            if (r4 != 0) goto L_0x008e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r10)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            goto L_0x008f
        L_0x008e:
            r4 = r10
        L_0x008f:
            boolean r3 = r0.endsWith(r3)
            if (r3 != 0) goto L_0x00a4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r5)
            java.lang.String r0 = r3.toString()
        L_0x00a4:
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r0 = r0.toLowerCase(r3)
            java.lang.String r3 = "*"
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L_0x00b7
            boolean r0 = r4.equals(r0)
            goto L_0x00fd
        L_0x00b7:
            java.lang.String r3 = "*."
            boolean r6 = r0.startsWith(r3)
            if (r6 == 0) goto L_0x00fc
            r6 = 42
            int r6 = r0.indexOf(r6, r2)
            r7 = -1
            if (r6 == r7) goto L_0x00c9
            goto L_0x00fc
        L_0x00c9:
            int r6 = r4.length()
            int r8 = r0.length()
            if (r6 >= r8) goto L_0x00d4
            goto L_0x00fc
        L_0x00d4:
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x00db
            goto L_0x00fc
        L_0x00db:
            java.lang.String r0 = r0.substring(r2)
            boolean r3 = r4.endsWith(r0)
            if (r3 != 0) goto L_0x00e6
            goto L_0x00fc
        L_0x00e6:
            int r3 = r4.length()
            int r0 = r0.length()
            int r3 = r3 - r0
            if (r3 <= 0) goto L_0x00fa
            int r3 = r3 + -1
            int r0 = r4.lastIndexOf(r5, r3)
            if (r0 == r7) goto L_0x00fa
            goto L_0x00fc
        L_0x00fa:
            r0 = 1
            goto L_0x00fd
        L_0x00fc:
            r0 = 0
        L_0x00fd:
            if (r0 == 0) goto L_0x003a
        L_0x00ff:
            r1 = 1
        L_0x0100:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.m.d.a(java.lang.String, java.security.cert.X509Certificate):boolean");
    }
}
