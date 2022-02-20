/*
# Compile
kotlinc-jvm Hello.kt -d Hello.jar

--

# Execute

java -classpath Hello.jar HelloKt
java -jar Hello.jar
kotlin -classpath Hello.jar HelloKt

## Windows ENV
```
java -classpath Hello.jar;"%KOTLIN_PATH%\lib\kotlin-stdlib.jar" HelloKt
```

## Unix-like ENV
```
java -classpath Hello.jar:"$KOTLIN_PATH/lib/kotlin-stdlib.jar" HelloKt
```
 */

fun main() = println("Hello World")