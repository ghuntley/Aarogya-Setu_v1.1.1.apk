package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class s4 implements v5 {

    /* renamed from: b  reason: collision with root package name */
    public static final c5 f3443b = new v4();
    public final c5 a;

    public s4() {
        c5 c5Var;
        c5[] c5VarArr = new c5[2];
        c5VarArr[0] = x3.a;
        try {
            c5Var = (c5) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            c5Var = f3443b;
        }
        c5VarArr[1] = c5Var;
        u4 u4Var = new u4(c5VarArr);
        y3.a(u4Var, "messageInfoFactory");
        this.a = u4Var;
    }
}
