package o;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import o.o0.e;
import p.f;
import p.g;

/* compiled from: FormBody */
public final class v extends i0 {
    public static final a0 c = a0.a("application/x-www-form-urlencoded");
    public final List<String> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f5619b;

    /* compiled from: FormBody */
    public static final class a {
        public final List<String> a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f5620b = new ArrayList();
        @Nullable
        public final Charset c = null;
    }

    public v(List<String> list, List<String> list2) {
        this.a = e.a(list);
        this.f5619b = e.a(list2);
    }

    public long a() {
        return a((g) null, true);
    }

    public a0 b() {
        return c;
    }

    public void a(g gVar) {
        a(gVar, false);
    }

    public final long a(@Nullable g gVar, boolean z) {
        f fVar;
        if (z) {
            fVar = new f();
        } else {
            fVar = gVar.b();
        }
        int size = this.a.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (i2 > 0) {
                fVar.writeByte(38);
            }
            fVar.a(this.a.get(i2));
            fVar.writeByte(61);
            fVar.a(this.f5619b.get(i2));
        }
        if (!z) {
            return 0;
        }
        long j2 = fVar.f5646f;
        fVar.h();
        return j2;
    }
}
