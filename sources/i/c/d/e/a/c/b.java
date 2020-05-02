package i.c.d.e.a.c;

import android.os.Bundle;
import com.crashlytics.android.core.CrashlyticsController;
import com.google.android.gms.measurement.AppMeasurement;
import i.c.a.b.d.l.q;
import i.c.a.b.i.a.p6;
import i.c.d.e.a.a;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-api@@17.3.0 */
public final class b {
    public static final List<String> a = Arrays.asList(new String[]{"_e", "_f", "_iap", "_s", "_au", "_ui", "_cd", "app_open"});

    /* renamed from: b  reason: collision with root package name */
    public static final List<String> f4657b = Arrays.asList(new String[]{"auto", "app", "am"});
    public static final List<String> c = Arrays.asList(new String[]{CrashlyticsController.FIREBASE_REALTIME, "_dbg"});
    public static final List<String> d;
    public static final List<String> e = Arrays.asList(new String[]{"^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$"});

    static {
        new HashSet(Arrays.asList(new String[]{"_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"}));
        String[][] strArr = {p6.a, p6.f3831b};
        int i2 = 0;
        for (int i3 = 0; i3 < 2; i3++) {
            i2 += strArr[i3].length;
        }
        Object[] copyOf = Arrays.copyOf(strArr[0], i2);
        int length = strArr[0].length;
        for (int i4 = 1; i4 < 2; i4++) {
            String[] strArr2 = strArr[i4];
            System.arraycopy(strArr2, 0, copyOf, length, strArr2.length);
            length += strArr2.length;
        }
        d = Arrays.asList((String[]) copyOf);
    }

    public static boolean a(String str) {
        return !f4657b.contains(str);
    }

    public static boolean a(String str, Bundle bundle) {
        if (a.contains(str)) {
            return false;
        }
        if (bundle == null) {
            return true;
        }
        for (String containsKey : c) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(String str, String str2) {
        if ("_ce1".equals(str2) || "_ce2".equals(str2)) {
            return str.equals("fcm") || str.equals("frc");
        }
        if ("_ln".equals(str2)) {
            return str.equals("fcm") || str.equals("fiam");
        }
        if (d.contains(str2)) {
            return false;
        }
        for (String matches : e) {
            if (str2.matches(matches)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(a.C0130a aVar) {
        String str;
        if (aVar == null || (str = aVar.a) == null || str.isEmpty()) {
            return false;
        }
        Object obj = aVar.c;
        if ((obj != null && q.d(obj) == null) || !a(str) || !a(str, aVar.f4645b)) {
            return false;
        }
        String str2 = aVar.f4651k;
        if (str2 != null && (!a(str2, aVar.f4652l) || !a(str, aVar.f4651k, aVar.f4652l))) {
            return false;
        }
        String str3 = aVar.f4648h;
        if (str3 != null && (!a(str3, aVar.f4649i) || !a(str, aVar.f4648h, aVar.f4649i))) {
            return false;
        }
        String str4 = aVar.f4646f;
        if (str4 == null) {
            return true;
        }
        if (a(str4, aVar.f4647g) && a(str, aVar.f4646f, aVar.f4647g)) {
            return true;
        }
        return false;
    }

    public static boolean a(String str, String str2, Bundle bundle) {
        if (!"_cmp".equals(str2)) {
            return true;
        }
        if (!a(str) || bundle == null) {
            return false;
        }
        for (String containsKey : c) {
            if (bundle.containsKey(containsKey)) {
                return false;
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 101200) {
            if (hashCode != 101230) {
                if (hashCode == 3142703 && str.equals("fiam")) {
                    c2 = 2;
                }
            } else if (str.equals("fdl")) {
                c2 = 1;
            }
        } else if (str.equals("fcm")) {
            c2 = 0;
        }
        if (c2 == 0) {
            bundle.putString("_cis", "fcm_integration");
            return true;
        } else if (c2 == 1) {
            bundle.putString("_cis", "fdl_integration");
            return true;
        } else if (c2 != 2) {
            return false;
        } else {
            bundle.putString("_cis", "fiam_integration");
            return true;
        }
    }

    public static a.C0130a a(AppMeasurement.ConditionalUserProperty conditionalUserProperty) {
        a.C0130a aVar = new a.C0130a();
        aVar.a = conditionalUserProperty.mOrigin;
        aVar.f4654n = conditionalUserProperty.mActive;
        aVar.f4653m = conditionalUserProperty.mCreationTimestamp;
        aVar.f4651k = conditionalUserProperty.mExpiredEventName;
        if (conditionalUserProperty.mExpiredEventParams != null) {
            aVar.f4652l = new Bundle(conditionalUserProperty.mExpiredEventParams);
        }
        aVar.f4645b = conditionalUserProperty.mName;
        aVar.f4646f = conditionalUserProperty.mTimedOutEventName;
        if (conditionalUserProperty.mTimedOutEventParams != null) {
            aVar.f4647g = new Bundle(conditionalUserProperty.mTimedOutEventParams);
        }
        aVar.f4650j = conditionalUserProperty.mTimeToLive;
        aVar.f4648h = conditionalUserProperty.mTriggeredEventName;
        if (conditionalUserProperty.mTriggeredEventParams != null) {
            aVar.f4649i = new Bundle(conditionalUserProperty.mTriggeredEventParams);
        }
        aVar.f4655o = conditionalUserProperty.mTriggeredTimestamp;
        aVar.d = conditionalUserProperty.mTriggerEventName;
        aVar.e = conditionalUserProperty.mTriggerTimeout;
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            aVar.c = q.d(obj);
        }
        return aVar;
    }
}
