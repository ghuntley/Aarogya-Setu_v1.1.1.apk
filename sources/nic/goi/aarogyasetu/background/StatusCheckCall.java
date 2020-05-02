package nic.goi.aarogyasetu.background;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b.a.a.l.o;

public class StatusCheckCall extends Worker {

    /* renamed from: i  reason: collision with root package name */
    public Context f5242i;

    public StatusCheckCall(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f5242i = context;
    }

    public ListenableWorker.a d() {
        o.f436b.b(this.f5242i);
        return new ListenableWorker.a.c();
    }
}
