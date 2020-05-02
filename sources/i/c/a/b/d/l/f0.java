package i.c.a.b.d.l;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class f0 implements Parcelable.Creator<s> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b2 = q.b(parcel);
        int i2 = 0;
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int i3 = 0;
        while (parcel.dataPosition() < b2) {
            int readInt = parcel.readInt();
            int i4 = 65535 & readInt;
            if (i4 == 1) {
                i2 = q.h(parcel, readInt);
            } else if (i4 == 2) {
                account = (Account) q.a(parcel, readInt, Account.CREATOR);
            } else if (i4 == 3) {
                i3 = q.h(parcel, readInt);
            } else if (i4 != 4) {
                q.k(parcel, readInt);
            } else {
                googleSignInAccount = (GoogleSignInAccount) q.a(parcel, readInt, GoogleSignInAccount.CREATOR);
            }
        }
        q.d(parcel, b2);
        return new s(i2, account, i3, googleSignInAccount);
    }

    public final /* synthetic */ Object[] newArray(int i2) {
        return new s[i2];
    }
}
