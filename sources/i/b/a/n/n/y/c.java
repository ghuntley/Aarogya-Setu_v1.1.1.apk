package i.b.a.n.n.y;

import android.content.Context;
import android.net.Uri;
import i.b.a.n.g;
import i.b.a.n.l.p.b;
import i.b.a.n.n.n;
import i.b.a.n.n.o;
import i.b.a.n.n.r;
import i.b.a.s.d;
import java.io.InputStream;

/* compiled from: MediaStoreImageThumbLoader */
public class c implements n<Uri, InputStream> {
    public final Context a;

    /* compiled from: MediaStoreImageThumbLoader */
    public static class a implements o<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        public n<Uri, InputStream> a(r rVar) {
            return new c(this.a);
        }
    }

    public c(Context context) {
        this.a = context.getApplicationContext();
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        Uri uri = (Uri) obj;
        if (!g.a.a.b.a.a(i2, i3)) {
            return null;
        }
        d dVar = new d(uri);
        Context context = this.a;
        return new n.a(dVar, b.a(context, uri, new b.a(context.getContentResolver())));
    }

    public boolean a(Object obj) {
        Uri uri = (Uri) obj;
        return g.a.a.b.a.a(uri) && !uri.getPathSegments().contains("video");
    }
}
