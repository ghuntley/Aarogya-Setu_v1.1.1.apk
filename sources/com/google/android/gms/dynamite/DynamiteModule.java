package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import i.c.a.b.d.l.q;
import i.c.a.b.f.d;
import i.c.a.b.f.f;
import i.c.a.b.f.g;
import i.c.a.b.f.h;
import i.c.a.b.f.i;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public final class DynamiteModule {
    @GuardedBy("DynamiteModule.class")

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f499b = null;
    @GuardedBy("DynamiteModule.class")
    public static g c = null;
    @GuardedBy("DynamiteModule.class")
    public static i d = null;
    @GuardedBy("DynamiteModule.class")
    public static String e = null;
    @GuardedBy("DynamiteModule.class")

    /* renamed from: f  reason: collision with root package name */
    public static int f500f = -1;

    /* renamed from: g  reason: collision with root package name */
    public static final ThreadLocal<b> f501g = new ThreadLocal<>();

    /* renamed from: h  reason: collision with root package name */
    public static final a.b f502h = new i.c.a.b.f.a();

    /* renamed from: i  reason: collision with root package name */
    public static final a f503i = new i.c.a.b.f.b();

    /* renamed from: j  reason: collision with root package name */
    public static final a f504j = new i.c.a.b.f.c();

    /* renamed from: k  reason: collision with root package name */
    public static final a f505k = new d();
    public final Context a;

    @DynamiteApi
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static class DynamiteLoaderClassLoader {
        @GuardedBy("DynamiteLoaderClassLoader.class")
        public static ClassLoader sClassLoader;
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static class LoadingException extends Exception {
        public /* synthetic */ LoadingException(String str, i.c.a.b.f.a aVar) {
            super(str);
        }

        public /* synthetic */ LoadingException(String str, Throwable th, i.c.a.b.f.a aVar) {
            super(str, th);
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public interface a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
        public static class C0014a {
            public int a = 0;

            /* renamed from: b  reason: collision with root package name */
            public int f506b = 0;
            public int c = 0;
        }

        /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
        public interface b {
            int a(Context context, String str);

            int a(Context context, String str, boolean z);
        }

        C0014a a(Context context, String str, b bVar);
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static class b {
        public Cursor a;

        public b() {
        }

        public /* synthetic */ b(i.c.a.b.f.a aVar) {
        }
    }

    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static class c implements a.b {
        public final int a;

        public c(int i2) {
            this.a = i2;
        }

        public final int a(Context context, String str) {
            return this.a;
        }

        public final int a(Context context, String str, boolean z) {
            return 0;
        }
    }

    public DynamiteModule(Context context) {
        q.a(context);
        this.a = context;
    }

    public static DynamiteModule a(Context context, a aVar, String str) {
        a.C0014a a2;
        b bVar = f501g.get();
        b bVar2 = new b((i.c.a.b.f.a) null);
        f501g.set(bVar2);
        try {
            a2 = aVar.a(context, str, f502h);
            int i2 = a2.a;
            int i3 = a2.f506b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(i2);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(i3);
            Log.i("DynamiteModule", sb.toString());
            if (a2.c == 0 || ((a2.c == -1 && a2.a == 0) || (a2.c == 1 && a2.f506b == 0))) {
                int i4 = a2.a;
                int i5 = a2.f506b;
                StringBuilder sb2 = new StringBuilder(91);
                sb2.append("No acceptable module found. Local version is ");
                sb2.append(i4);
                sb2.append(" and remote version is ");
                sb2.append(i5);
                sb2.append(".");
                throw new LoadingException(sb2.toString(), (i.c.a.b.f.a) null);
            } else if (a2.c == -1) {
                DynamiteModule b2 = b(context, str);
                Cursor cursor = bVar2.a;
                if (cursor != null) {
                    cursor.close();
                }
                f501g.set(bVar);
                return b2;
            } else if (a2.c == 1) {
                DynamiteModule a3 = a(context, str, a2.f506b);
                Cursor cursor2 = bVar2.a;
                if (cursor2 != null) {
                    cursor2.close();
                }
                f501g.set(bVar);
                return a3;
            } else {
                int i6 = a2.c;
                StringBuilder sb3 = new StringBuilder(47);
                sb3.append("VersionPolicy returned invalid code:");
                sb3.append(i6);
                throw new LoadingException(sb3.toString(), (i.c.a.b.f.a) null);
            }
        } catch (LoadingException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to load remote module: ".concat(valueOf) : new String("Failed to load remote module: "));
            if (a2.a == 0 || aVar.a(context, str, new c(a2.a)).c != -1) {
                throw new LoadingException("Remote load failed. No local fallback found.", e2, (i.c.a.b.f.a) null);
            }
            DynamiteModule b3 = b(context, str);
            Cursor cursor3 = bVar2.a;
            if (cursor3 != null) {
                cursor3.close();
            }
            f501g.set(bVar);
            return b3;
        } catch (Throwable th) {
            Cursor cursor4 = bVar2.a;
            if (cursor4 != null) {
                cursor4.close();
            }
            f501g.set(bVar);
            throw th;
        }
    }

    public static int b(Context context, String str, boolean z) {
        g a2 = a(context);
        if (a2 == null) {
            return 0;
        }
        try {
            if (a2.f() >= 2) {
                return a2.a((i.c.a.b.e.a) new i.c.a.b.e.b(context), str, z);
            }
            Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
            return a2.b((i.c.a.b.e.a) new i.c.a.b.e.b(context), str, z);
        } catch (RemoteException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int c(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            r0 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r10 == 0) goto L_0x000a
            java.lang.String r8 = "api_force_staging"
            goto L_0x000c
        L_0x000a:
            java.lang.String r8 = "api"
        L_0x000c:
            int r10 = r8.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + 42
            java.lang.String r2 = java.lang.String.valueOf(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r2 = r2.length()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            int r10 = r10 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.<init>(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r10 = "content://com.google.android.gms.chimera/"
            r2.append(r10)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = "/"
            r2.append(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r2.append(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            java.lang.String r8 = r2.toString()     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            android.net.Uri r2 = android.net.Uri.parse(r8)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x009d, all -> 0x009b }
            if (r8 == 0) goto L_0x0083
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 == 0) goto L_0x0083
            r9 = 0
            int r9 = r8.getInt(r9)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r9 <= 0) goto L_0x007c
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r10 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            r1 = 2
            java.lang.String r1 = r8.getString(r1)     // Catch:{ all -> 0x0079 }
            e = r1     // Catch:{ all -> 0x0079 }
            java.lang.String r1 = "loaderVersion"
            int r1 = r8.getColumnIndex(r1)     // Catch:{ all -> 0x0079 }
            if (r1 < 0) goto L_0x0067
            int r1 = r8.getInt(r1)     // Catch:{ all -> 0x0079 }
            f500f = r1     // Catch:{ all -> 0x0079 }
        L_0x0067:
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            java.lang.ThreadLocal<com.google.android.gms.dynamite.DynamiteModule$b> r10 = f501g     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.Object r10 = r10.get()     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$b r10 = (com.google.android.gms.dynamite.DynamiteModule.b) r10     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r10 == 0) goto L_0x007c
            android.database.Cursor r1 = r10.a     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            if (r1 != 0) goto L_0x007c
            r10.a = r8     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            goto L_0x007d
        L_0x0079:
            r9 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0079 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x007c:
            r0 = r8
        L_0x007d:
            if (r0 == 0) goto L_0x0082
            r0.close()
        L_0x0082:
            return r9
        L_0x0083:
            java.lang.String r9 = "DynamiteModule"
            java.lang.String r10 = "Failed to retrieve remote module version."
            android.util.Log.w(r9, r10)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r9 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            java.lang.String r10 = "Failed to connect to dynamite module ContentResolver."
            r9.<init>(r10, r0)     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
            throw r9     // Catch:{ Exception -> 0x0096, all -> 0x0092 }
        L_0x0092:
            r9 = move-exception
            r0 = r8
            r8 = r9
            goto L_0x00ae
        L_0x0096:
            r9 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto L_0x009f
        L_0x009b:
            r8 = move-exception
            goto L_0x00ae
        L_0x009d:
            r8 = move-exception
            r9 = r0
        L_0x009f:
            boolean r10 = r8 instanceof com.google.android.gms.dynamite.DynamiteModule.LoadingException     // Catch:{ all -> 0x00ac }
            if (r10 == 0) goto L_0x00a4
            throw r8     // Catch:{ all -> 0x00ac }
        L_0x00a4:
            com.google.android.gms.dynamite.DynamiteModule$LoadingException r10 = new com.google.android.gms.dynamite.DynamiteModule$LoadingException     // Catch:{ all -> 0x00ac }
            java.lang.String r1 = "V2 version check failed"
            r10.<init>(r1, r8, r0)     // Catch:{ all -> 0x00ac }
            throw r10     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r8 = move-exception
            r0 = r9
        L_0x00ae:
            if (r0 == 0) goto L_0x00b3
            r0.close()
        L_0x00b3:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.c(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule b(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    public static DynamiteModule b(Context context, String str, int i2) {
        i iVar;
        i.c.a.b.e.a aVar;
        StringBuilder sb = new StringBuilder(i.a.a.a.a.a(str, 51));
        sb.append("Selected remote version of ");
        sb.append(str);
        sb.append(", version >= ");
        sb.append(i2);
        Log.i("DynamiteModule", sb.toString());
        synchronized (DynamiteModule.class) {
            iVar = d;
        }
        if (iVar != null) {
            b bVar = f501g.get();
            if (bVar == null || bVar.a == null) {
                throw new LoadingException("No result cursor", (i.c.a.b.f.a) null);
            }
            Context applicationContext = context.getApplicationContext();
            Cursor cursor = bVar.a;
            new i.c.a.b.e.b(null);
            if (a().booleanValue()) {
                Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                aVar = iVar.b(new i.c.a.b.e.b(applicationContext), str, i2, new i.c.a.b.e.b(cursor));
            } else {
                Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                aVar = iVar.a(new i.c.a.b.e.b(applicationContext), str, i2, new i.c.a.b.e.b(cursor));
            }
            Context context2 = (Context) i.c.a.b.e.b.a(aVar);
            if (context2 != null) {
                return new DynamiteModule(context2);
            }
            throw new LoadingException("Failed to get module context", (i.c.a.b.f.a) null);
        }
        throw new LoadingException("DynamiteLoaderV2 was not cached.", (i.c.a.b.f.a) null);
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (declaredField.get((Object) null).equals(str)) {
                return declaredField2.getInt((Object) null);
            }
            String valueOf = String.valueOf(declaredField.get((Object) null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(i.a.a.a.a.a(str, 45));
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0052=Splitter:B:23:0x0052, B:18:0x0035=Splitter:B:18:0x0035, B:39:0x008d=Splitter:B:39:0x008d} */
    public static int a(android.content.Context r8, java.lang.String r9, boolean r10) {
        /*
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r0 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r0)     // Catch:{ all -> 0x00fe }
            java.lang.Boolean r1 = f499b     // Catch:{ all -> 0x00fb }
            if (r1 != 0) goto L_0x00c8
            android.content.Context r1 = r8.getApplicationContext()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule$DynamiteLoaderClassLoader> r2 = com.google.android.gms.dynamite.DynamiteModule.DynamiteLoaderClassLoader.class
            java.lang.String r2 = r2.getName()     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.Class r1 = r1.loadClass(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            java.lang.String r2 = "sClassLoader"
            java.lang.reflect.Field r2 = r1.getDeclaredField(r2)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            monitor-enter(r1)     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
            r3 = 0
            java.lang.Object r4 = r2.get(r3)     // Catch:{ all -> 0x009c }
            java.lang.ClassLoader r4 = (java.lang.ClassLoader) r4     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0038
            java.lang.ClassLoader r2 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            if (r4 != r2) goto L_0x0032
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x0099
        L_0x0032:
            a((java.lang.ClassLoader) r4)     // Catch:{ LoadingException -> 0x0035 }
        L_0x0035:
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x009c }
            goto L_0x0099
        L_0x0038:
            java.lang.String r4 = "com.google.android.gms"
            android.content.Context r5 = r8.getApplicationContext()     // Catch:{ all -> 0x009c }
            java.lang.String r5 = r5.getPackageName()     // Catch:{ all -> 0x009c }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x009c }
            if (r4 == 0) goto L_0x0052
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r2.set(r3, r4)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
            goto L_0x0099
        L_0x0052:
            int r4 = c(r8, r9, r10)     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r5 = e     // Catch:{ LoadingException -> 0x0090 }
            if (r5 == 0) goto L_0x008d
            java.lang.String r5 = e     // Catch:{ LoadingException -> 0x0090 }
            boolean r5 = r5.isEmpty()     // Catch:{ LoadingException -> 0x0090 }
            if (r5 == 0) goto L_0x0063
            goto L_0x008d
        L_0x0063:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ LoadingException -> 0x0090 }
            r6 = 29
            if (r5 < r6) goto L_0x0075
            dalvik.system.DelegateLastClassLoader r5 = new dalvik.system.DelegateLastClassLoader     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r6 = e     // Catch:{ LoadingException -> 0x0090 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0090 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x0090 }
            goto L_0x0080
        L_0x0075:
            i.c.a.b.f.e r5 = new i.c.a.b.f.e     // Catch:{ LoadingException -> 0x0090 }
            java.lang.String r6 = e     // Catch:{ LoadingException -> 0x0090 }
            java.lang.ClassLoader r7 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ LoadingException -> 0x0090 }
            r5.<init>(r6, r7)     // Catch:{ LoadingException -> 0x0090 }
        L_0x0080:
            a((java.lang.ClassLoader) r5)     // Catch:{ LoadingException -> 0x0090 }
            r2.set(r3, r5)     // Catch:{ LoadingException -> 0x0090 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ LoadingException -> 0x0090 }
            f499b = r5     // Catch:{ LoadingException -> 0x0090 }
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x00fb }
            return r4
        L_0x008d:
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            monitor-exit(r0)     // Catch:{ all -> 0x00fb }
            return r4
        L_0x0090:
            java.lang.ClassLoader r4 = java.lang.ClassLoader.getSystemClassLoader()     // Catch:{ all -> 0x009c }
            r2.set(r3, r4)     // Catch:{ all -> 0x009c }
            java.lang.Boolean r2 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x009c }
        L_0x0099:
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            r1 = r2
            goto L_0x00c6
        L_0x009c:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x009c }
            throw r2     // Catch:{ ClassNotFoundException -> 0x00a3, IllegalAccessException -> 0x00a1, NoSuchFieldException -> 0x009f }
        L_0x009f:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a1:
            r1 = move-exception
            goto L_0x00a4
        L_0x00a3:
            r1 = move-exception
        L_0x00a4:
            java.lang.String r2 = "DynamiteModule"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00fb }
            int r3 = r1.length()     // Catch:{ all -> 0x00fb }
            int r3 = r3 + 30
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00fb }
            r4.<init>(r3)     // Catch:{ all -> 0x00fb }
            java.lang.String r3 = "Failed to load module via V2: "
            r4.append(r3)     // Catch:{ all -> 0x00fb }
            r4.append(r1)     // Catch:{ all -> 0x00fb }
            java.lang.String r1 = r4.toString()     // Catch:{ all -> 0x00fb }
            android.util.Log.w(r2, r1)     // Catch:{ all -> 0x00fb }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x00fb }
        L_0x00c6:
            f499b = r1     // Catch:{ all -> 0x00fb }
        L_0x00c8:
            monitor-exit(r0)     // Catch:{ all -> 0x00fb }
            boolean r0 = r1.booleanValue()     // Catch:{ all -> 0x00fe }
            if (r0 == 0) goto L_0x00f6
            int r8 = c(r8, r9, r10)     // Catch:{ LoadingException -> 0x00d4 }
            return r8
        L_0x00d4:
            r9 = move-exception
            java.lang.String r10 = "DynamiteModule"
            java.lang.String r0 = "Failed to retrieve remote module version: "
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x00fe }
            java.lang.String r9 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x00fe }
            int r1 = r9.length()     // Catch:{ all -> 0x00fe }
            if (r1 == 0) goto L_0x00ec
            java.lang.String r9 = r0.concat(r9)     // Catch:{ all -> 0x00fe }
            goto L_0x00f1
        L_0x00ec:
            java.lang.String r9 = new java.lang.String     // Catch:{ all -> 0x00fe }
            r9.<init>(r0)     // Catch:{ all -> 0x00fe }
        L_0x00f1:
            android.util.Log.w(r10, r9)     // Catch:{ all -> 0x00fe }
            r8 = 0
            return r8
        L_0x00f6:
            int r8 = b((android.content.Context) r8, (java.lang.String) r9, (boolean) r10)     // Catch:{ all -> 0x00fe }
            return r8
        L_0x00fb:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00fb }
            throw r9     // Catch:{ all -> 0x00fe }
        L_0x00fe:
            r9 = move-exception
            i.c.a.b.d.l.q.a(r8)     // Catch:{ Exception -> 0x0106 }
            i.c.a.b.d.l.q.a(r9)     // Catch:{ Exception -> 0x0106 }
            goto L_0x010e
        L_0x0106:
            r8 = move-exception
            java.lang.String r10 = "CrashUtils"
            java.lang.String r0 = "Error adding exception to DropBox!"
            android.util.Log.e(r10, r0, r8)
        L_0x010e:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.a(android.content.Context, java.lang.String, boolean):int");
    }

    public static DynamiteModule a(Context context, String str, int i2) {
        Boolean bool;
        i.c.a.b.e.a aVar;
        try {
            synchronized (DynamiteModule.class) {
                bool = f499b;
            }
            if (bool == null) {
                throw new LoadingException("Failed to determine which loading route to use.", (i.c.a.b.f.a) null);
            } else if (bool.booleanValue()) {
                return b(context, str, i2);
            } else {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51);
                sb.append("Selected remote version of ");
                sb.append(str);
                sb.append(", version >= ");
                sb.append(i2);
                Log.i("DynamiteModule", sb.toString());
                g a2 = a(context);
                if (a2 != null) {
                    if (a2.f() >= 2) {
                        aVar = a2.b((i.c.a.b.e.a) new i.c.a.b.e.b(context), str, i2);
                    } else {
                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                        aVar = a2.a((i.c.a.b.e.a) new i.c.a.b.e.b(context), str, i2);
                    }
                    if (i.c.a.b.e.b.a(aVar) != null) {
                        return new DynamiteModule((Context) i.c.a.b.e.b.a(aVar));
                    }
                    throw new LoadingException("Failed to load remote module.", (i.c.a.b.f.a) null);
                }
                throw new LoadingException("Failed to create IDynamiteLoader.", (i.c.a.b.f.a) null);
            }
        } catch (RemoteException e2) {
            throw new LoadingException("Failed to load remote module.", e2, (i.c.a.b.f.a) null);
        } catch (LoadingException e3) {
            throw e3;
        } catch (Throwable th) {
            try {
                q.a(context);
                q.a(th);
            } catch (Exception e4) {
                Log.e("CrashUtils", "Error adding exception to DropBox!", e4);
            }
            throw new LoadingException("Failed to load remote module.", th, (i.c.a.b.f.a) null);
        }
    }

    public static g a(Context context) {
        g gVar;
        synchronized (DynamiteModule.class) {
            if (c != null) {
                g gVar2 = c;
                return gVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    gVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof g) {
                        gVar = (g) queryLocalInterface;
                    } else {
                        gVar = new f(iBinder);
                    }
                }
                if (gVar != null) {
                    c = gVar;
                    return gVar;
                }
            } catch (Exception e2) {
                String valueOf = String.valueOf(e2.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
        }
        return null;
    }

    public static Boolean a() {
        Boolean valueOf;
        synchronized (DynamiteModule.class) {
            valueOf = Boolean.valueOf(f500f >= 2);
        }
        return valueOf;
    }

    @GuardedBy("DynamiteModule.class")
    public static void a(ClassLoader classLoader) {
        i iVar;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                iVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof i) {
                    iVar = (i) queryLocalInterface;
                } else {
                    iVar = new h(iBinder);
                }
            }
            d = iVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
            throw new LoadingException("Failed to instantiate dynamite loader", e2, (i.c.a.b.f.a) null);
        }
    }

    public final IBinder a(String str) {
        try {
            return (IBinder) this.a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e2) {
            String valueOf = String.valueOf(str);
            throw new LoadingException(valueOf.length() != 0 ? "Failed to instantiate module class: ".concat(valueOf) : new String("Failed to instantiate module class: "), e2, (i.c.a.b.f.a) null);
        }
    }
}
