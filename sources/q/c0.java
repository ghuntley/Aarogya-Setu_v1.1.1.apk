package q;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.a0;
import o.x;
import o.y;

/* compiled from: RequestFactory */
public final class c0 {
    public final Method a;

    /* renamed from: b  reason: collision with root package name */
    public final y f5693b;
    public final String c;
    @Nullable
    public final String d;
    @Nullable
    public final x e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final a0 f5694f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5695g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5696h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f5697i;

    /* renamed from: j  reason: collision with root package name */
    public final z<?>[] f5698j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f5699k;

    public c0(a aVar) {
        this.a = aVar.f5700b;
        this.f5693b = aVar.a.c;
        this.c = aVar.f5709n;
        this.d = aVar.r;
        this.e = aVar.s;
        this.f5694f = aVar.t;
        this.f5695g = aVar.f5710o;
        this.f5696h = aVar.f5711p;
        this.f5697i = aVar.f5712q;
        this.f5698j = aVar.v;
        this.f5699k = aVar.w;
    }

    /* compiled from: RequestFactory */
    public static final class a {
        public static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        public static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
        public final e0 a;

        /* renamed from: b  reason: collision with root package name */
        public final Method f5700b;
        public final Annotation[] c;
        public final Annotation[][] d;
        public final Type[] e;

        /* renamed from: f  reason: collision with root package name */
        public boolean f5701f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f5702g;

        /* renamed from: h  reason: collision with root package name */
        public boolean f5703h;

        /* renamed from: i  reason: collision with root package name */
        public boolean f5704i;

        /* renamed from: j  reason: collision with root package name */
        public boolean f5705j;

        /* renamed from: k  reason: collision with root package name */
        public boolean f5706k;

        /* renamed from: l  reason: collision with root package name */
        public boolean f5707l;

        /* renamed from: m  reason: collision with root package name */
        public boolean f5708m;
        @Nullable

        /* renamed from: n  reason: collision with root package name */
        public String f5709n;

        /* renamed from: o  reason: collision with root package name */
        public boolean f5710o;

        /* renamed from: p  reason: collision with root package name */
        public boolean f5711p;

        /* renamed from: q  reason: collision with root package name */
        public boolean f5712q;
        @Nullable
        public String r;
        @Nullable
        public x s;
        @Nullable
        public a0 t;
        @Nullable
        public Set<String> u;
        @Nullable
        public z<?>[] v;
        public boolean w;

        public a(e0 e0Var, Method method) {
            this.a = e0Var;
            this.f5700b = method;
            this.c = method.getAnnotations();
            this.e = method.getGenericParameterTypes();
            this.d = method.getParameterAnnotations();
        }

        public final void a(String str, String str2, boolean z) {
            String str3 = this.f5709n;
            if (str3 == null) {
                this.f5709n = str;
                this.f5710o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (x.matcher(substring).find()) {
                            throw i0.a(this.f5700b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.r = str2;
                    Matcher matcher = x.matcher(str2);
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    while (matcher.find()) {
                        linkedHashSet.add(matcher.group(1));
                    }
                    this.u = linkedHashSet;
                    return;
                }
                return;
            }
            throw i0.a(this.f5700b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        public final void a(int i2, Type type) {
            if (i0.c(type)) {
                throw i0.a(this.f5700b, i2, "Parameter type must not include a type variable or wildcard: %s", type);
            }
        }

        public static Class<?> a(Class<?> cls) {
            if (Boolean.TYPE == cls) {
                return Boolean.class;
            }
            if (Byte.TYPE == cls) {
                return Byte.class;
            }
            if (Character.TYPE == cls) {
                return Character.class;
            }
            if (Double.TYPE == cls) {
                return Double.class;
            }
            if (Float.TYPE == cls) {
                return Float.class;
            }
            if (Integer.TYPE == cls) {
                return Integer.class;
            }
            if (Long.TYPE == cls) {
                return Long.class;
            }
            return Short.TYPE == cls ? Short.class : cls;
        }
    }
}
