package i.b.a.n.l;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import i.b.a.g;
import i.b.a.n.a;
import i.b.a.n.l.d;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: LocalUriFetcher */
public abstract class l<T> implements d<T> {
    public final Uri e;

    /* renamed from: f  reason: collision with root package name */
    public final ContentResolver f2517f;

    /* renamed from: g  reason: collision with root package name */
    public T f2518g;

    public l(ContentResolver contentResolver, Uri uri) {
        this.f2517f = contentResolver;
        this.e = uri;
    }

    public abstract T a(Uri uri, ContentResolver contentResolver);

    public final void a(g gVar, d.a<? super T> aVar) {
        try {
            T a = a(this.e, this.f2517f);
            this.f2518g = a;
            aVar.a(a);
        } catch (FileNotFoundException e2) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e2);
            }
            aVar.a((Exception) e2);
        }
    }

    public abstract void a(T t);

    public void b() {
        T t = this.f2518g;
        if (t != null) {
            try {
                a(t);
            } catch (IOException unused) {
            }
        }
    }

    public a c() {
        return a.LOCAL;
    }

    public void cancel() {
    }
}
