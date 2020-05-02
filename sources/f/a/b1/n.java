package f.a.b1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import n.m.c.f;

/* compiled from: WorkQueue.kt */
public final class n {

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f842b;
    public static final AtomicIntegerFieldUpdater c;
    public static final AtomicIntegerFieldUpdater d;
    public final AtomicReferenceArray<h> a = new AtomicReferenceArray<>(128);
    public volatile int consumerIndex = 0;
    public volatile Object lastScheduledTask = null;
    public volatile int producerIndex = 0;

    static {
        Class<n> cls = n.class;
        f842b = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "lastScheduledTask");
        c = AtomicIntegerFieldUpdater.newUpdater(cls, "producerIndex");
        d = AtomicIntegerFieldUpdater.newUpdater(cls, "consumerIndex");
    }

    public final int a() {
        return this.producerIndex - this.consumerIndex;
    }

    public final h b() {
        h hVar = (h) f842b.getAndSet(this, (Object) null);
        if (hVar != null) {
            return hVar;
        }
        while (true) {
            int i2 = this.consumerIndex;
            if (i2 - this.producerIndex == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (this.a.get(i3) != null && d.compareAndSet(this, i2, i2 + 1)) {
                return this.a.getAndSet(i3, (Object) null);
            }
        }
    }

    public final boolean a(h hVar, d dVar) {
        if (hVar == null) {
            f.a("task");
            throw null;
        } else if (dVar != null) {
            h hVar2 = (h) f842b.getAndSet(this, hVar);
            if (hVar2 != null) {
                return b(hVar2, dVar);
            }
            return true;
        } else {
            f.a("globalQueue");
            throw null;
        }
    }

    public final void a(d dVar, h hVar) {
        if (!dVar.a(hVar)) {
            throw new IllegalStateException("GlobalQueue could not be closed yet".toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(f.a.b1.h r10, f.a.b1.d r11) {
        /*
            r9 = this;
            r0 = 0
            if (r10 == 0) goto L_0x0070
            if (r11 == 0) goto L_0x006a
            r1 = 0
            r2 = 1
            r3 = 1
        L_0x0008:
            int r4 = r9.a()
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 != r5) goto L_0x0012
        L_0x0010:
            r4 = 0
            goto L_0x0029
        L_0x0012:
            int r4 = r9.producerIndex
            r4 = r4 & r5
            java.util.concurrent.atomic.AtomicReferenceArray<f.a.b1.h> r5 = r9.a
            java.lang.Object r5 = r5.get(r4)
            if (r5 == 0) goto L_0x001e
            goto L_0x0010
        L_0x001e:
            java.util.concurrent.atomic.AtomicReferenceArray<f.a.b1.h> r5 = r9.a
            r5.lazySet(r4, r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = c
            r4.incrementAndGet(r9)
            r4 = 1
        L_0x0029:
            if (r4 != 0) goto L_0x0069
            int r3 = r9.a()
            int r3 = r3 / 2
            if (r3 >= r2) goto L_0x0034
            r3 = 1
        L_0x0034:
            r4 = 0
        L_0x0035:
            if (r4 >= r3) goto L_0x0067
        L_0x0037:
            int r5 = r9.consumerIndex
            int r6 = r9.producerIndex
            int r6 = r5 - r6
            if (r6 != 0) goto L_0x0041
            r5 = r0
            goto L_0x005f
        L_0x0041:
            r6 = r5 & 127(0x7f, float:1.78E-43)
            java.util.concurrent.atomic.AtomicReferenceArray<f.a.b1.h> r7 = r9.a
            java.lang.Object r7 = r7.get(r6)
            f.a.b1.h r7 = (f.a.b1.h) r7
            if (r7 == 0) goto L_0x0037
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = d
            int r8 = r5 + 1
            boolean r5 = r7.compareAndSet(r9, r5, r8)
            if (r5 == 0) goto L_0x0037
            java.util.concurrent.atomic.AtomicReferenceArray<f.a.b1.h> r5 = r9.a
            java.lang.Object r5 = r5.getAndSet(r6, r0)
            f.a.b1.h r5 = (f.a.b1.h) r5
        L_0x005f:
            if (r5 == 0) goto L_0x0067
            r9.a((f.a.b1.d) r11, (f.a.b1.h) r5)
            int r4 = r4 + 1
            goto L_0x0035
        L_0x0067:
            r3 = 0
            goto L_0x0008
        L_0x0069:
            return r3
        L_0x006a:
            java.lang.String r10 = "globalQueue"
            n.m.c.f.a((java.lang.String) r10)
            throw r0
        L_0x0070:
            java.lang.String r10 = "task"
            n.m.c.f.a((java.lang.String) r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: f.a.b1.n.b(f.a.b1.h, f.a.b1.d):boolean");
    }
}
