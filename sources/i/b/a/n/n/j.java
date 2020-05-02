package i.b.a.n.n;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders */
public final class j implements h {

    /* renamed from: b  reason: collision with root package name */
    public final Map<String, List<i>> f2687b;
    public volatile Map<String, String> c;

    /* compiled from: LazyHeaders */
    public static final class a {

        /* renamed from: b  reason: collision with root package name */
        public static final String f2688b;
        public static final Map<String, List<i>> c;
        public Map<String, List<i>> a = c;

        static {
            String property = System.getProperty("http.agent");
            if (!TextUtils.isEmpty(property)) {
                int length = property.length();
                StringBuilder sb = new StringBuilder(property.length());
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = property.charAt(i2);
                    if ((charAt > 31 || charAt == 9) && charAt < 127) {
                        sb.append(charAt);
                    } else {
                        sb.append('?');
                    }
                }
                property = sb.toString();
            }
            f2688b = property;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(f2688b)) {
                hashMap.put(l.a.a.a.o.b.a.HEADER_USER_AGENT, Collections.singletonList(new b(f2688b)));
            }
            c = Collections.unmodifiableMap(hashMap);
        }
    }

    /* compiled from: LazyHeaders */
    public static final class b implements i {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            StringBuilder a2 = i.a.a.a.a.a("StringHeaderFactory{value='");
            a2.append(this.a);
            a2.append('\'');
            a2.append('}');
            return a2.toString();
        }
    }

    public j(Map<String, List<i>> map) {
        this.f2687b = Collections.unmodifiableMap(map);
    }

    public Map<String, String> a() {
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    this.c = Collections.unmodifiableMap(b());
                }
            }
        }
        return this.c;
    }

    public final Map<String, String> b() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.f2687b.entrySet()) {
            List list = (List) next.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                String a2 = ((i) list.get(i2)).a();
                if (!TextUtils.isEmpty(a2)) {
                    sb.append(a2);
                    if (i2 != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(next.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f2687b.equals(((j) obj).f2687b);
        }
        return false;
    }

    public int hashCode() {
        return this.f2687b.hashCode();
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("LazyHeaders{headers=");
        a2.append(this.f2687b);
        a2.append('}');
        return a2.toString();
    }
}
