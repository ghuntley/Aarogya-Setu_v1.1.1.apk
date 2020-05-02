package nic.goi.aarogyasetu.background;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import b.a.a.l.e0;

public class UploadDataToServerWorker extends Worker {
    public UploadDataToServerWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public ListenableWorker.a d() {
        new e0().b();
        return new ListenableWorker.a.c();
    }
}
