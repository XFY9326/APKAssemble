# APKAssemble

安卓APK 打包用Dockerfile，基本适用于大多数安卓APK构建   
Dockerfile for Android APK assemble  

-----

注：如果需要加入gradle，可以通过以下方法计算gradle版本的digest

Python版本：

```shell
  chmod a+x gradle_digest_utils.py

  ./gradle_digest_utils.py 6.1.1-all
```

Java版本：

```shell
javac GradleDigestUtils.java

java GradleDigestUtils 6.1.1-all
```

