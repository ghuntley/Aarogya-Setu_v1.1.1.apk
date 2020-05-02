package i.c.a.d.a.a;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.play.core.install.InstallException;
import i.c.a.d.a.c.a;
import i.c.a.d.a.e.g;

public final class k extends j<a> {
    public final String d;

    public k(f fVar, g<a> gVar, String str) {
        super(fVar, new a("OnRequestInstallCallback"), gVar);
        this.d = str;
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle.getInt("error.code", -2) == 0 || bundle.getInt("error.code", -2) == 1) {
            g<T> gVar = this.f4300b;
            gVar.a.a(new a(this.d, bundle.getInt("version.code", -1), bundle.getInt("update.availability"), bundle.getInt("install.status", 0), (PendingIntent) bundle.getParcelable("blocking.intent"), (PendingIntent) bundle.getParcelable("nonblocking.intent")));
            return;
        }
        g<T> gVar2 = this.f4300b;
        gVar2.a.a((Exception) new InstallException(bundle.getInt("error.code", -2)));
    }
}
