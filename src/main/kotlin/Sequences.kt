fun main() {
    val list = (1..1_000_000).toList()
    // val result = list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
    // val result2 = list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    // println(result2)

    val sequenceNumber = generateSequence(1){ it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }

}