// withIndex.kts

val names = listOf("foo", "bar", "foobar")

for ((index, name) in names.withIndex()) {
    println("Position of $name is $index")
}