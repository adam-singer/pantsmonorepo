scala_library(
    compiler_option_sets={"fatal_warnings"},
    dependencies=[
        '3rdparty/jvm/com/twitter/finagle:finagle-stats',
        '3rdparty/jvm/com/twitter/inject:inject-app',
        '3rdparty/jvm/com/twitter/inject:inject-server',
        'skeletonapp/src/main/resources',
        '3rdparty/jvm/ch/qos/logback:logback-classic',
        '3rdparty/jvm/com/twitter/twitter-server',
    ],
    excludes=[
        exclude('org.slf4j', 'slf4j-jdk14'),
        exclude('org.slf4j', 'slf4j-log4j12'),
        exclude('org.slf4j', 'slf4j-simple'),
        exclude('log4j', 'log4j')
    ],
    sources=rglobs('*.scala'),
    strict_deps=True,
)
