package h.h.f;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import java.io.File;

/* compiled from: ContextCompat */
public class a {
    public static final Object a = new Object();

    public static boolean a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static ColorStateList b(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i2);
        }
        return context.getResources().getColorStateList(i2);
    }

    public static Drawable c(Context context, int i2) {
        return context.getDrawable(i2);
    }

    public static int a(Context context, int i2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i2);
        }
        return context.getResources().getColor(i2);
    }

    public static boolean b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    public static int a(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static File a(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static void a(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }
}
