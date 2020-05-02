package i.c.a.b.d.l;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class s extends a {
    public static final Parcelable.Creator<s> CREATOR = new f0();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final Account f3144f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3145g;

    /* renamed from: h  reason: collision with root package name */
    public final GoogleSignInAccount f3146h;

    public s(int i2, Account account, int i3, GoogleSignInAccount googleSignInAccount) {
        this.e = i2;
        this.f3144f = account;
        this.f3145g = i3;
        this.f3146h = googleSignInAccount;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, (Parcelable) this.f3144f, i2, false);
        q.a(parcel, 3, this.f3145g);
        q.a(parcel, 4, (Parcelable) this.f3146h, i2, false);
        q.m(parcel, a);
    }

    public s(Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.e = 2;
        this.f3144f = account;
        this.f3145g = i2;
        this.f3146h = googleSignInAccount;
    }
}
