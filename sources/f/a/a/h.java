package f.a.a;

import f.a.x;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import n.m.c.f;

/* compiled from: LockFreeLinkedList.kt */
public class h {
    public static final AtomicReferenceFieldUpdater e;

    /* renamed from: f  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f792f;

    /* renamed from: g  reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f793g;
    public volatile Object _next = this;
    public volatile Object _prev = this;
    public volatile Object _removedRef = null;

    /* compiled from: LockFreeLinkedList.kt */
    public static abstract class a extends e<h> {

        /* renamed from: b  reason: collision with root package name */
        public h f794b;
        public final h c;

        public a(h hVar) {
            if (hVar != null) {
                this.c = hVar;
            } else {
                f.a("newNode");
                throw null;
            }
        }
    }

    static {
        Class<Object> cls = Object.class;
        Class<h> cls2 = h.class;
        e = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        f792f = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        f793g = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    public final h a(h hVar, k kVar) {
        Object obj;
        while (true) {
            h hVar2 = null;
            while (true) {
                obj = hVar._next;
                if (obj == kVar) {
                    return hVar;
                }
                if (obj instanceof k) {
                    ((k) obj).a(hVar);
                } else if (!(obj instanceof l)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof l) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            hVar2 = hVar;
                            hVar = (h) obj;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == hVar) {
                        return null;
                    } else {
                        if (f792f.compareAndSet(this, obj2, hVar) && !(hVar._prev instanceof l)) {
                            return null;
                        }
                    }
                } else if (hVar2 != null) {
                    break;
                } else {
                    hVar = g.a(hVar._prev);
                }
            }
            hVar.g();
            e.compareAndSet(hVar2, hVar, ((l) obj).a);
            hVar = hVar2;
        }
    }

    public final Object d() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof k)) {
                return obj;
            }
            ((k) obj).a(this);
        }
    }

    public final h e() {
        return g.a(d());
    }

    public final h g() {
        Object obj;
        h hVar;
        l lVar;
        do {
            obj = this._prev;
            if (obj instanceof l) {
                return ((l) obj).a;
            }
            if (obj == this) {
                hVar = this;
                while (!(hVar instanceof f)) {
                    hVar = hVar.e();
                    if (x.a) {
                        if (!(hVar != this)) {
                            throw new AssertionError();
                        }
                    }
                }
            } else if (obj != null) {
                hVar = (h) obj;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            lVar = (l) hVar._removedRef;
            if (lVar == null) {
                lVar = new l(hVar);
                f793g.lazySet(hVar, lVar);
            }
        } while (!f792f.compareAndSet(this, obj, lVar));
        return (h) obj;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }

    public final void a(h hVar) {
        Object obj;
        do {
            obj = hVar._prev;
            if ((obj instanceof l) || d() != hVar) {
                return;
            }
        } while (!f792f.compareAndSet(hVar, obj, this));
        if (!(d() instanceof l)) {
            return;
        }
        if (obj != null) {
            hVar.a((h) obj, (k) null);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }
}
