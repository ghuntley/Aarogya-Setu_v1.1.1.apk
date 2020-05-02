package h.f.a.h;

import h.f.a.e;
import h.f.a.g;
import h.f.a.h.c;
import i.a.a.a.a;

/* compiled from: ResolutionAnchor */
public class j extends l {
    public c c;
    public j d;
    public float e;

    /* renamed from: f  reason: collision with root package name */
    public j f1665f;

    /* renamed from: g  reason: collision with root package name */
    public float f1666g;

    /* renamed from: h  reason: collision with root package name */
    public int f1667h = 0;

    /* renamed from: i  reason: collision with root package name */
    public j f1668i;

    /* renamed from: j  reason: collision with root package name */
    public k f1669j = null;

    /* renamed from: k  reason: collision with root package name */
    public int f1670k = 1;

    /* renamed from: l  reason: collision with root package name */
    public k f1671l = null;

    /* renamed from: m  reason: collision with root package name */
    public int f1672m = 1;

    public j(c cVar) {
        this.c = cVar;
    }

    public String a(int i2) {
        return i2 == 1 ? "DIRECT" : i2 == 2 ? "CENTER" : i2 == 3 ? "MATCH" : i2 == 4 ? "CHAIN" : i2 == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void a(j jVar, float f2) {
        if (this.f1673b == 0 || !(this.f1665f == jVar || this.f1666g == f2)) {
            this.f1665f = jVar;
            this.f1666g = f2;
            if (this.f1673b == 1) {
                b();
            }
            a();
        }
    }

    public void d() {
        j jVar;
        j jVar2;
        j jVar3;
        j jVar4;
        j jVar5;
        j jVar6;
        float f2;
        float f3;
        float f4;
        float f5;
        j jVar7;
        boolean z = true;
        if (this.f1673b != 1 && this.f1667h != 4) {
            k kVar = this.f1669j;
            if (kVar != null) {
                if (kVar.f1673b == 1) {
                    this.e = ((float) this.f1670k) * kVar.c;
                } else {
                    return;
                }
            }
            k kVar2 = this.f1671l;
            if (kVar2 != null) {
                if (kVar2.f1673b == 1) {
                    float f6 = kVar2.c;
                } else {
                    return;
                }
            }
            if (this.f1667h == 1 && ((jVar7 = this.d) == null || jVar7.f1673b == 1)) {
                j jVar8 = this.d;
                if (jVar8 == null) {
                    this.f1665f = this;
                    this.f1666g = this.e;
                } else {
                    this.f1665f = jVar8.f1665f;
                    this.f1666g = jVar8.f1666g + this.e;
                }
                a();
            } else if (this.f1667h == 2 && (jVar4 = this.d) != null && jVar4.f1673b == 1 && (jVar5 = this.f1668i) != null && (jVar6 = jVar5.d) != null && jVar6.f1673b == 1) {
                this.f1665f = jVar4.f1665f;
                jVar5.f1665f = jVar6.f1665f;
                c.C0042c cVar = this.c.c;
                int i2 = 0;
                if (!(cVar == c.C0042c.RIGHT || cVar == c.C0042c.BOTTOM)) {
                    z = false;
                }
                if (z) {
                    f3 = this.d.f1666g;
                    f2 = this.f1668i.d.f1666g;
                } else {
                    f3 = this.f1668i.d.f1666g;
                    f2 = this.d.f1666g;
                }
                float f7 = f3 - f2;
                c cVar2 = this.c;
                c.C0042c cVar3 = cVar2.c;
                if (cVar3 == c.C0042c.LEFT || cVar3 == c.C0042c.RIGHT) {
                    f5 = f7 - ((float) this.c.f1622b.i());
                    f4 = this.c.f1622b.V;
                } else {
                    f5 = f7 - ((float) cVar2.f1622b.d());
                    f4 = this.c.f1622b.W;
                }
                int a = this.c.a();
                int a2 = this.f1668i.c.a();
                if (this.c.d == this.f1668i.c.d) {
                    f4 = 0.5f;
                    a2 = 0;
                } else {
                    i2 = a;
                }
                float f8 = (float) i2;
                float f9 = (float) a2;
                float f10 = (f5 - f8) - f9;
                if (z) {
                    j jVar9 = this.f1668i;
                    jVar9.f1666g = (f10 * f4) + jVar9.d.f1666g + f9;
                    this.f1666g = (this.d.f1666g - f8) - ((1.0f - f4) * f10);
                } else {
                    this.f1666g = (f10 * f4) + this.d.f1666g + f8;
                    j jVar10 = this.f1668i;
                    jVar10.f1666g = (jVar10.d.f1666g - f9) - ((1.0f - f4) * f10);
                }
                a();
                this.f1668i.a();
            } else if (this.f1667h == 3 && (jVar = this.d) != null && jVar.f1673b == 1 && (jVar2 = this.f1668i) != null && (jVar3 = jVar2.d) != null && jVar3.f1673b == 1) {
                this.f1665f = jVar.f1665f;
                jVar2.f1665f = jVar3.f1665f;
                this.f1666g = jVar.f1666g + this.e;
                jVar2.f1666g = jVar3.f1666g + jVar2.e;
                a();
                this.f1668i.a();
            } else if (this.f1667h == 5) {
                this.c.f1622b.m();
            }
        }
    }

    public void e() {
        this.f1673b = 0;
        this.a.clear();
        this.d = null;
        this.e = 0.0f;
        this.f1669j = null;
        this.f1670k = 1;
        this.f1671l = null;
        this.f1672m = 1;
        this.f1665f = null;
        this.f1666g = 0.0f;
        this.f1668i = null;
        this.f1667h = 0;
    }

    public String toString() {
        if (this.f1673b != 1) {
            StringBuilder a = a.a("{ ");
            a.append(this.c);
            a.append(" UNRESOLVED} type: ");
            a.append(a(this.f1667h));
            return a.toString();
        } else if (this.f1665f == this) {
            StringBuilder a2 = a.a("[");
            a2.append(this.c);
            a2.append(", RESOLVED: ");
            a2.append(this.f1666g);
            a2.append("]  type: ");
            a2.append(a(this.f1667h));
            return a2.toString();
        } else {
            StringBuilder a3 = a.a("[");
            a3.append(this.c);
            a3.append(", RESOLVED: ");
            a3.append(this.f1665f);
            a3.append(":");
            a3.append(this.f1666g);
            a3.append("] type: ");
            a3.append(a(this.f1667h));
            return a3.toString();
        }
    }

    public void a(int i2, j jVar, int i3) {
        this.f1667h = i2;
        this.d = jVar;
        this.e = (float) i3;
        jVar.a.add(this);
    }

    public void a(j jVar, int i2) {
        this.d = jVar;
        this.e = (float) i2;
        jVar.a.add(this);
    }

    public void a(j jVar, int i2, k kVar) {
        this.d = jVar;
        jVar.a.add(this);
        this.f1669j = kVar;
        this.f1670k = i2;
        kVar.a.add(this);
    }

    public void a(e eVar) {
        g gVar = this.c.f1626i;
        j jVar = this.f1665f;
        if (jVar == null) {
            eVar.a(gVar, (int) (this.f1666g + 0.5f));
        } else {
            eVar.a(gVar, eVar.a((Object) jVar.c), (int) (this.f1666g + 0.5f), 6);
        }
    }
}
