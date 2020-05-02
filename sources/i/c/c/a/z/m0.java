package i.c.c.a.z;

import i.c.f.l;

/* compiled from: EcPointFormat */
public enum m0 implements l.a {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    
    public final int e;

    /* access modifiers changed from: public */
    m0(int i2) {
        this.e = i2;
    }

    public static m0 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_FORMAT;
        }
        if (i2 == 1) {
            return UNCOMPRESSED;
        }
        if (i2 == 2) {
            return COMPRESSED;
        }
        if (i2 != 3) {
            return null;
        }
        return DO_NOT_USE_CRUNCHY_UNCOMPRESSED;
    }
}
