package defpackage;

import android.view.View;

/* renamed from: d  reason: default package */
/* compiled from: java-style lambda group */
public final class d implements View.OnClickListener {
    public final /* synthetic */ int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f782f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ Object f783g;

    public d(int i2, Object obj, Object obj2) {
        this.e = i2;
        this.f782f = obj;
        this.f783g = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        r11 = r11.getEditText();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r11) {
        /*
            r10 = this;
            int r11 = r10.e
            java.lang.String r0 = "rootView.phone_number_va…layout.rootView.phone_num"
            java.lang.String r1 = "rootView.phone_number_validation_layout.rootView"
            java.lang.String r2 = "rootView.phone_number_validation_layout"
            java.lang.String r3 = "+91"
            java.lang.String r4 = "rootView.otp_validation_layout.rootView"
            java.lang.String r5 = "rootView.otp_validation_layout"
            r6 = 0
            java.lang.String r7 = "rootView"
            if (r11 == 0) goto L_0x033f
            r8 = 0
            r9 = 1
            if (r11 == r9) goto L_0x01ae
            r0 = 2
            if (r11 == r0) goto L_0x00fe
            r0 = 3
            if (r11 != r0) goto L_0x00fd
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.otp_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r5)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r4)
            int r0 = b.a.a.e.otp_layout
            android.view.View r11 = r11.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            if (r11 == 0) goto L_0x0049
            android.widget.EditText r11 = r11.getEditText()
            if (r11 == 0) goto L_0x0049
            android.text.Editable r11 = r11.getText()
            goto L_0x004a
        L_0x0049:
            r11 = r6
        L_0x004a:
            if (r11 == 0) goto L_0x0052
            int r11 = r11.length()
            if (r11 != 0) goto L_0x0053
        L_0x0052:
            r8 = 1
        L_0x0053:
            if (r8 == 0) goto L_0x00ad
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.otp_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r5)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r4)
            int r0 = b.a.a.e.otp_layout
            android.view.View r11 = r11.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            if (r11 == 0) goto L_0x0079
            r11.setErrorEnabled(r9)
        L_0x0079:
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.otp_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r5)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r4)
            int r0 = b.a.a.e.otp_layout
            android.view.View r11 = r11.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            if (r11 == 0) goto L_0x00fc
            java.lang.Object r0 = r10.f782f
            b.a.a.a.b0 r0 = (b.a.a.a.b0) r0
            android.content.Context r0 = r0.k()
            r1 = 2131755161(0x7f100099, float:1.9141193E38)
            java.lang.String r0 = i.c.d.p.e.a((android.content.Context) r0, (int) r1)
            r11.setError(r0)
            goto L_0x00fc
        L_0x00ad:
            java.lang.Object r11 = r10.f782f
            b.a.a.a.b0 r11 = (b.a.a.a.b0) r11
            android.view.View r11 = b.a.a.a.b0.a(r11)
            android.view.View r11 = r11.getRootView()
            java.lang.String r0 = "contentView.rootView"
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r0)
            int r0 = b.a.a.e.otp_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            java.lang.String r0 = "contentView.rootView.otp_validation_layout"
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r0)
            android.view.View r11 = r11.getRootView()
            java.lang.String r0 = "contentView.rootView.otp…alidation_layout.rootView"
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r0)
            int r0 = b.a.a.e.otp_layout
            android.view.View r11 = r11.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            java.lang.String r0 = "contentView.rootView.otp…ayout.rootView.otp_layout"
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r0)
            android.widget.EditText r11 = r11.getEditText()
            if (r11 == 0) goto L_0x00e9
            android.text.Editable r6 = r11.getText()
        L_0x00e9:
            java.lang.String r11 = java.lang.String.valueOf(r6)
            java.lang.CharSequence r11 = n.q.d.c(r11)
            java.lang.String r11 = r11.toString()
            java.lang.Object r0 = r10.f782f
            b.a.a.a.b0 r0 = (b.a.a.a.b0) r0
            b.a.a.a.b0.a((b.a.a.a.b0) r0, (java.lang.String) r11)
        L_0x00fc:
            return
        L_0x00fd:
            throw r6
        L_0x00fe:
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.otp_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r5)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r4)
            int r0 = b.a.a.e.progress_bar
            android.view.View r11 = r11.findViewById(r0)
            android.widget.ProgressBar r11 = (android.widget.ProgressBar) r11
            if (r11 == 0) goto L_0x0124
            r0 = 8
            r11.setVisibility(r0)
        L_0x0124:
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.otp_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r5)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r4)
            int r0 = b.a.a.e.otp_layout
            android.view.View r11 = r11.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            if (r11 == 0) goto L_0x0148
            r11.setErrorEnabled(r9)
        L_0x0148:
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.otp_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r5)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r4)
            int r0 = b.a.a.e.otp_layout
            android.view.View r11 = r11.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x0178
            int r1 = b.a.a.e.otp_edit_text
            android.view.View r11 = r11.findViewById(r1)
            com.google.android.material.textfield.TextInputEditText r11 = (com.google.android.material.textfield.TextInputEditText) r11
            if (r11 == 0) goto L_0x0178
            r11.setText(r0)
        L_0x0178:
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r1 = b.a.a.e.otp_validation_layout
            android.view.View r11 = r11.findViewById(r1)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r5)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r4)
            int r1 = b.a.a.e.otp_layout
            android.view.View r11 = r11.findViewById(r1)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            if (r11 == 0) goto L_0x019c
            r11.setError(r0)
        L_0x019c:
            java.lang.Object r11 = r10.f782f
            b.a.a.a.b0 r11 = (b.a.a.a.b0) r11
            b.a.a.m.a r11 = b.a.a.a.b0.b((b.a.a.a.b0) r11)
            h.o.r<java.lang.Boolean> r11 = r11.c
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r11.b(r0)
            return
        L_0x01ae:
            java.util.regex.Pattern r11 = android.util.Patterns.PHONE
            java.lang.Object r4 = r10.f783g
            android.view.View r4 = (android.view.View) r4
            n.m.c.f.a((java.lang.Object) r4, (java.lang.String) r7)
            int r5 = b.a.a.e.phone_number_validation_layout
            android.view.View r4 = r4.findViewById(r5)
            n.m.c.f.a((java.lang.Object) r4, (java.lang.String) r2)
            android.view.View r4 = r4.getRootView()
            n.m.c.f.a((java.lang.Object) r4, (java.lang.String) r1)
            int r5 = b.a.a.e.phone_num
            android.view.View r4 = r4.findViewById(r5)
            com.google.android.material.textfield.TextInputEditText r4 = (com.google.android.material.textfield.TextInputEditText) r4
            n.m.c.f.a((java.lang.Object) r4, (java.lang.String) r0)
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.CharSequence r4 = n.q.d.c(r4)
            java.lang.String r4 = r4.toString()
            java.util.regex.Matcher r11 = r11.matcher(r4)
            boolean r11 = r11.matches()
            if (r11 == 0) goto L_0x030b
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r4 = b.a.a.e.phone_number_validation_layout
            android.view.View r11 = r11.findViewById(r4)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r2)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r1)
            int r4 = b.a.a.e.phone_num
            android.view.View r11 = r11.findViewById(r4)
            com.google.android.material.textfield.TextInputEditText r11 = (com.google.android.material.textfield.TextInputEditText) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r0)
            android.text.Editable r11 = r11.getText()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.CharSequence r11 = n.q.d.c(r11)
            java.lang.String r11 = r11.toString()
            int r11 = r11.length()
            r0 = 10
            if (r11 != r0) goto L_0x030b
            b.a.a.l.o$a r11 = b.a.a.l.o.f436b
            java.lang.Object r0 = r10.f782f
            b.a.a.a.b0 r0 = (b.a.a.a.b0) r0
            android.content.Context r0 = r0.k()
            boolean r11 = r11.g(r0)
            if (r11 == 0) goto L_0x02ec
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.phone_number_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r2)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r1)
            int r0 = b.a.a.e.progress_bar
            android.view.View r11 = r11.findViewById(r0)
            android.widget.ProgressBar r11 = (android.widget.ProgressBar) r11
            if (r11 == 0) goto L_0x025a
            r11.setVisibility(r8)
        L_0x025a:
            java.lang.Object r11 = r10.f782f
            b.a.a.a.b0 r11 = (b.a.a.a.b0) r11
            b.a.a.m.a r11 = b.a.a.a.b0.b((b.a.a.a.b0) r11)
            h.o.r<java.lang.Boolean> r11 = r11.d
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r11.b(r0)
            java.lang.Object r11 = r10.f782f
            b.a.a.a.b0 r11 = (b.a.a.a.b0) r11
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.Object r3 = r10.f783g
            android.view.View r3 = (android.view.View) r3
            n.m.c.f.a((java.lang.Object) r3, (java.lang.String) r7)
            int r4 = b.a.a.e.phone_number_validation_layout
            android.view.View r3 = r3.findViewById(r4)
            n.m.c.f.a((java.lang.Object) r3, (java.lang.String) r2)
            android.view.View r3 = r3.getRootView()
            n.m.c.f.a((java.lang.Object) r3, (java.lang.String) r1)
            int r4 = b.a.a.e.phone_num
            android.view.View r3 = r3.findViewById(r4)
            com.google.android.material.textfield.TextInputEditText r3 = (com.google.android.material.textfield.TextInputEditText) r3
            if (r3 == 0) goto L_0x029d
            android.text.Editable r3 = r3.getText()
            goto L_0x029e
        L_0x029d:
            r3 = r6
        L_0x029e:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.CharSequence r3 = n.q.d.c(r3)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            if (r11 == 0) goto L_0x02eb
            r3 = 12
            java.lang.String r4 = "getOtp"
            java.lang.String r5 = "loginScreen"
            b.a.a.l.b.a(r4, r5, r6, r6, r3)
            b.a.a.l.h r3 = b.a.a.l.h.c
            b.a.a.a.d0 r4 = new b.a.a.a.d0
            r4.<init>(r11, r0)
            r3.a((java.lang.String) r0, (b.a.a.l.g0) r4)
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.phone_number_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r2)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r1)
            int r0 = b.a.a.e.phone_number_layout
            android.view.View r11 = r11.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            if (r11 == 0) goto L_0x033e
            r11.setError(r6)
            goto L_0x033e
        L_0x02eb:
            throw r6
        L_0x02ec:
            java.lang.Object r11 = r10.f782f
            b.a.a.a.b0 r11 = (b.a.a.a.b0) r11
            android.content.Context r11 = r11.k()
            java.lang.Object r0 = r10.f782f
            b.a.a.a.b0 r0 = (b.a.a.a.b0) r0
            android.content.Context r0 = r0.k()
            r1 = 2131755082(0x7f10004a, float:1.9141033E38)
            java.lang.String r0 = i.c.d.p.e.a((android.content.Context) r0, (int) r1)
            android.widget.Toast r11 = android.widget.Toast.makeText(r11, r0, r8)
            r11.show()
            goto L_0x033e
        L_0x030b:
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.phone_number_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r2)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r1)
            int r0 = b.a.a.e.phone_number_layout
            android.view.View r11 = r11.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            if (r11 == 0) goto L_0x033e
            java.lang.Object r0 = r10.f782f
            b.a.a.a.b0 r0 = (b.a.a.a.b0) r0
            android.content.Context r0 = r0.k()
            r1 = 2131755160(0x7f100098, float:1.9141191E38)
            java.lang.String r0 = i.c.d.p.e.a((android.content.Context) r0, (int) r1)
            r11.setError(r0)
        L_0x033e:
            return
        L_0x033f:
            java.lang.Object r11 = r10.f782f
            b.a.a.a.b0 r11 = (b.a.a.a.b0) r11
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r3)
            java.lang.Object r3 = r10.f783g
            android.view.View r3 = (android.view.View) r3
            n.m.c.f.a((java.lang.Object) r3, (java.lang.String) r7)
            int r9 = b.a.a.e.phone_number_validation_layout
            android.view.View r3 = r3.findViewById(r9)
            n.m.c.f.a((java.lang.Object) r3, (java.lang.String) r2)
            android.view.View r2 = r3.getRootView()
            n.m.c.f.a((java.lang.Object) r2, (java.lang.String) r1)
            int r1 = b.a.a.e.phone_num
            android.view.View r1 = r2.findViewById(r1)
            com.google.android.material.textfield.TextInputEditText r1 = (com.google.android.material.textfield.TextInputEditText) r1
            n.m.c.f.a((java.lang.Object) r1, (java.lang.String) r0)
            android.text.Editable r0 = r1.getText()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.CharSequence r0 = n.q.d.c(r0)
            java.lang.String r0 = r0.toString()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            android.os.CountDownTimer r1 = r11.J()
            r1.cancel()
            b.a.a.l.h r1 = b.a.a.l.h.c
            b.a.a.a.c0 r2 = new b.a.a.a.c0
            r2.<init>(r11)
            r1.a((java.lang.String) r0, (b.a.a.l.g0) r2)
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.otp_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r5)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r4)
            int r0 = b.a.a.e.otp_layout
            android.view.View r11 = r11.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            if (r11 == 0) goto L_0x03b9
            r11.setError(r6)
        L_0x03b9:
            java.lang.Object r11 = r10.f783g
            android.view.View r11 = (android.view.View) r11
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r7)
            int r0 = b.a.a.e.otp_validation_layout
            android.view.View r11 = r11.findViewById(r0)
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r5)
            android.view.View r11 = r11.getRootView()
            n.m.c.f.a((java.lang.Object) r11, (java.lang.String) r4)
            int r0 = b.a.a.e.otp_layout
            android.view.View r11 = r11.findViewById(r0)
            com.google.android.material.textfield.TextInputLayout r11 = (com.google.android.material.textfield.TextInputLayout) r11
            if (r11 == 0) goto L_0x03ec
            java.lang.Object r0 = r10.f782f
            b.a.a.a.b0 r0 = (b.a.a.a.b0) r0
            android.content.Context r0 = r0.k()
            r1 = 2131755196(0x7f1000bc, float:1.9141264E38)
            java.lang.String r0 = i.c.d.p.e.a((android.content.Context) r0, (int) r1)
            r11.setHelperText(r0)
        L_0x03ec:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d.onClick(android.view.View):void");
    }
}
