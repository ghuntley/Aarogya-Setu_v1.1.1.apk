package i.b.a.n.n;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import i.b.a.n.g;
import i.b.a.n.n.n;
import java.io.File;
import java.io.InputStream;

/* compiled from: StringLoader */
public class u<Data> implements n<String, Data> {
    public final n<Uri, Data> a;

    /* compiled from: StringLoader */
    public static final class a implements o<String, AssetFileDescriptor> {
        public n<String, AssetFileDescriptor> a(r rVar) {
            return new u(rVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader */
    public static class b implements o<String, ParcelFileDescriptor> {
        public n<String, ParcelFileDescriptor> a(r rVar) {
            return new u(rVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: StringLoader */
    public static class c implements o<String, InputStream> {
        public n<String, InputStream> a(r rVar) {
            return new u(rVar.a(Uri.class, InputStream.class));
        }
    }

    public u(n<Uri, Data> nVar) {
        this.a = nVar;
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        Uri uri;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            uri = null;
        } else if (str.charAt(0) == '/') {
            uri = Uri.fromFile(new File(str));
        } else {
            Uri parse = Uri.parse(str);
            uri = parse.getScheme() == null ? Uri.fromFile(new File(str)) : parse;
        }
        if (uri == null || !this.a.a(uri)) {
            return null;
        }
        return this.a.a(uri, i2, i3, gVar);
    }

    public boolean a(Object obj) {
        String str = (String) obj;
        return true;
    }
}
