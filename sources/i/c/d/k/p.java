package i.c.d.k;

import android.os.Bundle;
import android.util.Log;
import com.google.firebase.iid.zzap;
import i.c.a.b.l.h;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public abstract class p<T> {
    public final int a;

    /* renamed from: b  reason: collision with root package name */
    public final h<T> f4710b = new h<>();
    public final int c;
    public final Bundle d;

    public p(int i2, int i3, Bundle bundle) {
        this.a = i2;
        this.c = i3;
        this.d = bundle;
    }

    public abstract void a(Bundle bundle);

    public final void a(T t) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(t);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 16);
            sb.append("Finishing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f4710b.a.a(t);
    }

    public abstract boolean a();

    public String toString() {
        int i2 = this.c;
        int i3 = this.a;
        boolean a2 = a();
        StringBuilder sb = new StringBuilder(55);
        sb.append("Request { what=");
        sb.append(i2);
        sb.append(" id=");
        sb.append(i3);
        sb.append(" oneWay=");
        sb.append(a2);
        sb.append("}");
        return sb.toString();
    }

    public final void a(zzap zzap) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(this);
            String valueOf2 = String.valueOf(zzap);
            StringBuilder sb = new StringBuilder(valueOf2.length() + valueOf.length() + 14);
            sb.append("Failing ");
            sb.append(valueOf);
            sb.append(" with ");
            sb.append(valueOf2);
            Log.d("MessengerIpcClient", sb.toString());
        }
        this.f4710b.a.a((Exception) zzap);
    }
}
