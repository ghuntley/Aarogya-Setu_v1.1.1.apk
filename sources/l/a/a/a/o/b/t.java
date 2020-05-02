package l.a.a.a.o.b;

import android.content.Context;
import l.a.a.a.o.a.b;
import l.a.a.a.o.a.c;

/* compiled from: InstallerPackageNameProvider */
public class t {
    public final c<String> a = new a(this);

    /* renamed from: b  reason: collision with root package name */
    public final b<String> f5106b = new b<>();

    /* compiled from: InstallerPackageNameProvider */
    public class a implements c<String> {
        public a(t tVar) {
        }

        public Object load(Context context) {
            String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName == null ? "" : installerPackageName;
        }
    }
}
