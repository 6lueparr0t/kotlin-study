fun getFullName() = Triple("Trafalgar", "D.", "Water Law")

var result = getFullName()
println("${result.first} ${result.second} ${result.third}")

var (first, _, last) = getFullName()
println("$first $last")

var (_, middle) = getFullName()
println("$middle")