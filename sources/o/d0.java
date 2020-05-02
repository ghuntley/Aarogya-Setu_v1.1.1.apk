package o;

import i.a.a.a.a;
import java.io.IOException;

/* compiled from: Protocol */
public enum d0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public final String e;

    /* access modifiers changed from: public */
    d0(String str) {
        this.e = str;
    }

    public static d0 a(String str) {
        if (str.equals(HTTP_1_0.e)) {
            return HTTP_1_0;
        }
        if (str.equals(HTTP_1_1.e)) {
            return HTTP_1_1;
        }
        if (str.equals(H2_PRIOR_KNOWLEDGE.e)) {
            return H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals(HTTP_2.e)) {
            return HTTP_2;
        }
        if (str.equals(SPDY_3.e)) {
            return SPDY_3;
        }
        if (str.equals(QUIC.e)) {
            return QUIC;
        }
        throw new IOException(a.b("Unexpected protocol: ", str));
    }

    public String toString() {
        return this.e;
    }
}
