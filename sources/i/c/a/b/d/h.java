package i.c.a.b.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.StrictMode;
import android.util.Log;
import i.c.a.b.d.l.q;
import i.c.a.b.d.p.c;
import javax.annotation.CheckReturnValue;

@CheckReturnValue
/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static h f3023b;
    public final Context a;

    public h(Context context) {
        this.a = context.getApplicationContext();
    }

    public static h a(Context context) {
        q.a(context);
        synchronized (h.class) {
            if (f3023b == null) {
                s.a(context);
                f3023b = new h(context);
            }
        }
        return f3023b;
    }

    public boolean a(int i2) {
        b0 b0Var;
        StrictMode.ThreadPolicy allowThreadDiskReads;
        String[] packagesForUid = c.b(this.a).a.getPackageManager().getPackagesForUid(i2);
        if (packagesForUid != null && packagesForUid.length != 0) {
            b0Var = null;
            for (String str : packagesForUid) {
                try {
                    PackageInfo packageInfo = c.b(this.a).a.getPackageManager().getPackageInfo(str, 64);
                    boolean honorsDebugCertificates = g.honorsDebugCertificates(this.a);
                    if (packageInfo == null) {
                        b0Var = b0.a("null pkg");
                    } else {
                        if (packageInfo.signatures != null) {
                            if (packageInfo.signatures.length == 1) {
                                w wVar = new w(packageInfo.signatures[0].toByteArray());
                                String str2 = packageInfo.packageName;
                                b0 a2 = s.a(str2, wVar, honorsDebugCertificates, false);
                                if (!(!a2.a || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0)) {
                                    allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    b0 b2 = s.b(str2, wVar, false, true);
                                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    if (b2.a) {
                                        b0Var = b0.a("debuggable release cert app rejected");
                                    }
                                }
                                b0Var = a2;
                            }
                        }
                        b0Var = b0.a("single cert required");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    String valueOf = String.valueOf(str);
                    b0Var = b0.a(valueOf.length() != 0 ? "no pkg ".concat(valueOf) : new String("no pkg "));
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(allowThreadDiskReads);
                    throw th;
                }
                if (b0Var.a) {
                    break;
                }
            }
        } else {
            b0Var = b0.a("no pkgs");
        }
        if (!b0Var.a && Log.isLoggable("GoogleCertificatesRslt", 3)) {
            if (b0Var.c != null) {
                Log.d("GoogleCertificatesRslt", b0Var.a(), b0Var.c);
            } else {
                Log.d("GoogleCertificatesRslt", b0Var.a());
            }
        }
        return b0Var.a;
    }

    public static boolean a(PackageInfo packageInfo, boolean z) {
        t tVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                tVar = a(packageInfo, y.a);
            } else {
                tVar = a(packageInfo, y.a[0]);
            }
            if (tVar != null) {
                return true;
            }
        }
        return false;
    }

    public static t a(PackageInfo packageInfo, t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        w wVar = new w(packageInfo.signatures[0].toByteArray());
        for (int i2 = 0; i2 < tVarArr.length; i2++) {
            if (tVarArr[i2].equals(wVar)) {
                return tVarArr[i2];
            }
        }
        return null;
    }
}
