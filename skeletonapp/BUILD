target(
  dependencies=[
    'skeletonapp/src/main/scala',
  ]
)

target(
  name='tests',
  dependencies=[
    'skeletonapp/src/test/scala'
  ]
)

jvm_binary(
  name='bin',
  basename='skeletonapp',
  scope='forced',
  main='com.example.skeletonapp.SkeletonApp',
  dependencies=[':skeletonapp']
)

jvm_app(
  name='bundle',
  archive='zip',
  basename='skeletonapp',
  scope='forced',
  binary=':bin'
)
