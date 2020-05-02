package i.b.a.n.n;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import i.b.a.n.g;
import i.b.a.n.n.n;
import java.io.InputStream;

/* compiled from: ResourceLoader */
public class s<Data> implements n<Integer, Data> {
    public final n<Uri, Data> a;

    /* renamed from: b  reason: collision with root package name */
    public final Resources f2704b;

    /* compiled from: ResourceLoader */
    public static final class a implements o<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        public n<Integer, AssetFileDescriptor> a(r rVar) {
            return new s(this.a, rVar.a(Uri.class, AssetFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader */
    public static class b implements o<Integer, ParcelFileDescriptor> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        public n<Integer, ParcelFileDescriptor> a(r rVar) {
            return new s(this.a, rVar.a(Uri.class, ParcelFileDescriptor.class));
        }
    }

    /* compiled from: ResourceLoader */
    public static class c implements o<Integer, InputStream> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        public n<Integer, InputStream> a(r rVar) {
            return new s(this.a, rVar.a(Uri.class, InputStream.class));
        }
    }

    /* compiled from: ResourceLoader */
    public static class d implements o<Integer, Uri> {
        public final Resources a;

        public d(Resources resources) {
            this.a = resources;
        }

        public n<Integer, Uri> a(r rVar) {
            return new s(this.a, v.a);
        }
    }

    public s(Resources resources, n<Uri, Data> nVar) {
        this.f2704b = resources;
        this.a = nVar;
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        Uri uri;
        Integer num = (Integer) obj;
        try {
            uri = Uri.parse("android.resource://" + this.f2704b.getResourcePackageName(num.intValue()) + '/' + this.f2704b.getResourceTypeName(num.intValue()) + '/' + this.f2704b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.a(uri, i2, i3, gVar);
    }

    public boolean a(Object obj) {
        Integer num = (Integer) obj;
        return true;
    }
}
