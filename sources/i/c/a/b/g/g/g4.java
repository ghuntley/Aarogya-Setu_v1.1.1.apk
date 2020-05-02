package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public enum g4 {
    VOID(Void.class, Void.class, (Class<?>) null),
    INT(Integer.TYPE, Integer.class, 0),
    LONG(Long.TYPE, Long.class, 0L),
    FLOAT(Float.TYPE, Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.TYPE, Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.TYPE, Boolean.class, false),
    STRING(String.class, String.class, ""),
    BYTE_STRING(u2.class, u2.class, u2.f3471f),
    ENUM(Integer.TYPE, Integer.class, (Class<?>) null),
    MESSAGE(Object.class, Object.class, (Class<?>) null);
    
    public final Class<?> e;

    /* renamed from: f  reason: collision with root package name */
    public final Object f3292f;

    /* access modifiers changed from: public */
    g4(Class<?> cls, Class<?> cls2, Object obj) {
        this.e = cls2;
        this.f3292f = obj;
    }
}
