package b.a.a.g;

import b.a.a.g.e.b;
import h.v.a.f.f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import nic.goi.aarogyasetu.db.FightCovidDB;
import nic.goi.aarogyasetu.models.BluetoothData;

/* compiled from: DBManager */
public class c {
    public static int a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b  reason: collision with root package name */
    public static ThreadPoolExecutor f419b;

    static {
        int i2 = a;
        f419b = new ThreadPoolExecutor(i2 * 2, i2 * 2, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());
    }

    public static /* synthetic */ List a(List list) {
        h.s.c<BluetoothData> cVar;
        f a2;
        b bVar = (b) FightCovidDB.j().i();
        bVar.a.b();
        bVar.a.c();
        try {
            cVar = bVar.f420b;
            a2 = cVar.a();
            ArrayList arrayList = new ArrayList(list.size());
            int i2 = 0;
            for (Object a3 : list) {
                cVar.a(a2, a3);
                arrayList.add(i2, Long.valueOf(a2.a()));
                i2++;
            }
            cVar.a(a2);
            bVar.a.h();
            bVar.a.e();
            return arrayList;
        } catch (Throwable th) {
            bVar.a.e();
            throw th;
        }
    }

    public static /* synthetic */ Long a(BluetoothData bluetoothData) {
        h.s.c<BluetoothData> cVar;
        f a2;
        b bVar = (b) FightCovidDB.j().i();
        bVar.a.b();
        bVar.a.c();
        try {
            cVar = bVar.f420b;
            a2 = cVar.a();
            cVar.a(a2, bluetoothData);
            long a3 = a2.a();
            if (a2 == cVar.c) {
                cVar.a.set(false);
            }
            bVar.a.h();
            bVar.a.e();
            return Long.valueOf(a3);
        } catch (Throwable th) {
            bVar.a.e();
            throw th;
        }
    }
}
