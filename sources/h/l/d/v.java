package h.l.d;

import android.util.Log;
import androidx.fragment.app.Fragment;
import h.o.a0;
import h.o.b0;
import h.o.c0;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: FragmentManagerViewModel */
public final class v extends a0 {

    /* renamed from: i  reason: collision with root package name */
    public static final b0.b f2026i = new a();
    public final HashMap<String, Fragment> c = new HashMap<>();
    public final HashMap<String, v> d = new HashMap<>();
    public final HashMap<String, c0> e = new HashMap<>();

    /* renamed from: f  reason: collision with root package name */
    public final boolean f2027f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f2028g = false;

    /* renamed from: h  reason: collision with root package name */
    public boolean f2029h = false;

    /* compiled from: FragmentManagerViewModel */
    public static class a implements b0.b {
        public <T extends a0> T a(Class<T> cls) {
            return new v(true);
        }
    }

    public v(boolean z) {
        this.f2027f = z;
    }

    public boolean a(Fragment fragment) {
        if (!this.c.containsKey(fragment.f231i)) {
            return true;
        }
        if (this.f2027f) {
            return this.f2028g;
        }
        return !this.f2029h;
    }

    public void b() {
        if (r.c(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2028g = true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        if (!this.c.equals(vVar.c) || !this.d.equals(vVar.d) || !this.e.equals(vVar.e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.d.hashCode();
        return this.e.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.c.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.d.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.e.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
