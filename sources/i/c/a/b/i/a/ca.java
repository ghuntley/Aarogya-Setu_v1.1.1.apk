package i.c.a.b.i.a;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import com.crashlytics.android.answers.AnswersRetryFilesSender;
import com.crashlytics.android.core.DefaultAppMeasurementEventListenerRegistrar;
import i.c.a.b.d.f;
import i.c.a.b.d.g;
import i.c.a.b.d.l.q;
import i.c.a.b.d.o.c;
import i.c.a.b.g.g.e8;
import i.c.a.b.g.g.nb;
import i.c.a.b.g.g.x9;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
import l.a.a.a.o.d.b;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final class ca extends n6 {

    /* renamed from: g  reason: collision with root package name */
    public static final String[] f3630g = {"firebase_", "google_", "ga_"};
    public SecureRandom c;
    public final AtomicLong d = new AtomicLong(0);
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public Integer f3631f = null;

    public ca(s5 s5Var) {
        super(s5Var);
    }

    public static boolean h(String str) {
        q.b(str);
        if (str.charAt(0) != '_' || str.equals("_ep")) {
            return true;
        }
        return false;
    }

    public static boolean i(String str) {
        return !TextUtils.isEmpty(str) && str.startsWith(b.ROLL_OVER_FILE_NAME_SEPARATOR);
    }

    public static MessageDigest x() {
        int i2 = 0;
        while (i2 < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                if (instance != null) {
                    return instance;
                }
                i2++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public final void a(String str, String str2, String str3, Bundle bundle, List<String> list, boolean z) {
        int i2;
        int i3;
        String str4;
        int i4;
        String str5;
        String str6 = str2;
        Bundle bundle2 = bundle;
        List<String> list2 = list;
        if (bundle2 != null) {
            boolean a = this.a.f3861g.a(o.e1);
            if (a) {
                i2 = 0;
            } else {
                i2 = this.a.f3861g.m();
            }
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i5 = 0;
            while (it.hasNext()) {
                String str7 = (String) it.next();
                if (list2 == null || !list2.contains(str7)) {
                    i3 = z ? e(str7) : 0;
                    if (i3 == 0) {
                        i3 = f(str7);
                    }
                } else {
                    i3 = 0;
                }
                if (i3 != 0) {
                    a(bundle2, i3, str7, (Object) i3 == 3 ? str7 : null);
                    bundle2.remove(str7);
                } else {
                    if (b(bundle2.get(str7))) {
                        n().f3763k.a("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str6, str3, str7);
                        i4 = 22;
                        str4 = str7;
                    } else {
                        String str8 = str3;
                        str4 = str7;
                        i4 = a(str, str2, str7, bundle2.get(str7), bundle, list, z, false);
                    }
                    if (i4 != 0 && !"_ev".equals(str4)) {
                        a(bundle2, i4, str4, bundle2.get(str4));
                        bundle2.remove(str4);
                    } else if (h(str4) && (!a || !a(str4, q6.d))) {
                        int i6 = i5 + 1;
                        if (i6 > i2) {
                            if (a) {
                                str5 = "Item cannot contain custom parameters";
                            } else {
                                StringBuilder sb = new StringBuilder(63);
                                sb.append("Child bundles can't contain more than ");
                                sb.append(i2);
                                sb.append(" custom params");
                                str5 = sb.toString();
                            }
                            n().f3760h.a(str5, e().a(str6), e().a(bundle2));
                            a(bundle2, a ? 23 : 5);
                            bundle2.remove(str4);
                        }
                        i5 = i6;
                    }
                }
            }
        }
    }

    public final boolean b(String str, String str2) {
        if (str2 == null) {
            n().f3760h.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            n().f3760h.a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (Character.isLetter(codePointAt) || codePointAt == 95) {
                int length = str2.length();
                int charCount = Character.charCount(codePointAt);
                while (charCount < length) {
                    int codePointAt2 = str2.codePointAt(charCount);
                    if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                        charCount += Character.charCount(codePointAt2);
                    } else {
                        n().f3760h.a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                        return false;
                    }
                }
                return true;
            }
            n().f3760h.a("Name must start with a letter or _ (underscore). Type, name", str, str2);
            return false;
        }
    }

    public final Object c(String str, Object obj) {
        if ("_ldl".equals(str)) {
            return a(g(str), obj, true, false);
        }
        return a(g(str), obj, false, false);
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String a = this.a.f3861g.a("debug.firebase.analytics.app", "");
        oa oaVar = this.a.f3860f;
        return a.equals(str);
    }

    public final int e(String str) {
        if (!a("event param", str)) {
            return 3;
        }
        if (!a("event param", (String[]) null, str)) {
            return 14;
        }
        if (!a("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final int f(String str) {
        if (!b("event param", str)) {
            return 3;
        }
        if (!a("event param", (String[]) null, str)) {
            return 14;
        }
        if (!a("event param", 40, str)) {
            return 3;
        }
        return 0;
    }

    public final int g(String str) {
        if ("_ldl".equals(str)) {
            return 2048;
        }
        if ("_id".equals(str)) {
            return 256;
        }
        return (!this.a.f3861g.a(o.F0) || !"_lgclid".equals(str)) ? 36 : 100;
    }

    public final void m() {
        c();
        SecureRandom secureRandom = new SecureRandom();
        long nextLong = secureRandom.nextLong();
        if (nextLong == 0) {
            nextLong = secureRandom.nextLong();
            if (nextLong == 0) {
                n().f3761i.a("Utils falling back to Random for random id");
            }
        }
        this.d.set(nextLong);
    }

    public final boolean r() {
        return true;
    }

    public final long t() {
        long andIncrement;
        long j2;
        if (this.d.get() == 0) {
            synchronized (this.d) {
                long nanoTime = System.nanoTime();
                if (((c) this.a.f3868n) != null) {
                    long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                    int i2 = this.e + 1;
                    this.e = i2;
                    j2 = nextLong + ((long) i2);
                } else {
                    throw null;
                }
            }
            return j2;
        }
        synchronized (this.d) {
            this.d.compareAndSet(-1, 1);
            andIncrement = this.d.getAndIncrement();
        }
        return andIncrement;
    }

    public final SecureRandom u() {
        c();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    public final int v() {
        if (this.f3631f == null) {
            f fVar = f.f3022b;
            Context context = this.a.a;
            if (fVar != null) {
                this.f3631f = Integer.valueOf(g.getApkVersion(context) / AnswersRetryFilesSender.BACKOFF_MS);
            } else {
                throw null;
            }
        }
        return this.f3631f.intValue();
    }

    public final String w() {
        byte[] bArr = new byte[16];
        u().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new Object[]{new BigInteger(1, bArr)});
    }

    public static boolean c(Context context, String str) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, str), 0)) == null || !serviceInfo.enabled) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean c(String str) {
        c();
        if (i.c.a.b.d.p.c.b(this.a.a).a.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        n().f3765m.a("Permission not granted", str);
        return false;
    }

    public static boolean c(String str, String str2) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str == null) {
            return false;
        }
        return str.equals(str2);
    }

    public final int b(String str) {
        if (!b("user property", str)) {
            return 6;
        }
        if (!a("user property", p6.a, str)) {
            return 15;
        }
        if (!a("user property", 24, str)) {
            return 6;
        }
        return 0;
    }

    public static boolean b(Object obj) {
        return (obj instanceof Parcelable[]) || (obj instanceof ArrayList) || (obj instanceof Bundle);
    }

    public final boolean b(String str, String str2, int i2, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String valueOf = String.valueOf(obj);
            if (valueOf.codePointCount(0, valueOf.length()) > i2) {
                n().f3763k.a("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(valueOf.length()));
                return false;
            }
        }
        return true;
    }

    @SuppressLint({"ApplySharedPref"})
    public final boolean a(String str, double d2) {
        try {
            SharedPreferences.Editor edit = this.a.a.getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0).edit();
            edit.putString("deeplink", str);
            edit.putLong("timestamp", Double.doubleToRawLongBits(d2));
            return edit.commit();
        } catch (Exception e2) {
            n().f3758f.a("Failed to persist Deferred Deep Link. exception", e2);
            return false;
        }
    }

    public final int b(String str, Object obj) {
        boolean z;
        if ("_ldl".equals(str)) {
            z = b("user property referrer", str, g(str), obj);
        } else {
            z = b("user property", str, g(str), obj);
        }
        return z ? 0 : 7;
    }

    public final boolean b(Context context, String str) {
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo packageInfo = i.c.a.b.d.p.c.b(context).a.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null || packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                return true;
            }
            return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(packageInfo.signatures[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
        } catch (CertificateException e2) {
            n().f3758f.a("Error obtaining certificate", e2);
            return true;
        } catch (PackageManager.NameNotFoundException e3) {
            n().f3758f.a("Package name not found", e3);
            return true;
        }
    }

    public static long a(l lVar) {
        long j2 = 0;
        if (lVar == null) {
            return 0;
        }
        for (String a : lVar.e.keySet()) {
            Object a2 = lVar.a(a);
            if (a2 instanceof Parcelable[]) {
                j2 += (long) ((Parcelable[]) a2).length;
            }
        }
        return j2;
    }

    public final Bundle a(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        if (uri == null) {
            return null;
        }
        try {
            if (uri.isHierarchical()) {
                str4 = uri.getQueryParameter("utm_campaign");
                str3 = uri.getQueryParameter("utm_source");
                str2 = uri.getQueryParameter("utm_medium");
                str = uri.getQueryParameter("gclid");
            } else {
                str4 = null;
                str3 = null;
                str2 = null;
                str = null;
            }
            if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str2) && TextUtils.isEmpty(str)) {
                return null;
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str4)) {
                bundle.putString("campaign", str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                bundle.putString("source", str3);
            }
            if (!TextUtils.isEmpty(str2)) {
                bundle.putString("medium", str2);
            }
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("gclid", str);
            }
            String queryParameter = uri.getQueryParameter("utm_term");
            if (!TextUtils.isEmpty(queryParameter)) {
                bundle.putString("term", queryParameter);
            }
            String queryParameter2 = uri.getQueryParameter("utm_content");
            if (!TextUtils.isEmpty(queryParameter2)) {
                bundle.putString("content", queryParameter2);
            }
            String queryParameter3 = uri.getQueryParameter("aclid");
            if (!TextUtils.isEmpty(queryParameter3)) {
                bundle.putString("aclid", queryParameter3);
            }
            String queryParameter4 = uri.getQueryParameter("cp1");
            if (!TextUtils.isEmpty(queryParameter4)) {
                bundle.putString("cp1", queryParameter4);
            }
            String queryParameter5 = uri.getQueryParameter("anid");
            if (!TextUtils.isEmpty(queryParameter5)) {
                bundle.putString("anid", queryParameter5);
            }
            return bundle;
        } catch (UnsupportedOperationException e2) {
            n().f3761i.a("Install referrer url isn't a hierarchical URI", e2);
            return null;
        }
    }

    public static ArrayList<Bundle> b(List<na> list) {
        if (list == null) {
            return new ArrayList<>(0);
        }
        ArrayList<Bundle> arrayList = new ArrayList<>(list.size());
        for (na next : list) {
            Bundle bundle = new Bundle();
            bundle.putString("app_id", next.e);
            bundle.putString("origin", next.f3791f);
            bundle.putLong("creation_timestamp", next.f3793h);
            bundle.putString(DefaultAppMeasurementEventListenerRegistrar.NAME, next.f3792g.f3586f);
            q.a(bundle, next.f3792g.a());
            bundle.putBoolean("active", next.f3794i);
            String str = next.f3795j;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            m mVar = next.f3796k;
            if (mVar != null) {
                bundle.putString("timed_out_event_name", mVar.e);
                l lVar = next.f3796k.f3755f;
                if (lVar != null) {
                    bundle.putBundle("timed_out_event_params", lVar.b());
                }
            }
            bundle.putLong("trigger_timeout", next.f3797l);
            m mVar2 = next.f3798m;
            if (mVar2 != null) {
                bundle.putString("triggered_event_name", mVar2.e);
                l lVar2 = next.f3798m.f3755f;
                if (lVar2 != null) {
                    bundle.putBundle("triggered_event_params", lVar2.b());
                }
            }
            bundle.putLong("triggered_timestamp", next.f3792g.f3587g);
            bundle.putLong("time_to_live", next.f3799n);
            m mVar3 = next.f3800o;
            if (mVar3 != null) {
                bundle.putString("expired_event_name", mVar3.e);
                l lVar3 = next.f3800o.f3755f;
                if (lVar3 != null) {
                    bundle.putBundle("expired_event_params", lVar3.b());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean a(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        return "android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) || "https://www.google.com".equals(stringExtra) || "android-app://com.google.appcrawler".equals(stringExtra);
    }

    public final boolean a(String str, String str2) {
        if (str2 == null) {
            n().f3760h.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.length() == 0) {
            n().f3760h.a("Name is required and can't be empty. Type", str);
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                n().f3760h.a("Name must start with a letter. Type, name", str, str2);
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 == 95 || Character.isLetterOrDigit(codePointAt2)) {
                    charCount += Character.charCount(codePointAt2);
                } else {
                    n().f3760h.a("Name must consist of letters, digits or _ (underscores). Type, name", str, str2);
                    return false;
                }
            }
            return true;
        }
    }

    public final boolean a(String str, String[] strArr, String str2) {
        boolean z;
        if (str2 == null) {
            n().f3760h.a("Name is required and can't be null. Type", str);
            return false;
        }
        q.a(str2);
        String[] strArr2 = f3630g;
        int length = strArr2.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else if (str2.startsWith(strArr2[i2])) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            n().f3760h.a("Name starts with reserved prefix. Type, name", str, str2);
            return false;
        } else if (strArr == null || !a(str2, strArr)) {
            return true;
        } else {
            n().f3760h.a("Name is reserved. Type, name", str, str2);
            return false;
        }
    }

    public final boolean a(String str, int i2, String str2) {
        if (str2 == null) {
            n().f3760h.a("Name is required and can't be null. Type", str);
            return false;
        } else if (str2.codePointCount(0, str2.length()) <= i2) {
            return true;
        } else {
            n().f3760h.a("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i2), str2);
            return false;
        }
    }

    public final int a(String str) {
        if (!b("event", str)) {
            return 2;
        }
        if (!a("event", o6.a, str)) {
            return 13;
        }
        if (!a("event", 40, str)) {
            return 2;
        }
        return 0;
    }

    public final boolean a(String str, String str2, int i2, Object obj) {
        int i3;
        if (obj instanceof Parcelable[]) {
            i3 = ((Parcelable[]) obj).length;
        } else {
            if (obj instanceof ArrayList) {
                i3 = ((ArrayList) obj).size();
            }
            return true;
        }
        if (i3 > i2) {
            n().f3763k.a("Parameter array is too long; discarded. Value kind, name, array length", str, str2, Integer.valueOf(i3));
            return false;
        }
        return true;
    }

    public final boolean a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            q.a(str);
            if (str.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                return true;
            }
            if (this.a.r()) {
                n().f3760h.a("Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id", m4.a(str));
            }
            return false;
        } else if (x9.b() && this.a.f3861g.a(o.I0) && !TextUtils.isEmpty(str3)) {
            return true;
        } else {
            if (!TextUtils.isEmpty(str2)) {
                q.a(str2);
                if (str2.matches("^(1:\\d+:android:[a-f0-9]+|ca-app-pub-.*)$")) {
                    return true;
                }
                n().f3760h.a("Invalid admob_app_id. Analytics disabled.", m4.a(str2));
                return false;
            }
            if (this.a.r()) {
                n().f3760h.a("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
            }
            return false;
        }
    }

    public static boolean a(String str, String str2, String str3, String str4) {
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean isEmpty2 = TextUtils.isEmpty(str2);
        if (!isEmpty && !isEmpty2) {
            return !str.equals(str2);
        }
        if (isEmpty && isEmpty2) {
            return (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) ? !TextUtils.isEmpty(str4) : !str3.equals(str4);
        }
        if (isEmpty || !isEmpty2) {
            return TextUtils.isEmpty(str3) || !str3.equals(str4);
        }
        if (TextUtils.isEmpty(str4)) {
            return false;
        }
        return TextUtils.isEmpty(str3) || !str3.equals(str4);
    }

    public final Object a(int i2, Object obj, boolean z, boolean z2) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof Long) || (obj instanceof Double)) {
            return obj;
        }
        if (obj instanceof Integer) {
            return Long.valueOf((long) ((Integer) obj).intValue());
        }
        if (obj instanceof Byte) {
            return Long.valueOf((long) ((Byte) obj).byteValue());
        }
        if (obj instanceof Short) {
            return Long.valueOf((long) ((Short) obj).shortValue());
        }
        if (obj instanceof Boolean) {
            return Long.valueOf(((Boolean) obj).booleanValue() ? 1 : 0);
        } else if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        } else {
            if ((obj instanceof String) || (obj instanceof Character) || (obj instanceof CharSequence)) {
                return a(String.valueOf(obj), i2, z);
            }
            if (!e8.b() || !this.a.f3861g.a(o.d1) || !this.a.f3861g.a(o.c1) || !z2 || (!(obj instanceof Bundle[]) && !(obj instanceof Parcelable[]))) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (Parcelable parcelable : (Parcelable[]) obj) {
                if (parcelable instanceof Bundle) {
                    Bundle a = a((Bundle) parcelable);
                    if (!a.isEmpty()) {
                        arrayList.add(a);
                    }
                }
            }
            return arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    public static String a(String str, int i2, boolean z) {
        if (str == null) {
            return null;
        }
        if (str.codePointCount(0, str.length()) <= i2) {
            return str;
        }
        if (z) {
            return String.valueOf(str.substring(0, str.offsetByCodePoints(0, i2))).concat("...");
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int a(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.Object r21, android.os.Bundle r22, java.util.List<java.lang.String> r23, boolean r24, boolean r25) {
        /*
            r17 = this;
            r7 = r17
            r8 = r20
            r0 = r21
            r1 = r22
            r17.c()
            boolean r2 = i.c.a.b.g.g.e8.b()
            r3 = 17
            java.lang.String r4 = "param"
            r9 = 1
            r10 = 0
            if (r2 == 0) goto L_0x0099
            i.c.a.b.i.a.s5 r2 = r7.a
            i.c.a.b.i.a.pa r2 = r2.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r5 = i.c.a.b.i.a.o.e1
            boolean r2 = r2.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r5)
            if (r2 == 0) goto L_0x0099
            boolean r2 = b((java.lang.Object) r21)
            if (r2 == 0) goto L_0x00a4
            if (r25 == 0) goto L_0x0096
            java.lang.String[] r2 = i.c.a.b.i.a.q6.c
            boolean r2 = a((java.lang.String) r8, (java.lang.String[]) r2)
            if (r2 != 0) goto L_0x0036
            r0 = 20
            return r0
        L_0x0036:
            i.c.a.b.i.a.s5 r2 = r7.a
            i.c.a.b.i.a.z7 r2 = r2.t()
            r2.c()
            r2.w()
            boolean r5 = r2.E()
            if (r5 != 0) goto L_0x004a
        L_0x0048:
            r2 = 1
            goto L_0x0059
        L_0x004a:
            i.c.a.b.i.a.ca r2 = r2.f()
            int r2 = r2.v()
            r5 = 200900(0x310c4, float:2.81521E-40)
            if (r2 < r5) goto L_0x0058
            goto L_0x0048
        L_0x0058:
            r2 = 0
        L_0x0059:
            if (r2 != 0) goto L_0x005e
            r0 = 25
            return r0
        L_0x005e:
            r2 = 200(0xc8, float:2.8E-43)
            boolean r5 = r7.a((java.lang.String) r4, (java.lang.String) r8, (int) r2, (java.lang.Object) r0)
            if (r5 != 0) goto L_0x00a4
            boolean r5 = r0 instanceof android.os.Parcelable[]
            if (r5 == 0) goto L_0x007a
            r5 = r0
            android.os.Parcelable[] r5 = (android.os.Parcelable[]) r5
            int r6 = r5.length
            if (r6 <= r2) goto L_0x0093
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r5, r2)
            android.os.Parcelable[] r2 = (android.os.Parcelable[]) r2
            r1.putParcelableArray(r8, r2)
            goto L_0x0093
        L_0x007a:
            boolean r5 = r0 instanceof java.util.ArrayList
            if (r5 == 0) goto L_0x0093
            r5 = r0
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r6 = r5.size()
            if (r6 <= r2) goto L_0x0093
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.List r2 = r5.subList(r10, r2)
            r6.<init>(r2)
            r1.putParcelableArrayList(r8, r6)
        L_0x0093:
            r11 = 17
            goto L_0x00a5
        L_0x0096:
            r0 = 21
            return r0
        L_0x0099:
            if (r25 == 0) goto L_0x00a4
            r1 = 1000(0x3e8, float:1.401E-42)
            boolean r1 = r7.a((java.lang.String) r4, (java.lang.String) r8, (int) r1, (java.lang.Object) r0)
            if (r1 != 0) goto L_0x00a4
            return r3
        L_0x00a4:
            r11 = 0
        L_0x00a5:
            i.c.a.b.i.a.s5 r1 = r7.a
            i.c.a.b.i.a.pa r1 = r1.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.R
            r12 = r18
            boolean r1 = r1.d(r12, r2)
            if (r1 == 0) goto L_0x00b9
            boolean r1 = i(r19)
            if (r1 != 0) goto L_0x00bf
        L_0x00b9:
            boolean r1 = i(r20)
            if (r1 == 0) goto L_0x00c2
        L_0x00bf:
            r1 = 256(0x100, float:3.59E-43)
            goto L_0x00c4
        L_0x00c2:
            r1 = 100
        L_0x00c4:
            boolean r1 = r7.b(r4, r8, r1, r0)
            if (r1 == 0) goto L_0x00cb
            return r11
        L_0x00cb:
            if (r25 == 0) goto L_0x017c
            boolean r1 = i.c.a.b.g.g.e8.b()
            if (r1 == 0) goto L_0x00e1
            i.c.a.b.i.a.s5 r1 = r7.a
            i.c.a.b.i.a.pa r1 = r1.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r2 = i.c.a.b.i.a.o.d1
            boolean r1 = r1.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r2)
            if (r1 == 0) goto L_0x00e1
            r13 = 1
            goto L_0x00e2
        L_0x00e1:
            r13 = 0
        L_0x00e2:
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 == 0) goto L_0x00fc
            if (r13 == 0) goto L_0x0179
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r4, (java.util.List<java.lang.String>) r5, (boolean) r6)
            goto L_0x0179
        L_0x00fc:
            boolean r1 = r0 instanceof android.os.Parcelable[]
            if (r1 == 0) goto L_0x0139
            r14 = r0
            android.os.Parcelable[] r14 = (android.os.Parcelable[]) r14
            int r15 = r14.length
            r6 = 0
        L_0x0105:
            if (r6 >= r15) goto L_0x0179
            r0 = r14[r6]
            boolean r1 = r0 instanceof android.os.Bundle
            if (r1 != 0) goto L_0x011d
            i.c.a.b.i.a.m4 r1 = r17.n()
            i.c.a.b.i.a.o4 r1 = r1.f3763k
            java.lang.Class r0 = r0.getClass()
            java.lang.String r2 = "All Parcelable[] elements must be of type Bundle. Value type, name"
            r1.a(r2, r0, r8)
            goto L_0x0178
        L_0x011d:
            if (r13 == 0) goto L_0x0134
            r4 = r0
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r16 = r6
            r6 = r24
            r0.a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r4, (java.util.List<java.lang.String>) r5, (boolean) r6)
            goto L_0x0136
        L_0x0134:
            r16 = r6
        L_0x0136:
            int r6 = r16 + 1
            goto L_0x0105
        L_0x0139:
            boolean r1 = r0 instanceof java.util.ArrayList
            if (r1 == 0) goto L_0x0178
            r14 = r0
            java.util.ArrayList r14 = (java.util.ArrayList) r14
            int r15 = r14.size()
            r0 = 0
        L_0x0145:
            if (r0 >= r15) goto L_0x0179
            java.lang.Object r1 = r14.get(r0)
            int r16 = r0 + 1
            boolean r0 = r1 instanceof android.os.Bundle
            if (r0 != 0) goto L_0x0161
            i.c.a.b.i.a.m4 r0 = r17.n()
            i.c.a.b.i.a.o4 r0 = r0.f3763k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r2 = "All ArrayList elements must be of type Bundle. Value type, name"
            r0.a(r2, r1, r8)
            goto L_0x0178
        L_0x0161:
            if (r13 == 0) goto L_0x0175
            r4 = r1
            android.os.Bundle r4 = (android.os.Bundle) r4
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r20
            r5 = r23
            r6 = r24
            r0.a((java.lang.String) r1, (java.lang.String) r2, (java.lang.String) r3, (android.os.Bundle) r4, (java.util.List<java.lang.String>) r5, (boolean) r6)
        L_0x0175:
            r0 = r16
            goto L_0x0145
        L_0x0178:
            r9 = 0
        L_0x0179:
            if (r9 == 0) goto L_0x017c
            return r11
        L_0x017c:
            r0 = 4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.ca.a(java.lang.String, java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final Object a(String str, Object obj) {
        int i2 = 256;
        if ("_ev".equals(str)) {
            return a(256, obj, true, true);
        }
        if (!i(str)) {
            i2 = 100;
        }
        return a(i2, obj, false, true);
    }

    public static Bundle[] a(Object obj) {
        if (obj instanceof Bundle) {
            return new Bundle[]{(Bundle) obj};
        } else if (obj instanceof Parcelable[]) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            return (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
        } else if (!(obj instanceof ArrayList)) {
            return null;
        } else {
            ArrayList arrayList = (ArrayList) obj;
            return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Bundle a(java.lang.String r23, java.lang.String r24, android.os.Bundle r25, java.util.List<java.lang.String> r26, boolean r27, boolean r28) {
        /*
            r22 = this;
            r9 = r22
            r10 = r24
            r11 = r25
            r12 = r26
            boolean r0 = i.c.a.b.g.g.e8.b()
            r13 = 0
            if (r0 == 0) goto L_0x001e
            i.c.a.b.i.a.s5 r0 = r9.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r1 = i.c.a.b.i.a.o.e1
            boolean r0 = r0.a((i.c.a.b.i.a.f4<java.lang.Boolean>) r1)
            if (r0 == 0) goto L_0x001e
            r0 = 1
            r14 = 1
            goto L_0x001f
        L_0x001e:
            r14 = 0
        L_0x001f:
            if (r14 == 0) goto L_0x0029
            java.lang.String[] r0 = i.c.a.b.i.a.o6.c
            boolean r0 = a((java.lang.String) r10, (java.lang.String[]) r0)
            r15 = r0
            goto L_0x002b
        L_0x0029:
            r15 = r28
        L_0x002b:
            r16 = 0
            if (r11 == 0) goto L_0x0141
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>(r11)
            i.c.a.b.i.a.s5 r0 = r9.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            int r7 = r0.m()
            i.c.a.b.i.a.s5 r0 = r9.a
            i.c.a.b.i.a.pa r0 = r0.f3861g
            i.c.a.b.i.a.f4<java.lang.Boolean> r1 = i.c.a.b.i.a.o.l0
            r6 = r23
            boolean r0 = r0.d(r6, r1)
            if (r0 == 0) goto L_0x0054
            java.util.TreeSet r0 = new java.util.TreeSet
            java.util.Set r1 = r25.keySet()
            r0.<init>(r1)
            goto L_0x0058
        L_0x0054:
            java.util.Set r0 = r25.keySet()
        L_0x0058:
            java.util.Iterator r17 = r0.iterator()
            r18 = 0
        L_0x005e:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x013e
            java.lang.Object r0 = r17.next()
            r5 = r0
            java.lang.String r5 = (java.lang.String) r5
            if (r12 == 0) goto L_0x0076
            boolean r0 = r12.contains(r5)
            if (r0 != 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r0 = 0
            goto L_0x0084
        L_0x0076:
            if (r27 == 0) goto L_0x007d
            int r0 = r9.e(r5)
            goto L_0x007e
        L_0x007d:
            r0 = 0
        L_0x007e:
            if (r0 != 0) goto L_0x0084
            int r0 = r9.f(r5)
        L_0x0084:
            if (r0 == 0) goto L_0x0097
            r1 = 3
            if (r0 != r1) goto L_0x008b
            r1 = r5
            goto L_0x008d
        L_0x008b:
            r1 = r16
        L_0x008d:
            a((android.os.Bundle) r8, (int) r0, (java.lang.String) r5, (java.lang.Object) r1)
            r8.remove(r5)
            r20 = r7
            r2 = r8
            goto L_0x00e3
        L_0x0097:
            java.lang.Object r4 = r11.get(r5)
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r5
            r19 = r5
            r5 = r8
            r6 = r26
            r20 = r7
            r7 = r27
            r21 = r8
            r8 = r15
            int r0 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r14 == 0) goto L_0x00c4
            r1 = 17
            if (r0 != r1) goto L_0x00c4
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r13)
            r3 = r19
            r2 = r21
            a((android.os.Bundle) r2, (int) r0, (java.lang.String) r3, (java.lang.Object) r1)
            goto L_0x00ea
        L_0x00c4:
            r3 = r19
            r2 = r21
            if (r0 == 0) goto L_0x00ea
            java.lang.String r1 = "_ev"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x00ea
            r1 = 21
            if (r0 != r1) goto L_0x00d8
            r5 = r10
            goto L_0x00d9
        L_0x00d8:
            r5 = r3
        L_0x00d9:
            java.lang.Object r1 = r11.get(r3)
            a((android.os.Bundle) r2, (int) r0, (java.lang.String) r5, (java.lang.Object) r1)
            r2.remove(r3)
        L_0x00e3:
            r6 = r23
            r8 = r2
            r7 = r20
            goto L_0x005e
        L_0x00ea:
            boolean r0 = h(r3)
            if (r0 == 0) goto L_0x0136
            int r0 = r18 + 1
            r1 = r20
            if (r0 <= r1) goto L_0x0133
            r4 = 48
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r4)
            java.lang.String r4 = "Event can't contain more than "
            r5.append(r4)
            r5.append(r1)
            java.lang.String r4 = " params"
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            i.c.a.b.i.a.m4 r5 = r22.n()
            i.c.a.b.i.a.o4 r5 = r5.f3760h
            i.c.a.b.i.a.k4 r6 = r22.e()
            java.lang.String r6 = r6.a((java.lang.String) r10)
            i.c.a.b.i.a.k4 r7 = r22.e()
            java.lang.String r7 = r7.a((android.os.Bundle) r11)
            r5.a(r4, r6, r7)
            r4 = 5
            a((android.os.Bundle) r2, (int) r4)
            r2.remove(r3)
            r6 = r23
            r18 = r0
            goto L_0x013a
        L_0x0133:
            r18 = r0
            goto L_0x0138
        L_0x0136:
            r1 = r20
        L_0x0138:
            r6 = r23
        L_0x013a:
            r7 = r1
            r8 = r2
            goto L_0x005e
        L_0x013e:
            r2 = r8
            r16 = r2
        L_0x0141:
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.a.b.i.a.ca.a(java.lang.String, java.lang.String, android.os.Bundle, java.util.List, boolean, boolean):android.os.Bundle");
    }

    public static void a(Bundle bundle, int i2, String str, Object obj) {
        if (a(bundle, i2)) {
            bundle.putString("_ev", a(str, 40, true));
            if (obj != null) {
                q.a(bundle);
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", (long) String.valueOf(obj).length());
                }
            }
        }
    }

    public static boolean a(Bundle bundle, int i2) {
        if (bundle == null || bundle.getLong("_err") != 0) {
            return false;
        }
        bundle.putLong("_err", (long) i2);
        return true;
    }

    public final void a(Bundle bundle, String str, Object obj) {
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (e8.b() && this.a.f3861g.a(o.d1) && this.a.f3861g.a(o.c1) && (obj instanceof Bundle[])) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                n().f3763k.a("Not putting event parameter. Invalid value type. name, type", e().b(str), obj != null ? obj.getClass().getSimpleName() : null);
            }
        }
    }

    public final void a(int i2, String str, String str2, int i3) {
        Bundle bundle = new Bundle();
        a(bundle, i2);
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            bundle.putString(str, str2);
        }
        if (i2 == 6 || i2 == 7 || i2 == 2) {
            bundle.putLong("_el", (long) i3);
        }
        s5 s5Var = this.a;
        oa oaVar = s5Var.f3860f;
        s5Var.o().a("auto", "_err", bundle);
    }

    public static long a(byte[] bArr) {
        q.a(bArr);
        int i2 = 0;
        q.b(bArr.length > 0);
        long j2 = 0;
        int length = bArr.length - 1;
        while (length >= 0 && length >= bArr.length - 8) {
            j2 += (((long) bArr[length]) & 255) << i2;
            i2 += 8;
            length--;
        }
        return j2;
    }

    public static boolean a(Context context) {
        q.a(context);
        if (Build.VERSION.SDK_INT >= 24) {
            return c(context, "com.google.android.gms.measurement.AppMeasurementJobService");
        }
        return c(context, "com.google.android.gms.measurement.AppMeasurementService");
    }

    public final Bundle a(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object a = a(str, bundle.get(str));
                if (a == null) {
                    n().f3763k.a("Param value can't be null", e().b(str));
                } else {
                    a(bundle2, str, a);
                }
            }
        }
        return bundle2;
    }

    public final m a(String str, String str2, Bundle bundle, String str3, long j2) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        if (a(str2) == 0) {
            if (bundle == null) {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str3);
            return new m(str2, new l(a(a(str, str2, bundle2, (List<String>) Collections.singletonList("_o"), false, false))), str3, j2);
        }
        n().f3758f.a("Invalid conditional property event name", e().c(str2));
        throw new IllegalArgumentException();
    }

    public final long a(Context context, String str) {
        c();
        q.a(context);
        q.b(str);
        PackageManager packageManager = context.getPackageManager();
        MessageDigest x = x();
        if (x == null) {
            n().f3758f.a("Could not get MD5 instance");
            return -1;
        }
        if (packageManager != null) {
            try {
                if (!b(context, str)) {
                    PackageInfo b2 = i.c.a.b.d.p.c.b(context).b(this.a.a.getPackageName(), 64);
                    if (b2.signatures != null && b2.signatures.length > 0) {
                        return a(x.digest(b2.signatures[0].toByteArray()));
                    }
                    n().f3761i.a("Could not get signatures");
                    return -1;
                }
            } catch (PackageManager.NameNotFoundException e2) {
                n().f3758f.a("Package name not found", e2);
            }
        }
        return 0;
    }

    public static byte[] a(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static boolean a(String str, String[] strArr) {
        q.a(strArr);
        for (String c2 : strArr) {
            if (c(str, c2)) {
                return true;
            }
        }
        return false;
    }

    public static long a(long j2, long j3) {
        return ((j3 * 60000) + j2) / 86400000;
    }

    public final void a(Bundle bundle, long j2) {
        long j3 = bundle.getLong("_et");
        if (j3 != 0) {
            n().f3761i.a("Params already contained engagement", Long.valueOf(j3));
        }
        bundle.putLong("_et", j2 + j3);
    }

    public final void a(nb nbVar, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            nbVar.a(bundle);
        } catch (RemoteException e2) {
            this.a.n().f3761i.a("Error returning string value to wrapper", e2);
        }
    }

    public final void a(nb nbVar, long j2) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j2);
        try {
            nbVar.a(bundle);
        } catch (RemoteException e2) {
            this.a.n().f3761i.a("Error returning long value to wrapper", e2);
        }
    }

    public final void a(nb nbVar, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i2);
        try {
            nbVar.a(bundle);
        } catch (RemoteException e2) {
            this.a.n().f3761i.a("Error returning int value to wrapper", e2);
        }
    }

    public final void a(nb nbVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            nbVar.a(bundle);
        } catch (RemoteException e2) {
            this.a.n().f3761i.a("Error returning byte array to wrapper", e2);
        }
    }

    public final void a(nb nbVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            nbVar.a(bundle);
        } catch (RemoteException e2) {
            this.a.n().f3761i.a("Error returning boolean value to wrapper", e2);
        }
    }

    public final void a(nb nbVar, Bundle bundle) {
        try {
            nbVar.a(bundle);
        } catch (RemoteException e2) {
            this.a.n().f3761i.a("Error returning bundle value to wrapper", e2);
        }
    }

    public static Bundle a(List<aa> list) {
        Bundle bundle = new Bundle();
        if (list == null) {
            return bundle;
        }
        for (aa next : list) {
            String str = next.f3589i;
            if (str != null) {
                bundle.putString(next.f3586f, str);
            } else {
                Long l2 = next.f3588h;
                if (l2 != null) {
                    bundle.putLong(next.f3586f, l2.longValue());
                } else {
                    Double d2 = next.f3591k;
                    if (d2 != null) {
                        bundle.putDouble(next.f3586f, d2.doubleValue());
                    }
                }
            }
        }
        return bundle;
    }

    public final void a(nb nbVar, ArrayList<Bundle> arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            nbVar.a(bundle);
        } catch (RemoteException e2) {
            this.a.n().f3761i.a("Error returning bundle list to wrapper", e2);
        }
    }
}
