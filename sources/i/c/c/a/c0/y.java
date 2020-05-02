package i.c.c.a.c0;

import i.c.a.b.d.l.q;
import i.c.c.a.c0.z;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* compiled from: EngineFactory */
public final class y<T_WRAPPER extends z<T_ENGINE>, T_ENGINE> {
    public static final Logger d = Logger.getLogger(y.class.getName());
    public static final List<Provider> e;

    /* renamed from: f  reason: collision with root package name */
    public static final y<z.a, Cipher> f4361f = new y<>(new z.a());

    /* renamed from: g  reason: collision with root package name */
    public static final y<z.e, Mac> f4362g = new y<>(new z.e());

    /* renamed from: h  reason: collision with root package name */
    public static final y<z.f, MessageDigest> f4363h = new y<>(new z.f());

    /* renamed from: i  reason: collision with root package name */
    public static final y<z.d, KeyPairGenerator> f4364i = new y<>(new z.d());

    /* renamed from: j  reason: collision with root package name */
    public static final y<z.c, KeyFactory> f4365j = new y<>(new z.c());
    public T_WRAPPER a;

    /* renamed from: b  reason: collision with root package name */
    public List<Provider> f4366b = e;
    public boolean c = true;

    static {
        if (q.e()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < 2; i2++) {
                String str = strArr[i2];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    d.info(String.format("Provider %s not available", new Object[]{str}));
                }
            }
            e = arrayList;
        } else {
            e = new ArrayList();
        }
        new y(new z.g());
        new y(new z.b());
    }

    public y(T_WRAPPER t_wrapper) {
        this.a = t_wrapper;
    }

    public T_ENGINE a(String str) {
        boolean z;
        for (Provider next : this.f4366b) {
            try {
                this.a.a(str, next);
                z = true;
                continue;
            } catch (Exception e2) {
                e2.printStackTrace();
                z = false;
                continue;
            }
            if (z) {
                return this.a.a(str, next);
            }
        }
        if (this.c) {
            return this.a.a(str, (Provider) null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }
}
