package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzen;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class h3 implements b7 {
    public final zzen a;

    public h3(zzen zzen) {
        y3.a(zzen, "output");
        zzen zzen2 = zzen;
        this.a = zzen2;
        zzen2.a = this;
    }

    public final void a(int i2, int i3) {
        zzen.a aVar = (zzen.a) this.a;
        aVar.b((i2 << 3) | 5);
        aVar.c(i3);
    }

    public final void b(int i2, long j2) {
        zzen.a aVar = (zzen.a) this.a;
        aVar.b((i2 << 3) | 1);
        aVar.b(j2);
    }

    public final void c(int i2, long j2) {
        zzen.a aVar = (zzen.a) this.a;
        aVar.b((i2 << 3) | 0);
        aVar.a(j2);
    }

    public final void d(int i2, long j2) {
        zzen.a aVar = (zzen.a) this.a;
        aVar.b((i2 << 3) | 1);
        aVar.b(j2);
    }

    public final void e(int i2, long j2) {
        zzen zzen = this.a;
        if (zzen != null) {
            long e = zzen.e(j2);
            zzen.a aVar = (zzen.a) zzen;
            aVar.b((i2 << 3) | 0);
            aVar.a(e);
            return;
        }
        throw null;
    }

    public final void c(int i2, int i3) {
        zzen.a aVar = (zzen.a) this.a;
        aVar.b((i2 << 3) | 0);
        aVar.b(i3);
    }

    public final void d(int i2, int i3) {
        zzen zzen = this.a;
        if (zzen != null) {
            int n2 = zzen.n(i3);
            zzen.a aVar = (zzen.a) zzen;
            aVar.b((i2 << 3) | 0);
            aVar.b(n2);
            return;
        }
        throw null;
    }

    public final void a(int i2, long j2) {
        zzen.a aVar = (zzen.a) this.a;
        aVar.b((i2 << 3) | 0);
        aVar.a(j2);
    }

    public final void b(int i2, int i3) {
        zzen.a aVar = (zzen.a) this.a;
        aVar.b((i2 << 3) | 5);
        aVar.c(i3);
    }

    public final void b(int i2, Object obj, t5 t5Var) {
        zzen zzen = this.a;
        int i3 = i2 << 3;
        ((zzen.a) zzen).b(i3 | 3);
        t5Var.a((f5) obj, (b7) zzen.a);
        ((zzen.a) zzen).b(i3 | 4);
    }

    public final void a(int i2, float f2) {
        zzen zzen = this.a;
        if (zzen != null) {
            int floatToRawIntBits = Float.floatToRawIntBits(f2);
            zzen.a aVar = (zzen.a) zzen;
            aVar.b((i2 << 3) | 5);
            aVar.c(floatToRawIntBits);
            return;
        }
        throw null;
    }

    public final void a(int i2, double d) {
        zzen zzen = this.a;
        if (zzen != null) {
            long doubleToRawLongBits = Double.doubleToRawLongBits(d);
            zzen.a aVar = (zzen.a) zzen;
            aVar.b((i2 << 3) | 1);
            aVar.b(doubleToRawLongBits);
            return;
        }
        throw null;
    }

    public final void a(int i2, boolean z) {
        zzen.a aVar = (zzen.a) this.a;
        aVar.b((i2 << 3) | 0);
        aVar.a(z ? (byte) 1 : 0);
    }

    public final void a(int i2, u2 u2Var) {
        zzen.a aVar = (zzen.a) this.a;
        aVar.b((i2 << 3) | 2);
        aVar.b(u2Var);
    }

    public final void a(int i2, Object obj, t5 t5Var) {
        f5 f5Var = (f5) obj;
        zzen.a aVar = (zzen.a) this.a;
        aVar.b((i2 << 3) | 2);
        m2 m2Var = (m2) f5Var;
        w3 w3Var = (w3) m2Var;
        int i3 = w3Var.zzc;
        if (i3 == -1) {
            i3 = t5Var.c(m2Var);
            w3Var.zzc = i3;
        }
        aVar.b(i3);
        t5Var.a(f5Var, (b7) aVar.a);
    }

    public final void a(int i2, Object obj) {
        if (obj instanceof u2) {
            zzen.a aVar = (zzen.a) this.a;
            aVar.f(1, 3);
            aVar.g(2, i2);
            aVar.b(3, (u2) obj);
            aVar.f(1, 4);
            return;
        }
        zzen.a aVar2 = (zzen.a) this.a;
        aVar2.f(1, 3);
        aVar2.g(2, i2);
        aVar2.f(3, 2);
        aVar2.c((f5) obj);
        aVar2.f(1, 4);
    }
}
