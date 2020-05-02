package i.b.a.n.l;

import android.content.res.AssetManager;
import android.util.Log;
import i.b.a.g;
import i.b.a.n.a;
import i.b.a.n.l.d;
import java.io.IOException;

/* compiled from: AssetPathFetcher */
public abstract class b<T> implements d<T> {
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final AssetManager f2501f;

    /* renamed from: g  reason: collision with root package name */
    public T f2502g;

    public b(AssetManager assetManager, String str) {
        this.f2501f = assetManager;
        this.e = str;
    }

    public abstract T a(AssetManager assetManager, String str);

    public void a(g gVar, d.a<? super T> aVar) {
        try {
            T a = a(this.f2501f, this.e);
            this.f2502g = a;
            aVar.a(a);
        } catch (IOException e2) {
            if (Log.isLoggable("AssetPathFetcher", 3)) {
                Log.d("AssetPathFetcher", "Failed to load data from asset manager", e2);
            }
            aVar.a((Exception) e2);
        }
    }

    public abstract void a(T t);

    public void b() {
        T t = this.f2502g;
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
