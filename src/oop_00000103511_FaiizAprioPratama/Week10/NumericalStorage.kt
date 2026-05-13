package oop_00000103511_FaiizAprioPratama.Week10

class MathBox<T : Number> (val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}