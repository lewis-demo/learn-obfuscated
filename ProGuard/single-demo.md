在pom文件中加入以下代码，可完成ProGuard对单个项目的代码混淆。

```xml
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
						<option>-repackageclasses org.learn.proguard.pg</option>

						<option>-keep class **.package-info</option>
						<option>-keep enum ** { public *; }</option>
						<option>-keep interface ** { public *; }</option>
						<option>-keep class org.learn.javafx.single.*.domain.** { *; }</option>
						<option>-keep class **.*Util* { *; }</option>
						<option>-keep class org.learn.javafx.single.MainApp { public &lt;methods&gt;; }</option>
						<option>-keepattributes Signature</option>
						<option>-keepattributes *Annotation*</option>
					</options>
					<outjar>${project.build.finalName}-pg</outjar>
					<libs>
						<lib>${java.home}/lib/ext/jfxrt.jar</lib>
					</libs>
				</configuration>
			</plugin>
```

## 保留说明

 1. 类描述
 2. 枚举
 3. 接口
 4. domain
 5. 名字包含Util的类
 6. MainApp的public所有方法

