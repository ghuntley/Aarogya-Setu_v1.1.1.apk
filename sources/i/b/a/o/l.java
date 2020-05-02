package i.b.a.o;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.fragment.app.Fragment;
import h.l.d.e;
import h.l.d.r;
import i.b.a.c;
import i.b.a.j;
import java.util.HashMap;
import java.util.Map;

/* compiled from: RequestManagerRetriever */
public class l implements Handler.Callback {

    /* renamed from: f  reason: collision with root package name */
    public static final b f2811f = new a();
    public volatile j a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<FragmentManager, k> f2812b = new HashMap();
    public final Map<r, o> c = new HashMap();
    public final Handler d;
    public final b e;

    /* compiled from: RequestManagerRetriever */
    public class a implements b {
        public j a(c cVar, h hVar, m mVar, Context context) {
            return new j(cVar, hVar, mVar, context);
        }
    }

    /* compiled from: RequestManagerRetriever */
    public interface b {
        j a(c cVar, h hVar, m mVar, Context context);
    }

    public l(b bVar) {
        new h.e.a();
        new h.e.a();
        new Bundle();
        this.e = bVar == null ? f2811f : bVar;
        this.d = new Handler(Looper.getMainLooper(), this);
    }

    public static Activity c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean d(Context context) {
        Activity c2 = c(context);
        return c2 == null || !c2.isFinishing();
    }

    public j a(Context context) {
        if (context != null) {
            if (i.b.a.t.j.c() && !(context instanceof Application)) {
                if (context instanceof e) {
                    e eVar = (e) context;
                    if (i.b.a.t.j.b()) {
                        return a(eVar.getApplicationContext());
                    }
                    if (!eVar.isDestroyed()) {
                        return a(eVar, eVar.k(), (Fragment) null, d(eVar));
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof Activity) {
                    Activity activity = (Activity) context;
                    if (i.b.a.t.j.b()) {
                        return a(activity.getApplicationContext());
                    }
                    if (!activity.isDestroyed()) {
                        k a2 = a(activity.getFragmentManager(), (android.app.Fragment) null, d(activity));
                        j jVar = a2.f2808h;
                        if (jVar != null) {
                            return jVar;
                        }
                        j a3 = this.e.a(c.a((Context) activity), a2.e, a2.f2806f, activity);
                        a2.f2808h = a3;
                        return a3;
                    }
                    throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
                } else if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return a(contextWrapper.getBaseContext());
                    }
                }
            }
            return b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final j b(Context context) {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = this.e.a(c.a(context.getApplicationContext()), new b(), new g(), context.getApplicationContext());
                }
            }
        }
        return this.a;
    }

    public boolean handleMessage(Message message) {
        Object obj;
        Object obj2;
        Object obj3;
        int i2 = message.what;
        Object obj4 = null;
        boolean z = true;
        if (i2 == 1) {
            obj3 = (FragmentManager) message.obj;
            obj2 = this.f2812b.remove(obj3);
        } else if (i2 != 2) {
            z = false;
            obj = null;
            if (z && obj4 == null && Log.isLoggable("RMRetriever", 5)) {
                Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
            }
            return z;
        } else {
            obj3 = (r) message.obj;
            obj2 = this.c.remove(obj3);
        }
        Object obj5 = obj3;
        obj4 = obj2;
        obj = obj5;
        Log.w("RMRetriever", "Failed to remove expected request manager fragment, manager: " + obj);
        return z;
    }

    public final k a(FragmentManager fragmentManager, android.app.Fragment fragment, boolean z) {
        k kVar = (k) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (kVar == null && (kVar = this.f2812b.get(fragmentManager)) == null) {
            kVar = new k();
            kVar.f2810j = fragment;
            if (!(fragment == null || fragment.getActivity() == null)) {
                kVar.a(fragment.getActivity());
            }
            if (z) {
                kVar.e.b();
            }
            this.f2812b.put(fragmentManager, kVar);
            fragmentManager.beginTransaction().add(kVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return kVar;
    }

    public final o a(r rVar, Fragment fragment, boolean z) {
        o oVar = (o) rVar.b("com.bumptech.glide.manager");
        if (oVar == null && (oVar = this.c.get(rVar)) == null) {
            oVar = new o();
            oVar.f0 = fragment;
            if (!(fragment == null || fragment.k() == null)) {
                Fragment fragment2 = fragment;
                while (true) {
                    Fragment fragment3 = fragment2.y;
                    if (fragment3 == null) {
                        break;
                    }
                    fragment2 = fragment3;
                }
                r rVar2 = fragment2.v;
                if (rVar2 != null) {
                    oVar.a(fragment.k(), rVar2);
                }
            }
            if (z) {
                oVar.a0.b();
            }
            this.c.put(rVar, oVar);
            h.l.d.a aVar = new h.l.d.a(rVar);
            aVar.a(0, oVar, "com.bumptech.glide.manager", 1);
            aVar.a();
            this.d.obtainMessage(2, rVar).sendToTarget();
        }
        return oVar;
    }

    public final j a(Context context, r rVar, Fragment fragment, boolean z) {
        o a2 = a(rVar, fragment, z);
        j jVar = a2.e0;
        if (jVar != null) {
            return jVar;
        }
        j a3 = this.e.a(c.a(context), a2.a0, a2.b0, context);
        a2.e0 = a3;
        return a3;
    }
}
