package i.c.a.b.i.a;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class p7 implements Runnable {
    public final /* synthetic */ boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Uri f3832f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ String f3833g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f3834h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ q7 f3835i;

    public p7(q7 q7Var, boolean z, Uri uri, String str, String str2) {
        this.f3835i = q7Var;
        this.e = z;
        this.f3832f = uri;
        this.f3833g = str;
        this.f3834h = str2;
    }

    public final void run() {
        this.f3835i.a(this.e, this.f3832f, this.f3833g, this.f3834h);
    }
}
