package i.c.f;

import i.c.f.j.a;
import i.c.f.k;
import i.c.f.o;
import i.c.f.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: FieldSet */
public final class j<FieldDescriptorType extends a<FieldDescriptorType>> {
    public final s<FieldDescriptorType, Object> a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f4948b;
    public boolean c;

    /* compiled from: FieldSet */
    public interface a<T extends a<T>> extends Comparable<T> {
        o.a a(o.a aVar, o oVar);

        boolean i();

        x k();

        y n();
    }

    static {
        new j(true);
    }

    public j() {
        this.c = false;
        this.a = s.c(16);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        if ((r3 instanceof i.c.f.l.a) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if ((r3 instanceof byte[]) == false) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        if ((r3 instanceof i.c.f.m) == false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(i.c.f.x r2, java.lang.Object r3) {
        /*
            if (r3 == 0) goto L_0x0048
            i.c.f.y r2 = r2.e
            int r2 = r2.ordinal()
            r0 = 1
            r1 = 0
            switch(r2) {
                case 0: goto L_0x003b;
                case 1: goto L_0x0038;
                case 2: goto L_0x0035;
                case 3: goto L_0x0032;
                case 4: goto L_0x002f;
                case 5: goto L_0x002c;
                case 6: goto L_0x0020;
                case 7: goto L_0x0017;
                case 8: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x003d
        L_0x000e:
            boolean r2 = r3 instanceof i.c.f.o
            if (r2 != 0) goto L_0x002a
            boolean r2 = r3 instanceof i.c.f.m
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0017:
            boolean r2 = r3 instanceof java.lang.Integer
            if (r2 != 0) goto L_0x002a
            boolean r2 = r3 instanceof i.c.f.l.a
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0020:
            boolean r2 = r3 instanceof i.c.f.f
            if (r2 != 0) goto L_0x002a
            boolean r2 = r3 instanceof byte[]
            if (r2 == 0) goto L_0x0029
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r1 = r0
            goto L_0x003d
        L_0x002c:
            boolean r1 = r3 instanceof java.lang.String
            goto L_0x003d
        L_0x002f:
            boolean r1 = r3 instanceof java.lang.Boolean
            goto L_0x003d
        L_0x0032:
            boolean r1 = r3 instanceof java.lang.Double
            goto L_0x003d
        L_0x0035:
            boolean r1 = r3 instanceof java.lang.Float
            goto L_0x003d
        L_0x0038:
            boolean r1 = r3 instanceof java.lang.Long
            goto L_0x003d
        L_0x003b:
            boolean r1 = r3 instanceof java.lang.Integer
        L_0x003d:
            if (r1 == 0) goto L_0x0040
            return
        L_0x0040:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Wrong object type used with protocol message reflection."
            r2.<init>(r3)
            throw r2
        L_0x0048:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i.c.f.j.a(i.c.f.x, java.lang.Object):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        return this.a.equals(((j) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public j<FieldDescriptorType> clone() {
        j<FieldDescriptorType> jVar = new j<>();
        for (int i2 = 0; i2 < this.a.b(); i2++) {
            Map.Entry<FieldDescriptorType, Object> a2 = this.a.a(i2);
            jVar.a((FieldDescriptorType) (a) a2.getKey(), a2.getValue());
        }
        for (Map.Entry next : this.a.c()) {
            jVar.a((FieldDescriptorType) (a) next.getKey(), next.getValue());
        }
        jVar.c = this.c;
        return jVar;
    }

    public j(boolean z) {
        this.c = false;
        s.a aVar = new s.a(0);
        this.a = aVar;
        if (!this.f4948b) {
            aVar.e();
            this.f4948b = true;
        }
    }

    public void a(FieldDescriptorType fielddescriptortype, Object obj) {
        if (!fielddescriptortype.i()) {
            a(fielddescriptortype.k(), obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a(fielddescriptortype.k(), it.next());
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof m) {
            this.c = true;
        }
        this.a.put(fielddescriptortype, obj);
    }

    public final Object a(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final void a(Map.Entry<FieldDescriptorType, Object> entry) {
        a aVar = (a) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof m) {
            value = ((m) value).a();
        }
        if (aVar.i()) {
            Object obj = this.a.get(aVar);
            if (obj instanceof m) {
                obj = ((m) obj).a();
            }
            if (obj == null) {
                obj = new ArrayList();
            }
            for (Object a2 : (List) value) {
                ((List) obj).add(a(a2));
            }
            this.a.put(aVar, obj);
        } else if (aVar.n() == y.MESSAGE) {
            Object obj2 = this.a.get(aVar);
            if (obj2 instanceof m) {
                obj2 = ((m) obj2).a();
            }
            if (obj2 == null) {
                this.a.put(aVar, a(value));
                return;
            }
            this.a.put(aVar, ((k.b) aVar.a(((o) obj2).e(), (o) value)).i());
        } else {
            this.a.put(aVar, a(value));
        }
    }
}
