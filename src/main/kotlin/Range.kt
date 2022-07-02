fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it")
    }
    println(rangeInt.step)

    // rangeTo
    val rangeInt2 = 1.rangeTo(10)
    rangeInt2.forEach {
        print("$it")
    }
    println()

    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("value 7 available")
    }
    if (1 <= 7 && 7 <= 10){
        println("value 7 available")
    }
    val number = 8
    when (number) {
        in tenToOne -> println("No $number in range")
        else -> println("No value in range")
    }

}