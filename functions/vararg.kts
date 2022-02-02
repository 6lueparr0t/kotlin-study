fun max(vararg numbers: Int): Int {
	var large = Int.MIN_VALUE
	for (number in numbers) {
		large = if (number > large) number else large
	}

	return large
}

//println(max(1,2,3,4,5,6,7,8,10))

// var values = intArrayOf(12346,137,15347,254,72,10)
// println(max(*values))

println(max(*intArrayOf(10,1,2,3,5,20,31,60,29)))
println(max(*listOf(1, 4, 18, 12).toIntArray()))
