package h.o;

import androidx.lifecycle.LiveData;

/* compiled from: MutableLiveData */
public class r<T> extends LiveData<T> {
    public r(T t) {
        super(t);
    }

    public void a(T t) {
        super.a(t);
    }

    public void b(T t) {
        LiveData.a("setValue");
        this.f256f++;
        this.d = t;
        b((LiveData<T>.b) null);
    }

    public r() {
    }
}
