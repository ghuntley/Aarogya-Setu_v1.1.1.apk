package h.b.o;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import h.b.i;

/* compiled from: ContextThemeWrapper */
public class c extends ContextWrapper {
    public int a;

    /* renamed from: b  reason: collision with root package name */
    public Resources.Theme f1209b;
    public LayoutInflater c;
    public Configuration d;
    public Resources e;

    public c() {
        super((Context) null);
    }

    public void a(Configuration configuration) {
        if (this.e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        } else if (this.d == null) {
            this.d = new Configuration(configuration);
        } else {
            throw new IllegalStateException("Override configuration has already been set");
        }
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    public Resources getResources() {
        if (this.e == null) {
            Configuration configuration = this.d;
            if (configuration == null) {
                this.e = super.getResources();
            } else {
                this.e = createConfigurationContext(configuration).getResources();
            }
        }
        return this.e;
    }

    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1209b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = i.Theme_AppCompat_Light;
        }
        a();
        return this.f1209b;
    }

    public void setTheme(int i2) {
        if (this.a != i2) {
            this.a = i2;
            a();
        }
    }

    public c(Context context, int i2) {
        super(context);
        this.a = i2;
    }

    public c(Context context, Resources.Theme theme) {
        super(context);
        this.f1209b = theme;
    }

    public final void a() {
        if (this.f1209b == null) {
            this.f1209b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f1209b.setTo(theme);
            }
        }
        this.f1209b.applyStyle(this.a, true);
    }
}
