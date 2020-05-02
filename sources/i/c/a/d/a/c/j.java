package i.c.a.d.a.c;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class j<T extends IInterface> {

    /* renamed from: l  reason: collision with root package name */
    public static final Map<String, Handler> f4303l = Collections.synchronizedMap(new HashMap());
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final a f4304b;
    public final String c;
    public final List<k> d = new ArrayList();
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final Intent f4305f;

    /* renamed from: g  reason: collision with root package name */
    public final q<T> f4306g;

    /* renamed from: h  reason: collision with root package name */
    public final WeakReference<n> f4307h;

    /* renamed from: i  reason: collision with root package name */
    public final IBinder.DeathRecipient f4308i = new m(this);

    /* renamed from: j  reason: collision with root package name */
    public ServiceConnection f4309j;

    /* renamed from: k  reason: collision with root package name */
    public T f4310k;

    public j(Context context, a aVar, String str, Intent intent, q<T> qVar, n nVar) {
        this.a = context;
        this.f4304b = aVar;
        this.c = str;
        this.f4305f = intent;
        this.f4306g = qVar;
        this.f4307h = new WeakReference<>(nVar);
    }

    public final Handler a() {
        Handler handler;
        synchronized (f4303l) {
            if (!f4303l.containsKey(this.c)) {
                HandlerThread handlerThread = new HandlerThread(this.c, 10);
                handlerThread.start();
                f4303l.put(this.c, new Handler(handlerThread.getLooper()));
            }
            handler = f4303l.get(this.c);
        }
        return handler;
    }
}
