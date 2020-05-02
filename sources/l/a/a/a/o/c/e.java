package l.a.a.a.o.c;

/* compiled from: Priority */
public enum e {
    LOW,
    NORMAL,
    HIGH,
    IMMEDIATE;

    public static <Y> int a(i iVar, Y y) {
        e eVar;
        if (y instanceof i) {
            eVar = ((i) y).getPriority();
        } else {
            eVar = NORMAL;
        }
        return eVar.ordinal() - iVar.getPriority().ordinal();
    }
}
