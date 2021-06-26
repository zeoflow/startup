# This Proguard rule ensures that ComponentInitializers are are neither shrunk nor obfuscated.
# This is because they are discovered and instantiated during application initialization.
-keep class * extends com.zeoflow.startup.Initializer {
    # Keep the public no-argument constructor while allowing other methods to be optimized.
    <init>();
}

-assumenosideeffects class com.zeoflow.startup.StartupLogger { public static <methods>; }
