package h.a0.x.q;

import h.s.c;
import h.s.h;
import h.v.a.f.f;

/* compiled from: WorkTagDao_Impl */
public final class u implements t {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final c<s> f1080b;

    /* compiled from: WorkTagDao_Impl */
    public class a extends c<s> {
        public a(u uVar, h hVar) {
            super(hVar);
        }

        public void a(f fVar, Object obj) {
            s sVar = (s) obj;
            String str = sVar.a;
            if (str == null) {
                fVar.e.bindNull(1);
            } else {
                fVar.e.bindString(1, str);
            }
            String str2 = sVar.f1079b;
            if (str2 == null) {
                fVar.e.bindNull(2);
            } else {
                fVar.e.bindString(2, str2);
            }
        }

        public String b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    public u(h hVar) {
        this.a = hVar;
        this.f1080b = new a(this, hVar);
    }
}
