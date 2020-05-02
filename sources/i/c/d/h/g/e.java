package i.c.d.h.g;

import android.util.Base64;
import android.util.JsonWriter;
import com.google.firebase.encoders.EncodingException;
import i.a.a.a.a;
import i.c.d.h.c;
import i.c.d.h.d;
import i.c.d.h.f;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-encoders-json@@16.0.0 */
public final class e implements d, f {
    public e a = null;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4673b = true;
    public final JsonWriter c;
    public final Map<Class<?>, c<?>> d;
    public final Map<Class<?>, i.c.d.h.e<?>> e;

    public e(Writer writer, Map<Class<?>, c<?>> map, Map<Class<?>, i.c.d.h.e<?>> map2) {
        this.c = new JsonWriter(writer);
        this.d = map;
        this.e = map2;
    }

    public d a(String str, Object obj) {
        a();
        this.c.name(str);
        if (obj == null) {
            this.c.nullValue();
        } else {
            a(obj);
        }
        return this;
    }

    public d a(String str, int i2) {
        a();
        this.c.name(str);
        a();
        this.c.value((long) i2);
        return this;
    }

    public d a(String str, long j2) {
        a();
        this.c.name(str);
        a();
        this.c.value(j2);
        return this;
    }

    public f a(String str) {
        a();
        this.c.value(str);
        return this;
    }

    public f a(boolean z) {
        a();
        this.c.value(z);
        return this;
    }

    public e a(Object obj) {
        if (obj == null) {
            this.c.nullValue();
            return this;
        } else if (obj instanceof Number) {
            this.c.value((Number) obj);
            return this;
        } else {
            int i2 = 0;
            if (obj.getClass().isArray()) {
                if (obj instanceof byte[]) {
                    a();
                    this.c.value(Base64.encodeToString((byte[]) obj, 2));
                    return this;
                }
                this.c.beginArray();
                if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    int length = iArr.length;
                    while (i2 < length) {
                        this.c.value((long) iArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    int length2 = jArr.length;
                    while (i2 < length2) {
                        long j2 = jArr[i2];
                        a();
                        this.c.value(j2);
                        i2++;
                    }
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    int length3 = dArr.length;
                    while (i2 < length3) {
                        this.c.value(dArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    int length4 = zArr.length;
                    while (i2 < length4) {
                        this.c.value(zArr[i2]);
                        i2++;
                    }
                } else if (obj instanceof Number[]) {
                    Number[] numberArr = (Number[]) obj;
                    int length5 = numberArr.length;
                    while (i2 < length5) {
                        a((Object) numberArr[i2]);
                        i2++;
                    }
                } else {
                    Object[] objArr = (Object[]) obj;
                    int length6 = objArr.length;
                    while (i2 < length6) {
                        a(objArr[i2]);
                        i2++;
                    }
                }
                this.c.endArray();
                return this;
            } else if (obj instanceof Collection) {
                this.c.beginArray();
                for (Object a2 : (Collection) obj) {
                    a(a2);
                }
                this.c.endArray();
                return this;
            } else if (obj instanceof Map) {
                this.c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        Object value = entry.getValue();
                        a();
                        this.c.name((String) key);
                        if (value == null) {
                            this.c.nullValue();
                        } else {
                            a(value);
                        }
                    } catch (ClassCastException e2) {
                        throw new EncodingException(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", new Object[]{key, key.getClass()}), e2);
                    }
                }
                this.c.endObject();
                return this;
            } else {
                c cVar = this.d.get(obj.getClass());
                if (cVar != null) {
                    this.c.beginObject();
                    cVar.a(obj, this);
                    this.c.endObject();
                    return this;
                }
                i.c.d.h.e eVar = this.e.get(obj.getClass());
                if (eVar != null) {
                    eVar.a(obj, this);
                    return this;
                } else if (obj instanceof Enum) {
                    String name = ((Enum) obj).name();
                    a();
                    this.c.value(name);
                    return this;
                } else {
                    StringBuilder a3 = a.a("Couldn't find encoder for type ");
                    a3.append(obj.getClass().getCanonicalName());
                    throw new EncodingException(a3.toString());
                }
            }
        }
    }

    public final void a() {
        if (this.f4673b) {
            e eVar = this.a;
            if (eVar != null) {
                eVar.a();
                this.a.f4673b = false;
                this.a = null;
                this.c.endObject();
                return;
            }
            return;
        }
        throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
    }
}
