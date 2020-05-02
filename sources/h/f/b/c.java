package h.f.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import h.f.b.d;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: ConstraintSet */
public class c {

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f1684b = {0, 4, 8};
    public static SparseIntArray c;
    public HashMap<Integer, a> a = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.append(g.ConstraintSet_layout_constraintLeft_toLeftOf, 25);
        c.append(g.ConstraintSet_layout_constraintLeft_toRightOf, 26);
        c.append(g.ConstraintSet_layout_constraintRight_toLeftOf, 29);
        c.append(g.ConstraintSet_layout_constraintRight_toRightOf, 30);
        c.append(g.ConstraintSet_layout_constraintTop_toTopOf, 36);
        c.append(g.ConstraintSet_layout_constraintTop_toBottomOf, 35);
        c.append(g.ConstraintSet_layout_constraintBottom_toTopOf, 4);
        c.append(g.ConstraintSet_layout_constraintBottom_toBottomOf, 3);
        c.append(g.ConstraintSet_layout_constraintBaseline_toBaselineOf, 1);
        c.append(g.ConstraintSet_layout_editor_absoluteX, 6);
        c.append(g.ConstraintSet_layout_editor_absoluteY, 7);
        c.append(g.ConstraintSet_layout_constraintGuide_begin, 17);
        c.append(g.ConstraintSet_layout_constraintGuide_end, 18);
        c.append(g.ConstraintSet_layout_constraintGuide_percent, 19);
        c.append(g.ConstraintSet_android_orientation, 27);
        c.append(g.ConstraintSet_layout_constraintStart_toEndOf, 32);
        c.append(g.ConstraintSet_layout_constraintStart_toStartOf, 33);
        c.append(g.ConstraintSet_layout_constraintEnd_toStartOf, 10);
        c.append(g.ConstraintSet_layout_constraintEnd_toEndOf, 9);
        c.append(g.ConstraintSet_layout_goneMarginLeft, 13);
        c.append(g.ConstraintSet_layout_goneMarginTop, 16);
        c.append(g.ConstraintSet_layout_goneMarginRight, 14);
        c.append(g.ConstraintSet_layout_goneMarginBottom, 11);
        c.append(g.ConstraintSet_layout_goneMarginStart, 15);
        c.append(g.ConstraintSet_layout_goneMarginEnd, 12);
        c.append(g.ConstraintSet_layout_constraintVertical_weight, 40);
        c.append(g.ConstraintSet_layout_constraintHorizontal_weight, 39);
        c.append(g.ConstraintSet_layout_constraintHorizontal_chainStyle, 41);
        c.append(g.ConstraintSet_layout_constraintVertical_chainStyle, 42);
        c.append(g.ConstraintSet_layout_constraintHorizontal_bias, 20);
        c.append(g.ConstraintSet_layout_constraintVertical_bias, 37);
        c.append(g.ConstraintSet_layout_constraintDimensionRatio, 5);
        c.append(g.ConstraintSet_layout_constraintLeft_creator, 75);
        c.append(g.ConstraintSet_layout_constraintTop_creator, 75);
        c.append(g.ConstraintSet_layout_constraintRight_creator, 75);
        c.append(g.ConstraintSet_layout_constraintBottom_creator, 75);
        c.append(g.ConstraintSet_layout_constraintBaseline_creator, 75);
        c.append(g.ConstraintSet_android_layout_marginLeft, 24);
        c.append(g.ConstraintSet_android_layout_marginRight, 28);
        c.append(g.ConstraintSet_android_layout_marginStart, 31);
        c.append(g.ConstraintSet_android_layout_marginEnd, 8);
        c.append(g.ConstraintSet_android_layout_marginTop, 34);
        c.append(g.ConstraintSet_android_layout_marginBottom, 2);
        c.append(g.ConstraintSet_android_layout_width, 23);
        c.append(g.ConstraintSet_android_layout_height, 21);
        c.append(g.ConstraintSet_android_visibility, 22);
        c.append(g.ConstraintSet_android_alpha, 43);
        c.append(g.ConstraintSet_android_elevation, 44);
        c.append(g.ConstraintSet_android_rotationX, 45);
        c.append(g.ConstraintSet_android_rotationY, 46);
        c.append(g.ConstraintSet_android_rotation, 60);
        c.append(g.ConstraintSet_android_scaleX, 47);
        c.append(g.ConstraintSet_android_scaleY, 48);
        c.append(g.ConstraintSet_android_transformPivotX, 49);
        c.append(g.ConstraintSet_android_transformPivotY, 50);
        c.append(g.ConstraintSet_android_translationX, 51);
        c.append(g.ConstraintSet_android_translationY, 52);
        c.append(g.ConstraintSet_android_translationZ, 53);
        c.append(g.ConstraintSet_layout_constraintWidth_default, 54);
        c.append(g.ConstraintSet_layout_constraintHeight_default, 55);
        c.append(g.ConstraintSet_layout_constraintWidth_max, 56);
        c.append(g.ConstraintSet_layout_constraintHeight_max, 57);
        c.append(g.ConstraintSet_layout_constraintWidth_min, 58);
        c.append(g.ConstraintSet_layout_constraintHeight_min, 59);
        c.append(g.ConstraintSet_layout_constraintCircle, 61);
        c.append(g.ConstraintSet_layout_constraintCircleRadius, 62);
        c.append(g.ConstraintSet_layout_constraintCircleAngle, 63);
        c.append(g.ConstraintSet_android_id, 38);
        c.append(g.ConstraintSet_layout_constraintWidth_percent, 69);
        c.append(g.ConstraintSet_layout_constraintHeight_percent, 70);
        c.append(g.ConstraintSet_chainUseRtl, 71);
        c.append(g.ConstraintSet_barrierDirection, 72);
        c.append(g.ConstraintSet_constraint_referenced_ids, 73);
        c.append(g.ConstraintSet_barrierAllowsGoneWidgets, 74);
    }

    public void a(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a a2 = a(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        a2.a = true;
                    }
                    this.a.put(Integer.valueOf(a2.d), a2);
                }
            }
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public final a a(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.ConstraintSet);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = c.get(index);
            switch (i3) {
                case 1:
                    int resourceId = obtainStyledAttributes.getResourceId(index, aVar.f1696p);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f1696p = resourceId;
                    break;
                case 2:
                    aVar.G = obtainStyledAttributes.getDimensionPixelSize(index, aVar.G);
                    break;
                case 3:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, aVar.f1695o);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f1695o = resourceId2;
                    break;
                case 4:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, aVar.f1694n);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f1694n = resourceId3;
                    break;
                case 5:
                    aVar.w = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    aVar.A = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.A);
                    break;
                case 7:
                    aVar.B = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.B);
                    break;
                case 8:
                    aVar.H = obtainStyledAttributes.getDimensionPixelSize(index, aVar.H);
                    break;
                case 9:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, aVar.t);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.t = resourceId4;
                    break;
                case 10:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, aVar.s);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.s = resourceId5;
                    break;
                case 11:
                    aVar.N = obtainStyledAttributes.getDimensionPixelSize(index, aVar.N);
                    break;
                case 12:
                    aVar.O = obtainStyledAttributes.getDimensionPixelSize(index, aVar.O);
                    break;
                case 13:
                    aVar.K = obtainStyledAttributes.getDimensionPixelSize(index, aVar.K);
                    break;
                case 14:
                    aVar.M = obtainStyledAttributes.getDimensionPixelSize(index, aVar.M);
                    break;
                case 15:
                    aVar.P = obtainStyledAttributes.getDimensionPixelSize(index, aVar.P);
                    break;
                case 16:
                    aVar.L = obtainStyledAttributes.getDimensionPixelSize(index, aVar.L);
                    break;
                case 17:
                    aVar.e = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.e);
                    break;
                case 18:
                    aVar.f1686f = obtainStyledAttributes.getDimensionPixelOffset(index, aVar.f1686f);
                    break;
                case 19:
                    aVar.f1687g = obtainStyledAttributes.getFloat(index, aVar.f1687g);
                    break;
                case 20:
                    aVar.u = obtainStyledAttributes.getFloat(index, aVar.u);
                    break;
                case 21:
                    aVar.c = obtainStyledAttributes.getLayoutDimension(index, aVar.c);
                    break;
                case 22:
                    int i4 = obtainStyledAttributes.getInt(index, aVar.J);
                    aVar.J = i4;
                    aVar.J = f1684b[i4];
                    break;
                case 23:
                    aVar.f1685b = obtainStyledAttributes.getLayoutDimension(index, aVar.f1685b);
                    break;
                case 24:
                    aVar.D = obtainStyledAttributes.getDimensionPixelSize(index, aVar.D);
                    break;
                case 25:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, aVar.f1688h);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f1688h = resourceId6;
                    break;
                case 26:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, aVar.f1689i);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f1689i = resourceId7;
                    break;
                case 27:
                    aVar.C = obtainStyledAttributes.getInt(index, aVar.C);
                    break;
                case 28:
                    aVar.E = obtainStyledAttributes.getDimensionPixelSize(index, aVar.E);
                    break;
                case 29:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, aVar.f1690j);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f1690j = resourceId8;
                    break;
                case 30:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, aVar.f1691k);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f1691k = resourceId9;
                    break;
                case 31:
                    aVar.I = obtainStyledAttributes.getDimensionPixelSize(index, aVar.I);
                    break;
                case 32:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, aVar.f1697q);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f1697q = resourceId10;
                    break;
                case 33:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, aVar.r);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.r = resourceId11;
                    break;
                case 34:
                    aVar.F = obtainStyledAttributes.getDimensionPixelSize(index, aVar.F);
                    break;
                case 35:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, aVar.f1693m);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f1693m = resourceId12;
                    break;
                case 36:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, aVar.f1692l);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    aVar.f1692l = resourceId13;
                    break;
                case 37:
                    aVar.v = obtainStyledAttributes.getFloat(index, aVar.v);
                    break;
                case 38:
                    aVar.d = obtainStyledAttributes.getResourceId(index, aVar.d);
                    break;
                case 39:
                    aVar.R = obtainStyledAttributes.getFloat(index, aVar.R);
                    break;
                case 40:
                    aVar.Q = obtainStyledAttributes.getFloat(index, aVar.Q);
                    break;
                case 41:
                    aVar.S = obtainStyledAttributes.getInt(index, aVar.S);
                    break;
                case 42:
                    aVar.T = obtainStyledAttributes.getInt(index, aVar.T);
                    break;
                case 43:
                    aVar.U = obtainStyledAttributes.getFloat(index, aVar.U);
                    break;
                case 44:
                    aVar.V = true;
                    aVar.W = obtainStyledAttributes.getDimension(index, aVar.W);
                    break;
                case 45:
                    aVar.Y = obtainStyledAttributes.getFloat(index, aVar.Y);
                    break;
                case 46:
                    aVar.Z = obtainStyledAttributes.getFloat(index, aVar.Z);
                    break;
                case 47:
                    aVar.a0 = obtainStyledAttributes.getFloat(index, aVar.a0);
                    break;
                case 48:
                    aVar.b0 = obtainStyledAttributes.getFloat(index, aVar.b0);
                    break;
                case 49:
                    aVar.c0 = obtainStyledAttributes.getFloat(index, aVar.c0);
                    break;
                case 50:
                    aVar.d0 = obtainStyledAttributes.getFloat(index, aVar.d0);
                    break;
                case 51:
                    aVar.e0 = obtainStyledAttributes.getDimension(index, aVar.e0);
                    break;
                case 52:
                    aVar.f0 = obtainStyledAttributes.getDimension(index, aVar.f0);
                    break;
                case 53:
                    aVar.g0 = obtainStyledAttributes.getDimension(index, aVar.g0);
                    break;
                default:
                    switch (i3) {
                        case 60:
                            aVar.X = obtainStyledAttributes.getFloat(index, aVar.X);
                            break;
                        case 61:
                            int resourceId14 = obtainStyledAttributes.getResourceId(index, aVar.x);
                            if (resourceId14 == -1) {
                                resourceId14 = obtainStyledAttributes.getInt(index, -1);
                            }
                            aVar.x = resourceId14;
                            break;
                        case 62:
                            aVar.y = obtainStyledAttributes.getDimensionPixelSize(index, aVar.y);
                            break;
                        case 63:
                            aVar.z = obtainStyledAttributes.getFloat(index, aVar.z);
                            break;
                        default:
                            switch (i3) {
                                case 69:
                                    aVar.p0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    aVar.q0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                    break;
                                case 72:
                                    aVar.s0 = obtainStyledAttributes.getInt(index, aVar.s0);
                                    break;
                                case 73:
                                    aVar.v0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 74:
                                    aVar.r0 = obtainStyledAttributes.getBoolean(index, aVar.r0);
                                    break;
                                case 75:
                                    StringBuilder a2 = i.a.a.a.a.a("unused attribute 0x");
                                    a2.append(Integer.toHexString(index));
                                    a2.append("   ");
                                    a2.append(c.get(index));
                                    Log.w("ConstraintSet", a2.toString());
                                    break;
                                default:
                                    StringBuilder a3 = i.a.a.a.a.a("Unknown attribute 0x");
                                    a3.append(Integer.toHexString(index));
                                    a3.append("   ");
                                    a3.append(c.get(index));
                                    Log.w("ConstraintSet", a3.toString());
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    /* compiled from: ConstraintSet */
    public static class a {
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = -1;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = -1;
        public int I = -1;
        public int J = 0;
        public int K = -1;
        public int L = -1;
        public int M = -1;
        public int N = -1;
        public int O = -1;
        public int P = -1;
        public float Q = 0.0f;
        public float R = 0.0f;
        public int S = 0;
        public int T = 0;
        public float U = 1.0f;
        public boolean V = false;
        public float W = 0.0f;
        public float X = 0.0f;
        public float Y = 0.0f;
        public float Z = 0.0f;
        public boolean a = false;
        public float a0 = 1.0f;

        /* renamed from: b  reason: collision with root package name */
        public int f1685b;
        public float b0 = 1.0f;
        public int c;
        public float c0 = Float.NaN;
        public int d;
        public float d0 = Float.NaN;
        public int e = -1;
        public float e0 = 0.0f;

        /* renamed from: f  reason: collision with root package name */
        public int f1686f = -1;
        public float f0 = 0.0f;

        /* renamed from: g  reason: collision with root package name */
        public float f1687g = -1.0f;
        public float g0 = 0.0f;

        /* renamed from: h  reason: collision with root package name */
        public int f1688h = -1;
        public boolean h0 = false;

        /* renamed from: i  reason: collision with root package name */
        public int f1689i = -1;
        public boolean i0 = false;

        /* renamed from: j  reason: collision with root package name */
        public int f1690j = -1;
        public int j0 = 0;

        /* renamed from: k  reason: collision with root package name */
        public int f1691k = -1;
        public int k0 = 0;

        /* renamed from: l  reason: collision with root package name */
        public int f1692l = -1;
        public int l0 = -1;

        /* renamed from: m  reason: collision with root package name */
        public int f1693m = -1;
        public int m0 = -1;

        /* renamed from: n  reason: collision with root package name */
        public int f1694n = -1;
        public int n0 = -1;

        /* renamed from: o  reason: collision with root package name */
        public int f1695o = -1;
        public int o0 = -1;

        /* renamed from: p  reason: collision with root package name */
        public int f1696p = -1;
        public float p0 = 1.0f;

        /* renamed from: q  reason: collision with root package name */
        public int f1697q = -1;
        public float q0 = 1.0f;
        public int r = -1;
        public boolean r0 = false;
        public int s = -1;
        public int s0 = -1;
        public int t = -1;
        public int t0 = -1;
        public float u = 0.5f;
        public int[] u0;
        public float v = 0.5f;
        public String v0;
        public String w = null;
        public int x = -1;
        public int y = 0;
        public float z = 0.0f;

        public final void a(int i2, d.a aVar) {
            this.d = i2;
            this.f1688h = aVar.d;
            this.f1689i = aVar.e;
            this.f1690j = aVar.f170f;
            this.f1691k = aVar.f171g;
            this.f1692l = aVar.f172h;
            this.f1693m = aVar.f173i;
            this.f1694n = aVar.f174j;
            this.f1695o = aVar.f175k;
            this.f1696p = aVar.f176l;
            this.f1697q = aVar.f180p;
            this.r = aVar.f181q;
            this.s = aVar.r;
            this.t = aVar.s;
            this.u = aVar.z;
            this.v = aVar.A;
            this.w = aVar.B;
            this.x = aVar.f177m;
            this.y = aVar.f178n;
            this.z = aVar.f179o;
            this.A = aVar.P;
            this.B = aVar.Q;
            this.C = aVar.R;
            this.f1687g = aVar.c;
            this.e = aVar.a;
            this.f1686f = aVar.f169b;
            this.f1685b = aVar.width;
            this.c = aVar.height;
            this.D = aVar.leftMargin;
            this.E = aVar.rightMargin;
            this.F = aVar.topMargin;
            this.G = aVar.bottomMargin;
            this.Q = aVar.E;
            this.R = aVar.D;
            this.T = aVar.G;
            this.S = aVar.F;
            boolean z2 = aVar.S;
            this.h0 = z2;
            this.i0 = aVar.T;
            this.j0 = aVar.H;
            this.k0 = aVar.I;
            this.h0 = z2;
            this.l0 = aVar.L;
            this.m0 = aVar.M;
            this.n0 = aVar.J;
            this.o0 = aVar.K;
            this.p0 = aVar.N;
            this.q0 = aVar.O;
            this.H = aVar.getMarginEnd();
            this.I = aVar.getMarginStart();
            this.U = aVar.m0;
            this.X = aVar.p0;
            this.Y = aVar.q0;
            this.Z = aVar.r0;
            this.a0 = aVar.s0;
            this.b0 = aVar.t0;
            this.c0 = aVar.u0;
            this.d0 = aVar.v0;
            this.e0 = aVar.w0;
            this.f0 = aVar.x0;
            this.g0 = aVar.y0;
            this.W = aVar.o0;
            this.V = aVar.n0;
        }

        public Object clone() {
            a aVar = new a();
            aVar.a = this.a;
            aVar.f1685b = this.f1685b;
            aVar.c = this.c;
            aVar.e = this.e;
            aVar.f1686f = this.f1686f;
            aVar.f1687g = this.f1687g;
            aVar.f1688h = this.f1688h;
            aVar.f1689i = this.f1689i;
            aVar.f1690j = this.f1690j;
            aVar.f1691k = this.f1691k;
            aVar.f1692l = this.f1692l;
            aVar.f1693m = this.f1693m;
            aVar.f1694n = this.f1694n;
            aVar.f1695o = this.f1695o;
            aVar.f1696p = this.f1696p;
            aVar.f1697q = this.f1697q;
            aVar.r = this.r;
            aVar.s = this.s;
            aVar.t = this.t;
            aVar.u = this.u;
            aVar.v = this.v;
            aVar.w = this.w;
            aVar.A = this.A;
            aVar.B = this.B;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.u = this.u;
            aVar.C = this.C;
            aVar.D = this.D;
            aVar.E = this.E;
            aVar.F = this.F;
            aVar.G = this.G;
            aVar.H = this.H;
            aVar.I = this.I;
            aVar.J = this.J;
            aVar.K = this.K;
            aVar.L = this.L;
            aVar.M = this.M;
            aVar.N = this.N;
            aVar.O = this.O;
            aVar.P = this.P;
            aVar.Q = this.Q;
            aVar.R = this.R;
            aVar.S = this.S;
            aVar.T = this.T;
            aVar.U = this.U;
            aVar.V = this.V;
            aVar.W = this.W;
            aVar.X = this.X;
            aVar.Y = this.Y;
            aVar.Z = this.Z;
            aVar.a0 = this.a0;
            aVar.b0 = this.b0;
            aVar.c0 = this.c0;
            aVar.d0 = this.d0;
            aVar.e0 = this.e0;
            aVar.f0 = this.f0;
            aVar.g0 = this.g0;
            aVar.h0 = this.h0;
            aVar.i0 = this.i0;
            aVar.j0 = this.j0;
            aVar.k0 = this.k0;
            aVar.l0 = this.l0;
            aVar.m0 = this.m0;
            aVar.n0 = this.n0;
            aVar.o0 = this.o0;
            aVar.p0 = this.p0;
            aVar.q0 = this.q0;
            aVar.s0 = this.s0;
            aVar.t0 = this.t0;
            int[] iArr = this.u0;
            if (iArr != null) {
                aVar.u0 = Arrays.copyOf(iArr, iArr.length);
            }
            aVar.x = this.x;
            aVar.y = this.y;
            aVar.z = this.z;
            aVar.r0 = this.r0;
            return aVar;
        }

        public void a(ConstraintLayout.a aVar) {
            aVar.d = this.f1688h;
            aVar.e = this.f1689i;
            aVar.f170f = this.f1690j;
            aVar.f171g = this.f1691k;
            aVar.f172h = this.f1692l;
            aVar.f173i = this.f1693m;
            aVar.f174j = this.f1694n;
            aVar.f175k = this.f1695o;
            aVar.f176l = this.f1696p;
            aVar.f180p = this.f1697q;
            aVar.f181q = this.r;
            aVar.r = this.s;
            aVar.s = this.t;
            aVar.leftMargin = this.D;
            aVar.rightMargin = this.E;
            aVar.topMargin = this.F;
            aVar.bottomMargin = this.G;
            aVar.x = this.P;
            aVar.y = this.O;
            aVar.z = this.u;
            aVar.A = this.v;
            aVar.f177m = this.x;
            aVar.f178n = this.y;
            aVar.f179o = this.z;
            aVar.B = this.w;
            aVar.P = this.A;
            aVar.Q = this.B;
            aVar.E = this.Q;
            aVar.D = this.R;
            aVar.G = this.T;
            aVar.F = this.S;
            aVar.S = this.h0;
            aVar.T = this.i0;
            aVar.H = this.j0;
            aVar.I = this.k0;
            aVar.L = this.l0;
            aVar.M = this.m0;
            aVar.J = this.n0;
            aVar.K = this.o0;
            aVar.N = this.p0;
            aVar.O = this.q0;
            aVar.R = this.C;
            aVar.c = this.f1687g;
            aVar.a = this.e;
            aVar.f169b = this.f1686f;
            aVar.width = this.f1685b;
            aVar.height = this.c;
            aVar.setMarginStart(this.I);
            aVar.setMarginEnd(this.H);
            aVar.a();
        }
    }

    public final int[] a(View view, String str) {
        int i2;
        Object a2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i3 = 0;
        int i4 = 0;
        while (i3 < split.length) {
            String trim = split[i3].trim();
            try {
                i2 = f.class.getField(trim).getInt((Object) null);
            } catch (Exception unused) {
                i2 = 0;
            }
            if (i2 == 0) {
                i2 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i2 == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (a2 = ((ConstraintLayout) view.getParent()).a(0, (Object) trim)) != null && (a2 instanceof Integer)) {
                i2 = ((Integer) a2).intValue();
            }
            iArr[i4] = i2;
            i3++;
            i4++;
        }
        return i4 != split.length ? Arrays.copyOf(iArr, i4) : iArr;
    }
}
