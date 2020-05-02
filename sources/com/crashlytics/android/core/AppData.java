package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageInfo;
import l.a.a.a.o.b.s;

public class AppData {
    public final String apiKey;
    public final String buildId;
    public final String installerPackageName;
    public final String packageName;
    public final String versionCode;
    public final String versionName;

    public AppData(String str, String str2, String str3, String str4, String str5, String str6) {
        this.apiKey = str;
        this.buildId = str2;
        this.installerPackageName = str3;
        this.packageName = str4;
        this.versionCode = str5;
        this.versionName = str6;
    }

    public static AppData create(Context context, s sVar, String str, String str2) {
        String packageName2 = context.getPackageName();
        String d = sVar.d();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName2, 0);
        String num = Integer.toString(packageInfo.versionCode);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new AppData(str, str2, d, packageName2, num, str3);
    }
}
