package i.c.a.d.a.b;

public final class a {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final int f4301b;
    public final String c;

    public a(int i2, int i3, String str) {
        this.a = i2;
        this.f4301b = i3;
        this.c = str;
    }

    public final String toString() {
        String str = this.c;
        int i2 = this.a;
        int i3 = this.f4301b;
        StringBuilder sb = new StringBuilder(i.a.a.a.a.a(str, 69));
        sb.append("InstallState{packageName=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", errorCode=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
