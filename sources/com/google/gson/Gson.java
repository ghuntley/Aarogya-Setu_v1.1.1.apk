package com.google.gson;

import com.google.gson.Gson;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.bind.ArrayTypeAdapter;
import com.google.gson.internal.bind.CollectionTypeAdapterFactory;
import com.google.gson.internal.bind.DateTypeAdapter;
import com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory;
import com.google.gson.internal.bind.MapTypeAdapterFactory;
import com.google.gson.internal.bind.ObjectTypeAdapter;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import com.google.gson.internal.bind.SqlDateTypeAdapter;
import com.google.gson.internal.bind.TimeTypeAdapter;
import com.google.gson.internal.bind.TypeAdapters;
import i.c.e.c;
import i.c.e.d;
import i.c.e.f;
import i.c.e.j;
import i.c.e.k;
import i.c.e.p;
import i.c.e.q;
import i.c.e.r;
import i.c.e.t.g;
import i.c.e.u.a;
import i.c.e.v.b;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;

public final class Gson {

    /* renamed from: k  reason: collision with root package name */
    public static final a<?> f715k = a.get(Object.class);
    public final ThreadLocal<Map<a<?>, FutureTypeAdapter<?>>> a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<a<?>, q<?>> f716b;
    public final g c;
    public final JsonAdapterAnnotationTypeAdapterFactory d;
    public final List<r> e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f717f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f718g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f719h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f720i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f721j;

    public Gson() {
        this(Excluder.f722j, c.IDENTITY, Collections.emptyMap(), false, false, false, true, false, false, false, p.DEFAULT, (String) null, 2, 2, Collections.emptyList(), Collections.emptyList(), Collections.emptyList());
    }

    public void a(j jVar, i.c.e.v.c cVar) {
        boolean z = cVar.f4926j;
        cVar.f4926j = true;
        boolean z2 = cVar.f4927k;
        cVar.f4927k = this.f719h;
        boolean z3 = cVar.f4929m;
        cVar.f4929m = this.f717f;
        try {
            TypeAdapters.X.a(cVar, jVar);
            cVar.f4926j = z;
            cVar.f4927k = z2;
            cVar.f4929m = z3;
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f4926j = z;
            cVar.f4927k = z2;
            cVar.f4929m = z3;
            throw th;
        }
    }

    public String toString() {
        return "{serializeNulls:" + this.f717f + ",factories:" + this.e + ",instanceCreators:" + this.c + "}";
    }

    public static class FutureTypeAdapter<T> extends q<T> {
        public q<T> a;

        public T a(i.c.e.v.a aVar) {
            q<T> qVar = this.a;
            if (qVar != null) {
                return qVar.a(aVar);
            }
            throw new IllegalStateException();
        }

        public void a(i.c.e.v.c cVar, T t) {
            q<T> qVar = this.a;
            if (qVar != null) {
                qVar.a(cVar, t);
                return;
            }
            throw new IllegalStateException();
        }
    }

    public Gson(Excluder excluder, d dVar, Map<Type, f<?>> map, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, p pVar, String str, int i2, int i3, List<r> list, List<r> list2, List<r> list3) {
        final q qVar;
        q qVar2;
        q qVar3;
        Excluder excluder2 = excluder;
        this.a = new ThreadLocal<>();
        this.f716b = new ConcurrentHashMap();
        Map<Type, f<?>> map2 = map;
        this.c = new g(map);
        this.f717f = z;
        this.f718g = z3;
        this.f719h = z4;
        this.f720i = z5;
        this.f721j = z6;
        ArrayList arrayList = new ArrayList();
        arrayList.add(TypeAdapters.Y);
        arrayList.add(ObjectTypeAdapter.f734b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(TypeAdapters.D);
        arrayList.add(TypeAdapters.f755m);
        arrayList.add(TypeAdapters.f749g);
        arrayList.add(TypeAdapters.f751i);
        arrayList.add(TypeAdapters.f753k);
        if (pVar == p.DEFAULT) {
            qVar = TypeAdapters.t;
        } else {
            qVar = new q<Number>() {
                public void a(i.c.e.v.c cVar, Object obj) {
                    Number number = (Number) obj;
                    if (number == null) {
                        cVar.q();
                    } else {
                        cVar.d(number.toString());
                    }
                }

                public Object a(i.c.e.v.a aVar) {
                    if (aVar.C() != b.NULL) {
                        return Long.valueOf(aVar.x());
                    }
                    aVar.z();
                    return null;
                }
            };
        }
        arrayList.add(new r(Long.TYPE, Long.class, qVar) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == r0 || rawType == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[type=");
                a.append(r1.getName());
                a.append("+");
                a.append(r0.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        });
        Class cls = Double.TYPE;
        Class<Double> cls2 = Double.class;
        if (z7) {
            qVar2 = TypeAdapters.v;
        } else {
            qVar2 = new q<Number>(this) {
                public void a(i.c.e.v.c cVar, Object obj) {
                    Number number = (Number) obj;
                    if (number == null) {
                        cVar.q();
                        return;
                    }
                    Gson.a(number.doubleValue());
                    cVar.a(number);
                }

                public Object a(i.c.e.v.a aVar) {
                    if (aVar.C() != b.NULL) {
                        return Double.valueOf(aVar.v());
                    }
                    aVar.z();
                    return null;
                }
            };
        }
        arrayList.add(new r(cls, cls2, qVar2) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == r0 || rawType == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[type=");
                a.append(r1.getName());
                a.append("+");
                a.append(r0.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        });
        Class cls3 = Float.TYPE;
        Class<Float> cls4 = Float.class;
        if (z7) {
            qVar3 = TypeAdapters.u;
        } else {
            qVar3 = new q<Number>(this) {
                public void a(i.c.e.v.c cVar, Object obj) {
                    Number number = (Number) obj;
                    if (number == null) {
                        cVar.q();
                        return;
                    }
                    Gson.a((double) number.floatValue());
                    cVar.a(number);
                }

                public Object a(i.c.e.v.a aVar) {
                    if (aVar.C() != b.NULL) {
                        return Float.valueOf((float) aVar.v());
                    }
                    aVar.z();
                    return null;
                }
            };
        }
        arrayList.add(new r(cls3, cls4, qVar3) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == r0 || rawType == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[type=");
                a.append(r1.getName());
                a.append("+");
                a.append(r0.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(TypeAdapters.x);
        arrayList.add(TypeAdapters.f757o);
        arrayList.add(TypeAdapters.f759q);
        arrayList.add(new r(AtomicLong.class, new TypeAdapter$1(new q<AtomicLong>() {
            public void a(i.c.e.v.c cVar, Object obj) {
                q.this.a(cVar, Long.valueOf(((AtomicLong) obj).get()));
            }

            public Object a(i.c.e.v.a aVar) {
                return new AtomicLong(((Number) q.this.a(aVar)).longValue());
            }
        })) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(new r(AtomicLongArray.class, new TypeAdapter$1(new q<AtomicLongArray>() {
            public void a(i.c.e.v.c cVar, Object obj) {
                AtomicLongArray atomicLongArray = (AtomicLongArray) obj;
                cVar.f();
                int length = atomicLongArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    q.this.a(cVar, Long.valueOf(atomicLongArray.get(i2)));
                }
                cVar.j();
            }

            public Object a(i.c.e.v.a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.s()) {
                    arrayList.add(Long.valueOf(((Number) q.this.a(aVar)).longValue()));
                }
                aVar.m();
                int size = arrayList.size();
                AtomicLongArray atomicLongArray = new AtomicLongArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicLongArray.set(i2, ((Long) arrayList.get(i2)).longValue());
                }
                return atomicLongArray;
            }
        })) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(TypeAdapters.s);
        arrayList.add(TypeAdapters.z);
        arrayList.add(TypeAdapters.F);
        arrayList.add(TypeAdapters.H);
        arrayList.add(new r(BigDecimal.class, TypeAdapters.B) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(new r(BigInteger.class, TypeAdapters.C) {
            public <T> q<T> a(Gson gson, a<T> aVar) {
                if (aVar.getRawType() == r1) {
                    return r2;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[type=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r2);
                a.append("]");
                return a.toString();
            }
        });
        arrayList.add(TypeAdapters.J);
        arrayList.add(TypeAdapters.L);
        arrayList.add(TypeAdapters.P);
        arrayList.add(TypeAdapters.R);
        arrayList.add(TypeAdapters.W);
        arrayList.add(TypeAdapters.N);
        arrayList.add(TypeAdapters.d);
        arrayList.add(DateTypeAdapter.f731b);
        arrayList.add(TypeAdapters.U);
        arrayList.add(TimeTypeAdapter.f742b);
        arrayList.add(SqlDateTypeAdapter.f741b);
        arrayList.add(TypeAdapters.S);
        arrayList.add(ArrayTypeAdapter.c);
        arrayList.add(TypeAdapters.f747b);
        arrayList.add(new CollectionTypeAdapterFactory(this.c));
        boolean z8 = z2;
        arrayList.add(new MapTypeAdapterFactory(this.c, z2));
        JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new JsonAdapterAnnotationTypeAdapterFactory(this.c);
        this.d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(TypeAdapters.Z);
        d dVar2 = dVar;
        arrayList.add(new ReflectiveTypeAdapterFactory(this.c, dVar, excluder, this.d));
        this.e = Collections.unmodifiableList(arrayList);
    }

    public static void a(double d2) {
        if (Double.isNaN(d2) || Double.isInfinite(d2)) {
            throw new IllegalArgumentException(d2 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public <T> q<T> a(a<T> aVar) {
        q<T> qVar = this.f716b.get(aVar == null ? f715k : aVar);
        if (qVar != null) {
            return qVar;
        }
        Map map = this.a.get();
        boolean z = false;
        if (map == null) {
            map = new HashMap();
            this.a.set(map);
            z = true;
        }
        FutureTypeAdapter futureTypeAdapter = (FutureTypeAdapter) map.get(aVar);
        if (futureTypeAdapter != null) {
            return futureTypeAdapter;
        }
        try {
            FutureTypeAdapter futureTypeAdapter2 = new FutureTypeAdapter();
            map.put(aVar, futureTypeAdapter2);
            for (r a2 : this.e) {
                q<T> a3 = a2.a(this, aVar);
                if (a3 != null) {
                    if (futureTypeAdapter2.a == null) {
                        futureTypeAdapter2.a = a3;
                        this.f716b.put(aVar, a3);
                        return a3;
                    }
                    throw new AssertionError();
                }
            }
            throw new IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map.remove(aVar);
            if (z) {
                this.a.remove();
            }
        }
    }

    public <T> q<T> a(r rVar, a<T> aVar) {
        if (!this.e.contains(rVar)) {
            rVar = this.d;
        }
        boolean z = false;
        for (r next : this.e) {
            if (z) {
                q<T> a2 = next.a(this, aVar);
                if (a2 != null) {
                    return a2;
                }
            } else if (next == rVar) {
                z = true;
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public String a(Object obj) {
        if (obj == null) {
            k kVar = k.a;
            StringWriter stringWriter = new StringWriter();
            try {
                a((j) kVar, a((Writer) stringWriter));
                return stringWriter.toString();
            } catch (IOException e2) {
                throw new JsonIOException((Throwable) e2);
            }
        } else {
            Class<?> cls = obj.getClass();
            StringWriter stringWriter2 = new StringWriter();
            try {
                a(obj, cls, a((Writer) stringWriter2));
                return stringWriter2.toString();
            } catch (IOException e3) {
                throw new JsonIOException((Throwable) e3);
            }
        }
    }

    public void a(Object obj, Type type, i.c.e.v.c cVar) {
        q<?> a2 = a(a.get(type));
        boolean z = cVar.f4926j;
        cVar.f4926j = true;
        boolean z2 = cVar.f4927k;
        cVar.f4927k = this.f719h;
        boolean z3 = cVar.f4929m;
        cVar.f4929m = this.f717f;
        try {
            a2.a(cVar, obj);
            cVar.f4926j = z;
            cVar.f4927k = z2;
            cVar.f4929m = z3;
        } catch (IOException e2) {
            throw new JsonIOException((Throwable) e2);
        } catch (AssertionError e3) {
            AssertionError assertionError = new AssertionError("AssertionError (GSON 2.8.6): " + e3.getMessage());
            assertionError.initCause(e3);
            throw assertionError;
        } catch (Throwable th) {
            cVar.f4926j = z;
            cVar.f4927k = z2;
            cVar.f4929m = z3;
            throw th;
        }
    }

    public i.c.e.v.c a(Writer writer) {
        if (this.f718g) {
            writer.write(")]}'\n");
        }
        i.c.e.v.c cVar = new i.c.e.v.c(writer);
        if (this.f720i) {
            cVar.f4924h = "  ";
            cVar.f4925i = ": ";
        }
        cVar.f4929m = this.f717f;
        return cVar;
    }
}
