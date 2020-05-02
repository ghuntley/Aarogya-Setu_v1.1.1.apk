package i.c.a.d.a.a;

import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import i.c.a.d.a.c.a;
import i.c.a.d.a.e.g;

public final class i extends j<Void> {
    public i(f fVar, g<Void> gVar) {
        super(fVar, new a("OnCompleteUpdateCallback"), gVar);
    }

    public final void c(Bundle bundle) {
        super.c(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            g<T> gVar = this.f4300b;
            gVar.a.a((Exception) new InstallException(bundle.getInt("error.code", -2)));
            return;
        }
        this.f4300b.a.a(null);
    }
}
