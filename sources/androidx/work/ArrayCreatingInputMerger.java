package androidx.work;

import h.a0.e;
import h.a0.i;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class ArrayCreatingInputMerger extends i {
    public e a(List<e> list) {
        Object newInstance;
        e.a aVar = new e.a();
        HashMap hashMap = new HashMap();
        loop0:
        for (e eVar : list) {
            Iterator<Map.Entry<String, Object>> it = Collections.unmodifiableMap(eVar.a).entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    Map.Entry next = it.next();
                    String str = (String) next.getKey();
                    Object value = next.getValue();
                    Class<?> cls = value.getClass();
                    Object obj = hashMap.get(str);
                    if (obj != null) {
                        Class<?> cls2 = obj.getClass();
                        if (cls2.equals(cls)) {
                            if (cls2.isArray()) {
                                int length = Array.getLength(obj);
                                int length2 = Array.getLength(value);
                                Object newInstance2 = Array.newInstance(obj.getClass().getComponentType(), length + length2);
                                System.arraycopy(obj, 0, newInstance2, 0, length);
                                System.arraycopy(value, 0, newInstance2, length, length2);
                                value = newInstance2;
                            } else {
                                newInstance = Array.newInstance(obj.getClass(), 2);
                                Array.set(newInstance, 0, obj);
                                Array.set(newInstance, 1, value);
                            }
                        } else if (cls2.isArray() && cls2.getComponentType().equals(cls)) {
                            value = a(obj, value);
                        } else if (cls.isArray() && cls.getComponentType().equals(cls2)) {
                            value = a(value, obj);
                        }
                        hashMap.put(str, value);
                    } else if (cls.isArray()) {
                        hashMap.put(str, value);
                    } else {
                        newInstance = Array.newInstance(value.getClass(), 1);
                        Array.set(newInstance, 0, value);
                    }
                    value = newInstance;
                    hashMap.put(str, value);
                }
            }
            throw new IllegalArgumentException();
        }
        aVar.a(hashMap);
        return aVar.a();
    }

    public final Object a(Object obj, Object obj2) {
        int length = Array.getLength(obj);
        Object newInstance = Array.newInstance(obj2.getClass(), length + 1);
        System.arraycopy(obj, 0, newInstance, 0, length);
        Array.set(newInstance, length, obj2);
        return newInstance;
    }
}
