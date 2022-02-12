// when.kts

/* 기존 if 문
fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int): Boolean {
    if (numberOfLiveNeighbors < 2) { return false}
    if (numberOfLiveNeighbors > 3) { return false}
}
*/

// when 사용
fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int) = when {
    numberOfLiveNeighbors < 2 -> false
    numberOfLiveNeighbors > 3 -> false
    numberOfLiveNeighbors == 3 -> true
    else -> alive && numberOfLiveNeighbors == 2
}

/* 리팩토링
fun isAlive(alive: Boolean, numberOfLiveNeighbors: Int) = alive && numberOfLiveNeighbors == 2 || numberOfLiveNeighbors == 3
*/

isAlive(true, 3)