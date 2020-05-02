package h.a0;

import android.net.Uri;
import java.util.HashSet;
import java.util.Set;

/* compiled from: ContentUriTriggers */
public final class d {
    public final Set<a> a = new HashSet();

    /* compiled from: ContentUriTriggers */
    public static final class a {
        public final Uri a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f910b;

        public a(Uri uri, boolean z) {
            this.a = uri;
            this.f910b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f910b != aVar.f910b || !this.a.equals(aVar.a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + (this.f910b ? 1 : 0);
        }
    }

    public int a() {
        return this.a.size();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((d) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
