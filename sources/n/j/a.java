package n.j;

/* compiled from: Thread.kt */
public final class a extends Thread {
    public final /* synthetic */ n.m.b.a e;

    public a(n.m.b.a aVar) {
        this.e = aVar;
    }

    public void run() {
        this.e.invoke();
    }
}
