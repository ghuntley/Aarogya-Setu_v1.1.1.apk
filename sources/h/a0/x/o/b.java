package h.a0.x.o;

import com.crashlytics.android.core.CodedOutputStream;

/* compiled from: NetworkState */
public class b {
    public boolean a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f1021b;
    public boolean c;
    public boolean d;

    public b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.f1021b = z2;
        this.c = z3;
        this.d = z4;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (this.a == bVar.a && this.f1021b == bVar.f1021b && this.c == bVar.c && this.d == bVar.d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i2 = this.a ? 1 : 0;
        if (this.f1021b) {
            i2 += 16;
        }
        if (this.c) {
            i2 += 256;
        }
        return this.d ? i2 + CodedOutputStream.DEFAULT_BUFFER_SIZE : i2;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.a), Boolean.valueOf(this.f1021b), Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }
}
