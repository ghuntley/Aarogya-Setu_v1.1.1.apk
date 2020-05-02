package com.crashlytics.android.core;

public class MiddleOutFallbackStrategy implements StackTraceTrimmingStrategy {
    public final int maximumStackSize;
    public final MiddleOutStrategy middleOutStrategy;
    public final StackTraceTrimmingStrategy[] trimmingStrategies;

    public MiddleOutFallbackStrategy(int i2, StackTraceTrimmingStrategy... stackTraceTrimmingStrategyArr) {
        this.maximumStackSize = i2;
        this.trimmingStrategies = stackTraceTrimmingStrategyArr;
        this.middleOutStrategy = new MiddleOutStrategy(i2);
    }

    public StackTraceElement[] getTrimmedStackTrace(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.maximumStackSize) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (StackTraceTrimmingStrategy stackTraceTrimmingStrategy : this.trimmingStrategies) {
            if (stackTraceElementArr2.length <= this.maximumStackSize) {
                break;
            }
            stackTraceElementArr2 = stackTraceTrimmingStrategy.getTrimmedStackTrace(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > this.maximumStackSize ? this.middleOutStrategy.getTrimmedStackTrace(stackTraceElementArr2) : stackTraceElementArr2;
    }
}
