fun main() {
//    fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
//
//        fun validateNumber(value: Int){
//            if (value == 0) {
//                throw IllegalArgumentException("Value must be better than 0")
//            }
//        }
//
//    validateNumber(valueA)
//    validateNumber(valueB)
//    validateNumber(valueA)
//
//        return valueA+valueB+valueC
//    }

    // OR

    fun sum(valueA: Int, valueB: Int, valueC: Int): Int {

        fun Int.validateNumber(){
            if (this == 0) {
                throw IllegalArgumentException("Value must be better than 0")
            }
        }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

        return valueA+valueB+valueC
    }



    println(sum(11,10,20))


}