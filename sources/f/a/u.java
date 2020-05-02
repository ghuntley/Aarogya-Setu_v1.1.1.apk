package f.a;

import n.k.a;
import n.k.e;
import n.m.b.c;
import n.m.c.f;
import n.q.d;

/* compiled from: CoroutineContext.kt */
public final class u extends a implements y0<String> {
    public final long e;

    public void a(e eVar, Object obj) {
        String str = (String) obj;
        if (eVar == null) {
            f.a("context");
            throw null;
        } else if (str != null) {
            Thread currentThread = Thread.currentThread();
            f.a((Object) currentThread, "Thread.currentThread()");
            currentThread.setName(str);
        } else {
            f.a("oldState");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u) {
                if (0 == ((u) obj).e) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public <R> R fold(R r, c<? super R, ? super e.a, ? extends R> cVar) {
        if (cVar != null) {
            return e.a.C0149a.a(this, r, cVar);
        }
        f.a("operation");
        throw null;
    }

    public <E extends e.a> E get(e.b<E> bVar) {
        if (bVar != null) {
            return e.a.C0149a.a((e.a) this, bVar);
        }
        f.a("key");
        throw null;
    }

    public int hashCode() {
        return (int) 0;
    }

    public e minusKey(e.b<?> bVar) {
        if (bVar != null) {
            return e.a.C0149a.b(this, bVar);
        }
        f.a("key");
        throw null;
    }

    public e plus(e eVar) {
        if (eVar != null) {
            return e.a.C0149a.a((e.a) this, eVar);
        }
        f.a("context");
        throw null;
    }

    public String toString() {
        return "CoroutineId(0)";
    }

    public Object a(e eVar) {
        if (eVar != null) {
            v vVar = (v) eVar.get(v.f864f);
            Thread currentThread = Thread.currentThread();
            f.a((Object) currentThread, "currentThread");
            String name = currentThread.getName();
            f.a((Object) name, "oldName");
            int lastIndexOf = name.lastIndexOf(" @", d.a(name));
            if (lastIndexOf < 0) {
                lastIndexOf = name.length();
            }
            StringBuilder sb = new StringBuilder(9 + lastIndexOf + 10);
            String substring = name.substring(0, lastIndexOf);
            f.a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            sb.append(substring);
            sb.append(" @");
            sb.append("coroutine");
            sb.append('#');
            sb.append(0);
            String sb2 = sb.toString();
            f.a((Object) sb2, "StringBuilder(capacity).…builderAction).toString()");
            currentThread.setName(sb2);
            return name;
        }
        f.a("context");
        throw null;
    }
}
