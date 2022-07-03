fun main() {
    val numberList = listOf<Int>(1,2,3,4,5)
    val charList = listOf('a','b','c','d')

    val anyList = listOf('a', "Kotlin", 3, true, User("ultramen",20))
    val anyList3 = mutableListOf('a', "Kotlin", 3, true, User("ultramen",20))

    for (i in numberList){
        if (i >=3 ) break
        println(i)
    }

    println(anyList)
    println(anyList[4])

    // Memanipulasi data pada list
    val anyList2 = mutableListOf(anyList)
    // tidak bisa
    // anyList2.add("java")
    anyList3.add("java")
    anyList3.add(1, "golang")
    anyList3[3] = false
    println(anyList3)
    anyList3.removeAt(1)
    anyList3.remove('a')
    println(anyList3)

    val integerSet = setOf(1,2,3,4,5,1,3)
    println(integerSet)

    val setB = setOf(1,2,3,4,5)
    println(integerSet == setB)
    println(integerSet.equals(setB))
    println(5 in integerSet)

    val setC = setOf(1,5,7)
    val union = integerSet.union(setC)
    val interSect = integerSet.intersect(setC)

    println(union)
    println(interSect)

}
