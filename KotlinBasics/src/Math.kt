import java.lang.Exception

fun performMathOp(op: String, num0: Double, num1: Double): Double {
    return when (op) {
        "+" -> num0 + num1
        "-" -> num0 - num1
        "/" -> num0 / num1
        "*" -> num0 * num1
        else -> throw Exception("Invalid Operator")
    }
}

fun mathAction() {
    println("Enter Op (+,-,*,/): ")
    val op: String = readLine() ?: ""
    println("Enter num 0 : ")
    val num0: Double? = readLine()?.toDouble()
    val num1 = readLine()?.toDouble()
    if (num0 != null && num1 != null)
        println("result ${performMathOp(op, num0, num1)}")
}


fun dataTypeDemo() {
    val byte: Byte = 65
    //val num:Int = byte | No implcit type conversion
    val num: Int = byte.toInt() // 4

    val char = byte.toChar() // 2 bytes

    val string = "i"
    val char2 = string[0]
    val float: Float = 4f // 4 bytes
    val double: Double = 5.0 // 8 bytes

    println(
        """
        byte $byte 
        num $num 
        char $char
        string $string
    """.trimIndent()
    )
}