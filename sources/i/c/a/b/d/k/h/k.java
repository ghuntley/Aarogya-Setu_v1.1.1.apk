package i.c.a.b.d.k.h;

import android.os.Looper;
import android.os.Message;
import i.c.a.b.d.l.q;

/* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
public final class k<L> {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public volatile L f3072b;
    public final a<L> c;

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public static final class a<L> {
        public final L a;

        /* renamed from: b  reason: collision with root package name */
        public final String f3073b;

        public a(L l2, String str) {
            this.a = l2;
            this.f3073b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.f3073b.equals(aVar.f3073b);
        }

        public final int hashCode() {
            return this.f3073b.hashCode() + (System.identityHashCode(this.a) * 31);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public interface b<L> {
        void a();

        void a(L l2);
    }

    /* compiled from: com.google.android.gms:play-services-base@@17.1.0 */
    public final class c extends i.c.a.b.g.c.c {
        public c(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            boolean z = true;
            if (message.what != 1) {
                z = false;
            }
            q.a(z);
            b bVar = (b) message.obj;
            L l2 = k.this.f3072b;
            if (l2 == null) {
                bVar.a();
                return;
            }
            try {
                bVar.a(l2);
            } catch (RuntimeException e) {
                bVar.a();
                throw e;
            }
        }
    }

    public k(Looper looper, L l2, String str) {
        this.a = new c(looper);
        q.a(l2, (Object) "Listener must not be null");
        this.f3072b = l2;
        q.b(str);
        this.c = new a<>(l2, str);
    }

    public final void a(b<? super L> bVar) {
        q.a(bVar, (Object) "Notifier must not be null");
        this.a.sendMessage(this.a.obtainMessage(1, bVar));
    }
}
