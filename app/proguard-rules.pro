-keep class android.support.v7.widget.searchView{ *; }
-keep class android.support.v7.widget.ShareActionProvider{ *; }
# Fix for Samsung Galaxy Lite 4.2.2 bug: https://desc.google.com/p/android/issues/detail?id=78377

# Restoring a stack trace with line numbers
# -renamesourcefileattribute ProGuard (adb: turned this off to improve Fabric issue where "Proguard" shows up)
# Uncomment these when DEBUGGING
#-dontobfuscate
#-optimizations !desc/simplification/arithmetic,!field/*,!class/merging/*,!desc/allocation/variable

# For Crashlytics to work around their bug where they don't deobfuscate exceptions
-keep class * {
    public private *;
}
# Add project specific ProGuard rules here.
# You can control the set of applied configuration files using the
# proguardFiles setting in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# Uncomment this to preserve the line number information for
# debugging stack traces.
#-keepattributes SourceFile,LineNumberTable

# If you keep the line number information, uncomment this to
# hide the original source file name.
#-renamesourcefileattribute SourceFile
