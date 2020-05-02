package i.c.a.b.i.a;

import h.e.a;
import i.c.a.b.g.g.ib;
import i.c.a.b.g.g.r8;
import i.c.a.b.g.g.v0;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class ha {
    public String a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3698b;
    public v0 c;
    public BitSet d;
    public BitSet e;

    /* renamed from: f  reason: collision with root package name */
    public Map<Integer, Long> f3699f;

    /* renamed from: g  reason: collision with root package name */
    public Map<Integer, List<Long>> f3700g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ fa f3701h;

    public /* synthetic */ ha(fa faVar, String str, ia iaVar) {
        this.f3701h = faVar;
        this.a = str;
        this.f3698b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f3699f = new a();
        this.f3700g = new a();
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final i.c.a.b.g.g.n0 a(int r18, java.util.List<java.lang.Integer> r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            i.c.a.b.g.g.n0 r2 = i.c.a.b.g.g.n0.zzh
            i.c.a.b.g.g.w3$b r2 = r2.i()
            i.c.a.b.g.g.n0$a r2 = (i.c.a.b.g.g.n0.a) r2
            boolean r3 = r2.f3513g
            r4 = 0
            if (r3 == 0) goto L_0x0016
            r2.i()
            r2.f3513g = r4
        L_0x0016:
            MessageType r3 = r2.f3512f
            i.c.a.b.g.g.n0 r3 = (i.c.a.b.g.g.n0) r3
            int r5 = r3.zzc
            r6 = 1
            r5 = r5 | r6
            r3.zzc = r5
            r5 = r18
            r3.zzd = r5
            boolean r3 = r0.f3698b
            boolean r5 = r2.f3513g
            if (r5 == 0) goto L_0x002f
            r2.i()
            r2.f3513g = r4
        L_0x002f:
            MessageType r5 = r2.f3512f
            i.c.a.b.g.g.n0 r5 = (i.c.a.b.g.g.n0) r5
            int r7 = r5.zzc
            r7 = r7 | 8
            r5.zzc = r7
            r5.zzg = r3
            i.c.a.b.g.g.v0 r3 = r0.c
            if (r3 == 0) goto L_0x004f
            boolean r5 = r2.f3513g
            if (r5 == 0) goto L_0x0048
            r2.i()
            r2.f3513g = r4
        L_0x0048:
            MessageType r5 = r2.f3512f
            i.c.a.b.g.g.n0 r5 = (i.c.a.b.g.g.n0) r5
            i.c.a.b.g.g.n0.b(r5, r3)
        L_0x004f:
            i.c.a.b.g.g.v0 r3 = i.c.a.b.g.g.v0.zzg
            i.c.a.b.g.g.w3$b r3 = r3.i()
            i.c.a.b.g.g.v0$a r3 = (i.c.a.b.g.g.v0.a) r3
            java.util.BitSet r5 = r0.d
            java.util.List r5 = i.c.a.b.i.a.x9.a((java.util.BitSet) r5)
            r3.b((java.lang.Iterable<? extends java.lang.Long>) r5)
            java.util.BitSet r5 = r0.e
            java.util.List r5 = i.c.a.b.i.a.x9.a((java.util.BitSet) r5)
            r3.a((java.lang.Iterable<? extends java.lang.Long>) r5)
            java.util.Map<java.lang.Integer, java.lang.Long> r5 = r0.f3699f
            r7 = 0
            if (r5 != 0) goto L_0x0070
            r5 = r7
            goto L_0x00e2
        L_0x0070:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, java.lang.Long> r8 = r0.f3699f
            int r8 = r8.size()
            r5.<init>(r8)
            java.util.Map<java.lang.Integer, java.lang.Long> r8 = r0.f3699f
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0085:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00e2
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            i.c.a.b.g.g.o0 r10 = i.c.a.b.g.g.o0.zzf
            i.c.a.b.g.g.w3$b r10 = r10.i()
            i.c.a.b.g.g.o0$a r10 = (i.c.a.b.g.g.o0.a) r10
            boolean r11 = r10.f3513g
            if (r11 == 0) goto L_0x00a6
            r10.i()
            r10.f3513g = r4
        L_0x00a6:
            MessageType r11 = r10.f3512f
            i.c.a.b.g.g.o0 r11 = (i.c.a.b.g.g.o0) r11
            int r12 = r11.zzc
            r12 = r12 | r6
            r11.zzc = r12
            r11.zzd = r9
            java.util.Map<java.lang.Integer, java.lang.Long> r11 = r0.f3699f
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            java.lang.Object r9 = r11.get(r9)
            java.lang.Long r9 = (java.lang.Long) r9
            long r11 = r9.longValue()
            boolean r9 = r10.f3513g
            if (r9 == 0) goto L_0x00ca
            r10.i()
            r10.f3513g = r4
        L_0x00ca:
            MessageType r9 = r10.f3512f
            i.c.a.b.g.g.o0 r9 = (i.c.a.b.g.g.o0) r9
            int r13 = r9.zzc
            r13 = r13 | 2
            r9.zzc = r13
            r9.zze = r11
            i.c.a.b.g.g.f5 r9 = r10.k()
            i.c.a.b.g.g.w3 r9 = (i.c.a.b.g.g.w3) r9
            i.c.a.b.g.g.o0 r9 = (i.c.a.b.g.g.o0) r9
            r5.add(r9)
            goto L_0x0085
        L_0x00e2:
            boolean r8 = r3.f3513g
            if (r8 == 0) goto L_0x00eb
            r3.i()
            r3.f3513g = r4
        L_0x00eb:
            MessageType r8 = r3.f3512f
            i.c.a.b.g.g.v0 r8 = (i.c.a.b.g.g.v0) r8
            i.c.a.b.g.g.d4<i.c.a.b.g.g.o0> r9 = r8.zze
            boolean r9 = r9.a()
            if (r9 != 0) goto L_0x00ff
            i.c.a.b.g.g.d4<i.c.a.b.g.g.o0> r9 = r8.zze
            i.c.a.b.g.g.d4 r9 = i.c.a.b.g.g.w3.a(r9)
            r8.zze = r9
        L_0x00ff:
            i.c.a.b.g.g.d4<i.c.a.b.g.g.o0> r8 = r8.zze
            i.c.a.b.g.g.m2.a(r5, r8)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r5 = r0.f3700g
            if (r5 != 0) goto L_0x010d
            java.util.List r5 = java.util.Collections.emptyList()
            goto L_0x0159
        L_0x010d:
            java.util.ArrayList r5 = new java.util.ArrayList
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r8 = r0.f3700g
            int r8 = r8.size()
            r5.<init>(r8)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r8 = r0.f3700g
            java.util.Set r8 = r8.keySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0122:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x0159
            java.lang.Object r9 = r8.next()
            java.lang.Integer r9 = (java.lang.Integer) r9
            i.c.a.b.g.g.w0 r10 = i.c.a.b.g.g.w0.zzf
            i.c.a.b.g.g.w3$b r10 = r10.i()
            i.c.a.b.g.g.w0$a r10 = (i.c.a.b.g.g.w0.a) r10
            int r11 = r9.intValue()
            r10.a((int) r11)
            java.util.Map<java.lang.Integer, java.util.List<java.lang.Long>> r11 = r0.f3700g
            java.lang.Object r9 = r11.get(r9)
            java.util.List r9 = (java.util.List) r9
            if (r9 == 0) goto L_0x014d
            java.util.Collections.sort(r9)
            r10.a((java.lang.Iterable<? extends java.lang.Long>) r9)
        L_0x014d:
            i.c.a.b.g.g.f5 r9 = r10.k()
            i.c.a.b.g.g.w3 r9 = (i.c.a.b.g.g.w3) r9
            i.c.a.b.g.g.w0 r9 = (i.c.a.b.g.g.w0) r9
            r5.add(r9)
            goto L_0x0122
        L_0x0159:
            boolean r8 = i.c.a.b.g.g.ib.b()
            if (r8 == 0) goto L_0x016f
            i.c.a.b.i.a.fa r8 = r0.f3701h
            i.c.a.b.i.a.s5 r8 = r8.a
            i.c.a.b.i.a.pa r8 = r8.f3861g
            java.lang.String r9 = r0.a
            i.c.a.b.i.a.f4<java.lang.Boolean> r10 = i.c.a.b.i.a.o.u0
            boolean r8 = r8.d(r9, r10)
            if (r8 != 0) goto L_0x029e
        L_0x016f:
            MessageType r8 = r2.f3512f
            i.c.a.b.g.g.n0 r8 = (i.c.a.b.g.g.n0) r8
            int r8 = r8.zzc
            r8 = r8 & 4
            if (r8 == 0) goto L_0x017b
            r8 = 1
            goto L_0x017c
        L_0x017b:
            r8 = 0
        L_0x017c:
            if (r8 == 0) goto L_0x029e
            MessageType r8 = r2.f3512f
            i.c.a.b.g.g.n0 r8 = (i.c.a.b.g.g.n0) r8
            i.c.a.b.g.g.v0 r8 = r8.zzf
            if (r8 != 0) goto L_0x0188
            i.c.a.b.g.g.v0 r8 = i.c.a.b.g.g.v0.zzg
        L_0x0188:
            i.c.a.b.g.g.d4<i.c.a.b.g.g.w0> r8 = r8.zzf
            boolean r9 = r8.isEmpty()
            if (r9 == 0) goto L_0x0192
            goto L_0x029e
        L_0x0192:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r5)
            h.e.a r5 = new h.e.a
            r5.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x01a0:
            boolean r10 = r8.hasNext()
            if (r10 == 0) goto L_0x01cf
            java.lang.Object r10 = r8.next()
            i.c.a.b.g.g.w0 r10 = (i.c.a.b.g.g.w0) r10
            boolean r11 = r10.a()
            if (r11 == 0) goto L_0x01a0
            int r11 = r10.l()
            if (r11 <= 0) goto L_0x01a0
            int r11 = r10.zzd
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            int r12 = r10.l()
            int r12 = r12 - r6
            long r12 = r10.a((int) r12)
            java.lang.Long r10 = java.lang.Long.valueOf(r12)
            r5.put(r11, r10)
            goto L_0x01a0
        L_0x01cf:
            r6 = 0
        L_0x01d0:
            int r8 = r9.size()
            if (r6 >= r8) goto L_0x0240
            java.lang.Object r8 = r9.get(r6)
            i.c.a.b.g.g.w0 r8 = (i.c.a.b.g.g.w0) r8
            boolean r10 = r8.a()
            if (r10 == 0) goto L_0x01e9
            int r10 = r8.zzd
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L_0x01ea
        L_0x01e9:
            r10 = r7
        L_0x01ea:
            java.lang.Object r10 = r5.remove(r10)
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto L_0x023d
            if (r1 == 0) goto L_0x0200
            int r11 = r8.zzd
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r11 = r1.contains(r11)
            if (r11 != 0) goto L_0x023d
        L_0x0200:
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            long r12 = r10.longValue()
            long r14 = r8.a((int) r4)
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 >= 0) goto L_0x0214
            r11.add(r10)
        L_0x0214:
            i.c.a.b.g.g.e4 r10 = r8.zze
            r11.addAll(r10)
            i.c.a.b.g.g.w3$b r8 = r8.j()
            i.c.a.b.g.g.w0$a r8 = (i.c.a.b.g.g.w0.a) r8
            boolean r10 = r8.f3513g
            if (r10 == 0) goto L_0x0228
            r8.i()
            r8.f3513g = r4
        L_0x0228:
            MessageType r10 = r8.f3512f
            i.c.a.b.g.g.w0 r10 = (i.c.a.b.g.g.w0) r10
            i.c.a.b.g.g.w0.a((i.c.a.b.g.g.w0) r10)
            r8.a((java.lang.Iterable<? extends java.lang.Long>) r11)
            i.c.a.b.g.g.f5 r8 = r8.k()
            i.c.a.b.g.g.w3 r8 = (i.c.a.b.g.g.w3) r8
            i.c.a.b.g.g.w0 r8 = (i.c.a.b.g.g.w0) r8
            r9.set(r6, r8)
        L_0x023d:
            int r6 = r6 + 1
            goto L_0x01d0
        L_0x0240:
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0248:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x029d
            java.lang.Object r6 = r1.next()
            java.lang.Integer r6 = (java.lang.Integer) r6
            i.c.a.b.g.g.w0 r8 = i.c.a.b.g.g.w0.zzf
            i.c.a.b.g.g.w3$b r8 = r8.i()
            i.c.a.b.g.g.w0$a r8 = (i.c.a.b.g.g.w0.a) r8
            int r10 = r6.intValue()
            r8.a((int) r10)
            java.lang.Object r6 = r5.getOrDefault(r6, r7)
            java.lang.Long r6 = (java.lang.Long) r6
            long r10 = r6.longValue()
            boolean r6 = r8.f3513g
            if (r6 == 0) goto L_0x0276
            r8.i()
            r8.f3513g = r4
        L_0x0276:
            MessageType r6 = r8.f3512f
            i.c.a.b.g.g.w0 r6 = (i.c.a.b.g.g.w0) r6
            i.c.a.b.g.g.e4 r12 = r6.zze
            boolean r12 = r12.a()
            if (r12 != 0) goto L_0x028a
            i.c.a.b.g.g.e4 r12 = r6.zze
            i.c.a.b.g.g.e4 r12 = i.c.a.b.g.g.w3.a((i.c.a.b.g.g.e4) r12)
            r6.zze = r12
        L_0x028a:
            i.c.a.b.g.g.e4 r6 = r6.zze
            i.c.a.b.g.g.t4 r6 = (i.c.a.b.g.g.t4) r6
            r6.a((long) r10)
            i.c.a.b.g.g.f5 r6 = r8.k()
            i.c.a.b.g.g.w3 r6 = (i.c.a.b.g.g.w3) r6
            i.c.a.b.g.g.w0 r6 = (i.c.a.b.g.g.w0) r6
            r9.add(r6)
            goto L_0x0248
        L_0x029d:
            r5 = r9
        L_0x029e:
            boolean r1 = r3.f3513g
            if (r1 == 0) goto L_0x02a7
            r3.i()
            r3.f3513g = r4
        L_0x02a7:
            MessageType r1 = r3.f3512f
            i.c.a.b.g.g.v0 r1 = (i.c.a.b.g.g.v0) r1
            i.c.a.b.g.g.d4<i.c.a.b.g.g.w0> r6 = r1.zzf
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x02bb
            i.c.a.b.g.g.d4<i.c.a.b.g.g.w0> r6 = r1.zzf
            i.c.a.b.g.g.d4 r6 = i.c.a.b.g.g.w3.a(r6)
            r1.zzf = r6
        L_0x02bb:
            i.c.a.b.g.g.d4<i.c.a.b.g.g.w0> r1 = r1.zzf
            i.c.a.b.g.g.m2.a(r5, r1)
            boolean r1 = r2.f3513g
            if (r1 == 0) goto L_0x02c9
            r2.i()
            r2.f3513g = r4
        L_0x02c9:
            MessageType r1 = r2.f3512f
            i.c.a.b.g.g.n0 r1 = (i.c.a.b.g.g.n0) r1
            i.c.a.b.g.g.f5 r3 = r3.k()
            i.c.a.b.g.g.w3 r3 = (i.c.a.b.g.g.w3) r3
            i.c.a.b.g.g.v0 r3 = (i.c.a.b.g.g.v0) r3
            i.c.a.b.g.g.n0.a(r1, r3)
            i.c.a.b.g.g.f5 r1 = r2.k()
            i.c.a.b.g.g.w3 r1 = (i.c.a.b.g.g.w3) r1
            i.c.a.b.g.g.n0 r1 = (i.c.a.b.g.g.n0) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.ha.a(int, java.util.List):i.c.a.b.g.g.n0");
    }

    public /* synthetic */ ha(fa faVar, String str, v0 v0Var, BitSet bitSet, BitSet bitSet2, Map map, Map map2, ia iaVar) {
        this.f3701h = faVar;
        this.a = str;
        this.d = bitSet;
        this.e = bitSet2;
        this.f3699f = map;
        this.f3700g = new a();
        if (map2 != null) {
            for (Integer num : map2.keySet()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Long) map2.get(num));
                this.f3700g.put(num, arrayList);
            }
        }
        this.f3698b = false;
        this.c = v0Var;
    }

    public final void a(ma maVar) {
        int a2 = maVar.a();
        Boolean bool = maVar.c;
        if (bool != null) {
            this.e.set(a2, bool.booleanValue());
        }
        Boolean bool2 = maVar.d;
        if (bool2 != null) {
            this.d.set(a2, bool2.booleanValue());
        }
        if (maVar.e != null) {
            Long l2 = this.f3699f.get(Integer.valueOf(a2));
            long longValue = maVar.e.longValue() / 1000;
            if (l2 == null || longValue > l2.longValue()) {
                this.f3699f.put(Integer.valueOf(a2), Long.valueOf(longValue));
            }
        }
        if (maVar.f3782f != null) {
            List list = this.f3700g.get(Integer.valueOf(a2));
            if (list == null) {
                list = new ArrayList();
                this.f3700g.put(Integer.valueOf(a2), list);
            }
            if (ib.b() && this.f3701h.a.f3861g.d(this.a, o.u0) && maVar.b()) {
                list.clear();
            }
            if (r8.b() && this.f3701h.a.f3861g.d(this.a, o.y0) && maVar.c()) {
                list.clear();
            }
            if (!r8.b() || !this.f3701h.a.f3861g.d(this.a, o.y0)) {
                list.add(Long.valueOf(maVar.f3782f.longValue() / 1000));
                return;
            }
            long longValue2 = maVar.f3782f.longValue() / 1000;
            if (!list.contains(Long.valueOf(longValue2))) {
                list.add(Long.valueOf(longValue2));
            }
        }
    }
}
