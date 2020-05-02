package i.b.a.n.l;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import i.a.a.a.a;
import java.io.FileNotFoundException;

/* compiled from: FileDescriptorLocalUriFetcher */
public class i extends l<ParcelFileDescriptor> {
    public i(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    public void a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public Object a(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(a.a("FileDescriptor is null for: ", uri));
    }

    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }
}
