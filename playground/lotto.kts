fun lottery() {
    val lotto = mutableSetOf<Int>()

    while(lotto.size < 6) {
        lotto.add((Math.random()*45).toInt()+1)
    }

    val sortedLotto = lotto.sorted()

    for((index, num) in sortedLotto.withIndex()) {
        println("${index+1}번 번호 : $num")
    }

    print("\n${sortedLotto.elementAt(0)}")
    for(index in 1 until sortedLotto.size) {
        print(", ${sortedLotto.elementAt(index)}")
    }

    println()
}

lottery()