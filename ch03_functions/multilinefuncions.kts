fun min(numbers: IntArray): Int {
	var small = Int.MAX_VALUE
	for (number in numbers) {
		small = if (number < small) number else small
	}

	return small
}

println(min(intArrayOf(1, 5, 2, 12, 7, 3)))
