package h.s;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import h.s.d;

/* compiled from: IMultiInstanceInvalidationService */
public interface e extends IInterface {
    int a(d dVar, String str);

    void a(int i2, String[] strArr);

    void a(d dVar, int i2);

    /* compiled from: IMultiInstanceInvalidationService */
    public static abstract class a extends Binder implements e {
        public a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationService");
        }

        public static e a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof e)) {
                return new C0064a(iBinder);
            }
            return (e) queryLocalInterface;
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i2, Parcel parcel, Parcel parcel2, int i3) {
            if (i2 == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                int a = a(d.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(a);
                return true;
            } else if (i2 == 2) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                a(d.a.a(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                return true;
            } else if (i2 == 3) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationService");
                a(parcel.readInt(), parcel.createStringArray());
                return true;
            } else if (i2 != 1598968902) {
                return super.onTransact(i2, parcel, parcel2, i3);
            } else {
                parcel2.writeString("androidx.room.IMultiInstanceInvalidationService");
                return true;
            }
        }

        /* renamed from: h.s.e$a$a  reason: collision with other inner class name */
        /* compiled from: IMultiInstanceInvalidationService */
        public static class C0064a implements e {
            public IBinder a;

            public C0064a(IBinder iBinder) {
                this.a = iBinder;
            }

            public int a(d dVar, String str) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeString(str);
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }

            public void a(d dVar, int i2) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeStrongBinder(dVar != null ? dVar.asBinder() : null);
                    obtain.writeInt(i2);
                    this.a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public void a(int i2, String[] strArr) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationService");
                    obtain.writeInt(i2);
                    obtain.writeStringArray(strArr);
                    this.a.transact(3, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }
    }
}
