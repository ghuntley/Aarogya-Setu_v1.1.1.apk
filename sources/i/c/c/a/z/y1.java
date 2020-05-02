package i.c.c.a.z;

import i.c.f.l;

/* compiled from: KeyStatusType */
public enum y1 implements l.a {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    
    public final int e;

    /* access modifiers changed from: public */
    y1(int i2) {
        this.e = i2;
    }

    public static y1 a(int i2) {
        if (i2 == 0) {
            return UNKNOWN_STATUS;
        }
        if (i2 == 1) {
            return ENABLED;
        }
        if (i2 == 2) {
            return DISABLED;
        }
        if (i2 != 3) {
            return null;
        }
        return DESTROYED;
    }
}
