package i.c.e.t.y;

import com.google.gson.Gson;
import com.google.gson.internal.bind.ReflectiveTypeAdapterFactory;
import i.c.e.q;
import i.c.e.u.a;
import java.lang.reflect.Field;

/* compiled from: ReflectiveTypeAdapterFactory */
public class c extends ReflectiveTypeAdapterFactory.a {
    public final /* synthetic */ Field d;
    public final /* synthetic */ boolean e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ q f4893f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Gson f4894g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ a f4895h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ boolean f4896i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c(ReflectiveTypeAdapterFactory reflectiveTypeAdapterFactory, String str, boolean z, boolean z2, Field field, boolean z3, q qVar, Gson gson, a aVar, boolean z4) {
        super(str, z, z2);
        this.d = field;
        this.e = z3;
        this.f4893f = qVar;
        this.f4894g = gson;
        this.f4895h = aVar;
        this.f4896i = z4;
    }
}
