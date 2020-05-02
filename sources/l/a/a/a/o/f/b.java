package l.a.a.a.o.f;

import android.content.Context;
import android.util.Log;
import java.io.File;
import l.a.a.a.f;
import l.a.a.a.k;

/* compiled from: FileStoreImpl */
public class b implements a {
    public final Context a;

    public b(k kVar) {
        if (kVar.getContext() != null) {
            this.a = kVar.getContext();
            kVar.getPath();
            this.a.getPackageName();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }

    public File a() {
        File filesDir = this.a.getFilesDir();
        if (filesDir != null) {
            if (filesDir.exists() || filesDir.mkdirs()) {
                return filesDir;
            }
            if (f.a().a("Fabric", 5)) {
                Log.w("Fabric", "Couldn't create file", (Throwable) null);
            }
        } else if (f.a().a("Fabric", 3)) {
            Log.d("Fabric", "Null File", (Throwable) null);
        }
        return null;
    }
}
