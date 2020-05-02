package com.crashlytics.android.answers;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;
import i.a.a.a.a;
import l.a.a.a.c;
import l.a.a.a.f;
import l.a.a.a.k;
import l.a.a.a.o.b.i;
import l.a.a.a.o.b.j;
import l.a.a.a.o.b.l;
import l.a.a.a.o.b.r;
import l.a.a.a.o.g.p;
import l.a.a.a.o.g.s;

public class Answers extends k<Boolean> {
    public static final String CRASHLYTICS_API_ENDPOINT = "com.crashlytics.ApiEndpoint";
    public static final String TAG = "Answers";
    public SessionAnalyticsManager analyticsManager;
    public boolean firebaseEnabled = false;

    public static Answers getInstance() {
        return (Answers) f.a(Answers.class);
    }

    private void logFirebaseModeEnabledWarning(String str) {
        c a = f.a();
        String a2 = a.a("Method ", str, " is not supported when using Crashlytics through Firebase.");
        if (a.a(TAG, 5)) {
            Log.w(TAG, a2, (Throwable) null);
        }
    }

    public String getIdentifier() {
        return "com.crashlytics.sdk.android:answers";
    }

    public String getOverridenSpiEndpoint() {
        return i.a(getContext(), "com.crashlytics.ApiEndpoint");
    }

    public String getVersion() {
        return "1.4.7.32";
    }

    public void logAddToCart(AddToCartEvent addToCartEvent) {
        if (addToCartEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logAddToCart");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(addToCartEvent);
            }
        }
    }

    public void logContentView(ContentViewEvent contentViewEvent) {
        if (contentViewEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logContentView");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(contentViewEvent);
            }
        }
    }

    public void logCustom(CustomEvent customEvent) {
        if (customEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logCustom");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onCustom(customEvent);
            }
        }
    }

    public void logInvite(InviteEvent inviteEvent) {
        if (inviteEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logInvite");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(inviteEvent);
            }
        }
    }

    public void logLevelEnd(LevelEndEvent levelEndEvent) {
        if (levelEndEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelEnd");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(levelEndEvent);
            }
        }
    }

    public void logLevelStart(LevelStartEvent levelStartEvent) {
        if (levelStartEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLevelStart");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(levelStartEvent);
            }
        }
    }

    public void logLogin(LoginEvent loginEvent) {
        if (loginEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logLogin");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(loginEvent);
            }
        }
    }

    public void logPurchase(PurchaseEvent purchaseEvent) {
        if (purchaseEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logPurchase");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(purchaseEvent);
            }
        }
    }

    public void logRating(RatingEvent ratingEvent) {
        if (ratingEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logRating");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(ratingEvent);
            }
        }
    }

    public void logSearch(SearchEvent searchEvent) {
        if (searchEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSearch");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(searchEvent);
            }
        }
    }

    public void logShare(ShareEvent shareEvent) {
        if (shareEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logShare");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(shareEvent);
            }
        }
    }

    public void logSignUp(SignUpEvent signUpEvent) {
        if (signUpEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logSignUp");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(signUpEvent);
            }
        }
    }

    public void logStartCheckout(StartCheckoutEvent startCheckoutEvent) {
        if (startCheckoutEvent == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.firebaseEnabled) {
            logFirebaseModeEnabledWarning("logStartCheckout");
        } else {
            SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
            if (sessionAnalyticsManager != null) {
                sessionAnalyticsManager.onPredefined(startCheckoutEvent);
            }
        }
    }

    public void onException(j.b bVar) {
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onError(bVar.a);
        }
    }

    @SuppressLint({"NewApi"})
    public boolean onPreExecute() {
        try {
            Context context = getContext();
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String num = Integer.toString(packageInfo.versionCode);
            SessionAnalyticsManager build = SessionAnalyticsManager.build(this, context, getIdManager(), num, packageInfo.versionName == null ? "0.0" : packageInfo.versionName, packageInfo.firstInstallTime);
            this.analyticsManager = build;
            build.enable();
            this.firebaseEnabled = new r().a(context);
            return true;
        } catch (Exception e) {
            if (f.a().a(TAG, 6)) {
                Log.e(TAG, "Error retrieving app properties", e);
            }
            return false;
        }
    }

    public Boolean doInBackground() {
        if (!l.a(getContext()).a()) {
            if (f.a().a("Fabric", 3)) {
                Log.d("Fabric", "Analytics collection disabled, because data collection is disabled by Firebase.", (Throwable) null);
            }
            this.analyticsManager.disable();
            return false;
        }
        try {
            s a = p.b.a.a();
            if (a == null) {
                if (f.a().a(TAG, 6)) {
                    Log.e(TAG, "Failed to retrieve settings", (Throwable) null);
                }
                return false;
            } else if (a.d.c) {
                if (f.a().a(TAG, 3)) {
                    Log.d(TAG, "Analytics collection enabled", (Throwable) null);
                }
                this.analyticsManager.setAnalyticsSettingsData(a.e, getOverridenSpiEndpoint());
                return true;
            } else {
                if (f.a().a(TAG, 3)) {
                    Log.d(TAG, "Analytics collection disabled", (Throwable) null);
                }
                this.analyticsManager.disable();
                return false;
            }
        } catch (Exception e) {
            if (f.a().a(TAG, 6)) {
                Log.e(TAG, "Error dealing with settings", e);
            }
            return false;
        }
    }

    public void onException(j.a aVar) {
        SessionAnalyticsManager sessionAnalyticsManager = this.analyticsManager;
        if (sessionAnalyticsManager != null) {
            sessionAnalyticsManager.onCrash(aVar.a, aVar.f5074b);
        }
    }
}
