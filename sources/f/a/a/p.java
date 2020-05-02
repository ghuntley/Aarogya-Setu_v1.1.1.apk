package f.a.a;

import f.a.a.q;
import f.a.x;
import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import n.m.c.f;

/* compiled from: ThreadSafeHeap.common.kt */
public class p<T extends q & Comparable<? super T>> {
    public volatile int _size = 0;
    public T[] a;

    static {
        AtomicIntegerFieldUpdater.newUpdater(p.class, "_size");
    }

    public final T a() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final void b(int i2) {
        while (i2 > 0) {
            T[] tArr = this.a;
            if (tArr != null) {
                int i3 = (i2 - 1) / 2;
                T t = tArr[i3];
                if (t != null) {
                    Comparable comparable = (Comparable) t;
                    T t2 = tArr[i2];
                    if (t2 == null) {
                        f.a();
                        throw null;
                    } else if (comparable.compareTo(t2) > 0) {
                        a(i2, i3);
                        i2 = i3;
                    } else {
                        return;
                    }
                } else {
                    f.a();
                    throw null;
                }
            } else {
                f.a();
                throw null;
            }
        }
    }

    public final T c() {
        T a2;
        synchronized (this) {
            a2 = this._size > 0 ? a(0) : null;
        }
        return a2;
    }

    public final void a(T t) {
        if (t != null) {
            if (x.a) {
                if (!(t.g() == null)) {
                    throw new AssertionError();
                }
            }
            t.a((p<?>) this);
            T[] tArr = this.a;
            if (tArr == null) {
                tArr = new q[4];
                this.a = tArr;
            } else if (this._size >= tArr.length) {
                T[] copyOf = Arrays.copyOf(tArr, this._size * 2);
                f.a((Object) copyOf, "java.util.Arrays.copyOf(this, newSize)");
                tArr = (q[]) copyOf;
                this.a = tArr;
            }
            int i2 = this._size;
            this._size = i2 + 1;
            tArr[i2] = t;
            t.a(i2);
            b(i2);
            return;
        }
        f.a("node");
        throw null;
    }

    public final T b() {
        T a2;
        synchronized (this) {
            a2 = a();
        }
        return a2;
    }

    public final boolean b(T t) {
        boolean z;
        if (t != null) {
            synchronized (this) {
                z = true;
                boolean z2 = false;
                if (t.g() == null) {
                    z = false;
                } else {
                    int h2 = t.h();
                    if (x.a) {
                        if (h2 >= 0) {
                            z2 = true;
                        }
                        if (!z2) {
                            throw new AssertionError();
                        }
                    }
                    a(h2);
                }
            }
            return z;
        }
        f.a("node");
        throw null;
    }

    public final T a(int i2) {
        boolean z = false;
        if (x.a) {
            if (!(this._size > 0)) {
                throw new AssertionError();
            }
        }
        T[] tArr = this.a;
        if (tArr != null) {
            this._size--;
            if (i2 < this._size) {
                a(i2, this._size);
                int i3 = (i2 - 1) / 2;
                if (i2 > 0) {
                    T t = tArr[i2];
                    if (t != null) {
                        Comparable comparable = (Comparable) t;
                        T t2 = tArr[i3];
                        if (t2 == null) {
                            f.a();
                            throw null;
                        } else if (comparable.compareTo(t2) < 0) {
                            a(i2, i3);
                            b(i3);
                        }
                    } else {
                        f.a();
                        throw null;
                    }
                }
                while (true) {
                    int i4 = (i2 * 2) + 1;
                    if (i4 >= this._size) {
                        break;
                    }
                    T[] tArr2 = this.a;
                    if (tArr2 != null) {
                        int i5 = i4 + 1;
                        if (i5 < this._size) {
                            T t3 = tArr2[i5];
                            if (t3 != null) {
                                Comparable comparable2 = (Comparable) t3;
                                T t4 = tArr2[i4];
                                if (t4 == null) {
                                    f.a();
                                    throw null;
                                } else if (comparable2.compareTo(t4) < 0) {
                                    i4 = i5;
                                }
                            } else {
                                f.a();
                                throw null;
                            }
                        }
                        T t5 = tArr2[i2];
                        if (t5 != null) {
                            Comparable comparable3 = (Comparable) t5;
                            T t6 = tArr2[i4];
                            if (t6 == null) {
                                f.a();
                                throw null;
                            } else if (comparable3.compareTo(t6) <= 0) {
                                break;
                            } else {
                                a(i2, i4);
                                i2 = i4;
                            }
                        } else {
                            f.a();
                            throw null;
                        }
                    } else {
                        f.a();
                        throw null;
                    }
                }
            }
            T t7 = tArr[this._size];
            if (t7 != null) {
                if (x.a) {
                    if (t7.g() == this) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                t7.a((p<?>) null);
                t7.a(-1);
                tArr[this._size] = null;
                return t7;
            }
            f.a();
            throw null;
        }
        f.a();
        throw null;
    }

    public final void a(int i2, int i3) {
        T[] tArr = this.a;
        if (tArr != null) {
            T t = tArr[i3];
            if (t != null) {
                T t2 = tArr[i2];
                if (t2 != null) {
                    tArr[i2] = t;
                    tArr[i3] = t2;
                    t.a(i2);
                    t2.a(i3);
                    return;
                }
                f.a();
                throw null;
            }
            f.a();
            throw null;
        }
        f.a();
        throw null;
    }
}
