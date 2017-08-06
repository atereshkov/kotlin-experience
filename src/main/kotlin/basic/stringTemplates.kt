package basic

/**
 * Created by Admin on 06-Aug-17.
 */

fun printSimpleStringTemplate(a: Int) {
    // simple name in template:
    val s1 = "a is $a"

    // create local copy of "a" variable
    val _a = a + 1

    // arbitrary expression in template:
    val s2 = "${s1.replace("is", "was")}, but now new _a is $_a"

    // print s2
    println(s2)
}

fun printStringLength(s: String) {
    println("$s.length is ${s.length}")
}