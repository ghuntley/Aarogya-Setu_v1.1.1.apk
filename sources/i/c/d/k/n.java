package i.c.d.k;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final class n {
    public final Messenger a;

    /* renamed from: b  reason: collision with root package name */
    public final t0 f4706b;

    public n(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(iBinder);
            this.f4706b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f4706b = new t0(iBinder);
            this.a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", valueOf.length() != 0 ? "Invalid interface descriptor: ".concat(valueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }
}
