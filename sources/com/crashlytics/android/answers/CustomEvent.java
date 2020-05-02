package com.crashlytics.android.answers;

import i.a.a.a.a;

public class CustomEvent extends AnswersEvent<CustomEvent> {
    public final String eventName;

    public CustomEvent(String str) {
        if (str != null) {
            this.eventName = this.validator.limitStringLength(str);
            return;
        }
        throw new NullPointerException("eventName must not be null");
    }

    public String getCustomType() {
        return this.eventName;
    }

    public String toString() {
        StringBuilder a = a.a("{eventName:\"");
        a.append(this.eventName);
        a.append('\"');
        a.append(", customAttributes:");
        a.append(this.customAttributes);
        a.append("}");
        return a.toString();
    }
}
