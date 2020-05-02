package h.a0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Data */
public final class e {

    /* renamed from: b  reason: collision with root package name */
    public static final String f911b = l.a("Data");
    public static final e c;
    public Map<String, Object> a;

    static {
        e eVar = new e((Map<String, ?>) new HashMap());
        a(eVar);
        c = eVar;
    }

    public e() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x007c A[SYNTHETIC, Splitter:B:31:0x007c] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[SYNTHETIC, Splitter:B:41:0x0093] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(h.a0.e r5) {
        /*
            java.lang.String r0 = "Error in Data#toByteArray: "
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 0
            java.io.ObjectOutputStream r3 = new java.io.ObjectOutputStream     // Catch:{ IOException -> 0x0070 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0070 }
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.a     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            int r2 = r2.size()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeInt(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map<java.lang.String, java.lang.Object> r5 = r5.a     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Set r5 = r5.entrySet()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
        L_0x0020:
            boolean r2 = r5.hasNext()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r5.next()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r4 = r2.getKey()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeUTF(r4)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            r3.writeObject(r2)     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            goto L_0x0020
        L_0x003d:
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0047
        L_0x0041:
            r5 = move-exception
            java.lang.String r2 = f911b
            android.util.Log.e(r2, r0, r5)
        L_0x0047:
            r1.close()     // Catch:{ IOException -> 0x004b }
            goto L_0x0051
        L_0x004b:
            r5 = move-exception
            java.lang.String r2 = f911b
            android.util.Log.e(r2, r0, r5)
        L_0x0051:
            int r5 = r1.size()
            r0 = 10240(0x2800, float:1.4349E-41)
            if (r5 > r0) goto L_0x005e
            byte[] r5 = r1.toByteArray()
            return r5
        L_0x005e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r5.<init>(r0)
            throw r5
        L_0x0066:
            r5 = move-exception
            goto L_0x006a
        L_0x0068:
            r5 = move-exception
            goto L_0x006c
        L_0x006a:
            r2 = r3
            goto L_0x0091
        L_0x006c:
            r2 = r3
            goto L_0x0071
        L_0x006e:
            r5 = move-exception
            goto L_0x0091
        L_0x0070:
            r5 = move-exception
        L_0x0071:
            java.lang.String r3 = f911b     // Catch:{ all -> 0x006e }
            android.util.Log.e(r3, r0, r5)     // Catch:{ all -> 0x006e }
            byte[] r5 = r1.toByteArray()     // Catch:{ all -> 0x006e }
            if (r2 == 0) goto L_0x0086
            r2.close()     // Catch:{ IOException -> 0x0080 }
            goto L_0x0086
        L_0x0080:
            r2 = move-exception
            java.lang.String r3 = f911b
            android.util.Log.e(r3, r0, r2)
        L_0x0086:
            r1.close()     // Catch:{ IOException -> 0x008a }
            goto L_0x0090
        L_0x008a:
            r1 = move-exception
            java.lang.String r2 = f911b
            android.util.Log.e(r2, r0, r1)
        L_0x0090:
            return r5
        L_0x0091:
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x009d
        L_0x0097:
            r2 = move-exception
            java.lang.String r3 = f911b
            android.util.Log.e(r3, r0, r2)
        L_0x009d:
            r1.close()     // Catch:{ IOException -> 0x00a1 }
            goto L_0x00a7
        L_0x00a1:
            r1 = move-exception
            java.lang.String r2 = f911b
            android.util.Log.e(r2, r0, r1)
        L_0x00a7:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a0.e.a(h.a0.e):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0050 A[SYNTHETIC, Splitter:B:25:0x0050] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x006a A[SYNTHETIC, Splitter:B:34:0x006a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static h.a0.e b(byte[] r7) {
        /*
            java.lang.String r0 = "Error in Data#fromByteArray: "
            int r1 = r7.length
            r2 = 10240(0x2800, float:1.4349E-41)
            if (r1 > r2) goto L_0x007f
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            r2.<init>(r7)
            r7 = 0
            java.io.ObjectInputStream r3 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x0045, ClassNotFoundException -> 0x0043, all -> 0x0041 }
            r3.<init>(r2)     // Catch:{ IOException -> 0x0045, ClassNotFoundException -> 0x0043, all -> 0x0041 }
            int r7 = r3.readInt()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
        L_0x001b:
            if (r7 <= 0) goto L_0x002b
            java.lang.String r4 = r3.readUTF()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            java.lang.Object r5 = r3.readObject()     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            r1.put(r4, r5)     // Catch:{ IOException -> 0x003f, ClassNotFoundException -> 0x003d }
            int r7 = r7 + -1
            goto L_0x001b
        L_0x002b:
            r3.close()     // Catch:{ IOException -> 0x002f }
            goto L_0x0035
        L_0x002f:
            r7 = move-exception
            java.lang.String r3 = f911b
            android.util.Log.e(r3, r0, r7)
        L_0x0035:
            r2.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0060
        L_0x0039:
            r7 = move-exception
            goto L_0x005b
        L_0x003b:
            r7 = move-exception
            goto L_0x0066
        L_0x003d:
            r7 = move-exception
            goto L_0x0049
        L_0x003f:
            r7 = move-exception
            goto L_0x0049
        L_0x0041:
            r1 = move-exception
            goto L_0x0068
        L_0x0043:
            r3 = move-exception
            goto L_0x0046
        L_0x0045:
            r3 = move-exception
        L_0x0046:
            r6 = r3
            r3 = r7
            r7 = r6
        L_0x0049:
            java.lang.String r4 = f911b     // Catch:{ all -> 0x003b }
            android.util.Log.e(r4, r0, r7)     // Catch:{ all -> 0x003b }
            if (r3 == 0) goto L_0x0035
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0035
        L_0x0054:
            r7 = move-exception
            java.lang.String r3 = f911b
            android.util.Log.e(r3, r0, r7)
            goto L_0x0035
        L_0x005b:
            java.lang.String r2 = f911b
            android.util.Log.e(r2, r0, r7)
        L_0x0060:
            h.a0.e r7 = new h.a0.e
            r7.<init>((java.util.Map<java.lang.String, ?>) r1)
            return r7
        L_0x0066:
            r1 = r7
            r7 = r3
        L_0x0068:
            if (r7 == 0) goto L_0x0074
            r7.close()     // Catch:{ IOException -> 0x006e }
            goto L_0x0074
        L_0x006e:
            r7 = move-exception
            java.lang.String r3 = f911b
            android.util.Log.e(r3, r0, r7)
        L_0x0074:
            r2.close()     // Catch:{ IOException -> 0x0078 }
            goto L_0x007e
        L_0x0078:
            r7 = move-exception
            java.lang.String r2 = f911b
            android.util.Log.e(r2, r0, r7)
        L_0x007e:
            throw r1
        L_0x007f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Data cannot occupy more than 10240 bytes when serialized"
            r7.<init>(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a0.e.b(byte[]):h.a0.e");
    }

    public boolean equals(Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        Set<String> keySet = this.a.keySet();
        if (!keySet.equals(eVar.a.keySet())) {
            return false;
        }
        for (String next : keySet) {
            Object obj2 = this.a.get(next);
            Object obj3 = eVar.a.get(next);
            if (obj2 == null || obj3 == null) {
                if (obj2 == obj3) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
            } else if (!(obj2 instanceof Object[]) || !(obj3 instanceof Object[])) {
                z = obj2.equals(obj3);
                continue;
            } else {
                z = Arrays.deepEquals((Object[]) obj2, (Object[]) obj3);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.a.hashCode() * 31;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Data {");
        if (!this.a.isEmpty()) {
            for (String next : this.a.keySet()) {
                sb.append(next);
                sb.append(" : ");
                Object obj = this.a.get(next);
                if (obj instanceof Object[]) {
                    sb.append(Arrays.toString((Object[]) obj));
                } else {
                    sb.append(obj);
                }
                sb.append(", ");
            }
        }
        sb.append("}");
        return sb.toString();
    }

    public e(e eVar) {
        this.a = new HashMap(eVar.a);
    }

    public e(Map<String, ?> map) {
        this.a = new HashMap(map);
    }

    /* compiled from: Data */
    public static final class a {
        public Map<String, Object> a = new HashMap();

        public a a(Map<String, Object> map) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                Object value = next.getValue();
                if (value == null) {
                    this.a.put(str, (Object) null);
                } else {
                    Class<?> cls = value.getClass();
                    if (cls == Boolean.class || cls == Byte.class || cls == Integer.class || cls == Long.class || cls == Float.class || cls == Double.class || cls == String.class || cls == Boolean[].class || cls == Byte[].class || cls == Integer[].class || cls == Long[].class || cls == Float[].class || cls == Double[].class || cls == String[].class) {
                        this.a.put(str, value);
                    } else if (cls == boolean[].class) {
                        this.a.put(str, e.a((boolean[]) value));
                    } else if (cls == byte[].class) {
                        this.a.put(str, e.a((byte[]) value));
                    } else if (cls == int[].class) {
                        this.a.put(str, e.a((int[]) value));
                    } else if (cls == long[].class) {
                        this.a.put(str, e.a((long[]) value));
                    } else if (cls == float[].class) {
                        this.a.put(str, e.a((float[]) value));
                    } else if (cls == double[].class) {
                        this.a.put(str, e.a((double[]) value));
                    } else {
                        throw new IllegalArgumentException(String.format("Key %s has invalid type %s", new Object[]{str, cls}));
                    }
                }
            }
            return this;
        }

        public e a() {
            e eVar = new e((Map<String, ?>) this.a);
            e.a(eVar);
            return eVar;
        }
    }

    public static Boolean[] a(boolean[] zArr) {
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int i2 = 0; i2 < zArr.length; i2++) {
            boolArr[i2] = Boolean.valueOf(zArr[i2]);
        }
        return boolArr;
    }

    public static Byte[] a(byte[] bArr) {
        Byte[] bArr2 = new Byte[bArr.length];
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = Byte.valueOf(bArr[i2]);
        }
        return bArr2;
    }

    public static Integer[] a(int[] iArr) {
        Integer[] numArr = new Integer[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            numArr[i2] = Integer.valueOf(iArr[i2]);
        }
        return numArr;
    }

    public static Long[] a(long[] jArr) {
        Long[] lArr = new Long[jArr.length];
        for (int i2 = 0; i2 < jArr.length; i2++) {
            lArr[i2] = Long.valueOf(jArr[i2]);
        }
        return lArr;
    }

    public static Float[] a(float[] fArr) {
        Float[] fArr2 = new Float[fArr.length];
        for (int i2 = 0; i2 < fArr.length; i2++) {
            fArr2[i2] = Float.valueOf(fArr[i2]);
        }
        return fArr2;
    }

    public static Double[] a(double[] dArr) {
        Double[] dArr2 = new Double[dArr.length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            dArr2[i2] = Double.valueOf(dArr[i2]);
        }
        return dArr2;
    }
}
