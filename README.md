# orig
[Getting started with Spring Boot AOT + GraalVM Native Images
](https://www.youtube.com/watch?v=FjRBHKUP-NA)
# Specific graal java jdk
```shell
sdk list java | grep installed
```
|     | 25.0.2       | graal   | installed  | 25.0.2-graal
```shell
sdk use java 25.0.2-graal
```
# run native
```shell
./target/danvega-hello-native
```
# run jvm
```shell
java -jar ./target/danvega-hello-native-0.0.1-SNAPSHOT.jar
```