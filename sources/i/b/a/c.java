package i.b.a;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.GeneratedAppGlideModule;
import com.bumptech.glide.GeneratedAppGlideModuleImpl;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import i.b.a.n.l.e;
import i.b.a.n.l.k;
import i.b.a.n.l.m;
import i.b.a.n.m.b0.b;
import i.b.a.n.m.b0.d;
import i.b.a.n.m.c0.i;
import i.b.a.n.m.c0.j;
import i.b.a.n.m.d0.a;
import i.b.a.n.n.a;
import i.b.a.n.n.b;
import i.b.a.n.n.d;
import i.b.a.n.n.e;
import i.b.a.n.n.f;
import i.b.a.n.n.k;
import i.b.a.n.n.s;
import i.b.a.n.n.t;
import i.b.a.n.n.u;
import i.b.a.n.n.v;
import i.b.a.n.n.w;
import i.b.a.n.n.x;
import i.b.a.n.n.y.a;
import i.b.a.n.n.y.b;
import i.b.a.n.n.y.c;
import i.b.a.n.n.y.d;
import i.b.a.n.n.y.e;
import i.b.a.n.n.y.f;
import i.b.a.n.o.c.a0;
import i.b.a.n.o.c.g;
import i.b.a.n.o.c.h;
import i.b.a.n.o.c.o;
import i.b.a.n.o.c.s;
import i.b.a.n.o.c.u;
import i.b.a.n.o.c.w;
import i.b.a.n.o.c.x;
import i.b.a.n.o.c.z;
import i.b.a.n.o.d.a;
import i.b.a.n.o.g.j;
import i.b.a.o.l;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: Glide */
public class c implements ComponentCallbacks2 {

    /* renamed from: m  reason: collision with root package name */
    public static volatile c f2388m;

    /* renamed from: n  reason: collision with root package name */
    public static volatile boolean f2389n;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final i f2390f;

    /* renamed from: g  reason: collision with root package name */
    public final e f2391g;

    /* renamed from: h  reason: collision with root package name */
    public final Registry f2392h;

    /* renamed from: i  reason: collision with root package name */
    public final b f2393i;

    /* renamed from: j  reason: collision with root package name */
    public final l f2394j;

    /* renamed from: k  reason: collision with root package name */
    public final i.b.a.o.d f2395k;

    /* renamed from: l  reason: collision with root package name */
    public final List<j> f2396l = new ArrayList();

    /* compiled from: Glide */
    public interface a {
    }

    public c(Context context, i.b.a.n.m.l lVar, i iVar, d dVar, b bVar, l lVar2, i.b.a.o.d dVar2, int i2, a aVar, Map<Class<?>, k<?, ?>> map, List<i.b.a.r.d<Object>> list, boolean z, boolean z2) {
        i.b.a.n.i iVar2;
        i.b.a.n.i iVar3;
        Context context2 = context;
        d dVar3 = dVar;
        b bVar2 = bVar;
        Class<i.b.a.m.a> cls = i.b.a.m.a.class;
        Class<String> cls2 = String.class;
        Class<Integer> cls3 = Integer.class;
        Class<byte[]> cls4 = byte[].class;
        f fVar = f.NORMAL;
        this.e = dVar3;
        this.f2393i = bVar2;
        this.f2390f = iVar;
        this.f2394j = lVar2;
        this.f2395k = dVar2;
        Resources resources = context.getResources();
        Registry registry = new Registry();
        this.f2392h = registry;
        registry.f445g.a(new DefaultImageHeaderParser());
        if (Build.VERSION.SDK_INT >= 27) {
            Registry registry2 = this.f2392h;
            registry2.f445g.a(new o());
        }
        List<ImageHeaderParser> a2 = this.f2392h.a();
        i.b.a.n.o.g.a aVar2 = new i.b.a.n.o.g.a(context2, a2, dVar3, bVar2);
        a0 a0Var = new a0(dVar3, new a0.g());
        i.b.a.n.o.c.l lVar3 = new i.b.a.n.o.c.l(this.f2392h.a(), resources.getDisplayMetrics(), dVar3, bVar2);
        if (!z2 || Build.VERSION.SDK_INT < 28) {
            iVar2 = new g(lVar3);
            iVar3 = new x(lVar3, bVar2);
        } else {
            iVar3 = new s();
            iVar2 = new h();
        }
        i.b.a.n.o.e.d dVar4 = new i.b.a.n.o.e.d(context2);
        Class<byte[]> cls5 = cls4;
        s.c cVar = new s.c(resources);
        s.d dVar5 = new s.d(resources);
        Class<String> cls6 = cls2;
        s.b bVar3 = new s.b(resources);
        s.d dVar6 = dVar5;
        s.a aVar3 = new s.a(resources);
        i.b.a.n.o.c.c cVar2 = new i.b.a.n.o.c.c(bVar2);
        Class<Integer> cls7 = cls3;
        i.b.a.n.o.h.a aVar4 = new i.b.a.n.o.h.a();
        i.b.a.n.o.h.d dVar7 = new i.b.a.n.o.h.d();
        ContentResolver contentResolver = context.getContentResolver();
        Registry registry3 = this.f2392h;
        s.b bVar4 = bVar3;
        s.c cVar3 = cVar;
        i.b.a.n.n.c cVar4 = new i.b.a.n.n.c();
        i.b.a.n.o.e.d dVar8 = dVar4;
        registry3.f443b.a(ByteBuffer.class, cVar4);
        t tVar = new t(bVar2);
        registry3.f443b.a(InputStream.class, tVar);
        registry3.c.a("Bitmap", iVar2, ByteBuffer.class, Bitmap.class);
        registry3.c.a("Bitmap", iVar3, InputStream.class, Bitmap.class);
        Registry registry4 = this.f2392h;
        u uVar = new u(lVar3);
        registry4.c.a("Bitmap", uVar, ParcelFileDescriptor.class, Bitmap.class);
        Registry registry5 = this.f2392h;
        registry5.c.a("Bitmap", a0Var, ParcelFileDescriptor.class, Bitmap.class);
        a0 a0Var2 = new a0(dVar3, new a0.c((a0.a) null));
        registry5.c.a("Bitmap", a0Var2, AssetFileDescriptor.class, Bitmap.class);
        v.a<?> aVar5 = v.a.a;
        registry5.a.a(Bitmap.class, Bitmap.class, aVar5);
        z zVar = new z();
        registry5.c.a("Bitmap", zVar, Bitmap.class, Bitmap.class);
        registry5.d.a(Bitmap.class, cVar2);
        i.b.a.n.o.c.a aVar6 = new i.b.a.n.o.c.a(resources, iVar2);
        registry5.c.a("BitmapDrawable", aVar6, ByteBuffer.class, BitmapDrawable.class);
        i.b.a.n.o.c.a aVar7 = new i.b.a.n.o.c.a(resources, iVar3);
        registry5.c.a("BitmapDrawable", aVar7, InputStream.class, BitmapDrawable.class);
        i.b.a.n.o.c.a aVar8 = new i.b.a.n.o.c.a(resources, a0Var);
        registry5.c.a("BitmapDrawable", aVar8, ParcelFileDescriptor.class, BitmapDrawable.class);
        i.b.a.n.o.c.b bVar5 = new i.b.a.n.o.c.b(dVar3, cVar2);
        registry5.d.a(BitmapDrawable.class, bVar5);
        j jVar = new j(a2, aVar2, bVar2);
        registry5.c.a("Gif", jVar, InputStream.class, i.b.a.n.o.g.c.class);
        registry5.c.a("Gif", aVar2, ByteBuffer.class, i.b.a.n.o.g.c.class);
        i.b.a.n.o.g.d dVar9 = new i.b.a.n.o.g.d();
        registry5.d.a(i.b.a.n.o.g.c.class, dVar9);
        Class<i.b.a.m.a> cls8 = cls;
        registry5.a.a(cls8, cls8, v.a.a);
        i.b.a.n.o.g.h hVar = new i.b.a.n.o.g.h(dVar3);
        registry5.c.a("Bitmap", hVar, cls8, Bitmap.class);
        i.b.a.n.o.e.d dVar10 = dVar8;
        registry5.c.a("legacy_append", dVar10, Uri.class, Drawable.class);
        w wVar = new w(dVar10, dVar3);
        registry5.c.a("legacy_append", wVar, Uri.class, Bitmap.class);
        registry5.e.a((e.a<?>) new a.C0095a());
        d.b bVar6 = new d.b();
        registry5.a.a(File.class, ByteBuffer.class, bVar6);
        f.e eVar = new f.e();
        registry5.a.a(File.class, InputStream.class, eVar);
        i.b.a.n.o.f.a aVar9 = new i.b.a.n.o.f.a();
        registry5.c.a("legacy_append", aVar9, File.class, File.class);
        f.b bVar7 = new f.b();
        registry5.a.a(File.class, ParcelFileDescriptor.class, bVar7);
        v.a<?> aVar10 = v.a.a;
        registry5.a.a(File.class, File.class, aVar10);
        registry5.e.a((e.a<?>) new k.a(bVar2));
        Registry registry6 = this.f2392h;
        registry6.e.a((e.a<?>) new m.a());
        Registry registry7 = this.f2392h;
        s.c cVar5 = cVar3;
        registry7.a.a(Integer.TYPE, InputStream.class, cVar5);
        s.b bVar8 = bVar4;
        registry7.a.a(Integer.TYPE, ParcelFileDescriptor.class, bVar8);
        Class<Integer> cls9 = cls7;
        registry7.a.a(cls9, InputStream.class, cVar5);
        registry7.a.a(cls9, ParcelFileDescriptor.class, bVar8);
        s.d dVar11 = dVar6;
        registry7.a.a(cls9, Uri.class, dVar11);
        s.a aVar11 = aVar3;
        registry7.a.a(Integer.TYPE, AssetFileDescriptor.class, aVar11);
        registry7.a.a(cls9, AssetFileDescriptor.class, aVar11);
        registry7.a.a(Integer.TYPE, Uri.class, dVar11);
        e.c cVar6 = new e.c();
        Class<String> cls10 = cls6;
        registry7.a.a(cls10, InputStream.class, cVar6);
        e.c cVar7 = new e.c();
        registry7.a.a(Uri.class, InputStream.class, cVar7);
        u.c cVar8 = new u.c();
        registry7.a.a(cls10, InputStream.class, cVar8);
        u.b bVar9 = new u.b();
        registry7.a.a(cls10, ParcelFileDescriptor.class, bVar9);
        u.a aVar12 = new u.a();
        registry7.a.a(cls10, AssetFileDescriptor.class, aVar12);
        b.a aVar13 = new b.a();
        registry7.a.a(Uri.class, InputStream.class, aVar13);
        a.c cVar9 = new a.c(context.getAssets());
        registry7.a.a(Uri.class, InputStream.class, cVar9);
        a.b bVar10 = new a.b(context.getAssets());
        registry7.a.a(Uri.class, ParcelFileDescriptor.class, bVar10);
        Context context3 = context;
        c.a aVar14 = new c.a(context3);
        registry7.a.a(Uri.class, InputStream.class, aVar14);
        d.a aVar15 = new d.a(context3);
        registry7.a.a(Uri.class, InputStream.class, aVar15);
        if (Build.VERSION.SDK_INT >= 29) {
            Registry registry8 = this.f2392h;
            e.c cVar10 = new e.c(context3);
            registry8.a.a(Uri.class, InputStream.class, cVar10);
            Registry registry9 = this.f2392h;
            e.b bVar11 = new e.b(context3);
            registry9.a.a(Uri.class, ParcelFileDescriptor.class, bVar11);
        }
        Registry registry10 = this.f2392h;
        ContentResolver contentResolver2 = contentResolver;
        w.d dVar12 = new w.d(contentResolver2);
        registry10.a.a(Uri.class, InputStream.class, dVar12);
        w.b bVar12 = new w.b(contentResolver2);
        registry10.a.a(Uri.class, ParcelFileDescriptor.class, bVar12);
        w.a aVar16 = new w.a(contentResolver2);
        registry10.a.a(Uri.class, AssetFileDescriptor.class, aVar16);
        x.a aVar17 = new x.a();
        registry10.a.a(Uri.class, InputStream.class, aVar17);
        f.a aVar18 = new f.a();
        registry10.a.a(URL.class, InputStream.class, aVar18);
        k.a aVar19 = new k.a(context3);
        registry10.a.a(Uri.class, File.class, aVar19);
        a.C0092a aVar20 = new a.C0092a();
        registry10.a.a(i.b.a.n.n.g.class, InputStream.class, aVar20);
        b.a aVar21 = new b.a();
        Class<byte[]> cls11 = cls5;
        registry10.a.a(cls11, ByteBuffer.class, aVar21);
        b.d dVar13 = new b.d();
        registry10.a.a(cls11, InputStream.class, dVar13);
        v.a<?> aVar22 = v.a.a;
        registry10.a.a(Uri.class, Uri.class, aVar22);
        v.a<?> aVar23 = v.a.a;
        registry10.a.a(Drawable.class, Drawable.class, aVar23);
        i.b.a.n.o.e.e eVar2 = new i.b.a.n.o.e.e();
        registry10.c.a("legacy_append", eVar2, Drawable.class, Drawable.class);
        i.b.a.n.o.h.b bVar13 = new i.b.a.n.o.h.b(resources);
        registry10.f444f.a(Bitmap.class, BitmapDrawable.class, bVar13);
        i.b.a.n.o.h.a aVar24 = aVar4;
        registry10.f444f.a(Bitmap.class, cls11, aVar24);
        i.b.a.n.o.h.d dVar14 = dVar7;
        i.b.a.n.o.h.c cVar11 = new i.b.a.n.o.h.c(dVar3, aVar24, dVar14);
        registry10.f444f.a(Drawable.class, cls11, cVar11);
        registry10.f444f.a(i.b.a.n.o.g.c.class, cls11, dVar14);
        if (Build.VERSION.SDK_INT >= 23) {
            a0 a0Var3 = new a0(dVar3, new a0.d());
            this.f2392h.c.a("legacy_append", a0Var3, ByteBuffer.class, Bitmap.class);
            Registry registry11 = this.f2392h;
            i.b.a.n.o.c.a aVar25 = new i.b.a.n.o.c.a(resources, a0Var3);
            registry11.c.a("legacy_append", aVar25, ByteBuffer.class, BitmapDrawable.class);
        }
        Context context4 = context;
        i.b.a.n.m.b0.b bVar14 = bVar;
        this.f2391g = new e(context4, bVar14, this.f2392h, new i.b.a.r.h.f(), aVar, map, list, lVar, z, i2);
    }

    public static c a(Context context) {
        if (f2388m == null) {
            Context applicationContext = context.getApplicationContext();
            GeneratedAppGlideModule generatedAppGlideModule = null;
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{applicationContext.getApplicationContext()});
            } catch (ClassNotFoundException unused) {
                if (Log.isLoggable("Glide", 5)) {
                    Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                }
            } catch (InstantiationException e2) {
                a((Exception) e2);
                throw null;
            } catch (IllegalAccessException e3) {
                a((Exception) e3);
                throw null;
            } catch (NoSuchMethodException e4) {
                a((Exception) e4);
                throw null;
            } catch (InvocationTargetException e5) {
                a((Exception) e5);
                throw null;
            }
            synchronized (c.class) {
                if (f2388m == null) {
                    a(context, generatedAppGlideModule);
                }
            }
        }
        return f2388m;
    }

    public void b(j jVar) {
        synchronized (this.f2396l) {
            if (this.f2396l.contains(jVar)) {
                this.f2396l.remove(jVar);
            } else {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        i.b.a.t.j.a();
        ((i.b.a.t.g) this.f2390f).a(0);
        this.e.a();
        this.f2393i.a();
    }

    public void onTrimMemory(int i2) {
        i.b.a.t.j.a();
        for (j jVar : this.f2396l) {
            if (jVar == null) {
                throw null;
            }
        }
        i.b.a.n.m.c0.h hVar = (i.b.a.n.m.c0.h) this.f2390f;
        if (hVar != null) {
            if (i2 >= 40) {
                hVar.a(0);
            } else if (i2 >= 20 || i2 == 15) {
                hVar.a(hVar.a() / 2);
            }
            this.e.a(i2);
            this.f2393i.a(i2);
            return;
        }
        throw null;
    }

    public static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (!f2389n) {
            f2389n = true;
            d dVar = new d();
            Context applicationContext = context.getApplicationContext();
            Collections.emptyList();
            if (generatedAppGlideModule == null || ((GeneratedAppGlideModuleImpl) generatedAppGlideModule).a != null) {
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Loading Glide modules");
                }
                ArrayList arrayList = new ArrayList();
                try {
                    ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
                    if (applicationInfo.metaData != null) {
                        if (Log.isLoggable("ManifestParser", 2)) {
                            Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                        }
                        for (String str : applicationInfo.metaData.keySet()) {
                            if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                                arrayList.add(i.b.a.p.e.a(str));
                                if (Log.isLoggable("ManifestParser", 3)) {
                                    Log.d("ManifestParser", "Loaded Glide module: " + str);
                                }
                            }
                        }
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Finished loading Glide modules");
                        }
                    } else if (Log.isLoggable("ManifestParser", 3)) {
                        Log.d("ManifestParser", "Got null app info metadata");
                    }
                    if (generatedAppGlideModule != null && !Collections.emptySet().isEmpty()) {
                        Set emptySet = Collections.emptySet();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            i.b.a.p.c cVar = (i.b.a.p.c) it.next();
                            if (emptySet.contains(cVar.getClass())) {
                                if (Log.isLoggable("Glide", 3)) {
                                    Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + cVar);
                                }
                                it.remove();
                            }
                        }
                    }
                    if (Log.isLoggable("Glide", 3)) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            StringBuilder a2 = i.a.a.a.a.a("Discovered GlideModule from manifest: ");
                            a2.append(((i.b.a.p.c) it2.next()).getClass());
                            Log.d("Glide", a2.toString());
                        }
                    }
                    dVar.f2405m = generatedAppGlideModule != null ? new a() : null;
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ((i.b.a.p.c) it3.next()).a(applicationContext, dVar);
                    }
                    if (generatedAppGlideModule == null || ((GeneratedAppGlideModuleImpl) generatedAppGlideModule).a != null) {
                        if (dVar.f2398f == null) {
                            dVar.f2398f = i.b.a.n.m.d0.a.c();
                        }
                        if (dVar.f2399g == null) {
                            dVar.f2399g = i.b.a.n.m.d0.a.b();
                        }
                        if (dVar.f2406n == null) {
                            int i2 = i.b.a.n.m.d0.a.a() >= 4 ? 2 : 1;
                            a.b bVar = a.b.f2574b;
                            if (!TextUtils.isEmpty("animation")) {
                                dVar.f2406n = new i.b.a.n.m.d0.a(new ThreadPoolExecutor(i2, i2, 0, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new a.C0084a("animation", bVar, true)));
                            } else {
                                throw new IllegalArgumentException(i.a.a.a.a.b("Name must be non-null and non-empty, but given: ", "animation"));
                            }
                        }
                        if (dVar.f2401i == null) {
                            dVar.f2401i = new i.b.a.n.m.c0.j(new j.a(applicationContext));
                        }
                        if (dVar.f2402j == null) {
                            dVar.f2402j = new i.b.a.o.f();
                        }
                        if (dVar.c == null) {
                            int i3 = dVar.f2401i.a;
                            if (i3 > 0) {
                                dVar.c = new i.b.a.n.m.b0.j((long) i3);
                            } else {
                                dVar.c = new i.b.a.n.m.b0.e();
                            }
                        }
                        if (dVar.d == null) {
                            dVar.d = new i.b.a.n.m.b0.i(dVar.f2401i.d);
                        }
                        if (dVar.e == null) {
                            dVar.e = new i.b.a.n.m.c0.h((long) dVar.f2401i.f2555b);
                        }
                        if (dVar.f2400h == null) {
                            dVar.f2400h = new i.b.a.n.m.c0.g(applicationContext);
                        }
                        if (dVar.f2397b == null) {
                            dVar.f2397b = new i.b.a.n.m.l(dVar.e, dVar.f2400h, dVar.f2399g, dVar.f2398f, new i.b.a.n.m.d0.a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, i.b.a.n.m.d0.a.f2571f, TimeUnit.MILLISECONDS, new SynchronousQueue(), new a.C0084a("source-unlimited", a.b.f2574b, false))), dVar.f2406n, false);
                        }
                        List<i.b.a.r.d<Object>> list = dVar.f2407o;
                        if (list == null) {
                            dVar.f2407o = Collections.emptyList();
                        } else {
                            dVar.f2407o = Collections.unmodifiableList(list);
                        }
                        l lVar = new l(dVar.f2405m);
                        i.b.a.n.m.l lVar2 = dVar.f2397b;
                        i iVar = dVar.e;
                        i.b.a.n.m.b0.d dVar2 = dVar.c;
                        i.b.a.n.m.b0.b bVar2 = dVar.d;
                        i.b.a.o.d dVar3 = dVar.f2402j;
                        int i4 = dVar.f2403k;
                        a aVar = dVar.f2404l;
                        Map<Class<?>, k<?, ?>> map = dVar.a;
                        List<i.b.a.r.d<Object>> list2 = dVar.f2407o;
                        Context context2 = applicationContext;
                        c cVar2 = new c(applicationContext, lVar2, iVar, dVar2, bVar2, lVar, dVar3, i4, aVar, map, list2, false, false);
                        Iterator it4 = arrayList.iterator();
                        while (it4.hasNext()) {
                            i.b.a.p.c cVar3 = (i.b.a.p.c) it4.next();
                            try {
                                cVar3.a(context2, cVar2, cVar2.f2392h);
                            } catch (AbstractMethodError e2) {
                                StringBuilder a3 = i.a.a.a.a.a("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ");
                                a3.append(cVar3.getClass().getName());
                                throw new IllegalStateException(a3.toString(), e2);
                            }
                        }
                        if (generatedAppGlideModule == null || ((GeneratedAppGlideModuleImpl) generatedAppGlideModule).a != null) {
                            context2.registerComponentCallbacks(cVar2);
                            f2388m = cVar2;
                            f2389n = false;
                            return;
                        }
                        throw null;
                    }
                    throw null;
                } catch (PackageManager.NameNotFoundException e3) {
                    throw new RuntimeException("Unable to find metadata to parse GlideModules", e3);
                }
            } else {
                throw null;
            }
        } else {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
    }

    public static void a(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003f, code lost:
        r3 = r4.K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i.b.a.j a(androidx.fragment.app.Fragment r4) {
        /*
            android.content.Context r0 = r4.k()
            java.lang.String r1 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            g.a.a.b.a.a(r0, (java.lang.String) r1)
            i.b.a.c r0 = a((android.content.Context) r0)
            i.b.a.o.l r0 = r0.f2394j
            if (r0 == 0) goto L_0x0059
            android.content.Context r1 = r4.k()
            java.lang.String r2 = "You cannot start a load on a fragment before it is attached or after it is destroyed"
            g.a.a.b.a.a(r1, (java.lang.String) r2)
            boolean r1 = i.b.a.t.j.b()
            if (r1 == 0) goto L_0x002d
            android.content.Context r4 = r4.k()
            android.content.Context r4 = r4.getApplicationContext()
            i.b.a.j r4 = r0.a(r4)
            goto L_0x0058
        L_0x002d:
            h.l.d.r r1 = r4.i()
            android.content.Context r2 = r4.k()
            boolean r3 = r4.t()
            if (r3 == 0) goto L_0x0053
            boolean r3 = r4.C
            if (r3 != 0) goto L_0x0053
            android.view.View r3 = r4.K
            if (r3 == 0) goto L_0x0053
            android.os.IBinder r3 = r3.getWindowToken()
            if (r3 == 0) goto L_0x0053
            android.view.View r3 = r4.K
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0053
            r3 = 1
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            i.b.a.j r4 = r0.a(r2, r1, r4, r3)
        L_0x0058:
            return r4
        L_0x0059:
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i.b.a.c.a(androidx.fragment.app.Fragment):i.b.a.j");
    }

    public boolean a(i.b.a.r.h.h<?> hVar) {
        synchronized (this.f2396l) {
            for (j b2 : this.f2396l) {
                if (b2.b(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void a(j jVar) {
        synchronized (this.f2396l) {
            if (!this.f2396l.contains(jVar)) {
                this.f2396l.add(jVar);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }
}
