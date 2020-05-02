package i.c.a.b.i.a;

import android.text.TextUtils;
import android.util.Log;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class m4 extends n6 {
    public char c = 0;
    public long d = -1;
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public final o4 f3758f = new o4(this, 6, false, false);

    /* renamed from: g  reason: collision with root package name */
    public final o4 f3759g = new o4(this, 6, true, false);

    /* renamed from: h  reason: collision with root package name */
    public final o4 f3760h = new o4(this, 6, false, true);

    /* renamed from: i  reason: collision with root package name */
    public final o4 f3761i = new o4(this, 5, false, false);

    /* renamed from: j  reason: collision with root package name */
    public final o4 f3762j = new o4(this, 5, true, false);

    /* renamed from: k  reason: collision with root package name */
    public final o4 f3763k = new o4(this, 5, false, true);

    /* renamed from: l  reason: collision with root package name */
    public final o4 f3764l = new o4(this, 4, false, false);

    /* renamed from: m  reason: collision with root package name */
    public final o4 f3765m = new o4(this, 3, false, false);

    /* renamed from: n  reason: collision with root package name */
    public final o4 f3766n = new o4(this, 2, false, false);

    public m4(s5 s5Var) {
        super(s5Var);
    }

    public static Object a(String str) {
        if (str == null) {
            return null;
        }
        return new q4(str);
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(0, lastIndexOf);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x009c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A() {
        /*
            r10 = this;
            i.c.a.b.i.a.x4 r0 = r10.g()
            i.c.a.b.i.a.b5 r0 = r0.d
            i.c.a.b.i.a.x4 r1 = r0.e
            r1.c()
            i.c.a.b.i.a.x4 r1 = r0.e
            r1.c()
            i.c.a.b.i.a.x4 r1 = r0.e
            android.content.SharedPreferences r1 = r1.t()
            java.lang.String r2 = r0.a
            r3 = 0
            long r1 = r1.getLong(r2, r3)
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L_0x0028
            r0.a()
            r1 = r3
            goto L_0x003b
        L_0x0028:
            i.c.a.b.i.a.x4 r6 = r0.e
            i.c.a.b.i.a.s5 r6 = r6.a
            i.c.a.b.d.o.b r6 = r6.f3868n
            i.c.a.b.d.o.c r6 = (i.c.a.b.d.o.c) r6
            if (r6 == 0) goto L_0x009d
            long r6 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r6
            long r1 = java.lang.Math.abs(r1)
        L_0x003b:
            long r6 = r0.d
            r8 = 1
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0043
            goto L_0x004b
        L_0x0043:
            long r6 = r6 << r8
            int r9 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r9 <= 0) goto L_0x004d
            r0.a()
        L_0x004b:
            r0 = r5
            goto L_0x007b
        L_0x004d:
            i.c.a.b.i.a.x4 r1 = r0.e
            android.content.SharedPreferences r1 = r1.t()
            java.lang.String r2 = r0.c
            java.lang.String r1 = r1.getString(r2, r5)
            i.c.a.b.i.a.x4 r2 = r0.e
            android.content.SharedPreferences r2 = r2.t()
            java.lang.String r6 = r0.f3594b
            long r6 = r2.getLong(r6, r3)
            r0.a()
            if (r1 == 0) goto L_0x0079
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 > 0) goto L_0x006f
            goto L_0x0079
        L_0x006f:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            r0.<init>(r1, r2)
            goto L_0x007b
        L_0x0079:
            android.util.Pair<java.lang.String, java.lang.Long> r0 = i.c.a.b.i.a.x4.C
        L_0x007b:
            if (r0 == 0) goto L_0x009c
            android.util.Pair<java.lang.String, java.lang.Long> r1 = i.c.a.b.i.a.x4.C
            if (r0 != r1) goto L_0x0082
            goto L_0x009c
        L_0x0082:
            java.lang.Object r1 = r0.second
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r1.length()
            int r2 = r2 + r8
            int r2 = i.a.a.a.a.a((java.lang.String) r0, (int) r2)
            java.lang.String r3 = ":"
            java.lang.String r0 = i.a.a.a.a.a((int) r2, (java.lang.String) r1, (java.lang.String) r3, (java.lang.String) r0)
            return r0
        L_0x009c:
            return r5
        L_0x009d:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.m4.A():java.lang.String");
    }

    public final boolean r() {
        return false;
    }

    public final String t() {
        String str;
        String str2;
        synchronized (this) {
            if (this.e == null) {
                if (this.a.d != null) {
                    str2 = this.a.d;
                } else {
                    oa oaVar = this.a.f3861g.a.f3860f;
                    str2 = "FA";
                }
                this.e = str2;
            }
            str = this.e;
        }
        return str;
    }

    public final o4 u() {
        return this.f3758f;
    }

    public final o4 v() {
        return this.f3760h;
    }

    public final o4 w() {
        return this.f3761i;
    }

    public final o4 x() {
        return this.f3763k;
    }

    public final o4 y() {
        return this.f3765m;
    }

    public final o4 z() {
        return this.f3766n;
    }

    public final void a(int i2, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(t(), i2)) {
            Log.println(i2, t(), a(false, str, obj, obj2, obj3));
        }
        if (!z2 && i2 >= 5) {
            q.a(str);
            m5 m5Var = this.a.f3864j;
            if (m5Var == null) {
                a(6, "Scheduler not set. Not logging error/warn");
            } else if (!m5Var.s()) {
                a(6, "Scheduler not initialized. Not logging error/warn");
            } else {
                if (i2 < 0) {
                    i2 = 0;
                }
                p4 p4Var = new p4(this, i2 >= 9 ? 8 : i2, str, obj, obj2, obj3);
                m5Var.o();
                q.a(p4Var);
                m5Var.a((q5<?>) new q5(m5Var, p4Var, "Task exception on worker thread"));
            }
        }
    }

    public final boolean a(int i2) {
        return Log.isLoggable(t(), i2);
    }

    public final void a(int i2, String str) {
        Log.println(i2, t(), str);
    }

    public static String a(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        String a = a(z, obj);
        String a2 = a(z, obj2);
        String a3 = a(z, obj3);
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(a)) {
            sb.append(str2);
            sb.append(a);
            str2 = str3;
        }
        if (!TextUtils.isEmpty(a2)) {
            sb.append(str2);
            sb.append(a2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(a3)) {
            sb.append(str3);
            sb.append(a3);
        }
        return sb.toString();
    }

    public static String a(boolean z, Object obj) {
        String className;
        String str = "";
        if (obj == null) {
            return str;
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf((long) ((Integer) obj).intValue());
        }
        int i2 = 0;
        if (obj instanceof Long) {
            if (!z) {
                return String.valueOf(obj);
            }
            Long l2 = (Long) obj;
            if (Math.abs(l2.longValue()) < 100) {
                return String.valueOf(obj);
            }
            if (String.valueOf(obj).charAt(0) == '-') {
                str = "-";
            }
            String valueOf = String.valueOf(Math.abs(l2.longValue()));
            long round = Math.round(Math.pow(10.0d, (double) (valueOf.length() - 1)));
            long round2 = Math.round(Math.pow(10.0d, (double) valueOf.length()) - 1.0d);
            StringBuilder sb = new StringBuilder(str.length() + str.length() + 43);
            sb.append(str);
            sb.append(round);
            sb.append("...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        } else if (obj instanceof Boolean) {
            return String.valueOf(obj);
        } else {
            if (obj instanceof Throwable) {
                Throwable th = (Throwable) obj;
                StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
                String b2 = b(s5.class.getCanonicalName());
                StackTraceElement[] stackTrace = th.getStackTrace();
                int length = stackTrace.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    StackTraceElement stackTraceElement = stackTrace[i2];
                    if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null && b(className).equals(b2)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                    i2++;
                }
                return sb2.toString();
            } else if (obj instanceof q4) {
                return ((q4) obj).a;
            } else {
                if (z) {
                    return "-";
                }
                return String.valueOf(obj);
            }
        }
    }
}
