package h.r.d;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import h.h.m.m;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ChildHelper */
public class b {
    public final C0062b a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2087b = new a();
    public final List<View> c = new ArrayList();

    /* renamed from: h.r.d.b$b  reason: collision with other inner class name */
    /* compiled from: ChildHelper */
    public interface C0062b {
    }

    public b(C0062b bVar) {
        this.a = bVar;
    }

    public final void a(View view) {
        this.c.add(view);
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        if (eVar != null) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                RecyclerView recyclerView = RecyclerView.this;
                int i2 = childViewHolderInt.u;
                if (i2 != -1) {
                    childViewHolderInt.t = i2;
                } else {
                    childViewHolderInt.t = m.i(childViewHolderInt.e);
                }
                recyclerView.setChildImportantForAccessibilityInternal(childViewHolderInt, 4);
                return;
            }
            return;
        }
        throw null;
    }

    public View b(int i2) {
        return ((RecyclerView.e) this.a).a(c(i2));
    }

    public final int c(int i2) {
        if (i2 < 0) {
            return -1;
        }
        int a2 = ((RecyclerView.e) this.a).a();
        int i3 = i2;
        while (i3 < a2) {
            int b2 = i2 - (i3 - this.f2087b.b(i3));
            if (b2 == 0) {
                while (this.f2087b.c(i3)) {
                    i3++;
                }
                return i3;
            }
            i3 += b2;
        }
        return -1;
    }

    public final boolean d(View view) {
        if (!this.c.remove(view)) {
            return false;
        }
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        if (eVar != null) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt == null) {
                return true;
            }
            RecyclerView.this.setChildImportantForAccessibilityInternal(childViewHolderInt, childViewHolderInt.t);
            childViewHolderInt.t = 0;
            return true;
        }
        throw null;
    }

    public String toString() {
        return this.f2087b.toString() + ", hidden list:" + this.c.size();
    }

    /* compiled from: ChildHelper */
    public static class a {
        public long a = 0;

        /* renamed from: b  reason: collision with root package name */
        public a f2088b;

        public final void a() {
            if (this.f2088b == null) {
                this.f2088b = new a();
            }
        }

        public void b() {
            this.a = 0;
            a aVar = this.f2088b;
            if (aVar != null) {
                aVar.b();
            }
        }

        public boolean c(int i2) {
            if (i2 < 64) {
                return (this.a & (1 << i2)) != 0;
            }
            a();
            return this.f2088b.c(i2 - 64);
        }

        public boolean d(int i2) {
            if (i2 >= 64) {
                a();
                return this.f2088b.d(i2 - 64);
            }
            long j2 = 1 << i2;
            boolean z = (this.a & j2) != 0;
            long j3 = this.a & (~j2);
            this.a = j3;
            long j4 = j2 - 1;
            this.a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.f2088b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    e(63);
                }
                this.f2088b.d(0);
            }
            return z;
        }

        public void e(int i2) {
            if (i2 >= 64) {
                a();
                this.f2088b.e(i2 - 64);
                return;
            }
            this.a |= 1 << i2;
        }

        public String toString() {
            if (this.f2088b == null) {
                return Long.toBinaryString(this.a);
            }
            return this.f2088b.toString() + "xx" + Long.toBinaryString(this.a);
        }

        public void a(int i2) {
            if (i2 >= 64) {
                a aVar = this.f2088b;
                if (aVar != null) {
                    aVar.a(i2 - 64);
                    return;
                }
                return;
            }
            this.a &= ~(1 << i2);
        }

        public int b(int i2) {
            a aVar = this.f2088b;
            if (aVar == null) {
                if (i2 >= 64) {
                    return Long.bitCount(this.a);
                }
                return Long.bitCount(this.a & ((1 << i2) - 1));
            } else if (i2 < 64) {
                return Long.bitCount(this.a & ((1 << i2) - 1));
            } else {
                return Long.bitCount(this.a) + aVar.b(i2 - 64);
            }
        }

        public void a(int i2, boolean z) {
            if (i2 >= 64) {
                a();
                this.f2088b.a(i2 - 64, z);
                return;
            }
            boolean z2 = (this.a & Long.MIN_VALUE) != 0;
            long j2 = (1 << i2) - 1;
            long j3 = this.a;
            this.a = ((j3 & (~j2)) << 1) | (j3 & j2);
            if (z) {
                e(i2);
            } else {
                a(i2);
            }
            if (z2 || this.f2088b != null) {
                a();
                this.f2088b.a(0, z2);
            }
        }
    }

    public int b() {
        return ((RecyclerView.e) this.a).a();
    }

    public int b(View view) {
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        if (indexOfChild != -1 && !this.f2087b.c(indexOfChild)) {
            return indexOfChild - this.f2087b.b(indexOfChild);
        }
        return -1;
    }

    public boolean c(View view) {
        return this.c.contains(view);
    }

    public View d(int i2) {
        return RecyclerView.this.getChildAt(i2);
    }

    public void a(View view, int i2, boolean z) {
        int i3;
        if (i2 < 0) {
            i3 = ((RecyclerView.e) this.a).a();
        } else {
            i3 = c(i2);
        }
        this.f2087b.a(i3, z);
        if (z) {
            a(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        RecyclerView.this.addView(view, i3);
        RecyclerView.this.dispatchChildAttached(view);
    }

    public void a(View view, int i2, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i3;
        if (i2 < 0) {
            i3 = ((RecyclerView.e) this.a).a();
        } else {
            i3 = c(i2);
        }
        this.f2087b.a(i3, z);
        if (z) {
            a(view);
        }
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        if (eVar != null) {
            RecyclerView.d0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                if (childViewHolderInt.l() || childViewHolderInt.o()) {
                    childViewHolderInt.f306n &= -257;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Called attach on a child which is not detached: ");
                    sb.append(childViewHolderInt);
                    throw new IllegalArgumentException(i.a.a.a.a.a(RecyclerView.this, sb));
                }
            }
            RecyclerView.this.attachViewToParent(view, i3, layoutParams);
            return;
        }
        throw null;
    }

    public int a() {
        return ((RecyclerView.e) this.a).a() - this.c.size();
    }

    public void a(int i2) {
        RecyclerView.d0 childViewHolderInt;
        int c2 = c(i2);
        this.f2087b.d(c2);
        RecyclerView.e eVar = (RecyclerView.e) this.a;
        View childAt = RecyclerView.this.getChildAt(c2);
        if (!(childAt == null || (childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt)) == null)) {
            if (!childViewHolderInt.l() || childViewHolderInt.o()) {
                childViewHolderInt.a(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(i.a.a.a.a.a(RecyclerView.this, sb));
            }
        }
        RecyclerView.this.detachViewFromParent(c2);
    }
}
