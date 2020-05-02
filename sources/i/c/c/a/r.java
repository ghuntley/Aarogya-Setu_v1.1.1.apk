package i.c.c.a;

import i.a.a.a.a;
import i.c.c.a.n;
import i.c.c.a.z.d2;
import i.c.c.a.z.w1;
import i.c.c.a.z.y1;
import i.c.c.a.z.z1;
import i.c.f.f;
import i.c.f.o;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* compiled from: Registry */
public final class r {
    public static final Logger a = Logger.getLogger(r.class.getName());

    /* renamed from: b  reason: collision with root package name */
    public static final ConcurrentMap<String, g> f4369b = new ConcurrentHashMap();
    public static final ConcurrentMap<String, Boolean> c = new ConcurrentHashMap();
    public static final ConcurrentMap<String, b> d = new ConcurrentHashMap();

    public static synchronized <P> o a(z1 z1Var) {
        o a2;
        synchronized (r.class) {
            g b2 = b(z1Var.f4632h);
            if (((Boolean) c.get(z1Var.f4632h)).booleanValue()) {
                a2 = b2.a(z1Var.f4633i);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + z1Var.f4632h);
            }
        }
        return a2;
    }

    public static synchronized <P> w1 b(z1 z1Var) {
        w1 b2;
        synchronized (r.class) {
            g b3 = b(z1Var.f4632h);
            if (((Boolean) c.get(z1Var.f4632h)).booleanValue()) {
                b2 = b3.b(z1Var.f4633i);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + z1Var.f4632h);
            }
        }
        return b2;
    }

    public static <P> n<P> a(h hVar, g<P> gVar) {
        P p2;
        byte[] bArr;
        s.b(hVar.a);
        n<P> nVar = new n<>();
        for (d2.c next : hVar.a.f4423j) {
            if (next.k() == y1.ENABLED) {
                if (gVar == null || !gVar.a(next.i().f4607h)) {
                    String str = next.i().f4607h;
                    p2 = b(str).c(next.i().f4608i);
                } else {
                    p2 = gVar.c(next.i().f4608i);
                }
                int ordinal = next.j().ordinal();
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal == 3) {
                            bArr = c.a;
                        } else if (ordinal != 4) {
                            throw new GeneralSecurityException("unknown output prefix type");
                        }
                    }
                    bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(next.f4428j).array();
                } else {
                    bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(next.f4428j).array();
                }
                n.a<P> aVar = new n.a<>(p2, bArr, next.k(), next.j());
                ArrayList arrayList = new ArrayList();
                arrayList.add(aVar);
                String str2 = new String(aVar.a(), n.c);
                List list = (List) nVar.a.put(str2, Collections.unmodifiableList(arrayList));
                if (list != null) {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.addAll(list);
                    arrayList2.add(aVar);
                    nVar.a.put(str2, Collections.unmodifiableList(arrayList2));
                }
                if (next.f4428j == hVar.a.f4422i) {
                    nVar.f4367b = aVar;
                }
            }
        }
        return nVar;
    }

    public static <P> g<P> b(String str) {
        g<P> gVar = (g) f4369b.get(str);
        if (gVar != null) {
            return gVar;
        }
        throw new GeneralSecurityException(a.a("No key manager found for key type: ", str, ".  Check the configuration of the registry."));
    }

    public static synchronized <P> void a(String str, b<P> bVar) {
        synchronized (r.class) {
            if (str == null) {
                throw new IllegalArgumentException("catalogueName must be non-null.");
            } else if (bVar != null) {
                if (d.containsKey(str.toLowerCase())) {
                    if (!bVar.getClass().equals(((b) d.get(str.toLowerCase())).getClass())) {
                        Logger logger = a;
                        logger.warning("Attempted overwrite of a catalogueName catalogue for name " + str);
                        throw new GeneralSecurityException("catalogue for name " + str + " has been already registered");
                    }
                }
                d.put(str.toLowerCase(), bVar);
            } else {
                throw new IllegalArgumentException("catalogue must be non-null.");
            }
        }
    }

    public static <P> b<P> a(String str) {
        if (str != null) {
            b<P> bVar = (b) d.get(str.toLowerCase());
            if (bVar != null) {
                return bVar;
            }
            String format = String.format("no catalogue found for %s. ", new Object[]{str});
            if (str.toLowerCase().startsWith("tinkaead")) {
                format = a.b(format, "Maybe call AeadConfig.register().");
            }
            if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                format = a.b(format, "Maybe call DeterministicAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                format = a.b(format, "Maybe call StreamingAeadConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                format = a.b(format, "Maybe call HybridConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkmac")) {
                format = a.b(format, "Maybe call MacConfig.register().");
            } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                format = a.b(format, "Maybe call SignatureConfig.register().");
            } else if (str.toLowerCase().startsWith("tink")) {
                format = a.b(format, "Maybe call TinkConfig.register().");
            }
            throw new GeneralSecurityException(format);
        }
        throw new IllegalArgumentException("catalogueName must be non-null.");
    }

    public static synchronized <P> void a(g<P> gVar) {
        synchronized (r.class) {
            a(gVar, true);
        }
    }

    public static synchronized <P> void a(g<P> gVar, boolean z) {
        synchronized (r.class) {
            if (gVar != null) {
                String a2 = gVar.a();
                if (f4369b.containsKey(a2)) {
                    g b2 = b(a2);
                    boolean booleanValue = ((Boolean) c.get(a2)).booleanValue();
                    if (gVar.getClass().equals(b2.getClass())) {
                        if (!booleanValue) {
                            if (!z) {
                            }
                        }
                    }
                    Logger logger = a;
                    logger.warning("Attempted overwrite of a registered key manager for key type " + a2);
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{a2, b2.getClass().getName(), gVar.getClass().getName()}));
                }
                f4369b.put(a2, gVar);
                c.put(a2, Boolean.valueOf(z));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <P> o a(String str, o oVar) {
        o b2;
        synchronized (r.class) {
            g b3 = b(str);
            if (((Boolean) c.get(str)).booleanValue()) {
                b2 = b3.b(oVar);
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + str);
            }
        }
        return b2;
    }

    public static <P> P a(String str, byte[] bArr) {
        return b(str).c(f.a(bArr));
    }
}
