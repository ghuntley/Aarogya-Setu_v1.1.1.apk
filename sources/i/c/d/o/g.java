package i.c.d.o;

import android.content.Intent;
import i.c.a.b.l.h;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final /* synthetic */ class g implements Runnable {
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final Intent f4764f;

    /* renamed from: g  reason: collision with root package name */
    public final h f4765g;

    public g(e eVar, Intent intent, h hVar) {
        this.e = eVar;
        this.f4764f = intent;
        this.f4765g = hVar;
    }

    public final void run() {
        e eVar = this.e;
        Intent intent = this.f4764f;
        h hVar = this.f4765g;
        try {
            eVar.a(intent);
        } finally {
            hVar.a.a(null);
        }
    }
}
