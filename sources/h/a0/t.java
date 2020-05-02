package h.a0;

/* compiled from: WorkInfo */
public enum t {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public boolean f() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
