package i.c.d.h.g;

import i.c.d.h.c;
import i.c.d.h.e;
import i.c.d.h.f;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
public final class d {
    public static final e<String> c = a.a;
    public static final e<Boolean> d = b.a;
    public static final a e = new a((c) null);
    public final Map<Class<?>, c<?>> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final Map<Class<?>, e<?>> f4672b = new HashMap();

    /* compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
    public static final class a implements e<Date> {
        public static final DateFormat a;

        static {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            a = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }

        public /* synthetic */ a(c cVar) {
        }

        public void a(Object obj, Object obj2) {
            ((f) obj2).a(a.format((Date) obj));
        }
    }

    public d() {
        a(String.class, c);
        a(Boolean.class, d);
        a(Date.class, e);
    }

    public <T> d a(Class<T> cls, c<? super T> cVar) {
        if (!this.a.containsKey(cls)) {
            this.a.put(cls, cVar);
            return this;
        }
        StringBuilder a2 = i.a.a.a.a.a("Encoder already registered for ");
        a2.append(cls.getName());
        throw new IllegalArgumentException(a2.toString());
    }

    public <T> d a(Class<T> cls, e<? super T> eVar) {
        if (!this.f4672b.containsKey(cls)) {
            this.f4672b.put(cls, eVar);
            return this;
        }
        StringBuilder a2 = i.a.a.a.a.a("Encoder already registered for ");
        a2.append(cls.getName());
        throw new IllegalArgumentException(a2.toString());
    }
}
