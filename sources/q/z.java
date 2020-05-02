package q;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
import o.b0;
import o.i0;
import o.x;

/* compiled from: ParameterHandler */
public abstract class z<T> {

    /* compiled from: ParameterHandler */
    public static final class a<T> extends z<T> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5745b;
        public final j<T, i0> c;

        public a(Method method, int i2, j<T, i0> jVar) {
            this.a = method;
            this.f5745b = i2;
            this.c = jVar;
        }

        public void a(b0 b0Var, @Nullable T t) {
            if (t != null) {
                try {
                    b0Var.f5691k = this.c.a(t);
                } catch (IOException e) {
                    Method method = this.a;
                    int i2 = this.f5745b;
                    throw i0.a(method, e, i2, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            } else {
                throw i0.a(this.a, this.f5745b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class b<T> extends z<T> {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final j<T, String> f5746b;
        public final boolean c;

        public b(String str, j<T, String> jVar, boolean z) {
            this.a = (String) Objects.requireNonNull(str, "name == null");
            this.f5746b = jVar;
            this.c = z;
        }

        public void a(b0 b0Var, @Nullable T t) {
            String a2;
            if (t != null && (a2 = this.f5746b.a(t)) != null) {
                b0Var.a(this.a, a2, this.c);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class c<T> extends z<Map<String, T>> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5747b;
        public final j<T, String> c;
        public final boolean d;

        public c(Method method, int i2, j<T, String> jVar, boolean z) {
            this.a = method;
            this.f5747b = i2;
            this.c = jVar;
            this.d = z;
        }

        public void a(b0 b0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String a2 = this.c.a(value);
                            if (a2 != null) {
                                b0Var.a(str, a2, this.d);
                            } else {
                                Method method = this.a;
                                int i2 = this.f5747b;
                                throw i0.a(method, i2, "Field map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw i0.a(this.a, this.f5747b, i.a.a.a.a.a("Field map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw i0.a(this.a, this.f5747b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw i0.a(this.a, this.f5747b, "Field map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class d<T> extends z<T> {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final j<T, String> f5748b;

        public d(String str, j<T, String> jVar) {
            this.a = (String) Objects.requireNonNull(str, "name == null");
            this.f5748b = jVar;
        }

        public void a(b0 b0Var, @Nullable T t) {
            String a2;
            if (t != null && (a2 = this.f5748b.a(t)) != null) {
                b0Var.a(this.a, a2);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class e<T> extends z<Map<String, T>> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5749b;
        public final j<T, String> c;

        public e(Method method, int i2, j<T, String> jVar) {
            this.a = method;
            this.f5749b = i2;
            this.c = jVar;
        }

        public void a(b0 b0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            b0Var.a(str, this.c.a(value));
                        } else {
                            throw i0.a(this.a, this.f5749b, i.a.a.a.a.a("Header map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw i0.a(this.a, this.f5749b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw i0.a(this.a, this.f5749b, "Header map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class f extends z<x> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5750b;

        public f(Method method, int i2) {
            this.a = method;
            this.f5750b = i2;
        }

        public void a(b0 b0Var, @Nullable Object obj) {
            x xVar = (x) obj;
            if (xVar != null) {
                x.a aVar = b0Var.f5686f;
                if (aVar != null) {
                    int b2 = xVar.b();
                    for (int i2 = 0; i2 < b2; i2++) {
                        aVar.b(xVar.a(i2), xVar.b(i2));
                    }
                    return;
                }
                throw null;
            }
            throw i0.a(this.a, this.f5750b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class g<T> extends z<T> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5751b;
        public final x c;
        public final j<T, i0> d;

        public g(Method method, int i2, x xVar, j<T, i0> jVar) {
            this.a = method;
            this.f5751b = i2;
            this.c = xVar;
            this.d = jVar;
        }

        public void a(b0 b0Var, @Nullable T t) {
            if (t != null) {
                try {
                    b0Var.a(this.c, this.d.a(t));
                } catch (IOException e) {
                    Method method = this.a;
                    int i2 = this.f5751b;
                    throw i0.a(method, i2, "Unable to convert " + t + " to RequestBody", e);
                }
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class h<T> extends z<Map<String, T>> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5752b;
        public final j<T, i0> c;
        public final String d;

        public h(Method method, int i2, j<T, i0> jVar, String str) {
            this.a = method;
            this.f5752b = i2;
            this.c = jVar;
            this.d = str;
        }

        public void a(b0 b0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            b0Var.a(x.a("Content-Disposition", i.a.a.a.a.a("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", this.d), this.c.a(value));
                        } else {
                            throw i0.a(this.a, this.f5752b, i.a.a.a.a.a("Part map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw i0.a(this.a, this.f5752b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw i0.a(this.a, this.f5752b, "Part map was null.", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class i<T> extends z<T> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5753b;
        public final String c;
        public final j<T, String> d;
        public final boolean e;

        public i(Method method, int i2, String str, j<T, String> jVar, boolean z) {
            this.a = method;
            this.f5753b = i2;
            this.c = (String) Objects.requireNonNull(str, "name == null");
            this.d = jVar;
            this.e = z;
        }

        public void a(b0 b0Var, @Nullable T t) {
            String str;
            int i2;
            b0 b0Var2 = b0Var;
            T t2 = t;
            if (t2 != null) {
                String str2 = this.c;
                String a2 = this.d.a(t2);
                boolean z = this.e;
                if (b0Var2.c != null) {
                    int length = a2.length();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            str = a2;
                            break;
                        }
                        int codePointAt = a2.codePointAt(i3);
                        i2 = 47;
                        if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                            p.f fVar = new p.f();
                            fVar.a(a2, 0, i3);
                            p.f fVar2 = null;
                        } else {
                            i3 += Character.charCount(codePointAt);
                        }
                    }
                    p.f fVar3 = new p.f();
                    fVar3.a(a2, 0, i3);
                    p.f fVar22 = null;
                    while (i3 < length) {
                        int codePointAt2 = a2.codePointAt(i3);
                        if (!z || !(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                            if (codePointAt2 < 32 || codePointAt2 >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != -1 || (!z && (codePointAt2 == i2 || codePointAt2 == 37))) {
                                if (fVar22 == null) {
                                    fVar22 = new p.f();
                                }
                                fVar22.c(codePointAt2);
                                while (!fVar22.l()) {
                                    byte readByte = fVar22.readByte() & 255;
                                    fVar3.writeByte(37);
                                    fVar3.writeByte((int) b0.f5683l[(readByte >> 4) & 15]);
                                    fVar3.writeByte((int) b0.f5683l[readByte & 15]);
                                }
                            } else {
                                fVar3.c(codePointAt2);
                            }
                        }
                        i3 += Character.charCount(codePointAt2);
                        i2 = 47;
                    }
                    str = fVar3.s();
                    String str3 = b0Var2.c;
                    String replace = str3.replace("{" + str2 + "}", str);
                    if (!b0.f5684m.matcher(replace).matches()) {
                        b0Var2.c = replace;
                        return;
                    }
                    throw new IllegalArgumentException(i.a.a.a.a.b("@Path parameters shouldn't perform path traversal ('.' or '..'): ", a2));
                }
                throw new AssertionError();
            }
            throw i0.a(this.a, this.f5753b, i.a.a.a.a.a(i.a.a.a.a.a("Path parameter \""), this.c, "\" value must not be null."), new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class j<T> extends z<T> {
        public final String a;

        /* renamed from: b  reason: collision with root package name */
        public final j<T, String> f5754b;
        public final boolean c;

        public j(String str, j<T, String> jVar, boolean z) {
            this.a = (String) Objects.requireNonNull(str, "name == null");
            this.f5754b = jVar;
            this.c = z;
        }

        public void a(b0 b0Var, @Nullable T t) {
            String a2;
            if (t != null && (a2 = this.f5754b.a(t)) != null) {
                b0Var.b(this.a, a2, this.c);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class k<T> extends z<Map<String, T>> {
        public final Method a;

        /* renamed from: b  reason: collision with root package name */
        public final int f5755b;
        public final j<T, String> c;
        public final boolean d;

        public k(Method method, int i2, j<T, String> jVar, boolean z) {
            this.a = method;
            this.f5755b = i2;
            this.c = jVar;
            this.d = z;
        }

        public void a(b0 b0Var, @Nullable Object obj) {
            Map map = (Map) obj;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String a2 = this.c.a(value);
                            if (a2 != null) {
                                b0Var.b(str, a2, this.d);
                            } else {
                                Method method = this.a;
                                int i2 = this.f5755b;
                                throw i0.a(method, i2, "Query map value '" + value + "' converted to null by " + this.c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            throw i0.a(this.a, this.f5755b, i.a.a.a.a.a("Query map contained null value for key '", str, "'."), new Object[0]);
                        }
                    } else {
                        throw i0.a(this.a, this.f5755b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw i0.a(this.a, this.f5755b, "Query map was null", new Object[0]);
        }
    }

    /* compiled from: ParameterHandler */
    public static final class l<T> extends z<T> {
        public final j<T, String> a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f5756b;

        public l(j<T, String> jVar, boolean z) {
            this.a = jVar;
            this.f5756b = z;
        }

        public void a(b0 b0Var, @Nullable T t) {
            if (t != null) {
                b0Var.b(this.a.a(t), (String) null, this.f5756b);
            }
        }
    }

    /* compiled from: ParameterHandler */
    public static final class m extends z<b0.b> {
        public static final m a = new m();

        public void a(b0 b0Var, @Nullable Object obj) {
            b0.b bVar = (b0.b) obj;
            if (bVar != null) {
                b0.a aVar = b0Var.f5689i;
                if (aVar != null) {
                    aVar.c.add(bVar);
                    return;
                }
                throw null;
            }
        }
    }

    public abstract void a(b0 b0Var, @Nullable T t);
}
