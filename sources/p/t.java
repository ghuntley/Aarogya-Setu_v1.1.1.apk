package p;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: Options */
public final class t extends AbstractList<i> implements RandomAccess {
    public final i[] e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f5667f;

    public t(i[] iVarArr, int[] iArr) {
        this.e = iVarArr;
        this.f5667f = iArr;
    }

    public static t a(i... iVarArr) {
        if (iVarArr.length == 0) {
            return new t(new i[0], new int[]{0, -1});
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(iVarArr));
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList2.add(-1);
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.set(Collections.binarySearch(arrayList, iVarArr[i3]), Integer.valueOf(i3));
        }
        if (((i) arrayList.get(0)).h() != 0) {
            int i4 = 0;
            while (i4 < arrayList.size()) {
                i iVar = (i) arrayList.get(i4);
                int i5 = i4 + 1;
                int i6 = i5;
                while (i6 < arrayList.size()) {
                    i iVar2 = (i) arrayList.get(i6);
                    if (iVar2 == null) {
                        throw null;
                    } else if (!iVar2.a(0, iVar, 0, iVar.h())) {
                        continue;
                        break;
                    } else if (iVar2.h() == iVar.h()) {
                        throw new IllegalArgumentException("duplicate option: " + iVar2);
                    } else if (((Integer) arrayList2.get(i6)).intValue() > ((Integer) arrayList2.get(i4)).intValue()) {
                        arrayList.remove(i6);
                        arrayList2.remove(i6);
                    } else {
                        i6++;
                    }
                }
                i4 = i5;
            }
            f fVar = new f();
            a(0, fVar, 0, arrayList, 0, arrayList.size(), arrayList2);
            int i7 = (int) (fVar.f5646f / 4);
            int[] iArr = new int[i7];
            for (int i8 = 0; i8 < i7; i8++) {
                iArr[i8] = fVar.readInt();
            }
            if (fVar.l()) {
                return new t((i[]) iVarArr.clone(), iArr);
            }
            throw new AssertionError();
        }
        throw new IllegalArgumentException("the empty byte string is not a supported option");
    }

    public Object get(int i2) {
        return this.e[i2];
    }

    public final int size() {
        return this.e.length;
    }

    public static void a(long j2, f fVar, int i2, List<i> list, int i3, int i4, List<Integer> list2) {
        int i5;
        int i6;
        int i7;
        f fVar2;
        f fVar3 = fVar;
        int i8 = i2;
        List<i> list3 = list;
        int i9 = i3;
        int i10 = i4;
        List<Integer> list4 = list2;
        if (i9 < i10) {
            int i11 = i9;
            while (i11 < i10) {
                if (list3.get(i11).h() >= i8) {
                    i11++;
                } else {
                    throw new AssertionError();
                }
            }
            i iVar = list.get(i3);
            i iVar2 = list3.get(i10 - 1);
            int i12 = -1;
            if (i8 == iVar.h()) {
                i12 = list4.get(i9).intValue();
                i9++;
                iVar = list3.get(i9);
            }
            int i13 = i9;
            long j3 = 4;
            if (iVar.a(i8) != iVar2.a(i8)) {
                int i14 = 1;
                for (int i15 = i13 + 1; i15 < i10; i15++) {
                    if (list3.get(i15 - 1).a(i8) != list3.get(i15).a(i8)) {
                        i14++;
                    }
                }
                long j4 = j2 + ((long) ((int) (fVar3.f5646f / 4))) + 2 + ((long) (i14 * 2));
                fVar3.writeInt(i14);
                fVar3.writeInt(i12);
                for (int i16 = i13; i16 < i10; i16++) {
                    byte a = list3.get(i16).a(i8);
                    if (i16 == i13 || a != list3.get(i16 - 1).a(i8)) {
                        fVar3.writeInt((int) a & 255);
                    }
                }
                f fVar4 = new f();
                int i17 = i13;
                while (i17 < i10) {
                    byte a2 = list3.get(i17).a(i8);
                    int i18 = i17 + 1;
                    int i19 = i18;
                    while (true) {
                        if (i19 >= i10) {
                            i6 = i10;
                            break;
                        } else if (a2 != list3.get(i19).a(i8)) {
                            i6 = i19;
                            break;
                        } else {
                            i19++;
                        }
                    }
                    if (i18 == i6 && i8 + 1 == list3.get(i17).h()) {
                        fVar3.writeInt(list4.get(i17).intValue());
                        i7 = i6;
                        fVar2 = fVar4;
                    } else {
                        fVar3.writeInt((int) ((((long) ((int) (fVar4.f5646f / j3))) + j4) * -1));
                        i7 = i6;
                        fVar2 = fVar4;
                        a(j4, fVar4, i8 + 1, list, i17, i6, list2);
                    }
                    fVar4 = fVar2;
                    i17 = i7;
                    j3 = 4;
                }
                f fVar5 = fVar4;
                fVar3.a(fVar5, fVar5.f5646f);
                return;
            }
            int i20 = 0;
            int min = Math.min(iVar.h(), iVar2.h());
            int i21 = i8;
            while (i21 < min && iVar.a(i21) == iVar2.a(i21)) {
                i20++;
                i21++;
            }
            long j5 = 1 + j2 + ((long) ((int) (fVar3.f5646f / 4))) + 2 + ((long) i20);
            fVar3.writeInt(-i20);
            fVar3.writeInt(i12);
            int i22 = i8;
            while (true) {
                i5 = i8 + i20;
                if (i22 >= i5) {
                    break;
                }
                fVar3.writeInt((int) iVar.a(i22) & 255);
                i22++;
            }
            if (i13 + 1 != i10) {
                f fVar6 = new f();
                fVar3.writeInt((int) ((((long) ((int) (fVar6.f5646f / 4))) + j5) * -1));
                a(j5, fVar6, i5, list, i13, i4, list2);
                fVar3.a(fVar6, fVar6.f5646f);
            } else if (i5 == list3.get(i13).h()) {
                fVar3.writeInt(list4.get(i13).intValue());
            } else {
                throw new AssertionError();
            }
        } else {
            throw new AssertionError();
        }
    }
}
