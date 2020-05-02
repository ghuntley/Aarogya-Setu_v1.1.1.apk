package o.o0.j;

import androidx.recyclerview.widget.RecyclerView;
import com.crashlytics.android.core.CodedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import o.o0.e;
import o.o0.j.c;
import o.o0.j.e;
import p.a0;
import p.b0;
import p.f;
import p.h;
import p.i;

/* compiled from: Http2Reader */
public final class k implements Closeable {

    /* renamed from: i  reason: collision with root package name */
    public static final Logger f5557i = Logger.getLogger(d.class.getName());
    public final h e;

    /* renamed from: f  reason: collision with root package name */
    public final a f5558f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5559g;

    /* renamed from: h  reason: collision with root package name */
    public final c.a f5560h;

    /* compiled from: Http2Reader */
    public static final class a implements a0 {
        public final h e;

        /* renamed from: f  reason: collision with root package name */
        public int f5561f;

        /* renamed from: g  reason: collision with root package name */
        public byte f5562g;

        /* renamed from: h  reason: collision with root package name */
        public int f5563h;

        /* renamed from: i  reason: collision with root package name */
        public int f5564i;

        /* renamed from: j  reason: collision with root package name */
        public short f5565j;

        public a(h hVar) {
            this.e = hVar;
        }

        public long b(f fVar, long j2) {
            int i2;
            int readInt;
            do {
                int i3 = this.f5564i;
                if (i3 == 0) {
                    this.e.skip((long) this.f5565j);
                    this.f5565j = 0;
                    if ((this.f5562g & 4) != 0) {
                        return -1;
                    }
                    i2 = this.f5563h;
                    int a = k.a(this.e);
                    this.f5564i = a;
                    this.f5561f = a;
                    byte readByte = (byte) (this.e.readByte() & 255);
                    this.f5562g = (byte) (this.e.readByte() & 255);
                    if (k.f5557i.isLoggable(Level.FINE)) {
                        k.f5557i.fine(d.a(true, this.f5563h, this.f5561f, readByte, this.f5562g));
                    }
                    readInt = this.e.readInt() & Integer.MAX_VALUE;
                    this.f5563h = readInt;
                    if (readByte != 9) {
                        d.b("%s != TYPE_CONTINUATION", Byte.valueOf(readByte));
                        throw null;
                    }
                } else {
                    long b2 = this.e.b(fVar, Math.min(j2, (long) i3));
                    if (b2 == -1) {
                        return -1;
                    }
                    this.f5564i = (int) (((long) this.f5564i) - b2);
                    return b2;
                }
            } while (readInt == i2);
            d.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            throw null;
        }

        public b0 c() {
            return this.e.c();
        }

        public void close() {
        }
    }

    /* compiled from: Http2Reader */
    public interface b {
    }

    public k(h hVar, boolean z) {
        this.e = hVar;
        this.f5559g = z;
        a aVar = new a(hVar);
        this.f5558f = aVar;
        this.f5560h = new c.a(CodedOutputStream.DEFAULT_BUFFER_SIZE, aVar);
    }

    public void a(b bVar) {
        if (!this.f5559g) {
            i b2 = this.e.b((long) d.a.h());
            if (f5557i.isLoggable(Level.FINE)) {
                f5557i.fine(e.a("<< CONNECTION %s", b2.g()));
            }
            if (!d.a.equals(b2)) {
                d.b("Expected a connection header but was %s", b2.m());
                throw null;
            }
        } else if (!a(true, bVar)) {
            d.b("Required SETTINGS preface not received", new Object[0]);
            throw null;
        }
    }

    public void close() {
        this.e.close();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v37, resolved type: short} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v53, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v54, resolved type: boolean} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(boolean r21, o.o0.j.k.b r22) {
        /*
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = 0
            p.h r3 = r0.e     // Catch:{ EOFException -> 0x0393 }
            r4 = 9
            r3.g(r4)     // Catch:{ EOFException -> 0x0393 }
            p.h r3 = r0.e
            int r3 = a((p.h) r3)
            r4 = 1
            r5 = 0
            if (r3 < 0) goto L_0x0385
            r6 = 16384(0x4000, float:2.2959E-41)
            if (r3 > r6) goto L_0x0385
            p.h r7 = r0.e
            byte r7 = r7.readByte()
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r7 = (byte) r7
            r8 = 4
            if (r21 == 0) goto L_0x0037
            if (r7 != r8) goto L_0x0029
            goto L_0x0037
        L_0x0029:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r7)
            r1[r2] = r3
            java.lang.String r2 = "Expected a SETTINGS frame but was %s"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x0037:
            p.h r9 = r0.e
            byte r9 = r9.readByte()
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            p.h r10 = r0.e
            int r10 = r10.readInt()
            r11 = 2147483647(0x7fffffff, float:NaN)
            r10 = r10 & r11
            java.util.logging.Logger r12 = f5557i
            java.util.logging.Level r13 = java.util.logging.Level.FINE
            boolean r12 = r12.isLoggable(r13)
            if (r12 == 0) goto L_0x005d
            java.util.logging.Logger r12 = f5557i
            java.lang.String r13 = o.o0.j.d.a(r4, r10, r3, r7, r9)
            r12.fine(r13)
        L_0x005d:
            r12 = 5
            r13 = 2
            r14 = 8
            switch(r7) {
                case 0: goto L_0x02c2;
                case 1: goto L_0x028b;
                case 2: goto L_0x026c;
                case 3: goto L_0x0201;
                case 4: goto L_0x0152;
                case 5: goto L_0x0121;
                case 6: goto L_0x00ef;
                case 7: goto L_0x00a2;
                case 8: goto L_0x006c;
                default: goto L_0x0064;
            }
        L_0x0064:
            p.h r1 = r0.e
            long r2 = (long) r3
            r1.skip(r2)
            goto L_0x0384
        L_0x006c:
            if (r3 != r8) goto L_0x0094
            p.h r3 = r0.e
            int r3 = r3.readInt()
            long r6 = (long) r3
            r8 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r6 = r6 & r8
            r8 = 0
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x0086
            o.o0.j.e$i r1 = (o.o0.j.e.i) r1
            r1.a((int) r10, (long) r6)
            goto L_0x0384
        L_0x0086:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r1[r2] = r3
            java.lang.String r2 = "windowSizeIncrement was 0"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x0094:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "TYPE_WINDOW_UPDATE length !=4: %s"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x00a2:
            if (r3 < r14) goto L_0x00e1
            if (r10 != 0) goto L_0x00d9
            p.h r6 = r0.e
            int r6 = r6.readInt()
            p.h r7 = r0.e
            int r7 = r7.readInt()
            int r3 = r3 - r14
            o.o0.j.a r8 = o.o0.j.a.a(r7)
            if (r8 == 0) goto L_0x00cb
            p.i r2 = p.i.f5648i
            if (r3 <= 0) goto L_0x00c4
            p.h r2 = r0.e
            long r9 = (long) r3
            p.i r2 = r2.b(r9)
        L_0x00c4:
            o.o0.j.e$i r1 = (o.o0.j.e.i) r1
            r1.a((int) r6, (o.o0.j.a) r8, (p.i) r2)
            goto L_0x0384
        L_0x00cb:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            r1[r2] = r3
            java.lang.String r2 = "TYPE_GOAWAY unexpected error code: %d"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x00d9:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_GOAWAY streamId != 0"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x00e1:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "TYPE_GOAWAY length < 8: %s"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x00ef:
            if (r3 != r14) goto L_0x0113
            if (r10 != 0) goto L_0x010b
            p.h r3 = r0.e
            int r3 = r3.readInt()
            p.h r5 = r0.e
            int r5 = r5.readInt()
            r6 = r9 & 1
            if (r6 == 0) goto L_0x0104
            r2 = 1
        L_0x0104:
            o.o0.j.e$i r1 = (o.o0.j.e.i) r1
            r1.a((boolean) r2, (int) r3, (int) r5)
            goto L_0x0384
        L_0x010b:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_PING streamId != 0"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x0113:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "TYPE_PING length != 8: %s"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x0121:
            if (r10 == 0) goto L_0x014a
            r5 = r9 & 8
            if (r5 == 0) goto L_0x0130
            p.h r2 = r0.e
            byte r2 = r2.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r2 = (short) r2
        L_0x0130:
            p.h r5 = r0.e
            int r5 = r5.readInt()
            r5 = r5 & r11
            int r3 = r3 + -4
            int r3 = a(r3, r9, r2)
            java.util.List r2 = r0.a(r3, r2, r9, r10)
            o.o0.j.e$i r1 = (o.o0.j.e.i) r1
            o.o0.j.e r1 = o.o0.j.e.this
            r1.a((int) r5, (java.util.List<o.o0.j.b>) r2)
            goto L_0x0384
        L_0x014a:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x0152:
            if (r10 != 0) goto L_0x01f9
            r7 = r9 & 1
            if (r7 == 0) goto L_0x0169
            if (r3 != 0) goto L_0x0161
            o.o0.j.e$i r1 = (o.o0.j.e.i) r1
            if (r1 == 0) goto L_0x0160
            goto L_0x0384
        L_0x0160:
            throw r5
        L_0x0161:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "FRAME_SIZE_ERROR ack frame should be empty!"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x0169:
            int r7 = r3 % 6
            if (r7 != 0) goto L_0x01eb
            o.o0.j.p r7 = new o.o0.j.p
            r7.<init>()
            r9 = 0
        L_0x0173:
            if (r9 >= r3) goto L_0x01c6
            p.h r10 = r0.e
            short r10 = r10.readShort()
            r11 = 65535(0xffff, float:9.1834E-41)
            r10 = r10 & r11
            p.h r11 = r0.e
            int r11 = r11.readInt()
            if (r10 == r13) goto L_0x01b3
            r14 = 3
            if (r10 == r14) goto L_0x01b1
            if (r10 == r8) goto L_0x01a5
            if (r10 == r12) goto L_0x018f
            goto L_0x01c0
        L_0x018f:
            if (r11 < r6) goto L_0x0197
            r14 = 16777215(0xffffff, float:2.3509886E-38)
            if (r11 > r14) goto L_0x0197
            goto L_0x01c0
        L_0x0197:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r11)
            r1[r2] = r3
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x01a5:
            r10 = 7
            if (r11 < 0) goto L_0x01a9
            goto L_0x01c0
        L_0x01a9:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x01b1:
            r10 = 4
            goto L_0x01c0
        L_0x01b3:
            if (r11 == 0) goto L_0x01c0
            if (r11 != r4) goto L_0x01b8
            goto L_0x01c0
        L_0x01b8:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x01c0:
            r7.a(r10, r11)
            int r9 = r9 + 6
            goto L_0x0173
        L_0x01c6:
            r18 = 0
            r15 = r1
            o.o0.j.e$i r15 = (o.o0.j.e.i) r15
            if (r15 == 0) goto L_0x01ea
            o.o0.j.e r1 = o.o0.j.e.this     // Catch:{ RejectedExecutionException -> 0x0384 }
            java.util.concurrent.ScheduledExecutorService r1 = r1.f5508l     // Catch:{ RejectedExecutionException -> 0x0384 }
            o.o0.j.i r3 = new o.o0.j.i     // Catch:{ RejectedExecutionException -> 0x0384 }
            java.lang.String r16 = "OkHttp %s ACK Settings"
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ RejectedExecutionException -> 0x0384 }
            o.o0.j.e r6 = o.o0.j.e.this     // Catch:{ RejectedExecutionException -> 0x0384 }
            java.lang.String r6 = r6.f5504h     // Catch:{ RejectedExecutionException -> 0x0384 }
            r5[r2] = r6     // Catch:{ RejectedExecutionException -> 0x0384 }
            r14 = r3
            r17 = r5
            r19 = r7
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ RejectedExecutionException -> 0x0384 }
            r1.execute(r3)     // Catch:{ RejectedExecutionException -> 0x0384 }
            goto L_0x0384
        L_0x01ea:
            throw r5
        L_0x01eb:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "TYPE_SETTINGS length %% 6 != 0: %s"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x01f9:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_SETTINGS streamId != 0"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x0201:
            if (r3 != r8) goto L_0x025e
            if (r10 == 0) goto L_0x0256
            p.h r3 = r0.e
            int r3 = r3.readInt()
            o.o0.j.a r6 = o.o0.j.a.a(r3)
            if (r6 == 0) goto L_0x0248
            o.o0.j.e$i r1 = (o.o0.j.e.i) r1
            o.o0.j.e r3 = o.o0.j.e.this
            boolean r3 = r3.c(r10)
            if (r3 == 0) goto L_0x023b
            o.o0.j.e r1 = o.o0.j.e.this
            o.o0.j.h r3 = new o.o0.j.h
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.String r5 = r1.f5504h
            r15[r2] = r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r15[r4] = r2
            java.lang.String r14 = "OkHttp %s Push Reset[%s]"
            r12 = r3
            r13 = r1
            r16 = r10
            r17 = r6
            r12.<init>(r13, r14, r15, r16, r17)
            r1.a((o.o0.d) r3)
            goto L_0x0384
        L_0x023b:
            o.o0.j.e r1 = o.o0.j.e.this
            o.o0.j.l r1 = r1.d(r10)
            if (r1 == 0) goto L_0x0384
            r1.b(r6)
            goto L_0x0384
        L_0x0248:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "TYPE_RST_STREAM unexpected error code: %d"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x0256:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_RST_STREAM streamId == 0"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x025e:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "TYPE_RST_STREAM length: %d != 4"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x026c:
            if (r3 != r12) goto L_0x027d
            if (r10 == 0) goto L_0x0275
            r0.a((o.o0.j.k.b) r1, (int) r10)
            goto L_0x0384
        L_0x0275:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "TYPE_PRIORITY streamId == 0"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x027d:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "TYPE_PRIORITY length: %d != 5"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x028b:
            if (r10 == 0) goto L_0x02ba
            r5 = r9 & 1
            if (r5 == 0) goto L_0x0293
            r5 = 1
            goto L_0x0294
        L_0x0293:
            r5 = 0
        L_0x0294:
            r6 = r9 & 8
            if (r6 == 0) goto L_0x02a1
            p.h r2 = r0.e
            byte r2 = r2.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            short r2 = (short) r2
        L_0x02a1:
            r6 = r9 & 32
            if (r6 == 0) goto L_0x02aa
            r0.a((o.o0.j.k.b) r1, (int) r10)
            int r3 = r3 + -5
        L_0x02aa:
            int r3 = a(r3, r9, r2)
            java.util.List r2 = r0.a(r3, r2, r9, r10)
            r3 = -1
            o.o0.j.e$i r1 = (o.o0.j.e.i) r1
            r1.a(r5, r10, r3, r2)
            goto L_0x0384
        L_0x02ba:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_HEADERS streamId == 0"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x02c2:
            if (r10 == 0) goto L_0x037c
            r6 = r9 & 1
            if (r6 == 0) goto L_0x02cb
            r19 = 1
            goto L_0x02cd
        L_0x02cb:
            r19 = 0
        L_0x02cd:
            r6 = r9 & 32
            if (r6 == 0) goto L_0x02d3
            r6 = 1
            goto L_0x02d4
        L_0x02d3:
            r6 = 0
        L_0x02d4:
            if (r6 != 0) goto L_0x0374
            r6 = r9 & 8
            if (r6 == 0) goto L_0x02e4
            p.h r6 = r0.e
            byte r6 = r6.readByte()
            r6 = r6 & 255(0xff, float:3.57E-43)
            short r6 = (short) r6
            goto L_0x02e5
        L_0x02e4:
            r6 = 0
        L_0x02e5:
            int r3 = a(r3, r9, r6)
            p.h r7 = r0.e
            o.o0.j.e$i r1 = (o.o0.j.e.i) r1
            o.o0.j.e r8 = o.o0.j.e.this
            boolean r8 = r8.c(r10)
            if (r8 == 0) goto L_0x0347
            o.o0.j.e r1 = o.o0.j.e.this
            if (r1 == 0) goto L_0x0346
            p.f r5 = new p.f
            r5.<init>()
            long r8 = (long) r3
            r7.g(r8)
            r7.b(r5, r8)
            long r11 = r5.f5646f
            int r7 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x032a
            o.o0.j.g r7 = new o.o0.j.g
            java.lang.Object[] r15 = new java.lang.Object[r13]
            java.lang.String r8 = r1.f5504h
            r15[r2] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r10)
            r15[r4] = r2
            java.lang.String r14 = "OkHttp %s Push Data[%s]"
            r12 = r7
            r13 = r1
            r16 = r10
            r17 = r5
            r18 = r3
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r1.a((o.o0.d) r7)
            goto L_0x036d
        L_0x032a:
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r4 = r5.f5646f
            r2.append(r4)
            java.lang.String r4 = " != "
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0346:
            throw r5
        L_0x0347:
            o.o0.j.e r2 = o.o0.j.e.this
            o.o0.j.l r2 = r2.b(r10)
            if (r2 != 0) goto L_0x0360
            o.o0.j.e r2 = o.o0.j.e.this
            o.o0.j.a r5 = o.o0.j.a.PROTOCOL_ERROR
            r2.a((int) r10, (o.o0.j.a) r5)
            o.o0.j.e r1 = o.o0.j.e.this
            long r2 = (long) r3
            r1.f(r2)
            r7.skip(r2)
            goto L_0x036d
        L_0x0360:
            o.o0.j.l$b r1 = r2.f5568g
            long r8 = (long) r3
            r1.a(r7, r8)
            if (r19 == 0) goto L_0x036d
            o.x r1 = o.o0.e.c
            r2.a((o.x) r1, (boolean) r4)
        L_0x036d:
            p.h r1 = r0.e
            long r2 = (long) r6
            r1.skip(r2)
            goto L_0x0384
        L_0x0374:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x037c:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            java.lang.String r2 = "PROTOCOL_ERROR: TYPE_DATA streamId == 0"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x0384:
            return r4
        L_0x0385:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r2] = r3
            java.lang.String r2 = "FRAME_SIZE_ERROR: %s"
            o.o0.j.d.b(r2, r1)
            throw r5
        L_0x0393:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.o0.j.k.a(boolean, o.o0.j.k$b):boolean");
    }

    public final List<b> a(int i2, short s, byte b2, int i3) {
        a aVar = this.f5558f;
        aVar.f5564i = i2;
        aVar.f5561f = i2;
        aVar.f5565j = s;
        aVar.f5562g = b2;
        aVar.f5563h = i3;
        c.a aVar2 = this.f5560h;
        while (!aVar2.f5492b.l()) {
            byte readByte = aVar2.f5492b.readByte() & 255;
            if (readByte == 128) {
                throw new IOException("index == 0");
            } else if ((readByte & 128) == 128) {
                int a2 = aVar2.a((int) readByte, 127) - 1;
                if (a2 >= 0 && a2 <= c.a.length + -1) {
                    aVar2.a.add(c.a[a2]);
                } else {
                    int a3 = aVar2.a(a2 - c.a.length);
                    if (a3 >= 0) {
                        b[] bVarArr = aVar2.e;
                        if (a3 < bVarArr.length) {
                            aVar2.a.add(bVarArr[a3]);
                        }
                    }
                    StringBuilder a4 = i.a.a.a.a.a("Header index too large ");
                    a4.append(a2 + 1);
                    throw new IOException(a4.toString());
                }
            } else if (readByte == 64) {
                i b3 = aVar2.b();
                c.a(b3);
                aVar2.a(-1, new b(b3, aVar2.b()));
            } else if ((readByte & 64) == 64) {
                aVar2.a(-1, new b(aVar2.c(aVar2.a((int) readByte, 63) - 1), aVar2.b()));
            } else if ((readByte & 32) == 32) {
                int a5 = aVar2.a((int) readByte, 31);
                aVar2.d = a5;
                if (a5 < 0 || a5 > aVar2.c) {
                    StringBuilder a6 = i.a.a.a.a.a("Invalid dynamic table size update ");
                    a6.append(aVar2.d);
                    throw new IOException(a6.toString());
                }
                int i4 = aVar2.f5495h;
                if (a5 < i4) {
                    if (a5 == 0) {
                        aVar2.a();
                    } else {
                        aVar2.b(i4 - a5);
                    }
                }
            } else if (readByte == 16 || readByte == 0) {
                i b4 = aVar2.b();
                c.a(b4);
                aVar2.a.add(new b(b4, aVar2.b()));
            } else {
                aVar2.a.add(new b(aVar2.c(aVar2.a((int) readByte, 15) - 1), aVar2.b()));
            }
        }
        c.a aVar3 = this.f5560h;
        if (aVar3 != null) {
            ArrayList arrayList = new ArrayList(aVar3.a);
            aVar3.a.clear();
            return arrayList;
        }
        throw null;
    }

    public final void a(b bVar, int i2) {
        int readInt = this.e.readInt() & RecyclerView.UNDEFINED_DURATION;
        this.e.readByte();
        if (((e.i) bVar) == null) {
            throw null;
        }
    }

    public static int a(h hVar) {
        return (hVar.readByte() & 255) | ((hVar.readByte() & 255) << 16) | ((hVar.readByte() & 255) << 8);
    }

    public static int a(int i2, byte b2, short s) {
        if ((b2 & 8) != 0) {
            i2--;
        }
        if (s <= i2) {
            return (short) (i2 - s);
        }
        d.b("PROTOCOL_ERROR padding %s > remaining length %s", Short.valueOf(s), Integer.valueOf(i2));
        throw null;
    }
}
