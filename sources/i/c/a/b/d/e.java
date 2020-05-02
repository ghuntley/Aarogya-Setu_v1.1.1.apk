package i.c.a.b.d;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.GooglePlayServicesUtil;
import h.h.e.h;
import h.h.e.i;
import h.h.e.j;
import h.l.d.r;
import i.c.a.b.c.b;
import i.c.a.b.d.l.f;
import i.c.a.b.d.l.q;
import i.c.a.b.d.l.z;
import i.c.a.b.g.c.c;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public class e extends f {
    public static final Object c = new Object();
    public static final e d = new e();

    @SuppressLint({"HandlerLeak"})
    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public class a extends c {
        public final Context a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i2);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int a2 = e.this.a(this.a, f.a);
            if (e.this == null) {
                throw null;
            } else if (g.isUserRecoverableError(a2)) {
                e.this.b(this.a, a2);
            }
        }
    }

    public PendingIntent a(Context context, int i2, int i3) {
        Intent a2 = a(context, i2, (String) null);
        if (a2 == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i3, a2, 134217728);
    }

    public boolean b(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a2 = a((Context) activity, i2, (f) new z(super.a((Context) activity, i2, "d"), activity, i3), onCancelListener);
        if (a2 == null) {
            return false;
        }
        a(activity, a2, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    public final String a() {
        synchronized (c) {
        }
        return null;
    }

    public void b(Context context, int i2) {
        PendingIntent pendingIntent;
        Intent a2 = super.a(context, i2, "n");
        if (a2 == null) {
            pendingIntent = null;
        } else {
            pendingIntent = PendingIntent.getActivity(context, 0, a2, 134217728);
        }
        a(context, i2, pendingIntent);
    }

    public int a(Context context, int i2) {
        return super.a(context, i2);
    }

    public Dialog a(Activity activity, int i2, int i3, DialogInterface.OnCancelListener onCancelListener) {
        return a((Context) activity, i2, (f) new z(super.a((Context) activity, i2, "d"), activity, i3), onCancelListener);
    }

    public Intent a(Context context, int i2, String str) {
        return super.a(context, i2, str);
    }

    public static Dialog a(Context context, int i2, f fVar, DialogInterface.OnCancelListener onCancelListener) {
        String str;
        AlertDialog.Builder builder = null;
        if (i2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(i.c.a.b.d.l.e.a(context, i2));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i2 == 1) {
            str = resources.getString(b.common_google_play_services_install_button);
        } else if (i2 == 2) {
            str = resources.getString(b.common_google_play_services_update_button);
        } else if (i2 != 3) {
            str = resources.getString(17039370);
        } else {
            str = resources.getString(b.common_google_play_services_enable_button);
        }
        if (str != null) {
            builder.setPositiveButton(str, fVar);
        }
        String b2 = i.c.a.b.d.l.e.b(context, i2);
        if (b2 != null) {
            builder.setTitle(b2);
        }
        return builder.create();
    }

    public static void a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof h.l.d.e) {
            r k2 = ((h.l.d.e) activity).k();
            j jVar = new j();
            q.a(dialog, (Object) "Cannot display null dialog");
            dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            jVar.n0 = dialog;
            if (onCancelListener != null) {
                jVar.o0 = onCancelListener;
            }
            jVar.a(k2, str);
            return;
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        q.a(dialog, (Object) "Cannot display null dialog");
        dialog.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.e = dialog;
        if (onCancelListener != null) {
            cVar.f3018f = onCancelListener;
        }
        cVar.show(fragmentManager, str);
    }

    @TargetApi(20)
    public final void a(Context context, int i2, PendingIntent pendingIntent) {
        String str;
        String str2;
        int i3;
        if (i2 == 18) {
            new a(context).sendEmptyMessageDelayed(1, 120000);
        } else if (pendingIntent != null) {
            if (i2 == 6) {
                str = i.c.a.b.d.l.e.a(context, "common_google_play_services_resolution_required_title");
            } else {
                str = i.c.a.b.d.l.e.b(context, i2);
            }
            if (str == null) {
                str = context.getResources().getString(b.common_google_play_services_notification_ticker);
            }
            if (i2 == 6 || i2 == 19) {
                str2 = i.c.a.b.d.l.e.a(context, "common_google_play_services_resolution_required_text", i.c.a.b.d.l.e.a(context));
            } else {
                str2 = i.c.a.b.d.l.e.a(context, i2);
            }
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            i iVar = new i(context, (String) null);
            iVar.x = true;
            iVar.a(16, true);
            iVar.b(str);
            h hVar = new h();
            hVar.a((CharSequence) str2);
            iVar.a((j) hVar);
            if (q.a(context)) {
                q.b(true);
                iVar.O.icon = context.getApplicationInfo().icon;
                iVar.f1729l = 2;
                if (q.b(context)) {
                    iVar.f1722b.add(new h.h.e.f(i.c.a.b.c.a.common_full_open_on_phone, resources.getString(b.common_open_on_phone), pendingIntent));
                } else {
                    iVar.f1723f = pendingIntent;
                }
            } else {
                iVar.O.icon = 17301642;
                String string = resources.getString(b.common_google_play_services_notification_ticker);
                iVar.O.tickerText = i.c(string);
                iVar.O.when = System.currentTimeMillis();
                iVar.f1723f = pendingIntent;
                iVar.a((CharSequence) str2);
            }
            if (q.f()) {
                q.b(q.f());
                a();
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String b2 = i.c.a.b.d.l.e.b(context);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", b2, 4));
                } else if (!b2.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(b2);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
                iVar.I = "com.google.android.gms.availability";
            }
            Notification a2 = iVar.a();
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                i3 = g.GMS_AVAILABILITY_NOTIFICATION_ID;
                g.sCanceledAvailabilityNotification.set(false);
            } else {
                i3 = g.GMS_GENERAL_ERROR_NOTIFICATION_ID;
            }
            notificationManager.notify(i3, a2);
        } else if (i2 == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
