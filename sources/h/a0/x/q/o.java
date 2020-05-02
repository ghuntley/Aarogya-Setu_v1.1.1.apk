package h.a0.x.q;

import h.a0.e;
import h.s.h;
import h.s.l;
import h.v.a.f.f;

/* compiled from: WorkProgressDao_Impl */
public final class o implements n {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final l f1059b;
    public final l c;

    /* compiled from: WorkProgressDao_Impl */
    public class a extends h.s.c<m> {
        public a(o oVar, h hVar) {
            super(hVar);
        }

        public void a(f fVar, Object obj) {
            m mVar = (m) obj;
            String str = mVar.a;
            if (str == null) {
                fVar.e.bindNull(1);
            } else {
                fVar.e.bindString(1, str);
            }
            byte[] a = e.a(mVar.f1058b);
            if (a == null) {
                fVar.e.bindNull(2);
            } else {
                fVar.e.bindBlob(2, a);
            }
        }

        public String b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    public class b extends l {
        public b(o oVar, h hVar) {
            super(hVar);
        }

        public String b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* compiled from: WorkProgressDao_Impl */
    public class c extends l {
        public c(o oVar, h hVar) {
            super(hVar);
        }

        public String b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public o(h hVar) {
        this.a = hVar;
        new a(this, hVar);
        this.f1059b = new b(this, hVar);
        this.c = new c(this, hVar);
    }

    public void a(String str) {
        this.a.b();
        f a2 = this.f1059b.a();
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
            l lVar = this.f1059b;
            if (a2 == lVar.c) {
                lVar.a.set(false);
            }
        } catch (Throwable th) {
            this.a.e();
            this.f1059b.a(a2);
            throw th;
        }
    }

    public void a() {
        this.a.b();
        f a2 = this.c.a();
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
}
