package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public enum v6 {
    DOUBLE(y6.DOUBLE, 1),
    FLOAT(y6.FLOAT, 5),
    INT64(y6.LONG, 0),
    UINT64(y6.LONG, 0),
    INT32(y6.INT, 0),
    FIXED64(y6.LONG, 1),
    FIXED32(y6.INT, 5),
    BOOL(y6.BOOLEAN, 0),
    STRING,
    GROUP,
    MESSAGE,
    BYTES,
    UINT32(y6.INT, 0),
    ENUM(y6.ENUM, 0),
    SFIXED32(y6.INT, 5),
    SFIXED64(y6.LONG, 1),
    SINT32(y6.INT, 0),
    SINT64(y6.LONG, 0);
    
    public final y6 e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3504f;

    /* access modifiers changed from: public */
    v6(y6 y6Var, int i2) {
        this.e = y6Var;
        this.f3504f = i2;
    }
}
