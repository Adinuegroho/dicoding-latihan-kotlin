fun main() {
    val listOfInt = listOf(1, 2, null, 4, 5)

    for (i in listOfInt){
//        if (i == null) continue
        if (i == null) break
        println(i)
    }

    loop@ for (i in 1..10){
        println("Outside loop")

        for (j in 1..10){
            println("Inside loop")
            if (j > 5) break@loop
        }
    }

}