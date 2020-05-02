package l.a.a.a.o.b;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import l.a.a.a.c;
import l.a.a.a.f;

/* compiled from: CommonUtils */
public class i {
    public static Boolean a;

    /* renamed from: b  reason: collision with root package name */
    public static final char[] f5062b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static long c = -1;
    public static final Comparator<File> d = new a();

    /* compiled from: CommonUtils */
    public static class a implements Comparator<File> {
        public int compare(Object obj, Object obj2) {
            return (int) (((File) obj).lastModified() - ((File) obj2).lastModified());
        }
    }

    /* compiled from: CommonUtils */
    public enum b {
        X86_32,
        X86_64,
        ARM_UNKNOWN,
        PPC,
        PPC64,
        ARMV6,
        ARMV7,
        UNKNOWN,
        ARMV7S,
        ARM64;
        

        /* renamed from: o  reason: collision with root package name */
        public static final Map<String, b> f5072o = null;

        /* access modifiers changed from: public */
        static {
            HashMap hashMap = new HashMap(4);
            f5072o = hashMap;
            hashMap.put("armeabi-v7a", ARMV7);
            f5072o.put("armeabi", ARMV6);
            f5072o.put("arm64-v8a", ARM64);
            f5072o.put("x86", X86_32);
        }

        public static b f() {
            String str = Build.CPU_ABI;
            if (TextUtils.isEmpty(str)) {
                if (f.a().a("Fabric", 3)) {
                    Log.d("Fabric", "Architecture#getValue()::Build.CPU_ABI returned null or empty", (Throwable) null);
                }
                return UNKNOWN;
            }
            b bVar = f5072o.get(str.toLowerCase(Locale.US));
            return bVar == null ? UNKNOWN : bVar;
        }
    }

    public static String a(int i2) {
        switch (i2) {
            case 2:
                return "V";
            case 3:
                return "D";
            case 4:
                return "I";
            case 5:
                return "W";
            case 6:
                return "E";
            case 7:
                return "A";
            default:
                return "?";
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r2v3 */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[Catch:{ all -> 0x0062 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.io.File r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "Failed to close system file reader."
            boolean r1 = r7.exists()
            r2 = 0
            if (r1 == 0) goto L_0x0068
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r3.<init>(r7)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r3, r4)     // Catch:{ Exception -> 0x003e, all -> 0x003c }
        L_0x0015:
            java.lang.String r3 = r1.readLine()     // Catch:{ Exception -> 0x003a }
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "\\s*:\\s*"
            java.util.regex.Pattern r4 = java.util.regex.Pattern.compile(r4)     // Catch:{ Exception -> 0x003a }
            r5 = 2
            java.lang.String[] r3 = r4.split(r3, r5)     // Catch:{ Exception -> 0x003a }
            int r4 = r3.length     // Catch:{ Exception -> 0x003a }
            r5 = 1
            if (r4 <= r5) goto L_0x0015
            r4 = 0
            r4 = r3[r4]     // Catch:{ Exception -> 0x003a }
            boolean r4 = r4.equals(r8)     // Catch:{ Exception -> 0x003a }
            if (r4 == 0) goto L_0x0015
            r7 = r3[r5]     // Catch:{ Exception -> 0x003a }
            r2 = r7
        L_0x0036:
            a((java.io.Closeable) r1, (java.lang.String) r0)
            goto L_0x0068
        L_0x003a:
            r8 = move-exception
            goto L_0x0040
        L_0x003c:
            r7 = move-exception
            goto L_0x0064
        L_0x003e:
            r8 = move-exception
            r1 = r2
        L_0x0040:
            l.a.a.a.c r3 = l.a.a.a.f.a()     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = "Fabric"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            r5.<init>()     // Catch:{ all -> 0x0062 }
            java.lang.String r6 = "Error parsing "
            r5.append(r6)     // Catch:{ all -> 0x0062 }
            r5.append(r7)     // Catch:{ all -> 0x0062 }
            java.lang.String r7 = r5.toString()     // Catch:{ all -> 0x0062 }
            r5 = 6
            boolean r3 = r3.a(r4, r5)     // Catch:{ all -> 0x0062 }
            if (r3 == 0) goto L_0x0036
            android.util.Log.e(r4, r7, r8)     // Catch:{ all -> 0x0062 }
            goto L_0x0036
        L_0x0062:
            r7 = move-exception
            r2 = r1
        L_0x0064:
            a((java.io.Closeable) r2, (java.lang.String) r0)
            throw r7
        L_0x0068:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.b.i.a(java.io.File, java.lang.String):java.lang.String");
    }

    public static synchronized long b() {
        long j2;
        synchronized (i.class) {
            if (c == -1) {
                long j3 = 0;
                String a2 = a(new File("/proc/meminfo"), "MemTotal");
                if (!TextUtils.isEmpty(a2)) {
                    String upperCase = a2.toUpperCase(Locale.US);
                    try {
                        if (upperCase.endsWith("KB")) {
                            j3 = a(upperCase, "KB", 1024);
                        } else if (upperCase.endsWith("MB")) {
                            j3 = a(upperCase, "MB", 1048576);
                        } else if (upperCase.endsWith("GB")) {
                            j3 = a(upperCase, "GB", 1073741824);
                        } else {
                            String str = "Unexpected meminfo format while computing RAM: " + upperCase;
                            if (f.a().a("Fabric", 3)) {
                                Log.d("Fabric", str, (Throwable) null);
                            }
                        }
                    } catch (NumberFormatException e) {
                        String str2 = "Unexpected meminfo format while computing RAM: " + upperCase;
                        if (f.a().a("Fabric", 6)) {
                            Log.e("Fabric", str2, e);
                        }
                    }
                }
                c = j3;
            }
            j2 = c;
        }
        return j2;
    }

    public static void c(Context context, String str) {
        if (g(context) && f.a().a("Fabric", 6)) {
            Log.e("Fabric", str, (Throwable) null);
        }
    }

    public static Float d(Context context) {
        Intent registerReceiver = context.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return null;
        }
        return Float.valueOf(((float) registerReceiver.getIntExtra("level", -1)) / ((float) registerReceiver.getIntExtra("scale", -1)));
    }

    public static SharedPreferences e(Context context) {
        return context.getSharedPreferences("com.crashlytics.prefs", 0);
    }

    public static boolean f(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static boolean g(Context context) {
        if (a == null) {
            a = Boolean.valueOf(a(context, "com.crashlytics.Trace", false));
        }
        return a.booleanValue();
    }

    public static boolean h(Context context) {
        return "sdk".equals(Build.PRODUCT) || "google_sdk".equals(Build.PRODUCT) || Settings.Secure.getString(context.getContentResolver(), "android_id") == null;
    }

    public static boolean i(Context context) {
        boolean h2 = h(context);
        String str = Build.TAGS;
        if ((!h2 && str != null && str.contains("test-keys")) || new File("/system/app/Superuser.apk").exists()) {
            return true;
        }
        File file = new File("/system/xbin/su");
        if (h2 || !file.exists()) {
            return false;
        }
        return true;
    }

    public static String j(Context context) {
        int a2 = a(context, "io.fabric.android.build_id", "string");
        if (a2 == 0) {
            a2 = a(context, "com.crashlytics.android.build_id", "string");
        }
        if (a2 == 0) {
            return null;
        }
        String string = context.getResources().getString(a2);
        c a3 = f.a();
        String b2 = i.a.a.a.a.b("Build ID is: ", string);
        if (a3.a("Fabric", 3)) {
            Log.d("Fabric", b2, (Throwable) null);
        }
        return string;
    }

    public static String k(Context context) {
        int a2 = a(context, "com.google.firebase.crashlytics.unity_version", "string");
        if (a2 == 0) {
            return null;
        }
        String string = context.getResources().getString(a2);
        c a3 = f.a();
        String b2 = i.a.a.a.a.b("Unity Editor version is: ", string);
        if (a3.a("Fabric", 3)) {
            Log.d("Fabric", b2, (Throwable) null);
        }
        return string;
    }

    public static int c(Context context) {
        return context.getApplicationContext().getApplicationInfo().icon;
    }

    public static int a() {
        return b.f().ordinal();
    }

    public static long a(String str, String str2, int i2) {
        return Long.parseLong(str.split(str2)[0].trim()) * ((long) i2);
    }

    public static String a(String str, String str2) {
        byte[] bytes = str.getBytes();
        try {
            MessageDigest instance = MessageDigest.getInstance(str2);
            instance.update(bytes);
            return a(instance.digest());
        } catch (NoSuchAlgorithmException e) {
            c a2 = f.a();
            String a3 = i.a.a.a.a.a("Could not create hashing algorithm: ", str2, ", returning empty string.");
            if (a2.a("Fabric", 6)) {
                Log.e("Fabric", a3, e);
            }
            return "";
        }
    }

    public static String b(InputStream inputStream) {
        Scanner useDelimiter = new Scanner(inputStream).useDelimiter("\\A");
        return useDelimiter.hasNext() ? useDelimiter.next() : "";
    }

    public static void b(Context context, String str) {
        if (g(context) && f.a().a("Fabric", 3)) {
            Log.d("Fabric", str, (Throwable) null);
        }
    }

    public static String a(InputStream inputStream) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-1");
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return a(instance.digest());
                }
                instance.update(bArr, 0, read);
            }
        } catch (Exception e) {
            if (f.a().a("Fabric", 6)) {
                Log.e("Fabric", "Could not calculate hash for app icon.", e);
            }
            return "";
        }
    }

    public static String b(int i2) {
        if (i2 >= 0) {
            return String.format(Locale.US, "%1$10s", new Object[]{Integer.valueOf(i2)}).replace(' ', '0');
        }
        throw new IllegalArgumentException("value must be zero or greater");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002b, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r1 = r8;
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0054, code lost:
        android.util.Log.w("Fabric", r2, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002b A[ExcHandler: all (r8v4 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0003] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0054 A[Catch:{ all -> 0x005b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r8) {
        /*
            java.lang.String r0 = "Failed to close icon input stream."
            r1 = 0
            android.content.res.Resources r2 = r8.getResources()     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            android.content.Context r8 = r8.getApplicationContext()     // Catch:{ Exception -> 0x0029, all -> 0x002b }
            android.content.pm.ApplicationInfo r8 = r8.getApplicationInfo()     // Catch:{ Exception -> 0x0029, all -> 0x002b }
            int r8 = r8.icon     // Catch:{ Exception -> 0x0029, all -> 0x002b }
            java.io.InputStream r8 = r2.openRawResource(r8)     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            java.lang.String r2 = a((java.io.InputStream) r8)     // Catch:{ Exception -> 0x0025 }
            boolean r3 = a((java.lang.String) r2)     // Catch:{ Exception -> 0x0025 }
            if (r3 == 0) goto L_0x0020
            goto L_0x0021
        L_0x0020:
            r1 = r2
        L_0x0021:
            a((java.io.Closeable) r8, (java.lang.String) r0)
            return r1
        L_0x0025:
            r2 = move-exception
            goto L_0x0032
        L_0x0027:
            r2 = r8
            goto L_0x0031
        L_0x0029:
            r8 = move-exception
            goto L_0x0027
        L_0x002b:
            r8 = move-exception
            r7 = r1
            r1 = r8
            r8 = r7
            goto L_0x005c
        L_0x0030:
            r2 = move-exception
        L_0x0031:
            r8 = r1
        L_0x0032:
            l.a.a.a.c r3 = l.a.a.a.f.a()     // Catch:{ all -> 0x005b }
            java.lang.String r4 = "Fabric"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x005b }
            r5.<init>()     // Catch:{ all -> 0x005b }
            java.lang.String r6 = "Could not calculate hash for app icon:"
            r5.append(r6)     // Catch:{ all -> 0x005b }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x005b }
            r5.append(r2)     // Catch:{ all -> 0x005b }
            java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x005b }
            r5 = 5
            boolean r3 = r3.a(r4, r5)     // Catch:{ all -> 0x005b }
            if (r3 == 0) goto L_0x0057
            android.util.Log.w(r4, r2, r1)     // Catch:{ all -> 0x005b }
        L_0x0057:
            a((java.io.Closeable) r8, (java.lang.String) r0)
            return r1
        L_0x005b:
            r1 = move-exception
        L_0x005c:
            a((java.io.Closeable) r8, (java.lang.String) r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.a.a.o.b.i.b(android.content.Context):java.lang.String");
    }

    public static String a(String... strArr) {
        if (!(strArr == null || strArr.length == 0)) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (str != null) {
                    arrayList.add(str.replace("-", "").toLowerCase(Locale.US));
                }
            }
            Collections.sort(arrayList);
            StringBuilder sb = new StringBuilder();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            String sb2 = sb.toString();
            if (sb2.length() > 0) {
                return a(sb2, "SHA-1");
            }
        }
        return null;
    }

    public static void a(Context context, int i2, String str) {
        if (g(context) && f.a().a("Fabric", i2)) {
            Log.println(i2, "Fabric", str);
        }
    }

    public static boolean a(Context context, String str, boolean z) {
        Resources resources;
        if (!(context == null || (resources = context.getResources()) == null)) {
            int a2 = a(context, str, "bool");
            if (a2 > 0) {
                return resources.getBoolean(a2);
            }
            int a3 = a(context, str, "string");
            if (a3 > 0) {
                return Boolean.parseBoolean(context.getString(a3));
            }
        }
        return z;
    }

    public static int a(Context context, String str, String str2) {
        String str3;
        Resources resources = context.getResources();
        int i2 = context.getApplicationContext().getApplicationInfo().icon;
        if (i2 > 0) {
            try {
                str3 = context.getResources().getResourcePackageName(i2);
            } catch (Resources.NotFoundException unused) {
                str3 = context.getPackageName();
            }
        } else {
            str3 = context.getPackageName();
        }
        return resources.getIdentifier(str, str2, str3);
    }

    public static String a(byte[] bArr) {
        char[] cArr = new char[(bArr.length * 2)];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            byte b2 = bArr[i2] & 255;
            int i3 = i2 * 2;
            char[] cArr2 = f5062b;
            cArr[i3] = cArr2[b2 >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static String a(Context context, String str) {
        int a2 = a(context, str, "string");
        return a2 > 0 ? context.getString(a2) : "";
    }

    public static void a(Closeable closeable, String str) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                if (f.a().a("Fabric", 6)) {
                    Log.e("Fabric", str, e);
                }
            }
        }
    }

    public static void a(Flushable flushable, String str) {
        if (flushable != null) {
            try {
                flushable.flush();
            } catch (IOException e) {
                if (f.a().a("Fabric", 6)) {
                    Log.e("Fabric", str, e);
                }
            }
        }
    }

    public static boolean a(String str) {
        return str == null || str.length() == 0;
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] bArr) {
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public static boolean a(Context context) {
        if (!(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0)) {
            return true;
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnectedOrConnecting()) {
            return false;
        }
        return true;
    }
}
