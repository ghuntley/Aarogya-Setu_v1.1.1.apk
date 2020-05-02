package i.b.a.n.m.b0;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: LruBitmapPool */
public class j implements d {

    /* renamed from: j  reason: collision with root package name */
    public static final Bitmap.Config f2539j = Bitmap.Config.ARGB_8888;
    public final k a;

    /* renamed from: b  reason: collision with root package name */
    public final Set<Bitmap.Config> f2540b;
    public final a c;
    public long d;
    public long e;

    /* renamed from: f  reason: collision with root package name */
    public int f2541f;

    /* renamed from: g  reason: collision with root package name */
    public int f2542g;

    /* renamed from: h  reason: collision with root package name */
    public int f2543h;

    /* renamed from: i  reason: collision with root package name */
    public int f2544i;

    /* compiled from: LruBitmapPool */
    public interface a {
    }

    /* compiled from: LruBitmapPool */
    public static final class b implements a {
    }

    public j(long j2) {
        m mVar = new m();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        hashSet.add((Object) null);
        if (Build.VERSION.SDK_INT >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        Set<Bitmap.Config> unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.d = j2;
        this.a = mVar;
        this.f2540b = unmodifiableSet;
        this.c = new b();
    }

    public synchronized void a(Bitmap bitmap) {
        if (bitmap != null) {
            try {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable() && ((long) this.a.b(bitmap)) <= this.d) {
                        if (this.f2540b.contains(bitmap.getConfig())) {
                            int b2 = this.a.b(bitmap);
                            this.a.a(bitmap);
                            if (((b) this.c) != null) {
                                this.f2543h++;
                                this.e += (long) b2;
                                if (Log.isLoggable("LruBitmapPool", 2)) {
                                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.a.c(bitmap));
                                }
                                b();
                                a(this.d);
                                return;
                            }
                            throw null;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.a.c(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f2540b.contains(bitmap.getConfig()));
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            } catch (Throwable th) {
                throw th;
            }
        } else {
            throw new NullPointerException("Bitmap must not be null");
        }
    }

    public Bitmap b(int i2, int i3, Bitmap.Config config) {
        Bitmap c2 = c(i2, i3, config);
        if (c2 != null) {
            return c2;
        }
        if (config == null) {
            config = f2539j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    public final synchronized Bitmap c(int i2, int i3, Bitmap.Config config) {
        Bitmap a2;
        if (Build.VERSION.SDK_INT >= 26) {
            if (config == Bitmap.Config.HARDWARE) {
                throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
            }
        }
        a2 = this.a.a(i2, i3, config != null ? config : f2539j);
        if (a2 == null) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "Missing bitmap=" + this.a.b(i2, i3, config));
            }
            this.f2542g++;
        } else {
            this.f2541f++;
            this.e -= (long) this.a.b(a2);
            if (((b) this.c) != null) {
                a2.setHasAlpha(true);
                a2.setPremultiplied(true);
            } else {
                throw null;
            }
        }
        if (Log.isLoggable("LruBitmapPool", 2)) {
            Log.v("LruBitmapPool", "Get bitmap=" + this.a.b(i2, i3, config));
        }
        b();
        return a2;
    }

    public final void b() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            c();
        }
    }

    public final void c() {
        StringBuilder a2 = i.a.a.a.a.a("Hits=");
        a2.append(this.f2541f);
        a2.append(", misses=");
        a2.append(this.f2542g);
        a2.append(", puts=");
        a2.append(this.f2543h);
        a2.append(", evictions=");
        a2.append(this.f2544i);
        a2.append(", currentSize=");
        a2.append(this.e);
        a2.append(", maxSize=");
        a2.append(this.d);
        a2.append("\nStrategy=");
        a2.append(this.a);
        Log.v("LruBitmapPool", a2.toString());
    }

    public Bitmap a(int i2, int i3, Bitmap.Config config) {
        Bitmap c2 = c(i2, i3, config);
        if (c2 != null) {
            c2.eraseColor(0);
            return c2;
        }
        if (config == null) {
            config = f2539j;
        }
        return Bitmap.createBitmap(i2, i3, config);
    }

    public void a() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        a(0);
    }

    @SuppressLint({"InlinedApi"})
    public void a(int i2) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i2);
        }
        if (i2 >= 40 || (Build.VERSION.SDK_INT >= 23 && i2 >= 20)) {
            if (Log.isLoggable("LruBitmapPool", 3)) {
                Log.d("LruBitmapPool", "clearMemory");
            }
            a(0);
        } else if (i2 >= 20 || i2 == 15) {
            a(this.d / 2);
        }
    }

    public final synchronized void a(long j2) {
        while (this.e > j2) {
            Bitmap a2 = this.a.a();
            if (a2 == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Log.w("LruBitmapPool", "Size mismatch, resetting");
                    c();
                }
                this.e = 0;
                return;
            } else if (((b) this.c) != null) {
                this.e -= (long) this.a.b(a2);
                this.f2544i++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.a.c(a2));
                }
                b();
                a2.recycle();
            } else {
                throw null;
            }
        }
    }
}
