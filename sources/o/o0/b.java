package o.o0;

import java.util.concurrent.ThreadFactory;

/* compiled from: lambda */
public final /* synthetic */ class b implements ThreadFactory {
    private final /* synthetic */ String a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ boolean f5379b;

    public /* synthetic */ b(String str, boolean z) {
        this.a = str;
        this.f5379b = z;
    }

    public final Thread newThread(Runnable runnable) {
        return e.a(this.a, this.f5379b, runnable);
    }
}
