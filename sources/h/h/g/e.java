package h.h.g;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import g.a.a.b.a;
import h.e.h;
import h.h.j.b;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: TypefaceCompatApi24Impl */
public class e extends i {

    /* renamed from: b  reason: collision with root package name */
    public static final Class<?> f1759b;
    public static final Constructor<?> c;
    public static final Method d;
    public static final Method e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, Integer.TYPE, List.class, Integer.TYPE, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method2 = null;
            method = null;
        }
        c = constructor;
        f1759b = cls;
        d = method;
        e = method2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x006a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x006b A[LOOP:0: B:8:0x0015->B:43:0x006b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Typeface a(android.content.Context r17, h.h.f.b.c r18, android.content.res.Resources r19, int r20) {
        /*
            r16 = this;
            r0 = 0
            r1 = 0
            java.lang.reflect.Constructor<?> r2 = c     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            java.lang.Object[] r3 = new java.lang.Object[r0]     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            java.lang.Object r2 = r2.newInstance(r3)     // Catch:{ IllegalAccessException | InstantiationException | InvocationTargetException -> 0x000b }
            goto L_0x000c
        L_0x000b:
            r2 = r1
        L_0x000c:
            if (r2 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r3 = r18
            h.h.f.b.d[] r3 = r3.a
            int r4 = r3.length
            r5 = 0
        L_0x0015:
            if (r5 >= r4) goto L_0x0073
            r6 = r3[r5]
            int r0 = r6.f1749f
            java.io.File r7 = g.a.a.b.a.a((android.content.Context) r17)
            r8 = r19
            if (r7 != 0) goto L_0x0024
            goto L_0x002d
        L_0x0024:
            boolean r0 = g.a.a.b.a.a((java.io.File) r7, (android.content.res.Resources) r8, (int) r0)     // Catch:{ all -> 0x006e }
            if (r0 != 0) goto L_0x002f
            r7.delete()
        L_0x002d:
            r0 = r1
            goto L_0x005b
        L_0x002f:
            java.io.FileInputStream r9 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0057 }
            r9.<init>(r7)     // Catch:{ IOException -> 0x0057 }
            java.nio.channels.FileChannel r10 = r9.getChannel()     // Catch:{ all -> 0x0048 }
            long r14 = r10.size()     // Catch:{ all -> 0x0048 }
            java.nio.channels.FileChannel$MapMode r11 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch:{ all -> 0x0048 }
            r12 = 0
            java.nio.MappedByteBuffer r0 = r10.map(r11, r12, r14)     // Catch:{ all -> 0x0048 }
            r9.close()     // Catch:{ IOException -> 0x0057 }
            goto L_0x0058
        L_0x0048:
            r0 = move-exception
            r10 = r0
            throw r10     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            r11 = r0
            r9.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0056
        L_0x0051:
            r0 = move-exception
            r9 = r0
            r10.addSuppressed(r9)     // Catch:{ IOException -> 0x0057 }
        L_0x0056:
            throw r11     // Catch:{ IOException -> 0x0057 }
        L_0x0057:
            r0 = r1
        L_0x0058:
            r7.delete()
        L_0x005b:
            if (r0 != 0) goto L_0x005e
            return r1
        L_0x005e:
            int r7 = r6.e
            int r9 = r6.f1748b
            boolean r6 = r6.c
            boolean r0 = a(r2, r0, r7, r9, r6)
            if (r0 != 0) goto L_0x006b
            return r1
        L_0x006b:
            int r5 = r5 + 1
            goto L_0x0015
        L_0x006e:
            r0 = move-exception
            r7.delete()
            throw r0
        L_0x0073:
            android.graphics.Typeface r0 = a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.h.g.e.a(android.content.Context, h.h.f.b.c, android.content.res.Resources, int):android.graphics.Typeface");
    }

    public Typeface a(Context context, CancellationSignal cancellationSignal, b.f[] fVarArr, int i2) {
        Object obj;
        try {
            obj = c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        h hVar = new h();
        for (b.f fVar : fVarArr) {
            Uri uri = fVar.a;
            ByteBuffer byteBuffer = (ByteBuffer) hVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = a.a(context, cancellationSignal, uri);
                hVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !a(obj, byteBuffer, fVar.f1784b, fVar.c, fVar.d)) {
                return null;
            }
        }
        Typeface a = a(obj);
        if (a == null) {
            return null;
        }
        return Typeface.create(a, i2);
    }

    public static boolean a(Object obj, ByteBuffer byteBuffer, int i2, int i3, boolean z) {
        try {
            return ((Boolean) d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i2), null, Integer.valueOf(i3), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface a(Object obj) {
        try {
            Object newInstance = Array.newInstance(f1759b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }
}
