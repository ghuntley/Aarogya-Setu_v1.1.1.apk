package i.c.a.b.j.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import i.c.a.b.d.g;
import i.c.a.b.d.k.c;
import i.c.a.b.d.l.b;
import i.c.a.b.d.l.d;
import i.c.a.b.d.l.h;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.s;
import i.c.a.b.j.e;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class a extends h<f> implements e {
    public final Bundle A;
    public Integer B;
    public final boolean y;
    public final d z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context, Looper looper, d dVar, c.a aVar, c.b bVar) {
        super(context, looper, 44, dVar, aVar, bVar);
        d dVar2 = dVar;
        i.c.a.b.j.a aVar2 = dVar2.f3111g;
        Integer num = dVar2.f3112h;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", dVar2.a);
        if (num != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
        }
        if (aVar2 != null) {
            bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", aVar2.a);
            bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", aVar2.f3979b);
            bundle.putString("com.google.android.gms.signin.internal.serverClientId", aVar2.c);
            bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
            bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", aVar2.d);
            bundle.putString("com.google.android.gms.signin.internal.hostedDomain", aVar2.e);
            bundle.putString("com.google.android.gms.signin.internal.logSessionId", aVar2.f3980f);
            bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", aVar2.f3981g);
            Long l2 = aVar2.f3982h;
            if (l2 != null) {
                bundle.putLong("com.google.android.gms.signin.internal.authApiSignInModuleVersion", l2.longValue());
            }
            Long l3 = aVar2.f3983i;
            if (l3 != null) {
                bundle.putLong("com.google.android.gms.signin.internal.realClientLibraryVersion", l3.longValue());
            }
        }
        this.y = true;
        this.z = dVar2;
        this.A = bundle;
        this.B = dVar2.f3112h;
    }

    public final void a(d dVar) {
        q.a(dVar, (Object) "Expecting a valid ISignInCallbacks");
        try {
            Account account = this.z.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccount = null;
            if ("<<default account>>".equals(account.name)) {
                googleSignInAccount = i.c.a.b.b.a.b.a.a.a(this.f3088b).a();
            }
            ((f) q()).a(new j(new s(account, this.B.intValue(), googleSignInAccount)), dVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                dVar.a(new l());
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    public final void g() {
        a((b.c) new b.d());
    }

    public boolean h() {
        return this.y;
    }

    public int j() {
        return g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    public Bundle o() {
        if (!this.f3088b.getPackageName().equals(this.z.e)) {
            this.A.putString("com.google.android.gms.signin.internal.realClientPackageName", this.z.e);
        }
        return this.A;
    }

    public String r() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public String s() {
        return "com.google.android.gms.signin.service.START";
    }

    public /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        if (queryLocalInterface instanceof f) {
            return (f) queryLocalInterface;
        }
        return new h(iBinder);
    }
}
