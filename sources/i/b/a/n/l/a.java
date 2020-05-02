package i.b.a.n.l;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* compiled from: AssetFileDescriptorLocalUriFetcher */
public final class a extends l<AssetFileDescriptor> {
    public a(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public void a(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    public Object a(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        throw new FileNotFoundException(i.a.a.a.a.a("FileDescriptor is null for: ", uri));
    }

    public Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }
}
