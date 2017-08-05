package basic

/**
 * Created by Admin on 06-Aug-17.
 */

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun sumExpressionBody(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int): Unit { // or ommit Unit: fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

