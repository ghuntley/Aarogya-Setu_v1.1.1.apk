package i.b.a.n.n.y;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import i.b.a.n.g;
import i.b.a.n.l.d;
import i.b.a.n.n.n;
import i.b.a.n.n.o;
import i.b.a.n.n.r;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* compiled from: QMediaStoreUriLoader */
public final class e<DataT> implements n<Uri, DataT> {
    public final Context a;

    /* renamed from: b  reason: collision with root package name */
    public final n<File, DataT> f2709b;
    public final n<Uri, DataT> c;
    public final Class<DataT> d;

    /* compiled from: QMediaStoreUriLoader */
    public static abstract class a<DataT> implements o<Uri, DataT> {
        public final Context a;

        /* renamed from: b  reason: collision with root package name */
        public final Class<DataT> f2710b;

        public a(Context context, Class<DataT> cls) {
            this.a = context;
            this.f2710b = cls;
        }

        public final n<Uri, DataT> a(r rVar) {
            return new e(this.a, rVar.a(File.class, this.f2710b), rVar.a(Uri.class, this.f2710b), this.f2710b);
        }
    }

    /* compiled from: QMediaStoreUriLoader */
    public static final class b extends a<ParcelFileDescriptor> {
        public b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* compiled from: QMediaStoreUriLoader */
    public static final class c extends a<InputStream> {
        public c(Context context) {
            super(context, InputStream.class);
        }
    }

    public e(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.a = context.getApplicationContext();
        this.f2709b = nVar;
        this.c = nVar2;
        this.d = cls;
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        Uri uri = (Uri) obj;
        return new n.a(new i.b.a.s.d(uri), new d(this.a, this.f2709b, this.c, uri, i2, i3, gVar, this.d));
    }

    public boolean a(Object obj) {
        return Build.VERSION.SDK_INT >= 29 && g.a.a.b.a.a((Uri) obj);
    }

    /* compiled from: QMediaStoreUriLoader */
    public static final class d<DataT> implements i.b.a.n.l.d<DataT> {

        /* renamed from: o  reason: collision with root package name */
        public static final String[] f2711o = {"_data"};
        public final Context e;

        /* renamed from: f  reason: collision with root package name */
        public final n<File, DataT> f2712f;

        /* renamed from: g  reason: collision with root package name */
        public final n<Uri, DataT> f2713g;

        /* renamed from: h  reason: collision with root package name */
        public final Uri f2714h;

        /* renamed from: i  reason: collision with root package name */
        public final int f2715i;

        /* renamed from: j  reason: collision with root package name */
        public final int f2716j;

        /* renamed from: k  reason: collision with root package name */
        public final g f2717k;

        /* renamed from: l  reason: collision with root package name */
        public final Class<DataT> f2718l;

        /* renamed from: m  reason: collision with root package name */
        public volatile boolean f2719m;

        /* renamed from: n  reason: collision with root package name */
        public volatile i.b.a.n.l.d<DataT> f2720n;

        public d(Context context, n<File, DataT> nVar, n<Uri, DataT> nVar2, Uri uri, int i2, int i3, g gVar, Class<DataT> cls) {
            this.e = context.getApplicationContext();
            this.f2712f = nVar;
            this.f2713g = nVar2;
            this.f2714h = uri;
            this.f2715i = i2;
            this.f2716j = i3;
            this.f2717k = gVar;
            this.f2718l = cls;
        }

        public void a(i.b.a.g gVar, d.a<? super DataT> aVar) {
            try {
                i.b.a.n.l.d<DataT> d = d();
                if (d == null) {
                    aVar.a((Exception) new IllegalArgumentException("Failed to build fetcher for: " + this.f2714h));
                    return;
                }
                this.f2720n = d;
                if (this.f2719m) {
                    cancel();
                } else {
                    d.a(gVar, aVar);
                }
            } catch (FileNotFoundException e2) {
                aVar.a((Exception) e2);
            }
        }

        public void b() {
            i.b.a.n.l.d<DataT> dVar = this.f2720n;
            if (dVar != null) {
                dVar.b();
            }
        }

        public i.b.a.n.a c() {
            return i.b.a.n.a.LOCAL;
        }

        public void cancel() {
            this.f2719m = true;
            i.b.a.n.l.d<DataT> dVar = this.f2720n;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final i.b.a.n.l.d<DataT> d() {
            /*
                r9 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                if (r0 == 0) goto L_0x007e
                i.b.a.n.n.n<java.io.File, DataT> r0 = r9.f2712f
                android.net.Uri r8 = r9.f2714h
                android.content.Context r2 = r9.e     // Catch:{ all -> 0x0077 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0077 }
                java.lang.String[] r4 = f2711o     // Catch:{ all -> 0x0077 }
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r8
                android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0077 }
                if (r2 == 0) goto L_0x005d
                boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x005d
                java.lang.String r3 = "_data"
                int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0074 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0074 }
                if (r4 != 0) goto L_0x0046
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0074 }
                r4.<init>(r3)     // Catch:{ all -> 0x0074 }
                r2.close()
                int r2 = r9.f2715i
                int r3 = r9.f2716j
                i.b.a.n.g r5 = r9.f2717k
                i.b.a.n.n.n$a r0 = r0.a(r4, r2, r3, r5)
                goto L_0x00a2
            L_0x0046:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "File path was empty in media store for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x005d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "Failed to media store entry for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r0 = move-exception
                r1 = r2
                goto L_0x0078
            L_0x0077:
                r0 = move-exception
            L_0x0078:
                if (r1 == 0) goto L_0x007d
                r1.close()
            L_0x007d:
                throw r0
            L_0x007e:
                android.content.Context r0 = r9.e
                java.lang.String r2 = "android.permission.ACCESS_MEDIA_LOCATION"
                int r0 = r0.checkSelfPermission(r2)
                if (r0 != 0) goto L_0x008a
                r0 = 1
                goto L_0x008b
            L_0x008a:
                r0 = 0
            L_0x008b:
                if (r0 == 0) goto L_0x0094
                android.net.Uri r0 = r9.f2714h
                android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
                goto L_0x0096
            L_0x0094:
                android.net.Uri r0 = r9.f2714h
            L_0x0096:
                i.b.a.n.n.n<android.net.Uri, DataT> r2 = r9.f2713g
                int r3 = r9.f2715i
                int r4 = r9.f2716j
                i.b.a.n.g r5 = r9.f2717k
                i.b.a.n.n.n$a r0 = r2.a(r0, r3, r4, r5)
            L_0x00a2:
                if (r0 == 0) goto L_0x00a6
                i.b.a.n.l.d<Data> r1 = r0.c
            L_0x00a6:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.n.y.e.d.d():i.b.a.n.l.d");
        }

        public Class<DataT> a() {
            return this.f2718l;
        }
    }
}
