package h.a0.x.q;

import android.database.Cursor;
import android.os.CancellationSignal;
import h.s.c;
import h.s.h;
import h.s.j;
import h.s.l;
import h.v.a.f.f;

/* compiled from: SystemIdInfoDao_Impl */
public final class i implements h {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final c<g> f1055b;
    public final l c;

    /* compiled from: SystemIdInfoDao_Impl */
    public class a extends c<g> {
        public a(i iVar, h hVar) {
            super(hVar);
        }

        public void a(f fVar, Object obj) {
            g gVar = (g) obj;
            String str = gVar.a;
            if (str == null) {
                fVar.e.bindNull(1);
            } else {
                fVar.e.bindString(1, str);
            }
            fVar.e.bindLong(2, (long) gVar.f1054b);
        }

        public String b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }
    }

    /* compiled from: SystemIdInfoDao_Impl */
    public class b extends l {
        public b(i iVar, h hVar) {
            super(hVar);
        }

        public String b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public i(h hVar) {
        this.a = hVar;
        this.f1055b = new a(this, hVar);
        this.c = new b(this, hVar);
    }

    public void a(g gVar) {
        this.a.b();
        this.a.c();
        try {
            this.f1055b.a(gVar);
            this.a.h();
        } finally {
            this.a.e();
        }
    }

    public void b(String str) {
        this.a.b();
        f a2 = this.c.a();
        if (str == null) {
            a2.e.bindNull(1);
        } else {
            a2.e.bindString(1, str);
        }
        this.a.c();
        try {
            a2.f();
            this.a.h();
            this.a.e();
            l lVar = this.c;
            if (a2 == lVar.c) {
                lVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.e();
            this.c.a(a2);
            throw th;
        }
    }

    public g a(String str) {
        j a2 = j.a("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        this.a.b();
        g gVar = null;
        Cursor a3 = h.s.n.b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            int a4 = g.a.a.b.a.a(a3, "work_spec_id");
            int a5 = g.a.a.b.a.a(a3, "system_id");
            if (a3.moveToFirst()) {
                gVar = new g(a3.getString(a4), a3.getInt(a5));
            }
            return gVar;
        } finally {
            a3.close();
            a2.f();
        }
    }
}
