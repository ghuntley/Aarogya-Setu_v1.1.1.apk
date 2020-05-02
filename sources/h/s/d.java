package h.s;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: IMultiInstanceInvalidationCallback */
public interface d extends IInterface {

    /* compiled from: IMultiInstanceInvalidationCallback */
    public static abstract class a extends Binder implements d {

        /* renamed from: h.s.d$a$a  reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationCallback */
        public static class C0063a implements d {
            public IBinder a;

            public C0063a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    obtain.writeStringArray(strArr);
                    this.a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static d a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof d)) {
                return new C0063a(iBinder);
            }
            return (d) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                a(parcel.createStringArray());
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
                return true;
            }
        }
    }

    void a(String[] strArr);
}
