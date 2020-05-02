package h.u.a;

import android.content.SharedPreferences;
import android.util.ArraySet;
import android.util.Pair;
import i.c.c.a.c0.h;
import i.c.c.a.t.e;
import i.c.c.a.v.f;
import i.c.c.a.z.z1;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: EncryptedSharedPreferences */
public final class a implements SharedPreferences {
    public final SharedPreferences a;

    /* renamed from: b  reason: collision with root package name */
    public final List<SharedPreferences.OnSharedPreferenceChangeListener> f2229b = new ArrayList();
    public final String c;
    public final i.c.c.a.a d;
    public final i.c.c.a.d e;

    /* compiled from: EncryptedSharedPreferences */
    public enum b {
        STRING(0),
        STRING_SET(1),
        INT(2),
        LONG(3),
        FLOAT(4),
        BOOLEAN(5);
        
        public final int e;

        /* access modifiers changed from: public */
        b(int i2) {
            this.e = i2;
        }

        public static b a(int i2) {
            if (i2 == 0) {
                return STRING;
            }
            if (i2 == 1) {
                return STRING_SET;
            }
            if (i2 == 2) {
                return INT;
            }
            if (i2 == 3) {
                return LONG;
            }
            if (i2 == 4) {
                return FLOAT;
            }
            if (i2 != 5) {
                return null;
            }
            return BOOLEAN;
        }
    }

    /* compiled from: EncryptedSharedPreferences */
    public enum c {
        AES256_SIV(f.a);
        
        public final z1 e;

        /* access modifiers changed from: public */
        c(z1 z1Var) {
            this.e = z1Var;
        }
    }

    /* compiled from: EncryptedSharedPreferences */
    public enum d {
        AES256_GCM(e.a);
        
        public final z1 e;

        /* access modifiers changed from: public */
        d(z1 z1Var) {
            this.e = z1Var;
        }
    }

    public a(String str, String str2, SharedPreferences sharedPreferences, i.c.c.a.a aVar, i.c.c.a.d dVar) {
        this.c = str;
        this.a = sharedPreferences;
        this.d = aVar;
        this.e = dVar;
    }

    public String a(String str) {
        if (str == null) {
            str = "__NULL__";
        }
        try {
            return h.a(this.e.a(str.getBytes(StandardCharsets.UTF_8), this.c.getBytes()));
        } catch (GeneralSecurityException e2) {
            StringBuilder a2 = i.a.a.a.a.a("Could not encrypt key. ");
            a2.append(e2.getMessage());
            throw new SecurityException(a2.toString(), e2);
        }
    }

    public final Object b(String str) {
        if (!c(str)) {
            if (str == null) {
                str = "__NULL__";
            }
            try {
                String a2 = a(str);
                String string = this.a.getString(a2, (String) null);
                if (string == null) {
                    return null;
                }
                boolean z = false;
                ByteBuffer wrap = ByteBuffer.wrap(this.d.b(h.a(string, 0), a2.getBytes(StandardCharsets.UTF_8)));
                wrap.position(0);
                int ordinal = b.a(wrap.getInt()).ordinal();
                if (ordinal == 0) {
                    int i2 = wrap.getInt();
                    ByteBuffer slice = wrap.slice();
                    wrap.limit(i2);
                    String charBuffer = StandardCharsets.UTF_8.decode(slice).toString();
                    if (charBuffer.equals("__NULL__")) {
                        return null;
                    }
                    return charBuffer;
                } else if (ordinal == 1) {
                    ArraySet arraySet = new ArraySet();
                    while (wrap.hasRemaining()) {
                        int i3 = wrap.getInt();
                        ByteBuffer slice2 = wrap.slice();
                        slice2.limit(i3);
                        wrap.position(wrap.position() + i3);
                        arraySet.add(StandardCharsets.UTF_8.decode(slice2).toString());
                    }
                    if (arraySet.size() != 1 || !"__NULL__".equals(arraySet.valueAt(0))) {
                        return arraySet;
                    }
                    return null;
                } else if (ordinal == 2) {
                    return Integer.valueOf(wrap.getInt());
                } else {
                    if (ordinal == 3) {
                        return Long.valueOf(wrap.getLong());
                    }
                    if (ordinal == 4) {
                        return Float.valueOf(wrap.getFloat());
                    }
                    if (ordinal != 5) {
                        return null;
                    }
                    if (wrap.get() != 0) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            } catch (GeneralSecurityException e2) {
                StringBuilder a3 = i.a.a.a.a.a("Could not decrypt value. ");
                a3.append(e2.getMessage());
                throw new SecurityException(a3.toString(), e2);
            }
        } else {
            throw new SecurityException(i.a.a.a.a.b(str, " is a reserved key for the encryption keyset."));
        }
    }

    public boolean c(String str) {
        return "__androidx_security_crypto_encrypted_prefs_key_keyset__".equals(str) || "__androidx_security_crypto_encrypted_prefs_value_keyset__".equals(str);
    }

    public boolean contains(String str) {
        if (!c(str)) {
            return this.a.contains(a(str));
        }
        throw new SecurityException(i.a.a.a.a.b(str, " is a reserved key for the encryption keyset."));
    }

    public SharedPreferences.Editor edit() {
        return new C0068a(this, this.a.edit());
    }

    public Map<String, ?> getAll() {
        HashMap hashMap = new HashMap();
        for (Map.Entry next : this.a.getAll().entrySet()) {
            if (!c((String) next.getKey())) {
                try {
                    String str = new String(this.e.b(h.a((String) next.getKey(), 0), this.c.getBytes()), StandardCharsets.UTF_8);
                    if (str.equals("__NULL__")) {
                        str = null;
                    }
                    hashMap.put(str, b(str));
                } catch (GeneralSecurityException e2) {
                    StringBuilder a2 = i.a.a.a.a.a("Could not decrypt key. ");
                    a2.append(e2.getMessage());
                    throw new SecurityException(a2.toString(), e2);
                }
            }
        }
        return hashMap;
    }

    public boolean getBoolean(String str, boolean z) {
        Object b2 = b(str);
        return (b2 == null || !(b2 instanceof Boolean)) ? z : ((Boolean) b2).booleanValue();
    }

    public float getFloat(String str, float f2) {
        Object b2 = b(str);
        return (b2 == null || !(b2 instanceof Float)) ? f2 : ((Float) b2).floatValue();
    }

    public int getInt(String str, int i2) {
        Object b2 = b(str);
        return (b2 == null || !(b2 instanceof Integer)) ? i2 : ((Integer) b2).intValue();
    }

    public long getLong(String str, long j2) {
        Object b2 = b(str);
        return (b2 == null || !(b2 instanceof Long)) ? j2 : ((Long) b2).longValue();
    }

    public String getString(String str, String str2) {
        Object b2 = b(str);
        return (b2 == null || !(b2 instanceof String)) ? str2 : (String) b2;
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        Set<String> set2;
        Object b2 = b(str);
        if (b2 instanceof Set) {
            set2 = (Set) b2;
        } else {
            set2 = new ArraySet<>();
        }
        return set2.size() > 0 ? set2 : set;
    }

    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2229b.add(onSharedPreferenceChangeListener);
    }

    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f2229b.remove(onSharedPreferenceChangeListener);
    }

    /* renamed from: h.u.a.a$a  reason: collision with other inner class name */
    /* compiled from: EncryptedSharedPreferences */
    public static final class C0068a implements SharedPreferences.Editor {
        public final a a;

        /* renamed from: b  reason: collision with root package name */
        public final SharedPreferences.Editor f2230b;
        public final List<String> c;
        public AtomicBoolean d = new AtomicBoolean(false);

        public C0068a(a aVar, SharedPreferences.Editor editor) {
            this.a = aVar;
            this.f2230b = editor;
            this.c = new CopyOnWriteArrayList();
        }

        public final void a(String str, byte[] bArr) {
            if (!this.a.c(str)) {
                this.c.add(str);
                if (str == null) {
                    str = "__NULL__";
                }
                try {
                    a aVar = this.a;
                    String a2 = aVar.a(str);
                    Pair pair = new Pair(a2, h.a(aVar.d.a(bArr, a2.getBytes(StandardCharsets.UTF_8))));
                    this.f2230b.putString((String) pair.first, (String) pair.second);
                } catch (GeneralSecurityException e) {
                    StringBuilder a3 = i.a.a.a.a.a("Could not encrypt data: ");
                    a3.append(e.getMessage());
                    throw new SecurityException(a3.toString(), e);
                }
            } else {
                throw new SecurityException(i.a.a.a.a.b(str, " is a reserved key for the encryption keyset."));
            }
        }

        public void apply() {
            this.f2230b.apply();
            a();
        }

        public SharedPreferences.Editor clear() {
            this.d.set(true);
            return this;
        }

        public boolean commit() {
            if (this.d.getAndSet(false)) {
                for (String str : ((HashMap) this.a.getAll()).keySet()) {
                    if (!this.c.contains(str) && !this.a.c(str)) {
                        this.f2230b.remove(this.a.a(str));
                    }
                }
            }
            try {
                return this.f2230b.commit();
            } finally {
                a();
                this.c.clear();
            }
        }

        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            ByteBuffer allocate = ByteBuffer.allocate(5);
            allocate.putInt(b.BOOLEAN.e);
            allocate.put(z ? (byte) 1 : 0);
            a(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putFloat(String str, float f2) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(b.FLOAT.e);
            allocate.putFloat(f2);
            a(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putInt(String str, int i2) {
            ByteBuffer allocate = ByteBuffer.allocate(8);
            allocate.putInt(b.INT.e);
            allocate.putInt(i2);
            a(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putLong(String str, long j2) {
            ByteBuffer allocate = ByteBuffer.allocate(12);
            allocate.putInt(b.LONG.e);
            allocate.putLong(j2);
            a(str, allocate.array());
            return this;
        }

        public SharedPreferences.Editor putString(String str, String str2) {
            if (str2 == null) {
                str2 = "__NULL__";
            }
            byte[] bytes = str2.getBytes(StandardCharsets.UTF_8);
            int length = bytes.length;
            ByteBuffer allocate = ByteBuffer.allocate(length + 8);
            allocate.putInt(b.STRING.e);
            allocate.putInt(length);
            allocate.put(bytes);
            a(str, allocate.array());
            return this;
        }

        /* JADX WARNING: Failed to insert additional move for type inference */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.content.SharedPreferences.Editor putStringSet(java.lang.String r5, java.util.Set<java.lang.String> r6) {
            /*
                r4 = this;
                if (r6 != 0) goto L_0x000c
                android.util.ArraySet r6 = new android.util.ArraySet
                r6.<init>()
                java.lang.String r0 = "__NULL__"
                r6.add(r0)
            L_0x000c:
                java.util.ArrayList r0 = new java.util.ArrayList
                int r1 = r6.size()
                r0.<init>(r1)
                int r1 = r6.size()
                int r1 = r1 * 4
                java.util.Iterator r6 = r6.iterator()
            L_0x001f:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L_0x0037
                java.lang.Object r2 = r6.next()
                java.lang.String r2 = (java.lang.String) r2
                java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8
                byte[] r2 = r2.getBytes(r3)
                r0.add(r2)
                int r2 = r2.length
                int r1 = r1 + r2
                goto L_0x001f
            L_0x0037:
                int r1 = r1 + 4
                java.nio.ByteBuffer r6 = java.nio.ByteBuffer.allocate(r1)
                h.u.a.a$b r1 = h.u.a.a.b.STRING_SET
                int r1 = r1.e
                r6.putInt(r1)
                java.util.Iterator r0 = r0.iterator()
            L_0x0048:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x005c
                java.lang.Object r1 = r0.next()
                byte[] r1 = (byte[]) r1
                int r2 = r1.length
                r6.putInt(r2)
                r6.put(r1)
                goto L_0x0048
            L_0x005c:
                byte[] r6 = r6.array()
                r4.a(r5, r6)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: h.u.a.a.C0068a.putStringSet(java.lang.String, java.util.Set):android.content.SharedPreferences$Editor");
        }

        public SharedPreferences.Editor remove(String str) {
            if (!this.a.c(str)) {
                this.f2230b.remove(this.a.a(str));
                this.c.remove(str);
                return this;
            }
            throw new SecurityException(i.a.a.a.a.b(str, " is a reserved key for the encryption keyset."));
        }

        public final void a() {
            for (SharedPreferences.OnSharedPreferenceChangeListener next : this.a.f2229b) {
                for (String onSharedPreferenceChanged : this.c) {
                    next.onSharedPreferenceChanged(this.a, onSharedPreferenceChanged);
                }
            }
        }
    }
}
