package h.a0;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* compiled from: WorkerFactory */
public abstract class w {
    public static final String a = l.a("WorkerFactory");

    /* compiled from: WorkerFactory */
    public static class a extends w {
    }

    public final ListenableWorker a(Context context, String str, WorkerParameters workerParameters) {
        Class<? extends U> cls;
        ListenableWorker listenableWorker = null;
        try {
            cls = Class.forName(str).asSubclass(ListenableWorker.class);
        } catch (ClassNotFoundException unused) {
            l.a().b(a, i.a.a.a.a.b("Class not found: ", str), new Throwable[0]);
            cls = null;
        }
        if (cls != null) {
            try {
                listenableWorker = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
            } catch (Exception e) {
                l.a().b(a, i.a.a.a.a.b("Could not instantiate ", str), e);
            }
        }
        if (listenableWorker == null || !listenableWorker.f367g) {
            return listenableWorker;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }

    public static w a() {
        return new a();
    }
}
