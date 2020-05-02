package i.c.d.d;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.abt.AbtException;
import i.c.d.e.a.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-abt@@19.0.1 */
public class b {
    public final a a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4643b;
    public Integer c = null;

    public b(a aVar, String str) {
        this.a = aVar;
        this.f4643b = str;
    }

    public final void a(Collection<a.C0130a> collection) {
        for (a.C0130a aVar : collection) {
            this.a.clearConditionalUserProperty(aVar.f4645b, (String) null, (Bundle) null);
        }
    }

    public void a(List<Map<String, String>> list) {
        String str;
        if (this.a == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Map<String, String> a2 : list) {
                arrayList.add(a.a(a2));
            }
            if (!arrayList.isEmpty()) {
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    hashSet.add(((a) it.next()).a);
                }
                List<a.C0130a> a3 = a();
                HashSet hashSet2 = new HashSet();
                for (a.C0130a aVar : a3) {
                    hashSet2.add(aVar.f4645b);
                }
                ArrayList arrayList2 = new ArrayList();
                for (a.C0130a next : a3) {
                    if (!hashSet.contains(next.f4645b)) {
                        arrayList2.add(next);
                    }
                }
                a((Collection<a.C0130a>) arrayList2);
                ArrayList arrayList3 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    a aVar2 = (a) it2.next();
                    if (!hashSet2.contains(aVar2.a)) {
                        arrayList3.add(aVar2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(a());
                if (this.c == null) {
                    this.c = Integer.valueOf(this.a.a(this.f4643b));
                }
                int intValue = this.c.intValue();
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    a aVar3 = (a) it3.next();
                    while (true) {
                        str = null;
                        if (arrayDeque.size() < intValue) {
                            break;
                        }
                        this.a.clearConditionalUserProperty(((a.C0130a) arrayDeque.pollFirst()).f4645b, (String) null, (Bundle) null);
                    }
                    String str2 = this.f4643b;
                    if (aVar3 != null) {
                        a.C0130a aVar4 = new a.C0130a();
                        aVar4.a = str2;
                        aVar4.f4653m = aVar3.d.getTime();
                        aVar4.f4645b = aVar3.a;
                        aVar4.c = aVar3.f4641b;
                        if (!TextUtils.isEmpty(aVar3.c)) {
                            str = aVar3.c;
                        }
                        aVar4.d = str;
                        aVar4.e = aVar3.e;
                        aVar4.f4650j = aVar3.f4642f;
                        this.a.a(aVar4);
                        arrayDeque.offer(aVar4);
                    } else {
                        throw null;
                    }
                }
            } else if (this.a != null) {
                a((Collection<a.C0130a>) a());
            } else {
                throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
            }
        } else {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
    }

    public final List<a.C0130a> a() {
        return this.a.a(this.f4643b, "");
    }
}
