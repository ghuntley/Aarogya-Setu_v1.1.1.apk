package i.c.a.b.d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import i.c.a.b.d.l.q;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class a implements ServiceConnection {
    public boolean a = false;

    /* renamed from: b  reason: collision with root package name */
    public final BlockingQueue<IBinder> f3012b = new LinkedBlockingQueue();

    public IBinder a(long j2, TimeUnit timeUnit) {
        q.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.a) {
            this.a = true;
            IBinder poll = this.f3012b.poll(j2, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f3012b.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
