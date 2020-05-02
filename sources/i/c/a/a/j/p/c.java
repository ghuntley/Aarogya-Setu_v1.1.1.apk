package i.c.a.a.j.p;

import android.content.Context;
import i.c.a.a.j.t.a;

/* compiled from: com.google.android.datatransport:transport-runtime@@2.2.0 */
public final class c extends h {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2953b;
    public final a c;
    public final String d;

    public c(Context context, a aVar, a aVar2, String str) {
        if (context != null) {
            this.a = context;
            if (aVar != null) {
                this.f2953b = aVar;
                if (aVar2 != null) {
                    this.c = aVar2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        c cVar = (c) ((h) obj);
        if (!this.a.equals(cVar.a) || !this.f2953b.equals(cVar.f2953b) || !this.c.equals(cVar.c) || !this.d.equals(cVar.d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.f2953b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("CreationContext{applicationContext=");
        a2.append(this.a);
        a2.append(", wallClock=");
        a2.append(this.f2953b);
        a2.append(", monotonicClock=");
        a2.append(this.c);
        a2.append(", backendName=");
        return i.a.a.a.a.a(a2, this.d, "}");
    }
}
