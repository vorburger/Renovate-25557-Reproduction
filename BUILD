# load("@rules_java//java:defs.bzl", "java_binary")

java_binary(
    name = "JavaOne",
    srcs = glob(["src/main/java/**/*.java"]),
    main_class = "ch.vorburger.learniningbazel.Main",
    deps = [ "@maven//:com_google_guava_guava", ]
)
