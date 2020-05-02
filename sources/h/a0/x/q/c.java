package h.a0.x.q;

import android.database.Cursor;
import android.os.CancellationSignal;
import h.s.h;
import h.s.j;
import h.s.n.b;
import h.v.a.f.f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DependencyDao_Impl */
public final class c implements b {
    public final h a;

    /* renamed from: b  reason: collision with root package name */
    public final h.s.c<a> f1051b;

    /* compiled from: DependencyDao_Impl */
    public class a extends h.s.c<a> {
        public a(c cVar, h hVar) {
            super(hVar);
        }

        public void a(f fVar, Object obj) {
            a aVar = (a) obj;
            String str = aVar.a;
            if (str == null) {
                fVar.e.bindNull(1);
            } else {
                fVar.e.bindString(1, str);
            }
            String str2 = aVar.f1050b;
            if (str2 == null) {
                fVar.e.bindNull(2);
            } else {
                fVar.e.bindString(2, str2);
            }
        }

        public String b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }
    }

    public c(h hVar) {
        this.a = hVar;
        this.f1051b = new a(this, hVar);
    }

    public List<String> a(String str) {
        j a2 = j.a("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        this.a.b();
        Cursor a3 = b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            ArrayList arrayList = new ArrayList(a3.getCount());
            while (a3.moveToNext()) {
                arrayList.add(a3.getString(0));
            }
            return arrayList;
        } finally {
            a3.close();
            a2.f();
        }
    }

    public boolean b(String str) {
        boolean z = true;
        j a2 = j.a("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            a2.bindNull(1);
        } else {
            a2.bindString(1, str);
        }
        this.a.b();
        boolean z2 = false;
        Cursor a3 = b.a(this.a, a2, false, (CancellationSignal) null);
        try {
            if (a3.moveToFirst()) {
                if (a3.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            a3.close();
            a2.f();
        }
    }
}
