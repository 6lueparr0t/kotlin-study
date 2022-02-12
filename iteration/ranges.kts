// val oneToFive: IntRange = 1..5
// val aToE: CharRange = 'a'..'e'
val seekHelp: ClosedRange<String> = "hell".."help"

println(seekHelp.contains("helm")) //true
println(seekHelp.contains("helq")) //false
