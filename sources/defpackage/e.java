package defpackage;

import java.lang.reflect.Constructor;
import kotlin.TypeCastException;
import n.m.b.b;
import n.m.c.f;
import n.m.c.g;

/* renamed from: e  reason: default package */
/* compiled from: com.android.tools.r8.jetbrains.kotlin-style lambda group */
public final class e extends g implements b<Throwable, Throwable> {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f784f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(int i2, Object obj) {
        super(1);
        this.e = i2;
        this.f784f = obj;
    }

    public final Object a(Object obj) {
        Object obj2;
        Object obj3;
        Throwable th;
        Throwable th2;
        int i2 = this.e;
        Object obj4 = null;
        if (i2 == 0) {
            Throwable th3 = (Throwable) obj;
            if (th3 != null) {
                try {
                    Constructor constructor = (Constructor) this.f784f;
                    Object newInstance = constructor.newInstance(new Object[]{th3.getMessage(), th3});
                    if (newInstance != null) {
                        obj2 = (Throwable) newInstance;
                        if (!n.e.c(obj2)) {
                            obj4 = obj2;
                        }
                        return (Throwable) obj4;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
                } catch (Throwable th4) {
                    obj2 = i.c.d.p.e.a(th4);
                }
            } else {
                f.a("e");
                throw null;
            }
        } else if (i2 == 1) {
            Throwable th5 = (Throwable) obj;
            if (th5 != null) {
                try {
                    Object newInstance2 = ((Constructor) this.f784f).newInstance(new Object[]{th5});
                    if (newInstance2 != null) {
                        obj3 = (Throwable) newInstance2;
                        if (!n.e.c(obj3)) {
                            obj4 = obj3;
                        }
                        return (Throwable) obj4;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
                } catch (Throwable th6) {
                    obj3 = i.c.d.p.e.a(th6);
                }
            } else {
                f.a("e");
                throw null;
            }
        } else if (i2 == 2) {
            Throwable th7 = (Throwable) obj;
            if (th7 != null) {
                try {
                    Constructor constructor2 = (Constructor) this.f784f;
                    Object newInstance3 = constructor2.newInstance(new Object[]{th7.getMessage()});
                    if (newInstance3 != null) {
                        Throwable th8 = (Throwable) newInstance3;
                        th8.initCause(th7);
                        th = th8;
                        if (!n.e.c(th)) {
                            obj4 = th;
                        }
                        return (Throwable) obj4;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
                } catch (Throwable th9) {
                    th = i.c.d.p.e.a(th9);
                }
            } else {
                f.a("e");
                throw null;
            }
        } else if (i2 == 3) {
            Throwable th10 = (Throwable) obj;
            if (th10 != null) {
                try {
                    Object newInstance4 = ((Constructor) this.f784f).newInstance(new Object[0]);
                    if (newInstance4 != null) {
                        Throwable th11 = (Throwable) newInstance4;
                        th11.initCause(th10);
                        th2 = th11;
                        if (!n.e.c(th2)) {
                            obj4 = th2;
                        }
                        return (Throwable) obj4;
                    }
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.Throwable");
                } catch (Throwable th12) {
                    th2 = i.c.d.p.e.a(th12);
                }
            } else {
                f.a("e");
                throw null;
            }
        } else {
            throw null;
        }
    }
}
