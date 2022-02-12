// usingmap.kts

val sites = mapOf("6lueparr0t" to "https://6lueparr0t.tistory.com", "rgbplace" to "https://blog.rgbplace.com")
println(sites.size)

println(sites.containsKey("rgbplace")) // true
println(sites.containsValue("rgbplace")) // false
println(sites.contains("rgbplace")) // true
println("6lueparr0t" in sites) // true

val rgbplaceSite: String? = sites.get("rgbplace")
val rgbplaceSite2: String? = sites["rgbplace"]

val blueparr0t = sites.getOrDefault("6lueparr0t", "https://github.com/6lueparr0t")

val sitesWithExample = sites + ("example" to "http://www.example.com")
val withoutRgbplace = sites - "rgbplace"

println(sitesWithExample)
println(withoutRgbplace)
println()

for (entry in sites) {
    println("${entry.key} --- ${entry.value}")
}

println()

for ((key, value) in sites) {
    println("$key --- $value")
}