package i.c.a.d.a.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class f implements e, IInterface {
    public final IBinder a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4302b = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";

    public f(IBinder iBinder) {
        this.a = iBinder;
    }

    public final void a(String str, Bundle bundle, i iVar) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4302b);
        obtain.writeString(str);
        c.a(obtain, (Parcelable) bundle);
        if (iVar == null) {
            iBinder = null;
        } else {
            iBinder = iVar.asBinder();
        }
        obtain.writeStrongBinder(iBinder);
        try {
            this.a.transact(2, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public IBinder asBinder() {
        return this.a;
    }

    public final void b(String str, Bundle bundle, i iVar) {
        IBinder iBinder;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(this.f4302b);
        obtain.writeString(str);
        c.a(obtain, (Parcelable) bundle);
        if (iVar == null) {
            iBinder = null;
        } else {
            iBinder = iVar.asBinder();
        }
        obtain.writeStrongBinder(iBinder);
        try {
            this.a.transact(3, obtain, (Parcel) null, 1);
        } finally {
            obtain.recycle();
        }
    }
}
