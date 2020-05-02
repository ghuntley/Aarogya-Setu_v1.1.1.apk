package f.a.a;

import f.a.y0;
import kotlin.TypeCastException;
import n.k.e;
import n.m.c.f;
import n.m.c.g;

/* compiled from: ThreadContext.kt */
public final class b {
    public static final n a = new n("ZERO");

    /* renamed from: b  reason: collision with root package name */
    public static final n.m.b.c<Object, e.a, Object> f788b = C0018b.e;
    public static final n.m.b.c<y0<?>, e.a, y0<?>> c = c.e;
    public static final n.m.b.c<r, e.a, r> d = a.f790g;
    public static final n.m.b.c<r, e.a, r> e = a.f789f;

    /* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
    public static final class a extends g implements n.m.b.c<r, e.a, r> {

        /* renamed from: f  reason: collision with root package name */
        public static final a f789f = new a(0);

        /* renamed from: g  reason: collision with root package name */
        public static final a f790g = new a(1);
        public final /* synthetic */ int e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i2) {
            super(2);
            this.e = i2;
        }

        public final Object a(Object obj, Object obj2) {
            int i2 = this.e;
            if (i2 == 0) {
                r rVar = (r) obj;
                e.a aVar = (e.a) obj2;
                if (rVar == null) {
                    f.a("state");
                    throw null;
                } else if (aVar != null) {
                    if (aVar instanceof y0) {
                        e eVar = rVar.c;
                        Object[] objArr = rVar.a;
                        int i3 = rVar.f799b;
                        rVar.f799b = i3 + 1;
                        ((y0) aVar).a(eVar, objArr[i3]);
                    }
                    return rVar;
                } else {
                    f.a("element");
                    throw null;
                }
            } else if (i2 == 1) {
                r rVar2 = (r) obj;
                e.a aVar2 = (e.a) obj2;
                if (rVar2 == null) {
                    f.a("state");
                    throw null;
                } else if (aVar2 != null) {
                    if (aVar2 instanceof y0) {
                        Object a = ((y0) aVar2).a(rVar2.c);
                        Object[] objArr2 = rVar2.a;
                        int i4 = rVar2.f799b;
                        rVar2.f799b = i4 + 1;
                        objArr2[i4] = a;
                    }
                    return rVar2;
                } else {
                    f.a("element");
                    throw null;
                }
            } else {
                throw null;
            }
        }
    }

    /* renamed from: f.a.a.b$b  reason: collision with other inner class name */
    /* compiled from: ThreadContext.kt */
    public static final class C0018b extends g implements n.m.b.c<Object, e.a, Object> {
        public static final C0018b e = new C0018b();

        public C0018b() {
            super(2);
        }

        public Object a(Object obj, Object obj2) {
            e.a aVar = (e.a) obj2;
            if (aVar == null) {
                f.a("element");
                throw null;
            } else if (!(aVar instanceof y0)) {
                return obj;
            } else {
                if (!(obj instanceof Integer)) {
                    obj = null;
                }
                Integer num = (Integer) obj;
                int intValue = num != null ? num.intValue() : 1;
                if (intValue == 0) {
                    return aVar;
                }
                return Integer.valueOf(intValue + 1);
            }
        }
    }

    /* compiled from: ThreadContext.kt */
    public static final class c extends g implements n.m.b.c<y0<?>, e.a, y0<?>> {
        public static final c e = new c();

        public c() {
            super(2);
        }

        public Object a(Object obj, Object obj2) {
            y0 y0Var = (y0) obj;
            e.a aVar = (e.a) obj2;
            if (aVar == null) {
                f.a("element");
                throw null;
            } else if (y0Var != null) {
                return y0Var;
            } else {
                if (!(aVar instanceof y0)) {
                    aVar = null;
                }
                return (y0) aVar;
            }
        }
    }

    public static final Object a(e eVar) {
        if (eVar != null) {
            Object fold = eVar.fold(0, f788b);
            if (fold != null) {
                return fold;
            }
            f.a();
            throw null;
        }
        f.a("context");
        throw null;
    }

    public static final Object b(e eVar, Object obj) {
        if (eVar != null) {
            if (obj == null) {
                obj = a(eVar);
            }
            if (obj == 0) {
                return a;
            }
            if (obj instanceof Integer) {
                return eVar.fold(new r(eVar, ((Number) obj).intValue()), d);
            }
            if (obj != null) {
                return ((y0) obj).a(eVar);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
        f.a("context");
        throw null;
    }

    public static final void a(e eVar, Object obj) {
        if (eVar == null) {
            f.a("context");
            throw null;
        } else if (obj != a) {
            if (obj instanceof r) {
                ((r) obj).f799b = 0;
                eVar.fold(obj, e);
                return;
            }
            Object fold = eVar.fold(null, c);
            if (fold != null) {
                ((y0) fold).a(eVar, obj);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }
}
