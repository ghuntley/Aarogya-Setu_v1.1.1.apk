package h.a0.x.q;

import android.database.Cursor;
import android.os.CancellationSignal;
import h.s.c;
import h.s.h;
import h.s.j;
import h.s.n.b;

/* compiled from: PreferenceDao_Impl */
public final class f implements e {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final c<d> f1053b;

    /* compiled from: PreferenceDao_Impl */
    public class a extends c<d> {
        public a(f fVar, h hVar) {
            super(hVar);
        }

        public void a(h.v.a.f.f fVar, Object obj) {
            d dVar = (d) obj;
            String str = dVar.a;
            if (str == null) {
                fVar.e.bindNull(1);
            } else {
                fVar.e.bindString(1, str);
            }
            Long l2 = dVar.f1052b;
            if (l2 == null) {
                fVar.e.bindNull(2);
                return;
            }
            fVar.e.bindLong(2, l2.longValue());
        }

        public String b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }
    }

    public f(h hVar) {
        this.a = hVar;
        this.f1053b = new a(this, hVar);
    }

    public void a(d dVar) {
        this.a.b();
        this.a.c();
        try {
            this.f1053b.a(dVar);
            this.a.h();
        } finally {
            this.a.e();
        }
    }

    public Long a(String str) {
        j a2 = j.a("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        this.a.b();
        Long l2 = null;
        Cursor a3 = b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            if (a3.moveToFirst()) {
                if (!a3.isNull(0)) {
                    l2 = Long.valueOf(a3.getLong(0));
                }
            }
            return l2;
        } finally {
            a3.close();
            a2.f();
        }
    }
}
