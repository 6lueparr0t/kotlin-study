fun createPerson(name: String, birth: Int = 1, height: Int, weight: Int) {
    println("$name $birth $height $weight")
}

createPerson("Jake", birth = 2010, height = 43, weight = 152) // Jake 2010 43 152
createPerson(birth = 2010, height = 43, weight = 152, name = "Jake") // Jake 2010 43 152
createPerson(height = 43, weight = 152, name = "Jake") // Jake 1 43 152