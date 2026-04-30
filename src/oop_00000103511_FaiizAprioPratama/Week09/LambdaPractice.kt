package oop_00000103511_FaiizAprioPratama.Week09

fun main () {
    println("=== TEST LAMBDA ===")

    val sumLambda = { a: Int, b: Int -> a + b}
    println("Hasil Sum: ${sumLambda(5, 10)}")

    val squareImplicit: (Int) -> Int = { it * it }
    println("Hasi Square: ${squareImplicit(4)}")
}