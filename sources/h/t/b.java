package h.t;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import androidx.savedstate.SavedStateRegistry$1;
import h.o.h;
import h.o.m;
import h.t.a;
import java.util.Map;

/* compiled from: SavedStateRegistryController */
public final class b {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final a f2228b = new a();

    public b(c cVar) {
        this.a = cVar;
    }

    public void a(Bundle bundle) {
        h a2 = this.a.a();
        if (((m) a2).f2058b == h.b.INITIALIZED) {
            a2.a(new Recreator(this.a));
            a aVar = this.f2228b;
            if (!aVar.c) {
                if (bundle != null) {
                    aVar.f2227b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                }
                a2.a(new SavedStateRegistry$1(aVar));
                aVar.c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        a aVar = this.f2228b;
        if (aVar != null) {
            Bundle bundle2 = new Bundle();
            Bundle bundle3 = aVar.f2227b;
            if (bundle3 != null) {
                bundle2.putAll(bundle3);
            }
            h.c.a.b.b<K, V>.d c = aVar.a.c();
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                bundle2.putBundle((String) entry.getKey(), ((a.b) entry.getValue()).a());
            }
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
            return;
        }
        throw null;
    }
}
