package basic

/**
 * Created by Admin on 06-Aug-17.
 * Control Flow: if, when, for, while
 */

// MARK: If expression

fun max(a: Int, b: Int) : Int {
    // Traditional usage
    var max = a
    if (a < b) max = b
    return max
}

fun max2(a: Int, b: Int) : Int {
    // With else
    val max: Int
    if (a > b) {
        max = a
    } else {
        max = b
    }
    return max
}

fun max3(a: Int, b: Int) : Int {
    // As expression
    val max = if (a > b) a else b
    return max
}

// MARK: When (Switch) Expression

fun whenExpression(x: Int) {
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> { // Note the block
            println("x is neither 1 nor 2")
        }
    }
}

fun whenExpression2(x: Int) {
    when (x) {
        in 1..10 -> println("x is in the range")
        !in 10..20 -> println("x is outside the range")
        else -> println("x is none of the above")
    }
}

fun whenExpression3(x: Int) {
    when {
        x == 10 -> print("x is equal to 10")
        x != 5 -> print("x is not equal to 5")
        else -> print("x is funny")
    }
}