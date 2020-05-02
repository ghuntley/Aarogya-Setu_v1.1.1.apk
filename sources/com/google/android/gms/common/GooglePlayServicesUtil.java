package com.google.android.gms.common;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import i.c.a.b.d.e;
import i.c.a.b.d.g;
import i.c.a.b.d.l.f;
import i.c.a.b.d.l.y;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class GooglePlayServicesUtil extends g {
    public static final String GMS_ERROR_DIALOG = "GooglePlayServicesErrorDialog";
    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";
    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";

    @Deprecated
    public static Dialog getErrorDialog(int i2, Activity activity, int i3) {
        return getErrorDialog(i2, activity, i3, (DialogInterface.OnCancelListener) null);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i2, Context context, int i3) {
        return g.getErrorPendingIntent(i2, context, i3);
    }

    @Deprecated
    public static String getErrorString(int i2) {
        return g.getErrorString(i2);
    }

    public static Context getRemoteContext(Context context) {
        return g.getRemoteContext(context);
    }

    public static Resources getRemoteResource(Context context) {
        return g.getRemoteResource(context);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return g.isGooglePlayServicesAvailable(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i2) {
        return g.isUserRecoverableError(i2);
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i2, Activity activity, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return showErrorDialogFragment(i2, activity, (Fragment) null, i3, onCancelListener);
    }

    @Deprecated
    public static void showErrorNotification(int i2, Context context) {
        e eVar = e.d;
        if (g.isPlayServicesPossiblyUpdating(context, i2) || g.isPlayStorePossiblyUpdating(context, i2)) {
            new e.a(context).sendEmptyMessageDelayed(1, 120000);
        } else {
            eVar.b(context, i2);
        }
    }

    @Deprecated
    public static Dialog getErrorDialog(int i2, Activity activity, int i3, DialogInterface.OnCancelListener onCancelListener) {
        if (g.isPlayServicesPossiblyUpdating(activity, i2)) {
            i2 = 18;
        }
        return e.d.a(activity, i2, i3, onCancelListener);
    }

    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i2) {
        return g.isGooglePlayServicesAvailable(context, i2);
    }

    public static boolean showErrorDialogFragment(int i2, Activity activity, Fragment fragment, int i3, DialogInterface.OnCancelListener onCancelListener) {
        if (g.isPlayServicesPossiblyUpdating(activity, i2)) {
            i2 = 18;
        }
        e eVar = e.d;
        if (fragment == null) {
            return eVar.b(activity, i2, i3, onCancelListener);
        }
        Dialog a = e.a((Context) activity, i2, (f) new y(eVar.a((Context) activity, i2, "d"), fragment, i3), onCancelListener);
        if (a == null) {
            return false;
        }
        e.a(activity, a, GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    @Deprecated
    public static boolean showErrorDialogFragment(int i2, Activity activity, int i3) {
        return showErrorDialogFragment(i2, activity, i3, (DialogInterface.OnCancelListener) null);
    }
}
