package i.c.e.t.y;

import i.c.e.g;
import i.c.e.j;
import i.c.e.k;
import i.c.e.l;
import i.c.e.m;
import i.c.e.v.c;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: JsonTreeWriter */
public final class b extends c {
    public static final Writer s = new a();
    public static final m t = new m("closed");

    /* renamed from: p  reason: collision with root package name */
    public final List<j> f4891p = new ArrayList();

    /* renamed from: q  reason: collision with root package name */
    public String f4892q;
    public j r = k.a;

    /* compiled from: JsonTreeWriter */
    public class a extends Writer {
        public void close() {
            throw new AssertionError();
        }

        public void flush() {
            throw new AssertionError();
        }

        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public b() {
        super(s);
    }

    public final void a(j jVar) {
        if (this.f4892q != null) {
            if (jVar != null) {
                if (!(jVar instanceof k) || this.f4929m) {
                    ((l) s()).a.put(this.f4892q, jVar);
                }
                this.f4892q = null;
                return;
            }
            throw null;
        } else if (this.f4891p.isEmpty()) {
            this.r = jVar;
        } else {
            j s2 = s();
            if (s2 instanceof g) {
                g gVar = (g) s2;
                if (gVar != null) {
                    if (jVar == null) {
                        jVar = k.a;
                    }
                    gVar.e.add(jVar);
                    return;
                }
                throw null;
            }
            throw new IllegalStateException();
        }
    }

    public c b(String str) {
        if (this.f4891p.isEmpty() || this.f4892q != null) {
            throw new IllegalStateException();
        } else if (s() instanceof l) {
            this.f4892q = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public void close() {
        if (this.f4891p.isEmpty()) {
            this.f4891p.add(t);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d(String str) {
        if (str == null) {
            a((j) k.a);
            return this;
        }
        a((j) new m(str));
        return this;
    }

    public c e(long j2) {
        a((j) new m((Number) Long.valueOf(j2)));
        return this;
    }

    public c f() {
        g gVar = new g();
        a((j) gVar);
        this.f4891p.add(gVar);
        return this;
    }

    public void flush() {
    }

    public c h() {
        l lVar = new l();
        a((j) lVar);
        this.f4891p.add(lVar);
        return this;
    }

    public c j() {
        if (this.f4891p.isEmpty() || this.f4892q != null) {
            throw new IllegalStateException();
        } else if (s() instanceof g) {
            List<j> list = this.f4891p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c m() {
        if (this.f4891p.isEmpty() || this.f4892q != null) {
            throw new IllegalStateException();
        } else if (s() instanceof l) {
            List<j> list = this.f4891p;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public c q() {
        a((j) k.a);
        return this;
    }

    public final j s() {
        List<j> list = this.f4891p;
        return list.get(list.size() - 1);
    }

    public c a(Boolean bool) {
        if (bool == null) {
            a((j) k.a);
            return this;
        }
        a((j) new m(bool));
        return this;
    }

    public c a(Number number) {
        if (number == null) {
            a((j) k.a);
            return this;
        }
        if (!this.f4926j) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        a((j) new m(number));
        return this;
    }

    public c a(boolean z) {
        a((j) new m(Boolean.valueOf(z)));
        return this;
    }
}
