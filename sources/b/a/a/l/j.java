package b.a.a.l;

import n.h;
import n.m.c.g;
import nic.goi.aarogyasetu.models.network.TokenValidationResponse;
import o.l0;
import q.d;
import q.d0;
import q.f;

/* compiled from: AuthUtility.kt */
public final class j implements f<TokenValidationResponse> {
    public final /* synthetic */ h0 a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f433b;

    /* compiled from: AuthUtility.kt */
    public static final class a extends g implements n.m.b.a<h> {
        public final /* synthetic */ j e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ String f434f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(j jVar, String str) {
            super(0);
            this.e = jVar;
            this.f434f = str;
        }

        public Object invoke() {
            h0 h0Var = this.e.a;
            if (h0Var != null) {
                h0Var.a(this.f434f);
            }
            return h.a;
        }
    }

    public j(h0 h0Var, String str) {
        this.a = h0Var;
        this.f433b = str;
    }

    public void a(d<TokenValidationResponse> dVar, Throwable th) {
        if (dVar == null) {
            n.m.c.f.a("call");
            throw null;
        } else if (th != null) {
            h.a(h.c, this.a, new Exception(th), new e());
        } else {
            n.m.c.f.a("t");
            throw null;
        }
    }

    public void a(d<TokenValidationResponse> dVar, d0<TokenValidationResponse> d0Var) {
        String str = null;
        if (dVar == null) {
            n.m.c.f.a("call");
            throw null;
        } else if (d0Var != null) {
            if (d0Var.a()) {
                TokenValidationResponse tokenValidationResponse = (TokenValidationResponse) d0Var.f5713b;
                String authToken = tokenValidationResponse != null ? tokenValidationResponse.getAuthToken() : null;
                boolean z = true;
                if (!(authToken == null || n.q.d.b(authToken))) {
                    TokenValidationResponse tokenValidationResponse2 = (TokenValidationResponse) d0Var.f5713b;
                    String refreshToken = tokenValidationResponse2 != null ? tokenValidationResponse2.getRefreshToken() : null;
                    if (refreshToken != null && !n.q.d.b(refreshToken)) {
                        z = false;
                    }
                    if (!z) {
                        T t = d0Var.f5713b;
                        if (t != null) {
                            n.m.c.f.a((Object) t, "response.body()!!");
                            String authToken2 = ((TokenValidationResponse) t).getAuthToken();
                            T t2 = d0Var.f5713b;
                            if (t2 != null) {
                                n.m.c.f.a((Object) t2, "response.body()!!");
                                String refreshToken2 = ((TokenValidationResponse) t2).getRefreshToken();
                                h.c(authToken2);
                                h.b(refreshToken2);
                                h.c.a(this.f433b);
                                c.c.a(new a(this, authToken2));
                                return;
                            }
                            n.m.c.f.a();
                            throw null;
                        }
                        n.m.c.f.a();
                        throw null;
                    }
                }
            }
            int i2 = d0Var.a.f5326g;
            if (i2 == 400) {
                StringBuilder a2 = i.a.a.a.a.a("Api Response is not success. Invalid OTP = ");
                l0 l0Var = d0Var.c;
                if (l0Var != null) {
                    str = l0Var.j();
                }
                a2.append(str);
                h.a(h.c, this.a, new Exception(a2.toString()), new e());
            } else if (i2 == 401) {
                StringBuilder a3 = i.a.a.a.a.a("Api Response is not success. Response = ");
                l0 l0Var2 = d0Var.c;
                if (l0Var2 != null) {
                    str = l0Var2.j();
                }
                a3.append(str);
                h.a(h.c, this.a, new Exception(a3.toString()), new g());
            } else {
                StringBuilder a4 = i.a.a.a.a.a("Api Response is not success. Response = ");
                l0 l0Var3 = d0Var.c;
                if (l0Var3 != null) {
                    str = l0Var3.j();
                }
                a4.append(str);
                h.a(h.c, this.a, new Exception(a4.toString()), new f());
            }
        } else {
            n.m.c.f.a("response");
            throw null;
        }
    }
}
