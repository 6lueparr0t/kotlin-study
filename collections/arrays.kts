val friends = arrayOf("Tintin", "Snowy", "Haddock", "Calculus")
println(friends::class) // class kotlin.Array
println(friends.javaClass) // class [Ljava.lang.String;
println("${friends[0]} and ${friends[1]}") // Tintin and Snowy

val numbers = intArrayOf(1,2,3)
println(numbers::class) // class kotlin.Array
println(numbers.javaClass) // class [Ljava.lang.Integer;
println("${numbers[0]} and ${numbers[1]}") // 1 and 2

for (i in 0 until numbers.size) {
    println("numbers[$i] : ${numbers[i]}")
}
println(numbers.size) // 3
println(numbers.average()) // 2.0

println(Array(5) { i -> (i + 1) * (i + 1)}.sum()) //55
