package i.c.a.c.o;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: BottomAppBar */
public class b extends FloatingActionButton.a {
    public final /* synthetic */ int a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f4170b;

    /* compiled from: BottomAppBar */
    public class a extends FloatingActionButton.a {
        public a() {
        }

        public void b(FloatingActionButton floatingActionButton) {
            BottomAppBar.a(b.this.f4170b);
        }
    }

    public b(BottomAppBar bottomAppBar, int i2) {
        this.f4170b = bottomAppBar;
        this.a = i2;
    }

    public void a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f4170b.b(this.a));
        floatingActionButton.b(new a(), true);
    }
}
