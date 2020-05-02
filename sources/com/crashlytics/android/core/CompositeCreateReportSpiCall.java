package com.crashlytics.android.core;

public class CompositeCreateReportSpiCall implements CreateReportSpiCall {
    public final DefaultCreateReportSpiCall javaReportSpiCall;
    public final NativeCreateReportSpiCall nativeReportSpiCall;

    /* renamed from: com.crashlytics.android.core.CompositeCreateReportSpiCall$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$crashlytics$android$core$Report$Type;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        static {
            /*
                com.crashlytics.android.core.Report$Type[] r0 = com.crashlytics.android.core.Report.Type.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$com$crashlytics$android$core$Report$Type = r0
                r1 = 1
                com.crashlytics.android.core.Report$Type r2 = com.crashlytics.android.core.Report.Type.JAVA     // Catch:{ NoSuchFieldError -> 0x000f }
                r2 = 0
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = $SwitchMap$com$crashlytics$android$core$Report$Type     // Catch:{ NoSuchFieldError -> 0x0016 }
                com.crashlytics.android.core.Report$Type r2 = com.crashlytics.android.core.Report.Type.NATIVE     // Catch:{ NoSuchFieldError -> 0x0016 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0016 }
            L_0x0016:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.crashlytics.android.core.CompositeCreateReportSpiCall.AnonymousClass1.<clinit>():void");
        }
    }

    public CompositeCreateReportSpiCall(DefaultCreateReportSpiCall defaultCreateReportSpiCall, NativeCreateReportSpiCall nativeCreateReportSpiCall) {
        this.javaReportSpiCall = defaultCreateReportSpiCall;
        this.nativeReportSpiCall = nativeCreateReportSpiCall;
    }

    public boolean invoke(CreateReportRequest createReportRequest) {
        int ordinal = createReportRequest.report.getType().ordinal();
        if (ordinal == 0) {
            this.javaReportSpiCall.invoke(createReportRequest);
            return true;
        } else if (ordinal != 1) {
            return false;
        } else {
            this.nativeReportSpiCall.invoke(createReportRequest);
            return true;
        }
    }
}
