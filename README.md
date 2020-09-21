# APKAssembleDocker
  
安卓APK 打包用Dockerfile，基本适用于大多数安卓APK构建   
Dockerfile for Android APK assemble  

-----  

支持特性：  

- 自定义命令行工具版本
- 自定义SDK与目标平台版本
- 自定义构建工具平台版本
- 自定义Cmake与NDK版本
- 自定义Gradle版本
  
注：可以通过gradle_digest_utils.py计算gradle版本的特征码并填入GRADLE_DIGEST环境变量（要求Python3环境）  

```
  chmod a+x gradle_digest_utils.py

  ./gradle_digest_utils.py 6.1.1-all
```
