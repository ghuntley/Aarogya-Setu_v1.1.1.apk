package i.c.c.a.z;

import i.c.f.l;

/* compiled from: EllipticCurveType */
public enum m1 implements l.a {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    UNRECOGNIZED(-1);
    
    public final int e;

    /* access modifiers changed from: public */
    m1(int i2) {
        this.e = i2;
    }

    public static m1 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i2 == 2) {
            return NIST_P256;
        }
        if (i2 == 3) {
            return NIST_P384;
        }
        if (i2 != 4) {
            return null;
        }
        return NIST_P521;
    }
}
