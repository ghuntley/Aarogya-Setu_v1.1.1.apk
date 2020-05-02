package b.a.a.l;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import n.m.b.b;
import n.m.c.f;

/* compiled from: CorUtility.kt */
public final class q extends ClickableSpan {
    public final /* synthetic */ b e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ URLSpan f437f;

    public q(b bVar, URLSpan uRLSpan) {
        this.e = bVar;
        this.f437f = uRLSpan;
    }

    public void onClick(View view) {
        if (view != null) {
            b bVar = this.e;
            String url = this.f437f.getURL();
            f.a((Object) url, "span.url");
            bVar.a(url);
            return;
        }
        f.a("widget");
        throw null;
    }
}
