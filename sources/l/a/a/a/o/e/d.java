package l.a.a.a.o.e;

import com.crashlytics.android.core.CrashlyticsPinningInfoProvider;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: PinningTrustManager */
public class d implements X509TrustManager {

    /* renamed from: f  reason: collision with root package name */
    public static final X509Certificate[] f5157f = new X509Certificate[0];
    public final TrustManager[] a;

    /* renamed from: b  reason: collision with root package name */
    public final e f5158b;
    public final long c;
    public final List<byte[]> d = new LinkedList();
    public final Set<X509Certificate> e = Collections.synchronizedSet(new HashSet());

    public d(e eVar, CrashlyticsPinningInfoProvider crashlyticsPinningInfoProvider) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(eVar.a);
            this.a = instance.getTrustManagers();
            this.f5158b = eVar;
            this.c = crashlyticsPinningInfoProvider.getPinCreationTimeInMillis();
            for (String str : crashlyticsPinningInfoProvider.getPins()) {
                List<byte[]> list = this.d;
                int length = str.length();
                byte[] bArr = new byte[(length / 2)];
                for (int i2 = 0; i2 < length; i2 += 2) {
                    bArr[i2 / 2] = (byte) (Character.digit(str.charAt(i2 + 1), 16) + (Character.digit(str.charAt(i2), 16) << 4));
                }
                list.add(bArr);
            }
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        } catch (KeyStoreException e3) {
            throw new AssertionError(e3);
        }
    }

    public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a8 A[LOOP:1: B:14:0x007b->B:27:0x00a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00b0 A[EDGE_INSN: B:62:0x00b0->B:28:0x00b0 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void checkServerTrusted(java.security.cert.X509Certificate[] r11, java.lang.String r12) {
        /*
            r10 = this;
            java.util.Set<java.security.cert.X509Certificate> r0 = r10.e
            r1 = 0
            r2 = r11[r1]
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x000c
            return
        L_0x000c:
            javax.net.ssl.TrustManager[] r0 = r10.a
            int r2 = r0.length
            r3 = 0
        L_0x0010:
            if (r3 >= r2) goto L_0x001c
            r4 = r0[r3]
            javax.net.ssl.X509TrustManager r4 = (javax.net.ssl.X509TrustManager) r4
            r4.checkServerTrusted(r11, r12)
            int r3 = r3 + 1
            goto L_0x0010
        L_0x001c:
            long r2 = r10.c
            r12 = 0
            r4 = -1
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0068
            long r2 = java.lang.System.currentTimeMillis()
            long r4 = r10.c
            long r2 = r2 - r4
            r4 = 15552000000(0x39ef8b000, double:7.683708924E-314)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0068
            l.a.a.a.c r0 = l.a.a.a.f.a()
            java.lang.String r2 = "Fabric"
            java.lang.String r3 = "Certificate pins are stale, ("
            java.lang.StringBuilder r3 = i.a.a.a.a.a(r3)
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.c
            long r6 = r6 - r8
            r3.append(r6)
            java.lang.String r6 = " millis vs "
            r3.append(r6)
            r3.append(r4)
            java.lang.String r4 = " millis) falling back to system trust."
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 5
            boolean r0 = r0.a(r2, r4)
            if (r0 == 0) goto L_0x0125
            android.util.Log.w(r2, r3, r12)
            goto L_0x0125
        L_0x0068:
            l.a.a.a.o.e.e r0 = r10.f5158b
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            r3 = r11[r1]
            boolean r3 = r0.a(r3)
            r4 = r11[r1]
            r2.add(r4)
            r4 = 1
        L_0x007b:
            int r5 = r11.length
            if (r4 >= r5) goto L_0x00b0
            r5 = r11[r4]
            boolean r5 = r0.a(r5)
            if (r5 == 0) goto L_0x0087
            r3 = 1
        L_0x0087:
            r5 = r11[r4]
            int r6 = r4 + -1
            r6 = r11[r6]
            javax.security.auth.x500.X500Principal r7 = r5.getSubjectX500Principal()
            javax.security.auth.x500.X500Principal r8 = r6.getIssuerX500Principal()
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L_0x009c
            goto L_0x00a5
        L_0x009c:
            java.security.PublicKey r5 = r5.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x00a5 }
            r6.verify(r5)     // Catch:{ GeneralSecurityException -> 0x00a5 }
            r5 = 1
            goto L_0x00a6
        L_0x00a5:
            r5 = 0
        L_0x00a6:
            if (r5 == 0) goto L_0x00b0
            r5 = r11[r4]
            r2.add(r5)
            int r4 = r4 + 1
            goto L_0x007b
        L_0x00b0:
            int r4 = r4 + -1
            r4 = r11[r4]
            java.util.HashMap<java.security.Principal, java.security.cert.X509Certificate> r0 = r0.f5159b
            javax.security.auth.x500.X500Principal r5 = r4.getIssuerX500Principal()
            java.lang.Object r0 = r0.get(r5)
            java.security.cert.X509Certificate r0 = (java.security.cert.X509Certificate) r0
            if (r0 != 0) goto L_0x00c3
            goto L_0x00dc
        L_0x00c3:
            javax.security.auth.x500.X500Principal r5 = r0.getSubjectX500Principal()
            javax.security.auth.x500.X500Principal r6 = r4.getSubjectX500Principal()
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x00d2
            goto L_0x00dc
        L_0x00d2:
            java.security.PublicKey r5 = r0.getPublicKey()     // Catch:{ GeneralSecurityException -> 0x00db }
            r4.verify(r5)     // Catch:{ GeneralSecurityException -> 0x00db }
            r12 = r0
            goto L_0x00dc
        L_0x00db:
        L_0x00dc:
            if (r12 == 0) goto L_0x00e2
            r2.add(r12)
            r3 = 1
        L_0x00e2:
            if (r3 == 0) goto L_0x013f
            int r12 = r2.size()
            java.security.cert.X509Certificate[] r12 = new java.security.cert.X509Certificate[r12]
            java.lang.Object[] r12 = r2.toArray(r12)
            java.security.cert.X509Certificate[] r12 = (java.security.cert.X509Certificate[]) r12
            int r0 = r12.length
            r2 = 0
        L_0x00f2:
            if (r2 >= r0) goto L_0x0137
            r3 = r12[r2]
            java.lang.String r4 = "SHA1"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
            java.security.PublicKey r3 = r3.getPublicKey()     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
            byte[] r3 = r3.getEncoded()     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
            byte[] r3 = r4.digest(r3)     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
            java.util.List<byte[]> r4 = r10.d     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
        L_0x010e:
            boolean r5 = r4.hasNext()     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
            if (r5 == 0) goto L_0x0122
            java.lang.Object r5 = r4.next()     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
            byte[] r5 = (byte[]) r5     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
            boolean r5 = java.util.Arrays.equals(r5, r3)     // Catch:{ NoSuchAlgorithmException -> 0x0130 }
            if (r5 == 0) goto L_0x010e
            r3 = 1
            goto L_0x0123
        L_0x0122:
            r3 = 0
        L_0x0123:
            if (r3 == 0) goto L_0x012d
        L_0x0125:
            java.util.Set<java.security.cert.X509Certificate> r12 = r10.e
            r11 = r11[r1]
            r12.add(r11)
            return
        L_0x012d:
            int r2 = r2 + 1
            goto L_0x00f2
        L_0x0130:
            r11 = move-exception
            java.security.cert.CertificateException r12 = new java.security.cert.CertificateException
            r12.<init>(r11)
            throw r12
        L_0x0137:
            java.security.cert.CertificateException r11 = new java.security.cert.CertificateException
            java.lang.String r12 = "No valid pins found in chain!"
            r11.<init>(r12)
            throw r11
        L_0x013f:
            java.security.cert.CertificateException r11 = new java.security.cert.CertificateException
            java.lang.String r12 = "Didn't find a trust anchor in chain cleanup!"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.e.d.checkServerTrusted(java.security.cert.X509Certificate[], java.lang.String):void");
    }

    public X509Certificate[] getAcceptedIssuers() {
        return f5157f;
    }
}
