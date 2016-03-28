## all

所有依赖、依赖声明加入

```xml
<classifier>pg</classifier>
```

## child-common

保留项目
 - 包注释
 - 枚举
 - 工具类

```xml
	<build>
		<plugins>
			<!-- 代码混淆 -->
			<plugin>
				<groupId>com.github.wvengen</groupId>
				<artifactId>proguard-maven-plugin</artifactId>
				<version>2.0.11</version>
				<executions>
					<execution>
						<phase>package</phase>
						<goals>
							<goal>proguard</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<attach>true</attach>
					<attachArtifactClassifier>pg</attachArtifactClassifier>
					<options>
						<!-- <option>-dontobfuscate</option> -->
						<option>-ignorewarnings</option>
						<option>-dontshrink</option>
						<option>-dontoptimize</option>
						<option>-dontskipnonpubliclibraryclasses</option>
						<option>-dontskipnonpubliclibraryclassmembers</option>
						<option>-repackageclasses org.learn.javafx.common.pg</option>

						<option>-keep class **.package-info</option>
						<option>-keep enum ** { public *; }</option>
						<option>-keep class **.*Util* { *; }</option>
						<option>-keepattributes Signature</option>
						<option>-keepattributes *Annotation*</option>
					</options>
					<outjar>${project.build.finalName}-pg</outjar>
				</configuration>
			</plugin>
		</plugins>
	</build>
```

## child-security

保留项目
 - 包注释
 - service层接口
 - domain
 - LoginServiceImpl (没有加入spring，在MainApp中实例化的时候，需要显示调用到)

```xml
	<build>
		<plugins>
			<!-- 代码混淆 -->
			<plugin>
				<groupId>com.github.wvengen</groupId>
				<artifactId>proguard-maven-plugin</artifactId>
				<version>2.0.11</version>
				<executions>
					<execution>
						<phase>package</phase>
						<goals>
							<goal>proguard</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<attach>true</attach>
					<attachArtifactClassifier>pg</attachArtifactClassifier>
					<options>
						<!-- <option>-dontobfuscate</option> -->
						<option>-ignorewarnings</option>
						<option>-dontshrink</option>
						<option>-dontoptimize</option>
						<option>-dontskipnonpubliclibraryclasses</option>
						<option>-dontskipnonpubliclibraryclassmembers</option>
						<option>-repackageclasses org.learn.javafx.security.pg</option>

						<option>-keep class **.package-info</option>
						<option>-keep interface org.learn.javafx.*.service.** { public *; }</option>
						<option>-keep class org.learn.javafx.*.domain.** { *; }</option>
						<option>-keep class **.*Login* { *; }</option>
						<option>-keepattributes Signature</option>
						<option>-keepattributes *Annotation*</option>
					</options>
					<outjar>${project.build.finalName}-pg</outjar>
				</configuration>
			</plugin>
		</plugins>
	</build>
```

## child-main

保留项目

 - MainApp

```xml
	<build>
		<plugins>
			<!-- 代码混淆 -->
			<plugin>
				<groupId>com.github.wvengen</groupId>
				<artifactId>proguard-maven-plugin</artifactId>
				<version>2.0.11</version>
				<executions>
					<execution>
						<phase>package</phase>
						<goals>
							<goal>proguard</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<attach>true</attach>
					<attachArtifactClassifier>pg</attachArtifactClassifier>
					<options>
						<!-- <option>-dontobfuscate</option> -->
						<option>-ignorewarnings</option>
						<option>-dontshrink</option>
						<option>-dontoptimize</option>
						<option>-dontskipnonpubliclibraryclasses</option>
						<option>-dontskipnonpubliclibraryclassmembers</option>
						<option>-repackageclasses org.learn.javafx.pg</option>

						<option>-keep class **.package-info</option>
						<option>-keep class org.learn.javafx.MainApp { *; }</option>
						<option>-keepattributes Signature</option>
						<option>-keepattributes *Annotation*</option>
					</options>
					<outjar>${project.build.finalName}-pg</outjar>
				</configuration>
			</plugin>
		</plugins>
	</build>
```
