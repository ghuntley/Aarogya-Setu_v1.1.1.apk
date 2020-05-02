package i.c.a.b.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import i.c.a.b.d.l.o0;
import i.c.a.b.d.l.p0;
import i.c.a.b.d.l.q;
import i.c.a.b.e.b;
import i.c.a.b.g.d.a;
import i.c.a.b.g.d.c;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public abstract class t extends a implements o0 {
    public int a;

    public t(byte[] bArr) {
        super("com.google.android.gms.common.internal.ICertData");
        q.a(bArr.length == 25);
        this.a = Arrays.hashCode(bArr);
    }

    public static o0 a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof o0) {
            return (o0) queryLocalInterface;
        }
        return new p0(iBinder);
    }

    public final i.c.a.b.e.a b() {
        return new b(g());
    }

    public final int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        i.c.a.b.e.a b2;
        if (obj != null && (obj instanceof o0)) {
            try {
                o0 o0Var = (o0) obj;
                if (o0Var.c() != this.a || (b2 = o0Var.b()) == null) {
                    return false;
                }
                return Arrays.equals(g(), (byte[]) b.a(b2));
            } catch (RemoteException e) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e);
            }
        }
        return false;
    }

    public abstract byte[] g();

    public int hashCode() {
        return this.a;
    }

    public final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            i.c.a.b.e.a b2 = b();
            parcel2.writeNoException();
            c.a(parcel2, (IInterface) b2);
            return true;
        } else if (i2 != 2) {
            return false;
        } else {
            int c = c();
            parcel2.writeNoException();
            parcel2.writeInt(c);
            return true;
        }
    }

    public static byte[] a(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
