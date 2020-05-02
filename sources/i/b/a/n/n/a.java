package i.b.a.n.n;

import android.content.res.AssetManager;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import i.b.a.n.g;
import i.b.a.n.l.d;
import i.b.a.n.l.h;
import i.b.a.n.l.n;
import i.b.a.n.n.n;
import java.io.InputStream;

/* compiled from: AssetUriLoader */
public class a<Data> implements n<Uri, Data> {
    public final AssetManager a;

    /* renamed from: b  reason: collision with root package name */
    public final C0088a<Data> f2677b;

    /* renamed from: i.b.a.n.n.a$a  reason: collision with other inner class name */
    /* compiled from: AssetUriLoader */
    public interface C0088a<Data> {
        d<Data> a(AssetManager assetManager, String str);
    }

    /* compiled from: AssetUriLoader */
    public static class b implements o<Uri, ParcelFileDescriptor>, C0088a<ParcelFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        public n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new a(this.a, this);
        }

        public d<ParcelFileDescriptor> a(AssetManager assetManager, String str) {
            return new h(assetManager, str);
        }
    }

    /* compiled from: AssetUriLoader */
    public static class c implements o<Uri, InputStream>, C0088a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        public n<Uri, InputStream> a(r rVar) {
            return new a(this.a, this);
        }

        public d<InputStream> a(AssetManager assetManager, String str) {
            return new n(assetManager, str);
        }
    }

    public a(AssetManager assetManager, C0088a<Data> aVar) {
        this.a = assetManager;
        this.f2677b = aVar;
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        Uri uri = (Uri) obj;
        return new n.a(new i.b.a.s.d(uri), this.f2677b.a(this.a, uri.toString().substring(22)));
    }

    public boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
