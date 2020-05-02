package i.b.a.n.m.b0;

import android.graphics.Bitmap;
import android.os.Build;
import i.b.a.t.j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* compiled from: SizeConfigStrategy */
public class m implements k {
    public static final Bitmap.Config[] d;
    public static final Bitmap.Config[] e;

    /* renamed from: f  reason: collision with root package name */
    public static final Bitmap.Config[] f2545f = {Bitmap.Config.RGB_565};

    /* renamed from: g  reason: collision with root package name */
    public static final Bitmap.Config[] f2546g = {Bitmap.Config.ARGB_4444};

    /* renamed from: h  reason: collision with root package name */
    public static final Bitmap.Config[] f2547h = {Bitmap.Config.ALPHA_8};
    public final c a = new c();

    /* renamed from: b  reason: collision with root package name */
    public final g<b, Bitmap> f2548b = new g<>();
    public final Map<Bitmap.Config, NavigableMap<Integer, Integer>> c = new HashMap();

    /* compiled from: SizeConfigStrategy */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i.b.a.n.m.b0.m.a.<clinit>():void");
        }
    }

    /* compiled from: SizeConfigStrategy */
    public static final class b implements l {
        public final c a;

        /* renamed from: b  reason: collision with root package name */
        public int f2549b;
        public Bitmap.Config c;

        public b(c cVar) {
            this.a = cVar;
        }

        public void a() {
            this.a.a(this);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f2549b != bVar.f2549b || !j.b(this.c, bVar.c)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i2 = this.f2549b * 31;
            Bitmap.Config config = this.c;
            return i2 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return m.a(this.f2549b, this.c);
        }
    }

    static {
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            configArr[configArr.length - 1] = Bitmap.Config.RGBA_F16;
        }
        d = configArr;
        e = configArr;
    }

    public void a(Bitmap bitmap) {
        b a2 = this.a.a(j.a(bitmap), bitmap.getConfig());
        this.f2548b.a(a2, bitmap);
        NavigableMap<Integer, Integer> a3 = a(bitmap.getConfig());
        Integer num = (Integer) a3.get(Integer.valueOf(a2.f2549b));
        Integer valueOf = Integer.valueOf(a2.f2549b);
        int i2 = 1;
        if (num != null) {
            i2 = 1 + num.intValue();
        }
        a3.put(valueOf, Integer.valueOf(i2));
    }

    public String b(int i2, int i3, Bitmap.Config config) {
        return a(j.a(i2, i3, config), config);
    }

    public String c(Bitmap bitmap) {
        return a(j.a(bitmap), bitmap.getConfig());
    }

    public String toString() {
        StringBuilder a2 = i.a.a.a.a.a("SizeConfigStrategy{groupedMap=");
        a2.append(this.f2548b);
        a2.append(", sortedSizes=(");
        for (Map.Entry next : this.c.entrySet()) {
            a2.append(next.getKey());
            a2.append('[');
            a2.append(next.getValue());
            a2.append("], ");
        }
        if (!this.c.isEmpty()) {
            a2.replace(a2.length() - 2, a2.length(), "");
        }
        a2.append(")}");
        return a2.toString();
    }

    /* compiled from: SizeConfigStrategy */
    public static class c extends c<b> {
        public b a(int i2, Bitmap.Config config) {
            b bVar = (b) b();
            bVar.f2549b = i2;
            bVar.c = config;
            return bVar;
        }

        public l a() {
            return new b(this);
        }
    }

    public int b(Bitmap bitmap) {
        return j.a(bitmap);
    }

    public Bitmap a(int i2, int i3, Bitmap.Config config) {
        Bitmap.Config[] configArr;
        int a2 = j.a(i2, i3, config);
        b bVar = (b) this.a.b();
        bVar.f2549b = a2;
        bVar.c = config;
        int i4 = 0;
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(config)) {
            int i5 = a.a[config.ordinal()];
            if (i5 == 1) {
                configArr = d;
            } else if (i5 == 2) {
                configArr = f2545f;
            } else if (i5 != 3) {
                configArr = i5 != 4 ? new Bitmap.Config[]{config} : f2547h;
            } else {
                configArr = f2546g;
            }
        } else {
            configArr = e;
        }
        int length = configArr.length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            Bitmap.Config config2 = configArr[i4];
            Integer ceilingKey = a(config2).ceilingKey(Integer.valueOf(a2));
            if (ceilingKey == null || ceilingKey.intValue() > a2 * 8) {
                i4++;
            } else if (ceilingKey.intValue() != a2 || (config2 != null ? !config2.equals(config) : config != null)) {
                this.a.a(bVar);
                bVar = this.a.a(ceilingKey.intValue(), config2);
            }
        }
        Bitmap a3 = this.f2548b.a(bVar);
        if (a3 != null) {
            a(Integer.valueOf(bVar.f2549b), a3);
            a3.reconfigure(i2, i3, config);
        }
        return a3;
    }

    public Bitmap a() {
        Bitmap a2 = this.f2548b.a();
        if (a2 != null) {
            a(Integer.valueOf(j.a(a2)), a2);
        }
        return a2;
    }

    public final void a(Integer num, Bitmap bitmap) {
        NavigableMap<Integer, Integer> a2 = a(bitmap.getConfig());
        Integer num2 = (Integer) a2.get(num);
        if (num2 == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + c(bitmap) + ", this: " + this);
        } else if (num2.intValue() == 1) {
            a2.remove(num);
        } else {
            a2.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    public final NavigableMap<Integer, Integer> a(Bitmap.Config config) {
        NavigableMap<Integer, Integer> navigableMap = this.c.get(config);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.c.put(config, treeMap);
        return treeMap;
    }

    public static String a(int i2, Bitmap.Config config) {
        return "[" + i2 + "](" + config + ")";
    }
}
