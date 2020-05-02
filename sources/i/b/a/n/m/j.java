package i.b.a.n.m;

import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import h.h.l.c;
import i.b.a.n.g;
import i.b.a.n.i;
import i.b.a.n.o.h.e;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DecodePath */
public class j<DataType, ResourceType, Transcode> {
    public final Class<DataType> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends i<DataType, ResourceType>> f2614b;
    public final e<ResourceType, Transcode> c;
    public final c<List<Throwable>> d;
    public final String e;

    /* compiled from: DecodePath */
    public interface a<ResourceType> {
    }

    public j(Class<DataType> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<? extends i<DataType, ResourceType>> list, e<ResourceType, Transcode> eVar, c<List<Throwable>> cVar) {
        this.a = cls;
        this.f2614b = list;
        this.c = eVar;
        this.d = cVar;
        StringBuilder a2 = i.a.a.a.a.a("Failed DecodePath{");
        a2.append(cls.getSimpleName());
        a2.append("->");
        a2.append(cls2.getSimpleName());
        a2.append("->");
        a2.append(cls3.getSimpleName());
        a2.append("}");
        this.e = a2.toString();
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: i.b.a.n.l.e<DataType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: i.b.a.n.m.v<ResourceType>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: i.b.a.n.m.u<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: i.b.a.n.m.u<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: T} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: i.b.a.n.m.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v14, resolved type: i.b.a.n.m.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v4, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: java.lang.Class<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: i.b.a.n.m.v<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: i.b.a.n.m.u<T>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: i.b.a.n.m.u<Z>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: i.b.a.n.m.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: i.b.a.n.m.x} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public i.b.a.n.m.v<Transcode> a(i.b.a.n.l.e<DataType> r11, int r12, int r13, i.b.a.n.g r14, i.b.a.n.m.j.a<ResourceType> r15) {
        /*
            r10 = this;
            h.h.l.c<java.util.List<java.lang.Throwable>> r0 = r10.d
            java.lang.Object r0 = r0.a()
            java.lang.String r1 = "Argument must not be null"
            g.a.a.b.a.a(r0, (java.lang.String) r1)
            java.util.List r0 = (java.util.List) r0
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r0
            i.b.a.n.m.v r11 = r2.a(r3, (int) r4, (int) r5, (i.b.a.n.g) r6, (java.util.List<java.lang.Throwable>) r7)     // Catch:{ all -> 0x011c }
            h.h.l.c<java.util.List<java.lang.Throwable>> r12 = r10.d
            r12.a(r0)
            i.b.a.n.m.i$b r15 = (i.b.a.n.m.i.b) r15
            i.b.a.n.m.i r12 = i.b.a.n.m.i.this
            i.b.a.n.a r13 = r15.a
            r15 = 0
            if (r12 == 0) goto L_0x011b
            java.lang.Object r0 = r11.get()
            java.lang.Class r8 = r0.getClass()
            i.b.a.n.a r0 = i.b.a.n.a.RESOURCE_DISK_CACHE
            if (r13 == r0) goto L_0x0044
            i.b.a.n.m.h<R> r0 = r12.e
            i.b.a.n.k r0 = r0.b(r8)
            i.b.a.e r1 = r12.f2596l
            int r2 = r12.f2600p
            int r3 = r12.f2601q
            i.b.a.n.m.v r1 = r0.a(r1, r11, r2, r3)
            r7 = r0
            r0 = r1
            goto L_0x0046
        L_0x0044:
            r0 = r11
            r7 = r15
        L_0x0046:
            boolean r1 = r11.equals(r0)
            if (r1 != 0) goto L_0x004f
            r11.d()
        L_0x004f:
            i.b.a.n.m.h<R> r11 = r12.e
            i.b.a.e r11 = r11.c
            com.bumptech.glide.Registry r11 = r11.f2409b
            i.b.a.q.f r11 = r11.d
            java.lang.Class r1 = r0.c()
            i.b.a.n.j r11 = r11.a(r1)
            r1 = 0
            r2 = 1
            if (r11 == 0) goto L_0x0065
            r11 = 1
            goto L_0x0066
        L_0x0065:
            r11 = 0
        L_0x0066:
            if (r11 == 0) goto L_0x008b
            i.b.a.n.m.h<R> r11 = r12.e
            i.b.a.e r11 = r11.c
            com.bumptech.glide.Registry r11 = r11.f2409b
            i.b.a.q.f r11 = r11.d
            java.lang.Class r15 = r0.c()
            i.b.a.n.j r15 = r11.a(r15)
            if (r15 == 0) goto L_0x0081
            i.b.a.n.g r11 = r12.s
            i.b.a.n.c r11 = r15.a(r11)
            goto L_0x008d
        L_0x0081:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r11 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Class r12 = r0.c()
            r11.<init>(r12)
            throw r11
        L_0x008b:
            i.b.a.n.c r11 = i.b.a.n.c.NONE
        L_0x008d:
            i.b.a.n.m.h<R> r3 = r12.e
            i.b.a.n.e r4 = r12.B
            java.util.List r3 = r3.c()
            int r5 = r3.size()
            r6 = 0
        L_0x009a:
            if (r6 >= r5) goto L_0x00af
            java.lang.Object r9 = r3.get(r6)
            i.b.a.n.n.n$a r9 = (i.b.a.n.n.n.a) r9
            i.b.a.n.e r9 = r9.a
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x00ac
            r1 = 1
            goto L_0x00af
        L_0x00ac:
            int r6 = r6 + 1
            goto L_0x009a
        L_0x00af:
            r1 = r1 ^ r2
            i.b.a.n.m.k r3 = r12.r
            boolean r13 = r3.a(r1, r13, r11)
            if (r13 == 0) goto L_0x0114
            if (r15 == 0) goto L_0x0106
            int r13 = r11.ordinal()
            if (r13 == 0) goto L_0x00f0
            if (r13 != r2) goto L_0x00d9
            i.b.a.n.m.x r11 = new i.b.a.n.m.x
            i.b.a.n.m.h<R> r13 = r12.e
            i.b.a.e r13 = r13.c
            i.b.a.n.m.b0.b r2 = r13.a
            i.b.a.n.e r3 = r12.B
            i.b.a.n.e r4 = r12.f2597m
            int r5 = r12.f2600p
            int r6 = r12.f2601q
            i.b.a.n.g r9 = r12.s
            r1 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x00f9
        L_0x00d9:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "Unknown strategy: "
            r13.append(r14)
            r13.append(r11)
            java.lang.String r11 = r13.toString()
            r12.<init>(r11)
            throw r12
        L_0x00f0:
            i.b.a.n.m.e r11 = new i.b.a.n.m.e
            i.b.a.n.e r13 = r12.B
            i.b.a.n.e r1 = r12.f2597m
            r11.<init>(r13, r1)
        L_0x00f9:
            i.b.a.n.m.u r0 = i.b.a.n.m.u.a(r0)
            i.b.a.n.m.i$c<?> r12 = r12.f2594j
            r12.a = r11
            r12.f2603b = r15
            r12.c = r0
            goto L_0x0114
        L_0x0106:
            com.bumptech.glide.Registry$NoResultEncoderAvailableException r11 = new com.bumptech.glide.Registry$NoResultEncoderAvailableException
            java.lang.Object r12 = r0.get()
            java.lang.Class r12 = r12.getClass()
            r11.<init>(r12)
            throw r11
        L_0x0114:
            i.b.a.n.o.h.e<ResourceType, Transcode> r11 = r10.c
            i.b.a.n.m.v r11 = r11.a(r0, r14)
            return r11
        L_0x011b:
            throw r15
        L_0x011c:
            r11 = move-exception
            h.h.l.c<java.util.List<java.lang.Throwable>> r12 = r10.d
            r12.a(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.m.j.a(i.b.a.n.l.e, int, int, i.b.a.n.g, i.b.a.n.m.j$a):i.b.a.n.m.v");
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("DecodePath{ dataClass=");
        a2.append(this.a);
        a2.append(", decoders=");
        a2.append(this.f2614b);
        a2.append(", transcoder=");
        a2.append(this.c);
        a2.append('}');
        return a2.toString();
    }

    public final v<ResourceType> a(i.b.a.n.l.e<DataType> eVar, int i2, int i3, g gVar, List<Throwable> list) {
        int size = this.f2614b.size();
        v<ResourceType> vVar = null;
        for (int i4 = 0; i4 < size; i4++) {
            i iVar = (i) this.f2614b.get(i4);
            try {
                if (iVar.a(eVar.a(), gVar)) {
                    vVar = iVar.a(eVar.a(), i2, i3, gVar);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e2) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Log.v("DecodePath", "Failed to decode data for " + iVar, e2);
                }
                list.add(e2);
            }
            if (vVar != null) {
                break;
            }
        }
        if (vVar != null) {
            return vVar;
        }
        throw new GlideException(this.e, (List<Throwable>) new ArrayList(list));
    }
}
