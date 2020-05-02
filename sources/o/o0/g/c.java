package o.o0.g;

import i.a.a.a.a;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import o.c0;
import o.m;
import o.o;
import o.o0.e;

/* compiled from: ConnectionSpecSelector */
public final class c {
    public final List<o> a;

    /* renamed from: b  reason: collision with root package name */
    public int f5392b = 0;
    public boolean c;
    public boolean d;

    public c(List<o> list) {
        this.a = list;
    }

    public o a(SSLSocket sSLSocket) {
        o oVar;
        boolean z;
        String[] strArr;
        String[] strArr2;
        int i2 = this.f5392b;
        int size = this.a.size();
        while (true) {
            if (i2 >= size) {
                oVar = null;
                break;
            }
            oVar = this.a.get(i2);
            if (oVar.a(sSLSocket)) {
                this.f5392b = i2 + 1;
                break;
            }
            i2++;
        }
        if (oVar != null) {
            int i3 = this.f5392b;
            while (true) {
                if (i3 >= this.a.size()) {
                    z = false;
                    break;
                } else if (this.a.get(i3).a(sSLSocket)) {
                    z = true;
                    break;
                } else {
                    i3++;
                }
            }
            this.c = z;
            o.o0.c cVar = o.o0.c.a;
            boolean z2 = this.d;
            if (((c0.a) cVar) != null) {
                if (oVar.c != null) {
                    strArr = e.a((Comparator<? super String>) m.f5354b, sSLSocket.getEnabledCipherSuites(), oVar.c);
                } else {
                    strArr = sSLSocket.getEnabledCipherSuites();
                }
                if (oVar.d != null) {
                    strArr2 = e.a((Comparator<? super String>) e.f5384i, sSLSocket.getEnabledProtocols(), oVar.d);
                } else {
                    strArr2 = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                int a2 = e.a(m.f5354b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
                if (z2 && a2 != -1) {
                    String str = supportedCipherSuites[a2];
                    int length = strArr.length + 1;
                    String[] strArr3 = new String[length];
                    System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
                    strArr3[length - 1] = str;
                    strArr = strArr3;
                }
                o.a aVar = new o.a(oVar);
                aVar.a(strArr);
                aVar.b(strArr2);
                o oVar2 = new o(aVar);
                String[] strArr4 = oVar2.d;
                if (strArr4 != null) {
                    sSLSocket.setEnabledProtocols(strArr4);
                }
                String[] strArr5 = oVar2.c;
                if (strArr5 != null) {
                    sSLSocket.setEnabledCipherSuites(strArr5);
                }
                return oVar;
            }
            throw null;
        }
        StringBuilder a3 = a.a("Unable to find acceptable protocols. isFallback=");
        a3.append(this.d);
        a3.append(", modes=");
        a3.append(this.a);
        a3.append(", supported protocols=");
        a3.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(a3.toString());
    }
}
