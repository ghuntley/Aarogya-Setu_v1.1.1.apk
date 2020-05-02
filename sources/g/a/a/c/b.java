package g.a.a.c;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import g.a.a.c.a;

@SuppressLint({"BanParcelableUsage"})
/* compiled from: ResultReceiver */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final Handler e = null;

    /* renamed from: f  reason: collision with root package name */
    public a f887f;

    /* compiled from: ResultReceiver */
    public static class a implements Parcelable.Creator<b> {
        public Object createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        public Object[] newArray(int i2) {
            return new b[i2];
        }
    }

    /* renamed from: g.a.a.c.b$b  reason: collision with other inner class name */
    /* compiled from: ResultReceiver */
    public class C0024b extends a.C0022a {
        public C0024b() {
        }

        public void a(int i2, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.e;
            if (handler != null) {
                handler.post(new c(i2, bundle));
            } else {
                bVar.a(i2, bundle);
            }
        }
    }

    /* compiled from: ResultReceiver */
    public class c implements Runnable {
        public final int e;

        /* renamed from: f  reason: collision with root package name */
        public final Bundle f888f;

        public c(int i2, Bundle bundle) {
            this.e = i2;
            this.f888f = bundle;
        }

        public void run() {
            b.this.a(this.e, this.f888f);
        }
    }

    public b(Parcel parcel) {
        this.f887f = a.C0022a.a(parcel.readStrongBinder());
    }

    public void a(int i2, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        synchronized (this) {
            if (this.f887f == null) {
                this.f887f = new C0024b();
            }
            parcel.writeStrongBinder(this.f887f.asBinder());
        }
    }
}
