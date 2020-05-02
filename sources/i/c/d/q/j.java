package i.c.d.q;

import i.c.d.q.m.o;
import java.util.concurrent.Callable;

/* compiled from: com.google.firebase:firebase-config@@19.1.3 */
public final /* synthetic */ class j implements Callable {
    public final o e;

    public j(o oVar) {
        this.e = oVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v14, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: android.content.Context} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v20, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        if (r6 != null) goto L_0x004d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0042 A[Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0038, all -> 0x0035, all -> 0x002d }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0132 A[SYNTHETIC, Splitter:B:64:0x0132] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object call() {
        /*
            r13 = this;
            i.c.d.q.m.o r0 = r13.e
            android.content.SharedPreferences r1 = r0.c
            r2 = 1
            java.lang.String r3 = "save_legacy_configs"
            boolean r1 = r1.getBoolean(r3, r2)
            r4 = 0
            if (r1 == 0) goto L_0x013b
            java.lang.String r1 = "Failed to close persisted config file."
            java.lang.String r5 = "FirebaseRemoteConfig"
            android.content.Context r6 = r0.a
            r7 = 0
            if (r6 != 0) goto L_0x0018
            goto L_0x0055
        L_0x0018:
            java.lang.String r8 = "persisted_config"
            java.io.FileInputStream r6 = r6.openFileInput(r8)     // Catch:{ FileNotFoundException -> 0x0043, IOException -> 0x0038, all -> 0x0035 }
            i.c.d.q.n.j r8 = i.c.d.q.n.j.a((java.io.InputStream) r6)     // Catch:{ FileNotFoundException -> 0x0033, IOException -> 0x0031 }
            if (r6 == 0) goto L_0x0056
            r6.close()     // Catch:{ IOException -> 0x0028 }
            goto L_0x0056
        L_0x0028:
            r6 = move-exception
            android.util.Log.d(r5, r1, r6)
            goto L_0x0056
        L_0x002d:
            r0 = move-exception
            r7 = r6
            goto L_0x0130
        L_0x0031:
            r8 = move-exception
            goto L_0x003b
        L_0x0033:
            r8 = move-exception
            goto L_0x0046
        L_0x0035:
            r0 = move-exception
            goto L_0x0130
        L_0x0038:
            r6 = move-exception
            r8 = r6
            r6 = r7
        L_0x003b:
            java.lang.String r9 = "Cannot initialize from persisted config."
            android.util.Log.d(r5, r9, r8)     // Catch:{ all -> 0x002d }
            if (r6 == 0) goto L_0x0055
            goto L_0x004d
        L_0x0043:
            r6 = move-exception
            r8 = r6
            r6 = r7
        L_0x0046:
            java.lang.String r9 = "Persisted config file was not found."
            android.util.Log.d(r5, r9, r8)     // Catch:{ all -> 0x002d }
            if (r6 == 0) goto L_0x0055
        L_0x004d:
            r6.close()     // Catch:{ IOException -> 0x0051 }
            goto L_0x0055
        L_0x0051:
            r6 = move-exception
            android.util.Log.d(r5, r1, r6)
        L_0x0055:
            r8 = r7
        L_0x0056:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            if (r8 != 0) goto L_0x005f
            goto L_0x00da
        L_0x005f:
            i.c.d.q.n.b r5 = r8.i()
            java.util.Map r5 = r0.a((i.c.d.q.n.b) r5)
            i.c.d.q.n.b r6 = r8.k()
            java.util.Map r6 = r0.a((i.c.d.q.n.b) r6)
            i.c.d.q.n.b r8 = r8.j()
            java.util.Map r8 = r0.a((i.c.d.q.n.b) r8)
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.HashMap r5 = (java.util.HashMap) r5
            java.util.Set r10 = r5.keySet()
            r9.addAll(r10)
            java.util.HashMap r6 = (java.util.HashMap) r6
            java.util.Set r10 = r6.keySet()
            r9.addAll(r10)
            java.util.HashMap r8 = (java.util.HashMap) r8
            java.util.Set r10 = r8.keySet()
            r9.addAll(r10)
            java.util.Iterator r9 = r9.iterator()
        L_0x009b:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x00da
            java.lang.Object r10 = r9.next()
            java.lang.String r10 = (java.lang.String) r10
            i.c.d.q.m.o$b r11 = new i.c.d.q.m.o$b
            r11.<init>(r7)
            boolean r12 = r5.containsKey(r10)
            if (r12 == 0) goto L_0x00ba
            java.lang.Object r12 = r5.get(r10)
            i.c.d.q.m.f r12 = (i.c.d.q.m.f) r12
            r11.f4809b = r12
        L_0x00ba:
            boolean r12 = r6.containsKey(r10)
            if (r12 == 0) goto L_0x00c8
            java.lang.Object r12 = r6.get(r10)
            i.c.d.q.m.f r12 = (i.c.d.q.m.f) r12
            r11.a = r12
        L_0x00c8:
            boolean r12 = r8.containsKey(r10)
            if (r12 == 0) goto L_0x00d6
            java.lang.Object r12 = r8.get(r10)
            i.c.d.q.m.f r12 = (i.c.d.q.m.f) r12
            r11.c = r12
        L_0x00d6:
            r1.put(r10, r11)
            goto L_0x009b
        L_0x00da:
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x00e2:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L_0x0122
            java.lang.Object r5 = r1.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            i.c.d.q.m.o$b r5 = (i.c.d.q.m.o.b) r5
            java.lang.String r7 = "fetch"
            i.c.d.q.m.e r7 = r0.a(r6, r7)
            java.lang.String r8 = "activate"
            i.c.d.q.m.e r8 = r0.a(r6, r8)
            java.lang.String r9 = "defaults"
            i.c.d.q.m.e r6 = r0.a(r6, r9)
            i.c.d.q.m.f r9 = r5.a
            if (r9 == 0) goto L_0x0113
            r7.a((i.c.d.q.m.f) r9)
        L_0x0113:
            i.c.d.q.m.f r7 = r5.f4809b
            if (r7 == 0) goto L_0x011a
            r8.a((i.c.d.q.m.f) r7)
        L_0x011a:
            i.c.d.q.m.f r5 = r5.c
            if (r5 == 0) goto L_0x00e2
            r6.a((i.c.d.q.m.f) r5)
            goto L_0x00e2
        L_0x0122:
            android.content.SharedPreferences r0 = r0.c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putBoolean(r3, r4)
            r0.commit()
            goto L_0x013c
        L_0x0130:
            if (r7 == 0) goto L_0x013a
            r7.close()     // Catch:{ IOException -> 0x0136 }
            goto L_0x013a
        L_0x0136:
            r2 = move-exception
            android.util.Log.d(r5, r1, r2)
        L_0x013a:
            throw r0
        L_0x013b:
            r2 = 0
        L_0x013c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.d.q.j.call():java.lang.Object");
    }
}
