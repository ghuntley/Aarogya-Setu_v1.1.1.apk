package i.c.d.o;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import i.a.a.a.a;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public final class p {
    public final Bundle a;

    public p(Bundle bundle) {
        if (bundle != null) {
            this.a = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public static String e(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public final String a(String str) {
        String str2;
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                str2 = str;
            } else {
                str2 = str.replace("gcm.n.", "gcm.notification.");
            }
            if (this.a.containsKey(str2)) {
                str = str2;
            }
        }
        return bundle.getString(str);
    }

    public final boolean b(String str) {
        String a2 = a(str);
        return "1".equals(a2) || Boolean.parseBoolean(a2);
    }

    public final Integer c(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a2));
        } catch (NumberFormatException unused) {
            String e = e(str);
            StringBuilder sb = new StringBuilder(a.a(a2, a.a(e, 38)));
            sb.append("Couldn't parse value of ");
            sb.append(e);
            sb.append("(");
            sb.append(a2);
            sb.append(") into an int");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final JSONArray d(String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        try {
            return new JSONArray(a2);
        } catch (JSONException unused) {
            String e = e(str);
            StringBuilder sb = new StringBuilder(a.a(a2, a.a(e, 50)));
            sb.append("Malformed JSON for key ");
            sb.append(e);
            sb.append(": ");
            sb.append(a2);
            sb.append(", falling back to default");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
    }

    public final Bundle a() {
        Bundle bundle = new Bundle(this.a);
        for (String str : this.a.keySet()) {
            if (!(str.startsWith("google.c.a.") || str.equals("from"))) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final String a(Resources resources, String str, String str2) {
        String[] strArr;
        String a2 = a(str2);
        if (!TextUtils.isEmpty(a2)) {
            return a2;
        }
        String a3 = a(String.valueOf(str2).concat("_loc_key"));
        if (TextUtils.isEmpty(a3)) {
            return null;
        }
        int identifier = resources.getIdentifier(a3, "string", str);
        if (identifier == 0) {
            String e = e(String.valueOf(str2).concat("_loc_key"));
            StringBuilder sb = new StringBuilder(a.a(str2, a.a(e, 49)));
            sb.append(e);
            sb.append(" resource not found: ");
            sb.append(str2);
            sb.append(" Default value will be used.");
            Log.w("NotificationParams", sb.toString());
            return null;
        }
        JSONArray d = d(String.valueOf(str2).concat("_loc_args"));
        if (d == null) {
            strArr = null;
        } else {
            int length = d.length();
            strArr = new String[length];
            for (int i2 = 0; i2 < length; i2++) {
                strArr[i2] = d.optString(i2);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e2) {
            String e3 = e(str2);
            String arrays = Arrays.toString(strArr);
            StringBuilder sb2 = new StringBuilder(a.a(arrays, a.a(e3, 58)));
            sb2.append("Missing format argument for ");
            sb2.append(e3);
            sb2.append(": ");
            sb2.append(arrays);
            sb2.append(" Default value will be used.");
            Log.w("NotificationParams", sb2.toString(), e2);
            return null;
        }
    }

    public static boolean a(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }
}
