package i.c.a.b.d.l;

import android.app.Activity;
import android.content.Intent;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class z extends f {
    public final /* synthetic */ Intent e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Activity f3155f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f3156g;

    public z(Intent intent, Activity activity, int i2) {
        this.e = intent;
        this.f3155f = activity;
        this.f3156g = i2;
    }

    public final void a() {
        Intent intent = this.e;
        if (intent != null) {
            this.f3155f.startActivityForResult(intent, this.f3156g);
        }
    }
}
