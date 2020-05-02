package i.c.c.a.z;

import i.c.f.l;

/* compiled from: OutputPrefixType */
public enum p2 implements l.a {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    
    public final int e;

    /* access modifiers changed from: public */
    p2(int i2) {
        this.e = i2;
    }

    public static p2 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i2 == 1) {
            return TINK;
        }
        if (i2 == 2) {
            return LEGACY;
        }
        if (i2 == 3) {
            return RAW;
        }
        if (i2 != 4) {
            return null;
        }
        return CRUNCHY;
    }
}
