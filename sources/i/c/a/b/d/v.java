package i.c.a.b.d;

import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class v extends t {
    public static final WeakReference<byte[]> c = new WeakReference<>((Object) null);

    /* renamed from: b  reason: collision with root package name */
    public WeakReference<byte[]> f3170b = c;

    public v(byte[] bArr) {
        super(bArr);
    }

    public final byte[] g() {
        byte[] bArr;
        synchronized (this) {
            bArr = (byte[]) this.f3170b.get();
            if (bArr == null) {
                bArr = h();
                this.f3170b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }

    public abstract byte[] h();
}
