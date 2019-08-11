package sample

import io.kaen.dagger.ExpressionParser


fun main() {
    println("Input Expression")
    val inputExpression = readLine()
    inputExpression?.let {
        println(ExpressionParser().evaluate(it))
    }

}