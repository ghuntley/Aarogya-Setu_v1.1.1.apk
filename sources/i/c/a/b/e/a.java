package i.c.a.b.e;

import android.os.IBinder;
import android.os.IInterface;
import i.c.a.b.g.d.b;

/* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
public interface a extends IInterface {

    /* renamed from: i.c.a.b.e.a$a  reason: collision with other inner class name */
    /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
    public static abstract class C0113a extends i.c.a.b.g.d.a implements a {

        /* renamed from: i.c.a.b.e.a$a$a  reason: collision with other inner class name */
        /* compiled from: com.google.android.gms:play-services-basement@@17.1.0 */
        public static class C0114a extends b implements a {
            public C0114a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
            }
        }

        public C0113a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static a a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            if (queryLocalInterface instanceof a) {
                return (a) queryLocalInterface;
            }
            return new C0114a(iBinder);
        }
    }
}
