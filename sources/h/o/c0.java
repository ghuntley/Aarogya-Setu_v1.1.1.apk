package h.o;

import java.util.HashMap;

/* compiled from: ViewModelStore */
public class c0 {
    public final HashMap<String, a0> a = new HashMap<>();

    public final void a() {
        for (a0 a2 : this.a.values()) {
            a2.a();
        }
        this.a.clear();
    }
}
