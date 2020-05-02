package i.b.a.n.m;

import com.bumptech.glide.load.engine.GlideException;
import h.h.l.c;
import i.a.a.a.a;
import i.b.a.n.g;
import i.b.a.n.l.e;
import i.b.a.n.m.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: LoadPath */
public class t<Data, ResourceType, Transcode> {
    public final c<List<Throwable>> a;

    /* renamed from: b  reason: collision with root package name */
    public final List<? extends j<Data, ResourceType, Transcode>> f2655b;
    public final String c;

    public t(Class<Data> cls, Class<ResourceType> cls2, Class<Transcode> cls3, List<j<Data, ResourceType, Transcode>> list, c<List<Throwable>> cVar) {
        this.a = cVar;
        if (!list.isEmpty()) {
            this.f2655b = list;
            StringBuilder a2 = a.a("Failed LoadPath{");
            a2.append(cls.getSimpleName());
            a2.append("->");
            a2.append(cls2.getSimpleName());
            a2.append("->");
            a2.append(cls3.getSimpleName());
            a2.append("}");
            this.c = a2.toString();
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    public v<Transcode> a(e<Data> eVar, g gVar, int i2, int i3, j.a<ResourceType> aVar) {
        v<Transcode> vVar;
        List<Throwable> a2 = this.a.a();
        g.a.a.b.a.a(a2, "Argument must not be null");
        List list = a2;
        try {
            int size = this.f2655b.size();
            vVar = null;
            for (int i4 = 0; i4 < size; i4++) {
                vVar = ((j) this.f2655b.get(i4)).a(eVar, i2, i3, gVar, aVar);
                if (vVar != null) {
                    break;
                }
            }
        } catch (GlideException e) {
            list.add(e);
        } catch (Throwable th) {
            this.a.a(list);
            throw th;
        }
        if (vVar != null) {
            this.a.a(list);
            return vVar;
        }
        throw new GlideException(this.c, (List<Throwable>) new ArrayList(list));
    }

    public String toString() {
        StringBuilder a2 = a.a("LoadPath{decodePaths=");
        a2.append(Arrays.toString(this.f2655b.toArray()));
        a2.append('}');
        return a2.toString();
    }
}
