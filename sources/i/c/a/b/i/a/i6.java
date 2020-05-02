package i.c.a.b.i.a;

/* compiled from: com.google.android.gms:play-services-measurement@@17.3.0 */
public final class i6 implements Runnable {
    public final /* synthetic */ String e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f3710f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3711g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ long f3712h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ t5 f3713i;

    public i6(t5 t5Var, String str, String str2, String str3, long j2) {
        this.f3713i = t5Var;
        this.e = str;
        this.f3710f = str2;
        this.f3711g = str3;
        this.f3712h = j2;
    }

    public final void run() {
        String str = this.e;
        if (str == null) {
            this.f3713i.a.f3896i.s().a(this.f3710f, (w7) null);
            return;
        }
        this.f3713i.a.f3896i.s().a(this.f3710f, new w7(this.f3711g, str, this.f3712h));
    }
}
