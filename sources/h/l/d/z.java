package h.l.d;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: FragmentStore */
public class z {
    public final ArrayList<Fragment> a = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap<String, y> f2044b = new HashMap<>();

    public void a(Fragment fragment) {
        if (!this.a.contains(fragment)) {
            synchronized (this.a) {
                this.a.add(fragment);
            }
            fragment.f237o = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + fragment);
    }

    public void b(Fragment fragment) {
        synchronized (this.a) {
            this.a.remove(fragment);
        }
        fragment.f237o = false;
    }

    public List<Fragment> c() {
        ArrayList arrayList;
        if (this.a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.a) {
            arrayList = new ArrayList(this.a);
        }
        return arrayList;
    }

    public ArrayList<String> d() {
        synchronized (this.a) {
            if (this.a.isEmpty()) {
                return null;
            }
            ArrayList<String> arrayList = new ArrayList<>(this.a.size());
            Iterator<Fragment> it = this.a.iterator();
            while (it.hasNext()) {
                Fragment next = it.next();
                arrayList.add(next.f231i);
                if (r.c(2)) {
                    Log.v("FragmentManager", "saveAllState: adding fragment (" + next.f231i + "): " + next);
                }
            }
            return arrayList;
        }
    }

    public List<Fragment> b() {
        ArrayList arrayList = new ArrayList();
        for (y next : this.f2044b.values()) {
            if (next != null) {
                arrayList.add(next.f2043b);
            } else {
                arrayList.add((Object) null);
            }
        }
        return arrayList;
    }

    public void a(int i2) {
        Iterator<Fragment> it = this.a.iterator();
        while (it.hasNext()) {
            y yVar = this.f2044b.get(it.next().f231i);
            if (yVar != null) {
                yVar.c = i2;
            }
        }
        for (y next : this.f2044b.values()) {
            if (next != null) {
                next.c = i2;
            }
        }
    }

    public Fragment b(String str) {
        y yVar = this.f2044b.get(str);
        if (yVar != null) {
            return yVar.f2043b;
        }
        return null;
    }

    public void a() {
        this.f2044b.values().removeAll(Collections.singleton((Object) null));
    }

    public boolean a(String str) {
        return this.f2044b.containsKey(str);
    }
}
