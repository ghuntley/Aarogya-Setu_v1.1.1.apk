package androidx.work.impl;

import android.content.Context;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import h.a0.x.q.b;
import h.a0.x.q.e;
import h.a0.x.q.h;
import h.a0.x.q.k;
import h.a0.x.q.l;
import h.a0.x.q.n;
import h.a0.x.q.o;
import h.a0.x.q.q;
import h.a0.x.q.r;
import h.a0.x.q.t;
import h.a0.x.q.u;
import h.s.f;
import h.s.h;
import h.s.i;
import h.s.n.c;
import h.v.a.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public final class WorkDatabase_Impl extends WorkDatabase {

    /* renamed from: k  reason: collision with root package name */
    public volatile q f371k;

    /* renamed from: l  reason: collision with root package name */
    public volatile b f372l;

    /* renamed from: m  reason: collision with root package name */
    public volatile t f373m;

    /* renamed from: n  reason: collision with root package name */
    public volatile h f374n;

    /* renamed from: o  reason: collision with root package name */
    public volatile k f375o;

    /* renamed from: p  reason: collision with root package name */
    public volatile n f376p;

    /* renamed from: q  reason: collision with root package name */
    public volatile e f377q;

    public class a extends i.a {
        public a(int i2) {
            super(i2);
        }

        public void a(h.v.a.b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            h.v.a.f.a aVar = (h.v.a.f.a) bVar;
            aVar.e.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            aVar.e.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            aVar.e.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            aVar.e.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            aVar.e.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            aVar.e.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.e.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            aVar.e.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.e.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.e.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            aVar.e.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            aVar.e.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            aVar.e.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            aVar.e.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'cf029002fffdcadf079e8d0a1c9a70ac')");
        }

        public void b(h.v.a.b bVar) {
            h.v.a.f.a aVar = (h.v.a.f.a) bVar;
            aVar.e.execSQL("DROP TABLE IF EXISTS `Dependency`");
            aVar.e.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            aVar.e.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            aVar.e.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            aVar.e.execSQL("DROP TABLE IF EXISTS `WorkName`");
            aVar.e.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            aVar.e.execSQL("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f2184g != null) {
                int i2 = 0;
                int size = WorkDatabase_Impl.this.f2184g.size();
                while (i2 < size) {
                    if (WorkDatabase_Impl.this.f2184g.get(i2) != null) {
                        i2++;
                    } else {
                        throw null;
                    }
                }
            }
        }

        public void c(h.v.a.b bVar) {
            if (WorkDatabase_Impl.this.f2184g != null) {
                int size = WorkDatabase_Impl.this.f2184g.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f2184g.get(i2).a(bVar);
                }
            }
        }

        public void d(h.v.a.b bVar) {
            h.v.a.b unused = WorkDatabase_Impl.this.a = bVar;
            ((h.v.a.f.a) bVar).e.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.d.a(bVar);
            List<h.b> list = WorkDatabase_Impl.this.f2184g;
            if (list != null) {
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    WorkDatabase_Impl.this.f2184g.get(i2).b(bVar);
                }
            }
        }

        public void e(h.v.a.b bVar) {
        }

        public void f(h.v.a.b bVar) {
            h.s.n.b.a(bVar);
        }

        public i.b g(h.v.a.b bVar) {
            h.v.a.b bVar2 = bVar;
            HashMap hashMap = new HashMap(2);
            hashMap.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap.put("prerequisite_id", new c.a("prerequisite_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            hashSet.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new c.d("index_Dependency_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            hashSet2.add(new c.d("index_Dependency_prerequisite_id", false, Arrays.asList(new String[]{"prerequisite_id"})));
            c cVar = new c("Dependency", hashMap, hashSet, hashSet2);
            c a = c.a(bVar2, "Dependency");
            if (!cVar.equals(a)) {
                return new i.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + cVar + "\n Found:\n" + a);
            }
            HashMap hashMap2 = new HashMap(24);
            hashMap2.put("id", new c.a("id", "TEXT", true, 1, (String) null, 1));
            hashMap2.put("state", new c.a("state", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("worker_class_name", new c.a("worker_class_name", "TEXT", true, 0, (String) null, 1));
            hashMap2.put("input_merger_class_name", new c.a("input_merger_class_name", "TEXT", false, 0, (String) null, 1));
            hashMap2.put("input", new c.a("input", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("output", new c.a("output", "BLOB", true, 0, (String) null, 1));
            hashMap2.put("initial_delay", new c.a("initial_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("interval_duration", new c.a("interval_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("flex_duration", new c.a("flex_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_attempt_count", new c.a("run_attempt_count", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_policy", new c.a("backoff_policy", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("backoff_delay_duration", new c.a("backoff_delay_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("period_start_time", new c.a("period_start_time", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("minimum_retention_duration", new c.a("minimum_retention_duration", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("schedule_requested_at", new c.a("schedule_requested_at", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("run_in_foreground", new c.a("run_in_foreground", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("required_network_type", new c.a("required_network_type", "INTEGER", false, 0, (String) null, 1));
            hashMap2.put("requires_charging", new c.a("requires_charging", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_device_idle", new c.a("requires_device_idle", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_battery_not_low", new c.a("requires_battery_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("requires_storage_not_low", new c.a("requires_storage_not_low", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_content_update_delay", new c.a("trigger_content_update_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("trigger_max_content_delay", new c.a("trigger_max_content_delay", "INTEGER", true, 0, (String) null, 1));
            hashMap2.put("content_uri_triggers", new c.a("content_uri_triggers", "BLOB", false, 0, (String) null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new c.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList(new String[]{"schedule_requested_at"})));
            hashSet4.add(new c.d("index_WorkSpec_period_start_time", false, Arrays.asList(new String[]{"period_start_time"})));
            c cVar2 = new c("WorkSpec", hashMap2, hashSet3, hashSet4);
            c a2 = c.a(bVar2, "WorkSpec");
            if (!cVar2.equals(a2)) {
                return new i.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + cVar2 + "\n Found:\n" + a2);
            }
            HashMap hashMap3 = new HashMap(2);
            hashMap3.put("tag", new c.a("tag", "TEXT", true, 1, (String) null, 1));
            hashMap3.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new c.d("index_WorkTag_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            c cVar3 = new c("WorkTag", hashMap3, hashSet5, hashSet6);
            c a3 = c.a(bVar2, "WorkTag");
            if (!cVar3.equals(a3)) {
                return new i.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + cVar3 + "\n Found:\n" + a3);
            }
            HashMap hashMap4 = new HashMap(2);
            hashMap4.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap4.put("system_id", new c.a("system_id", "INTEGER", true, 0, (String) null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            c cVar4 = new c("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
            c a4 = c.a(bVar2, "SystemIdInfo");
            if (!cVar4.equals(a4)) {
                return new i.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + cVar4 + "\n Found:\n" + a4);
            }
            HashMap hashMap5 = new HashMap(2);
            hashMap5.put(DefaultAppMeasurementEventListenerRegistrar.NAME, new c.a(DefaultAppMeasurementEventListenerRegistrar.NAME, "TEXT", true, 1, (String) null, 1));
            hashMap5.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 2, (String) null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new c.d("index_WorkName_work_spec_id", false, Arrays.asList(new String[]{"work_spec_id"})));
            c cVar5 = new c("WorkName", hashMap5, hashSet8, hashSet9);
            c a5 = c.a(bVar2, "WorkName");
            if (!cVar5.equals(a5)) {
                return new i.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + cVar5 + "\n Found:\n" + a5);
            }
            HashMap hashMap6 = new HashMap(2);
            hashMap6.put("work_spec_id", new c.a("work_spec_id", "TEXT", true, 1, (String) null, 1));
            hashMap6.put("progress", new c.a("progress", "BLOB", true, 0, (String) null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new c.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"id"})));
            c cVar6 = new c("WorkProgress", hashMap6, hashSet10, new HashSet(0));
            c a6 = c.a(bVar2, "WorkProgress");
            if (!cVar6.equals(a6)) {
                return new i.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + cVar6 + "\n Found:\n" + a6);
            }
            HashMap hashMap7 = new HashMap(2);
            hashMap7.put("key", new c.a("key", "TEXT", true, 1, (String) null, 1));
            hashMap7.put("long_value", new c.a("long_value", "INTEGER", false, 0, (String) null, 1));
            c cVar7 = new c("Preference", hashMap7, new HashSet(0), new HashSet(0));
            c a7 = c.a(bVar2, "Preference");
            if (cVar7.equals(a7)) {
                return new i.b(true, (String) null);
            }
            return new i.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + cVar7 + "\n Found:\n" + a7);
        }
    }

    public f d() {
        return new f(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    public b i() {
        b bVar;
        if (this.f372l != null) {
            return this.f372l;
        }
        synchronized (this) {
            if (this.f372l == null) {
                this.f372l = new h.a0.x.q.c(this);
            }
            bVar = this.f372l;
        }
        return bVar;
    }

    public e j() {
        e eVar;
        if (this.f377q != null) {
            return this.f377q;
        }
        synchronized (this) {
            if (this.f377q == null) {
                this.f377q = new h.a0.x.q.f(this);
            }
            eVar = this.f377q;
        }
        return eVar;
    }

    public h.a0.x.q.h k() {
        h.a0.x.q.h hVar;
        if (this.f374n != null) {
            return this.f374n;
        }
        synchronized (this) {
            if (this.f374n == null) {
                this.f374n = new h.a0.x.q.i(this);
            }
            hVar = this.f374n;
        }
        return hVar;
    }

    public k l() {
        k kVar;
        if (this.f375o != null) {
            return this.f375o;
        }
        synchronized (this) {
            if (this.f375o == null) {
                this.f375o = new l(this);
            }
            kVar = this.f375o;
        }
        return kVar;
    }

    public n m() {
        n nVar;
        if (this.f376p != null) {
            return this.f376p;
        }
        synchronized (this) {
            if (this.f376p == null) {
                this.f376p = new o(this);
            }
            nVar = this.f376p;
        }
        return nVar;
    }

    public q n() {
        q qVar;
        if (this.f371k != null) {
            return this.f371k;
        }
        synchronized (this) {
            if (this.f371k == null) {
                this.f371k = new r(this);
            }
            qVar = this.f371k;
        }
        return qVar;
    }

    public t o() {
        t tVar;
        if (this.f373m != null) {
            return this.f373m;
        }
        synchronized (this) {
            if (this.f373m == null) {
                this.f373m = new u(this);
            }
            tVar = this.f373m;
        }
        return tVar;
    }

    public h.v.a.c a(h.s.a aVar) {
        i iVar = new i(aVar, new a(11), "cf029002fffdcadf079e8d0a1c9a70ac", "8aff2efc47fafe870c738f727dfcfc6e");
        Context context = aVar.f2154b;
        String str = aVar.c;
        if (context != null) {
            return aVar.a.a(new c.b(context, str, iVar, false));
        }
        throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
    }
}
