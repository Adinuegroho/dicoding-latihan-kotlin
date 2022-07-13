//fun main() {
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "Text length $length"
//        println(text)
//
//        val
//    } ?: run {
//        val text = "message is null"
//        println(text
//        )
//    }
//}

fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("Value length -> ${it.length}")
    }

    println("Text -> $result")
}