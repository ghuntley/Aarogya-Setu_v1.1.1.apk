package l.a.a.a.o.c;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import l.a.a.a.o.c.b;
import l.a.a.a.o.c.i;
import l.a.a.a.o.c.l;

/* compiled from: DependencyPriorityBlockingQueue */
public class c<E extends b & l & i> extends PriorityBlockingQueue<E> {
    public final Queue<E> e = new LinkedList();

    /* renamed from: f  reason: collision with root package name */
    public final ReentrantLock f5137f = new ReentrantLock();

    public E a(int i2, Long l2, TimeUnit timeUnit) {
        E e2;
        while (true) {
            if (i2 == 0) {
                e2 = (b) super.take();
            } else if (i2 == 1) {
                e2 = (b) super.peek();
            } else if (i2 != 2) {
                e2 = i2 != 3 ? null : (b) super.poll(l2.longValue(), timeUnit);
            } else {
                e2 = (b) super.poll();
            }
            if (e2 == null || e2.areDependenciesMet()) {
                return e2;
            }
            try {
                this.f5137f.lock();
                if (i2 == 1) {
                    super.remove(e2);
                }
                this.e.offer(e2);
            } finally {
                this.f5137f.unlock();
            }
        }
        return e2;
    }

    public void c() {
        try {
            this.f5137f.lock();
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.areDependenciesMet()) {
                    super.offer(bVar);
                    it.remove();
                }
            }
        } finally {
            this.f5137f.unlock();
        }
    }

    public void clear() {
        try {
            this.f5137f.lock();
            this.e.clear();
            super.clear();
        } finally {
            this.f5137f.unlock();
        }
    }

    public boolean contains(Object obj) {
        try {
            this.f5137f.lock();
            return super.contains(obj) || this.e.contains(obj);
        } finally {
            this.f5137f.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection) {
        try {
            this.f5137f.lock();
            int drainTo = super.drainTo(collection) + this.e.size();
            while (!this.e.isEmpty()) {
                collection.add(this.e.poll());
            }
            return drainTo;
        } finally {
            this.f5137f.unlock();
        }
    }

    public Object peek() {
        try {
            return a(1, (Long) null, (TimeUnit) null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public Object poll(long j2, TimeUnit timeUnit) {
        return a(3, Long.valueOf(j2), timeUnit);
    }

    public boolean remove(Object obj) {
        try {
            this.f5137f.lock();
            return super.remove(obj) || this.e.remove(obj);
        } finally {
            this.f5137f.unlock();
        }
    }

    public boolean removeAll(Collection<?> collection) {
        try {
            this.f5137f.lock();
            return this.e.removeAll(collection) | super.removeAll(collection);
        } finally {
            this.f5137f.unlock();
        }
    }

    public int size() {
        try {
            this.f5137f.lock();
            return this.e.size() + super.size();
        } finally {
            this.f5137f.unlock();
        }
    }

    public Object take() {
        return a(0, (Long) null, (TimeUnit) null);
    }

    public <T> T[] toArray(T[] tArr) {
        try {
            this.f5137f.lock();
            return a(super.toArray(tArr), this.e.toArray(tArr));
        } finally {
            this.f5137f.unlock();
        }
    }

    public Object poll() {
        try {
            return a(2, (Long) null, (TimeUnit) null);
        } catch (InterruptedException unused) {
            return null;
        }
    }

    public Object[] toArray() {
        try {
            this.f5137f.lock();
            return a(super.toArray(), this.e.toArray());
        } finally {
            this.f5137f.unlock();
        }
    }

    public int drainTo(Collection<? super E> collection, int i2) {
        try {
            this.f5137f.lock();
            int drainTo = super.drainTo(collection, i2);
            while (!this.e.isEmpty() && drainTo <= i2) {
                collection.add(this.e.poll());
                drainTo++;
            }
            return drainTo;
        } finally {
            this.f5137f.unlock();
        }
    }

    public <T> T[] a(T[] tArr, T[] tArr2) {
        int length = tArr.length;
        int length2 = tArr2.length;
        T[] tArr3 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), length + length2);
        System.arraycopy(tArr, 0, tArr3, 0, length);
        System.arraycopy(tArr2, 0, tArr3, length, length2);
        return tArr3;
    }
}
