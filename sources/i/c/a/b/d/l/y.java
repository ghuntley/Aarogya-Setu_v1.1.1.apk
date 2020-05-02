package i.c.a.b.d.l;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import h.h.e.a;
import h.l.d.e;
import h.l.d.o;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class y extends f {
    public final /* synthetic */ Intent e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Fragment f3153f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ int f3154g;

    public y(Intent intent, Fragment fragment, int i2) {
        this.e = intent;
        this.f3153f = fragment;
        this.f3154g = i2;
    }

    public final void a() {
        Intent intent = this.e;
        if (intent != null) {
            Fragment fragment = this.f3153f;
            int i2 = this.f3154g;
            o<?> oVar = fragment.w;
            if (oVar != null) {
                e eVar = e.this;
                eVar.f1952p = true;
                if (i2 == -1) {
                    try {
                        a.a(eVar, intent, -1, (Bundle) null);
                    } catch (Throwable th) {
                        eVar.f1952p = false;
                        throw th;
                    }
                } else {
                    e.b(i2);
                    a.a(eVar, intent, ((eVar.a(fragment) + 1) << 16) + (i2 & 65535), (Bundle) null);
                }
                eVar.f1952p = false;
                return;
            }
            throw new IllegalStateException(i.a.a.a.a.a("Fragment ", fragment, " not attached to Activity"));
        }
    }
}
