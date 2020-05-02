package i.c.d;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import i.c.d.l.a;

/* compiled from: com.google.firebase:firebase-common@@19.3.0 */
public final /* synthetic */ class b implements a {
    public final FirebaseApp a;

    /* renamed from: b  reason: collision with root package name */
    public final Context f4635b;

    public b(FirebaseApp firebaseApp, Context context) {
        this.a = firebaseApp;
        this.f4635b = context;
    }

    public Object get() {
        return FirebaseApp.a(this.a, this.f4635b);
    }
}
