package h.r.d;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* compiled from: GapWorker */
public final class m implements Runnable {

    /* renamed from: i  reason: collision with root package name */
    public static final ThreadLocal<m> f2125i = new ThreadLocal<>();

    /* renamed from: j  reason: collision with root package name */
    public static Comparator<c> f2126j = new a();
    public ArrayList<RecyclerView> e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    public long f2127f;

    /* renamed from: g  reason: collision with root package name */
    public long f2128g;

    /* renamed from: h  reason: collision with root package name */
    public ArrayList<c> f2129h = new ArrayList<>();

    /* compiled from: GapWorker */
    public static class a implements Comparator<c> {
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            if (r6.d == null) goto L_0x0025;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
            if (r0 != false) goto L_0x0024;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r6, java.lang.Object r7) {
            /*
                r5 = this;
                h.r.d.m$c r6 = (h.r.d.m.c) r6
                h.r.d.m$c r7 = (h.r.d.m.c) r7
                androidx.recyclerview.widget.RecyclerView r0 = r6.d
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x000c
                r0 = 1
                goto L_0x000d
            L_0x000c:
                r0 = 0
            L_0x000d:
                androidx.recyclerview.widget.RecyclerView r3 = r7.d
                if (r3 != 0) goto L_0x0013
                r3 = 1
                goto L_0x0014
            L_0x0013:
                r3 = 0
            L_0x0014:
                r4 = -1
                if (r0 == r3) goto L_0x001c
                androidx.recyclerview.widget.RecyclerView r6 = r6.d
                if (r6 != 0) goto L_0x0024
                goto L_0x0025
            L_0x001c:
                boolean r0 = r6.a
                boolean r3 = r7.a
                if (r0 == r3) goto L_0x0027
                if (r0 == 0) goto L_0x0025
            L_0x0024:
                r1 = -1
            L_0x0025:
                r2 = r1
                goto L_0x0038
            L_0x0027:
                int r0 = r7.f2131b
                int r1 = r6.f2131b
                int r0 = r0 - r1
                if (r0 == 0) goto L_0x0030
                r2 = r0
                goto L_0x0038
            L_0x0030:
                int r6 = r6.c
                int r7 = r7.c
                int r6 = r6 - r7
                if (r6 == 0) goto L_0x0038
                r2 = r6
            L_0x0038:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: h.r.d.m.a.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* compiled from: GapWorker */
    public static class c {
        public boolean a;

        /* renamed from: b  reason: collision with root package name */
        public int f2131b;
        public int c;
        public RecyclerView d;
        public int e;
    }

    public void a(RecyclerView recyclerView, int i2, int i3) {
        if (recyclerView.isAttachedToWindow() && this.f2127f == 0) {
            this.f2127f = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        b bVar = recyclerView.mPrefetchRegistry;
        bVar.a = i2;
        bVar.f2130b = i3;
    }

    public void run() {
        try {
            h.h.i.b.a(RecyclerView.TRACE_PREFETCH_TAG);
            if (this.e.isEmpty()) {
                this.f2127f = 0;
                Trace.endSection();
                return;
            }
            int size = this.e.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.e.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f2127f = 0;
                Trace.endSection();
                return;
            }
            a(TimeUnit.MILLISECONDS.toNanos(j2) + this.f2128g);
            this.f2127f = 0;
            Trace.endSection();
        } catch (Throwable th) {
            this.f2127f = 0;
            h.h.i.b.a();
            throw th;
        }
    }

    public void a(long j2) {
        RecyclerView recyclerView;
        c cVar;
        int size = this.e.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            RecyclerView recyclerView2 = this.e.get(i3);
            if (recyclerView2.getWindowVisibility() == 0) {
                recyclerView2.mPrefetchRegistry.a(recyclerView2, false);
                i2 += recyclerView2.mPrefetchRegistry.d;
            }
        }
        this.f2129h.ensureCapacity(i2);
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView recyclerView3 = this.e.get(i5);
            if (recyclerView3.getWindowVisibility() == 0) {
                b bVar = recyclerView3.mPrefetchRegistry;
                int abs = Math.abs(bVar.f2130b) + Math.abs(bVar.a);
                for (int i6 = 0; i6 < bVar.d * 2; i6 += 2) {
                    if (i4 >= this.f2129h.size()) {
                        cVar = new c();
                        this.f2129h.add(cVar);
                    } else {
                        cVar = this.f2129h.get(i4);
                    }
                    int i7 = bVar.c[i6 + 1];
                    cVar.a = i7 <= abs;
                    cVar.f2131b = abs;
                    cVar.c = i7;
                    cVar.d = recyclerView3;
                    cVar.e = bVar.c[i6];
                    i4++;
                }
            }
        }
        Collections.sort(this.f2129h, f2126j);
        int i8 = 0;
        while (i8 < this.f2129h.size()) {
            c cVar2 = this.f2129h.get(i8);
            if (cVar2.d != null) {
                RecyclerView.d0 a2 = a(cVar2.d, cVar2.e, cVar2.a ? RecyclerView.FOREVER_NS : j2);
                if (!(a2 == null || a2.f298f == null || !a2.g() || a2.h() || (recyclerView = (RecyclerView) a2.f298f.get()) == null)) {
                    if (recyclerView.mDataSetHasChangedAfterLayout && recyclerView.mChildHelper.b() != 0) {
                        recyclerView.removeAndRecycleViews();
                    }
                    b bVar2 = recyclerView.mPrefetchRegistry;
                    bVar2.a(recyclerView, true);
                    if (bVar2.d != 0) {
                        try {
                            h.h.i.b.a(RecyclerView.TRACE_NESTED_PREFETCH_TAG);
                            RecyclerView.a0 a0Var = recyclerView.mState;
                            RecyclerView.g gVar = recyclerView.mAdapter;
                            a0Var.d = 1;
                            a0Var.e = gVar.a();
                            a0Var.f283g = false;
                            a0Var.f284h = false;
                            a0Var.f285i = false;
                            for (int i9 = 0; i9 < bVar2.d * 2; i9 += 2) {
                                a(recyclerView, bVar2.c[i9], j2);
                            }
                            Trace.endSection();
                        } catch (Throwable th) {
                            h.h.i.b.a();
                            throw th;
                        }
                    }
                }
                cVar2.a = false;
                cVar2.f2131b = 0;
                cVar2.c = 0;
                cVar2.d = null;
                cVar2.e = 0;
                i8++;
            } else {
                return;
            }
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* compiled from: GapWorker */
    public static class b implements RecyclerView.o.c {
        public int a;

        /* renamed from: b  reason: collision with root package name */
        public int f2130b;
        public int[] c;
        public int d;

        public void a(RecyclerView recyclerView, boolean z) {
            this.d = 0;
            int[] iArr = this.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.mLayout;
            if (recyclerView.mAdapter != null && oVar != null && oVar.f321l) {
                if (z) {
                    if (!recyclerView.mAdapterHelper.c()) {
                        oVar.a(recyclerView.mAdapter.a(), (RecyclerView.o.c) this);
                    }
                } else if (!recyclerView.hasPendingAdapterUpdates()) {
                    oVar.a(this.a, this.f2130b, recyclerView.mState, (RecyclerView.o.c) this);
                }
                int i2 = this.d;
                if (i2 > oVar.f322m) {
                    oVar.f322m = i2;
                    oVar.f323n = z;
                    recyclerView.mRecycler.d();
                }
            }
        }

        public void a(int i2, int i3) {
            if (i2 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i3 >= 0) {
                int i4 = this.d * 2;
                int[] iArr = this.c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i4 >= iArr.length) {
                    int[] iArr3 = new int[(i4 * 2)];
                    this.c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.c;
                iArr4[i4] = i2;
                iArr4[i4 + 1] = i3;
                this.d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }

        public boolean a(int i2) {
            if (this.c != null) {
                int i3 = this.d * 2;
                for (int i4 = 0; i4 < i3; i4 += 2) {
                    if (this.c[i4] == i2) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public final RecyclerView.d0 a(RecyclerView recyclerView, int i2, long j2) {
        boolean z;
        int b2 = recyclerView.mChildHelper.b();
        int i3 = 0;
        while (true) {
            if (i3 >= b2) {
                z = false;
                break;
            }
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(recyclerView.mChildHelper.d(i3));
            if (childViewHolderInt.f299g == i2 && !childViewHolderInt.h()) {
                z = true;
                break;
            }
            i3++;
        }
        if (z) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.mRecycler;
        try {
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.d0 a2 = vVar.a(i2, false, j2);
            if (a2 != null) {
                if (!a2.g() || a2.h()) {
                    vVar.a(a2, false);
                } else {
                    vVar.a(a2.e);
                }
            }
            return a2;
        } finally {
            recyclerView.onExitLayoutOrScroll(false);
        }
    }
}
