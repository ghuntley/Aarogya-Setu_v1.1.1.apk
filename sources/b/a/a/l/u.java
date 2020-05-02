package b.a.a.l;

import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import n.h;
import n.m.b.a;
import n.m.c.g;

/* compiled from: CorUtility.kt */
public final class u extends g implements a<h> {
    public final /* synthetic */ TextView e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ SpannableStringBuilder f440f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u(TextView textView, SpannableStringBuilder spannableStringBuilder) {
        super(0);
        this.e = textView;
        this.f440f = spannableStringBuilder;
    }

    public Object invoke() {
        if (this.e.getContext() != null) {
            this.e.setText(this.f440f);
            this.e.setMovementMethod(LinkMovementMethod.getInstance());
        }
        return h.a;
    }
}
