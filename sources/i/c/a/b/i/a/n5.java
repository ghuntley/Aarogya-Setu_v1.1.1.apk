package i.c.a.b.i.a;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.crashlytics.android.answers.PurchaseEvent;
import com.google.android.gms.internal.measurement.zzfo;
import h.e.a;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.a0;
import i.c.a.b.g.g.b0;
import i.c.a.b.g.g.c0;
import i.c.a.b.g.g.e0;
import i.c.a.b.g.g.e8;
import i.c.a.b.g.g.i0;
import i.c.a.b.g.g.j0;
import i.c.a.b.g.g.k0;
import i.c.a.b.g.g.w3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class n5 extends r9 implements ra {
    public final Map<String, Map<String, String>> d = new a();
    public final Map<String, Map<String, Boolean>> e = new a();

    /* renamed from: f  reason: collision with root package name */
    public final Map<String, Map<String, Boolean>> f3783f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, j0> f3784g = new a();

    /* renamed from: h  reason: collision with root package name */
    public final Map<String, Map<String, Integer>> f3785h = new a();

    /* renamed from: i  reason: collision with root package name */
    public final Map<String, String> f3786i = new a();

    public n5(t9 t9Var) {
        super(t9Var);
    }

    public final j0 a(String str) {
        m();
        c();
        q.b(str);
        f(str);
        return this.f3784g.get(str);
    }

    public final boolean b(String str) {
        c();
        j0 a = a(str);
        if (a == null) {
            return false;
        }
        return a.zzk;
    }

    public final boolean c(String str, String str2) {
        Boolean bool;
        c();
        f(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (e8.b() && this.a.f3861g.a(o.f1) && (PurchaseEvent.TYPE.equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = this.f3783f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final int d(String str, String str2) {
        Integer num;
        c();
        f(str);
        Map map = this.f3785h.get(str);
        if (map == null || (num = (Integer) map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    public final boolean e(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.String r12) {
        /*
            r11 = this;
            r11.m()
            r11.c()
            i.c.a.b.d.l.q.b((java.lang.String) r12)
            java.util.Map<java.lang.String, i.c.a.b.g.g.j0> r0 = r11.f3784g
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto L_0x00da
            i.c.a.b.i.a.d r0 = r11.r()
            r1 = 0
            if (r0 == 0) goto L_0x00d9
            i.c.a.b.d.l.q.b((java.lang.String) r12)
            r0.c()
            r0.m()
            android.database.sqlite.SQLiteDatabase r2 = r0.u()     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            java.lang.String r3 = "apps"
            java.lang.String r4 = "remote_config"
            java.lang.String[] r4 = new java.lang.String[]{r4}     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            java.lang.String r5 = "app_id=?"
            r6 = 1
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            r10 = 0
            r6[r10] = r12     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0063 }
            if (r3 != 0) goto L_0x0046
            r2.close()
            goto L_0x007e
        L_0x0046:
            byte[] r3 = r2.getBlob(r10)     // Catch:{ SQLiteException -> 0x0063 }
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0063 }
            if (r4 == 0) goto L_0x005f
            i.c.a.b.i.a.m4 r4 = r0.n()     // Catch:{ SQLiteException -> 0x0063 }
            i.c.a.b.i.a.o4 r4 = r4.f3758f     // Catch:{ SQLiteException -> 0x0063 }
            java.lang.String r5 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r6 = i.c.a.b.i.a.m4.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x0063 }
            r4.a(r5, r6)     // Catch:{ SQLiteException -> 0x0063 }
        L_0x005f:
            r2.close()
            goto L_0x007f
        L_0x0063:
            r3 = move-exception
            goto L_0x006a
        L_0x0065:
            r12 = move-exception
            goto L_0x00d3
        L_0x0067:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x006a:
            i.c.a.b.i.a.m4 r0 = r0.n()     // Catch:{ all -> 0x00d1 }
            i.c.a.b.i.a.o4 r0 = r0.f3758f     // Catch:{ all -> 0x00d1 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = i.c.a.b.i.a.m4.a((java.lang.String) r12)     // Catch:{ all -> 0x00d1 }
            r0.a(r4, r5, r3)     // Catch:{ all -> 0x00d1 }
            if (r2 == 0) goto L_0x007e
            r2.close()
        L_0x007e:
            r3 = r1
        L_0x007f:
            if (r3 != 0) goto L_0x00a0
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r0 = r11.d
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r11.e
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Boolean>> r0 = r11.f3783f
            r0.put(r12, r1)
            java.util.Map<java.lang.String, i.c.a.b.g.g.j0> r0 = r11.f3784g
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.f3786i
            r0.put(r12, r1)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>> r0 = r11.f3785h
            r0.put(r12, r1)
            return
        L_0x00a0:
            i.c.a.b.g.g.j0 r0 = r11.a((java.lang.String) r12, (byte[]) r3)
            i.c.a.b.g.g.w3$b r0 = r0.j()
            i.c.a.b.g.g.j0$a r0 = (i.c.a.b.g.g.j0.a) r0
            r11.a((java.lang.String) r12, (i.c.a.b.g.g.j0.a) r0)
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>> r2 = r11.d
            i.c.a.b.g.g.f5 r3 = r0.k()
            i.c.a.b.g.g.w3 r3 = (i.c.a.b.g.g.w3) r3
            i.c.a.b.g.g.j0 r3 = (i.c.a.b.g.g.j0) r3
            java.util.Map r3 = a((i.c.a.b.g.g.j0) r3)
            r2.put(r12, r3)
            java.util.Map<java.lang.String, i.c.a.b.g.g.j0> r2 = r11.f3784g
            i.c.a.b.g.g.f5 r0 = r0.k()
            i.c.a.b.g.g.w3 r0 = (i.c.a.b.g.g.w3) r0
            i.c.a.b.g.g.j0 r0 = (i.c.a.b.g.g.j0) r0
            r2.put(r12, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r11.f3786i
            r0.put(r12, r1)
            goto L_0x00da
        L_0x00d1:
            r12 = move-exception
            r1 = r2
        L_0x00d3:
            if (r1 == 0) goto L_0x00d8
            r1.close()
        L_0x00d8:
            throw r12
        L_0x00d9:
            throw r1
        L_0x00da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.n5.f(java.lang.String):void");
    }

    public final boolean p() {
        return false;
    }

    public final boolean b(String str, String str2) {
        Boolean bool;
        c();
        f(str);
        if ("1".equals(a(str, "measurement.upload.blacklist_internal")) && ca.i(str2)) {
            return true;
        }
        if ("1".equals(a(str, "measurement.upload.blacklist_public")) && ca.h(str2)) {
            return true;
        }
        Map map = this.e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final j0 a(String str, byte[] bArr) {
        if (bArr == null) {
            return j0.zzl;
        }
        try {
            j0 j0Var = (j0) ((w3) ((j0.a) x9.a((j0.a) j0.zzl.i(), bArr)).k());
            o4 o4Var = n().f3766n;
            boolean z = true;
            String str2 = null;
            Long valueOf = (j0Var.zzc & 1) != 0 ? Long.valueOf(j0Var.zzd) : null;
            if ((j0Var.zzc & 2) == 0) {
                z = false;
            }
            if (z) {
                str2 = j0Var.zze;
            }
            o4Var.a("Parsed config. version, gmp_app_id", valueOf, str2);
            return j0Var;
        } catch (zzfo e2) {
            n().f3761i.a("Unable to merge remote config. appId", m4.a(str), e2);
            return j0.zzl;
        } catch (RuntimeException e3) {
            n().f3761i.a("Unable to merge remote config. appId", m4.a(str), e3);
            return j0.zzl;
        }
    }

    public final boolean d(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    public final long c(String str) {
        String a = a(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(a)) {
            return 0;
        }
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException e2) {
            n().f3761i.a("Unable to parse timezone offset. appId", m4.a(str), e2);
            return 0;
        }
    }

    public final String a(String str, String str2) {
        c();
        f(str);
        Map map = this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public static Map<String, String> a(j0 j0Var) {
        a aVar = new a();
        if (j0Var != null) {
            for (k0 next : j0Var.zzg) {
                aVar.put(next.zzd, next.zze);
            }
        }
        return aVar;
    }

    public final void a(String str, j0.a aVar) {
        a aVar2 = new a();
        a aVar3 = new a();
        a aVar4 = new a();
        if (aVar != null) {
            for (int i2 = 0; i2 < ((j0) aVar.f3512f).zzh.size(); i2++) {
                i0.a aVar5 = (i0.a) ((j0) aVar.f3512f).zzh.get(i2).j();
                if (TextUtils.isEmpty(aVar5.a())) {
                    n().f3761i.a("EventConfig contained null event name");
                } else {
                    String a = q.a(aVar5.a(), o6.a, o6.f3816b);
                    if (!TextUtils.isEmpty(a)) {
                        if (aVar5.f3513g) {
                            aVar5.i();
                            aVar5.f3513g = false;
                        }
                        i0.a((i0) aVar5.f3512f, a);
                        if (aVar.f3513g) {
                            aVar.i();
                            aVar.f3513g = false;
                        }
                        j0.a((j0) aVar.f3512f, i2, (i0) ((w3) aVar5.k()));
                    }
                    aVar2.put(aVar5.a(), Boolean.valueOf(((i0) aVar5.f3512f).zze));
                    aVar3.put(aVar5.a(), Boolean.valueOf(((i0) aVar5.f3512f).zzf));
                    if ((((i0) aVar5.f3512f).zzc & 8) != 0) {
                        if (aVar5.l() < 2 || aVar5.l() > 65535) {
                            n().f3761i.a("Invalid sampling rate. Event name, sample rate", aVar5.a(), Integer.valueOf(aVar5.l()));
                        } else {
                            aVar4.put(aVar5.a(), Integer.valueOf(aVar5.l()));
                        }
                    }
                }
            }
        }
        this.e.put(str, aVar2);
        this.f3783f.put(str, aVar3);
        this.f3785h.put(str, aVar4);
    }

    public final boolean a(String str, byte[] bArr, String str2) {
        byte[] bArr2;
        boolean z;
        String str3;
        boolean z2;
        boolean z3;
        String str4 = str;
        m();
        c();
        q.b(str);
        j0.a aVar = (j0.a) a(str, bArr).j();
        if (aVar == null) {
            return false;
        }
        a(str4, aVar);
        this.f3784g.put(str4, (j0) ((w3) aVar.k()));
        this.f3786i.put(str4, str2);
        this.d.put(str4, a((j0) ((w3) aVar.k())));
        d r = r();
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((j0) aVar.f3512f).zzi));
        if (r != null) {
            String str5 = "app_id=? and audience_id=?";
            q.a(arrayList);
            int i2 = 0;
            while (i2 < arrayList.size()) {
                a0.a aVar2 = (a0.a) ((a0) arrayList.get(i2)).j();
                if (((a0) aVar2.f3512f).zzf.size() != 0) {
                    int i3 = 0;
                    while (i3 < ((a0) aVar2.f3512f).zzf.size()) {
                        b0.a aVar3 = (b0.a) ((a0) aVar2.f3512f).zzf.get(i3).j();
                        b0.a aVar4 = (b0.a) ((w3.b) aVar3.clone());
                        String a = q.a(((b0) aVar3.f3512f).zze, o6.a, o6.f3816b);
                        if (a != null) {
                            if (aVar4.f3513g) {
                                aVar4.i();
                                aVar4.f3513g = false;
                            }
                            b0.a((b0) aVar4.f3512f, a);
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        int i4 = 0;
                        while (i4 < ((b0) aVar3.f3512f).zzf.size()) {
                            c0 c0Var = ((b0) aVar3.f3512f).zzf.get(i4);
                            b0.a aVar5 = aVar3;
                            j0.a aVar6 = aVar;
                            String str6 = str5;
                            String a2 = q.a(c0Var.zzg, q6.a, q6.f3846b);
                            if (a2 != null) {
                                c0.a aVar7 = (c0.a) c0Var.j();
                                if (aVar7.f3513g) {
                                    aVar7.i();
                                    aVar7.f3513g = false;
                                }
                                c0.a((c0) aVar7.f3512f, a2);
                                c0 c0Var2 = (c0) ((w3) aVar7.k());
                                if (aVar4.f3513g) {
                                    aVar4.i();
                                    aVar4.f3513g = false;
                                }
                                b0.a((b0) aVar4.f3512f, i4, c0Var2);
                                z3 = true;
                            }
                            i4++;
                            aVar3 = aVar5;
                            aVar = aVar6;
                            str5 = str6;
                        }
                        j0.a aVar8 = aVar;
                        String str7 = str5;
                        if (z3) {
                            if (aVar2.f3513g) {
                                aVar2.i();
                                aVar2.f3513g = false;
                            }
                            a0.a((a0) aVar2.f3512f, i3, (b0) ((w3) aVar4.k()));
                            arrayList.set(i2, (a0) ((w3) aVar2.k()));
                        }
                        i3++;
                        aVar = aVar8;
                        str5 = str7;
                    }
                }
                j0.a aVar9 = aVar;
                String str8 = str5;
                if (((a0) aVar2.f3512f).zze.size() != 0) {
                    for (int i5 = 0; i5 < ((a0) aVar2.f3512f).zze.size(); i5++) {
                        e0 e0Var = ((a0) aVar2.f3512f).zze.get(i5);
                        String a3 = q.a(e0Var.zze, p6.a, p6.f3831b);
                        if (a3 != null) {
                            e0.a aVar10 = (e0.a) e0Var.j();
                            if (aVar10.f3513g) {
                                aVar10.i();
                                z2 = false;
                                aVar10.f3513g = false;
                            } else {
                                z2 = false;
                            }
                            e0.a((e0) aVar10.f3512f, a3);
                            if (aVar2.f3513g) {
                                aVar2.i();
                                aVar2.f3513g = z2;
                            }
                            a0.a((a0) aVar2.f3512f, i5, (e0) ((w3) aVar10.k()));
                            arrayList.set(i2, (a0) ((w3) aVar2.k()));
                        }
                    }
                }
                i2++;
                aVar = aVar9;
                str5 = str8;
            }
            j0.a aVar11 = aVar;
            String str9 = str5;
            r.m();
            r.c();
            q.b(str);
            q.a(arrayList);
            SQLiteDatabase u = r.u();
            u.beginTransaction();
            try {
                r.m();
                r.c();
                q.b(str);
                SQLiteDatabase u2 = r.u();
                u2.delete("property_filters", "app_id=?", new String[]{str4});
                u2.delete("event_filters", "app_id=?", new String[]{str4});
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    a0 a0Var = (a0) it.next();
                    r.m();
                    r.c();
                    q.b(str);
                    q.a(a0Var);
                    if (!((a0Var.zzc & 1) != 0)) {
                        r.n().f3761i.a("Audience with no ID. appId", m4.a(str));
                    } else {
                        int i6 = a0Var.zzd;
                        Iterator<b0> it2 = a0Var.zzf.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (!it2.next().a()) {
                                    r.n().f3761i.a("Event filter with no ID. Audience definition ignored. appId, audienceId", m4.a(str), Integer.valueOf(i6));
                                    break;
                                }
                            } else {
                                Iterator<e0> it3 = a0Var.zze.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        if (!it3.next().a()) {
                                            r.n().f3761i.a("Property filter with no ID. Audience definition ignored. appId, audienceId", m4.a(str), Integer.valueOf(i6));
                                            break;
                                        }
                                    } else {
                                        Iterator<b0> it4 = a0Var.zzf.iterator();
                                        while (true) {
                                            if (it4.hasNext()) {
                                                if (!r.a(str4, i6, it4.next())) {
                                                    z = false;
                                                    break;
                                                }
                                            } else {
                                                z = true;
                                                break;
                                            }
                                        }
                                        if (z) {
                                            Iterator<e0> it5 = a0Var.zze.iterator();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    if (!r.a(str4, i6, it5.next())) {
                                                        z = false;
                                                        break;
                                                    }
                                                } else {
                                                    break;
                                                }
                                            }
                                        }
                                        if (!z) {
                                            r.m();
                                            r.c();
                                            q.b(str);
                                            SQLiteDatabase u3 = r.u();
                                            str3 = str9;
                                            u3.delete("property_filters", str3, new String[]{str4, String.valueOf(i6)});
                                            u3.delete("event_filters", str3, new String[]{str4, String.valueOf(i6)});
                                        } else {
                                            str3 = str9;
                                        }
                                        str9 = str3;
                                    }
                                }
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    a0 a0Var2 = (a0) it6.next();
                    arrayList2.add((a0Var2.zzc & 1) != 0 ? Integer.valueOf(a0Var2.zzd) : null);
                }
                r.a(str4, (List<Integer>) arrayList2);
                u.setTransactionSuccessful();
                u.endTransaction();
                j0.a aVar12 = aVar11;
                try {
                    if (aVar12.f3513g) {
                        aVar12.i();
                        aVar12.f3513g = false;
                    }
                    j0.a((j0) aVar12.f3512f);
                    bArr2 = ((j0) ((w3) aVar12.k())).f();
                } catch (RuntimeException e2) {
                    n().f3761i.a("Unable to serialize reduced-size config. Storing full config instead. appId", m4.a(str), e2);
                    bArr2 = bArr;
                }
                d r2 = r();
                q.b(str);
                r2.c();
                r2.m();
                ContentValues contentValues = new ContentValues();
                contentValues.put("remote_config", bArr2);
                try {
                    if (((long) r2.u().update("apps", contentValues, "app_id = ?", new String[]{str4})) == 0) {
                        r2.n().f3758f.a("Failed to update remote config (got 0). appId", m4.a(str));
                    }
                } catch (SQLiteException e3) {
                    r2.n().f3758f.a("Error storing remote config. appId", m4.a(str), e3);
                }
                this.f3784g.put(str4, (j0) ((w3) aVar12.k()));
                return true;
            } catch (Throwable th) {
                u.endTransaction();
                throw th;
            }
        } else {
            throw null;
        }
    }
}
