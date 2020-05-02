package h.s;

import h.v.a.d;
import h.v.a.e;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* compiled from: RoomSQLiteQuery */
public class j implements e, d {

    /* renamed from: m  reason: collision with root package name */
    public static final TreeMap<Integer, j> f2201m = new TreeMap<>();
    public volatile String e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f2202f;

    /* renamed from: g  reason: collision with root package name */
    public final double[] f2203g;

    /* renamed from: h  reason: collision with root package name */
    public final String[] f2204h;

    /* renamed from: i  reason: collision with root package name */
    public final byte[][] f2205i;

    /* renamed from: j  reason: collision with root package name */
    public final int[] f2206j;

    /* renamed from: k  reason: collision with root package name */
    public final int f2207k;

    /* renamed from: l  reason: collision with root package name */
    public int f2208l;

    public j(int i2) {
        this.f2207k = i2;
        int i3 = i2 + 1;
        this.f2206j = new int[i3];
        this.f2202f = new long[i3];
        this.f2203g = new double[i3];
        this.f2204h = new String[i3];
        this.f2205i = new byte[i3][];
    }

    public static j a(String str, int i2) {
        synchronized (f2201m) {
            Map.Entry<Integer, j> ceilingEntry = f2201m.ceilingEntry(Integer.valueOf(i2));
            if (ceilingEntry != null) {
                f2201m.remove(ceilingEntry.getKey());
                j value = ceilingEntry.getValue();
                value.e = str;
                value.f2208l = i2;
                return value;
            }
            j jVar = new j(i2);
            jVar.e = str;
            jVar.f2208l = i2;
            return jVar;
        }
    }

    public void bindBlob(int i2, byte[] bArr) {
        this.f2206j[i2] = 5;
        this.f2205i[i2] = bArr;
    }

    public void bindDouble(int i2, double d) {
        this.f2206j[i2] = 3;
        this.f2203g[i2] = d;
    }

    public void bindLong(int i2, long j2) {
        this.f2206j[i2] = 2;
        this.f2202f[i2] = j2;
    }

    public void bindNull(int i2) {
        this.f2206j[i2] = 1;
    }

    public void bindString(int i2, String str) {
        this.f2206j[i2] = 4;
        this.f2204h[i2] = str;
    }

    public void close() {
    }

    public void f() {
        synchronized (f2201m) {
            f2201m.put(Integer.valueOf(this.f2207k), this);
            if (f2201m.size() > 15) {
                int size = f2201m.size() - 10;
                Iterator<Integer> it = f2201m.descendingKeySet().iterator();
                while (true) {
                    int i2 = size - 1;
                    if (size <= 0) {
                        break;
                    }
                    it.next();
                    it.remove();
                    size = i2;
                }
            }
        }
    }

    public String a() {
        return this.e;
    }

    public void a(d dVar) {
        for (int i2 = 1; i2 <= this.f2208l; i2++) {
            int i3 = this.f2206j[i2];
            if (i3 == 1) {
                dVar.bindNull(i2);
            } else if (i3 == 2) {
                dVar.bindLong(i2, this.f2202f[i2]);
            } else if (i3 == 3) {
                dVar.bindDouble(i2, this.f2203g[i2]);
            } else if (i3 == 4) {
                dVar.bindString(i2, this.f2204h[i2]);
            } else if (i3 == 5) {
                dVar.bindBlob(i2, this.f2205i[i2]);
            }
        }
    }
}
