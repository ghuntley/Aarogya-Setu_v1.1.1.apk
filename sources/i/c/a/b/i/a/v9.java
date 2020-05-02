package i.c.a.b.i.a;

import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import i.c.a.b.d.o.c;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class v9 implements u4 {
    public final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ t9 f3920b;

    public v9(t9 t9Var, String str) {
        this.f3920b = t9Var;
        this.a = str;
    }

    /* JADX INFO: finally extract failed */
    public final void a(String str, int i2, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        d d;
        t9 t9Var = this.f3920b;
        t9Var.r();
        t9Var.i();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                t9Var.f3904q = false;
                t9Var.a();
                throw th2;
            }
        }
        List<Long> list = t9Var.u;
        t9Var.u = null;
        boolean z = true;
        if ((i2 == 200 || i2 == 204) && th == null) {
            try {
                d5 d5Var = t9Var.f3896i.i().e;
                if (((c) t9Var.f3896i.f3868n) != null) {
                    d5Var.a(System.currentTimeMillis());
                    t9Var.f3896i.i().f3929f.a(0);
                    t9Var.u();
                    t9Var.f3896i.n().f3766n.a("Successful upload. Got network response. code, size", Integer.valueOf(i2), Integer.valueOf(bArr.length));
                    t9Var.d().y();
                    try {
                        for (Long next : list) {
                            try {
                                d = t9Var.d();
                                long longValue = next.longValue();
                                d.c();
                                d.m();
                                if (d.u().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                                    throw new SQLiteException("Deleted fewer rows from queue than expected");
                                }
                            } catch (SQLiteException e) {
                                d.n().f3758f.a("Failed to delete a bundle in a queue table", e);
                                throw e;
                            } catch (SQLiteException e2) {
                                if (t9Var.v == null || !t9Var.v.contains(next)) {
                                    throw e2;
                                }
                            }
                        }
                        t9Var.d().t();
                        t9Var.d().z();
                        t9Var.v = null;
                        if (!t9Var.c().t() || !t9Var.t()) {
                            t9Var.w = -1;
                            t9Var.u();
                        } else {
                            t9Var.m();
                        }
                        t9Var.f3899l = 0;
                    } catch (Throwable th3) {
                        t9Var.d().z();
                        throw th3;
                    }
                } else {
                    throw null;
                }
            } catch (SQLiteException e3) {
                t9Var.f3896i.n().f3758f.a("Database error while trying to delete uploaded bundles", e3);
                if (((c) t9Var.f3896i.f3868n) != null) {
                    t9Var.f3899l = SystemClock.elapsedRealtime();
                    t9Var.f3896i.n().f3766n.a("Disable upload, time", Long.valueOf(t9Var.f3899l));
                } else {
                    throw null;
                }
            }
        } else {
            t9Var.f3896i.n().f3766n.a("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th);
            d5 d5Var2 = t9Var.f3896i.i().f3929f;
            if (((c) t9Var.f3896i.f3868n) != null) {
                d5Var2.a(System.currentTimeMillis());
                if (i2 != 503) {
                    if (i2 != 429) {
                        z = false;
                    }
                }
                if (z) {
                    d5 d5Var3 = t9Var.f3896i.i().f3930g;
                    if (((c) t9Var.f3896i.f3868n) != null) {
                        d5Var3.a(System.currentTimeMillis());
                    } else {
                        throw null;
                    }
                }
                t9Var.d().a(list);
                t9Var.u();
            } else {
                throw null;
            }
        }
        t9Var.f3904q = false;
        t9Var.a();
    }
}
