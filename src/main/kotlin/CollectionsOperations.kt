fun main() {
    val numberList = listOf(1,2,3,4,5,6,7,8,9,10)
    val evenList = numberList.filter { it % 2 == 0 }
    val notEventList = numberList.filterNot { it % 2 == 0 }
    val multipliedBy5 = numberList.map { it * 5 }
    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    // val moreThan10 = numberList.first { it > 10 }
    val kotlinChar = listOf('A', 'J', 'R', 'M', 'P')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()

    println(evenList)
    println(notEventList)
    println(multipliedBy5)
    println(numberList.count{ it % 3 == 0 })
    println(firstOddNumber)
    println(firstOrNullNumber)
    // println(moreThan10)
    println(numberList.sum())
    println(ascendingSort)
    println(descendingSort)

}