package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import i.a.a.a.a;
import i.c.a.d.a.c.b;

public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    public void onClick(DialogInterface dialogInterface, int i2) {
        if (i2 == -1) {
            String packageName = getPackageName();
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse(a.a(a.a(packageName, 66), "market://details?id=", packageName, "&referrer=utm_source%3Dplay.core.missingsplits"))).setPackage("com.android.vending"));
        }
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (b.a(this)) {
            String charSequence = getApplicationInfo().loadLabel(getPackageManager()).toString();
            StringBuilder sb = new StringBuilder(a.a(charSequence, 91));
            sb.append("The app ");
            sb.append(charSequence);
            sb.append(" is missing required components and must be reinstalled from the Google Play Store.");
            neutralButton.setMessage(sb.toString()).setPositiveButton("Reinstall", this);
        } else {
            String charSequence2 = getApplicationInfo().loadLabel(getPackageManager()).toString();
            StringBuilder sb2 = new StringBuilder(a.a(charSequence2, 87));
            sb2.append("The app ");
            sb2.append(charSequence2);
            sb2.append(" is missing required components and must be reinstalled from an official store.");
            neutralButton.setMessage(sb2.toString());
        }
        neutralButton.create().show();
    }
}
