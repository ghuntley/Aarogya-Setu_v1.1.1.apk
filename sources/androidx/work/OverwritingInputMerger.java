package androidx.work;

import h.a0.e;
import h.a0.i;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public final class OverwritingInputMerger extends i {
    public e a(List<e> list) {
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        for (e eVar : list) {
            hashMap.putAll(Collections.unmodifiableMap(eVar.a));
        }
        aVar.a(hashMap);
        return aVar.a();
    }
}
