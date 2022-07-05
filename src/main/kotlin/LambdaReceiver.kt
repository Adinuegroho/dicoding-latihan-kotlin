fun main() {
    val message = buildString {
        append("Hello ")
        append("from ")
        append("Lambda ")
    }

    println(message)

    val buildString = StringBuilder().apply {
        append("Hello ")
        append("World!")
    }
    println(buildString)

    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }
    // or
    val text2 = "Hello"
    text.let { value ->
        val message = "$value Kotlin"
        println(message)
    }

}

fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}


