/*
//Java code
@Override public boolean equals(Object other) {
    if(other instanceof Animal) {
        return age == ((Animal) other).age;
    }

    return false;
}
*/

/* 1차 변경
class Animal(val age: Int) {
    override operator fun equals(other: Any?): Boolean {
        return if(other is Animal) age == other.age else false
    }
}
 */

// 2차 변경
class Animal(val age: Int) {
    override operator fun equals(other: Any?) = other is Animal && age == other.age
}

val odie = Animal(2)
val toto = Animal(2)
val butch = Animal(3)

println(odie == toto) //true
println(odie == butch) //false