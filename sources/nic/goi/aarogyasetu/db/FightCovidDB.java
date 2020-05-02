package nic.goi.aarogyasetu.db;

import android.content.Context;
import b.a.a.g.d;
import h.s.h;
import java.util.ArrayList;
import nic.goi.aarogyasetu.CoronaApplication;

public abstract class FightCovidDB extends h {

    /* renamed from: j  reason: collision with root package name */
    public static FightCovidDB f5243j;

    /* renamed from: k  reason: collision with root package name */
    public static final h.s.m.a f5244k = new a(1, 2);

    /* renamed from: l  reason: collision with root package name */
    public static final h.s.m.a f5245l = new b(2, 3);

    public static class a extends h.s.m.a {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        public void a(h.v.a.b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("BEGIN TRANSACTION");
            h.v.a.f.a aVar = (h.v.a.f.a) bVar;
            aVar.e.execSQL("CREATE TABLE nearby_devices_info_table_backup (id INTEGER NOT NULL, bluetooth_mac_address TEXT,distance INTEGER, lat TEXT,long TEXT,timestamp INTEGER, PRIMARY KEY(timestamp))");
            aVar.e.execSQL("INSERT INTO nearby_devices_info_table_backup SELECT id,bluetooth_mac_address,distance,lat,long,timestamp FROM nearby_devices_info_table");
            aVar.e.execSQL("DROP TABLE nearby_devices_info_table");
            aVar.e.execSQL("ALTER TABLE nearby_devices_info_table_backup RENAME TO nearby_devices_info_table");
            aVar.e.execSQL("COMMIT");
        }
    }

    public static class b extends h.s.m.a {
        public b(int i2, int i3) {
            super(i2, i3);
        }

        public void a(h.v.a.b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("BEGIN TRANSACTION");
            h.v.a.f.a aVar = (h.v.a.f.a) bVar;
            aVar.e.execSQL("DROP TABLE user_device_info_table");
            aVar.e.execSQL("DROP TABLE user_location");
            aVar.e.execSQL("COMMIT");
        }
    }

    public static FightCovidDB j() {
        Context applicationContext = CoronaApplication.f5224g.getApplicationContext();
        if (f5243j == null) {
            h.a<FightCovidDB> a2 = g.a.a.b.a.a(applicationContext.getApplicationContext(), FightCovidDB.class, "fight-covid-db");
            d dVar = new d();
            if (a2.d == null) {
                a2.d = new ArrayList<>();
            }
            a2.d.add(dVar);
            a2.a(f5244k);
            a2.a(f5245l);
            f5243j = a2.a();
        }
        return f5243j;
    }

    public abstract b.a.a.g.e.a i();
}
