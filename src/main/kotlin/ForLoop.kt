fun main() {
//    val ranges = 1..10
//    val ranges = 1.rangeTo(10)
    val ranges = 1.rangeTo(10) step 3
    for (i in ranges){
        println("value is $i")
    }

    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }

    ranges.forEach {
        value -> println("value is $value!")
    }

    ranges.forEachIndexed { index, value ->
        println("value $value with index $index")
    }

    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
}
