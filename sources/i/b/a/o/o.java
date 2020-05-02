package i.b.a.o;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import h.l.d.r;
import i.b.a.c;
import i.b.a.j;
import java.util.HashSet;
import java.util.Set;

/* compiled from: SupportRequestManagerFragment */
public class o extends Fragment {
    public final a a0;
    public final m b0 = new a();
    public final Set<o> c0 = new HashSet();
    public o d0;
    public j e0;
    public Fragment f0;

    /* compiled from: SupportRequestManagerFragment */
    public class a implements m {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + o.this + "}";
        }
    }

    public o() {
        a aVar = new a();
        this.a0 = aVar;
    }

    public void B() {
        this.I = true;
        this.a0.b();
    }

    public void C() {
        this.I = true;
        this.a0.c();
    }

    public final Fragment H() {
        Fragment fragment = this.y;
        return fragment != null ? fragment : this.f0;
    }

    public final void I() {
        o oVar = this.d0;
        if (oVar != null) {
            oVar.c0.remove(this);
            this.d0 = null;
        }
    }

    public final void a(Context context, r rVar) {
        I();
        l lVar = c.a(context).f2394j;
        if (lVar != null) {
            o a2 = lVar.a(rVar, (Fragment) null, l.d(context));
            this.d0 = a2;
            if (!equals(a2)) {
                this.d0.c0.add(this);
                return;
            }
            return;
        }
        throw null;
    }

    public String toString() {
        return super.toString() + "{parent=" + H() + "}";
    }

    public void x() {
        this.I = true;
        this.a0.a();
        I();
    }

    public void z() {
        this.I = true;
        this.f0 = null;
        I();
    }

    public void a(Context context) {
        super.a(context);
        Fragment fragment = this;
        while (true) {
            Fragment fragment2 = fragment.y;
            if (fragment2 == null) {
                break;
            }
            fragment = fragment2;
        }
        r rVar = fragment.v;
        if (rVar != null) {
            try {
                a(k(), rVar);
            } catch (IllegalStateException e) {
                if (Log.isLoggable("SupportRMFragment", 5)) {
                    Log.w("SupportRMFragment", "Unable to register fragment with root", e);
                }
            }
        } else if (Log.isLoggable("SupportRMFragment", 5)) {
            Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
        }
    }
}
