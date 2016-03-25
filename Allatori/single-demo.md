将allatori文件夹copy到项目根目录下，与src同级目录。allatori文件夹包含allatori.jar和allatori.xml。

在pom文件中加入以下代码，可完成Allatori对单个项目的代码混淆。

```xml
			<!-- 代码混淆 -->
			<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-resources-plugin</artifactId>
				<version>2.6</version>
				<executions>
					<execution>
						<id>copy-and-filter-allatori-config</id>
						<phase>package</phase>
						<goals>
							<goal>copy-resources</goal>
						</goals>
						<configuration>
							<outputDirectory>${basedir}/target</outputDirectory>
							<resources>
								<resource>
									<directory>${basedir}/allatori</directory>
									<includes>
										<include>allatori.xml</include>
									</includes>
									<filtering>true</filtering>
								</resource>
							</resources>
						</configuration>
					</execution>
				</executions>
			</plugin>

			<!-- Running Allatori -->
			<plugin>
				<groupId>org.codehaus.mojo</groupId>
				<artifactId>exec-maven-plugin</artifactId>
				<version>1.2.1</version>
				<executions>
					<execution>
						<id>run-allatori</id>
						<phase>package</phase>
						<goals>
							<goal>exec</goal>
						</goals>
					</execution>
				</executions>
				<configuration>
					<executable>java</executable>
					<arguments>
						<argument>-Xms128m</argument>
						<argument>-Xmx512m</argument>
						<argument>-jar</argument>

						<argument>${basedir}/allatori/allatori.jar</argument>
						<argument>${basedir}/target/allatori.xml</argument>
					</arguments>
				</configuration>
			</plugin>
```

## 保留说明

 1. 类MainApp的public所有方法

