package i.c.f;

/* compiled from: WireFormat */
public enum x {
    DOUBLE(y.DOUBLE, 1),
    FLOAT(y.FLOAT, 5),
    INT64(y.LONG, 0),
    UINT64(y.LONG, 0),
    INT32(y.INT, 0),
    FIXED64(y.LONG, 1),
    FIXED32(y.INT, 5),
    BOOL(y.BOOLEAN, 0),
    STRING(y.STRING, 2) {
    },
    GROUP(y.MESSAGE, 3) {
    },
    MESSAGE(y.MESSAGE, 2) {
    },
    BYTES(y.BYTE_STRING, 2) {
    },
    UINT32(y.INT, 0),
    ENUM(y.ENUM, 0),
    SFIXED32(y.INT, 5),
    SFIXED64(y.LONG, 1),
    SINT32(y.INT, 0),
    SINT64(y.LONG, 0);
    
    public final y e;

    /* access modifiers changed from: public */
    x(y yVar, int i2) {
        this.e = yVar;
    }
}
