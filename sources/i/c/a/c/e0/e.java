package i.c.a.c.e0;

/* compiled from: CutCornerTreatment */
public class e extends d {
    public float a = -1.0f;

    public void a(m mVar, float f2, float f3, float f4) {
        mVar.a(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        double d = (double) f4;
        double d2 = (double) f3;
        mVar.a((float) (Math.sin(Math.toRadians((double) f2)) * d * d2), (float) (Math.sin(Math.toRadians((double) (90.0f - f2))) * d * d2));
    }
}
