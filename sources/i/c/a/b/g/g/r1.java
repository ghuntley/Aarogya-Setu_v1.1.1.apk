package i.c.a.b.g.g;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.StrictMode;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.3.0 */
public final /* synthetic */ class r1 implements a2 {
    public static final a2 e = new r1();

    public final Object a() {
        z1 z1Var;
        BufferedReader bufferedReader;
        Context context = o1.f3374g;
        String str = Build.TYPE;
        String str2 = Build.TAGS;
        String str3 = Build.HARDWARE;
        if (!((str.equals("eng") || str.equals("userdebug")) && (str3.equals("goldfish") || str3.equals("ranchu") || str3.equals("robolectric")) && (str2.contains("dev-keys") || str2.contains("test-keys")))) {
            return y1.e;
        }
        if (d1.a() && !context.isDeviceProtectedStorage()) {
            context = context.createDeviceProtectedStorageContext();
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
            if (file.exists()) {
                z1Var = new c2(file);
            } else {
                z1Var = y1.e;
            }
        } catch (RuntimeException e2) {
            Log.e("HermeticFileOverrides", "no data dir", e2);
            z1Var = y1.e;
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
        if (!z1Var.a()) {
            return y1.e;
        }
        File file2 = (File) z1Var.b();
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
            HashMap hashMap = new HashMap();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    String[] split = readLine.split(" ", 3);
                    if (split.length != 3) {
                        Log.e("HermeticFileOverrides", readLine.length() != 0 ? "Invalid: ".concat(readLine) : new String("Invalid: "));
                    } else {
                        String str4 = split[0];
                        String decode = Uri.decode(split[1]);
                        String decode2 = Uri.decode(split[2]);
                        if (!hashMap.containsKey(str4)) {
                            hashMap.put(str4, new HashMap());
                        }
                        ((Map) hashMap.get(str4)).put(decode, decode2);
                    }
                } else {
                    String valueOf = String.valueOf(file2);
                    StringBuilder sb = new StringBuilder(valueOf.length() + 7);
                    sb.append("Parsed ");
                    sb.append(valueOf);
                    Log.i("HermeticFileOverrides", sb.toString());
                    l1 l1Var = new l1(hashMap);
                    bufferedReader.close();
                    return new c2(l1Var);
                }
            }
        } catch (IOException e3) {
            throw new RuntimeException(e3);
        } catch (Throwable th) {
            h2.a.a(th, th);
        }
        throw th;
    }
}
