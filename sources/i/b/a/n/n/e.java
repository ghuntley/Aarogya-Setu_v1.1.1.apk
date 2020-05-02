package i.b.a.n.n;

import android.util.Base64;
import i.b.a.n.g;
import i.b.a.n.l.d;
import i.b.a.n.n.n;
import i.b.a.s.d;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: DataUrlLoader */
public final class e<Model, Data> implements n<Model, Data> {
    public final a<Data> a;

    /* compiled from: DataUrlLoader */
    public interface a<Data> {
    }

    /* compiled from: DataUrlLoader */
    public static final class c<Model> implements o<Model, InputStream> {
        public final a<InputStream> a = new a(this);

        /* compiled from: DataUrlLoader */
        public class a implements a<InputStream> {
            public a(c cVar) {
            }

            public Object a(String str) {
                if (str.startsWith("data:image")) {
                    int indexOf = str.indexOf(44);
                    if (indexOf == -1) {
                        throw new IllegalArgumentException("Missing comma in data URL.");
                    } else if (str.substring(0, indexOf).endsWith(";base64")) {
                        return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                    } else {
                        throw new IllegalArgumentException("Not a base64 image data URL.");
                    }
                } else {
                    throw new IllegalArgumentException("Not a valid image data URL.");
                }
            }
        }

        public n<Model, InputStream> a(r rVar) {
            return new e(this.a);
        }
    }

    public e(a<Data> aVar) {
        this.a = aVar;
    }

    public n.a<Data> a(Model model, int i2, int i3, g gVar) {
        return new n.a<>(new d(model), new b(model.toString(), this.a));
    }

    /* compiled from: DataUrlLoader */
    public static final class b<Data> implements i.b.a.n.l.d<Data> {
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final a<Data> f2679f;

        /* renamed from: g  reason: collision with root package name */
        public Data f2680g;

        public b(String str, a<Data> aVar) {
            this.e = str;
            this.f2679f = aVar;
        }

        public void a(i.b.a.g gVar, d.a<? super Data> aVar) {
            try {
                Data a = ((c.a) this.f2679f).a(this.e);
                this.f2680g = a;
                aVar.a(a);
            } catch (IllegalArgumentException e2) {
                aVar.a((Exception) e2);
            }
        }

        public void b() {
            try {
                a<Data> aVar = this.f2679f;
                Data data = this.f2680g;
                if (((c.a) aVar) != null) {
                    ((InputStream) data).close();
                    return;
                }
                throw null;
            } catch (IOException unused) {
            }
        }

        public i.b.a.n.a c() {
            return i.b.a.n.a.LOCAL;
        }

        public void cancel() {
        }

        public Class<Data> a() {
            if (((c.a) this.f2679f) != null) {
                return InputStream.class;
            }
            throw null;
        }
    }

    public boolean a(Model model) {
        return model.toString().startsWith("data:image");
    }
}
