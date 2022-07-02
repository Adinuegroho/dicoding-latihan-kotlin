import kotlin.random.Random

fun main() {

    // lat 1
    val value = 10
    val stringOfValue = when (value) {
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        9 -> "value is 9"
        10 -> {
            println("Ten")
            "value is 10"
        }
        else -> println("value cannot be reached")
    }
    println(stringOfValue)

    // lat 2
    val anyType: Any = 100L
    when(anyType) {
        is Long -> println("the value has a long type")
        is String -> println("the value has a string type")
        else -> println("Undefined")
    }

    // lat 3
    val ranges = 10..50
    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }

    // lat 4
    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }
    println(registerNumber)

    // perbedaan if dan when
    if (anyType is Long){
        println("The value has a long type")
    } else {
        println("The value is not a long type")
    }

    when (anyType){
        is Long -> println("The value has a long type")
        is Int -> println("The value has a Integer type")
        is Double -> println("The value has a double type")
        else -> println("Undefined")
    }
}

fun getRegisterNumber() = Random.nextInt(100)