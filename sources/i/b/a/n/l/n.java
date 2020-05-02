package i.b.a.n.l;

import android.content.res.AssetManager;
import java.io.InputStream;

/* compiled from: StreamAssetPathFetcher */
public class n extends b<InputStream> {
    public n(AssetManager assetManager, String str) {
        super(assetManager, str);
    }

    public void a(Object obj) {
        ((InputStream) obj).close();
    }

    public Object a(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }
}
