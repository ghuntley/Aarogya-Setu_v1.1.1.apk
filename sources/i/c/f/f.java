package i.c.f;

import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.InvalidProtocolBufferException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: ByteString */
public abstract class f implements Iterable<Byte>, Serializable {

    /* renamed from: f  reason: collision with root package name */
    public static final f f4932f = new g(l.f4963b);

    /* renamed from: g  reason: collision with root package name */
    public static final c f4933g;
    public int e = 0;

    /* compiled from: ByteString */
    public static final class a implements c {
        public /* synthetic */ a(e eVar) {
        }

        public byte[] a(byte[] bArr, int i2, int i3) {
            return Arrays.copyOfRange(bArr, i2, i3 + i2);
        }
    }

    /* compiled from: ByteString */
    public static final class b extends g {

        /* renamed from: i  reason: collision with root package name */
        public final int f4934i;

        /* renamed from: j  reason: collision with root package name */
        public final int f4935j;

        public b(byte[] bArr, int i2, int i3) {
            super(bArr);
            f.a(i2, i2 + i3, bArr.length);
            this.f4934i = i2;
            this.f4935j = i3;
        }

        public void a(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f4937h, this.f4934i + i2, bArr, i3, i4);
        }

        public byte c(int i2) {
            int i3 = this.f4935j;
            if (((i3 - (i2 + 1)) | i2) >= 0) {
                return this.f4937h[this.f4934i + i2];
            }
            if (i2 < 0) {
                throw new ArrayIndexOutOfBoundsException(i.a.a.a.a.b("Index < 0: ", i2));
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i2 + ", " + i3);
        }

        public int e() {
            return this.f4934i;
        }

        public int size() {
            return this.f4935j;
        }
    }

    /* compiled from: ByteString */
    public interface c {
        byte[] a(byte[] bArr, int i2, int i3);
    }

    /* compiled from: ByteString */
    public interface d extends Iterator<Byte> {
    }

    /* compiled from: ByteString */
    public static final class e {
        public final CodedOutputStream a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f4936b;

        public /* synthetic */ e(int i2, e eVar) {
            byte[] bArr = new byte[i2];
            this.f4936b = bArr;
            this.a = CodedOutputStream.a(bArr);
        }
    }

    /* renamed from: i.c.f.f$f  reason: collision with other inner class name */
    /* compiled from: ByteString */
    public static abstract class C0141f extends f {
        public Iterator iterator() {
            return new e(this);
        }
    }

    /* compiled from: ByteString */
    public static class g extends C0141f {

        /* renamed from: h  reason: collision with root package name */
        public final byte[] f4937h;

        public g(byte[] bArr) {
            this.f4937h = bArr;
        }

        public void a(byte[] bArr, int i2, int i3, int i4) {
            System.arraycopy(this.f4937h, i2, bArr, i3, i4);
        }

        public byte c(int i2) {
            return this.f4937h[i2];
        }

        public int e() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof f) || size() != ((f) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof g)) {
                return obj.equals(this);
            }
            g gVar = (g) obj;
            int i2 = this.e;
            int i3 = gVar.e;
            if (i2 != 0 && i3 != 0 && i2 != i3) {
                return false;
            }
            int size = size();
            if (size > gVar.size()) {
                throw new IllegalArgumentException("Length too large: " + size + size());
            } else if (0 + size <= gVar.size()) {
                byte[] bArr = this.f4937h;
                byte[] bArr2 = gVar.f4937h;
                int e = e() + size;
                int e2 = e();
                int e3 = gVar.e() + 0;
                while (e2 < e) {
                    if (bArr[e2] != bArr2[e3]) {
                        return false;
                    }
                    e2++;
                    e3++;
                }
                return true;
            } else {
                throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + size + ", " + gVar.size());
            }
        }

        public int size() {
            return this.f4937h.length;
        }

        public final g c() {
            byte[] bArr = this.f4937h;
            int e = e();
            int size = size();
            g gVar = new g(bArr, e, size, true);
            try {
                gVar.b(size);
                return gVar;
            } catch (InvalidProtocolBufferException e2) {
                throw new IllegalArgumentException(e2);
            }
        }
    }

    /* compiled from: ByteString */
    public static final class h implements c {
        public /* synthetic */ h(e eVar) {
        }

        public byte[] a(byte[] bArr, int i2, int i3) {
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i2, bArr2, 0, i3);
            return bArr2;
        }
    }

    static {
        Class<f> cls = f.class;
        boolean z = true;
        try {
            Class.forName("android.content.Context");
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        f4933g = z ? new h((e) null) : new a((e) null);
    }

    public static f a(byte[] bArr) {
        return new g(f4933g.a(bArr, 0, bArr.length));
    }

    public static f b(byte[] bArr) {
        return new g(bArr);
    }

    public abstract void a(byte[] bArr, int i2, int i3, int i4);

    public abstract byte c(int i2);

    public abstract g c();

    public final byte[] d() {
        int size = size();
        if (size == 0) {
            return l.f4963b;
        }
        byte[] bArr = new byte[size];
        a(bArr, 0, 0, size);
        return bArr;
    }

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i2 = this.e;
        if (i2 == 0) {
            int size = size();
            g gVar = (g) this;
            i2 = l.a(size, gVar.f4937h, gVar.e() + 0, size);
            if (i2 == 0) {
                i2 = 1;
            }
            this.e = i2;
        }
        return i2;
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    public Iterator iterator() {
        return new e(this);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public static f a(byte[] bArr, int i2, int i3) {
        return new b(bArr, i2, i3);
    }

    public static f a(String str) {
        return new g(str.getBytes(l.a));
    }

    public static int a(int i2, int i3, int i4) {
        int i5 = i3 - i2;
        if ((i2 | i3 | i5 | (i4 - i3)) >= 0) {
            return i5;
        }
        if (i2 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i2 + " < 0");
        } else if (i3 < i2) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i2 + ", " + i3);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i3 + " >= " + i4);
        }
    }

    public static e d(int i2) {
        return new e(i2, (e) null);
    }
}
