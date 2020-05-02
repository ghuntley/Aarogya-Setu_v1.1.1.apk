package h.a0.x.r;

import androidx.work.impl.WorkDatabase;
import h.a0.x.e;
import h.a0.x.j;
import java.util.UUID;

/* compiled from: CancelWorkRunnable */
public final class a extends c {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f1081f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ UUID f1082g;

    public a(j jVar, UUID uuid) {
        this.f1081f = jVar;
        this.f1082g = uuid;
    }

    /* JADX INFO: finally extract failed */
    public void a() {
        WorkDatabase workDatabase = this.f1081f.c;
        workDatabase.c();
        try {
            a(this.f1081f, this.f1082g.toString());
            workDatabase.h();
            workDatabase.e();
            j jVar = this.f1081f;
            e.a(jVar.f958b, jVar.c, jVar.e);
        } catch (Throwable th) {
            workDatabase.e();
            throw th;
        }
    }
}
