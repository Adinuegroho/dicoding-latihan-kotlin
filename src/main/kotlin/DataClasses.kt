class User(val name: String, val age: Int) {
    // toString untuk menampilkan data
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name: String, val age: Int){
    fun intro(){
        println("My name is $name, and My age $age years old")
    }
}

fun main() {
    val user = User("Ultramen", 20)
    val user2 = User("Ultramen", 20)
    val dataUser = DataUser("Ultramen", 20)
    val dataUser2 = DataUser("Ultramen", 20)
    val dataUser3 = dataUser.copy(age = 18)

    val name = dataUser.component1()
    val age = dataUser.component2()

    println(user)
    println(dataUser)
    println(user.equals(user2))
    println(dataUser.equals(user))
    println(dataUser.equals(dataUser2))
    println(dataUser3)
    println("My name is $name and my age $age years old")
    dataUser3.intro()

}