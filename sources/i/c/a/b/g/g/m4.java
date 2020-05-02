package i.c.a.b.g.g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.3.0 */
public final class m4 extends p2<String> implements l4, RandomAccess {

    /* renamed from: g  reason: collision with root package name */
    public static final m4 f3359g;

    /* renamed from: f  reason: collision with root package name */
    public final List<Object> f3360f;

    static {
        m4 m4Var = new m4(10);
        f3359g = m4Var;
        m4Var.e = false;
    }

    public m4(int i2) {
        this.f3360f = new ArrayList(i2);
    }

    public final void a(u2 u2Var) {
        c();
        this.f3360f.add(u2Var);
        this.modCount++;
    }

    public final /* synthetic */ void add(int i2, Object obj) {
        c();
        this.f3360f.add(i2, (String) obj);
        this.modCount++;
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final Object b(int i2) {
        return this.f3360f.get(i2);
    }

    public final void clear() {
        c();
        this.f3360f.clear();
        this.modCount++;
    }

    public final l4 g() {
        return this.e ? new k6(this) : this;
    }

    public final /* synthetic */ Object get(int i2) {
        Object obj = this.f3360f.get(i2);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof u2) {
            u2 u2Var = (u2) obj;
            String b2 = u2Var.b();
            c3 c3Var = (c3) u2Var;
            int c = c3Var.c();
            if (o6.a(c3Var.f3237h, c, c3Var.a() + c)) {
                this.f3360f.set(i2, b2);
            }
            return b2;
        }
        byte[] bArr = (byte[]) obj;
        String a = y3.a(bArr);
        boolean z = false;
        if (o6.a.a(0, bArr, 0, bArr.length) == 0) {
            z = true;
        }
        if (z) {
            this.f3360f.set(i2, a);
        }
        return a;
    }

    public final /* synthetic */ Object remove(int i2) {
        c();
        Object remove = this.f3360f.remove(i2);
        this.modCount++;
        return a(remove);
    }

    public final /* synthetic */ Object set(int i2, Object obj) {
        c();
        return a(this.f3360f.set(i2, (String) obj));
    }

    public final int size() {
        return this.f3360f.size();
    }

    public final boolean addAll(int i2, Collection<? extends String> collection) {
        c();
        if (collection instanceof l4) {
            collection = ((l4) collection).b();
        }
        boolean addAll = this.f3360f.addAll(i2, collection);
        this.modCount++;
        return addAll;
    }

    public final List<?> b() {
        return Collections.unmodifiableList(this.f3360f);
    }

    public m4(ArrayList<Object> arrayList) {
        this.f3360f = arrayList;
    }

    public static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof u2) {
            return ((u2) obj).b();
        }
        return y3.a((byte[]) obj);
    }

    public final /* synthetic */ d4 a(int i2) {
        if (i2 >= size()) {
            ArrayList arrayList = new ArrayList(i2);
            arrayList.addAll(this.f3360f);
            return new m4((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }
}
