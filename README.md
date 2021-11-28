# APKAssemble

Dockerfile: 创建安卓APK打包用的Docker  
Create Docker for Android APK packaging  

setupBuildEnv.sh: 在基于Ubuntu的已有环境中搭建安卓APK打包环境  
Build an Android APK packaging environment in an existing environment based on Ubuntu  
             
gradle/\*: 计算gradle版本digest的工具  
Tool to calculate gradle version digest  
 
-----

注：如果需要在构建中加入指定的gradle，可以通过以下方法计算gradle版本的digest  
If you need to add a specified gradle to the build, you can calculate the digest of the gradle version by the following method  

Python：

```shell
> python3 gradle_digest_utils.py 6.1.1-all
cfmwm155h49vnt3hynmlrsdst
```

Java：

```shell
> javac GradleDigestUtils.java && java GradleDigestUtils 6.1.1-all
cfmwm155h49vnt3hynmlrsdst
```

