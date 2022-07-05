fun main() {
    message("Bagus")

    val length = messageLength("Hello from Lambda")
    println("Message Length $length")

}

val message = { message: String -> println("Hello $message from Lambda") }
val messageLength = { message: String -> message.length }

val comparator = object :Runnable{
    override fun run() {
        TODO("Not yet implemented")
    }
}

val comparatorr = Runnable {

}