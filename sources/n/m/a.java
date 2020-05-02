package n.m;

/* compiled from: KotlinReflectionNotSupportedError.kt */
public class a extends Error {
    public a() {
        super("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
