package i.c.d.k;

import android.os.Bundle;
import i.c.a.b.l.h;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-iid@@20.1.2 */
public final /* synthetic */ class g1 implements Runnable {
    public final d1 e;

    /* renamed from: f  reason: collision with root package name */
    public final String f4694f;

    /* renamed from: g  reason: collision with root package name */
    public final String f4695g;

    /* renamed from: h  reason: collision with root package name */
    public final String f4696h;

    /* renamed from: i  reason: collision with root package name */
    public final Bundle f4697i;

    /* renamed from: j  reason: collision with root package name */
    public final h f4698j;

    public g1(d1 d1Var, String str, String str2, String str3, Bundle bundle, h hVar) {
        this.e = d1Var;
        this.f4694f = str;
        this.f4695g = str2;
        this.f4696h = str3;
        this.f4697i = bundle;
        this.f4698j = hVar;
    }

    public final void run() {
        d1 d1Var = this.e;
        String str = this.f4694f;
        String str2 = this.f4695g;
        String str3 = this.f4696h;
        Bundle bundle = this.f4697i;
        h hVar = this.f4698j;
        if (d1Var != null) {
            try {
                d1Var.b(str, str2, str3, bundle);
                hVar.a.a(d1Var.c.a(bundle));
            } catch (IOException e2) {
                hVar.a.a((Exception) e2);
            }
        } else {
            throw null;
        }
    }
}
