package i.c.a.b.d.l;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import i.c.a.b.d.d;
import i.c.a.b.d.f;
import i.c.a.b.d.l.l;
import i.c.a.b.d.l.w.a;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class g extends a {
    public static final Parcelable.Creator<g> CREATOR = new j0();
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f3116f;

    /* renamed from: g  reason: collision with root package name */
    public int f3117g;

    /* renamed from: h  reason: collision with root package name */
    public String f3118h;

    /* renamed from: i  reason: collision with root package name */
    public IBinder f3119i;

    /* renamed from: j  reason: collision with root package name */
    public Scope[] f3120j;

    /* renamed from: k  reason: collision with root package name */
    public Bundle f3121k;

    /* renamed from: l  reason: collision with root package name */
    public Account f3122l;

    /* renamed from: m  reason: collision with root package name */
    public d[] f3123m;

    /* renamed from: n  reason: collision with root package name */
    public d[] f3124n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f3125o;

    /* renamed from: p  reason: collision with root package name */
    public int f3126p;

    public g(int i2) {
        this.e = 4;
        this.f3117g = f.a;
        this.f3116f = i2;
        this.f3125o = true;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a = q.a(parcel);
        q.a(parcel, 1, this.e);
        q.a(parcel, 2, this.f3116f);
        q.a(parcel, 3, this.f3117g);
        q.a(parcel, 4, this.f3118h, false);
        q.a(parcel, 5, this.f3119i, false);
        q.a(parcel, 6, (T[]) this.f3120j, i2, false);
        q.a(parcel, 7, this.f3121k, false);
        q.a(parcel, 8, (Parcelable) this.f3122l, i2, false);
        q.a(parcel, 10, (T[]) this.f3123m, i2, false);
        q.a(parcel, 11, (T[]) this.f3124n, i2, false);
        q.a(parcel, 12, this.f3125o);
        q.a(parcel, 13, this.f3126p);
        q.m(parcel, a);
    }

    public g(int i2, int i3, int i4, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, d[] dVarArr, d[] dVarArr2, boolean z, int i5) {
        this.e = i2;
        this.f3116f = i3;
        this.f3117g = i4;
        if ("com.google.android.gms".equals(str)) {
            this.f3118h = "com.google.android.gms";
        } else {
            this.f3118h = str;
        }
        if (i2 < 2) {
            this.f3122l = iBinder != null ? a.a(l.a.a(iBinder)) : null;
        } else {
            this.f3119i = iBinder;
            this.f3122l = account;
        }
        this.f3120j = scopeArr;
        this.f3121k = bundle;
        this.f3123m = dVarArr;
        this.f3124n = dVarArr2;
        this.f3125o = z;
        this.f3126p = i5;
    }
}
