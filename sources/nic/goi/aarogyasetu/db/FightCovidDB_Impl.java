package nic.goi.aarogyasetu.db;

import android.content.Context;
import h.s.f;
import h.s.h;
import h.s.i;
import h.s.n.c;
import h.v.a.b;
import h.v.a.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class FightCovidDB_Impl extends FightCovidDB {

    /* renamed from: m  reason: collision with root package name */
    public volatile b.a.a.g.e.a f5246m;

    public class a extends i.a {
        public a(int i2) {
            super(i2);
        }

        public void a(b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("CREATE TABLE IF NOT EXISTS `nearby_devices_info_table` (`id` INTEGER NOT NULL, `bluetooth_mac_address` TEXT, `distance` INTEGER, `tx_power` TEXT, `tx_power_level` TEXT, `lat` TEXT, `long` TEXT, `timestamp` INTEGER, PRIMARY KEY(`timestamp`))");
            h.v.a.f.a aVar = (h.v.a.f.a) bVar;
            aVar.e.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.e.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5583857386f54676330a0bb018ce3a0d')");
        }

        public void b(b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("DROP TABLE IF EXISTS `nearby_devices_info_table`");
            if (FightCovidDB_Impl.this.f2184g != null) {
                int i2 = 0;
                int size = FightCovidDB_Impl.this.f2184g.size();
                while (i2 < size) {
                    if (FightCovidDB_Impl.this.f2184g.get(i2) != null) {
                        i2++;
                    } else {
                        throw null;
                    }
                }
            }
        }

        public void c(b bVar) {
            if (FightCovidDB_Impl.this.f2184g != null) {
                int size = FightCovidDB_Impl.this.f2184g.size();
                for (int i2 = 0; i2 < size; i2++) {
                    FightCovidDB_Impl.this.f2184g.get(i2).a(bVar);
                }
            }
        }

        public void d(b bVar) {
            b unused = FightCovidDB_Impl.this.a = bVar;
            FightCovidDB_Impl.this.d.a(bVar);
            List<h.b> list = FightCovidDB_Impl.this.f2184g;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    FightCovidDB_Impl.this.f2184g.get(i2).b(bVar);
                }
            }
        }

        public void e(b bVar) {
        }

        public void f(b bVar) {
            h.s.n.b.a(bVar);
        }

        public i.b g(b bVar) {
            HashMap hashMap = new HashMap(8);
            hashMap.put("id", new c.a("id", "INTEGER", true, 0, (String) null, 1));
            hashMap.put("bluetooth_mac_address", new c.a("bluetooth_mac_address", "TEXT", false, 0, (String) null, 1));
            hashMap.put("distance", new c.a("distance", "INTEGER", false, 0, (String) null, 1));
            hashMap.put("tx_power", new c.a("tx_power", "TEXT", false, 0, (String) null, 1));
            hashMap.put("tx_power_level", new c.a("tx_power_level", "TEXT", false, 0, (String) null, 1));
            hashMap.put("lat", new c.a("lat", "TEXT", false, 0, (String) null, 1));
            hashMap.put("long", new c.a("long", "TEXT", false, 0, (String) null, 1));
            hashMap.put("timestamp", new c.a("timestamp", "INTEGER", false, 1, (String) null, 1));
            c cVar = new c("nearby_devices_info_table", hashMap, new HashSet(0), new HashSet(0));
            c a = c.a(bVar, "nearby_devices_info_table");
            if (cVar.equals(a)) {
                return new i.b(true, (String) null);
            }
            return new i.b(false, "nearby_devices_info_table(nic.goi.aarogyasetu.models.BluetoothData).\n Expected:\n" + cVar + "\n Found:\n" + a);
        }
    }

    public f d() {
        return new f(this, new HashMap(0), new HashMap(0), "nearby_devices_info_table");
    }

    public b.a.a.g.e.a i() {
        b.a.a.g.e.a aVar;
        if (this.f5246m != null) {
            return this.f5246m;
        }
        synchronized (this) {
            if (this.f5246m == null) {
                this.f5246m = new b.a.a.g.e.b(this);
            }
            aVar = this.f5246m;
        }
        return aVar;
    }

    public h.v.a.c a(h.s.a aVar) {
        i iVar = new i(aVar, new a(3), "5583857386f54676330a0bb018ce3a0d", "aaac30358feaacdab0c103089f448b3d");
        Context context = aVar.f2154b;
        String str = aVar.c;
        if (context != null) {
            return aVar.a.a(new c.b(context, str, iVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }
}
