package h.j.b;

import android.graphics.Rect;
import h.j.b.a;
import java.util.Comparator;

/* compiled from: FocusStrategy */
public class d<T> implements Comparator<T> {
    public final Rect e = new Rect();

    /* renamed from: f  reason: collision with root package name */
    public final Rect f1877f = new Rect();

    /* renamed from: g  reason: collision with root package name */
    public final boolean f1878g;

    /* renamed from: h  reason: collision with root package name */
    public final b<T> f1879h;

    public d(boolean z, b<T> bVar) {
        this.f1878g = z;
        this.f1879h = bVar;
    }

    public int compare(T t, T t2) {
        Rect rect = this.e;
        Rect rect2 = this.f1877f;
        ((a.C0056a) this.f1879h).a(t, rect);
        ((a.C0056a) this.f1879h).a(t2, rect2);
        int i2 = rect.top;
        int i3 = rect2.top;
        if (i2 < i3) {
            return -1;
        }
        if (i2 > i3) {
            return 1;
        }
        int i4 = rect.left;
        int i5 = rect2.left;
        if (i4 < i5) {
            if (this.f1878g) {
                return 1;
            }
            return -1;
        } else if (i4 <= i5) {
            int i6 = rect.bottom;
            int i7 = rect2.bottom;
            if (i6 < i7) {
                return -1;
            }
            if (i6 > i7) {
                return 1;
            }
            int i8 = rect.right;
            int i9 = rect2.right;
            if (i8 < i9) {
                if (this.f1878g) {
                    return 1;
                }
                return -1;
            } else if (i8 <= i9) {
                return 0;
            } else {
                if (this.f1878g) {
                    return -1;
                }
                return 1;
            }
        } else if (this.f1878g) {
            return -1;
        } else {
            return 1;
        }
    }
}
