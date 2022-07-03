fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    val mapKeys = capital.keys
    val mapValues = capital.values
    val mutableCapital = capital.toMutableMap()

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    mutableCapital.put("Amsterdam", "Netherland")
    mutableCapital.put("Berlin", "Germany")
    println(mapKeys)
    println(mapValues)
    println(mutableCapital)

}