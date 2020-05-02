package androidx.activity;

import h.a.b;
import h.l.d.r;
import h.o.h;
import h.o.j;
import h.o.l;
import h.o.m;
import java.util.ArrayDeque;
import java.util.Iterator;

public final class OnBackPressedDispatcher {
    public final Runnable a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayDeque<b> f37b = new ArrayDeque<>();

    public class LifecycleOnBackPressedCancellable implements j, h.a.a {
        public final h a;

        /* renamed from: b  reason: collision with root package name */
        public final b f38b;
        public h.a.a c;

        public LifecycleOnBackPressedCancellable(h hVar, b bVar) {
            this.a = hVar;
            this.f38b = bVar;
            hVar.a(this);
        }

        public void a(l lVar, h.a aVar) {
            if (aVar == h.a.ON_START) {
                OnBackPressedDispatcher onBackPressedDispatcher = OnBackPressedDispatcher.this;
                b bVar = this.f38b;
                onBackPressedDispatcher.f37b.add(bVar);
                a aVar2 = new a(bVar);
                bVar.f890b.add(aVar2);
                this.c = aVar2;
            } else if (aVar == h.a.ON_STOP) {
                h.a.a aVar3 = this.c;
                if (aVar3 != null) {
                    aVar3.cancel();
                }
            } else if (aVar == h.a.ON_DESTROY) {
                cancel();
            }
        }

        public void cancel() {
            ((m) this.a).a.remove(this);
            this.f38b.f890b.remove(this);
            h.a.a aVar = this.c;
            if (aVar != null) {
                aVar.cancel();
                this.c = null;
            }
        }
    }

    public class a implements h.a.a {
        public final b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public void cancel() {
            OnBackPressedDispatcher.this.f37b.remove(this.a);
            this.a.f890b.remove(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.a = runnable;
    }

    public void a() {
        Iterator<b> descendingIterator = this.f37b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.a) {
                r rVar = r.this;
                rVar.d(true);
                if (rVar.f2008h.a) {
                    rVar.j();
                    return;
                } else {
                    rVar.f2007g.a();
                    return;
                }
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
