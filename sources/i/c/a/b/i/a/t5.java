package i.c.a.b.i.a;

import android.os.Binder;
import android.text.TextUtils;
import com.crashlytics.android.answers.RetryManager;
import i.c.a.b.d.g;
import i.c.a.b.d.h;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.k9;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class t5 extends h4 {
    public final t9 a;

    /* renamed from: b  reason: collision with root package name */
    public Boolean f3879b;
    public String c = null;

    public t5(t9 t9Var) {
        q.a(t9Var);
        this.a = t9Var;
    }

    public final void a(ea eaVar) {
        e(eaVar);
        a((Runnable) new w5(this, eaVar));
    }

    public final void b(ea eaVar) {
        a(eaVar.e, false);
        a((Runnable) new d6(this, eaVar));
    }

    public final void c(ea eaVar) {
        e(eaVar);
        a((Runnable) new j6(this, eaVar));
    }

    public final String d(ea eaVar) {
        e(eaVar);
        t9 t9Var = this.a;
        try {
            return (String) ((FutureTask) t9Var.f3896i.k().a(new w9(t9Var, eaVar))).get(30000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            t9Var.f3896i.n().f3758f.a("Failed to get app instance id. appId", m4.a(eaVar.e), e);
            return null;
        }
    }

    public final void e(ea eaVar) {
        q.a(eaVar);
        a(eaVar.e, false);
        this.a.f3896i.p().a(eaVar.f3649f, eaVar.v, eaVar.z);
    }

    public final void a(m mVar, ea eaVar) {
        q.a(mVar);
        e(eaVar);
        a((Runnable) new b6(this, mVar, eaVar));
    }

    public final void a(m mVar, String str, String str2) {
        q.a(mVar);
        q.b(str);
        a(str, true);
        a((Runnable) new f6(this, mVar, str));
    }

    public final byte[] a(m mVar, String str) {
        q.b(str);
        q.a(mVar);
        a(str, true);
        this.a.n().f3765m.a("Log and bundle. event", this.a.g().a(mVar.e));
        if (((c) this.a.f3896i.f3868n) != null) {
            long nanoTime = System.nanoTime() / RetryManager.NANOSECONDS_IN_MS;
            m5 k2 = this.a.k();
            e6 e6Var = new e6(this, mVar, str);
            k2.o();
            q.a(e6Var);
            q5 q5Var = new q5(k2, e6Var, true, "Task exception on worker thread");
            if (Thread.currentThread() == k2.c) {
                q5Var.run();
            } else {
                k2.a((q5<?>) q5Var);
            }
            try {
                byte[] bArr = (byte[]) q5Var.get();
                if (bArr == null) {
                    this.a.n().f3758f.a("Log and bundle returned null. appId", m4.a(str));
                    bArr = new byte[0];
                }
                if (((c) this.a.f3896i.f3868n) != null) {
                    this.a.n().f3765m.a("Log and bundle processed. event, size, time_ms", this.a.g().a(mVar.e), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / RetryManager.NANOSECONDS_IN_MS) - nanoTime));
                    return bArr;
                }
                throw null;
            } catch (InterruptedException | ExecutionException e) {
                this.a.n().f3758f.a("Failed to log and bundle. appId, event, error", m4.a(str), this.a.g().a(mVar.e), e);
                return null;
            }
        } else {
            throw null;
        }
    }

    public final void a(aa aaVar, ea eaVar) {
        q.a(aaVar);
        e(eaVar);
        a((Runnable) new h6(this, aaVar, eaVar));
    }

    public final List<aa> a(ea eaVar, boolean z) {
        e(eaVar);
        try {
            List<da> list = (List) ((FutureTask) this.a.k().a(new g6(this, eaVar))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (da daVar : list) {
                if (z || !ca.i(daVar.c)) {
                    arrayList.add(new aa(daVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (!k9.b() || !this.a.f3896i.f3861g.d(eaVar.e, o.Z0)) {
                this.a.n().f3758f.a("Failed to get user attributes. appId", m4.a(eaVar.e), e);
                return null;
            }
            this.a.n().f3758f.a("Failed to get user properties. appId", m4.a(eaVar.e), e);
            return null;
        }
    }

    public final void a(String str, boolean z) {
        boolean z2;
        if (!TextUtils.isEmpty(str)) {
            if (z) {
                try {
                    if (this.f3879b == null) {
                        if (!"com.google.android.gms".equals(this.c) && !q.a(this.a.f3896i.a, Binder.getCallingUid())) {
                            if (!h.a(this.a.f3896i.a).a(Binder.getCallingUid())) {
                                z2 = false;
                                this.f3879b = Boolean.valueOf(z2);
                            }
                        }
                        z2 = true;
                        this.f3879b = Boolean.valueOf(z2);
                    }
                    if (this.f3879b.booleanValue()) {
                        return;
                    }
                } catch (SecurityException e) {
                    this.a.n().f3758f.a("Measurement Service called with invalid calling package. appId", m4.a(str));
                    throw e;
                }
            }
            if (this.c == null && g.uidHasPackageName(this.a.f3896i.a, Binder.getCallingUid(), str)) {
                this.c = str;
            }
            if (!str.equals(this.c)) {
                throw new SecurityException(String.format("Unknown calling package name '%s'.", new Object[]{str}));
            }
            return;
        }
        this.a.n().f3758f.a("Measurement Service called without app package");
        throw new SecurityException("Measurement Service called without app package");
    }

    public final void a(long j2, String str, String str2, String str3) {
        a((Runnable) new i6(this, str2, str3, str, j2));
    }

    public final void a(na naVar, ea eaVar) {
        q.a(naVar);
        q.a(naVar.f3792g);
        e(eaVar);
        na naVar2 = new na(naVar);
        naVar2.e = eaVar.e;
        a((Runnable) new l6(this, naVar2, eaVar));
    }

    public final void a(na naVar) {
        q.a(naVar);
        q.a(naVar.f3792g);
        a(naVar.e, true);
        a((Runnable) new v5(this, new na(naVar)));
    }

    public final List<aa> a(String str, String str2, boolean z, ea eaVar) {
        e(eaVar);
        try {
            List<da> list = (List) ((FutureTask) this.a.k().a(new y5(this, eaVar, str, str2))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (da daVar : list) {
                if (z || !ca.i(daVar.c)) {
                    arrayList.add(new aa(daVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (!k9.b() || !this.a.f3896i.f3861g.d(eaVar.e, o.Z0)) {
                this.a.n().f3758f.a("Failed to get user attributes. appId", m4.a(eaVar.e), e);
            } else {
                this.a.n().f3758f.a("Failed to query user properties. appId", m4.a(eaVar.e), e);
            }
            return Collections.emptyList();
        }
    }

    public final List<aa> a(String str, String str2, String str3, boolean z) {
        a(str, true);
        try {
            List<da> list = (List) ((FutureTask) this.a.k().a(new x5(this, str, str2, str3))).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (da daVar : list) {
                if (z || !ca.i(daVar.c)) {
                    arrayList.add(new aa(daVar));
                }
            }
            return arrayList;
        } catch (InterruptedException | ExecutionException e) {
            if (!k9.b() || !this.a.f3896i.f3861g.d(str, o.Z0)) {
                this.a.n().f3758f.a("Failed to get user attributes. appId", m4.a(str), e);
            } else {
                this.a.n().f3758f.a("Failed to get user properties as. appId", m4.a(str), e);
            }
            return Collections.emptyList();
        }
    }

    public final List<na> a(String str, String str2, ea eaVar) {
        e(eaVar);
        try {
            return (List) ((FutureTask) this.a.k().a(new a6(this, eaVar, str, str2))).get();
        } catch (InterruptedException | ExecutionException e) {
            this.a.n().f3758f.a("Failed to get conditional user properties", e);
            return Collections.emptyList();
        }
    }

    public final List<na> a(String str, String str2, String str3) {
        a(str, true);
        try {
            return (List) ((FutureTask) this.a.k().a(new z5(this, str, str2, str3))).get();
        } catch (InterruptedException | ExecutionException e) {
            if (!k9.b() || !this.a.f3896i.f3861g.d(str, o.Z0)) {
                this.a.n().f3758f.a("Failed to get conditional user properties", e);
            } else {
                this.a.n().f3758f.a("Failed to get conditional user properties as", e);
            }
            return Collections.emptyList();
        }
    }

    public final void a(Runnable runnable) {
        q.a(runnable);
        if (this.a.k().t()) {
            runnable.run();
            return;
        }
        m5 k2 = this.a.k();
        k2.o();
        q.a(runnable);
        k2.a((q5<?>) new q5(k2, runnable, "Task exception on worker thread"));
    }
}
