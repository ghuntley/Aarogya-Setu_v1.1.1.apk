package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import h.o.f;
import h.o.h;
import h.o.l;
import h.o.m;
import h.t.a;
import h.t.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
public final class Recreator implements f {
    public final c a;

    public static final class a implements a.b {
        public final Set<String> a = new HashSet();

        public a(h.t.a aVar) {
            if (aVar.a.b("androidx.savedstate.Restarter", this) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }

        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.a));
            return bundle;
        }
    }

    public Recreator(c cVar) {
        this.a = cVar;
    }

    public void a(l lVar, h.a aVar) {
        if (aVar == h.a.ON_CREATE) {
            ((m) lVar.a()).a.remove(this);
            Bundle a2 = this.a.c().a("androidx.savedstate.Restarter");
            if (a2 != null) {
                ArrayList<String> stringArrayList = a2.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        try {
                            Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.C0067a.class);
                            try {
                                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                                declaredConstructor.setAccessible(true);
                                try {
                                    ((a.C0067a) declaredConstructor.newInstance(new Object[0])).a(this.a);
                                } catch (Exception e) {
                                    throw new RuntimeException(i.a.a.a.a.b("Failed to instantiate ", next), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                StringBuilder a3 = i.a.a.a.a.a("Class");
                                a3.append(asSubclass.getSimpleName());
                                a3.append(" must have default constructor in order to be automatically recreated");
                                throw new IllegalStateException(a3.toString(), e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(i.a.a.a.a.a("Class ", next, " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
