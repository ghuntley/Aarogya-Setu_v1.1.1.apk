package h.r.d;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.core.CodedOutputStream;
import h.h.m.w.b;
import h.h.m.w.c;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: RecyclerViewAccessibilityDelegate */
public class u extends h.h.m.a {
    public final RecyclerView d;
    public final a e;

    public u(RecyclerView recyclerView) {
        this.d = recyclerView;
        a aVar = this.e;
        if (aVar != null) {
            this.e = aVar;
        } else {
            this.e = new a(this);
        }
    }

    public boolean a() {
        return this.d.hasPendingAdapterUpdates();
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !a()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().a(accessibilityEvent);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0088 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.View r9, int r10, android.os.Bundle r11) {
        /*
            r8 = this;
            boolean r9 = super.a((android.view.View) r9, (int) r10, (android.os.Bundle) r11)
            r11 = 1
            if (r9 == 0) goto L_0x0008
            return r11
        L_0x0008:
            boolean r9 = r8.a()
            r0 = 0
            if (r9 != 0) goto L_0x0096
            androidx.recyclerview.widget.RecyclerView r9 = r8.d
            androidx.recyclerview.widget.RecyclerView$o r9 = r9.getLayoutManager()
            if (r9 == 0) goto L_0x0096
            androidx.recyclerview.widget.RecyclerView r9 = r8.d
            androidx.recyclerview.widget.RecyclerView$o r9 = r9.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r1 = r9.f314b
            androidx.recyclerview.widget.RecyclerView$v r2 = r1.mRecycler
            r2 = 4096(0x1000, float:5.74E-42)
            if (r10 == r2) goto L_0x0058
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r10 == r2) goto L_0x002c
            r3 = 0
            r4 = 0
            goto L_0x0086
        L_0x002c:
            r10 = -1
            boolean r1 = r1.canScrollVertically(r10)
            if (r1 == 0) goto L_0x0041
            int r1 = r9.r
            int r2 = r9.l()
            int r1 = r1 - r2
            int r2 = r9.i()
            int r1 = r1 - r2
            int r1 = -r1
            goto L_0x0042
        L_0x0041:
            r1 = 0
        L_0x0042:
            androidx.recyclerview.widget.RecyclerView r2 = r9.f314b
            boolean r10 = r2.canScrollHorizontally(r10)
            if (r10 == 0) goto L_0x0084
            int r10 = r9.f326q
            int r2 = r9.j()
            int r10 = r10 - r2
            int r2 = r9.k()
            int r10 = r10 - r2
            int r10 = -r10
            goto L_0x0081
        L_0x0058:
            boolean r10 = r1.canScrollVertically(r11)
            if (r10 == 0) goto L_0x006c
            int r10 = r9.r
            int r1 = r9.l()
            int r10 = r10 - r1
            int r1 = r9.i()
            int r10 = r10 - r1
            r1 = r10
            goto L_0x006d
        L_0x006c:
            r1 = 0
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r10 = r9.f314b
            boolean r10 = r10.canScrollHorizontally(r11)
            if (r10 == 0) goto L_0x0084
            int r10 = r9.f326q
            int r2 = r9.j()
            int r10 = r10 - r2
            int r2 = r9.k()
            int r10 = r10 - r2
        L_0x0081:
            r3 = r10
            r4 = r1
            goto L_0x0086
        L_0x0084:
            r4 = r1
            r3 = 0
        L_0x0086:
            if (r4 != 0) goto L_0x008c
            if (r3 != 0) goto L_0x008c
            r11 = 0
            goto L_0x0095
        L_0x008c:
            androidx.recyclerview.widget.RecyclerView r2 = r9.f314b
            r5 = 0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 1
            r2.smoothScrollBy(r3, r4, r5, r6, r7)
        L_0x0095:
            return r11
        L_0x0096:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.r.d.u.a(android.view.View, int, android.os.Bundle):boolean");
    }

    /* compiled from: RecyclerViewAccessibilityDelegate */
    public static class a extends h.h.m.a {
        public final u d;
        public Map<View, h.h.m.a> e = new WeakHashMap();

        public a(u uVar) {
            this.d = uVar;
        }

        public void a(View view, b bVar) {
            if (this.d.a() || this.d.d.getLayoutManager() == null) {
                this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
                return;
            }
            this.d.d.getLayoutManager().a(view, bVar);
            h.h.m.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.a(view, bVar);
            } else {
                this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
            }
        }

        public void b(View view, AccessibilityEvent accessibilityEvent) {
            h.h.m.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.b(view, accessibilityEvent);
            } else {
                this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public void c(View view, AccessibilityEvent accessibilityEvent) {
            h.h.m.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.c(view, accessibilityEvent);
            } else {
                this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        public void d(View view, AccessibilityEvent accessibilityEvent) {
            h.h.m.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.d(view, accessibilityEvent);
            } else {
                this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }

        public boolean a(View view, int i2, Bundle bundle) {
            if (this.d.a() || this.d.d.getLayoutManager() == null) {
                return super.a(view, i2, bundle);
            }
            h.h.m.a aVar = this.e.get(view);
            if (aVar != null) {
                if (aVar.a(view, i2, bundle)) {
                    return true;
                }
            } else if (super.a(view, i2, bundle)) {
                return true;
            }
            RecyclerView.v vVar = this.d.d.getLayoutManager().f314b.mRecycler;
            return false;
        }

        public void a(View view, int i2) {
            h.h.m.a aVar = this.e.get(view);
            if (aVar != null) {
                aVar.a(view, i2);
            } else {
                this.a.sendAccessibilityEvent(view, i2);
            }
        }

        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            h.h.m.a aVar = this.e.get(view);
            if (aVar != null) {
                return aVar.a(view, accessibilityEvent);
            }
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            h.h.m.a aVar = this.e.get(viewGroup);
            if (aVar != null) {
                return aVar.a(viewGroup, view, accessibilityEvent);
            }
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public c a(View view) {
            h.h.m.a aVar = this.e.get(view);
            if (aVar != null) {
                return aVar.a(view);
            }
            return super.a(view);
        }
    }

    public void a(View view, b bVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, bVar.a);
        if (!a() && this.d.getLayoutManager() != null) {
            RecyclerView.o layoutManager = this.d.getLayoutManager();
            RecyclerView recyclerView = layoutManager.f314b;
            RecyclerView.v vVar = recyclerView.mRecycler;
            RecyclerView.a0 a0Var = recyclerView.mState;
            if (recyclerView.canScrollVertically(-1) || layoutManager.f314b.canScrollHorizontally(-1)) {
                bVar.a.addAction(8192);
                bVar.a.setScrollable(true);
            }
            if (layoutManager.f314b.canScrollVertically(1) || layoutManager.f314b.canScrollHorizontally(1)) {
                bVar.a.addAction(CodedOutputStream.DEFAULT_BUFFER_SIZE);
                bVar.a.setScrollable(true);
            }
            bVar.a((Object) new b.C0051b(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.b(vVar, a0Var), layoutManager.a(vVar, a0Var), false, 0)));
        }
    }
}
