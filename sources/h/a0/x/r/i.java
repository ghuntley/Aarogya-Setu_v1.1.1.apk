package h.a0.x.r;

import androidx.work.WorkerParameters;
import h.a0.x.j;

/* compiled from: StartWorkRunnable */
public class i implements Runnable {
    public j e;

    /* renamed from: f  reason: collision with root package name */
    public String f1092f;

    /* renamed from: g  reason: collision with root package name */
    public WorkerParameters.a f1093g;

    public i(j jVar, String str, WorkerParameters.a aVar) {
        this.e = jVar;
        this.f1092f = str;
        this.f1093g = aVar;
    }

    public void run() {
        this.e.f959f.a(this.f1092f, this.f1093g);
    }
}
