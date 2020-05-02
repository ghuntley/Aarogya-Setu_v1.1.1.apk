package i.c.c.a.z;

import i.c.f.l;

/* compiled from: EcdsaSignatureEncoding */
public enum v0 implements l.a {
    UNKNOWN_ENCODING(0),
    IEEE_P1363(1),
    DER(2),
    UNRECOGNIZED(-1);
    
    public final int e;

    /* access modifiers changed from: public */
    v0(int i2) {
        this.e = i2;
    }

    public static v0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_ENCODING;
        }
        if (i2 == 1) {
            return IEEE_P1363;
        }
        if (i2 != 2) {
            return null;
        }
        return DER;
    }
}
