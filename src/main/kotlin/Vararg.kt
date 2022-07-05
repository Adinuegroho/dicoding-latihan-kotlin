fun main() {
    val number = intArrayOf(10, 20, 30, 40, 50 )
    val setsNumber = sets(10, 20, 20, *number, 10)
    println(setsNumber)
}

fun setNumbers(vararg number: Int): Int {
    return number.size
}

fun sets(vararg number: Int):Int{
    return number.size
}

fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}