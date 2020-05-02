package i.b.a.n.n;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import i.b.a.n.g;
import i.b.a.n.l.d;
import i.b.a.n.n.n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileLoader */
public class f<Data> implements n<File, Data> {
    public final d<Data> a;

    /* compiled from: FileLoader */
    public static class a<Data> implements o<File, Data> {
        public final d<Data> a;

        public a(d<Data> dVar) {
            this.a = dVar;
        }

        public final n<File, Data> a(r rVar) {
            return new f(this.a);
        }
    }

    /* compiled from: FileLoader */
    public static class b extends a<ParcelFileDescriptor> {
        public b() {
            super(new a());
        }

        /* compiled from: FileLoader */
        public class a implements d<ParcelFileDescriptor> {
            public void a(Object obj) {
                ((ParcelFileDescriptor) obj).close();
            }

            public Object a(File file) {
                return ParcelFileDescriptor.open(file, 268435456);
            }

            public Class<ParcelFileDescriptor> a() {
                return ParcelFileDescriptor.class;
            }
        }
    }

    /* compiled from: FileLoader */
    public interface d<Data> {
        Class<Data> a();

        Data a(File file);

        void a(Data data);
    }

    /* compiled from: FileLoader */
    public static class e extends a<InputStream> {
        public e() {
            super(new a());
        }

        /* compiled from: FileLoader */
        public class a implements d<InputStream> {
            public void a(Object obj) {
                ((InputStream) obj).close();
            }

            public Object a(File file) {
                return new FileInputStream(file);
            }

            public Class<InputStream> a() {
                return InputStream.class;
            }
        }
    }

    public f(d<Data> dVar) {
        this.a = dVar;
    }

    public n.a a(Object obj, int i2, int i3, g gVar) {
        File file = (File) obj;
        return new n.a(new i.b.a.s.d(file), new c(file, this.a));
    }

    public boolean a(Object obj) {
        File file = (File) obj;
        return true;
    }

    /* compiled from: FileLoader */
    public static final class c<Data> implements i.b.a.n.l.d<Data> {
        public final File e;

        /* renamed from: f  reason: collision with root package name */
        public final d<Data> f2681f;

        /* renamed from: g  reason: collision with root package name */
        public Data f2682g;

        public c(File file, d<Data> dVar) {
            this.e = file;
            this.f2681f = dVar;
        }

        public void a(i.b.a.g gVar, d.a<? super Data> aVar) {
            try {
                Data a = this.f2681f.a(this.e);
                this.f2682g = a;
                aVar.a(a);
            } catch (FileNotFoundException e2) {
                if (Log.isLoggable("FileLoader", 3)) {
                    Log.d("FileLoader", "Failed to open file", e2);
                }
                aVar.a((Exception) e2);
            }
        }

        public void b() {
            Data data = this.f2682g;
            if (data != null) {
                try {
                    this.f2681f.a(data);
                } catch (IOException unused) {
                }
            }
        }

        public i.b.a.n.a c() {
            return i.b.a.n.a.LOCAL;
        }

        public void cancel() {
        }

        public Class<Data> a() {
            return this.f2681f.a();
        }
    }
}
