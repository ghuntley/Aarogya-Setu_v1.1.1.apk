package i.c.a.b.i.a;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import i.a.a.a.a;
import i.c.a.b.d.o.c;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class g extends n6 {
    public long c;
    public String d;
    public Boolean e;

    /* renamed from: f  reason: collision with root package name */
    public AccountManager f3677f;

    /* renamed from: g  reason: collision with root package name */
    public Boolean f3678g;

    /* renamed from: h  reason: collision with root package name */
    public long f3679h;

    public g(s5 s5Var) {
        super(s5Var);
    }

    public final boolean a(Context context) {
        if (this.e == null) {
            oa oaVar = this.a.f3860f;
            this.e = false;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    packageManager.getPackageInfo("com.google.android.gms", 128);
                    this.e = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.e.booleanValue();
    }

    public final boolean r() {
        Calendar instance = Calendar.getInstance();
        this.c = TimeUnit.MINUTES.convert((long) (instance.get(16) + instance.get(15)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String lowerCase = locale.getLanguage().toLowerCase(Locale.ENGLISH);
        String lowerCase2 = locale.getCountry().toLowerCase(Locale.ENGLISH);
        this.d = a.a(a.a(lowerCase2, a.a(lowerCase, 1)), lowerCase, "-", lowerCase2);
        return false;
    }

    public final long t() {
        o();
        return this.c;
    }

    public final String u() {
        o();
        return this.d;
    }

    public final long v() {
        c();
        return this.f3679h;
    }

    public final boolean w() {
        c();
        if (((c) this.a.f3868n) != null) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - this.f3679h > 86400000) {
                this.f3678g = null;
            }
            Boolean bool = this.f3678g;
            if (bool != null) {
                return bool.booleanValue();
            }
            if (h.h.f.a.a(this.a.a, "android.permission.GET_ACCOUNTS") != 0) {
                n().f3762j.a("Permission error checking for dasher/unicorn accounts");
                this.f3679h = currentTimeMillis;
                this.f3678g = false;
                return false;
            }
            if (this.f3677f == null) {
                this.f3677f = AccountManager.get(this.a.a);
            }
            try {
                Account[] result = this.f3677f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result == null || result.length <= 0) {
                    Account[] result2 = this.f3677f.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                    if (result2 != null && result2.length > 0) {
                        this.f3678g = true;
                        this.f3679h = currentTimeMillis;
                        return true;
                    }
                    this.f3679h = currentTimeMillis;
                    this.f3678g = false;
                    return false;
                }
                this.f3678g = true;
                this.f3679h = currentTimeMillis;
                return true;
            } catch (AuthenticatorException | OperationCanceledException | IOException e2) {
                n().f3759g.a("Exception checking account types", e2);
            }
        } else {
            throw null;
        }
    }
}
