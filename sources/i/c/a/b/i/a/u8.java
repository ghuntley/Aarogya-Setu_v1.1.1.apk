package i.c.a.b.i.a;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class u8 implements Runnable {
    public final /* synthetic */ ComponentName e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ s8 f3911f;

    public u8(s8 s8Var, ComponentName componentName) {
        this.f3911f = s8Var;
        this.e = componentName;
    }

    public final void run() {
        z7.a(this.f3911f.c, this.e);
    }
}
