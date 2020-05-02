package i.c.a.b.g.g;

import android.database.Cursor;
import h.e.a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final /* synthetic */ class g1 implements j1 {
    public final c1 a;

    public g1(c1 c1Var) {
        this.a = c1Var;
    }

    /* JADX INFO: finally extract failed */
    public final Object a() {
        Map map;
        c1 c1Var = this.a;
        Cursor query = c1Var.a.query(c1Var.f3235b, c1.f3234h, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Map emptyMap = Collections.emptyMap();
                query.close();
                return emptyMap;
            }
            if (count <= 256) {
                map = new a(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }
}
