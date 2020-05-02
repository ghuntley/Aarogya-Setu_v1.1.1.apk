package h.t;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;

@SuppressLint({"RestrictedApi"})
/* compiled from: SavedStateRegistry */
public final class a {
    public h.c.a.b.b<String, b> a = new h.c.a.b.b<>();

    /* renamed from: b  reason: collision with root package name */
    public Bundle f2227b;
    public boolean c;
    public Recreator.a d;
    public boolean e = true;

    /* renamed from: h.t.a$a  reason: collision with other inner class name */
    /* compiled from: SavedStateRegistry */
    public interface C0067a {
        void a(c cVar);
    }

    /* compiled from: SavedStateRegistry */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.c) {
            Bundle bundle = this.f2227b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.f2227b.remove(str);
            if (this.f2227b.isEmpty()) {
                this.f2227b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void a(Class<? extends C0067a> cls) {
        if (this.e) {
            if (this.d == null) {
                this.d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar = this.d;
                aVar.a.add(cls.getName());
            } catch (NoSuchMethodException e2) {
                StringBuilder a2 = i.a.a.a.a.a("Class");
                a2.append(cls.getSimpleName());
                a2.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(a2.toString(), e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
