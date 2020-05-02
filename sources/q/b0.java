package q;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import o.a0;
import o.b0;
import o.f0;
import o.i0;
import o.v;
import o.x;
import o.y;
import p.g;

/* compiled from: RequestBuilder */
public final class b0 {

    /* renamed from: l  reason: collision with root package name */
    public static final char[] f5683l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: m  reason: collision with root package name */
    public static final Pattern f5684m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");
    public final String a;

    /* renamed from: b  reason: collision with root package name */
    public final y f5685b;
    @Nullable
    public String c;
    @Nullable
    public y.a d;
    public final f0.a e = new f0.a();

    /* renamed from: f  reason: collision with root package name */
    public final x.a f5686f;
    @Nullable

    /* renamed from: g  reason: collision with root package name */
    public a0 f5687g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f5688h;
    @Nullable

    /* renamed from: i  reason: collision with root package name */
    public b0.a f5689i;
    @Nullable

    /* renamed from: j  reason: collision with root package name */
    public v.a f5690j;
    @Nullable

    /* renamed from: k  reason: collision with root package name */
    public i0 f5691k;

    /* compiled from: RequestBuilder */
    public static class a extends i0 {
        public final i0 a;

        /* renamed from: b  reason: collision with root package name */
        public final a0 f5692b;

        public a(i0 i0Var, a0 a0Var) {
            this.a = i0Var;
            this.f5692b = a0Var;
        }

        public long a() {
            return this.a.a();
        }

        public a0 b() {
            return this.f5692b;
        }

        public void a(g gVar) {
            this.a.a(gVar);
        }
    }

    public b0(String str, y yVar, @Nullable String str2, @Nullable x xVar, @Nullable a0 a0Var, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.f5685b = yVar;
        this.c = str2;
        this.f5687g = a0Var;
        this.f5688h = z;
        if (xVar != null) {
            this.f5686f = xVar.a();
        } else {
            this.f5686f = new x.a();
        }
        if (z2) {
            this.f5690j = new v.a();
        } else if (z3) {
            b0.a aVar = new b0.a();
            this.f5689i = aVar;
            a0 a0Var2 = o.b0.f5253f;
            if (a0Var2 == null) {
                throw new NullPointerException("type == null");
            } else if (a0Var2.f5252b.equals("multipart")) {
                aVar.f5258b = a0Var2;
            } else {
                throw new IllegalArgumentException("multipart != " + a0Var2);
            }
        }
    }

    public void a(String str, String str2) {
        if ("Content-Type".equalsIgnoreCase(str)) {
            try {
                this.f5687g = a0.a(str2);
            } catch (IllegalArgumentException e2) {
                throw new IllegalArgumentException(i.a.a.a.a.b("Malformed content type: ", str2), e2);
            }
        } else {
            this.f5686f.a(str, str2);
        }
    }

    public void b(String str, @Nullable String str2, boolean z) {
        String str3 = this.c;
        String str4 = null;
        if (str3 != null) {
            y.a a2 = this.f5685b.a(str3);
            this.d = a2;
            if (a2 != null) {
                this.c = null;
            } else {
                StringBuilder a3 = i.a.a.a.a.a("Malformed URL. Base: ");
                a3.append(this.f5685b);
                a3.append(", Relative: ");
                a3.append(this.c);
                throw new IllegalArgumentException(a3.toString());
            }
        }
        if (z) {
            y.a aVar = this.d;
            if (aVar == null) {
                throw null;
            } else if (str != null) {
                if (aVar.f5630g == null) {
                    aVar.f5630g = new ArrayList();
                }
                aVar.f5630g.add(y.a(str, " \"'<>#&=", true, false, true, true));
                List<String> list = aVar.f5630g;
                if (str2 != null) {
                    str4 = y.a(str2, " \"'<>#&=", true, false, true, true);
                }
                list.add(str4);
            } else {
                throw new NullPointerException("encodedName == null");
            }
        } else {
            y.a aVar2 = this.d;
            if (aVar2 == null) {
                throw null;
            } else if (str != null) {
                if (aVar2.f5630g == null) {
                    aVar2.f5630g = new ArrayList();
                }
                aVar2.f5630g.add(y.a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
                List<String> list2 = aVar2.f5630g;
                if (str2 != null) {
                    str4 = y.a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
                }
                list2.add(str4);
            } else {
                throw new NullPointerException("name == null");
            }
        }
    }

    public void a(String str, String str2, boolean z) {
        if (z) {
            v.a aVar = this.f5690j;
            if (aVar == null) {
                throw null;
            } else if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                aVar.a.add(y.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, aVar.c));
                aVar.f5620b.add(y.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", true, false, true, true, aVar.c));
            } else {
                throw new NullPointerException("value == null");
            }
        } else {
            v.a aVar2 = this.f5690j;
            if (aVar2 == null) {
                throw null;
            } else if (str == null) {
                throw new NullPointerException("name == null");
            } else if (str2 != null) {
                aVar2.a.add(y.a(str, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, aVar2.c));
                aVar2.f5620b.add(y.a(str2, " \"':;<=>@[]^`{}|/\\?#&!$(),~", false, false, true, true, aVar2.c));
            } else {
                throw new NullPointerException("value == null");
            }
        }
    }

    public void a(x xVar, i0 i0Var) {
        b0.a aVar = this.f5689i;
        if (aVar == null) {
            throw null;
        } else if (i0Var == null) {
            throw new NullPointerException("body == null");
        } else if (xVar != null && xVar.a("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        } else if (xVar == null || xVar.a("Content-Length") == null) {
            aVar.c.add(new b0.b(xVar, i0Var));
        } else {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
    }
}
