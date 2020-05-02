package h.f.a.h;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: ConstraintWidgetGroup */
public class f {
    public List<d> a;

    /* renamed from: b  reason: collision with root package name */
    public int f1658b = -1;
    public int c = -1;
    public boolean d = false;
    public final int[] e = {-1, -1};

    /* renamed from: f  reason: collision with root package name */
    public List<d> f1659f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    public List<d> f1660g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    public HashSet<d> f1661h = new HashSet<>();

    /* renamed from: i  reason: collision with root package name */
    public HashSet<d> f1662i = new HashSet<>();

    /* renamed from: j  reason: collision with root package name */
    public List<d> f1663j = new ArrayList();

    /* renamed from: k  reason: collision with root package name */
    public List<d> f1664k = new ArrayList();

    public f(List<d> list) {
        this.a = list;
    }

    public void a(d dVar, int i2) {
        if (i2 == 0) {
            this.f1661h.add(dVar);
        } else if (i2 == 1) {
            this.f1662i.add(dVar);
        }
    }

    public final void a(ArrayList<d> arrayList, d dVar) {
        d dVar2;
        if (!dVar.d0) {
            arrayList.add(dVar);
            dVar.d0 = true;
            if (!dVar.j()) {
                if (dVar instanceof h) {
                    h hVar = (h) dVar;
                    int i2 = hVar.l0;
                    for (int i3 = 0; i3 < i2; i3++) {
                        a(arrayList, hVar.k0[i3]);
                    }
                }
                for (c cVar : dVar.A) {
                    c cVar2 = cVar.d;
                    if (!(cVar2 == null || (dVar2 = cVar2.f1622b) == dVar.D)) {
                        a(arrayList, dVar2);
                    }
                }
            }
        }
    }

    public f(List<d> list, boolean z) {
        this.a = list;
        this.d = z;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0087  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(h.f.a.h.d r7) {
        /*
            r6 = this;
            boolean r0 = r7.b0
            if (r0 == 0) goto L_0x00dd
            boolean r0 = r7.j()
            if (r0 == 0) goto L_0x000b
            return
        L_0x000b:
            h.f.a.h.c r0 = r7.u
            h.f.a.h.c r0 = r0.d
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            r0 = 1
            goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001d
            h.f.a.h.c r3 = r7.u
            h.f.a.h.c r3 = r3.d
            goto L_0x0021
        L_0x001d:
            h.f.a.h.c r3 = r7.s
            h.f.a.h.c r3 = r3.d
        L_0x0021:
            if (r3 == 0) goto L_0x0045
            h.f.a.h.d r4 = r3.f1622b
            boolean r5 = r4.c0
            if (r5 != 0) goto L_0x002c
            r6.a(r4)
        L_0x002c:
            h.f.a.h.c$c r4 = r3.c
            h.f.a.h.c$c r5 = h.f.a.h.c.C0042c.RIGHT
            if (r4 != r5) goto L_0x003c
            h.f.a.h.d r3 = r3.f1622b
            int r4 = r3.I
            int r3 = r3.i()
            int r3 = r3 + r4
            goto L_0x0046
        L_0x003c:
            h.f.a.h.c$c r5 = h.f.a.h.c.C0042c.LEFT
            if (r4 != r5) goto L_0x0045
            h.f.a.h.d r3 = r3.f1622b
            int r3 = r3.I
            goto L_0x0046
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r0 == 0) goto L_0x0050
            h.f.a.h.c r0 = r7.u
            int r0 = r0.a()
            int r3 = r3 - r0
            goto L_0x005c
        L_0x0050:
            h.f.a.h.c r0 = r7.s
            int r0 = r0.a()
            int r4 = r7.i()
            int r4 = r4 + r0
            int r3 = r3 + r4
        L_0x005c:
            int r0 = r7.i()
            int r0 = r3 - r0
            r7.a(r0, r3)
            h.f.a.h.c r0 = r7.w
            h.f.a.h.c r0 = r0.d
            if (r0 == 0) goto L_0x0087
            h.f.a.h.d r1 = r0.f1622b
            boolean r3 = r1.c0
            if (r3 != 0) goto L_0x0074
            r6.a(r1)
        L_0x0074:
            h.f.a.h.d r0 = r0.f1622b
            int r1 = r0.J
            int r0 = r0.Q
            int r1 = r1 + r0
            int r0 = r7.Q
            int r1 = r1 - r0
            int r0 = r7.F
            int r0 = r0 + r1
            r7.c(r1, r0)
            r7.c0 = r2
            return
        L_0x0087:
            h.f.a.h.c r0 = r7.v
            h.f.a.h.c r0 = r0.d
            if (r0 == 0) goto L_0x008e
            r1 = 1
        L_0x008e:
            if (r1 == 0) goto L_0x0095
            h.f.a.h.c r0 = r7.v
            h.f.a.h.c r0 = r0.d
            goto L_0x0099
        L_0x0095:
            h.f.a.h.c r0 = r7.t
            h.f.a.h.c r0 = r0.d
        L_0x0099:
            if (r0 == 0) goto L_0x00bc
            h.f.a.h.d r4 = r0.f1622b
            boolean r5 = r4.c0
            if (r5 != 0) goto L_0x00a4
            r6.a(r4)
        L_0x00a4:
            h.f.a.h.c$c r4 = r0.c
            h.f.a.h.c$c r5 = h.f.a.h.c.C0042c.BOTTOM
            if (r4 != r5) goto L_0x00b4
            h.f.a.h.d r0 = r0.f1622b
            int r3 = r0.J
            int r0 = r0.d()
            int r3 = r3 + r0
            goto L_0x00bc
        L_0x00b4:
            h.f.a.h.c$c r5 = h.f.a.h.c.C0042c.TOP
            if (r4 != r5) goto L_0x00bc
            h.f.a.h.d r0 = r0.f1622b
            int r3 = r0.J
        L_0x00bc:
            if (r1 == 0) goto L_0x00c6
            h.f.a.h.c r0 = r7.v
            int r0 = r0.a()
            int r3 = r3 - r0
            goto L_0x00d2
        L_0x00c6:
            h.f.a.h.c r0 = r7.t
            int r0 = r0.a()
            int r1 = r7.d()
            int r1 = r1 + r0
            int r3 = r3 + r1
        L_0x00d2:
            int r0 = r7.d()
            int r0 = r3 - r0
            r7.c(r0, r3)
            r7.c0 = r2
        L_0x00dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.f.a.h.f.a(h.f.a.h.d):void");
    }
}
