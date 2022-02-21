open class Fruit
class Banana : Fruit()
class Orange: Fruit()

/*
fun receiveFruits(fruits: Array<Fruit>) {
    println("number of fruits: ${fruits.size}")
}

val bananas: Array<Banana> = arrayOf()
receiveFruits(bananas) // ERROR: type mismatch
*/

fun receiveFruits(fruits: List<Fruit>) {
    println("number of fruits: ${fruits.size}")
}

val bananas: List<Banana> = listOf()
receiveFruits(bananas)
