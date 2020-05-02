package i.b.a.n.m;

/* compiled from: DiskCacheStrategy */
public abstract class k {
    public static final k a = new a();

    /* renamed from: b  reason: collision with root package name */
    public static final k f2615b = new b();
    public static final k c = new c();

    /* compiled from: DiskCacheStrategy */
    public class a extends k {
        public boolean a() {
            return false;
        }

        public boolean a(i.b.a.n.a aVar) {
            return false;
        }

        public boolean a(boolean z, i.b.a.n.a aVar, i.b.a.n.c cVar) {
            return false;
        }

        public boolean b() {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy */
    public class b extends k {
        public boolean a() {
            return true;
        }

        public boolean a(i.b.a.n.a aVar) {
            return (aVar == i.b.a.n.a.DATA_DISK_CACHE || aVar == i.b.a.n.a.MEMORY_CACHE) ? false : true;
        }

        public boolean a(boolean z, i.b.a.n.a aVar, i.b.a.n.c cVar) {
            return false;
        }

        public boolean b() {
            return false;
        }
    }

    /* compiled from: DiskCacheStrategy */
    public class c extends k {
        public boolean a() {
            return true;
        }

        public boolean a(i.b.a.n.a aVar) {
            return aVar == i.b.a.n.a.REMOTE;
        }

        public boolean b() {
            return true;
        }

        public boolean a(boolean z, i.b.a.n.a aVar, i.b.a.n.c cVar) {
            return ((z && aVar == i.b.a.n.a.DATA_DISK_CACHE) || aVar == i.b.a.n.a.LOCAL) && cVar == i.b.a.n.c.TRANSFORMED;
        }
    }

    public abstract boolean a();

    public abstract boolean a(i.b.a.n.a aVar);

    public abstract boolean a(boolean z, i.b.a.n.a aVar, i.b.a.n.c cVar);

    public abstract boolean b();
}
