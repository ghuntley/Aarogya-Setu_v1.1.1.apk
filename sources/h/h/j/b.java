package h.h.j;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;
import h.e.h;
import h.h.j.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: FontsContractCompat */
public class b {
    public static final h.e.f<String, Typeface> a = new h.e.f<>(16);

    /* renamed from: b  reason: collision with root package name */
    public static final c f1778b = new c("fonts", 10, l.a.a.a.o.b.a.DEFAULT_TIMEOUT);
    public static final Object c = new Object();
    public static final h<String, ArrayList<c.C0047c<g>>> d = new h<>();
    public static final Comparator<byte[]> e = new d();

    /* compiled from: FontsContractCompat */
    public static class a implements Callable<g> {
        public final /* synthetic */ Context e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ a f1779f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ int f1780g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f1781h;

        public a(Context context, a aVar, int i2, String str) {
            this.e = context;
            this.f1779f = aVar;
            this.f1780g = i2;
            this.f1781h = str;
        }

        public Object call() {
            g a = b.a(this.e, this.f1779f, this.f1780g);
            Typeface typeface = a.a;
            if (typeface != null) {
                b.a.a(this.f1781h, typeface);
            }
            return a;
        }
    }

    /* renamed from: h.h.j.b$b  reason: collision with other inner class name */
    /* compiled from: FontsContractCompat */
    public static class C0046b implements c.C0047c<g> {
        public final /* synthetic */ h.h.f.b.g a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Handler f1782b;

        public C0046b(h.h.f.b.g gVar, Handler handler) {
            this.a = gVar;
            this.f1782b = handler;
        }

        public void a(Object obj) {
            g gVar = (g) obj;
            if (gVar == null) {
                this.a.a(1, this.f1782b);
                return;
            }
            int i2 = gVar.f1785b;
            if (i2 == 0) {
                this.a.a(gVar.a, this.f1782b);
            } else {
                this.a.a(i2, this.f1782b);
            }
        }
    }

    /* compiled from: FontsContractCompat */
    public static class c implements c.C0047c<g> {
        public final /* synthetic */ String a;

        public c(String str) {
            this.a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r0 >= r1.size()) goto L_0x002c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            ((h.h.j.c.C0047c) r1.get(r0)).a(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = 0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(h.h.j.b.g r5) {
            /*
                r4 = this;
                java.lang.Object r0 = h.h.j.b.c
                monitor-enter(r0)
                h.e.h<java.lang.String, java.util.ArrayList<h.h.j.c$c<h.h.j.b$g>>> r1 = h.h.j.b.d     // Catch:{ all -> 0x002d }
                java.lang.String r2 = r4.a     // Catch:{ all -> 0x002d }
                java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x002d }
                java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x002d }
                if (r1 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                return
            L_0x0011:
                h.e.h<java.lang.String, java.util.ArrayList<h.h.j.c$c<h.h.j.b$g>>> r2 = h.h.j.b.d     // Catch:{ all -> 0x002d }
                java.lang.String r3 = r4.a     // Catch:{ all -> 0x002d }
                r2.remove(r3)     // Catch:{ all -> 0x002d }
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                r0 = 0
            L_0x001a:
                int r2 = r1.size()
                if (r0 >= r2) goto L_0x002c
                java.lang.Object r2 = r1.get(r0)
                h.h.j.c$c r2 = (h.h.j.c.C0047c) r2
                r2.a(r5)
                int r0 = r0 + 1
                goto L_0x001a
            L_0x002c:
                return
            L_0x002d:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002d }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: h.h.j.b.c.a(h.h.j.b$g):void");
        }
    }

    /* compiled from: FontsContractCompat */
    public static class d implements Comparator<byte[]> {
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: byte} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: byte} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int compare(java.lang.Object r5, java.lang.Object r6) {
            /*
                r4 = this;
                byte[] r5 = (byte[]) r5
                byte[] r6 = (byte[]) r6
                int r0 = r5.length
                int r1 = r6.length
                r2 = 0
                if (r0 == r1) goto L_0x000c
                int r5 = r5.length
                int r6 = r6.length
                goto L_0x001a
            L_0x000c:
                r0 = 0
            L_0x000d:
                int r1 = r5.length
                if (r0 >= r1) goto L_0x0020
                byte r1 = r5[r0]
                byte r3 = r6[r0]
                if (r1 == r3) goto L_0x001d
                byte r5 = r5[r0]
                byte r6 = r6[r0]
            L_0x001a:
                int r2 = r5 - r6
                goto L_0x0020
            L_0x001d:
                int r0 = r0 + 1
                goto L_0x000d
            L_0x0020:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: h.h.j.b.d.compare(java.lang.Object, java.lang.Object):int");
        }
    }

    /* compiled from: FontsContractCompat */
    public static class e {
        public final int a;

        /* renamed from: b  reason: collision with root package name */
        public final f[] f1783b;

        public e(int i2, f[] fVarArr) {
            this.a = i2;
            this.f1783b = fVarArr;
        }
    }

    /* compiled from: FontsContractCompat */
    public static class f {
        public final Uri a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1784b;
        public final int c;
        public final boolean d;
        public final int e;

        public f(Uri uri, int i2, int i3, boolean z, int i4) {
            if (uri != null) {
                this.a = uri;
                this.f1784b = i2;
                this.c = i3;
                this.d = z;
                this.e = i4;
                return;
            }
            throw null;
        }
    }

    /* compiled from: FontsContractCompat */
    public static final class g {
        public final Typeface a;

        /* renamed from: b  reason: collision with root package name */
        public final int f1785b;

        public g(Typeface typeface, int i2) {
            this.a = typeface;
            this.f1785b = i2;
        }
    }

    public static g a(Context context, a aVar, int i2) {
        try {
            e a2 = a(context, (CancellationSignal) null, aVar);
            int i3 = a2.a;
            int i4 = -3;
            if (i3 == 0) {
                Typeface a3 = h.h.g.c.a.a(context, (CancellationSignal) null, a2.f1783b, i2);
                if (a3 != null) {
                    i4 = 0;
                }
                return new g(a3, i4);
            }
            if (i3 == 1) {
                i4 = -2;
            }
            return new g((Typeface) null, i4);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g((Typeface) null, -1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0070, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        r3 = f1778b;
        r4 = new h.h.j.b.c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (r3 == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r3.b(new h.h.j.d(r3, r1, new android.os.Handler(), r4));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0097, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0098, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Typeface a(android.content.Context r2, h.h.j.a r3, h.h.f.b.g r4, android.os.Handler r5, boolean r6, int r7, int r8) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.f1777f
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            h.e.f<java.lang.String, android.graphics.Typeface> r1 = a
            java.lang.Object r1 = r1.a(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0026
            if (r4 == 0) goto L_0x0025
            r4.a((android.graphics.Typeface) r1)
        L_0x0025:
            return r1
        L_0x0026:
            if (r6 == 0) goto L_0x0041
            r1 = -1
            if (r7 != r1) goto L_0x0041
            h.h.j.b$g r2 = a((android.content.Context) r2, (h.h.j.a) r3, (int) r8)
            if (r4 == 0) goto L_0x003e
            int r3 = r2.f1785b
            if (r3 != 0) goto L_0x003b
            android.graphics.Typeface r3 = r2.a
            r4.a((android.graphics.Typeface) r3, (android.os.Handler) r5)
            goto L_0x003e
        L_0x003b:
            r4.a((int) r3, (android.os.Handler) r5)
        L_0x003e:
            android.graphics.Typeface r2 = r2.a
            return r2
        L_0x0041:
            h.h.j.b$a r1 = new h.h.j.b$a
            r1.<init>(r2, r3, r8, r0)
            r2 = 0
            if (r6 == 0) goto L_0x0054
            h.h.j.c r3 = f1778b     // Catch:{ InterruptedException -> 0x0053 }
            java.lang.Object r3 = r3.a(r1, r7)     // Catch:{ InterruptedException -> 0x0053 }
            h.h.j.b$g r3 = (h.h.j.b.g) r3     // Catch:{ InterruptedException -> 0x0053 }
            android.graphics.Typeface r2 = r3.a     // Catch:{ InterruptedException -> 0x0053 }
        L_0x0053:
            return r2
        L_0x0054:
            if (r4 != 0) goto L_0x0058
            r3 = r2
            goto L_0x005d
        L_0x0058:
            h.h.j.b$b r3 = new h.h.j.b$b
            r3.<init>(r4, r5)
        L_0x005d:
            java.lang.Object r4 = c
            monitor-enter(r4)
            h.e.h<java.lang.String, java.util.ArrayList<h.h.j.c$c<h.h.j.b$g>>> r5 = d     // Catch:{ all -> 0x0099 }
            java.lang.Object r5 = r5.getOrDefault(r0, r2)     // Catch:{ all -> 0x0099 }
            java.util.ArrayList r5 = (java.util.ArrayList) r5     // Catch:{ all -> 0x0099 }
            if (r5 == 0) goto L_0x0071
            if (r3 == 0) goto L_0x006f
            r5.add(r3)     // Catch:{ all -> 0x0099 }
        L_0x006f:
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            return r2
        L_0x0071:
            if (r3 == 0) goto L_0x0080
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0099 }
            r5.<init>()     // Catch:{ all -> 0x0099 }
            r5.add(r3)     // Catch:{ all -> 0x0099 }
            h.e.h<java.lang.String, java.util.ArrayList<h.h.j.c$c<h.h.j.b$g>>> r3 = d     // Catch:{ all -> 0x0099 }
            r3.put(r0, r5)     // Catch:{ all -> 0x0099 }
        L_0x0080:
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            h.h.j.c r3 = f1778b
            h.h.j.b$c r4 = new h.h.j.b$c
            r4.<init>(r0)
            if (r3 == 0) goto L_0x0098
            android.os.Handler r5 = new android.os.Handler
            r5.<init>()
            h.h.j.d r6 = new h.h.j.d
            r6.<init>(r3, r1, r5, r4)
            r3.b(r6)
            return r2
        L_0x0098:
            throw r2
        L_0x0099:
            r2 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0099 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.j.b.a(android.content.Context, h.h.j.a, h.h.f.b.g, android.os.Handler, boolean, int, int):android.graphics.Typeface");
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.e == 0) {
                Uri uri = fVar.a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, g.a.a.b.a.a(context, cancellationSignal, uri));
                }
            }
        }
        return Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARNING: type inference failed for: r7v2, types: [h.h.j.b$f[], android.database.Cursor] */
    public static e a(Context context, CancellationSignal cancellationSignal, a aVar) {
        Cursor cursor;
        Uri uri;
        boolean z;
        a aVar2 = aVar;
        PackageManager packageManager = context.getPackageManager();
        Resources resources = context.getResources();
        String str = aVar2.a;
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(str, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException(i.a.a.a.a.b("No package found for authority: ", str));
        } else if (resolveContentProvider.packageName.equals(aVar2.f1776b)) {
            Signature[] signatureArr = packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature byteArray : signatureArr) {
                arrayList.add(byteArray.toByteArray());
            }
            Collections.sort(arrayList, e);
            List<List<byte[]>> list = aVar2.d;
            if (list == null) {
                list = g.a.a.b.a.a(resources, aVar2.e);
            }
            int i2 = 0;
            while (true) {
                cursor = 0;
                if (i2 >= list.size()) {
                    resolveContentProvider = cursor;
                    break;
                }
                ArrayList arrayList2 = new ArrayList(list.get(i2));
                Collections.sort(arrayList2, e);
                if (arrayList.size() == arrayList2.size()) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= arrayList.size()) {
                            z = true;
                            break;
                        } else if (!Arrays.equals((byte[]) arrayList.get(i3), (byte[]) arrayList2.get(i3))) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                }
                z = false;
                if (z) {
                    break;
                }
                i2++;
            }
            if (resolveContentProvider == null) {
                return new e(1, cursor);
            }
            String str2 = resolveContentProvider.authority;
            ArrayList arrayList3 = new ArrayList();
            Uri build = new Uri.Builder().scheme("content").authority(str2).build();
            Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
            try {
                cursor = context.getContentResolver().query(build, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar2.c}, (String) null, cancellationSignal);
                if (cursor != null && cursor.getCount() > 0) {
                    int columnIndex = cursor.getColumnIndex("result_code");
                    arrayList3 = new ArrayList();
                    int columnIndex2 = cursor.getColumnIndex("_id");
                    int columnIndex3 = cursor.getColumnIndex("file_id");
                    int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                    int columnIndex5 = cursor.getColumnIndex("font_weight");
                    int columnIndex6 = cursor.getColumnIndex("font_italic");
                    while (cursor.moveToNext()) {
                        int i4 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                        int i5 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                        if (columnIndex3 == -1) {
                            uri = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                        } else {
                            uri = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                        }
                        arrayList3.add(new f(uri, i5, columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursor.getInt(columnIndex6) == 1, i4));
                    }
                }
                return new e(0, (f[]) arrayList3.toArray(new f[0]));
            } finally {
                if (cursor != 0) {
                    cursor.close();
                }
            }
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + aVar2.f1776b);
        }
    }
}
