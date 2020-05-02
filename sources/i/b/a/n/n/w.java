package i.b.a.n.n;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import i.b.a.n.g;
import i.b.a.n.l.i;
import i.b.a.n.l.o;
import i.b.a.n.n.n;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: UriLoader */
public class w<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    public static final Set<String> f2705b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"file", "android.resource", "content"})));
    public final c<Data> a;

    /* compiled from: UriLoader */
    public static final class a implements o<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public n<Uri, AssetFileDescriptor> a(r rVar) {
            return new w(this);
        }

        public i.b.a.n.l.d<AssetFileDescriptor> a(Uri uri) {
            return new i.b.a.n.l.a(this.a, uri);
        }
    }

    /* compiled from: UriLoader */
    public static class b implements o<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;

        public b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public i.b.a.n.l.d<ParcelFileDescriptor> a(Uri uri) {
            return new i(this.a, uri);
        }

        public n<Uri, ParcelFileDescriptor> a(r rVar) {
            return new w(this);
        }
    }

    /* compiled from: UriLoader */
    public interface c<Data> {
        i.b.a.n.l.d<Data> a(Uri uri);
    }

    /* compiled from: UriLoader */
    public static class d implements o<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;

        public d(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public i.b.a.n.l.d<InputStream> a(Uri uri) {
            return new o(this.a, uri);
        }

        public n<Uri, InputStream> a(r rVar) {
            return new w(this);
        }
    }

    public w(c<Data> cVar) {
        this.a = cVar;
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        Uri uri = (Uri) obj;
        return new n.a(new i.b.a.s.d(uri), this.a.a(uri));
    }

    public boolean a(Object obj) {
        return f2705b.contains(((Uri) obj).getScheme());
    }
}
