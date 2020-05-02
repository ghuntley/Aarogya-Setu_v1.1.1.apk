package i.c.c.a.x.a;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.google.protobuf.InvalidProtocolBufferException;
import i.c.a.b.d.l.q;
import i.c.c.a.c0.i0;
import i.c.c.a.h;
import i.c.c.a.i;
import i.c.c.a.j;
import i.c.c.a.z.d2;
import i.c.c.a.z.z1;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import javax.annotation.concurrent.GuardedBy;
import javax.crypto.KeyGenerator;

/* compiled from: AndroidKeysetManager */
public final class a {
    public final c a;

    /* renamed from: b  reason: collision with root package name */
    public final j f4375b;
    public final boolean c;
    public final i.c.c.a.a d;
    public final z1 e;
    @GuardedBy("this")

    /* renamed from: f  reason: collision with root package name */
    public i f4376f;

    /* compiled from: AndroidKeysetManager */
    public static final class b {
        public c a = null;

        /* renamed from: b  reason: collision with root package name */
        public j f4377b = null;
        public String c = null;
        public boolean d = true;
        public z1 e = null;

        public b a(Context context, String str, String str2) {
            if (context == null) {
                throw new IllegalArgumentException("need an Android context");
            } else if (str != null) {
                this.a = new c(context, str, str2);
                this.f4377b = new d(context, str, str2);
                return this;
            } else {
                throw new IllegalArgumentException("need a keyset name");
            }
        }
    }

    public /* synthetic */ a(b bVar, C0127a aVar) {
        i iVar;
        c cVar = bVar.a;
        this.a = cVar;
        if (cVar != null) {
            j jVar = bVar.f4377b;
            this.f4375b = jVar;
            if (jVar != null) {
                boolean z = bVar.d;
                this.c = z;
                if (!z || bVar.c != null) {
                    if (c()) {
                        String str = bVar.c;
                        String a2 = i0.a("android-keystore://", str);
                        KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                        instance.load((KeyStore.LoadStoreParameter) null);
                        if (!instance.containsAlias(a2)) {
                            String a3 = i0.a("android-keystore://", str);
                            KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                            instance2.init(new KeyGenParameterSpec.Builder(a3, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
                            instance2.generateKey();
                        }
                        if (Build.VERSION.SDK_INT >= 23) {
                            try {
                                this.d = new b(i0.a("android-keystore://", str));
                            } catch (IOException e2) {
                                throw new GeneralSecurityException(e2);
                            }
                        } else {
                            throw new GeneralSecurityException("needs Android Keystore on Android M or newer");
                        }
                    } else {
                        this.d = null;
                    }
                    this.e = bVar.e;
                    try {
                        iVar = b();
                    } catch (IOException e3) {
                        StringBuilder a4 = i.a.a.a.a.a("cannot read keyset: ");
                        a4.append(e3.toString());
                        Log.i("i.c.c.a.x.a.a", a4.toString());
                        if (this.e != null) {
                            iVar = new i((d2.b) d2.f4419k.e());
                            iVar.b(this.e);
                            try {
                                if (c()) {
                                    iVar.a().a(this.f4375b, this.d);
                                } else {
                                    h a5 = iVar.a();
                                    d dVar = (d) this.f4375b;
                                    dVar.a.putString(dVar.f4379b, q.c(a5.a.b())).apply();
                                }
                            } catch (IOException e4) {
                                throw new GeneralSecurityException(e4);
                            }
                        } else {
                            throw new GeneralSecurityException("cannot obtain keyset handle");
                        }
                    }
                    this.f4376f = iVar;
                    return;
                }
                throw new IllegalArgumentException("need a master key URI, please set it with Builder#masterKeyUri");
            }
            throw new IllegalArgumentException("need to specify where to write the keyset to with Builder#withSharedPref");
        }
        throw new IllegalArgumentException("need to specify where to read the keyset from with Builder#withSharedPref");
    }

    @GuardedBy("this")
    public synchronized h a() {
        return this.f4376f.a();
    }

    public final i b() {
        if (c()) {
            try {
                return new i((d2.b) h.a(this.a, this.d).a.e());
            } catch (InvalidProtocolBufferException | GeneralSecurityException e2) {
                StringBuilder a2 = i.a.a.a.a.a("cannot decrypt keyset: ");
                a2.append(e2.toString());
                Log.i("i.c.c.a.x.a.a", a2.toString());
            }
        }
        h a3 = h.a(d2.a(this.a.a()));
        if (c()) {
            a3.a(this.f4375b, this.d);
        }
        return new i((d2.b) a3.a.e());
    }

    public final boolean c() {
        return this.c && Build.VERSION.SDK_INT >= 23;
    }
}
