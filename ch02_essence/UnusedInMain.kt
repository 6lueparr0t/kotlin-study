/*

Build :

kotlinc-jvm UnusedInMain.kt -d UnusedInMain.jar


Execute : 

java -classpath UnusedInMain.jar:$KOTLIN_PATH/lib/kotlin-stdlib.jar UnusedInMainKt
kotlin -classpath UnusedInMain.jar UnusedInMainKt

*/

fun compute(n: Int) = 0
//fun main(args: Array<String>) = println(compute(4))
fun main() = println(compute(4))
