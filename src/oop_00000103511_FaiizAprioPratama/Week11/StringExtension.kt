package oop_00000103511_FaiizAprioPratama.Week11

fun String.addGreeting(): String{
    return "Hello, $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}

fun String?.isNullOrEmptyCustom(): Boolean {
    return this == null || this.isEmpty ()
}