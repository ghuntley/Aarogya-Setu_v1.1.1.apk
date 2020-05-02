package h.s;

import android.content.Context;
import h.s.h;
import h.v.a.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: DatabaseConfiguration */
public class a {
    public final c.C0069c a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f2154b;
    public final String c;
    public final h.d d;
    public final List<h.b> e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2155f;

    /* renamed from: g  reason: collision with root package name */
    public final h.c f2156g;

    /* renamed from: h  reason: collision with root package name */
    public final Executor f2157h;

    /* renamed from: i  reason: collision with root package name */
    public final Executor f2158i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f2159j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f2160k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f2161l;

    /* renamed from: m  reason: collision with root package name */
    public final Set<Integer> f2162m;

    public a(Context context, String str, c.C0069c cVar, h.d dVar, List<h.b> list, boolean z, h.c cVar2, Executor executor, Executor executor2, boolean z2, boolean z3, boolean z4, Set<Integer> set, String str2, File file) {
        this.a = cVar;
        this.f2154b = context;
        this.c = str;
        this.d = dVar;
        this.e = list;
        this.f2155f = z;
        this.f2156g = cVar2;
        this.f2157h = executor;
        this.f2158i = executor2;
        this.f2159j = z2;
        this.f2160k = z3;
        this.f2161l = z4;
        this.f2162m = set;
    }

    public boolean a(int i2, int i3) {
        Set<Integer> set;
        if ((!(i2 > i3) || !this.f2161l) && this.f2160k && ((set = this.f2162m) == null || !set.contains(Integer.valueOf(i2)))) {
            return true;
        }
        return false;
    }
}
