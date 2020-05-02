package o;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;
import o.o0.e;
import o.x;

/* compiled from: Request */
public final class f0 {
    public final y a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5307b;
    public final x c;
    @Nullable
    public final i0 d;
    public final Map<Class<?>, Object> e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public volatile i f5308f;

    public f0(a aVar) {
        this.a = aVar.a;
        this.f5307b = aVar.f5309b;
        x.a aVar2 = aVar.c;
        if (aVar2 != null) {
            this.c = new x(aVar2);
            this.d = aVar.d;
            this.e = e.a(aVar.e);
            return;
        }
        throw null;
    }

    public i a() {
        i iVar = this.f5308f;
        if (iVar != null) {
            return iVar;
        }
        i a2 = i.a(this.c);
        this.f5308f = a2;
        return a2;
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("Request{method=");
        a2.append(this.f5307b);
        a2.append(", url=");
        a2.append(this.a);
        a2.append(", tags=");
        a2.append(this.e);
        a2.append('}');
        return a2.toString();
    }

    /* compiled from: Request */
    public static class a {
        @Nullable
        public y a;

        /* renamed from: b  reason: collision with root package name */
        public String f5309b;
        public x.a c;
        @Nullable
        public i0 d;
        public Map<Class<?>, Object> e;

        public a() {
            this.e = Collections.emptyMap();
            this.f5309b = "GET";
            this.c = new x.a();
        }

        public a a(y yVar) {
            if (yVar != null) {
                this.a = yVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        public a a(String str, String str2) {
            x.a aVar = this.c;
            if (aVar != null) {
                x.b(str);
                x.a(str2, str);
                aVar.a(str);
                aVar.a.add(str);
                aVar.a.add(str2.trim());
                return this;
            }
            throw null;
        }

        public a(f0 f0Var) {
            Map<Class<?>, Object> map;
            this.e = Collections.emptyMap();
            this.a = f0Var.a;
            this.f5309b = f0Var.f5307b;
            this.d = f0Var.d;
            if (f0Var.e.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = new LinkedHashMap<>(f0Var.e);
            }
            this.e = map;
            this.c = f0Var.c.a();
        }

        public a a(String str, @Nullable i0 i0Var) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (i0Var == null || i.c.d.p.e.b(str)) {
                if (i0Var == null) {
                    if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
                        throw new IllegalArgumentException(i.a.a.a.a.a("method ", str, " must have a request body."));
                    }
                }
                this.f5309b = str;
                this.d = i0Var;
                return this;
            } else {
                throw new IllegalArgumentException(i.a.a.a.a.a("method ", str, " must not have a request body."));
            }
        }

        public <T> a a(Class<? super T> cls, @Nullable T t) {
            if (cls != null) {
                if (t == null) {
                    this.e.remove(cls);
                } else {
                    if (this.e.isEmpty()) {
                        this.e = new LinkedHashMap();
                    }
                    this.e.put(cls, cls.cast(t));
                }
                return this;
            }
            throw new NullPointerException("type == null");
        }

        public f0 a() {
            if (this.a != null) {
                return new f0(this);
            }
            throw new IllegalStateException("url == null");
        }
    }
}
