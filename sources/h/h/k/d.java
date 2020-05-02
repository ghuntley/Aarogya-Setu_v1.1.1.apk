package h.h.k;

/* compiled from: TextDirectionHeuristicsCompat */
public final class d {
    public static final c a = new e((c) null, false);

    /* renamed from: b  reason: collision with root package name */
    public static final c f1804b = new e((c) null, true);
    public static final c c = new e(b.a, false);
    public static final c d = new e(b.a, true);

    /* compiled from: TextDirectionHeuristicsCompat */
    public static class a implements c {

        /* renamed from: b  reason: collision with root package name */
        public static final a f1805b = new a(true);
        public final boolean a;

        public a(boolean z) {
            this.a = z;
        }

        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            boolean z = false;
            while (i2 < i4) {
                int a2 = d.a(Character.getDirectionality(charSequence.charAt(i2)));
                if (a2 != 0) {
                    if (a2 != 1) {
                        continue;
                        i2++;
                    } else if (!this.a) {
                        return 1;
                    }
                } else if (this.a) {
                    return 0;
                }
                z = true;
                i2++;
            }
            if (z) {
                return this.a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    public static class b implements c {
        public static final b a = new b();

        public int a(CharSequence charSequence, int i2, int i3) {
            int i4 = i3 + i2;
            int i5 = 2;
            while (i2 < i4 && i5 == 2) {
                i5 = d.b(Character.getDirectionality(charSequence.charAt(i2)));
                i2++;
            }
            return i5;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    public interface c {
        int a(CharSequence charSequence, int i2, int i3);
    }

    /* renamed from: h.h.k.d$d  reason: collision with other inner class name */
    /* compiled from: TextDirectionHeuristicsCompat */
    public static abstract class C0049d implements c {
        public final c a;

        public C0049d(c cVar) {
            this.a = cVar;
        }

        public abstract boolean a();

        public boolean a(CharSequence charSequence, int i2, int i3) {
            if (charSequence == null || i2 < 0 || i3 < 0 || charSequence.length() - i3 < i2) {
                throw new IllegalArgumentException();
            }
            c cVar = this.a;
            if (cVar == null) {
                return a();
            }
            int a2 = cVar.a(charSequence, i2, i3);
            if (a2 == 0) {
                return true;
            }
            if (a2 != 1) {
                return a();
            }
            return false;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat */
    public static class e extends C0049d {

        /* renamed from: b  reason: collision with root package name */
        public final boolean f1806b;

        public e(c cVar, boolean z) {
            super(cVar);
            this.f1806b = z;
        }

        public boolean a() {
            return this.f1806b;
        }
    }

    static {
        a aVar = a.f1805b;
    }

    public static int a(int i2) {
        if (i2 != 0) {
            return (i2 == 1 || i2 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int b(int i2) {
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2) {
                return 0;
            }
            switch (i2) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
