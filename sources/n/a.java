package n;

import n.m.c.f;

/* compiled from: KotlinVersion.kt */
public final class a implements Comparable<a> {

    /* renamed from: i  reason: collision with root package name */
    public static final a f5197i = new a(1, 3, 61);
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f5198f;

    /* renamed from: g  reason: collision with root package name */
    public final int f5199g;

    /* renamed from: h  reason: collision with root package name */
    public final int f5200h;

    public a(int i2, int i3, int i4) {
        this.f5198f = i2;
        this.f5199g = i3;
        this.f5200h = i4;
        if (i2 >= 0 && 255 >= i2 && i3 >= 0 && 255 >= i3 && i4 >= 0 && 255 >= i4) {
            this.e = (i2 << 16) + (i3 << 8) + i4;
            return;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i2 + '.' + i3 + '.' + i4).toString());
    }

    public int compareTo(Object obj) {
        a aVar = (a) obj;
        if (aVar != null) {
            return this.e - aVar.e;
        }
        f.a("other");
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            obj = null;
        }
        a aVar = (a) obj;
        if (aVar == null || this.e != aVar.e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5198f);
        sb.append('.');
        sb.append(this.f5199g);
        sb.append('.');
        sb.append(this.f5200h);
        return sb.toString();
    }
}
