package h.a0.x;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

/* compiled from: WorkDatabaseMigrations */
public class h {
    public static h.s.m.a a = new a(1, 2);

    /* renamed from: b  reason: collision with root package name */
    public static h.s.m.a f952b = new b(3, 4);
    public static h.s.m.a c = new c(4, 5);
    public static h.s.m.a d = new d(6, 7);
    public static h.s.m.a e = new e(7, 8);

    /* renamed from: f  reason: collision with root package name */
    public static h.s.m.a f953f = new f(8, 9);

    /* compiled from: WorkDatabaseMigrations */
    public static class a extends h.s.m.a {
        public a(int i2, int i3) {
            super(i2, i3);
        }

        public void a(h.v.a.b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            h.v.a.f.a aVar = (h.v.a.f.a) bVar;
            aVar.e.execSQL("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            aVar.e.execSQL("DROP TABLE IF EXISTS alarmInfo");
            aVar.e.execSQL("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class b extends h.s.m.a {
        public b(int i2, int i3) {
            super(i2, i3);
        }

        public void a(h.v.a.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                ((h.v.a.f.a) bVar).e.execSQL("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class c extends h.s.m.a {
        public c(int i2, int i3) {
            super(i2, i3);
        }

        public void a(h.v.a.b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            ((h.v.a.f.a) bVar).e.execSQL("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class d extends h.s.m.a {
        public d(int i2, int i3) {
            super(i2, i3);
        }

        public void a(h.v.a.b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class e extends h.s.m.a {
        public e(int i2, int i3) {
            super(i2, i3);
        }

        public void a(h.v.a.b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class f extends h.s.m.a {
        public f(int i2, int i3) {
            super(i2, i3);
        }

        public void a(h.v.a.b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    /* compiled from: WorkDatabaseMigrations */
    public static class g extends h.s.m.a {
        public final Context c;

        public g(Context context, int i2, int i3) {
            super(i2, i3);
            this.c = context;
        }

        public void a(h.v.a.b bVar) {
            if (this.f2216b >= 10) {
                ((h.v.a.f.a) bVar).e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
                return;
            }
            this.c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }

    /* renamed from: h.a0.x.h$h  reason: collision with other inner class name */
    /* compiled from: WorkDatabaseMigrations */
    public static class C0027h extends h.s.m.a {
        public final Context c;

        public C0027h(Context context) {
            super(9, 10);
            this.c = context;
        }

        public void a(h.v.a.b bVar) {
            ((h.v.a.f.a) bVar).e.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            SharedPreferences sharedPreferences = this.c.getSharedPreferences("androidx.work.util.preferences", 0);
            if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                long j2 = 0;
                long j3 = sharedPreferences.getLong("last_cancel_all_time_ms", 0);
                if (sharedPreferences.getBoolean("reschedule_needed", false)) {
                    j2 = 1;
                }
                h.v.a.f.a aVar = (h.v.a.f.a) bVar;
                aVar.e.beginTransaction();
                try {
                    ((h.v.a.f.a) bVar).e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j3)});
                    ((h.v.a.f.a) bVar).e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j2)});
                    sharedPreferences.edit().clear().apply();
                    ((h.v.a.f.a) bVar).e.setTransactionSuccessful();
                } finally {
                    aVar.e.endTransaction();
                }
            }
            SharedPreferences sharedPreferences2 = this.c.getSharedPreferences("androidx.work.util.id", 0);
            if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                int i2 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                int i3 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                h.v.a.f.a aVar2 = (h.v.a.f.a) bVar;
                aVar2.e.beginTransaction();
                try {
                    ((h.v.a.f.a) bVar).e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i2)});
                    ((h.v.a.f.a) bVar).e.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i3)});
                    sharedPreferences2.edit().clear().apply();
                    ((h.v.a.f.a) bVar).e.setTransactionSuccessful();
                } finally {
                    aVar2.e.endTransaction();
                }
            }
        }
    }
}
