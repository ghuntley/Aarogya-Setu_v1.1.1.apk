package com.crashlytics.android.core;

import i.a.a.a.a;
import java.io.File;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

public class MetaDataStore {
    public static final String KEYDATA_SUFFIX = "keys";
    public static final String KEY_USER_EMAIL = "userEmail";
    public static final String KEY_USER_ID = "userId";
    public static final String KEY_USER_NAME = "userName";
    public static final String METADATA_EXT = ".meta";
    public static final String USERDATA_SUFFIX = "user";
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    public final File filesDir;

    public MetaDataStore(File file) {
        this.filesDir = file;
    }

    public static Map<String, String> jsonToKeysData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, valueOrNull(jSONObject, next));
        }
        return hashMap;
    }

    public static UserMetaData jsonToUserData(String str) {
        JSONObject jSONObject = new JSONObject(str);
        return new UserMetaData(valueOrNull(jSONObject, KEY_USER_ID), valueOrNull(jSONObject, KEY_USER_NAME), valueOrNull(jSONObject, KEY_USER_EMAIL));
    }

    public static String keysDataToJson(Map<String, String> map) {
        return new JSONObject(map).toString();
    }

    public static String userDataToJson(final UserMetaData userMetaData) {
        return new JSONObject() {
            {
                put(MetaDataStore.KEY_USER_ID, userMetaData.id);
                put(MetaDataStore.KEY_USER_NAME, userMetaData.name);
                put(MetaDataStore.KEY_USER_EMAIL, userMetaData.email);
            }
        }.toString();
    }

    public static String valueOrNull(JSONObject jSONObject, String str) {
        if (!jSONObject.isNull(str)) {
            return jSONObject.optString(str, (String) null);
        }
        return null;
    }

    public File getKeysFileForSession(String str) {
        return new File(this.filesDir, a.a(str, KEYDATA_SUFFIX, METADATA_EXT));
    }

    public File getUserDataFileForSession(String str) {
        return new File(this.filesDir, a.a(str, USERDATA_SUFFIX, METADATA_EXT));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b A[Catch:{ all -> 0x0029 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map<java.lang.String, java.lang.String> readKeyData(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to close user metadata file."
            java.io.File r7 = r6.getKeysFileForSession(r7)
            boolean r1 = r7.exists()
            if (r1 != 0) goto L_0x0011
            java.util.Map r7 = java.util.Collections.emptyMap()
            return r7
        L_0x0011:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x002b }
            r2.<init>(r7)     // Catch:{ Exception -> 0x002b }
            java.lang.String r7 = l.a.a.a.o.b.i.b((java.io.InputStream) r2)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            java.util.Map r7 = jsonToKeysData(r7)     // Catch:{ Exception -> 0x0026, all -> 0x0023 }
            l.a.a.a.o.b.i.a((java.io.Closeable) r2, (java.lang.String) r0)
            return r7
        L_0x0023:
            r7 = move-exception
            r1 = r2
            goto L_0x0046
        L_0x0026:
            r7 = move-exception
            r1 = r2
            goto L_0x002c
        L_0x0029:
            r7 = move-exception
            goto L_0x0046
        L_0x002b:
            r7 = move-exception
        L_0x002c:
            l.a.a.a.c r2 = l.a.a.a.f.a()     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "CrashlyticsCore"
            java.lang.String r4 = "Error deserializing user metadata."
            r5 = 6
            boolean r2 = r2.a(r3, r5)     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x003e
            android.util.Log.e(r3, r4, r7)     // Catch:{ all -> 0x0029 }
        L_0x003e:
            l.a.a.a.o.b.i.a((java.io.Closeable) r1, (java.lang.String) r0)
            java.util.Map r7 = java.util.Collections.emptyMap()
            return r7
        L_0x0046:
            l.a.a.a.o.b.i.a((java.io.Closeable) r1, (java.lang.String) r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.MetaDataStore.readKeyData(java.lang.String):java.util.Map");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039 A[Catch:{ all -> 0x0027 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.crashlytics.android.core.UserMetaData readUserData(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Failed to close user metadata file."
            java.io.File r7 = r6.getUserDataFileForSession(r7)
            boolean r1 = r7.exists()
            if (r1 != 0) goto L_0x000f
            com.crashlytics.android.core.UserMetaData r7 = com.crashlytics.android.core.UserMetaData.EMPTY
            return r7
        L_0x000f:
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0029 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x0029 }
            java.lang.String r7 = l.a.a.a.o.b.i.b((java.io.InputStream) r2)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            com.crashlytics.android.core.UserMetaData r7 = jsonToUserData(r7)     // Catch:{ Exception -> 0x0024, all -> 0x0021 }
            l.a.a.a.o.b.i.a((java.io.Closeable) r2, (java.lang.String) r0)
            return r7
        L_0x0021:
            r7 = move-exception
            r1 = r2
            goto L_0x0042
        L_0x0024:
            r7 = move-exception
            r1 = r2
            goto L_0x002a
        L_0x0027:
            r7 = move-exception
            goto L_0x0042
        L_0x0029:
            r7 = move-exception
        L_0x002a:
            l.a.a.a.c r2 = l.a.a.a.f.a()     // Catch:{ all -> 0x0027 }
            java.lang.String r3 = "CrashlyticsCore"
            java.lang.String r4 = "Error deserializing user metadata."
            r5 = 6
            boolean r2 = r2.a(r3, r5)     // Catch:{ all -> 0x0027 }
            if (r2 == 0) goto L_0x003c
            android.util.Log.e(r3, r4, r7)     // Catch:{ all -> 0x0027 }
        L_0x003c:
            l.a.a.a.o.b.i.a((java.io.Closeable) r1, (java.lang.String) r0)
            com.crashlytics.android.core.UserMetaData r7 = com.crashlytics.android.core.UserMetaData.EMPTY
            return r7
        L_0x0042:
            l.a.a.a.o.b.i.a((java.io.Closeable) r1, (java.lang.String) r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.MetaDataStore.readUserData(java.lang.String):com.crashlytics.android.core.UserMetaData");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[Catch:{ all -> 0x002c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeKeyData(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to close key/value metadata file."
            java.io.File r6 = r5.getKeysFileForSession(r6)
            r1 = 0
            java.lang.String r7 = keysDataToJson(r7)     // Catch:{ Exception -> 0x002e }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x002e }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x002e }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002e }
            r4.<init>(r6)     // Catch:{ Exception -> 0x002e }
            java.nio.charset.Charset r6 = UTF_8     // Catch:{ Exception -> 0x002e }
            r3.<init>(r4, r6)     // Catch:{ Exception -> 0x002e }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002e }
            r2.write(r7)     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r2.flush()     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            l.a.a.a.o.b.i.a((java.io.Closeable) r2, (java.lang.String) r0)
            goto L_0x0044
        L_0x0026:
            r6 = move-exception
            r1 = r2
            goto L_0x0045
        L_0x0029:
            r6 = move-exception
            r1 = r2
            goto L_0x002f
        L_0x002c:
            r6 = move-exception
            goto L_0x0045
        L_0x002e:
            r6 = move-exception
        L_0x002f:
            l.a.a.a.c r7 = l.a.a.a.f.a()     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "CrashlyticsCore"
            java.lang.String r3 = "Error serializing key/value metadata."
            r4 = 6
            boolean r7 = r7.a(r2, r4)     // Catch:{ all -> 0x002c }
            if (r7 == 0) goto L_0x0041
            android.util.Log.e(r2, r3, r6)     // Catch:{ all -> 0x002c }
        L_0x0041:
            l.a.a.a.o.b.i.a((java.io.Closeable) r1, (java.lang.String) r0)
        L_0x0044:
            return
        L_0x0045:
            l.a.a.a.o.b.i.a((java.io.Closeable) r1, (java.lang.String) r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.MetaDataStore.writeKeyData(java.lang.String, java.util.Map):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[Catch:{ all -> 0x002c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void writeUserData(java.lang.String r6, com.crashlytics.android.core.UserMetaData r7) {
        /*
            r5 = this;
            java.lang.String r0 = "Failed to close user metadata file."
            java.io.File r6 = r5.getUserDataFileForSession(r6)
            r1 = 0
            java.lang.String r7 = userDataToJson(r7)     // Catch:{ Exception -> 0x002e }
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x002e }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x002e }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x002e }
            r4.<init>(r6)     // Catch:{ Exception -> 0x002e }
            java.nio.charset.Charset r6 = UTF_8     // Catch:{ Exception -> 0x002e }
            r3.<init>(r4, r6)     // Catch:{ Exception -> 0x002e }
            r2.<init>(r3)     // Catch:{ Exception -> 0x002e }
            r2.write(r7)     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            r2.flush()     // Catch:{ Exception -> 0x0029, all -> 0x0026 }
            l.a.a.a.o.b.i.a((java.io.Closeable) r2, (java.lang.String) r0)
            goto L_0x0044
        L_0x0026:
            r6 = move-exception
            r1 = r2
            goto L_0x0045
        L_0x0029:
            r6 = move-exception
            r1 = r2
            goto L_0x002f
        L_0x002c:
            r6 = move-exception
            goto L_0x0045
        L_0x002e:
            r6 = move-exception
        L_0x002f:
            l.a.a.a.c r7 = l.a.a.a.f.a()     // Catch:{ all -> 0x002c }
            java.lang.String r2 = "CrashlyticsCore"
            java.lang.String r3 = "Error serializing user metadata."
            r4 = 6
            boolean r7 = r7.a(r2, r4)     // Catch:{ all -> 0x002c }
            if (r7 == 0) goto L_0x0041
            android.util.Log.e(r2, r3, r6)     // Catch:{ all -> 0x002c }
        L_0x0041:
            l.a.a.a.o.b.i.a((java.io.Closeable) r1, (java.lang.String) r0)
        L_0x0044:
            return
        L_0x0045:
            l.a.a.a.o.b.i.a((java.io.Closeable) r1, (java.lang.String) r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.MetaDataStore.writeUserData(java.lang.String, com.crashlytics.android.core.UserMetaData):void");
    }
}
