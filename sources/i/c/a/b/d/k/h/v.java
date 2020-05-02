package i.c.a.b.d.k.h;

import android.os.Handler;
import i.c.a.b.d.k.h.c;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class v implements c.a {
    public final /* synthetic */ g a;

    public v(g gVar) {
        this.a = gVar;
    }

    public final void a(boolean z) {
        Handler handler = this.a.f3053m;
        handler.sendMessage(handler.obtainMessage(1, Boolean.valueOf(z)));
    }
}
