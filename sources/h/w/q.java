package h.w;

import android.view.View;
import i.a.a.a.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: TransitionValues */
public class q {
    public final Map<String, Object> a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public View f2291b;
    public final ArrayList<i> c = new ArrayList<>();

    @Deprecated
    public q() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f2291b == qVar.f2291b && this.a.equals(qVar.a);
    }

    public int hashCode() {
        return this.a.hashCode() + (this.f2291b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder a2 = a.a("TransitionValues@");
        a2.append(Integer.toHexString(hashCode()));
        a2.append(":\n");
        StringBuilder a3 = a.a(a2.toString(), "    view = ");
        a3.append(this.f2291b);
        a3.append("\n");
        String b2 = a.b(a3.toString(), "    values:");
        for (String next : this.a.keySet()) {
            b2 = b2 + "    " + next + ": " + this.a.get(next) + "\n";
        }
        return b2;
    }

    public q(View view) {
        this.f2291b = view;
    }
}
