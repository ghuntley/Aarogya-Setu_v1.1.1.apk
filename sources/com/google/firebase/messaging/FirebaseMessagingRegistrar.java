package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.FirebaseApp;
import com.google.firebase.iid.FirebaseInstanceId;
import i.c.a.a.c;
import i.c.a.a.e;
import i.c.a.a.f;
import i.c.a.a.g;
import i.c.d.f.d;
import i.c.d.f.h;
import i.c.d.f.i;
import i.c.d.f.q;
import i.c.d.o.k;
import i.c.d.o.l;
import java.util.Arrays;
import java.util.List;

@Keep
/* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
public class FirebaseMessagingRegistrar implements i {

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
    public static class a implements g {
        public final <T> f<T> a(String str, Class<T> cls, i.c.a.a.b bVar, e<T, byte[]> eVar) {
            return new b((k) null);
        }
    }

    /* compiled from: com.google.firebase:firebase-messaging@@20.1.3 */
    public static class b<T> implements f<T> {
        public /* synthetic */ b(k kVar) {
        }

        public final void a(c<T> cVar) {
        }
    }

    @Keep
    public List<d<?>> getComponents() {
        d.b<FirebaseMessaging> a2 = d.a(FirebaseMessaging.class);
        a2.a(q.b(FirebaseApp.class));
        a2.a(q.b(FirebaseInstanceId.class));
        a2.a(q.a(g.class));
        a2.a((h<FirebaseMessaging>) l.a);
        a2.a(1);
        return Arrays.asList(new d[]{a2.a()});
    }
}
