package i.c.a.b.i.a;

import android.os.Bundle;
import android.text.TextUtils;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import i.a.a.a.a;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.c0;
import i.c.a.b.g.g.d4;
import i.c.a.b.g.g.e0;
import i.c.a.b.g.g.e5;
import i.c.a.b.g.g.e8;
import i.c.a.b.g.g.i3;
import i.c.a.b.g.g.o0;
import i.c.a.b.g.g.o2;
import i.c.a.b.g.g.p0;
import i.c.a.b.g.g.r0;
import i.c.a.b.g.g.t0;
import i.c.a.b.g.g.v0;
import i.c.a.b.g.g.w0;
import i.c.a.b.g.g.w3;
import i.c.a.b.g.g.x0;
import i.c.a.b.g.g.x7;
import i.c.a.b.g.g.y7;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class x9 extends r9 {
    public x9(t9 t9Var) {
        super(t9Var);
    }

    public static r0 b(p0 p0Var, String str) {
        for (r0 next : p0Var.zzd) {
            if (next.zzd.equals(str)) {
                return next;
            }
        }
        return null;
    }

    public final void a(x0.a aVar, Object obj) {
        q.a(obj);
        if (aVar.f3513g) {
            aVar.i();
            aVar.f3513g = false;
        }
        x0 x0Var = (x0) aVar.f3512f;
        x0Var.zzc &= -5;
        x0Var.zzf = x0.zzj.zzf;
        if (aVar.f3513g) {
            aVar.i();
            aVar.f3513g = false;
        }
        x0 x0Var2 = (x0) aVar.f3512f;
        x0Var2.zzc &= -9;
        x0Var2.zzg = 0;
        if (aVar.f3513g) {
            aVar.i();
            aVar.f3513g = false;
        }
        x0 x0Var3 = (x0) aVar.f3512f;
        x0Var3.zzc &= -33;
        x0Var3.zzi = 0.0d;
        if (obj instanceof String) {
            String str = (String) obj;
            if (aVar.f3513g) {
                aVar.i();
                aVar.f3513g = false;
            }
            x0.b((x0) aVar.f3512f, str);
        } else if (obj instanceof Long) {
            aVar.b(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            if (aVar.f3513g) {
                aVar.i();
                aVar.f3513g = false;
            }
            x0 x0Var4 = (x0) aVar.f3512f;
            x0Var4.zzc |= 32;
            x0Var4.zzi = doubleValue;
        } else {
            n().f3758f.a("Ignoring invalid (type) user attribute value", obj);
        }
    }

    public final byte[] c(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            n().f3758f.a("Failed to gzip content", e);
            throw e;
        }
    }

    public final boolean p() {
        return false;
    }

    public final List<Integer> t() {
        Map<String, String> a = o.a(this.f3858b.f3896i.a);
        if (a == null || a.size() == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int intValue = o.P.a(null).intValue();
        Iterator<Map.Entry<String, String>> it = a.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry next = it.next();
            if (((String) next.getKey()).startsWith("measurement.id.")) {
                try {
                    int parseInt = Integer.parseInt((String) next.getValue());
                    if (parseInt != 0) {
                        arrayList.add(Integer.valueOf(parseInt));
                        if (arrayList.size() >= intValue) {
                            n().f3761i.a("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                            break;
                        }
                    } else {
                        continue;
                    }
                } catch (NumberFormatException e) {
                    n().f3761i.a("Experiment ID NumberFormatException", e);
                }
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return arrayList;
    }

    public final byte[] b(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = gZIPInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException e) {
            n().f3758f.a("Failed to ungzip content", e);
            throw e;
        }
    }

    public final boolean a(long j2, long j3) {
        if (j2 == 0 || j3 <= 0) {
            return true;
        }
        if (((c) this.a.f3868n) == null) {
            throw null;
        } else if (Math.abs(System.currentTimeMillis() - j2) > j3) {
            return true;
        } else {
            return false;
        }
    }

    public final void a(r0.a aVar, Object obj) {
        q.a(obj);
        if (aVar.f3513g) {
            aVar.i();
            aVar.f3513g = false;
        }
        r0 r0Var = (r0) aVar.f3512f;
        r0Var.zzc &= -3;
        r0Var.zze = r0.zzj.zze;
        if (aVar.f3513g) {
            aVar.i();
            aVar.f3513g = false;
        }
        r0 r0Var2 = (r0) aVar.f3512f;
        r0Var2.zzc &= -5;
        r0Var2.zzf = 0;
        if (aVar.f3513g) {
            aVar.i();
            aVar.f3513g = false;
        }
        r0 r0Var3 = (r0) aVar.f3512f;
        r0Var3.zzc &= -17;
        r0Var3.zzh = 0.0d;
        if (aVar.f3513g) {
            aVar.i();
            aVar.f3513g = false;
        }
        r0.a((r0) aVar.f3512f);
        if (obj instanceof String) {
            aVar.b((String) obj);
        } else if (obj instanceof Long) {
            aVar.a(((Long) obj).longValue());
        } else if (obj instanceof Double) {
            aVar.a(((Double) obj).doubleValue());
        } else if (!e8.b() || !this.a.f3861g.a(o.c1) || !(obj instanceof Bundle[])) {
            n().f3758f.a("Ignoring invalid (type) event param value", obj);
        } else {
            aVar.a((Iterable<? extends r0>) a((Bundle[]) obj));
        }
    }

    public final Object a(p0 p0Var, String str) {
        r0 b2 = b(p0Var, str);
        if (b2 == null) {
            return null;
        }
        if (b2.l()) {
            return b2.zze;
        }
        if (b2.n()) {
            return Long.valueOf(b2.zzf);
        }
        if (b2.p()) {
            return Double.valueOf(b2.zzh);
        }
        if (!e8.b() || !this.a.f3861g.a(o.c1) || b2.r() <= 0) {
            return null;
        }
        d4<r0> d4Var = b2.zzi;
        ArrayList arrayList = new ArrayList();
        for (r0 next : d4Var) {
            if (next != null) {
                Bundle bundle = new Bundle();
                for (r0 next2 : next.zzi) {
                    if (next2.l()) {
                        bundle.putString(next2.zzd, next2.zze);
                    } else if (next2.n()) {
                        bundle.putLong(next2.zzd, next2.zzf);
                    } else if (next2.p()) {
                        bundle.putDouble(next2.zzd, next2.zzh);
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    public static int a(t0.a aVar, String str) {
        if (aVar == null) {
            return -1;
        }
        for (int i2 = 0; i2 < ((t0) aVar.f3512f).zzg.size(); i2++) {
            if (str.equals(((t0) aVar.f3512f).zzg.get(i2).zze)) {
                return i2;
            }
        }
        return -1;
    }

    public final void a(p0.a aVar, String str, Object obj) {
        List<r0> a = aVar.a();
        int i2 = 0;
        while (true) {
            if (i2 >= a.size()) {
                i2 = -1;
                break;
            } else if (str.equals(a.get(i2).zzd)) {
                break;
            } else {
                i2++;
            }
        }
        r0.a s = r0.s();
        s.a(str);
        if (obj instanceof Long) {
            s.a(((Long) obj).longValue());
        } else if (obj instanceof String) {
            s.b((String) obj);
        } else if (obj instanceof Double) {
            s.a(((Double) obj).doubleValue());
        } else if (e8.b() && this.a.f3861g.a(o.c1) && (obj instanceof Bundle[])) {
            s.a((Iterable<? extends r0>) a((Bundle[]) obj));
        }
        if (i2 >= 0) {
            if (aVar.f3513g) {
                aVar.i();
                aVar.f3513g = false;
            }
            p0.a((p0) aVar.f3512f, i2, (r0) ((w3) s.k()));
            return;
        }
        aVar.a(s);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0328, code lost:
        if (((r7.zzc & 4) != 0) != false) goto L_0x032a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(i.c.a.b.g.g.s0 r13) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0005
            java.lang.String r13 = ""
            return r13
        L_0x0005:
            java.lang.String r0 = "\nbatch {\n"
            java.lang.StringBuilder r0 = i.a.a.a.a.a(r0)
            i.c.a.b.g.g.d4<i.c.a.b.g.g.t0> r13 = r13.zzc
            java.util.Iterator r13 = r13.iterator()
        L_0x0011:
            boolean r1 = r13.hasNext()
            java.lang.String r2 = "}\n"
            if (r1 == 0) goto L_0x03c0
            java.lang.Object r1 = r13.next()
            i.c.a.b.g.g.t0 r1 = (i.c.a.b.g.g.t0) r1
            if (r1 == 0) goto L_0x0011
            r3 = 1
            a((java.lang.StringBuilder) r0, (int) r3)
            java.lang.String r4 = "bundle {\n"
            r0.append(r4)
            int r4 = r1.zzc
            r4 = r4 & r3
            if (r4 == 0) goto L_0x0031
            r4 = 1
            goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            if (r4 == 0) goto L_0x003f
            int r4 = r1.zze
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "protocol_version"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
        L_0x003f:
            java.lang.String r4 = r1.zzm
            java.lang.String r5 = "platform"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
            int r4 = r1.zzc
            r4 = r4 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x004e
            r4 = 1
            goto L_0x004f
        L_0x004e:
            r4 = 0
        L_0x004f:
            if (r4 == 0) goto L_0x005c
            long r4 = r1.zzu
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "gmp_version"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
        L_0x005c:
            int r4 = r1.zzc
            r5 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0066
            r4 = 1
            goto L_0x0067
        L_0x0066:
            r4 = 0
        L_0x0067:
            if (r4 == 0) goto L_0x0074
            long r4 = r1.zzv
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "uploading_gmp_version"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
        L_0x0074:
            int r4 = r1.zzd
            r4 = r4 & 16
            if (r4 == 0) goto L_0x007c
            r4 = 1
            goto L_0x007d
        L_0x007c:
            r4 = 0
        L_0x007d:
            if (r4 == 0) goto L_0x008a
            long r4 = r1.zzas
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "dynamite_version"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
        L_0x008a:
            int r4 = r1.zzc
            r5 = 536870912(0x20000000, float:1.0842022E-19)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0093
            r4 = 1
            goto L_0x0094
        L_0x0093:
            r4 = 0
        L_0x0094:
            if (r4 == 0) goto L_0x00a1
            long r4 = r1.zzak
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "config_version"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
        L_0x00a1:
            java.lang.String r4 = r1.zzac
            java.lang.String r5 = "gmp_app_id"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
            java.lang.String r4 = r1.zzap
            java.lang.String r5 = "admob_app_id"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
            java.lang.String r4 = r1.zzs
            java.lang.String r5 = "app_id"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
            java.lang.String r4 = r1.zzt
            java.lang.String r5 = "app_version"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
            int r4 = r1.zzc
            r5 = 33554432(0x2000000, float:9.403955E-38)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x00c6
            r4 = 1
            goto L_0x00c7
        L_0x00c6:
            r4 = 0
        L_0x00c7:
            if (r4 == 0) goto L_0x00d4
            int r4 = r1.zzag
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "app_version_major"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
        L_0x00d4:
            java.lang.String r4 = r1.zzaf
            java.lang.String r5 = "firebase_instance_id"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
            int r4 = r1.zzc
            r5 = 524288(0x80000, float:7.34684E-40)
            r4 = r4 & r5
            if (r4 == 0) goto L_0x00e4
            r4 = 1
            goto L_0x00e5
        L_0x00e4:
            r4 = 0
        L_0x00e5:
            if (r4 == 0) goto L_0x00f2
            long r4 = r1.zzz
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.String r5 = "dev_cert_hash"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
        L_0x00f2:
            java.lang.String r4 = r1.zzr
            java.lang.String r5 = "app_store"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r5, (java.lang.Object) r4)
            int r4 = r1.zzc
            r5 = 2
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0101
            r4 = 1
            goto L_0x0102
        L_0x0101:
            r4 = 0
        L_0x0102:
            if (r4 == 0) goto L_0x010f
            long r6 = r1.zzh
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "upload_timestamp_millis"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x010f:
            int r4 = r1.zzc
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0117
            r4 = 1
            goto L_0x0118
        L_0x0117:
            r4 = 0
        L_0x0118:
            if (r4 == 0) goto L_0x0125
            long r6 = r1.zzi
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "start_timestamp_millis"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x0125:
            int r4 = r1.zzc
            r4 = r4 & 8
            if (r4 == 0) goto L_0x012d
            r4 = 1
            goto L_0x012e
        L_0x012d:
            r4 = 0
        L_0x012e:
            if (r4 == 0) goto L_0x013b
            long r6 = r1.zzj
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "end_timestamp_millis"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x013b:
            int r4 = r1.zzc
            r4 = r4 & 16
            if (r4 == 0) goto L_0x0143
            r4 = 1
            goto L_0x0144
        L_0x0143:
            r4 = 0
        L_0x0144:
            if (r4 == 0) goto L_0x0151
            long r6 = r1.zzk
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "previous_bundle_start_timestamp_millis"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x0151:
            int r4 = r1.zzc
            r4 = r4 & 32
            if (r4 == 0) goto L_0x0159
            r4 = 1
            goto L_0x015a
        L_0x0159:
            r4 = 0
        L_0x015a:
            if (r4 == 0) goto L_0x0167
            long r6 = r1.zzl
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "previous_bundle_end_timestamp_millis"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x0167:
            java.lang.String r4 = r1.zzy
            java.lang.String r6 = "app_instance_id"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
            java.lang.String r4 = r1.zzw
            java.lang.String r6 = "resettable_device_id"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
            java.lang.String r4 = r1.zzaj
            java.lang.String r6 = "device_id"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
            java.lang.String r4 = r1.zzam
            java.lang.String r6 = "ds_id"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
            int r4 = r1.zzc
            r6 = 131072(0x20000, float:1.83671E-40)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x018c
            r4 = 1
            goto L_0x018d
        L_0x018c:
            r4 = 0
        L_0x018d:
            if (r4 == 0) goto L_0x019a
            boolean r4 = r1.zzx
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r6 = "limited_ad_tracking"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x019a:
            java.lang.String r4 = r1.zzn
            java.lang.String r6 = "os_version"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
            java.lang.String r4 = r1.zzo
            java.lang.String r6 = "device_model"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
            java.lang.String r4 = r1.zzp
            java.lang.String r6 = "user_default_language"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
            int r4 = r1.zzc
            r4 = r4 & 1024(0x400, float:1.435E-42)
            if (r4 == 0) goto L_0x01b7
            r4 = 1
            goto L_0x01b8
        L_0x01b7:
            r4 = 0
        L_0x01b8:
            if (r4 == 0) goto L_0x01c5
            int r4 = r1.zzq
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "time_zone_offset_minutes"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x01c5:
            int r4 = r1.zzc
            r6 = 1048576(0x100000, float:1.469368E-39)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x01ce
            r4 = 1
            goto L_0x01cf
        L_0x01ce:
            r4 = 0
        L_0x01cf:
            if (r4 == 0) goto L_0x01dc
            int r4 = r1.zzaa
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "bundle_sequential_index"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x01dc:
            int r4 = r1.zzc
            r6 = 8388608(0x800000, float:1.17549435E-38)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x01e5
            r4 = 1
            goto L_0x01e6
        L_0x01e5:
            r4 = 0
        L_0x01e6:
            if (r4 == 0) goto L_0x01f3
            boolean r4 = r1.zzad
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            java.lang.String r6 = "service_upload"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x01f3:
            java.lang.String r4 = r1.zzab
            java.lang.String r6 = "health_monitor"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
            i.c.a.b.i.a.s5 r4 = r12.a
            i.c.a.b.i.a.pa r4 = r4.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r6 = i.c.a.b.i.a.o.i1
            boolean r4 = r4.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r6)
            if (r4 != 0) goto L_0x0223
            int r4 = r1.zzc
            r6 = 1073741824(0x40000000, float:2.0)
            r4 = r4 & r6
            if (r4 == 0) goto L_0x020f
            r4 = 1
            goto L_0x0210
        L_0x020f:
            r4 = 0
        L_0x0210:
            if (r4 == 0) goto L_0x0223
            long r6 = r1.zzal
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0223
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            java.lang.String r6 = "android_id"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x0223:
            int r4 = r1.zzd
            r4 = r4 & r5
            if (r4 == 0) goto L_0x022a
            r4 = 1
            goto L_0x022b
        L_0x022a:
            r4 = 0
        L_0x022b:
            if (r4 == 0) goto L_0x0238
            int r4 = r1.zzao
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "retry_counter"
            a((java.lang.StringBuilder) r0, (int) r3, (java.lang.String) r6, (java.lang.Object) r4)
        L_0x0238:
            i.c.a.b.g.g.d4<i.c.a.b.g.g.x0> r4 = r1.zzg
            java.lang.String r6 = "name"
            if (r4 == 0) goto L_0x02b9
            java.util.Iterator r4 = r4.iterator()
        L_0x0242:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x02b9
            java.lang.Object r7 = r4.next()
            i.c.a.b.g.g.x0 r7 = (i.c.a.b.g.g.x0) r7
            if (r7 == 0) goto L_0x0242
            a((java.lang.StringBuilder) r0, (int) r5)
            java.lang.String r8 = "user_property {\n"
            r0.append(r8)
            int r8 = r7.zzc
            r8 = r8 & r3
            if (r8 == 0) goto L_0x025f
            r8 = 1
            goto L_0x0260
        L_0x025f:
            r8 = 0
        L_0x0260:
            r9 = 0
            if (r8 == 0) goto L_0x026a
            long r10 = r7.zzd
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            goto L_0x026b
        L_0x026a:
            r8 = r9
        L_0x026b:
            java.lang.String r10 = "set_timestamp_millis"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r10, (java.lang.Object) r8)
            i.c.a.b.i.a.k4 r8 = r12.e()
            java.lang.String r10 = r7.zze
            java.lang.String r8 = r8.c(r10)
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r6, (java.lang.Object) r8)
            java.lang.String r8 = r7.zzf
            java.lang.String r10 = "string_value"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r10, (java.lang.Object) r8)
            int r8 = r7.zzc
            r8 = r8 & 8
            if (r8 == 0) goto L_0x028c
            r8 = 1
            goto L_0x028d
        L_0x028c:
            r8 = 0
        L_0x028d:
            if (r8 == 0) goto L_0x0296
            long r10 = r7.zzg
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            goto L_0x0297
        L_0x0296:
            r8 = r9
        L_0x0297:
            java.lang.String r10 = "int_value"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r10, (java.lang.Object) r8)
            int r8 = r7.zzc
            r8 = r8 & 32
            if (r8 == 0) goto L_0x02a4
            r8 = 1
            goto L_0x02a5
        L_0x02a4:
            r8 = 0
        L_0x02a5:
            if (r8 == 0) goto L_0x02ad
            double r7 = r7.zzi
            java.lang.Double r9 = java.lang.Double.valueOf(r7)
        L_0x02ad:
            java.lang.String r7 = "double_value"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r7, (java.lang.Object) r9)
            a((java.lang.StringBuilder) r0, (int) r5)
            r0.append(r2)
            goto L_0x0242
        L_0x02b9:
            i.c.a.b.g.g.d4<i.c.a.b.g.g.n0> r4 = r1.zzae
            if (r4 == 0) goto L_0x033c
            java.util.Iterator r4 = r4.iterator()
        L_0x02c1:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L_0x033c
            java.lang.Object r7 = r4.next()
            i.c.a.b.g.g.n0 r7 = (i.c.a.b.g.g.n0) r7
            if (r7 == 0) goto L_0x02c1
            a((java.lang.StringBuilder) r0, (int) r5)
            java.lang.String r8 = "audience_membership {\n"
            r0.append(r8)
            int r8 = r7.zzc
            r8 = r8 & r3
            if (r8 == 0) goto L_0x02de
            r8 = 1
            goto L_0x02df
        L_0x02de:
            r8 = 0
        L_0x02df:
            if (r8 == 0) goto L_0x02ec
            int r8 = r7.zzd
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "audience_id"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r9, (java.lang.Object) r8)
        L_0x02ec:
            int r8 = r7.zzc
            r8 = r8 & 8
            if (r8 == 0) goto L_0x02f4
            r8 = 1
            goto L_0x02f5
        L_0x02f4:
            r8 = 0
        L_0x02f5:
            if (r8 == 0) goto L_0x0302
            boolean r8 = r7.zzg
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.String r9 = "new_audience"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r9, (java.lang.Object) r8)
        L_0x0302:
            i.c.a.b.g.g.v0 r8 = r7.zze
            if (r8 != 0) goto L_0x0308
            i.c.a.b.g.g.v0 r8 = i.c.a.b.g.g.v0.zzg
        L_0x0308:
            java.lang.String r9 = "current_data"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r9, (i.c.a.b.g.g.v0) r8)
            boolean r8 = i.c.a.b.g.g.k9.b()
            if (r8 == 0) goto L_0x032a
            i.c.a.b.i.a.s5 r8 = r12.a
            i.c.a.b.i.a.pa r8 = r8.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r9 = i.c.a.b.i.a.o.Z0
            boolean r8 = r8.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r9)
            if (r8 == 0) goto L_0x032a
            int r8 = r7.zzc
            r8 = r8 & 4
            if (r8 == 0) goto L_0x0327
            r8 = 1
            goto L_0x0328
        L_0x0327:
            r8 = 0
        L_0x0328:
            if (r8 == 0) goto L_0x0335
        L_0x032a:
            i.c.a.b.g.g.v0 r7 = r7.zzf
            if (r7 != 0) goto L_0x0330
            i.c.a.b.g.g.v0 r7 = i.c.a.b.g.g.v0.zzg
        L_0x0330:
            java.lang.String r8 = "previous_data"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r8, (i.c.a.b.g.g.v0) r7)
        L_0x0335:
            a((java.lang.StringBuilder) r0, (int) r5)
            r0.append(r2)
            goto L_0x02c1
        L_0x033c:
            i.c.a.b.g.g.d4<i.c.a.b.g.g.p0> r1 = r1.zzf
            if (r1 == 0) goto L_0x03b8
            java.util.Iterator r1 = r1.iterator()
        L_0x0344:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03b8
            java.lang.Object r4 = r1.next()
            i.c.a.b.g.g.p0 r4 = (i.c.a.b.g.g.p0) r4
            if (r4 == 0) goto L_0x0344
            a((java.lang.StringBuilder) r0, (int) r5)
            java.lang.String r7 = "event {\n"
            r0.append(r7)
            i.c.a.b.i.a.k4 r7 = r12.e()
            java.lang.String r8 = r4.zze
            java.lang.String r7 = r7.a((java.lang.String) r8)
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r6, (java.lang.Object) r7)
            boolean r7 = r4.l()
            if (r7 == 0) goto L_0x0378
            long r7 = r4.zzf
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "timestamp_millis"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r8, (java.lang.Object) r7)
        L_0x0378:
            int r7 = r4.zzc
            r7 = r7 & 4
            if (r7 == 0) goto L_0x0380
            r7 = 1
            goto L_0x0381
        L_0x0380:
            r7 = 0
        L_0x0381:
            if (r7 == 0) goto L_0x038e
            long r7 = r4.zzg
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            java.lang.String r8 = "previous_timestamp_millis"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r8, (java.lang.Object) r7)
        L_0x038e:
            int r7 = r4.zzc
            r7 = r7 & 8
            if (r7 == 0) goto L_0x0396
            r7 = 1
            goto L_0x0397
        L_0x0396:
            r7 = 0
        L_0x0397:
            if (r7 == 0) goto L_0x03a4
            int r7 = r4.zzh
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "count"
            a((java.lang.StringBuilder) r0, (int) r5, (java.lang.String) r8, (java.lang.Object) r7)
        L_0x03a4:
            i.c.a.b.g.g.d4<i.c.a.b.g.g.r0> r7 = r4.zzd
            int r7 = r7.size()
            if (r7 == 0) goto L_0x03b1
            i.c.a.b.g.g.d4<i.c.a.b.g.g.r0> r4 = r4.zzd
            r12.a((java.lang.StringBuilder) r0, (int) r5, (java.util.List<i.c.a.b.g.g.r0>) r4)
        L_0x03b1:
            a((java.lang.StringBuilder) r0, (int) r5)
            r0.append(r2)
            goto L_0x0344
        L_0x03b8:
            a((java.lang.StringBuilder) r0, (int) r3)
            r0.append(r2)
            goto L_0x0011
        L_0x03c0:
            r0.append(r2)
            java.lang.String r13 = r0.toString()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.x9.a(i.c.a.b.g.g.s0):java.lang.String");
    }

    public final String a(e0 e0Var) {
        if (e0Var == null) {
            return "null";
        }
        StringBuilder a = a.a("\nproperty_filter {\n");
        if (e0Var.a()) {
            a(a, 0, "filter_id", (Object) Integer.valueOf(e0Var.zzd));
        }
        a(a, 0, "property_name", (Object) e().c(e0Var.zze));
        String a2 = a(e0Var.zzg, e0Var.zzh, e0Var.zzi);
        if (!a2.isEmpty()) {
            a(a, 0, "filter_type", (Object) a2);
        }
        c0 c0Var = e0Var.zzf;
        if (c0Var == null) {
            c0Var = c0.zzh;
        }
        a(a, 1, c0Var);
        a.append("}\n");
        return a.toString();
    }

    public static String a(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    public final void a(StringBuilder sb, int i2, List<r0> list) {
        if (list != null) {
            int i3 = i2 + 1;
            for (r0 next : list) {
                if (next != null) {
                    a(sb, i3);
                    sb.append("param {\n");
                    Double d = null;
                    if (!e8.b() || !this.a.f3861g.a(o.a1)) {
                        a(sb, i3, DefaultAppMeasurementEventListenerRegistrar.NAME, (Object) e().b(next.zzd));
                        a(sb, i3, "string_value", (Object) next.zze);
                        a(sb, i3, "int_value", (Object) next.n() ? Long.valueOf(next.zzf) : null);
                        if (next.p()) {
                            d = Double.valueOf(next.zzh);
                        }
                        a(sb, i3, "double_value", (Object) d);
                    } else {
                        a(sb, i3, DefaultAppMeasurementEventListenerRegistrar.NAME, (Object) (next.zzc & 1) != 0 ? e().b(next.zzd) : null);
                        a(sb, i3, "string_value", (Object) next.l() ? next.zze : null);
                        a(sb, i3, "int_value", (Object) next.n() ? Long.valueOf(next.zzf) : null);
                        if (next.p()) {
                            d = Double.valueOf(next.zzh);
                        }
                        a(sb, i3, "double_value", (Object) d);
                        if (next.r() > 0) {
                            a(sb, i3, (List<r0>) next.zzi);
                        }
                    }
                    a(sb, i3);
                    sb.append("}\n");
                }
            }
        }
    }

    public static void a(StringBuilder sb, int i2, String str, v0 v0Var) {
        if (v0Var != null) {
            a(sb, 3);
            sb.append(str);
            sb.append(" {\n");
            if (v0Var.zzd.size() != 0) {
                a(sb, 4);
                sb.append("results: ");
                int i3 = 0;
                for (Long l2 : v0Var.zzd) {
                    int i4 = i3 + 1;
                    if (i3 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l2);
                    i3 = i4;
                }
                sb.append(10);
            }
            if (v0Var.zzc.size() != 0) {
                a(sb, 4);
                sb.append("status: ");
                int i5 = 0;
                for (Long l3 : v0Var.zzc) {
                    int i6 = i5 + 1;
                    if (i5 != 0) {
                        sb.append(", ");
                    }
                    sb.append(l3);
                    i5 = i6;
                }
                sb.append(10);
            }
            if (v0Var.l() != 0) {
                a(sb, 4);
                sb.append("dynamic_filter_timestamps: {");
                int i7 = 0;
                for (o0 next : v0Var.zze) {
                    int i8 = i7 + 1;
                    if (i7 != 0) {
                        sb.append(", ");
                    }
                    boolean z = true;
                    sb.append((next.zzc & 1) != 0 ? Integer.valueOf(next.zzd) : null);
                    sb.append(":");
                    if ((next.zzc & 2) == 0) {
                        z = false;
                    }
                    sb.append(z ? Long.valueOf(next.zze) : null);
                    i7 = i8;
                }
                sb.append("}\n");
            }
            if (v0Var.m() != 0) {
                a(sb, 4);
                sb.append("sequence_filter_timestamps: {");
                int i9 = 0;
                for (w0 next2 : v0Var.zzf) {
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(next2.a() ? Integer.valueOf(next2.zzd) : null);
                    sb.append(": [");
                    int i11 = 0;
                    for (Long longValue : next2.zze) {
                        long longValue2 = longValue.longValue();
                        int i12 = i11 + 1;
                        if (i11 != 0) {
                            sb.append(", ");
                        }
                        sb.append(longValue2);
                        i11 = i12;
                    }
                    sb.append("]");
                    i9 = i10;
                }
                sb.append("}\n");
            }
            a(sb, 3);
            sb.append("}\n");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0058, code lost:
        if (((r7.zzc & 4) != 0) != false) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (((r7.zzc & 8) != 0) != false) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x009f, code lost:
        if (r0 != false) goto L_0x00a1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.StringBuilder r4, int r5, java.lang.String r6, i.c.a.b.g.g.d0 r7) {
        /*
            r3 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            a((java.lang.StringBuilder) r4, (int) r5)
            r4.append(r6)
            java.lang.String r6 = " {\n"
            r4.append(r6)
            int r6 = r7.zzc
            r0 = 1
            r6 = r6 & r0
            r1 = 0
            if (r6 == 0) goto L_0x0017
            r6 = 1
            goto L_0x0018
        L_0x0017:
            r6 = 0
        L_0x0018:
            if (r6 == 0) goto L_0x0027
            i.c.a.b.g.g.d0$a r6 = r7.k()
            java.lang.String r6 = r6.name()
            java.lang.String r2 = "comparison_type"
            a((java.lang.StringBuilder) r4, (int) r5, (java.lang.String) r2, (java.lang.Object) r6)
        L_0x0027:
            int r6 = r7.zzc
            r6 = r6 & 2
            if (r6 == 0) goto L_0x002f
            r6 = 1
            goto L_0x0030
        L_0x002f:
            r6 = 0
        L_0x0030:
            if (r6 == 0) goto L_0x003d
            boolean r6 = r7.zze
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            java.lang.String r2 = "match_as_float"
            a((java.lang.StringBuilder) r4, (int) r5, (java.lang.String) r2, (java.lang.Object) r6)
        L_0x003d:
            boolean r6 = i.c.a.b.g.g.k9.b()
            if (r6 == 0) goto L_0x005a
            i.c.a.b.i.a.s5 r6 = r3.a
            i.c.a.b.i.a.pa r6 = r6.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.Z0
            boolean r6 = r6.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)
            if (r6 == 0) goto L_0x005a
            int r6 = r7.zzc
            r6 = r6 & 4
            if (r6 == 0) goto L_0x0057
            r6 = 1
            goto L_0x0058
        L_0x0057:
            r6 = 0
        L_0x0058:
            if (r6 == 0) goto L_0x0061
        L_0x005a:
            java.lang.String r6 = r7.zzf
            java.lang.String r2 = "comparison_value"
            a((java.lang.StringBuilder) r4, (int) r5, (java.lang.String) r2, (java.lang.Object) r6)
        L_0x0061:
            boolean r6 = i.c.a.b.g.g.k9.b()
            if (r6 == 0) goto L_0x007e
            i.c.a.b.i.a.s5 r6 = r3.a
            i.c.a.b.i.a.pa r6 = r6.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.Z0
            boolean r6 = r6.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)
            if (r6 == 0) goto L_0x007e
            int r6 = r7.zzc
            r6 = r6 & 8
            if (r6 == 0) goto L_0x007b
            r6 = 1
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            if (r6 == 0) goto L_0x0085
        L_0x007e:
            java.lang.String r6 = r7.zzg
            java.lang.String r2 = "min_comparison_value"
            a((java.lang.StringBuilder) r4, (int) r5, (java.lang.String) r2, (java.lang.Object) r6)
        L_0x0085:
            boolean r6 = i.c.a.b.g.g.k9.b()
            if (r6 == 0) goto L_0x00a1
            i.c.a.b.i.a.s5 r6 = r3.a
            i.c.a.b.i.a.pa r6 = r6.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.Z0
            boolean r6 = r6.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)
            if (r6 == 0) goto L_0x00a1
            int r6 = r7.zzc
            r6 = r6 & 16
            if (r6 == 0) goto L_0x009e
            goto L_0x009f
        L_0x009e:
            r0 = 0
        L_0x009f:
            if (r0 == 0) goto L_0x00a8
        L_0x00a1:
            java.lang.String r6 = r7.zzh
            java.lang.String r7 = "max_comparison_value"
            a((java.lang.StringBuilder) r4, (int) r5, (java.lang.String) r7, (java.lang.Object) r6)
        L_0x00a8:
            a((java.lang.StringBuilder) r4, (int) r5)
            java.lang.String r5 = "}\n"
            r4.append(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.x9.a(java.lang.StringBuilder, int, java.lang.String, i.c.a.b.g.g.d0):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (((r10.zzc & 8) != 0) != false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b0, code lost:
        if (((r4.zzc & 2) != 0) != false) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.StringBuilder r8, int r9, i.c.a.b.g.g.c0 r10) {
        /*
            r7 = this;
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            a((java.lang.StringBuilder) r8, (int) r9)
            java.lang.String r0 = "filter {\n"
            r8.append(r0)
            int r0 = r10.zzc
            r0 = r0 & 4
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x0023
            boolean r0 = r10.zzf
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.String r3 = "complement"
            a((java.lang.StringBuilder) r8, (int) r9, (java.lang.String) r3, (java.lang.Object) r0)
        L_0x0023:
            boolean r0 = i.c.a.b.g.g.k9.b()
            if (r0 == 0) goto L_0x0040
            i.c.a.b.i.a.s5 r0 = r7.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r3 = i.c.a.b.i.a.o.Z0
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r3)
            if (r0 == 0) goto L_0x0040
            int r0 = r10.zzc
            r0 = r0 & 8
            if (r0 == 0) goto L_0x003d
            r0 = 1
            goto L_0x003e
        L_0x003d:
            r0 = 0
        L_0x003e:
            if (r0 == 0) goto L_0x004f
        L_0x0040:
            i.c.a.b.i.a.k4 r0 = r7.e()
            java.lang.String r3 = r10.zzg
            java.lang.String r0 = r0.b(r3)
            java.lang.String r3 = "param_name"
            a((java.lang.StringBuilder) r8, (int) r9, (java.lang.String) r3, (java.lang.Object) r0)
        L_0x004f:
            boolean r0 = i.c.a.b.g.g.k9.b()
            java.lang.String r3 = "}\n"
            if (r0 == 0) goto L_0x0069
            i.c.a.b.i.a.s5 r0 = r7.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r4 = i.c.a.b.i.a.o.Z0
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r4)
            if (r0 == 0) goto L_0x0069
            boolean r0 = r10.a()
            if (r0 == 0) goto L_0x0106
        L_0x0069:
            int r0 = r9 + 1
            i.c.a.b.g.g.f0 r4 = r10.k()
            if (r4 == 0) goto L_0x0106
            a((java.lang.StringBuilder) r8, (int) r0)
            java.lang.String r5 = "string_filter"
            r8.append(r5)
            java.lang.String r5 = " {\n"
            r8.append(r5)
            int r5 = r4.zzc
            r5 = r5 & r2
            if (r5 == 0) goto L_0x0085
            r5 = 1
            goto L_0x0086
        L_0x0085:
            r5 = 0
        L_0x0086:
            if (r5 == 0) goto L_0x0095
            i.c.a.b.g.g.f0$b r5 = r4.k()
            java.lang.String r5 = r5.name()
            java.lang.String r6 = "match_type"
            a((java.lang.StringBuilder) r8, (int) r0, (java.lang.String) r6, (java.lang.Object) r5)
        L_0x0095:
            boolean r5 = i.c.a.b.g.g.k9.b()
            if (r5 == 0) goto L_0x00b2
            i.c.a.b.i.a.s5 r5 = r7.a
            i.c.a.b.i.a.pa r5 = r5.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r6 = i.c.a.b.i.a.o.Z0
            boolean r5 = r5.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r6)
            if (r5 == 0) goto L_0x00b2
            int r5 = r4.zzc
            r5 = r5 & 2
            if (r5 == 0) goto L_0x00af
            r5 = 1
            goto L_0x00b0
        L_0x00af:
            r5 = 0
        L_0x00b0:
            if (r5 == 0) goto L_0x00b9
        L_0x00b2:
            java.lang.String r5 = r4.zze
            java.lang.String r6 = "expression"
            a((java.lang.StringBuilder) r8, (int) r0, (java.lang.String) r6, (java.lang.Object) r5)
        L_0x00b9:
            int r5 = r4.zzc
            r5 = r5 & 4
            if (r5 == 0) goto L_0x00c0
            r1 = 1
        L_0x00c0:
            if (r1 == 0) goto L_0x00cd
            boolean r1 = r4.zzf
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r2 = "case_sensitive"
            a((java.lang.StringBuilder) r8, (int) r0, (java.lang.String) r2, (java.lang.Object) r1)
        L_0x00cd:
            int r1 = r4.l()
            if (r1 <= 0) goto L_0x0100
            int r1 = r0 + 1
            a((java.lang.StringBuilder) r8, (int) r1)
            java.lang.String r1 = "expression_list {\n"
            r8.append(r1)
            i.c.a.b.g.g.d4<java.lang.String> r1 = r4.zzg
            java.util.Iterator r1 = r1.iterator()
        L_0x00e3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00fd
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r4 = r0 + 2
            a((java.lang.StringBuilder) r8, (int) r4)
            r8.append(r2)
            java.lang.String r2 = "\n"
            r8.append(r2)
            goto L_0x00e3
        L_0x00fd:
            r8.append(r3)
        L_0x0100:
            a((java.lang.StringBuilder) r8, (int) r0)
            r8.append(r3)
        L_0x0106:
            boolean r0 = i.c.a.b.g.g.k9.b()
            if (r0 == 0) goto L_0x011e
            i.c.a.b.i.a.s5 r0 = r7.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r1 = i.c.a.b.i.a.o.Z0
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r1)
            if (r0 == 0) goto L_0x011e
            boolean r0 = r10.l()
            if (r0 == 0) goto L_0x0129
        L_0x011e:
            int r0 = r9 + 1
            i.c.a.b.g.g.d0 r10 = r10.m()
            java.lang.String r1 = "number_filter"
            r7.a((java.lang.StringBuilder) r8, (int) r0, (java.lang.String) r1, (i.c.a.b.g.g.d0) r10)
        L_0x0129:
            a((java.lang.StringBuilder) r8, (int) r9)
            r8.append(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.x9.a(java.lang.StringBuilder, int, i.c.a.b.g.g.c0):void");
    }

    public static void a(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append("  ");
        }
    }

    public static void a(StringBuilder sb, int i2, String str, Object obj) {
        if (obj != null) {
            a(sb, i2 + 1);
            sb.append(str);
            sb.append(": ");
            sb.append(obj);
            sb.append(10);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        n().f3758f.a("Failed to load parcelable from buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        r1.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.os.Parcelable> T a(byte[] r5, android.os.Parcelable.Creator<T> r6) {
        /*
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.os.Parcel r1 = android.os.Parcel.obtain()
            int r2 = r5.length     // Catch:{ SafeParcelReader$ParseException -> 0x001c }
            r3 = 0
            r1.unmarshall(r5, r3, r2)     // Catch:{ SafeParcelReader$ParseException -> 0x001c }
            r1.setDataPosition(r3)     // Catch:{ SafeParcelReader$ParseException -> 0x001c }
            java.lang.Object r5 = r6.createFromParcel(r1)     // Catch:{ SafeParcelReader$ParseException -> 0x001c }
            android.os.Parcelable r5 = (android.os.Parcelable) r5     // Catch:{ SafeParcelReader$ParseException -> 0x001c }
            r1.recycle()
            return r5
        L_0x001a:
            r5 = move-exception
            goto L_0x002b
        L_0x001c:
            i.c.a.b.i.a.m4 r5 = r4.n()     // Catch:{ all -> 0x001a }
            i.c.a.b.i.a.o4 r5 = r5.f3758f     // Catch:{ all -> 0x001a }
            java.lang.String r6 = "Failed to load parcelable from buffer"
            r5.a(r6)     // Catch:{ all -> 0x001a }
            r1.recycle()
            return r0
        L_0x002b:
            r1.recycle()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.x9.a(byte[], android.os.Parcelable$Creator):android.os.Parcelable");
    }

    public final boolean a(m mVar, ea eaVar) {
        q.a(mVar);
        q.a(eaVar);
        if (!((x7) y7.f3540f.a()).a() || !this.a.f3861g.a(o.P0)) {
            if (!TextUtils.isEmpty(eaVar.f3649f) || !TextUtils.isEmpty(eaVar.v)) {
                return true;
            }
            oa oaVar = this.a.f3860f;
            return false;
        } else if (!TextUtils.isEmpty(eaVar.f3649f) || !TextUtils.isEmpty(eaVar.v)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean a(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean a(List<Long> list, int i2) {
        if (i2 >= (list.size() << 6)) {
            return false;
        }
        return ((1 << (i2 % 64)) & list.get(i2 / 64).longValue()) != 0;
    }

    public static List<Long> a(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i2 = 0; i2 < length; i2++) {
            long j2 = 0;
            for (int i3 = 0; i3 < 64; i3++) {
                int i4 = (i2 << 6) + i3;
                if (i4 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i4)) {
                    j2 |= 1 << i3;
                }
            }
            arrayList.add(Long.valueOf(j2));
        }
        return arrayList;
    }

    public final List<Long> a(List<Long> list, List<Integer> list2) {
        int i2;
        ArrayList arrayList = new ArrayList(list);
        for (Integer next : list2) {
            if (next.intValue() < 0) {
                n().f3761i.a("Ignoring negative bit index to be cleared", next);
            } else {
                int intValue = next.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    n().f3761i.a("Ignoring bit index greater than bitSet size", next, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (next.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i3 = size2;
            i2 = size;
            size = i3;
            if (size >= 0 && ((Long) arrayList.get(size)).longValue() == 0) {
                size2 = size - 1;
            }
        }
        return arrayList.subList(0, i2);
    }

    public final long a(byte[] bArr) {
        q.a(bArr);
        f().c();
        MessageDigest x = ca.x();
        if (x != null) {
            return ca.a(x.digest(bArr));
        }
        n().f3758f.a("Failed to get MD5");
        return 0;
    }

    public static <Builder extends e5> Builder a(Builder builder, byte[] bArr) {
        i3 b2 = i3.b();
        if (b2 != null) {
            Builder builder2 = (o2) builder;
            if (builder2 != null) {
                Builder builder3 = (w3.b) builder2;
                builder3.a(bArr, bArr.length, b2);
                return builder3;
            }
            throw null;
        }
        Builder builder4 = (o2) builder;
        if (builder4 != null) {
            Builder builder5 = (w3.b) builder4;
            builder5.a(bArr, bArr.length, i3.a());
            return builder5;
        }
        throw null;
    }

    public static List<r0> a(Bundle[] bundleArr) {
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : bundleArr) {
            if (bundle != null) {
                r0.a s = r0.s();
                for (String str : bundle.keySet()) {
                    r0.a s2 = r0.s();
                    s2.a(str);
                    Object obj = bundle.get(str);
                    if (obj instanceof Long) {
                        s2.a(((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        s2.b((String) obj);
                    } else if (obj instanceof Double) {
                        s2.a(((Double) obj).doubleValue());
                    }
                    if (s.f3513g) {
                        s.i();
                        s.f3513g = false;
                    }
                    r0.a((r0) s.f3512f, (r0) ((w3) s2.k()));
                }
                if (((r0) s.f3512f).r() > 0) {
                    arrayList.add((r0) ((w3) s.k()));
                }
            }
        }
        return arrayList;
    }
}
