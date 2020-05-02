package i.c.a.b.d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.w.a;
import i.c.a.b.e.b;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class z extends a {
    public static final Parcelable.Creator<z> CREATOR = new c0();
    public final String e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final t f3172f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f3173g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f3174h;

    public z(String str, @Nullable IBinder iBinder, boolean z, boolean z2) {
        byte[] bArr;
        this.e = str;
        w wVar = null;
        if (iBinder != null) {
            try {
                i.c.a.b.e.a b2 = t.a(iBinder).b();
                if (b2 == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) b.a(b2);
                }
                if (bArr != null) {
                    wVar = new w(bArr);
                } else {
                    Log.e("GoogleCertificatesQuery", "Could not unwrap certificate");
                }
            } catch (RemoteException e2) {
                Log.e("GoogleCertificatesQuery", "Could not unwrap certificate", e2);
            }
        }
        this.f3172f = wVar;
        this.f3173g = z;
        this.f3174h = z2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e, false);
        t tVar = this.f3172f;
        if (tVar == null) {
            Log.w("GoogleCertificatesQuery", "certificate binder is null");
            tVar = null;
        } else if (tVar == null) {
            throw null;
        }
        q.a(parcel, 2, (IBinder) tVar, false);
        q.a(parcel, 3, this.f3173g);
        q.a(parcel, 4, this.f3174h);
        q.m(parcel, a);
    }

    public z(String str, @Nullable t tVar, boolean z, boolean z2) {
        this.e = str;
        this.f3172f = tVar;
        this.f3173g = z;
        this.f3174h = z2;
    }
}
