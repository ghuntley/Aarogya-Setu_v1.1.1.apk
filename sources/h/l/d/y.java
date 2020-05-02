package h.l.d;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import h.o.h;
import i.a.a.a.a;

/* compiled from: FragmentStateManager */
public class y {
    public final q a;

    /* renamed from: b  reason: collision with root package name */
    public final Fragment f2043b;
    public int c = -1;

    public y(q qVar, Fragment fragment) {
        this.a = qVar;
        this.f2043b = fragment;
    }

    public void a(ClassLoader classLoader) {
        Bundle bundle = this.f2043b.f228f;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
            Fragment fragment = this.f2043b;
            fragment.f229g = fragment.f228f.getSparseParcelableArray("android:view_state");
            Fragment fragment2 = this.f2043b;
            fragment2.f234l = fragment2.f228f.getString("android:target_state");
            Fragment fragment3 = this.f2043b;
            if (fragment3.f234l != null) {
                fragment3.f235m = fragment3.f228f.getInt("android:target_req_state", 0);
            }
            Fragment fragment4 = this.f2043b;
            Boolean bool = fragment4.f230h;
            if (bool != null) {
                fragment4.M = bool.booleanValue();
                this.f2043b.f230h = null;
            } else {
                fragment4.M = fragment4.f228f.getBoolean("android:user_visible_hint", true);
            }
            Fragment fragment5 = this.f2043b;
            if (!fragment5.M) {
                fragment5.L = true;
            }
        }
    }

    public y(q qVar, ClassLoader classLoader, n nVar, x xVar) {
        this.a = qVar;
        this.f2043b = nVar.a(classLoader, xVar.e);
        Bundle bundle = xVar.f2039n;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        this.f2043b.e(xVar.f2039n);
        Fragment fragment = this.f2043b;
        fragment.f231i = xVar.f2031f;
        fragment.f239q = xVar.f2032g;
        fragment.s = true;
        fragment.z = xVar.f2033h;
        fragment.A = xVar.f2034i;
        fragment.B = xVar.f2035j;
        fragment.E = xVar.f2036k;
        fragment.f238p = xVar.f2037l;
        fragment.D = xVar.f2038m;
        fragment.C = xVar.f2040o;
        fragment.T = h.b.values()[xVar.f2041p];
        Bundle bundle2 = xVar.f2042q;
        if (bundle2 != null) {
            this.f2043b.f228f = bundle2;
        } else {
            this.f2043b.f228f = new Bundle();
        }
        if (r.c(2)) {
            StringBuilder a2 = a.a("Instantiated fragment ");
            a2.append(this.f2043b);
            Log.v("FragmentManager", a2.toString());
        }
    }

    public void a() {
        if (this.f2043b.K != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f2043b.K.saveHierarchyState(sparseArray);
            if (sparseArray.size() > 0) {
                this.f2043b.f229g = sparseArray;
            }
        }
    }

    public y(q qVar, Fragment fragment, x xVar) {
        this.a = qVar;
        this.f2043b = fragment;
        fragment.f229g = null;
        fragment.u = 0;
        fragment.r = false;
        fragment.f237o = false;
        Fragment fragment2 = fragment.f233k;
        fragment.f234l = fragment2 != null ? fragment2.f231i : null;
        Fragment fragment3 = this.f2043b;
        fragment3.f233k = null;
        Bundle bundle = xVar.f2042q;
        if (bundle != null) {
            fragment3.f228f = bundle;
        } else {
            fragment3.f228f = new Bundle();
        }
    }
}
