package h.o;

import android.os.Binder;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.crashlytics.android.core.MetaDataStore;
import h.t.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: SavedStateHandle */
public final class x {
    public final Map<String, Object> a;

    /* renamed from: b  reason: collision with root package name */
    public final a.b f2071b;

    /* compiled from: SavedStateHandle */
    public class a implements a.b {
        public a() {
        }

        public Bundle a() {
            Set<String> keySet = x.this.a.keySet();
            ArrayList arrayList = new ArrayList(keySet.size());
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            for (String next : keySet) {
                arrayList.add(next);
                arrayList2.add(x.this.a.get(next));
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(MetaDataStore.KEYDATA_SUFFIX, arrayList);
            bundle.putParcelableArrayList("values", arrayList2);
            return bundle;
        }
    }

    static {
        Class cls = Boolean.TYPE;
        Class cls2 = Double.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Long.TYPE;
        Class<Binder> cls5 = Binder.class;
        Class<Bundle> cls6 = Bundle.class;
        Class cls7 = Byte.TYPE;
        Class cls8 = Character.TYPE;
        Class<CharSequence> cls9 = CharSequence.class;
        Class<CharSequence[]> cls10 = CharSequence[].class;
        Class<ArrayList> cls11 = ArrayList.class;
        Class cls12 = Float.TYPE;
        Class<Parcelable> cls13 = Parcelable.class;
        Class<Parcelable[]> cls14 = Parcelable[].class;
        Class<Serializable> cls15 = Serializable.class;
        Class cls16 = Short.TYPE;
        Class<SparseArray> cls17 = SparseArray.class;
        Class<Size> cls18 = Size.class;
        Class<SizeF> cls19 = SizeF.class;
    }

    public x(Map<String, Object> map) {
        new HashMap();
        this.f2071b = new a();
        this.a = new HashMap(map);
    }

    public static x a(Bundle bundle, Bundle bundle2) {
        if (bundle == null && bundle2 == null) {
            return new x();
        }
        HashMap hashMap = new HashMap();
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                hashMap.put(str, bundle2.get(str));
            }
        }
        if (bundle == null) {
            return new x(hashMap);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(MetaDataStore.KEYDATA_SUFFIX);
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        for (int i2 = 0; i2 < parcelableArrayList.size(); i2++) {
            hashMap.put((String) parcelableArrayList.get(i2), parcelableArrayList2.get(i2));
        }
        return new x(hashMap);
    }

    public x() {
        new HashMap();
        this.f2071b = new a();
        this.a = new HashMap();
    }
}
