package h.a0.x.r;

import androidx.work.impl.WorkDatabase;
import h.a0.x.e;
import h.a0.x.j;
import h.a0.x.q.r;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: CancelWorkRunnable */
public final class b extends c {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ j f1083f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f1084g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ boolean f1085h;

    public b(j jVar, String str, boolean z) {
        this.f1083f = jVar;
        this.f1084g = str;
        this.f1085h = z;
    }

    /* JADX INFO: finally extract failed */
    public void a() {
        WorkDatabase workDatabase = this.f1083f.c;
        workDatabase.c();
        try {
            Iterator it = ((ArrayList) ((r) workDatabase.n()).b(this.f1084g)).iterator();
            while (it.hasNext()) {
                a(this.f1083f, (String) it.next());
            }
            workDatabase.h();
            workDatabase.e();
            if (this.f1085h) {
                j jVar = this.f1083f;
                e.a(jVar.f958b, jVar.c, jVar.e);
            }
        } catch (Throwable th) {
            workDatabase.e();
            throw th;
        }
    }
}
