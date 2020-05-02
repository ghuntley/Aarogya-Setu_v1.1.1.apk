package i.c.a.b.g.g;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class r5 implements d5 {
    public final f5 a;

    /* renamed from: b  reason: collision with root package name */
    public final String f3423b;
    public final Object[] c;
    public final int d;

    public r5(f5 f5Var, String str, Object[] objArr) {
        this.a = f5Var;
        this.f3423b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        char c2 = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 >= 55296) {
                c2 |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            } else {
                this.d = c2 | (charAt2 << i2);
                return;
            }
        }
    }

    public final int a() {
        return (this.d & 1) == 1 ? 1 : 2;
    }

    public final boolean b() {
        return (this.d & 2) == 2;
    }

    public final f5 c() {
        return this.a;
    }
}
