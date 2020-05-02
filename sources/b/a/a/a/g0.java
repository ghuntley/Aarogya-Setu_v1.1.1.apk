package b.a.a.a;

import android.os.CountDownTimer;
import b.a.a.a.b0;

/* compiled from: LoginBottomSheet.kt */
public final class g0 extends CountDownTimer {
    public final /* synthetic */ b0.b a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(b0.b bVar, long j2, long j3) {
        super(j2, j3);
        this.a = bVar;
    }

    public void onFinish() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        r5 = r5.getRootView();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTick(long r5) {
        /*
            r4 = this;
            b.a.a.a.b0$b r0 = r4.a
            b.a.a.a.b0 r0 = r0.e
            boolean r0 = r0.t()
            if (r0 != 0) goto L_0x0016
            b.a.a.a.b0$b r5 = r4.a
            b.a.a.a.b0 r5 = r5.e
            android.os.CountDownTimer r5 = r5.J()
            r5.cancel()
            return
        L_0x0016:
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r5 = r0.convert(r5, r1)
            int r6 = (int) r5
            b.a.a.a.b0$b r5 = r4.a
            b.a.a.a.b0 r5 = r5.e
            android.view.View r5 = b.a.a.a.b0.a(r5)
            int r0 = b.a.a.e.otp_validation_layout
            android.view.View r5 = r5.findViewById(r0)
            if (r5 == 0) goto L_0x003e
            android.view.View r5 = r5.getRootView()
            if (r5 == 0) goto L_0x003e
            int r0 = b.a.a.e.retry_otp
            android.view.View r5 = r5.findViewById(r0)
            android.widget.Button r5 = (android.widget.Button) r5
            goto L_0x003f
        L_0x003e:
            r5 = 0
        L_0x003f:
            r0 = 1
            r1 = 0
            r2 = 60
            if (r5 == 0) goto L_0x004d
            if (r6 > r2) goto L_0x0049
            r3 = 1
            goto L_0x004a
        L_0x0049:
            r3 = 0
        L_0x004a:
            r5.setEnabled(r3)
        L_0x004d:
            if (r5 == 0) goto L_0x007e
            boolean r3 = r5.isEnabled()
            if (r3 != 0) goto L_0x007e
            int r3 = 120 - r6
            if (r3 >= r2) goto L_0x007e
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r3 = "00:"
            java.lang.StringBuilder r3 = i.a.a.a.a.a(r3)
            int r6 = r6 - r2
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r0[r1] = r6
            b.a.a.a.b0$b r6 = r4.a
            b.a.a.a.b0 r6 = r6.e
            android.content.Context r6 = r6.k()
            r1 = 2131755167(0x7f10009f, float:1.9141206E38)
            android.text.SpannableStringBuilder r6 = i.c.d.p.e.a((android.content.Context) r6, (int) r1, (java.lang.String[]) r0)
            r5.setText(r6)
            goto L_0x0092
        L_0x007e:
            if (r5 == 0) goto L_0x0092
            b.a.a.a.b0$b r6 = r4.a
            b.a.a.a.b0 r6 = r6.e
            android.content.Context r6 = r6.k()
            r0 = 2131755166(0x7f10009e, float:1.9141204E38)
            java.lang.String r6 = i.c.d.p.e.a((android.content.Context) r6, (int) r0)
            r5.setText(r6)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.a.a.a.g0.onTick(long):void");
    }
}
