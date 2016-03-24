# 学习笔记之——Obfuscated Code（代码混淆）

# 基础工程 base-demos

## single-demo

这个工程是模拟一个单工程项目，能生成可执行jar包，有JavaFX界面。这么做的好处是，生成jar包后可双击运行，代码混淆前后看程序是否正常运行。

为检测代码混淆的能力，本项目模拟了接口、实现类、枚举、工具类、properties文件，部分类还加入了private/public fields or methods。但是没有模拟Spring的部分。

# 代码混淆

## ProGuard

开源软件，可通过Maven对项目进行打包，但是主要针对Android项目。

## 