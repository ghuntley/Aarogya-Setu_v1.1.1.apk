package com.google.gson.internal.bind;

import com.google.gson.Gson;
import i.c.e.h;
import i.c.e.i;
import i.c.e.n;
import i.c.e.o;
import i.c.e.q;
import i.c.e.r;
import i.c.e.v.c;

public final class TreeTypeAdapter<T> extends q<T> {
    public final o<T> a;

    /* renamed from: b  reason: collision with root package name */
    public final i<T> f743b;
    public final Gson c;
    public final i.c.e.u.a<T> d;
    public final r e;

    /* renamed from: f  reason: collision with root package name */
    public final TreeTypeAdapter<T>.b f744f = new b(this, (a) null);

    /* renamed from: g  reason: collision with root package name */
    public q<T> f745g;

    public static final class SingleTypeFactory implements r {
        public <T> q<T> a(Gson gson, i.c.e.u.a<T> aVar) {
            aVar.getRawType();
            throw null;
        }
    }

    public final class b implements n, h {
        public /* synthetic */ b(TreeTypeAdapter treeTypeAdapter, a aVar) {
        }
    }

    public TreeTypeAdapter(o<T> oVar, i<T> iVar, Gson gson, i.c.e.u.a<T> aVar, r rVar) {
        this.a = oVar;
        this.f743b = iVar;
        this.c = gson;
        this.d = aVar;
        this.e = rVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0027, code lost:
        r4 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0029, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002f, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0030, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0036, code lost:
        throw new com.google.gson.JsonIOException((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003d, code lost:
        throw new com.google.gson.JsonSyntaxException((java.lang.Throwable) r4);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029 A[ExcHandler: NumberFormatException (r4v8 'e' java.lang.NumberFormatException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0030 A[ExcHandler: IOException (r4v7 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[ExcHandler: MalformedJsonException (r4v6 'e' com.google.gson.stream.MalformedJsonException A[CUSTOM_DECLARE]), Splitter:B:7:0x001a] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public T a(i.c.e.v.a r4) {
        /*
            r3 = this;
            i.c.e.i<T> r0 = r3.f743b
            if (r0 != 0) goto L_0x001a
            i.c.e.q<T> r0 = r3.f745g
            if (r0 == 0) goto L_0x0009
            goto L_0x0015
        L_0x0009:
            com.google.gson.Gson r0 = r3.c
            i.c.e.r r1 = r3.e
            i.c.e.u.a<T> r2 = r3.d
            i.c.e.q r0 = r0.a((i.c.e.r) r1, r2)
            r3.f745g = r0
        L_0x0015:
            java.lang.Object r4 = r0.a(r4)
            return r4
        L_0x001a:
            r4.C()     // Catch:{ EOFException -> 0x003e, MalformedJsonException -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            r0 = 0
            i.c.e.q<i.c.e.j> r1 = com.google.gson.internal.bind.TypeAdapters.X     // Catch:{ EOFException -> 0x0027, MalformedJsonException -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            java.lang.Object r4 = r1.a(r4)     // Catch:{ EOFException -> 0x0027, MalformedJsonException -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            i.c.e.j r4 = (i.c.e.j) r4     // Catch:{ EOFException -> 0x0027, MalformedJsonException -> 0x0037, IOException -> 0x0030, NumberFormatException -> 0x0029 }
            goto L_0x0044
        L_0x0027:
            r4 = move-exception
            goto L_0x0040
        L_0x0029:
            r4 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0030:
            r4 = move-exception
            com.google.gson.JsonIOException r0 = new com.google.gson.JsonIOException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x0037:
            r4 = move-exception
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        L_0x003e:
            r4 = move-exception
            r0 = 1
        L_0x0040:
            if (r0 == 0) goto L_0x005c
            i.c.e.k r4 = i.c.e.k.a
        L_0x0044:
            r0 = 0
            if (r4 == 0) goto L_0x005b
            boolean r1 = r4 instanceof i.c.e.k
            if (r1 == 0) goto L_0x004c
            return r0
        L_0x004c:
            i.c.e.i<T> r0 = r3.f743b
            i.c.e.u.a<T> r1 = r3.d
            java.lang.reflect.Type r1 = r1.getType()
            com.google.gson.internal.bind.TreeTypeAdapter<T>$b r2 = r3.f744f
            java.lang.Object r4 = r0.a(r4, r1, r2)
            return r4
        L_0x005b:
            throw r0
        L_0x005c:
            com.google.gson.JsonSyntaxException r0 = new com.google.gson.JsonSyntaxException
            r0.<init>((java.lang.Throwable) r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TreeTypeAdapter.a(i.c.e.v.a):java.lang.Object");
    }

    public void a(c cVar, T t) {
        o<T> oVar = this.a;
        if (oVar == null) {
            q<T> qVar = this.f745g;
            if (qVar == null) {
                qVar = this.c.a(this.e, this.d);
                this.f745g = qVar;
            }
            qVar.a(cVar, t);
        } else if (t == null) {
            cVar.q();
        } else {
            TypeAdapters.X.a(cVar, oVar.a(t, this.d.getType(), this.f744f));
        }
    }
}
