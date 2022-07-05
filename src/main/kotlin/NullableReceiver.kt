fun main() {
    val value: Int? = 10
    val value2: Int? = null

    println(value.slice)

    // safe call setiap dipanggil
    println(value2?.slice)
}

val Int?.slice:Int
    get() = this?.div(2) ?: 0