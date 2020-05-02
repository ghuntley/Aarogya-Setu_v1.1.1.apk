package g.a.a.a;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: INotificationSideChannel */
public interface a extends IInterface {

    /* renamed from: g.a.a.a.a$a  reason: collision with other inner class name */
    /* compiled from: INotificationSideChannel */
    public static abstract class C0020a extends Binder implements a {

        /* renamed from: g.a.a.a.a$a$a  reason: collision with other inner class name */
        /* compiled from: INotificationSideChannel */
        public static class C0021a implements a {
            public IBinder a;

            public C0021a(IBinder iBinder) {
                this.a = iBinder;
            }

            public void a(String str, int i2, String str2, Notification notification) {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.v4.app.INotificationSideChannel");
                    obtain.writeString(str);
                    obtain.writeInt(i2);
                    obtain.writeString(str2);
                    if (notification != null) {
                        obtain.writeInt(1);
                        notification.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            public IBinder asBinder() {
                return this.a;
            }
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.v4.app.INotificationSideChannel");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof a)) {
                return new C0021a(iBinder);
            }
            return (a) queryLocalInterface;
        }
    }

    void a(String str, int i2, String str2, Notification notification);
}
