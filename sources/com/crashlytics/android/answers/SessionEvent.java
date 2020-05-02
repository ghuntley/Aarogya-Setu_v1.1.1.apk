package com.crashlytics.android.answers;

import android.app.Activity;
import i.a.a.a.a;
import java.util.Collections;
import java.util.Map;

public final class SessionEvent {
    public static final String ACTIVITY_KEY = "activity";
    public static final String EXCEPTION_NAME_KEY = "exceptionName";
    public static final String INSTALLED_AT_KEY = "installedAt";
    public static final String SESSION_ID_KEY = "sessionId";
    public final Map<String, Object> customAttributes;
    public final String customType;
    public final Map<String, String> details;
    public final Map<String, Object> predefinedAttributes;
    public final String predefinedType;
    public final SessionEventMetadata sessionEventMetadata;
    public String stringRepresentation;
    public final long timestamp;
    public final Type type;

    public static class Builder {
        public Map<String, Object> customAttributes = null;
        public String customType = null;
        public Map<String, String> details = null;
        public Map<String, Object> predefinedAttributes = null;
        public String predefinedType = null;
        public final long timestamp = System.currentTimeMillis();
        public final Type type;

        public Builder(Type type2) {
            this.type = type2;
        }

        public SessionEvent build(SessionEventMetadata sessionEventMetadata) {
            return new SessionEvent(sessionEventMetadata, this.timestamp, this.type, this.details, this.customType, this.customAttributes, this.predefinedType, this.predefinedAttributes);
        }

        public Builder customAttributes(Map<String, Object> map) {
            this.customAttributes = map;
            return this;
        }

        public Builder customType(String str) {
            this.customType = str;
            return this;
        }

        public Builder details(Map<String, String> map) {
            this.details = map;
            return this;
        }

        public Builder predefinedAttributes(Map<String, Object> map) {
            this.predefinedAttributes = map;
            return this;
        }

        public Builder predefinedType(String str) {
            this.predefinedType = str;
            return this;
        }
    }

    public enum Type {
        START,
        RESUME,
        PAUSE,
        STOP,
        CRASH,
        INSTALL,
        CUSTOM,
        PREDEFINED
    }

    public static Builder crashEventBuilder(String str) {
        return new Builder(Type.CRASH).details(Collections.singletonMap(SESSION_ID_KEY, str));
    }

    public static Builder customEventBuilder(CustomEvent customEvent) {
        return new Builder(Type.CUSTOM).customType(customEvent.getCustomType()).customAttributes(customEvent.getCustomAttributes());
    }

    public static Builder installEventBuilder(long j2) {
        return new Builder(Type.INSTALL).details(Collections.singletonMap(INSTALLED_AT_KEY, String.valueOf(j2)));
    }

    public static Builder lifecycleEventBuilder(Type type2, Activity activity) {
        return new Builder(type2).details(Collections.singletonMap(ACTIVITY_KEY, activity.getClass().getName()));
    }

    public static Builder predefinedEventBuilder(PredefinedEvent<?> predefinedEvent) {
        return new Builder(Type.PREDEFINED).predefinedType(predefinedEvent.getPredefinedType()).predefinedAttributes(predefinedEvent.getPredefinedAttributes()).customAttributes(predefinedEvent.getCustomAttributes());
    }

    public String toString() {
        if (this.stringRepresentation == null) {
            StringBuilder a = a.a("[");
            a.append(SessionEvent.class.getSimpleName());
            a.append(": ");
            a.append("timestamp=");
            a.append(this.timestamp);
            a.append(", type=");
            a.append(this.type);
            a.append(", details=");
            a.append(this.details);
            a.append(", customType=");
            a.append(this.customType);
            a.append(", customAttributes=");
            a.append(this.customAttributes);
            a.append(", predefinedType=");
            a.append(this.predefinedType);
            a.append(", predefinedAttributes=");
            a.append(this.predefinedAttributes);
            a.append(", metadata=[");
            a.append(this.sessionEventMetadata);
            a.append("]]");
            this.stringRepresentation = a.toString();
        }
        return this.stringRepresentation;
    }

    public SessionEvent(SessionEventMetadata sessionEventMetadata2, long j2, Type type2, Map<String, String> map, String str, Map<String, Object> map2, String str2, Map<String, Object> map3) {
        this.sessionEventMetadata = sessionEventMetadata2;
        this.timestamp = j2;
        this.type = type2;
        this.details = map;
        this.customType = str;
        this.customAttributes = map2;
        this.predefinedType = str2;
        this.predefinedAttributes = map3;
    }

    public static Builder crashEventBuilder(String str, String str2) {
        return crashEventBuilder(str).customAttributes(Collections.singletonMap(EXCEPTION_NAME_KEY, str2));
    }
}
