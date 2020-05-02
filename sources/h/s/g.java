package h.s;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;
import h.s.d;
import h.s.e;
import h.s.f;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MultiInstanceInvalidationClient */
public class g {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2172b;
    public int c;
    public final f d;
    public final f.c e;

    /* renamed from: f  reason: collision with root package name */
    public e f2173f;

    /* renamed from: g  reason: collision with root package name */
    public final Executor f2174g;

    /* renamed from: h  reason: collision with root package name */
    public final d f2175h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final AtomicBoolean f2176i = new AtomicBoolean(false);

    /* renamed from: j  reason: collision with root package name */
    public final ServiceConnection f2177j = new b();

    /* renamed from: k  reason: collision with root package name */
    public final Runnable f2178k = new c();

    /* renamed from: l  reason: collision with root package name */
    public final Runnable f2179l = new d();

    /* compiled from: MultiInstanceInvalidationClient */
    public class a extends d.a {

        /* renamed from: h.s.g$a$a  reason: collision with other inner class name */
        /* compiled from: MultiInstanceInvalidationClient */
        public class C0065a implements Runnable {
            public final /* synthetic */ String[] e;

            public C0065a(String[] strArr) {
                this.e = strArr;
            }

            public void run() {
                g.this.d.a(this.e);
            }
        }

        public a() {
        }

        public void a(String[] strArr) {
            g.this.f2174g.execute(new C0065a(strArr));
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    public class b implements ServiceConnection {
        public b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            g.this.f2173f = e.a.a(iBinder);
            g gVar = g.this;
            gVar.f2174g.execute(gVar.f2178k);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            g gVar = g.this;
            gVar.f2174g.execute(gVar.f2179l);
            g.this.f2173f = null;
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            try {
                e eVar = g.this.f2173f;
                if (eVar != null) {
                    g.this.c = eVar.a(g.this.f2175h, g.this.f2172b);
                    g.this.d.a(g.this.e);
                }
            } catch (RemoteException e2) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e2);
            }
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    public class d implements Runnable {
        public d() {
        }

        public void run() {
            g gVar = g.this;
            gVar.d.b(gVar.e);
        }
    }

    /* compiled from: MultiInstanceInvalidationClient */
    public class e extends f.c {
        public e(String[] strArr) {
            super(strArr);
        }

        public void a(Set<String> set) {
            if (!g.this.f2176i.get()) {
                try {
                    e eVar = g.this.f2173f;
                    if (eVar != null) {
                        eVar.a(g.this.c, (String[]) set.toArray(new String[0]));
                    }
                } catch (RemoteException e) {
                    Log.w("ROOM", "Cannot broadcast invalidation", e);
                }
            }
        }
    }

    public g(Context context, String str, f fVar, Executor executor) {
        this.a = context.getApplicationContext();
        this.f2172b = str;
        this.d = fVar;
        this.f2174g = executor;
        this.e = new e((String[]) fVar.a.keySet().toArray(new String[0]));
        this.a.bindService(new Intent(this.a, MultiInstanceInvalidationService.class), this.f2177j, 1);
    }
}
