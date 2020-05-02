package h.a0.x;

import androidx.work.impl.WorkDatabase;
import h.s.h;
import h.v.a.b;
import h.v.a.f.a;

/* compiled from: WorkDatabase */
public final class g extends h.b {
    public void b(b bVar) {
        ((a) bVar).e.beginTransaction();
        try {
            ((a) bVar).e.execSQL(WorkDatabase.p());
            ((a) bVar).e.setTransactionSuccessful();
        } finally {
            ((a) bVar).e.endTransaction();
        }
    }
}
