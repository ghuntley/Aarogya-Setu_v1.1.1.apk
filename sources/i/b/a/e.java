package i.b.a;

import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.Registry;
import i.b.a.c;
import i.b.a.d;
import i.b.a.n.m.b0.b;
import i.b.a.n.m.l;
import i.b.a.r.d;
import i.b.a.r.h.f;
import java.util.List;
import java.util.Map;

/* compiled from: GlideContext */
public class e extends ContextWrapper {

    /* renamed from: k  reason: collision with root package name */
    public static final k<?, ?> f2408k = new b();
    public final b a;

    /* renamed from: b  reason: collision with root package name */
    public final Registry f2409b;
    public final f c;
    public final c.a d;
    public final List<d<Object>> e;

    /* renamed from: f  reason: collision with root package name */
    public final Map<Class<?>, k<?, ?>> f2410f;

    /* renamed from: g  reason: collision with root package name */
    public final l f2411g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f2412h;

    /* renamed from: i  reason: collision with root package name */
    public final int f2413i;

    /* renamed from: j  reason: collision with root package name */
    public i.b.a.r.e f2414j;

    public e(Context context, b bVar, Registry registry, f fVar, c.a aVar, Map<Class<?>, k<?, ?>> map, List<d<Object>> list, l lVar, boolean z, int i2) {
        super(context.getApplicationContext());
        this.a = bVar;
        this.f2409b = registry;
        this.c = fVar;
        this.d = aVar;
        this.e = list;
        this.f2410f = map;
        this.f2411g = lVar;
        this.f2412h = z;
        this.f2413i = i2;
    }

    public synchronized i.b.a.r.e a() {
        if (this.f2414j == null) {
            if (((d.a) this.d) != null) {
                i.b.a.r.e eVar = new i.b.a.r.e();
                eVar.x = true;
                this.f2414j = eVar;
            } else {
                throw null;
            }
        }
        return this.f2414j;
    }
}
