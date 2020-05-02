package i.c.a.b.d.l;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import i.c.a.b.g.d.b;
import i.c.a.b.g.d.c;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public interface l extends IInterface {

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static abstract class a extends i.c.a.b.g.d.a implements l {

        /* renamed from: i.c.a.b.d.l.l$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
        public static class C0112a extends b implements l {
            public C0112a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            public final Account e() {
                Parcel a = a(2, a());
                Account account = (Account) c.a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        public static l a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof l) {
                return (l) queryLocalInterface;
            }
            return new C0112a(iBinder);
        }
    }

    Account e();
}
