package q;

import q.k;

/* compiled from: lambda */
public final /* synthetic */ class b implements Runnable {
    private final /* synthetic */ k.b.a e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ f f5681f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Throwable f5682g;

    public /* synthetic */ b(k.b.a aVar, f fVar, Throwable th) {
        this.e = aVar;
        this.f5681f = fVar;
        this.f5682g = th;
    }

    public final void run() {
        this.e.a(this.f5681f, this.f5682g);
    }
}
