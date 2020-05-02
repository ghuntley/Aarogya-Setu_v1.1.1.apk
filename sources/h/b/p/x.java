package h.b.p;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

/* compiled from: AppCompatTextClassifierHelper */
public final class x {
    public TextView a;

    /* renamed from: b  reason: collision with root package name */
    public TextClassifier f1491b;

    public x(TextView textView) {
        if (textView != null) {
            this.a = textView;
            return;
        }
        throw null;
    }

    public TextClassifier a() {
        TextClassifier textClassifier = this.f1491b;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) this.a.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
