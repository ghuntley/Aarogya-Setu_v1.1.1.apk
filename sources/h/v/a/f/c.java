package h.v.a.f;

import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import h.s.i;
import h.v.a.b;
import h.v.a.c;
import java.io.File;

/* compiled from: FrameworkSQLiteOpenHelper */
public class c implements h.v.a.c {
    public final Context e;

    /* renamed from: f  reason: collision with root package name */
    public final String f2245f;

    /* renamed from: g  reason: collision with root package name */
    public final c.a f2246g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2247h;

    /* renamed from: i  reason: collision with root package name */
    public final Object f2248i = new Object();

    /* renamed from: j  reason: collision with root package name */
    public a f2249j;

    /* renamed from: k  reason: collision with root package name */
    public boolean f2250k;

    public c(Context context, String str, c.a aVar, boolean z) {
        this.e = context;
        this.f2245f = str;
        this.f2246g = aVar;
        this.f2247h = z;
    }

    public final a a() {
        a aVar;
        synchronized (this.f2248i) {
            if (this.f2249j == null) {
                a[] aVarArr = new a[1];
                if (Build.VERSION.SDK_INT < 23 || this.f2245f == null || !this.f2247h) {
                    this.f2249j = new a(this.e, this.f2245f, aVarArr, this.f2246g);
                } else {
                    this.f2249j = new a(this.e, new File(this.e.getNoBackupFilesDir(), this.f2245f).getAbsolutePath(), aVarArr, this.f2246g);
                }
                this.f2249j.setWriteAheadLoggingEnabled(this.f2250k);
            }
            aVar = this.f2249j;
        }
        return aVar;
    }

    public void close() {
        a().close();
    }

    public String getDatabaseName() {
        return this.f2245f;
    }

    public b getWritableDatabase() {
        return a().a();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f2248i) {
            if (this.f2249j != null) {
                this.f2249j.setWriteAheadLoggingEnabled(z);
            }
            this.f2250k = z;
        }
    }

    /* compiled from: FrameworkSQLiteOpenHelper */
    public static class a extends SQLiteOpenHelper {
        public final a[] e;

        /* renamed from: f  reason: collision with root package name */
        public final c.a f2251f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f2252g;

        /* renamed from: h.v.a.f.c$a$a  reason: collision with other inner class name */
        /* compiled from: FrameworkSQLiteOpenHelper */
        public class C0071a implements DatabaseErrorHandler {
            public final /* synthetic */ c.a a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ a[] f2253b;

            public C0071a(c.a aVar, a[] aVarArr) {
                this.a = aVar;
                this.f2253b = aVarArr;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
                if (r1 != null) goto L_0x0040;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0040, code lost:
                r5 = r1.iterator();
             */
            /* JADX WARNING: Code restructure failed: missing block: B:13:0x0048, code lost:
                if (r5.hasNext() != false) goto L_0x004a;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:14:0x004a, code lost:
                r0.a((java.lang.String) r5.next().second);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
                r0.a(r5.a());
             */
            /* JADX WARNING: Code restructure failed: missing block: B:16:0x005f, code lost:
                throw r2;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0038, code lost:
                r2 = move-exception;
             */
            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x003a */
            /* JADX WARNING: Removed duplicated region for block: B:19:0x0063  */
            /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
            /* JADX WARNING: Removed duplicated region for block: B:7:0x0038 A[ExcHandler: all (r2v5 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r1 
  PHI: (r1v8 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r1v1 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r1v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:5:0x0031, B:8:0x003a, B:9:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:5:0x0031] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onCorruption(android.database.sqlite.SQLiteDatabase r5) {
                /*
                    r4 = this;
                    h.v.a.c$a r0 = r4.a
                    h.v.a.f.a[] r1 = r4.f2253b
                    h.v.a.f.a r5 = h.v.a.f.c.a.a(r1, r5)
                    r1 = 0
                    if (r0 == 0) goto L_0x0083
                    java.lang.String r2 = "Corruption reported by sqlite on database: "
                    java.lang.StringBuilder r2 = i.a.a.a.a.a(r2)
                    java.lang.String r3 = r5.a()
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    java.lang.String r3 = "SupportSQLite"
                    android.util.Log.e(r3, r2)
                    android.database.sqlite.SQLiteDatabase r2 = r5.e
                    boolean r2 = r2.isOpen()
                    if (r2 != 0) goto L_0x0031
                    java.lang.String r5 = r5.a()
                    r0.a(r5)
                    goto L_0x0082
                L_0x0031:
                    android.database.sqlite.SQLiteDatabase r2 = r5.e     // Catch:{ SQLiteException -> 0x003a, all -> 0x0038 }
                    java.util.List r1 = r2.getAttachedDbs()     // Catch:{ SQLiteException -> 0x003a, all -> 0x0038 }
                    goto L_0x003a
                L_0x0038:
                    r2 = move-exception
                    goto L_0x003e
                L_0x003a:
                    r5.close()     // Catch:{ IOException -> 0x0060, all -> 0x0038 }
                    goto L_0x0061
                L_0x003e:
                    if (r1 == 0) goto L_0x0058
                    java.util.Iterator r5 = r1.iterator()
                L_0x0044:
                    boolean r1 = r5.hasNext()
                    if (r1 == 0) goto L_0x005f
                    java.lang.Object r1 = r5.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.a(r1)
                    goto L_0x0044
                L_0x0058:
                    java.lang.String r5 = r5.a()
                    r0.a(r5)
                L_0x005f:
                    throw r2
                L_0x0060:
                L_0x0061:
                    if (r1 == 0) goto L_0x007b
                    java.util.Iterator r5 = r1.iterator()
                L_0x0067:
                    boolean r1 = r5.hasNext()
                    if (r1 == 0) goto L_0x0082
                    java.lang.Object r1 = r5.next()
                    android.util.Pair r1 = (android.util.Pair) r1
                    java.lang.Object r1 = r1.second
                    java.lang.String r1 = (java.lang.String) r1
                    r0.a(r1)
                    goto L_0x0067
                L_0x007b:
                    java.lang.String r5 = r5.a()
                    r0.a(r5)
                L_0x0082:
                    return
                L_0x0083:
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: h.v.a.f.c.a.C0071a.onCorruption(android.database.sqlite.SQLiteDatabase):void");
            }
        }

        public a(Context context, String str, a[] aVarArr, c.a aVar) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, aVar.a, new C0071a(aVar, aVarArr));
            this.f2251f = aVar;
            this.e = aVarArr;
        }

        public synchronized b a() {
            this.f2252g = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (this.f2252g) {
                close();
                return a();
            }
            return a(writableDatabase);
        }

        public synchronized void close() {
            super.close();
            this.e[0] = null;
        }

        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            c.a aVar = this.f2251f;
            a(this.e, sQLiteDatabase);
            if (((i) aVar) == null) {
                throw null;
            }
        }

        /* JADX INFO: finally extract failed */
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            c.a aVar = this.f2251f;
            a a = a(this.e, sQLiteDatabase);
            i iVar = (i) aVar;
            if (iVar != null) {
                Cursor b2 = a.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
                try {
                    boolean z = false;
                    if (b2.moveToFirst() && b2.getInt(0) == 0) {
                        z = true;
                    }
                    b2.close();
                    iVar.c.a(a);
                    if (!z) {
                        i.b g2 = iVar.c.g(a);
                        if (!g2.a) {
                            StringBuilder a2 = i.a.a.a.a.a("Pre-packaged database has an invalid schema: ");
                            a2.append(g2.f2200b);
                            throw new IllegalStateException(a2.toString());
                        }
                    }
                    iVar.a(a);
                    iVar.c.c(a);
                } catch (Throwable th) {
                    b2.close();
                    throw th;
                }
            } else {
                throw null;
            }
        }

        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f2252g = true;
            ((i) this.f2251f).a(a(this.e, sQLiteDatabase), i2, i3);
        }

        /* JADX INFO: finally extract failed */
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f2252g) {
                c.a aVar = this.f2251f;
                a a = a(this.e, sQLiteDatabase);
                i iVar = (i) aVar;
                if (iVar != null) {
                    Cursor b2 = a.b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
                    try {
                        if (b2.moveToFirst() && b2.getInt(0) != 0) {
                            Cursor a2 = a.a(new h.v.a.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                            try {
                                String string = a2.moveToFirst() ? a2.getString(0) : null;
                                a2.close();
                                if (!iVar.d.equals(string) && !iVar.e.equals(string)) {
                                    throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                                }
                            } catch (Throwable th) {
                                a2.close();
                                throw th;
                            }
                        } else {
                            i.b g2 = iVar.c.g(a);
                            if (g2.a) {
                                iVar.c.e(a);
                                iVar.a(a);
                            } else {
                                StringBuilder a3 = i.a.a.a.a.a("Pre-packaged database has an invalid schema: ");
                                a3.append(g2.f2200b);
                                throw new IllegalStateException(a3.toString());
                            }
                        }
                        iVar.c.d(a);
                        iVar.f2199b = null;
                    } finally {
                        b2.close();
                    }
                } else {
                    throw null;
                }
            }
        }

        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
            this.f2252g = true;
            this.f2251f.a(a(this.e, sQLiteDatabase), i2, i3);
        }

        public a a(SQLiteDatabase sQLiteDatabase) {
            return a(this.e, sQLiteDatabase);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x000c, code lost:
            if ((r1.e == r3) == false) goto L_0x000e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static h.v.a.f.a a(h.v.a.f.a[] r2, android.database.sqlite.SQLiteDatabase r3) {
            /*
                r0 = 0
                r1 = r2[r0]
                if (r1 == 0) goto L_0x000e
                android.database.sqlite.SQLiteDatabase r1 = r1.e
                if (r1 != r3) goto L_0x000b
                r1 = 1
                goto L_0x000c
            L_0x000b:
                r1 = 0
            L_0x000c:
                if (r1 != 0) goto L_0x0015
            L_0x000e:
                h.v.a.f.a r1 = new h.v.a.f.a
                r1.<init>(r3)
                r2[r0] = r1
            L_0x0015:
                r2 = r2[r0]
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: h.v.a.f.c.a.a(h.v.a.f.a[], android.database.sqlite.SQLiteDatabase):h.v.a.f.a");
        }
    }
}
