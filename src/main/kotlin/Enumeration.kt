fun main() {
//    val colorRed = Color.RED
//        println(colorRed)

//    val colors: Array<Color> = enumValues()
//    colors.forEach { color ->
//        print("$color ")
//    }
//
//    val color: Color = enumValueOf("RED")
//    println("Color is $color")

//    val color: Color = Color.valueOf("RED")
//    print("Color is $color ")
//    print("Color value is ${color.value.toString(16)}")

    val color: Color = Color.GREN

    when(color){
        Color.RED -> println("Color is RED")
        Color.BLUE -> println("Color is BLUE")
        Color.GREN -> println("Color is GREEN")
    }
}

enum class Color(val value:Int){
        RED(0xFF0000),
        GREN(0x00FF00),
        BLUE(0x0000FF)
    }