package i.b.a.n.m.c0;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DiskCacheWriteLocker */
public final class c {
    public final Map<String, a> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final b f2550b = new b();

    /* compiled from: DiskCacheWriteLocker */
    public static class a {
        public final Lock a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        public int f2551b;
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            aVar = this.a.get(str);
            if (aVar == null) {
                aVar = this.f2550b.a();
                this.a.put(str, aVar);
            }
            aVar.f2551b++;
        }
        aVar.a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            a aVar2 = this.a.get(str);
            g.a.a.b.a.a(aVar2, "Argument must not be null");
            aVar = aVar2;
            if (aVar.f2551b >= 1) {
                int i2 = aVar.f2551b - 1;
                aVar.f2551b = i2;
                if (i2 == 0) {
                    a remove = this.a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f2550b.a(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f2551b);
            }
        }
        aVar.a.unlock();
    }

    /* compiled from: DiskCacheWriteLocker */
    public static class b {
        public final Queue<a> a = new ArrayDeque();

        public a a() {
            a poll;
            synchronized (this.a) {
                poll = this.a.poll();
            }
            return poll == null ? new a() : poll;
        }

        public void a(a aVar) {
            synchronized (this.a) {
                if (this.a.size() < 10) {
                    this.a.offer(aVar);
                }
            }
        }
    }
}
