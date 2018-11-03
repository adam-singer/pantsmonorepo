
jar_library(name='scrooge-core',
  jars=[
    scala_jar(org='com.twitter', name='scrooge-core', rev='18.10.0',
        excludes=[
          exclude(org = 'org.apache.thrift', name = 'libthrift'),
        ]),
  ],
  dependencies=[
    '3rdparty:thrift-0.6.1',
  ],
)