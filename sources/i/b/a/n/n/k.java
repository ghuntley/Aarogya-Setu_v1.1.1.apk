package i.b.a.n.n;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import i.b.a.n.g;
import i.b.a.n.l.d;
import i.b.a.n.n.n;
import i.b.a.s.d;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: MediaStoreFileLoader */
public final class k implements n<Uri, File> {
    public final Context a;

    /* compiled from: MediaStoreFileLoader */
    public static final class a implements o<Uri, File> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        public n<Uri, File> a(r rVar) {
            return new k(this.a);
        }
    }

    public k(Context context) {
        this.a = context;
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        Uri uri = (Uri) obj;
        return new n.a(new d(uri), new b(this.a, uri));
    }

    public boolean a(Object obj) {
        return g.a.a.b.a.a((Uri) obj);
    }

    /* compiled from: MediaStoreFileLoader */
    public static class b implements i.b.a.n.l.d<File> {

        /* renamed from: g  reason: collision with root package name */
        public static final String[] f2689g = {"_data"};
        public final Context e;

        /* renamed from: f  reason: collision with root package name */
        public final Uri f2690f;

        public b(Context context, Uri uri) {
            this.e = context;
            this.f2690f = uri;
        }

        public void a(i.b.a.g gVar, d.a<? super File> aVar) {
            Cursor query = this.e.getContentResolver().query(this.f2690f, f2689g, (String) null, (String[]) null, (String) null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                StringBuilder a = i.a.a.a.a.a("Failed to find file path for: ");
                a.append(this.f2690f);
                aVar.a((Exception) new FileNotFoundException(a.toString()));
                return;
            }
            aVar.a(new File(str));
        }

        public void b() {
        }

        public i.b.a.n.a c() {
            return i.b.a.n.a.LOCAL;
        }

        public void cancel() {
        }

        public Class<File> a() {
            return File.class;
        }
    }
}
