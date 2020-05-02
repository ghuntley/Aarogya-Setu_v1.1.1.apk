package o;

import i.a.a.a.a;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: CipherSuite */
public final class m {

    /* renamed from: b  reason: collision with root package name */
    public static final Comparator<String> f5354b = b.e;
    public static final Map<String, m> c = new LinkedHashMap();
    public static final m d = b("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final m e = b("TLS_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: f  reason: collision with root package name */
    public static final m f5355f = b("TLS_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: g  reason: collision with root package name */
    public static final m f5356g = b("TLS_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: h  reason: collision with root package name */
    public static final m f5357h = b("TLS_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: i  reason: collision with root package name */
    public static final m f5358i = b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");

    /* renamed from: j  reason: collision with root package name */
    public static final m f5359j = b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");

    /* renamed from: k  reason: collision with root package name */
    public static final m f5360k = b("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: l  reason: collision with root package name */
    public static final m f5361l = b("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: m  reason: collision with root package name */
    public static final m f5362m = b("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");

    /* renamed from: n  reason: collision with root package name */
    public static final m f5363n = b("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");

    /* renamed from: o  reason: collision with root package name */
    public static final m f5364o = b("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: p  reason: collision with root package name */
    public static final m f5365p = b("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");

    /* renamed from: q  reason: collision with root package name */
    public static final m f5366q = b("TLS_AES_128_GCM_SHA256");
    public static final m r = b("TLS_AES_256_GCM_SHA384");
    public static final m s = b("TLS_CHACHA20_POLY1305_SHA256");
    public final String a;

    static {
        b("SSL_RSA_WITH_NULL_MD5");
        b("SSL_RSA_WITH_NULL_SHA");
        b("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
        b("SSL_RSA_WITH_RC4_128_MD5");
        b("SSL_RSA_WITH_RC4_128_SHA");
        b("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_RSA_WITH_DES_CBC_SHA");
        b("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DHE_DSS_WITH_DES_CBC_SHA");
        b("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
        b("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DHE_RSA_WITH_DES_CBC_SHA");
        b("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
        b("SSL_DH_anon_WITH_RC4_128_MD5");
        b("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
        b("SSL_DH_anon_WITH_DES_CBC_SHA");
        b("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
        b("TLS_KRB5_WITH_DES_CBC_SHA");
        b("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
        b("TLS_KRB5_WITH_RC4_128_SHA");
        b("TLS_KRB5_WITH_DES_CBC_MD5");
        b("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
        b("TLS_KRB5_WITH_RC4_128_MD5");
        b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
        b("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
        b("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
        b("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
        b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
        b("TLS_DH_anon_WITH_AES_128_CBC_SHA");
        b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
        b("TLS_DH_anon_WITH_AES_256_CBC_SHA");
        b("TLS_RSA_WITH_NULL_SHA256");
        b("TLS_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_RSA_WITH_AES_256_CBC_SHA256");
        b("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
        b("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
        b("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
        b("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
        b("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
        b("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
        b("TLS_PSK_WITH_RC4_128_SHA");
        b("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
        b("TLS_PSK_WITH_AES_128_CBC_SHA");
        b("TLS_PSK_WITH_AES_256_CBC_SHA");
        b("TLS_RSA_WITH_SEED_CBC_SHA");
        b("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
        b("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
        b("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
        b("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
        b("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
        b("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
        b("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
        b("TLS_FALLBACK_SCSV");
        b("TLS_ECDH_ECDSA_WITH_NULL_SHA");
        b("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
        b("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
        b("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
        b("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_NULL_SHA");
        b("TLS_ECDH_RSA_WITH_RC4_128_SHA");
        b("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_RSA_WITH_NULL_SHA");
        b("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
        b("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_anon_WITH_NULL_SHA");
        b("TLS_ECDH_anon_WITH_RC4_128_SHA");
        b("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
        b("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
        b("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
        b("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
        b("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
        b("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
        b("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
        b("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
        b("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
        b("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
        b("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
        b("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
        b("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
        b("TLS_AES_128_CCM_SHA256");
        b("TLS_AES_128_CCM_8_SHA256");
    }

    public m(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw null;
    }

    public static /* synthetic */ int a(String str, String str2) {
        int min = Math.min(str.length(), str2.length());
        int i2 = 4;
        while (i2 < min) {
            char charAt = str.charAt(i2);
            char charAt2 = str2.charAt(i2);
            if (charAt == charAt2) {
                i2++;
            } else if (charAt < charAt2) {
                return -1;
            } else {
                return 1;
            }
        }
        int length = str.length();
        int length2 = str2.length();
        if (length == length2) {
            return 0;
        }
        if (length < length2) {
            return -1;
        }
        return 1;
    }

    public static m b(String str) {
        m mVar = new m(str);
        c.put(str, mVar);
        return mVar;
    }

    public static String c(String str) {
        if (str.startsWith("TLS_")) {
            StringBuilder a2 = a.a("SSL_");
            a2.append(str.substring(4));
            return a2.toString();
        } else if (!str.startsWith("SSL_")) {
            return str;
        } else {
            StringBuilder a3 = a.a("TLS_");
            a3.append(str.substring(4));
            return a3.toString();
        }
    }

    public String toString() {
        return this.a;
    }

    public static synchronized m a(String str) {
        m mVar;
        synchronized (m.class) {
            mVar = c.get(str);
            if (mVar == null) {
                mVar = c.get(c(str));
                if (mVar == null) {
                    mVar = new m(str);
                }
                c.put(str, mVar);
            }
        }
        return mVar;
    }
}
