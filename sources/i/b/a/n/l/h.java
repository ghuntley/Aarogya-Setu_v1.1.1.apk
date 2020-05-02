package i.b.a.n.l;

import android.content.res.AssetManager;
import android.os.ParcelFileDescriptor;

/* compiled from: FileDescriptorAssetPathFetcher */
public class h extends b<ParcelFileDescriptor> {
    public h(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public void a(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }

    public Object a(AssetManager assetManager, String str) {
        return assetManager.openFd(str).getParcelFileDescriptor();
    }

    public Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }
}
