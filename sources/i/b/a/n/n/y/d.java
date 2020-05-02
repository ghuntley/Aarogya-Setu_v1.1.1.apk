package i.b.a.n.n.y;

import android.content.Context;
import android.net.Uri;
import i.b.a.n.g;
import i.b.a.n.l.p.b;
import i.b.a.n.n.n;
import i.b.a.n.n.o;
import i.b.a.n.n.r;
import i.b.a.n.o.c.a0;
import java.io.InputStream;

/* compiled from: MediaStoreVideoThumbLoader */
public class d implements n<Uri, InputStream> {
    public final Context a;

    /* compiled from: MediaStoreVideoThumbLoader */
    public static class a implements o<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        public n<Uri, InputStream> a(r rVar) {
            return new d(this.a);
        }
    }

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        Uri uri = (Uri) obj;
        if (g.a.a.b.a.a(i2, i3)) {
            Long l2 = (Long) gVar.a(a0.d);
            if (l2 != null && l2.longValue() == -1) {
                i.b.a.s.d dVar = new i.b.a.s.d(uri);
                Context context = this.a;
                return new n.a(dVar, b.a(context, uri, new b.C0080b(context.getContentResolver())));
            }
        }
        return null;
    }

    public boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return g.a.a.b.a.a(uri) && uri.getPathSegments().contains("video");
    }
}
