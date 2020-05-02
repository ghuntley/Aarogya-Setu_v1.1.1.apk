package com.crashlytics.android.answers;

import com.crashlytics.android.answers.PredefinedEvent;
import i.a.a.a.a;
import java.util.Map;

public abstract class PredefinedEvent<T extends PredefinedEvent> extends AnswersEvent<T> {
    public final AnswersAttributes predefinedAttributes = new AnswersAttributes(this.validator);

    public Map<String, Object> getPredefinedAttributes() {
        return this.predefinedAttributes.attributes;
    }

    public abstract String getPredefinedType();

    public String toString() {
        StringBuilder a = a.a("{type:\"");
        a.append(getPredefinedType());
        a.append('\"');
        a.append(", predefinedAttributes:");
        a.append(this.predefinedAttributes);
        a.append(", customAttributes:");
        a.append(this.customAttributes);
        a.append("}");
        return a.toString();
    }
}
