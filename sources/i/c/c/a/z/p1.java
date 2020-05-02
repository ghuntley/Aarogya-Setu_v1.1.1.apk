package i.c.c.a.z;

import i.c.f.l;

/* compiled from: HashType */
public enum p1 implements l.a {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA256(3),
    SHA512(4),
    UNRECOGNIZED(-1);
    
    public final int e;

    /* access modifiers changed from: public */
    p1(int i2) {
        this.e = i2;
    }

    public static p1 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_HASH;
        }
        if (i2 == 1) {
            return SHA1;
        }
        if (i2 == 3) {
            return SHA256;
        }
        if (i2 != 4) {
            return null;
        }
        return SHA512;
    }
}
