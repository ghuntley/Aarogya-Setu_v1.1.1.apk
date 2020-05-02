package nic.goi.aarogyasetu.background;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b.a.a.g.e.b;
import b.a.a.k.a;
import b.a.a.l.o;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import h.s.l;
import java.util.Date;
import n.m.c.f;
import nic.goi.aarogyasetu.CoronaApplication;
import nic.goi.aarogyasetu.db.FightCovidDB;

/* compiled from: BackgroundWorker.kt */
public final class BackgroundWorker extends Worker {

    /* renamed from: j  reason: collision with root package name */
    public static final String f5228j;

    /* renamed from: k  reason: collision with root package name */
    public static final BackgroundWorker f5229k = null;

    /* renamed from: i  reason: collision with root package name */
    public final Context f5230i;

    static {
        String simpleName = BackgroundWorker.class.getSimpleName();
        f.a((Object) simpleName, "BackgroundWorker::class.java.simpleName");
        f5228j = simpleName;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BackgroundWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        if (context == null) {
            f.a("context");
            throw null;
        } else if (workerParameters != null) {
            this.f5230i = context;
        } else {
            f.a("workerParams");
            throw null;
        }
    }

    public ListenableWorker.a d() {
        Intent intent = new Intent(this.f5230i, BluetoothScanningService.class);
        intent.putExtra("fromMyWorker", true);
        String a = a.a((Context) CoronaApplication.f5224g, "unique_id", "");
        if (!BluetoothScanningService.f5231p) {
            f.a((Object) a, "uniqueId");
            if (a.length() > 0) {
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f5230i.startForegroundService(intent);
                } else {
                    this.f5230i.startService(intent);
                }
            }
        }
        if (o.f436b.b()) {
            BluetoothAdapter.getDefaultAdapter().startDiscovery();
        }
        FightCovidDB j2 = FightCovidDB.j();
        o.a aVar = o.f436b;
        int time = (int) (new Date().getTime() / ((long) AnswersRetryFilesSender.BACKOFF_MS));
        f.a((Object) j2, "dbInstance");
        b bVar = (b) j2.i();
        bVar.a.b();
        h.v.a.f.f a2 = bVar.c.a();
        a2.e.bindLong(1, (long) time);
        a2.e.bindLong(2, (long) (Integer.parseInt(a.a((Context) CoronaApplication.f5224g, "max_data_persisting_days", "30")) * 24 * 60 * 60));
        bVar.a.c();
        try {
            a2.f();
            bVar.a.h();
            ListenableWorker.a.c cVar = new ListenableWorker.a.c();
            f.a((Object) cVar, "Result.success()");
            return cVar;
        } finally {
            bVar.a.e();
            l lVar = bVar.c;
            if (a2 == lVar.c) {
                lVar.a.set(false);
            }
        }
    }
}
