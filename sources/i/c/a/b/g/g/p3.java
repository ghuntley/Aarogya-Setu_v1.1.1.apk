package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public enum p3 {
    DOUBLE(0, r3.SCALAR, g4.DOUBLE),
    FLOAT(1, r3.SCALAR, g4.FLOAT),
    INT64(2, r3.SCALAR, g4.LONG),
    UINT64(3, r3.SCALAR, g4.LONG),
    INT32(4, r3.SCALAR, g4.INT),
    FIXED64(5, r3.SCALAR, g4.LONG),
    FIXED32(6, r3.SCALAR, g4.INT),
    BOOL(7, r3.SCALAR, g4.BOOLEAN),
    STRING(8, r3.SCALAR, g4.STRING),
    MESSAGE(9, r3.SCALAR, g4.MESSAGE),
    BYTES(10, r3.SCALAR, g4.BYTE_STRING),
    UINT32(11, r3.SCALAR, g4.INT),
    ENUM(12, r3.SCALAR, g4.ENUM),
    SFIXED32(13, r3.SCALAR, g4.INT),
    SFIXED64(14, r3.SCALAR, g4.LONG),
    SINT32(15, r3.SCALAR, g4.INT),
    SINT64(16, r3.SCALAR, g4.LONG),
    GROUP(17, r3.SCALAR, g4.MESSAGE),
    DOUBLE_LIST(18, r3.VECTOR, g4.DOUBLE),
    FLOAT_LIST(19, r3.VECTOR, g4.FLOAT),
    INT64_LIST(20, r3.VECTOR, g4.LONG),
    UINT64_LIST(21, r3.VECTOR, g4.LONG),
    INT32_LIST(22, r3.VECTOR, g4.INT),
    FIXED64_LIST(23, r3.VECTOR, g4.LONG),
    FIXED32_LIST(24, r3.VECTOR, g4.INT),
    BOOL_LIST(25, r3.VECTOR, g4.BOOLEAN),
    STRING_LIST(26, r3.VECTOR, g4.STRING),
    MESSAGE_LIST(27, r3.VECTOR, g4.MESSAGE),
    BYTES_LIST(28, r3.VECTOR, g4.BYTE_STRING),
    UINT32_LIST(29, r3.VECTOR, g4.INT),
    ENUM_LIST(30, r3.VECTOR, g4.ENUM),
    SFIXED32_LIST(31, r3.VECTOR, g4.INT),
    SFIXED64_LIST(32, r3.VECTOR, g4.LONG),
    SINT32_LIST(33, r3.VECTOR, g4.INT),
    SINT64_LIST(34, r3.VECTOR, g4.LONG),
    DOUBLE_LIST_PACKED(35, r3.PACKED_VECTOR, g4.DOUBLE),
    FLOAT_LIST_PACKED(36, r3.PACKED_VECTOR, g4.FLOAT),
    INT64_LIST_PACKED(37, r3.PACKED_VECTOR, g4.LONG),
    UINT64_LIST_PACKED(38, r3.PACKED_VECTOR, g4.LONG),
    INT32_LIST_PACKED(39, r3.PACKED_VECTOR, g4.INT),
    FIXED64_LIST_PACKED(40, r3.PACKED_VECTOR, g4.LONG),
    FIXED32_LIST_PACKED(41, r3.PACKED_VECTOR, g4.INT),
    BOOL_LIST_PACKED(42, r3.PACKED_VECTOR, g4.BOOLEAN),
    UINT32_LIST_PACKED(43, r3.PACKED_VECTOR, g4.INT),
    ENUM_LIST_PACKED(44, r3.PACKED_VECTOR, g4.ENUM),
    SFIXED32_LIST_PACKED(45, r3.PACKED_VECTOR, g4.INT),
    SFIXED64_LIST_PACKED(46, r3.PACKED_VECTOR, g4.LONG),
    SINT32_LIST_PACKED(47, r3.PACKED_VECTOR, g4.INT),
    SINT64_LIST_PACKED(48, r3.PACKED_VECTOR, g4.LONG),
    GROUP_LIST(49, r3.VECTOR, g4.MESSAGE),
    MAP(50, r3.MAP, g4.VOID);
    
    public static final p3[] e0 = null;
    public final int e;

    /* access modifiers changed from: public */
    static {
        int i2;
        p3[] values = values();
        e0 = new p3[values.length];
        for (p3 p3Var : values) {
            e0[p3Var.e] = p3Var;
        }
    }

    /* access modifiers changed from: public */
    p3(int i2, r3 r3Var, g4 g4Var) {
        this.e = i2;
        int i3 = t3.a[r3Var.ordinal()];
        if (i3 == 1) {
            Class<?> cls = g4Var.e;
        } else if (i3 == 2) {
            Class<?> cls2 = g4Var.e;
        }
        if (r3Var == r3.SCALAR) {
            int i4 = t3.f3454b[g4Var.ordinal()];
        }
    }
}
