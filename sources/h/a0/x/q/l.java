package h.a0.x.q;

import h.s.c;
import h.s.h;
import h.v.a.f.f;

/* compiled from: WorkNameDao_Impl */
public final class l implements k {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final c<j> f1057b;

    /* compiled from: WorkNameDao_Impl */
    public class a extends c<j> {
        public a(l lVar, h hVar) {
            super(hVar);
        }

        public void a(f fVar, Object obj) {
            j jVar = (j) obj;
            String str = jVar.a;
            if (str == null) {
                fVar.e.bindNull(1);
            } else {
                fVar.e.bindString(1, str);
            }
            String str2 = jVar.f1056b;
            if (str2 == null) {
                fVar.e.bindNull(2);
            } else {
                fVar.e.bindString(2, str2);
            }
        }

        public String b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public l(h hVar) {
        this.a = hVar;
        this.f1057b = new a(this, hVar);
    }
}
