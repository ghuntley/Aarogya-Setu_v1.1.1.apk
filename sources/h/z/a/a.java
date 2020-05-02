package h.z.a;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.view.ViewGroup;

/* compiled from: PagerAdapter */
public abstract class a {
    public final DataSetObservable a = new DataSetObservable();

    /* renamed from: b  reason: collision with root package name */
    public DataSetObserver f2368b;

    public void a() {
        synchronized (this) {
            if (this.f2368b != null) {
                this.f2368b.onChanged();
            }
        }
        this.a.notifyChanged();
    }

    public abstract void a(ViewGroup viewGroup);

    public abstract void a(ViewGroup viewGroup, int i2, Object obj);

    public abstract void b(ViewGroup viewGroup);

    public void a(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f2368b = dataSetObserver;
        }
    }
}
