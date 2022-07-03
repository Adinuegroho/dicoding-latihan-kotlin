fun main() {

    val fullNameDefault = getFullName()
    val fullName = getFullName("Ultramen", "Bukan", "Akatsuki")

    println(fullNameDefault)
    println(fullName)

}

fun getFullName(first: String = "Silahkan", midsle: String = "Isi", last:String = "Nama"):String{
    return "$first $midsle $last"
}