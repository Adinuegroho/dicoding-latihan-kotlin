fun main() {
    val openOffice = 7
    val now = 8
    val office = if(now > openOffice) println("Office already open") else println("Office close")
    println(office)

    val value = 10
    val value2 = 20
    println(Sum(value, value2))
}

fun Sum(value: Int, value2: Int) = value + value2