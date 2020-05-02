package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import i.a.a.a.a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import l.a.a.a.c;
import l.a.a.a.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BinaryImagesConverter {
    public static final String DATA_DIR = "/data";
    public final Context context;
    public final FileIdStrategy fileIdStrategy;

    public interface FileIdStrategy {
        String createId(File file);
    }

    public BinaryImagesConverter(Context context2, FileIdStrategy fileIdStrategy2) {
        this.context = context2;
        this.fileIdStrategy = fileIdStrategy2;
    }

    private File correctDataPath(File file) {
        if (!file.getAbsolutePath().startsWith(DATA_DIR)) {
            return file;
        }
        try {
            return new File(this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 0).nativeLibraryDir, file.getName());
        } catch (PackageManager.NameNotFoundException e) {
            if (!f.a().a(CrashlyticsCore.TAG, 6)) {
                return file;
            }
            Log.e(CrashlyticsCore.TAG, "Error getting ApplicationInfo", e);
            return file;
        }
    }

    public static JSONObject createBinaryImageJson(String str, ProcMapEntry procMapEntry) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("base_address", procMapEntry.address);
        jSONObject.put("size", procMapEntry.size);
        jSONObject.put(DefaultAppMeasurementEventListenerRegistrar.NAME, procMapEntry.path);
        jSONObject.put("uuid", str);
        return jSONObject;
    }

    public static byte[] generateBinaryImagesJsonString(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("binary_images", jSONArray);
            return jSONObject.toString().getBytes();
        } catch (JSONException e) {
            if (f.a().a(CrashlyticsCore.TAG, 5)) {
                Log.w(CrashlyticsCore.TAG, "Binary images string is null", e);
            }
            return new byte[0];
        }
    }

    private File getLibraryFile(String str) {
        File file = new File(str);
        return !file.exists() ? correctDataPath(file) : file;
    }

    public static boolean isRelevant(ProcMapEntry procMapEntry) {
        return (procMapEntry.perms.indexOf(120) == -1 || procMapEntry.path.indexOf(47) == -1) ? false : true;
    }

    public static String joinMapsEntries(JSONArray jSONArray) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            sb.append(jSONArray.getString(i2));
        }
        return sb.toString();
    }

    private JSONObject jsonFromMapEntryString(String str) {
        ProcMapEntry parse = ProcMapEntryParser.parse(str);
        if (parse != null && isRelevant(parse)) {
            try {
                try {
                    return createBinaryImageJson(this.fileIdStrategy.createId(getLibraryFile(parse.path)), parse);
                } catch (JSONException e) {
                    if (f.a().a(CrashlyticsCore.TAG, 3)) {
                        Log.d(CrashlyticsCore.TAG, "Could not create a binary image json string", e);
                    }
                    return null;
                }
            } catch (IOException e2) {
                c a = f.a();
                StringBuilder a2 = a.a("Could not generate ID for file ");
                a2.append(parse.path);
                String sb = a2.toString();
                if (a.a(CrashlyticsCore.TAG, 3)) {
                    Log.d(CrashlyticsCore.TAG, sb, e2);
                }
            }
        }
        return null;
    }

    private JSONArray parseProcMapsJsonFromStream(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return jSONArray;
            }
            JSONObject jsonFromMapEntryString = jsonFromMapEntryString(readLine);
            if (jsonFromMapEntryString != null) {
                jSONArray.put(jsonFromMapEntryString);
            }
        }
    }

    private JSONArray parseProcMapsJsonFromString(String str) {
        JSONArray jSONArray = new JSONArray();
        try {
            String[] split = joinMapsEntries(new JSONObject(str).getJSONArray("maps")).split("\\|");
            for (String jsonFromMapEntryString : split) {
                JSONObject jsonFromMapEntryString2 = jsonFromMapEntryString(jsonFromMapEntryString);
                if (jsonFromMapEntryString2 != null) {
                    jSONArray.put(jsonFromMapEntryString2);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            if (f.a().a(CrashlyticsCore.TAG, 5)) {
                Log.w(CrashlyticsCore.TAG, "Unable to parse proc maps string", e);
            }
            return jSONArray;
        }
    }

    public byte[] convert(String str) {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromString(str));
    }

    public byte[] convert(BufferedReader bufferedReader) {
        return generateBinaryImagesJsonString(parseProcMapsJsonFromStream(bufferedReader));
    }
}
