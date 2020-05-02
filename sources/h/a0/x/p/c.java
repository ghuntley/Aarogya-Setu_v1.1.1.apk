package h.a0.x.p;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import h.a0.h;
import h.a0.l;
import h.a0.x.j;
import h.a0.x.o.d;
import h.a0.x.q.p;
import h.a0.x.r.p.b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: SystemForegroundDispatcher */
public class c implements h.a0.x.o.c, h.a0.x.a {

    /* renamed from: p  reason: collision with root package name */
    public static final String f1039p = l.a("SystemFgDispatcher");
    public Context e;

    /* renamed from: f  reason: collision with root package name */
    public j f1040f;

    /* renamed from: g  reason: collision with root package name */
    public final h.a0.x.r.p.a f1041g;

    /* renamed from: h  reason: collision with root package name */
    public final Object f1042h = new Object();

    /* renamed from: i  reason: collision with root package name */
    public String f1043i;

    /* renamed from: j  reason: collision with root package name */
    public h f1044j;

    /* renamed from: k  reason: collision with root package name */
    public final Map<String, h> f1045k;

    /* renamed from: l  reason: collision with root package name */
    public final Map<String, p> f1046l;

    /* renamed from: m  reason: collision with root package name */
    public final Set<p> f1047m;

    /* renamed from: n  reason: collision with root package name */
    public final d f1048n;

    /* renamed from: o  reason: collision with root package name */
    public a f1049o;

    /* compiled from: SystemForegroundDispatcher */
    public interface a {
        void a(int i2);

        void a(int i2, int i3, Notification notification);

        void a(int i2, Notification notification);

        void stop();
    }

    public c(Context context) {
        this.e = context;
        j a2 = j.a(this.e);
        this.f1040f = a2;
        this.f1041g = a2.d;
        this.f1043i = null;
        this.f1044j = null;
        this.f1045k = new LinkedHashMap();
        this.f1047m = new HashSet();
        this.f1046l = new HashMap();
        this.f1048n = new d(this.e, this.f1041g, this);
        this.f1040f.f959f.a((h.a0.x.a) this);
    }

    public void a(String str, boolean z) {
        boolean remove;
        a aVar;
        Map.Entry entry;
        synchronized (this.f1042h) {
            p remove2 = this.f1046l.remove(str);
            remove = remove2 != null ? this.f1047m.remove(remove2) : false;
        }
        if (remove) {
            this.f1048n.a((Iterable<p>) this.f1047m);
        }
        this.f1044j = this.f1045k.remove(str);
        if (!str.equals(this.f1043i)) {
            h hVar = this.f1044j;
            if (hVar != null && (aVar = this.f1049o) != null) {
                aVar.a(hVar.a);
            }
        } else if (this.f1045k.size() > 0) {
            Iterator it = this.f1045k.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f1043i = (String) entry.getKey();
            if (this.f1049o != null) {
                h hVar2 = (h) entry.getValue();
                this.f1049o.a(hVar2.a, hVar2.f917b, hVar2.c);
                this.f1049o.a(hVar2.a);
            }
        }
    }

    public void a(List<String> list) {
    }

    public void b(List<String> list) {
        if (!list.isEmpty()) {
            for (String next : list) {
                l.a().a(f1039p, String.format("Constraints unmet for WorkSpec %s", new Object[]{next}), new Throwable[0]);
                j jVar = this.f1040f;
                h.a0.x.r.p.a aVar = jVar.d;
                ((b) aVar).a.execute(new h.a0.x.r.j(jVar, next, true));
            }
        }
    }

    public final void a(Intent intent) {
        int i2 = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        l.a().a(f1039p, String.format("Notifying with (id: %s, workSpecId: %s, notificationType: %s)", new Object[]{Integer.valueOf(intExtra), stringExtra, Integer.valueOf(intExtra2)}), new Throwable[0]);
        if (notification != null && this.f1049o != null) {
            this.f1045k.put(stringExtra, new h(intExtra, notification, intExtra2));
            if (TextUtils.isEmpty(this.f1043i)) {
                this.f1043i = stringExtra;
                this.f1049o.a(intExtra, intExtra2, notification);
                return;
            }
            this.f1049o.a(intExtra, notification);
            if (intExtra2 != 0 && Build.VERSION.SDK_INT >= 29) {
                for (Map.Entry<String, h> value : this.f1045k.entrySet()) {
                    i2 |= ((h) value.getValue()).f917b;
                }
                h hVar = this.f1045k.get(this.f1043i);
                if (hVar != null) {
                    this.f1049o.a(hVar.a, i2, hVar.c);
                }
            }
        }
    }
}
