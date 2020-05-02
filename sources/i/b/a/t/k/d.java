package i.b.a.t.k;

/* compiled from: StateVerifier */
public abstract class d {

    /* compiled from: StateVerifier */
    public static class b extends d {
        public volatile boolean a;

        public b() {
            super((a) null);
        }

        public void a() {
            if (this.a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    public /* synthetic */ d(a aVar) {
    }

    public abstract void a();
}
