package h.w;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import h.w.i;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: TransitionSet */
public class o extends i {
    public ArrayList<i> M = new ArrayList<>();
    public boolean N = true;
    public int O;
    public boolean P = false;
    public int Q = 0;

    /* compiled from: TransitionSet */
    public class a extends l {
        public final /* synthetic */ i a;

        public a(o oVar, i iVar) {
            this.a = iVar;
        }

        public void e(i iVar) {
            this.a.d();
            iVar.b((i.d) this);
        }
    }

    /* compiled from: TransitionSet */
    public static class b extends l {
        public o a;

        public b(o oVar) {
            this.a = oVar;
        }

        public void c(i iVar) {
            o oVar = this.a;
            if (!oVar.P) {
                oVar.e();
                this.a.P = true;
            }
        }

        public void e(i iVar) {
            o oVar = this.a;
            int i2 = oVar.O - 1;
            oVar.O = i2;
            if (i2 == 0) {
                oVar.P = false;
                oVar.b();
            }
            iVar.b((i.d) this);
        }
    }

    public o a(i iVar) {
        this.M.add(iVar);
        iVar.v = this;
        long j2 = this.f2275g;
        if (j2 >= 0) {
            iVar.a(j2);
        }
        if ((this.Q & 1) != 0) {
            iVar.a(this.f2276h);
        }
        if ((this.Q & 2) != 0) {
            iVar.a((n) null);
        }
        if ((this.Q & 4) != 0) {
            iVar.a(this.I);
        }
        if ((this.Q & 8) != 0) {
            iVar.a(this.H);
        }
        return this;
    }

    public o b(int i2) {
        if (i2 == 0) {
            this.N = true;
        } else if (i2 == 1) {
            this.N = false;
        } else {
            throw new AndroidRuntimeException(i.a.a.a.a.b("Invalid parameter for TransitionSet ordering: ", i2));
        }
        return this;
    }

    public void c(q qVar) {
        if (b(qVar.f2291b)) {
            Iterator<i> it = this.M.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.b(qVar.f2291b)) {
                    next.c(qVar);
                    qVar.c.add(next);
                }
            }
        }
    }

    public void cancel() {
        super.cancel();
        int size = this.M.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.M.get(i2).cancel();
        }
    }

    public i d(View view) {
        for (int i2 = 0; i2 < this.M.size(); i2++) {
            this.M.get(i2).d(view);
        }
        this.f2278j.remove(view);
        return this;
    }

    public void e(View view) {
        super.e(view);
        int size = this.M.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.M.get(i2).e(view);
        }
    }

    public i clone() {
        o oVar = (o) super.clone();
        oVar.M = new ArrayList<>();
        int size = this.M.size();
        for (int i2 = 0; i2 < size; i2++) {
            i clone = this.M.get(i2).clone();
            oVar.M.add(clone);
            clone.v = oVar;
        }
        return oVar;
    }

    public i b(long j2) {
        this.f2274f = j2;
        return this;
    }

    public void d() {
        if (this.M.isEmpty()) {
            e();
            b();
            return;
        }
        b bVar = new b(this);
        Iterator<i> it = this.M.iterator();
        while (it.hasNext()) {
            it.next().a((i.d) bVar);
        }
        this.O = this.M.size();
        if (!this.N) {
            for (int i2 = 1; i2 < this.M.size(); i2++) {
                this.M.get(i2 - 1).a((i.d) new a(this, this.M.get(i2)));
            }
            i iVar = this.M.get(0);
            if (iVar != null) {
                iVar.d();
                return;
            }
            return;
        }
        Iterator<i> it2 = this.M.iterator();
        while (it2.hasNext()) {
            it2.next().d();
        }
    }

    public i b(i.d dVar) {
        super.b(dVar);
        return this;
    }

    public void b(q qVar) {
        int size = this.M.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.M.get(i2).b(qVar);
        }
    }

    public void c(View view) {
        super.c(view);
        int size = this.M.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.M.get(i2).c(view);
        }
    }

    public i a(int i2) {
        if (i2 < 0 || i2 >= this.M.size()) {
            return null;
        }
        return this.M.get(i2);
    }

    public i a(TimeInterpolator timeInterpolator) {
        this.Q |= 1;
        ArrayList<i> arrayList = this.M;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.M.get(i2).a(timeInterpolator);
            }
        }
        this.f2276h = timeInterpolator;
        return this;
    }

    public i a(View view) {
        for (int i2 = 0; i2 < this.M.size(); i2++) {
            this.M.get(i2).a(view);
        }
        this.f2278j.add(view);
        return this;
    }

    public i a(i.d dVar) {
        super.a(dVar);
        return this;
    }

    public i a(long j2) {
        ArrayList<i> arrayList;
        this.f2275g = j2;
        if (j2 >= 0 && (arrayList = this.M) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.M.get(i2).a(j2);
            }
        }
        return this;
    }

    public void a(ViewGroup viewGroup, r rVar, r rVar2, ArrayList<q> arrayList, ArrayList<q> arrayList2) {
        long j2 = this.f2274f;
        int size = this.M.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.M.get(i2);
            if (j2 > 0 && (this.N || i2 == 0)) {
                long j3 = iVar.f2274f;
                if (j3 > 0) {
                    iVar.b(j3 + j2);
                } else {
                    iVar.b(j2);
                }
            }
            iVar.a(viewGroup, rVar, rVar2, arrayList, arrayList2);
        }
    }

    public void a(q qVar) {
        if (b(qVar.f2291b)) {
            Iterator<i> it = this.M.iterator();
            while (it.hasNext()) {
                i next = it.next();
                if (next.b(qVar.f2291b)) {
                    next.a(qVar);
                    qVar.c.add(next);
                }
            }
        }
    }

    public String a(String str) {
        String a2 = super.a(str);
        for (int i2 = 0; i2 < this.M.size(); i2++) {
            StringBuilder a3 = i.a.a.a.a.a(a2, "\n");
            a3.append(this.M.get(i2).a(str + "  "));
            a2 = a3.toString();
        }
        return a2;
    }

    public void a(e eVar) {
        if (eVar == null) {
            this.I = i.K;
        } else {
            this.I = eVar;
        }
        this.Q |= 4;
        if (this.M != null) {
            for (int i2 = 0; i2 < this.M.size(); i2++) {
                this.M.get(i2).a(eVar);
            }
        }
    }

    public void a(i.c cVar) {
        this.H = cVar;
        this.Q |= 8;
        int size = this.M.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.M.get(i2).a(cVar);
        }
    }

    public void a(n nVar) {
        this.G = nVar;
        this.Q |= 2;
        int size = this.M.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.M.get(i2).a(nVar);
        }
    }
}
