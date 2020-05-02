package io.fabric.sdk.android.services.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.zip.GZIPInputStream;

public class HttpRequest {

    /* renamed from: i  reason: collision with root package name */
    public static c f5002i = c.a;
    public HttpURLConnection a = null;

    /* renamed from: b  reason: collision with root package name */
    public final URL f5003b;
    public final String c;
    public e d;
    public boolean e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f5004f = true;

    /* renamed from: g  reason: collision with root package name */
    public boolean f5005g = false;

    /* renamed from: h  reason: collision with root package name */
    public int f5006h = 8192;

    public static class HttpRequestException extends RuntimeException {
        public HttpRequestException(IOException iOException) {
            super(iOException);
        }

        public Throwable getCause() {
            return (IOException) super.getCause();
        }
    }

    public class a extends b<HttpRequest> {

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ InputStream f5007g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ OutputStream f5008h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(Closeable closeable, boolean z, InputStream inputStream, OutputStream outputStream) {
            super(closeable, z);
            this.f5007g = inputStream;
            this.f5008h = outputStream;
        }

        public Object b() {
            byte[] bArr = new byte[HttpRequest.this.f5006h];
            while (true) {
                int read = this.f5007g.read(bArr);
                if (read == -1) {
                    return HttpRequest.this;
                }
                this.f5008h.write(bArr, 0, read);
            }
        }
    }

    public static abstract class b<V> extends d<V> {
        public final Closeable e;

        /* renamed from: f  reason: collision with root package name */
        public final boolean f5010f;

        public b(Closeable closeable, boolean z) {
            this.e = closeable;
            this.f5010f = z;
        }

        public void a() {
            Closeable closeable = this.e;
            if (closeable instanceof Flushable) {
                ((Flushable) closeable).flush();
            }
            if (this.f5010f) {
                try {
                    this.e.close();
                } catch (IOException unused) {
                }
            } else {
                this.e.close();
            }
        }
    }

    public interface c {
        public static final c a = new a();

        public static class a implements c {
        }
    }

    public static abstract class d<V> implements Callable<V> {
        public abstract void a();

        public abstract V b();

        public V call() {
            boolean z;
            Throwable th;
            try {
                V b2 = b();
                try {
                    a();
                    return b2;
                } catch (IOException e) {
                    throw new HttpRequestException(e);
                }
            } catch (HttpRequestException e2) {
                throw e2;
            } catch (IOException e3) {
                throw new HttpRequestException(e3);
            } catch (Throwable th2) {
                th = th2;
                z = true;
                a();
                throw th;
            }
        }
    }

    public static class e extends BufferedOutputStream {
        public final CharsetEncoder e;

        public e(OutputStream outputStream, String str, int i2) {
            super(outputStream, i2);
            this.e = Charset.forName((str == null || str.length() <= 0) ? "UTF-8" : str).newEncoder();
        }

        public e b(String str) {
            ByteBuffer encode = this.e.encode(CharBuffer.wrap(str));
            super.write(encode.array(), 0, encode.limit());
            return this;
        }
    }

    public HttpRequest(CharSequence charSequence, String str) {
        try {
            this.f5003b = new URL(charSequence.toString());
            this.c = str;
        } catch (MalformedURLException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public static String a(CharSequence charSequence, Map<?, ?> map) {
        String charSequence2 = charSequence.toString();
        if (map == null || map.isEmpty()) {
            return charSequence2;
        }
        StringBuilder sb = new StringBuilder(charSequence2);
        if (charSequence2.indexOf(58) + 2 == charSequence2.lastIndexOf(47)) {
            sb.append('/');
        }
        int indexOf = charSequence2.indexOf(63);
        int length = sb.length() - 1;
        if (indexOf == -1) {
            sb.append('?');
        } else if (indexOf < length && charSequence2.charAt(length) != '&') {
            sb.append('&');
        }
        Iterator<Map.Entry<?, ?>> it = map.entrySet().iterator();
        Map.Entry next = it.next();
        sb.append(next.getKey().toString());
        sb.append('=');
        Object value = next.getValue();
        if (value != null) {
            sb.append(value);
        }
        while (it.hasNext()) {
            sb.append('&');
            Map.Entry next2 = it.next();
            sb.append(next2.getKey().toString());
            sb.append('=');
            Object value2 = next2.getValue();
            if (value2 != null) {
                sb.append(value2);
            }
        }
        return sb.toString();
    }

    public static String b(CharSequence charSequence) {
        int i2;
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                host = host + ':' + Integer.toString(port);
            }
            try {
                String aSCIIString = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
                int indexOf = aSCIIString.indexOf(63);
                if (indexOf <= 0 || (i2 = indexOf + 1) >= aSCIIString.length()) {
                    return aSCIIString;
                }
                return aSCIIString.substring(0, i2) + aSCIIString.substring(i2).replace("+", "%2B").replace("#", "%23");
            } catch (URISyntaxException e2) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e2);
                throw new HttpRequestException(iOException);
            }
        } catch (IOException e3) {
            throw new HttpRequestException(e3);
        }
    }

    public int c() {
        try {
            b();
            return d().getResponseCode();
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public HttpURLConnection d() {
        if (this.a == null) {
            try {
                c cVar = f5002i;
                URL url = this.f5003b;
                if (((c.a) cVar) != null) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestMethod(this.c);
                    this.a = httpURLConnection;
                } else {
                    throw null;
                }
            } catch (IOException e2) {
                throw new HttpRequestException(e2);
            }
        }
        return this.a;
    }

    public HttpRequest e() {
        if (this.d != null) {
            return this;
        }
        d().setDoOutput(true);
        this.d = new e(d().getOutputStream(), a(d().getRequestProperty("Content-Type"), "charset"), this.f5006h);
        return this;
    }

    public HttpRequest f() {
        if (!this.e) {
            this.e = true;
            d().setRequestProperty("Content-Type", "multipart/form-data; boundary=00content0boundary00");
            e();
            this.d.b("--00content0boundary00\r\n");
        } else {
            this.d.b("\r\n--00content0boundary00\r\n");
        }
        return this;
    }

    public String toString() {
        return d().getRequestMethod() + ' ' + d().getURL();
    }

    public HttpRequest c(String str, String str2) {
        try {
            f();
            a(str, (String) null, (String) null);
            this.d.b(str2);
            return this;
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public HttpRequest b(String str, String str2) {
        d().setRequestProperty(str, str2);
        return this;
    }

    public HttpRequest b() {
        e eVar = this.d;
        if (eVar == null) {
            return this;
        }
        if (this.e) {
            eVar.b("\r\n--00content0boundary00--\r\n");
        }
        if (this.f5004f) {
            try {
                this.d.close();
            } catch (IOException unused) {
            }
        } else {
            this.d.close();
        }
        this.d = null;
        return this;
    }

    public BufferedInputStream a() {
        GZIPInputStream gZIPInputStream;
        if (c() < 400) {
            try {
                gZIPInputStream = d().getInputStream();
            } catch (IOException e2) {
                throw new HttpRequestException(e2);
            }
        } else {
            gZIPInputStream = d().getErrorStream();
            if (gZIPInputStream == null) {
                try {
                    gZIPInputStream = d().getInputStream();
                } catch (IOException e3) {
                    throw new HttpRequestException(e3);
                }
            }
        }
        if (this.f5005g && "gzip".equals(a("Content-Encoding"))) {
            try {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream);
            } catch (IOException e4) {
                throw new HttpRequestException(e4);
            }
        }
        return new BufferedInputStream(gZIPInputStream, this.f5006h);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006f A[EDGE_INSN: B:30:0x006f->B:29:0x006f ?: BREAK  , SYNTHETIC] */
    public java.lang.String a(java.lang.String r9, java.lang.String r10) {
        /*
            r8 = this;
            r0 = 0
            if (r9 == 0) goto L_0x006f
            int r1 = r9.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x006f
        L_0x000a:
            int r1 = r9.length()
            r2 = 59
            int r3 = r9.indexOf(r2)
            r4 = 1
            int r3 = r3 + r4
            if (r3 == 0) goto L_0x006f
            if (r3 != r1) goto L_0x001b
            goto L_0x006f
        L_0x001b:
            int r5 = r9.indexOf(r2, r3)
            r6 = -1
            if (r5 != r6) goto L_0x0023
        L_0x0022:
            r5 = r1
        L_0x0023:
            if (r3 >= r5) goto L_0x006f
            r7 = 61
            int r7 = r9.indexOf(r7, r3)
            if (r7 == r6) goto L_0x0066
            if (r7 >= r5) goto L_0x0066
            java.lang.String r3 = r9.substring(r3, r7)
            java.lang.String r3 = r3.trim()
            boolean r3 = r10.equals(r3)
            if (r3 == 0) goto L_0x0066
            int r7 = r7 + 1
            java.lang.String r3 = r9.substring(r7, r5)
            java.lang.String r3 = r3.trim()
            int r7 = r3.length()
            if (r7 == 0) goto L_0x0066
            r9 = 2
            if (r7 <= r9) goto L_0x0065
            r9 = 0
            char r9 = r3.charAt(r9)
            r10 = 34
            if (r10 != r9) goto L_0x0065
            int r7 = r7 - r4
            char r9 = r3.charAt(r7)
            if (r10 != r9) goto L_0x0065
            java.lang.String r9 = r3.substring(r4, r7)
            return r9
        L_0x0065:
            return r3
        L_0x0066:
            int r3 = r5 + 1
            int r5 = r9.indexOf(r2, r3)
            if (r5 != r6) goto L_0x0023
            goto L_0x0022
        L_0x006f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.HttpRequest.a(java.lang.String, java.lang.String):java.lang.String");
    }

    public HttpRequest a(InputStream inputStream, OutputStream outputStream) {
        return (HttpRequest) new a(inputStream, this.f5004f, inputStream, outputStream).call();
    }

    public String a(String str) {
        try {
            b();
            return d().getHeaderField(str);
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    public HttpRequest a(String str, String str2, String str3) {
        StringBuilder a2 = i.a.a.a.a.a("form-data; name=\"", str);
        if (str2 != null) {
            a2.append("\"; filename=\"");
            a2.append(str2);
        }
        a2.append('\"');
        String sb = a2.toString();
        a((CharSequence) "Content-Disposition");
        a((CharSequence) ": ");
        a((CharSequence) sb);
        a((CharSequence) "\r\n");
        if (str3 != null) {
            a((CharSequence) "Content-Type");
            a((CharSequence) ": ");
            a((CharSequence) str3);
            a((CharSequence) "\r\n");
        }
        a((CharSequence) "\r\n");
        return this;
    }

    public HttpRequest a(String str, Number number) {
        String obj = number != null ? number.toString() : null;
        try {
            f();
            a(str, (String) null, (String) null);
            this.d.b(obj);
            return this;
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r4 = th;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0032 A[SYNTHETIC, Splitter:B:23:0x0032] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a A[ExcHandler: all (th java.lang.Throwable), Splitter:B:3:0x000b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public io.fabric.sdk.android.services.network.HttpRequest a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
        /*
            r3 = this;
            r0 = 0
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ IOException -> 0x0028 }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0028 }
            r2.<init>(r7)     // Catch:{ IOException -> 0x0028 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0028 }
            r3.f()     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            r3.a(r4, r5, r6)     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            io.fabric.sdk.android.services.network.HttpRequest$e r4 = r3.d     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            r3.a((java.io.InputStream) r1, (java.io.OutputStream) r4)     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            r1.close()     // Catch:{ IOException -> 0x0019 }
        L_0x0019:
            return r3
        L_0x001a:
            r4 = move-exception
            goto L_0x0030
        L_0x001c:
            r4 = move-exception
            io.fabric.sdk.android.services.network.HttpRequest$HttpRequestException r5 = new io.fabric.sdk.android.services.network.HttpRequest$HttpRequestException     // Catch:{ IOException -> 0x0023, all -> 0x001a }
            r5.<init>(r4)     // Catch:{ IOException -> 0x0023, all -> 0x001a }
            throw r5     // Catch:{ IOException -> 0x0023, all -> 0x001a }
        L_0x0023:
            r4 = move-exception
            r0 = r1
            goto L_0x0029
        L_0x0026:
            r4 = move-exception
            goto L_0x002f
        L_0x0028:
            r4 = move-exception
        L_0x0029:
            io.fabric.sdk.android.services.network.HttpRequest$HttpRequestException r5 = new io.fabric.sdk.android.services.network.HttpRequest$HttpRequestException     // Catch:{ all -> 0x0026 }
            r5.<init>(r4)     // Catch:{ all -> 0x0026 }
            throw r5     // Catch:{ all -> 0x0026 }
        L_0x002f:
            r1 = r0
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r1.close()     // Catch:{ IOException -> 0x0035 }
        L_0x0035:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: io.fabric.sdk.android.services.network.HttpRequest.a(java.lang.String, java.lang.String, java.lang.String, java.io.File):io.fabric.sdk.android.services.network.HttpRequest");
    }

    public HttpRequest a(CharSequence charSequence) {
        try {
            e();
            this.d.b(charSequence.toString());
            return this;
        } catch (IOException e2) {
            throw new HttpRequestException(e2);
        }
    }
}
