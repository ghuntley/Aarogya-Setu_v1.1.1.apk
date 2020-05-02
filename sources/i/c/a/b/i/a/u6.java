package i.c.a.b.i.a;

import android.content.Context;
import android.os.Bundle;
import i.c.a.b.d.l.q;
import i.c.a.b.g.g.pc;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class u6 {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public String f3907b;
    public String c;
    public String d;
    public Boolean e;

    /* renamed from: f  reason: collision with root package name */
    public long f3908f;

    /* renamed from: g  reason: collision with root package name */
    public pc f3909g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f3910h = true;

    public u6(Context context, pc pcVar) {
        q.a(context);
        Context applicationContext = context.getApplicationContext();
        q.a(applicationContext);
        this.a = applicationContext;
        if (pcVar != null) {
            this.f3909g = pcVar;
            this.f3907b = pcVar.f3406j;
            this.c = pcVar.f3405i;
            this.d = pcVar.f3404h;
            this.f3910h = pcVar.f3403g;
            this.f3908f = pcVar.f3402f;
            Bundle bundle = pcVar.f3407k;
            if (bundle != null) {
                this.e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
