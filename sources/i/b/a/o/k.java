package i.b.a.o;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.util.Log;
import i.b.a.c;
import i.b.a.j;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* compiled from: RequestManagerFragment */
public class k extends Fragment {
    public final a e;

    /* renamed from: f  reason: collision with root package name */
    public final m f2806f = new a();

    /* renamed from: g  reason: collision with root package name */
    public final Set<k> f2807g = new HashSet();

    /* renamed from: h  reason: collision with root package name */
    public j f2808h;

    /* renamed from: i  reason: collision with root package name */
    public k f2809i;

    /* renamed from: j  reason: collision with root package name */
    public Fragment f2810j;

    /* compiled from: RequestManagerFragment */
    public class a implements m {
        public a() {
        }

        public String toString() {
            return super.toString() + "{fragment=" + k.this + "}";
        }
    }

    public k() {
        a aVar = new a();
        this.e = aVar;
    }

    public final void a(Activity activity) {
        a();
        l lVar = c.a((Context) activity).f2394j;
        if (lVar != null) {
            k a2 = lVar.a(activity.getFragmentManager(), (Fragment) null, l.d(activity));
            this.f2809i = a2;
            if (!equals(a2)) {
                this.f2809i.f2807g.add(this);
                return;
            }
            return;
        }
        throw null;
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.e.a();
        a();
    }

    public void onDetach() {
        super.onDetach();
        a();
    }

    public void onStart() {
        super.onStart();
        this.e.b();
    }

    public void onStop() {
        super.onStop();
        this.e.c();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f2810j;
        }
        sb.append(parentFragment);
        sb.append("}");
        return sb.toString();
    }

    public final void a() {
        k kVar = this.f2809i;
        if (kVar != null) {
            kVar.f2807g.remove(this);
            this.f2809i = null;
        }
    }
}
