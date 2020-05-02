package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter$1;
import i.c.e.g;
import i.c.e.j;
import i.c.e.k;
import i.c.e.l;
import i.c.e.m;
import i.c.e.q;
import i.c.e.r;
import i.c.e.v.a;
import i.c.e.v.b;
import i.c.e.v.c;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Currency;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

public final class TypeAdapters {
    public static final q<String> A = new q<String>() {
        public void a(c cVar, Object obj) {
            cVar.d((String) obj);
        }

        public Object a(a aVar) {
            b C = aVar.C();
            if (C == b.NULL) {
                aVar.z();
                return null;
            } else if (C == b.BOOLEAN) {
                return Boolean.toString(aVar.u());
            } else {
                return aVar.A();
            }
        }
    };
    public static final q<BigDecimal> B = new q<BigDecimal>() {
        public void a(c cVar, Object obj) {
            cVar.a((Number) (BigDecimal) obj);
        }

        public Object a(a aVar) {
            if (aVar.C() == b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return new BigDecimal(aVar.A());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    public static final q<BigInteger> C = new q<BigInteger>() {
        public void a(c cVar, Object obj) {
            cVar.a((Number) (BigInteger) obj);
        }

        public Object a(a aVar) {
            if (aVar.C() == b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return new BigInteger(aVar.A());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    public static final r D;
    public static final q<StringBuilder> E;
    public static final r F;
    public static final q<StringBuffer> G;
    public static final r H;
    public static final q<URL> I;
    public static final r J;
    public static final q<URI> K;
    public static final r L;
    public static final q<InetAddress> M;
    public static final r N;
    public static final q<UUID> O;
    public static final r P;
    public static final q<Currency> Q;
    public static final r R;
    public static final r S = new r() {
        public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
            if (aVar.getRawType() != Timestamp.class) {
                return null;
            }
            Class<Date> cls = Date.class;
            if (gson != null) {
                final q<Date> a = gson.a(i.c.e.u.a.get(cls));
                return new q<Timestamp>(this) {
                    public void a(c cVar, Object obj) {
                        a.a(cVar, (Timestamp) obj);
                    }

                    public Object a(a aVar) {
                        Date date = (Date) a.a(aVar);
                        if (date != null) {
                            return new Timestamp(date.getTime());
                        }
                        return null;
                    }
                };
            }
            throw null;
        }
    };
    public static final q<Calendar> T;
    public static final r U;
    public static final q<Locale> V;
    public static final r W;
    public static final q<j> X;
    public static final r Y;
    public static final r Z = new r() {
        /* JADX WARNING: type inference failed for: r2v0, types: [i.c.e.u.a<T>, i.c.e.u.a] */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public <T> i.c.e.q<T> a(com.google.gson.Gson r1, i.c.e.u.a<T> r2) {
            /*
                r0 = this;
                java.lang.Class r1 = r2.getRawType()
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                boolean r2 = r2.isAssignableFrom(r1)
                if (r2 == 0) goto L_0x0021
                java.lang.Class<java.lang.Enum> r2 = java.lang.Enum.class
                if (r1 != r2) goto L_0x0011
                goto L_0x0021
            L_0x0011:
                boolean r2 = r1.isEnum()
                if (r2 != 0) goto L_0x001b
                java.lang.Class r1 = r1.getSuperclass()
            L_0x001b:
                com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter r2 = new com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter
                r2.<init>(r1)
                return r2
            L_0x0021:
                r1 = 0
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass30.a(com.google.gson.Gson, i.c.e.u.a):i.c.e.q");
        }
    };
    public static final q<Class> a;

    /* renamed from: b  reason: collision with root package name */
    public static final r f747b;
    public static final q<BitSet> c;
    public static final r d;
    public static final q<Boolean> e = new q<Boolean>() {
        public void a(c cVar, Object obj) {
            cVar.a((Boolean) obj);
        }

        public Object a(a aVar) {
            b C = aVar.C();
            if (C == b.NULL) {
                aVar.z();
                return null;
            } else if (C == b.STRING) {
                return Boolean.valueOf(Boolean.parseBoolean(aVar.A()));
            } else {
                return Boolean.valueOf(aVar.u());
            }
        }
    };

    /* renamed from: f  reason: collision with root package name */
    public static final q<Boolean> f748f = new q<Boolean>() {
        public void a(c cVar, Object obj) {
            String str;
            Boolean bool = (Boolean) obj;
            if (bool == null) {
                str = "null";
            } else {
                str = bool.toString();
            }
            cVar.d(str);
        }

        public Object a(a aVar) {
            if (aVar.C() != b.NULL) {
                return Boolean.valueOf(aVar.A());
            }
            aVar.z();
            return null;
        }
    };

    /* renamed from: g  reason: collision with root package name */
    public static final r f749g;

    /* renamed from: h  reason: collision with root package name */
    public static final q<Number> f750h = new q<Number>() {
        public void a(c cVar, Object obj) {
            cVar.a((Number) obj);
        }

        public Object a(a aVar) {
            if (aVar.C() == b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return Byte.valueOf((byte) aVar.w());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };

    /* renamed from: i  reason: collision with root package name */
    public static final r f751i;

    /* renamed from: j  reason: collision with root package name */
    public static final q<Number> f752j = new q<Number>() {
        public void a(c cVar, Object obj) {
            cVar.a((Number) obj);
        }

        public Object a(a aVar) {
            if (aVar.C() == b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return Short.valueOf((short) aVar.w());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };

    /* renamed from: k  reason: collision with root package name */
    public static final r f753k;

    /* renamed from: l  reason: collision with root package name */
    public static final q<Number> f754l = new q<Number>() {
        public void a(c cVar, Object obj) {
            cVar.a((Number) obj);
        }

        public Object a(a aVar) {
            if (aVar.C() == b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return Integer.valueOf(aVar.w());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };

    /* renamed from: m  reason: collision with root package name */
    public static final r f755m;

    /* renamed from: n  reason: collision with root package name */
    public static final q<AtomicInteger> f756n;

    /* renamed from: o  reason: collision with root package name */
    public static final r f757o;

    /* renamed from: p  reason: collision with root package name */
    public static final q<AtomicBoolean> f758p;

    /* renamed from: q  reason: collision with root package name */
    public static final r f759q;
    public static final q<AtomicIntegerArray> r;
    public static final r s;
    public static final q<Number> t = new q<Number>() {
        public void a(c cVar, Object obj) {
            cVar.a((Number) obj);
        }

        public Object a(a aVar) {
            if (aVar.C() == b.NULL) {
                aVar.z();
                return null;
            }
            try {
                return Long.valueOf(aVar.x());
            } catch (NumberFormatException e) {
                throw new JsonSyntaxException((Throwable) e);
            }
        }
    };
    public static final q<Number> u = new q<Number>() {
        public void a(c cVar, Object obj) {
            cVar.a((Number) obj);
        }

        public Object a(a aVar) {
            if (aVar.C() != b.NULL) {
                return Float.valueOf((float) aVar.v());
            }
            aVar.z();
            return null;
        }
    };
    public static final q<Number> v = new q<Number>() {
        public void a(c cVar, Object obj) {
            cVar.a((Number) obj);
        }

        public Object a(a aVar) {
            if (aVar.C() != b.NULL) {
                return Double.valueOf(aVar.v());
            }
            aVar.z();
            return null;
        }
    };
    public static final q<Number> w;
    public static final r x;
    public static final q<Character> y = new q<Character>() {
        public void a(c cVar, Object obj) {
            String str;
            Character ch = (Character) obj;
            if (ch == null) {
                str = null;
            } else {
                str = String.valueOf(ch);
            }
            cVar.d(str);
        }

        public Object a(a aVar) {
            if (aVar.C() == b.NULL) {
                aVar.z();
                return null;
            }
            String A = aVar.A();
            if (A.length() == 1) {
                return Character.valueOf(A.charAt(0));
            }
            throw new JsonSyntaxException(i.a.a.a.a.b("Expecting character, got: ", A));
        }
    };
    public static final r z;

    /* renamed from: com.google.gson.internal.bind.TypeAdapters$31  reason: invalid class name */
    public class AnonymousClass31 implements r {
        public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
            boolean equals = aVar.equals((Object) null);
            return null;
        }
    }

    static {
        final TypeAdapter$1 typeAdapter$1 = new TypeAdapter$1(new q<Class>() {
            public void a(c cVar, Object obj) {
                StringBuilder a = i.a.a.a.a.a("Attempted to serialize java.lang.Class: ");
                a.append(((Class) obj).getName());
                a.append(". Forgot to register a type adapter?");
                throw new UnsupportedOperationException(a.toString());
            }

            public Object a(a aVar) {
                throw new UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
            }
        });
        a = typeAdapter$1;
        final Class<Class> cls = Class.class;
        f747b = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final TypeAdapter$1 typeAdapter$12 = new TypeAdapter$1(new q<BitSet>() {
            public void a(c cVar, Object obj) {
                BitSet bitSet = (BitSet) obj;
                cVar.f();
                int length = bitSet.length();
                for (int i2 = 0; i2 < length; i2++) {
                    cVar.e(bitSet.get(i2) ? 1 : 0);
                }
                cVar.j();
            }

            /* JADX WARNING: Code restructure failed: missing block: B:13:0x003e, code lost:
                if (r6.w() != 0) goto L_0x004b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
                if (java.lang.Integer.parseInt(r1) != 0) goto L_0x004b;
             */
            /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
                r1 = false;
             */
            /* JADX WARNING: Removed duplicated region for block: B:21:0x0050  */
            /* JADX WARNING: Removed duplicated region for block: B:31:0x0053 A[SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object a(i.c.e.v.a r6) {
                /*
                    r5 = this;
                    java.util.BitSet r0 = new java.util.BitSet
                    r0.<init>()
                    r6.a()
                    i.c.e.v.b r1 = r6.C()
                    r2 = 0
                L_0x000d:
                    i.c.e.v.b r3 = i.c.e.v.b.END_ARRAY
                    if (r1 == r3) goto L_0x0066
                    int r3 = r1.ordinal()
                    r4 = 5
                    if (r3 == r4) goto L_0x0041
                    r4 = 6
                    if (r3 == r4) goto L_0x003a
                    r4 = 7
                    if (r3 != r4) goto L_0x0023
                    boolean r1 = r6.u()
                    goto L_0x004e
                L_0x0023:
                    com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r2 = "Invalid bitset value type: "
                    r0.append(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    r6.<init>((java.lang.String) r0)
                    throw r6
                L_0x003a:
                    int r1 = r6.w()
                    if (r1 == 0) goto L_0x004d
                    goto L_0x004b
                L_0x0041:
                    java.lang.String r1 = r6.A()
                    int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x005a }
                    if (r1 == 0) goto L_0x004d
                L_0x004b:
                    r1 = 1
                    goto L_0x004e
                L_0x004d:
                    r1 = 0
                L_0x004e:
                    if (r1 == 0) goto L_0x0053
                    r0.set(r2)
                L_0x0053:
                    int r2 = r2 + 1
                    i.c.e.v.b r1 = r6.C()
                    goto L_0x000d
                L_0x005a:
                    com.google.gson.JsonSyntaxException r6 = new com.google.gson.JsonSyntaxException
                    java.lang.String r0 = "Error: Expecting: bitset number value (1, 0), Found: "
                    java.lang.String r0 = i.a.a.a.a.b((java.lang.String) r0, (java.lang.String) r1)
                    r6.<init>((java.lang.String) r0)
                    throw r6
                L_0x0066:
                    r6.m()
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters.AnonymousClass2.a(i.c.e.v.a):java.lang.Object");
            }
        });
        c = typeAdapter$12;
        final Class<BitSet> cls2 = BitSet.class;
        d = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final Class cls3 = Boolean.TYPE;
        final Class<Boolean> cls4 = Boolean.class;
        final q<Boolean> qVar = e;
        f749g = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final Class cls5 = Byte.TYPE;
        final Class<Byte> cls6 = Byte.class;
        final q<Number> qVar2 = f750h;
        f751i = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final Class cls7 = Short.TYPE;
        final Class<Short> cls8 = Short.class;
        final q<Number> qVar3 = f752j;
        f753k = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final Class cls9 = Integer.TYPE;
        final Class<Integer> cls10 = Integer.class;
        final q<Number> qVar4 = f754l;
        f755m = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final TypeAdapter$1 typeAdapter$13 = new TypeAdapter$1(new q<AtomicInteger>() {
            public void a(c cVar, Object obj) {
                cVar.e((long) ((AtomicInteger) obj).get());
            }

            public Object a(a aVar) {
                try {
                    return new AtomicInteger(aVar.w());
                } catch (NumberFormatException e) {
                    throw new JsonSyntaxException((Throwable) e);
                }
            }
        });
        f756n = typeAdapter$13;
        final Class<AtomicInteger> cls11 = AtomicInteger.class;
        f757o = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final TypeAdapter$1 typeAdapter$14 = new TypeAdapter$1(new q<AtomicBoolean>() {
            public void a(c cVar, Object obj) {
                cVar.a(((AtomicBoolean) obj).get());
            }

            public Object a(a aVar) {
                return new AtomicBoolean(aVar.u());
            }
        });
        f758p = typeAdapter$14;
        final Class<AtomicBoolean> cls12 = AtomicBoolean.class;
        f759q = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final TypeAdapter$1 typeAdapter$15 = new TypeAdapter$1(new q<AtomicIntegerArray>() {
            public void a(c cVar, Object obj) {
                AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
                cVar.f();
                int length = atomicIntegerArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    cVar.e((long) atomicIntegerArray.get(i2));
                }
                cVar.j();
            }

            public Object a(a aVar) {
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.s()) {
                    try {
                        arrayList.add(Integer.valueOf(aVar.w()));
                    } catch (NumberFormatException e) {
                        throw new JsonSyntaxException((Throwable) e);
                    }
                }
                aVar.m();
                int size = arrayList.size();
                AtomicIntegerArray atomicIntegerArray = new AtomicIntegerArray(size);
                for (int i2 = 0; i2 < size; i2++) {
                    atomicIntegerArray.set(i2, ((Integer) arrayList.get(i2)).intValue());
                }
                return atomicIntegerArray;
            }
        });
        r = typeAdapter$15;
        final Class<AtomicIntegerArray> cls13 = AtomicIntegerArray.class;
        s = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final AnonymousClass14 r0 = new q<Number>() {
            public void a(c cVar, Object obj) {
                cVar.a((Number) obj);
            }

            public Object a(a aVar) {
                b C = aVar.C();
                int ordinal = C.ordinal();
                if (ordinal == 5 || ordinal == 6) {
                    return new i.c.e.t.q(aVar.A());
                }
                if (ordinal == 8) {
                    aVar.z();
                    return null;
                }
                throw new JsonSyntaxException("Expecting number, got: " + C);
            }
        };
        w = r0;
        final Class<Number> cls14 = Number.class;
        x = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final Class cls15 = Character.TYPE;
        final Class<Character> cls16 = Character.class;
        final q<Character> qVar5 = y;
        z = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == cls15 || rawType == cls16) {
                    return qVar5;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[type=");
                a.append(cls16.getName());
                a.append("+");
                a.append(cls15.getName());
                a.append(",adapter=");
                a.append(qVar5);
                a.append("]");
                return a.toString();
            }
        };
        final Class<String> cls17 = String.class;
        final q<String> qVar6 = A;
        D = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final AnonymousClass19 r02 = new q<StringBuilder>() {
            public void a(c cVar, Object obj) {
                String str;
                StringBuilder sb = (StringBuilder) obj;
                if (sb == null) {
                    str = null;
                } else {
                    str = sb.toString();
                }
                cVar.d(str);
            }

            public Object a(a aVar) {
                if (aVar.C() != b.NULL) {
                    return new StringBuilder(aVar.A());
                }
                aVar.z();
                return null;
            }
        };
        E = r02;
        final Class<StringBuilder> cls18 = StringBuilder.class;
        F = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final AnonymousClass20 r03 = new q<StringBuffer>() {
            public void a(c cVar, Object obj) {
                String str;
                StringBuffer stringBuffer = (StringBuffer) obj;
                if (stringBuffer == null) {
                    str = null;
                } else {
                    str = stringBuffer.toString();
                }
                cVar.d(str);
            }

            public Object a(a aVar) {
                if (aVar.C() != b.NULL) {
                    return new StringBuffer(aVar.A());
                }
                aVar.z();
                return null;
            }
        };
        G = r03;
        final Class<StringBuffer> cls19 = StringBuffer.class;
        H = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final AnonymousClass21 r04 = new q<URL>() {
            public void a(c cVar, Object obj) {
                String str;
                URL url = (URL) obj;
                if (url == null) {
                    str = null;
                } else {
                    str = url.toExternalForm();
                }
                cVar.d(str);
            }

            public Object a(a aVar) {
                if (aVar.C() == b.NULL) {
                    aVar.z();
                    return null;
                }
                String A = aVar.A();
                if ("null".equals(A)) {
                    return null;
                }
                return new URL(A);
            }
        };
        I = r04;
        final Class<URL> cls20 = URL.class;
        J = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final AnonymousClass22 r05 = new q<URI>() {
            public void a(c cVar, Object obj) {
                String str;
                URI uri = (URI) obj;
                if (uri == null) {
                    str = null;
                } else {
                    str = uri.toASCIIString();
                }
                cVar.d(str);
            }

            public Object a(a aVar) {
                if (aVar.C() == b.NULL) {
                    aVar.z();
                    return null;
                }
                try {
                    String A = aVar.A();
                    if ("null".equals(A)) {
                        return null;
                    }
                    return new URI(A);
                } catch (URISyntaxException e) {
                    throw new JsonIOException((Throwable) e);
                }
            }
        };
        K = r05;
        final Class<URI> cls21 = URI.class;
        L = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final AnonymousClass23 r06 = new q<InetAddress>() {
            public void a(c cVar, Object obj) {
                String str;
                InetAddress inetAddress = (InetAddress) obj;
                if (inetAddress == null) {
                    str = null;
                } else {
                    str = inetAddress.getHostAddress();
                }
                cVar.d(str);
            }

            public Object a(a aVar) {
                if (aVar.C() != b.NULL) {
                    return InetAddress.getByName(aVar.A());
                }
                aVar.z();
                return null;
            }
        };
        M = r06;
        final Class<InetAddress> cls22 = InetAddress.class;
        N = new r() {
            public <T2> q<T2> a(Gson gson, i.c.e.u.a<T2> aVar) {
                final Class<? super T2> rawType = aVar.getRawType();
                if (!r1.isAssignableFrom(rawType)) {
                    return null;
                }
                return new q<T1>() {
                    public void a(c cVar, T1 t1) {
                        r0.a(cVar, t1);
                    }

                    public T1 a(a aVar) {
                        T1 a2 = r0.a(aVar);
                        if (a2 == null || rawType.isInstance(a2)) {
                            return a2;
                        }
                        StringBuilder a3 = i.a.a.a.a.a("Expected a ");
                        a3.append(rawType.getName());
                        a3.append(" but was ");
                        a3.append(a2.getClass().getName());
                        throw new JsonSyntaxException(a3.toString());
                    }
                };
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[typeHierarchy=");
                a.append(r1.getName());
                a.append(",adapter=");
                a.append(r0);
                a.append("]");
                return a.toString();
            }
        };
        final AnonymousClass24 r07 = new q<UUID>() {
            public void a(c cVar, Object obj) {
                String str;
                UUID uuid = (UUID) obj;
                if (uuid == null) {
                    str = null;
                } else {
                    str = uuid.toString();
                }
                cVar.d(str);
            }

            public Object a(a aVar) {
                if (aVar.C() != b.NULL) {
                    return UUID.fromString(aVar.A());
                }
                aVar.z();
                return null;
            }
        };
        O = r07;
        final Class<UUID> cls23 = UUID.class;
        P = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final TypeAdapter$1 typeAdapter$16 = new TypeAdapter$1(new q<Currency>() {
            public void a(c cVar, Object obj) {
                cVar.d(((Currency) obj).getCurrencyCode());
            }

            public Object a(a aVar) {
                return Currency.getInstance(aVar.A());
            }
        });
        Q = typeAdapter$16;
        final Class<Currency> cls24 = Currency.class;
        R = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final AnonymousClass27 r08 = new q<Calendar>() {
            public void a(c cVar, Object obj) {
                Calendar calendar = (Calendar) obj;
                if (calendar == null) {
                    cVar.q();
                    return;
                }
                cVar.h();
                cVar.b("year");
                cVar.e((long) calendar.get(1));
                cVar.b("month");
                cVar.e((long) calendar.get(2));
                cVar.b("dayOfMonth");
                cVar.e((long) calendar.get(5));
                cVar.b("hourOfDay");
                cVar.e((long) calendar.get(11));
                cVar.b("minute");
                cVar.e((long) calendar.get(12));
                cVar.b("second");
                cVar.e((long) calendar.get(13));
                cVar.m();
            }

            public Object a(a aVar) {
                if (aVar.C() == b.NULL) {
                    aVar.z();
                    return null;
                }
                aVar.f();
                int i2 = 0;
                int i3 = 0;
                int i4 = 0;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                while (aVar.C() != b.END_OBJECT) {
                    String y = aVar.y();
                    int w = aVar.w();
                    if ("year".equals(y)) {
                        i2 = w;
                    } else if ("month".equals(y)) {
                        i3 = w;
                    } else if ("dayOfMonth".equals(y)) {
                        i4 = w;
                    } else if ("hourOfDay".equals(y)) {
                        i5 = w;
                    } else if ("minute".equals(y)) {
                        i6 = w;
                    } else if ("second".equals(y)) {
                        i7 = w;
                    }
                }
                aVar.o();
                return new GregorianCalendar(i2, i3, i4, i5, i6, i7);
            }
        };
        T = r08;
        final Class<Calendar> cls25 = Calendar.class;
        final Class<GregorianCalendar> cls26 = GregorianCalendar.class;
        U = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
                Class<? super T> rawType = aVar.getRawType();
                if (rawType == cls25 || rawType == cls26) {
                    return r08;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[type=");
                a.append(cls25.getName());
                a.append("+");
                a.append(cls26.getName());
                a.append(",adapter=");
                a.append(r08);
                a.append("]");
                return a.toString();
            }
        };
        final AnonymousClass28 r09 = new q<Locale>() {
            public void a(c cVar, Object obj) {
                String str;
                Locale locale = (Locale) obj;
                if (locale == null) {
                    str = null;
                } else {
                    str = locale.toString();
                }
                cVar.d(str);
            }

            public Object a(a aVar) {
                String str = null;
                if (aVar.C() == b.NULL) {
                    aVar.z();
                    return null;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(aVar.A(), l.a.a.a.o.d.b.ROLL_OVER_FILE_NAME_SEPARATOR);
                String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                if (stringTokenizer.hasMoreElements()) {
                    str = stringTokenizer.nextToken();
                }
                if (nextToken2 == null && str == null) {
                    return new Locale(nextToken);
                }
                if (str == null) {
                    return new Locale(nextToken, nextToken2);
                }
                return new Locale(nextToken, nextToken2, str);
            }
        };
        V = r09;
        final Class<Locale> cls27 = Locale.class;
        W = new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
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
        };
        final AnonymousClass29 r010 = new q<j>() {
            public void a(c cVar, j jVar) {
                if (jVar == null || (jVar instanceof k)) {
                    cVar.q();
                } else if (jVar instanceof m) {
                    m e = jVar.e();
                    Object obj = e.a;
                    if (obj instanceof Number) {
                        cVar.a(e.i());
                    } else if (obj instanceof Boolean) {
                        cVar.a(e.h());
                    } else {
                        cVar.d(e.f());
                    }
                } else {
                    boolean z = jVar instanceof g;
                    if (z) {
                        cVar.f();
                        if (z) {
                            Iterator<j> it = ((g) jVar).iterator();
                            while (it.hasNext()) {
                                a(cVar, it.next());
                            }
                            cVar.j();
                            return;
                        }
                        throw new IllegalStateException("Not a JSON Array: " + jVar);
                    } else if (jVar instanceof l) {
                        cVar.h();
                        for (Map.Entry next : jVar.d().a.entrySet()) {
                            cVar.b((String) next.getKey());
                            a(cVar, (j) next.getValue());
                        }
                        cVar.m();
                    } else {
                        StringBuilder a = i.a.a.a.a.a("Couldn't write ");
                        a.append(jVar.getClass());
                        throw new IllegalArgumentException(a.toString());
                    }
                }
            }

            public j a(a aVar) {
                int ordinal = aVar.C().ordinal();
                if (ordinal == 0) {
                    g gVar = new g();
                    aVar.a();
                    while (aVar.s()) {
                        Object a = a(aVar);
                        if (a == null) {
                            a = k.a;
                        }
                        gVar.e.add(a);
                    }
                    aVar.m();
                    return gVar;
                } else if (ordinal == 2) {
                    l lVar = new l();
                    aVar.f();
                    while (aVar.s()) {
                        String y = aVar.y();
                        Object a2 = a(aVar);
                        i.c.e.t.r<String, j> rVar = lVar.a;
                        if (a2 == null) {
                            a2 = k.a;
                        }
                        rVar.put(y, a2);
                    }
                    aVar.o();
                    return lVar;
                } else if (ordinal == 5) {
                    return new m(aVar.A());
                } else {
                    if (ordinal == 6) {
                        return new m((Number) new i.c.e.t.q(aVar.A()));
                    }
                    if (ordinal == 7) {
                        return new m(Boolean.valueOf(aVar.u()));
                    }
                    if (ordinal == 8) {
                        aVar.z();
                        return k.a;
                    }
                    throw new IllegalArgumentException();
                }
            }
        };
        X = r010;
        final Class<j> cls28 = j.class;
        Y = new r() {
            public <T2> q<T2> a(Gson gson, i.c.e.u.a<T2> aVar) {
                final Class<? super T2> rawType = aVar.getRawType();
                if (!cls28.isAssignableFrom(rawType)) {
                    return null;
                }
                return new q<T1>() {
                    public void a(c cVar, T1 t1) {
                        r010.a(cVar, t1);
                    }

                    public T1 a(a aVar) {
                        T1 a2 = r010.a(aVar);
                        if (a2 == null || rawType.isInstance(a2)) {
                            return a2;
                        }
                        StringBuilder a3 = i.a.a.a.a.a("Expected a ");
                        a3.append(rawType.getName());
                        a3.append(" but was ");
                        a3.append(a2.getClass().getName());
                        throw new JsonSyntaxException(a3.toString());
                    }
                };
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[typeHierarchy=");
                a.append(cls28.getName());
                a.append(",adapter=");
                a.append(r010);
                a.append("]");
                return a.toString();
            }
        };
    }

    public static <TT> r a(final Class<TT> cls, final q<TT> qVar) {
        return new r() {
            public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
                if (aVar.getRawType() == cls) {
                    return qVar;
                }
                return null;
            }

            public String toString() {
                StringBuilder a = i.a.a.a.a.a("Factory[type=");
                a.append(cls.getName());
                a.append(",adapter=");
                a.append(qVar);
                a.append("]");
                return a.toString();
            }
        };
    }

    public static final class EnumTypeAdapter<T extends Enum<T>> extends q<T> {
        public final Map<String, T> a = new HashMap();

        /* renamed from: b  reason: collision with root package name */
        public final Map<T, String> f767b = new HashMap();

        public EnumTypeAdapter(Class<T> cls) {
            try {
                for (Enum enumR : (Enum[]) cls.getEnumConstants()) {
                    String name = enumR.name();
                    i.c.e.s.b bVar = (i.c.e.s.b) cls.getField(name).getAnnotation(i.c.e.s.b.class);
                    if (bVar != null) {
                        name = bVar.value();
                        for (String put : bVar.alternate()) {
                            this.a.put(put, enumR);
                        }
                    }
                    this.a.put(name, enumR);
                    this.f767b.put(enumR, name);
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError(e);
            }
        }

        public void a(c cVar, Object obj) {
            String str;
            Enum enumR = (Enum) obj;
            if (enumR == null) {
                str = null;
            } else {
                str = this.f767b.get(enumR);
            }
            cVar.d(str);
        }

        public Object a(a aVar) {
            if (aVar.C() != b.NULL) {
                return (Enum) this.a.get(aVar.A());
            }
            aVar.z();
            return null;
        }
    }
}
