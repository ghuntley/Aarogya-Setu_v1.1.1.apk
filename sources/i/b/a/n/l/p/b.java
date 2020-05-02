package i.b.a.n.l.p;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Log;
import i.b.a.c;
import i.b.a.g;
import i.b.a.n.l.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: ThumbFetcher */
public class b implements d<InputStream> {
    public final Uri e;

    /* renamed from: f  reason: collision with root package name */
    public final d f2520f;

    /* renamed from: g  reason: collision with root package name */
    public InputStream f2521g;

    /* compiled from: ThumbFetcher */
    public static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f2522b = {"_data"};
        public final ContentResolver a;

        public a(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f2522b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: i.b.a.n.l.p.b$b  reason: collision with other inner class name */
    /* compiled from: ThumbFetcher */
    public static class C0080b implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final String[] f2523b = {"_data"};
        public final ContentResolver a;

        public C0080b(ContentResolver contentResolver) {
            this.a = contentResolver;
        }

        public Cursor a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f2523b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public b(Uri uri, d dVar) {
        this.e = uri;
        this.f2520f = dVar;
    }

    public static b a(Context context, Uri uri, c cVar) {
        return new b(uri, new d(c.a(context).f2392h.a(), cVar, c.a(context).f2393i, context.getContentResolver()));
    }

    public void b() {
        InputStream inputStream = this.f2521g;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public i.b.a.n.a c() {
        return i.b.a.n.a.LOCAL;
    }

    public void cancel() {
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Throwable, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        if (r6 != null) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        if (r6 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004c, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r7 = r3;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0036 A[Catch:{ all -> 0x0021 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream d() {
        /*
            r12 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            i.b.a.n.l.p.d r1 = r12.f2520f
            android.net.Uri r2 = r12.e
            r3 = 0
            if (r1 == 0) goto L_0x010c
            r4 = 0
            r5 = 3
            i.b.a.n.l.p.c r6 = r1.f2525b     // Catch:{ SecurityException -> 0x002d, all -> 0x002a }
            android.database.Cursor r6 = r6.a(r2)     // Catch:{ SecurityException -> 0x002d, all -> 0x002a }
            if (r6 == 0) goto L_0x0027
            boolean r7 = r6.moveToFirst()     // Catch:{ SecurityException -> 0x0025 }
            if (r7 == 0) goto L_0x0027
            java.lang.String r7 = r6.getString(r4)     // Catch:{ SecurityException -> 0x0025 }
            r6.close()
            goto L_0x0050
        L_0x0021:
            r0 = move-exception
            r3 = r6
            goto L_0x0106
        L_0x0025:
            r7 = move-exception
            goto L_0x0030
        L_0x0027:
            if (r6 == 0) goto L_0x004f
            goto L_0x004c
        L_0x002a:
            r0 = move-exception
            goto L_0x0106
        L_0x002d:
            r6 = move-exception
            r7 = r6
            r6 = r3
        L_0x0030:
            boolean r8 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x0021 }
            if (r8 == 0) goto L_0x004a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
            r8.<init>()     // Catch:{ all -> 0x0021 }
            java.lang.String r9 = "Failed to query for thumbnail for Uri: "
            r8.append(r9)     // Catch:{ all -> 0x0021 }
            r8.append(r2)     // Catch:{ all -> 0x0021 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0021 }
            android.util.Log.d(r0, r8, r7)     // Catch:{ all -> 0x0021 }
        L_0x004a:
            if (r6 == 0) goto L_0x004f
        L_0x004c:
            r6.close()
        L_0x004f:
            r7 = r3
        L_0x0050:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L_0x0058
        L_0x0056:
            r1 = r3
            goto L_0x0089
        L_0x0058:
            i.b.a.n.l.p.a r6 = r1.a
            if (r6 == 0) goto L_0x0105
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            i.b.a.n.l.p.a r7 = r1.a
            if (r7 == 0) goto L_0x0104
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x007c
            r7 = 0
            i.b.a.n.l.p.a r9 = r1.a
            if (r9 == 0) goto L_0x007b
            long r9 = r6.length()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x007c
            r4 = 1
            goto L_0x007c
        L_0x007b:
            throw r3
        L_0x007c:
            if (r4 != 0) goto L_0x007f
            goto L_0x0056
        L_0x007f:
            android.net.Uri r4 = android.net.Uri.fromFile(r6)
            android.content.ContentResolver r1 = r1.d     // Catch:{ NullPointerException -> 0x00de }
            java.io.InputStream r1 = r1.openInputStream(r4)     // Catch:{ NullPointerException -> 0x00de }
        L_0x0089:
            r2 = -1
            if (r1 == 0) goto L_0x00d4
            i.b.a.n.l.p.d r4 = r12.f2520f
            android.net.Uri r6 = r12.e
            if (r4 == 0) goto L_0x00d3
            android.content.ContentResolver r7 = r4.d     // Catch:{ IOException -> 0x00ac, NullPointerException -> 0x00aa }
            java.io.InputStream r3 = r7.openInputStream(r6)     // Catch:{ IOException -> 0x00ac, NullPointerException -> 0x00aa }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r4.e     // Catch:{ IOException -> 0x00ac, NullPointerException -> 0x00aa }
            i.b.a.n.m.b0.b r4 = r4.c     // Catch:{ IOException -> 0x00ac, NullPointerException -> 0x00aa }
            int r0 = g.a.a.b.a.a((java.util.List<com.bumptech.glide.load.ImageHeaderParser>) r7, (java.io.InputStream) r3, (i.b.a.n.m.b0.b) r4)     // Catch:{ IOException -> 0x00ac, NullPointerException -> 0x00aa }
            if (r3 == 0) goto L_0x00d5
            r3.close()     // Catch:{ IOException -> 0x00a6 }
            goto L_0x00d5
        L_0x00a6:
            goto L_0x00d5
        L_0x00a8:
            r0 = move-exception
            goto L_0x00cd
        L_0x00aa:
            r4 = move-exception
            goto L_0x00ad
        L_0x00ac:
            r4 = move-exception
        L_0x00ad:
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch:{ all -> 0x00a8 }
            if (r5 == 0) goto L_0x00c7
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a8 }
            r5.<init>()     // Catch:{ all -> 0x00a8 }
            java.lang.String r7 = "Failed to open uri: "
            r5.append(r7)     // Catch:{ all -> 0x00a8 }
            r5.append(r6)     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x00a8 }
            android.util.Log.d(r0, r5, r4)     // Catch:{ all -> 0x00a8 }
        L_0x00c7:
            if (r3 == 0) goto L_0x00d4
            r3.close()     // Catch:{ IOException -> 0x00d4 }
            goto L_0x00d4
        L_0x00cd:
            if (r3 == 0) goto L_0x00d2
            r3.close()     // Catch:{ IOException -> 0x00d2 }
        L_0x00d2:
            throw r0
        L_0x00d3:
            throw r3
        L_0x00d4:
            r0 = -1
        L_0x00d5:
            if (r0 == r2) goto L_0x00dd
            i.b.a.n.l.g r2 = new i.b.a.n.l.g
            r2.<init>(r1, r0)
            r1 = r2
        L_0x00dd:
            return r1
        L_0x00de:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "NPE opening uri: "
            r3.append(r5)
            r3.append(r2)
            java.lang.String r2 = " -> "
            r3.append(r2)
            r3.append(r4)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L_0x0104:
            throw r3
        L_0x0105:
            throw r3
        L_0x0106:
            if (r3 == 0) goto L_0x010b
            r3.close()
        L_0x010b:
            throw r0
        L_0x010c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.l.p.b.d():java.io.InputStream");
    }

    public void a(g gVar, d.a<? super InputStream> aVar) {
        try {
            InputStream d = d();
            this.f2521g = d;
            aVar.a(d);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e2);
            }
            aVar.a((Exception) e2);
        }
    }

    public Class<InputStream> a() {
        return InputStream.class;
    }
}
