package i.c.a.b.g.g;

import com.google.android.gms.internal.measurement.zzen;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class a3 {
    public final zzen a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f3206b;

    public /* synthetic */ a3(int i2, w2 w2Var) {
        byte[] bArr = new byte[i2];
        this.f3206b = bArr;
        this.a = zzen.a(bArr);
    }

    public final u2 a() {
        if (this.a.a() == 0) {
            return new c3(this.f3206b);
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }
}
