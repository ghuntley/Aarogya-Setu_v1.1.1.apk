package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import i.c.e.j;
import i.c.e.k;
import i.c.e.l;
import i.c.e.m;
import i.c.e.q;
import i.c.e.r;
import i.c.e.t.g;
import i.c.e.t.p;
import i.c.e.t.s;
import i.c.e.t.y.b;
import i.c.e.u.a;
import i.c.e.v.a;
import i.c.e.v.c;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

public final class MapTypeAdapterFactory implements r {
    public final g e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f732f;

    public MapTypeAdapterFactory(g gVar, boolean z) {
        this.e = gVar;
        this.f732f = z;
    }

    public <T> q<T> a(Gson gson, a<T> aVar) {
        Type[] typeArr;
        q<Boolean> qVar;
        Type type = aVar.getType();
        if (!Map.class.isAssignableFrom(aVar.getRawType())) {
            return null;
        }
        Class<?> c = i.c.e.t.a.c(type);
        Class<Object> cls = Object.class;
        Class<String> cls2 = String.class;
        if (type == Properties.class) {
            typeArr = new Type[]{cls2, cls2};
        } else {
            Type b2 = i.c.e.t.a.b(type, c, Map.class);
            typeArr = b2 instanceof ParameterizedType ? ((ParameterizedType) b2).getActualTypeArguments() : new Type[]{cls, cls};
        }
        Type type2 = typeArr[0];
        if (type2 == Boolean.TYPE || type2 == Boolean.class) {
            qVar = TypeAdapters.f748f;
        } else {
            qVar = gson.a(a.get(type2));
        }
        return new Adapter(gson, typeArr[0], qVar, typeArr[1], gson.a(a.get(typeArr[1])), this.e.a(aVar));
    }

    public final class Adapter<K, V> extends q<Map<K, V>> {
        public final q<K> a;

        /* renamed from: b  reason: collision with root package name */
        public final q<V> f733b;
        public final s<? extends Map<K, V>> c;

        public Adapter(Gson gson, Type type, q<K> qVar, Type type2, q<V> qVar2, s<? extends Map<K, V>> sVar) {
            this.a = new TypeAdapterRuntimeTypeWrapper(gson, qVar, type);
            this.f733b = new TypeAdapterRuntimeTypeWrapper(gson, qVar2, type2);
            this.c = sVar;
        }

        public void a(c cVar, Object obj) {
            String str;
            Map map = (Map) obj;
            if (map == null) {
                cVar.q();
            } else if (!MapTypeAdapterFactory.this.f732f) {
                cVar.h();
                for (Map.Entry entry : map.entrySet()) {
                    cVar.b(String.valueOf(entry.getKey()));
                    this.f733b.a(cVar, entry.getValue());
                }
                cVar.m();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z = false;
                for (Map.Entry entry2 : map.entrySet()) {
                    q<K> qVar = this.a;
                    Object key = entry2.getKey();
                    if (qVar != null) {
                        try {
                            b bVar = new b();
                            qVar.a(bVar, key);
                            if (bVar.f4891p.isEmpty()) {
                                j jVar = bVar.r;
                                arrayList.add(jVar);
                                arrayList2.add(entry2.getValue());
                                if (jVar != null) {
                                    z |= (jVar instanceof i.c.e.g) || (jVar instanceof l);
                                } else {
                                    throw null;
                                }
                            } else {
                                throw new IllegalStateException("Expected one JSON element but was " + bVar.f4891p);
                            }
                        } catch (IOException e) {
                            throw new JsonIOException((Throwable) e);
                        }
                    } else {
                        throw null;
                    }
                }
                if (z) {
                    cVar.f();
                    int size = arrayList.size();
                    while (i2 < size) {
                        cVar.f();
                        TypeAdapters.X.a(cVar, (j) arrayList.get(i2));
                        this.f733b.a(cVar, arrayList2.get(i2));
                        cVar.j();
                        i2++;
                    }
                    cVar.j();
                    return;
                }
                cVar.h();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    j jVar2 = (j) arrayList.get(i2);
                    if (jVar2 != null) {
                        if (jVar2 instanceof m) {
                            m e2 = jVar2.e();
                            Object obj2 = e2.a;
                            if (obj2 instanceof Number) {
                                str = String.valueOf(e2.i());
                            } else if (obj2 instanceof Boolean) {
                                str = Boolean.toString(e2.h());
                            } else if (obj2 instanceof String) {
                                str = e2.f();
                            } else {
                                throw new AssertionError();
                            }
                        } else if (jVar2 instanceof k) {
                            str = "null";
                        } else {
                            throw new AssertionError();
                        }
                        cVar.b(str);
                        this.f733b.a(cVar, arrayList2.get(i2));
                        i2++;
                    } else {
                        throw null;
                    }
                }
                cVar.m();
            }
        }

        public Object a(i.c.e.v.a aVar) {
            i.c.e.v.b C = aVar.C();
            if (C == i.c.e.v.b.NULL) {
                aVar.z();
                return null;
            }
            Map map = (Map) this.c.a();
            if (C == i.c.e.v.b.BEGIN_ARRAY) {
                aVar.a();
                while (aVar.s()) {
                    aVar.a();
                    K a2 = this.a.a(aVar);
                    if (map.put(a2, this.f733b.a(aVar)) == null) {
                        aVar.m();
                    } else {
                        throw new JsonSyntaxException("duplicate key: " + a2);
                    }
                }
                aVar.m();
            } else {
                aVar.f();
                while (aVar.s()) {
                    if (((a.C0139a) p.a) != null) {
                        if (aVar instanceof i.c.e.t.y.a) {
                            i.c.e.t.y.a aVar2 = (i.c.e.t.y.a) aVar;
                            aVar2.a(i.c.e.v.b.NAME);
                            Map.Entry entry = (Map.Entry) ((Iterator) aVar2.G()).next();
                            aVar2.a(entry.getValue());
                            aVar2.a((Object) new m((String) entry.getKey()));
                        } else {
                            int i2 = aVar.f4904l;
                            if (i2 == 0) {
                                i2 = aVar.j();
                            }
                            if (i2 == 13) {
                                aVar.f4904l = 9;
                            } else if (i2 == 12) {
                                aVar.f4904l = 8;
                            } else if (i2 == 14) {
                                aVar.f4904l = 10;
                            } else {
                                StringBuilder a3 = i.a.a.a.a.a("Expected a name but was ");
                                a3.append(aVar.C());
                                a3.append(aVar.t());
                                throw new IllegalStateException(a3.toString());
                            }
                        }
                        K a4 = this.a.a(aVar);
                        if (map.put(a4, this.f733b.a(aVar)) != null) {
                            throw new JsonSyntaxException("duplicate key: " + a4);
                        }
                    } else {
                        throw null;
                    }
                }
                aVar.o();
            }
            return map;
        }
    }
}
