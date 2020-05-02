package h.l.d;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import h.l.d.a0;
import h.z.a.a;

/* compiled from: FragmentPagerAdapter */
public abstract class w extends a {
    public final r c;
    public final int d;
    public a0 e = null;

    /* renamed from: f  reason: collision with root package name */
    public Fragment f2030f = null;

    public w(r rVar, int i2) {
        this.c = rVar;
        this.d = i2;
    }

    public void a(ViewGroup viewGroup, int i2, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.e == null) {
            r rVar = this.c;
            if (rVar != null) {
                this.e = new a(rVar);
            } else {
                throw null;
            }
        }
        a aVar = (a) this.e;
        if (aVar != null) {
            r rVar2 = fragment.v;
            if (rVar2 == null || rVar2 == aVar.f1914q) {
                aVar.a(new a0.a(6, fragment));
                if (fragment.equals(this.f2030f)) {
                    this.f2030f = null;
                    return;
                }
                return;
            }
            StringBuilder a = i.a.a.a.a.a("Cannot detach Fragment attached to a different FragmentManager. Fragment ");
            a.append(fragment.toString());
            a.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(a.toString());
        }
        throw null;
    }

    public void b(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public void a(ViewGroup viewGroup) {
        a0 a0Var = this.e;
        if (a0Var != null) {
            try {
                a0Var.b();
            } catch (IllegalStateException unused) {
                this.e.a();
            }
            this.e = null;
        }
    }

    public static String a(int i2, long j2) {
        return "android:switcher:" + i2 + ":" + j2;
    }
}
