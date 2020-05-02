package i.c.d.k;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceId;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public class t0 implements Parcelable {
    public static final Parcelable.Creator<t0> CREATOR = new v0();
    public Messenger e;

    /* renamed from: f  reason: collision with root package name */
    public j1 f4712f;

    /* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
    public static final class a extends ClassLoader {
        public final Class<?> loadClass(String str, boolean z) {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z);
            }
            if (!FirebaseInstanceId.h()) {
                return t0.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return t0.class;
        }
    }

    public t0(IBinder iBinder) {
        this.e = new Messenger(iBinder);
    }

    public final void a(Message message) {
        Messenger messenger = this.e;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        j1 j1Var = this.f4712f;
        if (j1Var != null) {
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
            obtain.writeInt(1);
            message.writeToParcel(obtain, 0);
            try {
                j1Var.a.transact(1, obtain, (Parcel) null, 1);
            } finally {
                obtain.recycle();
            }
        } else {
            throw null;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((t0) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        Messenger messenger = this.e;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
        } else {
            parcel.writeStrongBinder(this.f4712f.asBinder());
        }
    }

    public final IBinder a() {
        Messenger messenger = this.e;
        return messenger != null ? messenger.getBinder() : this.f4712f.asBinder();
    }
}
